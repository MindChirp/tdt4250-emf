package no.ntnu.tdt4250.bg.bgdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.ntnu.tdt4250.bg.bgdsl.services.BgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBgDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'initialPlayer'", "'board'", "'players'", "','", "'}'", "'turnPolicy'", "'checkered'", "'Board'", "'width'", "'height'", "'tiles'", "'legalMovesPipeline'", "'effectPipeline'", "'tileplacement'", "'Player'", "'hexColor'", "'associatedState'", "'-'", "'Tile'", "'name'", "'states'", "'transitions'", "'initialState'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'nextFilter'", "'patterns'", "'Pattern'", "'stateSelection'", "'matchState'", "'relativecoordinates'", "'RelativeCoordinate'", "'x'", "'y'", "'CurrentPlayer'", "'OtherPlayer'", "'StateBased'", "'TurnBased'", "'Simultaneous'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBgDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBgDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBgDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBgDsl.g"; }



     	private BgDslGrammarAccess grammarAccess;

        public InternalBgDslParser(TokenStream input, BgDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected BgDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalBgDsl.g:65:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalBgDsl.g:65:45: (iv_ruleGame= ruleGame EOF )
            // InternalBgDsl.g:66:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalBgDsl.g:72:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? otherlv_13= 'turnPolicy' ( (lv_turnPolicy_14_0= ruleTurnType ) ) otherlv_15= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_board_6_0 = null;

        EObject lv_players_9_0 = null;

        EObject lv_players_11_0 = null;

        Enumerator lv_turnPolicy_14_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? otherlv_13= 'turnPolicy' ( (lv_turnPolicy_14_0= ruleTurnType ) ) otherlv_15= '}' ) )
            // InternalBgDsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? otherlv_13= 'turnPolicy' ( (lv_turnPolicy_14_0= ruleTurnType ) ) otherlv_15= '}' )
            {
            // InternalBgDsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? otherlv_13= 'turnPolicy' ( (lv_turnPolicy_14_0= ruleTurnType ) ) otherlv_15= '}' )
            // InternalBgDsl.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? otherlv_13= 'turnPolicy' ( (lv_turnPolicy_14_0= ruleTurnType ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalBgDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:107:3: (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBgDsl.g:108:4: otherlv_3= 'initialPlayer' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGameAccess().getInitialPlayerKeyword_3_0());
                    			
                    // InternalBgDsl.g:112:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:113:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:113:5: ( ruleEString )
                    // InternalBgDsl.g:114:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGameRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getBoardKeyword_4());
            		
            // InternalBgDsl.g:133:3: ( (lv_board_6_0= ruleBoard ) )
            // InternalBgDsl.g:134:4: (lv_board_6_0= ruleBoard )
            {
            // InternalBgDsl.g:134:4: (lv_board_6_0= ruleBoard )
            // InternalBgDsl.g:135:5: lv_board_6_0= ruleBoard
            {

            					newCompositeNode(grammarAccess.getGameAccess().getBoardBoardParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_board_6_0=ruleBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"board",
            						lv_board_6_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Board");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:152:3: (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBgDsl.g:153:4: otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getGameAccess().getPlayersKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBgDsl.g:161:4: ( (lv_players_9_0= rulePlayer ) )
                    // InternalBgDsl.g:162:5: (lv_players_9_0= rulePlayer )
                    {
                    // InternalBgDsl.g:162:5: (lv_players_9_0= rulePlayer )
                    // InternalBgDsl.g:163:6: lv_players_9_0= rulePlayer
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_players_9_0=rulePlayer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"players",
                    							lv_players_9_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Player");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:180:4: (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBgDsl.g:181:5: otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getGameAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBgDsl.g:185:5: ( (lv_players_11_0= rulePlayer ) )
                    	    // InternalBgDsl.g:186:6: (lv_players_11_0= rulePlayer )
                    	    {
                    	    // InternalBgDsl.g:186:6: (lv_players_11_0= rulePlayer )
                    	    // InternalBgDsl.g:187:7: lv_players_11_0= rulePlayer
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_players_11_0=rulePlayer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"players",
                    	    								lv_players_11_0,
                    	    								"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Player");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getGameAccess().getTurnPolicyKeyword_7());
            		
            // InternalBgDsl.g:214:3: ( (lv_turnPolicy_14_0= ruleTurnType ) )
            // InternalBgDsl.g:215:4: (lv_turnPolicy_14_0= ruleTurnType )
            {
            // InternalBgDsl.g:215:4: (lv_turnPolicy_14_0= ruleTurnType )
            // InternalBgDsl.g:216:5: lv_turnPolicy_14_0= ruleTurnType
            {

            					newCompositeNode(grammarAccess.getGameAccess().getTurnPolicyTurnTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_turnPolicy_14_0=ruleTurnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"turnPolicy",
            						lv_turnPolicy_14_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TurnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleFilter"
    // InternalBgDsl.g:241:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalBgDsl.g:241:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalBgDsl.g:242:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalBgDsl.g:248:1: ruleFilter returns [EObject current=null] : this_PatternFilter_0= rulePatternFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_PatternFilter_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:254:2: (this_PatternFilter_0= rulePatternFilter )
            // InternalBgDsl.g:255:2: this_PatternFilter_0= rulePatternFilter
            {

            		newCompositeNode(grammarAccess.getFilterAccess().getPatternFilterParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PatternFilter_0=rulePatternFilter();

            state._fsp--;


            		current = this_PatternFilter_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBoard"
    // InternalBgDsl.g:266:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalBgDsl.g:266:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalBgDsl.g:267:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalBgDsl.g:273:1: ruleBoard returns [EObject current=null] : ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )? (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )? otherlv_17= 'tileplacement' otherlv_18= '{' ( (lv_tileplacement_19_0= ruleTilePlacement ) ) (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token lv_checkered_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_height_6_0 = null;

        EObject lv_tiles_9_0 = null;

        EObject lv_tiles_11_0 = null;

        EObject lv_legalMovesPipeline_14_0 = null;

        EObject lv_effectPipeline_16_0 = null;

        EObject lv_tileplacement_19_0 = null;

        EObject lv_tileplacement_21_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:279:2: ( ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )? (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )? otherlv_17= 'tileplacement' otherlv_18= '{' ( (lv_tileplacement_19_0= ruleTilePlacement ) ) (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalBgDsl.g:280:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )? (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )? otherlv_17= 'tileplacement' otherlv_18= '{' ( (lv_tileplacement_19_0= ruleTilePlacement ) ) (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalBgDsl.g:280:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )? (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )? otherlv_17= 'tileplacement' otherlv_18= '{' ( (lv_tileplacement_19_0= ruleTilePlacement ) ) (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalBgDsl.g:281:3: ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )? (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )? otherlv_17= 'tileplacement' otherlv_18= '{' ( (lv_tileplacement_19_0= ruleTilePlacement ) ) (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            // InternalBgDsl.g:281:3: ( (lv_checkered_0_0= 'checkered' ) )
            // InternalBgDsl.g:282:4: (lv_checkered_0_0= 'checkered' )
            {
            // InternalBgDsl.g:282:4: (lv_checkered_0_0= 'checkered' )
            // InternalBgDsl.g:283:5: lv_checkered_0_0= 'checkered'
            {
            lv_checkered_0_0=(Token)match(input,19,FOLLOW_14); 

            					newLeafNode(lv_checkered_0_0, grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(current, "checkered", lv_checkered_0_0 != null, "checkered");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getBoardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getWidthKeyword_3());
            		
            // InternalBgDsl.g:307:3: ( (lv_width_4_0= ruleEInt ) )
            // InternalBgDsl.g:308:4: (lv_width_4_0= ruleEInt )
            {
            // InternalBgDsl.g:308:4: (lv_width_4_0= ruleEInt )
            // InternalBgDsl.g:309:5: lv_width_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_width_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_4_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getHeightKeyword_5());
            		
            // InternalBgDsl.g:330:3: ( (lv_height_6_0= ruleEInt ) )
            // InternalBgDsl.g:331:4: (lv_height_6_0= ruleEInt )
            {
            // InternalBgDsl.g:331:4: (lv_height_6_0= ruleEInt )
            // InternalBgDsl.g:332:5: lv_height_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_height_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_6_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getTilesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBgDsl.g:357:3: ( (lv_tiles_9_0= ruleTile ) )
            // InternalBgDsl.g:358:4: (lv_tiles_9_0= ruleTile )
            {
            // InternalBgDsl.g:358:4: (lv_tiles_9_0= ruleTile )
            // InternalBgDsl.g:359:5: lv_tiles_9_0= ruleTile
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_tiles_9_0=ruleTile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"tiles",
            						lv_tiles_9_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Tile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:376:3: (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBgDsl.g:377:4: otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:381:4: ( (lv_tiles_11_0= ruleTile ) )
            	    // InternalBgDsl.g:382:5: (lv_tiles_11_0= ruleTile )
            	    {
            	    // InternalBgDsl.g:382:5: (lv_tiles_11_0= ruleTile )
            	    // InternalBgDsl.g:383:6: lv_tiles_11_0= ruleTile
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_tiles_11_0=ruleTile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tiles",
            	    							lv_tiles_11_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Tile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:405:3: (otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:406:4: otherlv_13= 'legalMovesPipeline' ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0());
                    			
                    // InternalBgDsl.g:410:4: ( (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline ) )
                    // InternalBgDsl.g:411:5: (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline )
                    {
                    // InternalBgDsl.g:411:5: (lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline )
                    // InternalBgDsl.g:412:6: lv_legalMovesPipeline_14_0= ruleLegalMovesPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legalMovesPipeline_14_0=ruleLegalMovesPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						set(
                    							current,
                    							"legalMovesPipeline",
                    							lv_legalMovesPipeline_14_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.LegalMovesPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBgDsl.g:430:3: (otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBgDsl.g:431:4: otherlv_15= 'effectPipeline' ( (lv_effectPipeline_16_0= ruleEffectPipeline ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0());
                    			
                    // InternalBgDsl.g:435:4: ( (lv_effectPipeline_16_0= ruleEffectPipeline ) )
                    // InternalBgDsl.g:436:5: (lv_effectPipeline_16_0= ruleEffectPipeline )
                    {
                    // InternalBgDsl.g:436:5: (lv_effectPipeline_16_0= ruleEffectPipeline )
                    // InternalBgDsl.g:437:6: lv_effectPipeline_16_0= ruleEffectPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_effectPipeline_16_0=ruleEffectPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						set(
                    							current,
                    							"effectPipeline",
                    							lv_effectPipeline_16_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EffectPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getBoardAccess().getTileplacementKeyword_14());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalBgDsl.g:463:3: ( (lv_tileplacement_19_0= ruleTilePlacement ) )
            // InternalBgDsl.g:464:4: (lv_tileplacement_19_0= ruleTilePlacement )
            {
            // InternalBgDsl.g:464:4: (lv_tileplacement_19_0= ruleTilePlacement )
            // InternalBgDsl.g:465:5: lv_tileplacement_19_0= ruleTilePlacement
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_10);
            lv_tileplacement_19_0=ruleTilePlacement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"tileplacement",
            						lv_tileplacement_19_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TilePlacement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:482:3: (otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:483:4: otherlv_20= ',' ( (lv_tileplacement_21_0= ruleTilePlacement ) )
            	    {
            	    otherlv_20=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalBgDsl.g:487:4: ( (lv_tileplacement_21_0= ruleTilePlacement ) )
            	    // InternalBgDsl.g:488:5: (lv_tileplacement_21_0= ruleTilePlacement )
            	    {
            	    // InternalBgDsl.g:488:5: (lv_tileplacement_21_0= ruleTilePlacement )
            	    // InternalBgDsl.g:489:6: lv_tileplacement_21_0= ruleTilePlacement
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_tileplacement_21_0=ruleTilePlacement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tileplacement",
            	    							lv_tileplacement_21_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TilePlacement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_22=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleEString"
    // InternalBgDsl.g:519:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBgDsl.g:519:47: (iv_ruleEString= ruleEString EOF )
            // InternalBgDsl.g:520:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBgDsl.g:526:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:532:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBgDsl.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBgDsl.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBgDsl.g:534:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:542:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePlayer"
    // InternalBgDsl.g:553:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalBgDsl.g:553:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalBgDsl.g:554:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalBgDsl.g:560:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:566:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalBgDsl.g:567:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalBgDsl.g:567:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalBgDsl.g:568:3: otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalBgDsl.g:572:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:573:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:573:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:574:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getHexColorKeyword_3());
            		
            // InternalBgDsl.g:599:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:600:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:600:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:601:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_hexColor_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"hexColor",
            						lv_hexColor_4_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPlayerAccess().getAssociatedStateKeyword_5());
            		
            // InternalBgDsl.g:622:3: ( ( ruleEString ) )
            // InternalBgDsl.g:623:4: ( ruleEString )
            {
            // InternalBgDsl.g:623:4: ( ruleEString )
            // InternalBgDsl.g:624:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlayerAccess().getAssociatedStateStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:646:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBgDsl.g:646:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBgDsl.g:647:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBgDsl.g:653:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:659:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBgDsl.g:660:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBgDsl.g:660:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBgDsl.g:661:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBgDsl.g:661:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:662:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTile"
    // InternalBgDsl.g:679:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalBgDsl.g:679:45: (iv_ruleTile= ruleTile EOF )
            // InternalBgDsl.g:680:2: iv_ruleTile= ruleTile EOF
            {
             newCompositeNode(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTile=ruleTile();

            state._fsp--;

             current =iv_ruleTile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalBgDsl.g:686:1: ruleTile returns [EObject current=null] : (otherlv_0= 'Tile' ( (lv_tileType_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) ;
    public final EObject ruleTile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_tileType_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_transitions_15_0 = null;

        EObject lv_transitions_17_0 = null;

        EObject lv_initialState_20_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:692:2: ( (otherlv_0= 'Tile' ( (lv_tileType_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) )
            // InternalBgDsl.g:693:2: (otherlv_0= 'Tile' ( (lv_tileType_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            {
            // InternalBgDsl.g:693:2: (otherlv_0= 'Tile' ( (lv_tileType_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            // InternalBgDsl.g:694:3: otherlv_0= 'Tile' ( (lv_tileType_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTileAccess().getTileKeyword_0());
            		
            // InternalBgDsl.g:698:3: ( (lv_tileType_1_0= ruleEString ) )
            // InternalBgDsl.g:699:4: (lv_tileType_1_0= ruleEString )
            {
            // InternalBgDsl.g:699:4: (lv_tileType_1_0= ruleEString )
            // InternalBgDsl.g:700:5: lv_tileType_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getTileTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_tileType_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"tileType",
            						lv_tileType_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTileAccess().getHexColorKeyword_3());
            		
            // InternalBgDsl.g:725:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:726:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:726:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:727:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_hexColor_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"hexColor",
            						lv_hexColor_4_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTileAccess().getNameKeyword_5());
            		
            // InternalBgDsl.g:748:3: ( (lv_name_6_0= ruleEString ) )
            // InternalBgDsl.g:749:4: (lv_name_6_0= ruleEString )
            {
            // InternalBgDsl.g:749:4: (lv_name_6_0= ruleEString )
            // InternalBgDsl.g:750:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTileAccess().getStatesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBgDsl.g:775:3: ( (lv_states_9_0= ruleState ) )
            // InternalBgDsl.g:776:4: (lv_states_9_0= ruleState )
            {
            // InternalBgDsl.g:776:4: (lv_states_9_0= ruleState )
            // InternalBgDsl.g:777:5: lv_states_9_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTileAccess().getStatesStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_states_9_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_9_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:794:3: (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBgDsl.g:795:4: otherlv_10= ',' ( (lv_states_11_0= ruleState ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTileAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:799:4: ( (lv_states_11_0= ruleState ) )
            	    // InternalBgDsl.g:800:5: (lv_states_11_0= ruleState )
            	    {
            	    // InternalBgDsl.g:800:5: (lv_states_11_0= ruleState )
            	    // InternalBgDsl.g:801:6: lv_states_11_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_states_11_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_11_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_32); 

            			newLeafNode(otherlv_12, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:823:3: (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBgDsl.g:824:4: otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getTileAccess().getTransitionsKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:832:4: ( (lv_transitions_15_0= ruleTransition ) )
                    // InternalBgDsl.g:833:5: (lv_transitions_15_0= ruleTransition )
                    {
                    // InternalBgDsl.g:833:5: (lv_transitions_15_0= ruleTransition )
                    // InternalBgDsl.g:834:6: lv_transitions_15_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_transitions_15_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTileRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_15_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:851:4: (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBgDsl.g:852:5: otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_33); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTileAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:856:5: ( (lv_transitions_17_0= ruleTransition ) )
                    	    // InternalBgDsl.g:857:6: (lv_transitions_17_0= ruleTransition )
                    	    {
                    	    // InternalBgDsl.g:857:6: (lv_transitions_17_0= ruleTransition )
                    	    // InternalBgDsl.g:858:7: lv_transitions_17_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_transitions_17_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_17_0,
                    	    								"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_34); 

                    				newLeafNode(otherlv_18, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_19, grammarAccess.getTileAccess().getInitialStateKeyword_13());
            		
            // InternalBgDsl.g:885:3: ( (lv_initialState_20_0= ruleState ) )
            // InternalBgDsl.g:886:4: (lv_initialState_20_0= ruleState )
            {
            // InternalBgDsl.g:886:4: (lv_initialState_20_0= ruleState )
            // InternalBgDsl.g:887:5: lv_initialState_20_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_initialState_20_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"initialState",
            						lv_initialState_20_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTile"


    // $ANTLR start "entryRuleLegalMovesPipeline"
    // InternalBgDsl.g:912:1: entryRuleLegalMovesPipeline returns [EObject current=null] : iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF ;
    public final EObject entryRuleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegalMovesPipeline = null;


        try {
            // InternalBgDsl.g:912:59: (iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:913:2: iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF
            {
             newCompositeNode(grammarAccess.getLegalMovesPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalMovesPipeline=ruleLegalMovesPipeline();

            state._fsp--;

             current =iv_ruleLegalMovesPipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegalMovesPipeline"


    // $ANTLR start "ruleLegalMovesPipeline"
    // InternalBgDsl.g:919:1: ruleLegalMovesPipeline returns [EObject current=null] : ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:925:2: ( ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:926:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:926:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:927:3: () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:927:3: ()
            // InternalBgDsl.g:928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:942:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:943:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:947:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:948:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:948:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:949:6: lv_filter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_filter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLegalMovesPipelineRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_4_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegalMovesPipeline"


    // $ANTLR start "entryRuleEffectPipeline"
    // InternalBgDsl.g:975:1: entryRuleEffectPipeline returns [EObject current=null] : iv_ruleEffectPipeline= ruleEffectPipeline EOF ;
    public final EObject entryRuleEffectPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectPipeline = null;


        try {
            // InternalBgDsl.g:975:55: (iv_ruleEffectPipeline= ruleEffectPipeline EOF )
            // InternalBgDsl.g:976:2: iv_ruleEffectPipeline= ruleEffectPipeline EOF
            {
             newCompositeNode(grammarAccess.getEffectPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectPipeline=ruleEffectPipeline();

            state._fsp--;

             current =iv_ruleEffectPipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectPipeline"


    // $ANTLR start "ruleEffectPipeline"
    // InternalBgDsl.g:982:1: ruleEffectPipeline returns [EObject current=null] : ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEffectPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:988:2: ( ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:989:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:989:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:990:3: () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:990:3: ()
            // InternalBgDsl.g:991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1005:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:1006:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1010:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1011:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1011:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:1012:6: lv_filter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getEffectPipelineAccess().getFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_filter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectPipelineRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_4_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectPipeline"


    // $ANTLR start "entryRuleTilePlacement"
    // InternalBgDsl.g:1038:1: entryRuleTilePlacement returns [EObject current=null] : iv_ruleTilePlacement= ruleTilePlacement EOF ;
    public final EObject entryRuleTilePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTilePlacement = null;


        try {
            // InternalBgDsl.g:1038:54: (iv_ruleTilePlacement= ruleTilePlacement EOF )
            // InternalBgDsl.g:1039:2: iv_ruleTilePlacement= ruleTilePlacement EOF
            {
             newCompositeNode(grammarAccess.getTilePlacementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTilePlacement=ruleTilePlacement();

            state._fsp--;

             current =iv_ruleTilePlacement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTilePlacement"


    // $ANTLR start "ruleTilePlacement"
    // InternalBgDsl.g:1045:1: ruleTilePlacement returns [EObject current=null] : (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleTilePlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_column_5_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1051:2: ( (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalBgDsl.g:1052:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalBgDsl.g:1052:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalBgDsl.g:1053:3: otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTilePlacementAccess().getRowKeyword_2());
            		
            // InternalBgDsl.g:1065:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalBgDsl.g:1066:4: (lv_row_3_0= ruleEInt )
            {
            // InternalBgDsl.g:1066:4: (lv_row_3_0= ruleEInt )
            // InternalBgDsl.g:1067:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_row_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTilePlacementRule());
            					}
            					set(
            						current,
            						"row",
            						lv_row_3_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTilePlacementAccess().getColumnKeyword_4());
            		
            // InternalBgDsl.g:1088:3: ( (lv_column_5_0= ruleEInt ) )
            // InternalBgDsl.g:1089:4: (lv_column_5_0= ruleEInt )
            {
            // InternalBgDsl.g:1089:4: (lv_column_5_0= ruleEInt )
            // InternalBgDsl.g:1090:5: lv_column_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getColumnEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
            lv_column_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTilePlacementRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_5_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTilePlacementAccess().getTileKeyword_6());
            		
            // InternalBgDsl.g:1111:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1112:4: ( ruleEString )
            {
            // InternalBgDsl.g:1112:4: ( ruleEString )
            // InternalBgDsl.g:1113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTilePlacementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTilePlacementAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTilePlacement"


    // $ANTLR start "entryRuleState"
    // InternalBgDsl.g:1135:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalBgDsl.g:1135:46: (iv_ruleState= ruleState EOF )
            // InternalBgDsl.g:1136:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalBgDsl.g:1142:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1148:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalBgDsl.g:1149:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalBgDsl.g:1149:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalBgDsl.g:1150:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalBgDsl.g:1154:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1155:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1155:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1156:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getHexColorKeyword_3());
            		
            // InternalBgDsl.g:1181:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:1182:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:1182:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:1183:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_hexColor_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"hexColor",
            						lv_hexColor_4_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1200:3: (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:1201:4: otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getOutboundKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBgDsl.g:1209:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1210:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1210:5: ( ruleEString )
                    // InternalBgDsl.g:1211:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1225:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBgDsl.g:1226:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBgDsl.g:1230:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1231:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1231:6: ( ruleEString )
                    	    // InternalBgDsl.g:1232:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,46,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:1252:3: (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:1253:4: otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getInboundKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBgDsl.g:1261:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1262:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1262:5: ( ruleEString )
                    // InternalBgDsl.g:1263:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1277:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalBgDsl.g:1278:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getStateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBgDsl.g:1282:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1283:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1283:6: ( ruleEString )
                    	    // InternalBgDsl.g:1284:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,46,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalBgDsl.g:1312:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalBgDsl.g:1312:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalBgDsl.g:1313:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalBgDsl.g:1319:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1325:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalBgDsl.g:1326:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalBgDsl.g:1326:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalBgDsl.g:1327:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalBgDsl.g:1331:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1332:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1332:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1333:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBgDsl.g:1362:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1363:4: ( ruleEString )
            {
            // InternalBgDsl.g:1363:4: ( ruleEString )
            // InternalBgDsl.g:1364:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1378:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBgDsl.g:1379:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBgDsl.g:1383:4: ( ( ruleEString ) )
            	    // InternalBgDsl.g:1384:5: ( ruleEString )
            	    {
            	    // InternalBgDsl.g:1384:5: ( ruleEString )
            	    // InternalBgDsl.g:1385:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_8());
            		
            // InternalBgDsl.g:1408:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1409:4: ( ruleEString )
            {
            // InternalBgDsl.g:1409:4: ( ruleEString )
            // InternalBgDsl.g:1410:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePatternFilter"
    // InternalBgDsl.g:1432:1: entryRulePatternFilter returns [EObject current=null] : iv_rulePatternFilter= rulePatternFilter EOF ;
    public final EObject entryRulePatternFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFilter = null;


        try {
            // InternalBgDsl.g:1432:54: (iv_rulePatternFilter= rulePatternFilter EOF )
            // InternalBgDsl.g:1433:2: iv_rulePatternFilter= rulePatternFilter EOF
            {
             newCompositeNode(grammarAccess.getPatternFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternFilter=rulePatternFilter();

            state._fsp--;

             current =iv_rulePatternFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternFilter"


    // $ANTLR start "rulePatternFilter"
    // InternalBgDsl.g:1439:1: rulePatternFilter returns [EObject current=null] : (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject rulePatternFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_nextFilter_4_0 = null;

        EObject lv_patterns_7_0 = null;

        EObject lv_patterns_9_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1445:2: ( (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalBgDsl.g:1446:2: (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalBgDsl.g:1446:2: (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalBgDsl.g:1447:3: otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_0());
            		
            // InternalBgDsl.g:1451:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1452:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1452:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1453:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternFilterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternFilterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1474:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBgDsl.g:1475:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternFilterAccess().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1479:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1480:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1480:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1481:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_nextFilter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternFilterRule());
                    						}
                    						set(
                    							current,
                    							"nextFilter",
                    							lv_nextFilter_4_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternFilterAccess().getPatternsKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBgDsl.g:1507:3: ( (lv_patterns_7_0= rulePattern ) )
            // InternalBgDsl.g:1508:4: (lv_patterns_7_0= rulePattern )
            {
            // InternalBgDsl.g:1508:4: (lv_patterns_7_0= rulePattern )
            // InternalBgDsl.g:1509:5: lv_patterns_7_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_patterns_7_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternFilterRule());
            					}
            					add(
            						current,
            						"patterns",
            						lv_patterns_7_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1526:3: (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBgDsl.g:1527:4: otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_48); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPatternFilterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBgDsl.g:1531:4: ( (lv_patterns_9_0= rulePattern ) )
            	    // InternalBgDsl.g:1532:5: (lv_patterns_9_0= rulePattern )
            	    {
            	    // InternalBgDsl.g:1532:5: (lv_patterns_9_0= rulePattern )
            	    // InternalBgDsl.g:1533:6: lv_patterns_9_0= rulePattern
            	    {

            	    						newCompositeNode(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_patterns_9_0=rulePattern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternFilterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patterns",
            	    							lv_patterns_9_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.Pattern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternFilter"


    // $ANTLR start "entryRulePattern"
    // InternalBgDsl.g:1563:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalBgDsl.g:1563:48: (iv_rulePattern= rulePattern EOF )
            // InternalBgDsl.g:1564:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalBgDsl.g:1570:1: rulePattern returns [EObject current=null] : (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_stateSelection_4_0 = null;

        EObject lv_relativecoordinates_9_0 = null;

        EObject lv_relativecoordinates_11_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1576:2: ( (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalBgDsl.g:1577:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalBgDsl.g:1577:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalBgDsl.g:1578:3: otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalBgDsl.g:1582:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1583:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1583:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1584:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1605:3: (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBgDsl.g:1606:4: otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0());
                    			
                    // InternalBgDsl.g:1610:4: ( (lv_stateSelection_4_0= ruleStateSelection ) )
                    // InternalBgDsl.g:1611:5: (lv_stateSelection_4_0= ruleStateSelection )
                    {
                    // InternalBgDsl.g:1611:5: (lv_stateSelection_4_0= ruleStateSelection )
                    // InternalBgDsl.g:1612:6: lv_stateSelection_4_0= ruleStateSelection
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getStateSelectionStateSelectionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_stateSelection_4_0=ruleStateSelection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"stateSelection",
                    							lv_stateSelection_4_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.StateSelection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBgDsl.g:1630:3: (otherlv_5= 'matchState' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBgDsl.g:1631:4: otherlv_5= 'matchState' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getMatchStateKeyword_4_0());
                    			
                    // InternalBgDsl.g:1635:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1636:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1636:5: ( ruleEString )
                    // InternalBgDsl.g:1637:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBgDsl.g:1660:3: ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) )
            // InternalBgDsl.g:1661:4: (lv_relativecoordinates_9_0= ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:1661:4: (lv_relativecoordinates_9_0= ruleRelativeCoordinate )
            // InternalBgDsl.g:1662:5: lv_relativecoordinates_9_0= ruleRelativeCoordinate
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_relativecoordinates_9_0=ruleRelativeCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					add(
            						current,
            						"relativecoordinates",
            						lv_relativecoordinates_9_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.RelativeCoordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1679:3: (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBgDsl.g:1680:4: otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_53); 

            	    				newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBgDsl.g:1684:4: ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) )
            	    // InternalBgDsl.g:1685:5: (lv_relativecoordinates_11_0= ruleRelativeCoordinate )
            	    {
            	    // InternalBgDsl.g:1685:5: (lv_relativecoordinates_11_0= ruleRelativeCoordinate )
            	    // InternalBgDsl.g:1686:6: lv_relativecoordinates_11_0= ruleRelativeCoordinate
            	    {

            	    						newCompositeNode(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_relativecoordinates_11_0=ruleRelativeCoordinate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativecoordinates",
            	    							lv_relativecoordinates_11_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.RelativeCoordinate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleRelativeCoordinate"
    // InternalBgDsl.g:1716:1: entryRuleRelativeCoordinate returns [EObject current=null] : iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF ;
    public final EObject entryRuleRelativeCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeCoordinate = null;


        try {
            // InternalBgDsl.g:1716:59: (iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF )
            // InternalBgDsl.g:1717:2: iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF
            {
             newCompositeNode(grammarAccess.getRelativeCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeCoordinate=ruleRelativeCoordinate();

            state._fsp--;

             current =iv_ruleRelativeCoordinate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeCoordinate"


    // $ANTLR start "ruleRelativeCoordinate"
    // InternalBgDsl.g:1723:1: ruleRelativeCoordinate returns [EObject current=null] : (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleRelativeCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1729:2: ( (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalBgDsl.g:1730:2: (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalBgDsl.g:1730:2: (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalBgDsl.g:1731:3: otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeCoordinateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeCoordinateAccess().getXKeyword_2());
            		
            // InternalBgDsl.g:1743:3: ( (lv_x_3_0= ruleEInt ) )
            // InternalBgDsl.g:1744:4: (lv_x_3_0= ruleEInt )
            {
            // InternalBgDsl.g:1744:4: (lv_x_3_0= ruleEInt )
            // InternalBgDsl.g:1745:5: lv_x_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRelativeCoordinateAccess().getXEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
            lv_x_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCoordinateRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRelativeCoordinateAccess().getYKeyword_4());
            		
            // InternalBgDsl.g:1766:3: ( (lv_y_5_0= ruleEInt ) )
            // InternalBgDsl.g:1767:4: (lv_y_5_0= ruleEInt )
            {
            // InternalBgDsl.g:1767:4: (lv_y_5_0= ruleEInt )
            // InternalBgDsl.g:1768:5: lv_y_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRelativeCoordinateAccess().getYEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_y_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCoordinateRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRelativeCoordinateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeCoordinate"


    // $ANTLR start "ruleStateSelection"
    // InternalBgDsl.g:1793:1: ruleStateSelection returns [Enumerator current=null] : ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) ) ;
    public final Enumerator ruleStateSelection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1799:2: ( ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) ) )
            // InternalBgDsl.g:1800:2: ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) )
            {
            // InternalBgDsl.g:1800:2: ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt25=1;
                }
                break;
            case 62:
                {
                alt25=2;
                }
                break;
            case 63:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalBgDsl.g:1801:3: (enumLiteral_0= 'CurrentPlayer' )
                    {
                    // InternalBgDsl.g:1801:3: (enumLiteral_0= 'CurrentPlayer' )
                    // InternalBgDsl.g:1802:4: enumLiteral_0= 'CurrentPlayer'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1809:3: (enumLiteral_1= 'OtherPlayer' )
                    {
                    // InternalBgDsl.g:1809:3: (enumLiteral_1= 'OtherPlayer' )
                    // InternalBgDsl.g:1810:4: enumLiteral_1= 'OtherPlayer'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:1817:3: (enumLiteral_2= 'StateBased' )
                    {
                    // InternalBgDsl.g:1817:3: (enumLiteral_2= 'StateBased' )
                    // InternalBgDsl.g:1818:4: enumLiteral_2= 'StateBased'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateSelection"


    // $ANTLR start "ruleTurnType"
    // InternalBgDsl.g:1828:1: ruleTurnType returns [Enumerator current=null] : ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) ;
    public final Enumerator ruleTurnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1834:2: ( ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) )
            // InternalBgDsl.g:1835:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            {
            // InternalBgDsl.g:1835:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            else if ( (LA26_0==65) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBgDsl.g:1836:3: (enumLiteral_0= 'TurnBased' )
                    {
                    // InternalBgDsl.g:1836:3: (enumLiteral_0= 'TurnBased' )
                    // InternalBgDsl.g:1837:4: enumLiteral_0= 'TurnBased'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1844:3: (enumLiteral_1= 'Simultaneous' )
                    {
                    // InternalBgDsl.g:1844:3: (enumLiteral_1= 'Simultaneous' )
                    // InternalBgDsl.g:1845:4: enumLiteral_1= 'Simultaneous'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000900000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000000L});

}