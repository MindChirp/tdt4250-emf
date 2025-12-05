package no.ntnu.tdt4250.bg.bgdsl.generator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class BgDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final EObject gameInstance = ((EObject) _head);
    final EClass gameEClass = gameInstance.eClass();
    final Function1<EObject, EClass> _function = (EObject it) -> {
      return it.eClass();
    };
    final Set<EClass> allUniqueEClasses = IterableExtensions.<EClass>toSet(IterableExtensions.<EObject, EClass>map(IteratorExtensions.<EObject>toIterable(gameInstance.eAllContents()), _function));
    allUniqueEClasses.add(gameEClass);
    if ((gameInstance == null)) {
      System.err.println("Model resource is empty.");
      return;
    }
    final CharSequence generatedContent = this.compileModels(allUniqueEClasses, gameInstance);
    fsa.generateFile("game.py", generatedContent);
  }

  public CharSequence compileModels(final Set<EClass> models, final EObject gameInstance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from typing import List, Optional, Any");
    _builder.newLine();
    _builder.append("from pydantic import BaseModel");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Base Filter Class");
    _builder.newLine();
    _builder.append("class Filter(BaseModel):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("nextFilter: Optional[\"Filter\"] = None");
    _builder.newLine();
    _builder.newLine();
    {
      for(final EClass model : models) {
        {
          String _name = model.getName();
          boolean _equals = Objects.equals(_name, "TilePlacement");
          if (_equals) {
          } else {
            {
              boolean _contains = this.getAllFilterTypes().contains(model.getName());
              if (_contains) {
                _builder.append("class ");
                String _name_1 = model.getName();
                _builder.append(_name_1);
                _builder.append("(Filter):");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("class ");
                String _name_2 = model.getName();
                _builder.append(_name_2);
                _builder.append("(BaseModel):");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              boolean _isEmpty = model.getEAllStructuralFeatures().isEmpty();
              if (_isEmpty) {
                _builder.append("    ");
                _builder.append("pass");
                _builder.newLine();
              } else {
                {
                  String _name_3 = model.getName();
                  boolean _equals_1 = Objects.equals(_name_3, "Tile");
                  if (_equals_1) {
                    {
                      EList<EStructuralFeature> _eAllStructuralFeatures = model.getEAllStructuralFeatures();
                      for(final EStructuralFeature field : _eAllStructuralFeatures) {
                        _builder.append("    ");
                        CharSequence _pythonFieldDec = this.toPythonFieldDec(field);
                        _builder.append(_pythonFieldDec, "    ");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("    ");
                    _builder.append("activeState: \"State\"");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("row: \"int\"");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("column: \"int\"");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("def updateState(self, targetStateName: str):");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("        ");
                    _builder.append("for transition in self.transitions:");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("            ");
                    _builder.append("for source in transition.source:");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("                ");
                    _builder.append("if source.name == self.activeState.name and transition.target.name == targetStateName:");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("                    ");
                    _builder.append("self.activeState = transition.target");
                    _builder.newLine();
                    _builder.newLine();
                  } else {
                    String _name_4 = model.getName();
                    boolean _equals_2 = Objects.equals(_name_4, "Board");
                    if (_equals_2) {
                      _builder.append("    ");
                      _builder.append("width: \"int\"");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("height: \"int\"");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("tiles: List[\"Tile\"] = []");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("legalMovesPipeline: Optional[\"LegalMovesPipeline\"] = None");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("effectPipeline: Optional[\"EffectPipeline\"] = None");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("checkered: \"bool\"");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("size: \"int\"");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.append("legalMoves: List[\"Tile\"] = []");
                      _builder.newLine();
                      _builder.append("    ");
                      _builder.newLine();
                    } else {
                      String _name_5 = model.getName();
                      boolean _equals_3 = Objects.equals(_name_5, "Pattern");
                      if (_equals_3) {
                        _builder.append("    ");
                        _builder.append("name: \"str\"");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("stateSelection: Optional[\"str\"] = None");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("matchState: Optional[\"str\"] = None");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("relativecoordinates: List[\"RelativeCoordinate\"] = []");
                        _builder.newLine();
                        _builder.newLine();
                      } else {
                        String _name_6 = model.getName();
                        boolean _equals_4 = Objects.equals(_name_6, "StateEffectFilter");
                        if (_equals_4) {
                          _builder.append("    ");
                          _builder.append("name: \"str\"");
                          _builder.newLine();
                          _builder.append("    ");
                          _builder.append("stateSelection: \"str\"");
                          _builder.newLine();
                          _builder.append("    ");
                          _builder.append("targetState: Optional[\"str\"] = None ");
                          _builder.newLine();
                          _builder.newLine();
                        } else {
                          String _name_7 = model.getName();
                          boolean _equals_5 = Objects.equals(_name_7, "Player");
                          if (_equals_5) {
                            _builder.append("    ");
                            _builder.append("name: \"str\"");
                            _builder.newLine();
                            _builder.append("    ");
                            _builder.append("hexColor: \"str\"");
                            _builder.newLine();
                            _builder.append("    ");
                            _builder.append("associatedState: \"str\"");
                            _builder.newLine();
                            _builder.newLine();
                          } else {
                            {
                              EList<EStructuralFeature> _eAllStructuralFeatures_1 = model.getEAllStructuralFeatures();
                              for(final EStructuralFeature field_1 : _eAllStructuralFeatures_1) {
                                _builder.append("    ");
                                CharSequence _pythonFieldDec_1 = this.toPythonFieldDec(field_1);
                                _builder.append(_pythonFieldDec_1, "    ");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("    ");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("# Rebuild models for Pydantic recursion");
    _builder.newLine();
    {
      for(final EClass model_1 : models) {
        {
          String _name_8 = model_1.getName();
          boolean _notEquals = (!Objects.equals(_name_8, "TilePlacement"));
          if (_notEquals) {
            String _name_9 = model_1.getName();
            _builder.append(_name_9);
            _builder.append(".model_rebuild()");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("Filter.model_rebuild()");
    _builder.newLine();
    _builder.newLine();
    CharSequence _initializeValues = this.initializeValues(gameInstance);
    _builder.append(_initializeValues);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence initializeValues(final EObject gameInstance) {
    CharSequence _xblockexpression = null;
    {
      Object _feature = this.getFeature(gameInstance, "board");
      final EObject boardInstance = ((EObject) _feature);
      Object _feature_1 = this.getFeature(boardInstance, "tiles");
      final EList<EObject> tileTypes = ((EList<EObject>) _feature_1);
      Object _feature_2 = this.getFeature(boardInstance, "tileplacement");
      final EList<EObject> tilePlacements = ((EList<EObject>) _feature_2);
      Object _feature_3 = this.getFeature(gameInstance, "players");
      final EList<EObject> players = ((EList<EObject>) _feature_3);
      Object _feature_4 = this.getFeature(boardInstance, "legalMovesPipeline");
      final EObject legalMovesPipeline = ((EObject) _feature_4);
      Object _feature_5 = this.getFeature(boardInstance, "effectPipeline");
      final EObject effectPipeline = ((EObject) _feature_5);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# --- Tile Definitions ---");
      _builder.newLine();
      {
        for(final EObject tileType : tileTypes) {
          final Object tileName = this.getFeature(tileType, "name");
          _builder.newLineIfNotEmpty();
          Object _feature_6 = this.getFeature(tileType, "initialState");
          final EObject initState = ((EObject) _feature_6);
          _builder.newLineIfNotEmpty();
          final Object initName = this.getFeature(initState, "name");
          _builder.newLineIfNotEmpty();
          final Object initColor = this.getFeature(initState, "hexColor");
          _builder.newLineIfNotEmpty();
          Object _feature_7 = this.getFeature(tileType, "states");
          final EList<EObject> states = ((EList<EObject>) _feature_7);
          _builder.newLineIfNotEmpty();
          Object _feature_8 = this.getFeature(tileType, "transitions");
          final EList<EObject> transitions = ((EList<EObject>) _feature_8);
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("class ");
          _builder.append(tileName);
          _builder.append("(Tile):");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("def __init__(self, row, column):");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("# 1. Create Initial State");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("state");
          _builder.append(initName, "        ");
          _builder.append(" = State(");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("name=\"");
          _builder.append(initName, "            ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("hexColor=\"");
          _builder.append(initColor, "            ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("outbound=[], inbound=[]");
          _builder.newLine();
          _builder.append("        ");
          _builder.append(")");
          _builder.newLine();
          _builder.newLine();
          _builder.append("        ");
          _builder.append("# 2. Create Other States");
          _builder.newLine();
          {
            for(final EObject state : states) {
              _builder.append("        ");
              _builder.append("state");
              Object _feature_9 = this.getFeature(state, "name");
              _builder.append(_feature_9, "        ");
              _builder.append(" = State(");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("name=\"");
              Object _feature_10 = this.getFeature(state, "name");
              _builder.append(_feature_10, "            ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("hexColor=\"");
              Object _feature_11 = this.getFeature(state, "hexColor");
              _builder.append(_feature_11, "            ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("outbound=[], inbound=[]");
              _builder.newLine();
              _builder.append("        ");
              _builder.append(")");
              _builder.newLine();
            }
          }
          _builder.append("        ");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("# 3. Create Transitions (Linking objects)");
          _builder.newLine();
          {
            for(final EObject transition : transitions) {
              _builder.append("        ");
              final Object tName = this.getFeature(transition, "name");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              Object _feature_12 = this.getFeature(transition, "source");
              final EList<EObject> sources = ((EList<EObject>) _feature_12);
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              Object _feature_13 = this.getFeature(transition, "target");
              final EObject target = ((EObject) _feature_13);
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("transition");
              _builder.append(tName, "        ");
              _builder.append(" = Transition(");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("name=\"");
              _builder.append(tName, "            ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("source=[");
              {
                boolean _hasElements = false;
                for(final EObject src : sources) {
                  if (!_hasElements) {
                    _hasElements = true;
                  } else {
                    _builder.appendImmediate(", ", "            ");
                  }
                  _builder.append("state");
                  Object _feature_14 = this.getFeature(src, "name");
                  _builder.append(_feature_14, "            ");
                }
              }
              _builder.append("],");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("    ");
              _builder.append("target=state");
              Object _feature_15 = this.getFeature(target, "name");
              _builder.append(_feature_15, "            ");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append(")");
              _builder.newLine();
            }
          }
          _builder.newLine();
          _builder.append("        ");
          _builder.append("# 4. Link Transitions to States (Outbound/Inbound wiring)");
          _builder.newLine();
          {
            for(final EObject transition_1 : transitions) {
              _builder.append("        ");
              final Object tName_1 = this.getFeature(transition_1, "name");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              Object _feature_16 = this.getFeature(transition_1, "source");
              final EList<EObject> sources_1 = ((EList<EObject>) _feature_16);
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              Object _feature_17 = this.getFeature(transition_1, "target");
              final EObject target_1 = ((EObject) _feature_17);
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("# Outbound for ");
              _builder.append(tName_1, "        ");
              _builder.newLineIfNotEmpty();
              {
                for(final EObject src_1 : sources_1) {
                  _builder.append("        ");
                  _builder.append("state");
                  Object _feature_18 = this.getFeature(src_1, "name");
                  _builder.append(_feature_18, "        ");
                  _builder.append(".outbound.append(transition");
                  _builder.append(tName_1, "        ");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("        ");
              _builder.append("# Inbound for ");
              _builder.append(tName_1, "        ");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.append("state");
              Object _feature_19 = this.getFeature(target_1, "name");
              _builder.append(_feature_19, "        ");
              _builder.append(".inbound.append(transition");
              _builder.append(tName_1, "        ");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("        ");
              _builder.newLine();
            }
          }
          _builder.newLine();
          _builder.append("        ");
          _builder.append("super().__init__(");
          _builder.newLine();
          _builder.append("            ");
          _builder.append("states=[");
          _builder.newLine();
          _builder.append("                ");
          {
            boolean _hasElements_1 = false;
            for(final EObject state_1 : states) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
              } else {
                _builder.appendImmediate(", ", "                ");
              }
              _builder.append("state");
              Object _feature_20 = this.getFeature(state_1, "name");
              _builder.append(_feature_20, "                ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("                ");
          {
            boolean _contains = states.contains(initState);
            boolean _not = (!_contains);
            if (_not) {
              _builder.append(", state");
              _builder.append(initName, "                ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("],");
          _builder.newLine();
          _builder.append("            ");
          _builder.append("transitions=[");
          _builder.newLine();
          _builder.append("                ");
          {
            boolean _hasElements_2 = false;
            for(final EObject transition_2 : transitions) {
              if (!_hasElements_2) {
                _hasElements_2 = true;
              } else {
                _builder.appendImmediate(", ", "                ");
              }
              _builder.append("transition");
              Object _feature_21 = this.getFeature(transition_2, "name");
              _builder.append(_feature_21, "                ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("],");
          _builder.newLine();
          _builder.append("            ");
          _builder.append("initialState=state");
          _builder.append(initName, "            ");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("activeState=state");
          _builder.append(initName, "            ");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("tileType=\"");
          _builder.append(tileName, "            ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("hexColor=\"");
          Object _feature_22 = this.getFeature(tileType, "hexColor");
          _builder.append(_feature_22, "            ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("name=\"");
          _builder.append(tileName, "            ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("row=row,");
          _builder.newLine();
          _builder.append("            ");
          _builder.append("column=column");
          _builder.newLine();
          _builder.append("        ");
          _builder.append(")");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("# --- Instance Initialization ---");
      _builder.newLine();
      _builder.append("tiles = [");
      _builder.newLine();
      {
        boolean _hasElements_3 = false;
        for(final EObject placement : tilePlacements) {
          if (!_hasElements_3) {
            _hasElements_3 = true;
          } else {
            _builder.appendImmediate(", ", "    ");
          }
          _builder.append("    ");
          Object _feature_23 = this.getFeature(placement, "tile");
          Object _feature_24 = this.getFeature(((EObject) _feature_23), "name");
          _builder.append(_feature_24, "    ");
          _builder.append("(");
          Object _feature_25 = this.getFeature(placement, "row");
          _builder.append(_feature_25, "    ");
          _builder.append(", ");
          Object _feature_26 = this.getFeature(placement, "column");
          _builder.append(_feature_26, "    ");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("players = [");
      _builder.newLine();
      {
        boolean _hasElements_4 = false;
        for(final EObject player : players) {
          if (!_hasElements_4) {
            _hasElements_4 = true;
          } else {
            _builder.appendImmediate(", ", "    ");
          }
          _builder.append("    ");
          _builder.append("Player(name=\"");
          Object _feature_27 = this.getFeature(player, "name");
          _builder.append(_feature_27, "    ");
          _builder.append("\", hexColor=\"");
          Object _feature_28 = this.getFeature(player, "hexColor");
          _builder.append(_feature_28, "    ");
          _builder.append("\", associatedState=\"");
          Object _feature_29 = this.getFeature(player, "associatedState");
          Object _feature_30 = this.getFeature(((EObject) _feature_29), "name");
          _builder.append(_feature_30, "    ");
          _builder.append("\")");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("# --- Pipelines ---");
      _builder.newLine();
      _builder.newLine();
      _builder.append("legal_moves_pipeline = ");
      {
        if ((legalMovesPipeline != null)) {
          CharSequence _generatePipelineObject = this.generatePipelineObject(legalMovesPipeline);
          _builder.append(_generatePipelineObject);
        } else {
          _builder.append("None");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("effect_pipeline = ");
      {
        if ((effectPipeline != null)) {
          CharSequence _generatePipelineObject_1 = this.generatePipelineObject(effectPipeline);
          _builder.append(_generatePipelineObject_1);
        } else {
          _builder.append("None");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("board = Board(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("width=");
      Object _feature_31 = this.getFeature(boardInstance, "width");
      _builder.append(_feature_31, "    ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("height=");
      Object _feature_32 = this.getFeature(boardInstance, "height");
      _builder.append(_feature_32, "    ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("tiles=tiles,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("checkered=");
      Object _feature_33 = this.getFeature(boardInstance, "checkered");
      String _pyBool = this.toPyBool(((Boolean) _feature_33));
      _builder.append(_pyBool, "    ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("size=");
      Object _feature_34 = this.getFeature(boardInstance, "width");
      Object _feature_35 = this.getFeature(boardInstance, "height");
      int _multiply = ((((Integer) _feature_34)).intValue() * (((Integer) _feature_35)).intValue());
      _builder.append(_multiply, "    ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("legalMovesPipeline=legal_moves_pipeline,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("effectPipeline=effect_pipeline,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("legalMoves=[]");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.newLine();
      _builder.append("game = Game(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("board=board,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("players=players,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("activePlayer=players[");
      int _indexOf = players.indexOf(this.getFeature(gameInstance, "initialPlayer"));
      _builder.append(_indexOf, "    ");
      _builder.append("],");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("name=\"");
      Object _feature_36 = this.getFeature(gameInstance, "name");
      _builder.append(_feature_36, "    ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("initialPlayer=players[");
      int _indexOf_1 = players.indexOf(this.getFeature(gameInstance, "initialPlayer"));
      _builder.append(_indexOf_1, "    ");
      _builder.append("],");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("turnPolicy=\"");
      Object _feature_37 = this.getFeature(gameInstance, "turnPolicy");
      _builder.append(_feature_37, "    ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append(")");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence generatePipelineObject(final EObject pipeline) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = pipeline.eClass().getName();
    _builder.append(_name);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("filters=[");
    _builder.newLine();
    _builder.append("        ");
    Object _feature = this.getFeature(pipeline, "filters");
    final EList<EObject> filters = ((EList<EObject>) _feature);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final EObject filter : filters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "        ");
        }
        _builder.append("        ");
        String _generateFilter = this.generateFilter(filter);
        _builder.append(_generateFilter, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }

  /**
   * Dispatch: PatternFilter
   */
  protected String _generateFilter(final EObject filter) {
    String _xifexpression = null;
    String _name = filter.eClass().getName();
    boolean _equals = Objects.equals(_name, "PatternFilter");
    if (_equals) {
      String _xblockexpression = null;
      {
        Object _feature = this.getFeature(filter, "patterns");
        final EList<EObject> patterns = ((EList<EObject>) _feature);
        Object _feature_1 = this.getFeature(filter, "nextFilter");
        final EObject nextFilter = ((EObject) _feature_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("PatternFilter(");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("name=\"");
        Object _feature_2 = this.getFeature(filter, "name");
        _builder.append(_feature_2, "    ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("patterns=[");
        _builder.newLine();
        {
          boolean _hasElements = false;
          for(final EObject p : patterns) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "        ");
            }
            _builder.append("        ");
            CharSequence _generatePattern = this.generatePattern(p);
            _builder.append(_generatePattern, "        ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("],");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("nextFilter=");
        {
          if ((nextFilter != null)) {
            String _generateFilter = this.generateFilter(nextFilter);
            _builder.append(_generateFilter, "    ");
          } else {
            _builder.append("None");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append(")");
        _xblockexpression = _builder.toString();
      }
      _xifexpression = _xblockexpression;
    } else {
      String _xifexpression_1 = null;
      String _name_1 = filter.eClass().getName();
      boolean _equals_1 = Objects.equals(_name_1, "IterativeFilter");
      if (_equals_1) {
        String _xblockexpression_1 = null;
        {
          Object _feature = this.getFeature(filter, "nextFilter");
          final EObject nextFilter = ((EObject) _feature);
          Object _feature_1 = this.getFeature(filter, "directionVector");
          final EObject dirVector = ((EObject) _feature_1);
          Object _feature_2 = this.getFeature(filter, "matchRule");
          final EObject matchRule = ((EObject) _feature_2);
          Object _feature_3 = this.getFeature(filter, "endRule");
          final EObject endRule = ((EObject) _feature_3);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("IterativeFilter(");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("name=\"");
          Object _feature_4 = this.getFeature(filter, "name");
          _builder.append(_feature_4, "    ");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("directionVector=");
          CharSequence _generateRelCoord = this.generateRelCoord(dirVector);
          _builder.append(_generateRelCoord, "    ");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("matchRule=");
          CharSequence _generatePattern = this.generatePattern(matchRule);
          _builder.append(_generatePattern, "    ");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("endRule=");
          CharSequence _generatePattern_1 = this.generatePattern(endRule);
          _builder.append(_generatePattern_1, "    ");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("nextFilter=");
          {
            if ((nextFilter != null)) {
              String _generateFilter = this.generateFilter(nextFilter);
              _builder.append(_generateFilter, "    ");
            } else {
              _builder.append("None");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append(")");
          _xblockexpression_1 = _builder.toString();
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        String _xifexpression_2 = null;
        String _name_2 = filter.eClass().getName();
        boolean _equals_2 = Objects.equals(_name_2, "StateEffectFilter");
        if (_equals_2) {
          String _xblockexpression_2 = null;
          {
            Object _feature = this.getFeature(filter, "nextFilter");
            final EObject nextFilter = ((EObject) _feature);
            Object _feature_1 = this.getFeature(filter, "targetState");
            final EObject targetState = ((EObject) _feature_1);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("StateEffectFilter(");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("name=\"");
            Object _feature_2 = this.getFeature(filter, "name");
            _builder.append(_feature_2, "    ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("stateSelection=\"");
            Object _feature_3 = this.getFeature(filter, "stateSelection");
            _builder.append(_feature_3, "    ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("targetState=");
            {
              if ((targetState != null)) {
                _builder.append("\"");
                Object _feature_4 = this.getFeature(targetState, "name");
                _builder.append(_feature_4, "    ");
                _builder.append("\"");
              } else {
                _builder.append("None");
              }
            }
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("nextFilter=");
            {
              if ((nextFilter != null)) {
                String _generateFilter = this.generateFilter(nextFilter);
                _builder.append(_generateFilter, "    ");
              } else {
                _builder.append("None");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append(")");
            _xblockexpression_2 = _builder.toString();
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          String _xifexpression_3 = null;
          String _name_3 = filter.eClass().getName();
          boolean _equals_3 = Objects.equals(_name_3, "WinConditionFilter");
          if (_equals_3) {
            String _xblockexpression_3 = null;
            {
              Object _feature = this.getFeature(filter, "nextFilter");
              final EObject nextFilter = ((EObject) _feature);
              Object _feature_1 = this.getFeature(filter, "patterns");
              final EList<EObject> patterns = ((EList<EObject>) _feature_1);
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("WinConditionFilter(");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("name=\"");
              Object _feature_2 = this.getFeature(filter, "name");
              _builder.append(_feature_2, "\t");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("patterns=[");
              _builder.newLine();
              {
                boolean _hasElements = false;
                for(final EObject p : patterns) {
                  if (!_hasElements) {
                    _hasElements = true;
                  } else {
                    _builder.appendImmediate(", ", "\t\t");
                  }
                  _builder.append("\t\t");
                  CharSequence _generatePattern = this.generatePattern(p);
                  _builder.append(_generatePattern, "\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("],");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("nextFilter=");
              {
                if ((nextFilter != null)) {
                  String _generateFilter = this.generateFilter(nextFilter);
                  _builder.append(_generateFilter, "\t");
                } else {
                  _builder.append("None");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.append(")");
              _builder.newLine();
              _xblockexpression_3 = _builder.toString();
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("None");
            _xifexpression_3 = _builder.toString();
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  public CharSequence generatePattern(final EObject pattern) {
    CharSequence _xblockexpression = null;
    {
      Object _feature = this.getFeature(pattern, "relativecoordinates");
      final EList<EObject> coords = ((EList<EObject>) _feature);
      Object _feature_1 = this.getFeature(pattern, "matchState");
      final EObject matchState = ((EObject) _feature_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Pattern(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("name=\"");
      Object _feature_2 = this.getFeature(pattern, "name");
      _builder.append(_feature_2, "    ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("stateSelection=\"");
      Object _feature_3 = this.getFeature(pattern, "stateSelection");
      _builder.append(_feature_3, "    ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("matchState=");
      {
        if ((matchState != null)) {
          _builder.append("\"");
          Object _feature_4 = this.getFeature(matchState, "name");
          _builder.append(_feature_4, "    ");
          _builder.append("\"");
        } else {
          _builder.append("None");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("relativecoordinates=[");
      _builder.newLine();
      {
        boolean _hasElements = false;
        for(final EObject c : coords) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(", ", "        ");
          }
          _builder.append("        ");
          CharSequence _generateRelCoord = this.generateRelCoord(c);
          _builder.append(_generateRelCoord, "        ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.append("]");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence generateRelCoord(final EObject coord) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("RelativeCoordinate(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("x=");
    Object _feature = this.getFeature(coord, "x");
    _builder.append(_feature, "    ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("y=");
    Object _feature_1 = this.getFeature(coord, "y");
    _builder.append(_feature_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }

  public HashSet<String> getAllFilterTypes() {
    return CollectionLiterals.<String>newHashSet("PatternFilter", "IterativeFilter", "StateEffectFilter", "WinConditionFilter");
  }

  public Object getFeature(final EObject self, final String feature) {
    final EStructuralFeature es = self.eClass().getEStructuralFeature(feature);
    if ((es == null)) {
      return null;
    }
    return self.eGet(es);
  }

  public CharSequence toPythonFieldDec(final EStructuralFeature field) {
    CharSequence _xblockexpression = null;
    {
      final String typeStr = this.pythonTypeString(field);
      CharSequence _xifexpression = null;
      boolean _isMany = field.isMany();
      if (_isMany) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = field.getName();
        _builder.append(_name);
        _builder.append(": List[\"");
        _builder.append(typeStr);
        _builder.append("\"] = []");
        _xifexpression = _builder;
      } else {
        CharSequence _xifexpression_1 = null;
        int _lowerBound = field.getLowerBound();
        boolean _equals = (_lowerBound == 0);
        if (_equals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_1 = field.getName();
          _builder_1.append(_name_1);
          _builder_1.append(": Optional[\"");
          _builder_1.append(typeStr);
          _builder_1.append("\"] = None");
          _xifexpression_1 = _builder_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_2 = field.getName();
          _builder_2.append(_name_2);
          _builder_2.append(": \"");
          _builder_2.append(typeStr);
          _builder_2.append("\"");
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public String pythonTypeString(final EStructuralFeature field) {
    String _switchResult = null;
    boolean _matched = false;
    if (field instanceof EAttribute) {
      _matched=true;
      String _xblockexpression = null;
      {
        final String icn = ((EAttribute)field).getEAttributeType().getInstanceClassName();
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
      if (field instanceof EReference) {
        _matched=true;
        _switchResult = ((EReference) field).getEReferenceType().getName();
      }
    }
    if (!_matched) {
      _switchResult = "str";
    }
    return _switchResult;
  }

  public String toPyBool(final Boolean b) {
    String _xifexpression = null;
    if ((b).booleanValue()) {
      _xifexpression = "True";
    } else {
      _xifexpression = "False";
    }
    return _xifexpression;
  }

  @XbaseGenerated
  public String generateFilter(final EObject filter) {
    return _generateFilter(filter);
  }
}
