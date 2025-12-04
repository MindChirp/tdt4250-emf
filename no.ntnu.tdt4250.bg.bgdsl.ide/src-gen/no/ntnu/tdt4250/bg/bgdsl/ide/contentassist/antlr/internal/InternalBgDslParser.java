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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CurrentPlayer'", "'OtherPlayer'", "'StateBased'", "'TurnBased'", "'Simultaneous'", "'Game'", "'{'", "'board'", "'turnPolicy'", "'}'", "'initialPlayer'", "'players'", "','", "'Board'", "'width'", "'height'", "'tiles'", "'tileplacement'", "'legalMovesPipeline'", "'effectPipeline'", "'Player'", "'hexColor'", "'associatedState'", "'TurnPolicy'", "'type'", "'-'", "'Tile'", "'name'", "'states'", "'initialState'", "'transitions'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'patterns'", "'nextFilter'", "'Pattern'", "'relativecoordinates'", "'stateSelection'", "'matchState'", "'RelativeCoordinate'", "'x'", "'y'", "'checkered'"
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


    // $ANTLR start "ruleStateSelection"
    // InternalBgDsl.g:453:1: ruleStateSelection : ( ( rule__StateSelection__Alternatives ) ) ;
    public final void ruleStateSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:457:1: ( ( ( rule__StateSelection__Alternatives ) ) )
            // InternalBgDsl.g:458:2: ( ( rule__StateSelection__Alternatives ) )
            {
            // InternalBgDsl.g:458:2: ( ( rule__StateSelection__Alternatives ) )
            // InternalBgDsl.g:459:3: ( rule__StateSelection__Alternatives )
            {
             before(grammarAccess.getStateSelectionAccess().getAlternatives()); 
            // InternalBgDsl.g:460:3: ( rule__StateSelection__Alternatives )
            // InternalBgDsl.g:460:4: rule__StateSelection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateSelection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateSelectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateSelection"


    // $ANTLR start "ruleTurnType"
    // InternalBgDsl.g:469:1: ruleTurnType : ( ( rule__TurnType__Alternatives ) ) ;
    public final void ruleTurnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:473:1: ( ( ( rule__TurnType__Alternatives ) ) )
            // InternalBgDsl.g:474:2: ( ( rule__TurnType__Alternatives ) )
            {
            // InternalBgDsl.g:474:2: ( ( rule__TurnType__Alternatives ) )
            // InternalBgDsl.g:475:3: ( rule__TurnType__Alternatives )
            {
             before(grammarAccess.getTurnTypeAccess().getAlternatives()); 
            // InternalBgDsl.g:476:3: ( rule__TurnType__Alternatives )
            // InternalBgDsl.g:476:4: rule__TurnType__Alternatives
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
    // InternalBgDsl.g:484:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:488:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBgDsl.g:489:2: ( RULE_STRING )
                    {
                    // InternalBgDsl.g:489:2: ( RULE_STRING )
                    // InternalBgDsl.g:490:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:495:2: ( RULE_ID )
                    {
                    // InternalBgDsl.g:495:2: ( RULE_ID )
                    // InternalBgDsl.g:496:3: RULE_ID
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


    // $ANTLR start "rule__StateSelection__Alternatives"
    // InternalBgDsl.g:505:1: rule__StateSelection__Alternatives : ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) );
    public final void rule__StateSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:509:1: ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBgDsl.g:510:2: ( ( 'CurrentPlayer' ) )
                    {
                    // InternalBgDsl.g:510:2: ( ( 'CurrentPlayer' ) )
                    // InternalBgDsl.g:511:3: ( 'CurrentPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:512:3: ( 'CurrentPlayer' )
                    // InternalBgDsl.g:512:4: 'CurrentPlayer'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:516:2: ( ( 'OtherPlayer' ) )
                    {
                    // InternalBgDsl.g:516:2: ( ( 'OtherPlayer' ) )
                    // InternalBgDsl.g:517:3: ( 'OtherPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:518:3: ( 'OtherPlayer' )
                    // InternalBgDsl.g:518:4: 'OtherPlayer'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:522:2: ( ( 'StateBased' ) )
                    {
                    // InternalBgDsl.g:522:2: ( ( 'StateBased' ) )
                    // InternalBgDsl.g:523:3: ( 'StateBased' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2()); 
                    // InternalBgDsl.g:524:3: ( 'StateBased' )
                    // InternalBgDsl.g:524:4: 'StateBased'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__StateSelection__Alternatives"


    // $ANTLR start "rule__TurnType__Alternatives"
    // InternalBgDsl.g:532:1: rule__TurnType__Alternatives : ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) );
    public final void rule__TurnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:536:1: ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBgDsl.g:537:2: ( ( 'TurnBased' ) )
                    {
                    // InternalBgDsl.g:537:2: ( ( 'TurnBased' ) )
                    // InternalBgDsl.g:538:3: ( 'TurnBased' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:539:3: ( 'TurnBased' )
                    // InternalBgDsl.g:539:4: 'TurnBased'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:543:2: ( ( 'Simultaneous' ) )
                    {
                    // InternalBgDsl.g:543:2: ( ( 'Simultaneous' ) )
                    // InternalBgDsl.g:544:3: ( 'Simultaneous' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:545:3: ( 'Simultaneous' )
                    // InternalBgDsl.g:545:4: 'Simultaneous'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalBgDsl.g:553:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:557:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalBgDsl.g:558:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalBgDsl.g:565:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:569:1: ( ( 'Game' ) )
            // InternalBgDsl.g:570:1: ( 'Game' )
            {
            // InternalBgDsl.g:570:1: ( 'Game' )
            // InternalBgDsl.g:571:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBgDsl.g:580:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:584:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalBgDsl.g:585:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalBgDsl.g:592:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:596:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalBgDsl.g:597:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:597:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalBgDsl.g:598:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:599:2: ( rule__Game__NameAssignment_1 )
            // InternalBgDsl.g:599:3: rule__Game__NameAssignment_1
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
    // InternalBgDsl.g:607:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:611:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalBgDsl.g:612:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalBgDsl.g:619:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:623:1: ( ( '{' ) )
            // InternalBgDsl.g:624:1: ( '{' )
            {
            // InternalBgDsl.g:624:1: ( '{' )
            // InternalBgDsl.g:625:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:634:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:638:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalBgDsl.g:639:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalBgDsl.g:646:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:650:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalBgDsl.g:651:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalBgDsl.g:651:1: ( ( rule__Game__Group_3__0 )? )
            // InternalBgDsl.g:652:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalBgDsl.g:653:2: ( rule__Game__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBgDsl.g:653:3: rule__Game__Group_3__0
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
    // InternalBgDsl.g:661:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:665:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalBgDsl.g:666:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalBgDsl.g:673:1: rule__Game__Group__4__Impl : ( 'board' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:677:1: ( ( 'board' ) )
            // InternalBgDsl.g:678:1: ( 'board' )
            {
            // InternalBgDsl.g:678:1: ( 'board' )
            // InternalBgDsl.g:679:2: 'board'
            {
             before(grammarAccess.getGameAccess().getBoardKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBgDsl.g:688:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:692:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalBgDsl.g:693:2: rule__Game__Group__5__Impl rule__Game__Group__6
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
    // InternalBgDsl.g:700:1: rule__Game__Group__5__Impl : ( ( rule__Game__BoardAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:704:1: ( ( ( rule__Game__BoardAssignment_5 ) ) )
            // InternalBgDsl.g:705:1: ( ( rule__Game__BoardAssignment_5 ) )
            {
            // InternalBgDsl.g:705:1: ( ( rule__Game__BoardAssignment_5 ) )
            // InternalBgDsl.g:706:2: ( rule__Game__BoardAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getBoardAssignment_5()); 
            // InternalBgDsl.g:707:2: ( rule__Game__BoardAssignment_5 )
            // InternalBgDsl.g:707:3: rule__Game__BoardAssignment_5
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
    // InternalBgDsl.g:715:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:719:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalBgDsl.g:720:2: rule__Game__Group__6__Impl rule__Game__Group__7
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
    // InternalBgDsl.g:727:1: rule__Game__Group__6__Impl : ( ( rule__Game__Group_6__0 )? ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:731:1: ( ( ( rule__Game__Group_6__0 )? ) )
            // InternalBgDsl.g:732:1: ( ( rule__Game__Group_6__0 )? )
            {
            // InternalBgDsl.g:732:1: ( ( rule__Game__Group_6__0 )? )
            // InternalBgDsl.g:733:2: ( rule__Game__Group_6__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_6()); 
            // InternalBgDsl.g:734:2: ( rule__Game__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:734:3: rule__Game__Group_6__0
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
    // InternalBgDsl.g:742:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:746:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalBgDsl.g:747:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalBgDsl.g:754:1: rule__Game__Group__7__Impl : ( 'turnPolicy' ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:758:1: ( ( 'turnPolicy' ) )
            // InternalBgDsl.g:759:1: ( 'turnPolicy' )
            {
            // InternalBgDsl.g:759:1: ( 'turnPolicy' )
            // InternalBgDsl.g:760:2: 'turnPolicy'
            {
             before(grammarAccess.getGameAccess().getTurnPolicyKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTurnPolicyKeyword_7()); 

            }


            }

        }
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
    // InternalBgDsl.g:769:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:773:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalBgDsl.g:774:2: rule__Game__Group__8__Impl rule__Game__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__9();

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
    // InternalBgDsl.g:781:1: rule__Game__Group__8__Impl : ( ( rule__Game__TurnPolicyAssignment_8 ) ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:785:1: ( ( ( rule__Game__TurnPolicyAssignment_8 ) ) )
            // InternalBgDsl.g:786:1: ( ( rule__Game__TurnPolicyAssignment_8 ) )
            {
            // InternalBgDsl.g:786:1: ( ( rule__Game__TurnPolicyAssignment_8 ) )
            // InternalBgDsl.g:787:2: ( rule__Game__TurnPolicyAssignment_8 )
            {
             before(grammarAccess.getGameAccess().getTurnPolicyAssignment_8()); 
            // InternalBgDsl.g:788:2: ( rule__Game__TurnPolicyAssignment_8 )
            // InternalBgDsl.g:788:3: rule__Game__TurnPolicyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Game__TurnPolicyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTurnPolicyAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Game__Group__9"
    // InternalBgDsl.g:796:1: rule__Game__Group__9 : rule__Game__Group__9__Impl ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:800:1: ( rule__Game__Group__9__Impl )
            // InternalBgDsl.g:801:2: rule__Game__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__9__Impl();

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
    // $ANTLR end "rule__Game__Group__9"


    // $ANTLR start "rule__Game__Group__9__Impl"
    // InternalBgDsl.g:807:1: rule__Game__Group__9__Impl : ( '}' ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:811:1: ( ( '}' ) )
            // InternalBgDsl.g:812:1: ( '}' )
            {
            // InternalBgDsl.g:812:1: ( '}' )
            // InternalBgDsl.g:813:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__9__Impl"


    // $ANTLR start "rule__Game__Group_3__0"
    // InternalBgDsl.g:823:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:827:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalBgDsl.g:828:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
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
    // InternalBgDsl.g:835:1: rule__Game__Group_3__0__Impl : ( 'initialPlayer' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:839:1: ( ( 'initialPlayer' ) )
            // InternalBgDsl.g:840:1: ( 'initialPlayer' )
            {
            // InternalBgDsl.g:840:1: ( 'initialPlayer' )
            // InternalBgDsl.g:841:2: 'initialPlayer'
            {
             before(grammarAccess.getGameAccess().getInitialPlayerKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBgDsl.g:850:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:854:1: ( rule__Game__Group_3__1__Impl )
            // InternalBgDsl.g:855:2: rule__Game__Group_3__1__Impl
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
    // InternalBgDsl.g:861:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:865:1: ( ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) )
            // InternalBgDsl.g:866:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            {
            // InternalBgDsl.g:866:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            // InternalBgDsl.g:867:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerAssignment_3_1()); 
            // InternalBgDsl.g:868:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            // InternalBgDsl.g:868:3: rule__Game__InitialPlayerAssignment_3_1
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
    // InternalBgDsl.g:877:1: rule__Game__Group_6__0 : rule__Game__Group_6__0__Impl rule__Game__Group_6__1 ;
    public final void rule__Game__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:881:1: ( rule__Game__Group_6__0__Impl rule__Game__Group_6__1 )
            // InternalBgDsl.g:882:2: rule__Game__Group_6__0__Impl rule__Game__Group_6__1
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
    // InternalBgDsl.g:889:1: rule__Game__Group_6__0__Impl : ( 'players' ) ;
    public final void rule__Game__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:893:1: ( ( 'players' ) )
            // InternalBgDsl.g:894:1: ( 'players' )
            {
            // InternalBgDsl.g:894:1: ( 'players' )
            // InternalBgDsl.g:895:2: 'players'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:904:1: rule__Game__Group_6__1 : rule__Game__Group_6__1__Impl rule__Game__Group_6__2 ;
    public final void rule__Game__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:908:1: ( rule__Game__Group_6__1__Impl rule__Game__Group_6__2 )
            // InternalBgDsl.g:909:2: rule__Game__Group_6__1__Impl rule__Game__Group_6__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:916:1: rule__Game__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:920:1: ( ( '{' ) )
            // InternalBgDsl.g:921:1: ( '{' )
            {
            // InternalBgDsl.g:921:1: ( '{' )
            // InternalBgDsl.g:922:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:931:1: rule__Game__Group_6__2 : rule__Game__Group_6__2__Impl rule__Game__Group_6__3 ;
    public final void rule__Game__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:935:1: ( rule__Game__Group_6__2__Impl rule__Game__Group_6__3 )
            // InternalBgDsl.g:936:2: rule__Game__Group_6__2__Impl rule__Game__Group_6__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:943:1: rule__Game__Group_6__2__Impl : ( ( rule__Game__PlayersAssignment_6_2 ) ) ;
    public final void rule__Game__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:947:1: ( ( ( rule__Game__PlayersAssignment_6_2 ) ) )
            // InternalBgDsl.g:948:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            {
            // InternalBgDsl.g:948:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            // InternalBgDsl.g:949:2: ( rule__Game__PlayersAssignment_6_2 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_2()); 
            // InternalBgDsl.g:950:2: ( rule__Game__PlayersAssignment_6_2 )
            // InternalBgDsl.g:950:3: rule__Game__PlayersAssignment_6_2
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
    // InternalBgDsl.g:958:1: rule__Game__Group_6__3 : rule__Game__Group_6__3__Impl rule__Game__Group_6__4 ;
    public final void rule__Game__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:962:1: ( rule__Game__Group_6__3__Impl rule__Game__Group_6__4 )
            // InternalBgDsl.g:963:2: rule__Game__Group_6__3__Impl rule__Game__Group_6__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:970:1: rule__Game__Group_6__3__Impl : ( ( rule__Game__Group_6_3__0 )* ) ;
    public final void rule__Game__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:974:1: ( ( ( rule__Game__Group_6_3__0 )* ) )
            // InternalBgDsl.g:975:1: ( ( rule__Game__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:975:1: ( ( rule__Game__Group_6_3__0 )* )
            // InternalBgDsl.g:976:2: ( rule__Game__Group_6_3__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_6_3()); 
            // InternalBgDsl.g:977:2: ( rule__Game__Group_6_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBgDsl.g:977:3: rule__Game__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:985:1: rule__Game__Group_6__4 : rule__Game__Group_6__4__Impl ;
    public final void rule__Game__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:989:1: ( rule__Game__Group_6__4__Impl )
            // InternalBgDsl.g:990:2: rule__Game__Group_6__4__Impl
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
    // InternalBgDsl.g:996:1: rule__Game__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1000:1: ( ( '}' ) )
            // InternalBgDsl.g:1001:1: ( '}' )
            {
            // InternalBgDsl.g:1001:1: ( '}' )
            // InternalBgDsl.g:1002:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1012:1: rule__Game__Group_6_3__0 : rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 ;
    public final void rule__Game__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1016:1: ( rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 )
            // InternalBgDsl.g:1017:2: rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:1024:1: rule__Game__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1028:1: ( ( ',' ) )
            // InternalBgDsl.g:1029:1: ( ',' )
            {
            // InternalBgDsl.g:1029:1: ( ',' )
            // InternalBgDsl.g:1030:2: ','
            {
             before(grammarAccess.getGameAccess().getCommaKeyword_6_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:1039:1: rule__Game__Group_6_3__1 : rule__Game__Group_6_3__1__Impl ;
    public final void rule__Game__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1043:1: ( rule__Game__Group_6_3__1__Impl )
            // InternalBgDsl.g:1044:2: rule__Game__Group_6_3__1__Impl
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
    // InternalBgDsl.g:1050:1: rule__Game__Group_6_3__1__Impl : ( ( rule__Game__PlayersAssignment_6_3_1 ) ) ;
    public final void rule__Game__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1054:1: ( ( ( rule__Game__PlayersAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:1055:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:1055:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            // InternalBgDsl.g:1056:2: ( rule__Game__PlayersAssignment_6_3_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_3_1()); 
            // InternalBgDsl.g:1057:2: ( rule__Game__PlayersAssignment_6_3_1 )
            // InternalBgDsl.g:1057:3: rule__Game__PlayersAssignment_6_3_1
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


    // $ANTLR start "rule__Board__Group__0"
    // InternalBgDsl.g:1066:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1070:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBgDsl.g:1071:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBgDsl.g:1078:1: rule__Board__Group__0__Impl : ( ( rule__Board__CheckeredAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1082:1: ( ( ( rule__Board__CheckeredAssignment_0 ) ) )
            // InternalBgDsl.g:1083:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            {
            // InternalBgDsl.g:1083:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            // InternalBgDsl.g:1084:2: ( rule__Board__CheckeredAssignment_0 )
            {
             before(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 
            // InternalBgDsl.g:1085:2: ( rule__Board__CheckeredAssignment_0 )
            // InternalBgDsl.g:1085:3: rule__Board__CheckeredAssignment_0
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
    // InternalBgDsl.g:1093:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1097:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBgDsl.g:1098:2: rule__Board__Group__1__Impl rule__Board__Group__2
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
    // InternalBgDsl.g:1105:1: rule__Board__Group__1__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1109:1: ( ( 'Board' ) )
            // InternalBgDsl.g:1110:1: ( 'Board' )
            {
            // InternalBgDsl.g:1110:1: ( 'Board' )
            // InternalBgDsl.g:1111:2: 'Board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBgDsl.g:1120:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1124:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBgDsl.g:1125:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1132:1: rule__Board__Group__2__Impl : ( '{' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1136:1: ( ( '{' ) )
            // InternalBgDsl.g:1137:1: ( '{' )
            {
            // InternalBgDsl.g:1137:1: ( '{' )
            // InternalBgDsl.g:1138:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1147:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1151:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBgDsl.g:1152:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:1159:1: rule__Board__Group__3__Impl : ( 'width' ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1163:1: ( ( 'width' ) )
            // InternalBgDsl.g:1164:1: ( 'width' )
            {
            // InternalBgDsl.g:1164:1: ( 'width' )
            // InternalBgDsl.g:1165:2: 'width'
            {
             before(grammarAccess.getBoardAccess().getWidthKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBgDsl.g:1174:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1178:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBgDsl.g:1179:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalBgDsl.g:1186:1: rule__Board__Group__4__Impl : ( ( rule__Board__WidthAssignment_4 ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1190:1: ( ( ( rule__Board__WidthAssignment_4 ) ) )
            // InternalBgDsl.g:1191:1: ( ( rule__Board__WidthAssignment_4 ) )
            {
            // InternalBgDsl.g:1191:1: ( ( rule__Board__WidthAssignment_4 ) )
            // InternalBgDsl.g:1192:2: ( rule__Board__WidthAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_4()); 
            // InternalBgDsl.g:1193:2: ( rule__Board__WidthAssignment_4 )
            // InternalBgDsl.g:1193:3: rule__Board__WidthAssignment_4
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
    // InternalBgDsl.g:1201:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1205:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBgDsl.g:1206:2: rule__Board__Group__5__Impl rule__Board__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:1213:1: rule__Board__Group__5__Impl : ( 'height' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1217:1: ( ( 'height' ) )
            // InternalBgDsl.g:1218:1: ( 'height' )
            {
            // InternalBgDsl.g:1218:1: ( 'height' )
            // InternalBgDsl.g:1219:2: 'height'
            {
             before(grammarAccess.getBoardAccess().getHeightKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBgDsl.g:1228:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1232:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBgDsl.g:1233:2: rule__Board__Group__6__Impl rule__Board__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:1240:1: rule__Board__Group__6__Impl : ( ( rule__Board__HeightAssignment_6 ) ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1244:1: ( ( ( rule__Board__HeightAssignment_6 ) ) )
            // InternalBgDsl.g:1245:1: ( ( rule__Board__HeightAssignment_6 ) )
            {
            // InternalBgDsl.g:1245:1: ( ( rule__Board__HeightAssignment_6 ) )
            // InternalBgDsl.g:1246:2: ( rule__Board__HeightAssignment_6 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_6()); 
            // InternalBgDsl.g:1247:2: ( rule__Board__HeightAssignment_6 )
            // InternalBgDsl.g:1247:3: rule__Board__HeightAssignment_6
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
    // InternalBgDsl.g:1255:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1259:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBgDsl.g:1260:2: rule__Board__Group__7__Impl rule__Board__Group__8
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
    // InternalBgDsl.g:1267:1: rule__Board__Group__7__Impl : ( 'tiles' ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1271:1: ( ( 'tiles' ) )
            // InternalBgDsl.g:1272:1: ( 'tiles' )
            {
            // InternalBgDsl.g:1272:1: ( 'tiles' )
            // InternalBgDsl.g:1273:2: 'tiles'
            {
             before(grammarAccess.getBoardAccess().getTilesKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBgDsl.g:1282:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1286:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBgDsl.g:1287:2: rule__Board__Group__8__Impl rule__Board__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:1294:1: rule__Board__Group__8__Impl : ( '{' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1298:1: ( ( '{' ) )
            // InternalBgDsl.g:1299:1: ( '{' )
            {
            // InternalBgDsl.g:1299:1: ( '{' )
            // InternalBgDsl.g:1300:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1309:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1313:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBgDsl.g:1314:2: rule__Board__Group__9__Impl rule__Board__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1321:1: rule__Board__Group__9__Impl : ( ( rule__Board__TilesAssignment_9 ) ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1325:1: ( ( ( rule__Board__TilesAssignment_9 ) ) )
            // InternalBgDsl.g:1326:1: ( ( rule__Board__TilesAssignment_9 ) )
            {
            // InternalBgDsl.g:1326:1: ( ( rule__Board__TilesAssignment_9 ) )
            // InternalBgDsl.g:1327:2: ( rule__Board__TilesAssignment_9 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_9()); 
            // InternalBgDsl.g:1328:2: ( rule__Board__TilesAssignment_9 )
            // InternalBgDsl.g:1328:3: rule__Board__TilesAssignment_9
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
    // InternalBgDsl.g:1336:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1340:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBgDsl.g:1341:2: rule__Board__Group__10__Impl rule__Board__Group__11
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1348:1: rule__Board__Group__10__Impl : ( ( rule__Board__Group_10__0 )* ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1352:1: ( ( ( rule__Board__Group_10__0 )* ) )
            // InternalBgDsl.g:1353:1: ( ( rule__Board__Group_10__0 )* )
            {
            // InternalBgDsl.g:1353:1: ( ( rule__Board__Group_10__0 )* )
            // InternalBgDsl.g:1354:2: ( rule__Board__Group_10__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_10()); 
            // InternalBgDsl.g:1355:2: ( rule__Board__Group_10__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:1355:3: rule__Board__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Board__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBgDsl.g:1363:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1367:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBgDsl.g:1368:2: rule__Board__Group__11__Impl rule__Board__Group__12
            {
            pushFollow(FOLLOW_19);
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
    // InternalBgDsl.g:1375:1: rule__Board__Group__11__Impl : ( '}' ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1379:1: ( ( '}' ) )
            // InternalBgDsl.g:1380:1: ( '}' )
            {
            // InternalBgDsl.g:1380:1: ( '}' )
            // InternalBgDsl.g:1381:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1390:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1394:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBgDsl.g:1395:2: rule__Board__Group__12__Impl rule__Board__Group__13
            {
            pushFollow(FOLLOW_19);
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
    // InternalBgDsl.g:1402:1: rule__Board__Group__12__Impl : ( ( rule__Board__Group_12__0 )? ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1406:1: ( ( ( rule__Board__Group_12__0 )? ) )
            // InternalBgDsl.g:1407:1: ( ( rule__Board__Group_12__0 )? )
            {
            // InternalBgDsl.g:1407:1: ( ( rule__Board__Group_12__0 )? )
            // InternalBgDsl.g:1408:2: ( rule__Board__Group_12__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_12()); 
            // InternalBgDsl.g:1409:2: ( rule__Board__Group_12__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBgDsl.g:1409:3: rule__Board__Group_12__0
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
    // InternalBgDsl.g:1417:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1421:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBgDsl.g:1422:2: rule__Board__Group__13__Impl rule__Board__Group__14
            {
            pushFollow(FOLLOW_19);
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
    // InternalBgDsl.g:1429:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1433:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBgDsl.g:1434:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBgDsl.g:1434:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBgDsl.g:1435:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBgDsl.g:1436:2: ( rule__Board__Group_13__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:1436:3: rule__Board__Group_13__0
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
    // InternalBgDsl.g:1444:1: rule__Board__Group__14 : rule__Board__Group__14__Impl rule__Board__Group__15 ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1448:1: ( rule__Board__Group__14__Impl rule__Board__Group__15 )
            // InternalBgDsl.g:1449:2: rule__Board__Group__14__Impl rule__Board__Group__15
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
    // InternalBgDsl.g:1456:1: rule__Board__Group__14__Impl : ( 'tileplacement' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1460:1: ( ( 'tileplacement' ) )
            // InternalBgDsl.g:1461:1: ( 'tileplacement' )
            {
            // InternalBgDsl.g:1461:1: ( 'tileplacement' )
            // InternalBgDsl.g:1462:2: 'tileplacement'
            {
             before(grammarAccess.getBoardAccess().getTileplacementKeyword_14()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBgDsl.g:1471:1: rule__Board__Group__15 : rule__Board__Group__15__Impl rule__Board__Group__16 ;
    public final void rule__Board__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1475:1: ( rule__Board__Group__15__Impl rule__Board__Group__16 )
            // InternalBgDsl.g:1476:2: rule__Board__Group__15__Impl rule__Board__Group__16
            {
            pushFollow(FOLLOW_20);
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
    // InternalBgDsl.g:1483:1: rule__Board__Group__15__Impl : ( '{' ) ;
    public final void rule__Board__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1487:1: ( ( '{' ) )
            // InternalBgDsl.g:1488:1: ( '{' )
            {
            // InternalBgDsl.g:1488:1: ( '{' )
            // InternalBgDsl.g:1489:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1498:1: rule__Board__Group__16 : rule__Board__Group__16__Impl rule__Board__Group__17 ;
    public final void rule__Board__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1502:1: ( rule__Board__Group__16__Impl rule__Board__Group__17 )
            // InternalBgDsl.g:1503:2: rule__Board__Group__16__Impl rule__Board__Group__17
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1510:1: rule__Board__Group__16__Impl : ( ( rule__Board__TileplacementAssignment_16 ) ) ;
    public final void rule__Board__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1514:1: ( ( ( rule__Board__TileplacementAssignment_16 ) ) )
            // InternalBgDsl.g:1515:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            {
            // InternalBgDsl.g:1515:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            // InternalBgDsl.g:1516:2: ( rule__Board__TileplacementAssignment_16 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_16()); 
            // InternalBgDsl.g:1517:2: ( rule__Board__TileplacementAssignment_16 )
            // InternalBgDsl.g:1517:3: rule__Board__TileplacementAssignment_16
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
    // InternalBgDsl.g:1525:1: rule__Board__Group__17 : rule__Board__Group__17__Impl rule__Board__Group__18 ;
    public final void rule__Board__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1529:1: ( rule__Board__Group__17__Impl rule__Board__Group__18 )
            // InternalBgDsl.g:1530:2: rule__Board__Group__17__Impl rule__Board__Group__18
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1537:1: rule__Board__Group__17__Impl : ( ( rule__Board__Group_17__0 )* ) ;
    public final void rule__Board__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1541:1: ( ( ( rule__Board__Group_17__0 )* ) )
            // InternalBgDsl.g:1542:1: ( ( rule__Board__Group_17__0 )* )
            {
            // InternalBgDsl.g:1542:1: ( ( rule__Board__Group_17__0 )* )
            // InternalBgDsl.g:1543:2: ( rule__Board__Group_17__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_17()); 
            // InternalBgDsl.g:1544:2: ( rule__Board__Group_17__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBgDsl.g:1544:3: rule__Board__Group_17__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Board__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBgDsl.g:1552:1: rule__Board__Group__18 : rule__Board__Group__18__Impl rule__Board__Group__19 ;
    public final void rule__Board__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1556:1: ( rule__Board__Group__18__Impl rule__Board__Group__19 )
            // InternalBgDsl.g:1557:2: rule__Board__Group__18__Impl rule__Board__Group__19
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:1564:1: rule__Board__Group__18__Impl : ( '}' ) ;
    public final void rule__Board__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1568:1: ( ( '}' ) )
            // InternalBgDsl.g:1569:1: ( '}' )
            {
            // InternalBgDsl.g:1569:1: ( '}' )
            // InternalBgDsl.g:1570:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1579:1: rule__Board__Group__19 : rule__Board__Group__19__Impl ;
    public final void rule__Board__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1583:1: ( rule__Board__Group__19__Impl )
            // InternalBgDsl.g:1584:2: rule__Board__Group__19__Impl
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
    // InternalBgDsl.g:1590:1: rule__Board__Group__19__Impl : ( '}' ) ;
    public final void rule__Board__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1594:1: ( ( '}' ) )
            // InternalBgDsl.g:1595:1: ( '}' )
            {
            // InternalBgDsl.g:1595:1: ( '}' )
            // InternalBgDsl.g:1596:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1606:1: rule__Board__Group_10__0 : rule__Board__Group_10__0__Impl rule__Board__Group_10__1 ;
    public final void rule__Board__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1610:1: ( rule__Board__Group_10__0__Impl rule__Board__Group_10__1 )
            // InternalBgDsl.g:1611:2: rule__Board__Group_10__0__Impl rule__Board__Group_10__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:1618:1: rule__Board__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1622:1: ( ( ',' ) )
            // InternalBgDsl.g:1623:1: ( ',' )
            {
            // InternalBgDsl.g:1623:1: ( ',' )
            // InternalBgDsl.g:1624:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_10_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:1633:1: rule__Board__Group_10__1 : rule__Board__Group_10__1__Impl ;
    public final void rule__Board__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1637:1: ( rule__Board__Group_10__1__Impl )
            // InternalBgDsl.g:1638:2: rule__Board__Group_10__1__Impl
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
    // InternalBgDsl.g:1644:1: rule__Board__Group_10__1__Impl : ( ( rule__Board__TilesAssignment_10_1 ) ) ;
    public final void rule__Board__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1648:1: ( ( ( rule__Board__TilesAssignment_10_1 ) ) )
            // InternalBgDsl.g:1649:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:1649:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            // InternalBgDsl.g:1650:2: ( rule__Board__TilesAssignment_10_1 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 
            // InternalBgDsl.g:1651:2: ( rule__Board__TilesAssignment_10_1 )
            // InternalBgDsl.g:1651:3: rule__Board__TilesAssignment_10_1
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
    // InternalBgDsl.g:1660:1: rule__Board__Group_12__0 : rule__Board__Group_12__0__Impl rule__Board__Group_12__1 ;
    public final void rule__Board__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1664:1: ( rule__Board__Group_12__0__Impl rule__Board__Group_12__1 )
            // InternalBgDsl.g:1665:2: rule__Board__Group_12__0__Impl rule__Board__Group_12__1
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
    // InternalBgDsl.g:1672:1: rule__Board__Group_12__0__Impl : ( 'legalMovesPipeline' ) ;
    public final void rule__Board__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1676:1: ( ( 'legalMovesPipeline' ) )
            // InternalBgDsl.g:1677:1: ( 'legalMovesPipeline' )
            {
            // InternalBgDsl.g:1677:1: ( 'legalMovesPipeline' )
            // InternalBgDsl.g:1678:2: 'legalMovesPipeline'
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBgDsl.g:1687:1: rule__Board__Group_12__1 : rule__Board__Group_12__1__Impl rule__Board__Group_12__2 ;
    public final void rule__Board__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1691:1: ( rule__Board__Group_12__1__Impl rule__Board__Group_12__2 )
            // InternalBgDsl.g:1692:2: rule__Board__Group_12__1__Impl rule__Board__Group_12__2
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
    // InternalBgDsl.g:1699:1: rule__Board__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1703:1: ( ( '{' ) )
            // InternalBgDsl.g:1704:1: ( '{' )
            {
            // InternalBgDsl.g:1704:1: ( '{' )
            // InternalBgDsl.g:1705:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1714:1: rule__Board__Group_12__2 : rule__Board__Group_12__2__Impl rule__Board__Group_12__3 ;
    public final void rule__Board__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1718:1: ( rule__Board__Group_12__2__Impl rule__Board__Group_12__3 )
            // InternalBgDsl.g:1719:2: rule__Board__Group_12__2__Impl rule__Board__Group_12__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1726:1: rule__Board__Group_12__2__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) ;
    public final void rule__Board__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1730:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) )
            // InternalBgDsl.g:1731:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            {
            // InternalBgDsl.g:1731:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            // InternalBgDsl.g:1732:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_2()); 
            // InternalBgDsl.g:1733:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            // InternalBgDsl.g:1733:3: rule__Board__LegalMovesPipelineAssignment_12_2
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
    // InternalBgDsl.g:1741:1: rule__Board__Group_12__3 : rule__Board__Group_12__3__Impl rule__Board__Group_12__4 ;
    public final void rule__Board__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1745:1: ( rule__Board__Group_12__3__Impl rule__Board__Group_12__4 )
            // InternalBgDsl.g:1746:2: rule__Board__Group_12__3__Impl rule__Board__Group_12__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1753:1: rule__Board__Group_12__3__Impl : ( ( rule__Board__Group_12_3__0 )* ) ;
    public final void rule__Board__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1757:1: ( ( ( rule__Board__Group_12_3__0 )* ) )
            // InternalBgDsl.g:1758:1: ( ( rule__Board__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:1758:1: ( ( rule__Board__Group_12_3__0 )* )
            // InternalBgDsl.g:1759:2: ( rule__Board__Group_12_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_12_3()); 
            // InternalBgDsl.g:1760:2: ( rule__Board__Group_12_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBgDsl.g:1760:3: rule__Board__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Board__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBgDsl.g:1768:1: rule__Board__Group_12__4 : rule__Board__Group_12__4__Impl ;
    public final void rule__Board__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1772:1: ( rule__Board__Group_12__4__Impl )
            // InternalBgDsl.g:1773:2: rule__Board__Group_12__4__Impl
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
    // InternalBgDsl.g:1779:1: rule__Board__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1783:1: ( ( '}' ) )
            // InternalBgDsl.g:1784:1: ( '}' )
            {
            // InternalBgDsl.g:1784:1: ( '}' )
            // InternalBgDsl.g:1785:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1795:1: rule__Board__Group_12_3__0 : rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 ;
    public final void rule__Board__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1799:1: ( rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 )
            // InternalBgDsl.g:1800:2: rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1
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
    // InternalBgDsl.g:1807:1: rule__Board__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1811:1: ( ( ',' ) )
            // InternalBgDsl.g:1812:1: ( ',' )
            {
            // InternalBgDsl.g:1812:1: ( ',' )
            // InternalBgDsl.g:1813:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_12_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:1822:1: rule__Board__Group_12_3__1 : rule__Board__Group_12_3__1__Impl ;
    public final void rule__Board__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1826:1: ( rule__Board__Group_12_3__1__Impl )
            // InternalBgDsl.g:1827:2: rule__Board__Group_12_3__1__Impl
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
    // InternalBgDsl.g:1833:1: rule__Board__Group_12_3__1__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) ;
    public final void rule__Board__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1837:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:1838:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:1838:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            // InternalBgDsl.g:1839:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_3_1()); 
            // InternalBgDsl.g:1840:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            // InternalBgDsl.g:1840:3: rule__Board__LegalMovesPipelineAssignment_12_3_1
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
    // InternalBgDsl.g:1849:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1853:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBgDsl.g:1854:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
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
    // InternalBgDsl.g:1861:1: rule__Board__Group_13__0__Impl : ( 'effectPipeline' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1865:1: ( ( 'effectPipeline' ) )
            // InternalBgDsl.g:1866:1: ( 'effectPipeline' )
            {
            // InternalBgDsl.g:1866:1: ( 'effectPipeline' )
            // InternalBgDsl.g:1867:2: 'effectPipeline'
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBgDsl.g:1876:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl rule__Board__Group_13__2 ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1880:1: ( rule__Board__Group_13__1__Impl rule__Board__Group_13__2 )
            // InternalBgDsl.g:1881:2: rule__Board__Group_13__1__Impl rule__Board__Group_13__2
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
    // InternalBgDsl.g:1888:1: rule__Board__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1892:1: ( ( '{' ) )
            // InternalBgDsl.g:1893:1: ( '{' )
            {
            // InternalBgDsl.g:1893:1: ( '{' )
            // InternalBgDsl.g:1894:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1903:1: rule__Board__Group_13__2 : rule__Board__Group_13__2__Impl rule__Board__Group_13__3 ;
    public final void rule__Board__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1907:1: ( rule__Board__Group_13__2__Impl rule__Board__Group_13__3 )
            // InternalBgDsl.g:1908:2: rule__Board__Group_13__2__Impl rule__Board__Group_13__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1915:1: rule__Board__Group_13__2__Impl : ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) ;
    public final void rule__Board__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1919:1: ( ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) )
            // InternalBgDsl.g:1920:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            {
            // InternalBgDsl.g:1920:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            // InternalBgDsl.g:1921:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_2()); 
            // InternalBgDsl.g:1922:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            // InternalBgDsl.g:1922:3: rule__Board__EffectPipelineAssignment_13_2
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
    // InternalBgDsl.g:1930:1: rule__Board__Group_13__3 : rule__Board__Group_13__3__Impl rule__Board__Group_13__4 ;
    public final void rule__Board__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1934:1: ( rule__Board__Group_13__3__Impl rule__Board__Group_13__4 )
            // InternalBgDsl.g:1935:2: rule__Board__Group_13__3__Impl rule__Board__Group_13__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:1942:1: rule__Board__Group_13__3__Impl : ( ( rule__Board__Group_13_3__0 )* ) ;
    public final void rule__Board__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1946:1: ( ( ( rule__Board__Group_13_3__0 )* ) )
            // InternalBgDsl.g:1947:1: ( ( rule__Board__Group_13_3__0 )* )
            {
            // InternalBgDsl.g:1947:1: ( ( rule__Board__Group_13_3__0 )* )
            // InternalBgDsl.g:1948:2: ( rule__Board__Group_13_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_13_3()); 
            // InternalBgDsl.g:1949:2: ( rule__Board__Group_13_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBgDsl.g:1949:3: rule__Board__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Board__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBgDsl.g:1957:1: rule__Board__Group_13__4 : rule__Board__Group_13__4__Impl ;
    public final void rule__Board__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1961:1: ( rule__Board__Group_13__4__Impl )
            // InternalBgDsl.g:1962:2: rule__Board__Group_13__4__Impl
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
    // InternalBgDsl.g:1968:1: rule__Board__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1972:1: ( ( '}' ) )
            // InternalBgDsl.g:1973:1: ( '}' )
            {
            // InternalBgDsl.g:1973:1: ( '}' )
            // InternalBgDsl.g:1974:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:1984:1: rule__Board__Group_13_3__0 : rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 ;
    public final void rule__Board__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1988:1: ( rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 )
            // InternalBgDsl.g:1989:2: rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1
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
    // InternalBgDsl.g:1996:1: rule__Board__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2000:1: ( ( ',' ) )
            // InternalBgDsl.g:2001:1: ( ',' )
            {
            // InternalBgDsl.g:2001:1: ( ',' )
            // InternalBgDsl.g:2002:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:2011:1: rule__Board__Group_13_3__1 : rule__Board__Group_13_3__1__Impl ;
    public final void rule__Board__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2015:1: ( rule__Board__Group_13_3__1__Impl )
            // InternalBgDsl.g:2016:2: rule__Board__Group_13_3__1__Impl
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
    // InternalBgDsl.g:2022:1: rule__Board__Group_13_3__1__Impl : ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) ;
    public final void rule__Board__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2026:1: ( ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) )
            // InternalBgDsl.g:2027:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            {
            // InternalBgDsl.g:2027:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            // InternalBgDsl.g:2028:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_3_1()); 
            // InternalBgDsl.g:2029:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            // InternalBgDsl.g:2029:3: rule__Board__EffectPipelineAssignment_13_3_1
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
    // InternalBgDsl.g:2038:1: rule__Board__Group_17__0 : rule__Board__Group_17__0__Impl rule__Board__Group_17__1 ;
    public final void rule__Board__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2042:1: ( rule__Board__Group_17__0__Impl rule__Board__Group_17__1 )
            // InternalBgDsl.g:2043:2: rule__Board__Group_17__0__Impl rule__Board__Group_17__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBgDsl.g:2050:1: rule__Board__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2054:1: ( ( ',' ) )
            // InternalBgDsl.g:2055:1: ( ',' )
            {
            // InternalBgDsl.g:2055:1: ( ',' )
            // InternalBgDsl.g:2056:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_17_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:2065:1: rule__Board__Group_17__1 : rule__Board__Group_17__1__Impl ;
    public final void rule__Board__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2069:1: ( rule__Board__Group_17__1__Impl )
            // InternalBgDsl.g:2070:2: rule__Board__Group_17__1__Impl
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
    // InternalBgDsl.g:2076:1: rule__Board__Group_17__1__Impl : ( ( rule__Board__TileplacementAssignment_17_1 ) ) ;
    public final void rule__Board__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2080:1: ( ( ( rule__Board__TileplacementAssignment_17_1 ) ) )
            // InternalBgDsl.g:2081:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            {
            // InternalBgDsl.g:2081:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            // InternalBgDsl.g:2082:2: ( rule__Board__TileplacementAssignment_17_1 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_17_1()); 
            // InternalBgDsl.g:2083:2: ( rule__Board__TileplacementAssignment_17_1 )
            // InternalBgDsl.g:2083:3: rule__Board__TileplacementAssignment_17_1
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
    // InternalBgDsl.g:2092:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2096:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalBgDsl.g:2097:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalBgDsl.g:2104:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2108:1: ( ( 'Player' ) )
            // InternalBgDsl.g:2109:1: ( 'Player' )
            {
            // InternalBgDsl.g:2109:1: ( 'Player' )
            // InternalBgDsl.g:2110:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBgDsl.g:2119:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2123:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalBgDsl.g:2124:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalBgDsl.g:2131:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2135:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalBgDsl.g:2136:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:2136:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalBgDsl.g:2137:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:2138:2: ( rule__Player__NameAssignment_1 )
            // InternalBgDsl.g:2138:3: rule__Player__NameAssignment_1
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
    // InternalBgDsl.g:2146:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2150:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalBgDsl.g:2151:2: rule__Player__Group__2__Impl rule__Player__Group__3
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
    // InternalBgDsl.g:2158:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2162:1: ( ( '{' ) )
            // InternalBgDsl.g:2163:1: ( '{' )
            {
            // InternalBgDsl.g:2163:1: ( '{' )
            // InternalBgDsl.g:2164:2: '{'
            {
             before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2173:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2177:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalBgDsl.g:2178:2: rule__Player__Group__3__Impl rule__Player__Group__4
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
    // InternalBgDsl.g:2185:1: rule__Player__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2189:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2190:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2190:1: ( 'hexColor' )
            // InternalBgDsl.g:2191:2: 'hexColor'
            {
             before(grammarAccess.getPlayerAccess().getHexColorKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBgDsl.g:2200:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2204:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalBgDsl.g:2205:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalBgDsl.g:2212:1: rule__Player__Group__4__Impl : ( ( rule__Player__HexColorAssignment_4 ) ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2216:1: ( ( ( rule__Player__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2217:1: ( ( rule__Player__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2217:1: ( ( rule__Player__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2218:2: ( rule__Player__HexColorAssignment_4 )
            {
             before(grammarAccess.getPlayerAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2219:2: ( rule__Player__HexColorAssignment_4 )
            // InternalBgDsl.g:2219:3: rule__Player__HexColorAssignment_4
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
    // InternalBgDsl.g:2227:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2231:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalBgDsl.g:2232:2: rule__Player__Group__5__Impl rule__Player__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__6();

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
    // InternalBgDsl.g:2239:1: rule__Player__Group__5__Impl : ( 'associatedState' ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2243:1: ( ( 'associatedState' ) )
            // InternalBgDsl.g:2244:1: ( 'associatedState' )
            {
            // InternalBgDsl.g:2244:1: ( 'associatedState' )
            // InternalBgDsl.g:2245:2: 'associatedState'
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getAssociatedStateKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Player__Group__6"
    // InternalBgDsl.g:2254:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2258:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalBgDsl.g:2259:2: rule__Player__Group__6__Impl rule__Player__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__7();

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
    // $ANTLR end "rule__Player__Group__6"


    // $ANTLR start "rule__Player__Group__6__Impl"
    // InternalBgDsl.g:2266:1: rule__Player__Group__6__Impl : ( ( rule__Player__AssociatedStateAssignment_6 ) ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2270:1: ( ( ( rule__Player__AssociatedStateAssignment_6 ) ) )
            // InternalBgDsl.g:2271:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            {
            // InternalBgDsl.g:2271:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            // InternalBgDsl.g:2272:2: ( rule__Player__AssociatedStateAssignment_6 )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateAssignment_6()); 
            // InternalBgDsl.g:2273:2: ( rule__Player__AssociatedStateAssignment_6 )
            // InternalBgDsl.g:2273:3: rule__Player__AssociatedStateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Player__AssociatedStateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getAssociatedStateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__6__Impl"


    // $ANTLR start "rule__Player__Group__7"
    // InternalBgDsl.g:2281:1: rule__Player__Group__7 : rule__Player__Group__7__Impl ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2285:1: ( rule__Player__Group__7__Impl )
            // InternalBgDsl.g:2286:2: rule__Player__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__7__Impl();

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
    // $ANTLR end "rule__Player__Group__7"


    // $ANTLR start "rule__Player__Group__7__Impl"
    // InternalBgDsl.g:2292:1: rule__Player__Group__7__Impl : ( '}' ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2296:1: ( ( '}' ) )
            // InternalBgDsl.g:2297:1: ( '}' )
            {
            // InternalBgDsl.g:2297:1: ( '}' )
            // InternalBgDsl.g:2298:2: '}'
            {
             before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__7__Impl"


    // $ANTLR start "rule__TurnPolicy__Group__0"
    // InternalBgDsl.g:2308:1: rule__TurnPolicy__Group__0 : rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 ;
    public final void rule__TurnPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2312:1: ( rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 )
            // InternalBgDsl.g:2313:2: rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1
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
    // InternalBgDsl.g:2320:1: rule__TurnPolicy__Group__0__Impl : ( 'TurnPolicy' ) ;
    public final void rule__TurnPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2324:1: ( ( 'TurnPolicy' ) )
            // InternalBgDsl.g:2325:1: ( 'TurnPolicy' )
            {
            // InternalBgDsl.g:2325:1: ( 'TurnPolicy' )
            // InternalBgDsl.g:2326:2: 'TurnPolicy'
            {
             before(grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBgDsl.g:2335:1: rule__TurnPolicy__Group__1 : rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 ;
    public final void rule__TurnPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2339:1: ( rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 )
            // InternalBgDsl.g:2340:2: rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBgDsl.g:2347:1: rule__TurnPolicy__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2351:1: ( ( '{' ) )
            // InternalBgDsl.g:2352:1: ( '{' )
            {
            // InternalBgDsl.g:2352:1: ( '{' )
            // InternalBgDsl.g:2353:2: '{'
            {
             before(grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2362:1: rule__TurnPolicy__Group__2 : rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 ;
    public final void rule__TurnPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2366:1: ( rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 )
            // InternalBgDsl.g:2367:2: rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2374:1: rule__TurnPolicy__Group__2__Impl : ( 'type' ) ;
    public final void rule__TurnPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2378:1: ( ( 'type' ) )
            // InternalBgDsl.g:2379:1: ( 'type' )
            {
            // InternalBgDsl.g:2379:1: ( 'type' )
            // InternalBgDsl.g:2380:2: 'type'
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBgDsl.g:2389:1: rule__TurnPolicy__Group__3 : rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 ;
    public final void rule__TurnPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2393:1: ( rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 )
            // InternalBgDsl.g:2394:2: rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:2401:1: rule__TurnPolicy__Group__3__Impl : ( ( rule__TurnPolicy__TypeAssignment_3 ) ) ;
    public final void rule__TurnPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2405:1: ( ( ( rule__TurnPolicy__TypeAssignment_3 ) ) )
            // InternalBgDsl.g:2406:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            {
            // InternalBgDsl.g:2406:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            // InternalBgDsl.g:2407:2: ( rule__TurnPolicy__TypeAssignment_3 )
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeAssignment_3()); 
            // InternalBgDsl.g:2408:2: ( rule__TurnPolicy__TypeAssignment_3 )
            // InternalBgDsl.g:2408:3: rule__TurnPolicy__TypeAssignment_3
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
    // InternalBgDsl.g:2416:1: rule__TurnPolicy__Group__4 : rule__TurnPolicy__Group__4__Impl ;
    public final void rule__TurnPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2420:1: ( rule__TurnPolicy__Group__4__Impl )
            // InternalBgDsl.g:2421:2: rule__TurnPolicy__Group__4__Impl
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
    // InternalBgDsl.g:2427:1: rule__TurnPolicy__Group__4__Impl : ( '}' ) ;
    public final void rule__TurnPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2431:1: ( ( '}' ) )
            // InternalBgDsl.g:2432:1: ( '}' )
            {
            // InternalBgDsl.g:2432:1: ( '}' )
            // InternalBgDsl.g:2433:2: '}'
            {
             before(grammarAccess.getTurnPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:2443:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2447:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBgDsl.g:2448:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:2455:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2459:1: ( ( ( '-' )? ) )
            // InternalBgDsl.g:2460:1: ( ( '-' )? )
            {
            // InternalBgDsl.g:2460:1: ( ( '-' )? )
            // InternalBgDsl.g:2461:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBgDsl.g:2462:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:2462:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalBgDsl.g:2470:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2474:1: ( rule__EInt__Group__1__Impl )
            // InternalBgDsl.g:2475:2: rule__EInt__Group__1__Impl
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
    // InternalBgDsl.g:2481:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2485:1: ( ( RULE_INT ) )
            // InternalBgDsl.g:2486:1: ( RULE_INT )
            {
            // InternalBgDsl.g:2486:1: ( RULE_INT )
            // InternalBgDsl.g:2487:2: RULE_INT
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
    // InternalBgDsl.g:2497:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2501:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalBgDsl.g:2502:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
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
    // InternalBgDsl.g:2509:1: rule__Tile__Group__0__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2513:1: ( ( 'Tile' ) )
            // InternalBgDsl.g:2514:1: ( 'Tile' )
            {
            // InternalBgDsl.g:2514:1: ( 'Tile' )
            // InternalBgDsl.g:2515:2: 'Tile'
            {
             before(grammarAccess.getTileAccess().getTileKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBgDsl.g:2524:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2528:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalBgDsl.g:2529:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
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
    // InternalBgDsl.g:2536:1: rule__Tile__Group__1__Impl : ( ( rule__Tile__TypeAssignment_1 ) ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2540:1: ( ( ( rule__Tile__TypeAssignment_1 ) ) )
            // InternalBgDsl.g:2541:1: ( ( rule__Tile__TypeAssignment_1 ) )
            {
            // InternalBgDsl.g:2541:1: ( ( rule__Tile__TypeAssignment_1 ) )
            // InternalBgDsl.g:2542:2: ( rule__Tile__TypeAssignment_1 )
            {
             before(grammarAccess.getTileAccess().getTypeAssignment_1()); 
            // InternalBgDsl.g:2543:2: ( rule__Tile__TypeAssignment_1 )
            // InternalBgDsl.g:2543:3: rule__Tile__TypeAssignment_1
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
    // InternalBgDsl.g:2551:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2555:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalBgDsl.g:2556:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
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
    // InternalBgDsl.g:2563:1: rule__Tile__Group__2__Impl : ( '{' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2567:1: ( ( '{' ) )
            // InternalBgDsl.g:2568:1: ( '{' )
            {
            // InternalBgDsl.g:2568:1: ( '{' )
            // InternalBgDsl.g:2569:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2578:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2582:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalBgDsl.g:2583:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
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
    // InternalBgDsl.g:2590:1: rule__Tile__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2594:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2595:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2595:1: ( 'hexColor' )
            // InternalBgDsl.g:2596:2: 'hexColor'
            {
             before(grammarAccess.getTileAccess().getHexColorKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBgDsl.g:2605:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2609:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalBgDsl.g:2610:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalBgDsl.g:2617:1: rule__Tile__Group__4__Impl : ( ( rule__Tile__HexColorAssignment_4 ) ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2621:1: ( ( ( rule__Tile__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2622:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2622:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2623:2: ( rule__Tile__HexColorAssignment_4 )
            {
             before(grammarAccess.getTileAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2624:2: ( rule__Tile__HexColorAssignment_4 )
            // InternalBgDsl.g:2624:3: rule__Tile__HexColorAssignment_4
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
    // InternalBgDsl.g:2632:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2636:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalBgDsl.g:2637:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
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
    // InternalBgDsl.g:2644:1: rule__Tile__Group__5__Impl : ( 'name' ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2648:1: ( ( 'name' ) )
            // InternalBgDsl.g:2649:1: ( 'name' )
            {
            // InternalBgDsl.g:2649:1: ( 'name' )
            // InternalBgDsl.g:2650:2: 'name'
            {
             before(grammarAccess.getTileAccess().getNameKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBgDsl.g:2659:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2663:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalBgDsl.g:2664:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2671:1: rule__Tile__Group__6__Impl : ( ( rule__Tile__NameAssignment_6 ) ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2675:1: ( ( ( rule__Tile__NameAssignment_6 ) ) )
            // InternalBgDsl.g:2676:1: ( ( rule__Tile__NameAssignment_6 ) )
            {
            // InternalBgDsl.g:2676:1: ( ( rule__Tile__NameAssignment_6 ) )
            // InternalBgDsl.g:2677:2: ( rule__Tile__NameAssignment_6 )
            {
             before(grammarAccess.getTileAccess().getNameAssignment_6()); 
            // InternalBgDsl.g:2678:2: ( rule__Tile__NameAssignment_6 )
            // InternalBgDsl.g:2678:3: rule__Tile__NameAssignment_6
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
    // InternalBgDsl.g:2686:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2690:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalBgDsl.g:2691:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
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
    // InternalBgDsl.g:2698:1: rule__Tile__Group__7__Impl : ( 'states' ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2702:1: ( ( 'states' ) )
            // InternalBgDsl.g:2703:1: ( 'states' )
            {
            // InternalBgDsl.g:2703:1: ( 'states' )
            // InternalBgDsl.g:2704:2: 'states'
            {
             before(grammarAccess.getTileAccess().getStatesKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBgDsl.g:2713:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2717:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalBgDsl.g:2718:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:2725:1: rule__Tile__Group__8__Impl : ( '{' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2729:1: ( ( '{' ) )
            // InternalBgDsl.g:2730:1: ( '{' )
            {
            // InternalBgDsl.g:2730:1: ( '{' )
            // InternalBgDsl.g:2731:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2740:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2744:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalBgDsl.g:2745:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:2752:1: rule__Tile__Group__9__Impl : ( ( rule__Tile__StatesAssignment_9 ) ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2756:1: ( ( ( rule__Tile__StatesAssignment_9 ) ) )
            // InternalBgDsl.g:2757:1: ( ( rule__Tile__StatesAssignment_9 ) )
            {
            // InternalBgDsl.g:2757:1: ( ( rule__Tile__StatesAssignment_9 ) )
            // InternalBgDsl.g:2758:2: ( rule__Tile__StatesAssignment_9 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_9()); 
            // InternalBgDsl.g:2759:2: ( rule__Tile__StatesAssignment_9 )
            // InternalBgDsl.g:2759:3: rule__Tile__StatesAssignment_9
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
    // InternalBgDsl.g:2767:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2771:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalBgDsl.g:2772:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:2779:1: rule__Tile__Group__10__Impl : ( ( rule__Tile__Group_10__0 )* ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2783:1: ( ( ( rule__Tile__Group_10__0 )* ) )
            // InternalBgDsl.g:2784:1: ( ( rule__Tile__Group_10__0 )* )
            {
            // InternalBgDsl.g:2784:1: ( ( rule__Tile__Group_10__0 )* )
            // InternalBgDsl.g:2785:2: ( rule__Tile__Group_10__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_10()); 
            // InternalBgDsl.g:2786:2: ( rule__Tile__Group_10__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBgDsl.g:2786:3: rule__Tile__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tile__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBgDsl.g:2794:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2798:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalBgDsl.g:2799:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:2806:1: rule__Tile__Group__11__Impl : ( '}' ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2810:1: ( ( '}' ) )
            // InternalBgDsl.g:2811:1: ( '}' )
            {
            // InternalBgDsl.g:2811:1: ( '}' )
            // InternalBgDsl.g:2812:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:2821:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl rule__Tile__Group__13 ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2825:1: ( rule__Tile__Group__12__Impl rule__Tile__Group__13 )
            // InternalBgDsl.g:2826:2: rule__Tile__Group__12__Impl rule__Tile__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:2833:1: rule__Tile__Group__12__Impl : ( ( rule__Tile__Group_12__0 )? ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2837:1: ( ( ( rule__Tile__Group_12__0 )? ) )
            // InternalBgDsl.g:2838:1: ( ( rule__Tile__Group_12__0 )? )
            {
            // InternalBgDsl.g:2838:1: ( ( rule__Tile__Group_12__0 )? )
            // InternalBgDsl.g:2839:2: ( rule__Tile__Group_12__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_12()); 
            // InternalBgDsl.g:2840:2: ( rule__Tile__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBgDsl.g:2840:3: rule__Tile__Group_12__0
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
    // InternalBgDsl.g:2848:1: rule__Tile__Group__13 : rule__Tile__Group__13__Impl rule__Tile__Group__14 ;
    public final void rule__Tile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2852:1: ( rule__Tile__Group__13__Impl rule__Tile__Group__14 )
            // InternalBgDsl.g:2853:2: rule__Tile__Group__13__Impl rule__Tile__Group__14
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:2860:1: rule__Tile__Group__13__Impl : ( 'initialState' ) ;
    public final void rule__Tile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2864:1: ( ( 'initialState' ) )
            // InternalBgDsl.g:2865:1: ( 'initialState' )
            {
            // InternalBgDsl.g:2865:1: ( 'initialState' )
            // InternalBgDsl.g:2866:2: 'initialState'
            {
             before(grammarAccess.getTileAccess().getInitialStateKeyword_13()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBgDsl.g:2875:1: rule__Tile__Group__14 : rule__Tile__Group__14__Impl rule__Tile__Group__15 ;
    public final void rule__Tile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2879:1: ( rule__Tile__Group__14__Impl rule__Tile__Group__15 )
            // InternalBgDsl.g:2880:2: rule__Tile__Group__14__Impl rule__Tile__Group__15
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:2887:1: rule__Tile__Group__14__Impl : ( ( rule__Tile__InitialStateAssignment_14 ) ) ;
    public final void rule__Tile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2891:1: ( ( ( rule__Tile__InitialStateAssignment_14 ) ) )
            // InternalBgDsl.g:2892:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            {
            // InternalBgDsl.g:2892:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            // InternalBgDsl.g:2893:2: ( rule__Tile__InitialStateAssignment_14 )
            {
             before(grammarAccess.getTileAccess().getInitialStateAssignment_14()); 
            // InternalBgDsl.g:2894:2: ( rule__Tile__InitialStateAssignment_14 )
            // InternalBgDsl.g:2894:3: rule__Tile__InitialStateAssignment_14
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
    // InternalBgDsl.g:2902:1: rule__Tile__Group__15 : rule__Tile__Group__15__Impl ;
    public final void rule__Tile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2906:1: ( rule__Tile__Group__15__Impl )
            // InternalBgDsl.g:2907:2: rule__Tile__Group__15__Impl
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
    // InternalBgDsl.g:2913:1: rule__Tile__Group__15__Impl : ( '}' ) ;
    public final void rule__Tile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2917:1: ( ( '}' ) )
            // InternalBgDsl.g:2918:1: ( '}' )
            {
            // InternalBgDsl.g:2918:1: ( '}' )
            // InternalBgDsl.g:2919:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:2929:1: rule__Tile__Group_10__0 : rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 ;
    public final void rule__Tile__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2933:1: ( rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 )
            // InternalBgDsl.g:2934:2: rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:2941:1: rule__Tile__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2945:1: ( ( ',' ) )
            // InternalBgDsl.g:2946:1: ( ',' )
            {
            // InternalBgDsl.g:2946:1: ( ',' )
            // InternalBgDsl.g:2947:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_10_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:2956:1: rule__Tile__Group_10__1 : rule__Tile__Group_10__1__Impl ;
    public final void rule__Tile__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2960:1: ( rule__Tile__Group_10__1__Impl )
            // InternalBgDsl.g:2961:2: rule__Tile__Group_10__1__Impl
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
    // InternalBgDsl.g:2967:1: rule__Tile__Group_10__1__Impl : ( ( rule__Tile__StatesAssignment_10_1 ) ) ;
    public final void rule__Tile__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2971:1: ( ( ( rule__Tile__StatesAssignment_10_1 ) ) )
            // InternalBgDsl.g:2972:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:2972:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            // InternalBgDsl.g:2973:2: ( rule__Tile__StatesAssignment_10_1 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_10_1()); 
            // InternalBgDsl.g:2974:2: ( rule__Tile__StatesAssignment_10_1 )
            // InternalBgDsl.g:2974:3: rule__Tile__StatesAssignment_10_1
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
    // InternalBgDsl.g:2983:1: rule__Tile__Group_12__0 : rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 ;
    public final void rule__Tile__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2987:1: ( rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 )
            // InternalBgDsl.g:2988:2: rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1
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
    // InternalBgDsl.g:2995:1: rule__Tile__Group_12__0__Impl : ( 'transitions' ) ;
    public final void rule__Tile__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2999:1: ( ( 'transitions' ) )
            // InternalBgDsl.g:3000:1: ( 'transitions' )
            {
            // InternalBgDsl.g:3000:1: ( 'transitions' )
            // InternalBgDsl.g:3001:2: 'transitions'
            {
             before(grammarAccess.getTileAccess().getTransitionsKeyword_12_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBgDsl.g:3010:1: rule__Tile__Group_12__1 : rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 ;
    public final void rule__Tile__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3014:1: ( rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 )
            // InternalBgDsl.g:3015:2: rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:3022:1: rule__Tile__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3026:1: ( ( '{' ) )
            // InternalBgDsl.g:3027:1: ( '{' )
            {
            // InternalBgDsl.g:3027:1: ( '{' )
            // InternalBgDsl.g:3028:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3037:1: rule__Tile__Group_12__2 : rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 ;
    public final void rule__Tile__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3041:1: ( rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 )
            // InternalBgDsl.g:3042:2: rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:3049:1: rule__Tile__Group_12__2__Impl : ( ( rule__Tile__TransitionsAssignment_12_2 ) ) ;
    public final void rule__Tile__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3053:1: ( ( ( rule__Tile__TransitionsAssignment_12_2 ) ) )
            // InternalBgDsl.g:3054:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            {
            // InternalBgDsl.g:3054:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            // InternalBgDsl.g:3055:2: ( rule__Tile__TransitionsAssignment_12_2 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_2()); 
            // InternalBgDsl.g:3056:2: ( rule__Tile__TransitionsAssignment_12_2 )
            // InternalBgDsl.g:3056:3: rule__Tile__TransitionsAssignment_12_2
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
    // InternalBgDsl.g:3064:1: rule__Tile__Group_12__3 : rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 ;
    public final void rule__Tile__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3068:1: ( rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 )
            // InternalBgDsl.g:3069:2: rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:3076:1: rule__Tile__Group_12__3__Impl : ( ( rule__Tile__Group_12_3__0 )* ) ;
    public final void rule__Tile__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3080:1: ( ( ( rule__Tile__Group_12_3__0 )* ) )
            // InternalBgDsl.g:3081:1: ( ( rule__Tile__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:3081:1: ( ( rule__Tile__Group_12_3__0 )* )
            // InternalBgDsl.g:3082:2: ( rule__Tile__Group_12_3__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_12_3()); 
            // InternalBgDsl.g:3083:2: ( rule__Tile__Group_12_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBgDsl.g:3083:3: rule__Tile__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tile__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBgDsl.g:3091:1: rule__Tile__Group_12__4 : rule__Tile__Group_12__4__Impl ;
    public final void rule__Tile__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3095:1: ( rule__Tile__Group_12__4__Impl )
            // InternalBgDsl.g:3096:2: rule__Tile__Group_12__4__Impl
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
    // InternalBgDsl.g:3102:1: rule__Tile__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Tile__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3106:1: ( ( '}' ) )
            // InternalBgDsl.g:3107:1: ( '}' )
            {
            // InternalBgDsl.g:3107:1: ( '}' )
            // InternalBgDsl.g:3108:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:3118:1: rule__Tile__Group_12_3__0 : rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 ;
    public final void rule__Tile__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3122:1: ( rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 )
            // InternalBgDsl.g:3123:2: rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:3130:1: rule__Tile__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3134:1: ( ( ',' ) )
            // InternalBgDsl.g:3135:1: ( ',' )
            {
            // InternalBgDsl.g:3135:1: ( ',' )
            // InternalBgDsl.g:3136:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_12_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:3145:1: rule__Tile__Group_12_3__1 : rule__Tile__Group_12_3__1__Impl ;
    public final void rule__Tile__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3149:1: ( rule__Tile__Group_12_3__1__Impl )
            // InternalBgDsl.g:3150:2: rule__Tile__Group_12_3__1__Impl
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
    // InternalBgDsl.g:3156:1: rule__Tile__Group_12_3__1__Impl : ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) ;
    public final void rule__Tile__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3160:1: ( ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:3161:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:3161:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            // InternalBgDsl.g:3162:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_3_1()); 
            // InternalBgDsl.g:3163:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            // InternalBgDsl.g:3163:3: rule__Tile__TransitionsAssignment_12_3_1
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
    // InternalBgDsl.g:3172:1: rule__LegalMovesPipeline__Group__0 : rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 ;
    public final void rule__LegalMovesPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3176:1: ( rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 )
            // InternalBgDsl.g:3177:2: rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1
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
    // InternalBgDsl.g:3184:1: rule__LegalMovesPipeline__Group__0__Impl : ( () ) ;
    public final void rule__LegalMovesPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3188:1: ( ( () ) )
            // InternalBgDsl.g:3189:1: ( () )
            {
            // InternalBgDsl.g:3189:1: ( () )
            // InternalBgDsl.g:3190:2: ()
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 
            // InternalBgDsl.g:3191:2: ()
            // InternalBgDsl.g:3191:3: 
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
    // InternalBgDsl.g:3199:1: rule__LegalMovesPipeline__Group__1 : rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 ;
    public final void rule__LegalMovesPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3203:1: ( rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 )
            // InternalBgDsl.g:3204:2: rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2
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
    // InternalBgDsl.g:3211:1: rule__LegalMovesPipeline__Group__1__Impl : ( 'LegalMovesPipeline' ) ;
    public final void rule__LegalMovesPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3215:1: ( ( 'LegalMovesPipeline' ) )
            // InternalBgDsl.g:3216:1: ( 'LegalMovesPipeline' )
            {
            // InternalBgDsl.g:3216:1: ( 'LegalMovesPipeline' )
            // InternalBgDsl.g:3217:2: 'LegalMovesPipeline'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBgDsl.g:3226:1: rule__LegalMovesPipeline__Group__2 : rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 ;
    public final void rule__LegalMovesPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3230:1: ( rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 )
            // InternalBgDsl.g:3231:2: rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3238:1: rule__LegalMovesPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3242:1: ( ( '{' ) )
            // InternalBgDsl.g:3243:1: ( '{' )
            {
            // InternalBgDsl.g:3243:1: ( '{' )
            // InternalBgDsl.g:3244:2: '{'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3253:1: rule__LegalMovesPipeline__Group__3 : rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 ;
    public final void rule__LegalMovesPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3257:1: ( rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 )
            // InternalBgDsl.g:3258:2: rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3265:1: rule__LegalMovesPipeline__Group__3__Impl : ( ( rule__LegalMovesPipeline__Group_3__0 )? ) ;
    public final void rule__LegalMovesPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3269:1: ( ( ( rule__LegalMovesPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3270:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3270:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3271:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3272:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBgDsl.g:3272:3: rule__LegalMovesPipeline__Group_3__0
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
    // InternalBgDsl.g:3280:1: rule__LegalMovesPipeline__Group__4 : rule__LegalMovesPipeline__Group__4__Impl ;
    public final void rule__LegalMovesPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3284:1: ( rule__LegalMovesPipeline__Group__4__Impl )
            // InternalBgDsl.g:3285:2: rule__LegalMovesPipeline__Group__4__Impl
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
    // InternalBgDsl.g:3291:1: rule__LegalMovesPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3295:1: ( ( '}' ) )
            // InternalBgDsl.g:3296:1: ( '}' )
            {
            // InternalBgDsl.g:3296:1: ( '}' )
            // InternalBgDsl.g:3297:2: '}'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:3307:1: rule__LegalMovesPipeline__Group_3__0 : rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3311:1: ( rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 )
            // InternalBgDsl.g:3312:2: rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBgDsl.g:3319:1: rule__LegalMovesPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__LegalMovesPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3323:1: ( ( 'filter' ) )
            // InternalBgDsl.g:3324:1: ( 'filter' )
            {
            // InternalBgDsl.g:3324:1: ( 'filter' )
            // InternalBgDsl.g:3325:2: 'filter'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBgDsl.g:3334:1: rule__LegalMovesPipeline__Group_3__1 : rule__LegalMovesPipeline__Group_3__1__Impl ;
    public final void rule__LegalMovesPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3338:1: ( rule__LegalMovesPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:3339:2: rule__LegalMovesPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:3345:1: rule__LegalMovesPipeline__Group_3__1__Impl : ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3349:1: ( ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3350:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3350:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:3351:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:3352:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:3352:3: rule__LegalMovesPipeline__FilterAssignment_3_1
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
    // InternalBgDsl.g:3361:1: rule__EffectPipeline__Group__0 : rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 ;
    public final void rule__EffectPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3365:1: ( rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 )
            // InternalBgDsl.g:3366:2: rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1
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
    // InternalBgDsl.g:3373:1: rule__EffectPipeline__Group__0__Impl : ( () ) ;
    public final void rule__EffectPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3377:1: ( ( () ) )
            // InternalBgDsl.g:3378:1: ( () )
            {
            // InternalBgDsl.g:3378:1: ( () )
            // InternalBgDsl.g:3379:2: ()
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 
            // InternalBgDsl.g:3380:2: ()
            // InternalBgDsl.g:3380:3: 
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
    // InternalBgDsl.g:3388:1: rule__EffectPipeline__Group__1 : rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 ;
    public final void rule__EffectPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3392:1: ( rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 )
            // InternalBgDsl.g:3393:2: rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2
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
    // InternalBgDsl.g:3400:1: rule__EffectPipeline__Group__1__Impl : ( 'EffectPipeline' ) ;
    public final void rule__EffectPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3404:1: ( ( 'EffectPipeline' ) )
            // InternalBgDsl.g:3405:1: ( 'EffectPipeline' )
            {
            // InternalBgDsl.g:3405:1: ( 'EffectPipeline' )
            // InternalBgDsl.g:3406:2: 'EffectPipeline'
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBgDsl.g:3415:1: rule__EffectPipeline__Group__2 : rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 ;
    public final void rule__EffectPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3419:1: ( rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 )
            // InternalBgDsl.g:3420:2: rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3427:1: rule__EffectPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3431:1: ( ( '{' ) )
            // InternalBgDsl.g:3432:1: ( '{' )
            {
            // InternalBgDsl.g:3432:1: ( '{' )
            // InternalBgDsl.g:3433:2: '{'
            {
             before(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3442:1: rule__EffectPipeline__Group__3 : rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 ;
    public final void rule__EffectPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3446:1: ( rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 )
            // InternalBgDsl.g:3447:2: rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3454:1: rule__EffectPipeline__Group__3__Impl : ( ( rule__EffectPipeline__Group_3__0 )? ) ;
    public final void rule__EffectPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3458:1: ( ( ( rule__EffectPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3459:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3459:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3460:2: ( rule__EffectPipeline__Group_3__0 )?
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3461:2: ( rule__EffectPipeline__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:3461:3: rule__EffectPipeline__Group_3__0
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
    // InternalBgDsl.g:3469:1: rule__EffectPipeline__Group__4 : rule__EffectPipeline__Group__4__Impl ;
    public final void rule__EffectPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3473:1: ( rule__EffectPipeline__Group__4__Impl )
            // InternalBgDsl.g:3474:2: rule__EffectPipeline__Group__4__Impl
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
    // InternalBgDsl.g:3480:1: rule__EffectPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3484:1: ( ( '}' ) )
            // InternalBgDsl.g:3485:1: ( '}' )
            {
            // InternalBgDsl.g:3485:1: ( '}' )
            // InternalBgDsl.g:3486:2: '}'
            {
             before(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:3496:1: rule__EffectPipeline__Group_3__0 : rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 ;
    public final void rule__EffectPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3500:1: ( rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 )
            // InternalBgDsl.g:3501:2: rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBgDsl.g:3508:1: rule__EffectPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__EffectPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3512:1: ( ( 'filter' ) )
            // InternalBgDsl.g:3513:1: ( 'filter' )
            {
            // InternalBgDsl.g:3513:1: ( 'filter' )
            // InternalBgDsl.g:3514:2: 'filter'
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBgDsl.g:3523:1: rule__EffectPipeline__Group_3__1 : rule__EffectPipeline__Group_3__1__Impl ;
    public final void rule__EffectPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3527:1: ( rule__EffectPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:3528:2: rule__EffectPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:3534:1: rule__EffectPipeline__Group_3__1__Impl : ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__EffectPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3538:1: ( ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3539:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3539:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:3540:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:3541:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:3541:3: rule__EffectPipeline__FilterAssignment_3_1
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
    // InternalBgDsl.g:3550:1: rule__TilePlacement__Group__0 : rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 ;
    public final void rule__TilePlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3554:1: ( rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 )
            // InternalBgDsl.g:3555:2: rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1
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
    // InternalBgDsl.g:3562:1: rule__TilePlacement__Group__0__Impl : ( 'TilePlacement' ) ;
    public final void rule__TilePlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3566:1: ( ( 'TilePlacement' ) )
            // InternalBgDsl.g:3567:1: ( 'TilePlacement' )
            {
            // InternalBgDsl.g:3567:1: ( 'TilePlacement' )
            // InternalBgDsl.g:3568:2: 'TilePlacement'
            {
             before(grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBgDsl.g:3577:1: rule__TilePlacement__Group__1 : rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 ;
    public final void rule__TilePlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3581:1: ( rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 )
            // InternalBgDsl.g:3582:2: rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBgDsl.g:3589:1: rule__TilePlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__TilePlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3593:1: ( ( '{' ) )
            // InternalBgDsl.g:3594:1: ( '{' )
            {
            // InternalBgDsl.g:3594:1: ( '{' )
            // InternalBgDsl.g:3595:2: '{'
            {
             before(grammarAccess.getTilePlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3604:1: rule__TilePlacement__Group__2 : rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 ;
    public final void rule__TilePlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3608:1: ( rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 )
            // InternalBgDsl.g:3609:2: rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:3616:1: rule__TilePlacement__Group__2__Impl : ( 'row' ) ;
    public final void rule__TilePlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3620:1: ( ( 'row' ) )
            // InternalBgDsl.g:3621:1: ( 'row' )
            {
            // InternalBgDsl.g:3621:1: ( 'row' )
            // InternalBgDsl.g:3622:2: 'row'
            {
             before(grammarAccess.getTilePlacementAccess().getRowKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBgDsl.g:3631:1: rule__TilePlacement__Group__3 : rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 ;
    public final void rule__TilePlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3635:1: ( rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 )
            // InternalBgDsl.g:3636:2: rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBgDsl.g:3643:1: rule__TilePlacement__Group__3__Impl : ( ( rule__TilePlacement__RowAssignment_3 ) ) ;
    public final void rule__TilePlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3647:1: ( ( ( rule__TilePlacement__RowAssignment_3 ) ) )
            // InternalBgDsl.g:3648:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            {
            // InternalBgDsl.g:3648:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            // InternalBgDsl.g:3649:2: ( rule__TilePlacement__RowAssignment_3 )
            {
             before(grammarAccess.getTilePlacementAccess().getRowAssignment_3()); 
            // InternalBgDsl.g:3650:2: ( rule__TilePlacement__RowAssignment_3 )
            // InternalBgDsl.g:3650:3: rule__TilePlacement__RowAssignment_3
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
    // InternalBgDsl.g:3658:1: rule__TilePlacement__Group__4 : rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 ;
    public final void rule__TilePlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3662:1: ( rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 )
            // InternalBgDsl.g:3663:2: rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:3670:1: rule__TilePlacement__Group__4__Impl : ( 'column' ) ;
    public final void rule__TilePlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3674:1: ( ( 'column' ) )
            // InternalBgDsl.g:3675:1: ( 'column' )
            {
            // InternalBgDsl.g:3675:1: ( 'column' )
            // InternalBgDsl.g:3676:2: 'column'
            {
             before(grammarAccess.getTilePlacementAccess().getColumnKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBgDsl.g:3685:1: rule__TilePlacement__Group__5 : rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 ;
    public final void rule__TilePlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3689:1: ( rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 )
            // InternalBgDsl.g:3690:2: rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalBgDsl.g:3697:1: rule__TilePlacement__Group__5__Impl : ( ( rule__TilePlacement__ColumnAssignment_5 ) ) ;
    public final void rule__TilePlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3701:1: ( ( ( rule__TilePlacement__ColumnAssignment_5 ) ) )
            // InternalBgDsl.g:3702:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            {
            // InternalBgDsl.g:3702:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            // InternalBgDsl.g:3703:2: ( rule__TilePlacement__ColumnAssignment_5 )
            {
             before(grammarAccess.getTilePlacementAccess().getColumnAssignment_5()); 
            // InternalBgDsl.g:3704:2: ( rule__TilePlacement__ColumnAssignment_5 )
            // InternalBgDsl.g:3704:3: rule__TilePlacement__ColumnAssignment_5
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
    // InternalBgDsl.g:3712:1: rule__TilePlacement__Group__6 : rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 ;
    public final void rule__TilePlacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3716:1: ( rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 )
            // InternalBgDsl.g:3717:2: rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7
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
    // InternalBgDsl.g:3724:1: rule__TilePlacement__Group__6__Impl : ( 'tile' ) ;
    public final void rule__TilePlacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3728:1: ( ( 'tile' ) )
            // InternalBgDsl.g:3729:1: ( 'tile' )
            {
            // InternalBgDsl.g:3729:1: ( 'tile' )
            // InternalBgDsl.g:3730:2: 'tile'
            {
             before(grammarAccess.getTilePlacementAccess().getTileKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBgDsl.g:3739:1: rule__TilePlacement__Group__7 : rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 ;
    public final void rule__TilePlacement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3743:1: ( rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 )
            // InternalBgDsl.g:3744:2: rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:3751:1: rule__TilePlacement__Group__7__Impl : ( ( rule__TilePlacement__TileAssignment_7 ) ) ;
    public final void rule__TilePlacement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3755:1: ( ( ( rule__TilePlacement__TileAssignment_7 ) ) )
            // InternalBgDsl.g:3756:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            {
            // InternalBgDsl.g:3756:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            // InternalBgDsl.g:3757:2: ( rule__TilePlacement__TileAssignment_7 )
            {
             before(grammarAccess.getTilePlacementAccess().getTileAssignment_7()); 
            // InternalBgDsl.g:3758:2: ( rule__TilePlacement__TileAssignment_7 )
            // InternalBgDsl.g:3758:3: rule__TilePlacement__TileAssignment_7
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
    // InternalBgDsl.g:3766:1: rule__TilePlacement__Group__8 : rule__TilePlacement__Group__8__Impl ;
    public final void rule__TilePlacement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3770:1: ( rule__TilePlacement__Group__8__Impl )
            // InternalBgDsl.g:3771:2: rule__TilePlacement__Group__8__Impl
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
    // InternalBgDsl.g:3777:1: rule__TilePlacement__Group__8__Impl : ( '}' ) ;
    public final void rule__TilePlacement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3781:1: ( ( '}' ) )
            // InternalBgDsl.g:3782:1: ( '}' )
            {
            // InternalBgDsl.g:3782:1: ( '}' )
            // InternalBgDsl.g:3783:2: '}'
            {
             before(grammarAccess.getTilePlacementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:3793:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3797:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBgDsl.g:3798:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalBgDsl.g:3805:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3809:1: ( ( 'State' ) )
            // InternalBgDsl.g:3810:1: ( 'State' )
            {
            // InternalBgDsl.g:3810:1: ( 'State' )
            // InternalBgDsl.g:3811:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBgDsl.g:3820:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3824:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBgDsl.g:3825:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalBgDsl.g:3832:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3836:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalBgDsl.g:3837:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:3837:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalBgDsl.g:3838:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:3839:2: ( rule__State__NameAssignment_1 )
            // InternalBgDsl.g:3839:3: rule__State__NameAssignment_1
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
    // InternalBgDsl.g:3847:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3851:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBgDsl.g:3852:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalBgDsl.g:3859:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3863:1: ( ( '{' ) )
            // InternalBgDsl.g:3864:1: ( '{' )
            {
            // InternalBgDsl.g:3864:1: ( '{' )
            // InternalBgDsl.g:3865:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3874:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3878:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBgDsl.g:3879:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalBgDsl.g:3886:1: rule__State__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3890:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:3891:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:3891:1: ( 'hexColor' )
            // InternalBgDsl.g:3892:2: 'hexColor'
            {
             before(grammarAccess.getStateAccess().getHexColorKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBgDsl.g:3901:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3905:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBgDsl.g:3906:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3913:1: rule__State__Group__4__Impl : ( ( rule__State__HexColorAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3917:1: ( ( ( rule__State__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:3918:1: ( ( rule__State__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:3918:1: ( ( rule__State__HexColorAssignment_4 ) )
            // InternalBgDsl.g:3919:2: ( rule__State__HexColorAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:3920:2: ( rule__State__HexColorAssignment_4 )
            // InternalBgDsl.g:3920:3: rule__State__HexColorAssignment_4
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
    // InternalBgDsl.g:3928:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3932:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalBgDsl.g:3933:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3940:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3944:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalBgDsl.g:3945:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalBgDsl.g:3945:1: ( ( rule__State__Group_5__0 )? )
            // InternalBgDsl.g:3946:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalBgDsl.g:3947:2: ( rule__State__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:3947:3: rule__State__Group_5__0
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
    // InternalBgDsl.g:3955:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3959:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalBgDsl.g:3960:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3967:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3971:1: ( ( ( rule__State__Group_6__0 )? ) )
            // InternalBgDsl.g:3972:1: ( ( rule__State__Group_6__0 )? )
            {
            // InternalBgDsl.g:3972:1: ( ( rule__State__Group_6__0 )? )
            // InternalBgDsl.g:3973:2: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // InternalBgDsl.g:3974:2: ( rule__State__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBgDsl.g:3974:3: rule__State__Group_6__0
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
    // InternalBgDsl.g:3982:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3986:1: ( rule__State__Group__7__Impl )
            // InternalBgDsl.g:3987:2: rule__State__Group__7__Impl
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
    // InternalBgDsl.g:3993:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3997:1: ( ( '}' ) )
            // InternalBgDsl.g:3998:1: ( '}' )
            {
            // InternalBgDsl.g:3998:1: ( '}' )
            // InternalBgDsl.g:3999:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:4009:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4013:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalBgDsl.g:4014:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBgDsl.g:4021:1: rule__State__Group_5__0__Impl : ( 'outbound' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4025:1: ( ( 'outbound' ) )
            // InternalBgDsl.g:4026:1: ( 'outbound' )
            {
            // InternalBgDsl.g:4026:1: ( 'outbound' )
            // InternalBgDsl.g:4027:2: 'outbound'
            {
             before(grammarAccess.getStateAccess().getOutboundKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBgDsl.g:4036:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4040:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalBgDsl.g:4041:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalBgDsl.g:4048:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4052:1: ( ( '(' ) )
            // InternalBgDsl.g:4053:1: ( '(' )
            {
            // InternalBgDsl.g:4053:1: ( '(' )
            // InternalBgDsl.g:4054:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBgDsl.g:4063:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4067:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalBgDsl.g:4068:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4075:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutboundAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4079:1: ( ( ( rule__State__OutboundAssignment_5_2 ) ) )
            // InternalBgDsl.g:4080:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            {
            // InternalBgDsl.g:4080:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            // InternalBgDsl.g:4081:2: ( rule__State__OutboundAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_2()); 
            // InternalBgDsl.g:4082:2: ( rule__State__OutboundAssignment_5_2 )
            // InternalBgDsl.g:4082:3: rule__State__OutboundAssignment_5_2
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
    // InternalBgDsl.g:4090:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4094:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalBgDsl.g:4095:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4102:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4106:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalBgDsl.g:4107:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalBgDsl.g:4107:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalBgDsl.g:4108:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalBgDsl.g:4109:2: ( rule__State__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBgDsl.g:4109:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBgDsl.g:4117:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4121:1: ( rule__State__Group_5__4__Impl )
            // InternalBgDsl.g:4122:2: rule__State__Group_5__4__Impl
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
    // InternalBgDsl.g:4128:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4132:1: ( ( ')' ) )
            // InternalBgDsl.g:4133:1: ( ')' )
            {
            // InternalBgDsl.g:4133:1: ( ')' )
            // InternalBgDsl.g:4134:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBgDsl.g:4144:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4148:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalBgDsl.g:4149:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
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
    // InternalBgDsl.g:4156:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4160:1: ( ( ',' ) )
            // InternalBgDsl.g:4161:1: ( ',' )
            {
            // InternalBgDsl.g:4161:1: ( ',' )
            // InternalBgDsl.g:4162:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:4171:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4175:1: ( rule__State__Group_5_3__1__Impl )
            // InternalBgDsl.g:4176:2: rule__State__Group_5_3__1__Impl
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
    // InternalBgDsl.g:4182:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutboundAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4186:1: ( ( ( rule__State__OutboundAssignment_5_3_1 ) ) )
            // InternalBgDsl.g:4187:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            {
            // InternalBgDsl.g:4187:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            // InternalBgDsl.g:4188:2: ( rule__State__OutboundAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_3_1()); 
            // InternalBgDsl.g:4189:2: ( rule__State__OutboundAssignment_5_3_1 )
            // InternalBgDsl.g:4189:3: rule__State__OutboundAssignment_5_3_1
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
    // InternalBgDsl.g:4198:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4202:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // InternalBgDsl.g:4203:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBgDsl.g:4210:1: rule__State__Group_6__0__Impl : ( 'inbound' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4214:1: ( ( 'inbound' ) )
            // InternalBgDsl.g:4215:1: ( 'inbound' )
            {
            // InternalBgDsl.g:4215:1: ( 'inbound' )
            // InternalBgDsl.g:4216:2: 'inbound'
            {
             before(grammarAccess.getStateAccess().getInboundKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBgDsl.g:4225:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl rule__State__Group_6__2 ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4229:1: ( rule__State__Group_6__1__Impl rule__State__Group_6__2 )
            // InternalBgDsl.g:4230:2: rule__State__Group_6__1__Impl rule__State__Group_6__2
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
    // InternalBgDsl.g:4237:1: rule__State__Group_6__1__Impl : ( '(' ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4241:1: ( ( '(' ) )
            // InternalBgDsl.g:4242:1: ( '(' )
            {
            // InternalBgDsl.g:4242:1: ( '(' )
            // InternalBgDsl.g:4243:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBgDsl.g:4252:1: rule__State__Group_6__2 : rule__State__Group_6__2__Impl rule__State__Group_6__3 ;
    public final void rule__State__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4256:1: ( rule__State__Group_6__2__Impl rule__State__Group_6__3 )
            // InternalBgDsl.g:4257:2: rule__State__Group_6__2__Impl rule__State__Group_6__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4264:1: rule__State__Group_6__2__Impl : ( ( rule__State__InboundAssignment_6_2 ) ) ;
    public final void rule__State__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4268:1: ( ( ( rule__State__InboundAssignment_6_2 ) ) )
            // InternalBgDsl.g:4269:1: ( ( rule__State__InboundAssignment_6_2 ) )
            {
            // InternalBgDsl.g:4269:1: ( ( rule__State__InboundAssignment_6_2 ) )
            // InternalBgDsl.g:4270:2: ( rule__State__InboundAssignment_6_2 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_2()); 
            // InternalBgDsl.g:4271:2: ( rule__State__InboundAssignment_6_2 )
            // InternalBgDsl.g:4271:3: rule__State__InboundAssignment_6_2
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
    // InternalBgDsl.g:4279:1: rule__State__Group_6__3 : rule__State__Group_6__3__Impl rule__State__Group_6__4 ;
    public final void rule__State__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4283:1: ( rule__State__Group_6__3__Impl rule__State__Group_6__4 )
            // InternalBgDsl.g:4284:2: rule__State__Group_6__3__Impl rule__State__Group_6__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4291:1: rule__State__Group_6__3__Impl : ( ( rule__State__Group_6_3__0 )* ) ;
    public final void rule__State__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4295:1: ( ( ( rule__State__Group_6_3__0 )* ) )
            // InternalBgDsl.g:4296:1: ( ( rule__State__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:4296:1: ( ( rule__State__Group_6_3__0 )* )
            // InternalBgDsl.g:4297:2: ( rule__State__Group_6_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_6_3()); 
            // InternalBgDsl.g:4298:2: ( rule__State__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBgDsl.g:4298:3: rule__State__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__State__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBgDsl.g:4306:1: rule__State__Group_6__4 : rule__State__Group_6__4__Impl ;
    public final void rule__State__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4310:1: ( rule__State__Group_6__4__Impl )
            // InternalBgDsl.g:4311:2: rule__State__Group_6__4__Impl
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
    // InternalBgDsl.g:4317:1: rule__State__Group_6__4__Impl : ( ')' ) ;
    public final void rule__State__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4321:1: ( ( ')' ) )
            // InternalBgDsl.g:4322:1: ( ')' )
            {
            // InternalBgDsl.g:4322:1: ( ')' )
            // InternalBgDsl.g:4323:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBgDsl.g:4333:1: rule__State__Group_6_3__0 : rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 ;
    public final void rule__State__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4337:1: ( rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 )
            // InternalBgDsl.g:4338:2: rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1
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
    // InternalBgDsl.g:4345:1: rule__State__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4349:1: ( ( ',' ) )
            // InternalBgDsl.g:4350:1: ( ',' )
            {
            // InternalBgDsl.g:4350:1: ( ',' )
            // InternalBgDsl.g:4351:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_6_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:4360:1: rule__State__Group_6_3__1 : rule__State__Group_6_3__1__Impl ;
    public final void rule__State__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4364:1: ( rule__State__Group_6_3__1__Impl )
            // InternalBgDsl.g:4365:2: rule__State__Group_6_3__1__Impl
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
    // InternalBgDsl.g:4371:1: rule__State__Group_6_3__1__Impl : ( ( rule__State__InboundAssignment_6_3_1 ) ) ;
    public final void rule__State__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4375:1: ( ( ( rule__State__InboundAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:4376:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:4376:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            // InternalBgDsl.g:4377:2: ( rule__State__InboundAssignment_6_3_1 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_3_1()); 
            // InternalBgDsl.g:4378:2: ( rule__State__InboundAssignment_6_3_1 )
            // InternalBgDsl.g:4378:3: rule__State__InboundAssignment_6_3_1
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
    // InternalBgDsl.g:4387:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4391:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBgDsl.g:4392:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalBgDsl.g:4399:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4403:1: ( ( 'Transition' ) )
            // InternalBgDsl.g:4404:1: ( 'Transition' )
            {
            // InternalBgDsl.g:4404:1: ( 'Transition' )
            // InternalBgDsl.g:4405:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBgDsl.g:4414:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4418:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBgDsl.g:4419:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalBgDsl.g:4426:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4430:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4431:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4431:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalBgDsl.g:4432:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4433:2: ( rule__Transition__NameAssignment_1 )
            // InternalBgDsl.g:4433:3: rule__Transition__NameAssignment_1
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
    // InternalBgDsl.g:4441:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4445:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBgDsl.g:4446:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBgDsl.g:4453:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4457:1: ( ( '{' ) )
            // InternalBgDsl.g:4458:1: ( '{' )
            {
            // InternalBgDsl.g:4458:1: ( '{' )
            // InternalBgDsl.g:4459:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:4468:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4472:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBgDsl.g:4473:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalBgDsl.g:4480:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4484:1: ( ( 'source' ) )
            // InternalBgDsl.g:4485:1: ( 'source' )
            {
            // InternalBgDsl.g:4485:1: ( 'source' )
            // InternalBgDsl.g:4486:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBgDsl.g:4495:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4499:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalBgDsl.g:4500:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalBgDsl.g:4507:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4511:1: ( ( '(' ) )
            // InternalBgDsl.g:4512:1: ( '(' )
            {
            // InternalBgDsl.g:4512:1: ( '(' )
            // InternalBgDsl.g:4513:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBgDsl.g:4522:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4526:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalBgDsl.g:4527:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4534:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4538:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalBgDsl.g:4539:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalBgDsl.g:4539:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalBgDsl.g:4540:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalBgDsl.g:4541:2: ( rule__Transition__SourceAssignment_5 )
            // InternalBgDsl.g:4541:3: rule__Transition__SourceAssignment_5
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
    // InternalBgDsl.g:4549:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4553:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalBgDsl.g:4554:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4561:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )* ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4565:1: ( ( ( rule__Transition__Group_6__0 )* ) )
            // InternalBgDsl.g:4566:1: ( ( rule__Transition__Group_6__0 )* )
            {
            // InternalBgDsl.g:4566:1: ( ( rule__Transition__Group_6__0 )* )
            // InternalBgDsl.g:4567:2: ( rule__Transition__Group_6__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalBgDsl.g:4568:2: ( rule__Transition__Group_6__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBgDsl.g:4568:3: rule__Transition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBgDsl.g:4576:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4580:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalBgDsl.g:4581:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_41);
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
    // InternalBgDsl.g:4588:1: rule__Transition__Group__7__Impl : ( ')' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4592:1: ( ( ')' ) )
            // InternalBgDsl.g:4593:1: ( ')' )
            {
            // InternalBgDsl.g:4593:1: ( ')' )
            // InternalBgDsl.g:4594:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBgDsl.g:4603:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4607:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalBgDsl.g:4608:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
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
    // InternalBgDsl.g:4615:1: rule__Transition__Group__8__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4619:1: ( ( 'target' ) )
            // InternalBgDsl.g:4620:1: ( 'target' )
            {
            // InternalBgDsl.g:4620:1: ( 'target' )
            // InternalBgDsl.g:4621:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_8()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBgDsl.g:4630:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4634:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalBgDsl.g:4635:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:4642:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__TargetAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4646:1: ( ( ( rule__Transition__TargetAssignment_9 ) ) )
            // InternalBgDsl.g:4647:1: ( ( rule__Transition__TargetAssignment_9 ) )
            {
            // InternalBgDsl.g:4647:1: ( ( rule__Transition__TargetAssignment_9 ) )
            // InternalBgDsl.g:4648:2: ( rule__Transition__TargetAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 
            // InternalBgDsl.g:4649:2: ( rule__Transition__TargetAssignment_9 )
            // InternalBgDsl.g:4649:3: rule__Transition__TargetAssignment_9
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
    // InternalBgDsl.g:4657:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4661:1: ( rule__Transition__Group__10__Impl )
            // InternalBgDsl.g:4662:2: rule__Transition__Group__10__Impl
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
    // InternalBgDsl.g:4668:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4672:1: ( ( '}' ) )
            // InternalBgDsl.g:4673:1: ( '}' )
            {
            // InternalBgDsl.g:4673:1: ( '}' )
            // InternalBgDsl.g:4674:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:4684:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4688:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalBgDsl.g:4689:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
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
    // InternalBgDsl.g:4696:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4700:1: ( ( ',' ) )
            // InternalBgDsl.g:4701:1: ( ',' )
            {
            // InternalBgDsl.g:4701:1: ( ',' )
            // InternalBgDsl.g:4702:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:4711:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4715:1: ( rule__Transition__Group_6__1__Impl )
            // InternalBgDsl.g:4716:2: rule__Transition__Group_6__1__Impl
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
    // InternalBgDsl.g:4722:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4726:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // InternalBgDsl.g:4727:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // InternalBgDsl.g:4727:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // InternalBgDsl.g:4728:2: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // InternalBgDsl.g:4729:2: ( rule__Transition__SourceAssignment_6_1 )
            // InternalBgDsl.g:4729:3: rule__Transition__SourceAssignment_6_1
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
    // InternalBgDsl.g:4738:1: rule__PatternFilter__Group__0 : rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 ;
    public final void rule__PatternFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4742:1: ( rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 )
            // InternalBgDsl.g:4743:2: rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:4750:1: rule__PatternFilter__Group__0__Impl : ( 'PatternFilter' ) ;
    public final void rule__PatternFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4754:1: ( ( 'PatternFilter' ) )
            // InternalBgDsl.g:4755:1: ( 'PatternFilter' )
            {
            // InternalBgDsl.g:4755:1: ( 'PatternFilter' )
            // InternalBgDsl.g:4756:2: 'PatternFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group__1"
    // InternalBgDsl.g:4765:1: rule__PatternFilter__Group__1 : rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 ;
    public final void rule__PatternFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4769:1: ( rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 )
            // InternalBgDsl.g:4770:2: rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:4777:1: rule__PatternFilter__Group__1__Impl : ( ( rule__PatternFilter__NameAssignment_1 ) ) ;
    public final void rule__PatternFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4781:1: ( ( ( rule__PatternFilter__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4782:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4782:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            // InternalBgDsl.g:4783:2: ( rule__PatternFilter__NameAssignment_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4784:2: ( rule__PatternFilter__NameAssignment_1 )
            // InternalBgDsl.g:4784:3: rule__PatternFilter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalBgDsl.g:4792:1: rule__PatternFilter__Group__2 : rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 ;
    public final void rule__PatternFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4796:1: ( rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 )
            // InternalBgDsl.g:4797:2: rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBgDsl.g:4804:1: rule__PatternFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4808:1: ( ( '{' ) )
            // InternalBgDsl.g:4809:1: ( '{' )
            {
            // InternalBgDsl.g:4809:1: ( '{' )
            // InternalBgDsl.g:4810:2: '{'
            {
             before(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalBgDsl.g:4819:1: rule__PatternFilter__Group__3 : rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 ;
    public final void rule__PatternFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4823:1: ( rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 )
            // InternalBgDsl.g:4824:2: rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalBgDsl.g:4831:1: rule__PatternFilter__Group__3__Impl : ( ( rule__PatternFilter__Group_3__0 )? ) ;
    public final void rule__PatternFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4835:1: ( ( ( rule__PatternFilter__Group_3__0 )? ) )
            // InternalBgDsl.g:4836:1: ( ( rule__PatternFilter__Group_3__0 )? )
            {
            // InternalBgDsl.g:4836:1: ( ( rule__PatternFilter__Group_3__0 )? )
            // InternalBgDsl.g:4837:2: ( rule__PatternFilter__Group_3__0 )?
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_3()); 
            // InternalBgDsl.g:4838:2: ( rule__PatternFilter__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBgDsl.g:4838:3: rule__PatternFilter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternFilter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternFilterAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalBgDsl.g:4846:1: rule__PatternFilter__Group__4 : rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 ;
    public final void rule__PatternFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4850:1: ( rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 )
            // InternalBgDsl.g:4851:2: rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:4858:1: rule__PatternFilter__Group__4__Impl : ( 'patterns' ) ;
    public final void rule__PatternFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4862:1: ( ( 'patterns' ) )
            // InternalBgDsl.g:4863:1: ( 'patterns' )
            {
            // InternalBgDsl.g:4863:1: ( 'patterns' )
            // InternalBgDsl.g:4864:2: 'patterns'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getPatternsKeyword_4()); 

            }


            }

        }
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
    // InternalBgDsl.g:4873:1: rule__PatternFilter__Group__5 : rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 ;
    public final void rule__PatternFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4877:1: ( rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 )
            // InternalBgDsl.g:4878:2: rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalBgDsl.g:4885:1: rule__PatternFilter__Group__5__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4889:1: ( ( '{' ) )
            // InternalBgDsl.g:4890:1: ( '{' )
            {
            // InternalBgDsl.g:4890:1: ( '{' )
            // InternalBgDsl.g:4891:2: '{'
            {
             before(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalBgDsl.g:4900:1: rule__PatternFilter__Group__6 : rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 ;
    public final void rule__PatternFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4904:1: ( rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 )
            // InternalBgDsl.g:4905:2: rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:4912:1: rule__PatternFilter__Group__6__Impl : ( ( rule__PatternFilter__PatternsAssignment_6 ) ) ;
    public final void rule__PatternFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4916:1: ( ( ( rule__PatternFilter__PatternsAssignment_6 ) ) )
            // InternalBgDsl.g:4917:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            {
            // InternalBgDsl.g:4917:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            // InternalBgDsl.g:4918:2: ( rule__PatternFilter__PatternsAssignment_6 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_6()); 
            // InternalBgDsl.g:4919:2: ( rule__PatternFilter__PatternsAssignment_6 )
            // InternalBgDsl.g:4919:3: rule__PatternFilter__PatternsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__PatternsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getPatternsAssignment_6()); 

            }


            }

        }
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
    // InternalBgDsl.g:4927:1: rule__PatternFilter__Group__7 : rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 ;
    public final void rule__PatternFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4931:1: ( rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 )
            // InternalBgDsl.g:4932:2: rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:4939:1: rule__PatternFilter__Group__7__Impl : ( ( rule__PatternFilter__Group_7__0 )* ) ;
    public final void rule__PatternFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4943:1: ( ( ( rule__PatternFilter__Group_7__0 )* ) )
            // InternalBgDsl.g:4944:1: ( ( rule__PatternFilter__Group_7__0 )* )
            {
            // InternalBgDsl.g:4944:1: ( ( rule__PatternFilter__Group_7__0 )* )
            // InternalBgDsl.g:4945:2: ( rule__PatternFilter__Group_7__0 )*
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_7()); 
            // InternalBgDsl.g:4946:2: ( rule__PatternFilter__Group_7__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBgDsl.g:4946:3: rule__PatternFilter__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternFilter__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPatternFilterAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalBgDsl.g:4954:1: rule__PatternFilter__Group__8 : rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 ;
    public final void rule__PatternFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4958:1: ( rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 )
            // InternalBgDsl.g:4959:2: rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9
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
    // InternalBgDsl.g:4966:1: rule__PatternFilter__Group__8__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4970:1: ( ( '}' ) )
            // InternalBgDsl.g:4971:1: ( '}' )
            {
            // InternalBgDsl.g:4971:1: ( '}' )
            // InternalBgDsl.g:4972:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalBgDsl.g:4981:1: rule__PatternFilter__Group__9 : rule__PatternFilter__Group__9__Impl ;
    public final void rule__PatternFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4985:1: ( rule__PatternFilter__Group__9__Impl )
            // InternalBgDsl.g:4986:2: rule__PatternFilter__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group__9__Impl();

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
    // InternalBgDsl.g:4992:1: rule__PatternFilter__Group__9__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4996:1: ( ( '}' ) )
            // InternalBgDsl.g:4997:1: ( '}' )
            {
            // InternalBgDsl.g:4997:1: ( '}' )
            // InternalBgDsl.g:4998:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__PatternFilter__Group_3__0"
    // InternalBgDsl.g:5008:1: rule__PatternFilter__Group_3__0 : rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 ;
    public final void rule__PatternFilter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5012:1: ( rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 )
            // InternalBgDsl.g:5013:2: rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__PatternFilter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_3__1();

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
    // $ANTLR end "rule__PatternFilter__Group_3__0"


    // $ANTLR start "rule__PatternFilter__Group_3__0__Impl"
    // InternalBgDsl.g:5020:1: rule__PatternFilter__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__PatternFilter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5024:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:5025:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:5025:1: ( 'nextFilter' )
            // InternalBgDsl.g:5026:2: 'nextFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterKeyword_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getNextFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_3__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group_3__1"
    // InternalBgDsl.g:5035:1: rule__PatternFilter__Group_3__1 : rule__PatternFilter__Group_3__1__Impl ;
    public final void rule__PatternFilter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5039:1: ( rule__PatternFilter__Group_3__1__Impl )
            // InternalBgDsl.g:5040:2: rule__PatternFilter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_3__1__Impl();

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
    // $ANTLR end "rule__PatternFilter__Group_3__1"


    // $ANTLR start "rule__PatternFilter__Group_3__1__Impl"
    // InternalBgDsl.g:5046:1: rule__PatternFilter__Group_3__1__Impl : ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) ;
    public final void rule__PatternFilter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5050:1: ( ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:5051:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:5051:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:5052:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:5053:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:5053:3: rule__PatternFilter__NextFilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__NextFilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_3__1__Impl"


    // $ANTLR start "rule__PatternFilter__Group_7__0"
    // InternalBgDsl.g:5062:1: rule__PatternFilter__Group_7__0 : rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 ;
    public final void rule__PatternFilter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5066:1: ( rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 )
            // InternalBgDsl.g:5067:2: rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1
            {
            pushFollow(FOLLOW_43);
            rule__PatternFilter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_7__1();

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
    // $ANTLR end "rule__PatternFilter__Group_7__0"


    // $ANTLR start "rule__PatternFilter__Group_7__0__Impl"
    // InternalBgDsl.g:5074:1: rule__PatternFilter__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PatternFilter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5078:1: ( ( ',' ) )
            // InternalBgDsl.g:5079:1: ( ',' )
            {
            // InternalBgDsl.g:5079:1: ( ',' )
            // InternalBgDsl.g:5080:2: ','
            {
             before(grammarAccess.getPatternFilterAccess().getCommaKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternFilterAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_7__0__Impl"


    // $ANTLR start "rule__PatternFilter__Group_7__1"
    // InternalBgDsl.g:5089:1: rule__PatternFilter__Group_7__1 : rule__PatternFilter__Group_7__1__Impl ;
    public final void rule__PatternFilter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5093:1: ( rule__PatternFilter__Group_7__1__Impl )
            // InternalBgDsl.g:5094:2: rule__PatternFilter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__Group_7__1__Impl();

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
    // $ANTLR end "rule__PatternFilter__Group_7__1"


    // $ANTLR start "rule__PatternFilter__Group_7__1__Impl"
    // InternalBgDsl.g:5100:1: rule__PatternFilter__Group_7__1__Impl : ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) ;
    public final void rule__PatternFilter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5104:1: ( ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) )
            // InternalBgDsl.g:5105:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            {
            // InternalBgDsl.g:5105:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            // InternalBgDsl.g:5106:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7_1()); 
            // InternalBgDsl.g:5107:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            // InternalBgDsl.g:5107:3: rule__PatternFilter__PatternsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternFilter__PatternsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__Group_7__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalBgDsl.g:5116:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5120:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalBgDsl.g:5121:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalBgDsl.g:5128:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5132:1: ( ( 'Pattern' ) )
            // InternalBgDsl.g:5133:1: ( 'Pattern' )
            {
            // InternalBgDsl.g:5133:1: ( 'Pattern' )
            // InternalBgDsl.g:5134:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBgDsl.g:5143:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5147:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalBgDsl.g:5148:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalBgDsl.g:5155:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5159:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalBgDsl.g:5160:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:5160:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalBgDsl.g:5161:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:5162:2: ( rule__Pattern__NameAssignment_1 )
            // InternalBgDsl.g:5162:3: rule__Pattern__NameAssignment_1
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
    // InternalBgDsl.g:5170:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5174:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalBgDsl.g:5175:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalBgDsl.g:5182:1: rule__Pattern__Group__2__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5186:1: ( ( '{' ) )
            // InternalBgDsl.g:5187:1: ( '{' )
            {
            // InternalBgDsl.g:5187:1: ( '{' )
            // InternalBgDsl.g:5188:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:5197:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5201:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalBgDsl.g:5202:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalBgDsl.g:5209:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__Group_3__0 )? ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5213:1: ( ( ( rule__Pattern__Group_3__0 )? ) )
            // InternalBgDsl.g:5214:1: ( ( rule__Pattern__Group_3__0 )? )
            {
            // InternalBgDsl.g:5214:1: ( ( rule__Pattern__Group_3__0 )? )
            // InternalBgDsl.g:5215:2: ( rule__Pattern__Group_3__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_3()); 
            // InternalBgDsl.g:5216:2: ( rule__Pattern__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBgDsl.g:5216:3: rule__Pattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalBgDsl.g:5224:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5228:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalBgDsl.g:5229:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalBgDsl.g:5236:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5240:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalBgDsl.g:5241:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalBgDsl.g:5241:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalBgDsl.g:5242:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalBgDsl.g:5243:2: ( rule__Pattern__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==63) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBgDsl.g:5243:3: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalBgDsl.g:5251:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5255:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalBgDsl.g:5256:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:5263:1: rule__Pattern__Group__5__Impl : ( 'relativecoordinates' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5267:1: ( ( 'relativecoordinates' ) )
            // InternalBgDsl.g:5268:1: ( 'relativecoordinates' )
            {
            // InternalBgDsl.g:5268:1: ( 'relativecoordinates' )
            // InternalBgDsl.g:5269:2: 'relativecoordinates'
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5()); 

            }


            }

        }
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
    // InternalBgDsl.g:5278:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5282:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalBgDsl.g:5283:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalBgDsl.g:5290:1: rule__Pattern__Group__6__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5294:1: ( ( '{' ) )
            // InternalBgDsl.g:5295:1: ( '{' )
            {
            // InternalBgDsl.g:5295:1: ( '{' )
            // InternalBgDsl.g:5296:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalBgDsl.g:5305:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5309:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalBgDsl.g:5310:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:5317:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5321:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) )
            // InternalBgDsl.g:5322:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            {
            // InternalBgDsl.g:5322:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            // InternalBgDsl.g:5323:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_7()); 
            // InternalBgDsl.g:5324:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            // InternalBgDsl.g:5324:3: rule__Pattern__RelativecoordinatesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RelativecoordinatesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_7()); 

            }


            }

        }
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
    // InternalBgDsl.g:5332:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl rule__Pattern__Group__9 ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5336:1: ( rule__Pattern__Group__8__Impl rule__Pattern__Group__9 )
            // InternalBgDsl.g:5337:2: rule__Pattern__Group__8__Impl rule__Pattern__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Pattern__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__9();

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
    // InternalBgDsl.g:5344:1: rule__Pattern__Group__8__Impl : ( ( rule__Pattern__Group_8__0 )* ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5348:1: ( ( ( rule__Pattern__Group_8__0 )* ) )
            // InternalBgDsl.g:5349:1: ( ( rule__Pattern__Group_8__0 )* )
            {
            // InternalBgDsl.g:5349:1: ( ( rule__Pattern__Group_8__0 )* )
            // InternalBgDsl.g:5350:2: ( rule__Pattern__Group_8__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_8()); 
            // InternalBgDsl.g:5351:2: ( rule__Pattern__Group_8__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBgDsl.g:5351:3: rule__Pattern__Group_8__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__Group__9"
    // InternalBgDsl.g:5359:1: rule__Pattern__Group__9 : rule__Pattern__Group__9__Impl rule__Pattern__Group__10 ;
    public final void rule__Pattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5363:1: ( rule__Pattern__Group__9__Impl rule__Pattern__Group__10 )
            // InternalBgDsl.g:5364:2: rule__Pattern__Group__9__Impl rule__Pattern__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__10();

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
    // $ANTLR end "rule__Pattern__Group__9"


    // $ANTLR start "rule__Pattern__Group__9__Impl"
    // InternalBgDsl.g:5371:1: rule__Pattern__Group__9__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5375:1: ( ( '}' ) )
            // InternalBgDsl.g:5376:1: ( '}' )
            {
            // InternalBgDsl.g:5376:1: ( '}' )
            // InternalBgDsl.g:5377:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__9__Impl"


    // $ANTLR start "rule__Pattern__Group__10"
    // InternalBgDsl.g:5386:1: rule__Pattern__Group__10 : rule__Pattern__Group__10__Impl ;
    public final void rule__Pattern__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5390:1: ( rule__Pattern__Group__10__Impl )
            // InternalBgDsl.g:5391:2: rule__Pattern__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__10__Impl();

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
    // $ANTLR end "rule__Pattern__Group__10"


    // $ANTLR start "rule__Pattern__Group__10__Impl"
    // InternalBgDsl.g:5397:1: rule__Pattern__Group__10__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5401:1: ( ( '}' ) )
            // InternalBgDsl.g:5402:1: ( '}' )
            {
            // InternalBgDsl.g:5402:1: ( '}' )
            // InternalBgDsl.g:5403:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__10__Impl"


    // $ANTLR start "rule__Pattern__Group_3__0"
    // InternalBgDsl.g:5413:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5417:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalBgDsl.g:5418:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_46);
            rule__Pattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1();

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
    // $ANTLR end "rule__Pattern__Group_3__0"


    // $ANTLR start "rule__Pattern__Group_3__0__Impl"
    // InternalBgDsl.g:5425:1: rule__Pattern__Group_3__0__Impl : ( 'stateSelection' ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5429:1: ( ( 'stateSelection' ) )
            // InternalBgDsl.g:5430:1: ( 'stateSelection' )
            {
            // InternalBgDsl.g:5430:1: ( 'stateSelection' )
            // InternalBgDsl.g:5431:2: 'stateSelection'
            {
             before(grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__0__Impl"


    // $ANTLR start "rule__Pattern__Group_3__1"
    // InternalBgDsl.g:5440:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5444:1: ( rule__Pattern__Group_3__1__Impl )
            // InternalBgDsl.g:5445:2: rule__Pattern__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_3__1"


    // $ANTLR start "rule__Pattern__Group_3__1__Impl"
    // InternalBgDsl.g:5451:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5455:1: ( ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) )
            // InternalBgDsl.g:5456:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            {
            // InternalBgDsl.g:5456:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            // InternalBgDsl.g:5457:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            {
             before(grammarAccess.getPatternAccess().getStateSelectionAssignment_3_1()); 
            // InternalBgDsl.g:5458:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            // InternalBgDsl.g:5458:3: rule__Pattern__StateSelectionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__StateSelectionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getStateSelectionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__1__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalBgDsl.g:5467:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5471:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalBgDsl.g:5472:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

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
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalBgDsl.g:5479:1: rule__Pattern__Group_4__0__Impl : ( 'matchState' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5483:1: ( ( 'matchState' ) )
            // InternalBgDsl.g:5484:1: ( 'matchState' )
            {
            // InternalBgDsl.g:5484:1: ( 'matchState' )
            // InternalBgDsl.g:5485:2: 'matchState'
            {
             before(grammarAccess.getPatternAccess().getMatchStateKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getMatchStateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalBgDsl.g:5494:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5498:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalBgDsl.g:5499:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalBgDsl.g:5505:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5509:1: ( ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) )
            // InternalBgDsl.g:5510:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            {
            // InternalBgDsl.g:5510:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            // InternalBgDsl.g:5511:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getMatchStateAssignment_4_1()); 
            // InternalBgDsl.g:5512:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            // InternalBgDsl.g:5512:3: rule__Pattern__MatchStateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__MatchStateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getMatchStateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Pattern__Group_8__0"
    // InternalBgDsl.g:5521:1: rule__Pattern__Group_8__0 : rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 ;
    public final void rule__Pattern__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5525:1: ( rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 )
            // InternalBgDsl.g:5526:2: rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1
            {
            pushFollow(FOLLOW_45);
            rule__Pattern__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_8__1();

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
    // $ANTLR end "rule__Pattern__Group_8__0"


    // $ANTLR start "rule__Pattern__Group_8__0__Impl"
    // InternalBgDsl.g:5533:1: rule__Pattern__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5537:1: ( ( ',' ) )
            // InternalBgDsl.g:5538:1: ( ',' )
            {
            // InternalBgDsl.g:5538:1: ( ',' )
            // InternalBgDsl.g:5539:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_8__0__Impl"


    // $ANTLR start "rule__Pattern__Group_8__1"
    // InternalBgDsl.g:5548:1: rule__Pattern__Group_8__1 : rule__Pattern__Group_8__1__Impl ;
    public final void rule__Pattern__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5552:1: ( rule__Pattern__Group_8__1__Impl )
            // InternalBgDsl.g:5553:2: rule__Pattern__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_8__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_8__1"


    // $ANTLR start "rule__Pattern__Group_8__1__Impl"
    // InternalBgDsl.g:5559:1: rule__Pattern__Group_8__1__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) ;
    public final void rule__Pattern__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5563:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) )
            // InternalBgDsl.g:5564:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            {
            // InternalBgDsl.g:5564:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            // InternalBgDsl.g:5565:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_8_1()); 
            // InternalBgDsl.g:5566:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            // InternalBgDsl.g:5566:3: rule__Pattern__RelativecoordinatesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RelativecoordinatesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_8__1__Impl"


    // $ANTLR start "rule__RelativeCoordinate__Group__0"
    // InternalBgDsl.g:5575:1: rule__RelativeCoordinate__Group__0 : rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 ;
    public final void rule__RelativeCoordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5579:1: ( rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 )
            // InternalBgDsl.g:5580:2: rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1
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
    // InternalBgDsl.g:5587:1: rule__RelativeCoordinate__Group__0__Impl : ( 'RelativeCoordinate' ) ;
    public final void rule__RelativeCoordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5591:1: ( ( 'RelativeCoordinate' ) )
            // InternalBgDsl.g:5592:1: ( 'RelativeCoordinate' )
            {
            // InternalBgDsl.g:5592:1: ( 'RelativeCoordinate' )
            // InternalBgDsl.g:5593:2: 'RelativeCoordinate'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalBgDsl.g:5602:1: rule__RelativeCoordinate__Group__1 : rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 ;
    public final void rule__RelativeCoordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5606:1: ( rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 )
            // InternalBgDsl.g:5607:2: rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalBgDsl.g:5614:1: rule__RelativeCoordinate__Group__1__Impl : ( '{' ) ;
    public final void rule__RelativeCoordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5618:1: ( ( '{' ) )
            // InternalBgDsl.g:5619:1: ( '{' )
            {
            // InternalBgDsl.g:5619:1: ( '{' )
            // InternalBgDsl.g:5620:2: '{'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:5629:1: rule__RelativeCoordinate__Group__2 : rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 ;
    public final void rule__RelativeCoordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5633:1: ( rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 )
            // InternalBgDsl.g:5634:2: rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:5641:1: rule__RelativeCoordinate__Group__2__Impl : ( 'x' ) ;
    public final void rule__RelativeCoordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5645:1: ( ( 'x' ) )
            // InternalBgDsl.g:5646:1: ( 'x' )
            {
            // InternalBgDsl.g:5646:1: ( 'x' )
            // InternalBgDsl.g:5647:2: 'x'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalBgDsl.g:5656:1: rule__RelativeCoordinate__Group__3 : rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 ;
    public final void rule__RelativeCoordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5660:1: ( rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 )
            // InternalBgDsl.g:5661:2: rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalBgDsl.g:5668:1: rule__RelativeCoordinate__Group__3__Impl : ( ( rule__RelativeCoordinate__XAssignment_3 ) ) ;
    public final void rule__RelativeCoordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5672:1: ( ( ( rule__RelativeCoordinate__XAssignment_3 ) ) )
            // InternalBgDsl.g:5673:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            {
            // InternalBgDsl.g:5673:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            // InternalBgDsl.g:5674:2: ( rule__RelativeCoordinate__XAssignment_3 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXAssignment_3()); 
            // InternalBgDsl.g:5675:2: ( rule__RelativeCoordinate__XAssignment_3 )
            // InternalBgDsl.g:5675:3: rule__RelativeCoordinate__XAssignment_3
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
    // InternalBgDsl.g:5683:1: rule__RelativeCoordinate__Group__4 : rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 ;
    public final void rule__RelativeCoordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5687:1: ( rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 )
            // InternalBgDsl.g:5688:2: rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:5695:1: rule__RelativeCoordinate__Group__4__Impl : ( 'y' ) ;
    public final void rule__RelativeCoordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5699:1: ( ( 'y' ) )
            // InternalBgDsl.g:5700:1: ( 'y' )
            {
            // InternalBgDsl.g:5700:1: ( 'y' )
            // InternalBgDsl.g:5701:2: 'y'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYKeyword_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalBgDsl.g:5710:1: rule__RelativeCoordinate__Group__5 : rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 ;
    public final void rule__RelativeCoordinate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5714:1: ( rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 )
            // InternalBgDsl.g:5715:2: rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:5722:1: rule__RelativeCoordinate__Group__5__Impl : ( ( rule__RelativeCoordinate__YAssignment_5 ) ) ;
    public final void rule__RelativeCoordinate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5726:1: ( ( ( rule__RelativeCoordinate__YAssignment_5 ) ) )
            // InternalBgDsl.g:5727:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            {
            // InternalBgDsl.g:5727:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            // InternalBgDsl.g:5728:2: ( rule__RelativeCoordinate__YAssignment_5 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYAssignment_5()); 
            // InternalBgDsl.g:5729:2: ( rule__RelativeCoordinate__YAssignment_5 )
            // InternalBgDsl.g:5729:3: rule__RelativeCoordinate__YAssignment_5
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
    // InternalBgDsl.g:5737:1: rule__RelativeCoordinate__Group__6 : rule__RelativeCoordinate__Group__6__Impl ;
    public final void rule__RelativeCoordinate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5741:1: ( rule__RelativeCoordinate__Group__6__Impl )
            // InternalBgDsl.g:5742:2: rule__RelativeCoordinate__Group__6__Impl
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
    // InternalBgDsl.g:5748:1: rule__RelativeCoordinate__Group__6__Impl : ( '}' ) ;
    public final void rule__RelativeCoordinate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5752:1: ( ( '}' ) )
            // InternalBgDsl.g:5753:1: ( '}' )
            {
            // InternalBgDsl.g:5753:1: ( '}' )
            // InternalBgDsl.g:5754:2: '}'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:5764:1: rule__Game__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5768:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5769:2: ( ruleEString )
            {
            // InternalBgDsl.g:5769:2: ( ruleEString )
            // InternalBgDsl.g:5770:3: ruleEString
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
    // InternalBgDsl.g:5779:1: rule__Game__InitialPlayerAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Game__InitialPlayerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5783:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5784:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5784:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5785:3: ( ruleEString )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_3_1_0()); 
            // InternalBgDsl.g:5786:3: ( ruleEString )
            // InternalBgDsl.g:5787:4: ruleEString
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
    // InternalBgDsl.g:5798:1: rule__Game__BoardAssignment_5 : ( ruleBoard ) ;
    public final void rule__Game__BoardAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5802:1: ( ( ruleBoard ) )
            // InternalBgDsl.g:5803:2: ( ruleBoard )
            {
            // InternalBgDsl.g:5803:2: ( ruleBoard )
            // InternalBgDsl.g:5804:3: ruleBoard
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
    // InternalBgDsl.g:5813:1: rule__Game__PlayersAssignment_6_2 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5817:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5818:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5818:2: ( rulePlayer )
            // InternalBgDsl.g:5819:3: rulePlayer
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
    // InternalBgDsl.g:5828:1: rule__Game__PlayersAssignment_6_3_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5832:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5833:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5833:2: ( rulePlayer )
            // InternalBgDsl.g:5834:3: rulePlayer
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


    // $ANTLR start "rule__Game__TurnPolicyAssignment_8"
    // InternalBgDsl.g:5843:1: rule__Game__TurnPolicyAssignment_8 : ( ruleTurnPolicy ) ;
    public final void rule__Game__TurnPolicyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5847:1: ( ( ruleTurnPolicy ) )
            // InternalBgDsl.g:5848:2: ( ruleTurnPolicy )
            {
            // InternalBgDsl.g:5848:2: ( ruleTurnPolicy )
            // InternalBgDsl.g:5849:3: ruleTurnPolicy
            {
             before(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnPolicy();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTurnPolicyTurnPolicyParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TurnPolicyAssignment_8"


    // $ANTLR start "rule__Board__CheckeredAssignment_0"
    // InternalBgDsl.g:5858:1: rule__Board__CheckeredAssignment_0 : ( ( 'checkered' ) ) ;
    public final void rule__Board__CheckeredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5862:1: ( ( ( 'checkered' ) ) )
            // InternalBgDsl.g:5863:2: ( ( 'checkered' ) )
            {
            // InternalBgDsl.g:5863:2: ( ( 'checkered' ) )
            // InternalBgDsl.g:5864:3: ( 'checkered' )
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            // InternalBgDsl.g:5865:3: ( 'checkered' )
            // InternalBgDsl.g:5866:4: 'checkered'
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalBgDsl.g:5877:1: rule__Board__WidthAssignment_4 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5881:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5882:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5882:2: ( ruleEInt )
            // InternalBgDsl.g:5883:3: ruleEInt
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
    // InternalBgDsl.g:5892:1: rule__Board__HeightAssignment_6 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5896:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5897:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5897:2: ( ruleEInt )
            // InternalBgDsl.g:5898:3: ruleEInt
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
    // InternalBgDsl.g:5907:1: rule__Board__TilesAssignment_9 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5911:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5912:2: ( ruleTile )
            {
            // InternalBgDsl.g:5912:2: ( ruleTile )
            // InternalBgDsl.g:5913:3: ruleTile
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
    // InternalBgDsl.g:5922:1: rule__Board__TilesAssignment_10_1 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5926:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5927:2: ( ruleTile )
            {
            // InternalBgDsl.g:5927:2: ( ruleTile )
            // InternalBgDsl.g:5928:3: ruleTile
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
    // InternalBgDsl.g:5937:1: rule__Board__LegalMovesPipelineAssignment_12_2 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5941:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:5942:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:5942:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:5943:3: ruleLegalMovesPipeline
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
    // InternalBgDsl.g:5952:1: rule__Board__LegalMovesPipelineAssignment_12_3_1 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5956:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:5957:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:5957:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:5958:3: ruleLegalMovesPipeline
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
    // InternalBgDsl.g:5967:1: rule__Board__EffectPipelineAssignment_13_2 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5971:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:5972:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:5972:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:5973:3: ruleEffectPipeline
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
    // InternalBgDsl.g:5982:1: rule__Board__EffectPipelineAssignment_13_3_1 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5986:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:5987:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:5987:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:5988:3: ruleEffectPipeline
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
    // InternalBgDsl.g:5997:1: rule__Board__TileplacementAssignment_16 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6001:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:6002:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:6002:2: ( ruleTilePlacement )
            // InternalBgDsl.g:6003:3: ruleTilePlacement
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
    // InternalBgDsl.g:6012:1: rule__Board__TileplacementAssignment_17_1 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6016:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:6017:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:6017:2: ( ruleTilePlacement )
            // InternalBgDsl.g:6018:3: ruleTilePlacement
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
    // InternalBgDsl.g:6027:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6031:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6032:2: ( ruleEString )
            {
            // InternalBgDsl.g:6032:2: ( ruleEString )
            // InternalBgDsl.g:6033:3: ruleEString
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
    // InternalBgDsl.g:6042:1: rule__Player__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Player__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6046:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6047:2: ( ruleEString )
            {
            // InternalBgDsl.g:6047:2: ( ruleEString )
            // InternalBgDsl.g:6048:3: ruleEString
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


    // $ANTLR start "rule__Player__AssociatedStateAssignment_6"
    // InternalBgDsl.g:6057:1: rule__Player__AssociatedStateAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Player__AssociatedStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6061:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6062:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6062:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6063:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateStateCrossReference_6_0()); 
            // InternalBgDsl.g:6064:3: ( ruleEString )
            // InternalBgDsl.g:6065:4: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateStateEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getAssociatedStateStateEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getAssociatedStateStateCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__AssociatedStateAssignment_6"


    // $ANTLR start "rule__TurnPolicy__TypeAssignment_3"
    // InternalBgDsl.g:6076:1: rule__TurnPolicy__TypeAssignment_3 : ( ruleTurnType ) ;
    public final void rule__TurnPolicy__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6080:1: ( ( ruleTurnType ) )
            // InternalBgDsl.g:6081:2: ( ruleTurnType )
            {
            // InternalBgDsl.g:6081:2: ( ruleTurnType )
            // InternalBgDsl.g:6082:3: ruleTurnType
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
    // InternalBgDsl.g:6091:1: rule__Tile__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Tile__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6095:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6096:2: ( ruleEString )
            {
            // InternalBgDsl.g:6096:2: ( ruleEString )
            // InternalBgDsl.g:6097:3: ruleEString
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
    // InternalBgDsl.g:6106:1: rule__Tile__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Tile__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6110:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6111:2: ( ruleEString )
            {
            // InternalBgDsl.g:6111:2: ( ruleEString )
            // InternalBgDsl.g:6112:3: ruleEString
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
    // InternalBgDsl.g:6121:1: rule__Tile__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Tile__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6125:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6126:2: ( ruleEString )
            {
            // InternalBgDsl.g:6126:2: ( ruleEString )
            // InternalBgDsl.g:6127:3: ruleEString
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
    // InternalBgDsl.g:6136:1: rule__Tile__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6140:1: ( ( ruleState ) )
            // InternalBgDsl.g:6141:2: ( ruleState )
            {
            // InternalBgDsl.g:6141:2: ( ruleState )
            // InternalBgDsl.g:6142:3: ruleState
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
    // InternalBgDsl.g:6151:1: rule__Tile__StatesAssignment_10_1 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6155:1: ( ( ruleState ) )
            // InternalBgDsl.g:6156:2: ( ruleState )
            {
            // InternalBgDsl.g:6156:2: ( ruleState )
            // InternalBgDsl.g:6157:3: ruleState
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
    // InternalBgDsl.g:6166:1: rule__Tile__TransitionsAssignment_12_2 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6170:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6171:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6171:2: ( ruleTransition )
            // InternalBgDsl.g:6172:3: ruleTransition
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
    // InternalBgDsl.g:6181:1: rule__Tile__TransitionsAssignment_12_3_1 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6185:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6186:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6186:2: ( ruleTransition )
            // InternalBgDsl.g:6187:3: ruleTransition
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
    // InternalBgDsl.g:6196:1: rule__Tile__InitialStateAssignment_14 : ( ruleState ) ;
    public final void rule__Tile__InitialStateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6200:1: ( ( ruleState ) )
            // InternalBgDsl.g:6201:2: ( ruleState )
            {
            // InternalBgDsl.g:6201:2: ( ruleState )
            // InternalBgDsl.g:6202:3: ruleState
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
    // InternalBgDsl.g:6211:1: rule__LegalMovesPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__LegalMovesPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6215:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6216:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6216:2: ( ruleFilter )
            // InternalBgDsl.g:6217:3: ruleFilter
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
    // InternalBgDsl.g:6226:1: rule__EffectPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__EffectPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6230:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6231:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6231:2: ( ruleFilter )
            // InternalBgDsl.g:6232:3: ruleFilter
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
    // InternalBgDsl.g:6241:1: rule__TilePlacement__RowAssignment_3 : ( ruleEInt ) ;
    public final void rule__TilePlacement__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6245:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6246:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6246:2: ( ruleEInt )
            // InternalBgDsl.g:6247:3: ruleEInt
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
    // InternalBgDsl.g:6256:1: rule__TilePlacement__ColumnAssignment_5 : ( ruleEInt ) ;
    public final void rule__TilePlacement__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6260:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6261:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6261:2: ( ruleEInt )
            // InternalBgDsl.g:6262:3: ruleEInt
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
    // InternalBgDsl.g:6271:1: rule__TilePlacement__TileAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TilePlacement__TileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6275:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6276:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6276:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6277:3: ( ruleEString )
            {
             before(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0()); 
            // InternalBgDsl.g:6278:3: ( ruleEString )
            // InternalBgDsl.g:6279:4: ruleEString
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
    // InternalBgDsl.g:6290:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6294:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6295:2: ( ruleEString )
            {
            // InternalBgDsl.g:6295:2: ( ruleEString )
            // InternalBgDsl.g:6296:3: ruleEString
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
    // InternalBgDsl.g:6305:1: rule__State__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__State__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6309:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6310:2: ( ruleEString )
            {
            // InternalBgDsl.g:6310:2: ( ruleEString )
            // InternalBgDsl.g:6311:3: ruleEString
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
    // InternalBgDsl.g:6320:1: rule__State__OutboundAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6324:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6325:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6325:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6326:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0()); 
            // InternalBgDsl.g:6327:3: ( ruleEString )
            // InternalBgDsl.g:6328:4: ruleEString
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
    // InternalBgDsl.g:6339:1: rule__State__OutboundAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6343:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6344:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6344:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6345:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0()); 
            // InternalBgDsl.g:6346:3: ( ruleEString )
            // InternalBgDsl.g:6347:4: ruleEString
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
    // InternalBgDsl.g:6358:1: rule__State__InboundAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6362:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6363:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6363:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6364:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0()); 
            // InternalBgDsl.g:6365:3: ( ruleEString )
            // InternalBgDsl.g:6366:4: ruleEString
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
    // InternalBgDsl.g:6377:1: rule__State__InboundAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6381:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6382:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6382:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6383:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0()); 
            // InternalBgDsl.g:6384:3: ( ruleEString )
            // InternalBgDsl.g:6385:4: ruleEString
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
    // InternalBgDsl.g:6396:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6400:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6401:2: ( ruleEString )
            {
            // InternalBgDsl.g:6401:2: ( ruleEString )
            // InternalBgDsl.g:6402:3: ruleEString
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
    // InternalBgDsl.g:6411:1: rule__Transition__SourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6415:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6416:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6416:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6417:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            // InternalBgDsl.g:6418:3: ( ruleEString )
            // InternalBgDsl.g:6419:4: ruleEString
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
    // InternalBgDsl.g:6430:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6434:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6435:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6435:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6436:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 
            // InternalBgDsl.g:6437:3: ( ruleEString )
            // InternalBgDsl.g:6438:4: ruleEString
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
    // InternalBgDsl.g:6449:1: rule__Transition__TargetAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6453:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6454:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6454:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6455:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 
            // InternalBgDsl.g:6456:3: ( ruleEString )
            // InternalBgDsl.g:6457:4: ruleEString
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


    // $ANTLR start "rule__PatternFilter__NameAssignment_1"
    // InternalBgDsl.g:6468:1: rule__PatternFilter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PatternFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6472:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6473:2: ( ruleEString )
            {
            // InternalBgDsl.g:6473:2: ( ruleEString )
            // InternalBgDsl.g:6474:3: ruleEString
            {
             before(grammarAccess.getPatternFilterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__NameAssignment_1"


    // $ANTLR start "rule__PatternFilter__NextFilterAssignment_3_1"
    // InternalBgDsl.g:6483:1: rule__PatternFilter__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__PatternFilter__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6487:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6488:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6488:2: ( ruleFilter )
            // InternalBgDsl.g:6489:3: ruleFilter
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getNextFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__NextFilterAssignment_3_1"


    // $ANTLR start "rule__PatternFilter__PatternsAssignment_6"
    // InternalBgDsl.g:6498:1: rule__PatternFilter__PatternsAssignment_6 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6502:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6503:2: ( rulePattern )
            {
            // InternalBgDsl.g:6503:2: ( rulePattern )
            // InternalBgDsl.g:6504:3: rulePattern
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__PatternsAssignment_6"


    // $ANTLR start "rule__PatternFilter__PatternsAssignment_7_1"
    // InternalBgDsl.g:6513:1: rule__PatternFilter__PatternsAssignment_7_1 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6517:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6518:2: ( rulePattern )
            {
            // InternalBgDsl.g:6518:2: ( rulePattern )
            // InternalBgDsl.g:6519:3: rulePattern
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternFilterAccess().getPatternsPatternParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternFilter__PatternsAssignment_7_1"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalBgDsl.g:6528:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6532:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6533:2: ( ruleEString )
            {
            // InternalBgDsl.g:6533:2: ( ruleEString )
            // InternalBgDsl.g:6534:3: ruleEString
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


    // $ANTLR start "rule__Pattern__StateSelectionAssignment_3_1"
    // InternalBgDsl.g:6543:1: rule__Pattern__StateSelectionAssignment_3_1 : ( ruleStateSelection ) ;
    public final void rule__Pattern__StateSelectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6547:1: ( ( ruleStateSelection ) )
            // InternalBgDsl.g:6548:2: ( ruleStateSelection )
            {
            // InternalBgDsl.g:6548:2: ( ruleStateSelection )
            // InternalBgDsl.g:6549:3: ruleStateSelection
            {
             before(grammarAccess.getPatternAccess().getStateSelectionStateSelectionEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStateSelection();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getStateSelectionStateSelectionEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__StateSelectionAssignment_3_1"


    // $ANTLR start "rule__Pattern__MatchStateAssignment_4_1"
    // InternalBgDsl.g:6558:1: rule__Pattern__MatchStateAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Pattern__MatchStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6562:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6563:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6563:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6564:3: ( ruleEString )
            {
             before(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0()); 
            // InternalBgDsl.g:6565:3: ( ruleEString )
            // InternalBgDsl.g:6566:4: ruleEString
            {
             before(grammarAccess.getPatternAccess().getMatchStateStateEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getMatchStateStateEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__MatchStateAssignment_4_1"


    // $ANTLR start "rule__Pattern__RelativecoordinatesAssignment_7"
    // InternalBgDsl.g:6577:1: rule__Pattern__RelativecoordinatesAssignment_7 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6581:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6582:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6582:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6583:3: ruleRelativeCoordinate
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RelativecoordinatesAssignment_7"


    // $ANTLR start "rule__Pattern__RelativecoordinatesAssignment_8_1"
    // InternalBgDsl.g:6592:1: rule__Pattern__RelativecoordinatesAssignment_8_1 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6596:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6597:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6597:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6598:3: ruleRelativeCoordinate
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRelativecoordinatesRelativeCoordinateParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RelativecoordinatesAssignment_8_1"


    // $ANTLR start "rule__RelativeCoordinate__XAssignment_3"
    // InternalBgDsl.g:6607:1: rule__RelativeCoordinate__XAssignment_3 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6611:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6612:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6612:2: ( ruleEInt )
            // InternalBgDsl.g:6613:3: ruleEInt
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
    // InternalBgDsl.g:6622:1: rule__RelativeCoordinate__YAssignment_5 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6626:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6627:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6627:2: ( ruleEInt )
            // InternalBgDsl.g:6628:3: ruleEInt
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0024000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}