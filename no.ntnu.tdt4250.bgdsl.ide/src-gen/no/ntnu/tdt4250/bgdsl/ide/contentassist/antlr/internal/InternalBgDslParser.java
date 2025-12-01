package no.ntnu.tdt4250.bgdsl.ide.contentassist.antlr.internal;

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
import no.ntnu.tdt4250.bgdsl.services.BgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBgDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurnBased'", "'Simultaneous'", "'Player'", "'TurnPolicy'", "'{'", "'type'", "'}'", "'Board'", "'width'", "'height'", "'tiles'", "','", "'legalMovesPipeline'", "'effectPipeline'", "'-'", "'Tile'", "'row'", "'col'", "'color'", "'states'", "'initialState'", "'transitions'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'State'", "'hexColor'", "'outbound'", "'inbound'", "'Transition'", "'source'", "'('", "')'", "'target'", "'SomeFilter1'", "'nextFilter'", "'SomeFilter2'", "'checkered'"
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



    // $ANTLR start "entryRulePlayer"
    // InternalBgDsl.g:53:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalBgDsl.g:54:1: ( rulePlayer EOF )
            // InternalBgDsl.g:55:1: rulePlayer EOF
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
    // InternalBgDsl.g:62:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:66:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalBgDsl.g:67:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalBgDsl.g:67:2: ( ( rule__Player__Group__0 ) )
            // InternalBgDsl.g:68:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalBgDsl.g:69:3: ( rule__Player__Group__0 )
            // InternalBgDsl.g:69:4: rule__Player__Group__0
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
    // InternalBgDsl.g:78:1: entryRuleTurnPolicy : ruleTurnPolicy EOF ;
    public final void entryRuleTurnPolicy() throws RecognitionException {
        try {
            // InternalBgDsl.g:79:1: ( ruleTurnPolicy EOF )
            // InternalBgDsl.g:80:1: ruleTurnPolicy EOF
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
    // InternalBgDsl.g:87:1: ruleTurnPolicy : ( ( rule__TurnPolicy__Group__0 ) ) ;
    public final void ruleTurnPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:91:2: ( ( ( rule__TurnPolicy__Group__0 ) ) )
            // InternalBgDsl.g:92:2: ( ( rule__TurnPolicy__Group__0 ) )
            {
            // InternalBgDsl.g:92:2: ( ( rule__TurnPolicy__Group__0 ) )
            // InternalBgDsl.g:93:3: ( rule__TurnPolicy__Group__0 )
            {
             before(grammarAccess.getTurnPolicyAccess().getGroup()); 
            // InternalBgDsl.g:94:3: ( rule__TurnPolicy__Group__0 )
            // InternalBgDsl.g:94:4: rule__TurnPolicy__Group__0
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


    // $ANTLR start "entryRuleFilter"
    // InternalBgDsl.g:128:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:129:1: ( ruleFilter EOF )
            // InternalBgDsl.g:130:1: ruleFilter EOF
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
    // InternalBgDsl.g:137:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:141:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalBgDsl.g:142:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalBgDsl.g:142:2: ( ( rule__Filter__Alternatives ) )
            // InternalBgDsl.g:143:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalBgDsl.g:144:3: ( rule__Filter__Alternatives )
            // InternalBgDsl.g:144:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBgDsl.g:154:1: ( ruleEInt EOF )
            // InternalBgDsl.g:155:1: ruleEInt EOF
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
    // InternalBgDsl.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBgDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBgDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalBgDsl.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBgDsl.g:169:3: ( rule__EInt__Group__0 )
            // InternalBgDsl.g:169:4: rule__EInt__Group__0
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
    // InternalBgDsl.g:178:1: entryRuleTile : ruleTile EOF ;
    public final void entryRuleTile() throws RecognitionException {
        try {
            // InternalBgDsl.g:179:1: ( ruleTile EOF )
            // InternalBgDsl.g:180:1: ruleTile EOF
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
    // InternalBgDsl.g:187:1: ruleTile : ( ( rule__Tile__Group__0 ) ) ;
    public final void ruleTile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:191:2: ( ( ( rule__Tile__Group__0 ) ) )
            // InternalBgDsl.g:192:2: ( ( rule__Tile__Group__0 ) )
            {
            // InternalBgDsl.g:192:2: ( ( rule__Tile__Group__0 ) )
            // InternalBgDsl.g:193:3: ( rule__Tile__Group__0 )
            {
             before(grammarAccess.getTileAccess().getGroup()); 
            // InternalBgDsl.g:194:3: ( rule__Tile__Group__0 )
            // InternalBgDsl.g:194:4: rule__Tile__Group__0
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
    // InternalBgDsl.g:203:1: entryRuleLegalMovesPipeline : ruleLegalMovesPipeline EOF ;
    public final void entryRuleLegalMovesPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:204:1: ( ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:205:1: ruleLegalMovesPipeline EOF
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
    // InternalBgDsl.g:212:1: ruleLegalMovesPipeline : ( ( rule__LegalMovesPipeline__Group__0 ) ) ;
    public final void ruleLegalMovesPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:216:2: ( ( ( rule__LegalMovesPipeline__Group__0 ) ) )
            // InternalBgDsl.g:217:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:217:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            // InternalBgDsl.g:218:3: ( rule__LegalMovesPipeline__Group__0 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup()); 
            // InternalBgDsl.g:219:3: ( rule__LegalMovesPipeline__Group__0 )
            // InternalBgDsl.g:219:4: rule__LegalMovesPipeline__Group__0
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
    // InternalBgDsl.g:228:1: entryRuleEffectPipeline : ruleEffectPipeline EOF ;
    public final void entryRuleEffectPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:229:1: ( ruleEffectPipeline EOF )
            // InternalBgDsl.g:230:1: ruleEffectPipeline EOF
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
    // InternalBgDsl.g:237:1: ruleEffectPipeline : ( ( rule__EffectPipeline__Group__0 ) ) ;
    public final void ruleEffectPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:241:2: ( ( ( rule__EffectPipeline__Group__0 ) ) )
            // InternalBgDsl.g:242:2: ( ( rule__EffectPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:242:2: ( ( rule__EffectPipeline__Group__0 ) )
            // InternalBgDsl.g:243:3: ( rule__EffectPipeline__Group__0 )
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup()); 
            // InternalBgDsl.g:244:3: ( rule__EffectPipeline__Group__0 )
            // InternalBgDsl.g:244:4: rule__EffectPipeline__Group__0
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


    // $ANTLR start "entryRuleState"
    // InternalBgDsl.g:253:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalBgDsl.g:254:1: ( ruleState EOF )
            // InternalBgDsl.g:255:1: ruleState EOF
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
    // InternalBgDsl.g:262:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:266:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalBgDsl.g:267:2: ( ( rule__State__Group__0 ) )
            {
            // InternalBgDsl.g:267:2: ( ( rule__State__Group__0 ) )
            // InternalBgDsl.g:268:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalBgDsl.g:269:3: ( rule__State__Group__0 )
            // InternalBgDsl.g:269:4: rule__State__Group__0
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
    // InternalBgDsl.g:278:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalBgDsl.g:279:1: ( ruleTransition EOF )
            // InternalBgDsl.g:280:1: ruleTransition EOF
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
    // InternalBgDsl.g:287:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:291:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalBgDsl.g:292:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalBgDsl.g:292:2: ( ( rule__Transition__Group__0 ) )
            // InternalBgDsl.g:293:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalBgDsl.g:294:3: ( rule__Transition__Group__0 )
            // InternalBgDsl.g:294:4: rule__Transition__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalBgDsl.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBgDsl.g:304:1: ( ruleEString EOF )
            // InternalBgDsl.g:305:1: ruleEString EOF
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
    // InternalBgDsl.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBgDsl.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBgDsl.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalBgDsl.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBgDsl.g:319:3: ( rule__EString__Alternatives )
            // InternalBgDsl.g:319:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSomeFilter1"
    // InternalBgDsl.g:328:1: entryRuleSomeFilter1 : ruleSomeFilter1 EOF ;
    public final void entryRuleSomeFilter1() throws RecognitionException {
        try {
            // InternalBgDsl.g:329:1: ( ruleSomeFilter1 EOF )
            // InternalBgDsl.g:330:1: ruleSomeFilter1 EOF
            {
             before(grammarAccess.getSomeFilter1Rule()); 
            pushFollow(FOLLOW_1);
            ruleSomeFilter1();

            state._fsp--;

             after(grammarAccess.getSomeFilter1Rule()); 
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
    // $ANTLR end "entryRuleSomeFilter1"


    // $ANTLR start "ruleSomeFilter1"
    // InternalBgDsl.g:337:1: ruleSomeFilter1 : ( ( rule__SomeFilter1__Group__0 ) ) ;
    public final void ruleSomeFilter1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:341:2: ( ( ( rule__SomeFilter1__Group__0 ) ) )
            // InternalBgDsl.g:342:2: ( ( rule__SomeFilter1__Group__0 ) )
            {
            // InternalBgDsl.g:342:2: ( ( rule__SomeFilter1__Group__0 ) )
            // InternalBgDsl.g:343:3: ( rule__SomeFilter1__Group__0 )
            {
             before(grammarAccess.getSomeFilter1Access().getGroup()); 
            // InternalBgDsl.g:344:3: ( rule__SomeFilter1__Group__0 )
            // InternalBgDsl.g:344:4: rule__SomeFilter1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSomeFilter1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSomeFilter1"


    // $ANTLR start "entryRuleSomeFilter2"
    // InternalBgDsl.g:353:1: entryRuleSomeFilter2 : ruleSomeFilter2 EOF ;
    public final void entryRuleSomeFilter2() throws RecognitionException {
        try {
            // InternalBgDsl.g:354:1: ( ruleSomeFilter2 EOF )
            // InternalBgDsl.g:355:1: ruleSomeFilter2 EOF
            {
             before(grammarAccess.getSomeFilter2Rule()); 
            pushFollow(FOLLOW_1);
            ruleSomeFilter2();

            state._fsp--;

             after(grammarAccess.getSomeFilter2Rule()); 
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
    // $ANTLR end "entryRuleSomeFilter2"


    // $ANTLR start "ruleSomeFilter2"
    // InternalBgDsl.g:362:1: ruleSomeFilter2 : ( ( rule__SomeFilter2__Group__0 ) ) ;
    public final void ruleSomeFilter2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:366:2: ( ( ( rule__SomeFilter2__Group__0 ) ) )
            // InternalBgDsl.g:367:2: ( ( rule__SomeFilter2__Group__0 ) )
            {
            // InternalBgDsl.g:367:2: ( ( rule__SomeFilter2__Group__0 ) )
            // InternalBgDsl.g:368:3: ( rule__SomeFilter2__Group__0 )
            {
             before(grammarAccess.getSomeFilter2Access().getGroup()); 
            // InternalBgDsl.g:369:3: ( rule__SomeFilter2__Group__0 )
            // InternalBgDsl.g:369:4: rule__SomeFilter2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSomeFilter2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSomeFilter2"


    // $ANTLR start "ruleTurnType"
    // InternalBgDsl.g:378:1: ruleTurnType : ( ( rule__TurnType__Alternatives ) ) ;
    public final void ruleTurnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:382:1: ( ( ( rule__TurnType__Alternatives ) ) )
            // InternalBgDsl.g:383:2: ( ( rule__TurnType__Alternatives ) )
            {
            // InternalBgDsl.g:383:2: ( ( rule__TurnType__Alternatives ) )
            // InternalBgDsl.g:384:3: ( rule__TurnType__Alternatives )
            {
             before(grammarAccess.getTurnTypeAccess().getAlternatives()); 
            // InternalBgDsl.g:385:3: ( rule__TurnType__Alternatives )
            // InternalBgDsl.g:385:4: rule__TurnType__Alternatives
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


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalBgDsl.g:393:1: rule__Filter__Alternatives : ( ( ruleSomeFilter1 ) | ( ruleSomeFilter2 ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:397:1: ( ( ruleSomeFilter1 ) | ( ruleSomeFilter2 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==47) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBgDsl.g:398:2: ( ruleSomeFilter1 )
                    {
                    // InternalBgDsl.g:398:2: ( ruleSomeFilter1 )
                    // InternalBgDsl.g:399:3: ruleSomeFilter1
                    {
                     before(grammarAccess.getFilterAccess().getSomeFilter1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSomeFilter1();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getSomeFilter1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:404:2: ( ruleSomeFilter2 )
                    {
                    // InternalBgDsl.g:404:2: ( ruleSomeFilter2 )
                    // InternalBgDsl.g:405:3: ruleSomeFilter2
                    {
                     before(grammarAccess.getFilterAccess().getSomeFilter2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSomeFilter2();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getSomeFilter2ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBgDsl.g:414:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:418:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBgDsl.g:419:2: ( RULE_STRING )
                    {
                    // InternalBgDsl.g:419:2: ( RULE_STRING )
                    // InternalBgDsl.g:420:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:425:2: ( RULE_ID )
                    {
                    // InternalBgDsl.g:425:2: ( RULE_ID )
                    // InternalBgDsl.g:426:3: RULE_ID
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
    // InternalBgDsl.g:435:1: rule__TurnType__Alternatives : ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) );
    public final void rule__TurnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:439:1: ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBgDsl.g:440:2: ( ( 'TurnBased' ) )
                    {
                    // InternalBgDsl.g:440:2: ( ( 'TurnBased' ) )
                    // InternalBgDsl.g:441:3: ( 'TurnBased' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:442:3: ( 'TurnBased' )
                    // InternalBgDsl.g:442:4: 'TurnBased'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:446:2: ( ( 'Simultaneous' ) )
                    {
                    // InternalBgDsl.g:446:2: ( ( 'Simultaneous' ) )
                    // InternalBgDsl.g:447:3: ( 'Simultaneous' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:448:3: ( 'Simultaneous' )
                    // InternalBgDsl.g:448:4: 'Simultaneous'
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


    // $ANTLR start "rule__Player__Group__0"
    // InternalBgDsl.g:456:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:460:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalBgDsl.g:461:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalBgDsl.g:468:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:472:1: ( ( 'Player' ) )
            // InternalBgDsl.g:473:1: ( 'Player' )
            {
            // InternalBgDsl.g:473:1: ( 'Player' )
            // InternalBgDsl.g:474:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBgDsl.g:483:1: rule__Player__Group__1 : rule__Player__Group__1__Impl ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:487:1: ( rule__Player__Group__1__Impl )
            // InternalBgDsl.g:488:2: rule__Player__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:494:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:498:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalBgDsl.g:499:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:499:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalBgDsl.g:500:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:501:2: ( rule__Player__NameAssignment_1 )
            // InternalBgDsl.g:501:3: rule__Player__NameAssignment_1
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


    // $ANTLR start "rule__TurnPolicy__Group__0"
    // InternalBgDsl.g:510:1: rule__TurnPolicy__Group__0 : rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 ;
    public final void rule__TurnPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:514:1: ( rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1 )
            // InternalBgDsl.g:515:2: rule__TurnPolicy__Group__0__Impl rule__TurnPolicy__Group__1
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
    // InternalBgDsl.g:522:1: rule__TurnPolicy__Group__0__Impl : ( 'TurnPolicy' ) ;
    public final void rule__TurnPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:526:1: ( ( 'TurnPolicy' ) )
            // InternalBgDsl.g:527:1: ( 'TurnPolicy' )
            {
            // InternalBgDsl.g:527:1: ( 'TurnPolicy' )
            // InternalBgDsl.g:528:2: 'TurnPolicy'
            {
             before(grammarAccess.getTurnPolicyAccess().getTurnPolicyKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBgDsl.g:537:1: rule__TurnPolicy__Group__1 : rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 ;
    public final void rule__TurnPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:541:1: ( rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2 )
            // InternalBgDsl.g:542:2: rule__TurnPolicy__Group__1__Impl rule__TurnPolicy__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBgDsl.g:549:1: rule__TurnPolicy__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:553:1: ( ( '{' ) )
            // InternalBgDsl.g:554:1: ( '{' )
            {
            // InternalBgDsl.g:554:1: ( '{' )
            // InternalBgDsl.g:555:2: '{'
            {
             before(grammarAccess.getTurnPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:564:1: rule__TurnPolicy__Group__2 : rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 ;
    public final void rule__TurnPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:568:1: ( rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3 )
            // InternalBgDsl.g:569:2: rule__TurnPolicy__Group__2__Impl rule__TurnPolicy__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalBgDsl.g:576:1: rule__TurnPolicy__Group__2__Impl : ( 'type' ) ;
    public final void rule__TurnPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:580:1: ( ( 'type' ) )
            // InternalBgDsl.g:581:1: ( 'type' )
            {
            // InternalBgDsl.g:581:1: ( 'type' )
            // InternalBgDsl.g:582:2: 'type'
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBgDsl.g:591:1: rule__TurnPolicy__Group__3 : rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 ;
    public final void rule__TurnPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:595:1: ( rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4 )
            // InternalBgDsl.g:596:2: rule__TurnPolicy__Group__3__Impl rule__TurnPolicy__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalBgDsl.g:603:1: rule__TurnPolicy__Group__3__Impl : ( ( rule__TurnPolicy__TypeAssignment_3 ) ) ;
    public final void rule__TurnPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:607:1: ( ( ( rule__TurnPolicy__TypeAssignment_3 ) ) )
            // InternalBgDsl.g:608:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            {
            // InternalBgDsl.g:608:1: ( ( rule__TurnPolicy__TypeAssignment_3 ) )
            // InternalBgDsl.g:609:2: ( rule__TurnPolicy__TypeAssignment_3 )
            {
             before(grammarAccess.getTurnPolicyAccess().getTypeAssignment_3()); 
            // InternalBgDsl.g:610:2: ( rule__TurnPolicy__TypeAssignment_3 )
            // InternalBgDsl.g:610:3: rule__TurnPolicy__TypeAssignment_3
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
    // InternalBgDsl.g:618:1: rule__TurnPolicy__Group__4 : rule__TurnPolicy__Group__4__Impl ;
    public final void rule__TurnPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:622:1: ( rule__TurnPolicy__Group__4__Impl )
            // InternalBgDsl.g:623:2: rule__TurnPolicy__Group__4__Impl
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
    // InternalBgDsl.g:629:1: rule__TurnPolicy__Group__4__Impl : ( '}' ) ;
    public final void rule__TurnPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:633:1: ( ( '}' ) )
            // InternalBgDsl.g:634:1: ( '}' )
            {
            // InternalBgDsl.g:634:1: ( '}' )
            // InternalBgDsl.g:635:2: '}'
            {
             before(grammarAccess.getTurnPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Board__Group__0"
    // InternalBgDsl.g:645:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:649:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBgDsl.g:650:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBgDsl.g:657:1: rule__Board__Group__0__Impl : ( ( rule__Board__CheckeredAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:661:1: ( ( ( rule__Board__CheckeredAssignment_0 ) ) )
            // InternalBgDsl.g:662:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            {
            // InternalBgDsl.g:662:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            // InternalBgDsl.g:663:2: ( rule__Board__CheckeredAssignment_0 )
            {
             before(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 
            // InternalBgDsl.g:664:2: ( rule__Board__CheckeredAssignment_0 )
            // InternalBgDsl.g:664:3: rule__Board__CheckeredAssignment_0
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
    // InternalBgDsl.g:672:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:676:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBgDsl.g:677:2: rule__Board__Group__1__Impl rule__Board__Group__2
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
    // InternalBgDsl.g:684:1: rule__Board__Group__1__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:688:1: ( ( 'Board' ) )
            // InternalBgDsl.g:689:1: ( 'Board' )
            {
            // InternalBgDsl.g:689:1: ( 'Board' )
            // InternalBgDsl.g:690:2: 'Board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBgDsl.g:699:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:703:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBgDsl.g:704:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:711:1: rule__Board__Group__2__Impl : ( '{' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:715:1: ( ( '{' ) )
            // InternalBgDsl.g:716:1: ( '{' )
            {
            // InternalBgDsl.g:716:1: ( '{' )
            // InternalBgDsl.g:717:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:726:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:730:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBgDsl.g:731:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:738:1: rule__Board__Group__3__Impl : ( 'width' ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:742:1: ( ( 'width' ) )
            // InternalBgDsl.g:743:1: ( 'width' )
            {
            // InternalBgDsl.g:743:1: ( 'width' )
            // InternalBgDsl.g:744:2: 'width'
            {
             before(grammarAccess.getBoardAccess().getWidthKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBgDsl.g:753:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:757:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBgDsl.g:758:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalBgDsl.g:765:1: rule__Board__Group__4__Impl : ( ( rule__Board__WidthAssignment_4 ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:769:1: ( ( ( rule__Board__WidthAssignment_4 ) ) )
            // InternalBgDsl.g:770:1: ( ( rule__Board__WidthAssignment_4 ) )
            {
            // InternalBgDsl.g:770:1: ( ( rule__Board__WidthAssignment_4 ) )
            // InternalBgDsl.g:771:2: ( rule__Board__WidthAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_4()); 
            // InternalBgDsl.g:772:2: ( rule__Board__WidthAssignment_4 )
            // InternalBgDsl.g:772:3: rule__Board__WidthAssignment_4
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
    // InternalBgDsl.g:780:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:784:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBgDsl.g:785:2: rule__Board__Group__5__Impl rule__Board__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:792:1: rule__Board__Group__5__Impl : ( 'height' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:796:1: ( ( 'height' ) )
            // InternalBgDsl.g:797:1: ( 'height' )
            {
            // InternalBgDsl.g:797:1: ( 'height' )
            // InternalBgDsl.g:798:2: 'height'
            {
             before(grammarAccess.getBoardAccess().getHeightKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBgDsl.g:807:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:811:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBgDsl.g:812:2: rule__Board__Group__6__Impl rule__Board__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:819:1: rule__Board__Group__6__Impl : ( ( rule__Board__HeightAssignment_6 ) ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:823:1: ( ( ( rule__Board__HeightAssignment_6 ) ) )
            // InternalBgDsl.g:824:1: ( ( rule__Board__HeightAssignment_6 ) )
            {
            // InternalBgDsl.g:824:1: ( ( rule__Board__HeightAssignment_6 ) )
            // InternalBgDsl.g:825:2: ( rule__Board__HeightAssignment_6 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_6()); 
            // InternalBgDsl.g:826:2: ( rule__Board__HeightAssignment_6 )
            // InternalBgDsl.g:826:3: rule__Board__HeightAssignment_6
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
    // InternalBgDsl.g:834:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:838:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBgDsl.g:839:2: rule__Board__Group__7__Impl rule__Board__Group__8
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
    // InternalBgDsl.g:846:1: rule__Board__Group__7__Impl : ( 'tiles' ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:850:1: ( ( 'tiles' ) )
            // InternalBgDsl.g:851:1: ( 'tiles' )
            {
            // InternalBgDsl.g:851:1: ( 'tiles' )
            // InternalBgDsl.g:852:2: 'tiles'
            {
             before(grammarAccess.getBoardAccess().getTilesKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBgDsl.g:861:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:865:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBgDsl.g:866:2: rule__Board__Group__8__Impl rule__Board__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalBgDsl.g:873:1: rule__Board__Group__8__Impl : ( '{' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:877:1: ( ( '{' ) )
            // InternalBgDsl.g:878:1: ( '{' )
            {
            // InternalBgDsl.g:878:1: ( '{' )
            // InternalBgDsl.g:879:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:888:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:892:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBgDsl.g:893:2: rule__Board__Group__9__Impl rule__Board__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:900:1: rule__Board__Group__9__Impl : ( ( rule__Board__TilesAssignment_9 ) ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:904:1: ( ( ( rule__Board__TilesAssignment_9 ) ) )
            // InternalBgDsl.g:905:1: ( ( rule__Board__TilesAssignment_9 ) )
            {
            // InternalBgDsl.g:905:1: ( ( rule__Board__TilesAssignment_9 ) )
            // InternalBgDsl.g:906:2: ( rule__Board__TilesAssignment_9 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_9()); 
            // InternalBgDsl.g:907:2: ( rule__Board__TilesAssignment_9 )
            // InternalBgDsl.g:907:3: rule__Board__TilesAssignment_9
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
    // InternalBgDsl.g:915:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:919:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBgDsl.g:920:2: rule__Board__Group__10__Impl rule__Board__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:927:1: rule__Board__Group__10__Impl : ( ( rule__Board__Group_10__0 )* ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:931:1: ( ( ( rule__Board__Group_10__0 )* ) )
            // InternalBgDsl.g:932:1: ( ( rule__Board__Group_10__0 )* )
            {
            // InternalBgDsl.g:932:1: ( ( rule__Board__Group_10__0 )* )
            // InternalBgDsl.g:933:2: ( rule__Board__Group_10__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_10()); 
            // InternalBgDsl.g:934:2: ( rule__Board__Group_10__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBgDsl.g:934:3: rule__Board__Group_10__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Board__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalBgDsl.g:942:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:946:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBgDsl.g:947:2: rule__Board__Group__11__Impl rule__Board__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalBgDsl.g:954:1: rule__Board__Group__11__Impl : ( '}' ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:958:1: ( ( '}' ) )
            // InternalBgDsl.g:959:1: ( '}' )
            {
            // InternalBgDsl.g:959:1: ( '}' )
            // InternalBgDsl.g:960:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:969:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:973:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBgDsl.g:974:2: rule__Board__Group__12__Impl rule__Board__Group__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalBgDsl.g:981:1: rule__Board__Group__12__Impl : ( ( rule__Board__Group_12__0 )? ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:985:1: ( ( ( rule__Board__Group_12__0 )? ) )
            // InternalBgDsl.g:986:1: ( ( rule__Board__Group_12__0 )? )
            {
            // InternalBgDsl.g:986:1: ( ( rule__Board__Group_12__0 )? )
            // InternalBgDsl.g:987:2: ( rule__Board__Group_12__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_12()); 
            // InternalBgDsl.g:988:2: ( rule__Board__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:988:3: rule__Board__Group_12__0
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
    // InternalBgDsl.g:996:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1000:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBgDsl.g:1001:2: rule__Board__Group__13__Impl rule__Board__Group__14
            {
            pushFollow(FOLLOW_16);
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
    // InternalBgDsl.g:1008:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1012:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBgDsl.g:1013:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBgDsl.g:1013:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBgDsl.g:1014:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBgDsl.g:1015:2: ( rule__Board__Group_13__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBgDsl.g:1015:3: rule__Board__Group_13__0
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
    // InternalBgDsl.g:1023:1: rule__Board__Group__14 : rule__Board__Group__14__Impl ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1027:1: ( rule__Board__Group__14__Impl )
            // InternalBgDsl.g:1028:2: rule__Board__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__14__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:1034:1: rule__Board__Group__14__Impl : ( '}' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1038:1: ( ( '}' ) )
            // InternalBgDsl.g:1039:1: ( '}' )
            {
            // InternalBgDsl.g:1039:1: ( '}' )
            // InternalBgDsl.g:1040:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_14()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
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


    // $ANTLR start "rule__Board__Group_10__0"
    // InternalBgDsl.g:1050:1: rule__Board__Group_10__0 : rule__Board__Group_10__0__Impl rule__Board__Group_10__1 ;
    public final void rule__Board__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1054:1: ( rule__Board__Group_10__0__Impl rule__Board__Group_10__1 )
            // InternalBgDsl.g:1055:2: rule__Board__Group_10__0__Impl rule__Board__Group_10__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBgDsl.g:1062:1: rule__Board__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1066:1: ( ( ',' ) )
            // InternalBgDsl.g:1067:1: ( ',' )
            {
            // InternalBgDsl.g:1067:1: ( ',' )
            // InternalBgDsl.g:1068:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1077:1: rule__Board__Group_10__1 : rule__Board__Group_10__1__Impl ;
    public final void rule__Board__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1081:1: ( rule__Board__Group_10__1__Impl )
            // InternalBgDsl.g:1082:2: rule__Board__Group_10__1__Impl
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
    // InternalBgDsl.g:1088:1: rule__Board__Group_10__1__Impl : ( ( rule__Board__TilesAssignment_10_1 ) ) ;
    public final void rule__Board__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1092:1: ( ( ( rule__Board__TilesAssignment_10_1 ) ) )
            // InternalBgDsl.g:1093:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:1093:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            // InternalBgDsl.g:1094:2: ( rule__Board__TilesAssignment_10_1 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 
            // InternalBgDsl.g:1095:2: ( rule__Board__TilesAssignment_10_1 )
            // InternalBgDsl.g:1095:3: rule__Board__TilesAssignment_10_1
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
    // InternalBgDsl.g:1104:1: rule__Board__Group_12__0 : rule__Board__Group_12__0__Impl rule__Board__Group_12__1 ;
    public final void rule__Board__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1108:1: ( rule__Board__Group_12__0__Impl rule__Board__Group_12__1 )
            // InternalBgDsl.g:1109:2: rule__Board__Group_12__0__Impl rule__Board__Group_12__1
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
    // InternalBgDsl.g:1116:1: rule__Board__Group_12__0__Impl : ( 'legalMovesPipeline' ) ;
    public final void rule__Board__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1120:1: ( ( 'legalMovesPipeline' ) )
            // InternalBgDsl.g:1121:1: ( 'legalMovesPipeline' )
            {
            // InternalBgDsl.g:1121:1: ( 'legalMovesPipeline' )
            // InternalBgDsl.g:1122:2: 'legalMovesPipeline'
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBgDsl.g:1131:1: rule__Board__Group_12__1 : rule__Board__Group_12__1__Impl rule__Board__Group_12__2 ;
    public final void rule__Board__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1135:1: ( rule__Board__Group_12__1__Impl rule__Board__Group_12__2 )
            // InternalBgDsl.g:1136:2: rule__Board__Group_12__1__Impl rule__Board__Group_12__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:1143:1: rule__Board__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1147:1: ( ( '{' ) )
            // InternalBgDsl.g:1148:1: ( '{' )
            {
            // InternalBgDsl.g:1148:1: ( '{' )
            // InternalBgDsl.g:1149:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:1158:1: rule__Board__Group_12__2 : rule__Board__Group_12__2__Impl rule__Board__Group_12__3 ;
    public final void rule__Board__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1162:1: ( rule__Board__Group_12__2__Impl rule__Board__Group_12__3 )
            // InternalBgDsl.g:1163:2: rule__Board__Group_12__2__Impl rule__Board__Group_12__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1170:1: rule__Board__Group_12__2__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) ;
    public final void rule__Board__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1174:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) ) )
            // InternalBgDsl.g:1175:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            {
            // InternalBgDsl.g:1175:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_2 ) )
            // InternalBgDsl.g:1176:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_2()); 
            // InternalBgDsl.g:1177:2: ( rule__Board__LegalMovesPipelineAssignment_12_2 )
            // InternalBgDsl.g:1177:3: rule__Board__LegalMovesPipelineAssignment_12_2
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
    // InternalBgDsl.g:1185:1: rule__Board__Group_12__3 : rule__Board__Group_12__3__Impl rule__Board__Group_12__4 ;
    public final void rule__Board__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1189:1: ( rule__Board__Group_12__3__Impl rule__Board__Group_12__4 )
            // InternalBgDsl.g:1190:2: rule__Board__Group_12__3__Impl rule__Board__Group_12__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1197:1: rule__Board__Group_12__3__Impl : ( ( rule__Board__Group_12_3__0 )* ) ;
    public final void rule__Board__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1201:1: ( ( ( rule__Board__Group_12_3__0 )* ) )
            // InternalBgDsl.g:1202:1: ( ( rule__Board__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:1202:1: ( ( rule__Board__Group_12_3__0 )* )
            // InternalBgDsl.g:1203:2: ( rule__Board__Group_12_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_12_3()); 
            // InternalBgDsl.g:1204:2: ( rule__Board__Group_12_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:1204:3: rule__Board__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Board__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBgDsl.g:1212:1: rule__Board__Group_12__4 : rule__Board__Group_12__4__Impl ;
    public final void rule__Board__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1216:1: ( rule__Board__Group_12__4__Impl )
            // InternalBgDsl.g:1217:2: rule__Board__Group_12__4__Impl
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
    // InternalBgDsl.g:1223:1: rule__Board__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1227:1: ( ( '}' ) )
            // InternalBgDsl.g:1228:1: ( '}' )
            {
            // InternalBgDsl.g:1228:1: ( '}' )
            // InternalBgDsl.g:1229:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1239:1: rule__Board__Group_12_3__0 : rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 ;
    public final void rule__Board__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1243:1: ( rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1 )
            // InternalBgDsl.g:1244:2: rule__Board__Group_12_3__0__Impl rule__Board__Group_12_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:1251:1: rule__Board__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1255:1: ( ( ',' ) )
            // InternalBgDsl.g:1256:1: ( ',' )
            {
            // InternalBgDsl.g:1256:1: ( ',' )
            // InternalBgDsl.g:1257:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_12_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1266:1: rule__Board__Group_12_3__1 : rule__Board__Group_12_3__1__Impl ;
    public final void rule__Board__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1270:1: ( rule__Board__Group_12_3__1__Impl )
            // InternalBgDsl.g:1271:2: rule__Board__Group_12_3__1__Impl
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
    // InternalBgDsl.g:1277:1: rule__Board__Group_12_3__1__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) ;
    public final void rule__Board__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1281:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:1282:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:1282:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_3_1 ) )
            // InternalBgDsl.g:1283:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_3_1()); 
            // InternalBgDsl.g:1284:2: ( rule__Board__LegalMovesPipelineAssignment_12_3_1 )
            // InternalBgDsl.g:1284:3: rule__Board__LegalMovesPipelineAssignment_12_3_1
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
    // InternalBgDsl.g:1293:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1297:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBgDsl.g:1298:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
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
    // InternalBgDsl.g:1305:1: rule__Board__Group_13__0__Impl : ( 'effectPipeline' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1309:1: ( ( 'effectPipeline' ) )
            // InternalBgDsl.g:1310:1: ( 'effectPipeline' )
            {
            // InternalBgDsl.g:1310:1: ( 'effectPipeline' )
            // InternalBgDsl.g:1311:2: 'effectPipeline'
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineKeyword_13_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBgDsl.g:1320:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl rule__Board__Group_13__2 ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1324:1: ( rule__Board__Group_13__1__Impl rule__Board__Group_13__2 )
            // InternalBgDsl.g:1325:2: rule__Board__Group_13__1__Impl rule__Board__Group_13__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:1332:1: rule__Board__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1336:1: ( ( '{' ) )
            // InternalBgDsl.g:1337:1: ( '{' )
            {
            // InternalBgDsl.g:1337:1: ( '{' )
            // InternalBgDsl.g:1338:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:1347:1: rule__Board__Group_13__2 : rule__Board__Group_13__2__Impl rule__Board__Group_13__3 ;
    public final void rule__Board__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1351:1: ( rule__Board__Group_13__2__Impl rule__Board__Group_13__3 )
            // InternalBgDsl.g:1352:2: rule__Board__Group_13__2__Impl rule__Board__Group_13__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1359:1: rule__Board__Group_13__2__Impl : ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) ;
    public final void rule__Board__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1363:1: ( ( ( rule__Board__EffectPipelineAssignment_13_2 ) ) )
            // InternalBgDsl.g:1364:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            {
            // InternalBgDsl.g:1364:1: ( ( rule__Board__EffectPipelineAssignment_13_2 ) )
            // InternalBgDsl.g:1365:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_2()); 
            // InternalBgDsl.g:1366:2: ( rule__Board__EffectPipelineAssignment_13_2 )
            // InternalBgDsl.g:1366:3: rule__Board__EffectPipelineAssignment_13_2
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
    // InternalBgDsl.g:1374:1: rule__Board__Group_13__3 : rule__Board__Group_13__3__Impl rule__Board__Group_13__4 ;
    public final void rule__Board__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1378:1: ( rule__Board__Group_13__3__Impl rule__Board__Group_13__4 )
            // InternalBgDsl.g:1379:2: rule__Board__Group_13__3__Impl rule__Board__Group_13__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1386:1: rule__Board__Group_13__3__Impl : ( ( rule__Board__Group_13_3__0 )* ) ;
    public final void rule__Board__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1390:1: ( ( ( rule__Board__Group_13_3__0 )* ) )
            // InternalBgDsl.g:1391:1: ( ( rule__Board__Group_13_3__0 )* )
            {
            // InternalBgDsl.g:1391:1: ( ( rule__Board__Group_13_3__0 )* )
            // InternalBgDsl.g:1392:2: ( rule__Board__Group_13_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_13_3()); 
            // InternalBgDsl.g:1393:2: ( rule__Board__Group_13_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBgDsl.g:1393:3: rule__Board__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Board__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalBgDsl.g:1401:1: rule__Board__Group_13__4 : rule__Board__Group_13__4__Impl ;
    public final void rule__Board__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1405:1: ( rule__Board__Group_13__4__Impl )
            // InternalBgDsl.g:1406:2: rule__Board__Group_13__4__Impl
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
    // InternalBgDsl.g:1412:1: rule__Board__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Board__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1416:1: ( ( '}' ) )
            // InternalBgDsl.g:1417:1: ( '}' )
            {
            // InternalBgDsl.g:1417:1: ( '}' )
            // InternalBgDsl.g:1418:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:1428:1: rule__Board__Group_13_3__0 : rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 ;
    public final void rule__Board__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1432:1: ( rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 )
            // InternalBgDsl.g:1433:2: rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:1440:1: rule__Board__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1444:1: ( ( ',' ) )
            // InternalBgDsl.g:1445:1: ( ',' )
            {
            // InternalBgDsl.g:1445:1: ( ',' )
            // InternalBgDsl.g:1446:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1455:1: rule__Board__Group_13_3__1 : rule__Board__Group_13_3__1__Impl ;
    public final void rule__Board__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1459:1: ( rule__Board__Group_13_3__1__Impl )
            // InternalBgDsl.g:1460:2: rule__Board__Group_13_3__1__Impl
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
    // InternalBgDsl.g:1466:1: rule__Board__Group_13_3__1__Impl : ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) ;
    public final void rule__Board__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1470:1: ( ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) ) )
            // InternalBgDsl.g:1471:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            {
            // InternalBgDsl.g:1471:1: ( ( rule__Board__EffectPipelineAssignment_13_3_1 ) )
            // InternalBgDsl.g:1472:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_3_1()); 
            // InternalBgDsl.g:1473:2: ( rule__Board__EffectPipelineAssignment_13_3_1 )
            // InternalBgDsl.g:1473:3: rule__Board__EffectPipelineAssignment_13_3_1
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBgDsl.g:1482:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1486:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBgDsl.g:1487:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:1494:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1498:1: ( ( ( '-' )? ) )
            // InternalBgDsl.g:1499:1: ( ( '-' )? )
            {
            // InternalBgDsl.g:1499:1: ( ( '-' )? )
            // InternalBgDsl.g:1500:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBgDsl.g:1501:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:1501:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalBgDsl.g:1509:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1513:1: ( rule__EInt__Group__1__Impl )
            // InternalBgDsl.g:1514:2: rule__EInt__Group__1__Impl
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
    // InternalBgDsl.g:1520:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1524:1: ( ( RULE_INT ) )
            // InternalBgDsl.g:1525:1: ( RULE_INT )
            {
            // InternalBgDsl.g:1525:1: ( RULE_INT )
            // InternalBgDsl.g:1526:2: RULE_INT
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
    // InternalBgDsl.g:1536:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1540:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalBgDsl.g:1541:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:1548:1: rule__Tile__Group__0__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1552:1: ( ( 'Tile' ) )
            // InternalBgDsl.g:1553:1: ( 'Tile' )
            {
            // InternalBgDsl.g:1553:1: ( 'Tile' )
            // InternalBgDsl.g:1554:2: 'Tile'
            {
             before(grammarAccess.getTileAccess().getTileKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBgDsl.g:1563:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1567:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalBgDsl.g:1568:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBgDsl.g:1575:1: rule__Tile__Group__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1579:1: ( ( '{' ) )
            // InternalBgDsl.g:1580:1: ( '{' )
            {
            // InternalBgDsl.g:1580:1: ( '{' )
            // InternalBgDsl.g:1581:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalBgDsl.g:1590:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1594:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalBgDsl.g:1595:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:1602:1: rule__Tile__Group__2__Impl : ( 'row' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1606:1: ( ( 'row' ) )
            // InternalBgDsl.g:1607:1: ( 'row' )
            {
            // InternalBgDsl.g:1607:1: ( 'row' )
            // InternalBgDsl.g:1608:2: 'row'
            {
             before(grammarAccess.getTileAccess().getRowKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRowKeyword_2()); 

            }


            }

        }
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
    // InternalBgDsl.g:1617:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1621:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalBgDsl.g:1622:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBgDsl.g:1629:1: rule__Tile__Group__3__Impl : ( ( rule__Tile__RowAssignment_3 ) ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1633:1: ( ( ( rule__Tile__RowAssignment_3 ) ) )
            // InternalBgDsl.g:1634:1: ( ( rule__Tile__RowAssignment_3 ) )
            {
            // InternalBgDsl.g:1634:1: ( ( rule__Tile__RowAssignment_3 ) )
            // InternalBgDsl.g:1635:2: ( rule__Tile__RowAssignment_3 )
            {
             before(grammarAccess.getTileAccess().getRowAssignment_3()); 
            // InternalBgDsl.g:1636:2: ( rule__Tile__RowAssignment_3 )
            // InternalBgDsl.g:1636:3: rule__Tile__RowAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tile__RowAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getRowAssignment_3()); 

            }


            }

        }
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
    // InternalBgDsl.g:1644:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1648:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalBgDsl.g:1649:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:1656:1: rule__Tile__Group__4__Impl : ( 'col' ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1660:1: ( ( 'col' ) )
            // InternalBgDsl.g:1661:1: ( 'col' )
            {
            // InternalBgDsl.g:1661:1: ( 'col' )
            // InternalBgDsl.g:1662:2: 'col'
            {
             before(grammarAccess.getTileAccess().getColKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getColKeyword_4()); 

            }


            }

        }
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
    // InternalBgDsl.g:1671:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1675:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalBgDsl.g:1676:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBgDsl.g:1683:1: rule__Tile__Group__5__Impl : ( ( rule__Tile__ColAssignment_5 ) ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1687:1: ( ( ( rule__Tile__ColAssignment_5 ) ) )
            // InternalBgDsl.g:1688:1: ( ( rule__Tile__ColAssignment_5 ) )
            {
            // InternalBgDsl.g:1688:1: ( ( rule__Tile__ColAssignment_5 ) )
            // InternalBgDsl.g:1689:2: ( rule__Tile__ColAssignment_5 )
            {
             before(grammarAccess.getTileAccess().getColAssignment_5()); 
            // InternalBgDsl.g:1690:2: ( rule__Tile__ColAssignment_5 )
            // InternalBgDsl.g:1690:3: rule__Tile__ColAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tile__ColAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getColAssignment_5()); 

            }


            }

        }
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
    // InternalBgDsl.g:1698:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1702:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalBgDsl.g:1703:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:1710:1: rule__Tile__Group__6__Impl : ( 'color' ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1714:1: ( ( 'color' ) )
            // InternalBgDsl.g:1715:1: ( 'color' )
            {
            // InternalBgDsl.g:1715:1: ( 'color' )
            // InternalBgDsl.g:1716:2: 'color'
            {
             before(grammarAccess.getTileAccess().getColorKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getColorKeyword_6()); 

            }


            }

        }
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
    // InternalBgDsl.g:1725:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1729:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalBgDsl.g:1730:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalBgDsl.g:1737:1: rule__Tile__Group__7__Impl : ( ( rule__Tile__ColorAssignment_7 ) ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1741:1: ( ( ( rule__Tile__ColorAssignment_7 ) ) )
            // InternalBgDsl.g:1742:1: ( ( rule__Tile__ColorAssignment_7 ) )
            {
            // InternalBgDsl.g:1742:1: ( ( rule__Tile__ColorAssignment_7 ) )
            // InternalBgDsl.g:1743:2: ( rule__Tile__ColorAssignment_7 )
            {
             before(grammarAccess.getTileAccess().getColorAssignment_7()); 
            // InternalBgDsl.g:1744:2: ( rule__Tile__ColorAssignment_7 )
            // InternalBgDsl.g:1744:3: rule__Tile__ColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Tile__ColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getColorAssignment_7()); 

            }


            }

        }
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
    // InternalBgDsl.g:1752:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1756:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalBgDsl.g:1757:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:1764:1: rule__Tile__Group__8__Impl : ( 'states' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1768:1: ( ( 'states' ) )
            // InternalBgDsl.g:1769:1: ( 'states' )
            {
            // InternalBgDsl.g:1769:1: ( 'states' )
            // InternalBgDsl.g:1770:2: 'states'
            {
             before(grammarAccess.getTileAccess().getStatesKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getStatesKeyword_8()); 

            }


            }

        }
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
    // InternalBgDsl.g:1779:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1783:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalBgDsl.g:1784:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalBgDsl.g:1791:1: rule__Tile__Group__9__Impl : ( '{' ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1795:1: ( ( '{' ) )
            // InternalBgDsl.g:1796:1: ( '{' )
            {
            // InternalBgDsl.g:1796:1: ( '{' )
            // InternalBgDsl.g:1797:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalBgDsl.g:1806:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1810:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalBgDsl.g:1811:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1818:1: rule__Tile__Group__10__Impl : ( ( rule__Tile__StatesAssignment_10 ) ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1822:1: ( ( ( rule__Tile__StatesAssignment_10 ) ) )
            // InternalBgDsl.g:1823:1: ( ( rule__Tile__StatesAssignment_10 ) )
            {
            // InternalBgDsl.g:1823:1: ( ( rule__Tile__StatesAssignment_10 ) )
            // InternalBgDsl.g:1824:2: ( rule__Tile__StatesAssignment_10 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_10()); 
            // InternalBgDsl.g:1825:2: ( rule__Tile__StatesAssignment_10 )
            // InternalBgDsl.g:1825:3: rule__Tile__StatesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Tile__StatesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getStatesAssignment_10()); 

            }


            }

        }
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
    // InternalBgDsl.g:1833:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1837:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalBgDsl.g:1838:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1845:1: rule__Tile__Group__11__Impl : ( ( rule__Tile__Group_11__0 )* ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1849:1: ( ( ( rule__Tile__Group_11__0 )* ) )
            // InternalBgDsl.g:1850:1: ( ( rule__Tile__Group_11__0 )* )
            {
            // InternalBgDsl.g:1850:1: ( ( rule__Tile__Group_11__0 )* )
            // InternalBgDsl.g:1851:2: ( rule__Tile__Group_11__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_11()); 
            // InternalBgDsl.g:1852:2: ( rule__Tile__Group_11__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBgDsl.g:1852:3: rule__Tile__Group_11__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Tile__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTileAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalBgDsl.g:1860:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl rule__Tile__Group__13 ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1864:1: ( rule__Tile__Group__12__Impl rule__Tile__Group__13 )
            // InternalBgDsl.g:1865:2: rule__Tile__Group__12__Impl rule__Tile__Group__13
            {
            pushFollow(FOLLOW_24);
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
    // InternalBgDsl.g:1872:1: rule__Tile__Group__12__Impl : ( '}' ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1876:1: ( ( '}' ) )
            // InternalBgDsl.g:1877:1: ( '}' )
            {
            // InternalBgDsl.g:1877:1: ( '}' )
            // InternalBgDsl.g:1878:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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
    // InternalBgDsl.g:1887:1: rule__Tile__Group__13 : rule__Tile__Group__13__Impl rule__Tile__Group__14 ;
    public final void rule__Tile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1891:1: ( rule__Tile__Group__13__Impl rule__Tile__Group__14 )
            // InternalBgDsl.g:1892:2: rule__Tile__Group__13__Impl rule__Tile__Group__14
            {
            pushFollow(FOLLOW_24);
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
    // InternalBgDsl.g:1899:1: rule__Tile__Group__13__Impl : ( ( rule__Tile__Group_13__0 )? ) ;
    public final void rule__Tile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1903:1: ( ( ( rule__Tile__Group_13__0 )? ) )
            // InternalBgDsl.g:1904:1: ( ( rule__Tile__Group_13__0 )? )
            {
            // InternalBgDsl.g:1904:1: ( ( rule__Tile__Group_13__0 )? )
            // InternalBgDsl.g:1905:2: ( rule__Tile__Group_13__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_13()); 
            // InternalBgDsl.g:1906:2: ( rule__Tile__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBgDsl.g:1906:3: rule__Tile__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tile__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTileAccess().getGroup_13()); 

            }


            }

        }
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
    // InternalBgDsl.g:1914:1: rule__Tile__Group__14 : rule__Tile__Group__14__Impl rule__Tile__Group__15 ;
    public final void rule__Tile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1918:1: ( rule__Tile__Group__14__Impl rule__Tile__Group__15 )
            // InternalBgDsl.g:1919:2: rule__Tile__Group__14__Impl rule__Tile__Group__15
            {
            pushFollow(FOLLOW_23);
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
    // InternalBgDsl.g:1926:1: rule__Tile__Group__14__Impl : ( 'initialState' ) ;
    public final void rule__Tile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1930:1: ( ( 'initialState' ) )
            // InternalBgDsl.g:1931:1: ( 'initialState' )
            {
            // InternalBgDsl.g:1931:1: ( 'initialState' )
            // InternalBgDsl.g:1932:2: 'initialState'
            {
             before(grammarAccess.getTileAccess().getInitialStateKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getInitialStateKeyword_14()); 

            }


            }

        }
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
    // InternalBgDsl.g:1941:1: rule__Tile__Group__15 : rule__Tile__Group__15__Impl rule__Tile__Group__16 ;
    public final void rule__Tile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1945:1: ( rule__Tile__Group__15__Impl rule__Tile__Group__16 )
            // InternalBgDsl.g:1946:2: rule__Tile__Group__15__Impl rule__Tile__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Tile__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__16();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:1953:1: rule__Tile__Group__15__Impl : ( ( rule__Tile__InitialStateAssignment_15 ) ) ;
    public final void rule__Tile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1957:1: ( ( ( rule__Tile__InitialStateAssignment_15 ) ) )
            // InternalBgDsl.g:1958:1: ( ( rule__Tile__InitialStateAssignment_15 ) )
            {
            // InternalBgDsl.g:1958:1: ( ( rule__Tile__InitialStateAssignment_15 ) )
            // InternalBgDsl.g:1959:2: ( rule__Tile__InitialStateAssignment_15 )
            {
             before(grammarAccess.getTileAccess().getInitialStateAssignment_15()); 
            // InternalBgDsl.g:1960:2: ( rule__Tile__InitialStateAssignment_15 )
            // InternalBgDsl.g:1960:3: rule__Tile__InitialStateAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Tile__InitialStateAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getInitialStateAssignment_15()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tile__Group__16"
    // InternalBgDsl.g:1968:1: rule__Tile__Group__16 : rule__Tile__Group__16__Impl ;
    public final void rule__Tile__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1972:1: ( rule__Tile__Group__16__Impl )
            // InternalBgDsl.g:1973:2: rule__Tile__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__16"


    // $ANTLR start "rule__Tile__Group__16__Impl"
    // InternalBgDsl.g:1979:1: rule__Tile__Group__16__Impl : ( '}' ) ;
    public final void rule__Tile__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1983:1: ( ( '}' ) )
            // InternalBgDsl.g:1984:1: ( '}' )
            {
            // InternalBgDsl.g:1984:1: ( '}' )
            // InternalBgDsl.g:1985:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group__16__Impl"


    // $ANTLR start "rule__Tile__Group_11__0"
    // InternalBgDsl.g:1995:1: rule__Tile__Group_11__0 : rule__Tile__Group_11__0__Impl rule__Tile__Group_11__1 ;
    public final void rule__Tile__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1999:1: ( rule__Tile__Group_11__0__Impl rule__Tile__Group_11__1 )
            // InternalBgDsl.g:2000:2: rule__Tile__Group_11__0__Impl rule__Tile__Group_11__1
            {
            pushFollow(FOLLOW_23);
            rule__Tile__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_11__0"


    // $ANTLR start "rule__Tile__Group_11__0__Impl"
    // InternalBgDsl.g:2007:1: rule__Tile__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2011:1: ( ( ',' ) )
            // InternalBgDsl.g:2012:1: ( ',' )
            {
            // InternalBgDsl.g:2012:1: ( ',' )
            // InternalBgDsl.g:2013:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_11_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_11__0__Impl"


    // $ANTLR start "rule__Tile__Group_11__1"
    // InternalBgDsl.g:2022:1: rule__Tile__Group_11__1 : rule__Tile__Group_11__1__Impl ;
    public final void rule__Tile__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2026:1: ( rule__Tile__Group_11__1__Impl )
            // InternalBgDsl.g:2027:2: rule__Tile__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_11__1"


    // $ANTLR start "rule__Tile__Group_11__1__Impl"
    // InternalBgDsl.g:2033:1: rule__Tile__Group_11__1__Impl : ( ( rule__Tile__StatesAssignment_11_1 ) ) ;
    public final void rule__Tile__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2037:1: ( ( ( rule__Tile__StatesAssignment_11_1 ) ) )
            // InternalBgDsl.g:2038:1: ( ( rule__Tile__StatesAssignment_11_1 ) )
            {
            // InternalBgDsl.g:2038:1: ( ( rule__Tile__StatesAssignment_11_1 ) )
            // InternalBgDsl.g:2039:2: ( rule__Tile__StatesAssignment_11_1 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_11_1()); 
            // InternalBgDsl.g:2040:2: ( rule__Tile__StatesAssignment_11_1 )
            // InternalBgDsl.g:2040:3: rule__Tile__StatesAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__StatesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getStatesAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_11__1__Impl"


    // $ANTLR start "rule__Tile__Group_13__0"
    // InternalBgDsl.g:2049:1: rule__Tile__Group_13__0 : rule__Tile__Group_13__0__Impl rule__Tile__Group_13__1 ;
    public final void rule__Tile__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2053:1: ( rule__Tile__Group_13__0__Impl rule__Tile__Group_13__1 )
            // InternalBgDsl.g:2054:2: rule__Tile__Group_13__0__Impl rule__Tile__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Tile__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__0"


    // $ANTLR start "rule__Tile__Group_13__0__Impl"
    // InternalBgDsl.g:2061:1: rule__Tile__Group_13__0__Impl : ( 'transitions' ) ;
    public final void rule__Tile__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2065:1: ( ( 'transitions' ) )
            // InternalBgDsl.g:2066:1: ( 'transitions' )
            {
            // InternalBgDsl.g:2066:1: ( 'transitions' )
            // InternalBgDsl.g:2067:2: 'transitions'
            {
             before(grammarAccess.getTileAccess().getTransitionsKeyword_13_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTransitionsKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__0__Impl"


    // $ANTLR start "rule__Tile__Group_13__1"
    // InternalBgDsl.g:2076:1: rule__Tile__Group_13__1 : rule__Tile__Group_13__1__Impl rule__Tile__Group_13__2 ;
    public final void rule__Tile__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2080:1: ( rule__Tile__Group_13__1__Impl rule__Tile__Group_13__2 )
            // InternalBgDsl.g:2081:2: rule__Tile__Group_13__1__Impl rule__Tile__Group_13__2
            {
            pushFollow(FOLLOW_25);
            rule__Tile__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__1"


    // $ANTLR start "rule__Tile__Group_13__1__Impl"
    // InternalBgDsl.g:2088:1: rule__Tile__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2092:1: ( ( '{' ) )
            // InternalBgDsl.g:2093:1: ( '{' )
            {
            // InternalBgDsl.g:2093:1: ( '{' )
            // InternalBgDsl.g:2094:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__1__Impl"


    // $ANTLR start "rule__Tile__Group_13__2"
    // InternalBgDsl.g:2103:1: rule__Tile__Group_13__2 : rule__Tile__Group_13__2__Impl rule__Tile__Group_13__3 ;
    public final void rule__Tile__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2107:1: ( rule__Tile__Group_13__2__Impl rule__Tile__Group_13__3 )
            // InternalBgDsl.g:2108:2: rule__Tile__Group_13__2__Impl rule__Tile__Group_13__3
            {
            pushFollow(FOLLOW_14);
            rule__Tile__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__2"


    // $ANTLR start "rule__Tile__Group_13__2__Impl"
    // InternalBgDsl.g:2115:1: rule__Tile__Group_13__2__Impl : ( ( rule__Tile__TransitionsAssignment_13_2 ) ) ;
    public final void rule__Tile__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2119:1: ( ( ( rule__Tile__TransitionsAssignment_13_2 ) ) )
            // InternalBgDsl.g:2120:1: ( ( rule__Tile__TransitionsAssignment_13_2 ) )
            {
            // InternalBgDsl.g:2120:1: ( ( rule__Tile__TransitionsAssignment_13_2 ) )
            // InternalBgDsl.g:2121:2: ( rule__Tile__TransitionsAssignment_13_2 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_13_2()); 
            // InternalBgDsl.g:2122:2: ( rule__Tile__TransitionsAssignment_13_2 )
            // InternalBgDsl.g:2122:3: rule__Tile__TransitionsAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TransitionsAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTransitionsAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__2__Impl"


    // $ANTLR start "rule__Tile__Group_13__3"
    // InternalBgDsl.g:2130:1: rule__Tile__Group_13__3 : rule__Tile__Group_13__3__Impl rule__Tile__Group_13__4 ;
    public final void rule__Tile__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2134:1: ( rule__Tile__Group_13__3__Impl rule__Tile__Group_13__4 )
            // InternalBgDsl.g:2135:2: rule__Tile__Group_13__3__Impl rule__Tile__Group_13__4
            {
            pushFollow(FOLLOW_14);
            rule__Tile__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__3"


    // $ANTLR start "rule__Tile__Group_13__3__Impl"
    // InternalBgDsl.g:2142:1: rule__Tile__Group_13__3__Impl : ( ( rule__Tile__Group_13_3__0 )* ) ;
    public final void rule__Tile__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2146:1: ( ( ( rule__Tile__Group_13_3__0 )* ) )
            // InternalBgDsl.g:2147:1: ( ( rule__Tile__Group_13_3__0 )* )
            {
            // InternalBgDsl.g:2147:1: ( ( rule__Tile__Group_13_3__0 )* )
            // InternalBgDsl.g:2148:2: ( rule__Tile__Group_13_3__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_13_3()); 
            // InternalBgDsl.g:2149:2: ( rule__Tile__Group_13_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBgDsl.g:2149:3: rule__Tile__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Tile__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTileAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__3__Impl"


    // $ANTLR start "rule__Tile__Group_13__4"
    // InternalBgDsl.g:2157:1: rule__Tile__Group_13__4 : rule__Tile__Group_13__4__Impl ;
    public final void rule__Tile__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2161:1: ( rule__Tile__Group_13__4__Impl )
            // InternalBgDsl.g:2162:2: rule__Tile__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__4"


    // $ANTLR start "rule__Tile__Group_13__4__Impl"
    // InternalBgDsl.g:2168:1: rule__Tile__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Tile__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2172:1: ( ( '}' ) )
            // InternalBgDsl.g:2173:1: ( '}' )
            {
            // InternalBgDsl.g:2173:1: ( '}' )
            // InternalBgDsl.g:2174:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13__4__Impl"


    // $ANTLR start "rule__Tile__Group_13_3__0"
    // InternalBgDsl.g:2184:1: rule__Tile__Group_13_3__0 : rule__Tile__Group_13_3__0__Impl rule__Tile__Group_13_3__1 ;
    public final void rule__Tile__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2188:1: ( rule__Tile__Group_13_3__0__Impl rule__Tile__Group_13_3__1 )
            // InternalBgDsl.g:2189:2: rule__Tile__Group_13_3__0__Impl rule__Tile__Group_13_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Tile__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13_3__0"


    // $ANTLR start "rule__Tile__Group_13_3__0__Impl"
    // InternalBgDsl.g:2196:1: rule__Tile__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2200:1: ( ( ',' ) )
            // InternalBgDsl.g:2201:1: ( ',' )
            {
            // InternalBgDsl.g:2201:1: ( ',' )
            // InternalBgDsl.g:2202:2: ','
            {
             before(grammarAccess.getTileAccess().getCommaKeyword_13_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13_3__0__Impl"


    // $ANTLR start "rule__Tile__Group_13_3__1"
    // InternalBgDsl.g:2211:1: rule__Tile__Group_13_3__1 : rule__Tile__Group_13_3__1__Impl ;
    public final void rule__Tile__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2215:1: ( rule__Tile__Group_13_3__1__Impl )
            // InternalBgDsl.g:2216:2: rule__Tile__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13_3__1"


    // $ANTLR start "rule__Tile__Group_13_3__1__Impl"
    // InternalBgDsl.g:2222:1: rule__Tile__Group_13_3__1__Impl : ( ( rule__Tile__TransitionsAssignment_13_3_1 ) ) ;
    public final void rule__Tile__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2226:1: ( ( ( rule__Tile__TransitionsAssignment_13_3_1 ) ) )
            // InternalBgDsl.g:2227:1: ( ( rule__Tile__TransitionsAssignment_13_3_1 ) )
            {
            // InternalBgDsl.g:2227:1: ( ( rule__Tile__TransitionsAssignment_13_3_1 ) )
            // InternalBgDsl.g:2228:2: ( rule__Tile__TransitionsAssignment_13_3_1 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_13_3_1()); 
            // InternalBgDsl.g:2229:2: ( rule__Tile__TransitionsAssignment_13_3_1 )
            // InternalBgDsl.g:2229:3: rule__Tile__TransitionsAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TransitionsAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTransitionsAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Group_13_3__1__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group__0"
    // InternalBgDsl.g:2238:1: rule__LegalMovesPipeline__Group__0 : rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 ;
    public final void rule__LegalMovesPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2242:1: ( rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 )
            // InternalBgDsl.g:2243:2: rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:2250:1: rule__LegalMovesPipeline__Group__0__Impl : ( () ) ;
    public final void rule__LegalMovesPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2254:1: ( ( () ) )
            // InternalBgDsl.g:2255:1: ( () )
            {
            // InternalBgDsl.g:2255:1: ( () )
            // InternalBgDsl.g:2256:2: ()
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 
            // InternalBgDsl.g:2257:2: ()
            // InternalBgDsl.g:2257:3: 
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
    // InternalBgDsl.g:2265:1: rule__LegalMovesPipeline__Group__1 : rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 ;
    public final void rule__LegalMovesPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2269:1: ( rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 )
            // InternalBgDsl.g:2270:2: rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2
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
    // InternalBgDsl.g:2277:1: rule__LegalMovesPipeline__Group__1__Impl : ( 'LegalMovesPipeline' ) ;
    public final void rule__LegalMovesPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2281:1: ( ( 'LegalMovesPipeline' ) )
            // InternalBgDsl.g:2282:1: ( 'LegalMovesPipeline' )
            {
            // InternalBgDsl.g:2282:1: ( 'LegalMovesPipeline' )
            // InternalBgDsl.g:2283:2: 'LegalMovesPipeline'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBgDsl.g:2292:1: rule__LegalMovesPipeline__Group__2 : rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 ;
    public final void rule__LegalMovesPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2296:1: ( rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 )
            // InternalBgDsl.g:2297:2: rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2304:1: rule__LegalMovesPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2308:1: ( ( '{' ) )
            // InternalBgDsl.g:2309:1: ( '{' )
            {
            // InternalBgDsl.g:2309:1: ( '{' )
            // InternalBgDsl.g:2310:2: '{'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:2319:1: rule__LegalMovesPipeline__Group__3 : rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 ;
    public final void rule__LegalMovesPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2323:1: ( rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 )
            // InternalBgDsl.g:2324:2: rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2331:1: rule__LegalMovesPipeline__Group__3__Impl : ( ( rule__LegalMovesPipeline__Group_3__0 )? ) ;
    public final void rule__LegalMovesPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2335:1: ( ( ( rule__LegalMovesPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:2336:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:2336:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            // InternalBgDsl.g:2337:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:2338:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:2338:3: rule__LegalMovesPipeline__Group_3__0
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
    // InternalBgDsl.g:2346:1: rule__LegalMovesPipeline__Group__4 : rule__LegalMovesPipeline__Group__4__Impl ;
    public final void rule__LegalMovesPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2350:1: ( rule__LegalMovesPipeline__Group__4__Impl )
            // InternalBgDsl.g:2351:2: rule__LegalMovesPipeline__Group__4__Impl
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
    // InternalBgDsl.g:2357:1: rule__LegalMovesPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2361:1: ( ( '}' ) )
            // InternalBgDsl.g:2362:1: ( '}' )
            {
            // InternalBgDsl.g:2362:1: ( '}' )
            // InternalBgDsl.g:2363:2: '}'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2373:1: rule__LegalMovesPipeline__Group_3__0 : rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2377:1: ( rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 )
            // InternalBgDsl.g:2378:2: rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:2385:1: rule__LegalMovesPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__LegalMovesPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2389:1: ( ( 'filter' ) )
            // InternalBgDsl.g:2390:1: ( 'filter' )
            {
            // InternalBgDsl.g:2390:1: ( 'filter' )
            // InternalBgDsl.g:2391:2: 'filter'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBgDsl.g:2400:1: rule__LegalMovesPipeline__Group_3__1 : rule__LegalMovesPipeline__Group_3__1__Impl ;
    public final void rule__LegalMovesPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2404:1: ( rule__LegalMovesPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:2405:2: rule__LegalMovesPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:2411:1: rule__LegalMovesPipeline__Group_3__1__Impl : ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2415:1: ( ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:2416:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:2416:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:2417:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:2418:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:2418:3: rule__LegalMovesPipeline__FilterAssignment_3_1
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
    // InternalBgDsl.g:2427:1: rule__EffectPipeline__Group__0 : rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 ;
    public final void rule__EffectPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2431:1: ( rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 )
            // InternalBgDsl.g:2432:2: rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:2439:1: rule__EffectPipeline__Group__0__Impl : ( () ) ;
    public final void rule__EffectPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2443:1: ( ( () ) )
            // InternalBgDsl.g:2444:1: ( () )
            {
            // InternalBgDsl.g:2444:1: ( () )
            // InternalBgDsl.g:2445:2: ()
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 
            // InternalBgDsl.g:2446:2: ()
            // InternalBgDsl.g:2446:3: 
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
    // InternalBgDsl.g:2454:1: rule__EffectPipeline__Group__1 : rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 ;
    public final void rule__EffectPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2458:1: ( rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 )
            // InternalBgDsl.g:2459:2: rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2
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
    // InternalBgDsl.g:2466:1: rule__EffectPipeline__Group__1__Impl : ( 'EffectPipeline' ) ;
    public final void rule__EffectPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2470:1: ( ( 'EffectPipeline' ) )
            // InternalBgDsl.g:2471:1: ( 'EffectPipeline' )
            {
            // InternalBgDsl.g:2471:1: ( 'EffectPipeline' )
            // InternalBgDsl.g:2472:2: 'EffectPipeline'
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBgDsl.g:2481:1: rule__EffectPipeline__Group__2 : rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 ;
    public final void rule__EffectPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2485:1: ( rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 )
            // InternalBgDsl.g:2486:2: rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2493:1: rule__EffectPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2497:1: ( ( '{' ) )
            // InternalBgDsl.g:2498:1: ( '{' )
            {
            // InternalBgDsl.g:2498:1: ( '{' )
            // InternalBgDsl.g:2499:2: '{'
            {
             before(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:2508:1: rule__EffectPipeline__Group__3 : rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 ;
    public final void rule__EffectPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2512:1: ( rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 )
            // InternalBgDsl.g:2513:2: rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2520:1: rule__EffectPipeline__Group__3__Impl : ( ( rule__EffectPipeline__Group_3__0 )? ) ;
    public final void rule__EffectPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2524:1: ( ( ( rule__EffectPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:2525:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:2525:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            // InternalBgDsl.g:2526:2: ( rule__EffectPipeline__Group_3__0 )?
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:2527:2: ( rule__EffectPipeline__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:2527:3: rule__EffectPipeline__Group_3__0
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
    // InternalBgDsl.g:2535:1: rule__EffectPipeline__Group__4 : rule__EffectPipeline__Group__4__Impl ;
    public final void rule__EffectPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2539:1: ( rule__EffectPipeline__Group__4__Impl )
            // InternalBgDsl.g:2540:2: rule__EffectPipeline__Group__4__Impl
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
    // InternalBgDsl.g:2546:1: rule__EffectPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2550:1: ( ( '}' ) )
            // InternalBgDsl.g:2551:1: ( '}' )
            {
            // InternalBgDsl.g:2551:1: ( '}' )
            // InternalBgDsl.g:2552:2: '}'
            {
             before(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2562:1: rule__EffectPipeline__Group_3__0 : rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 ;
    public final void rule__EffectPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2566:1: ( rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 )
            // InternalBgDsl.g:2567:2: rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:2574:1: rule__EffectPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__EffectPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2578:1: ( ( 'filter' ) )
            // InternalBgDsl.g:2579:1: ( 'filter' )
            {
            // InternalBgDsl.g:2579:1: ( 'filter' )
            // InternalBgDsl.g:2580:2: 'filter'
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBgDsl.g:2589:1: rule__EffectPipeline__Group_3__1 : rule__EffectPipeline__Group_3__1__Impl ;
    public final void rule__EffectPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2593:1: ( rule__EffectPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:2594:2: rule__EffectPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:2600:1: rule__EffectPipeline__Group_3__1__Impl : ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__EffectPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2604:1: ( ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:2605:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:2605:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:2606:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:2607:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:2607:3: rule__EffectPipeline__FilterAssignment_3_1
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


    // $ANTLR start "rule__State__Group__0"
    // InternalBgDsl.g:2616:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2620:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBgDsl.g:2621:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalBgDsl.g:2628:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2632:1: ( ( 'State' ) )
            // InternalBgDsl.g:2633:1: ( 'State' )
            {
            // InternalBgDsl.g:2633:1: ( 'State' )
            // InternalBgDsl.g:2634:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBgDsl.g:2643:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2647:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBgDsl.g:2648:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalBgDsl.g:2655:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2659:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalBgDsl.g:2660:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:2660:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalBgDsl.g:2661:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:2662:2: ( rule__State__NameAssignment_1 )
            // InternalBgDsl.g:2662:3: rule__State__NameAssignment_1
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
    // InternalBgDsl.g:2670:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2674:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBgDsl.g:2675:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBgDsl.g:2682:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2686:1: ( ( '{' ) )
            // InternalBgDsl.g:2687:1: ( '{' )
            {
            // InternalBgDsl.g:2687:1: ( '{' )
            // InternalBgDsl.g:2688:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:2697:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2701:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBgDsl.g:2702:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalBgDsl.g:2709:1: rule__State__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2713:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2714:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2714:1: ( 'hexColor' )
            // InternalBgDsl.g:2715:2: 'hexColor'
            {
             before(grammarAccess.getStateAccess().getHexColorKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBgDsl.g:2724:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2728:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBgDsl.g:2729:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2736:1: rule__State__Group__4__Impl : ( ( rule__State__HexColorAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2740:1: ( ( ( rule__State__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2741:1: ( ( rule__State__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2741:1: ( ( rule__State__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2742:2: ( rule__State__HexColorAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2743:2: ( rule__State__HexColorAssignment_4 )
            // InternalBgDsl.g:2743:3: rule__State__HexColorAssignment_4
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
    // InternalBgDsl.g:2751:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2755:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalBgDsl.g:2756:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2763:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2767:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalBgDsl.g:2768:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalBgDsl.g:2768:1: ( ( rule__State__Group_5__0 )? )
            // InternalBgDsl.g:2769:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalBgDsl.g:2770:2: ( rule__State__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBgDsl.g:2770:3: rule__State__Group_5__0
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
    // InternalBgDsl.g:2778:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2782:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalBgDsl.g:2783:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2790:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2794:1: ( ( ( rule__State__Group_6__0 )? ) )
            // InternalBgDsl.g:2795:1: ( ( rule__State__Group_6__0 )? )
            {
            // InternalBgDsl.g:2795:1: ( ( rule__State__Group_6__0 )? )
            // InternalBgDsl.g:2796:2: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // InternalBgDsl.g:2797:2: ( rule__State__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:2797:3: rule__State__Group_6__0
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
    // InternalBgDsl.g:2805:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2809:1: ( rule__State__Group__7__Impl )
            // InternalBgDsl.g:2810:2: rule__State__Group__7__Impl
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
    // InternalBgDsl.g:2816:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2820:1: ( ( '}' ) )
            // InternalBgDsl.g:2821:1: ( '}' )
            {
            // InternalBgDsl.g:2821:1: ( '}' )
            // InternalBgDsl.g:2822:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:2832:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2836:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalBgDsl.g:2837:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:2844:1: rule__State__Group_5__0__Impl : ( 'outbound' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2848:1: ( ( 'outbound' ) )
            // InternalBgDsl.g:2849:1: ( 'outbound' )
            {
            // InternalBgDsl.g:2849:1: ( 'outbound' )
            // InternalBgDsl.g:2850:2: 'outbound'
            {
             before(grammarAccess.getStateAccess().getOutboundKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBgDsl.g:2859:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2863:1: ( rule__State__Group_5__1__Impl )
            // InternalBgDsl.g:2864:2: rule__State__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:2870:1: rule__State__Group_5__1__Impl : ( ( rule__State__OutboundAssignment_5_1 ) ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2874:1: ( ( ( rule__State__OutboundAssignment_5_1 ) ) )
            // InternalBgDsl.g:2875:1: ( ( rule__State__OutboundAssignment_5_1 ) )
            {
            // InternalBgDsl.g:2875:1: ( ( rule__State__OutboundAssignment_5_1 ) )
            // InternalBgDsl.g:2876:2: ( rule__State__OutboundAssignment_5_1 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_1()); 
            // InternalBgDsl.g:2877:2: ( rule__State__OutboundAssignment_5_1 )
            // InternalBgDsl.g:2877:3: rule__State__OutboundAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__State__OutboundAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutboundAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group_6__0"
    // InternalBgDsl.g:2886:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2890:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // InternalBgDsl.g:2891:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:2898:1: rule__State__Group_6__0__Impl : ( 'inbound' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2902:1: ( ( 'inbound' ) )
            // InternalBgDsl.g:2903:1: ( 'inbound' )
            {
            // InternalBgDsl.g:2903:1: ( 'inbound' )
            // InternalBgDsl.g:2904:2: 'inbound'
            {
             before(grammarAccess.getStateAccess().getInboundKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBgDsl.g:2913:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2917:1: ( rule__State__Group_6__1__Impl )
            // InternalBgDsl.g:2918:2: rule__State__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:2924:1: rule__State__Group_6__1__Impl : ( ( rule__State__InboundAssignment_6_1 ) ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2928:1: ( ( ( rule__State__InboundAssignment_6_1 ) ) )
            // InternalBgDsl.g:2929:1: ( ( rule__State__InboundAssignment_6_1 ) )
            {
            // InternalBgDsl.g:2929:1: ( ( rule__State__InboundAssignment_6_1 ) )
            // InternalBgDsl.g:2930:2: ( rule__State__InboundAssignment_6_1 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_1()); 
            // InternalBgDsl.g:2931:2: ( rule__State__InboundAssignment_6_1 )
            // InternalBgDsl.g:2931:3: rule__State__InboundAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__State__InboundAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInboundAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group__0"
    // InternalBgDsl.g:2940:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2944:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBgDsl.g:2945:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalBgDsl.g:2952:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2956:1: ( ( 'Transition' ) )
            // InternalBgDsl.g:2957:1: ( 'Transition' )
            {
            // InternalBgDsl.g:2957:1: ( 'Transition' )
            // InternalBgDsl.g:2958:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBgDsl.g:2967:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2971:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBgDsl.g:2972:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalBgDsl.g:2979:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2983:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalBgDsl.g:2984:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:2984:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalBgDsl.g:2985:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:2986:2: ( rule__Transition__NameAssignment_1 )
            // InternalBgDsl.g:2986:3: rule__Transition__NameAssignment_1
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
    // InternalBgDsl.g:2994:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2998:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBgDsl.g:2999:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:3006:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3010:1: ( ( '{' ) )
            // InternalBgDsl.g:3011:1: ( '{' )
            {
            // InternalBgDsl.g:3011:1: ( '{' )
            // InternalBgDsl.g:3012:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBgDsl.g:3021:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3025:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBgDsl.g:3026:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:3033:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3037:1: ( ( 'source' ) )
            // InternalBgDsl.g:3038:1: ( 'source' )
            {
            // InternalBgDsl.g:3038:1: ( 'source' )
            // InternalBgDsl.g:3039:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBgDsl.g:3048:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3052:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalBgDsl.g:3053:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalBgDsl.g:3060:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3064:1: ( ( '(' ) )
            // InternalBgDsl.g:3065:1: ( '(' )
            {
            // InternalBgDsl.g:3065:1: ( '(' )
            // InternalBgDsl.g:3066:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBgDsl.g:3075:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3079:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalBgDsl.g:3080:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:3087:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3091:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalBgDsl.g:3092:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalBgDsl.g:3092:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalBgDsl.g:3093:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalBgDsl.g:3094:2: ( rule__Transition__SourceAssignment_5 )
            // InternalBgDsl.g:3094:3: rule__Transition__SourceAssignment_5
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
    // InternalBgDsl.g:3102:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3106:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalBgDsl.g:3107:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:3114:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )* ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3118:1: ( ( ( rule__Transition__Group_6__0 )* ) )
            // InternalBgDsl.g:3119:1: ( ( rule__Transition__Group_6__0 )* )
            {
            // InternalBgDsl.g:3119:1: ( ( rule__Transition__Group_6__0 )* )
            // InternalBgDsl.g:3120:2: ( rule__Transition__Group_6__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalBgDsl.g:3121:2: ( rule__Transition__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBgDsl.g:3121:3: rule__Transition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Transition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBgDsl.g:3129:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3133:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalBgDsl.g:3134:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3141:1: rule__Transition__Group__7__Impl : ( ')' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3145:1: ( ( ')' ) )
            // InternalBgDsl.g:3146:1: ( ')' )
            {
            // InternalBgDsl.g:3146:1: ( ')' )
            // InternalBgDsl.g:3147:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBgDsl.g:3156:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3160:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalBgDsl.g:3161:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
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
    // InternalBgDsl.g:3168:1: rule__Transition__Group__8__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3172:1: ( ( 'target' ) )
            // InternalBgDsl.g:3173:1: ( 'target' )
            {
            // InternalBgDsl.g:3173:1: ( 'target' )
            // InternalBgDsl.g:3174:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_8()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBgDsl.g:3183:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3187:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalBgDsl.g:3188:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalBgDsl.g:3195:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__TargetAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3199:1: ( ( ( rule__Transition__TargetAssignment_9 ) ) )
            // InternalBgDsl.g:3200:1: ( ( rule__Transition__TargetAssignment_9 ) )
            {
            // InternalBgDsl.g:3200:1: ( ( rule__Transition__TargetAssignment_9 ) )
            // InternalBgDsl.g:3201:2: ( rule__Transition__TargetAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 
            // InternalBgDsl.g:3202:2: ( rule__Transition__TargetAssignment_9 )
            // InternalBgDsl.g:3202:3: rule__Transition__TargetAssignment_9
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
    // InternalBgDsl.g:3210:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3214:1: ( rule__Transition__Group__10__Impl )
            // InternalBgDsl.g:3215:2: rule__Transition__Group__10__Impl
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
    // InternalBgDsl.g:3221:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3225:1: ( ( '}' ) )
            // InternalBgDsl.g:3226:1: ( '}' )
            {
            // InternalBgDsl.g:3226:1: ( '}' )
            // InternalBgDsl.g:3227:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBgDsl.g:3237:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3241:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalBgDsl.g:3242:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
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
    // InternalBgDsl.g:3249:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3253:1: ( ( ',' ) )
            // InternalBgDsl.g:3254:1: ( ',' )
            {
            // InternalBgDsl.g:3254:1: ( ',' )
            // InternalBgDsl.g:3255:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:3264:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3268:1: ( rule__Transition__Group_6__1__Impl )
            // InternalBgDsl.g:3269:2: rule__Transition__Group_6__1__Impl
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
    // InternalBgDsl.g:3275:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3279:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // InternalBgDsl.g:3280:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // InternalBgDsl.g:3280:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // InternalBgDsl.g:3281:2: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // InternalBgDsl.g:3282:2: ( rule__Transition__SourceAssignment_6_1 )
            // InternalBgDsl.g:3282:3: rule__Transition__SourceAssignment_6_1
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


    // $ANTLR start "rule__SomeFilter1__Group__0"
    // InternalBgDsl.g:3291:1: rule__SomeFilter1__Group__0 : rule__SomeFilter1__Group__0__Impl rule__SomeFilter1__Group__1 ;
    public final void rule__SomeFilter1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3295:1: ( rule__SomeFilter1__Group__0__Impl rule__SomeFilter1__Group__1 )
            // InternalBgDsl.g:3296:2: rule__SomeFilter1__Group__0__Impl rule__SomeFilter1__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SomeFilter1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__0"


    // $ANTLR start "rule__SomeFilter1__Group__0__Impl"
    // InternalBgDsl.g:3303:1: rule__SomeFilter1__Group__0__Impl : ( () ) ;
    public final void rule__SomeFilter1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3307:1: ( ( () ) )
            // InternalBgDsl.g:3308:1: ( () )
            {
            // InternalBgDsl.g:3308:1: ( () )
            // InternalBgDsl.g:3309:2: ()
            {
             before(grammarAccess.getSomeFilter1Access().getSomeFilter1Action_0()); 
            // InternalBgDsl.g:3310:2: ()
            // InternalBgDsl.g:3310:3: 
            {
            }

             after(grammarAccess.getSomeFilter1Access().getSomeFilter1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__0__Impl"


    // $ANTLR start "rule__SomeFilter1__Group__1"
    // InternalBgDsl.g:3318:1: rule__SomeFilter1__Group__1 : rule__SomeFilter1__Group__1__Impl rule__SomeFilter1__Group__2 ;
    public final void rule__SomeFilter1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3322:1: ( rule__SomeFilter1__Group__1__Impl rule__SomeFilter1__Group__2 )
            // InternalBgDsl.g:3323:2: rule__SomeFilter1__Group__1__Impl rule__SomeFilter1__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SomeFilter1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__1"


    // $ANTLR start "rule__SomeFilter1__Group__1__Impl"
    // InternalBgDsl.g:3330:1: rule__SomeFilter1__Group__1__Impl : ( 'SomeFilter1' ) ;
    public final void rule__SomeFilter1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3334:1: ( ( 'SomeFilter1' ) )
            // InternalBgDsl.g:3335:1: ( 'SomeFilter1' )
            {
            // InternalBgDsl.g:3335:1: ( 'SomeFilter1' )
            // InternalBgDsl.g:3336:2: 'SomeFilter1'
            {
             before(grammarAccess.getSomeFilter1Access().getSomeFilter1Keyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSomeFilter1Access().getSomeFilter1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__1__Impl"


    // $ANTLR start "rule__SomeFilter1__Group__2"
    // InternalBgDsl.g:3345:1: rule__SomeFilter1__Group__2 : rule__SomeFilter1__Group__2__Impl rule__SomeFilter1__Group__3 ;
    public final void rule__SomeFilter1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3349:1: ( rule__SomeFilter1__Group__2__Impl rule__SomeFilter1__Group__3 )
            // InternalBgDsl.g:3350:2: rule__SomeFilter1__Group__2__Impl rule__SomeFilter1__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SomeFilter1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__2"


    // $ANTLR start "rule__SomeFilter1__Group__2__Impl"
    // InternalBgDsl.g:3357:1: rule__SomeFilter1__Group__2__Impl : ( '{' ) ;
    public final void rule__SomeFilter1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3361:1: ( ( '{' ) )
            // InternalBgDsl.g:3362:1: ( '{' )
            {
            // InternalBgDsl.g:3362:1: ( '{' )
            // InternalBgDsl.g:3363:2: '{'
            {
             before(grammarAccess.getSomeFilter1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSomeFilter1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__2__Impl"


    // $ANTLR start "rule__SomeFilter1__Group__3"
    // InternalBgDsl.g:3372:1: rule__SomeFilter1__Group__3 : rule__SomeFilter1__Group__3__Impl rule__SomeFilter1__Group__4 ;
    public final void rule__SomeFilter1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3376:1: ( rule__SomeFilter1__Group__3__Impl rule__SomeFilter1__Group__4 )
            // InternalBgDsl.g:3377:2: rule__SomeFilter1__Group__3__Impl rule__SomeFilter1__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__SomeFilter1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__3"


    // $ANTLR start "rule__SomeFilter1__Group__3__Impl"
    // InternalBgDsl.g:3384:1: rule__SomeFilter1__Group__3__Impl : ( ( rule__SomeFilter1__Group_3__0 )? ) ;
    public final void rule__SomeFilter1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3388:1: ( ( ( rule__SomeFilter1__Group_3__0 )? ) )
            // InternalBgDsl.g:3389:1: ( ( rule__SomeFilter1__Group_3__0 )? )
            {
            // InternalBgDsl.g:3389:1: ( ( rule__SomeFilter1__Group_3__0 )? )
            // InternalBgDsl.g:3390:2: ( rule__SomeFilter1__Group_3__0 )?
            {
             before(grammarAccess.getSomeFilter1Access().getGroup_3()); 
            // InternalBgDsl.g:3391:2: ( rule__SomeFilter1__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:3391:3: rule__SomeFilter1__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeFilter1__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeFilter1Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__3__Impl"


    // $ANTLR start "rule__SomeFilter1__Group__4"
    // InternalBgDsl.g:3399:1: rule__SomeFilter1__Group__4 : rule__SomeFilter1__Group__4__Impl ;
    public final void rule__SomeFilter1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3403:1: ( rule__SomeFilter1__Group__4__Impl )
            // InternalBgDsl.g:3404:2: rule__SomeFilter1__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__4"


    // $ANTLR start "rule__SomeFilter1__Group__4__Impl"
    // InternalBgDsl.g:3410:1: rule__SomeFilter1__Group__4__Impl : ( '}' ) ;
    public final void rule__SomeFilter1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3414:1: ( ( '}' ) )
            // InternalBgDsl.g:3415:1: ( '}' )
            {
            // InternalBgDsl.g:3415:1: ( '}' )
            // InternalBgDsl.g:3416:2: '}'
            {
             before(grammarAccess.getSomeFilter1Access().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSomeFilter1Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group__4__Impl"


    // $ANTLR start "rule__SomeFilter1__Group_3__0"
    // InternalBgDsl.g:3426:1: rule__SomeFilter1__Group_3__0 : rule__SomeFilter1__Group_3__0__Impl rule__SomeFilter1__Group_3__1 ;
    public final void rule__SomeFilter1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3430:1: ( rule__SomeFilter1__Group_3__0__Impl rule__SomeFilter1__Group_3__1 )
            // InternalBgDsl.g:3431:2: rule__SomeFilter1__Group_3__0__Impl rule__SomeFilter1__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__SomeFilter1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group_3__0"


    // $ANTLR start "rule__SomeFilter1__Group_3__0__Impl"
    // InternalBgDsl.g:3438:1: rule__SomeFilter1__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__SomeFilter1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3442:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:3443:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:3443:1: ( 'nextFilter' )
            // InternalBgDsl.g:3444:2: 'nextFilter'
            {
             before(grammarAccess.getSomeFilter1Access().getNextFilterKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSomeFilter1Access().getNextFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group_3__0__Impl"


    // $ANTLR start "rule__SomeFilter1__Group_3__1"
    // InternalBgDsl.g:3453:1: rule__SomeFilter1__Group_3__1 : rule__SomeFilter1__Group_3__1__Impl ;
    public final void rule__SomeFilter1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3457:1: ( rule__SomeFilter1__Group_3__1__Impl )
            // InternalBgDsl.g:3458:2: rule__SomeFilter1__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter1__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group_3__1"


    // $ANTLR start "rule__SomeFilter1__Group_3__1__Impl"
    // InternalBgDsl.g:3464:1: rule__SomeFilter1__Group_3__1__Impl : ( ( rule__SomeFilter1__NextFilterAssignment_3_1 ) ) ;
    public final void rule__SomeFilter1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3468:1: ( ( ( rule__SomeFilter1__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3469:1: ( ( rule__SomeFilter1__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3469:1: ( ( rule__SomeFilter1__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:3470:2: ( rule__SomeFilter1__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getSomeFilter1Access().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:3471:2: ( rule__SomeFilter1__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:3471:3: rule__SomeFilter1__NextFilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter1__NextFilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFilter1Access().getNextFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__Group_3__1__Impl"


    // $ANTLR start "rule__SomeFilter2__Group__0"
    // InternalBgDsl.g:3480:1: rule__SomeFilter2__Group__0 : rule__SomeFilter2__Group__0__Impl rule__SomeFilter2__Group__1 ;
    public final void rule__SomeFilter2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3484:1: ( rule__SomeFilter2__Group__0__Impl rule__SomeFilter2__Group__1 )
            // InternalBgDsl.g:3485:2: rule__SomeFilter2__Group__0__Impl rule__SomeFilter2__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SomeFilter2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__0"


    // $ANTLR start "rule__SomeFilter2__Group__0__Impl"
    // InternalBgDsl.g:3492:1: rule__SomeFilter2__Group__0__Impl : ( () ) ;
    public final void rule__SomeFilter2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3496:1: ( ( () ) )
            // InternalBgDsl.g:3497:1: ( () )
            {
            // InternalBgDsl.g:3497:1: ( () )
            // InternalBgDsl.g:3498:2: ()
            {
             before(grammarAccess.getSomeFilter2Access().getSomeFilter2Action_0()); 
            // InternalBgDsl.g:3499:2: ()
            // InternalBgDsl.g:3499:3: 
            {
            }

             after(grammarAccess.getSomeFilter2Access().getSomeFilter2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__0__Impl"


    // $ANTLR start "rule__SomeFilter2__Group__1"
    // InternalBgDsl.g:3507:1: rule__SomeFilter2__Group__1 : rule__SomeFilter2__Group__1__Impl rule__SomeFilter2__Group__2 ;
    public final void rule__SomeFilter2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3511:1: ( rule__SomeFilter2__Group__1__Impl rule__SomeFilter2__Group__2 )
            // InternalBgDsl.g:3512:2: rule__SomeFilter2__Group__1__Impl rule__SomeFilter2__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SomeFilter2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__1"


    // $ANTLR start "rule__SomeFilter2__Group__1__Impl"
    // InternalBgDsl.g:3519:1: rule__SomeFilter2__Group__1__Impl : ( 'SomeFilter2' ) ;
    public final void rule__SomeFilter2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3523:1: ( ( 'SomeFilter2' ) )
            // InternalBgDsl.g:3524:1: ( 'SomeFilter2' )
            {
            // InternalBgDsl.g:3524:1: ( 'SomeFilter2' )
            // InternalBgDsl.g:3525:2: 'SomeFilter2'
            {
             before(grammarAccess.getSomeFilter2Access().getSomeFilter2Keyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSomeFilter2Access().getSomeFilter2Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__1__Impl"


    // $ANTLR start "rule__SomeFilter2__Group__2"
    // InternalBgDsl.g:3534:1: rule__SomeFilter2__Group__2 : rule__SomeFilter2__Group__2__Impl rule__SomeFilter2__Group__3 ;
    public final void rule__SomeFilter2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3538:1: ( rule__SomeFilter2__Group__2__Impl rule__SomeFilter2__Group__3 )
            // InternalBgDsl.g:3539:2: rule__SomeFilter2__Group__2__Impl rule__SomeFilter2__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SomeFilter2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__2"


    // $ANTLR start "rule__SomeFilter2__Group__2__Impl"
    // InternalBgDsl.g:3546:1: rule__SomeFilter2__Group__2__Impl : ( '{' ) ;
    public final void rule__SomeFilter2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3550:1: ( ( '{' ) )
            // InternalBgDsl.g:3551:1: ( '{' )
            {
            // InternalBgDsl.g:3551:1: ( '{' )
            // InternalBgDsl.g:3552:2: '{'
            {
             before(grammarAccess.getSomeFilter2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSomeFilter2Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__2__Impl"


    // $ANTLR start "rule__SomeFilter2__Group__3"
    // InternalBgDsl.g:3561:1: rule__SomeFilter2__Group__3 : rule__SomeFilter2__Group__3__Impl rule__SomeFilter2__Group__4 ;
    public final void rule__SomeFilter2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3565:1: ( rule__SomeFilter2__Group__3__Impl rule__SomeFilter2__Group__4 )
            // InternalBgDsl.g:3566:2: rule__SomeFilter2__Group__3__Impl rule__SomeFilter2__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__SomeFilter2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__3"


    // $ANTLR start "rule__SomeFilter2__Group__3__Impl"
    // InternalBgDsl.g:3573:1: rule__SomeFilter2__Group__3__Impl : ( ( rule__SomeFilter2__Group_3__0 )? ) ;
    public final void rule__SomeFilter2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3577:1: ( ( ( rule__SomeFilter2__Group_3__0 )? ) )
            // InternalBgDsl.g:3578:1: ( ( rule__SomeFilter2__Group_3__0 )? )
            {
            // InternalBgDsl.g:3578:1: ( ( rule__SomeFilter2__Group_3__0 )? )
            // InternalBgDsl.g:3579:2: ( rule__SomeFilter2__Group_3__0 )?
            {
             before(grammarAccess.getSomeFilter2Access().getGroup_3()); 
            // InternalBgDsl.g:3580:2: ( rule__SomeFilter2__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:3580:3: rule__SomeFilter2__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeFilter2__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeFilter2Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__3__Impl"


    // $ANTLR start "rule__SomeFilter2__Group__4"
    // InternalBgDsl.g:3588:1: rule__SomeFilter2__Group__4 : rule__SomeFilter2__Group__4__Impl ;
    public final void rule__SomeFilter2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3592:1: ( rule__SomeFilter2__Group__4__Impl )
            // InternalBgDsl.g:3593:2: rule__SomeFilter2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__4"


    // $ANTLR start "rule__SomeFilter2__Group__4__Impl"
    // InternalBgDsl.g:3599:1: rule__SomeFilter2__Group__4__Impl : ( '}' ) ;
    public final void rule__SomeFilter2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3603:1: ( ( '}' ) )
            // InternalBgDsl.g:3604:1: ( '}' )
            {
            // InternalBgDsl.g:3604:1: ( '}' )
            // InternalBgDsl.g:3605:2: '}'
            {
             before(grammarAccess.getSomeFilter2Access().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSomeFilter2Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group__4__Impl"


    // $ANTLR start "rule__SomeFilter2__Group_3__0"
    // InternalBgDsl.g:3615:1: rule__SomeFilter2__Group_3__0 : rule__SomeFilter2__Group_3__0__Impl rule__SomeFilter2__Group_3__1 ;
    public final void rule__SomeFilter2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3619:1: ( rule__SomeFilter2__Group_3__0__Impl rule__SomeFilter2__Group_3__1 )
            // InternalBgDsl.g:3620:2: rule__SomeFilter2__Group_3__0__Impl rule__SomeFilter2__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__SomeFilter2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group_3__0"


    // $ANTLR start "rule__SomeFilter2__Group_3__0__Impl"
    // InternalBgDsl.g:3627:1: rule__SomeFilter2__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__SomeFilter2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3631:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:3632:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:3632:1: ( 'nextFilter' )
            // InternalBgDsl.g:3633:2: 'nextFilter'
            {
             before(grammarAccess.getSomeFilter2Access().getNextFilterKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSomeFilter2Access().getNextFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group_3__0__Impl"


    // $ANTLR start "rule__SomeFilter2__Group_3__1"
    // InternalBgDsl.g:3642:1: rule__SomeFilter2__Group_3__1 : rule__SomeFilter2__Group_3__1__Impl ;
    public final void rule__SomeFilter2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3646:1: ( rule__SomeFilter2__Group_3__1__Impl )
            // InternalBgDsl.g:3647:2: rule__SomeFilter2__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter2__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group_3__1"


    // $ANTLR start "rule__SomeFilter2__Group_3__1__Impl"
    // InternalBgDsl.g:3653:1: rule__SomeFilter2__Group_3__1__Impl : ( ( rule__SomeFilter2__NextFilterAssignment_3_1 ) ) ;
    public final void rule__SomeFilter2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3657:1: ( ( ( rule__SomeFilter2__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3658:1: ( ( rule__SomeFilter2__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3658:1: ( ( rule__SomeFilter2__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:3659:2: ( rule__SomeFilter2__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getSomeFilter2Access().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:3660:2: ( rule__SomeFilter2__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:3660:3: rule__SomeFilter2__NextFilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFilter2__NextFilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFilter2Access().getNextFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__Group_3__1__Impl"


    // $ANTLR start "rule__Player__NameAssignment_1"
    // InternalBgDsl.g:3669:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3673:1: ( ( ruleEString ) )
            // InternalBgDsl.g:3674:2: ( ruleEString )
            {
            // InternalBgDsl.g:3674:2: ( ruleEString )
            // InternalBgDsl.g:3675:3: ruleEString
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


    // $ANTLR start "rule__TurnPolicy__TypeAssignment_3"
    // InternalBgDsl.g:3684:1: rule__TurnPolicy__TypeAssignment_3 : ( ruleTurnType ) ;
    public final void rule__TurnPolicy__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3688:1: ( ( ruleTurnType ) )
            // InternalBgDsl.g:3689:2: ( ruleTurnType )
            {
            // InternalBgDsl.g:3689:2: ( ruleTurnType )
            // InternalBgDsl.g:3690:3: ruleTurnType
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


    // $ANTLR start "rule__Board__CheckeredAssignment_0"
    // InternalBgDsl.g:3699:1: rule__Board__CheckeredAssignment_0 : ( ( 'checkered' ) ) ;
    public final void rule__Board__CheckeredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3703:1: ( ( ( 'checkered' ) ) )
            // InternalBgDsl.g:3704:2: ( ( 'checkered' ) )
            {
            // InternalBgDsl.g:3704:2: ( ( 'checkered' ) )
            // InternalBgDsl.g:3705:3: ( 'checkered' )
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            // InternalBgDsl.g:3706:3: ( 'checkered' )
            // InternalBgDsl.g:3707:4: 'checkered'
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBgDsl.g:3718:1: rule__Board__WidthAssignment_4 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3722:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:3723:2: ( ruleEInt )
            {
            // InternalBgDsl.g:3723:2: ( ruleEInt )
            // InternalBgDsl.g:3724:3: ruleEInt
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
    // InternalBgDsl.g:3733:1: rule__Board__HeightAssignment_6 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3737:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:3738:2: ( ruleEInt )
            {
            // InternalBgDsl.g:3738:2: ( ruleEInt )
            // InternalBgDsl.g:3739:3: ruleEInt
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
    // InternalBgDsl.g:3748:1: rule__Board__TilesAssignment_9 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3752:1: ( ( ruleTile ) )
            // InternalBgDsl.g:3753:2: ( ruleTile )
            {
            // InternalBgDsl.g:3753:2: ( ruleTile )
            // InternalBgDsl.g:3754:3: ruleTile
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
    // InternalBgDsl.g:3763:1: rule__Board__TilesAssignment_10_1 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3767:1: ( ( ruleTile ) )
            // InternalBgDsl.g:3768:2: ( ruleTile )
            {
            // InternalBgDsl.g:3768:2: ( ruleTile )
            // InternalBgDsl.g:3769:3: ruleTile
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
    // InternalBgDsl.g:3778:1: rule__Board__LegalMovesPipelineAssignment_12_2 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3782:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:3783:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:3783:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:3784:3: ruleLegalMovesPipeline
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
    // InternalBgDsl.g:3793:1: rule__Board__LegalMovesPipelineAssignment_12_3_1 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3797:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:3798:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:3798:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:3799:3: ruleLegalMovesPipeline
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
    // InternalBgDsl.g:3808:1: rule__Board__EffectPipelineAssignment_13_2 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3812:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:3813:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:3813:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:3814:3: ruleEffectPipeline
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
    // InternalBgDsl.g:3823:1: rule__Board__EffectPipelineAssignment_13_3_1 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3827:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:3828:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:3828:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:3829:3: ruleEffectPipeline
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


    // $ANTLR start "rule__Tile__RowAssignment_3"
    // InternalBgDsl.g:3838:1: rule__Tile__RowAssignment_3 : ( ruleEInt ) ;
    public final void rule__Tile__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3842:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:3843:2: ( ruleEInt )
            {
            // InternalBgDsl.g:3843:2: ( ruleEInt )
            // InternalBgDsl.g:3844:3: ruleEInt
            {
             before(grammarAccess.getTileAccess().getRowEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTileAccess().getRowEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__RowAssignment_3"


    // $ANTLR start "rule__Tile__ColAssignment_5"
    // InternalBgDsl.g:3853:1: rule__Tile__ColAssignment_5 : ( ruleEInt ) ;
    public final void rule__Tile__ColAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3857:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:3858:2: ( ruleEInt )
            {
            // InternalBgDsl.g:3858:2: ( ruleEInt )
            // InternalBgDsl.g:3859:3: ruleEInt
            {
             before(grammarAccess.getTileAccess().getColEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTileAccess().getColEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__ColAssignment_5"


    // $ANTLR start "rule__Tile__ColorAssignment_7"
    // InternalBgDsl.g:3868:1: rule__Tile__ColorAssignment_7 : ( ruleEString ) ;
    public final void rule__Tile__ColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3872:1: ( ( ruleEString ) )
            // InternalBgDsl.g:3873:2: ( ruleEString )
            {
            // InternalBgDsl.g:3873:2: ( ruleEString )
            // InternalBgDsl.g:3874:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__ColorAssignment_7"


    // $ANTLR start "rule__Tile__StatesAssignment_10"
    // InternalBgDsl.g:3883:1: rule__Tile__StatesAssignment_10 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3887:1: ( ( ruleState ) )
            // InternalBgDsl.g:3888:2: ( ruleState )
            {
            // InternalBgDsl.g:3888:2: ( ruleState )
            // InternalBgDsl.g:3889:3: ruleState
            {
             before(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getStatesStateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__StatesAssignment_10"


    // $ANTLR start "rule__Tile__StatesAssignment_11_1"
    // InternalBgDsl.g:3898:1: rule__Tile__StatesAssignment_11_1 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3902:1: ( ( ruleState ) )
            // InternalBgDsl.g:3903:2: ( ruleState )
            {
            // InternalBgDsl.g:3903:2: ( ruleState )
            // InternalBgDsl.g:3904:3: ruleState
            {
             before(grammarAccess.getTileAccess().getStatesStateParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getStatesStateParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__StatesAssignment_11_1"


    // $ANTLR start "rule__Tile__TransitionsAssignment_13_2"
    // InternalBgDsl.g:3913:1: rule__Tile__TransitionsAssignment_13_2 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3917:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:3918:2: ( ruleTransition )
            {
            // InternalBgDsl.g:3918:2: ( ruleTransition )
            // InternalBgDsl.g:3919:3: ruleTransition
            {
             before(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TransitionsAssignment_13_2"


    // $ANTLR start "rule__Tile__TransitionsAssignment_13_3_1"
    // InternalBgDsl.g:3928:1: rule__Tile__TransitionsAssignment_13_3_1 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3932:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:3933:2: ( ruleTransition )
            {
            // InternalBgDsl.g:3933:2: ( ruleTransition )
            // InternalBgDsl.g:3934:3: ruleTransition
            {
             before(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTransitionsTransitionParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TransitionsAssignment_13_3_1"


    // $ANTLR start "rule__Tile__InitialStateAssignment_15"
    // InternalBgDsl.g:3943:1: rule__Tile__InitialStateAssignment_15 : ( ruleState ) ;
    public final void rule__Tile__InitialStateAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3947:1: ( ( ruleState ) )
            // InternalBgDsl.g:3948:2: ( ruleState )
            {
            // InternalBgDsl.g:3948:2: ( ruleState )
            // InternalBgDsl.g:3949:3: ruleState
            {
             before(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTileAccess().getInitialStateStateParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__InitialStateAssignment_15"


    // $ANTLR start "rule__LegalMovesPipeline__FilterAssignment_3_1"
    // InternalBgDsl.g:3958:1: rule__LegalMovesPipeline__FilterAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LegalMovesPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3962:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:3963:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:3963:2: ( ( ruleEString ) )
            // InternalBgDsl.g:3964:3: ( ruleEString )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterCrossReference_3_1_0()); 
            // InternalBgDsl.g:3965:3: ( ruleEString )
            // InternalBgDsl.g:3966:4: ruleEString
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLegalMovesPipelineAccess().getFilterFilterCrossReference_3_1_0()); 

            }


            }

        }
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
    // InternalBgDsl.g:3977:1: rule__EffectPipeline__FilterAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EffectPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3981:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:3982:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:3982:2: ( ( ruleEString ) )
            // InternalBgDsl.g:3983:3: ( ruleEString )
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterFilterCrossReference_3_1_0()); 
            // InternalBgDsl.g:3984:3: ( ruleEString )
            // InternalBgDsl.g:3985:4: ruleEString
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterFilterEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectPipelineAccess().getFilterFilterEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEffectPipelineAccess().getFilterFilterCrossReference_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalBgDsl.g:3996:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4000:1: ( ( ruleEString ) )
            // InternalBgDsl.g:4001:2: ( ruleEString )
            {
            // InternalBgDsl.g:4001:2: ( ruleEString )
            // InternalBgDsl.g:4002:3: ruleEString
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
    // InternalBgDsl.g:4011:1: rule__State__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__State__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4015:1: ( ( ruleEString ) )
            // InternalBgDsl.g:4016:2: ( ruleEString )
            {
            // InternalBgDsl.g:4016:2: ( ruleEString )
            // InternalBgDsl.g:4017:3: ruleEString
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


    // $ANTLR start "rule__State__OutboundAssignment_5_1"
    // InternalBgDsl.g:4026:1: rule__State__OutboundAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4030:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:4031:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:4031:2: ( ( ruleEString ) )
            // InternalBgDsl.g:4032:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_1_0()); 
            // InternalBgDsl.g:4033:3: ( ruleEString )
            // InternalBgDsl.g:4034:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutboundTransitionEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutboundAssignment_5_1"


    // $ANTLR start "rule__State__InboundAssignment_6_1"
    // InternalBgDsl.g:4045:1: rule__State__InboundAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4049:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:4050:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:4050:2: ( ( ruleEString ) )
            // InternalBgDsl.g:4051:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_1_0()); 
            // InternalBgDsl.g:4052:3: ( ruleEString )
            // InternalBgDsl.g:4053:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInboundTransitionEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InboundAssignment_6_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalBgDsl.g:4064:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4068:1: ( ( ruleEString ) )
            // InternalBgDsl.g:4069:2: ( ruleEString )
            {
            // InternalBgDsl.g:4069:2: ( ruleEString )
            // InternalBgDsl.g:4070:3: ruleEString
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
    // InternalBgDsl.g:4079:1: rule__Transition__SourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4083:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:4084:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:4084:2: ( ( ruleEString ) )
            // InternalBgDsl.g:4085:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            // InternalBgDsl.g:4086:3: ( ruleEString )
            // InternalBgDsl.g:4087:4: ruleEString
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
    // InternalBgDsl.g:4098:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4102:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:4103:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:4103:2: ( ( ruleEString ) )
            // InternalBgDsl.g:4104:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 
            // InternalBgDsl.g:4105:3: ( ruleEString )
            // InternalBgDsl.g:4106:4: ruleEString
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
    // InternalBgDsl.g:4117:1: rule__Transition__TargetAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4121:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:4122:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:4122:2: ( ( ruleEString ) )
            // InternalBgDsl.g:4123:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 
            // InternalBgDsl.g:4124:3: ( ruleEString )
            // InternalBgDsl.g:4125:4: ruleEString
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


    // $ANTLR start "rule__SomeFilter1__NextFilterAssignment_3_1"
    // InternalBgDsl.g:4136:1: rule__SomeFilter1__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__SomeFilter1__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4140:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:4141:2: ( ruleFilter )
            {
            // InternalBgDsl.g:4141:2: ( ruleFilter )
            // InternalBgDsl.g:4142:3: ruleFilter
            {
             before(grammarAccess.getSomeFilter1Access().getNextFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getSomeFilter1Access().getNextFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter1__NextFilterAssignment_3_1"


    // $ANTLR start "rule__SomeFilter2__NextFilterAssignment_3_1"
    // InternalBgDsl.g:4151:1: rule__SomeFilter2__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__SomeFilter2__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4155:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:4156:2: ( ruleFilter )
            {
            // InternalBgDsl.g:4156:2: ( ruleFilter )
            // InternalBgDsl.g:4157:3: ruleFilter
            {
             before(grammarAccess.getSomeFilter2Access().getNextFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getSomeFilter2Access().getNextFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeFilter2__NextFilterAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000A00000000000L});

}