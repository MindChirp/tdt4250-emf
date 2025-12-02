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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'initialPlayer'", "'board'", "'players'", "','", "'}'", "'turnPolicy'", "'checkered'", "'Board'", "'width'", "'height'", "'tiles'", "'legalMovesPipeline'", "'effectPipeline'", "'tileplacement'", "'Player'", "'hexColor'", "'TurnPolicy'", "'type'", "'-'", "'Tile'", "'name'", "'states'", "'transitions'", "'initialState'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'SomeFilter1'", "'nextFilter'", "'SomeFilter2'", "'TurnBased'", "'Simultaneous'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__20=20;
    public static final int T__21=21;
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
    // InternalBgDsl.g:72:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_board_6_0 = null;

        EObject lv_players_9_0 = null;

        EObject lv_players_11_0 = null;

        EObject lv_turnPolicy_15_0 = null;

        EObject lv_turnPolicy_17_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalBgDsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalBgDsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalBgDsl.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'initialPlayer' ( ( ruleEString ) ) )? otherlv_5= 'board' ( (lv_board_6_0= ruleBoard ) ) (otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' )? (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )? otherlv_19= '}'
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

            // InternalBgDsl.g:210:3: (otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:211:4: otherlv_13= 'turnPolicy' otherlv_14= '{' ( (lv_turnPolicy_15_0= ruleTurnPolicy ) ) (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getGameAccess().getTurnPolicyKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBgDsl.g:219:4: ( (lv_turnPolicy_15_0= ruleTurnPolicy ) )
                    // InternalBgDsl.g:220:5: (lv_turnPolicy_15_0= ruleTurnPolicy )
                    {
                    // InternalBgDsl.g:220:5: (lv_turnPolicy_15_0= ruleTurnPolicy )
                    // InternalBgDsl.g:221:6: lv_turnPolicy_15_0= ruleTurnPolicy
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_turnPolicy_15_0=ruleTurnPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"turnPolicy",
                    							lv_turnPolicy_15_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TurnPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:238:4: (otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBgDsl.g:239:5: otherlv_16= ',' ( (lv_turnPolicy_17_0= ruleTurnPolicy ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getGameAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBgDsl.g:243:5: ( (lv_turnPolicy_17_0= ruleTurnPolicy ) )
                    	    // InternalBgDsl.g:244:6: (lv_turnPolicy_17_0= ruleTurnPolicy )
                    	    {
                    	    // InternalBgDsl.g:244:6: (lv_turnPolicy_17_0= ruleTurnPolicy )
                    	    // InternalBgDsl.g:245:7: lv_turnPolicy_17_0= ruleTurnPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_turnPolicy_17_0=ruleTurnPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"turnPolicy",
                    	    								lv_turnPolicy_17_0,
                    	    								"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TurnPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalBgDsl.g:276:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalBgDsl.g:276:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalBgDsl.g:277:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalBgDsl.g:283:1: ruleFilter returns [EObject current=null] : (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_SomeFilter1_0 = null;

        EObject this_SomeFilter2_1 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:289:2: ( (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 ) )
            // InternalBgDsl.g:290:2: (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 )
            {
            // InternalBgDsl.g:290:2: (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==52) ) {
                alt6=1;
            }
            else if ( (LA6_0==54) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBgDsl.g:291:3: this_SomeFilter1_0= ruleSomeFilter1
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getSomeFilter1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SomeFilter1_0=ruleSomeFilter1();

                    state._fsp--;


                    			current = this_SomeFilter1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:300:3: this_SomeFilter2_1= ruleSomeFilter2
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getSomeFilter2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SomeFilter2_1=ruleSomeFilter2();

                    state._fsp--;


                    			current = this_SomeFilter2_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBoard"
    // InternalBgDsl.g:312:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalBgDsl.g:312:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalBgDsl.g:313:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalBgDsl.g:319:1: ruleBoard returns [EObject current=null] : ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_height_6_0 = null;

        EObject lv_tiles_9_0 = null;

        EObject lv_tiles_11_0 = null;

        EObject lv_legalMovesPipeline_15_0 = null;

        EObject lv_legalMovesPipeline_17_0 = null;

        EObject lv_effectPipeline_21_0 = null;

        EObject lv_effectPipeline_23_0 = null;

        EObject lv_tileplacement_27_0 = null;

        EObject lv_tileplacement_29_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:325:2: ( ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalBgDsl.g:326:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalBgDsl.g:326:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalBgDsl.g:327:3: ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            // InternalBgDsl.g:327:3: ( (lv_checkered_0_0= 'checkered' ) )
            // InternalBgDsl.g:328:4: (lv_checkered_0_0= 'checkered' )
            {
            // InternalBgDsl.g:328:4: (lv_checkered_0_0= 'checkered' )
            // InternalBgDsl.g:329:5: lv_checkered_0_0= 'checkered'
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
            		
            // InternalBgDsl.g:353:3: ( (lv_width_4_0= ruleEInt ) )
            // InternalBgDsl.g:354:4: (lv_width_4_0= ruleEInt )
            {
            // InternalBgDsl.g:354:4: (lv_width_4_0= ruleEInt )
            // InternalBgDsl.g:355:5: lv_width_4_0= ruleEInt
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
            		
            // InternalBgDsl.g:376:3: ( (lv_height_6_0= ruleEInt ) )
            // InternalBgDsl.g:377:4: (lv_height_6_0= ruleEInt )
            {
            // InternalBgDsl.g:377:4: (lv_height_6_0= ruleEInt )
            // InternalBgDsl.g:378:5: lv_height_6_0= ruleEInt
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
            		
            // InternalBgDsl.g:403:3: ( (lv_tiles_9_0= ruleTile ) )
            // InternalBgDsl.g:404:4: (lv_tiles_9_0= ruleTile )
            {
            // InternalBgDsl.g:404:4: (lv_tiles_9_0= ruleTile )
            // InternalBgDsl.g:405:5: lv_tiles_9_0= ruleTile
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

            // InternalBgDsl.g:422:3: (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:423:4: otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:427:4: ( (lv_tiles_11_0= ruleTile ) )
            	    // InternalBgDsl.g:428:5: (lv_tiles_11_0= ruleTile )
            	    {
            	    // InternalBgDsl.g:428:5: (lv_tiles_11_0= ruleTile )
            	    // InternalBgDsl.g:429:6: lv_tiles_11_0= ruleTile
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
            	    break loop7;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:451:3: (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:452:4: otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:460:4: ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) )
                    // InternalBgDsl.g:461:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    {
                    // InternalBgDsl.g:461:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    // InternalBgDsl.g:462:6: lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_legalMovesPipeline_15_0=ruleLegalMovesPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						add(
                    							current,
                    							"legalMovesPipeline",
                    							lv_legalMovesPipeline_15_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.LegalMovesPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:479:4: (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBgDsl.g:480:5: otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:484:5: ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    // InternalBgDsl.g:485:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    {
                    	    // InternalBgDsl.g:485:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    // InternalBgDsl.g:486:7: lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_legalMovesPipeline_17_0=ruleLegalMovesPipeline();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"legalMovesPipeline",
                    	    								lv_legalMovesPipeline_17_0,
                    	    								"no.ntnu.tdt4250.bg.bgdsl.BgDsl.LegalMovesPipeline");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:509:3: (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBgDsl.g:510:4: otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalBgDsl.g:518:4: ( (lv_effectPipeline_21_0= ruleEffectPipeline ) )
                    // InternalBgDsl.g:519:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    {
                    // InternalBgDsl.g:519:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    // InternalBgDsl.g:520:6: lv_effectPipeline_21_0= ruleEffectPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_effectPipeline_21_0=ruleEffectPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						add(
                    							current,
                    							"effectPipeline",
                    							lv_effectPipeline_21_0,
                    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EffectPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:537:4: (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBgDsl.g:538:5: otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalBgDsl.g:542:5: ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    // InternalBgDsl.g:543:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    {
                    	    // InternalBgDsl.g:543:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    // InternalBgDsl.g:544:7: lv_effectPipeline_23_0= ruleEffectPipeline
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_effectPipeline_23_0=ruleEffectPipeline();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectPipeline",
                    	    								lv_effectPipeline_23_0,
                    	    								"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EffectPipeline");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_24, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_25, grammarAccess.getBoardAccess().getTileplacementKeyword_14());
            		
            otherlv_26=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_26, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalBgDsl.g:575:3: ( (lv_tileplacement_27_0= ruleTilePlacement ) )
            // InternalBgDsl.g:576:4: (lv_tileplacement_27_0= ruleTilePlacement )
            {
            // InternalBgDsl.g:576:4: (lv_tileplacement_27_0= ruleTilePlacement )
            // InternalBgDsl.g:577:5: lv_tileplacement_27_0= ruleTilePlacement
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_10);
            lv_tileplacement_27_0=ruleTilePlacement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"tileplacement",
            						lv_tileplacement_27_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TilePlacement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:594:3: (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBgDsl.g:595:4: otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_28, grammarAccess.getBoardAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalBgDsl.g:599:4: ( (lv_tileplacement_29_0= ruleTilePlacement ) )
            	    // InternalBgDsl.g:600:5: (lv_tileplacement_29_0= ruleTilePlacement )
            	    {
            	    // InternalBgDsl.g:600:5: (lv_tileplacement_29_0= ruleTilePlacement )
            	    // InternalBgDsl.g:601:6: lv_tileplacement_29_0= ruleTilePlacement
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_tileplacement_29_0=ruleTilePlacement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tileplacement",
            	    							lv_tileplacement_29_0,
            	    							"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TilePlacement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_30, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19());
            		

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
    // InternalBgDsl.g:631:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBgDsl.g:631:47: (iv_ruleEString= ruleEString EOF )
            // InternalBgDsl.g:632:2: iv_ruleEString= ruleEString EOF
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
    // InternalBgDsl.g:638:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:644:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBgDsl.g:645:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBgDsl.g:645:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:646:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:654:3: this_ID_1= RULE_ID
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
    // InternalBgDsl.g:665:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalBgDsl.g:665:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalBgDsl.g:666:2: iv_rulePlayer= rulePlayer EOF
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
    // InternalBgDsl.g:672:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:678:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalBgDsl.g:679:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalBgDsl.g:679:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalBgDsl.g:680:3: otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalBgDsl.g:684:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:685:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:685:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:686:5: lv_name_1_0= ruleEString
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
            		
            // InternalBgDsl.g:711:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:712:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:712:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:713:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleTurnPolicy"
    // InternalBgDsl.g:738:1: entryRuleTurnPolicy returns [EObject current=null] : iv_ruleTurnPolicy= ruleTurnPolicy EOF ;
    public final EObject entryRuleTurnPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnPolicy = null;


        try {
            // InternalBgDsl.g:738:51: (iv_ruleTurnPolicy= ruleTurnPolicy EOF )
            // InternalBgDsl.g:739:2: iv_ruleTurnPolicy= ruleTurnPolicy EOF
            {
             newCompositeNode(grammarAccess.getTurnPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnPolicy=ruleTurnPolicy();

            state._fsp--;

             current =iv_ruleTurnPolicy; 
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
    // $ANTLR end "entryRuleTurnPolicy"


    // $ANTLR start "ruleTurnPolicy"
    // InternalBgDsl.g:745:1: ruleTurnPolicy returns [EObject current=null] : (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) ;
    public final EObject ruleTurnPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:751:2: ( (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) )
            // InternalBgDsl.g:752:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            {
            // InternalBgDsl.g:752:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            // InternalBgDsl.g:753:3: otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnPolicyAccess().getTypeKeyword_2());
            		
            // InternalBgDsl.g:765:3: ( (lv_type_3_0= ruleTurnType ) )
            // InternalBgDsl.g:766:4: (lv_type_3_0= ruleTurnType )
            {
            // InternalBgDsl.g:766:4: (lv_type_3_0= ruleTurnType )
            // InternalBgDsl.g:767:5: lv_type_3_0= ruleTurnType
            {

            					newCompositeNode(grammarAccess.getTurnPolicyAccess().getTypeTurnTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleTurnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnPolicyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.TurnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTurnPolicyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTurnPolicy"


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:792:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBgDsl.g:792:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBgDsl.g:793:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBgDsl.g:799:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:805:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBgDsl.g:806:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBgDsl.g:806:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBgDsl.g:807:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBgDsl.g:807:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:808:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_29); 

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
    // InternalBgDsl.g:825:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalBgDsl.g:825:45: (iv_ruleTile= ruleTile EOF )
            // InternalBgDsl.g:826:2: iv_ruleTile= ruleTile EOF
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
    // InternalBgDsl.g:832:1: ruleTile returns [EObject current=null] : (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) ;
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
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_transitions_15_0 = null;

        EObject lv_transitions_17_0 = null;

        EObject lv_initialState_20_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:838:2: ( (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) )
            // InternalBgDsl.g:839:2: (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            {
            // InternalBgDsl.g:839:2: (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            // InternalBgDsl.g:840:3: otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTileAccess().getTileKeyword_0());
            		
            // InternalBgDsl.g:844:3: ( (lv_type_1_0= ruleEString ) )
            // InternalBgDsl.g:845:4: (lv_type_1_0= ruleEString )
            {
            // InternalBgDsl.g:845:4: (lv_type_1_0= ruleEString )
            // InternalBgDsl.g:846:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"no.ntnu.tdt4250.bg.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTileAccess().getHexColorKeyword_3());
            		
            // InternalBgDsl.g:871:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:872:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:872:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:873:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTileAccess().getNameKeyword_5());
            		
            // InternalBgDsl.g:894:3: ( (lv_name_6_0= ruleEString ) )
            // InternalBgDsl.g:895:4: (lv_name_6_0= ruleEString )
            {
            // InternalBgDsl.g:895:4: (lv_name_6_0= ruleEString )
            // InternalBgDsl.g:896:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_7=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTileAccess().getStatesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBgDsl.g:921:3: ( (lv_states_9_0= ruleState ) )
            // InternalBgDsl.g:922:4: (lv_states_9_0= ruleState )
            {
            // InternalBgDsl.g:922:4: (lv_states_9_0= ruleState )
            // InternalBgDsl.g:923:5: lv_states_9_0= ruleState
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

            // InternalBgDsl.g:940:3: (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBgDsl.g:941:4: otherlv_10= ',' ( (lv_states_11_0= ruleState ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTileAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:945:4: ( (lv_states_11_0= ruleState ) )
            	    // InternalBgDsl.g:946:5: (lv_states_11_0= ruleState )
            	    {
            	    // InternalBgDsl.g:946:5: (lv_states_11_0= ruleState )
            	    // InternalBgDsl.g:947:6: lv_states_11_0= ruleState
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
            	    break loop15;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_12, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:969:3: (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBgDsl.g:970:4: otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getTileAccess().getTransitionsKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:978:4: ( (lv_transitions_15_0= ruleTransition ) )
                    // InternalBgDsl.g:979:5: (lv_transitions_15_0= ruleTransition )
                    {
                    // InternalBgDsl.g:979:5: (lv_transitions_15_0= ruleTransition )
                    // InternalBgDsl.g:980:6: lv_transitions_15_0= ruleTransition
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

                    // InternalBgDsl.g:997:4: (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBgDsl.g:998:5: otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_34); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTileAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:1002:5: ( (lv_transitions_17_0= ruleTransition ) )
                    	    // InternalBgDsl.g:1003:6: (lv_transitions_17_0= ruleTransition )
                    	    {
                    	    // InternalBgDsl.g:1003:6: (lv_transitions_17_0= ruleTransition )
                    	    // InternalBgDsl.g:1004:7: lv_transitions_17_0= ruleTransition
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_35); 

                    				newLeafNode(otherlv_18, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_19, grammarAccess.getTileAccess().getInitialStateKeyword_13());
            		
            // InternalBgDsl.g:1031:3: ( (lv_initialState_20_0= ruleState ) )
            // InternalBgDsl.g:1032:4: (lv_initialState_20_0= ruleState )
            {
            // InternalBgDsl.g:1032:4: (lv_initialState_20_0= ruleState )
            // InternalBgDsl.g:1033:5: lv_initialState_20_0= ruleState
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
    // InternalBgDsl.g:1058:1: entryRuleLegalMovesPipeline returns [EObject current=null] : iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF ;
    public final EObject entryRuleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegalMovesPipeline = null;


        try {
            // InternalBgDsl.g:1058:59: (iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:1059:2: iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF
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
    // InternalBgDsl.g:1065:1: ruleLegalMovesPipeline returns [EObject current=null] : ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1071:2: ( ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1072:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1072:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1073:3: () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1073:3: ()
            // InternalBgDsl.g:1074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1088:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:1089:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1093:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1094:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1094:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:1095:6: lv_filter_4_0= ruleFilter
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
    // InternalBgDsl.g:1121:1: entryRuleEffectPipeline returns [EObject current=null] : iv_ruleEffectPipeline= ruleEffectPipeline EOF ;
    public final EObject entryRuleEffectPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectPipeline = null;


        try {
            // InternalBgDsl.g:1121:55: (iv_ruleEffectPipeline= ruleEffectPipeline EOF )
            // InternalBgDsl.g:1122:2: iv_ruleEffectPipeline= ruleEffectPipeline EOF
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
    // InternalBgDsl.g:1128:1: ruleEffectPipeline returns [EObject current=null] : ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEffectPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1134:2: ( ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1135:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1135:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1136:3: () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1136:3: ()
            // InternalBgDsl.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1151:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:1152:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1156:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1157:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1157:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:1158:6: lv_filter_4_0= ruleFilter
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
    // InternalBgDsl.g:1184:1: entryRuleTilePlacement returns [EObject current=null] : iv_ruleTilePlacement= ruleTilePlacement EOF ;
    public final EObject entryRuleTilePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTilePlacement = null;


        try {
            // InternalBgDsl.g:1184:54: (iv_ruleTilePlacement= ruleTilePlacement EOF )
            // InternalBgDsl.g:1185:2: iv_ruleTilePlacement= ruleTilePlacement EOF
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
    // InternalBgDsl.g:1191:1: ruleTilePlacement returns [EObject current=null] : (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalBgDsl.g:1197:2: ( (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalBgDsl.g:1198:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalBgDsl.g:1198:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalBgDsl.g:1199:3: otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTilePlacementAccess().getRowKeyword_2());
            		
            // InternalBgDsl.g:1211:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalBgDsl.g:1212:4: (lv_row_3_0= ruleEInt )
            {
            // InternalBgDsl.g:1212:4: (lv_row_3_0= ruleEInt )
            // InternalBgDsl.g:1213:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_4=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTilePlacementAccess().getColumnKeyword_4());
            		
            // InternalBgDsl.g:1234:3: ( (lv_column_5_0= ruleEInt ) )
            // InternalBgDsl.g:1235:4: (lv_column_5_0= ruleEInt )
            {
            // InternalBgDsl.g:1235:4: (lv_column_5_0= ruleEInt )
            // InternalBgDsl.g:1236:5: lv_column_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getColumnEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_6=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTilePlacementAccess().getTileKeyword_6());
            		
            // InternalBgDsl.g:1257:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1258:4: ( ruleEString )
            {
            // InternalBgDsl.g:1258:4: ( ruleEString )
            // InternalBgDsl.g:1259:5: ruleEString
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
    // InternalBgDsl.g:1281:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalBgDsl.g:1281:46: (iv_ruleState= ruleState EOF )
            // InternalBgDsl.g:1282:2: iv_ruleState= ruleState EOF
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
    // InternalBgDsl.g:1288:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
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
            // InternalBgDsl.g:1294:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalBgDsl.g:1295:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalBgDsl.g:1295:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalBgDsl.g:1296:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalBgDsl.g:1300:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1301:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1301:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1302:5: lv_name_1_0= ruleEString
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
            		
            // InternalBgDsl.g:1327:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:1328:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:1328:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:1329:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalBgDsl.g:1346:3: (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBgDsl.g:1347:4: otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getOutboundKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBgDsl.g:1355:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1356:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1356:5: ( ruleEString )
                    // InternalBgDsl.g:1357:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1371:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBgDsl.g:1372:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBgDsl.g:1376:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1377:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1377:6: ( ruleEString )
                    	    // InternalBgDsl.g:1378:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,47,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:1398:3: (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBgDsl.g:1399:4: otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getInboundKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBgDsl.g:1407:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1408:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1408:5: ( ruleEString )
                    // InternalBgDsl.g:1409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1423:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalBgDsl.g:1424:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getStateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBgDsl.g:1428:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1429:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1429:6: ( ruleEString )
                    	    // InternalBgDsl.g:1430:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,47,FOLLOW_13); 

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
    // InternalBgDsl.g:1458:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalBgDsl.g:1458:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalBgDsl.g:1459:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalBgDsl.g:1465:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalBgDsl.g:1471:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalBgDsl.g:1472:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalBgDsl.g:1472:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalBgDsl.g:1473:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalBgDsl.g:1477:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1478:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1478:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1479:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBgDsl.g:1508:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1509:4: ( ruleEString )
            {
            // InternalBgDsl.g:1509:4: ( ruleEString )
            // InternalBgDsl.g:1510:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1524:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBgDsl.g:1525:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBgDsl.g:1529:4: ( ( ruleEString ) )
            	    // InternalBgDsl.g:1530:5: ( ruleEString )
            	    {
            	    // InternalBgDsl.g:1530:5: ( ruleEString )
            	    // InternalBgDsl.g:1531:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,47,FOLLOW_46); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_8());
            		
            // InternalBgDsl.g:1554:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1555:4: ( ruleEString )
            {
            // InternalBgDsl.g:1555:4: ( ruleEString )
            // InternalBgDsl.g:1556:5: ruleEString
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


    // $ANTLR start "entryRuleSomeFilter1"
    // InternalBgDsl.g:1578:1: entryRuleSomeFilter1 returns [EObject current=null] : iv_ruleSomeFilter1= ruleSomeFilter1 EOF ;
    public final EObject entryRuleSomeFilter1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeFilter1 = null;


        try {
            // InternalBgDsl.g:1578:52: (iv_ruleSomeFilter1= ruleSomeFilter1 EOF )
            // InternalBgDsl.g:1579:2: iv_ruleSomeFilter1= ruleSomeFilter1 EOF
            {
             newCompositeNode(grammarAccess.getSomeFilter1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeFilter1=ruleSomeFilter1();

            state._fsp--;

             current =iv_ruleSomeFilter1; 
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
    // $ANTLR end "entryRuleSomeFilter1"


    // $ANTLR start "ruleSomeFilter1"
    // InternalBgDsl.g:1585:1: ruleSomeFilter1 returns [EObject current=null] : ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSomeFilter1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nextFilter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1591:2: ( ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1592:2: ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1592:2: ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1593:3: () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1593:3: ()
            // InternalBgDsl.g:1594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeFilter1Access().getSomeFilter1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSomeFilter1Access().getSomeFilter1Keyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeFilter1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1608:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBgDsl.g:1609:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSomeFilter1Access().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1613:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1614:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1614:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1615:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getSomeFilter1Access().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nextFilter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSomeFilter1Rule());
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSomeFilter1Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSomeFilter1"


    // $ANTLR start "entryRuleSomeFilter2"
    // InternalBgDsl.g:1641:1: entryRuleSomeFilter2 returns [EObject current=null] : iv_ruleSomeFilter2= ruleSomeFilter2 EOF ;
    public final EObject entryRuleSomeFilter2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeFilter2 = null;


        try {
            // InternalBgDsl.g:1641:52: (iv_ruleSomeFilter2= ruleSomeFilter2 EOF )
            // InternalBgDsl.g:1642:2: iv_ruleSomeFilter2= ruleSomeFilter2 EOF
            {
             newCompositeNode(grammarAccess.getSomeFilter2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeFilter2=ruleSomeFilter2();

            state._fsp--;

             current =iv_ruleSomeFilter2; 
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
    // $ANTLR end "entryRuleSomeFilter2"


    // $ANTLR start "ruleSomeFilter2"
    // InternalBgDsl.g:1648:1: ruleSomeFilter2 returns [EObject current=null] : ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSomeFilter2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nextFilter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1654:2: ( ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1655:2: ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1655:2: ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1656:3: () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1656:3: ()
            // InternalBgDsl.g:1657:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeFilter2Access().getSomeFilter2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSomeFilter2Access().getSomeFilter2Keyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeFilter2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1671:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBgDsl.g:1672:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSomeFilter2Access().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1676:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1677:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1677:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1678:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getSomeFilter2Access().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nextFilter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSomeFilter2Rule());
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSomeFilter2Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSomeFilter2"


    // $ANTLR start "ruleTurnType"
    // InternalBgDsl.g:1704:1: ruleTurnType returns [Enumerator current=null] : ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) ;
    public final Enumerator ruleTurnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1710:2: ( ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) )
            // InternalBgDsl.g:1711:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            {
            // InternalBgDsl.g:1711:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            else if ( (LA27_0==56) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalBgDsl.g:1712:3: (enumLiteral_0= 'TurnBased' )
                    {
                    // InternalBgDsl.g:1712:3: (enumLiteral_0= 'TurnBased' )
                    // InternalBgDsl.g:1713:4: enumLiteral_0= 'TurnBased'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1720:3: (enumLiteral_1= 'Simultaneous' )
                    {
                    // InternalBgDsl.g:1720:3: (enumLiteral_1= 'Simultaneous' )
                    // InternalBgDsl.g:1721:4: enumLiteral_1= 'Simultaneous'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001200000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000020000L});

}