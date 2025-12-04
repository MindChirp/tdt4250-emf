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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'initialPlayer'", "'board'", "'players'", "','", "'}'", "'turnPolicy'", "'checkered'", "'Board'", "'width'", "'height'", "'tiles'", "'legalMovesPipeline'", "'effectPipeline'", "'tileplacement'", "'Player'", "'hexColor'", "'associatedState'", "'TurnPolicy'", "'type'", "'-'", "'Tile'", "'name'", "'states'", "'transitions'", "'initialState'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'nextFilter'", "'patterns'", "'Pattern'", "'stateSelection'", "'matchState'", "'relativecoordinates'", "'RelativeCoordinate'", "'x'", "'y'", "'CurrentPlayer'", "'OtherPlayer'", "'StateBased'", "'TurnBased'", "'Simultaneous'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
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
    // InternalBgDsl.g:283:1: ruleFilter returns [EObject current=null] : this_PatternFilter_0= rulePatternFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_PatternFilter_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:289:2: (this_PatternFilter_0= rulePatternFilter )
            // InternalBgDsl.g:290:2: this_PatternFilter_0= rulePatternFilter
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
    // InternalBgDsl.g:301:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalBgDsl.g:301:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalBgDsl.g:302:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalBgDsl.g:308:1: ruleBoard returns [EObject current=null] : ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalBgDsl.g:314:2: ( ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalBgDsl.g:315:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalBgDsl.g:315:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalBgDsl.g:316:3: ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= 'tileplacement' otherlv_26= '{' ( (lv_tileplacement_27_0= ruleTilePlacement ) ) (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            // InternalBgDsl.g:316:3: ( (lv_checkered_0_0= 'checkered' ) )
            // InternalBgDsl.g:317:4: (lv_checkered_0_0= 'checkered' )
            {
            // InternalBgDsl.g:317:4: (lv_checkered_0_0= 'checkered' )
            // InternalBgDsl.g:318:5: lv_checkered_0_0= 'checkered'
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
            		
            // InternalBgDsl.g:342:3: ( (lv_width_4_0= ruleEInt ) )
            // InternalBgDsl.g:343:4: (lv_width_4_0= ruleEInt )
            {
            // InternalBgDsl.g:343:4: (lv_width_4_0= ruleEInt )
            // InternalBgDsl.g:344:5: lv_width_4_0= ruleEInt
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
            		
            // InternalBgDsl.g:365:3: ( (lv_height_6_0= ruleEInt ) )
            // InternalBgDsl.g:366:4: (lv_height_6_0= ruleEInt )
            {
            // InternalBgDsl.g:366:4: (lv_height_6_0= ruleEInt )
            // InternalBgDsl.g:367:5: lv_height_6_0= ruleEInt
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
            		
            // InternalBgDsl.g:392:3: ( (lv_tiles_9_0= ruleTile ) )
            // InternalBgDsl.g:393:4: (lv_tiles_9_0= ruleTile )
            {
            // InternalBgDsl.g:393:4: (lv_tiles_9_0= ruleTile )
            // InternalBgDsl.g:394:5: lv_tiles_9_0= ruleTile
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

            // InternalBgDsl.g:411:3: (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBgDsl.g:412:4: otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:416:4: ( (lv_tiles_11_0= ruleTile ) )
            	    // InternalBgDsl.g:417:5: (lv_tiles_11_0= ruleTile )
            	    {
            	    // InternalBgDsl.g:417:5: (lv_tiles_11_0= ruleTile )
            	    // InternalBgDsl.g:418:6: lv_tiles_11_0= ruleTile
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
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:440:3: (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBgDsl.g:441:4: otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:449:4: ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) )
                    // InternalBgDsl.g:450:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    {
                    // InternalBgDsl.g:450:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    // InternalBgDsl.g:451:6: lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline
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

                    // InternalBgDsl.g:468:4: (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBgDsl.g:469:5: otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:473:5: ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    // InternalBgDsl.g:474:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    {
                    	    // InternalBgDsl.g:474:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    // InternalBgDsl.g:475:7: lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:498:3: (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBgDsl.g:499:4: otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalBgDsl.g:507:4: ( (lv_effectPipeline_21_0= ruleEffectPipeline ) )
                    // InternalBgDsl.g:508:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    {
                    // InternalBgDsl.g:508:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    // InternalBgDsl.g:509:6: lv_effectPipeline_21_0= ruleEffectPipeline
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

                    // InternalBgDsl.g:526:4: (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBgDsl.g:527:5: otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalBgDsl.g:531:5: ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    // InternalBgDsl.g:532:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    {
                    	    // InternalBgDsl.g:532:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    // InternalBgDsl.g:533:7: lv_effectPipeline_23_0= ruleEffectPipeline
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
                    	    break loop9;
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
            		
            // InternalBgDsl.g:564:3: ( (lv_tileplacement_27_0= ruleTilePlacement ) )
            // InternalBgDsl.g:565:4: (lv_tileplacement_27_0= ruleTilePlacement )
            {
            // InternalBgDsl.g:565:4: (lv_tileplacement_27_0= ruleTilePlacement )
            // InternalBgDsl.g:566:5: lv_tileplacement_27_0= ruleTilePlacement
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

            // InternalBgDsl.g:583:3: (otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBgDsl.g:584:4: otherlv_28= ',' ( (lv_tileplacement_29_0= ruleTilePlacement ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_28, grammarAccess.getBoardAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalBgDsl.g:588:4: ( (lv_tileplacement_29_0= ruleTilePlacement ) )
            	    // InternalBgDsl.g:589:5: (lv_tileplacement_29_0= ruleTilePlacement )
            	    {
            	    // InternalBgDsl.g:589:5: (lv_tileplacement_29_0= ruleTilePlacement )
            	    // InternalBgDsl.g:590:6: lv_tileplacement_29_0= ruleTilePlacement
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
            	    break loop11;
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
    // InternalBgDsl.g:620:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBgDsl.g:620:47: (iv_ruleEString= ruleEString EOF )
            // InternalBgDsl.g:621:2: iv_ruleEString= ruleEString EOF
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
    // InternalBgDsl.g:627:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:633:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBgDsl.g:634:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBgDsl.g:634:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBgDsl.g:635:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:643:3: this_ID_1= RULE_ID
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
    // InternalBgDsl.g:654:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalBgDsl.g:654:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalBgDsl.g:655:2: iv_rulePlayer= rulePlayer EOF
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
    // InternalBgDsl.g:661:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalBgDsl.g:667:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalBgDsl.g:668:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalBgDsl.g:668:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalBgDsl.g:669:3: otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'associatedState' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalBgDsl.g:673:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:674:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:674:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:675:5: lv_name_1_0= ruleEString
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
            		
            // InternalBgDsl.g:700:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:701:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:701:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:702:5: lv_hexColor_4_0= ruleEString
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
            		
            // InternalBgDsl.g:723:3: ( ( ruleEString ) )
            // InternalBgDsl.g:724:4: ( ruleEString )
            {
            // InternalBgDsl.g:724:4: ( ruleEString )
            // InternalBgDsl.g:725:5: ruleEString
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


    // $ANTLR start "entryRuleTurnPolicy"
    // InternalBgDsl.g:747:1: entryRuleTurnPolicy returns [EObject current=null] : iv_ruleTurnPolicy= ruleTurnPolicy EOF ;
    public final EObject entryRuleTurnPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnPolicy = null;


        try {
            // InternalBgDsl.g:747:51: (iv_ruleTurnPolicy= ruleTurnPolicy EOF )
            // InternalBgDsl.g:748:2: iv_ruleTurnPolicy= ruleTurnPolicy EOF
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
    // InternalBgDsl.g:754:1: ruleTurnPolicy returns [EObject current=null] : (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) ;
    public final EObject ruleTurnPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:760:2: ( (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) )
            // InternalBgDsl.g:761:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            {
            // InternalBgDsl.g:761:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            // InternalBgDsl.g:762:3: otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnPolicyAccess().getTypeKeyword_2());
            		
            // InternalBgDsl.g:774:3: ( (lv_type_3_0= ruleTurnType ) )
            // InternalBgDsl.g:775:4: (lv_type_3_0= ruleTurnType )
            {
            // InternalBgDsl.g:775:4: (lv_type_3_0= ruleTurnType )
            // InternalBgDsl.g:776:5: lv_type_3_0= ruleTurnType
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
    // InternalBgDsl.g:801:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBgDsl.g:801:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBgDsl.g:802:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBgDsl.g:808:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:814:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBgDsl.g:815:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBgDsl.g:815:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBgDsl.g:816:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBgDsl.g:816:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:817:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_30); 

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
    // InternalBgDsl.g:834:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalBgDsl.g:834:45: (iv_ruleTile= ruleTile EOF )
            // InternalBgDsl.g:835:2: iv_ruleTile= ruleTile EOF
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
    // InternalBgDsl.g:841:1: ruleTile returns [EObject current=null] : (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) ;
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
            // InternalBgDsl.g:847:2: ( (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' ) )
            // InternalBgDsl.g:848:2: (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            {
            // InternalBgDsl.g:848:2: (otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}' )
            // InternalBgDsl.g:849:3: otherlv_0= 'Tile' ( (lv_type_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'states' otherlv_8= '{' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* otherlv_12= '}' (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )? otherlv_19= 'initialState' ( (lv_initialState_20_0= ruleState ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTileAccess().getTileKeyword_0());
            		
            // InternalBgDsl.g:853:3: ( (lv_type_1_0= ruleEString ) )
            // InternalBgDsl.g:854:4: (lv_type_1_0= ruleEString )
            {
            // InternalBgDsl.g:854:4: (lv_type_1_0= ruleEString )
            // InternalBgDsl.g:855:5: lv_type_1_0= ruleEString
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
            		
            // InternalBgDsl.g:880:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:881:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:881:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:882:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_5=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTileAccess().getNameKeyword_5());
            		
            // InternalBgDsl.g:903:3: ( (lv_name_6_0= ruleEString ) )
            // InternalBgDsl.g:904:4: (lv_name_6_0= ruleEString )
            {
            // InternalBgDsl.g:904:4: (lv_name_6_0= ruleEString )
            // InternalBgDsl.g:905:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_7=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTileAccess().getStatesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBgDsl.g:930:3: ( (lv_states_9_0= ruleState ) )
            // InternalBgDsl.g:931:4: (lv_states_9_0= ruleState )
            {
            // InternalBgDsl.g:931:4: (lv_states_9_0= ruleState )
            // InternalBgDsl.g:932:5: lv_states_9_0= ruleState
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

            // InternalBgDsl.g:949:3: (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBgDsl.g:950:4: otherlv_10= ',' ( (lv_states_11_0= ruleState ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTileAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:954:4: ( (lv_states_11_0= ruleState ) )
            	    // InternalBgDsl.g:955:5: (lv_states_11_0= ruleState )
            	    {
            	    // InternalBgDsl.g:955:5: (lv_states_11_0= ruleState )
            	    // InternalBgDsl.g:956:6: lv_states_11_0= ruleState
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
            	    break loop14;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_12, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:978:3: (otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:979:4: otherlv_13= 'transitions' otherlv_14= '{' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getTileAccess().getTransitionsKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:987:4: ( (lv_transitions_15_0= ruleTransition ) )
                    // InternalBgDsl.g:988:5: (lv_transitions_15_0= ruleTransition )
                    {
                    // InternalBgDsl.g:988:5: (lv_transitions_15_0= ruleTransition )
                    // InternalBgDsl.g:989:6: lv_transitions_15_0= ruleTransition
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

                    // InternalBgDsl.g:1006:4: (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBgDsl.g:1007:5: otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_35); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTileAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:1011:5: ( (lv_transitions_17_0= ruleTransition ) )
                    	    // InternalBgDsl.g:1012:6: (lv_transitions_17_0= ruleTransition )
                    	    {
                    	    // InternalBgDsl.g:1012:6: (lv_transitions_17_0= ruleTransition )
                    	    // InternalBgDsl.g:1013:7: lv_transitions_17_0= ruleTransition
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_36); 

                    				newLeafNode(otherlv_18, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_19, grammarAccess.getTileAccess().getInitialStateKeyword_13());
            		
            // InternalBgDsl.g:1040:3: ( (lv_initialState_20_0= ruleState ) )
            // InternalBgDsl.g:1041:4: (lv_initialState_20_0= ruleState )
            {
            // InternalBgDsl.g:1041:4: (lv_initialState_20_0= ruleState )
            // InternalBgDsl.g:1042:5: lv_initialState_20_0= ruleState
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
    // InternalBgDsl.g:1067:1: entryRuleLegalMovesPipeline returns [EObject current=null] : iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF ;
    public final EObject entryRuleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegalMovesPipeline = null;


        try {
            // InternalBgDsl.g:1067:59: (iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:1068:2: iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF
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
    // InternalBgDsl.g:1074:1: ruleLegalMovesPipeline returns [EObject current=null] : ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1080:2: ( ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1081:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1081:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1082:3: () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1082:3: ()
            // InternalBgDsl.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1097:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBgDsl.g:1098:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1102:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1103:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1103:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:1104:6: lv_filter_4_0= ruleFilter
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
    // InternalBgDsl.g:1130:1: entryRuleEffectPipeline returns [EObject current=null] : iv_ruleEffectPipeline= ruleEffectPipeline EOF ;
    public final EObject entryRuleEffectPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectPipeline = null;


        try {
            // InternalBgDsl.g:1130:55: (iv_ruleEffectPipeline= ruleEffectPipeline EOF )
            // InternalBgDsl.g:1131:2: iv_ruleEffectPipeline= ruleEffectPipeline EOF
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
    // InternalBgDsl.g:1137:1: ruleEffectPipeline returns [EObject current=null] : ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEffectPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1143:2: ( ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1144:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1144:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1145:3: () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1145:3: ()
            // InternalBgDsl.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1160:3: (otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:1161:4: otherlv_3= 'filter' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1165:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1166:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1166:5: (lv_filter_4_0= ruleFilter )
                    // InternalBgDsl.g:1167:6: lv_filter_4_0= ruleFilter
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
    // InternalBgDsl.g:1193:1: entryRuleTilePlacement returns [EObject current=null] : iv_ruleTilePlacement= ruleTilePlacement EOF ;
    public final EObject entryRuleTilePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTilePlacement = null;


        try {
            // InternalBgDsl.g:1193:54: (iv_ruleTilePlacement= ruleTilePlacement EOF )
            // InternalBgDsl.g:1194:2: iv_ruleTilePlacement= ruleTilePlacement EOF
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
    // InternalBgDsl.g:1200:1: ruleTilePlacement returns [EObject current=null] : (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalBgDsl.g:1206:2: ( (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalBgDsl.g:1207:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalBgDsl.g:1207:2: (otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalBgDsl.g:1208:3: otherlv_0= 'TilePlacement' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'column' ( (lv_column_5_0= ruleEInt ) ) otherlv_6= 'tile' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTilePlacementAccess().getRowKeyword_2());
            		
            // InternalBgDsl.g:1220:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalBgDsl.g:1221:4: (lv_row_3_0= ruleEInt )
            {
            // InternalBgDsl.g:1221:4: (lv_row_3_0= ruleEInt )
            // InternalBgDsl.g:1222:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_4=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTilePlacementAccess().getColumnKeyword_4());
            		
            // InternalBgDsl.g:1243:3: ( (lv_column_5_0= ruleEInt ) )
            // InternalBgDsl.g:1244:4: (lv_column_5_0= ruleEInt )
            {
            // InternalBgDsl.g:1244:4: (lv_column_5_0= ruleEInt )
            // InternalBgDsl.g:1245:5: lv_column_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTilePlacementAccess().getColumnEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_6=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTilePlacementAccess().getTileKeyword_6());
            		
            // InternalBgDsl.g:1266:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1267:4: ( ruleEString )
            {
            // InternalBgDsl.g:1267:4: ( ruleEString )
            // InternalBgDsl.g:1268:5: ruleEString
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
    // InternalBgDsl.g:1290:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalBgDsl.g:1290:46: (iv_ruleState= ruleState EOF )
            // InternalBgDsl.g:1291:2: iv_ruleState= ruleState EOF
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
    // InternalBgDsl.g:1297:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
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
            // InternalBgDsl.g:1303:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalBgDsl.g:1304:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalBgDsl.g:1304:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalBgDsl.g:1305:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalBgDsl.g:1309:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1310:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1310:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1311:5: lv_name_1_0= ruleEString
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
            		
            // InternalBgDsl.g:1336:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:1337:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:1337:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:1338:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalBgDsl.g:1355:3: (otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBgDsl.g:1356:4: otherlv_5= 'outbound' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getOutboundKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBgDsl.g:1364:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1365:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1365:5: ( ruleEString )
                    // InternalBgDsl.g:1366:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1380:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalBgDsl.g:1381:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBgDsl.g:1385:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1386:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1386:6: ( ruleEString )
                    	    // InternalBgDsl.g:1387:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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

                    otherlv_10=(Token)match(input,48,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:1407:3: (otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBgDsl.g:1408:4: otherlv_11= 'inbound' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getInboundKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBgDsl.g:1416:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1417:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1417:5: ( ruleEString )
                    // InternalBgDsl.g:1418:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:1432:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBgDsl.g:1433:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getStateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBgDsl.g:1437:5: ( ( ruleEString ) )
                    	    // InternalBgDsl.g:1438:6: ( ruleEString )
                    	    {
                    	    // InternalBgDsl.g:1438:6: ( ruleEString )
                    	    // InternalBgDsl.g:1439:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,48,FOLLOW_13); 

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
    // InternalBgDsl.g:1467:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalBgDsl.g:1467:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalBgDsl.g:1468:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalBgDsl.g:1474:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalBgDsl.g:1480:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalBgDsl.g:1481:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalBgDsl.g:1481:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalBgDsl.g:1482:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalBgDsl.g:1486:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1487:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1487:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1488:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBgDsl.g:1517:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1518:4: ( ruleEString )
            {
            // InternalBgDsl.g:1518:4: ( ruleEString )
            // InternalBgDsl.g:1519:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1533:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBgDsl.g:1534:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBgDsl.g:1538:4: ( ( ruleEString ) )
            	    // InternalBgDsl.g:1539:5: ( ruleEString )
            	    {
            	    // InternalBgDsl.g:1539:5: ( ruleEString )
            	    // InternalBgDsl.g:1540:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_8());
            		
            // InternalBgDsl.g:1563:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1564:4: ( ruleEString )
            {
            // InternalBgDsl.g:1564:4: ( ruleEString )
            // InternalBgDsl.g:1565:5: ruleEString
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
    // InternalBgDsl.g:1587:1: entryRulePatternFilter returns [EObject current=null] : iv_rulePatternFilter= rulePatternFilter EOF ;
    public final EObject entryRulePatternFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFilter = null;


        try {
            // InternalBgDsl.g:1587:54: (iv_rulePatternFilter= rulePatternFilter EOF )
            // InternalBgDsl.g:1588:2: iv_rulePatternFilter= rulePatternFilter EOF
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
    // InternalBgDsl.g:1594:1: rulePatternFilter returns [EObject current=null] : (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
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
            // InternalBgDsl.g:1600:2: ( (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalBgDsl.g:1601:2: (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalBgDsl.g:1601:2: (otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalBgDsl.g:1602:3: otherlv_0= 'PatternFilter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= 'patterns' otherlv_6= '{' ( (lv_patterns_7_0= rulePattern ) ) (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_0());
            		
            // InternalBgDsl.g:1606:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1607:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1607:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1608:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1629:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBgDsl.g:1630:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternFilterAccess().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1634:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1635:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1635:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1636:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            otherlv_5=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternFilterAccess().getPatternsKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_6, grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBgDsl.g:1662:3: ( (lv_patterns_7_0= rulePattern ) )
            // InternalBgDsl.g:1663:4: (lv_patterns_7_0= rulePattern )
            {
            // InternalBgDsl.g:1663:4: (lv_patterns_7_0= rulePattern )
            // InternalBgDsl.g:1664:5: lv_patterns_7_0= rulePattern
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

            // InternalBgDsl.g:1681:3: (otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBgDsl.g:1682:4: otherlv_8= ',' ( (lv_patterns_9_0= rulePattern ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_50); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPatternFilterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBgDsl.g:1686:4: ( (lv_patterns_9_0= rulePattern ) )
            	    // InternalBgDsl.g:1687:5: (lv_patterns_9_0= rulePattern )
            	    {
            	    // InternalBgDsl.g:1687:5: (lv_patterns_9_0= rulePattern )
            	    // InternalBgDsl.g:1688:6: lv_patterns_9_0= rulePattern
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
            	    break loop25;
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
    // InternalBgDsl.g:1718:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalBgDsl.g:1718:48: (iv_rulePattern= rulePattern EOF )
            // InternalBgDsl.g:1719:2: iv_rulePattern= rulePattern EOF
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
    // InternalBgDsl.g:1725:1: rulePattern returns [EObject current=null] : (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' ) ;
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
            // InternalBgDsl.g:1731:2: ( (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalBgDsl.g:1732:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalBgDsl.g:1732:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalBgDsl.g:1733:3: otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )? (otherlv_5= 'matchState' ( ( ruleEString ) ) )? otherlv_7= 'relativecoordinates' otherlv_8= '{' ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) ) (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalBgDsl.g:1737:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:1738:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:1738:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:1739:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1760:3: (otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBgDsl.g:1761:4: otherlv_3= 'stateSelection' ( (lv_stateSelection_4_0= ruleStateSelection ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0());
                    			
                    // InternalBgDsl.g:1765:4: ( (lv_stateSelection_4_0= ruleStateSelection ) )
                    // InternalBgDsl.g:1766:5: (lv_stateSelection_4_0= ruleStateSelection )
                    {
                    // InternalBgDsl.g:1766:5: (lv_stateSelection_4_0= ruleStateSelection )
                    // InternalBgDsl.g:1767:6: lv_stateSelection_4_0= ruleStateSelection
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getStateSelectionStateSelectionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalBgDsl.g:1785:3: (otherlv_5= 'matchState' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBgDsl.g:1786:4: otherlv_5= 'matchState' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getMatchStateKeyword_4_0());
                    			
                    // InternalBgDsl.g:1790:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:1791:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:1791:5: ( ruleEString )
                    // InternalBgDsl.g:1792:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBgDsl.g:1815:3: ( (lv_relativecoordinates_9_0= ruleRelativeCoordinate ) )
            // InternalBgDsl.g:1816:4: (lv_relativecoordinates_9_0= ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:1816:4: (lv_relativecoordinates_9_0= ruleRelativeCoordinate )
            // InternalBgDsl.g:1817:5: lv_relativecoordinates_9_0= ruleRelativeCoordinate
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

            // InternalBgDsl.g:1834:3: (otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBgDsl.g:1835:4: otherlv_10= ',' ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_55); 

            	    				newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBgDsl.g:1839:4: ( (lv_relativecoordinates_11_0= ruleRelativeCoordinate ) )
            	    // InternalBgDsl.g:1840:5: (lv_relativecoordinates_11_0= ruleRelativeCoordinate )
            	    {
            	    // InternalBgDsl.g:1840:5: (lv_relativecoordinates_11_0= ruleRelativeCoordinate )
            	    // InternalBgDsl.g:1841:6: lv_relativecoordinates_11_0= ruleRelativeCoordinate
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
            	    break loop28;
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
    // InternalBgDsl.g:1871:1: entryRuleRelativeCoordinate returns [EObject current=null] : iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF ;
    public final EObject entryRuleRelativeCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeCoordinate = null;


        try {
            // InternalBgDsl.g:1871:59: (iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF )
            // InternalBgDsl.g:1872:2: iv_ruleRelativeCoordinate= ruleRelativeCoordinate EOF
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
    // InternalBgDsl.g:1878:1: ruleRelativeCoordinate returns [EObject current=null] : (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
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
            // InternalBgDsl.g:1884:2: ( (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalBgDsl.g:1885:2: (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalBgDsl.g:1885:2: (otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalBgDsl.g:1886:3: otherlv_0= 'RelativeCoordinate' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeCoordinateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeCoordinateAccess().getXKeyword_2());
            		
            // InternalBgDsl.g:1898:3: ( (lv_x_3_0= ruleEInt ) )
            // InternalBgDsl.g:1899:4: (lv_x_3_0= ruleEInt )
            {
            // InternalBgDsl.g:1899:4: (lv_x_3_0= ruleEInt )
            // InternalBgDsl.g:1900:5: lv_x_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRelativeCoordinateAccess().getXEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_4=(Token)match(input,62,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRelativeCoordinateAccess().getYKeyword_4());
            		
            // InternalBgDsl.g:1921:3: ( (lv_y_5_0= ruleEInt ) )
            // InternalBgDsl.g:1922:4: (lv_y_5_0= ruleEInt )
            {
            // InternalBgDsl.g:1922:4: (lv_y_5_0= ruleEInt )
            // InternalBgDsl.g:1923:5: lv_y_5_0= ruleEInt
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
    // InternalBgDsl.g:1948:1: ruleStateSelection returns [Enumerator current=null] : ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) ) ;
    public final Enumerator ruleStateSelection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1954:2: ( ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) ) )
            // InternalBgDsl.g:1955:2: ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) )
            {
            // InternalBgDsl.g:1955:2: ( (enumLiteral_0= 'CurrentPlayer' ) | (enumLiteral_1= 'OtherPlayer' ) | (enumLiteral_2= 'StateBased' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt29=1;
                }
                break;
            case 64:
                {
                alt29=2;
                }
                break;
            case 65:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalBgDsl.g:1956:3: (enumLiteral_0= 'CurrentPlayer' )
                    {
                    // InternalBgDsl.g:1956:3: (enumLiteral_0= 'CurrentPlayer' )
                    // InternalBgDsl.g:1957:4: enumLiteral_0= 'CurrentPlayer'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1964:3: (enumLiteral_1= 'OtherPlayer' )
                    {
                    // InternalBgDsl.g:1964:3: (enumLiteral_1= 'OtherPlayer' )
                    // InternalBgDsl.g:1965:4: enumLiteral_1= 'OtherPlayer'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:1972:3: (enumLiteral_2= 'StateBased' )
                    {
                    // InternalBgDsl.g:1972:3: (enumLiteral_2= 'StateBased' )
                    // InternalBgDsl.g:1973:4: enumLiteral_2= 'StateBased'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

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
    // InternalBgDsl.g:1983:1: ruleTurnType returns [Enumerator current=null] : ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) ;
    public final Enumerator ruleTurnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1989:2: ( ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) )
            // InternalBgDsl.g:1990:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            {
            // InternalBgDsl.g:1990:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            else if ( (LA30_0==67) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalBgDsl.g:1991:3: (enumLiteral_0= 'TurnBased' )
                    {
                    // InternalBgDsl.g:1991:3: (enumLiteral_0= 'TurnBased' )
                    // InternalBgDsl.g:1992:4: enumLiteral_0= 'TurnBased'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1999:3: (enumLiteral_1= 'Simultaneous' )
                    {
                    // InternalBgDsl.g:1999:3: (enumLiteral_1= 'Simultaneous' )
                    // InternalBgDsl.g:2000:4: enumLiteral_1= 'Simultaneous'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002400000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000000L});

}