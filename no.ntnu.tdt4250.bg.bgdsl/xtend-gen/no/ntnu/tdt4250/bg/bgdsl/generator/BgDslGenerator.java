package no.ntnu.tdt4250.bg.bgdsl.generator;

import com.google.common.collect.Iterables;
import java.util.Objects;
import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Game;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

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
@SuppressWarnings("all")
public class BgDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    boolean _isEmpty = resource.getContents().isEmpty();
    if (_isEmpty) {
      return;
    }
    fsa.generateFile("generated/__init__.py", "");
    fsa.generateFile("generated/engine/__init__.py", "");
    fsa.generateFile("generated/engine/models.py", this.modelsModule());
    final Iterable<Game> games = Iterables.<Game>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Game.class);
    boolean _isEmpty_1 = IterableExtensions.isEmpty(games);
    boolean _not = (!_isEmpty_1);
    if (_not) {
      fsa.generateFile("generated/games/__init__.py", "");
    }
    for (final Game g : games) {
      {
        String _lowerCase = g.getName().toLowerCase();
        String _plus = ("generated/games/" + _lowerCase);
        final String fileName = (_plus + ".py");
        fsa.generateFile(fileName, this.toPythonInstance(g));
      }
    }
  }

  /**
   * Generates the Python module 'generated/engine/models.py'
   * containing one Pydantic BaseModel class per EClass in BgPackage.
   */
  public CharSequence modelsModule() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from typing import List, Optional");
    _builder.newLine();
    _builder.append("from pydantic import BaseModel");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Auto-generated from Ecore (BgPackage)");
    _builder.newLine();
    {
      Iterable<EClass> _filter = Iterables.<EClass>filter(BgPackage.eINSTANCE.getEClassifiers(), EClass.class);
      for(final EClass c : _filter) {
        _builder.append("class ");
        String _name = c.getName();
        _builder.append(_name);
        _builder.append("(BaseModel):");
        _builder.newLineIfNotEmpty();
        {
          boolean _isEmpty = c.getEAllStructuralFeatures().isEmpty();
          if (_isEmpty) {
            _builder.append("    ");
            _builder.append("pass");
            _builder.newLine();
          } else {
            {
              EList<EStructuralFeature> _eAllStructuralFeatures = c.getEAllStructuralFeatures();
              for(final EStructuralFeature f : _eAllStructuralFeatures) {
                _builder.append("    ");
                CharSequence _pythonFieldDecl = this.toPythonFieldDecl(f);
                _builder.append(_pythonFieldDecl, "    ");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
      }
    }
    return _builder;
  }

  /**
   * Map an EStructuralFeature to a Python field declaration line
   * inside a Pydantic model, e.g.:
   *   name: str
   *   width: int
   *   states: List[str] = []
   */
  public CharSequence toPythonFieldDecl(final EStructuralFeature f) {
    CharSequence _xblockexpression = null;
    {
      final String typeStr = this.pythonTypeString(f);
      CharSequence _xifexpression = null;
      boolean _isMany = f.isMany();
      if (_isMany) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("    ");
        String _name = f.getName();
        _builder.append(_name, "    ");
        _builder.append(": List[");
        _builder.append(typeStr, "    ");
        _builder.append("] = []");
        _xifexpression = _builder;
      } else {
        CharSequence _xifexpression_1 = null;
        int _lowerBound = f.getLowerBound();
        boolean _equals = (_lowerBound == 0);
        if (_equals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("    ");
          String _name_1 = f.getName();
          _builder_1.append(_name_1, "    ");
          _builder_1.append(": Optional[");
          _builder_1.append(typeStr, "    ");
          _builder_1.append("] = None");
          _xifexpression_1 = _builder_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("    ");
          String _name_2 = f.getName();
          _builder_2.append(_name_2, "    ");
          _builder_2.append(": ");
          _builder_2.append(typeStr, "    ");
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  /**
   * Map an Ecore feature type to a Python type name.
   * Simplified mapping:
   *   int / java.lang.Integer -> int
   *   boolean / java.lang.Boolean -> bool
   *   everything else (including enums) -> str
   *   references -> referenced EClass name
   */
  public String pythonTypeString(final EStructuralFeature f) {
    String _switchResult = null;
    boolean _matched = false;
    if (f instanceof EAttribute) {
      _matched=true;
      String _xblockexpression = null;
      {
        final String icn = ((EAttribute)f).getEAttributeType().getInstanceClassName();
        String _xifexpression = null;
        if ((Objects.equals(icn, "int") || Objects.equals(icn, "java.lang.Integer"))) {
          _xifexpression = "int";
        } else {
          String _xifexpression_1 = null;
          if ((Objects.equals(icn, "boolean") || Objects.equals(icn, "java.lang.Boolean"))) {
            _xifexpression_1 = "bool";
          } else {
            _xifexpression_1 = "str";
          }
          _xifexpression = _xifexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (f instanceof EReference) {
        _matched=true;
        String _xblockexpression = null;
        {
          final EClass refType = ((EReference) f).getEReferenceType();
          _xblockexpression = refType.getName();
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      _switchResult = "str";
    }
    return _switchResult;
  }

  /**
   * Generates one Python file per Game instance:
   * 
   * from generated.engine.models import Game
   * 
   * game = Game(**{ ...dict built from the Game EObject... })
   */
  public CharSequence toPythonInstance(final Game g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from generated.engine.models import Game");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("game = Game(**");
    CharSequence _dynamicDict = this.toDynamicDict(g);
    _builder.append(_dynamicDict);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("if __name__ == \"__main__\":");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("import json");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("print(json.dumps(game.model_dump(), indent=2))");
    _builder.newLine();
    return _builder;
  }

  /**
   * Build a nested Python dict literal from any object (EObject tree),
   * using Ecore reflection, so nothing is hard-coded.
   * 
   * Examples of output:
   *   "name": "TicTacToe"
   *   "board": { "width": 3, "height": 3, "checkered": false }
   *   "tiles": [ { ... }, { ... } ]
   */
  public CharSequence toDynamicDict(final Object obj) {
    CharSequence _xifexpression = null;
    if ((obj == null)) {
      _xifexpression = "None";
    } else {
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (obj instanceof EObject) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        {
          EList<EStructuralFeature> _eAllStructuralFeatures = ((EObject)obj).eClass().getEAllStructuralFeatures();
          boolean _hasElements = false;
          for(final EStructuralFeature f : _eAllStructuralFeatures) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            _builder.append("\"");
            String _name = f.getName();
            _builder.append(_name);
            _builder.append("\": ");
            Object _renderFeature = this.renderFeature(((EObject)obj), f);
            _builder.append(_renderFeature);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _switchResult = _builder;
      }
      if (!_matched) {
        if (obj instanceof String) {
          _matched=true;
          _switchResult = (("\"" + ((String)obj)) + "\"");
        }
      }
      if (!_matched) {
        if (obj instanceof Boolean) {
          _matched=true;
          _switchResult = ((Boolean)obj).toString().toLowerCase();
        }
      }
      if (!_matched) {
        _switchResult = obj.toString();
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }

  /**
   * Render a single structural feature as a Python literal fragment,
   * handling:
   *   - null -> None
   *   - many-valued -> [ v1, v2, ... ]
   *   - single-valued -> toDynamicDict(value)
   */
  public Object renderFeature(final EObject obj, final EStructuralFeature f) {
    Object _xblockexpression = null;
    {
      final Object v = obj.eGet(f);
      Object _xifexpression = null;
      if ((v == null)) {
        _xifexpression = "None";
      } else {
        Object _xifexpression_1 = null;
        boolean _isMany = f.isMany();
        if (_isMany) {
          String _xblockexpression_1 = null;
          {
            final Iterable<Object> list = ((Iterable<Object>) v);
            final Function1<Object, Object> _function = (Object e) -> {
              return this.toDynamicDict(e);
            };
            String _join = IterableExtensions.join(IterableExtensions.<Object, Object>map(list, _function), ", ");
            String _plus = ("[" + _join);
            _xblockexpression_1 = (_plus + "]");
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          _xifexpression_1 = this.toDynamicDict(v);
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
