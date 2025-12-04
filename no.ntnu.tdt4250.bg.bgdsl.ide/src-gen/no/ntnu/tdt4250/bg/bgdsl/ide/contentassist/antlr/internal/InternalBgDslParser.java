package no.ntnu.tdt4250.bg.bgdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import no.ntnu.tdt4250.bg.bgdsl.services.BgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBgDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurnBased'", "'Simultaneous'", "'Game'", "'{'", "'board'", "'}'", "'initialPlayer'", "'players'", "','", "'turnPolicy'", "'Board'", "'width'", "'height'", "'tiles'", "'tileplacement'", "'legalMovesPipeline'", "'effectPipeline'", "'Player'", "'hexColor'", "'TurnPolicy'", "'type'", "'-'", "'Tile'", "'name'", "'states'", "'initialState'", "'transitions'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'patterns'", "'nextFilter'", "'Pattern'", "'relativeCoordinates'", "'RelativeCoordinate'", "'x'", "'y'", "'checkered'"
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

    	public void setGrammarAccess(BgDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalBgDsl.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalBgDsl.g:54:1: ( ruleGame EOF )
            // InternalBgDsl.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalBgDsl.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalBgDsl.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalBgDsl.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalBgDsl.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalBgDsl.g:69:3: ( rule__Game__Group__0 )
            // InternalBgDsl.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleFilter"
    // InternalBgDsl.g:78:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:79:1: ( ruleFilter EOF )
            // InternalBgDsl.g:80:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalBgDsl.g:87:1: ruleFilter : ( rulePatternFilter ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:91:2: ( ( rulePatternFilter ) )
            // InternalBgDsl.g:92:2: ( rulePatternFilter )
            {
            // InternalBgDsl.g:92:2: ( rulePatternFilter )
            // InternalBgDsl.g:93:3: rulePatternFilter
            {
             before(grammarAccess.getFilterAccess().getPatternFilterParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePatternFilter();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getPatternFilterParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBoard"
    // InternalBgDsl.g:103:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalBgDsl.g:104:1: ( ruleBoard EOF )
            // InternalBgDsl.g:105:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalBgDsl.g:112:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:116:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalBgDsl.g:117:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalBgDsl.g:117:2: ( ( rule__Board__Group__0 ) )
            // InternalBgDsl.g:118:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalBgDsl.g:119:3: ( rule__Board__Group__0 )
            // InternalBgDsl.g:119:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleEString"
    // InternalBgDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBgDsl.g:129:1: ( ruleEString EOF )
            // InternalBgDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBgDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBgDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBgDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalBgDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBgDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalBgDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePlayer"
    // InternalBgDsl.g:153:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalBgDsl.g:154:1: ( rulePlayer EOF )
            // InternalBgDsl.g:155:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalBgDsl.g:162:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:166:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalBgDsl.g:167:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalBgDsl.g:167:2: ( ( rule__Player__Group__0 ) )
            // InternalBgDsl.g:168:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalBgDsl.g:169:3: ( rule__Player__Group__0 )
            // InternalBgDsl.g:169:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleTurnPolicy"
    // InternalBgDsl.g:178:1: entryRuleTurnPolicy : ruleTurnPolicy EOF ;
    public final void entryRuleTurnPolicy() throws RecognitionException {
        try {
            // InternalBgDsl.g:179:1: ( ruleTurnPolicy EOF )
            // InternalBgDsl.g:180:1: ruleTurnPolicy EOF
            {
             before(grammarAccess.getTurnPolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnPolicy();

            state._fsp--;

             after(grammarAccess.getTurnPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnPolicy"


    // $ANTLR start "ruleTurnPolicy"
    // InternalBgDsl.g:187:1: ruleTurnPolicy : ( ( rule__TurnPolicy__Group__0 ) ) ;
    public final void ruleTurnPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:191:2: ( ( ( rule__TurnPolicy__Group__0 ) ) )
            // InternalBgDsl.g:192:2: ( ( rule__TurnPolicy__Group__0 ) )
            {
            // InternalBgDsl.g:192:2: ( ( rule__TurnPolicy__Group__0 ) )
            // InternalBgDsl.g:193:3: ( rule__TurnPolicy__Group__0 )
            {
             before(grammarAccess.getTurnPolicyAccess().getGroup()); 
            // InternalBgDsl.g:194:3: ( rule__TurnPolicy__Group__0 )
            // InternalBgDsl.g:194:4: rule__TurnPolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnPolicy"


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBgDsl.g:204:1: ( ruleEInt EOF )
            // InternalBgDsl.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBgDsl.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBgDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBgDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalBgDsl.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBgDsl.g:219:3: ( rule__EInt__Group__0 )
            // InternalBgDsl.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTile"
    // InternalBgDsl.g:228:1: entryRuleTile : ruleTile EOF ;
    public final void entryRuleTile() throws RecognitionException {
        try {
            // InternalBgDsl.g:229:1: ( ruleTile EOF )
            // InternalBgDsl.g:230:1: ruleTile EOF
            {
             before(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getTileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalBgDsl.g:237:1: ruleTile : ( ( rule__Tile__Group__0 ) ) ;
    public final void ruleTile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:241:2: ( ( ( rule__Tile__Group__0 ) ) )
            // InternalBgDsl.g:242:2: ( ( rule__Tile__Group__0 ) )
            {
            // InternalBgDsl.g:242:2: ( ( rule__Tile__Group__0 ) )
            // InternalBgDsl.g:243:3: ( rule__Tile__Group__0 )
            {
             before(grammarAccess.getTileAccess().getGroup()); 
            // InternalBgDsl.g:244:3: ( rule__Tile__Group__0 )
            // InternalBgDsl.g:244:4: rule__Tile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTile"


    // $ANTLR start "entryRuleLegalMovesPipeline"
    // InternalBgDsl.g:253:1: entryRuleLegalMovesPipeline : ruleLegalMovesPipeline EOF ;
    public final void entryRuleLegalMovesPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:254:1: ( ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:255:1: ruleLegalMovesPipeline EOF
            {
             before(grammarAccess.getLegalMovesPipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleLegalMovesPipeline();

            state._fsp--;

             after(grammarAccess.getLegalMovesPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLegalMovesPipeline"


    // $ANTLR start "ruleLegalMovesPipeline"
    // InternalBgDsl.g:262:1: ruleLegalMovesPipeline : ( ( rule__LegalMovesPipeline__Group__0 ) ) ;
    public final void ruleLegalMovesPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:266:2: ( ( ( rule__LegalMovesPipeline__Group__0 ) ) )
            // InternalBgDsl.g:267:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:267:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            // InternalBgDsl.g:268:3: ( rule__LegalMovesPipeline__Group__0 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup()); 
            // InternalBgDsl.g:269:3: ( rule__LegalMovesPipeline__Group__0 )
            // InternalBgDsl.g:269:4: rule__LegalMovesPipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLegalMovesPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLegalMovesPipeline"


    // $ANTLR start "entryRuleEffectPipeline"
    // InternalBgDsl.g:278:1: entryRuleEffectPipeline : ruleEffectPipeline EOF ;
    public final void entryRuleEffectPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:279:1: ( ruleEffectPipeline EOF )
            // InternalBgDsl.g:280:1: ruleEffectPipeline EOF
            {
             before(grammarAccess.getEffectPipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectPipeline();

            state._fsp--;

             after(grammarAccess.getEffectPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectPipeline"


    // $ANTLR start "ruleEffectPipeline"
    // InternalBgDsl.g:287:1: ruleEffectPipeline : ( ( rule__EffectPipeline__Group__0 ) ) ;
    public final void ruleEffectPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:291:2: ( ( ( rule__EffectPipeline__Group__0 ) ) )
            // InternalBgDsl.g:292:2: ( ( rule__EffectPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:292:2: ( ( rule__EffectPipeline__Group__0 ) )
            // InternalBgDsl.g:293:3: ( rule__EffectPipeline__Group__0 )
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup()); 
            // InternalBgDsl.g:294:3: ( rule__EffectPipeline__Group__0 )
            // InternalBgDsl.g:294:4: rule__EffectPipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectPipeline"


    // $ANTLR start "entryRuleTilePlacement"
    // InternalBgDsl.g:303:1: entryRuleTilePlacement : ruleTilePlacement EOF ;
    public final void entryRuleTilePlacement() throws RecognitionException {
        try {
            // InternalBgDsl.g:304:1: ( ruleTilePlacement EOF )
            // InternalBgDsl.g:305:1: ruleTilePlacement EOF
            {
             before(grammarAccess.getTilePlacementRule()); 
            pushFollow(FOLLOW_1);
            ruleTilePlacement();

            state._fsp--;

             after(grammarAccess.getTilePlacementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTilePlacement"


    // $ANTLR start "ruleTilePlacement"
    // InternalBgDsl.g:312:1: ruleTilePlacement : ( ( rule__TilePlacement__Group__0 ) ) ;
    public final void ruleTilePlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:316:2: ( ( ( rule__TilePlacement__Group__0 ) ) )
            // InternalBgDsl.g:317:2: ( ( rule__TilePlacement__Group__0 ) )
            {
            // InternalBgDsl.g:317:2: ( ( rule__TilePlacement__Group__0 ) )
            // InternalBgDsl.g:318:3: ( rule__TilePlacement__Group__0 )
            {
             before(grammarAccess.getTilePlacementAccess().getGroup()); 
            // InternalBgDsl.g:319:3: ( rule__TilePlacement__Group__0 )
            // InternalBgDsl.g:319:4: rule__TilePlacement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTilePlacementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTilePlacement"


    // $ANTLR start "entryRuleState"
    // InternalBgDsl.g:328:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalBgDsl.g:329:1: ( ruleState EOF )
            // InternalBgDsl.g:330:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalBgDsl.g:337:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:341:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalBgDsl.g:342:2: ( ( rule__State__Group__0 ) )
            {
            // InternalBgDsl.g:342:2: ( ( rule__State__Group__0 ) )
            // InternalBgDsl.g:343:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalBgDsl.g:344:3: ( rule__State__Group__0 )
            // InternalBgDsl.g:344:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalBgDsl.g:353:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalBgDsl.g:354:1: ( ruleTransition EOF )
            // InternalBgDsl.g:355:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalBgDsl.g:362:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:366:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalBgDsl.g:367:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalBgDsl.g:367:2: ( ( rule__Transition__Group__0 ) )
            // InternalBgDsl.g:368:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalBgDsl.g:369:3: ( rule__Transition__Group__0 )
            // InternalBgDsl.g:369:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePatternFilter"
    // InternalBgDsl.g:378:1: entryRulePatternFilter : rulePatternFilter EOF ;
    public final void entryRulePatternFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:379:1: ( rulePatternFilter EOF )
            // InternalBgDsl.g:380:1: rulePatternFilter EOF
            {
             before(grammarAccess.getPatternFilterRule()); 
            pushFollow(FOLLOW_1);
            rulePatternFilter();

            state._fsp--;

             after(grammarAccess.getPatternFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternFilter"


    // $ANTLR start "rulePatternFilter"
    // InternalBgDsl.g:387:1: rulePatternFilter : ( ( rule__PatternFilter__Group__0 ) ) ;
    public final void rulePatternFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:391:2: ( ( ( rule__PatternFilter__Group__0 ) ) )
            // InternalBgDsl.g:392:2: ( ( rule__PatternFilter__Group__0 ) )
            {
            // InternalBgDsl.g:392:2: ( ( rule__PatternFilter__Group__0 ) )
            // InternalBgDsl.g:393:3: ( rule__PatternFilter__Group__0 )
            {
             before(grammarAccess.getPatternFilterAccess().getGroup()); 
            // InternalBgDsl.g:394:3: ( rule__PatternFilter__Group__0 )
            // InternalBgDsl.g:394:4: rule__PatternFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternFilter"


    // $ANTLR start "entryRulePattern"
    // InternalBgDsl.g:403:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalBgDsl.g:404:1: ( rulePattern EOF )
            // InternalBgDsl.g:405:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalBgDsl.g:412:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:416:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalBgDsl.g:417:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalBgDsl.g:417:2: ( ( rule__Pattern__Group__0 ) )
            // InternalBgDsl.g:418:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalBgDsl.g:419:3: ( rule__Pattern__Group__0 )
            // InternalBgDsl.g:419:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleRelativeCoordinate"
    // InternalBgDsl.g:428:1: entryRuleRelativeCoordinate : ruleRelativeCoordinate EOF ;
    public final void entryRuleRelativeCoordinate() throws RecognitionException {
        try {
            // InternalBgDsl.g:429:1: ( ruleRelativeCoordinate EOF )
            // InternalBgDsl.g:430:1: ruleRelativeCoordinate EOF
            {
             before(grammarAccess.getRelativeCoordinateRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getRelativeCoordinateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelativeCoordinate"


    // $ANTLR start "ruleRelativeCoordinate"
    // InternalBgDsl.g:437:1: ruleRelativeCoordinate : ( ( rule__RelativeCoordinate__Group__0 ) ) ;
    public final void ruleRelativeCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:441:2: ( ( ( rule__RelativeCoordinate__Group__0 ) ) )
            // InternalBgDsl.g:442:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            {
            // InternalBgDsl.g:442:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            // InternalBgDsl.g:443:3: ( rule__RelativeCoordinate__Group__0 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getGroup()); 
            // InternalBgDsl.g:444:3: ( rule__RelativeCoordinate__Group__0 )
            // InternalBgDsl.g:444:4: rule__RelativeCoordinate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeCoordinateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeCoordinate"


    // $ANTLR start "ruleTurnType"
    // InternalBgDsl.g:453:1: ruleTurnType : ( ( rule__TurnType__Alternatives ) ) ;
    public final void ruleTurnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:457:1: ( ( ( rule__TurnType__Alternatives ) ) )
            // InternalBgDsl.g:458:2: ( ( rule__TurnType__Alternatives ) )
            {
            // InternalBgDsl.g:458:2: ( ( rule__TurnType__Alternatives ) )
            // InternalBgDsl.g:459:3: ( rule__TurnType__Alternatives )
            {
             before(grammarAccess.getTurnTypeAccess().getAlternatives()); 
            // InternalBgDsl.g:460:3: ( rule__TurnType__Alternatives )
            // InternalBgDsl.g:460:4: rule__TurnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TurnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTurnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBgDsl.g:468:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:472:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBgDsl.g:473:2: ( RULE_STRING )
                    {
                    // InternalBgDsl.g:473:2: ( RULE_STRING )
                    // InternalBgDsl.g:474:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:479:2: ( RULE_ID )
                    {
                    // InternalBgDsl.g:479:2: ( RULE_ID )
                    // InternalBgDsl.g:480:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TurnType__Alternatives"
    // InternalBgDsl.g:489:1: rule__TurnType__Alternatives : ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) );
    public final void rule__TurnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:493:1: ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBgDsl.g:494:2: ( ( 'TurnBased' ) )
                    {
                    // InternalBgDsl.g:494:2: ( ( 'TurnBased' ) )
                    // InternalBgDsl.g:495:3: ( 'TurnBased' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:496:3: ( 'TurnBased' )
                    // InternalBgDsl.g:496:4: 'TurnBased'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:500:2: ( ( 'Simultaneous' ) )
                    {
                    // InternalBgDsl.g:500:2: ( ( 'Simultaneous' ) )
                    // InternalBgDsl.g:501:3: ( 'Simultaneous' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:502:3: ( 'Simultaneous' )
                    // InternalBgDsl.g:502:4: 'Simultaneous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnType__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalBgDsl.g:510:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:514:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalBgDsl.g:515:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalBgDsl.g:522:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:526:1: ( ( 'Game' ) )
            // InternalBgDsl.g:527:1: ( 'Game' )
            {
            // InternalBgDsl.g:527:1: ( 'Game' )
            // InternalBgDsl.g:528:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalBgDsl.g:537:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:541:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalBgDsl.g:542:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalBgDsl.g:549:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:553:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalBgDsl.g:554:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:554:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalBgDsl.g:555:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:556:2: ( rule__Game__NameAssignment_1 )
            // InternalBgDsl.g:556:3: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalBgDsl.g:564:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:568:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalBgDsl.g:569:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalBgDsl.g:576:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:580:1: ( ( '{' ) )
            // InternalBgDsl.g:581:1: ( '{' )
            {
            // InternalBgDsl.g:581:1: ( '{' )
            // InternalBgDsl.g:582:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalBgDsl.g:591:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:595:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalBgDsl.g:596:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalBgDsl.g:603:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:607:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalBgDsl.g:608:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalBgDsl.g:608:1: ( ( rule__Game__Group_3__0 )? )
            // InternalBgDsl.g:609:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalBgDsl.g:610:2: ( rule__Game__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBgDsl.g:610:3: rule__Game__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalBgDsl.g:618:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:622:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalBgDsl.g:623:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalBgDsl.g:630:1: rule__Game__Group__4__Impl : ( 'board' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:634:1: ( ( 'board' ) )
            // InternalBgDsl.g:635:1: ( 'board' )
            {
            // InternalBgDsl.g:635:1: ( 'board' )
            // InternalBgDsl.g:636:2: 'board'
            {
             before(grammarAccess.getGameAccess().getBoardKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getBoardKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__5"
    // InternalBgDsl.g:645:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:649:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalBgDsl.g:650:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5"


    // $ANTLR start "rule__Game__Group__5__Impl"
    // InternalBgDsl.g:657:1: rule__Game__Group__5__Impl : ( ( rule__Game__BoardAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:661:1: ( ( ( rule__Game__BoardAssignment_5 ) ) )
            // InternalBgDsl.g:662:1: ( ( rule__Game__BoardAssignment_5 ) )
            {
            // InternalBgDsl.g:662:1: ( ( rule__Game__BoardAssignment_5 ) )
            // InternalBgDsl.g:663:2: ( rule__Game__BoardAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getBoardAssignment_5()); 
            // InternalBgDsl.g:664:2: ( rule__Game__BoardAssignment_5 )
            // InternalBgDsl.g:664:3: rule__Game__BoardAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Game__BoardAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getBoardAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalBgDsl.g:672:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:676:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalBgDsl.g:677:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6"


    // $ANTLR start "rule__Game__Group__6__Impl"
    // InternalBgDsl.g:684:1: rule__Game__Group__6__Impl : ( ( rule__Game__Group_6__0 )? ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:688:1: ( ( ( rule__Game__Group_6__0 )? ) )
            // InternalBgDsl.g:689:1: ( ( rule__Game__Group_6__0 )? )
            {
            // InternalBgDsl.g:689:1: ( ( rule__Game__Group_6__0 )? )
            // InternalBgDsl.g:690:2: ( rule__Game__Group_6__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_6()); 
            // InternalBgDsl.g:691:2: ( rule__Game__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBgDsl.g:691:3: rule__Game__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6__Impl"


    // $ANTLR start "rule__Game__Group__7"
    // InternalBgDsl.g:699:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:703:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalBgDsl.g:704:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7"


    // $ANTLR start "rule__Game__Group__7__Impl"
    // InternalBgDsl.g:711:1: rule__Game__Group__7__Impl : ( ( rule__Game__Group_7__0 )? ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:715:1: ( ( ( rule__Game__Group_7__0 )? ) )
            // InternalBgDsl.g:716:1: ( ( rule__Game__Group_7__0 )? )
            {
            // InternalBgDsl.g:716:1: ( ( rule__Game__Group_7__0 )? )
            // InternalBgDsl.g:717:2: ( rule__Game__Group_7__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_7()); 
            // InternalBgDsl.g:718:2: ( rule__Game__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:718:3: rule__Game__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7__Impl"


    // $ANTLR start "rule__Game__Group__8"
    // InternalBgDsl.g:726:1: rule__Game__Group__8 : rule__Game__Group__8__Impl ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:730:1: ( rule__Game__Group__8__Impl )
            // InternalBgDsl.g:731:2: rule__Game__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8"


    // $ANTLR start "rule__Game__Group__8__Impl"
    // InternalBgDsl.g:737:1: rule__Game__Group__8__Impl : ( '}' ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:741:1: ( ( '}' ) )
            // InternalBgDsl.g:742:1: ( '}' )
            {
            // InternalBgDsl.g:742:1: ( '}' )
            // InternalBgDsl.g:743:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8__Impl"


    // $ANTLR start "rule__Game__Group_3__0"
    // InternalBgDsl.g:753:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:757:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalBgDsl.g:758:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__0"


    // $ANTLR start "rule__Game__Group_3__0__Impl"
    // InternalBgDsl.g:765:1: rule__Game__Group_3__0__Impl : ( 'initialPlayer' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:769:1: ( ( 'initialPlayer' ) )
            // InternalBgDsl.g:770:1: ( 'initialPlayer' )
            {
            // InternalBgDsl.g:770:1: ( 'initialPlayer' )
            // InternalBgDsl.g:771:2: 'initialPlayer'
            {
             before(grammarAccess.getGameAccess().getInitialPlayerKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getInitialPlayerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__0__Impl"


    // $ANTLR start "rule__Game__Group_3__1"
    // InternalBgDsl.g:780:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:784:1: ( rule__Game__Group_3__1__Impl )
            // InternalBgDsl.g:785:2: rule__Game__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__1"


    // $ANTLR start "rule__Game__Group_3__1__Impl"
    // InternalBgDsl.g:791:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:795:1: ( ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) )
            // InternalBgDsl.g:796:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            {
            // InternalBgDsl.g:796:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            // InternalBgDsl.g:797:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerAssignment_3_1()); 
            // InternalBgDsl.g:798:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            // InternalBgDsl.g:798:3: rule__Game__InitialPlayerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__InitialPlayerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getInitialPlayerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__1__Impl"


    // $ANTLR start "rule__Game__Group_6__0"
    // InternalBgDsl.g:807:1: rule__Game__Group_6__0 : rule__Game__Group_6__0__Impl rule__Game__Group_6__1 ;
    public final void rule__Game__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:811:1: ( rule__Game__Group_6__0__Impl rule__Game__Group_6__1 )
            // InternalBgDsl.g:812:2: rule__Game__Group_6__0__Impl rule__Game__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__0"


    // $ANTLR start "rule__Game__Group_6__0__Impl"
    // InternalBgDsl.g:819:1: rule__Game__Group_6__0__Impl : ( 'players' ) ;
    public final void rule__Game__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:823:1: ( ( 'players' ) )
            // InternalBgDsl.g:824:1: ( 'players' )
            {
            // InternalBgDsl.g:824:1: ( 'players' )
            // InternalBgDsl.g:825:2: 'players'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getPlayersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__0__Impl"


    // $ANTLR start "rule__Game__Group_6__1"
    // InternalBgDsl.g:834:1: rule__Game__Group_6__1 : rule__Game__Group_6__1__Impl rule__Game__Group_6__2 ;
    public final void rule__Game__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:838:1: ( rule__Game__Group_6__1__Impl rule__Game__Group_6__2 )
            // InternalBgDsl.g:839:2: rule__Game__Group_6__1__Impl rule__Game__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__1"


    // $ANTLR start "rule__Game__Group_6__1__Impl"
    // InternalBgDsl.g:846:1: rule__Game__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:850:1: ( ( '{' ) )
            // InternalBgDsl.g:851:1: ( '{' )
            {
            // InternalBgDsl.g:851:1: ( '{' )
            // InternalBgDsl.g:852:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__1__Impl"


    // $ANTLR start "rule__Game__Group_6__2"
    // InternalBgDsl.g:861:1: rule__Game__Group_6__2 : rule__Game__Group_6__2__Impl rule__Game__Group_6__3 ;
    public final void rule__Game__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:865:1: ( rule__Game__Group_6__2__Impl rule__Game__Group_6__3 )
            // InternalBgDsl.g:866:2: rule__Game__Group_6__2__Impl rule__Game__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__2"


    // $ANTLR start "rule__Game__Group_6__2__Impl"
    // InternalBgDsl.g:873:1: rule__Game__Group_6__2__Impl : ( ( rule__Game__PlayersAssignment_6_2 ) ) ;
    public final void rule__Game__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:877:1: ( ( ( rule__Game__PlayersAssignment_6_2 ) ) )
            // InternalBgDsl.g:878:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            {
            // InternalBgDsl.g:878:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            // InternalBgDsl.g:879:2: ( rule__Game__PlayersAssignment_6_2 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_2()); 
            // InternalBgDsl.g:880:2: ( rule__Game__PlayersAssignment_6_2 )
            // InternalBgDsl.g:880:3: rule__Game__PlayersAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__PlayersAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__2__Impl"


    // $ANTLR start "rule__Game__Group_6__3"
    // InternalBgDsl.g:888:1: rule__Game__Group_6__3 : rule__Game__Group_6__3__Impl rule__Game__Group_6__4 ;
    public final void rule__Game__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:892:1: ( rule__Game__Group_6__3__Impl rule__Game__Group_6__4 )
            // InternalBgDsl.g:893:2: rule__Game__Group_6__3__Impl rule__Game__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__3"


    // $ANTLR start "rule__Game__Group_6__3__Impl"
    // InternalBgDsl.g:900:1: rule__Game__Group_6__3__Impl : ( ( rule__Game__Group_6_3__0 )* ) ;
    public final void rule__Game__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:904:1: ( ( ( rule__Game__Group_6_3__0 )* ) )
            // InternalBgDsl.g:905:1: ( ( rule__Game__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:905:1: ( ( rule__Game__Group_6_3__0 )* )
            // InternalBgDsl.g:906:2: ( rule__Game__Group_6_3__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_6_3()); 
            // InternalBgDsl.g:907:2: ( rule__Game__Group_6_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBgDsl.g:907:3: rule__Game__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__3__Impl"


    // $ANTLR start "rule__Game__Group_6__4"
    // InternalBgDsl.g:915:1: rule__Game__Group_6__4 : rule__Game__Group_6__4__Impl ;
    public final void rule__Game__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:919:1: ( rule__Game__Group_6__4__Impl )
            // InternalBgDsl.g:920:2: rule__Game__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__4"


    // $ANTLR start "rule__Game__Group_6__4__Impl"
    // InternalBgDsl.g:926:1: rule__Game__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:930:1: ( ( '}' ) )
            // InternalBgDsl.g:931:1: ( '}' )
            {
            // InternalBgDsl.g:931:1: ( '}' )
            // InternalBgDsl.g:932:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6__4__Impl"


    // $ANTLR start "rule__Game__Group_6_3__0"
    // InternalBgDsl.g:942:1: rule__Game__Group_6_3__0 : rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 ;
    public final void rule__Game__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:946:1: ( rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 )
            // InternalBgDsl.g:947:2: rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6_3__0"


    // $ANTLR start "rule__Game__Group_6_3__0__Impl"
    // InternalBgDsl.g:954:1: rule__Game__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:958:1: ( ( ',' ) )
            // InternalBgDsl.g:959:1: ( ',' )
            {
            // InternalBgDsl.g:959:1: ( ',' )
            // InternalBgDsl.g:960:2: ','
            {
             before(grammarAccess.getGameAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6_3__0__Impl"


    // $ANTLR start "rule__Game__Group_6_3__1"
    // InternalBgDsl.g:969:1: rule__Game__Group_6_3__1 : rule__Game__Group_6_3__1__Impl ;
    public final void rule__Game__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:973:1: ( rule__Game__Group_6_3__1__Impl )
            // InternalBgDsl.g:974:2: rule__Game__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6_3__1"


    // $ANTLR start "rule__Game__Group_6_3__1__Impl"
    // InternalBgDsl.g:980:1: rule__Game__Group_6_3__1__Impl : ( ( rule__Game__PlayersAssignment_6_3_1 ) ) ;
    public final void rule__Game__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:984:1: ( ( ( rule__Game__PlayersAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:985:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:985:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            // InternalBgDsl.g:986:2: ( rule__Game__PlayersAssignment_6_3_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_3_1()); 
            // InternalBgDsl.g:987:2: ( rule__Game__PlayersAssignment_6_3_1 )
            // InternalBgDsl.g:987:3: rule__Game__PlayersAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__PlayersAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_6_3__1__Impl"


    // $ANTLR start "rule__Game__Group_7__0"
    // InternalBgDsl.g:996:1: rule__Game__Group_7__0 : rule__Game__Group_7__0__Impl rule__Game__Group_7__1 ;
    public final void rule__Game__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1000:1: ( rule__Game__Group_7__0__Impl rule__Game__Group_7__1 )
            // InternalBgDsl.g:1001:2: rule__Game__Group_7__0__Impl rule__Game__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__0"


    // $ANTLR start "rule__Game__Group_7__0__Impl"
    // InternalBgDsl.g:1008:1: rule__Game__Group_7__0__Impl : ( 'turnPolicy' ) ;
    public final void rule__Game__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1012:1: ( ( 'turnPolicy' ) )
            // InternalBgDsl.g:1013:1: ( 'turnPolicy' )
            {
            // InternalBgDsl.g:1013:1: ( 'turnPolicy' )
            // InternalBgDsl.g:1014:2: 'turnPolicy'
            {
             before(grammarAccess.getGameAccess().getTurnPolicyKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTurnPolicyKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__0__Impl"


    // $ANTLR start "rule__Game__Group_7__1"
    // InternalBgDsl.g:1023:1: rule__Game__Group_7__1 : rule__Game__Group_7__1__Impl rule__Game__Group_7__2 ;
    public final void rule__Game__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1027:1: ( rule__Game__Group_7__1__Impl rule__Game__Group_7__2 )
            // InternalBgDsl.g:1028:2: rule__Game__Group_7__1__Impl rule__Game__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__1"


    // $ANTLR start "rule__Game__Group_7__1__Impl"
    // InternalBgDsl.g:1035:1: rule__Game__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1039:1: ( ( '{' ) )
            // InternalBgDsl.g:1040:1: ( '{' )
            {
            // InternalBgDsl.g:1040:1: ( '{' )
            // InternalBgDsl.g:1041:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__1__Impl"


    // $ANTLR start "rule__Game__Group_7__2"
    // InternalBgDsl.g:1050:1: rule__Game__Group_7__2 : rule__Game__Group_7__2__Impl rule__Game__Group_7__3 ;
    public final void rule__Game__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1054:1: ( rule__Game__Group_7__2__Impl rule__Game__Group_7__3 )
            // InternalBgDsl.g:1055:2: rule__Game__Group_7__2__Impl rule__Game__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__2"


    // $ANTLR start "rule__Game__Group_7__2__Impl"
    // InternalBgDsl.g:1062:1: rule__Game__Group_7__2__Impl : ( ( rule__Game__TurnPolicyAssignment_7_2 ) ) ;
    public final void rule__Game__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1066:1: ( ( ( rule__Game__TurnPolicyAssignment_7_2 ) ) )
            // InternalBgDsl.g:1067:1: ( ( rule__Game__TurnPolicyAssignment_7_2 ) )
            {
            // InternalBgDsl.g:1067:1: ( ( rule__Game__TurnPolicyAssignment_7_2 ) )
            // InternalBgDsl.g:1068:2: ( rule__Game__TurnPolicyAssignment_7_2 )
            {
             before(grammarAccess.getGameAccess().getTurnPolicyAssignment_7_2()); 
            // InternalBgDsl.g:1069:2: ( rule__Game__TurnPolicyAssignment_7_2 )
            // InternalBgDsl.g:1069:3: rule__Game__TurnPolicyAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__TurnPolicyAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTurnPolicyAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__2__Impl"


    // $ANTLR start "rule__Game__Group_7__3"
    // InternalBgDsl.g:1077:1: rule__Game__Group_7__3 : rule__Game__Group_7__3__Impl rule__Game__Group_7__4 ;
    public final void rule__Game__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1081:1: ( rule__Game__Group_7__3__Impl rule__Game__Group_7__4 )
            // InternalBgDsl.g:1082:2: rule__Game__Group_7__3__Impl rule__Game__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__3"


    // $ANTLR start "rule__Game__Group_7__3__Impl"
    // InternalBgDsl.g:1089:1: rule__Game__Group_7__3__Impl : ( ( rule__Game__Group_7_3__0 )* ) ;
    public final void rule__Game__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1093:1: ( ( ( rule__Game__Group_7_3__0 )* ) )
            // InternalBgDsl.g:1094:1: ( ( rule__Game__Group_7_3__0 )* )
            {
            // InternalBgDsl.g:1094:1: ( ( rule__Game__Group_7_3__0 )* )
            // InternalBgDsl.g:1095:2: ( rule__Game__Group_7_3__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_7_3()); 
            // InternalBgDsl.g:1096:2: ( rule__Game__Group_7_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:1096:3: rule__Game__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__3__Impl"


    // $ANTLR start "rule__Game__Group_7__4"
    // InternalBgDsl.g:1104:1: rule__Game__Group_7__4 : rule__Game__Group_7__4__Impl ;
    public final void rule__Game__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1108:1: ( rule__Game__Group_7__4__Impl )
            // InternalBgDsl.g:1109:2: rule__Game__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__4"


    // $ANTLR start "rule__Game__Group_7__4__Impl"
    // InternalBgDsl.g:1115:1: rule__Game__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1119:1: ( ( '}' ) )
            // InternalBgDsl.g:1120:1: ( '}' )
            {
            // InternalBgDsl.g:1120:1: ( '}' )
            // InternalBgDsl.g:1121:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7__4__Impl"


    // $ANTLR start "rule__Game__Group_7_3__0"
    // InternalBgDsl.g:1131:1: rule__Game__Group_7_3__0 : rule__Game__Group_7_3__0__Impl rule__Game__Group_7_3__1 ;
    public final void rule__Game__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1135:1: ( rule__Game__Group_7_3__0__Impl rule__Game__Group_7_3__1 )
            // InternalBgDsl.g:1136:2: rule__Game__Group_7_3__0__Impl rule__Game__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7_3__0"


    // $ANTLR start "rule__Game__Group_7_3__0__Impl"
    // InternalBgDsl.g:1143:1: rule__Game__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1147:1: ( ( ',' ) )
            // InternalBgDsl.g:1148:1: ( ',' )
            {
            // InternalBgDsl.g:1148:1: ( ',' )
            // InternalBgDsl.g:1149:2: ','
            {
             before(grammarAccess.getGameAccess().getCommaKeyword_7_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7_3__0__Impl"


    // $ANTLR start "rule__Game__Group_7_3__1"
    // InternalBgDsl.g:1158:1: rule__Game__Group_7_3__1 : rule__Game__Group_7_3__1__Impl ;
    public final void rule__Game__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1162:1: ( rule__Game__Group_7_3__1__Impl )
            // InternalBgDsl.g:1163:2: rule__Game__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7_3__1"


    // $ANTLR start "rule__Game__Group_7_3__1__Impl"
    // InternalBgDsl.g:1169:1: rule__Game__Group_7_3__1__Impl : ( ( rule__Game__TurnPolicyAssignment_7_3_1 ) ) ;
    public final void rule__Game__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1173:1: ( ( ( rule__Game__TurnPolicyAssignment_7_3_1 ) ) )
            // InternalBgDsl.g:1174:1: ( ( rule__Game__TurnPolicyAssignment_7_3_1 ) )
            {
            // InternalBgDsl.g:1174:1: ( ( rule__Game__TurnPolicyAssignment_7_3_1 ) )
            // InternalBgDsl.g:1175:2: ( rule__Game__TurnPolicyAssignment_7_3_1 )
            {
             before(grammarAccess.getGameAccess().getTurnPolicyAssignment_7_3_1()); 
            // InternalBgDsl.g:1176:2: ( rule__Game__TurnPolicyAssignment_7_3_1 )
            // InternalBgDsl.g:1176:3: rule__Game__TurnPolicyAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__TurnPolicyAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTurnPolicyAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_7_3__1__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // InternalBgDsl.g:1185:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1189:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBgDsl.g:1190:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalBgDsl.g:1197:1: rule__Board__Group__0__Impl : ( ( rule__Board__CheckeredAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1201:1: ( ( ( rule__Board__CheckeredAssignment_0 ) ) )
            // InternalBgDsl.g:1202:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            {
            // InternalBgDsl.g:1202:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            // InternalBgDsl.g:1203:2: ( rule__Board__CheckeredAssignment_0 )
            {
             before(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 
            // InternalBgDsl.g:1204:2: ( rule__Board__CheckeredAssignment_0 )
            // InternalBgDsl.g:1204:3: rule__Board__CheckeredAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Board__CheckeredAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalBgDsl.g:1212:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1216:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBgDsl.g:1217:2: rule__Board__Group__1__Impl rule__Board__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalBgDsl.g:1224:1: rule__Board__Group__1__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1228:1: ( ( 'Board' ) )
            // InternalBgDsl.g:1229:1: ( 'Board' )
            {
            // InternalBgDsl.g:1229:1: ( 'Board' )
            // InternalBgDsl.g:1230:2: 'Board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__2"
    // InternalBgDsl.g:1239:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1243:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBgDsl.g:1244:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Board__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2"


    // $ANTLR start "rule__Board__Group__2__Impl"
    // InternalBgDsl.g:1251:1: rule__Board__Group__2__Impl : ( '{' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1255:1: ( ( '{' ) )
            // InternalBgDsl.g:1256:1: ( '{' )
            {
            // InternalBgDsl.g:1256:1: ( '{' )
            // InternalBgDsl.g:1257:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2__Impl"


    // $ANTLR start "rule__Board__Group__3"
    // InternalBgDsl.g:1266:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1270:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBgDsl.g:1271:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Board__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3"


    // $ANTLR start "rule__Board__Group__3__Impl"
    // InternalBgDsl.g:1278:1: rule__Board__Group__3__Impl : ( 'width' ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1282:1: ( ( 'width' ) )
            // InternalBgDsl.g:1283:1: ( 'width' )
            {
            // InternalBgDsl.g:1283:1: ( 'width' )
            // InternalBgDsl.g:1284:2: 'width'
            {
             before(grammarAccess.getBoardAccess().getWidthKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getWidthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3__Impl"


    // $ANTLR start "rule__Board__Group__4"
    // InternalBgDsl.g:1293:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1297:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBgDsl.g:1298:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Board__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__4"


    // $ANTLR start "rule__Board__Group__4__Impl"
    // InternalBgDsl.g:1305:1: rule__Board__Group__4__Impl : ( ( rule__Board__WidthAssignment_4 ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1309:1: ( ( ( rule__Board__WidthAssignment_4 ) ) )
            // InternalBgDsl.g:1310:1: ( ( rule__Board__WidthAssignment_4 ) )
            {
            // InternalBgDsl.g:1310:1: ( ( rule__Board__WidthAssignment_4 ) )
            // InternalBgDsl.g:1311:2: ( rule__Board__WidthAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_4()); 
            // InternalBgDsl.g:1312:2: ( rule__Board__WidthAssignment_4 )
            // InternalBgDsl.g:1312:3: rule__Board__WidthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Board__WidthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getWidthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__4__Impl"


    // $ANTLR start "rule__Board__Group__5"
    // InternalBgDsl.g:1320:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1324:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBgDsl.g:1325:2: rule__Board__Group__5__Impl rule__Board__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Board__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5"


    // $ANTLR start "rule__Board__Group__5__Impl"
    // InternalBgDsl.g:1332:1: rule__Board__Group__5__Impl : ( 'height' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1336:1: ( ( 'height' ) )
            // InternalBgDsl.g:1337:1: ( 'height' )
            {
            // InternalBgDsl.g:1337:1: ( 'height' )
            // InternalBgDsl.g:1338:2: 'height'
            {
             before(grammarAccess.getBoardAccess().getHeightKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getHeightKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5__Impl"


    // $ANTLR start "rule__Board__Group__6"
    // InternalBgDsl.g:1347:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1351:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBgDsl.g:1352:2: rule__Board__Group__6__Impl rule__Board__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Board__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__6"


    // $ANTLR start "rule__Board__Group__6__Impl"
    // InternalBgDsl.g:1359:1: rule__Board__Group__6__Impl : ( ( rule__Board__HeightAssignment_6 ) ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1363:1: ( ( ( rule__Board__HeightAssignment_6 ) ) )
            // InternalBgDsl.g:1364:1: ( ( rule__Board__HeightAssignment_6 ) )
            {
            // InternalBgDsl.g:1364:1: ( ( rule__Board__HeightAssignment_6 ) )
            // InternalBgDsl.g:1365:2: ( rule__Board__HeightAssignment_6 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_6()); 
            // InternalBgDsl.g:1366:2: ( rule__Board__HeightAssignment_6 )
            // InternalBgDsl.g:1366:3: rule__Board__HeightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Board__HeightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getHeightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__6__Impl"


    // $ANTLR start "rule__Board__Group__7"
    // InternalBgDsl.g:1374:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1378:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBgDsl.g:1379:2: rule__Board__Group__7__Impl rule__Board__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__7"


    // $ANTLR start "rule__Board__Group__7__Impl"
    // InternalBgDsl.g:1386:1: rule__Board__Group__7__Impl : ( 'tiles' ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1390:1: ( ( 'tiles' ) )
            // InternalBgDsl.g:1391:1: ( 'tiles' )
            {
            // InternalBgDsl.g:1391:1: ( 'tiles' )
            // InternalBgDsl.g:1392:2: 'tiles'
            {
             before(grammarAccess.getBoardAccess().getTilesKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getTilesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__7__Impl"


    // $ANTLR start "rule__Board__Group__8"
    // InternalBgDsl.g:1401:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1405:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBgDsl.g:1406:2: rule__Board__Group__8__Impl rule__Board__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Board__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__8"


    // $ANTLR start "rule__Board__Group__8__Impl"
    // InternalBgDsl.g:1413:1: rule__Board__Group__8__Impl : ( '{' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1417:1: ( ( '{' ) )
            // InternalBgDsl.g:1418:1: ( '{' )
            {
            // InternalBgDsl.g:1418:1: ( '{' )
            // InternalBgDsl.g:1419:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__8__Impl"


    // $ANTLR start "rule__Board__Group__9"
    // InternalBgDsl.g:1428:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1432:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBgDsl.g:1433:2: rule__Board__Group__9__Impl rule__Board__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__9"


    // $ANTLR start "rule__Board__Group__9__Impl"
    // InternalBgDsl.g:1440:1: rule__Board__Group__9__Impl : ( ( rule__Board__TilesAssignment_9 ) ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1444:1: ( ( ( rule__Board__TilesAssignment_9 ) ) )
            // InternalBgDsl.g:1445:1: ( ( rule__Board__TilesAssignment_9 ) )
            {
            // InternalBgDsl.g:1445:1: ( ( rule__Board__TilesAssignment_9 ) )
            // InternalBgDsl.g:1446:2: ( rule__Board__TilesAssignment_9 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_9()); 
            // InternalBgDsl.g:1447:2: ( rule__Board__TilesAssignment_9 )
            // InternalBgDsl.g:1447:3: rule__Board__TilesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Board__TilesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getTilesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__9__Impl"


    // $ANTLR start "rule__Board__Group__10"
    // InternalBgDsl.g:1455:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1459:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBgDsl.g:1460:2: rule__Board__Group__10__Impl rule__Board__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__10"


    // $ANTLR start "rule__Board__Group__10__Impl"
    // InternalBgDsl.g:1467:1: rule__Board__Group__10__Impl : ( ( rule__Board__Group_10__0 )* ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1471:1: ( ( ( rule__Board__Group_10__0 )* ) )
            // InternalBgDsl.g:1472:1: ( ( rule__Board__Group_10__0 )* )
            {
            // InternalBgDsl.g:1472:1: ( ( rule__Board__Group_10__0 )* )
            // InternalBgDsl.g:1473:2: ( rule__Board__Group_10__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_10()); 
            // InternalBgDsl.g:1474:2: ( rule__Board__Group_10__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBgDsl.g:1474:3: rule__Board__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Board__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__10__Impl"


    // $ANTLR start "rule__Board__Group__11"
    // InternalBgDsl.g:1482:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1486:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBgDsl.g:1487:2: rule__Board__Group__11__Impl rule__Board__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Board__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__11"


    // $ANTLR start "rule__Board__Group__11__Impl"
    // InternalBgDsl.g:1494:1: rule__Board__Group__11__Impl : ( '}' ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1498:1: ( ( '}' ) )
            // InternalBgDsl.g:1499:1: ( '}' )
            {
            // InternalBgDsl.g:1499:1: ( '}' )
            // InternalBgDsl.g:1500:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__11__Impl"


    // $ANTLR start "rule__Board__Group__12"
    // InternalBgDsl.g:1509:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1513:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBgDsl.g:1514:2: rule__Board__Group__12__Impl rule__Board__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Board__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__12"


    // $ANTLR start "rule__Board__Group__12__Impl"
    // InternalBgDsl.g:1521:1: rule__Board__Group__12__Impl : ( ( rule__Board__Group_12__0 )? ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1525:1: ( ( ( rule__Board__Group_12__0 )? ) )
            // InternalBgDsl.g:1526:1: ( ( rule__Board__Group_12__0 )? )
            {
            // InternalBgDsl.g:1526:1: ( ( rule__Board__Group_12__0 )? )
            // InternalBgDsl.g:1527:2: ( rule__Board__Group_12__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_12()); 
            // InternalBgDsl.g:1528:2: ( rule__Board__Group_12__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:1528:3: rule__Board__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Board__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoardAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__12__Impl"


    // $ANTLR start "rule__Board__Group__13"
    // InternalBgDsl.g:1536:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1540:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBgDsl.g:1541:2: rule__Board__Group__13__Impl rule__Board__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Board__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__13"


    // $ANTLR start "rule__Board__Group__13__Impl"
    // InternalBgDsl.g:1548:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1552:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBgDsl.g:1553:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBgDsl.g:1553:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBgDsl.g:1554:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBgDsl.g:1555:2: ( rule__Board__Group_13__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBgDsl.g:1555:3: rule__Board__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Board__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoardAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__13__Impl"


    // $ANTLR start "rule__Board__Group__14"
    // InternalBgDsl.g:1563:1: rule__Board__Group__14 : rule__Board__Group__14__Impl rule__Board__Group__15 ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1567:1: ( rule__Board__Group__14__Impl rule__Board__Group__15 )
            // InternalBgDsl.g:1568:2: rule__Board__Group__14__Impl rule__Board__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__14"


    // $ANTLR start "rule__Board__Group__14__Impl"
    // InternalBgDsl.g:1575:1: rule__Board__Group__14__Impl : ( 'tileplacement' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1579:1: ( ( 'tileplacement' ) )
            // InternalBgDsl.g:1580:1: ( 'tileplacement' )
            {
            // InternalBgDsl.g:1580:1: ( 'tileplacement' )
            // InternalBgDsl.g:1581:2: 'tileplacement'
            {
             before(grammarAccess.getBoardAccess().getTileplacementKeyword_14()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getTileplacementKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__14__Impl"


    // $ANTLR start "rule__Board__Group__15"
    // InternalBgDsl.g:1590:1: rule__Board__Group__15 : rule__Board__Group__15__Impl rule__Board__Group__16 ;
    public final void rule__Board__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1594:1: ( rule__Board__Group__15__Impl rule__Board__Group__16 )
            // InternalBgDsl.g:1595:2: rule__Board__Group__15__Impl rule__Board__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__Board__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__15"


    // $ANTLR start "rule__Board__Group__15__Impl"
    // InternalBgDsl.g:1602:1: rule__Board__Group__15__Impl : ( '{' ) ;
    public final void rule__Board__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1606:1: ( ( '{' ) )
            // InternalBgDsl.g:1607:1: ( '{' )
            {
            // InternalBgDsl.g:1607:1: ( '{' )
            // InternalBgDsl.g:1608:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__15__Impl"


    // $ANTLR start "rule__Board__Group__16"
    // InternalBgDsl.g:1617:1: rule__Board__Group__16 : rule__Board__Group__16__Impl rule__Board__Group__17 ;
    public final void rule__Board__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1621:1: ( rule__Board__Group__16__Impl rule__Board__Group__17 )
            // InternalBgDsl.g:1622:2: rule__Board__Group__16__Impl rule__Board__Group__17
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__16"


    // $ANTLR start "rule__Board__Group__16__Impl"
    // InternalBgDsl.g:1629:1: rule__Board__Group__16__Impl : ( ( rule__Board__TileplacementAssignment_16 ) ) ;
    public final void rule__Board__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1633:1: ( ( ( rule__Board__TileplacementAssignment_16 ) ) )
            // InternalBgDsl.g:1634:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            {
            // InternalBgDsl.g:1634:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            // InternalBgDsl.g:1635:2: ( rule__Board__TileplacementAssignment_16 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_16()); 
            // InternalBgDsl.g:1636:2: ( rule__Board__TileplacementAssignment_16 )
            // InternalBgDsl.g:1636:3: rule__Board__TileplacementAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Board__TileplacementAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getTileplacementAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__16__Impl"


    // $ANTLR start "rule__Board__Group__17"
    // InternalBgDsl.g:1644:1: rule__Board__Group__17 : rule__Board__Group__17__Impl rule__Board__Group__18 ;
    public final void rule__Board__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1648:1: ( rule__Board__Group__17__Impl rule__Board__Group__18 )
            // InternalBgDsl.g:1649:2: rule__Board__Group__17__Impl rule__Board__Group__18
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__17"


    // $ANTLR start "rule__Board__Group__17__Impl"
    // InternalBgDsl.g:1656:1: rule__Board__Group__17__Impl : ( ( rule__Board__Group_17__0 )* ) ;
    public final void rule__Board__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1660:1: ( ( ( rule__Board__Group_17__0 )* ) )
            // InternalBgDsl.g:1661:1: ( ( rule__Board__Group_17__0 )* )
            {
            // InternalBgDsl.g:1661:1: ( ( rule__Board__Group_17__0 )* )
            // InternalBgDsl.g:1662:2: ( rule__Board__Group_17__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_17()); 
            // InternalBgDsl.g:1663:2: ( rule__Board__Group_17__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBgDsl.g:1663:3: rule__Board__Group_17__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Board__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__17__Impl"


    // $ANTLR start "rule__Board__Group__18"
    // InternalBgDsl.g:1671:1: rule__Board__Group__18 : rule__Board__Group__18__Impl rule__Board__Group__19 ;
    public final void rule__Board__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1675:1: ( rule__Board__Group__18__Impl rule__Board__Group__19 )
            // InternalBgDsl.g:1676:2: rule__Board__Group__18__Impl rule__Board__Group__19
            {
            pushFollow(FOLLOW_20);
            rule__Board__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__18"


    // $ANTLR start "rule__Board__Group__18__Impl"
    // InternalBgDsl.g:1683:1: rule__Board__Group__18__Impl : ( '}' ) ;
    public final void rule__Board__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1687:1: ( ( '}' ) )
            // InternalBgDsl.g:1688:1: ( '}' )
            {
            // InternalBgDsl.g:1688:1: ( '}' )
            // InternalBgDsl.g:1689:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__18__Impl"


    // $ANTLR start "rule__Board__Group__19"
    // InternalBgDsl.g:1698:1: rule__Board__Group__19 : rule__Board__Group__19__Impl ;
    public final void rule__Board__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1702:1: ( rule__Board__Group__19__Impl )
            // InternalBgDsl.g:1703:2: rule__Board__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__19"


    // $ANTLR start "rule__Board__Group__19__Impl"
    // InternalBgDsl.g:1709:1: rule__Board__Group__19__Impl : ( '}' ) ;
    public final void rule__Board__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1713:1: ( ( '}' ) )
            // InternalBgDsl.g:1714:1: ( '}' )
            {
            // InternalBgDsl.g:1714:1: ( '}' )
            // InternalBgDsl.g:1715:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__19__Impl"


    // $ANTLR start "rule__Board__Group_10__0"
    // InternalBgDsl.g:1725:1: rule__Board__Group_10__0 : rule__Board__Group_10__0__Impl rule__Board__Group_10__1 ;
    public final void rule__Board__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1729:1: ( rule__Board__Group_10__0__Impl rule__Board__Group_10__1 )
            // InternalBgDsl.g:1730:2: rule__Board__Group_10__0__Impl rule__Board__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Board__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_10__0"


    // $ANTLR start "rule__Board__Group_10__0__Impl"
    // InternalBgDsl.g:1737:1: rule__Board__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1741:1: ( ( ',' ) )
            // InternalBgDsl.g:1742:1: ( ',' )
            {
            // InternalBgDsl.g:1742:1: ( ',' )
            // InternalBgDsl.g:1743:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_10__0__Impl"


    // $ANTLR start "rule__Board__Group_10__1"
    // InternalBgDsl.g:1752:1: rule__Board__Group_10__1 : rule__Board__Group_10__1__Impl ;
    public final void rule__Board__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1756:1: ( rule__Board__Group_10__1__Impl )
            // InternalBgDsl.g:1757:2: rule__Board__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_10__1"


    // $ANTLR start "rule__Board__Group_10__1__Impl"
    // InternalBgDsl.g:1763:1: rule__Board__Group_10__1__Impl : ( ( rule__Board__TilesAssignment_10_1 ) ) ;
    public final void rule__Board__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1767:1: ( ( ( rule__Board__TilesAssignment_10_1 ) ) )
            // InternalBgDsl.g:1768:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:1768:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            // InternalBgDsl.g:1769:2: ( rule__Board__TilesAssignment_10_1 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 
            // InternalBgDsl.g:1770:2: ( rule__Board__TilesAssignment_10_1 )
            // InternalBgDsl.g:1770:3: rule__Board__TilesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__TilesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_10__1__Impl"


    // $ANTLR start "rule__Board__Group_12__0"
    // InternalBgDsl.g:1779:1: rule__Board__Group_12__0 : rule__Board__Group_12__0__Impl rule__Board__Group_12__1 ;
    public final void rule__Board__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1783:1: ( rule__Board__Group_12__0__Impl rule__Board__Group_12__1 )
            // InternalBgDsl.g:1784:2: rule__Board__Group_12__0__Impl rule__Board__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__0"


    // $ANTLR start "rule__Board__Group_12__0__Impl"
    // InternalBgDsl.g:1791:1: rule__Board__Group_12__0__Impl : ( 'legalMovesPipeline' ) ;
    public final void rule__Board__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1795:1: ( ( 'legalMovesPipeline' ) )
            // InternalBgDsl.g:1796:1: ( 'legalMovesPipeline' )
            {
            // InternalBgDsl.g:1796:1: ( 'legalMovesPipeline' )
            // InternalBgDsl.g:1797:2: 'legalMovesPipeline'
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__0__Impl"


    // $ANTLR start "rule__Board__Group_12__1"
    // InternalBgDsl.g:1806:1: rule__Board__Group_12__1 : rule__Board__Group_12__1__Impl rule__Board__Group_12__2 ;
    public final void rule__Board__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1810:1: ( rule__Board__Group_12__1__Impl rule__Board__Group_12__2 )
            // InternalBgDsl.g:1811:2: rule__Board__Group_12__1__Impl rule__Board__Group_12__2
            {
            pushFollow(FOLLOW_21);
            rule__Board__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__1"


    // $ANTLR start "rule__Board__Group_12__1__Impl"
    // InternalBgDsl.g:1818:1: rule__Board__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1822:1: ( ( '{' ) )
            // InternalBgDsl.g:1823:1: ( '{' )
            {
            // InternalBgDsl.g:1823:1: ( '{' )
            // InternalBgDsl.g:1824:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__1__Impl"


    // $ANTLR start "rule__Board__Group_12__2"
    // InternalBgDsl.g:1833:1: rule__Board__Group_12__2 : rule__Board__Group_12__2__Impl rule__Board__Group_12__3 ;
    public final void rule__Board__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1837:1: ( rule__Board__Group_12__2__Impl rule__Board__Group_12__3 )
            // InternalBgDsl.g:1838:2: rule__Board__Group_12__2__Impl rule__Board__Group_12__3
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__2"


    // $ANTLR start "rule__Board__Group_12__2__Impl"
    // InternalBgDsl.g:1845:1: rule__Board__Group_12__2__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) ;
    public final void rule__Board__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1849:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) )
            // InternalBgDsl.g:1850:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            {
            // InternalBgDsl.g:1850:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            // InternalBgDsl.g:1851:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_2()); 
            // InternalBgDsl.g:1852:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            // InternalBgDsl.g:1852:3: rule__Board__LegalMovesPipelineAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Board__LegalMovesPipelineAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__2__Impl"


    // $ANTLR start "rule__Board__Group_12__3"
    // InternalBgDsl.g:1860:1: rule__Board__Group_12__3 : rule__Board__Group_12__3__Impl rule__Board__Group_12__4 ;
    public final void rule__Board__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1864:1: ( rule__Board__Group_12__3__Impl rule__Board__Group_12__4 )
            // InternalBgDsl.g:1865:2: rule__Board__Group_12__3__Impl rule__Board__Group_12__4
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__3"


    // $ANTLR start "rule__Board__Group_12__3__Impl"
    // InternalBgDsl.g:1872:1: rule__Board__Group_12__3__Impl : ( ( rule__Board__Group_12_3__0 )* ) ;
    public final void rule__Board__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1876:1: ( ( ( rule__Board__Group_12_3__0 )* ) )
            // InternalBgDsl.g:1877:1: ( ( rule__Board__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:1877:1: ( ( rule__Board__Group_12_3__0 )* )
            // InternalBgDsl.g:1878:2: ( rule__Board__Group_12_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_12_3()); 
            // InternalBgDsl.g:1879:2: ( rule__Board__Group_12_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBgDsl.g:1879:3: rule__Board__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Board__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__3__Impl"


    // $ANTLR start "rule__Board__Group_12__4"
    // InternalBgDsl.g:1887:1: rule__Board__Group_12__4 : rule__Board__Group_12__4__Impl ;
    public final void rule__Board__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1891:1: ( rule__Board__Group_12__4__Impl )
            // InternalBgDsl.g:1892:2: rule__Board__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__4"


    // $ANTLR start "rule__Board__Group_12__4__Impl"
    // InternalBgDsl.g:1898:1: rule__Board__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1902:1: ( ( '}' ) )
            // InternalBgDsl.g:1903:1: ( '}' )
            {
            // InternalBgDsl.g:1903:1: ( '}' )
            // InternalBgDsl.g:1904:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12__4__Impl"


    // $ANTLR start "rule__Board__Group_12_3__0"
    // InternalBgDsl.g:1914:1: rule__Board__Group_12_3__0 : rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 ;
    public final void rule__Board__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1918:1: ( rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 )
            // InternalBgDsl.g:1919:2: rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Board__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12_3__0"


    // $ANTLR start "rule__Board__Group_12_3__0__Impl"
    // InternalBgDsl.g:1926:1: rule__Board__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1930:1: ( ( ',' ) )
            // InternalBgDsl.g:1931:1: ( ',' )
            {
            // InternalBgDsl.g:1931:1: ( ',' )
            // InternalBgDsl.g:1932:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_12_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12_3__0__Impl"


    // $ANTLR start "rule__Board__Group_12_3__1"
    // InternalBgDsl.g:1941:1: rule__Board__Group_12_3__1 : rule__Board__Group_12_3__1__Impl ;
    public final void rule__Board__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1945:1: ( rule__Board__Group_12_3__1__Impl )
            // InternalBgDsl.g:1946:2: rule__Board__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12_3__1"


    // $ANTLR start "rule__Board__Group_12_3__1__Impl"
    // InternalBgDsl.g:1952:1: rule__Board__Group_12_3__1__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) ;
    public final void rule__Board__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1956:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:1957:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:1957:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            // InternalBgDsl.g:1958:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_3_1()); 
            // InternalBgDsl.g:1959:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            // InternalBgDsl.g:1959:3: rule__Board__LegalMovesPipelineAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__LegalMovesPipelineAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_12_3__1__Impl"


    // $ANTLR start "rule__Board__Group_13__0"
    // InternalBgDsl.g:1968:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1972:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBgDsl.g:1973:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__0"


    // $ANTLR start "rule__Board__Group_13__0__Impl"
    // InternalBgDsl.g:1980:1: rule__Board__Group_13__0__Impl : ( 'effectPipeline' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1984:1: ( ( 'effectPipeline' ) )
            // InternalBgDsl.g:1985:1: ( 'effectPipeline' )
            {
            // InternalBgDsl.g:1985:1: ( 'effectPipeline' )
            // InternalBgDsl.g:1986:2: 'effectPipeline'
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__0__Impl"


    // $ANTLR start "rule__Board__Group_13__1"
    // InternalBgDsl.g:1995:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl rule__Board__Group_13__2 ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1999:1: ( rule__Board__Group_13__1__Impl rule__Board__Group_13__2 )
            // InternalBgDsl.g:2000:2: rule__Board__Group_13__1__Impl rule__Board__Group_13__2
            {
            pushFollow(FOLLOW_22);
            rule__Board__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__1"


    // $ANTLR start "rule__Board__Group_13__1__Impl"
    // InternalBgDsl.g:2007:1: rule__Board__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2011:1: ( ( '{' ) )
            // InternalBgDsl.g:2012:1: ( '{' )
            {
            // InternalBgDsl.g:2012:1: ( '{' )
            // InternalBgDsl.g:2013:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__1__Impl"


    // $ANTLR start "rule__Board__Group_13__2"
    // InternalBgDsl.g:2022:1: rule__Board__Group_13__2 : rule__Board__Group_13__2__Impl rule__Board__Group_13__3 ;
    public final void rule__Board__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2026:1: ( rule__Board__Group_13__2__Impl rule__Board__Group_13__3 )
            // InternalBgDsl.g:2027:2: rule__Board__Group_13__2__Impl rule__Board__Group_13__3
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__2"


    // $ANTLR start "rule__Board__Group_13__2__Impl"
    // InternalBgDsl.g:2034:1: rule__Board__Group_13__2__Impl : ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) ;
    public final void rule__Board__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2038:1: ( ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) )
            // InternalBgDsl.g:2039:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            {
            // InternalBgDsl.g:2039:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            // InternalBgDsl.g:2040:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_2()); 
            // InternalBgDsl.g:2041:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            // InternalBgDsl.g:2041:3: rule__Board__EffectPipelineAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Board__EffectPipelineAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__2__Impl"


    // $ANTLR start "rule__Board__Group_13__3"
    // InternalBgDsl.g:2049:1: rule__Board__Group_13__3 : rule__Board__Group_13__3__Impl rule__Board__Group_13__4 ;
    public final void rule__Board__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2053:1: ( rule__Board__Group_13__3__Impl rule__Board__Group_13__4 )
            // InternalBgDsl.g:2054:2: rule__Board__Group_13__3__Impl rule__Board__Group_13__4
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__3"


    // $ANTLR start "rule__Board__Group_13__3__Impl"
    // InternalBgDsl.g:2061:1: rule__Board__Group_13__3__Impl : ( ( rule__Board__Group_13_3__0 )* ) ;
    public final void rule__Board__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2065:1: ( ( ( rule__Board__Group_13_3__0 )* ) )
            // InternalBgDsl.g:2066:1: ( ( rule__Board__Group_13_3__0 )* )
            {
            // InternalBgDsl.g:2066:1: ( ( rule__Board__Group_13_3__0 )* )
            // InternalBgDsl.g:2067:2: ( rule__Board__Group_13_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_13_3()); 
            // InternalBgDsl.g:2068:2: ( rule__Board__Group_13_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBgDsl.g:2068:3: rule__Board__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Board__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__3__Impl"


    // $ANTLR start "rule__Board__Group_13__4"
    // InternalBgDsl.g:2076:1: rule__Board__Group_13__4 : rule__Board__Group_13__4__Impl ;
    public final void rule__Board__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2080:1: ( rule__Board__Group_13__4__Impl )
            // InternalBgDsl.g:2081:2: rule__Board__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__4"


    // $ANTLR start "rule__Board__Group_13__4__Impl"
    // InternalBgDsl.g:2087:1: rule__Board__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2091:1: ( ( '}' ) )
            // InternalBgDsl.g:2092:1: ( '}' )
            {
            // InternalBgDsl.g:2092:1: ( '}' )
            // InternalBgDsl.g:2093:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__4__Impl"


    // $ANTLR start "rule__Board__Group_13_3__0"
    // InternalBgDsl.g:2103:1: rule__Board__Group_13_3__0 : rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 ;
    public final void rule__Board__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2107:1: ( rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 )
            // InternalBgDsl.g:2108:2: rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Board__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__0"


    // $ANTLR start "rule__Board__Group_13_3__0__Impl"
    // InternalBgDsl.g:2115:1: rule__Board__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2119:1: ( ( ',' ) )
            // InternalBgDsl.g:2120:1: ( ',' )
            {
            // InternalBgDsl.g:2120:1: ( ',' )
            // InternalBgDsl.g:2121:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__0__Impl"


    // $ANTLR start "rule__Board__Group_13_3__1"
    // InternalBgDsl.g:2130:1: rule__Board__Group_13_3__1 : rule__Board__Group_13_3__1__Impl ;
    public final void rule__Board__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2134:1: ( rule__Board__Group_13_3__1__Impl )
            // InternalBgDsl.g:2135:2: rule__Board__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__1"


    // $ANTLR start "rule__Board__Group_13_3__1__Impl"
    // InternalBgDsl.g:2141:1: rule__Board__Group_13_3__1__Impl : ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) ;
    public final void rule__Board__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2145:1: ( ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) )
            // InternalBgDsl.g:2146:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            {
            // InternalBgDsl.g:2146:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            // InternalBgDsl.g:2147:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_3_1()); 
            // InternalBgDsl.g:2148:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            // InternalBgDsl.g:2148:3: rule__Board__EffectPipelineAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__EffectPipelineAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__1__Impl"


    // $ANTLR start "rule__Board__Group_17__0"
    // InternalBgDsl.g:2157:1: rule__Board__Group_17__0 : rule__Board__Group_17__0__Impl rule__Board__Group_17__1 ;
    public final void rule__Board__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2161:1: ( rule__Board__Group_17__0__Impl rule__Board__Group_17__1 )
            // InternalBgDsl.g:2162:2: rule__Board__Group_17__0__Impl rule__Board__Group_17__1
            {
            pushFollow(FOLLOW_19);
            rule__Board__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__0"


    // $ANTLR start "rule__Board__Group_17__0__Impl"
    // InternalBgDsl.g:2169:1: rule__Board__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2173:1: ( ( ',' ) )
            // InternalBgDsl.g:2174:1: ( ',' )
            {
            // InternalBgDsl.g:2174:1: ( ',' )
            // InternalBgDsl.g:2175:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_17_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__0__Impl"


    // $ANTLR start "rule__Board__Group_17__1"
    // InternalBgDsl.g:2184:1: rule__Board__Group_17__1 : rule__Board__Group_17__1__Impl ;
    public final void rule__Board__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2188:1: ( rule__Board__Group_17__1__Impl )
            // InternalBgDsl.g:2189:2: rule__Board__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__1"


    // $ANTLR start "rule__Board__Group_17__1__Impl"
    // InternalBgDsl.g:2195:1: rule__Board__Group_17__1__Impl : ( ( rule__Board__TileplacementAssignment_17_1 ) ) ;
    public final void rule__Board__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2199:1: ( ( ( rule__Board__TileplacementAssignment_17_1 ) ) )
            // InternalBgDsl.g:2200:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            {
            // InternalBgDsl.g:2200:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            // InternalBgDsl.g:2201:2: ( rule__Board__TileplacementAssignment_17_1 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_17_1()); 
            // InternalBgDsl.g:2202:2: ( rule__Board__TileplacementAssignment_17_1 )
            // InternalBgDsl.g:2202:3: rule__Board__TileplacementAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__TileplacementAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getTileplacementAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__1__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalBgDsl.g:2211:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2215:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalBgDsl.g:2216:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalBgDsl.g:2223:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2227:1: ( ( 'Player' ) )
            // InternalBgDsl.g:2228:1: ( 'Player' )
            {
            // InternalBgDsl.g:2228:1: ( 'Player' )
            // InternalBgDsl.g:2229:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalBgDsl.g:2238:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2242:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalBgDsl.g:2243:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalBgDsl.g:2250:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2254:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalBgDsl.g:2255:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:2255:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalBgDsl.g:2256:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:2257:2: ( rule__Player__NameAssignment_1 )
            // InternalBgDsl.g:2257:3: rule__Player__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalBgDsl.g:2265:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2269:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalBgDsl.g:2270:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Player__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalBgDsl.g:2277:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2281:1: ( ( '{' ) )
            // InternalBgDsl.g:2282:1: ( '{' )
            {
            // InternalBgDsl.g:2282:1: ( '{' )
            // InternalBgDsl.g:2283:2: '{'
            {
             before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // InternalBgDsl.g:2292:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2296:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalBgDsl.g:2297:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // InternalBgDsl.g:2304:1: rule__Player__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2308:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2309:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2309:1: ( 'hexColor' )
            // InternalBgDsl.g:2310:2: 'hexColor'
            {
             before(grammarAccess.getPlayerAccess().getHexColorKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getHexColorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // InternalBgDsl.g:2319:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2323:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalBgDsl.g:2324:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Player__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // InternalBgDsl.g:2331:1: rule__Player__Group__4__Impl : ( ( rule__Player__HexColorAssignment_4 ) ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2335:1: ( ( ( rule__Player__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2336:1: ( ( rule__Player__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2336:1: ( ( rule__Player__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2337:2: ( rule__Player__HexColorAssignment_4 )
            {
             before(grammarAccess.getPlayerAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2338:2: ( rule__Player__HexColorAssignment_4 )
            // InternalBgDsl.g:2338:3: rule__Player__HexColorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Player__HexColorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getHexColorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Player__Group__5"
    // InternalBgDsl.g:2346:1: rule__Player__Group__5 : rule__Player__Group__5__Impl ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2350:1: ( rule__Player__Group__5__Impl )
            // InternalBgDsl.g:2351:2: rule__Player__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5"


    // $ANTLR start "rule__Player__Group__5__Impl"
    // InternalBgDsl.g:2357:1: rule__Player__Group__5__Impl : ( '}' ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2361:1: ( ( '}' ) )
            // InternalBgDsl.g:2362:1: ( '}' )
            {
            // InternalBgDsl.g:2362:1: ( '}' )
            // InternalBgDsl.g:2363:2: '}'
            {
             before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__0"
    // InternalBgDsl.g:2373:1: rule__TurnPolicy__Group__0 : rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 ;
    public final void rule__TurnPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2377:1: ( rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 )
            // InternalBgDsl.g:2378:2: rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TurnPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__0"


    // $ANTLR start "rule__TurnPolicy__Group__0__Impl"
    // InternalBgDsl.g:2385:1: rule__TurnPolicy__Group__0__Impl : ( 'TurnPolicy' ) ;
    public final void rule__TurnPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2389:1: ( ( 'TurnPolicy' ) )
            // InternalBgDsl.g:2390:1: ( 'TurnPolicy' )
            {
            // InternalBgDsl.g:2390:1: ( 'TurnPolicy' )
            // InternalBgDsl.g:2391:2: 'TurnPolicy'
            {
             before(grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__0__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__1"
    // InternalBgDsl.g:2400:1: rule__TurnPolicy__Group__1 : rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 ;
    public final void rule__TurnPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2404:1: ( rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 )
            // InternalBgDsl.g:2405:2: rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TurnPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__1"


    // $ANTLR start "rule__TurnPolicy__Group__1__Impl"
    // InternalBgDsl.g:2412:1: rule__TurnPolicy__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2416:1: ( ( '{' ) )
            // InternalBgDsl.g:2417:1: ( '{' )
            {
            // InternalBgDsl.g:2417:1: ( '{' )
            // InternalBgDsl.g:2418:2: '{'
            {
             before(grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__1__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__2"
    // InternalBgDsl.g:2427:1: rule__TurnPolicy__Group__2 : rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 ;
    public final void rule__TurnPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2431:1: ( rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 )
            // InternalBgDsl.g:2432:2: rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__TurnPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__2"


    // $ANTLR start "rule__TurnPolicy__Group__2__Impl"
    // InternalBgDsl.g:2439:1: rule__TurnPolicy__Group__2__Impl : ( 'type' ) ;
    public final void rule__TurnPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2443:1: ( ( 'type' ) )
            // InternalBgDsl.g:2444:1: ( 'type' )
            {
            // InternalBgDsl.g:2444:1: ( 'type' )
            // InternalBgDsl.g:2445:2: 'type'
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTurnPolicyAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__2__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__3"
    // InternalBgDsl.g:2454:1: rule__TurnPolicy__Group__3 : rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 ;
    public final void rule__TurnPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2458:1: ( rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 )
            // InternalBgDsl.g:2459:2: rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__TurnPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__3"


    // $ANTLR start "rule__TurnPolicy__Group__3__Impl"
    // InternalBgDsl.g:2466:1: rule__TurnPolicy__Group__3__Impl : ( ( rule__TurnPolicy__TypeAssignment_3 ) ) ;
    public final void rule__TurnPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2470:1: ( ( ( rule__TurnPolicy__TypeAssignment_3 ) ) )
            // InternalBgDsl.g:2471:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            {
            // InternalBgDsl.g:2471:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            // InternalBgDsl.g:2472:2: ( rule__TurnPolicy__TypeAssignment_3 )
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeAssignment_3()); 
            // InternalBgDsl.g:2473:2: ( rule__TurnPolicy__TypeAssignment_3 )
            // InternalBgDsl.g:2473:3: rule__TurnPolicy__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnPolicy__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTurnPolicyAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__3__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__4"
    // InternalBgDsl.g:2481:1: rule__TurnPolicy__Group__4 : rule__TurnPolicy__Group__4__Impl ;
    public final void rule__TurnPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2485:1: ( rule__TurnPolicy__Group__4__Impl )
            // InternalBgDsl.g:2486:2: rule__TurnPolicy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnPolicy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__4"


    // $ANTLR start "rule__TurnPolicy__Group__4__Impl"
    // InternalBgDsl.g:2492:1: rule__TurnPolicy__Group__4__Impl : ( '}' ) ;
    public final void rule__TurnPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2496:1: ( ( '}' ) )
            // InternalBgDsl.g:2497:1: ( '}' )
            {
            // InternalBgDsl.g:2497:1: ( '}' )
            // InternalBgDsl.g:2498:2: '}'
            {
             before(grammarAccess.getTurnPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurnPolicyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBgDsl.g:2508:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2512:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBgDsl.g:2513:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBgDsl.g:2520:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2524:1: ( ( ( '-' )? ) )
            // InternalBgDsl.g:2525:1: ( ( '-' )? )
            {
            // InternalBgDsl.g:2525:1: ( ( '-' )? )
            // InternalBgDsl.g:2526:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBgDsl.g:2527:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:2527:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBgDsl.g:2535:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2539:1: ( rule__EInt__Group__1__Impl )
            // InternalBgDsl.g:2540:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBgDsl.g:2546:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2550:1: ( ( RULE_INT ) )
            // InternalBgDsl.g:2551:1: ( RULE_INT )
            {
            // InternalBgDsl.g:2551:1: ( RULE_INT )
            // InternalBgDsl.g:2552:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Tile__Group__0"
    // InternalBgDsl.g:2562:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2566:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalBgDsl.g:2567:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__0"


    // $ANTLR start "rule__Tile__Group__0__Impl"
    // InternalBgDsl.g:2574:1: rule__Tile__Group__0__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2578:1: ( ( 'Tile' ) )
            // InternalBgDsl.g:2579:1: ( 'Tile' )
            {
            // InternalBgDsl.g:2579:1: ( 'Tile' )
            // InternalBgDsl.g:2580:2: 'Tile'
            {
             before(grammarAccess.getTileAccess().getTileKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__0__Impl"


    // $ANTLR start "rule__Tile__Group__1"
    // InternalBgDsl.g:2589:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2593:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalBgDsl.g:2594:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__1"


    // $ANTLR start "rule__Tile__Group__1__Impl"
    // InternalBgDsl.g:2601:1: rule__Tile__Group__1__Impl : ( ( rule__Tile__TypeAssignment_1 ) ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2605:1: ( ( ( rule__Tile__TypeAssignment_1 ) ) )
            // InternalBgDsl.g:2606:1: ( ( rule__Tile__TypeAssignment_1 ) )
            {
            // InternalBgDsl.g:2606:1: ( ( rule__Tile__TypeAssignment_1 ) )
            // InternalBgDsl.g:2607:2: ( rule__Tile__TypeAssignment_1 )
            {
             before(grammarAccess.getTileAccess().getTypeAssignment_1()); 
            // InternalBgDsl.g:2608:2: ( rule__Tile__TypeAssignment_1 )
            // InternalBgDsl.g:2608:3: rule__Tile__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__1__Impl"


    // $ANTLR start "rule__Tile__Group__2"
    // InternalBgDsl.g:2616:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2620:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalBgDsl.g:2621:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Tile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__2"


    // $ANTLR start "rule__Tile__Group__2__Impl"
    // InternalBgDsl.g:2628:1: rule__Tile__Group__2__Impl : ( '{' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2632:1: ( ( '{' ) )
            // InternalBgDsl.g:2633:1: ( '{' )
            {
            // InternalBgDsl.g:2633:1: ( '{' )
            // InternalBgDsl.g:2634:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__2__Impl"


    // $ANTLR start "rule__Tile__Group__3"
    // InternalBgDsl.g:2643:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2647:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalBgDsl.g:2648:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Tile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__3"


    // $ANTLR start "rule__Tile__Group__3__Impl"
    // InternalBgDsl.g:2655:1: rule__Tile__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2659:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2660:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2660:1: ( 'hexColor' )
            // InternalBgDsl.g:2661:2: 'hexColor'
            {
             before(grammarAccess.getTileAccess().getHexColorKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getHexColorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__3__Impl"


    // $ANTLR start "rule__Tile__Group__4"
    // InternalBgDsl.g:2670:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2674:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalBgDsl.g:2675:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Tile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__4"


    // $ANTLR start "rule__Tile__Group__4__Impl"
    // InternalBgDsl.g:2682:1: rule__Tile__Group__4__Impl : ( ( rule__Tile__HexColorAssignment_4 ) ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2686:1: ( ( ( rule__Tile__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2687:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2687:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2688:2: ( rule__Tile__HexColorAssignment_4 )
            {
             before(grammarAccess.getTileAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2689:2: ( rule__Tile__HexColorAssignment_4 )
            // InternalBgDsl.g:2689:3: rule__Tile__HexColorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tile__HexColorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getHexColorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__4__Impl"


    // $ANTLR start "rule__Tile__Group__5"
    // InternalBgDsl.g:2697:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2701:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalBgDsl.g:2702:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Tile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__5"


    // $ANTLR start "rule__Tile__Group__5__Impl"
    // InternalBgDsl.g:2709:1: rule__Tile__Group__5__Impl : ( 'name' ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2713:1: ( ( 'name' ) )
            // InternalBgDsl.g:2714:1: ( 'name' )
            {
            // InternalBgDsl.g:2714:1: ( 'name' )
            // InternalBgDsl.g:2715:2: 'name'
            {
             before(grammarAccess.getTileAccess().getNameKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__5__Impl"


    // $ANTLR start "rule__Tile__Group__6"
    // InternalBgDsl.g:2724:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2728:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalBgDsl.g:2729:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Tile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__6"


    // $ANTLR start "rule__Tile__Group__6__Impl"
    // InternalBgDsl.g:2736:1: rule__Tile__Group__6__Impl : ( ( rule__Tile__NameAssignment_6 ) ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2740:1: ( ( ( rule__Tile__NameAssignment_6 ) ) )
            // InternalBgDsl.g:2741:1: ( ( rule__Tile__NameAssignment_6 ) )
            {
            // InternalBgDsl.g:2741:1: ( ( rule__Tile__NameAssignment_6 ) )
            // InternalBgDsl.g:2742:2: ( rule__Tile__NameAssignment_6 )
            {
             before(grammarAccess.getTileAccess().getNameAssignment_6()); 
            // InternalBgDsl.g:2743:2: ( rule__Tile__NameAssignment_6 )
            // InternalBgDsl.g:2743:3: rule__Tile__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Tile__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__6__Impl"


    // $ANTLR start "rule__Tile__Group__7"
    // InternalBgDsl.g:2751:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2755:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalBgDsl.g:2756:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Tile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__7"


    // $ANTLR start "rule__Tile__Group__7__Impl"
    // InternalBgDsl.g:2763:1: rule__Tile__Group__7__Impl : ( 'states' ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2767:1: ( ( 'states' ) )
            // InternalBgDsl.g:2768:1: ( 'states' )
            {
            // InternalBgDsl.g:2768:1: ( 'states' )
            // InternalBgDsl.g:2769:2: 'states'
            {
             before(grammarAccess.getTileAccess().getStatesKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getStatesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__7__Impl"


    // $ANTLR start "rule__Tile__Group__8"
    // InternalBgDsl.g:2778:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2782:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalBgDsl.g:2783:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Tile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__8"


    // $ANTLR start "rule__Tile__Group__8__Impl"
    // InternalBgDsl.g:2790:1: rule__Tile__Group__8__Impl : ( '{' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2794:1: ( ( '{' ) )
            // InternalBgDsl.g:2795:1: ( '{' )
            {
            // InternalBgDsl.g:2795:1: ( '{' )
            // InternalBgDsl.g:2796:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__8__Impl"


    // $ANTLR start "rule__Tile__Group__9"
    // InternalBgDsl.g:2805:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2809:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalBgDsl.g:2810:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__9"


    // $ANTLR start "rule__Tile__Group__9__Impl"
    // InternalBgDsl.g:2817:1: rule__Tile__Group__9__Impl : ( ( rule__Tile__StatesAssignment_9 ) ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2821:1: ( ( ( rule__Tile__StatesAssignment_9 ) ) )
            // InternalBgDsl.g:2822:1: ( ( rule__Tile__StatesAssignment_9 ) )
            {
            // InternalBgDsl.g:2822:1: ( ( rule__Tile__StatesAssignment_9 ) )
            // InternalBgDsl.g:2823:2: ( rule__Tile__StatesAssignment_9 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_9()); 
            // InternalBgDsl.g:2824:2: ( rule__Tile__StatesAssignment_9 )
            // InternalBgDsl.g:2824:3: rule__Tile__StatesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Tile__StatesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getStatesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__9__Impl"


    // $ANTLR start "rule__Tile__Group__10"
    // InternalBgDsl.g:2832:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2836:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalBgDsl.g:2837:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__10"


    // $ANTLR start "rule__Tile__Group__10__Impl"
    // InternalBgDsl.g:2844:1: rule__Tile__Group__10__Impl : ( ( rule__Tile__Group_10__0 )* ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2848:1: ( ( ( rule__Tile__Group_10__0 )* ) )
            // InternalBgDsl.g:2849:1: ( ( rule__Tile__Group_10__0 )* )
            {
            // InternalBgDsl.g:2849:1: ( ( rule__Tile__Group_10__0 )* )
            // InternalBgDsl.g:2850:2: ( rule__Tile__Group_10__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_10()); 
            // InternalBgDsl.g:2851:2: ( rule__Tile__Group_10__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBgDsl.g:2851:3: rule__Tile__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tile__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTileAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__10__Impl"


    // $ANTLR start "rule__Tile__Group__11"
    // InternalBgDsl.g:2859:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2863:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalBgDsl.g:2864:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__Tile__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__11"


    // $ANTLR start "rule__Tile__Group__11__Impl"
    // InternalBgDsl.g:2871:1: rule__Tile__Group__11__Impl : ( '}' ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2875:1: ( ( '}' ) )
            // InternalBgDsl.g:2876:1: ( '}' )
            {
            // InternalBgDsl.g:2876:1: ( '}' )
            // InternalBgDsl.g:2877:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__11__Impl"


    // $ANTLR start "rule__Tile__Group__12"
    // InternalBgDsl.g:2886:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl rule__Tile__Group__13 ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2890:1: ( rule__Tile__Group__12__Impl rule__Tile__Group__13 )
            // InternalBgDsl.g:2891:2: rule__Tile__Group__12__Impl rule__Tile__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__Tile__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__12"


    // $ANTLR start "rule__Tile__Group__12__Impl"
    // InternalBgDsl.g:2898:1: rule__Tile__Group__12__Impl : ( ( rule__Tile__Group_12__0 )? ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2902:1: ( ( ( rule__Tile__Group_12__0 )? ) )
            // InternalBgDsl.g:2903:1: ( ( rule__Tile__Group_12__0 )? )
            {
            // InternalBgDsl.g:2903:1: ( ( rule__Tile__Group_12__0 )? )
            // InternalBgDsl.g:2904:2: ( rule__Tile__Group_12__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_12()); 
            // InternalBgDsl.g:2905:2: ( rule__Tile__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:2905:3: rule__Tile__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tile__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTileAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__12__Impl"


    // $ANTLR start "rule__Tile__Group__13"
    // InternalBgDsl.g:2913:1: rule__Tile__Group__13 : rule__Tile__Group__13__Impl rule__Tile__Group__14 ;
    public final void rule__Tile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2917:1: ( rule__Tile__Group__13__Impl rule__Tile__Group__14 )
            // InternalBgDsl.g:2918:2: rule__Tile__Group__13__Impl rule__Tile__Group__14
            {
            pushFollow(FOLLOW_28);
            rule__Tile__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__13"


    // $ANTLR start "rule__Tile__Group__13__Impl"
    // InternalBgDsl.g:2925:1: rule__Tile__Group__13__Impl : ( 'initialState' ) ;
    public final void rule__Tile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2929:1: ( ( 'initialState' ) )
            // InternalBgDsl.g:2930:1: ( 'initialState' )
            {
            // InternalBgDsl.g:2930:1: ( 'initialState' )
            // InternalBgDsl.g:2931:2: 'initialState'
            {
             before(grammarAccess.getTileAccess().getInitialStateKeyword_13()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getInitialStateKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__13__Impl"


    // $ANTLR start "rule__Tile__Group__14"
    // InternalBgDsl.g:2940:1: rule__Tile__Group__14 : rule__Tile__Group__14__Impl rule__Tile__Group__15 ;
    public final void rule__Tile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2944:1: ( rule__Tile__Group__14__Impl rule__Tile__Group__15 )
            // InternalBgDsl.g:2945:2: rule__Tile__Group__14__Impl rule__Tile__Group__15
            {
            pushFollow(FOLLOW_20);
            rule__Tile__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__14"


    // $ANTLR start "rule__Tile__Group__14__Impl"
    // InternalBgDsl.g:2952:1: rule__Tile__Group__14__Impl : ( ( rule__Tile__InitialStateAssignment_14 ) ) ;
    public final void rule__Tile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2956:1: ( ( ( rule__Tile__InitialStateAssignment_14 ) ) )
            // InternalBgDsl.g:2957:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            {
            // InternalBgDsl.g:2957:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            // InternalBgDsl.g:2958:2: ( rule__Tile__InitialStateAssignment_14 )
            {
             before(grammarAccess.getTileAccess().getInitialStateAssignment_14()); 
            // InternalBgDsl.g:2959:2: ( rule__Tile__InitialStateAssignment_14 )
            // InternalBgDsl.g:2959:3: rule__Tile__InitialStateAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Tile__InitialStateAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getInitialStateAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__14__Impl"


    // $ANTLR start "rule__Tile__Group__15"
    // InternalBgDsl.g:2967:1: rule__Tile__Group__15 : rule__Tile__Group__15__Impl ;
    public final void rule__Tile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2971:1: ( rule__Tile__Group__15__Impl )
            // InternalBgDsl.g:2972:2: rule__Tile__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__15"


    // $ANTLR start "rule__Tile__Group__15__Impl"
    // InternalBgDsl.g:2978:1: rule__Tile__Group__15__Impl : ( '}' ) ;
    public final void rule__Tile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2982:1: ( ( '}' ) )
            // InternalBgDsl.g:2983:1: ( '}' )
            {
            // InternalBgDsl.g:2983:1: ( '}' )
            // InternalBgDsl.g:2984:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__15__Impl"


    // $ANTLR start "rule__Tile__Group_10__0"
    // InternalBgDsl.g:2994:1: rule__Tile__Group_10__0 : rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 ;
    public final void rule__Tile__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2998:1: ( rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 )
            // InternalBgDsl.g:2999:2: rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1
            {
            pushFollow(FOLLOW_28);
            rule__Tile__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_10__0"


    // $ANTLR start "rule__Tile__Group_10__0__Impl"
    // InternalBgDsl.g:3006:1: rule__Tile__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3010:1: ( ( ',' ) )
            // InternalBgDsl.g:3011:1: ( ',' )
            {
            // InternalBgDsl.g:3011:1: ( ',' )
            // InternalBgDsl.g:3012:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_10__0__Impl"


    // $ANTLR start "rule__Tile__Group_10__1"
    // InternalBgDsl.g:3021:1: rule__Tile__Group_10__1 : rule__Tile__Group_10__1__Impl ;
    public final void rule__Tile__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3025:1: ( rule__Tile__Group_10__1__Impl )
            // InternalBgDsl.g:3026:2: rule__Tile__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_10__1"


    // $ANTLR start "rule__Tile__Group_10__1__Impl"
    // InternalBgDsl.g:3032:1: rule__Tile__Group_10__1__Impl : ( ( rule__Tile__StatesAssignment_10_1 ) ) ;
    public final void rule__Tile__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3036:1: ( ( ( rule__Tile__StatesAssignment_10_1 ) ) )
            // InternalBgDsl.g:3037:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:3037:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            // InternalBgDsl.g:3038:2: ( rule__Tile__StatesAssignment_10_1 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_10_1()); 
            // InternalBgDsl.g:3039:2: ( rule__Tile__StatesAssignment_10_1 )
            // InternalBgDsl.g:3039:3: rule__Tile__StatesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__StatesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getStatesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_10__1__Impl"


    // $ANTLR start "rule__Tile__Group_12__0"
    // InternalBgDsl.g:3048:1: rule__Tile__Group_12__0 : rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 ;
    public final void rule__Tile__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3052:1: ( rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 )
            // InternalBgDsl.g:3053:2: rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Tile__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__0"


    // $ANTLR start "rule__Tile__Group_12__0__Impl"
    // InternalBgDsl.g:3060:1: rule__Tile__Group_12__0__Impl : ( 'transitions' ) ;
    public final void rule__Tile__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3064:1: ( ( 'transitions' ) )
            // InternalBgDsl.g:3065:1: ( 'transitions' )
            {
            // InternalBgDsl.g:3065:1: ( 'transitions' )
            // InternalBgDsl.g:3066:2: 'transitions'
            {
             before(grammarAccess.getTileAccess().getTransitionsKeyword_12_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTransitionsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__0__Impl"


    // $ANTLR start "rule__Tile__Group_12__1"
    // InternalBgDsl.g:3075:1: rule__Tile__Group_12__1 : rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 ;
    public final void rule__Tile__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3079:1: ( rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 )
            // InternalBgDsl.g:3080:2: rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2
            {
            pushFollow(FOLLOW_30);
            rule__Tile__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__1"


    // $ANTLR start "rule__Tile__Group_12__1__Impl"
    // InternalBgDsl.g:3087:1: rule__Tile__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3091:1: ( ( '{' ) )
            // InternalBgDsl.g:3092:1: ( '{' )
            {
            // InternalBgDsl.g:3092:1: ( '{' )
            // InternalBgDsl.g:3093:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__1__Impl"


    // $ANTLR start "rule__Tile__Group_12__2"
    // InternalBgDsl.g:3102:1: rule__Tile__Group_12__2 : rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 ;
    public final void rule__Tile__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3106:1: ( rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 )
            // InternalBgDsl.g:3107:2: rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__2"


    // $ANTLR start "rule__Tile__Group_12__2__Impl"
    // InternalBgDsl.g:3114:1: rule__Tile__Group_12__2__Impl : ( ( rule__Tile__TransitionsAssignment_12_2 ) ) ;
    public final void rule__Tile__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3118:1: ( ( ( rule__Tile__TransitionsAssignment_12_2 ) ) )
            // InternalBgDsl.g:3119:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            {
            // InternalBgDsl.g:3119:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            // InternalBgDsl.g:3120:2: ( rule__Tile__TransitionsAssignment_12_2 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_2()); 
            // InternalBgDsl.g:3121:2: ( rule__Tile__TransitionsAssignment_12_2 )
            // InternalBgDsl.g:3121:3: rule__Tile__TransitionsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TransitionsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTransitionsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__2__Impl"


    // $ANTLR start "rule__Tile__Group_12__3"
    // InternalBgDsl.g:3129:1: rule__Tile__Group_12__3 : rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 ;
    public final void rule__Tile__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3133:1: ( rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 )
            // InternalBgDsl.g:3134:2: rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__3"


    // $ANTLR start "rule__Tile__Group_12__3__Impl"
    // InternalBgDsl.g:3141:1: rule__Tile__Group_12__3__Impl : ( ( rule__Tile__Group_12_3__0 )* ) ;
    public final void rule__Tile__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3145:1: ( ( ( rule__Tile__Group_12_3__0 )* ) )
            // InternalBgDsl.g:3146:1: ( ( rule__Tile__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:3146:1: ( ( rule__Tile__Group_12_3__0 )* )
            // InternalBgDsl.g:3147:2: ( rule__Tile__Group_12_3__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_12_3()); 
            // InternalBgDsl.g:3148:2: ( rule__Tile__Group_12_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBgDsl.g:3148:3: rule__Tile__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tile__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTileAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__3__Impl"


    // $ANTLR start "rule__Tile__Group_12__4"
    // InternalBgDsl.g:3156:1: rule__Tile__Group_12__4 : rule__Tile__Group_12__4__Impl ;
    public final void rule__Tile__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3160:1: ( rule__Tile__Group_12__4__Impl )
            // InternalBgDsl.g:3161:2: rule__Tile__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__4"


    // $ANTLR start "rule__Tile__Group_12__4__Impl"
    // InternalBgDsl.g:3167:1: rule__Tile__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Tile__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3171:1: ( ( '}' ) )
            // InternalBgDsl.g:3172:1: ( '}' )
            {
            // InternalBgDsl.g:3172:1: ( '}' )
            // InternalBgDsl.g:3173:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12__4__Impl"


    // $ANTLR start "rule__Tile__Group_12_3__0"
    // InternalBgDsl.g:3183:1: rule__Tile__Group_12_3__0 : rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 ;
    public final void rule__Tile__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3187:1: ( rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 )
            // InternalBgDsl.g:3188:2: rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1
            {
            pushFollow(FOLLOW_30);
            rule__Tile__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12_3__0"


    // $ANTLR start "rule__Tile__Group_12_3__0__Impl"
    // InternalBgDsl.g:3195:1: rule__Tile__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3199:1: ( ( ',' ) )
            // InternalBgDsl.g:3200:1: ( ',' )
            {
            // InternalBgDsl.g:3200:1: ( ',' )
            // InternalBgDsl.g:3201:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_12_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12_3__0__Impl"


    // $ANTLR start "rule__Tile__Group_12_3__1"
    // InternalBgDsl.g:3210:1: rule__Tile__Group_12_3__1 : rule__Tile__Group_12_3__1__Impl ;
    public final void rule__Tile__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3214:1: ( rule__Tile__Group_12_3__1__Impl )
            // InternalBgDsl.g:3215:2: rule__Tile__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12_3__1"


    // $ANTLR start "rule__Tile__Group_12_3__1__Impl"
    // InternalBgDsl.g:3221:1: rule__Tile__Group_12_3__1__Impl : ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) ;
    public final void rule__Tile__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3225:1: ( ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:3226:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:3226:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            // InternalBgDsl.g:3227:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_3_1()); 
            // InternalBgDsl.g:3228:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            // InternalBgDsl.g:3228:3: rule__Tile__TransitionsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TransitionsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTransitionsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_12_3__1__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__0"
    // InternalBgDsl.g:3237:1: rule__LegalMovesPipeline__Group__0 : rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 ;
    public final void rule__LegalMovesPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3241:1: ( rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 )
            // InternalBgDsl.g:3242:2: rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__LegalMovesPipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__0"


    // $ANTLR start "rule__LegalMovesPipeline__Group__0__Impl"
    // InternalBgDsl.g:3249:1: rule__LegalMovesPipeline__Group__0__Impl : ( () ) ;
    public final void rule__LegalMovesPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3253:1: ( ( () ) )
            // InternalBgDsl.g:3254:1: ( () )
            {
            // InternalBgDsl.g:3254:1: ( () )
            // InternalBgDsl.g:3255:2: ()
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 
            // InternalBgDsl.g:3256:2: ()
            // InternalBgDsl.g:3256:3: 
            {
            }

             after(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__0__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__1"
    // InternalBgDsl.g:3264:1: rule__LegalMovesPipeline__Group__1 : rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 ;
    public final void rule__LegalMovesPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3268:1: ( rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 )
            // InternalBgDsl.g:3269:2: rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LegalMovesPipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__1"


    // $ANTLR start "rule__LegalMovesPipeline__Group__1__Impl"
    // InternalBgDsl.g:3276:1: rule__LegalMovesPipeline__Group__1__Impl : ( 'LegalMovesPipeline' ) ;
    public final void rule__LegalMovesPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3280:1: ( ( 'LegalMovesPipeline' ) )
            // InternalBgDsl.g:3281:1: ( 'LegalMovesPipeline' )
            {
            // InternalBgDsl.g:3281:1: ( 'LegalMovesPipeline' )
            // InternalBgDsl.g:3282:2: 'LegalMovesPipeline'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__1__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__2"
    // InternalBgDsl.g:3291:1: rule__LegalMovesPipeline__Group__2 : rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 ;
    public final void rule__LegalMovesPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3295:1: ( rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 )
            // InternalBgDsl.g:3296:2: rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__LegalMovesPipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__2"


    // $ANTLR start "rule__LegalMovesPipeline__Group__2__Impl"
    // InternalBgDsl.g:3303:1: rule__LegalMovesPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3307:1: ( ( '{' ) )
            // InternalBgDsl.g:3308:1: ( '{' )
            {
            // InternalBgDsl.g:3308:1: ( '{' )
            // InternalBgDsl.g:3309:2: '{'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__2__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__3"
    // InternalBgDsl.g:3318:1: rule__LegalMovesPipeline__Group__3 : rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 ;
    public final void rule__LegalMovesPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3322:1: ( rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 )
            // InternalBgDsl.g:3323:2: rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__LegalMovesPipeline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__3"


    // $ANTLR start "rule__LegalMovesPipeline__Group__3__Impl"
    // InternalBgDsl.g:3330:1: rule__LegalMovesPipeline__Group__3__Impl : ( ( rule__LegalMovesPipeline__Group_3__0 )? ) ;
    public final void rule__LegalMovesPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3334:1: ( ( ( rule__LegalMovesPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3335:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3335:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3336:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3337:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:3337:3: rule__LegalMovesPipeline__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LegalMovesPipeline__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__3__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__4"
    // InternalBgDsl.g:3345:1: rule__LegalMovesPipeline__Group__4 : rule__LegalMovesPipeline__Group__4__Impl ;
    public final void rule__LegalMovesPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3349:1: ( rule__LegalMovesPipeline__Group__4__Impl )
            // InternalBgDsl.g:3350:2: rule__LegalMovesPipeline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__4"


    // $ANTLR start "rule__LegalMovesPipeline__Group__4__Impl"
    // InternalBgDsl.g:3356:1: rule__LegalMovesPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3360:1: ( ( '}' ) )
            // InternalBgDsl.g:3361:1: ( '}' )
            {
            // InternalBgDsl.g:3361:1: ( '}' )
            // InternalBgDsl.g:3362:2: '}'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group__4__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__0"
    // InternalBgDsl.g:3372:1: rule__LegalMovesPipeline__Group_3__0 : rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3376:1: ( rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 )
            // InternalBgDsl.g:3377:2: rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__LegalMovesPipeline__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__0"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__0__Impl"
    // InternalBgDsl.g:3384:1: rule__LegalMovesPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__LegalMovesPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3388:1: ( ( 'filter' ) )
            // InternalBgDsl.g:3389:1: ( 'filter' )
            {
            // InternalBgDsl.g:3389:1: ( 'filter' )
            // InternalBgDsl.g:3390:2: 'filter'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__0__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__1"
    // InternalBgDsl.g:3399:1: rule__LegalMovesPipeline__Group_3__1 : rule__LegalMovesPipeline__Group_3__1__Impl ;
    public final void rule__LegalMovesPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3403:1: ( rule__LegalMovesPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:3404:2: rule__LegalMovesPipeline__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__1"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__1__Impl"
    // InternalBgDsl.g:3410:1: rule__LegalMovesPipeline__Group_3__1__Impl : ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3414:1: ( ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3415:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3415:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:3416:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:3417:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:3417:3: rule__LegalMovesPipeline__FilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__FilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLegalMovesPipelineAccess().getFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__1__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__0"
    // InternalBgDsl.g:3426:1: rule__EffectPipeline__Group__0 : rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 ;
    public final void rule__EffectPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3430:1: ( rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 )
            // InternalBgDsl.g:3431:2: rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EffectPipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__0"


    // $ANTLR start "rule__EffectPipeline__Group__0__Impl"
    // InternalBgDsl.g:3438:1: rule__EffectPipeline__Group__0__Impl : ( () ) ;
    public final void rule__EffectPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3442:1: ( ( () ) )
            // InternalBgDsl.g:3443:1: ( () )
            {
            // InternalBgDsl.g:3443:1: ( () )
            // InternalBgDsl.g:3444:2: ()
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 
            // InternalBgDsl.g:3445:2: ()
            // InternalBgDsl.g:3445:3: 
            {
            }

             after(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__0__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__1"
    // InternalBgDsl.g:3453:1: rule__EffectPipeline__Group__1 : rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 ;
    public final void rule__EffectPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3457:1: ( rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 )
            // InternalBgDsl.g:3458:2: rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EffectPipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__1"


    // $ANTLR start "rule__EffectPipeline__Group__1__Impl"
    // InternalBgDsl.g:3465:1: rule__EffectPipeline__Group__1__Impl : ( 'EffectPipeline' ) ;
    public final void rule__EffectPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3469:1: ( ( 'EffectPipeline' ) )
            // InternalBgDsl.g:3470:1: ( 'EffectPipeline' )
            {
            // InternalBgDsl.g:3470:1: ( 'EffectPipeline' )
            // InternalBgDsl.g:3471:2: 'EffectPipeline'
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__1__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__2"
    // InternalBgDsl.g:3480:1: rule__EffectPipeline__Group__2 : rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 ;
    public final void rule__EffectPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3484:1: ( rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 )
            // InternalBgDsl.g:3485:2: rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__EffectPipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__2"


    // $ANTLR start "rule__EffectPipeline__Group__2__Impl"
    // InternalBgDsl.g:3492:1: rule__EffectPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3496:1: ( ( '{' ) )
            // InternalBgDsl.g:3497:1: ( '{' )
            {
            // InternalBgDsl.g:3497:1: ( '{' )
            // InternalBgDsl.g:3498:2: '{'
            {
             before(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__2__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__3"
    // InternalBgDsl.g:3507:1: rule__EffectPipeline__Group__3 : rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 ;
    public final void rule__EffectPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3511:1: ( rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 )
            // InternalBgDsl.g:3512:2: rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__EffectPipeline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__3"


    // $ANTLR start "rule__EffectPipeline__Group__3__Impl"
    // InternalBgDsl.g:3519:1: rule__EffectPipeline__Group__3__Impl : ( ( rule__EffectPipeline__Group_3__0 )? ) ;
    public final void rule__EffectPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3523:1: ( ( ( rule__EffectPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3524:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3524:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3525:2: ( rule__EffectPipeline__Group_3__0 )?
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3526:2: ( rule__EffectPipeline__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:3526:3: rule__EffectPipeline__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectPipeline__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectPipelineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__3__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__4"
    // InternalBgDsl.g:3534:1: rule__EffectPipeline__Group__4 : rule__EffectPipeline__Group__4__Impl ;
    public final void rule__EffectPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3538:1: ( rule__EffectPipeline__Group__4__Impl )
            // InternalBgDsl.g:3539:2: rule__EffectPipeline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__4"


    // $ANTLR start "rule__EffectPipeline__Group__4__Impl"
    // InternalBgDsl.g:3545:1: rule__EffectPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3549:1: ( ( '}' ) )
            // InternalBgDsl.g:3550:1: ( '}' )
            {
            // InternalBgDsl.g:3550:1: ( '}' )
            // InternalBgDsl.g:3551:2: '}'
            {
             before(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group__4__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3__0"
    // InternalBgDsl.g:3561:1: rule__EffectPipeline__Group_3__0 : rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 ;
    public final void rule__EffectPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3565:1: ( rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 )
            // InternalBgDsl.g:3566:2: rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__EffectPipeline__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__0"


    // $ANTLR start "rule__EffectPipeline__Group_3__0__Impl"
    // InternalBgDsl.g:3573:1: rule__EffectPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__EffectPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3577:1: ( ( 'filter' ) )
            // InternalBgDsl.g:3578:1: ( 'filter' )
            {
            // InternalBgDsl.g:3578:1: ( 'filter' )
            // InternalBgDsl.g:3579:2: 'filter'
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__0__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3__1"
    // InternalBgDsl.g:3588:1: rule__EffectPipeline__Group_3__1 : rule__EffectPipeline__Group_3__1__Impl ;
    public final void rule__EffectPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3592:1: ( rule__EffectPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:3593:2: rule__EffectPipeline__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__1"


    // $ANTLR start "rule__EffectPipeline__Group_3__1__Impl"
    // InternalBgDsl.g:3599:1: rule__EffectPipeline__Group_3__1__Impl : ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__EffectPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3603:1: ( ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3604:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3604:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:3605:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:3606:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:3606:3: rule__EffectPipeline__FilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__FilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectPipelineAccess().getFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__1__Impl"


    // $ANTLR start "rule__TilePlacement__Group__0"
    // InternalBgDsl.g:3615:1: rule__TilePlacement__Group__0 : rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 ;
    public final void rule__TilePlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3619:1: ( rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 )
            // InternalBgDsl.g:3620:2: rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TilePlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__0"


    // $ANTLR start "rule__TilePlacement__Group__0__Impl"
    // InternalBgDsl.g:3627:1: rule__TilePlacement__Group__0__Impl : ( 'TilePlacement' ) ;
    public final void rule__TilePlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3631:1: ( ( 'TilePlacement' ) )
            // InternalBgDsl.g:3632:1: ( 'TilePlacement' )
            {
            // InternalBgDsl.g:3632:1: ( 'TilePlacement' )
            // InternalBgDsl.g:3633:2: 'TilePlacement'
            {
             before(grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__0__Impl"


    // $ANTLR start "rule__TilePlacement__Group__1"
    // InternalBgDsl.g:3642:1: rule__TilePlacement__Group__1 : rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 ;
    public final void rule__TilePlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3646:1: ( rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 )
            // InternalBgDsl.g:3647:2: rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TilePlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__1"


    // $ANTLR start "rule__TilePlacement__Group__1__Impl"
    // InternalBgDsl.g:3654:1: rule__TilePlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__TilePlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3658:1: ( ( '{' ) )
            // InternalBgDsl.g:3659:1: ( '{' )
            {
            // InternalBgDsl.g:3659:1: ( '{' )
            // InternalBgDsl.g:3660:2: '{'
            {
             before(grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__1__Impl"


    // $ANTLR start "rule__TilePlacement__Group__2"
    // InternalBgDsl.g:3669:1: rule__TilePlacement__Group__2 : rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 ;
    public final void rule__TilePlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3673:1: ( rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 )
            // InternalBgDsl.g:3674:2: rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TilePlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__2"


    // $ANTLR start "rule__TilePlacement__Group__2__Impl"
    // InternalBgDsl.g:3681:1: rule__TilePlacement__Group__2__Impl : ( 'row' ) ;
    public final void rule__TilePlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3685:1: ( ( 'row' ) )
            // InternalBgDsl.g:3686:1: ( 'row' )
            {
            // InternalBgDsl.g:3686:1: ( 'row' )
            // InternalBgDsl.g:3687:2: 'row'
            {
             before(grammarAccess.getTilePlacementAccess().getRowKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getRowKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__2__Impl"


    // $ANTLR start "rule__TilePlacement__Group__3"
    // InternalBgDsl.g:3696:1: rule__TilePlacement__Group__3 : rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 ;
    public final void rule__TilePlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3700:1: ( rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 )
            // InternalBgDsl.g:3701:2: rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__TilePlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__3"


    // $ANTLR start "rule__TilePlacement__Group__3__Impl"
    // InternalBgDsl.g:3708:1: rule__TilePlacement__Group__3__Impl : ( ( rule__TilePlacement__RowAssignment_3 ) ) ;
    public final void rule__TilePlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3712:1: ( ( ( rule__TilePlacement__RowAssignment_3 ) ) )
            // InternalBgDsl.g:3713:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            {
            // InternalBgDsl.g:3713:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            // InternalBgDsl.g:3714:2: ( rule__TilePlacement__RowAssignment_3 )
            {
             before(grammarAccess.getTilePlacementAccess().getRowAssignment_3()); 
            // InternalBgDsl.g:3715:2: ( rule__TilePlacement__RowAssignment_3 )
            // InternalBgDsl.g:3715:3: rule__TilePlacement__RowAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TilePlacement__RowAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTilePlacementAccess().getRowAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__3__Impl"


    // $ANTLR start "rule__TilePlacement__Group__4"
    // InternalBgDsl.g:3723:1: rule__TilePlacement__Group__4 : rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 ;
    public final void rule__TilePlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3727:1: ( rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 )
            // InternalBgDsl.g:3728:2: rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__TilePlacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__4"


    // $ANTLR start "rule__TilePlacement__Group__4__Impl"
    // InternalBgDsl.g:3735:1: rule__TilePlacement__Group__4__Impl : ( 'column' ) ;
    public final void rule__TilePlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3739:1: ( ( 'column' ) )
            // InternalBgDsl.g:3740:1: ( 'column' )
            {
            // InternalBgDsl.g:3740:1: ( 'column' )
            // InternalBgDsl.g:3741:2: 'column'
            {
             before(grammarAccess.getTilePlacementAccess().getColumnKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getColumnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__4__Impl"


    // $ANTLR start "rule__TilePlacement__Group__5"
    // InternalBgDsl.g:3750:1: rule__TilePlacement__Group__5 : rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 ;
    public final void rule__TilePlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3754:1: ( rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 )
            // InternalBgDsl.g:3755:2: rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__TilePlacement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__5"


    // $ANTLR start "rule__TilePlacement__Group__5__Impl"
    // InternalBgDsl.g:3762:1: rule__TilePlacement__Group__5__Impl : ( ( rule__TilePlacement__ColumnAssignment_5 ) ) ;
    public final void rule__TilePlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3766:1: ( ( ( rule__TilePlacement__ColumnAssignment_5 ) ) )
            // InternalBgDsl.g:3767:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            {
            // InternalBgDsl.g:3767:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            // InternalBgDsl.g:3768:2: ( rule__TilePlacement__ColumnAssignment_5 )
            {
             before(grammarAccess.getTilePlacementAccess().getColumnAssignment_5()); 
            // InternalBgDsl.g:3769:2: ( rule__TilePlacement__ColumnAssignment_5 )
            // InternalBgDsl.g:3769:3: rule__TilePlacement__ColumnAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TilePlacement__ColumnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTilePlacementAccess().getColumnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__5__Impl"


    // $ANTLR start "rule__TilePlacement__Group__6"
    // InternalBgDsl.g:3777:1: rule__TilePlacement__Group__6 : rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 ;
    public final void rule__TilePlacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3781:1: ( rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 )
            // InternalBgDsl.g:3782:2: rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__TilePlacement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__6"


    // $ANTLR start "rule__TilePlacement__Group__6__Impl"
    // InternalBgDsl.g:3789:1: rule__TilePlacement__Group__6__Impl : ( 'tile' ) ;
    public final void rule__TilePlacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3793:1: ( ( 'tile' ) )
            // InternalBgDsl.g:3794:1: ( 'tile' )
            {
            // InternalBgDsl.g:3794:1: ( 'tile' )
            // InternalBgDsl.g:3795:2: 'tile'
            {
             before(grammarAccess.getTilePlacementAccess().getTileKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getTileKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__6__Impl"


    // $ANTLR start "rule__TilePlacement__Group__7"
    // InternalBgDsl.g:3804:1: rule__TilePlacement__Group__7 : rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 ;
    public final void rule__TilePlacement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3808:1: ( rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 )
            // InternalBgDsl.g:3809:2: rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__TilePlacement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__7"


    // $ANTLR start "rule__TilePlacement__Group__7__Impl"
    // InternalBgDsl.g:3816:1: rule__TilePlacement__Group__7__Impl : ( ( rule__TilePlacement__TileAssignment_7 ) ) ;
    public final void rule__TilePlacement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3820:1: ( ( ( rule__TilePlacement__TileAssignment_7 ) ) )
            // InternalBgDsl.g:3821:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            {
            // InternalBgDsl.g:3821:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            // InternalBgDsl.g:3822:2: ( rule__TilePlacement__TileAssignment_7 )
            {
             before(grammarAccess.getTilePlacementAccess().getTileAssignment_7()); 
            // InternalBgDsl.g:3823:2: ( rule__TilePlacement__TileAssignment_7 )
            // InternalBgDsl.g:3823:3: rule__TilePlacement__TileAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TilePlacement__TileAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTilePlacementAccess().getTileAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__7__Impl"


    // $ANTLR start "rule__TilePlacement__Group__8"
    // InternalBgDsl.g:3831:1: rule__TilePlacement__Group__8 : rule__TilePlacement__Group__8__Impl ;
    public final void rule__TilePlacement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3835:1: ( rule__TilePlacement__Group__8__Impl )
            // InternalBgDsl.g:3836:2: rule__TilePlacement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TilePlacement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__8"


    // $ANTLR start "rule__TilePlacement__Group__8__Impl"
    // InternalBgDsl.g:3842:1: rule__TilePlacement__Group__8__Impl : ( '}' ) ;
    public final void rule__TilePlacement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3846:1: ( ( '}' ) )
            // InternalBgDsl.g:3847:1: ( '}' )
            {
            // InternalBgDsl.g:3847:1: ( '}' )
            // InternalBgDsl.g:3848:2: '}'
            {
             before(grammarAccess.getTilePlacementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTilePlacementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__Group__8__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalBgDsl.g:3858:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3862:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBgDsl.g:3863:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalBgDsl.g:3870:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3874:1: ( ( 'State' ) )
            // InternalBgDsl.g:3875:1: ( 'State' )
            {
            // InternalBgDsl.g:3875:1: ( 'State' )
            // InternalBgDsl.g:3876:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalBgDsl.g:3885:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3889:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBgDsl.g:3890:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalBgDsl.g:3897:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3901:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalBgDsl.g:3902:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:3902:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalBgDsl.g:3903:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:3904:2: ( rule__State__NameAssignment_1 )
            // InternalBgDsl.g:3904:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalBgDsl.g:3912:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3916:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBgDsl.g:3917:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalBgDsl.g:3924:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3928:1: ( ( '{' ) )
            // InternalBgDsl.g:3929:1: ( '{' )
            {
            // InternalBgDsl.g:3929:1: ( '{' )
            // InternalBgDsl.g:3930:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalBgDsl.g:3939:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3943:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBgDsl.g:3944:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalBgDsl.g:3951:1: rule__State__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3955:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:3956:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:3956:1: ( 'hexColor' )
            // InternalBgDsl.g:3957:2: 'hexColor'
            {
             before(grammarAccess.getStateAccess().getHexColorKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getHexColorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalBgDsl.g:3966:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3970:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBgDsl.g:3971:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalBgDsl.g:3978:1: rule__State__Group__4__Impl : ( ( rule__State__HexColorAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3982:1: ( ( ( rule__State__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:3983:1: ( ( rule__State__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:3983:1: ( ( rule__State__HexColorAssignment_4 ) )
            // InternalBgDsl.g:3984:2: ( rule__State__HexColorAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:3985:2: ( rule__State__HexColorAssignment_4 )
            // InternalBgDsl.g:3985:3: rule__State__HexColorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__HexColorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getHexColorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalBgDsl.g:3993:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3997:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalBgDsl.g:3998:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalBgDsl.g:4005:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4009:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalBgDsl.g:4010:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalBgDsl.g:4010:1: ( ( rule__State__Group_5__0 )? )
            // InternalBgDsl.g:4011:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalBgDsl.g:4012:2: ( rule__State__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBgDsl.g:4012:3: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // InternalBgDsl.g:4020:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4024:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalBgDsl.g:4025:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalBgDsl.g:4032:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4036:1: ( ( ( rule__State__Group_6__0 )? ) )
            // InternalBgDsl.g:4037:1: ( ( rule__State__Group_6__0 )? )
            {
            // InternalBgDsl.g:4037:1: ( ( rule__State__Group_6__0 )? )
            // InternalBgDsl.g:4038:2: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // InternalBgDsl.g:4039:2: ( rule__State__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBgDsl.g:4039:3: rule__State__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group__7"
    // InternalBgDsl.g:4047:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4051:1: ( rule__State__Group__7__Impl )
            // InternalBgDsl.g:4052:2: rule__State__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__7"


    // $ANTLR start "rule__State__Group__7__Impl"
    // InternalBgDsl.g:4058:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4062:1: ( ( '}' ) )
            // InternalBgDsl.g:4063:1: ( '}' )
            {
            // InternalBgDsl.g:4063:1: ( '}' )
            // InternalBgDsl.g:4064:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__7__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // InternalBgDsl.g:4074:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4078:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalBgDsl.g:4079:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_37);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // InternalBgDsl.g:4086:1: rule__State__Group_5__0__Impl : ( 'outbound' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4090:1: ( ( 'outbound' ) )
            // InternalBgDsl.g:4091:1: ( 'outbound' )
            {
            // InternalBgDsl.g:4091:1: ( 'outbound' )
            // InternalBgDsl.g:4092:2: 'outbound'
            {
             before(grammarAccess.getStateAccess().getOutboundKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getOutboundKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // InternalBgDsl.g:4101:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4105:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalBgDsl.g:4106:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // InternalBgDsl.g:4113:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4117:1: ( ( '(' ) )
            // InternalBgDsl.g:4118:1: ( '(' )
            {
            // InternalBgDsl.g:4118:1: ( '(' )
            // InternalBgDsl.g:4119:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5__2"
    // InternalBgDsl.g:4128:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4132:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalBgDsl.g:4133:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2"


    // $ANTLR start "rule__State__Group_5__2__Impl"
    // InternalBgDsl.g:4140:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutboundAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4144:1: ( ( ( rule__State__OutboundAssignment_5_2 ) ) )
            // InternalBgDsl.g:4145:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            {
            // InternalBgDsl.g:4145:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            // InternalBgDsl.g:4146:2: ( rule__State__OutboundAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_2()); 
            // InternalBgDsl.g:4147:2: ( rule__State__OutboundAssignment_5_2 )
            // InternalBgDsl.g:4147:3: rule__State__OutboundAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__State__OutboundAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutboundAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2__Impl"


    // $ANTLR start "rule__State__Group_5__3"
    // InternalBgDsl.g:4155:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4159:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalBgDsl.g:4160:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3"


    // $ANTLR start "rule__State__Group_5__3__Impl"
    // InternalBgDsl.g:4167:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4171:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalBgDsl.g:4172:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalBgDsl.g:4172:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalBgDsl.g:4173:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalBgDsl.g:4174:2: ( rule__State__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBgDsl.g:4174:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group_5__4"
    // InternalBgDsl.g:4182:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4186:1: ( rule__State__Group_5__4__Impl )
            // InternalBgDsl.g:4187:2: rule__State__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4"


    // $ANTLR start "rule__State__Group_5__4__Impl"
    // InternalBgDsl.g:4193:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4197:1: ( ( ')' ) )
            // InternalBgDsl.g:4198:1: ( ')' )
            {
            // InternalBgDsl.g:4198:1: ( ')' )
            // InternalBgDsl.g:4199:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4__Impl"


    // $ANTLR start "rule__State__Group_5_3__0"
    // InternalBgDsl.g:4209:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4213:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalBgDsl.g:4214:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0"


    // $ANTLR start "rule__State__Group_5_3__0__Impl"
    // InternalBgDsl.g:4221:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4225:1: ( ( ',' ) )
            // InternalBgDsl.g:4226:1: ( ',' )
            {
            // InternalBgDsl.g:4226:1: ( ',' )
            // InternalBgDsl.g:4227:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0__Impl"


    // $ANTLR start "rule__State__Group_5_3__1"
    // InternalBgDsl.g:4236:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4240:1: ( rule__State__Group_5_3__1__Impl )
            // InternalBgDsl.g:4241:2: rule__State__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1"


    // $ANTLR start "rule__State__Group_5_3__1__Impl"
    // InternalBgDsl.g:4247:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutboundAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4251:1: ( ( ( rule__State__OutboundAssignment_5_3_1 ) ) )
            // InternalBgDsl.g:4252:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            {
            // InternalBgDsl.g:4252:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            // InternalBgDsl.g:4253:2: ( rule__State__OutboundAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_3_1()); 
            // InternalBgDsl.g:4254:2: ( rule__State__OutboundAssignment_5_3_1 )
            // InternalBgDsl.g:4254:3: rule__State__OutboundAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__OutboundAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutboundAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1__Impl"


    // $ANTLR start "rule__State__Group_6__0"
    // InternalBgDsl.g:4263:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4267:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // InternalBgDsl.g:4268:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__State__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__0"


    // $ANTLR start "rule__State__Group_6__0__Impl"
    // InternalBgDsl.g:4275:1: rule__State__Group_6__0__Impl : ( 'inbound' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4279:1: ( ( 'inbound' ) )
            // InternalBgDsl.g:4280:1: ( 'inbound' )
            {
            // InternalBgDsl.g:4280:1: ( 'inbound' )
            // InternalBgDsl.g:4281:2: 'inbound'
            {
             before(grammarAccess.getStateAccess().getInboundKeyword_6_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getInboundKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__0__Impl"


    // $ANTLR start "rule__State__Group_6__1"
    // InternalBgDsl.g:4290:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl rule__State__Group_6__2 ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4294:1: ( rule__State__Group_6__1__Impl rule__State__Group_6__2 )
            // InternalBgDsl.g:4295:2: rule__State__Group_6__1__Impl rule__State__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__1"


    // $ANTLR start "rule__State__Group_6__1__Impl"
    // InternalBgDsl.g:4302:1: rule__State__Group_6__1__Impl : ( '(' ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4306:1: ( ( '(' ) )
            // InternalBgDsl.g:4307:1: ( '(' )
            {
            // InternalBgDsl.g:4307:1: ( '(' )
            // InternalBgDsl.g:4308:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__1__Impl"


    // $ANTLR start "rule__State__Group_6__2"
    // InternalBgDsl.g:4317:1: rule__State__Group_6__2 : rule__State__Group_6__2__Impl rule__State__Group_6__3 ;
    public final void rule__State__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4321:1: ( rule__State__Group_6__2__Impl rule__State__Group_6__3 )
            // InternalBgDsl.g:4322:2: rule__State__Group_6__2__Impl rule__State__Group_6__3
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__2"


    // $ANTLR start "rule__State__Group_6__2__Impl"
    // InternalBgDsl.g:4329:1: rule__State__Group_6__2__Impl : ( ( rule__State__InboundAssignment_6_2 ) ) ;
    public final void rule__State__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4333:1: ( ( ( rule__State__InboundAssignment_6_2 ) ) )
            // InternalBgDsl.g:4334:1: ( ( rule__State__InboundAssignment_6_2 ) )
            {
            // InternalBgDsl.g:4334:1: ( ( rule__State__InboundAssignment_6_2 ) )
            // InternalBgDsl.g:4335:2: ( rule__State__InboundAssignment_6_2 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_2()); 
            // InternalBgDsl.g:4336:2: ( rule__State__InboundAssignment_6_2 )
            // InternalBgDsl.g:4336:3: rule__State__InboundAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__State__InboundAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInboundAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__2__Impl"


    // $ANTLR start "rule__State__Group_6__3"
    // InternalBgDsl.g:4344:1: rule__State__Group_6__3 : rule__State__Group_6__3__Impl rule__State__Group_6__4 ;
    public final void rule__State__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4348:1: ( rule__State__Group_6__3__Impl rule__State__Group_6__4 )
            // InternalBgDsl.g:4349:2: rule__State__Group_6__3__Impl rule__State__Group_6__4
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__3"


    // $ANTLR start "rule__State__Group_6__3__Impl"
    // InternalBgDsl.g:4356:1: rule__State__Group_6__3__Impl : ( ( rule__State__Group_6_3__0 )* ) ;
    public final void rule__State__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4360:1: ( ( ( rule__State__Group_6_3__0 )* ) )
            // InternalBgDsl.g:4361:1: ( ( rule__State__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:4361:1: ( ( rule__State__Group_6_3__0 )* )
            // InternalBgDsl.g:4362:2: ( rule__State__Group_6_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_6_3()); 
            // InternalBgDsl.g:4363:2: ( rule__State__Group_6_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBgDsl.g:4363:3: rule__State__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__State__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__3__Impl"


    // $ANTLR start "rule__State__Group_6__4"
    // InternalBgDsl.g:4371:1: rule__State__Group_6__4 : rule__State__Group_6__4__Impl ;
    public final void rule__State__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4375:1: ( rule__State__Group_6__4__Impl )
            // InternalBgDsl.g:4376:2: rule__State__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__4"


    // $ANTLR start "rule__State__Group_6__4__Impl"
    // InternalBgDsl.g:4382:1: rule__State__Group_6__4__Impl : ( ')' ) ;
    public final void rule__State__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4386:1: ( ( ')' ) )
            // InternalBgDsl.g:4387:1: ( ')' )
            {
            // InternalBgDsl.g:4387:1: ( ')' )
            // InternalBgDsl.g:4388:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__4__Impl"


    // $ANTLR start "rule__State__Group_6_3__0"
    // InternalBgDsl.g:4398:1: rule__State__Group_6_3__0 : rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 ;
    public final void rule__State__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4402:1: ( rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 )
            // InternalBgDsl.g:4403:2: rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__0"


    // $ANTLR start "rule__State__Group_6_3__0__Impl"
    // InternalBgDsl.g:4410:1: rule__State__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4414:1: ( ( ',' ) )
            // InternalBgDsl.g:4415:1: ( ',' )
            {
            // InternalBgDsl.g:4415:1: ( ',' )
            // InternalBgDsl.g:4416:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__0__Impl"


    // $ANTLR start "rule__State__Group_6_3__1"
    // InternalBgDsl.g:4425:1: rule__State__Group_6_3__1 : rule__State__Group_6_3__1__Impl ;
    public final void rule__State__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4429:1: ( rule__State__Group_6_3__1__Impl )
            // InternalBgDsl.g:4430:2: rule__State__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__1"


    // $ANTLR start "rule__State__Group_6_3__1__Impl"
    // InternalBgDsl.g:4436:1: rule__State__Group_6_3__1__Impl : ( ( rule__State__InboundAssignment_6_3_1 ) ) ;
    public final void rule__State__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4440:1: ( ( ( rule__State__InboundAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:4441:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:4441:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            // InternalBgDsl.g:4442:2: ( rule__State__InboundAssignment_6_3_1 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_3_1()); 
            // InternalBgDsl.g:4443:2: ( rule__State__InboundAssignment_6_3_1 )
            // InternalBgDsl.g:4443:3: rule__State__InboundAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__InboundAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInboundAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalBgDsl.g:4452:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4456:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBgDsl.g:4457:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalBgDsl.g:4464:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4468:1: ( ( 'Transition' ) )
            // InternalBgDsl.g:4469:1: ( 'Transition' )
            {
            // InternalBgDsl.g:4469:1: ( 'Transition' )
            // InternalBgDsl.g:4470:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalBgDsl.g:4479:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4483:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBgDsl.g:4484:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalBgDsl.g:4491:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4495:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4496:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4496:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalBgDsl.g:4497:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4498:2: ( rule__Transition__NameAssignment_1 )
            // InternalBgDsl.g:4498:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalBgDsl.g:4506:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4510:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBgDsl.g:4511:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalBgDsl.g:4518:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4522:1: ( ( '{' ) )
            // InternalBgDsl.g:4523:1: ( '{' )
            {
            // InternalBgDsl.g:4523:1: ( '{' )
            // InternalBgDsl.g:4524:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalBgDsl.g:4533:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4537:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBgDsl.g:4538:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalBgDsl.g:4545:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4549:1: ( ( 'source' ) )
            // InternalBgDsl.g:4550:1: ( 'source' )
            {
            // InternalBgDsl.g:4550:1: ( 'source' )
            // InternalBgDsl.g:4551:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalBgDsl.g:4560:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4564:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalBgDsl.g:4565:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalBgDsl.g:4572:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4576:1: ( ( '(' ) )
            // InternalBgDsl.g:4577:1: ( '(' )
            {
            // InternalBgDsl.g:4577:1: ( '(' )
            // InternalBgDsl.g:4578:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalBgDsl.g:4587:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4591:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalBgDsl.g:4592:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalBgDsl.g:4599:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4603:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalBgDsl.g:4604:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalBgDsl.g:4604:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalBgDsl.g:4605:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalBgDsl.g:4606:2: ( rule__Transition__SourceAssignment_5 )
            // InternalBgDsl.g:4606:3: rule__Transition__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalBgDsl.g:4614:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4618:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalBgDsl.g:4619:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalBgDsl.g:4626:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )* ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4630:1: ( ( ( rule__Transition__Group_6__0 )* ) )
            // InternalBgDsl.g:4631:1: ( ( rule__Transition__Group_6__0 )* )
            {
            // InternalBgDsl.g:4631:1: ( ( rule__Transition__Group_6__0 )* )
            // InternalBgDsl.g:4632:2: ( rule__Transition__Group_6__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalBgDsl.g:4633:2: ( rule__Transition__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBgDsl.g:4633:3: rule__Transition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Transition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalBgDsl.g:4641:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4645:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalBgDsl.g:4646:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalBgDsl.g:4653:1: rule__Transition__Group__7__Impl : ( ')' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4657:1: ( ( ')' ) )
            // InternalBgDsl.g:4658:1: ( ')' )
            {
            // InternalBgDsl.g:4658:1: ( ')' )
            // InternalBgDsl.g:4659:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // InternalBgDsl.g:4668:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4672:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalBgDsl.g:4673:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // InternalBgDsl.g:4680:1: rule__Transition__Group__8__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4684:1: ( ( 'target' ) )
            // InternalBgDsl.g:4685:1: ( 'target' )
            {
            // InternalBgDsl.g:4685:1: ( 'target' )
            // InternalBgDsl.g:4686:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_8()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // InternalBgDsl.g:4695:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4699:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalBgDsl.g:4700:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // InternalBgDsl.g:4707:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__TargetAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4711:1: ( ( ( rule__Transition__TargetAssignment_9 ) ) )
            // InternalBgDsl.g:4712:1: ( ( rule__Transition__TargetAssignment_9 ) )
            {
            // InternalBgDsl.g:4712:1: ( ( rule__Transition__TargetAssignment_9 ) )
            // InternalBgDsl.g:4713:2: ( rule__Transition__TargetAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 
            // InternalBgDsl.g:4714:2: ( rule__Transition__TargetAssignment_9 )
            // InternalBgDsl.g:4714:3: rule__Transition__TargetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Transition__Group__10"
    // InternalBgDsl.g:4722:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4726:1: ( rule__Transition__Group__10__Impl )
            // InternalBgDsl.g:4727:2: rule__Transition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10"


    // $ANTLR start "rule__Transition__Group__10__Impl"
    // InternalBgDsl.g:4733:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4737:1: ( ( '}' ) )
            // InternalBgDsl.g:4738:1: ( '}' )
            {
            // InternalBgDsl.g:4738:1: ( '}' )
            // InternalBgDsl.g:4739:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10__Impl"


    // $ANTLR start "rule__Transition__Group_6__0"
    // InternalBgDsl.g:4749:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4753:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalBgDsl.g:4754:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0"


    // $ANTLR start "rule__Transition__Group_6__0__Impl"
    // InternalBgDsl.g:4761:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4765:1: ( ( ',' ) )
            // InternalBgDsl.g:4766:1: ( ',' )
            {
            // InternalBgDsl.g:4766:1: ( ',' )
            // InternalBgDsl.g:4767:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0__Impl"


    // $ANTLR start "rule__Transition__Group_6__1"
    // InternalBgDsl.g:4776:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4780:1: ( rule__Transition__Group_6__1__Impl )
            // InternalBgDsl.g:4781:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1"


    // $ANTLR start "rule__Transition__Group_6__1__Impl"
    // InternalBgDsl.g:4787:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4791:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // InternalBgDsl.g:4792:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // InternalBgDsl.g:4792:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // InternalBgDsl.g:4793:2: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // InternalBgDsl.g:4794:2: ( rule__Transition__SourceAssignment_6_1 )
            // InternalBgDsl.g:4794:3: rule__Transition__SourceAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1__Impl"


    // $ANTLR start "rule__PatternFilter__Group__0"
    // InternalBgDsl.g:4803:1: rule__PatternFilter__Group__0 : rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 ;
    public final void rule__PatternFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4807:1: ( rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 )
            // InternalBgDsl.g:4808:2: rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PatternFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__0"


    // $ANTLR start "rule__PatternFilter__Group__0__Impl"
    // InternalBgDsl.g:4815:1: rule__PatternFilter__Group__0__Impl : ( () ) ;
    public final void rule__PatternFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4819:1: ( ( () ) )
            // InternalBgDsl.g:4820:1: ( () )
            {
            // InternalBgDsl.g:4820:1: ( () )
            // InternalBgDsl.g:4821:2: ()
            {
             before(grammarAccess.getPatternFilterAccess().getPatternFilterAction_0()); 
            // InternalBgDsl.g:4822:2: ()
            // InternalBgDsl.g:4822:3: 
            {
            }

             after(grammarAccess.getPatternFilterAccess().getPatternFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group__1"
    // InternalBgDsl.g:4830:1: rule__PatternFilter__Group__1 : rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 ;
    public final void rule__PatternFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4834:1: ( rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 )
            // InternalBgDsl.g:4835:2: rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PatternFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__1"


    // $ANTLR start "rule__PatternFilter__Group__1__Impl"
    // InternalBgDsl.g:4842:1: rule__PatternFilter__Group__1__Impl : ( 'PatternFilter' ) ;
    public final void rule__PatternFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4846:1: ( ( 'PatternFilter' ) )
            // InternalBgDsl.g:4847:1: ( 'PatternFilter' )
            {
            // InternalBgDsl.g:4847:1: ( 'PatternFilter' )
            // InternalBgDsl.g:4848:2: 'PatternFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__1__Impl"


    // $ANTLR start "rule__PatternFilter__Group__2"
    // InternalBgDsl.g:4857:1: rule__PatternFilter__Group__2 : rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 ;
    public final void rule__PatternFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4861:1: ( rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 )
            // InternalBgDsl.g:4862:2: rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PatternFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__2"


    // $ANTLR start "rule__PatternFilter__Group__2__Impl"
    // InternalBgDsl.g:4869:1: rule__PatternFilter__Group__2__Impl : ( ( rule__PatternFilter__NameAssignment_2 ) ) ;
    public final void rule__PatternFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4873:1: ( ( ( rule__PatternFilter__NameAssignment_2 ) ) )
            // InternalBgDsl.g:4874:1: ( ( rule__PatternFilter__NameAssignment_2 ) )
            {
            // InternalBgDsl.g:4874:1: ( ( rule__PatternFilter__NameAssignment_2 ) )
            // InternalBgDsl.g:4875:2: ( rule__PatternFilter__NameAssignment_2 )
            {
             before(grammarAccess.getPatternFilterAccess().getNameAssignment_2()); 
            // InternalBgDsl.g:4876:2: ( rule__PatternFilter__NameAssignment_2 )
            // InternalBgDsl.g:4876:3: rule__PatternFilter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__2__Impl"


    // $ANTLR start "rule__PatternFilter__Group__3"
    // InternalBgDsl.g:4884:1: rule__PatternFilter__Group__3 : rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 ;
    public final void rule__PatternFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4888:1: ( rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 )
            // InternalBgDsl.g:4889:2: rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__PatternFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__3"


    // $ANTLR start "rule__PatternFilter__Group__3__Impl"
    // InternalBgDsl.g:4896:1: rule__PatternFilter__Group__3__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4900:1: ( ( '{' ) )
            // InternalBgDsl.g:4901:1: ( '{' )
            {
            // InternalBgDsl.g:4901:1: ( '{' )
            // InternalBgDsl.g:4902:2: '{'
            {
             before(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__3__Impl"


    // $ANTLR start "rule__PatternFilter__Group__4"
    // InternalBgDsl.g:4911:1: rule__PatternFilter__Group__4 : rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 ;
    public final void rule__PatternFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4915:1: ( rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 )
            // InternalBgDsl.g:4916:2: rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__PatternFilter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__4"


    // $ANTLR start "rule__PatternFilter__Group__4__Impl"
    // InternalBgDsl.g:4923:1: rule__PatternFilter__Group__4__Impl : ( ( rule__PatternFilter__Group_4__0 )? ) ;
    public final void rule__PatternFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4927:1: ( ( ( rule__PatternFilter__Group_4__0 )? ) )
            // InternalBgDsl.g:4928:1: ( ( rule__PatternFilter__Group_4__0 )? )
            {
            // InternalBgDsl.g:4928:1: ( ( rule__PatternFilter__Group_4__0 )? )
            // InternalBgDsl.g:4929:2: ( rule__PatternFilter__Group_4__0 )?
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_4()); 
            // InternalBgDsl.g:4930:2: ( rule__PatternFilter__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBgDsl.g:4930:3: rule__PatternFilter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternFilter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternFilterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__4__Impl"


    // $ANTLR start "rule__PatternFilter__Group__5"
    // InternalBgDsl.g:4938:1: rule__PatternFilter__Group__5 : rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 ;
    public final void rule__PatternFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4942:1: ( rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 )
            // InternalBgDsl.g:4943:2: rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__PatternFilter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__5"


    // $ANTLR start "rule__PatternFilter__Group__5__Impl"
    // InternalBgDsl.g:4950:1: rule__PatternFilter__Group__5__Impl : ( 'patterns' ) ;
    public final void rule__PatternFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4954:1: ( ( 'patterns' ) )
            // InternalBgDsl.g:4955:1: ( 'patterns' )
            {
            // InternalBgDsl.g:4955:1: ( 'patterns' )
            // InternalBgDsl.g:4956:2: 'patterns'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getPatternsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__5__Impl"


    // $ANTLR start "rule__PatternFilter__Group__6"
    // InternalBgDsl.g:4965:1: rule__PatternFilter__Group__6 : rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 ;
    public final void rule__PatternFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4969:1: ( rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 )
            // InternalBgDsl.g:4970:2: rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__PatternFilter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__6"


    // $ANTLR start "rule__PatternFilter__Group__6__Impl"
    // InternalBgDsl.g:4977:1: rule__PatternFilter__Group__6__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4981:1: ( ( '{' ) )
            // InternalBgDsl.g:4982:1: ( '{' )
            {
            // InternalBgDsl.g:4982:1: ( '{' )
            // InternalBgDsl.g:4983:2: '{'
            {
             before(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__6__Impl"


    // $ANTLR start "rule__PatternFilter__Group__7"
    // InternalBgDsl.g:4992:1: rule__PatternFilter__Group__7 : rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 ;
    public final void rule__PatternFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4996:1: ( rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 )
            // InternalBgDsl.g:4997:2: rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__PatternFilter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__7"


    // $ANTLR start "rule__PatternFilter__Group__7__Impl"
    // InternalBgDsl.g:5004:1: rule__PatternFilter__Group__7__Impl : ( ( rule__PatternFilter__PatternsAssignment_7 ) ) ;
    public final void rule__PatternFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5008:1: ( ( ( rule__PatternFilter__PatternsAssignment_7 ) ) )
            // InternalBgDsl.g:5009:1: ( ( rule__PatternFilter__PatternsAssignment_7 ) )
            {
            // InternalBgDsl.g:5009:1: ( ( rule__PatternFilter__PatternsAssignment_7 ) )
            // InternalBgDsl.g:5010:2: ( rule__PatternFilter__PatternsAssignment_7 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7()); 
            // InternalBgDsl.g:5011:2: ( rule__PatternFilter__PatternsAssignment_7 )
            // InternalBgDsl.g:5011:3: rule__PatternFilter__PatternsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__PatternsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__7__Impl"


    // $ANTLR start "rule__PatternFilter__Group__8"
    // InternalBgDsl.g:5019:1: rule__PatternFilter__Group__8 : rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 ;
    public final void rule__PatternFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5023:1: ( rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 )
            // InternalBgDsl.g:5024:2: rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__PatternFilter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__8"


    // $ANTLR start "rule__PatternFilter__Group__8__Impl"
    // InternalBgDsl.g:5031:1: rule__PatternFilter__Group__8__Impl : ( ( rule__PatternFilter__Group_8__0 )* ) ;
    public final void rule__PatternFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5035:1: ( ( ( rule__PatternFilter__Group_8__0 )* ) )
            // InternalBgDsl.g:5036:1: ( ( rule__PatternFilter__Group_8__0 )* )
            {
            // InternalBgDsl.g:5036:1: ( ( rule__PatternFilter__Group_8__0 )* )
            // InternalBgDsl.g:5037:2: ( rule__PatternFilter__Group_8__0 )*
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_8()); 
            // InternalBgDsl.g:5038:2: ( rule__PatternFilter__Group_8__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBgDsl.g:5038:3: rule__PatternFilter__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PatternFilter__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPatternFilterAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__8__Impl"


    // $ANTLR start "rule__PatternFilter__Group__9"
    // InternalBgDsl.g:5046:1: rule__PatternFilter__Group__9 : rule__PatternFilter__Group__9__Impl rule__PatternFilter__Group__10 ;
    public final void rule__PatternFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5050:1: ( rule__PatternFilter__Group__9__Impl rule__PatternFilter__Group__10 )
            // InternalBgDsl.g:5051:2: rule__PatternFilter__Group__9__Impl rule__PatternFilter__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__PatternFilter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__9"


    // $ANTLR start "rule__PatternFilter__Group__9__Impl"
    // InternalBgDsl.g:5058:1: rule__PatternFilter__Group__9__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5062:1: ( ( '}' ) )
            // InternalBgDsl.g:5063:1: ( '}' )
            {
            // InternalBgDsl.g:5063:1: ( '}' )
            // InternalBgDsl.g:5064:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__9__Impl"


    // $ANTLR start "rule__PatternFilter__Group__10"
    // InternalBgDsl.g:5073:1: rule__PatternFilter__Group__10 : rule__PatternFilter__Group__10__Impl ;
    public final void rule__PatternFilter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5077:1: ( rule__PatternFilter__Group__10__Impl )
            // InternalBgDsl.g:5078:2: rule__PatternFilter__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__10"


    // $ANTLR start "rule__PatternFilter__Group__10__Impl"
    // InternalBgDsl.g:5084:1: rule__PatternFilter__Group__10__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5088:1: ( ( '}' ) )
            // InternalBgDsl.g:5089:1: ( '}' )
            {
            // InternalBgDsl.g:5089:1: ( '}' )
            // InternalBgDsl.g:5090:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__10__Impl"


    // $ANTLR start "rule__PatternFilter__Group_4__0"
    // InternalBgDsl.g:5100:1: rule__PatternFilter__Group_4__0 : rule__PatternFilter__Group_4__0__Impl rule__PatternFilter__Group_4__1 ;
    public final void rule__PatternFilter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5104:1: ( rule__PatternFilter__Group_4__0__Impl rule__PatternFilter__Group_4__1 )
            // InternalBgDsl.g:5105:2: rule__PatternFilter__Group_4__0__Impl rule__PatternFilter__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__PatternFilter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_4__0"


    // $ANTLR start "rule__PatternFilter__Group_4__0__Impl"
    // InternalBgDsl.g:5112:1: rule__PatternFilter__Group_4__0__Impl : ( 'nextFilter' ) ;
    public final void rule__PatternFilter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5116:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:5117:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:5117:1: ( 'nextFilter' )
            // InternalBgDsl.g:5118:2: 'nextFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getNextFilterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_4__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group_4__1"
    // InternalBgDsl.g:5127:1: rule__PatternFilter__Group_4__1 : rule__PatternFilter__Group_4__1__Impl ;
    public final void rule__PatternFilter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5131:1: ( rule__PatternFilter__Group_4__1__Impl )
            // InternalBgDsl.g:5132:2: rule__PatternFilter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_4__1"


    // $ANTLR start "rule__PatternFilter__Group_4__1__Impl"
    // InternalBgDsl.g:5138:1: rule__PatternFilter__Group_4__1__Impl : ( ( rule__PatternFilter__NextFilterAssignment_4_1 ) ) ;
    public final void rule__PatternFilter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5142:1: ( ( ( rule__PatternFilter__NextFilterAssignment_4_1 ) ) )
            // InternalBgDsl.g:5143:1: ( ( rule__PatternFilter__NextFilterAssignment_4_1 ) )
            {
            // InternalBgDsl.g:5143:1: ( ( rule__PatternFilter__NextFilterAssignment_4_1 ) )
            // InternalBgDsl.g:5144:2: ( rule__PatternFilter__NextFilterAssignment_4_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_4_1()); 
            // InternalBgDsl.g:5145:2: ( rule__PatternFilter__NextFilterAssignment_4_1 )
            // InternalBgDsl.g:5145:3: rule__PatternFilter__NextFilterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__NextFilterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_4__1__Impl"


    // $ANTLR start "rule__PatternFilter__Group_8__0"
    // InternalBgDsl.g:5154:1: rule__PatternFilter__Group_8__0 : rule__PatternFilter__Group_8__0__Impl rule__PatternFilter__Group_8__1 ;
    public final void rule__PatternFilter__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5158:1: ( rule__PatternFilter__Group_8__0__Impl rule__PatternFilter__Group_8__1 )
            // InternalBgDsl.g:5159:2: rule__PatternFilter__Group_8__0__Impl rule__PatternFilter__Group_8__1
            {
            pushFollow(FOLLOW_42);
            rule__PatternFilter__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_8__0"


    // $ANTLR start "rule__PatternFilter__Group_8__0__Impl"
    // InternalBgDsl.g:5166:1: rule__PatternFilter__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PatternFilter__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5170:1: ( ( ',' ) )
            // InternalBgDsl.g:5171:1: ( ',' )
            {
            // InternalBgDsl.g:5171:1: ( ',' )
            // InternalBgDsl.g:5172:2: ','
            {
             before(grammarAccess.getPatternFilterAccess().getCommaKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_8__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group_8__1"
    // InternalBgDsl.g:5181:1: rule__PatternFilter__Group_8__1 : rule__PatternFilter__Group_8__1__Impl ;
    public final void rule__PatternFilter__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5185:1: ( rule__PatternFilter__Group_8__1__Impl )
            // InternalBgDsl.g:5186:2: rule__PatternFilter__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_8__1"


    // $ANTLR start "rule__PatternFilter__Group_8__1__Impl"
    // InternalBgDsl.g:5192:1: rule__PatternFilter__Group_8__1__Impl : ( ( rule__PatternFilter__PatternsAssignment_8_1 ) ) ;
    public final void rule__PatternFilter__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5196:1: ( ( ( rule__PatternFilter__PatternsAssignment_8_1 ) ) )
            // InternalBgDsl.g:5197:1: ( ( rule__PatternFilter__PatternsAssignment_8_1 ) )
            {
            // InternalBgDsl.g:5197:1: ( ( rule__PatternFilter__PatternsAssignment_8_1 ) )
            // InternalBgDsl.g:5198:2: ( rule__PatternFilter__PatternsAssignment_8_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_8_1()); 
            // InternalBgDsl.g:5199:2: ( rule__PatternFilter__PatternsAssignment_8_1 )
            // InternalBgDsl.g:5199:3: rule__PatternFilter__PatternsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__PatternsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getPatternsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_8__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalBgDsl.g:5208:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5212:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalBgDsl.g:5213:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalBgDsl.g:5220:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5224:1: ( ( 'Pattern' ) )
            // InternalBgDsl.g:5225:1: ( 'Pattern' )
            {
            // InternalBgDsl.g:5225:1: ( 'Pattern' )
            // InternalBgDsl.g:5226:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalBgDsl.g:5235:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5239:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalBgDsl.g:5240:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalBgDsl.g:5247:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5251:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalBgDsl.g:5252:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:5252:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalBgDsl.g:5253:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:5254:2: ( rule__Pattern__NameAssignment_1 )
            // InternalBgDsl.g:5254:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalBgDsl.g:5262:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5266:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalBgDsl.g:5267:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalBgDsl.g:5274:1: rule__Pattern__Group__2__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5278:1: ( ( '{' ) )
            // InternalBgDsl.g:5279:1: ( '{' )
            {
            // InternalBgDsl.g:5279:1: ( '{' )
            // InternalBgDsl.g:5280:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalBgDsl.g:5289:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5293:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalBgDsl.g:5294:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalBgDsl.g:5301:1: rule__Pattern__Group__3__Impl : ( 'relativeCoordinates' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5305:1: ( ( 'relativeCoordinates' ) )
            // InternalBgDsl.g:5306:1: ( 'relativeCoordinates' )
            {
            // InternalBgDsl.g:5306:1: ( 'relativeCoordinates' )
            // InternalBgDsl.g:5307:2: 'relativeCoordinates'
            {
             before(grammarAccess.getPatternAccess().getRelativeCoordinatesKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRelativeCoordinatesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalBgDsl.g:5316:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5320:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalBgDsl.g:5321:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalBgDsl.g:5328:1: rule__Pattern__Group__4__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5332:1: ( ( '{' ) )
            // InternalBgDsl.g:5333:1: ( '{' )
            {
            // InternalBgDsl.g:5333:1: ( '{' )
            // InternalBgDsl.g:5334:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalBgDsl.g:5343:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5347:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalBgDsl.g:5348:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalBgDsl.g:5355:1: rule__Pattern__Group__5__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_5 ) ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5359:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_5 ) ) )
            // InternalBgDsl.g:5360:1: ( ( rule__Pattern__RelativecoordinatesAssignment_5 ) )
            {
            // InternalBgDsl.g:5360:1: ( ( rule__Pattern__RelativecoordinatesAssignment_5 ) )
            // InternalBgDsl.g:5361:2: ( rule__Pattern__RelativecoordinatesAssignment_5 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_5()); 
            // InternalBgDsl.g:5362:2: ( rule__Pattern__RelativecoordinatesAssignment_5 )
            // InternalBgDsl.g:5362:3: rule__Pattern__RelativecoordinatesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RelativecoordinatesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group__6"
    // InternalBgDsl.g:5370:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5374:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalBgDsl.g:5375:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6"


    // $ANTLR start "rule__Pattern__Group__6__Impl"
    // InternalBgDsl.g:5382:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__Group_6__0 )* ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5386:1: ( ( ( rule__Pattern__Group_6__0 )* ) )
            // InternalBgDsl.g:5387:1: ( ( rule__Pattern__Group_6__0 )* )
            {
            // InternalBgDsl.g:5387:1: ( ( rule__Pattern__Group_6__0 )* )
            // InternalBgDsl.g:5388:2: ( rule__Pattern__Group_6__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_6()); 
            // InternalBgDsl.g:5389:2: ( rule__Pattern__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBgDsl.g:5389:3: rule__Pattern__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pattern__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group__7"
    // InternalBgDsl.g:5397:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5401:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalBgDsl.g:5402:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Pattern__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7"


    // $ANTLR start "rule__Pattern__Group__7__Impl"
    // InternalBgDsl.g:5409:1: rule__Pattern__Group__7__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5413:1: ( ( '}' ) )
            // InternalBgDsl.g:5414:1: ( '}' )
            {
            // InternalBgDsl.g:5414:1: ( '}' )
            // InternalBgDsl.g:5415:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7__Impl"


    // $ANTLR start "rule__Pattern__Group__8"
    // InternalBgDsl.g:5424:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5428:1: ( rule__Pattern__Group__8__Impl )
            // InternalBgDsl.g:5429:2: rule__Pattern__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8"


    // $ANTLR start "rule__Pattern__Group__8__Impl"
    // InternalBgDsl.g:5435:1: rule__Pattern__Group__8__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5439:1: ( ( '}' ) )
            // InternalBgDsl.g:5440:1: ( '}' )
            {
            // InternalBgDsl.g:5440:1: ( '}' )
            // InternalBgDsl.g:5441:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8__Impl"


    // $ANTLR start "rule__Pattern__Group_6__0"
    // InternalBgDsl.g:5451:1: rule__Pattern__Group_6__0 : rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1 ;
    public final void rule__Pattern__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5455:1: ( rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1 )
            // InternalBgDsl.g:5456:2: rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1
            {
            pushFollow(FOLLOW_44);
            rule__Pattern__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_6__0"


    // $ANTLR start "rule__Pattern__Group_6__0__Impl"
    // InternalBgDsl.g:5463:1: rule__Pattern__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5467:1: ( ( ',' ) )
            // InternalBgDsl.g:5468:1: ( ',' )
            {
            // InternalBgDsl.g:5468:1: ( ',' )
            // InternalBgDsl.g:5469:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_6__0__Impl"


    // $ANTLR start "rule__Pattern__Group_6__1"
    // InternalBgDsl.g:5478:1: rule__Pattern__Group_6__1 : rule__Pattern__Group_6__1__Impl ;
    public final void rule__Pattern__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5482:1: ( rule__Pattern__Group_6__1__Impl )
            // InternalBgDsl.g:5483:2: rule__Pattern__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_6__1"


    // $ANTLR start "rule__Pattern__Group_6__1__Impl"
    // InternalBgDsl.g:5489:1: rule__Pattern__Group_6__1__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_6_1 ) ) ;
    public final void rule__Pattern__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5493:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_6_1 ) ) )
            // InternalBgDsl.g:5494:1: ( ( rule__Pattern__RelativecoordinatesAssignment_6_1 ) )
            {
            // InternalBgDsl.g:5494:1: ( ( rule__Pattern__RelativecoordinatesAssignment_6_1 ) )
            // InternalBgDsl.g:5495:2: ( rule__Pattern__RelativecoordinatesAssignment_6_1 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_6_1()); 
            // InternalBgDsl.g:5496:2: ( rule__Pattern__RelativecoordinatesAssignment_6_1 )
            // InternalBgDsl.g:5496:3: rule__Pattern__RelativecoordinatesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RelativecoordinatesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_6__1__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__0"
    // InternalBgDsl.g:5505:1: rule__RelativeCoordinate__Group__0 : rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 ;
    public final void rule__RelativeCoordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5509:1: ( rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 )
            // InternalBgDsl.g:5510:2: rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RelativeCoordinate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__0"


    // $ANTLR start "rule__RelativeCoordinate__Group__0__Impl"
    // InternalBgDsl.g:5517:1: rule__RelativeCoordinate__Group__0__Impl : ( 'RelativeCoordinate' ) ;
    public final void rule__RelativeCoordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5521:1: ( ( 'RelativeCoordinate' ) )
            // InternalBgDsl.g:5522:1: ( 'RelativeCoordinate' )
            {
            // InternalBgDsl.g:5522:1: ( 'RelativeCoordinate' )
            // InternalBgDsl.g:5523:2: 'RelativeCoordinate'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__0__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__1"
    // InternalBgDsl.g:5532:1: rule__RelativeCoordinate__Group__1 : rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 ;
    public final void rule__RelativeCoordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5536:1: ( rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 )
            // InternalBgDsl.g:5537:2: rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__RelativeCoordinate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__1"


    // $ANTLR start "rule__RelativeCoordinate__Group__1__Impl"
    // InternalBgDsl.g:5544:1: rule__RelativeCoordinate__Group__1__Impl : ( '{' ) ;
    public final void rule__RelativeCoordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5548:1: ( ( '{' ) )
            // InternalBgDsl.g:5549:1: ( '{' )
            {
            // InternalBgDsl.g:5549:1: ( '{' )
            // InternalBgDsl.g:5550:2: '{'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelativeCoordinateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__1__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__2"
    // InternalBgDsl.g:5559:1: rule__RelativeCoordinate__Group__2 : rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 ;
    public final void rule__RelativeCoordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5563:1: ( rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 )
            // InternalBgDsl.g:5564:2: rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RelativeCoordinate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__2"


    // $ANTLR start "rule__RelativeCoordinate__Group__2__Impl"
    // InternalBgDsl.g:5571:1: rule__RelativeCoordinate__Group__2__Impl : ( 'x' ) ;
    public final void rule__RelativeCoordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5575:1: ( ( 'x' ) )
            // InternalBgDsl.g:5576:1: ( 'x' )
            {
            // InternalBgDsl.g:5576:1: ( 'x' )
            // InternalBgDsl.g:5577:2: 'x'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRelativeCoordinateAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__2__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__3"
    // InternalBgDsl.g:5586:1: rule__RelativeCoordinate__Group__3 : rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 ;
    public final void rule__RelativeCoordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5590:1: ( rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 )
            // InternalBgDsl.g:5591:2: rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__RelativeCoordinate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__3"


    // $ANTLR start "rule__RelativeCoordinate__Group__3__Impl"
    // InternalBgDsl.g:5598:1: rule__RelativeCoordinate__Group__3__Impl : ( ( rule__RelativeCoordinate__XAssignment_3 ) ) ;
    public final void rule__RelativeCoordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5602:1: ( ( ( rule__RelativeCoordinate__XAssignment_3 ) ) )
            // InternalBgDsl.g:5603:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            {
            // InternalBgDsl.g:5603:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            // InternalBgDsl.g:5604:2: ( rule__RelativeCoordinate__XAssignment_3 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXAssignment_3()); 
            // InternalBgDsl.g:5605:2: ( rule__RelativeCoordinate__XAssignment_3 )
            // InternalBgDsl.g:5605:3: rule__RelativeCoordinate__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelativeCoordinateAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__3__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__4"
    // InternalBgDsl.g:5613:1: rule__RelativeCoordinate__Group__4 : rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 ;
    public final void rule__RelativeCoordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5617:1: ( rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 )
            // InternalBgDsl.g:5618:2: rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__RelativeCoordinate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__4"


    // $ANTLR start "rule__RelativeCoordinate__Group__4__Impl"
    // InternalBgDsl.g:5625:1: rule__RelativeCoordinate__Group__4__Impl : ( 'y' ) ;
    public final void rule__RelativeCoordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5629:1: ( ( 'y' ) )
            // InternalBgDsl.g:5630:1: ( 'y' )
            {
            // InternalBgDsl.g:5630:1: ( 'y' )
            // InternalBgDsl.g:5631:2: 'y'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRelativeCoordinateAccess().getYKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__4__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__5"
    // InternalBgDsl.g:5640:1: rule__RelativeCoordinate__Group__5 : rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 ;
    public final void rule__RelativeCoordinate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5644:1: ( rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 )
            // InternalBgDsl.g:5645:2: rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__RelativeCoordinate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__5"


    // $ANTLR start "rule__RelativeCoordinate__Group__5__Impl"
    // InternalBgDsl.g:5652:1: rule__RelativeCoordinate__Group__5__Impl : ( ( rule__RelativeCoordinate__YAssignment_5 ) ) ;
    public final void rule__RelativeCoordinate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5656:1: ( ( ( rule__RelativeCoordinate__YAssignment_5 ) ) )
            // InternalBgDsl.g:5657:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            {
            // InternalBgDsl.g:5657:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            // InternalBgDsl.g:5658:2: ( rule__RelativeCoordinate__YAssignment_5 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYAssignment_5()); 
            // InternalBgDsl.g:5659:2: ( rule__RelativeCoordinate__YAssignment_5 )
            // InternalBgDsl.g:5659:3: rule__RelativeCoordinate__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelativeCoordinateAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__5__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__6"
    // InternalBgDsl.g:5667:1: rule__RelativeCoordinate__Group__6 : rule__RelativeCoordinate__Group__6__Impl ;
    public final void rule__RelativeCoordinate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5671:1: ( rule__RelativeCoordinate__Group__6__Impl )
            // InternalBgDsl.g:5672:2: rule__RelativeCoordinate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeCoordinate__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__6"


    // $ANTLR start "rule__RelativeCoordinate__Group__6__Impl"
    // InternalBgDsl.g:5678:1: rule__RelativeCoordinate__Group__6__Impl : ( '}' ) ;
    public final void rule__RelativeCoordinate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5682:1: ( ( '}' ) )
            // InternalBgDsl.g:5683:1: ( '}' )
            {
            // InternalBgDsl.g:5683:1: ( '}' )
            // InternalBgDsl.g:5684:2: '}'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelativeCoordinateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__Group__6__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalBgDsl.g:5694:1: rule__Game__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5698:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5699:2: ( ruleEString )
            {
            // InternalBgDsl.g:5699:2: ( ruleEString )
            // InternalBgDsl.g:5700:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__InitialPlayerAssignment_3_1"
    // InternalBgDsl.g:5709:1: rule__Game__InitialPlayerAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Game__InitialPlayerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5713:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5714:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5714:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5715:3: ( ruleEString )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_3_1_0()); 
            // InternalBgDsl.g:5716:3: ( ruleEString )
            // InternalBgDsl.g:5717:4: ruleEString
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getInitialPlayerPlayerEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__InitialPlayerAssignment_3_1"


    // $ANTLR start "rule__Game__BoardAssignment_5"
    // InternalBgDsl.g:5728:1: rule__Game__BoardAssignment_5 : ( ruleBoard ) ;
    public final void rule__Game__BoardAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5732:1: ( ( ruleBoard ) )
            // InternalBgDsl.g:5733:2: ( ruleBoard )
            {
            // InternalBgDsl.g:5733:2: ( ruleBoard )
            // InternalBgDsl.g:5734:3: ruleBoard
            {
             before(grammarAccess.getGameAccess().getBoardBoardParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getGameAccess().getBoardBoardParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__BoardAssignment_5"


    // $ANTLR start "rule__Game__PlayersAssignment_6_2"
    // InternalBgDsl.g:5743:1: rule__Game__PlayersAssignment_6_2 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5747:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5748:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5748:2: ( rulePlayer )
            // InternalBgDsl.g:5749:3: rulePlayer
            {
             before(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__PlayersAssignment_6_2"


    // $ANTLR start "rule__Game__PlayersAssignment_6_3_1"
    // InternalBgDsl.g:5758:1: rule__Game__PlayersAssignment_6_3_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5762:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5763:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5763:2: ( rulePlayer )
            // InternalBgDsl.g:5764:3: rulePlayer
            {
             before(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__PlayersAssignment_6_3_1"


    // $ANTLR start "rule__Game__TurnPolicyAssignment_7_2"
    // InternalBgDsl.g:5773:1: rule__Game__TurnPolicyAssignment_7_2 : ( ruleTurnPolicy ) ;
    public final void rule__Game__TurnPolicyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5777:1: ( ( ruleTurnPolicy ) )
            // InternalBgDsl.g:5778:2: ( ruleTurnPolicy )
            {
            // InternalBgDsl.g:5778:2: ( ruleTurnPolicy )
            // InternalBgDsl.g:5779:3: ruleTurnPolicy
            {
             before(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnPolicy();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TurnPolicyAssignment_7_2"


    // $ANTLR start "rule__Game__TurnPolicyAssignment_7_3_1"
    // InternalBgDsl.g:5788:1: rule__Game__TurnPolicyAssignment_7_3_1 : ( ruleTurnPolicy ) ;
    public final void rule__Game__TurnPolicyAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5792:1: ( ( ruleTurnPolicy ) )
            // InternalBgDsl.g:5793:2: ( ruleTurnPolicy )
            {
            // InternalBgDsl.g:5793:2: ( ruleTurnPolicy )
            // InternalBgDsl.g:5794:3: ruleTurnPolicy
            {
             before(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnPolicy();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TurnPolicyAssignment_7_3_1"


    // $ANTLR start "rule__Board__CheckeredAssignment_0"
    // InternalBgDsl.g:5803:1: rule__Board__CheckeredAssignment_0 : ( ( 'checkered' ) ) ;
    public final void rule__Board__CheckeredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5807:1: ( ( ( 'checkered' ) ) )
            // InternalBgDsl.g:5808:2: ( ( 'checkered' ) )
            {
            // InternalBgDsl.g:5808:2: ( ( 'checkered' ) )
            // InternalBgDsl.g:5809:3: ( 'checkered' )
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            // InternalBgDsl.g:5810:3: ( 'checkered' )
            // InternalBgDsl.g:5811:4: 'checkered'
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 

            }

             after(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__CheckeredAssignment_0"


    // $ANTLR start "rule__Board__WidthAssignment_4"
    // InternalBgDsl.g:5822:1: rule__Board__WidthAssignment_4 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5826:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5827:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5827:2: ( ruleEInt )
            // InternalBgDsl.g:5828:3: ruleEInt
            {
             before(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__WidthAssignment_4"


    // $ANTLR start "rule__Board__HeightAssignment_6"
    // InternalBgDsl.g:5837:1: rule__Board__HeightAssignment_6 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5841:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5842:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5842:2: ( ruleEInt )
            // InternalBgDsl.g:5843:3: ruleEInt
            {
             before(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__HeightAssignment_6"


    // $ANTLR start "rule__Board__TilesAssignment_9"
    // InternalBgDsl.g:5852:1: rule__Board__TilesAssignment_9 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5856:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5857:2: ( ruleTile )
            {
            // InternalBgDsl.g:5857:2: ( ruleTile )
            // InternalBgDsl.g:5858:3: ruleTile
            {
             before(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__TilesAssignment_9"


    // $ANTLR start "rule__Board__TilesAssignment_10_1"
    // InternalBgDsl.g:5867:1: rule__Board__TilesAssignment_10_1 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5871:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5872:2: ( ruleTile )
            {
            // InternalBgDsl.g:5872:2: ( ruleTile )
            // InternalBgDsl.g:5873:3: ruleTile
            {
             before(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getTilesTileParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__TilesAssignment_10_1"


    // $ANTLR start "rule__Board__LegalMovesPipelineAssignment_12_2"
    // InternalBgDsl.g:5882:1: rule__Board__LegalMovesPipelineAssignment_12_2 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5886:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:5887:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:5887:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:5888:3: ruleLegalMovesPipeline
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalMovesPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__LegalMovesPipelineAssignment_12_2"


    // $ANTLR start "rule__Board__LegalMovesPipelineAssignment_12_3_1"
    // InternalBgDsl.g:5897:1: rule__Board__LegalMovesPipelineAssignment_12_3_1 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5901:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:5902:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:5902:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:5903:3: ruleLegalMovesPipeline
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalMovesPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__LegalMovesPipelineAssignment_12_3_1"


    // $ANTLR start "rule__Board__EffectPipelineAssignment_13_2"
    // InternalBgDsl.g:5912:1: rule__Board__EffectPipelineAssignment_13_2 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5916:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:5917:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:5917:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:5918:3: ruleEffectPipeline
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__EffectPipelineAssignment_13_2"


    // $ANTLR start "rule__Board__EffectPipelineAssignment_13_3_1"
    // InternalBgDsl.g:5927:1: rule__Board__EffectPipelineAssignment_13_3_1 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5931:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:5932:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:5932:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:5933:3: ruleEffectPipeline
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__EffectPipelineAssignment_13_3_1"


    // $ANTLR start "rule__Board__TileplacementAssignment_16"
    // InternalBgDsl.g:5942:1: rule__Board__TileplacementAssignment_16 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5946:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:5947:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:5947:2: ( ruleTilePlacement )
            // InternalBgDsl.g:5948:3: ruleTilePlacement
            {
             before(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleTilePlacement();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__TileplacementAssignment_16"


    // $ANTLR start "rule__Board__TileplacementAssignment_17_1"
    // InternalBgDsl.g:5957:1: rule__Board__TileplacementAssignment_17_1 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5961:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:5962:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:5962:2: ( ruleTilePlacement )
            // InternalBgDsl.g:5963:3: ruleTilePlacement
            {
             before(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTilePlacement();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getTileplacementTilePlacementParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__TileplacementAssignment_17_1"


    // $ANTLR start "rule__Player__NameAssignment_1"
    // InternalBgDsl.g:5972:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5976:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5977:2: ( ruleEString )
            {
            // InternalBgDsl.g:5977:2: ( ruleEString )
            // InternalBgDsl.g:5978:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_1"


    // $ANTLR start "rule__Player__HexColorAssignment_4"
    // InternalBgDsl.g:5987:1: rule__Player__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Player__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5991:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5992:2: ( ruleEString )
            {
            // InternalBgDsl.g:5992:2: ( ruleEString )
            // InternalBgDsl.g:5993:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getHexColorEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getHexColorEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__HexColorAssignment_4"


    // $ANTLR start "rule__TurnPolicy__TypeAssignment_3"
    // InternalBgDsl.g:6002:1: rule__TurnPolicy__TypeAssignment_3 : ( ruleTurnType ) ;
    public final void rule__TurnPolicy__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6006:1: ( ( ruleTurnType ) )
            // InternalBgDsl.g:6007:2: ( ruleTurnType )
            {
            // InternalBgDsl.g:6007:2: ( ruleTurnType )
            // InternalBgDsl.g:6008:3: ruleTurnType
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeTurnTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnType();

            state._fsp--;

             after(grammarAccess.getTurnPolicyAccess().getTypeTurnTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnPolicy__TypeAssignment_3"


    // $ANTLR start "rule__Tile__TypeAssignment_1"
    // InternalBgDsl.g:6017:1: rule__Tile__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Tile__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6021:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6022:2: ( ruleEString )
            {
            // InternalBgDsl.g:6022:2: ( ruleEString )
            // InternalBgDsl.g:6023:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TypeAssignment_1"


    // $ANTLR start "rule__Tile__HexColorAssignment_4"
    // InternalBgDsl.g:6032:1: rule__Tile__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Tile__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6036:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6037:2: ( ruleEString )
            {
            // InternalBgDsl.g:6037:2: ( ruleEString )
            // InternalBgDsl.g:6038:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getHexColorEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getHexColorEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__HexColorAssignment_4"


    // $ANTLR start "rule__Tile__NameAssignment_6"
    // InternalBgDsl.g:6047:1: rule__Tile__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Tile__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6051:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6052:2: ( ruleEString )
            {
            // InternalBgDsl.g:6052:2: ( ruleEString )
            // InternalBgDsl.g:6053:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__NameAssignment_6"


    // $ANTLR start "rule__Tile__StatesAssignment_9"
    // InternalBgDsl.g:6062:1: rule__Tile__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6066:1: ( ( ruleState ) )
            // InternalBgDsl.g:6067:2: ( ruleState )
            {
            // InternalBgDsl.g:6067:2: ( ruleState )
            // InternalBgDsl.g:6068:3: ruleState
            {
             before(grammarAccess.getTileAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getStatesStateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__StatesAssignment_9"


    // $ANTLR start "rule__Tile__StatesAssignment_10_1"
    // InternalBgDsl.g:6077:1: rule__Tile__StatesAssignment_10_1 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6081:1: ( ( ruleState ) )
            // InternalBgDsl.g:6082:2: ( ruleState )
            {
            // InternalBgDsl.g:6082:2: ( ruleState )
            // InternalBgDsl.g:6083:3: ruleState
            {
             before(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__StatesAssignment_10_1"


    // $ANTLR start "rule__Tile__TransitionsAssignment_12_2"
    // InternalBgDsl.g:6092:1: rule__Tile__TransitionsAssignment_12_2 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6096:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6097:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6097:2: ( ruleTransition )
            // InternalBgDsl.g:6098:3: ruleTransition
            {
             before(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TransitionsAssignment_12_2"


    // $ANTLR start "rule__Tile__TransitionsAssignment_12_3_1"
    // InternalBgDsl.g:6107:1: rule__Tile__TransitionsAssignment_12_3_1 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6111:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6112:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6112:2: ( ruleTransition )
            // InternalBgDsl.g:6113:3: ruleTransition
            {
             before(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TransitionsAssignment_12_3_1"


    // $ANTLR start "rule__Tile__InitialStateAssignment_14"
    // InternalBgDsl.g:6122:1: rule__Tile__InitialStateAssignment_14 : ( ruleState ) ;
    public final void rule__Tile__InitialStateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6126:1: ( ( ruleState ) )
            // InternalBgDsl.g:6127:2: ( ruleState )
            {
            // InternalBgDsl.g:6127:2: ( ruleState )
            // InternalBgDsl.g:6128:3: ruleState
            {
             before(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__InitialStateAssignment_14"


    // $ANTLR start "rule__LegalMovesPipeline__FilterAssignment_3_1"
    // InternalBgDsl.g:6137:1: rule__LegalMovesPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__LegalMovesPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6141:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6142:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6142:2: ( ruleFilter )
            // InternalBgDsl.g:6143:3: ruleFilter
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__FilterAssignment_3_1"


    // $ANTLR start "rule__EffectPipeline__FilterAssignment_3_1"
    // InternalBgDsl.g:6152:1: rule__EffectPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__EffectPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6156:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6157:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6157:2: ( ruleFilter )
            // InternalBgDsl.g:6158:3: ruleFilter
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getEffectPipelineAccess().getFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__FilterAssignment_3_1"


    // $ANTLR start "rule__TilePlacement__RowAssignment_3"
    // InternalBgDsl.g:6167:1: rule__TilePlacement__RowAssignment_3 : ( ruleEInt ) ;
    public final void rule__TilePlacement__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6171:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6172:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6172:2: ( ruleEInt )
            // InternalBgDsl.g:6173:3: ruleEInt
            {
             before(grammarAccess.getTilePlacementAccess().getRowEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTilePlacementAccess().getRowEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__RowAssignment_3"


    // $ANTLR start "rule__TilePlacement__ColumnAssignment_5"
    // InternalBgDsl.g:6182:1: rule__TilePlacement__ColumnAssignment_5 : ( ruleEInt ) ;
    public final void rule__TilePlacement__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6186:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6187:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6187:2: ( ruleEInt )
            // InternalBgDsl.g:6188:3: ruleEInt
            {
             before(grammarAccess.getTilePlacementAccess().getColumnEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTilePlacementAccess().getColumnEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__ColumnAssignment_5"


    // $ANTLR start "rule__TilePlacement__TileAssignment_7"
    // InternalBgDsl.g:6197:1: rule__TilePlacement__TileAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TilePlacement__TileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6201:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6202:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6202:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6203:3: ( ruleEString )
            {
             before(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0()); 
            // InternalBgDsl.g:6204:3: ( ruleEString )
            // InternalBgDsl.g:6205:4: ruleEString
            {
             before(grammarAccess.getTilePlacementAccess().getTileTileEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTilePlacementAccess().getTileTileEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TilePlacement__TileAssignment_7"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalBgDsl.g:6216:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6220:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6221:2: ( ruleEString )
            {
            // InternalBgDsl.g:6221:2: ( ruleEString )
            // InternalBgDsl.g:6222:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__HexColorAssignment_4"
    // InternalBgDsl.g:6231:1: rule__State__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__State__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6235:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6236:2: ( ruleEString )
            {
            // InternalBgDsl.g:6236:2: ( ruleEString )
            // InternalBgDsl.g:6237:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getHexColorEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__HexColorAssignment_4"


    // $ANTLR start "rule__State__OutboundAssignment_5_2"
    // InternalBgDsl.g:6246:1: rule__State__OutboundAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6250:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6251:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6251:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6252:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0()); 
            // InternalBgDsl.g:6253:3: ( ruleEString )
            // InternalBgDsl.g:6254:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutboundAssignment_5_2"


    // $ANTLR start "rule__State__OutboundAssignment_5_3_1"
    // InternalBgDsl.g:6265:1: rule__State__OutboundAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6269:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6270:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6270:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6271:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0()); 
            // InternalBgDsl.g:6272:3: ( ruleEString )
            // InternalBgDsl.g:6273:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutboundAssignment_5_3_1"


    // $ANTLR start "rule__State__InboundAssignment_6_2"
    // InternalBgDsl.g:6284:1: rule__State__InboundAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6288:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6289:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6289:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6290:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0()); 
            // InternalBgDsl.g:6291:3: ( ruleEString )
            // InternalBgDsl.g:6292:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InboundAssignment_6_2"


    // $ANTLR start "rule__State__InboundAssignment_6_3_1"
    // InternalBgDsl.g:6303:1: rule__State__InboundAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6307:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6308:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6308:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6309:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0()); 
            // InternalBgDsl.g:6310:3: ( ruleEString )
            // InternalBgDsl.g:6311:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InboundAssignment_6_3_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalBgDsl.g:6322:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6326:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6327:2: ( ruleEString )
            {
            // InternalBgDsl.g:6327:2: ( ruleEString )
            // InternalBgDsl.g:6328:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__SourceAssignment_5"
    // InternalBgDsl.g:6337:1: rule__Transition__SourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6341:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6342:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6342:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6343:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            // InternalBgDsl.g:6344:3: ( ruleEString )
            // InternalBgDsl.g:6345:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_5"


    // $ANTLR start "rule__Transition__SourceAssignment_6_1"
    // InternalBgDsl.g:6356:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6360:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6361:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6361:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6362:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 
            // InternalBgDsl.g:6363:3: ( ruleEString )
            // InternalBgDsl.g:6364:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_6_1"


    // $ANTLR start "rule__Transition__TargetAssignment_9"
    // InternalBgDsl.g:6375:1: rule__Transition__TargetAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6379:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6380:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6380:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6381:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 
            // InternalBgDsl.g:6382:3: ( ruleEString )
            // InternalBgDsl.g:6383:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_9"


    // $ANTLR start "rule__PatternFilter__NameAssignment_2"
    // InternalBgDsl.g:6394:1: rule__PatternFilter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PatternFilter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6398:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6399:2: ( ruleEString )
            {
            // InternalBgDsl.g:6399:2: ( ruleEString )
            // InternalBgDsl.g:6400:3: ruleEString
            {
             before(grammarAccess.getPatternFilterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__NameAssignment_2"


    // $ANTLR start "rule__PatternFilter__NextFilterAssignment_4_1"
    // InternalBgDsl.g:6409:1: rule__PatternFilter__NextFilterAssignment_4_1 : ( ruleFilter ) ;
    public final void rule__PatternFilter__NextFilterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6413:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6414:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6414:2: ( ruleFilter )
            // InternalBgDsl.g:6415:3: ruleFilter
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__NextFilterAssignment_4_1"


    // $ANTLR start "rule__PatternFilter__PatternsAssignment_7"
    // InternalBgDsl.g:6424:1: rule__PatternFilter__PatternsAssignment_7 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6428:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6429:2: ( rulePattern )
            {
            // InternalBgDsl.g:6429:2: ( rulePattern )
            // InternalBgDsl.g:6430:3: rulePattern
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__PatternsAssignment_7"


    // $ANTLR start "rule__PatternFilter__PatternsAssignment_8_1"
    // InternalBgDsl.g:6439:1: rule__PatternFilter__PatternsAssignment_8_1 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6443:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6444:2: ( rulePattern )
            {
            // InternalBgDsl.g:6444:2: ( rulePattern )
            // InternalBgDsl.g:6445:3: rulePattern
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__PatternsAssignment_8_1"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalBgDsl.g:6454:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6458:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6459:2: ( ruleEString )
            {
            // InternalBgDsl.g:6459:2: ( ruleEString )
            // InternalBgDsl.g:6460:3: ruleEString
            {
             before(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__RelativecoordinatesAssignment_5"
    // InternalBgDsl.g:6469:1: rule__Pattern__RelativecoordinatesAssignment_5 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6473:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6474:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6474:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6475:3: ruleRelativeCoordinate
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RelativecoordinatesAssignment_5"


    // $ANTLR start "rule__Pattern__RelativecoordinatesAssignment_6_1"
    // InternalBgDsl.g:6484:1: rule__Pattern__RelativecoordinatesAssignment_6_1 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6488:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6489:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6489:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6490:3: ruleRelativeCoordinate
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RelativecoordinatesAssignment_6_1"


    // $ANTLR start "rule__RelativeCoordinate__XAssignment_3"
    // InternalBgDsl.g:6499:1: rule__RelativeCoordinate__XAssignment_3 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6503:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6504:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6504:2: ( ruleEInt )
            // InternalBgDsl.g:6505:3: ruleEInt
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRelativeCoordinateAccess().getXEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__XAssignment_3"


    // $ANTLR start "rule__RelativeCoordinate__YAssignment_5"
    // InternalBgDsl.g:6514:1: rule__RelativeCoordinate__YAssignment_5 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6518:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6519:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6519:2: ( ruleEInt )
            // InternalBgDsl.g:6520:3: ruleEInt
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRelativeCoordinateAccess().getYEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeCoordinate__YAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000150000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002400000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});

}