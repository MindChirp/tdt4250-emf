package no.ntnu.tdt4250.bg.bgdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject

import no.ntnu.tdt4250.bg.BgPackage
import no.ntnu.tdt4250.bg.Game

/**
 * Generates Python code from BgDSL models.
 *
 * - generated/engine/models.py:
 *     Pydantic BaseModel classes generated *generically* from the Ecore metamodel (BgPackage)
 *
 * - generated/games/<gamename>.py:
 *     One file per Game instance in the .bgdsl file, with:
 *         from generated.engine.models import Game
 *         game = Game(**{ ...nested dict built via Ecore reflection... })
 */
class BgDslGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        if (resource.contents.empty) {
            return
        }

        // 1) Generate shared Pydantic models from the Ecore metamodel (generic, not hard-coded)
        fsa.generateFile("generated/__init__.py", "")
        fsa.generateFile("generated/engine/__init__.py", "")
        fsa.generateFile("generated/engine/models.py", modelsModule)

        // 2) For each Game instance in this resource, generate one Python instance file
        val games = resource.allContents.toIterable.filter(Game)
        if (!games.empty) {
            fsa.generateFile("generated/games/__init__.py", "")
        }
        for (g : games) {
            val fileName = "generated/games/" + g.name.toLowerCase + ".py"
            fsa.generateFile(fileName, g.toPythonInstance)
        }
    }

    // =====================================================================
    // 1) GENERIC Pydantic models from Ecore metamodel
    // =====================================================================

    /**
     * Generates the Python module 'generated/engine/models.py'
     * containing one Pydantic BaseModel class per EClass in BgPackage.
     */
    def modelsModule() '''
from typing import List, Optional
from pydantic import BaseModel


# Auto-generated from Ecore (BgPackage)
«FOR c : BgPackage.eINSTANCE.EClassifiers.filter(EClass)»
class «c.name»(BaseModel):
    «IF c.EAllStructuralFeatures.empty»
    pass
    «ELSE»
    «FOR f : c.EAllStructuralFeatures»
    «f.toPythonFieldDecl»
    «ENDFOR»
    «ENDIF»

«ENDFOR»
'''

    /**
     * Map an EStructuralFeature to a Python field declaration line
     * inside a Pydantic model, e.g.:
     *   name: str
     *   width: int
     *   states: List[str] = []
     */
    def toPythonFieldDecl(EStructuralFeature f) {
        val typeStr = f.pythonTypeString
        if (f.many) {
            // Multi-valued feature -> List[type]
            '''    «f.name»: List[«typeStr»] = []'''
        } else {
            // Single-valued feature
            if (f.lowerBound == 0) {
                // optional
                '''    «f.name»: Optional[«typeStr»] = None'''
            } else {
                '''    «f.name»: «typeStr»'''
            }
        }
    }

    /**
     * Map an Ecore feature type to a Python type name.
     * Simplified mapping:
     *   int / java.lang.Integer -> int
     *   boolean / java.lang.Boolean -> bool
     *   everything else (including enums) -> str
     *   references -> referenced EClass name
     */
    def pythonTypeString(EStructuralFeature f) {
        switch f {
            EAttribute: {
                val icn = f.EAttributeType.instanceClassName
                if (icn == "int" || icn == "java.lang.Integer") {
                    "int"
                } else if (icn == "boolean" || icn == "java.lang.Boolean") {
                    "bool"
                } else {
                    // default to string (also covers enums for now)
                    "str"
                }
            }
            EReference: {
                val refType = (f as EReference).EReferenceType
                refType.name
            }
            default: "str"
        }
    }

    // =====================================================================
    // 2) PER-GAME INSTANCE FILE
    // =====================================================================

    /**
     * Generates one Python file per Game instance:
     *
     * from generated.engine.models import Game
     *
     * game = Game(**{ ...dict built from the Game EObject... })
     */
    def toPythonInstance(Game g) '''
from generated.engine.models import Game


game = Game(**«g.toDynamicDict»)


if __name__ == "__main__":
    import json
    print(json.dumps(game.model_dump(), indent=2))
'''

    // =====================================================================
    // 3) GENERIC NESTED DICT BUILDER (Ecore reflection)
    // =====================================================================

    /**
     * Build a nested Python dict literal from any object (EObject tree),
     * using Ecore reflection, so nothing is hard-coded.
     *
     * Examples of output:
     *   "name": "TicTacToe"
     *   "board": { "width": 3, "height": 3, "checkered": false }
     *   "tiles": [ { ... }, { ... } ]
     */
    def toDynamicDict(Object obj) {
        if (obj === null) {
            "None"
        } else
            switch obj {
                EObject: '''
{
«FOR f : obj.eClass.EAllStructuralFeatures SEPARATOR ",\n"»
    "«f.name»": «obj.renderFeature(f)»
«ENDFOR»
}'''
                String: '"' + obj + '"'
                Boolean: obj.toString.toLowerCase
                default: obj.toString
            }
    }

    /**
     * Render a single structural feature as a Python literal fragment,
     * handling:
     *   - null -> None
     *   - many-valued -> [ v1, v2, ... ]
     *   - single-valued -> toDynamicDict(value)
     */
    def renderFeature(EObject obj, EStructuralFeature f) {
        val v = obj.eGet(f)
        if (v === null) {
            "None"
        } else if (f.many) {
            val list = v as Iterable<Object>
            "[" + list.map[e | e.toDynamicDict].join(", ") + "]"
        } else {
            v.toDynamicDict
        }
    }
}
