package no.ntnu.tdt4250.bgdsl.parser.antlr.internal;

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
import no.ntnu.tdt4250.bgdsl.services.BgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBgDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Player'", "'TurnPolicy'", "'{'", "'type'", "'}'", "'checkered'", "'Board'", "'width'", "'height'", "'tiles'", "','", "'legalMovesPipeline'", "'effectPipeline'", "'-'", "'Tile'", "'row'", "'col'", "'color'", "'states'", "'transitions'", "'initialState'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'State'", "'hexColor'", "'outbound'", "'inbound'", "'Transition'", "'source'", "'('", "')'", "'target'", "'SomeFilter1'", "'nextFilter'", "'SomeFilter2'", "'TurnBased'", "'Simultaneous'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
        	return "Player";
       	}

       	@Override
       	protected BgDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlayer"
    // InternalBgDsl.g:65:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalBgDsl.g:65:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalBgDsl.g:66:2: iv_rulePlayer= rulePlayer EOF
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
    // InternalBgDsl.g:72:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:78:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBgDsl.g:79:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBgDsl.g:79:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) )
            // InternalBgDsl.g:80:3: otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalBgDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalBgDsl.g:107:1: entryRuleTurnPolicy returns [EObject current=null] : iv_ruleTurnPolicy= ruleTurnPolicy EOF ;
    public final EObject entryRuleTurnPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnPolicy = null;


        try {
            // InternalBgDsl.g:107:51: (iv_ruleTurnPolicy= ruleTurnPolicy EOF )
            // InternalBgDsl.g:108:2: iv_ruleTurnPolicy= ruleTurnPolicy EOF
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
    // InternalBgDsl.g:114:1: ruleTurnPolicy returns [EObject current=null] : (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) ;
    public final EObject ruleTurnPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:120:2: ( (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' ) )
            // InternalBgDsl.g:121:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            {
            // InternalBgDsl.g:121:2: (otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}' )
            // InternalBgDsl.g:122:3: otherlv_0= 'TurnPolicy' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleTurnType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnPolicyAccess().getTypeKeyword_2());
            		
            // InternalBgDsl.g:134:3: ( (lv_type_3_0= ruleTurnType ) )
            // InternalBgDsl.g:135:4: (lv_type_3_0= ruleTurnType )
            {
            // InternalBgDsl.g:135:4: (lv_type_3_0= ruleTurnType )
            // InternalBgDsl.g:136:5: lv_type_3_0= ruleTurnType
            {

            					newCompositeNode(grammarAccess.getTurnPolicyAccess().getTypeTurnTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_3_0=ruleTurnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnPolicyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.TurnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBoard"
    // InternalBgDsl.g:161:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalBgDsl.g:161:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalBgDsl.g:162:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalBgDsl.g:168:1: ruleBoard returns [EObject current=null] : ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
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
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_height_6_0 = null;

        EObject lv_tiles_9_0 = null;

        EObject lv_tiles_11_0 = null;

        EObject lv_legalMovesPipeline_15_0 = null;

        EObject lv_legalMovesPipeline_17_0 = null;

        EObject lv_effectPipeline_21_0 = null;

        EObject lv_effectPipeline_23_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:174:2: ( ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalBgDsl.g:175:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalBgDsl.g:175:2: ( ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalBgDsl.g:176:3: ( (lv_checkered_0_0= 'checkered' ) ) otherlv_1= 'Board' otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) otherlv_5= 'height' ( (lv_height_6_0= ruleEInt ) ) otherlv_7= 'tiles' otherlv_8= '{' ( (lv_tiles_9_0= ruleTile ) ) (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )* otherlv_12= '}' (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )? (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalBgDsl.g:176:3: ( (lv_checkered_0_0= 'checkered' ) )
            // InternalBgDsl.g:177:4: (lv_checkered_0_0= 'checkered' )
            {
            // InternalBgDsl.g:177:4: (lv_checkered_0_0= 'checkered' )
            // InternalBgDsl.g:178:5: lv_checkered_0_0= 'checkered'
            {
            lv_checkered_0_0=(Token)match(input,16,FOLLOW_8); 

            					newLeafNode(lv_checkered_0_0, grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(current, "checkered", lv_checkered_0_0 != null, "checkered");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getBoardKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getWidthKeyword_3());
            		
            // InternalBgDsl.g:202:3: ( (lv_width_4_0= ruleEInt ) )
            // InternalBgDsl.g:203:4: (lv_width_4_0= ruleEInt )
            {
            // InternalBgDsl.g:203:4: (lv_width_4_0= ruleEInt )
            // InternalBgDsl.g:204:5: lv_width_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_width_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_4_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getHeightKeyword_5());
            		
            // InternalBgDsl.g:225:3: ( (lv_height_6_0= ruleEInt ) )
            // InternalBgDsl.g:226:4: (lv_height_6_0= ruleEInt )
            {
            // InternalBgDsl.g:226:4: (lv_height_6_0= ruleEInt )
            // InternalBgDsl.g:227:5: lv_height_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_height_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_6_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getTilesKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBgDsl.g:252:3: ( (lv_tiles_9_0= ruleTile ) )
            // InternalBgDsl.g:253:4: (lv_tiles_9_0= ruleTile )
            {
            // InternalBgDsl.g:253:4: (lv_tiles_9_0= ruleTile )
            // InternalBgDsl.g:254:5: lv_tiles_9_0= ruleTile
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_tiles_9_0=ruleTile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"tiles",
            						lv_tiles_9_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.Tile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:271:3: (otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBgDsl.g:272:4: otherlv_10= ',' ( (lv_tiles_11_0= ruleTile ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_13); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalBgDsl.g:276:4: ( (lv_tiles_11_0= ruleTile ) )
            	    // InternalBgDsl.g:277:5: (lv_tiles_11_0= ruleTile )
            	    {
            	    // InternalBgDsl.g:277:5: (lv_tiles_11_0= ruleTile )
            	    // InternalBgDsl.g:278:6: lv_tiles_11_0= ruleTile
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_tiles_11_0=ruleTile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tiles",
            	    							lv_tiles_11_0,
            	    							"no.ntnu.tdt4250.bgdsl.BgDsl.Tile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalBgDsl.g:300:3: (otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBgDsl.g:301:4: otherlv_13= 'legalMovesPipeline' otherlv_14= '{' ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) ) (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalBgDsl.g:309:4: ( (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline ) )
                    // InternalBgDsl.g:310:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    {
                    // InternalBgDsl.g:310:5: (lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline )
                    // InternalBgDsl.g:311:6: lv_legalMovesPipeline_15_0= ruleLegalMovesPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_legalMovesPipeline_15_0=ruleLegalMovesPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						add(
                    							current,
                    							"legalMovesPipeline",
                    							lv_legalMovesPipeline_15_0,
                    							"no.ntnu.tdt4250.bgdsl.BgDsl.LegalMovesPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:328:4: (otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBgDsl.g:329:5: otherlv_16= ',' ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_16); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalBgDsl.g:333:5: ( (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline ) )
                    	    // InternalBgDsl.g:334:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    {
                    	    // InternalBgDsl.g:334:6: (lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline )
                    	    // InternalBgDsl.g:335:7: lv_legalMovesPipeline_17_0= ruleLegalMovesPipeline
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_legalMovesPipeline_17_0=ruleLegalMovesPipeline();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"legalMovesPipeline",
                    	    								lv_legalMovesPipeline_17_0,
                    	    								"no.ntnu.tdt4250.bgdsl.BgDsl.LegalMovesPipeline");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalBgDsl.g:358:3: (otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:359:4: otherlv_19= 'effectPipeline' otherlv_20= '{' ( (lv_effectPipeline_21_0= ruleEffectPipeline ) ) (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalBgDsl.g:367:4: ( (lv_effectPipeline_21_0= ruleEffectPipeline ) )
                    // InternalBgDsl.g:368:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    {
                    // InternalBgDsl.g:368:5: (lv_effectPipeline_21_0= ruleEffectPipeline )
                    // InternalBgDsl.g:369:6: lv_effectPipeline_21_0= ruleEffectPipeline
                    {

                    						newCompositeNode(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_effectPipeline_21_0=ruleEffectPipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardRule());
                    						}
                    						add(
                    							current,
                    							"effectPipeline",
                    							lv_effectPipeline_21_0,
                    							"no.ntnu.tdt4250.bgdsl.BgDsl.EffectPipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:386:4: (otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBgDsl.g:387:5: otherlv_22= ',' ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    {
                    	    otherlv_22=(Token)match(input,21,FOLLOW_18); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalBgDsl.g:391:5: ( (lv_effectPipeline_23_0= ruleEffectPipeline ) )
                    	    // InternalBgDsl.g:392:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    {
                    	    // InternalBgDsl.g:392:6: (lv_effectPipeline_23_0= ruleEffectPipeline )
                    	    // InternalBgDsl.g:393:7: lv_effectPipeline_23_0= ruleEffectPipeline
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_effectPipeline_23_0=ruleEffectPipeline();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectPipeline",
                    	    								lv_effectPipeline_23_0,
                    	    								"no.ntnu.tdt4250.bgdsl.BgDsl.EffectPipeline");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_24, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleFilter"
    // InternalBgDsl.g:424:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalBgDsl.g:424:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalBgDsl.g:425:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalBgDsl.g:431:1: ruleFilter returns [EObject current=null] : (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_SomeFilter1_0 = null;

        EObject this_SomeFilter2_1 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:437:2: ( (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 ) )
            // InternalBgDsl.g:438:2: (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 )
            {
            // InternalBgDsl.g:438:2: (this_SomeFilter1_0= ruleSomeFilter1 | this_SomeFilter2_1= ruleSomeFilter2 )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==46) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBgDsl.g:439:3: this_SomeFilter1_0= ruleSomeFilter1
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
                    // InternalBgDsl.g:448:3: this_SomeFilter2_1= ruleSomeFilter2
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


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:460:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBgDsl.g:460:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBgDsl.g:461:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBgDsl.g:467:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:473:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBgDsl.g:474:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBgDsl.g:474:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBgDsl.g:475:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBgDsl.g:475:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBgDsl.g:476:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

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
    // InternalBgDsl.g:493:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalBgDsl.g:493:45: (iv_ruleTile= ruleTile EOF )
            // InternalBgDsl.g:494:2: iv_ruleTile= ruleTile EOF
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
    // InternalBgDsl.g:500:1: ruleTile returns [EObject current=null] : (otherlv_0= 'Tile' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* otherlv_13= '}' (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= 'initialState' ( (lv_initialState_21_0= ruleState ) ) otherlv_22= '}' ) ;
    public final EObject ruleTile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_col_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_transitions_16_0 = null;

        EObject lv_transitions_18_0 = null;

        EObject lv_initialState_21_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:506:2: ( (otherlv_0= 'Tile' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* otherlv_13= '}' (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= 'initialState' ( (lv_initialState_21_0= ruleState ) ) otherlv_22= '}' ) )
            // InternalBgDsl.g:507:2: (otherlv_0= 'Tile' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* otherlv_13= '}' (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= 'initialState' ( (lv_initialState_21_0= ruleState ) ) otherlv_22= '}' )
            {
            // InternalBgDsl.g:507:2: (otherlv_0= 'Tile' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* otherlv_13= '}' (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= 'initialState' ( (lv_initialState_21_0= ruleState ) ) otherlv_22= '}' )
            // InternalBgDsl.g:508:3: otherlv_0= 'Tile' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* otherlv_13= '}' (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= 'initialState' ( (lv_initialState_21_0= ruleState ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTileAccess().getTileKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTileAccess().getRowKeyword_2());
            		
            // InternalBgDsl.g:520:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalBgDsl.g:521:4: (lv_row_3_0= ruleEInt )
            {
            // InternalBgDsl.g:521:4: (lv_row_3_0= ruleEInt )
            // InternalBgDsl.g:522:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTileAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_row_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"row",
            						lv_row_3_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTileAccess().getColKeyword_4());
            		
            // InternalBgDsl.g:543:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalBgDsl.g:544:4: (lv_col_5_0= ruleEInt )
            {
            // InternalBgDsl.g:544:4: (lv_col_5_0= ruleEInt )
            // InternalBgDsl.g:545:5: lv_col_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTileAccess().getColEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_col_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"col",
            						lv_col_5_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTileAccess().getColorKeyword_6());
            		
            // InternalBgDsl.g:566:3: ( (lv_color_7_0= ruleEString ) )
            // InternalBgDsl.g:567:4: (lv_color_7_0= ruleEString )
            {
            // InternalBgDsl.g:567:4: (lv_color_7_0= ruleEString )
            // InternalBgDsl.g:568:5: lv_color_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_color_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getTileAccess().getStatesKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalBgDsl.g:593:3: ( (lv_states_10_0= ruleState ) )
            // InternalBgDsl.g:594:4: (lv_states_10_0= ruleState )
            {
            // InternalBgDsl.g:594:4: (lv_states_10_0= ruleState )
            // InternalBgDsl.g:595:5: lv_states_10_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_states_10_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_10_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:612:3: (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBgDsl.g:613:4: otherlv_11= ',' ( (lv_states_12_0= ruleState ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_11, grammarAccess.getTileAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalBgDsl.g:617:4: ( (lv_states_12_0= ruleState ) )
            	    // InternalBgDsl.g:618:5: (lv_states_12_0= ruleState )
            	    {
            	    // InternalBgDsl.g:618:5: (lv_states_12_0= ruleState )
            	    // InternalBgDsl.g:619:6: lv_states_12_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getTileAccess().getStatesStateParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_states_12_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_12_0,
            	    							"no.ntnu.tdt4250.bgdsl.BgDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalBgDsl.g:641:3: (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBgDsl.g:642:4: otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getTileAccess().getTransitionsKeyword_13_0());
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_26); 

                    				newLeafNode(otherlv_15, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalBgDsl.g:650:4: ( (lv_transitions_16_0= ruleTransition ) )
                    // InternalBgDsl.g:651:5: (lv_transitions_16_0= ruleTransition )
                    {
                    // InternalBgDsl.g:651:5: (lv_transitions_16_0= ruleTransition )
                    // InternalBgDsl.g:652:6: lv_transitions_16_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_transitions_16_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTileRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_16_0,
                    							"no.ntnu.tdt4250.bgdsl.BgDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBgDsl.g:669:4: (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBgDsl.g:670:5: otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_26); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getTileAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalBgDsl.g:674:5: ( (lv_transitions_18_0= ruleTransition ) )
                    	    // InternalBgDsl.g:675:6: (lv_transitions_18_0= ruleTransition )
                    	    {
                    	    // InternalBgDsl.g:675:6: (lv_transitions_18_0= ruleTransition )
                    	    // InternalBgDsl.g:676:7: lv_transitions_18_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_transitions_18_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_18_0,
                    	    								"no.ntnu.tdt4250.bgdsl.BgDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_19, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_20, grammarAccess.getTileAccess().getInitialStateKeyword_14());
            		
            // InternalBgDsl.g:703:3: ( (lv_initialState_21_0= ruleState ) )
            // InternalBgDsl.g:704:4: (lv_initialState_21_0= ruleState )
            {
            // InternalBgDsl.g:704:4: (lv_initialState_21_0= ruleState )
            // InternalBgDsl.g:705:5: lv_initialState_21_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_7);
            lv_initialState_21_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"initialState",
            						lv_initialState_21_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalBgDsl.g:730:1: entryRuleLegalMovesPipeline returns [EObject current=null] : iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF ;
    public final EObject entryRuleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegalMovesPipeline = null;


        try {
            // InternalBgDsl.g:730:59: (iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:731:2: iv_ruleLegalMovesPipeline= ruleLegalMovesPipeline EOF
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
    // InternalBgDsl.g:737:1: ruleLegalMovesPipeline returns [EObject current=null] : ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLegalMovesPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBgDsl.g:743:2: ( ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:744:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:744:2: ( () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:745:3: () otherlv_1= 'LegalMovesPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:745:3: ()
            // InternalBgDsl.g:746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:760:3: (otherlv_3= 'filter' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBgDsl.g:761:4: otherlv_3= 'filter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:765:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:766:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:766:5: ( ruleEString )
                    // InternalBgDsl.g:767:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLegalMovesPipelineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalBgDsl.g:790:1: entryRuleEffectPipeline returns [EObject current=null] : iv_ruleEffectPipeline= ruleEffectPipeline EOF ;
    public final EObject entryRuleEffectPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectPipeline = null;


        try {
            // InternalBgDsl.g:790:55: (iv_ruleEffectPipeline= ruleEffectPipeline EOF )
            // InternalBgDsl.g:791:2: iv_ruleEffectPipeline= ruleEffectPipeline EOF
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
    // InternalBgDsl.g:797:1: ruleEffectPipeline returns [EObject current=null] : ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEffectPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBgDsl.g:803:2: ( ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:804:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:804:2: ( () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:805:3: () otherlv_1= 'EffectPipeline' otherlv_2= '{' (otherlv_3= 'filter' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:805:3: ()
            // InternalBgDsl.g:806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:820:3: (otherlv_3= 'filter' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBgDsl.g:821:4: otherlv_3= 'filter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:825:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:826:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:826:5: ( ruleEString )
                    // InternalBgDsl.g:827:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEffectPipelineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEffectPipelineAccess().getFilterFilterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleState"
    // InternalBgDsl.g:850:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalBgDsl.g:850:46: (iv_ruleState= ruleState EOF )
            // InternalBgDsl.g:851:2: iv_ruleState= ruleState EOF
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
    // InternalBgDsl.g:857:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' ( ( ruleEString ) ) )? (otherlv_7= 'inbound' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:863:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' ( ( ruleEString ) ) )? (otherlv_7= 'inbound' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalBgDsl.g:864:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' ( ( ruleEString ) ) )? (otherlv_7= 'inbound' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalBgDsl.g:864:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' ( ( ruleEString ) ) )? (otherlv_7= 'inbound' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalBgDsl.g:865:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'hexColor' ( (lv_hexColor_4_0= ruleEString ) ) (otherlv_5= 'outbound' ( ( ruleEString ) ) )? (otherlv_7= 'inbound' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalBgDsl.g:869:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:870:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:870:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:871:5: lv_name_1_0= ruleEString
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
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getHexColorKeyword_3());
            		
            // InternalBgDsl.g:896:3: ( (lv_hexColor_4_0= ruleEString ) )
            // InternalBgDsl.g:897:4: (lv_hexColor_4_0= ruleEString )
            {
            // InternalBgDsl.g:897:4: (lv_hexColor_4_0= ruleEString )
            // InternalBgDsl.g:898:5: lv_hexColor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_hexColor_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"hexColor",
            						lv_hexColor_4_0,
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:915:3: (otherlv_5= 'outbound' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:916:4: otherlv_5= 'outbound' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getOutboundKeyword_5_0());
                    			
                    // InternalBgDsl.g:920:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:921:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:921:5: ( ruleEString )
                    // InternalBgDsl.g:922:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBgDsl.g:937:3: (otherlv_7= 'inbound' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:938:4: otherlv_7= 'inbound' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getInboundKeyword_6_0());
                    			
                    // InternalBgDsl.g:942:4: ( ( ruleEString ) )
                    // InternalBgDsl.g:943:5: ( ruleEString )
                    {
                    // InternalBgDsl.g:943:5: ( ruleEString )
                    // InternalBgDsl.g:944:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalBgDsl.g:967:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalBgDsl.g:967:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalBgDsl.g:968:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalBgDsl.g:974:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalBgDsl.g:980:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalBgDsl.g:981:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalBgDsl.g:981:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalBgDsl.g:982:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'target' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalBgDsl.g:986:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBgDsl.g:987:4: (lv_name_1_0= ruleEString )
            {
            // InternalBgDsl.g:987:4: (lv_name_1_0= ruleEString )
            // InternalBgDsl.g:988:5: lv_name_1_0= ruleEString
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
            						"no.ntnu.tdt4250.bgdsl.BgDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBgDsl.g:1017:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1018:4: ( ruleEString )
            {
            // InternalBgDsl.g:1018:4: ( ruleEString )
            // InternalBgDsl.g:1019:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBgDsl.g:1033:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBgDsl.g:1034:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBgDsl.g:1038:4: ( ( ruleEString ) )
            	    // InternalBgDsl.g:1039:5: ( ruleEString )
            	    {
            	    // InternalBgDsl.g:1039:5: ( ruleEString )
            	    // InternalBgDsl.g:1040:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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

            otherlv_8=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_8());
            		
            // InternalBgDsl.g:1063:3: ( ( ruleEString ) )
            // InternalBgDsl.g:1064:4: ( ruleEString )
            {
            // InternalBgDsl.g:1064:4: ( ruleEString )
            // InternalBgDsl.g:1065:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalBgDsl.g:1087:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBgDsl.g:1087:47: (iv_ruleEString= ruleEString EOF )
            // InternalBgDsl.g:1088:2: iv_ruleEString= ruleEString EOF
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
    // InternalBgDsl.g:1094:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1100:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBgDsl.g:1101:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBgDsl.g:1101:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:1102:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1110:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSomeFilter1"
    // InternalBgDsl.g:1121:1: entryRuleSomeFilter1 returns [EObject current=null] : iv_ruleSomeFilter1= ruleSomeFilter1 EOF ;
    public final EObject entryRuleSomeFilter1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeFilter1 = null;


        try {
            // InternalBgDsl.g:1121:52: (iv_ruleSomeFilter1= ruleSomeFilter1 EOF )
            // InternalBgDsl.g:1122:2: iv_ruleSomeFilter1= ruleSomeFilter1 EOF
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
    // InternalBgDsl.g:1128:1: ruleSomeFilter1 returns [EObject current=null] : ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSomeFilter1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nextFilter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1134:2: ( ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1135:2: ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1135:2: ( () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1136:3: () otherlv_1= 'SomeFilter1' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1136:3: ()
            // InternalBgDsl.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeFilter1Access().getSomeFilter1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSomeFilter1Access().getSomeFilter1Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeFilter1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1151:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBgDsl.g:1152:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSomeFilter1Access().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1156:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1157:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1157:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1158:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getSomeFilter1Access().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_nextFilter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSomeFilter1Rule());
                    						}
                    						set(
                    							current,
                    							"nextFilter",
                    							lv_nextFilter_4_0,
                    							"no.ntnu.tdt4250.bgdsl.BgDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalBgDsl.g:1184:1: entryRuleSomeFilter2 returns [EObject current=null] : iv_ruleSomeFilter2= ruleSomeFilter2 EOF ;
    public final EObject entryRuleSomeFilter2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeFilter2 = null;


        try {
            // InternalBgDsl.g:1184:52: (iv_ruleSomeFilter2= ruleSomeFilter2 EOF )
            // InternalBgDsl.g:1185:2: iv_ruleSomeFilter2= ruleSomeFilter2 EOF
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
    // InternalBgDsl.g:1191:1: ruleSomeFilter2 returns [EObject current=null] : ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSomeFilter2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nextFilter_4_0 = null;



        	enterRule();

        try {
            // InternalBgDsl.g:1197:2: ( ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' ) )
            // InternalBgDsl.g:1198:2: ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            {
            // InternalBgDsl.g:1198:2: ( () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}' )
            // InternalBgDsl.g:1199:3: () otherlv_1= 'SomeFilter2' otherlv_2= '{' (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )? otherlv_5= '}'
            {
            // InternalBgDsl.g:1199:3: ()
            // InternalBgDsl.g:1200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeFilter2Access().getSomeFilter2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSomeFilter2Access().getSomeFilter2Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeFilter2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalBgDsl.g:1214:3: (otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:1215:4: otherlv_3= 'nextFilter' ( (lv_nextFilter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSomeFilter2Access().getNextFilterKeyword_3_0());
                    			
                    // InternalBgDsl.g:1219:4: ( (lv_nextFilter_4_0= ruleFilter ) )
                    // InternalBgDsl.g:1220:5: (lv_nextFilter_4_0= ruleFilter )
                    {
                    // InternalBgDsl.g:1220:5: (lv_nextFilter_4_0= ruleFilter )
                    // InternalBgDsl.g:1221:6: lv_nextFilter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getSomeFilter2Access().getNextFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_nextFilter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSomeFilter2Rule());
                    						}
                    						set(
                    							current,
                    							"nextFilter",
                    							lv_nextFilter_4_0,
                    							"no.ntnu.tdt4250.bgdsl.BgDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalBgDsl.g:1247:1: ruleTurnType returns [Enumerator current=null] : ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) ;
    public final Enumerator ruleTurnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBgDsl.g:1253:2: ( ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) ) )
            // InternalBgDsl.g:1254:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            {
            // InternalBgDsl.g:1254:2: ( (enumLiteral_0= 'TurnBased' ) | (enumLiteral_1= 'Simultaneous' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            else if ( (LA19_0==48) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:1255:3: (enumLiteral_0= 'TurnBased' )
                    {
                    // InternalBgDsl.g:1255:3: (enumLiteral_0= 'TurnBased' )
                    // InternalBgDsl.g:1256:4: enumLiteral_0= 'TurnBased'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:1263:3: (enumLiteral_1= 'Simultaneous' )
                    {
                    // InternalBgDsl.g:1263:3: (enumLiteral_1= 'Simultaneous' )
                    // InternalBgDsl.g:1264:4: enumLiteral_1= 'Simultaneous'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000500000000000L});

}