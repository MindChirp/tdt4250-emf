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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurnBased'", "'Simultaneous'", "'CurrentPlayer'", "'OtherPlayer'", "'StateBased'", "'Game'", "'{'", "'turnPolicy'", "'initialPlayer'", "'board'", "'players'", "'}'", "','", "'Board'", "'width'", "'height'", "'tiles'", "'tileplacement'", "'legalMovesPipeline'", "'effectPipeline'", "'Player'", "'hexColor'", "'associatedState'", "'-'", "'Tile'", "'name'", "'states'", "'initialState'", "'transitions'", "'LegalMovesPipeline'", "'filters'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'patterns'", "'nextFilter'", "'IterativeFilter'", "'directionVector'", "'matchRule'", "'endRule'", "'StateEffectFilter'", "'stateSelection'", "'targetState'", "'Pattern'", "'relativecoordinates'", "'matchState'", "'RelativeCoordinate'", "'x'", "'y'", "'checkered'"
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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
    // InternalBgDsl.g:87:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:91:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalBgDsl.g:92:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalBgDsl.g:92:2: ( ( rule__Filter__Alternatives ) )
            // InternalBgDsl.g:93:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalBgDsl.g:94:3: ( rule__Filter__Alternatives )
            // InternalBgDsl.g:94:4: rule__Filter__Alternatives
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


    // $ANTLR start "entryRuleEInt"
    // InternalBgDsl.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBgDsl.g:179:1: ( ruleEInt EOF )
            // InternalBgDsl.g:180:1: ruleEInt EOF
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
    // InternalBgDsl.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBgDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBgDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalBgDsl.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBgDsl.g:194:3: ( rule__EInt__Group__0 )
            // InternalBgDsl.g:194:4: rule__EInt__Group__0
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
    // InternalBgDsl.g:203:1: entryRuleTile : ruleTile EOF ;
    public final void entryRuleTile() throws RecognitionException {
        try {
            // InternalBgDsl.g:204:1: ( ruleTile EOF )
            // InternalBgDsl.g:205:1: ruleTile EOF
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
    // InternalBgDsl.g:212:1: ruleTile : ( ( rule__Tile__Group__0 ) ) ;
    public final void ruleTile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:216:2: ( ( ( rule__Tile__Group__0 ) ) )
            // InternalBgDsl.g:217:2: ( ( rule__Tile__Group__0 ) )
            {
            // InternalBgDsl.g:217:2: ( ( rule__Tile__Group__0 ) )
            // InternalBgDsl.g:218:3: ( rule__Tile__Group__0 )
            {
             before(grammarAccess.getTileAccess().getGroup()); 
            // InternalBgDsl.g:219:3: ( rule__Tile__Group__0 )
            // InternalBgDsl.g:219:4: rule__Tile__Group__0
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
    // InternalBgDsl.g:228:1: entryRuleLegalMovesPipeline : ruleLegalMovesPipeline EOF ;
    public final void entryRuleLegalMovesPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:229:1: ( ruleLegalMovesPipeline EOF )
            // InternalBgDsl.g:230:1: ruleLegalMovesPipeline EOF
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
    // InternalBgDsl.g:237:1: ruleLegalMovesPipeline : ( ( rule__LegalMovesPipeline__Group__0 ) ) ;
    public final void ruleLegalMovesPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:241:2: ( ( ( rule__LegalMovesPipeline__Group__0 ) ) )
            // InternalBgDsl.g:242:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:242:2: ( ( rule__LegalMovesPipeline__Group__0 ) )
            // InternalBgDsl.g:243:3: ( rule__LegalMovesPipeline__Group__0 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup()); 
            // InternalBgDsl.g:244:3: ( rule__LegalMovesPipeline__Group__0 )
            // InternalBgDsl.g:244:4: rule__LegalMovesPipeline__Group__0
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
    // InternalBgDsl.g:253:1: entryRuleEffectPipeline : ruleEffectPipeline EOF ;
    public final void entryRuleEffectPipeline() throws RecognitionException {
        try {
            // InternalBgDsl.g:254:1: ( ruleEffectPipeline EOF )
            // InternalBgDsl.g:255:1: ruleEffectPipeline EOF
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
    // InternalBgDsl.g:262:1: ruleEffectPipeline : ( ( rule__EffectPipeline__Group__0 ) ) ;
    public final void ruleEffectPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:266:2: ( ( ( rule__EffectPipeline__Group__0 ) ) )
            // InternalBgDsl.g:267:2: ( ( rule__EffectPipeline__Group__0 ) )
            {
            // InternalBgDsl.g:267:2: ( ( rule__EffectPipeline__Group__0 ) )
            // InternalBgDsl.g:268:3: ( rule__EffectPipeline__Group__0 )
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup()); 
            // InternalBgDsl.g:269:3: ( rule__EffectPipeline__Group__0 )
            // InternalBgDsl.g:269:4: rule__EffectPipeline__Group__0
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
    // InternalBgDsl.g:278:1: entryRuleTilePlacement : ruleTilePlacement EOF ;
    public final void entryRuleTilePlacement() throws RecognitionException {
        try {
            // InternalBgDsl.g:279:1: ( ruleTilePlacement EOF )
            // InternalBgDsl.g:280:1: ruleTilePlacement EOF
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
    // InternalBgDsl.g:287:1: ruleTilePlacement : ( ( rule__TilePlacement__Group__0 ) ) ;
    public final void ruleTilePlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:291:2: ( ( ( rule__TilePlacement__Group__0 ) ) )
            // InternalBgDsl.g:292:2: ( ( rule__TilePlacement__Group__0 ) )
            {
            // InternalBgDsl.g:292:2: ( ( rule__TilePlacement__Group__0 ) )
            // InternalBgDsl.g:293:3: ( rule__TilePlacement__Group__0 )
            {
             before(grammarAccess.getTilePlacementAccess().getGroup()); 
            // InternalBgDsl.g:294:3: ( rule__TilePlacement__Group__0 )
            // InternalBgDsl.g:294:4: rule__TilePlacement__Group__0
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
    // InternalBgDsl.g:303:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalBgDsl.g:304:1: ( ruleState EOF )
            // InternalBgDsl.g:305:1: ruleState EOF
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
    // InternalBgDsl.g:312:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:316:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalBgDsl.g:317:2: ( ( rule__State__Group__0 ) )
            {
            // InternalBgDsl.g:317:2: ( ( rule__State__Group__0 ) )
            // InternalBgDsl.g:318:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalBgDsl.g:319:3: ( rule__State__Group__0 )
            // InternalBgDsl.g:319:4: rule__State__Group__0
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
    // InternalBgDsl.g:328:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalBgDsl.g:329:1: ( ruleTransition EOF )
            // InternalBgDsl.g:330:1: ruleTransition EOF
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
    // InternalBgDsl.g:337:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:341:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalBgDsl.g:342:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalBgDsl.g:342:2: ( ( rule__Transition__Group__0 ) )
            // InternalBgDsl.g:343:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalBgDsl.g:344:3: ( rule__Transition__Group__0 )
            // InternalBgDsl.g:344:4: rule__Transition__Group__0
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
    // InternalBgDsl.g:353:1: entryRulePatternFilter : rulePatternFilter EOF ;
    public final void entryRulePatternFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:354:1: ( rulePatternFilter EOF )
            // InternalBgDsl.g:355:1: rulePatternFilter EOF
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
    // InternalBgDsl.g:362:1: rulePatternFilter : ( ( rule__PatternFilter__Group__0 ) ) ;
    public final void rulePatternFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:366:2: ( ( ( rule__PatternFilter__Group__0 ) ) )
            // InternalBgDsl.g:367:2: ( ( rule__PatternFilter__Group__0 ) )
            {
            // InternalBgDsl.g:367:2: ( ( rule__PatternFilter__Group__0 ) )
            // InternalBgDsl.g:368:3: ( rule__PatternFilter__Group__0 )
            {
             before(grammarAccess.getPatternFilterAccess().getGroup()); 
            // InternalBgDsl.g:369:3: ( rule__PatternFilter__Group__0 )
            // InternalBgDsl.g:369:4: rule__PatternFilter__Group__0
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


    // $ANTLR start "entryRuleIterativeFilter"
    // InternalBgDsl.g:378:1: entryRuleIterativeFilter : ruleIterativeFilter EOF ;
    public final void entryRuleIterativeFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:379:1: ( ruleIterativeFilter EOF )
            // InternalBgDsl.g:380:1: ruleIterativeFilter EOF
            {
             before(grammarAccess.getIterativeFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleIterativeFilter();

            state._fsp--;

             after(grammarAccess.getIterativeFilterRule()); 
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
    // $ANTLR end "entryRuleIterativeFilter"


    // $ANTLR start "ruleIterativeFilter"
    // InternalBgDsl.g:387:1: ruleIterativeFilter : ( ( rule__IterativeFilter__Group__0 ) ) ;
    public final void ruleIterativeFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:391:2: ( ( ( rule__IterativeFilter__Group__0 ) ) )
            // InternalBgDsl.g:392:2: ( ( rule__IterativeFilter__Group__0 ) )
            {
            // InternalBgDsl.g:392:2: ( ( rule__IterativeFilter__Group__0 ) )
            // InternalBgDsl.g:393:3: ( rule__IterativeFilter__Group__0 )
            {
             before(grammarAccess.getIterativeFilterAccess().getGroup()); 
            // InternalBgDsl.g:394:3: ( rule__IterativeFilter__Group__0 )
            // InternalBgDsl.g:394:4: rule__IterativeFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIterativeFilter"


    // $ANTLR start "entryRuleStateEffectFilter"
    // InternalBgDsl.g:403:1: entryRuleStateEffectFilter : ruleStateEffectFilter EOF ;
    public final void entryRuleStateEffectFilter() throws RecognitionException {
        try {
            // InternalBgDsl.g:404:1: ( ruleStateEffectFilter EOF )
            // InternalBgDsl.g:405:1: ruleStateEffectFilter EOF
            {
             before(grammarAccess.getStateEffectFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleStateEffectFilter();

            state._fsp--;

             after(grammarAccess.getStateEffectFilterRule()); 
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
    // $ANTLR end "entryRuleStateEffectFilter"


    // $ANTLR start "ruleStateEffectFilter"
    // InternalBgDsl.g:412:1: ruleStateEffectFilter : ( ( rule__StateEffectFilter__Group__0 ) ) ;
    public final void ruleStateEffectFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:416:2: ( ( ( rule__StateEffectFilter__Group__0 ) ) )
            // InternalBgDsl.g:417:2: ( ( rule__StateEffectFilter__Group__0 ) )
            {
            // InternalBgDsl.g:417:2: ( ( rule__StateEffectFilter__Group__0 ) )
            // InternalBgDsl.g:418:3: ( rule__StateEffectFilter__Group__0 )
            {
             before(grammarAccess.getStateEffectFilterAccess().getGroup()); 
            // InternalBgDsl.g:419:3: ( rule__StateEffectFilter__Group__0 )
            // InternalBgDsl.g:419:4: rule__StateEffectFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateEffectFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateEffectFilter"


    // $ANTLR start "entryRulePattern"
    // InternalBgDsl.g:428:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalBgDsl.g:429:1: ( rulePattern EOF )
            // InternalBgDsl.g:430:1: rulePattern EOF
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
    // InternalBgDsl.g:437:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:441:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalBgDsl.g:442:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalBgDsl.g:442:2: ( ( rule__Pattern__Group__0 ) )
            // InternalBgDsl.g:443:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalBgDsl.g:444:3: ( rule__Pattern__Group__0 )
            // InternalBgDsl.g:444:4: rule__Pattern__Group__0
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
    // InternalBgDsl.g:453:1: entryRuleRelativeCoordinate : ruleRelativeCoordinate EOF ;
    public final void entryRuleRelativeCoordinate() throws RecognitionException {
        try {
            // InternalBgDsl.g:454:1: ( ruleRelativeCoordinate EOF )
            // InternalBgDsl.g:455:1: ruleRelativeCoordinate EOF
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
    // InternalBgDsl.g:462:1: ruleRelativeCoordinate : ( ( rule__RelativeCoordinate__Group__0 ) ) ;
    public final void ruleRelativeCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:466:2: ( ( ( rule__RelativeCoordinate__Group__0 ) ) )
            // InternalBgDsl.g:467:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            {
            // InternalBgDsl.g:467:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            // InternalBgDsl.g:468:3: ( rule__RelativeCoordinate__Group__0 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getGroup()); 
            // InternalBgDsl.g:469:3: ( rule__RelativeCoordinate__Group__0 )
            // InternalBgDsl.g:469:4: rule__RelativeCoordinate__Group__0
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
    // InternalBgDsl.g:478:1: ruleTurnType : ( ( rule__TurnType__Alternatives ) ) ;
    public final void ruleTurnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:482:1: ( ( ( rule__TurnType__Alternatives ) ) )
            // InternalBgDsl.g:483:2: ( ( rule__TurnType__Alternatives ) )
            {
            // InternalBgDsl.g:483:2: ( ( rule__TurnType__Alternatives ) )
            // InternalBgDsl.g:484:3: ( rule__TurnType__Alternatives )
            {
             before(grammarAccess.getTurnTypeAccess().getAlternatives()); 
            // InternalBgDsl.g:485:3: ( rule__TurnType__Alternatives )
            // InternalBgDsl.g:485:4: rule__TurnType__Alternatives
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


    // $ANTLR start "ruleStateSelection"
    // InternalBgDsl.g:494:1: ruleStateSelection : ( ( rule__StateSelection__Alternatives ) ) ;
    public final void ruleStateSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:498:1: ( ( ( rule__StateSelection__Alternatives ) ) )
            // InternalBgDsl.g:499:2: ( ( rule__StateSelection__Alternatives ) )
            {
            // InternalBgDsl.g:499:2: ( ( rule__StateSelection__Alternatives ) )
            // InternalBgDsl.g:500:3: ( rule__StateSelection__Alternatives )
            {
             before(grammarAccess.getStateSelectionAccess().getAlternatives()); 
            // InternalBgDsl.g:501:3: ( rule__StateSelection__Alternatives )
            // InternalBgDsl.g:501:4: rule__StateSelection__Alternatives
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


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalBgDsl.g:509:1: rule__Filter__Alternatives : ( ( rulePatternFilter ) | ( ruleIterativeFilter ) | ( ruleStateEffectFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:513:1: ( ( rulePatternFilter ) | ( ruleIterativeFilter ) | ( ruleStateEffectFilter ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt1=1;
                }
                break;
            case 58:
                {
                alt1=2;
                }
                break;
            case 62:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBgDsl.g:514:2: ( rulePatternFilter )
                    {
                    // InternalBgDsl.g:514:2: ( rulePatternFilter )
                    // InternalBgDsl.g:515:3: rulePatternFilter
                    {
                     before(grammarAccess.getFilterAccess().getPatternFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePatternFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getPatternFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:520:2: ( ruleIterativeFilter )
                    {
                    // InternalBgDsl.g:520:2: ( ruleIterativeFilter )
                    // InternalBgDsl.g:521:3: ruleIterativeFilter
                    {
                     before(grammarAccess.getFilterAccess().getIterativeFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIterativeFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getIterativeFilterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:526:2: ( ruleStateEffectFilter )
                    {
                    // InternalBgDsl.g:526:2: ( ruleStateEffectFilter )
                    // InternalBgDsl.g:527:3: ruleStateEffectFilter
                    {
                     before(grammarAccess.getFilterAccess().getStateEffectFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStateEffectFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getStateEffectFilterParserRuleCall_2()); 

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
    // InternalBgDsl.g:536:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:540:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBgDsl.g:541:2: ( RULE_STRING )
                    {
                    // InternalBgDsl.g:541:2: ( RULE_STRING )
                    // InternalBgDsl.g:542:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:547:2: ( RULE_ID )
                    {
                    // InternalBgDsl.g:547:2: ( RULE_ID )
                    // InternalBgDsl.g:548:3: RULE_ID
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
    // InternalBgDsl.g:557:1: rule__TurnType__Alternatives : ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) );
    public final void rule__TurnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:561:1: ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) )
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
                    // InternalBgDsl.g:562:2: ( ( 'TurnBased' ) )
                    {
                    // InternalBgDsl.g:562:2: ( ( 'TurnBased' ) )
                    // InternalBgDsl.g:563:3: ( 'TurnBased' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:564:3: ( 'TurnBased' )
                    // InternalBgDsl.g:564:4: 'TurnBased'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:568:2: ( ( 'Simultaneous' ) )
                    {
                    // InternalBgDsl.g:568:2: ( ( 'Simultaneous' ) )
                    // InternalBgDsl.g:569:3: ( 'Simultaneous' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:570:3: ( 'Simultaneous' )
                    // InternalBgDsl.g:570:4: 'Simultaneous'
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


    // $ANTLR start "rule__StateSelection__Alternatives"
    // InternalBgDsl.g:578:1: rule__StateSelection__Alternatives : ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) );
    public final void rule__StateSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:582:1: ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBgDsl.g:583:2: ( ( 'CurrentPlayer' ) )
                    {
                    // InternalBgDsl.g:583:2: ( ( 'CurrentPlayer' ) )
                    // InternalBgDsl.g:584:3: ( 'CurrentPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:585:3: ( 'CurrentPlayer' )
                    // InternalBgDsl.g:585:4: 'CurrentPlayer'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:589:2: ( ( 'OtherPlayer' ) )
                    {
                    // InternalBgDsl.g:589:2: ( ( 'OtherPlayer' ) )
                    // InternalBgDsl.g:590:3: ( 'OtherPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:591:3: ( 'OtherPlayer' )
                    // InternalBgDsl.g:591:4: 'OtherPlayer'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:595:2: ( ( 'StateBased' ) )
                    {
                    // InternalBgDsl.g:595:2: ( ( 'StateBased' ) )
                    // InternalBgDsl.g:596:3: ( 'StateBased' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2()); 
                    // InternalBgDsl.g:597:3: ( 'StateBased' )
                    // InternalBgDsl.g:597:4: 'StateBased'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__Game__Group__0"
    // InternalBgDsl.g:605:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:609:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalBgDsl.g:610:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalBgDsl.g:617:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:621:1: ( ( 'Game' ) )
            // InternalBgDsl.g:622:1: ( 'Game' )
            {
            // InternalBgDsl.g:622:1: ( 'Game' )
            // InternalBgDsl.g:623:2: 'Game'
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
    // InternalBgDsl.g:632:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:636:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalBgDsl.g:637:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalBgDsl.g:644:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:648:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalBgDsl.g:649:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:649:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalBgDsl.g:650:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:651:2: ( rule__Game__NameAssignment_1 )
            // InternalBgDsl.g:651:3: rule__Game__NameAssignment_1
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
    // InternalBgDsl.g:659:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:663:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalBgDsl.g:664:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalBgDsl.g:671:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:675:1: ( ( '{' ) )
            // InternalBgDsl.g:676:1: ( '{' )
            {
            // InternalBgDsl.g:676:1: ( '{' )
            // InternalBgDsl.g:677:2: '{'
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
    // InternalBgDsl.g:686:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:690:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalBgDsl.g:691:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalBgDsl.g:698:1: rule__Game__Group__3__Impl : ( 'turnPolicy' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:702:1: ( ( 'turnPolicy' ) )
            // InternalBgDsl.g:703:1: ( 'turnPolicy' )
            {
            // InternalBgDsl.g:703:1: ( 'turnPolicy' )
            // InternalBgDsl.g:704:2: 'turnPolicy'
            {
             before(grammarAccess.getGameAccess().getTurnPolicyKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTurnPolicyKeyword_3()); 

            }


            }

        }
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
    // InternalBgDsl.g:713:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:717:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalBgDsl.g:718:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalBgDsl.g:725:1: rule__Game__Group__4__Impl : ( ( rule__Game__TurnPolicyAssignment_4 ) ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:729:1: ( ( ( rule__Game__TurnPolicyAssignment_4 ) ) )
            // InternalBgDsl.g:730:1: ( ( rule__Game__TurnPolicyAssignment_4 ) )
            {
            // InternalBgDsl.g:730:1: ( ( rule__Game__TurnPolicyAssignment_4 ) )
            // InternalBgDsl.g:731:2: ( rule__Game__TurnPolicyAssignment_4 )
            {
             before(grammarAccess.getGameAccess().getTurnPolicyAssignment_4()); 
            // InternalBgDsl.g:732:2: ( rule__Game__TurnPolicyAssignment_4 )
            // InternalBgDsl.g:732:3: rule__Game__TurnPolicyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Game__TurnPolicyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTurnPolicyAssignment_4()); 

            }


            }

        }
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
    // InternalBgDsl.g:740:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:744:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalBgDsl.g:745:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalBgDsl.g:752:1: rule__Game__Group__5__Impl : ( 'initialPlayer' ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:756:1: ( ( 'initialPlayer' ) )
            // InternalBgDsl.g:757:1: ( 'initialPlayer' )
            {
            // InternalBgDsl.g:757:1: ( 'initialPlayer' )
            // InternalBgDsl.g:758:2: 'initialPlayer'
            {
             before(grammarAccess.getGameAccess().getInitialPlayerKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getInitialPlayerKeyword_5()); 

            }


            }

        }
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
    // InternalBgDsl.g:767:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:771:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalBgDsl.g:772:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalBgDsl.g:779:1: rule__Game__Group__6__Impl : ( ( rule__Game__InitialPlayerAssignment_6 ) ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:783:1: ( ( ( rule__Game__InitialPlayerAssignment_6 ) ) )
            // InternalBgDsl.g:784:1: ( ( rule__Game__InitialPlayerAssignment_6 ) )
            {
            // InternalBgDsl.g:784:1: ( ( rule__Game__InitialPlayerAssignment_6 ) )
            // InternalBgDsl.g:785:2: ( rule__Game__InitialPlayerAssignment_6 )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerAssignment_6()); 
            // InternalBgDsl.g:786:2: ( rule__Game__InitialPlayerAssignment_6 )
            // InternalBgDsl.g:786:3: rule__Game__InitialPlayerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Game__InitialPlayerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getInitialPlayerAssignment_6()); 

            }


            }

        }
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
    // InternalBgDsl.g:794:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:798:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalBgDsl.g:799:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalBgDsl.g:806:1: rule__Game__Group__7__Impl : ( 'board' ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:810:1: ( ( 'board' ) )
            // InternalBgDsl.g:811:1: ( 'board' )
            {
            // InternalBgDsl.g:811:1: ( 'board' )
            // InternalBgDsl.g:812:2: 'board'
            {
             before(grammarAccess.getGameAccess().getBoardKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getBoardKeyword_7()); 

            }


            }

        }
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
    // InternalBgDsl.g:821:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:825:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalBgDsl.g:826:2: rule__Game__Group__8__Impl rule__Game__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalBgDsl.g:833:1: rule__Game__Group__8__Impl : ( ( rule__Game__BoardAssignment_8 ) ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:837:1: ( ( ( rule__Game__BoardAssignment_8 ) ) )
            // InternalBgDsl.g:838:1: ( ( rule__Game__BoardAssignment_8 ) )
            {
            // InternalBgDsl.g:838:1: ( ( rule__Game__BoardAssignment_8 ) )
            // InternalBgDsl.g:839:2: ( rule__Game__BoardAssignment_8 )
            {
             before(grammarAccess.getGameAccess().getBoardAssignment_8()); 
            // InternalBgDsl.g:840:2: ( rule__Game__BoardAssignment_8 )
            // InternalBgDsl.g:840:3: rule__Game__BoardAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Game__BoardAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getBoardAssignment_8()); 

            }


            }

        }
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
    // InternalBgDsl.g:848:1: rule__Game__Group__9 : rule__Game__Group__9__Impl rule__Game__Group__10 ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:852:1: ( rule__Game__Group__9__Impl rule__Game__Group__10 )
            // InternalBgDsl.g:853:2: rule__Game__Group__9__Impl rule__Game__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__10();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:860:1: rule__Game__Group__9__Impl : ( 'players' ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:864:1: ( ( 'players' ) )
            // InternalBgDsl.g:865:1: ( 'players' )
            {
            // InternalBgDsl.g:865:1: ( 'players' )
            // InternalBgDsl.g:866:2: 'players'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getPlayersKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Game__Group__10"
    // InternalBgDsl.g:875:1: rule__Game__Group__10 : rule__Game__Group__10__Impl rule__Game__Group__11 ;
    public final void rule__Game__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:879:1: ( rule__Game__Group__10__Impl rule__Game__Group__11 )
            // InternalBgDsl.g:880:2: rule__Game__Group__10__Impl rule__Game__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10"


    // $ANTLR start "rule__Game__Group__10__Impl"
    // InternalBgDsl.g:887:1: rule__Game__Group__10__Impl : ( '{' ) ;
    public final void rule__Game__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:891:1: ( ( '{' ) )
            // InternalBgDsl.g:892:1: ( '{' )
            {
            // InternalBgDsl.g:892:1: ( '{' )
            // InternalBgDsl.g:893:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10__Impl"


    // $ANTLR start "rule__Game__Group__11"
    // InternalBgDsl.g:902:1: rule__Game__Group__11 : rule__Game__Group__11__Impl rule__Game__Group__12 ;
    public final void rule__Game__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:906:1: ( rule__Game__Group__11__Impl rule__Game__Group__12 )
            // InternalBgDsl.g:907:2: rule__Game__Group__11__Impl rule__Game__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Game__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11"


    // $ANTLR start "rule__Game__Group__11__Impl"
    // InternalBgDsl.g:914:1: rule__Game__Group__11__Impl : ( ( rule__Game__PlayersAssignment_11 ) ) ;
    public final void rule__Game__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:918:1: ( ( ( rule__Game__PlayersAssignment_11 ) ) )
            // InternalBgDsl.g:919:1: ( ( rule__Game__PlayersAssignment_11 ) )
            {
            // InternalBgDsl.g:919:1: ( ( rule__Game__PlayersAssignment_11 ) )
            // InternalBgDsl.g:920:2: ( rule__Game__PlayersAssignment_11 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_11()); 
            // InternalBgDsl.g:921:2: ( rule__Game__PlayersAssignment_11 )
            // InternalBgDsl.g:921:3: rule__Game__PlayersAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Game__PlayersAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11__Impl"


    // $ANTLR start "rule__Game__Group__12"
    // InternalBgDsl.g:929:1: rule__Game__Group__12 : rule__Game__Group__12__Impl rule__Game__Group__13 ;
    public final void rule__Game__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:933:1: ( rule__Game__Group__12__Impl rule__Game__Group__13 )
            // InternalBgDsl.g:934:2: rule__Game__Group__12__Impl rule__Game__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Game__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__12"


    // $ANTLR start "rule__Game__Group__12__Impl"
    // InternalBgDsl.g:941:1: rule__Game__Group__12__Impl : ( ( rule__Game__Group_12__0 )* ) ;
    public final void rule__Game__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:945:1: ( ( ( rule__Game__Group_12__0 )* ) )
            // InternalBgDsl.g:946:1: ( ( rule__Game__Group_12__0 )* )
            {
            // InternalBgDsl.g:946:1: ( ( rule__Game__Group_12__0 )* )
            // InternalBgDsl.g:947:2: ( rule__Game__Group_12__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_12()); 
            // InternalBgDsl.g:948:2: ( rule__Game__Group_12__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBgDsl.g:948:3: rule__Game__Group_12__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Game__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__12__Impl"


    // $ANTLR start "rule__Game__Group__13"
    // InternalBgDsl.g:956:1: rule__Game__Group__13 : rule__Game__Group__13__Impl rule__Game__Group__14 ;
    public final void rule__Game__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:960:1: ( rule__Game__Group__13__Impl rule__Game__Group__14 )
            // InternalBgDsl.g:961:2: rule__Game__Group__13__Impl rule__Game__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Game__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__13"


    // $ANTLR start "rule__Game__Group__13__Impl"
    // InternalBgDsl.g:968:1: rule__Game__Group__13__Impl : ( '}' ) ;
    public final void rule__Game__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:972:1: ( ( '}' ) )
            // InternalBgDsl.g:973:1: ( '}' )
            {
            // InternalBgDsl.g:973:1: ( '}' )
            // InternalBgDsl.g:974:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__13__Impl"


    // $ANTLR start "rule__Game__Group__14"
    // InternalBgDsl.g:983:1: rule__Game__Group__14 : rule__Game__Group__14__Impl ;
    public final void rule__Game__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:987:1: ( rule__Game__Group__14__Impl )
            // InternalBgDsl.g:988:2: rule__Game__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__14"


    // $ANTLR start "rule__Game__Group__14__Impl"
    // InternalBgDsl.g:994:1: rule__Game__Group__14__Impl : ( '}' ) ;
    public final void rule__Game__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:998:1: ( ( '}' ) )
            // InternalBgDsl.g:999:1: ( '}' )
            {
            // InternalBgDsl.g:999:1: ( '}' )
            // InternalBgDsl.g:1000:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__14__Impl"


    // $ANTLR start "rule__Game__Group_12__0"
    // InternalBgDsl.g:1010:1: rule__Game__Group_12__0 : rule__Game__Group_12__0__Impl rule__Game__Group_12__1 ;
    public final void rule__Game__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1014:1: ( rule__Game__Group_12__0__Impl rule__Game__Group_12__1 )
            // InternalBgDsl.g:1015:2: rule__Game__Group_12__0__Impl rule__Game__Group_12__1
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_12__0"


    // $ANTLR start "rule__Game__Group_12__0__Impl"
    // InternalBgDsl.g:1022:1: rule__Game__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1026:1: ( ( ',' ) )
            // InternalBgDsl.g:1027:1: ( ',' )
            {
            // InternalBgDsl.g:1027:1: ( ',' )
            // InternalBgDsl.g:1028:2: ','
            {
             before(grammarAccess.getGameAccess().getCommaKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_12__0__Impl"


    // $ANTLR start "rule__Game__Group_12__1"
    // InternalBgDsl.g:1037:1: rule__Game__Group_12__1 : rule__Game__Group_12__1__Impl ;
    public final void rule__Game__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1041:1: ( rule__Game__Group_12__1__Impl )
            // InternalBgDsl.g:1042:2: rule__Game__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_12__1"


    // $ANTLR start "rule__Game__Group_12__1__Impl"
    // InternalBgDsl.g:1048:1: rule__Game__Group_12__1__Impl : ( ( rule__Game__PlayersAssignment_12_1 ) ) ;
    public final void rule__Game__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1052:1: ( ( ( rule__Game__PlayersAssignment_12_1 ) ) )
            // InternalBgDsl.g:1053:1: ( ( rule__Game__PlayersAssignment_12_1 ) )
            {
            // InternalBgDsl.g:1053:1: ( ( rule__Game__PlayersAssignment_12_1 ) )
            // InternalBgDsl.g:1054:2: ( rule__Game__PlayersAssignment_12_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_12_1()); 
            // InternalBgDsl.g:1055:2: ( rule__Game__PlayersAssignment_12_1 )
            // InternalBgDsl.g:1055:3: rule__Game__PlayersAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__PlayersAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_12__1__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // InternalBgDsl.g:1064:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1068:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBgDsl.g:1069:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBgDsl.g:1076:1: rule__Board__Group__0__Impl : ( ( rule__Board__CheckeredAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1080:1: ( ( ( rule__Board__CheckeredAssignment_0 ) ) )
            // InternalBgDsl.g:1081:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            {
            // InternalBgDsl.g:1081:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            // InternalBgDsl.g:1082:2: ( rule__Board__CheckeredAssignment_0 )
            {
             before(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 
            // InternalBgDsl.g:1083:2: ( rule__Board__CheckeredAssignment_0 )
            // InternalBgDsl.g:1083:3: rule__Board__CheckeredAssignment_0
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
    // InternalBgDsl.g:1091:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1095:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBgDsl.g:1096:2: rule__Board__Group__1__Impl rule__Board__Group__2
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
    // InternalBgDsl.g:1103:1: rule__Board__Group__1__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1107:1: ( ( 'Board' ) )
            // InternalBgDsl.g:1108:1: ( 'Board' )
            {
            // InternalBgDsl.g:1108:1: ( 'Board' )
            // InternalBgDsl.g:1109:2: 'Board'
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
    // InternalBgDsl.g:1118:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1122:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBgDsl.g:1123:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBgDsl.g:1130:1: rule__Board__Group__2__Impl : ( '{' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1134:1: ( ( '{' ) )
            // InternalBgDsl.g:1135:1: ( '{' )
            {
            // InternalBgDsl.g:1135:1: ( '{' )
            // InternalBgDsl.g:1136:2: '{'
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
    // InternalBgDsl.g:1145:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1149:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBgDsl.g:1150:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:1157:1: rule__Board__Group__3__Impl : ( 'width' ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1161:1: ( ( 'width' ) )
            // InternalBgDsl.g:1162:1: ( 'width' )
            {
            // InternalBgDsl.g:1162:1: ( 'width' )
            // InternalBgDsl.g:1163:2: 'width'
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
    // InternalBgDsl.g:1172:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1176:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBgDsl.g:1177:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBgDsl.g:1184:1: rule__Board__Group__4__Impl : ( ( rule__Board__WidthAssignment_4 ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1188:1: ( ( ( rule__Board__WidthAssignment_4 ) ) )
            // InternalBgDsl.g:1189:1: ( ( rule__Board__WidthAssignment_4 ) )
            {
            // InternalBgDsl.g:1189:1: ( ( rule__Board__WidthAssignment_4 ) )
            // InternalBgDsl.g:1190:2: ( rule__Board__WidthAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_4()); 
            // InternalBgDsl.g:1191:2: ( rule__Board__WidthAssignment_4 )
            // InternalBgDsl.g:1191:3: rule__Board__WidthAssignment_4
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
    // InternalBgDsl.g:1199:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1203:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBgDsl.g:1204:2: rule__Board__Group__5__Impl rule__Board__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:1211:1: rule__Board__Group__5__Impl : ( 'height' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1215:1: ( ( 'height' ) )
            // InternalBgDsl.g:1216:1: ( 'height' )
            {
            // InternalBgDsl.g:1216:1: ( 'height' )
            // InternalBgDsl.g:1217:2: 'height'
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
    // InternalBgDsl.g:1226:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1230:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBgDsl.g:1231:2: rule__Board__Group__6__Impl rule__Board__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalBgDsl.g:1238:1: rule__Board__Group__6__Impl : ( ( rule__Board__HeightAssignment_6 ) ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1242:1: ( ( ( rule__Board__HeightAssignment_6 ) ) )
            // InternalBgDsl.g:1243:1: ( ( rule__Board__HeightAssignment_6 ) )
            {
            // InternalBgDsl.g:1243:1: ( ( rule__Board__HeightAssignment_6 ) )
            // InternalBgDsl.g:1244:2: ( rule__Board__HeightAssignment_6 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_6()); 
            // InternalBgDsl.g:1245:2: ( rule__Board__HeightAssignment_6 )
            // InternalBgDsl.g:1245:3: rule__Board__HeightAssignment_6
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
    // InternalBgDsl.g:1253:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1257:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBgDsl.g:1258:2: rule__Board__Group__7__Impl rule__Board__Group__8
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
    // InternalBgDsl.g:1265:1: rule__Board__Group__7__Impl : ( 'tiles' ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1269:1: ( ( 'tiles' ) )
            // InternalBgDsl.g:1270:1: ( 'tiles' )
            {
            // InternalBgDsl.g:1270:1: ( 'tiles' )
            // InternalBgDsl.g:1271:2: 'tiles'
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
    // InternalBgDsl.g:1280:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1284:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBgDsl.g:1285:2: rule__Board__Group__8__Impl rule__Board__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalBgDsl.g:1292:1: rule__Board__Group__8__Impl : ( '{' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1296:1: ( ( '{' ) )
            // InternalBgDsl.g:1297:1: ( '{' )
            {
            // InternalBgDsl.g:1297:1: ( '{' )
            // InternalBgDsl.g:1298:2: '{'
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
    // InternalBgDsl.g:1307:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1311:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBgDsl.g:1312:2: rule__Board__Group__9__Impl rule__Board__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:1319:1: rule__Board__Group__9__Impl : ( ( rule__Board__TilesAssignment_9 ) ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1323:1: ( ( ( rule__Board__TilesAssignment_9 ) ) )
            // InternalBgDsl.g:1324:1: ( ( rule__Board__TilesAssignment_9 ) )
            {
            // InternalBgDsl.g:1324:1: ( ( rule__Board__TilesAssignment_9 ) )
            // InternalBgDsl.g:1325:2: ( rule__Board__TilesAssignment_9 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_9()); 
            // InternalBgDsl.g:1326:2: ( rule__Board__TilesAssignment_9 )
            // InternalBgDsl.g:1326:3: rule__Board__TilesAssignment_9
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
    // InternalBgDsl.g:1334:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1338:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBgDsl.g:1339:2: rule__Board__Group__10__Impl rule__Board__Group__11
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:1346:1: rule__Board__Group__10__Impl : ( ( rule__Board__Group_10__0 )* ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1350:1: ( ( ( rule__Board__Group_10__0 )* ) )
            // InternalBgDsl.g:1351:1: ( ( rule__Board__Group_10__0 )* )
            {
            // InternalBgDsl.g:1351:1: ( ( rule__Board__Group_10__0 )* )
            // InternalBgDsl.g:1352:2: ( rule__Board__Group_10__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_10()); 
            // InternalBgDsl.g:1353:2: ( rule__Board__Group_10__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBgDsl.g:1353:3: rule__Board__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Board__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBgDsl.g:1361:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1365:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBgDsl.g:1366:2: rule__Board__Group__11__Impl rule__Board__Group__12
            {
            pushFollow(FOLLOW_21);
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
    // InternalBgDsl.g:1373:1: rule__Board__Group__11__Impl : ( '}' ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1377:1: ( ( '}' ) )
            // InternalBgDsl.g:1378:1: ( '}' )
            {
            // InternalBgDsl.g:1378:1: ( '}' )
            // InternalBgDsl.g:1379:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1388:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1392:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBgDsl.g:1393:2: rule__Board__Group__12__Impl rule__Board__Group__13
            {
            pushFollow(FOLLOW_21);
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
    // InternalBgDsl.g:1400:1: rule__Board__Group__12__Impl : ( ( rule__Board__Group_12__0 )? ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1404:1: ( ( ( rule__Board__Group_12__0 )? ) )
            // InternalBgDsl.g:1405:1: ( ( rule__Board__Group_12__0 )? )
            {
            // InternalBgDsl.g:1405:1: ( ( rule__Board__Group_12__0 )? )
            // InternalBgDsl.g:1406:2: ( rule__Board__Group_12__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_12()); 
            // InternalBgDsl.g:1407:2: ( rule__Board__Group_12__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBgDsl.g:1407:3: rule__Board__Group_12__0
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
    // InternalBgDsl.g:1415:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1419:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBgDsl.g:1420:2: rule__Board__Group__13__Impl rule__Board__Group__14
            {
            pushFollow(FOLLOW_21);
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
    // InternalBgDsl.g:1427:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1431:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBgDsl.g:1432:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBgDsl.g:1432:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBgDsl.g:1433:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBgDsl.g:1434:2: ( rule__Board__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBgDsl.g:1434:3: rule__Board__Group_13__0
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
    // InternalBgDsl.g:1442:1: rule__Board__Group__14 : rule__Board__Group__14__Impl rule__Board__Group__15 ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1446:1: ( rule__Board__Group__14__Impl rule__Board__Group__15 )
            // InternalBgDsl.g:1447:2: rule__Board__Group__14__Impl rule__Board__Group__15
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
    // InternalBgDsl.g:1454:1: rule__Board__Group__14__Impl : ( 'tileplacement' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1458:1: ( ( 'tileplacement' ) )
            // InternalBgDsl.g:1459:1: ( 'tileplacement' )
            {
            // InternalBgDsl.g:1459:1: ( 'tileplacement' )
            // InternalBgDsl.g:1460:2: 'tileplacement'
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
    // InternalBgDsl.g:1469:1: rule__Board__Group__15 : rule__Board__Group__15__Impl rule__Board__Group__16 ;
    public final void rule__Board__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1473:1: ( rule__Board__Group__15__Impl rule__Board__Group__16 )
            // InternalBgDsl.g:1474:2: rule__Board__Group__15__Impl rule__Board__Group__16
            {
            pushFollow(FOLLOW_22);
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
    // InternalBgDsl.g:1481:1: rule__Board__Group__15__Impl : ( '{' ) ;
    public final void rule__Board__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1485:1: ( ( '{' ) )
            // InternalBgDsl.g:1486:1: ( '{' )
            {
            // InternalBgDsl.g:1486:1: ( '{' )
            // InternalBgDsl.g:1487:2: '{'
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
    // InternalBgDsl.g:1496:1: rule__Board__Group__16 : rule__Board__Group__16__Impl rule__Board__Group__17 ;
    public final void rule__Board__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1500:1: ( rule__Board__Group__16__Impl rule__Board__Group__17 )
            // InternalBgDsl.g:1501:2: rule__Board__Group__16__Impl rule__Board__Group__17
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:1508:1: rule__Board__Group__16__Impl : ( ( rule__Board__TileplacementAssignment_16 ) ) ;
    public final void rule__Board__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1512:1: ( ( ( rule__Board__TileplacementAssignment_16 ) ) )
            // InternalBgDsl.g:1513:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            {
            // InternalBgDsl.g:1513:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            // InternalBgDsl.g:1514:2: ( rule__Board__TileplacementAssignment_16 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_16()); 
            // InternalBgDsl.g:1515:2: ( rule__Board__TileplacementAssignment_16 )
            // InternalBgDsl.g:1515:3: rule__Board__TileplacementAssignment_16
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
    // InternalBgDsl.g:1523:1: rule__Board__Group__17 : rule__Board__Group__17__Impl rule__Board__Group__18 ;
    public final void rule__Board__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1527:1: ( rule__Board__Group__17__Impl rule__Board__Group__18 )
            // InternalBgDsl.g:1528:2: rule__Board__Group__17__Impl rule__Board__Group__18
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:1535:1: rule__Board__Group__17__Impl : ( ( rule__Board__Group_17__0 )* ) ;
    public final void rule__Board__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1539:1: ( ( ( rule__Board__Group_17__0 )* ) )
            // InternalBgDsl.g:1540:1: ( ( rule__Board__Group_17__0 )* )
            {
            // InternalBgDsl.g:1540:1: ( ( rule__Board__Group_17__0 )* )
            // InternalBgDsl.g:1541:2: ( rule__Board__Group_17__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_17()); 
            // InternalBgDsl.g:1542:2: ( rule__Board__Group_17__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBgDsl.g:1542:3: rule__Board__Group_17__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Board__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBgDsl.g:1550:1: rule__Board__Group__18 : rule__Board__Group__18__Impl rule__Board__Group__19 ;
    public final void rule__Board__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1554:1: ( rule__Board__Group__18__Impl rule__Board__Group__19 )
            // InternalBgDsl.g:1555:2: rule__Board__Group__18__Impl rule__Board__Group__19
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1562:1: rule__Board__Group__18__Impl : ( '}' ) ;
    public final void rule__Board__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1566:1: ( ( '}' ) )
            // InternalBgDsl.g:1567:1: ( '}' )
            {
            // InternalBgDsl.g:1567:1: ( '}' )
            // InternalBgDsl.g:1568:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1577:1: rule__Board__Group__19 : rule__Board__Group__19__Impl ;
    public final void rule__Board__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1581:1: ( rule__Board__Group__19__Impl )
            // InternalBgDsl.g:1582:2: rule__Board__Group__19__Impl
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
    // InternalBgDsl.g:1588:1: rule__Board__Group__19__Impl : ( '}' ) ;
    public final void rule__Board__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1592:1: ( ( '}' ) )
            // InternalBgDsl.g:1593:1: ( '}' )
            {
            // InternalBgDsl.g:1593:1: ( '}' )
            // InternalBgDsl.g:1594:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:1604:1: rule__Board__Group_10__0 : rule__Board__Group_10__0__Impl rule__Board__Group_10__1 ;
    public final void rule__Board__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1608:1: ( rule__Board__Group_10__0__Impl rule__Board__Group_10__1 )
            // InternalBgDsl.g:1609:2: rule__Board__Group_10__0__Impl rule__Board__Group_10__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBgDsl.g:1616:1: rule__Board__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1620:1: ( ( ',' ) )
            // InternalBgDsl.g:1621:1: ( ',' )
            {
            // InternalBgDsl.g:1621:1: ( ',' )
            // InternalBgDsl.g:1622:2: ','
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
    // InternalBgDsl.g:1631:1: rule__Board__Group_10__1 : rule__Board__Group_10__1__Impl ;
    public final void rule__Board__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1635:1: ( rule__Board__Group_10__1__Impl )
            // InternalBgDsl.g:1636:2: rule__Board__Group_10__1__Impl
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
    // InternalBgDsl.g:1642:1: rule__Board__Group_10__1__Impl : ( ( rule__Board__TilesAssignment_10_1 ) ) ;
    public final void rule__Board__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1646:1: ( ( ( rule__Board__TilesAssignment_10_1 ) ) )
            // InternalBgDsl.g:1647:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:1647:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            // InternalBgDsl.g:1648:2: ( rule__Board__TilesAssignment_10_1 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 
            // InternalBgDsl.g:1649:2: ( rule__Board__TilesAssignment_10_1 )
            // InternalBgDsl.g:1649:3: rule__Board__TilesAssignment_10_1
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
    // InternalBgDsl.g:1658:1: rule__Board__Group_12__0 : rule__Board__Group_12__0__Impl rule__Board__Group_12__1 ;
    public final void rule__Board__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1662:1: ( rule__Board__Group_12__0__Impl rule__Board__Group_12__1 )
            // InternalBgDsl.g:1663:2: rule__Board__Group_12__0__Impl rule__Board__Group_12__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBgDsl.g:1670:1: rule__Board__Group_12__0__Impl : ( 'legalMovesPipeline' ) ;
    public final void rule__Board__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1674:1: ( ( 'legalMovesPipeline' ) )
            // InternalBgDsl.g:1675:1: ( 'legalMovesPipeline' )
            {
            // InternalBgDsl.g:1675:1: ( 'legalMovesPipeline' )
            // InternalBgDsl.g:1676:2: 'legalMovesPipeline'
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
    // InternalBgDsl.g:1685:1: rule__Board__Group_12__1 : rule__Board__Group_12__1__Impl ;
    public final void rule__Board__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1689:1: ( rule__Board__Group_12__1__Impl )
            // InternalBgDsl.g:1690:2: rule__Board__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_12__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:1696:1: rule__Board__Group_12__1__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) ) ;
    public final void rule__Board__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1700:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) ) )
            // InternalBgDsl.g:1701:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) )
            {
            // InternalBgDsl.g:1701:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) )
            // InternalBgDsl.g:1702:2: ( rule__Board__LegalMovesPipelineAssignment_12_1 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_1()); 
            // InternalBgDsl.g:1703:2: ( rule__Board__LegalMovesPipelineAssignment_12_1 )
            // InternalBgDsl.g:1703:3: rule__Board__LegalMovesPipelineAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__LegalMovesPipelineAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Board__Group_13__0"
    // InternalBgDsl.g:1712:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1716:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBgDsl.g:1717:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBgDsl.g:1724:1: rule__Board__Group_13__0__Impl : ( 'effectPipeline' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1728:1: ( ( 'effectPipeline' ) )
            // InternalBgDsl.g:1729:1: ( 'effectPipeline' )
            {
            // InternalBgDsl.g:1729:1: ( 'effectPipeline' )
            // InternalBgDsl.g:1730:2: 'effectPipeline'
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
    // InternalBgDsl.g:1739:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1743:1: ( rule__Board__Group_13__1__Impl )
            // InternalBgDsl.g:1744:2: rule__Board__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_13__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:1750:1: rule__Board__Group_13__1__Impl : ( ( rule__Board__EffectPipelineAssignment_13_1 ) ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1754:1: ( ( ( rule__Board__EffectPipelineAssignment_13_1 ) ) )
            // InternalBgDsl.g:1755:1: ( ( rule__Board__EffectPipelineAssignment_13_1 ) )
            {
            // InternalBgDsl.g:1755:1: ( ( rule__Board__EffectPipelineAssignment_13_1 ) )
            // InternalBgDsl.g:1756:2: ( rule__Board__EffectPipelineAssignment_13_1 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_1()); 
            // InternalBgDsl.g:1757:2: ( rule__Board__EffectPipelineAssignment_13_1 )
            // InternalBgDsl.g:1757:3: rule__Board__EffectPipelineAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__EffectPipelineAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Board__Group_17__0"
    // InternalBgDsl.g:1766:1: rule__Board__Group_17__0 : rule__Board__Group_17__0__Impl rule__Board__Group_17__1 ;
    public final void rule__Board__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1770:1: ( rule__Board__Group_17__0__Impl rule__Board__Group_17__1 )
            // InternalBgDsl.g:1771:2: rule__Board__Group_17__0__Impl rule__Board__Group_17__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBgDsl.g:1778:1: rule__Board__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1782:1: ( ( ',' ) )
            // InternalBgDsl.g:1783:1: ( ',' )
            {
            // InternalBgDsl.g:1783:1: ( ',' )
            // InternalBgDsl.g:1784:2: ','
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
    // InternalBgDsl.g:1793:1: rule__Board__Group_17__1 : rule__Board__Group_17__1__Impl ;
    public final void rule__Board__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1797:1: ( rule__Board__Group_17__1__Impl )
            // InternalBgDsl.g:1798:2: rule__Board__Group_17__1__Impl
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
    // InternalBgDsl.g:1804:1: rule__Board__Group_17__1__Impl : ( ( rule__Board__TileplacementAssignment_17_1 ) ) ;
    public final void rule__Board__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1808:1: ( ( ( rule__Board__TileplacementAssignment_17_1 ) ) )
            // InternalBgDsl.g:1809:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            {
            // InternalBgDsl.g:1809:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            // InternalBgDsl.g:1810:2: ( rule__Board__TileplacementAssignment_17_1 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_17_1()); 
            // InternalBgDsl.g:1811:2: ( rule__Board__TileplacementAssignment_17_1 )
            // InternalBgDsl.g:1811:3: rule__Board__TileplacementAssignment_17_1
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
    // InternalBgDsl.g:1820:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1824:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalBgDsl.g:1825:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalBgDsl.g:1832:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1836:1: ( ( 'Player' ) )
            // InternalBgDsl.g:1837:1: ( 'Player' )
            {
            // InternalBgDsl.g:1837:1: ( 'Player' )
            // InternalBgDsl.g:1838:2: 'Player'
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
    // InternalBgDsl.g:1847:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1851:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalBgDsl.g:1852:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalBgDsl.g:1859:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1863:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalBgDsl.g:1864:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:1864:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalBgDsl.g:1865:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:1866:2: ( rule__Player__NameAssignment_1 )
            // InternalBgDsl.g:1866:3: rule__Player__NameAssignment_1
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
    // InternalBgDsl.g:1874:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1878:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalBgDsl.g:1879:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBgDsl.g:1886:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1890:1: ( ( '{' ) )
            // InternalBgDsl.g:1891:1: ( '{' )
            {
            // InternalBgDsl.g:1891:1: ( '{' )
            // InternalBgDsl.g:1892:2: '{'
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
    // InternalBgDsl.g:1901:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1905:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalBgDsl.g:1906:2: rule__Player__Group__3__Impl rule__Player__Group__4
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
    // InternalBgDsl.g:1913:1: rule__Player__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1917:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:1918:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:1918:1: ( 'hexColor' )
            // InternalBgDsl.g:1919:2: 'hexColor'
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
    // InternalBgDsl.g:1928:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1932:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalBgDsl.g:1933:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:1940:1: rule__Player__Group__4__Impl : ( ( rule__Player__HexColorAssignment_4 ) ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1944:1: ( ( ( rule__Player__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:1945:1: ( ( rule__Player__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:1945:1: ( ( rule__Player__HexColorAssignment_4 ) )
            // InternalBgDsl.g:1946:2: ( rule__Player__HexColorAssignment_4 )
            {
             before(grammarAccess.getPlayerAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:1947:2: ( rule__Player__HexColorAssignment_4 )
            // InternalBgDsl.g:1947:3: rule__Player__HexColorAssignment_4
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
    // InternalBgDsl.g:1955:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1959:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalBgDsl.g:1960:2: rule__Player__Group__5__Impl rule__Player__Group__6
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
    // InternalBgDsl.g:1967:1: rule__Player__Group__5__Impl : ( 'associatedState' ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1971:1: ( ( 'associatedState' ) )
            // InternalBgDsl.g:1972:1: ( 'associatedState' )
            {
            // InternalBgDsl.g:1972:1: ( 'associatedState' )
            // InternalBgDsl.g:1973:2: 'associatedState'
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
    // InternalBgDsl.g:1982:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1986:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalBgDsl.g:1987:2: rule__Player__Group__6__Impl rule__Player__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:1994:1: rule__Player__Group__6__Impl : ( ( rule__Player__AssociatedStateAssignment_6 ) ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1998:1: ( ( ( rule__Player__AssociatedStateAssignment_6 ) ) )
            // InternalBgDsl.g:1999:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            {
            // InternalBgDsl.g:1999:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            // InternalBgDsl.g:2000:2: ( rule__Player__AssociatedStateAssignment_6 )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateAssignment_6()); 
            // InternalBgDsl.g:2001:2: ( rule__Player__AssociatedStateAssignment_6 )
            // InternalBgDsl.g:2001:3: rule__Player__AssociatedStateAssignment_6
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
    // InternalBgDsl.g:2009:1: rule__Player__Group__7 : rule__Player__Group__7__Impl ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2013:1: ( rule__Player__Group__7__Impl )
            // InternalBgDsl.g:2014:2: rule__Player__Group__7__Impl
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
    // InternalBgDsl.g:2020:1: rule__Player__Group__7__Impl : ( '}' ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2024:1: ( ( '}' ) )
            // InternalBgDsl.g:2025:1: ( '}' )
            {
            // InternalBgDsl.g:2025:1: ( '}' )
            // InternalBgDsl.g:2026:2: '}'
            {
             before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBgDsl.g:2036:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2040:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBgDsl.g:2041:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:2048:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2052:1: ( ( ( '-' )? ) )
            // InternalBgDsl.g:2053:1: ( ( '-' )? )
            {
            // InternalBgDsl.g:2053:1: ( ( '-' )? )
            // InternalBgDsl.g:2054:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBgDsl.g:2055:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBgDsl.g:2055:3: '-'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalBgDsl.g:2063:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2067:1: ( rule__EInt__Group__1__Impl )
            // InternalBgDsl.g:2068:2: rule__EInt__Group__1__Impl
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
    // InternalBgDsl.g:2074:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2078:1: ( ( RULE_INT ) )
            // InternalBgDsl.g:2079:1: ( RULE_INT )
            {
            // InternalBgDsl.g:2079:1: ( RULE_INT )
            // InternalBgDsl.g:2080:2: RULE_INT
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
    // InternalBgDsl.g:2090:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2094:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalBgDsl.g:2095:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
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
    // InternalBgDsl.g:2102:1: rule__Tile__Group__0__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2106:1: ( ( 'Tile' ) )
            // InternalBgDsl.g:2107:1: ( 'Tile' )
            {
            // InternalBgDsl.g:2107:1: ( 'Tile' )
            // InternalBgDsl.g:2108:2: 'Tile'
            {
             before(grammarAccess.getTileAccess().getTileKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBgDsl.g:2117:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2121:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalBgDsl.g:2122:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
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
    // InternalBgDsl.g:2106:1: rule__Tile__Group__1__Impl : ( ( rule__Tile__TileTypeAssignment_1 ) ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2110:1: ( ( ( rule__Tile__TileTypeAssignment_1 ) ) )
            // InternalBgDsl.g:2111:1: ( ( rule__Tile__TileTypeAssignment_1 ) )
            {
            // InternalBgDsl.g:2111:1: ( ( rule__Tile__TileTypeAssignment_1 ) )
            // InternalBgDsl.g:2112:2: ( rule__Tile__TileTypeAssignment_1 )
            {
             before(grammarAccess.getTileAccess().getTileTypeAssignment_1()); 
            // InternalBgDsl.g:2113:2: ( rule__Tile__TileTypeAssignment_1 )
            // InternalBgDsl.g:2113:3: rule__Tile__TileTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TileTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTileTypeAssignment_1()); 

            }


            }

        }
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
    // InternalBgDsl.g:2144:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2148:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalBgDsl.g:2149:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBgDsl.g:2156:1: rule__Tile__Group__2__Impl : ( '{' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2160:1: ( ( '{' ) )
            // InternalBgDsl.g:2161:1: ( '{' )
            {
            // InternalBgDsl.g:2161:1: ( '{' )
            // InternalBgDsl.g:2162:2: '{'
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
    // InternalBgDsl.g:2171:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2175:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalBgDsl.g:2176:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
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
    // InternalBgDsl.g:2183:1: rule__Tile__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2187:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2188:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2188:1: ( 'hexColor' )
            // InternalBgDsl.g:2189:2: 'hexColor'
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
    // InternalBgDsl.g:2198:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2202:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalBgDsl.g:2203:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
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
    // InternalBgDsl.g:2210:1: rule__Tile__Group__4__Impl : ( ( rule__Tile__HexColorAssignment_4 ) ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2214:1: ( ( ( rule__Tile__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2215:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2215:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2216:2: ( rule__Tile__HexColorAssignment_4 )
            {
             before(grammarAccess.getTileAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2217:2: ( rule__Tile__HexColorAssignment_4 )
            // InternalBgDsl.g:2217:3: rule__Tile__HexColorAssignment_4
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
    // InternalBgDsl.g:2225:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2229:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalBgDsl.g:2230:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
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
    // InternalBgDsl.g:2237:1: rule__Tile__Group__5__Impl : ( 'name' ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2241:1: ( ( 'name' ) )
            // InternalBgDsl.g:2242:1: ( 'name' )
            {
            // InternalBgDsl.g:2242:1: ( 'name' )
            // InternalBgDsl.g:2243:2: 'name'
            {
             before(grammarAccess.getTileAccess().getNameKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBgDsl.g:2252:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2256:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalBgDsl.g:2257:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
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
    // InternalBgDsl.g:2264:1: rule__Tile__Group__6__Impl : ( ( rule__Tile__NameAssignment_6 ) ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2268:1: ( ( ( rule__Tile__NameAssignment_6 ) ) )
            // InternalBgDsl.g:2269:1: ( ( rule__Tile__NameAssignment_6 ) )
            {
            // InternalBgDsl.g:2269:1: ( ( rule__Tile__NameAssignment_6 ) )
            // InternalBgDsl.g:2270:2: ( rule__Tile__NameAssignment_6 )
            {
             before(grammarAccess.getTileAccess().getNameAssignment_6()); 
            // InternalBgDsl.g:2271:2: ( rule__Tile__NameAssignment_6 )
            // InternalBgDsl.g:2271:3: rule__Tile__NameAssignment_6
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
    // InternalBgDsl.g:2279:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2283:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalBgDsl.g:2284:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
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
    // InternalBgDsl.g:2291:1: rule__Tile__Group__7__Impl : ( 'states' ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2295:1: ( ( 'states' ) )
            // InternalBgDsl.g:2296:1: ( 'states' )
            {
            // InternalBgDsl.g:2296:1: ( 'states' )
            // InternalBgDsl.g:2297:2: 'states'
            {
             before(grammarAccess.getTileAccess().getStatesKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBgDsl.g:2306:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2310:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalBgDsl.g:2311:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
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
    // InternalBgDsl.g:2318:1: rule__Tile__Group__8__Impl : ( '{' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2322:1: ( ( '{' ) )
            // InternalBgDsl.g:2323:1: ( '{' )
            {
            // InternalBgDsl.g:2323:1: ( '{' )
            // InternalBgDsl.g:2324:2: '{'
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
    // InternalBgDsl.g:2333:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2337:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalBgDsl.g:2338:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:2345:1: rule__Tile__Group__9__Impl : ( ( rule__Tile__StatesAssignment_9 ) ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2349:1: ( ( ( rule__Tile__StatesAssignment_9 ) ) )
            // InternalBgDsl.g:2350:1: ( ( rule__Tile__StatesAssignment_9 ) )
            {
            // InternalBgDsl.g:2350:1: ( ( rule__Tile__StatesAssignment_9 ) )
            // InternalBgDsl.g:2351:2: ( rule__Tile__StatesAssignment_9 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_9()); 
            // InternalBgDsl.g:2352:2: ( rule__Tile__StatesAssignment_9 )
            // InternalBgDsl.g:2352:3: rule__Tile__StatesAssignment_9
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
    // InternalBgDsl.g:2360:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2364:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalBgDsl.g:2365:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:2372:1: rule__Tile__Group__10__Impl : ( ( rule__Tile__Group_10__0 )* ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2376:1: ( ( ( rule__Tile__Group_10__0 )* ) )
            // InternalBgDsl.g:2377:1: ( ( rule__Tile__Group_10__0 )* )
            {
            // InternalBgDsl.g:2377:1: ( ( rule__Tile__Group_10__0 )* )
            // InternalBgDsl.g:2378:2: ( rule__Tile__Group_10__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_10()); 
            // InternalBgDsl.g:2379:2: ( rule__Tile__Group_10__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBgDsl.g:2379:3: rule__Tile__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tile__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBgDsl.g:2387:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2391:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalBgDsl.g:2392:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
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
    // InternalBgDsl.g:2399:1: rule__Tile__Group__11__Impl : ( '}' ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2403:1: ( ( '}' ) )
            // InternalBgDsl.g:2404:1: ( '}' )
            {
            // InternalBgDsl.g:2404:1: ( '}' )
            // InternalBgDsl.g:2405:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_11()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:2414:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl rule__Tile__Group__13 ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2418:1: ( rule__Tile__Group__12__Impl rule__Tile__Group__13 )
            // InternalBgDsl.g:2419:2: rule__Tile__Group__12__Impl rule__Tile__Group__13
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
    // InternalBgDsl.g:2426:1: rule__Tile__Group__12__Impl : ( ( rule__Tile__Group_12__0 )? ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2430:1: ( ( ( rule__Tile__Group_12__0 )? ) )
            // InternalBgDsl.g:2431:1: ( ( rule__Tile__Group_12__0 )? )
            {
            // InternalBgDsl.g:2431:1: ( ( rule__Tile__Group_12__0 )? )
            // InternalBgDsl.g:2432:2: ( rule__Tile__Group_12__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_12()); 
            // InternalBgDsl.g:2433:2: ( rule__Tile__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBgDsl.g:2433:3: rule__Tile__Group_12__0
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
    // InternalBgDsl.g:2441:1: rule__Tile__Group__13 : rule__Tile__Group__13__Impl rule__Tile__Group__14 ;
    public final void rule__Tile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2445:1: ( rule__Tile__Group__13__Impl rule__Tile__Group__14 )
            // InternalBgDsl.g:2446:2: rule__Tile__Group__13__Impl rule__Tile__Group__14
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
    // InternalBgDsl.g:2453:1: rule__Tile__Group__13__Impl : ( 'initialState' ) ;
    public final void rule__Tile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2457:1: ( ( 'initialState' ) )
            // InternalBgDsl.g:2458:1: ( 'initialState' )
            {
            // InternalBgDsl.g:2458:1: ( 'initialState' )
            // InternalBgDsl.g:2459:2: 'initialState'
            {
             before(grammarAccess.getTileAccess().getInitialStateKeyword_13()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBgDsl.g:2468:1: rule__Tile__Group__14 : rule__Tile__Group__14__Impl rule__Tile__Group__15 ;
    public final void rule__Tile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2472:1: ( rule__Tile__Group__14__Impl rule__Tile__Group__15 )
            // InternalBgDsl.g:2473:2: rule__Tile__Group__14__Impl rule__Tile__Group__15
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:2480:1: rule__Tile__Group__14__Impl : ( ( rule__Tile__InitialStateAssignment_14 ) ) ;
    public final void rule__Tile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2484:1: ( ( ( rule__Tile__InitialStateAssignment_14 ) ) )
            // InternalBgDsl.g:2485:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            {
            // InternalBgDsl.g:2485:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            // InternalBgDsl.g:2486:2: ( rule__Tile__InitialStateAssignment_14 )
            {
             before(grammarAccess.getTileAccess().getInitialStateAssignment_14()); 
            // InternalBgDsl.g:2487:2: ( rule__Tile__InitialStateAssignment_14 )
            // InternalBgDsl.g:2487:3: rule__Tile__InitialStateAssignment_14
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
    // InternalBgDsl.g:2495:1: rule__Tile__Group__15 : rule__Tile__Group__15__Impl ;
    public final void rule__Tile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2499:1: ( rule__Tile__Group__15__Impl )
            // InternalBgDsl.g:2500:2: rule__Tile__Group__15__Impl
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
    // InternalBgDsl.g:2506:1: rule__Tile__Group__15__Impl : ( '}' ) ;
    public final void rule__Tile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2510:1: ( ( '}' ) )
            // InternalBgDsl.g:2511:1: ( '}' )
            {
            // InternalBgDsl.g:2511:1: ( '}' )
            // InternalBgDsl.g:2512:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_15()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:2522:1: rule__Tile__Group_10__0 : rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 ;
    public final void rule__Tile__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2526:1: ( rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 )
            // InternalBgDsl.g:2527:2: rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1
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
    // InternalBgDsl.g:2534:1: rule__Tile__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2538:1: ( ( ',' ) )
            // InternalBgDsl.g:2539:1: ( ',' )
            {
            // InternalBgDsl.g:2539:1: ( ',' )
            // InternalBgDsl.g:2540:2: ','
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
    // InternalBgDsl.g:2549:1: rule__Tile__Group_10__1 : rule__Tile__Group_10__1__Impl ;
    public final void rule__Tile__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2553:1: ( rule__Tile__Group_10__1__Impl )
            // InternalBgDsl.g:2554:2: rule__Tile__Group_10__1__Impl
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
    // InternalBgDsl.g:2560:1: rule__Tile__Group_10__1__Impl : ( ( rule__Tile__StatesAssignment_10_1 ) ) ;
    public final void rule__Tile__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2564:1: ( ( ( rule__Tile__StatesAssignment_10_1 ) ) )
            // InternalBgDsl.g:2565:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:2565:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            // InternalBgDsl.g:2566:2: ( rule__Tile__StatesAssignment_10_1 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_10_1()); 
            // InternalBgDsl.g:2567:2: ( rule__Tile__StatesAssignment_10_1 )
            // InternalBgDsl.g:2567:3: rule__Tile__StatesAssignment_10_1
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
    // InternalBgDsl.g:2576:1: rule__Tile__Group_12__0 : rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 ;
    public final void rule__Tile__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2580:1: ( rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 )
            // InternalBgDsl.g:2581:2: rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1
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
    // InternalBgDsl.g:2588:1: rule__Tile__Group_12__0__Impl : ( 'transitions' ) ;
    public final void rule__Tile__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2592:1: ( ( 'transitions' ) )
            // InternalBgDsl.g:2593:1: ( 'transitions' )
            {
            // InternalBgDsl.g:2593:1: ( 'transitions' )
            // InternalBgDsl.g:2594:2: 'transitions'
            {
             before(grammarAccess.getTileAccess().getTransitionsKeyword_12_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBgDsl.g:2603:1: rule__Tile__Group_12__1 : rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 ;
    public final void rule__Tile__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2607:1: ( rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 )
            // InternalBgDsl.g:2608:2: rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2
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
    // InternalBgDsl.g:2615:1: rule__Tile__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2619:1: ( ( '{' ) )
            // InternalBgDsl.g:2620:1: ( '{' )
            {
            // InternalBgDsl.g:2620:1: ( '{' )
            // InternalBgDsl.g:2621:2: '{'
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
    // InternalBgDsl.g:2630:1: rule__Tile__Group_12__2 : rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 ;
    public final void rule__Tile__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2634:1: ( rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 )
            // InternalBgDsl.g:2635:2: rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:2642:1: rule__Tile__Group_12__2__Impl : ( ( rule__Tile__TransitionsAssignment_12_2 ) ) ;
    public final void rule__Tile__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2646:1: ( ( ( rule__Tile__TransitionsAssignment_12_2 ) ) )
            // InternalBgDsl.g:2647:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            {
            // InternalBgDsl.g:2647:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            // InternalBgDsl.g:2648:2: ( rule__Tile__TransitionsAssignment_12_2 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_2()); 
            // InternalBgDsl.g:2649:2: ( rule__Tile__TransitionsAssignment_12_2 )
            // InternalBgDsl.g:2649:3: rule__Tile__TransitionsAssignment_12_2
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
    // InternalBgDsl.g:2657:1: rule__Tile__Group_12__3 : rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 ;
    public final void rule__Tile__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2661:1: ( rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 )
            // InternalBgDsl.g:2662:2: rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:2669:1: rule__Tile__Group_12__3__Impl : ( ( rule__Tile__Group_12_3__0 )* ) ;
    public final void rule__Tile__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2673:1: ( ( ( rule__Tile__Group_12_3__0 )* ) )
            // InternalBgDsl.g:2674:1: ( ( rule__Tile__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:2674:1: ( ( rule__Tile__Group_12_3__0 )* )
            // InternalBgDsl.g:2675:2: ( rule__Tile__Group_12_3__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_12_3()); 
            // InternalBgDsl.g:2676:2: ( rule__Tile__Group_12_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBgDsl.g:2676:3: rule__Tile__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tile__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalBgDsl.g:2684:1: rule__Tile__Group_12__4 : rule__Tile__Group_12__4__Impl ;
    public final void rule__Tile__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2688:1: ( rule__Tile__Group_12__4__Impl )
            // InternalBgDsl.g:2689:2: rule__Tile__Group_12__4__Impl
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
    // InternalBgDsl.g:2695:1: rule__Tile__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Tile__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2699:1: ( ( '}' ) )
            // InternalBgDsl.g:2700:1: ( '}' )
            {
            // InternalBgDsl.g:2700:1: ( '}' )
            // InternalBgDsl.g:2701:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:2711:1: rule__Tile__Group_12_3__0 : rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 ;
    public final void rule__Tile__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2715:1: ( rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 )
            // InternalBgDsl.g:2716:2: rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1
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
    // InternalBgDsl.g:2723:1: rule__Tile__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2727:1: ( ( ',' ) )
            // InternalBgDsl.g:2728:1: ( ',' )
            {
            // InternalBgDsl.g:2728:1: ( ',' )
            // InternalBgDsl.g:2729:2: ','
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
    // InternalBgDsl.g:2738:1: rule__Tile__Group_12_3__1 : rule__Tile__Group_12_3__1__Impl ;
    public final void rule__Tile__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2742:1: ( rule__Tile__Group_12_3__1__Impl )
            // InternalBgDsl.g:2743:2: rule__Tile__Group_12_3__1__Impl
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
    // InternalBgDsl.g:2749:1: rule__Tile__Group_12_3__1__Impl : ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) ;
    public final void rule__Tile__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2753:1: ( ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:2754:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:2754:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            // InternalBgDsl.g:2755:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_3_1()); 
            // InternalBgDsl.g:2756:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            // InternalBgDsl.g:2756:3: rule__Tile__TransitionsAssignment_12_3_1
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
    // InternalBgDsl.g:2765:1: rule__LegalMovesPipeline__Group__0 : rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 ;
    public final void rule__LegalMovesPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2769:1: ( rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 )
            // InternalBgDsl.g:2770:2: rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBgDsl.g:2777:1: rule__LegalMovesPipeline__Group__0__Impl : ( () ) ;
    public final void rule__LegalMovesPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2781:1: ( ( () ) )
            // InternalBgDsl.g:2782:1: ( () )
            {
            // InternalBgDsl.g:2782:1: ( () )
            // InternalBgDsl.g:2783:2: ()
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 
            // InternalBgDsl.g:2784:2: ()
            // InternalBgDsl.g:2784:3: 
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
    // InternalBgDsl.g:2792:1: rule__LegalMovesPipeline__Group__1 : rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 ;
    public final void rule__LegalMovesPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2796:1: ( rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 )
            // InternalBgDsl.g:2797:2: rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2
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
    // InternalBgDsl.g:2804:1: rule__LegalMovesPipeline__Group__1__Impl : ( 'LegalMovesPipeline' ) ;
    public final void rule__LegalMovesPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2808:1: ( ( 'LegalMovesPipeline' ) )
            // InternalBgDsl.g:2809:1: ( 'LegalMovesPipeline' )
            {
            // InternalBgDsl.g:2809:1: ( 'LegalMovesPipeline' )
            // InternalBgDsl.g:2810:2: 'LegalMovesPipeline'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBgDsl.g:2819:1: rule__LegalMovesPipeline__Group__2 : rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 ;
    public final void rule__LegalMovesPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2823:1: ( rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 )
            // InternalBgDsl.g:2824:2: rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3
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
    // InternalBgDsl.g:2831:1: rule__LegalMovesPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2835:1: ( ( '{' ) )
            // InternalBgDsl.g:2836:1: ( '{' )
            {
            // InternalBgDsl.g:2836:1: ( '{' )
            // InternalBgDsl.g:2837:2: '{'
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
    // InternalBgDsl.g:2846:1: rule__LegalMovesPipeline__Group__3 : rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 ;
    public final void rule__LegalMovesPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2850:1: ( rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 )
            // InternalBgDsl.g:2851:2: rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4
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
    // InternalBgDsl.g:2858:1: rule__LegalMovesPipeline__Group__3__Impl : ( ( rule__LegalMovesPipeline__Group_3__0 )? ) ;
    public final void rule__LegalMovesPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2862:1: ( ( ( rule__LegalMovesPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:2863:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:2863:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            // InternalBgDsl.g:2864:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:2865:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBgDsl.g:2865:3: rule__LegalMovesPipeline__Group_3__0
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
    // InternalBgDsl.g:2873:1: rule__LegalMovesPipeline__Group__4 : rule__LegalMovesPipeline__Group__4__Impl ;
    public final void rule__LegalMovesPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2877:1: ( rule__LegalMovesPipeline__Group__4__Impl )
            // InternalBgDsl.g:2878:2: rule__LegalMovesPipeline__Group__4__Impl
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
    // InternalBgDsl.g:2884:1: rule__LegalMovesPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2888:1: ( ( '}' ) )
            // InternalBgDsl.g:2889:1: ( '}' )
            {
            // InternalBgDsl.g:2889:1: ( '}' )
            // InternalBgDsl.g:2890:2: '}'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:2900:1: rule__LegalMovesPipeline__Group_3__0 : rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2904:1: ( rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 )
            // InternalBgDsl.g:2905:2: rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:2912:1: rule__LegalMovesPipeline__Group_3__0__Impl : ( 'filters' ) ;
    public final void rule__LegalMovesPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2916:1: ( ( 'filters' ) )
            // InternalBgDsl.g:2917:1: ( 'filters' )
            {
            // InternalBgDsl.g:2917:1: ( 'filters' )
            // InternalBgDsl.g:2918:2: 'filters'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFiltersKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getFiltersKeyword_3_0()); 

            }


            }

        }
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
    // InternalBgDsl.g:2927:1: rule__LegalMovesPipeline__Group_3__1 : rule__LegalMovesPipeline__Group_3__1__Impl rule__LegalMovesPipeline__Group_3__2 ;
    public final void rule__LegalMovesPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2931:1: ( rule__LegalMovesPipeline__Group_3__1__Impl rule__LegalMovesPipeline__Group_3__2 )
            // InternalBgDsl.g:2932:2: rule__LegalMovesPipeline__Group_3__1__Impl rule__LegalMovesPipeline__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__LegalMovesPipeline__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:2939:1: rule__LegalMovesPipeline__Group_3__1__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2943:1: ( ( '{' ) )
            // InternalBgDsl.g:2944:1: ( '{' )
            {
            // InternalBgDsl.g:2944:1: ( '{' )
            // InternalBgDsl.g:2945:2: '{'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__2"
    // InternalBgDsl.g:2954:1: rule__LegalMovesPipeline__Group_3__2 : rule__LegalMovesPipeline__Group_3__2__Impl rule__LegalMovesPipeline__Group_3__3 ;
    public final void rule__LegalMovesPipeline__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2958:1: ( rule__LegalMovesPipeline__Group_3__2__Impl rule__LegalMovesPipeline__Group_3__3 )
            // InternalBgDsl.g:2959:2: rule__LegalMovesPipeline__Group_3__2__Impl rule__LegalMovesPipeline__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__LegalMovesPipeline__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__2"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__2__Impl"
    // InternalBgDsl.g:2966:1: rule__LegalMovesPipeline__Group_3__2__Impl : ( ( rule__LegalMovesPipeline__FiltersAssignment_3_2 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2970:1: ( ( ( rule__LegalMovesPipeline__FiltersAssignment_3_2 ) ) )
            // InternalBgDsl.g:2971:1: ( ( rule__LegalMovesPipeline__FiltersAssignment_3_2 ) )
            {
            // InternalBgDsl.g:2971:1: ( ( rule__LegalMovesPipeline__FiltersAssignment_3_2 ) )
            // InternalBgDsl.g:2972:2: ( rule__LegalMovesPipeline__FiltersAssignment_3_2 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFiltersAssignment_3_2()); 
            // InternalBgDsl.g:2973:2: ( rule__LegalMovesPipeline__FiltersAssignment_3_2 )
            // InternalBgDsl.g:2973:3: rule__LegalMovesPipeline__FiltersAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__FiltersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLegalMovesPipelineAccess().getFiltersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__2__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__3"
    // InternalBgDsl.g:2981:1: rule__LegalMovesPipeline__Group_3__3 : rule__LegalMovesPipeline__Group_3__3__Impl rule__LegalMovesPipeline__Group_3__4 ;
    public final void rule__LegalMovesPipeline__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2985:1: ( rule__LegalMovesPipeline__Group_3__3__Impl rule__LegalMovesPipeline__Group_3__4 )
            // InternalBgDsl.g:2986:2: rule__LegalMovesPipeline__Group_3__3__Impl rule__LegalMovesPipeline__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__LegalMovesPipeline__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__3"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__3__Impl"
    // InternalBgDsl.g:2993:1: rule__LegalMovesPipeline__Group_3__3__Impl : ( ( rule__LegalMovesPipeline__Group_3_3__0 )* ) ;
    public final void rule__LegalMovesPipeline__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2997:1: ( ( ( rule__LegalMovesPipeline__Group_3_3__0 )* ) )
            // InternalBgDsl.g:2998:1: ( ( rule__LegalMovesPipeline__Group_3_3__0 )* )
            {
            // InternalBgDsl.g:2998:1: ( ( rule__LegalMovesPipeline__Group_3_3__0 )* )
            // InternalBgDsl.g:2999:2: ( rule__LegalMovesPipeline__Group_3_3__0 )*
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3_3()); 
            // InternalBgDsl.g:3000:2: ( rule__LegalMovesPipeline__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBgDsl.g:3000:3: rule__LegalMovesPipeline__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LegalMovesPipeline__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLegalMovesPipelineAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__3__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__4"
    // InternalBgDsl.g:3008:1: rule__LegalMovesPipeline__Group_3__4 : rule__LegalMovesPipeline__Group_3__4__Impl ;
    public final void rule__LegalMovesPipeline__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3012:1: ( rule__LegalMovesPipeline__Group_3__4__Impl )
            // InternalBgDsl.g:3013:2: rule__LegalMovesPipeline__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__4"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3__4__Impl"
    // InternalBgDsl.g:3019:1: rule__LegalMovesPipeline__Group_3__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3023:1: ( ( '}' ) )
            // InternalBgDsl.g:3024:1: ( '}' )
            {
            // InternalBgDsl.g:3024:1: ( '}' )
            // InternalBgDsl.g:3025:2: '}'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3__4__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3_3__0"
    // InternalBgDsl.g:3035:1: rule__LegalMovesPipeline__Group_3_3__0 : rule__LegalMovesPipeline__Group_3_3__0__Impl rule__LegalMovesPipeline__Group_3_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3039:1: ( rule__LegalMovesPipeline__Group_3_3__0__Impl rule__LegalMovesPipeline__Group_3_3__1 )
            // InternalBgDsl.g:3040:2: rule__LegalMovesPipeline__Group_3_3__0__Impl rule__LegalMovesPipeline__Group_3_3__1
            {
            pushFollow(FOLLOW_33);
            rule__LegalMovesPipeline__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3_3__0"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3_3__0__Impl"
    // InternalBgDsl.g:3047:1: rule__LegalMovesPipeline__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__LegalMovesPipeline__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3051:1: ( ( ',' ) )
            // InternalBgDsl.g:3052:1: ( ',' )
            {
            // InternalBgDsl.g:3052:1: ( ',' )
            // InternalBgDsl.g:3053:2: ','
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getCommaKeyword_3_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLegalMovesPipelineAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3_3__0__Impl"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3_3__1"
    // InternalBgDsl.g:3062:1: rule__LegalMovesPipeline__Group_3_3__1 : rule__LegalMovesPipeline__Group_3_3__1__Impl ;
    public final void rule__LegalMovesPipeline__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3066:1: ( rule__LegalMovesPipeline__Group_3_3__1__Impl )
            // InternalBgDsl.g:3067:2: rule__LegalMovesPipeline__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3_3__1"


    // $ANTLR start "rule__LegalMovesPipeline__Group_3_3__1__Impl"
    // InternalBgDsl.g:3073:1: rule__LegalMovesPipeline__Group_3_3__1__Impl : ( ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3077:1: ( ( ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 ) ) )
            // InternalBgDsl.g:3078:1: ( ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 ) )
            {
            // InternalBgDsl.g:3078:1: ( ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 ) )
            // InternalBgDsl.g:3079:2: ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFiltersAssignment_3_3_1()); 
            // InternalBgDsl.g:3080:2: ( rule__LegalMovesPipeline__FiltersAssignment_3_3_1 )
            // InternalBgDsl.g:3080:3: rule__LegalMovesPipeline__FiltersAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LegalMovesPipeline__FiltersAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLegalMovesPipelineAccess().getFiltersAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__Group_3_3__1__Impl"


    // $ANTLR start "rule__EffectPipeline__Group__0"
    // InternalBgDsl.g:3089:1: rule__EffectPipeline__Group__0 : rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 ;
    public final void rule__EffectPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3093:1: ( rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 )
            // InternalBgDsl.g:3094:2: rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBgDsl.g:3101:1: rule__EffectPipeline__Group__0__Impl : ( () ) ;
    public final void rule__EffectPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3105:1: ( ( () ) )
            // InternalBgDsl.g:3106:1: ( () )
            {
            // InternalBgDsl.g:3106:1: ( () )
            // InternalBgDsl.g:3107:2: ()
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 
            // InternalBgDsl.g:3108:2: ()
            // InternalBgDsl.g:3108:3: 
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
    // InternalBgDsl.g:3116:1: rule__EffectPipeline__Group__1 : rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 ;
    public final void rule__EffectPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3120:1: ( rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 )
            // InternalBgDsl.g:3121:2: rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2
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
    // InternalBgDsl.g:3128:1: rule__EffectPipeline__Group__1__Impl : ( 'EffectPipeline' ) ;
    public final void rule__EffectPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3132:1: ( ( 'EffectPipeline' ) )
            // InternalBgDsl.g:3133:1: ( 'EffectPipeline' )
            {
            // InternalBgDsl.g:3133:1: ( 'EffectPipeline' )
            // InternalBgDsl.g:3134:2: 'EffectPipeline'
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBgDsl.g:3143:1: rule__EffectPipeline__Group__2 : rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 ;
    public final void rule__EffectPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3147:1: ( rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 )
            // InternalBgDsl.g:3148:2: rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3
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
    // InternalBgDsl.g:3155:1: rule__EffectPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3159:1: ( ( '{' ) )
            // InternalBgDsl.g:3160:1: ( '{' )
            {
            // InternalBgDsl.g:3160:1: ( '{' )
            // InternalBgDsl.g:3161:2: '{'
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
    // InternalBgDsl.g:3170:1: rule__EffectPipeline__Group__3 : rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 ;
    public final void rule__EffectPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3174:1: ( rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 )
            // InternalBgDsl.g:3175:2: rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4
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
    // InternalBgDsl.g:3182:1: rule__EffectPipeline__Group__3__Impl : ( ( rule__EffectPipeline__Group_3__0 )? ) ;
    public final void rule__EffectPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3186:1: ( ( ( rule__EffectPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3187:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3187:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3188:2: ( rule__EffectPipeline__Group_3__0 )?
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3189:2: ( rule__EffectPipeline__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:3189:3: rule__EffectPipeline__Group_3__0
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
    // InternalBgDsl.g:3197:1: rule__EffectPipeline__Group__4 : rule__EffectPipeline__Group__4__Impl ;
    public final void rule__EffectPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3201:1: ( rule__EffectPipeline__Group__4__Impl )
            // InternalBgDsl.g:3202:2: rule__EffectPipeline__Group__4__Impl
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
    // InternalBgDsl.g:3208:1: rule__EffectPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3212:1: ( ( '}' ) )
            // InternalBgDsl.g:3213:1: ( '}' )
            {
            // InternalBgDsl.g:3213:1: ( '}' )
            // InternalBgDsl.g:3214:2: '}'
            {
             before(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:3224:1: rule__EffectPipeline__Group_3__0 : rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 ;
    public final void rule__EffectPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3228:1: ( rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 )
            // InternalBgDsl.g:3229:2: rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBgDsl.g:3236:1: rule__EffectPipeline__Group_3__0__Impl : ( 'filters' ) ;
    public final void rule__EffectPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3240:1: ( ( 'filters' ) )
            // InternalBgDsl.g:3241:1: ( 'filters' )
            {
            // InternalBgDsl.g:3241:1: ( 'filters' )
            // InternalBgDsl.g:3242:2: 'filters'
            {
             before(grammarAccess.getEffectPipelineAccess().getFiltersKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getFiltersKeyword_3_0()); 

            }


            }

        }
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
    // InternalBgDsl.g:3251:1: rule__EffectPipeline__Group_3__1 : rule__EffectPipeline__Group_3__1__Impl rule__EffectPipeline__Group_3__2 ;
    public final void rule__EffectPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3255:1: ( rule__EffectPipeline__Group_3__1__Impl rule__EffectPipeline__Group_3__2 )
            // InternalBgDsl.g:3256:2: rule__EffectPipeline__Group_3__1__Impl rule__EffectPipeline__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__EffectPipeline__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalBgDsl.g:3263:1: rule__EffectPipeline__Group_3__1__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3267:1: ( ( '{' ) )
            // InternalBgDsl.g:3268:1: ( '{' )
            {
            // InternalBgDsl.g:3268:1: ( '{' )
            // InternalBgDsl.g:3269:2: '{'
            {
             before(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectPipeline__Group_3__2"
    // InternalBgDsl.g:3278:1: rule__EffectPipeline__Group_3__2 : rule__EffectPipeline__Group_3__2__Impl rule__EffectPipeline__Group_3__3 ;
    public final void rule__EffectPipeline__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3282:1: ( rule__EffectPipeline__Group_3__2__Impl rule__EffectPipeline__Group_3__3 )
            // InternalBgDsl.g:3283:2: rule__EffectPipeline__Group_3__2__Impl rule__EffectPipeline__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__EffectPipeline__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__2"


    // $ANTLR start "rule__EffectPipeline__Group_3__2__Impl"
    // InternalBgDsl.g:3290:1: rule__EffectPipeline__Group_3__2__Impl : ( ( rule__EffectPipeline__FiltersAssignment_3_2 ) ) ;
    public final void rule__EffectPipeline__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3294:1: ( ( ( rule__EffectPipeline__FiltersAssignment_3_2 ) ) )
            // InternalBgDsl.g:3295:1: ( ( rule__EffectPipeline__FiltersAssignment_3_2 ) )
            {
            // InternalBgDsl.g:3295:1: ( ( rule__EffectPipeline__FiltersAssignment_3_2 ) )
            // InternalBgDsl.g:3296:2: ( rule__EffectPipeline__FiltersAssignment_3_2 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFiltersAssignment_3_2()); 
            // InternalBgDsl.g:3297:2: ( rule__EffectPipeline__FiltersAssignment_3_2 )
            // InternalBgDsl.g:3297:3: rule__EffectPipeline__FiltersAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__FiltersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectPipelineAccess().getFiltersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__2__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3__3"
    // InternalBgDsl.g:3305:1: rule__EffectPipeline__Group_3__3 : rule__EffectPipeline__Group_3__3__Impl rule__EffectPipeline__Group_3__4 ;
    public final void rule__EffectPipeline__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3309:1: ( rule__EffectPipeline__Group_3__3__Impl rule__EffectPipeline__Group_3__4 )
            // InternalBgDsl.g:3310:2: rule__EffectPipeline__Group_3__3__Impl rule__EffectPipeline__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__EffectPipeline__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__3"


    // $ANTLR start "rule__EffectPipeline__Group_3__3__Impl"
    // InternalBgDsl.g:3317:1: rule__EffectPipeline__Group_3__3__Impl : ( ( rule__EffectPipeline__Group_3_3__0 )* ) ;
    public final void rule__EffectPipeline__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3321:1: ( ( ( rule__EffectPipeline__Group_3_3__0 )* ) )
            // InternalBgDsl.g:3322:1: ( ( rule__EffectPipeline__Group_3_3__0 )* )
            {
            // InternalBgDsl.g:3322:1: ( ( rule__EffectPipeline__Group_3_3__0 )* )
            // InternalBgDsl.g:3323:2: ( rule__EffectPipeline__Group_3_3__0 )*
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3_3()); 
            // InternalBgDsl.g:3324:2: ( rule__EffectPipeline__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBgDsl.g:3324:3: rule__EffectPipeline__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EffectPipeline__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEffectPipelineAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__3__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3__4"
    // InternalBgDsl.g:3332:1: rule__EffectPipeline__Group_3__4 : rule__EffectPipeline__Group_3__4__Impl ;
    public final void rule__EffectPipeline__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3336:1: ( rule__EffectPipeline__Group_3__4__Impl )
            // InternalBgDsl.g:3337:2: rule__EffectPipeline__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__4"


    // $ANTLR start "rule__EffectPipeline__Group_3__4__Impl"
    // InternalBgDsl.g:3343:1: rule__EffectPipeline__Group_3__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3347:1: ( ( '}' ) )
            // InternalBgDsl.g:3348:1: ( '}' )
            {
            // InternalBgDsl.g:3348:1: ( '}' )
            // InternalBgDsl.g:3349:2: '}'
            {
             before(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3__4__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3_3__0"
    // InternalBgDsl.g:3359:1: rule__EffectPipeline__Group_3_3__0 : rule__EffectPipeline__Group_3_3__0__Impl rule__EffectPipeline__Group_3_3__1 ;
    public final void rule__EffectPipeline__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3363:1: ( rule__EffectPipeline__Group_3_3__0__Impl rule__EffectPipeline__Group_3_3__1 )
            // InternalBgDsl.g:3364:2: rule__EffectPipeline__Group_3_3__0__Impl rule__EffectPipeline__Group_3_3__1
            {
            pushFollow(FOLLOW_33);
            rule__EffectPipeline__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3_3__0"


    // $ANTLR start "rule__EffectPipeline__Group_3_3__0__Impl"
    // InternalBgDsl.g:3371:1: rule__EffectPipeline__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__EffectPipeline__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3375:1: ( ( ',' ) )
            // InternalBgDsl.g:3376:1: ( ',' )
            {
            // InternalBgDsl.g:3376:1: ( ',' )
            // InternalBgDsl.g:3377:2: ','
            {
             before(grammarAccess.getEffectPipelineAccess().getCommaKeyword_3_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEffectPipelineAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3_3__0__Impl"


    // $ANTLR start "rule__EffectPipeline__Group_3_3__1"
    // InternalBgDsl.g:3386:1: rule__EffectPipeline__Group_3_3__1 : rule__EffectPipeline__Group_3_3__1__Impl ;
    public final void rule__EffectPipeline__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3390:1: ( rule__EffectPipeline__Group_3_3__1__Impl )
            // InternalBgDsl.g:3391:2: rule__EffectPipeline__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3_3__1"


    // $ANTLR start "rule__EffectPipeline__Group_3_3__1__Impl"
    // InternalBgDsl.g:3397:1: rule__EffectPipeline__Group_3_3__1__Impl : ( ( rule__EffectPipeline__FiltersAssignment_3_3_1 ) ) ;
    public final void rule__EffectPipeline__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3401:1: ( ( ( rule__EffectPipeline__FiltersAssignment_3_3_1 ) ) )
            // InternalBgDsl.g:3402:1: ( ( rule__EffectPipeline__FiltersAssignment_3_3_1 ) )
            {
            // InternalBgDsl.g:3402:1: ( ( rule__EffectPipeline__FiltersAssignment_3_3_1 ) )
            // InternalBgDsl.g:3403:2: ( rule__EffectPipeline__FiltersAssignment_3_3_1 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFiltersAssignment_3_3_1()); 
            // InternalBgDsl.g:3404:2: ( rule__EffectPipeline__FiltersAssignment_3_3_1 )
            // InternalBgDsl.g:3404:3: rule__EffectPipeline__FiltersAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectPipeline__FiltersAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectPipelineAccess().getFiltersAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__Group_3_3__1__Impl"


    // $ANTLR start "rule__TilePlacement__Group__0"
    // InternalBgDsl.g:3413:1: rule__TilePlacement__Group__0 : rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 ;
    public final void rule__TilePlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3417:1: ( rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 )
            // InternalBgDsl.g:3418:2: rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1
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
    // InternalBgDsl.g:3425:1: rule__TilePlacement__Group__0__Impl : ( 'TilePlacement' ) ;
    public final void rule__TilePlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3429:1: ( ( 'TilePlacement' ) )
            // InternalBgDsl.g:3430:1: ( 'TilePlacement' )
            {
            // InternalBgDsl.g:3430:1: ( 'TilePlacement' )
            // InternalBgDsl.g:3431:2: 'TilePlacement'
            {
             before(grammarAccess.getTilePlacementAccess().getTilePlacementKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBgDsl.g:3440:1: rule__TilePlacement__Group__1 : rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 ;
    public final void rule__TilePlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3444:1: ( rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 )
            // InternalBgDsl.g:3445:2: rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2
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
    // InternalBgDsl.g:3452:1: rule__TilePlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__TilePlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3456:1: ( ( '{' ) )
            // InternalBgDsl.g:3457:1: ( '{' )
            {
            // InternalBgDsl.g:3457:1: ( '{' )
            // InternalBgDsl.g:3458:2: '{'
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
    // InternalBgDsl.g:3467:1: rule__TilePlacement__Group__2 : rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 ;
    public final void rule__TilePlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3471:1: ( rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 )
            // InternalBgDsl.g:3472:2: rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:3479:1: rule__TilePlacement__Group__2__Impl : ( 'row' ) ;
    public final void rule__TilePlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3483:1: ( ( 'row' ) )
            // InternalBgDsl.g:3484:1: ( 'row' )
            {
            // InternalBgDsl.g:3484:1: ( 'row' )
            // InternalBgDsl.g:3485:2: 'row'
            {
             before(grammarAccess.getTilePlacementAccess().getRowKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBgDsl.g:3494:1: rule__TilePlacement__Group__3 : rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 ;
    public final void rule__TilePlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3498:1: ( rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 )
            // InternalBgDsl.g:3499:2: rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4
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
    // InternalBgDsl.g:3506:1: rule__TilePlacement__Group__3__Impl : ( ( rule__TilePlacement__RowAssignment_3 ) ) ;
    public final void rule__TilePlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3510:1: ( ( ( rule__TilePlacement__RowAssignment_3 ) ) )
            // InternalBgDsl.g:3511:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            {
            // InternalBgDsl.g:3511:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            // InternalBgDsl.g:3512:2: ( rule__TilePlacement__RowAssignment_3 )
            {
             before(grammarAccess.getTilePlacementAccess().getRowAssignment_3()); 
            // InternalBgDsl.g:3513:2: ( rule__TilePlacement__RowAssignment_3 )
            // InternalBgDsl.g:3513:3: rule__TilePlacement__RowAssignment_3
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
    // InternalBgDsl.g:3521:1: rule__TilePlacement__Group__4 : rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 ;
    public final void rule__TilePlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3525:1: ( rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 )
            // InternalBgDsl.g:3526:2: rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:3533:1: rule__TilePlacement__Group__4__Impl : ( 'column' ) ;
    public final void rule__TilePlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3537:1: ( ( 'column' ) )
            // InternalBgDsl.g:3538:1: ( 'column' )
            {
            // InternalBgDsl.g:3538:1: ( 'column' )
            // InternalBgDsl.g:3539:2: 'column'
            {
             before(grammarAccess.getTilePlacementAccess().getColumnKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBgDsl.g:3548:1: rule__TilePlacement__Group__5 : rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 ;
    public final void rule__TilePlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3552:1: ( rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 )
            // InternalBgDsl.g:3553:2: rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6
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
    // InternalBgDsl.g:3560:1: rule__TilePlacement__Group__5__Impl : ( ( rule__TilePlacement__ColumnAssignment_5 ) ) ;
    public final void rule__TilePlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3564:1: ( ( ( rule__TilePlacement__ColumnAssignment_5 ) ) )
            // InternalBgDsl.g:3565:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            {
            // InternalBgDsl.g:3565:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            // InternalBgDsl.g:3566:2: ( rule__TilePlacement__ColumnAssignment_5 )
            {
             before(grammarAccess.getTilePlacementAccess().getColumnAssignment_5()); 
            // InternalBgDsl.g:3567:2: ( rule__TilePlacement__ColumnAssignment_5 )
            // InternalBgDsl.g:3567:3: rule__TilePlacement__ColumnAssignment_5
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
    // InternalBgDsl.g:3575:1: rule__TilePlacement__Group__6 : rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 ;
    public final void rule__TilePlacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3579:1: ( rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 )
            // InternalBgDsl.g:3580:2: rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7
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
    // InternalBgDsl.g:3587:1: rule__TilePlacement__Group__6__Impl : ( 'tile' ) ;
    public final void rule__TilePlacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3591:1: ( ( 'tile' ) )
            // InternalBgDsl.g:3592:1: ( 'tile' )
            {
            // InternalBgDsl.g:3592:1: ( 'tile' )
            // InternalBgDsl.g:3593:2: 'tile'
            {
             before(grammarAccess.getTilePlacementAccess().getTileKeyword_6()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBgDsl.g:3602:1: rule__TilePlacement__Group__7 : rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 ;
    public final void rule__TilePlacement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3606:1: ( rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 )
            // InternalBgDsl.g:3607:2: rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:3614:1: rule__TilePlacement__Group__7__Impl : ( ( rule__TilePlacement__TileAssignment_7 ) ) ;
    public final void rule__TilePlacement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3618:1: ( ( ( rule__TilePlacement__TileAssignment_7 ) ) )
            // InternalBgDsl.g:3619:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            {
            // InternalBgDsl.g:3619:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            // InternalBgDsl.g:3620:2: ( rule__TilePlacement__TileAssignment_7 )
            {
             before(grammarAccess.getTilePlacementAccess().getTileAssignment_7()); 
            // InternalBgDsl.g:3621:2: ( rule__TilePlacement__TileAssignment_7 )
            // InternalBgDsl.g:3621:3: rule__TilePlacement__TileAssignment_7
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
    // InternalBgDsl.g:3629:1: rule__TilePlacement__Group__8 : rule__TilePlacement__Group__8__Impl ;
    public final void rule__TilePlacement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3633:1: ( rule__TilePlacement__Group__8__Impl )
            // InternalBgDsl.g:3634:2: rule__TilePlacement__Group__8__Impl
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
    // InternalBgDsl.g:3640:1: rule__TilePlacement__Group__8__Impl : ( '}' ) ;
    public final void rule__TilePlacement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3644:1: ( ( '}' ) )
            // InternalBgDsl.g:3645:1: ( '}' )
            {
            // InternalBgDsl.g:3645:1: ( '}' )
            // InternalBgDsl.g:3646:2: '}'
            {
             before(grammarAccess.getTilePlacementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:3656:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3660:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBgDsl.g:3661:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalBgDsl.g:3668:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3672:1: ( ( 'State' ) )
            // InternalBgDsl.g:3673:1: ( 'State' )
            {
            // InternalBgDsl.g:3673:1: ( 'State' )
            // InternalBgDsl.g:3674:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBgDsl.g:3683:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3687:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBgDsl.g:3688:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalBgDsl.g:3695:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3699:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalBgDsl.g:3700:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:3700:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalBgDsl.g:3701:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:3702:2: ( rule__State__NameAssignment_1 )
            // InternalBgDsl.g:3702:3: rule__State__NameAssignment_1
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
    // InternalBgDsl.g:3710:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3714:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBgDsl.g:3715:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBgDsl.g:3722:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3726:1: ( ( '{' ) )
            // InternalBgDsl.g:3727:1: ( '{' )
            {
            // InternalBgDsl.g:3727:1: ( '{' )
            // InternalBgDsl.g:3728:2: '{'
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
    // InternalBgDsl.g:3737:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3741:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBgDsl.g:3742:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalBgDsl.g:3749:1: rule__State__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3753:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:3754:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:3754:1: ( 'hexColor' )
            // InternalBgDsl.g:3755:2: 'hexColor'
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
    // InternalBgDsl.g:3764:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3768:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBgDsl.g:3769:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalBgDsl.g:3776:1: rule__State__Group__4__Impl : ( ( rule__State__HexColorAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3780:1: ( ( ( rule__State__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:3781:1: ( ( rule__State__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:3781:1: ( ( rule__State__HexColorAssignment_4 ) )
            // InternalBgDsl.g:3782:2: ( rule__State__HexColorAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:3783:2: ( rule__State__HexColorAssignment_4 )
            // InternalBgDsl.g:3783:3: rule__State__HexColorAssignment_4
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
    // InternalBgDsl.g:3791:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3795:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalBgDsl.g:3796:2: rule__State__Group__5__Impl rule__State__Group__6
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
    // InternalBgDsl.g:3803:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3807:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalBgDsl.g:3808:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalBgDsl.g:3808:1: ( ( rule__State__Group_5__0 )? )
            // InternalBgDsl.g:3809:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalBgDsl.g:3810:2: ( rule__State__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:3810:3: rule__State__Group_5__0
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
    // InternalBgDsl.g:3818:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3822:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalBgDsl.g:3823:2: rule__State__Group__6__Impl rule__State__Group__7
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
    // InternalBgDsl.g:3830:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3834:1: ( ( ( rule__State__Group_6__0 )? ) )
            // InternalBgDsl.g:3835:1: ( ( rule__State__Group_6__0 )? )
            {
            // InternalBgDsl.g:3835:1: ( ( rule__State__Group_6__0 )? )
            // InternalBgDsl.g:3836:2: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // InternalBgDsl.g:3837:2: ( rule__State__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBgDsl.g:3837:3: rule__State__Group_6__0
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
    // InternalBgDsl.g:3845:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3849:1: ( rule__State__Group__7__Impl )
            // InternalBgDsl.g:3850:2: rule__State__Group__7__Impl
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
    // InternalBgDsl.g:3856:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3860:1: ( ( '}' ) )
            // InternalBgDsl.g:3861:1: ( '}' )
            {
            // InternalBgDsl.g:3861:1: ( '}' )
            // InternalBgDsl.g:3862:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:3872:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3876:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalBgDsl.g:3877:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
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
    // InternalBgDsl.g:3884:1: rule__State__Group_5__0__Impl : ( 'outbound' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3888:1: ( ( 'outbound' ) )
            // InternalBgDsl.g:3889:1: ( 'outbound' )
            {
            // InternalBgDsl.g:3889:1: ( 'outbound' )
            // InternalBgDsl.g:3890:2: 'outbound'
            {
             before(grammarAccess.getStateAccess().getOutboundKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBgDsl.g:3899:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3903:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalBgDsl.g:3904:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalBgDsl.g:3911:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3915:1: ( ( '(' ) )
            // InternalBgDsl.g:3916:1: ( '(' )
            {
            // InternalBgDsl.g:3916:1: ( '(' )
            // InternalBgDsl.g:3917:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBgDsl.g:3926:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3930:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalBgDsl.g:3931:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
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
    // InternalBgDsl.g:3938:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutboundAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3942:1: ( ( ( rule__State__OutboundAssignment_5_2 ) ) )
            // InternalBgDsl.g:3943:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            {
            // InternalBgDsl.g:3943:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            // InternalBgDsl.g:3944:2: ( rule__State__OutboundAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_2()); 
            // InternalBgDsl.g:3945:2: ( rule__State__OutboundAssignment_5_2 )
            // InternalBgDsl.g:3945:3: rule__State__OutboundAssignment_5_2
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
    // InternalBgDsl.g:3953:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3957:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalBgDsl.g:3958:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
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
    // InternalBgDsl.g:3965:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3969:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalBgDsl.g:3970:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalBgDsl.g:3970:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalBgDsl.g:3971:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalBgDsl.g:3972:2: ( rule__State__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBgDsl.g:3972:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBgDsl.g:3980:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3984:1: ( rule__State__Group_5__4__Impl )
            // InternalBgDsl.g:3985:2: rule__State__Group_5__4__Impl
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
    // InternalBgDsl.g:3991:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3995:1: ( ( ')' ) )
            // InternalBgDsl.g:3996:1: ( ')' )
            {
            // InternalBgDsl.g:3996:1: ( ')' )
            // InternalBgDsl.g:3997:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBgDsl.g:4007:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4011:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalBgDsl.g:4012:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
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
    // InternalBgDsl.g:4019:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4023:1: ( ( ',' ) )
            // InternalBgDsl.g:4024:1: ( ',' )
            {
            // InternalBgDsl.g:4024:1: ( ',' )
            // InternalBgDsl.g:4025:2: ','
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
    // InternalBgDsl.g:4034:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4038:1: ( rule__State__Group_5_3__1__Impl )
            // InternalBgDsl.g:4039:2: rule__State__Group_5_3__1__Impl
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
    // InternalBgDsl.g:4045:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutboundAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4049:1: ( ( ( rule__State__OutboundAssignment_5_3_1 ) ) )
            // InternalBgDsl.g:4050:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            {
            // InternalBgDsl.g:4050:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            // InternalBgDsl.g:4051:2: ( rule__State__OutboundAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_3_1()); 
            // InternalBgDsl.g:4052:2: ( rule__State__OutboundAssignment_5_3_1 )
            // InternalBgDsl.g:4052:3: rule__State__OutboundAssignment_5_3_1
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
    // InternalBgDsl.g:4061:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4065:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // InternalBgDsl.g:4066:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
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
    // InternalBgDsl.g:4073:1: rule__State__Group_6__0__Impl : ( 'inbound' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4077:1: ( ( 'inbound' ) )
            // InternalBgDsl.g:4078:1: ( 'inbound' )
            {
            // InternalBgDsl.g:4078:1: ( 'inbound' )
            // InternalBgDsl.g:4079:2: 'inbound'
            {
             before(grammarAccess.getStateAccess().getInboundKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBgDsl.g:4088:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl rule__State__Group_6__2 ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4092:1: ( rule__State__Group_6__1__Impl rule__State__Group_6__2 )
            // InternalBgDsl.g:4093:2: rule__State__Group_6__1__Impl rule__State__Group_6__2
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
    // InternalBgDsl.g:4100:1: rule__State__Group_6__1__Impl : ( '(' ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4104:1: ( ( '(' ) )
            // InternalBgDsl.g:4105:1: ( '(' )
            {
            // InternalBgDsl.g:4105:1: ( '(' )
            // InternalBgDsl.g:4106:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBgDsl.g:4115:1: rule__State__Group_6__2 : rule__State__Group_6__2__Impl rule__State__Group_6__3 ;
    public final void rule__State__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4119:1: ( rule__State__Group_6__2__Impl rule__State__Group_6__3 )
            // InternalBgDsl.g:4120:2: rule__State__Group_6__2__Impl rule__State__Group_6__3
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
    // InternalBgDsl.g:4127:1: rule__State__Group_6__2__Impl : ( ( rule__State__InboundAssignment_6_2 ) ) ;
    public final void rule__State__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4131:1: ( ( ( rule__State__InboundAssignment_6_2 ) ) )
            // InternalBgDsl.g:4132:1: ( ( rule__State__InboundAssignment_6_2 ) )
            {
            // InternalBgDsl.g:4132:1: ( ( rule__State__InboundAssignment_6_2 ) )
            // InternalBgDsl.g:4133:2: ( rule__State__InboundAssignment_6_2 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_2()); 
            // InternalBgDsl.g:4134:2: ( rule__State__InboundAssignment_6_2 )
            // InternalBgDsl.g:4134:3: rule__State__InboundAssignment_6_2
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
    // InternalBgDsl.g:4142:1: rule__State__Group_6__3 : rule__State__Group_6__3__Impl rule__State__Group_6__4 ;
    public final void rule__State__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4146:1: ( rule__State__Group_6__3__Impl rule__State__Group_6__4 )
            // InternalBgDsl.g:4147:2: rule__State__Group_6__3__Impl rule__State__Group_6__4
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
    // InternalBgDsl.g:4154:1: rule__State__Group_6__3__Impl : ( ( rule__State__Group_6_3__0 )* ) ;
    public final void rule__State__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4158:1: ( ( ( rule__State__Group_6_3__0 )* ) )
            // InternalBgDsl.g:4159:1: ( ( rule__State__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:4159:1: ( ( rule__State__Group_6_3__0 )* )
            // InternalBgDsl.g:4160:2: ( rule__State__Group_6_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_6_3()); 
            // InternalBgDsl.g:4161:2: ( rule__State__Group_6_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBgDsl.g:4161:3: rule__State__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__State__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBgDsl.g:4169:1: rule__State__Group_6__4 : rule__State__Group_6__4__Impl ;
    public final void rule__State__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4173:1: ( rule__State__Group_6__4__Impl )
            // InternalBgDsl.g:4174:2: rule__State__Group_6__4__Impl
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
    // InternalBgDsl.g:4180:1: rule__State__Group_6__4__Impl : ( ')' ) ;
    public final void rule__State__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4184:1: ( ( ')' ) )
            // InternalBgDsl.g:4185:1: ( ')' )
            {
            // InternalBgDsl.g:4185:1: ( ')' )
            // InternalBgDsl.g:4186:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBgDsl.g:4196:1: rule__State__Group_6_3__0 : rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 ;
    public final void rule__State__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4200:1: ( rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 )
            // InternalBgDsl.g:4201:2: rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1
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
    // InternalBgDsl.g:4208:1: rule__State__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4212:1: ( ( ',' ) )
            // InternalBgDsl.g:4213:1: ( ',' )
            {
            // InternalBgDsl.g:4213:1: ( ',' )
            // InternalBgDsl.g:4214:2: ','
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
    // InternalBgDsl.g:4223:1: rule__State__Group_6_3__1 : rule__State__Group_6_3__1__Impl ;
    public final void rule__State__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4227:1: ( rule__State__Group_6_3__1__Impl )
            // InternalBgDsl.g:4228:2: rule__State__Group_6_3__1__Impl
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
    // InternalBgDsl.g:4234:1: rule__State__Group_6_3__1__Impl : ( ( rule__State__InboundAssignment_6_3_1 ) ) ;
    public final void rule__State__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4238:1: ( ( ( rule__State__InboundAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:4239:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:4239:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            // InternalBgDsl.g:4240:2: ( rule__State__InboundAssignment_6_3_1 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_3_1()); 
            // InternalBgDsl.g:4241:2: ( rule__State__InboundAssignment_6_3_1 )
            // InternalBgDsl.g:4241:3: rule__State__InboundAssignment_6_3_1
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
    // InternalBgDsl.g:4250:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4254:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBgDsl.g:4255:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalBgDsl.g:4262:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4266:1: ( ( 'Transition' ) )
            // InternalBgDsl.g:4267:1: ( 'Transition' )
            {
            // InternalBgDsl.g:4267:1: ( 'Transition' )
            // InternalBgDsl.g:4268:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBgDsl.g:4277:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4281:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBgDsl.g:4282:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalBgDsl.g:4289:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4293:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4294:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4294:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalBgDsl.g:4295:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4296:2: ( rule__Transition__NameAssignment_1 )
            // InternalBgDsl.g:4296:3: rule__Transition__NameAssignment_1
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
    // InternalBgDsl.g:4304:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4308:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBgDsl.g:4309:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalBgDsl.g:4316:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4320:1: ( ( '{' ) )
            // InternalBgDsl.g:4321:1: ( '{' )
            {
            // InternalBgDsl.g:4321:1: ( '{' )
            // InternalBgDsl.g:4322:2: '{'
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
    // InternalBgDsl.g:4331:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4335:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBgDsl.g:4336:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalBgDsl.g:4343:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4347:1: ( ( 'source' ) )
            // InternalBgDsl.g:4348:1: ( 'source' )
            {
            // InternalBgDsl.g:4348:1: ( 'source' )
            // InternalBgDsl.g:4349:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBgDsl.g:4358:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4362:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalBgDsl.g:4363:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalBgDsl.g:4370:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4374:1: ( ( '(' ) )
            // InternalBgDsl.g:4375:1: ( '(' )
            {
            // InternalBgDsl.g:4375:1: ( '(' )
            // InternalBgDsl.g:4376:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBgDsl.g:4385:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4389:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalBgDsl.g:4390:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
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
    // InternalBgDsl.g:4397:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4401:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalBgDsl.g:4402:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalBgDsl.g:4402:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalBgDsl.g:4403:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalBgDsl.g:4404:2: ( rule__Transition__SourceAssignment_5 )
            // InternalBgDsl.g:4404:3: rule__Transition__SourceAssignment_5
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
    // InternalBgDsl.g:4412:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4416:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalBgDsl.g:4417:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
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
    // InternalBgDsl.g:4424:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )* ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4428:1: ( ( ( rule__Transition__Group_6__0 )* ) )
            // InternalBgDsl.g:4429:1: ( ( rule__Transition__Group_6__0 )* )
            {
            // InternalBgDsl.g:4429:1: ( ( rule__Transition__Group_6__0 )* )
            // InternalBgDsl.g:4430:2: ( rule__Transition__Group_6__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalBgDsl.g:4431:2: ( rule__Transition__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBgDsl.g:4431:3: rule__Transition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Transition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBgDsl.g:4439:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4443:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalBgDsl.g:4444:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
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
    // InternalBgDsl.g:4451:1: rule__Transition__Group__7__Impl : ( ')' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4455:1: ( ( ')' ) )
            // InternalBgDsl.g:4456:1: ( ')' )
            {
            // InternalBgDsl.g:4456:1: ( ')' )
            // InternalBgDsl.g:4457:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_7()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBgDsl.g:4466:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4470:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalBgDsl.g:4471:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
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
    // InternalBgDsl.g:4478:1: rule__Transition__Group__8__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4482:1: ( ( 'target' ) )
            // InternalBgDsl.g:4483:1: ( 'target' )
            {
            // InternalBgDsl.g:4483:1: ( 'target' )
            // InternalBgDsl.g:4484:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_8()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBgDsl.g:4493:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4497:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalBgDsl.g:4498:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:4505:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__TargetAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4509:1: ( ( ( rule__Transition__TargetAssignment_9 ) ) )
            // InternalBgDsl.g:4510:1: ( ( rule__Transition__TargetAssignment_9 ) )
            {
            // InternalBgDsl.g:4510:1: ( ( rule__Transition__TargetAssignment_9 ) )
            // InternalBgDsl.g:4511:2: ( rule__Transition__TargetAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 
            // InternalBgDsl.g:4512:2: ( rule__Transition__TargetAssignment_9 )
            // InternalBgDsl.g:4512:3: rule__Transition__TargetAssignment_9
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
    // InternalBgDsl.g:4520:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4524:1: ( rule__Transition__Group__10__Impl )
            // InternalBgDsl.g:4525:2: rule__Transition__Group__10__Impl
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
    // InternalBgDsl.g:4531:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4535:1: ( ( '}' ) )
            // InternalBgDsl.g:4536:1: ( '}' )
            {
            // InternalBgDsl.g:4536:1: ( '}' )
            // InternalBgDsl.g:4537:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:4547:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4551:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalBgDsl.g:4552:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
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
    // InternalBgDsl.g:4559:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4563:1: ( ( ',' ) )
            // InternalBgDsl.g:4564:1: ( ',' )
            {
            // InternalBgDsl.g:4564:1: ( ',' )
            // InternalBgDsl.g:4565:2: ','
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
    // InternalBgDsl.g:4574:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4578:1: ( rule__Transition__Group_6__1__Impl )
            // InternalBgDsl.g:4579:2: rule__Transition__Group_6__1__Impl
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
    // InternalBgDsl.g:4585:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4589:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // InternalBgDsl.g:4590:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // InternalBgDsl.g:4590:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // InternalBgDsl.g:4591:2: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // InternalBgDsl.g:4592:2: ( rule__Transition__SourceAssignment_6_1 )
            // InternalBgDsl.g:4592:3: rule__Transition__SourceAssignment_6_1
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
    // InternalBgDsl.g:4601:1: rule__PatternFilter__Group__0 : rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 ;
    public final void rule__PatternFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4605:1: ( rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 )
            // InternalBgDsl.g:4606:2: rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1
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
    // InternalBgDsl.g:4613:1: rule__PatternFilter__Group__0__Impl : ( 'PatternFilter' ) ;
    public final void rule__PatternFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4617:1: ( ( 'PatternFilter' ) )
            // InternalBgDsl.g:4618:1: ( 'PatternFilter' )
            {
            // InternalBgDsl.g:4618:1: ( 'PatternFilter' )
            // InternalBgDsl.g:4619:2: 'PatternFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternFilterKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBgDsl.g:4628:1: rule__PatternFilter__Group__1 : rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 ;
    public final void rule__PatternFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4632:1: ( rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 )
            // InternalBgDsl.g:4633:2: rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2
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
    // InternalBgDsl.g:4640:1: rule__PatternFilter__Group__1__Impl : ( ( rule__PatternFilter__NameAssignment_1 ) ) ;
    public final void rule__PatternFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4644:1: ( ( ( rule__PatternFilter__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4645:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4645:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            // InternalBgDsl.g:4646:2: ( rule__PatternFilter__NameAssignment_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4647:2: ( rule__PatternFilter__NameAssignment_1 )
            // InternalBgDsl.g:4647:3: rule__PatternFilter__NameAssignment_1
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
    // InternalBgDsl.g:4655:1: rule__PatternFilter__Group__2 : rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 ;
    public final void rule__PatternFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4659:1: ( rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 )
            // InternalBgDsl.g:4660:2: rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3
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
    // InternalBgDsl.g:4667:1: rule__PatternFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4671:1: ( ( '{' ) )
            // InternalBgDsl.g:4672:1: ( '{' )
            {
            // InternalBgDsl.g:4672:1: ( '{' )
            // InternalBgDsl.g:4673:2: '{'
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
    // InternalBgDsl.g:4682:1: rule__PatternFilter__Group__3 : rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 ;
    public final void rule__PatternFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4686:1: ( rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 )
            // InternalBgDsl.g:4687:2: rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4
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
    // InternalBgDsl.g:4694:1: rule__PatternFilter__Group__3__Impl : ( ( rule__PatternFilter__Group_3__0 )? ) ;
    public final void rule__PatternFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4698:1: ( ( ( rule__PatternFilter__Group_3__0 )? ) )
            // InternalBgDsl.g:4699:1: ( ( rule__PatternFilter__Group_3__0 )? )
            {
            // InternalBgDsl.g:4699:1: ( ( rule__PatternFilter__Group_3__0 )? )
            // InternalBgDsl.g:4700:2: ( rule__PatternFilter__Group_3__0 )?
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_3()); 
            // InternalBgDsl.g:4701:2: ( rule__PatternFilter__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBgDsl.g:4701:3: rule__PatternFilter__Group_3__0
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
    // InternalBgDsl.g:4709:1: rule__PatternFilter__Group__4 : rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 ;
    public final void rule__PatternFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4713:1: ( rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 )
            // InternalBgDsl.g:4714:2: rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5
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
    // InternalBgDsl.g:4721:1: rule__PatternFilter__Group__4__Impl : ( 'patterns' ) ;
    public final void rule__PatternFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4725:1: ( ( 'patterns' ) )
            // InternalBgDsl.g:4726:1: ( 'patterns' )
            {
            // InternalBgDsl.g:4726:1: ( 'patterns' )
            // InternalBgDsl.g:4727:2: 'patterns'
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsKeyword_4()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBgDsl.g:4736:1: rule__PatternFilter__Group__5 : rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 ;
    public final void rule__PatternFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4740:1: ( rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 )
            // InternalBgDsl.g:4741:2: rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6
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
    // InternalBgDsl.g:4748:1: rule__PatternFilter__Group__5__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4752:1: ( ( '{' ) )
            // InternalBgDsl.g:4753:1: ( '{' )
            {
            // InternalBgDsl.g:4753:1: ( '{' )
            // InternalBgDsl.g:4754:2: '{'
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
    // InternalBgDsl.g:4763:1: rule__PatternFilter__Group__6 : rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 ;
    public final void rule__PatternFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4767:1: ( rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 )
            // InternalBgDsl.g:4768:2: rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:4775:1: rule__PatternFilter__Group__6__Impl : ( ( rule__PatternFilter__PatternsAssignment_6 ) ) ;
    public final void rule__PatternFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4779:1: ( ( ( rule__PatternFilter__PatternsAssignment_6 ) ) )
            // InternalBgDsl.g:4780:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            {
            // InternalBgDsl.g:4780:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            // InternalBgDsl.g:4781:2: ( rule__PatternFilter__PatternsAssignment_6 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_6()); 
            // InternalBgDsl.g:4782:2: ( rule__PatternFilter__PatternsAssignment_6 )
            // InternalBgDsl.g:4782:3: rule__PatternFilter__PatternsAssignment_6
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
    // InternalBgDsl.g:4790:1: rule__PatternFilter__Group__7 : rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 ;
    public final void rule__PatternFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4794:1: ( rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 )
            // InternalBgDsl.g:4795:2: rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:4802:1: rule__PatternFilter__Group__7__Impl : ( ( rule__PatternFilter__Group_7__0 )* ) ;
    public final void rule__PatternFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4806:1: ( ( ( rule__PatternFilter__Group_7__0 )* ) )
            // InternalBgDsl.g:4807:1: ( ( rule__PatternFilter__Group_7__0 )* )
            {
            // InternalBgDsl.g:4807:1: ( ( rule__PatternFilter__Group_7__0 )* )
            // InternalBgDsl.g:4808:2: ( rule__PatternFilter__Group_7__0 )*
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_7()); 
            // InternalBgDsl.g:4809:2: ( rule__PatternFilter__Group_7__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBgDsl.g:4809:3: rule__PatternFilter__Group_7__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PatternFilter__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBgDsl.g:4817:1: rule__PatternFilter__Group__8 : rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 ;
    public final void rule__PatternFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4821:1: ( rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 )
            // InternalBgDsl.g:4822:2: rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:4829:1: rule__PatternFilter__Group__8__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4833:1: ( ( '}' ) )
            // InternalBgDsl.g:4834:1: ( '}' )
            {
            // InternalBgDsl.g:4834:1: ( '}' )
            // InternalBgDsl.g:4835:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:4844:1: rule__PatternFilter__Group__9 : rule__PatternFilter__Group__9__Impl ;
    public final void rule__PatternFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4848:1: ( rule__PatternFilter__Group__9__Impl )
            // InternalBgDsl.g:4849:2: rule__PatternFilter__Group__9__Impl
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
    // InternalBgDsl.g:4855:1: rule__PatternFilter__Group__9__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4859:1: ( ( '}' ) )
            // InternalBgDsl.g:4860:1: ( '}' )
            {
            // InternalBgDsl.g:4860:1: ( '}' )
            // InternalBgDsl.g:4861:2: '}'
            {
             before(grammarAccess.getPatternFilterAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:4871:1: rule__PatternFilter__Group_3__0 : rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 ;
    public final void rule__PatternFilter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4875:1: ( rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 )
            // InternalBgDsl.g:4876:2: rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1
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
    // InternalBgDsl.g:4883:1: rule__PatternFilter__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__PatternFilter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4887:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:4888:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:4888:1: ( 'nextFilter' )
            // InternalBgDsl.g:4889:2: 'nextFilter'
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBgDsl.g:4898:1: rule__PatternFilter__Group_3__1 : rule__PatternFilter__Group_3__1__Impl ;
    public final void rule__PatternFilter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4902:1: ( rule__PatternFilter__Group_3__1__Impl )
            // InternalBgDsl.g:4903:2: rule__PatternFilter__Group_3__1__Impl
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
    // InternalBgDsl.g:4909:1: rule__PatternFilter__Group_3__1__Impl : ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) ;
    public final void rule__PatternFilter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4913:1: ( ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:4914:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:4914:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:4915:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:4916:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:4916:3: rule__PatternFilter__NextFilterAssignment_3_1
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
    // InternalBgDsl.g:4925:1: rule__PatternFilter__Group_7__0 : rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 ;
    public final void rule__PatternFilter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4929:1: ( rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 )
            // InternalBgDsl.g:4930:2: rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1
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
    // InternalBgDsl.g:4937:1: rule__PatternFilter__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PatternFilter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4941:1: ( ( ',' ) )
            // InternalBgDsl.g:4942:1: ( ',' )
            {
            // InternalBgDsl.g:4942:1: ( ',' )
            // InternalBgDsl.g:4943:2: ','
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
    // InternalBgDsl.g:4952:1: rule__PatternFilter__Group_7__1 : rule__PatternFilter__Group_7__1__Impl ;
    public final void rule__PatternFilter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4956:1: ( rule__PatternFilter__Group_7__1__Impl )
            // InternalBgDsl.g:4957:2: rule__PatternFilter__Group_7__1__Impl
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
    // InternalBgDsl.g:4963:1: rule__PatternFilter__Group_7__1__Impl : ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) ;
    public final void rule__PatternFilter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4967:1: ( ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) )
            // InternalBgDsl.g:4968:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            {
            // InternalBgDsl.g:4968:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            // InternalBgDsl.g:4969:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7_1()); 
            // InternalBgDsl.g:4970:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            // InternalBgDsl.g:4970:3: rule__PatternFilter__PatternsAssignment_7_1
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


    // $ANTLR start "rule__IterativeFilter__Group__0"
    // InternalBgDsl.g:4979:1: rule__IterativeFilter__Group__0 : rule__IterativeFilter__Group__0__Impl rule__IterativeFilter__Group__1 ;
    public final void rule__IterativeFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4983:1: ( rule__IterativeFilter__Group__0__Impl rule__IterativeFilter__Group__1 )
            // InternalBgDsl.g:4984:2: rule__IterativeFilter__Group__0__Impl rule__IterativeFilter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IterativeFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__0"


    // $ANTLR start "rule__IterativeFilter__Group__0__Impl"
    // InternalBgDsl.g:4991:1: rule__IterativeFilter__Group__0__Impl : ( 'IterativeFilter' ) ;
    public final void rule__IterativeFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4995:1: ( ( 'IterativeFilter' ) )
            // InternalBgDsl.g:4996:1: ( 'IterativeFilter' )
            {
            // InternalBgDsl.g:4996:1: ( 'IterativeFilter' )
            // InternalBgDsl.g:4997:2: 'IterativeFilter'
            {
             before(grammarAccess.getIterativeFilterAccess().getIterativeFilterKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getIterativeFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__0__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__1"
    // InternalBgDsl.g:5006:1: rule__IterativeFilter__Group__1 : rule__IterativeFilter__Group__1__Impl rule__IterativeFilter__Group__2 ;
    public final void rule__IterativeFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5010:1: ( rule__IterativeFilter__Group__1__Impl rule__IterativeFilter__Group__2 )
            // InternalBgDsl.g:5011:2: rule__IterativeFilter__Group__1__Impl rule__IterativeFilter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IterativeFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__1"


    // $ANTLR start "rule__IterativeFilter__Group__1__Impl"
    // InternalBgDsl.g:5018:1: rule__IterativeFilter__Group__1__Impl : ( ( rule__IterativeFilter__NameAssignment_1 ) ) ;
    public final void rule__IterativeFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5022:1: ( ( ( rule__IterativeFilter__NameAssignment_1 ) ) )
            // InternalBgDsl.g:5023:1: ( ( rule__IterativeFilter__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:5023:1: ( ( rule__IterativeFilter__NameAssignment_1 ) )
            // InternalBgDsl.g:5024:2: ( rule__IterativeFilter__NameAssignment_1 )
            {
             before(grammarAccess.getIterativeFilterAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:5025:2: ( rule__IterativeFilter__NameAssignment_1 )
            // InternalBgDsl.g:5025:3: rule__IterativeFilter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__1__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__2"
    // InternalBgDsl.g:5033:1: rule__IterativeFilter__Group__2 : rule__IterativeFilter__Group__2__Impl rule__IterativeFilter__Group__3 ;
    public final void rule__IterativeFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5037:1: ( rule__IterativeFilter__Group__2__Impl rule__IterativeFilter__Group__3 )
            // InternalBgDsl.g:5038:2: rule__IterativeFilter__Group__2__Impl rule__IterativeFilter__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__IterativeFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__2"


    // $ANTLR start "rule__IterativeFilter__Group__2__Impl"
    // InternalBgDsl.g:5045:1: rule__IterativeFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__IterativeFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5049:1: ( ( '{' ) )
            // InternalBgDsl.g:5050:1: ( '{' )
            {
            // InternalBgDsl.g:5050:1: ( '{' )
            // InternalBgDsl.g:5051:2: '{'
            {
             before(grammarAccess.getIterativeFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__2__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__3"
    // InternalBgDsl.g:5060:1: rule__IterativeFilter__Group__3 : rule__IterativeFilter__Group__3__Impl rule__IterativeFilter__Group__4 ;
    public final void rule__IterativeFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5064:1: ( rule__IterativeFilter__Group__3__Impl rule__IterativeFilter__Group__4 )
            // InternalBgDsl.g:5065:2: rule__IterativeFilter__Group__3__Impl rule__IterativeFilter__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__IterativeFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__3"


    // $ANTLR start "rule__IterativeFilter__Group__3__Impl"
    // InternalBgDsl.g:5072:1: rule__IterativeFilter__Group__3__Impl : ( ( rule__IterativeFilter__Group_3__0 )? ) ;
    public final void rule__IterativeFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5076:1: ( ( ( rule__IterativeFilter__Group_3__0 )? ) )
            // InternalBgDsl.g:5077:1: ( ( rule__IterativeFilter__Group_3__0 )? )
            {
            // InternalBgDsl.g:5077:1: ( ( rule__IterativeFilter__Group_3__0 )? )
            // InternalBgDsl.g:5078:2: ( rule__IterativeFilter__Group_3__0 )?
            {
             before(grammarAccess.getIterativeFilterAccess().getGroup_3()); 
            // InternalBgDsl.g:5079:2: ( rule__IterativeFilter__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBgDsl.g:5079:3: rule__IterativeFilter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IterativeFilter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIterativeFilterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__3__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__4"
    // InternalBgDsl.g:5087:1: rule__IterativeFilter__Group__4 : rule__IterativeFilter__Group__4__Impl rule__IterativeFilter__Group__5 ;
    public final void rule__IterativeFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5091:1: ( rule__IterativeFilter__Group__4__Impl rule__IterativeFilter__Group__5 )
            // InternalBgDsl.g:5092:2: rule__IterativeFilter__Group__4__Impl rule__IterativeFilter__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__IterativeFilter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__4"


    // $ANTLR start "rule__IterativeFilter__Group__4__Impl"
    // InternalBgDsl.g:5099:1: rule__IterativeFilter__Group__4__Impl : ( 'directionVector' ) ;
    public final void rule__IterativeFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5103:1: ( ( 'directionVector' ) )
            // InternalBgDsl.g:5104:1: ( 'directionVector' )
            {
            // InternalBgDsl.g:5104:1: ( 'directionVector' )
            // InternalBgDsl.g:5105:2: 'directionVector'
            {
             before(grammarAccess.getIterativeFilterAccess().getDirectionVectorKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getDirectionVectorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__4__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__5"
    // InternalBgDsl.g:5114:1: rule__IterativeFilter__Group__5 : rule__IterativeFilter__Group__5__Impl rule__IterativeFilter__Group__6 ;
    public final void rule__IterativeFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5118:1: ( rule__IterativeFilter__Group__5__Impl rule__IterativeFilter__Group__6 )
            // InternalBgDsl.g:5119:2: rule__IterativeFilter__Group__5__Impl rule__IterativeFilter__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__IterativeFilter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__5"


    // $ANTLR start "rule__IterativeFilter__Group__5__Impl"
    // InternalBgDsl.g:5126:1: rule__IterativeFilter__Group__5__Impl : ( ( rule__IterativeFilter__DirectionVectorAssignment_5 ) ) ;
    public final void rule__IterativeFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5130:1: ( ( ( rule__IterativeFilter__DirectionVectorAssignment_5 ) ) )
            // InternalBgDsl.g:5131:1: ( ( rule__IterativeFilter__DirectionVectorAssignment_5 ) )
            {
            // InternalBgDsl.g:5131:1: ( ( rule__IterativeFilter__DirectionVectorAssignment_5 ) )
            // InternalBgDsl.g:5132:2: ( rule__IterativeFilter__DirectionVectorAssignment_5 )
            {
             before(grammarAccess.getIterativeFilterAccess().getDirectionVectorAssignment_5()); 
            // InternalBgDsl.g:5133:2: ( rule__IterativeFilter__DirectionVectorAssignment_5 )
            // InternalBgDsl.g:5133:3: rule__IterativeFilter__DirectionVectorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__DirectionVectorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getDirectionVectorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__5__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__6"
    // InternalBgDsl.g:5141:1: rule__IterativeFilter__Group__6 : rule__IterativeFilter__Group__6__Impl rule__IterativeFilter__Group__7 ;
    public final void rule__IterativeFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5145:1: ( rule__IterativeFilter__Group__6__Impl rule__IterativeFilter__Group__7 )
            // InternalBgDsl.g:5146:2: rule__IterativeFilter__Group__6__Impl rule__IterativeFilter__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__IterativeFilter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__6"


    // $ANTLR start "rule__IterativeFilter__Group__6__Impl"
    // InternalBgDsl.g:5153:1: rule__IterativeFilter__Group__6__Impl : ( 'matchRule' ) ;
    public final void rule__IterativeFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5157:1: ( ( 'matchRule' ) )
            // InternalBgDsl.g:5158:1: ( 'matchRule' )
            {
            // InternalBgDsl.g:5158:1: ( 'matchRule' )
            // InternalBgDsl.g:5159:2: 'matchRule'
            {
             before(grammarAccess.getIterativeFilterAccess().getMatchRuleKeyword_6()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getMatchRuleKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__6__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__7"
    // InternalBgDsl.g:5168:1: rule__IterativeFilter__Group__7 : rule__IterativeFilter__Group__7__Impl rule__IterativeFilter__Group__8 ;
    public final void rule__IterativeFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5172:1: ( rule__IterativeFilter__Group__7__Impl rule__IterativeFilter__Group__8 )
            // InternalBgDsl.g:5173:2: rule__IterativeFilter__Group__7__Impl rule__IterativeFilter__Group__8
            {
            pushFollow(FOLLOW_47);
            rule__IterativeFilter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__7"


    // $ANTLR start "rule__IterativeFilter__Group__7__Impl"
    // InternalBgDsl.g:5180:1: rule__IterativeFilter__Group__7__Impl : ( ( rule__IterativeFilter__MatchRuleAssignment_7 ) ) ;
    public final void rule__IterativeFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5184:1: ( ( ( rule__IterativeFilter__MatchRuleAssignment_7 ) ) )
            // InternalBgDsl.g:5185:1: ( ( rule__IterativeFilter__MatchRuleAssignment_7 ) )
            {
            // InternalBgDsl.g:5185:1: ( ( rule__IterativeFilter__MatchRuleAssignment_7 ) )
            // InternalBgDsl.g:5186:2: ( rule__IterativeFilter__MatchRuleAssignment_7 )
            {
             before(grammarAccess.getIterativeFilterAccess().getMatchRuleAssignment_7()); 
            // InternalBgDsl.g:5187:2: ( rule__IterativeFilter__MatchRuleAssignment_7 )
            // InternalBgDsl.g:5187:3: rule__IterativeFilter__MatchRuleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__MatchRuleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getMatchRuleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__7__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__8"
    // InternalBgDsl.g:5195:1: rule__IterativeFilter__Group__8 : rule__IterativeFilter__Group__8__Impl rule__IterativeFilter__Group__9 ;
    public final void rule__IterativeFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5199:1: ( rule__IterativeFilter__Group__8__Impl rule__IterativeFilter__Group__9 )
            // InternalBgDsl.g:5200:2: rule__IterativeFilter__Group__8__Impl rule__IterativeFilter__Group__9
            {
            pushFollow(FOLLOW_43);
            rule__IterativeFilter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__8"


    // $ANTLR start "rule__IterativeFilter__Group__8__Impl"
    // InternalBgDsl.g:5207:1: rule__IterativeFilter__Group__8__Impl : ( 'endRule' ) ;
    public final void rule__IterativeFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5211:1: ( ( 'endRule' ) )
            // InternalBgDsl.g:5212:1: ( 'endRule' )
            {
            // InternalBgDsl.g:5212:1: ( 'endRule' )
            // InternalBgDsl.g:5213:2: 'endRule'
            {
             before(grammarAccess.getIterativeFilterAccess().getEndRuleKeyword_8()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getEndRuleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__8__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__9"
    // InternalBgDsl.g:5222:1: rule__IterativeFilter__Group__9 : rule__IterativeFilter__Group__9__Impl rule__IterativeFilter__Group__10 ;
    public final void rule__IterativeFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5226:1: ( rule__IterativeFilter__Group__9__Impl rule__IterativeFilter__Group__10 )
            // InternalBgDsl.g:5227:2: rule__IterativeFilter__Group__9__Impl rule__IterativeFilter__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__IterativeFilter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__9"


    // $ANTLR start "rule__IterativeFilter__Group__9__Impl"
    // InternalBgDsl.g:5234:1: rule__IterativeFilter__Group__9__Impl : ( ( rule__IterativeFilter__EndRuleAssignment_9 ) ) ;
    public final void rule__IterativeFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5238:1: ( ( ( rule__IterativeFilter__EndRuleAssignment_9 ) ) )
            // InternalBgDsl.g:5239:1: ( ( rule__IterativeFilter__EndRuleAssignment_9 ) )
            {
            // InternalBgDsl.g:5239:1: ( ( rule__IterativeFilter__EndRuleAssignment_9 ) )
            // InternalBgDsl.g:5240:2: ( rule__IterativeFilter__EndRuleAssignment_9 )
            {
             before(grammarAccess.getIterativeFilterAccess().getEndRuleAssignment_9()); 
            // InternalBgDsl.g:5241:2: ( rule__IterativeFilter__EndRuleAssignment_9 )
            // InternalBgDsl.g:5241:3: rule__IterativeFilter__EndRuleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__EndRuleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getEndRuleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__9__Impl"


    // $ANTLR start "rule__IterativeFilter__Group__10"
    // InternalBgDsl.g:5249:1: rule__IterativeFilter__Group__10 : rule__IterativeFilter__Group__10__Impl ;
    public final void rule__IterativeFilter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5253:1: ( rule__IterativeFilter__Group__10__Impl )
            // InternalBgDsl.g:5254:2: rule__IterativeFilter__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__10"


    // $ANTLR start "rule__IterativeFilter__Group__10__Impl"
    // InternalBgDsl.g:5260:1: rule__IterativeFilter__Group__10__Impl : ( '}' ) ;
    public final void rule__IterativeFilter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5264:1: ( ( '}' ) )
            // InternalBgDsl.g:5265:1: ( '}' )
            {
            // InternalBgDsl.g:5265:1: ( '}' )
            // InternalBgDsl.g:5266:2: '}'
            {
             before(grammarAccess.getIterativeFilterAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group__10__Impl"


    // $ANTLR start "rule__IterativeFilter__Group_3__0"
    // InternalBgDsl.g:5276:1: rule__IterativeFilter__Group_3__0 : rule__IterativeFilter__Group_3__0__Impl rule__IterativeFilter__Group_3__1 ;
    public final void rule__IterativeFilter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5280:1: ( rule__IterativeFilter__Group_3__0__Impl rule__IterativeFilter__Group_3__1 )
            // InternalBgDsl.g:5281:2: rule__IterativeFilter__Group_3__0__Impl rule__IterativeFilter__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__IterativeFilter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group_3__0"


    // $ANTLR start "rule__IterativeFilter__Group_3__0__Impl"
    // InternalBgDsl.g:5288:1: rule__IterativeFilter__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__IterativeFilter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5292:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:5293:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:5293:1: ( 'nextFilter' )
            // InternalBgDsl.g:5294:2: 'nextFilter'
            {
             before(grammarAccess.getIterativeFilterAccess().getNextFilterKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getIterativeFilterAccess().getNextFilterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group_3__0__Impl"


    // $ANTLR start "rule__IterativeFilter__Group_3__1"
    // InternalBgDsl.g:5303:1: rule__IterativeFilter__Group_3__1 : rule__IterativeFilter__Group_3__1__Impl ;
    public final void rule__IterativeFilter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5307:1: ( rule__IterativeFilter__Group_3__1__Impl )
            // InternalBgDsl.g:5308:2: rule__IterativeFilter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group_3__1"


    // $ANTLR start "rule__IterativeFilter__Group_3__1__Impl"
    // InternalBgDsl.g:5314:1: rule__IterativeFilter__Group_3__1__Impl : ( ( rule__IterativeFilter__NextFilterAssignment_3_1 ) ) ;
    public final void rule__IterativeFilter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5318:1: ( ( ( rule__IterativeFilter__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:5319:1: ( ( rule__IterativeFilter__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:5319:1: ( ( rule__IterativeFilter__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:5320:2: ( rule__IterativeFilter__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getIterativeFilterAccess().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:5321:2: ( rule__IterativeFilter__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:5321:3: rule__IterativeFilter__NextFilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IterativeFilter__NextFilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIterativeFilterAccess().getNextFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__Group_3__1__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__0"
    // InternalBgDsl.g:5330:1: rule__StateEffectFilter__Group__0 : rule__StateEffectFilter__Group__0__Impl rule__StateEffectFilter__Group__1 ;
    public final void rule__StateEffectFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5334:1: ( rule__StateEffectFilter__Group__0__Impl rule__StateEffectFilter__Group__1 )
            // InternalBgDsl.g:5335:2: rule__StateEffectFilter__Group__0__Impl rule__StateEffectFilter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateEffectFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__0"


    // $ANTLR start "rule__StateEffectFilter__Group__0__Impl"
    // InternalBgDsl.g:5342:1: rule__StateEffectFilter__Group__0__Impl : ( 'StateEffectFilter' ) ;
    public final void rule__StateEffectFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5346:1: ( ( 'StateEffectFilter' ) )
            // InternalBgDsl.g:5347:1: ( 'StateEffectFilter' )
            {
            // InternalBgDsl.g:5347:1: ( 'StateEffectFilter' )
            // InternalBgDsl.g:5348:2: 'StateEffectFilter'
            {
             before(grammarAccess.getStateEffectFilterAccess().getStateEffectFilterKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getStateEffectFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__0__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__1"
    // InternalBgDsl.g:5357:1: rule__StateEffectFilter__Group__1 : rule__StateEffectFilter__Group__1__Impl rule__StateEffectFilter__Group__2 ;
    public final void rule__StateEffectFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5361:1: ( rule__StateEffectFilter__Group__1__Impl rule__StateEffectFilter__Group__2 )
            // InternalBgDsl.g:5362:2: rule__StateEffectFilter__Group__1__Impl rule__StateEffectFilter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateEffectFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__1"


    // $ANTLR start "rule__StateEffectFilter__Group__1__Impl"
    // InternalBgDsl.g:5369:1: rule__StateEffectFilter__Group__1__Impl : ( ( rule__StateEffectFilter__NameAssignment_1 ) ) ;
    public final void rule__StateEffectFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5373:1: ( ( ( rule__StateEffectFilter__NameAssignment_1 ) ) )
            // InternalBgDsl.g:5374:1: ( ( rule__StateEffectFilter__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:5374:1: ( ( rule__StateEffectFilter__NameAssignment_1 ) )
            // InternalBgDsl.g:5375:2: ( rule__StateEffectFilter__NameAssignment_1 )
            {
             before(grammarAccess.getStateEffectFilterAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:5376:2: ( rule__StateEffectFilter__NameAssignment_1 )
            // InternalBgDsl.g:5376:3: rule__StateEffectFilter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateEffectFilterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__1__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__2"
    // InternalBgDsl.g:5384:1: rule__StateEffectFilter__Group__2 : rule__StateEffectFilter__Group__2__Impl rule__StateEffectFilter__Group__3 ;
    public final void rule__StateEffectFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5388:1: ( rule__StateEffectFilter__Group__2__Impl rule__StateEffectFilter__Group__3 )
            // InternalBgDsl.g:5389:2: rule__StateEffectFilter__Group__2__Impl rule__StateEffectFilter__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__StateEffectFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__2"


    // $ANTLR start "rule__StateEffectFilter__Group__2__Impl"
    // InternalBgDsl.g:5396:1: rule__StateEffectFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__StateEffectFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5400:1: ( ( '{' ) )
            // InternalBgDsl.g:5401:1: ( '{' )
            {
            // InternalBgDsl.g:5401:1: ( '{' )
            // InternalBgDsl.g:5402:2: '{'
            {
             before(grammarAccess.getStateEffectFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__2__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__3"
    // InternalBgDsl.g:5411:1: rule__StateEffectFilter__Group__3 : rule__StateEffectFilter__Group__3__Impl rule__StateEffectFilter__Group__4 ;
    public final void rule__StateEffectFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5415:1: ( rule__StateEffectFilter__Group__3__Impl rule__StateEffectFilter__Group__4 )
            // InternalBgDsl.g:5416:2: rule__StateEffectFilter__Group__3__Impl rule__StateEffectFilter__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__StateEffectFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__3"


    // $ANTLR start "rule__StateEffectFilter__Group__3__Impl"
    // InternalBgDsl.g:5423:1: rule__StateEffectFilter__Group__3__Impl : ( 'stateSelection' ) ;
    public final void rule__StateEffectFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5427:1: ( ( 'stateSelection' ) )
            // InternalBgDsl.g:5428:1: ( 'stateSelection' )
            {
            // InternalBgDsl.g:5428:1: ( 'stateSelection' )
            // InternalBgDsl.g:5429:2: 'stateSelection'
            {
             before(grammarAccess.getStateEffectFilterAccess().getStateSelectionKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getStateSelectionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__3__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__4"
    // InternalBgDsl.g:5438:1: rule__StateEffectFilter__Group__4 : rule__StateEffectFilter__Group__4__Impl rule__StateEffectFilter__Group__5 ;
    public final void rule__StateEffectFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5442:1: ( rule__StateEffectFilter__Group__4__Impl rule__StateEffectFilter__Group__5 )
            // InternalBgDsl.g:5443:2: rule__StateEffectFilter__Group__4__Impl rule__StateEffectFilter__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__StateEffectFilter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__4"


    // $ANTLR start "rule__StateEffectFilter__Group__4__Impl"
    // InternalBgDsl.g:5450:1: rule__StateEffectFilter__Group__4__Impl : ( ( rule__StateEffectFilter__StateSelectionAssignment_4 ) ) ;
    public final void rule__StateEffectFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5454:1: ( ( ( rule__StateEffectFilter__StateSelectionAssignment_4 ) ) )
            // InternalBgDsl.g:5455:1: ( ( rule__StateEffectFilter__StateSelectionAssignment_4 ) )
            {
            // InternalBgDsl.g:5455:1: ( ( rule__StateEffectFilter__StateSelectionAssignment_4 ) )
            // InternalBgDsl.g:5456:2: ( rule__StateEffectFilter__StateSelectionAssignment_4 )
            {
             before(grammarAccess.getStateEffectFilterAccess().getStateSelectionAssignment_4()); 
            // InternalBgDsl.g:5457:2: ( rule__StateEffectFilter__StateSelectionAssignment_4 )
            // InternalBgDsl.g:5457:3: rule__StateEffectFilter__StateSelectionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__StateSelectionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateEffectFilterAccess().getStateSelectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__4__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__5"
    // InternalBgDsl.g:5465:1: rule__StateEffectFilter__Group__5 : rule__StateEffectFilter__Group__5__Impl rule__StateEffectFilter__Group__6 ;
    public final void rule__StateEffectFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5469:1: ( rule__StateEffectFilter__Group__5__Impl rule__StateEffectFilter__Group__6 )
            // InternalBgDsl.g:5470:2: rule__StateEffectFilter__Group__5__Impl rule__StateEffectFilter__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__StateEffectFilter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__5"


    // $ANTLR start "rule__StateEffectFilter__Group__5__Impl"
    // InternalBgDsl.g:5477:1: rule__StateEffectFilter__Group__5__Impl : ( ( rule__StateEffectFilter__Group_5__0 )? ) ;
    public final void rule__StateEffectFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5481:1: ( ( ( rule__StateEffectFilter__Group_5__0 )? ) )
            // InternalBgDsl.g:5482:1: ( ( rule__StateEffectFilter__Group_5__0 )? )
            {
            // InternalBgDsl.g:5482:1: ( ( rule__StateEffectFilter__Group_5__0 )? )
            // InternalBgDsl.g:5483:2: ( rule__StateEffectFilter__Group_5__0 )?
            {
             before(grammarAccess.getStateEffectFilterAccess().getGroup_5()); 
            // InternalBgDsl.g:5484:2: ( rule__StateEffectFilter__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBgDsl.g:5484:3: rule__StateEffectFilter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateEffectFilter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateEffectFilterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__5__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__6"
    // InternalBgDsl.g:5492:1: rule__StateEffectFilter__Group__6 : rule__StateEffectFilter__Group__6__Impl rule__StateEffectFilter__Group__7 ;
    public final void rule__StateEffectFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5496:1: ( rule__StateEffectFilter__Group__6__Impl rule__StateEffectFilter__Group__7 )
            // InternalBgDsl.g:5497:2: rule__StateEffectFilter__Group__6__Impl rule__StateEffectFilter__Group__7
            {
            pushFollow(FOLLOW_50);
            rule__StateEffectFilter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__6"


    // $ANTLR start "rule__StateEffectFilter__Group__6__Impl"
    // InternalBgDsl.g:5504:1: rule__StateEffectFilter__Group__6__Impl : ( ( rule__StateEffectFilter__Group_6__0 )? ) ;
    public final void rule__StateEffectFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5508:1: ( ( ( rule__StateEffectFilter__Group_6__0 )? ) )
            // InternalBgDsl.g:5509:1: ( ( rule__StateEffectFilter__Group_6__0 )? )
            {
            // InternalBgDsl.g:5509:1: ( ( rule__StateEffectFilter__Group_6__0 )? )
            // InternalBgDsl.g:5510:2: ( rule__StateEffectFilter__Group_6__0 )?
            {
             before(grammarAccess.getStateEffectFilterAccess().getGroup_6()); 
            // InternalBgDsl.g:5511:2: ( rule__StateEffectFilter__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBgDsl.g:5511:3: rule__StateEffectFilter__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateEffectFilter__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateEffectFilterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__6__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group__7"
    // InternalBgDsl.g:5519:1: rule__StateEffectFilter__Group__7 : rule__StateEffectFilter__Group__7__Impl ;
    public final void rule__StateEffectFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5523:1: ( rule__StateEffectFilter__Group__7__Impl )
            // InternalBgDsl.g:5524:2: rule__StateEffectFilter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__7"


    // $ANTLR start "rule__StateEffectFilter__Group__7__Impl"
    // InternalBgDsl.g:5530:1: rule__StateEffectFilter__Group__7__Impl : ( '}' ) ;
    public final void rule__StateEffectFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5534:1: ( ( '}' ) )
            // InternalBgDsl.g:5535:1: ( '}' )
            {
            // InternalBgDsl.g:5535:1: ( '}' )
            // InternalBgDsl.g:5536:2: '}'
            {
             before(grammarAccess.getStateEffectFilterAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group__7__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group_5__0"
    // InternalBgDsl.g:5546:1: rule__StateEffectFilter__Group_5__0 : rule__StateEffectFilter__Group_5__0__Impl rule__StateEffectFilter__Group_5__1 ;
    public final void rule__StateEffectFilter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5550:1: ( rule__StateEffectFilter__Group_5__0__Impl rule__StateEffectFilter__Group_5__1 )
            // InternalBgDsl.g:5551:2: rule__StateEffectFilter__Group_5__0__Impl rule__StateEffectFilter__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__StateEffectFilter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_5__0"


    // $ANTLR start "rule__StateEffectFilter__Group_5__0__Impl"
    // InternalBgDsl.g:5558:1: rule__StateEffectFilter__Group_5__0__Impl : ( 'targetState' ) ;
    public final void rule__StateEffectFilter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5562:1: ( ( 'targetState' ) )
            // InternalBgDsl.g:5563:1: ( 'targetState' )
            {
            // InternalBgDsl.g:5563:1: ( 'targetState' )
            // InternalBgDsl.g:5564:2: 'targetState'
            {
             before(grammarAccess.getStateEffectFilterAccess().getTargetStateKeyword_5_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getTargetStateKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_5__0__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group_5__1"
    // InternalBgDsl.g:5573:1: rule__StateEffectFilter__Group_5__1 : rule__StateEffectFilter__Group_5__1__Impl ;
    public final void rule__StateEffectFilter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5577:1: ( rule__StateEffectFilter__Group_5__1__Impl )
            // InternalBgDsl.g:5578:2: rule__StateEffectFilter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_5__1"


    // $ANTLR start "rule__StateEffectFilter__Group_5__1__Impl"
    // InternalBgDsl.g:5584:1: rule__StateEffectFilter__Group_5__1__Impl : ( ( rule__StateEffectFilter__TargetStateAssignment_5_1 ) ) ;
    public final void rule__StateEffectFilter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5588:1: ( ( ( rule__StateEffectFilter__TargetStateAssignment_5_1 ) ) )
            // InternalBgDsl.g:5589:1: ( ( rule__StateEffectFilter__TargetStateAssignment_5_1 ) )
            {
            // InternalBgDsl.g:5589:1: ( ( rule__StateEffectFilter__TargetStateAssignment_5_1 ) )
            // InternalBgDsl.g:5590:2: ( rule__StateEffectFilter__TargetStateAssignment_5_1 )
            {
             before(grammarAccess.getStateEffectFilterAccess().getTargetStateAssignment_5_1()); 
            // InternalBgDsl.g:5591:2: ( rule__StateEffectFilter__TargetStateAssignment_5_1 )
            // InternalBgDsl.g:5591:3: rule__StateEffectFilter__TargetStateAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__TargetStateAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStateEffectFilterAccess().getTargetStateAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_5__1__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group_6__0"
    // InternalBgDsl.g:5600:1: rule__StateEffectFilter__Group_6__0 : rule__StateEffectFilter__Group_6__0__Impl rule__StateEffectFilter__Group_6__1 ;
    public final void rule__StateEffectFilter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5604:1: ( rule__StateEffectFilter__Group_6__0__Impl rule__StateEffectFilter__Group_6__1 )
            // InternalBgDsl.g:5605:2: rule__StateEffectFilter__Group_6__0__Impl rule__StateEffectFilter__Group_6__1
            {
            pushFollow(FOLLOW_33);
            rule__StateEffectFilter__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_6__0"


    // $ANTLR start "rule__StateEffectFilter__Group_6__0__Impl"
    // InternalBgDsl.g:5612:1: rule__StateEffectFilter__Group_6__0__Impl : ( 'nextFilter' ) ;
    public final void rule__StateEffectFilter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5616:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:5617:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:5617:1: ( 'nextFilter' )
            // InternalBgDsl.g:5618:2: 'nextFilter'
            {
             before(grammarAccess.getStateEffectFilterAccess().getNextFilterKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getStateEffectFilterAccess().getNextFilterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_6__0__Impl"


    // $ANTLR start "rule__StateEffectFilter__Group_6__1"
    // InternalBgDsl.g:5627:1: rule__StateEffectFilter__Group_6__1 : rule__StateEffectFilter__Group_6__1__Impl ;
    public final void rule__StateEffectFilter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5631:1: ( rule__StateEffectFilter__Group_6__1__Impl )
            // InternalBgDsl.g:5632:2: rule__StateEffectFilter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_6__1"


    // $ANTLR start "rule__StateEffectFilter__Group_6__1__Impl"
    // InternalBgDsl.g:5638:1: rule__StateEffectFilter__Group_6__1__Impl : ( ( rule__StateEffectFilter__NextFilterAssignment_6_1 ) ) ;
    public final void rule__StateEffectFilter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5642:1: ( ( ( rule__StateEffectFilter__NextFilterAssignment_6_1 ) ) )
            // InternalBgDsl.g:5643:1: ( ( rule__StateEffectFilter__NextFilterAssignment_6_1 ) )
            {
            // InternalBgDsl.g:5643:1: ( ( rule__StateEffectFilter__NextFilterAssignment_6_1 ) )
            // InternalBgDsl.g:5644:2: ( rule__StateEffectFilter__NextFilterAssignment_6_1 )
            {
             before(grammarAccess.getStateEffectFilterAccess().getNextFilterAssignment_6_1()); 
            // InternalBgDsl.g:5645:2: ( rule__StateEffectFilter__NextFilterAssignment_6_1 )
            // InternalBgDsl.g:5645:3: rule__StateEffectFilter__NextFilterAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StateEffectFilter__NextFilterAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStateEffectFilterAccess().getNextFilterAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__Group_6__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalBgDsl.g:5654:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5658:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalBgDsl.g:5659:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalBgDsl.g:5666:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5670:1: ( ( 'Pattern' ) )
            // InternalBgDsl.g:5671:1: ( 'Pattern' )
            {
            // InternalBgDsl.g:5671:1: ( 'Pattern' )
            // InternalBgDsl.g:5672:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalBgDsl.g:5681:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5685:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalBgDsl.g:5686:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalBgDsl.g:5693:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5697:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalBgDsl.g:5698:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:5698:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalBgDsl.g:5699:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:5700:2: ( rule__Pattern__NameAssignment_1 )
            // InternalBgDsl.g:5700:3: rule__Pattern__NameAssignment_1
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
    // InternalBgDsl.g:5708:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5712:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalBgDsl.g:5713:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalBgDsl.g:5720:1: rule__Pattern__Group__2__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5724:1: ( ( '{' ) )
            // InternalBgDsl.g:5725:1: ( '{' )
            {
            // InternalBgDsl.g:5725:1: ( '{' )
            // InternalBgDsl.g:5726:2: '{'
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
    // InternalBgDsl.g:5735:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5739:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalBgDsl.g:5740:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalBgDsl.g:5747:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__Group_3__0 )? ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5751:1: ( ( ( rule__Pattern__Group_3__0 )? ) )
            // InternalBgDsl.g:5752:1: ( ( rule__Pattern__Group_3__0 )? )
            {
            // InternalBgDsl.g:5752:1: ( ( rule__Pattern__Group_3__0 )? )
            // InternalBgDsl.g:5753:2: ( rule__Pattern__Group_3__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_3()); 
            // InternalBgDsl.g:5754:2: ( rule__Pattern__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBgDsl.g:5754:3: rule__Pattern__Group_3__0
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
    // InternalBgDsl.g:5762:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5766:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalBgDsl.g:5767:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalBgDsl.g:5774:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5778:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalBgDsl.g:5779:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalBgDsl.g:5779:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalBgDsl.g:5780:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalBgDsl.g:5781:2: ( rule__Pattern__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==67) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBgDsl.g:5781:3: rule__Pattern__Group_4__0
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
    // InternalBgDsl.g:5789:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5793:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalBgDsl.g:5794:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalBgDsl.g:5801:1: rule__Pattern__Group__5__Impl : ( 'relativecoordinates' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5805:1: ( ( 'relativecoordinates' ) )
            // InternalBgDsl.g:5806:1: ( 'relativecoordinates' )
            {
            // InternalBgDsl.g:5806:1: ( 'relativecoordinates' )
            // InternalBgDsl.g:5807:2: 'relativecoordinates'
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5()); 
            match(input,66,FOLLOW_2); 
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
    // InternalBgDsl.g:5816:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5820:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalBgDsl.g:5821:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
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
    // InternalBgDsl.g:5828:1: rule__Pattern__Group__6__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5832:1: ( ( '{' ) )
            // InternalBgDsl.g:5833:1: ( '{' )
            {
            // InternalBgDsl.g:5833:1: ( '{' )
            // InternalBgDsl.g:5834:2: '{'
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
    // InternalBgDsl.g:5843:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5847:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalBgDsl.g:5848:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:5855:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5859:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) )
            // InternalBgDsl.g:5860:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            {
            // InternalBgDsl.g:5860:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            // InternalBgDsl.g:5861:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_7()); 
            // InternalBgDsl.g:5862:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            // InternalBgDsl.g:5862:3: rule__Pattern__RelativecoordinatesAssignment_7
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
    // InternalBgDsl.g:5870:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl rule__Pattern__Group__9 ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5874:1: ( rule__Pattern__Group__8__Impl rule__Pattern__Group__9 )
            // InternalBgDsl.g:5875:2: rule__Pattern__Group__8__Impl rule__Pattern__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalBgDsl.g:5882:1: rule__Pattern__Group__8__Impl : ( ( rule__Pattern__Group_8__0 )* ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5886:1: ( ( ( rule__Pattern__Group_8__0 )* ) )
            // InternalBgDsl.g:5887:1: ( ( rule__Pattern__Group_8__0 )* )
            {
            // InternalBgDsl.g:5887:1: ( ( rule__Pattern__Group_8__0 )* )
            // InternalBgDsl.g:5888:2: ( rule__Pattern__Group_8__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_8()); 
            // InternalBgDsl.g:5889:2: ( rule__Pattern__Group_8__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBgDsl.g:5889:3: rule__Pattern__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Pattern__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalBgDsl.g:5897:1: rule__Pattern__Group__9 : rule__Pattern__Group__9__Impl rule__Pattern__Group__10 ;
    public final void rule__Pattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5901:1: ( rule__Pattern__Group__9__Impl rule__Pattern__Group__10 )
            // InternalBgDsl.g:5902:2: rule__Pattern__Group__9__Impl rule__Pattern__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:5909:1: rule__Pattern__Group__9__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5913:1: ( ( '}' ) )
            // InternalBgDsl.g:5914:1: ( '}' )
            {
            // InternalBgDsl.g:5914:1: ( '}' )
            // InternalBgDsl.g:5915:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:5924:1: rule__Pattern__Group__10 : rule__Pattern__Group__10__Impl ;
    public final void rule__Pattern__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5928:1: ( rule__Pattern__Group__10__Impl )
            // InternalBgDsl.g:5929:2: rule__Pattern__Group__10__Impl
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
    // InternalBgDsl.g:5935:1: rule__Pattern__Group__10__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5939:1: ( ( '}' ) )
            // InternalBgDsl.g:5940:1: ( '}' )
            {
            // InternalBgDsl.g:5940:1: ( '}' )
            // InternalBgDsl.g:5941:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:5951:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5955:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalBgDsl.g:5956:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalBgDsl.g:5963:1: rule__Pattern__Group_3__0__Impl : ( 'stateSelection' ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5967:1: ( ( 'stateSelection' ) )
            // InternalBgDsl.g:5968:1: ( 'stateSelection' )
            {
            // InternalBgDsl.g:5968:1: ( 'stateSelection' )
            // InternalBgDsl.g:5969:2: 'stateSelection'
            {
             before(grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBgDsl.g:5978:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5982:1: ( rule__Pattern__Group_3__1__Impl )
            // InternalBgDsl.g:5983:2: rule__Pattern__Group_3__1__Impl
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
    // InternalBgDsl.g:5989:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5993:1: ( ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) )
            // InternalBgDsl.g:5994:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            {
            // InternalBgDsl.g:5994:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            // InternalBgDsl.g:5995:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            {
             before(grammarAccess.getPatternAccess().getStateSelectionAssignment_3_1()); 
            // InternalBgDsl.g:5996:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            // InternalBgDsl.g:5996:3: rule__Pattern__StateSelectionAssignment_3_1
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
    // InternalBgDsl.g:6005:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6009:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalBgDsl.g:6010:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
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
    // InternalBgDsl.g:6017:1: rule__Pattern__Group_4__0__Impl : ( 'matchState' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6021:1: ( ( 'matchState' ) )
            // InternalBgDsl.g:6022:1: ( 'matchState' )
            {
            // InternalBgDsl.g:6022:1: ( 'matchState' )
            // InternalBgDsl.g:6023:2: 'matchState'
            {
             before(grammarAccess.getPatternAccess().getMatchStateKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalBgDsl.g:6032:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6036:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalBgDsl.g:6037:2: rule__Pattern__Group_4__1__Impl
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
    // InternalBgDsl.g:6043:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6047:1: ( ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) )
            // InternalBgDsl.g:6048:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            {
            // InternalBgDsl.g:6048:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            // InternalBgDsl.g:6049:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getMatchStateAssignment_4_1()); 
            // InternalBgDsl.g:6050:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            // InternalBgDsl.g:6050:3: rule__Pattern__MatchStateAssignment_4_1
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
    // InternalBgDsl.g:6059:1: rule__Pattern__Group_8__0 : rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 ;
    public final void rule__Pattern__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6063:1: ( rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 )
            // InternalBgDsl.g:6064:2: rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1
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
    // InternalBgDsl.g:6071:1: rule__Pattern__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6075:1: ( ( ',' ) )
            // InternalBgDsl.g:6076:1: ( ',' )
            {
            // InternalBgDsl.g:6076:1: ( ',' )
            // InternalBgDsl.g:6077:2: ','
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
    // InternalBgDsl.g:6086:1: rule__Pattern__Group_8__1 : rule__Pattern__Group_8__1__Impl ;
    public final void rule__Pattern__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6090:1: ( rule__Pattern__Group_8__1__Impl )
            // InternalBgDsl.g:6091:2: rule__Pattern__Group_8__1__Impl
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
    // InternalBgDsl.g:6097:1: rule__Pattern__Group_8__1__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) ;
    public final void rule__Pattern__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6101:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) )
            // InternalBgDsl.g:6102:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            {
            // InternalBgDsl.g:6102:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            // InternalBgDsl.g:6103:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_8_1()); 
            // InternalBgDsl.g:6104:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            // InternalBgDsl.g:6104:3: rule__Pattern__RelativecoordinatesAssignment_8_1
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
    // InternalBgDsl.g:6113:1: rule__RelativeCoordinate__Group__0 : rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 ;
    public final void rule__RelativeCoordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6117:1: ( rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 )
            // InternalBgDsl.g:6118:2: rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1
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
    // InternalBgDsl.g:6125:1: rule__RelativeCoordinate__Group__0__Impl : ( 'RelativeCoordinate' ) ;
    public final void rule__RelativeCoordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6129:1: ( ( 'RelativeCoordinate' ) )
            // InternalBgDsl.g:6130:1: ( 'RelativeCoordinate' )
            {
            // InternalBgDsl.g:6130:1: ( 'RelativeCoordinate' )
            // InternalBgDsl.g:6131:2: 'RelativeCoordinate'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalBgDsl.g:6140:1: rule__RelativeCoordinate__Group__1 : rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 ;
    public final void rule__RelativeCoordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6144:1: ( rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 )
            // InternalBgDsl.g:6145:2: rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalBgDsl.g:6152:1: rule__RelativeCoordinate__Group__1__Impl : ( '{' ) ;
    public final void rule__RelativeCoordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6156:1: ( ( '{' ) )
            // InternalBgDsl.g:6157:1: ( '{' )
            {
            // InternalBgDsl.g:6157:1: ( '{' )
            // InternalBgDsl.g:6158:2: '{'
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
    // InternalBgDsl.g:6167:1: rule__RelativeCoordinate__Group__2 : rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 ;
    public final void rule__RelativeCoordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6171:1: ( rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 )
            // InternalBgDsl.g:6172:2: rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:6179:1: rule__RelativeCoordinate__Group__2__Impl : ( 'x' ) ;
    public final void rule__RelativeCoordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6183:1: ( ( 'x' ) )
            // InternalBgDsl.g:6184:1: ( 'x' )
            {
            // InternalBgDsl.g:6184:1: ( 'x' )
            // InternalBgDsl.g:6185:2: 'x'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalBgDsl.g:6194:1: rule__RelativeCoordinate__Group__3 : rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 ;
    public final void rule__RelativeCoordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6198:1: ( rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 )
            // InternalBgDsl.g:6199:2: rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalBgDsl.g:6206:1: rule__RelativeCoordinate__Group__3__Impl : ( ( rule__RelativeCoordinate__XAssignment_3 ) ) ;
    public final void rule__RelativeCoordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6210:1: ( ( ( rule__RelativeCoordinate__XAssignment_3 ) ) )
            // InternalBgDsl.g:6211:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            {
            // InternalBgDsl.g:6211:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            // InternalBgDsl.g:6212:2: ( rule__RelativeCoordinate__XAssignment_3 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXAssignment_3()); 
            // InternalBgDsl.g:6213:2: ( rule__RelativeCoordinate__XAssignment_3 )
            // InternalBgDsl.g:6213:3: rule__RelativeCoordinate__XAssignment_3
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
    // InternalBgDsl.g:6221:1: rule__RelativeCoordinate__Group__4 : rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 ;
    public final void rule__RelativeCoordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6225:1: ( rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 )
            // InternalBgDsl.g:6226:2: rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalBgDsl.g:6233:1: rule__RelativeCoordinate__Group__4__Impl : ( 'y' ) ;
    public final void rule__RelativeCoordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6237:1: ( ( 'y' ) )
            // InternalBgDsl.g:6238:1: ( 'y' )
            {
            // InternalBgDsl.g:6238:1: ( 'y' )
            // InternalBgDsl.g:6239:2: 'y'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYKeyword_4()); 
            match(input,70,FOLLOW_2); 
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
    // InternalBgDsl.g:6248:1: rule__RelativeCoordinate__Group__5 : rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 ;
    public final void rule__RelativeCoordinate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6252:1: ( rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 )
            // InternalBgDsl.g:6253:2: rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalBgDsl.g:6260:1: rule__RelativeCoordinate__Group__5__Impl : ( ( rule__RelativeCoordinate__YAssignment_5 ) ) ;
    public final void rule__RelativeCoordinate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6264:1: ( ( ( rule__RelativeCoordinate__YAssignment_5 ) ) )
            // InternalBgDsl.g:6265:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            {
            // InternalBgDsl.g:6265:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            // InternalBgDsl.g:6266:2: ( rule__RelativeCoordinate__YAssignment_5 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYAssignment_5()); 
            // InternalBgDsl.g:6267:2: ( rule__RelativeCoordinate__YAssignment_5 )
            // InternalBgDsl.g:6267:3: rule__RelativeCoordinate__YAssignment_5
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
    // InternalBgDsl.g:6275:1: rule__RelativeCoordinate__Group__6 : rule__RelativeCoordinate__Group__6__Impl ;
    public final void rule__RelativeCoordinate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6279:1: ( rule__RelativeCoordinate__Group__6__Impl )
            // InternalBgDsl.g:6280:2: rule__RelativeCoordinate__Group__6__Impl
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
    // InternalBgDsl.g:6286:1: rule__RelativeCoordinate__Group__6__Impl : ( '}' ) ;
    public final void rule__RelativeCoordinate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6290:1: ( ( '}' ) )
            // InternalBgDsl.g:6291:1: ( '}' )
            {
            // InternalBgDsl.g:6291:1: ( '}' )
            // InternalBgDsl.g:6292:2: '}'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBgDsl.g:6302:1: rule__Game__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6306:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6307:2: ( ruleEString )
            {
            // InternalBgDsl.g:6307:2: ( ruleEString )
            // InternalBgDsl.g:6308:3: ruleEString
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


    // $ANTLR start "rule__Game__TurnPolicyAssignment_4"
    // InternalBgDsl.g:6317:1: rule__Game__TurnPolicyAssignment_4 : ( ruleTurnType ) ;
    public final void rule__Game__TurnPolicyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6321:1: ( ( ruleTurnType ) )
            // InternalBgDsl.g:6322:2: ( ruleTurnType )
            {
            // InternalBgDsl.g:6322:2: ( ruleTurnType )
            // InternalBgDsl.g:6323:3: ruleTurnType
            {
             before(grammarAccess.getGameAccess().getTurnPolicyTurnTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnType();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTurnPolicyTurnTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TurnPolicyAssignment_4"


    // $ANTLR start "rule__Game__InitialPlayerAssignment_6"
    // InternalBgDsl.g:6332:1: rule__Game__InitialPlayerAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Game__InitialPlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6336:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6337:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6337:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6338:3: ( ruleEString )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_6_0()); 
            // InternalBgDsl.g:6339:3: ( ruleEString )
            // InternalBgDsl.g:6340:4: ruleEString
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getInitialPlayerPlayerEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__InitialPlayerAssignment_6"


    // $ANTLR start "rule__Game__BoardAssignment_8"
    // InternalBgDsl.g:6351:1: rule__Game__BoardAssignment_8 : ( ruleBoard ) ;
    public final void rule__Game__BoardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6355:1: ( ( ruleBoard ) )
            // InternalBgDsl.g:6356:2: ( ruleBoard )
            {
            // InternalBgDsl.g:6356:2: ( ruleBoard )
            // InternalBgDsl.g:6357:3: ruleBoard
            {
             before(grammarAccess.getGameAccess().getBoardBoardParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getGameAccess().getBoardBoardParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__BoardAssignment_8"


    // $ANTLR start "rule__Game__PlayersAssignment_11"
    // InternalBgDsl.g:6366:1: rule__Game__PlayersAssignment_11 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6370:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:6371:2: ( rulePlayer )
            {
            // InternalBgDsl.g:6371:2: ( rulePlayer )
            // InternalBgDsl.g:6372:3: rulePlayer
            {
             before(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__PlayersAssignment_11"


    // $ANTLR start "rule__Game__PlayersAssignment_12_1"
    // InternalBgDsl.g:6381:1: rule__Game__PlayersAssignment_12_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6385:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:6386:2: ( rulePlayer )
            {
            // InternalBgDsl.g:6386:2: ( rulePlayer )
            // InternalBgDsl.g:6387:3: rulePlayer
            {
             before(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__PlayersAssignment_12_1"


    // $ANTLR start "rule__Board__CheckeredAssignment_0"
    // InternalBgDsl.g:6396:1: rule__Board__CheckeredAssignment_0 : ( ( 'checkered' ) ) ;
    public final void rule__Board__CheckeredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6400:1: ( ( ( 'checkered' ) ) )
            // InternalBgDsl.g:6401:2: ( ( 'checkered' ) )
            {
            // InternalBgDsl.g:6401:2: ( ( 'checkered' ) )
            // InternalBgDsl.g:6402:3: ( 'checkered' )
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            // InternalBgDsl.g:6403:3: ( 'checkered' )
            // InternalBgDsl.g:6404:4: 'checkered'
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalBgDsl.g:6415:1: rule__Board__WidthAssignment_4 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6419:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6420:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6420:2: ( ruleEInt )
            // InternalBgDsl.g:6421:3: ruleEInt
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
    // InternalBgDsl.g:6430:1: rule__Board__HeightAssignment_6 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6434:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6435:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6435:2: ( ruleEInt )
            // InternalBgDsl.g:6436:3: ruleEInt
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
    // InternalBgDsl.g:6445:1: rule__Board__TilesAssignment_9 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6449:1: ( ( ruleTile ) )
            // InternalBgDsl.g:6450:2: ( ruleTile )
            {
            // InternalBgDsl.g:6450:2: ( ruleTile )
            // InternalBgDsl.g:6451:3: ruleTile
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
    // InternalBgDsl.g:6460:1: rule__Board__TilesAssignment_10_1 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6464:1: ( ( ruleTile ) )
            // InternalBgDsl.g:6465:2: ( ruleTile )
            {
            // InternalBgDsl.g:6465:2: ( ruleTile )
            // InternalBgDsl.g:6466:3: ruleTile
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


    // $ANTLR start "rule__Board__LegalMovesPipelineAssignment_12_1"
    // InternalBgDsl.g:6475:1: rule__Board__LegalMovesPipelineAssignment_12_1 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6479:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:6480:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:6480:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:6481:3: ruleLegalMovesPipeline
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalMovesPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getLegalMovesPipelineLegalMovesPipelineParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__LegalMovesPipelineAssignment_12_1"


    // $ANTLR start "rule__Board__EffectPipelineAssignment_13_1"
    // InternalBgDsl.g:6490:1: rule__Board__EffectPipelineAssignment_13_1 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6494:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:6495:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:6495:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:6496:3: ruleEffectPipeline
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectPipeline();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getEffectPipelineEffectPipelineParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__EffectPipelineAssignment_13_1"


    // $ANTLR start "rule__Board__TileplacementAssignment_16"
    // InternalBgDsl.g:6505:1: rule__Board__TileplacementAssignment_16 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6509:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:6510:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:6510:2: ( ruleTilePlacement )
            // InternalBgDsl.g:6511:3: ruleTilePlacement
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
    // InternalBgDsl.g:6520:1: rule__Board__TileplacementAssignment_17_1 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6524:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:6525:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:6525:2: ( ruleTilePlacement )
            // InternalBgDsl.g:6526:3: ruleTilePlacement
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
    // InternalBgDsl.g:6535:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6539:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6540:2: ( ruleEString )
            {
            // InternalBgDsl.g:6540:2: ( ruleEString )
            // InternalBgDsl.g:6541:3: ruleEString
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
    // InternalBgDsl.g:6550:1: rule__Player__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Player__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6554:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6555:2: ( ruleEString )
            {
            // InternalBgDsl.g:6555:2: ( ruleEString )
            // InternalBgDsl.g:6556:3: ruleEString
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
    // InternalBgDsl.g:6565:1: rule__Player__AssociatedStateAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Player__AssociatedStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6569:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6570:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6570:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6571:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateStateCrossReference_6_0()); 
            // InternalBgDsl.g:6572:3: ( ruleEString )
            // InternalBgDsl.g:6573:4: ruleEString
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


    // $ANTLR start "rule__Tile__TileTypeAssignment_1"
    // InternalBgDsl.g:5616:1: rule__Tile__TileTypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Tile__TileTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6588:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6589:2: ( ruleEString )
            {
            // InternalBgDsl.g:6589:2: ( ruleEString )
            // InternalBgDsl.g:6590:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getTileTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTileTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__TileTypeAssignment_1"


    // $ANTLR start "rule__Tile__HexColorAssignment_4"
    // InternalBgDsl.g:6599:1: rule__Tile__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Tile__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6603:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6604:2: ( ruleEString )
            {
            // InternalBgDsl.g:6604:2: ( ruleEString )
            // InternalBgDsl.g:6605:3: ruleEString
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
    // InternalBgDsl.g:6614:1: rule__Tile__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Tile__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6618:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6619:2: ( ruleEString )
            {
            // InternalBgDsl.g:6619:2: ( ruleEString )
            // InternalBgDsl.g:6620:3: ruleEString
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
    // InternalBgDsl.g:6629:1: rule__Tile__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6633:1: ( ( ruleState ) )
            // InternalBgDsl.g:6634:2: ( ruleState )
            {
            // InternalBgDsl.g:6634:2: ( ruleState )
            // InternalBgDsl.g:6635:3: ruleState
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
    // InternalBgDsl.g:6644:1: rule__Tile__StatesAssignment_10_1 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6648:1: ( ( ruleState ) )
            // InternalBgDsl.g:6649:2: ( ruleState )
            {
            // InternalBgDsl.g:6649:2: ( ruleState )
            // InternalBgDsl.g:6650:3: ruleState
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
    // InternalBgDsl.g:6659:1: rule__Tile__TransitionsAssignment_12_2 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6663:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6664:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6664:2: ( ruleTransition )
            // InternalBgDsl.g:6665:3: ruleTransition
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
    // InternalBgDsl.g:6674:1: rule__Tile__TransitionsAssignment_12_3_1 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6678:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:6679:2: ( ruleTransition )
            {
            // InternalBgDsl.g:6679:2: ( ruleTransition )
            // InternalBgDsl.g:6680:3: ruleTransition
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
    // InternalBgDsl.g:6689:1: rule__Tile__InitialStateAssignment_14 : ( ruleState ) ;
    public final void rule__Tile__InitialStateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6693:1: ( ( ruleState ) )
            // InternalBgDsl.g:6694:2: ( ruleState )
            {
            // InternalBgDsl.g:6694:2: ( ruleState )
            // InternalBgDsl.g:6695:3: ruleState
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


    // $ANTLR start "rule__LegalMovesPipeline__FiltersAssignment_3_2"
    // InternalBgDsl.g:6704:1: rule__LegalMovesPipeline__FiltersAssignment_3_2 : ( ruleFilter ) ;
    public final void rule__LegalMovesPipeline__FiltersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6708:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6709:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6709:2: ( ruleFilter )
            // InternalBgDsl.g:6710:3: ruleFilter
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFiltersFilterParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getLegalMovesPipelineAccess().getFiltersFilterParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__FiltersAssignment_3_2"


    // $ANTLR start "rule__LegalMovesPipeline__FiltersAssignment_3_3_1"
    // InternalBgDsl.g:6719:1: rule__LegalMovesPipeline__FiltersAssignment_3_3_1 : ( ruleFilter ) ;
    public final void rule__LegalMovesPipeline__FiltersAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6723:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6724:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6724:2: ( ruleFilter )
            // InternalBgDsl.g:6725:3: ruleFilter
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFiltersFilterParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getLegalMovesPipelineAccess().getFiltersFilterParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalMovesPipeline__FiltersAssignment_3_3_1"


    // $ANTLR start "rule__EffectPipeline__FiltersAssignment_3_2"
    // InternalBgDsl.g:6734:1: rule__EffectPipeline__FiltersAssignment_3_2 : ( ruleFilter ) ;
    public final void rule__EffectPipeline__FiltersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6738:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6739:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6739:2: ( ruleFilter )
            // InternalBgDsl.g:6740:3: ruleFilter
            {
             before(grammarAccess.getEffectPipelineAccess().getFiltersFilterParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getEffectPipelineAccess().getFiltersFilterParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__FiltersAssignment_3_2"


    // $ANTLR start "rule__EffectPipeline__FiltersAssignment_3_3_1"
    // InternalBgDsl.g:6749:1: rule__EffectPipeline__FiltersAssignment_3_3_1 : ( ruleFilter ) ;
    public final void rule__EffectPipeline__FiltersAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6753:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6754:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6754:2: ( ruleFilter )
            // InternalBgDsl.g:6755:3: ruleFilter
            {
             before(grammarAccess.getEffectPipelineAccess().getFiltersFilterParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getEffectPipelineAccess().getFiltersFilterParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectPipeline__FiltersAssignment_3_3_1"


    // $ANTLR start "rule__TilePlacement__RowAssignment_3"
    // InternalBgDsl.g:6764:1: rule__TilePlacement__RowAssignment_3 : ( ruleEInt ) ;
    public final void rule__TilePlacement__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6768:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6769:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6769:2: ( ruleEInt )
            // InternalBgDsl.g:6770:3: ruleEInt
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
    // InternalBgDsl.g:6779:1: rule__TilePlacement__ColumnAssignment_5 : ( ruleEInt ) ;
    public final void rule__TilePlacement__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6783:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6784:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6784:2: ( ruleEInt )
            // InternalBgDsl.g:6785:3: ruleEInt
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
    // InternalBgDsl.g:6794:1: rule__TilePlacement__TileAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TilePlacement__TileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6798:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6799:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6799:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6800:3: ( ruleEString )
            {
             before(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0()); 
            // InternalBgDsl.g:6801:3: ( ruleEString )
            // InternalBgDsl.g:6802:4: ruleEString
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
    // InternalBgDsl.g:6813:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6817:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6818:2: ( ruleEString )
            {
            // InternalBgDsl.g:6818:2: ( ruleEString )
            // InternalBgDsl.g:6819:3: ruleEString
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
    // InternalBgDsl.g:6828:1: rule__State__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__State__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6832:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6833:2: ( ruleEString )
            {
            // InternalBgDsl.g:6833:2: ( ruleEString )
            // InternalBgDsl.g:6834:3: ruleEString
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
    // InternalBgDsl.g:6843:1: rule__State__OutboundAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6847:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6848:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6848:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6849:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0()); 
            // InternalBgDsl.g:6850:3: ( ruleEString )
            // InternalBgDsl.g:6851:4: ruleEString
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
    // InternalBgDsl.g:6862:1: rule__State__OutboundAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6866:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6867:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6867:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6868:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0()); 
            // InternalBgDsl.g:6869:3: ( ruleEString )
            // InternalBgDsl.g:6870:4: ruleEString
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
    // InternalBgDsl.g:6881:1: rule__State__InboundAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6885:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6886:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6886:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6887:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0()); 
            // InternalBgDsl.g:6888:3: ( ruleEString )
            // InternalBgDsl.g:6889:4: ruleEString
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
    // InternalBgDsl.g:6900:1: rule__State__InboundAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6904:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6905:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6905:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6906:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0()); 
            // InternalBgDsl.g:6907:3: ( ruleEString )
            // InternalBgDsl.g:6908:4: ruleEString
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
    // InternalBgDsl.g:6919:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6923:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6924:2: ( ruleEString )
            {
            // InternalBgDsl.g:6924:2: ( ruleEString )
            // InternalBgDsl.g:6925:3: ruleEString
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
    // InternalBgDsl.g:6934:1: rule__Transition__SourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6938:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6939:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6939:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6940:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            // InternalBgDsl.g:6941:3: ( ruleEString )
            // InternalBgDsl.g:6942:4: ruleEString
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
    // InternalBgDsl.g:6953:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6957:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6958:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6958:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6959:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 
            // InternalBgDsl.g:6960:3: ( ruleEString )
            // InternalBgDsl.g:6961:4: ruleEString
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
    // InternalBgDsl.g:6972:1: rule__Transition__TargetAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6976:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6977:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6977:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6978:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 
            // InternalBgDsl.g:6979:3: ( ruleEString )
            // InternalBgDsl.g:6980:4: ruleEString
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
    // InternalBgDsl.g:6991:1: rule__PatternFilter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PatternFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6995:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6996:2: ( ruleEString )
            {
            // InternalBgDsl.g:6996:2: ( ruleEString )
            // InternalBgDsl.g:6997:3: ruleEString
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
    // InternalBgDsl.g:7006:1: rule__PatternFilter__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__PatternFilter__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7010:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:7011:2: ( ruleFilter )
            {
            // InternalBgDsl.g:7011:2: ( ruleFilter )
            // InternalBgDsl.g:7012:3: ruleFilter
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
    // InternalBgDsl.g:7021:1: rule__PatternFilter__PatternsAssignment_6 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7025:1: ( ( rulePattern ) )
            // InternalBgDsl.g:7026:2: ( rulePattern )
            {
            // InternalBgDsl.g:7026:2: ( rulePattern )
            // InternalBgDsl.g:7027:3: rulePattern
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
    // InternalBgDsl.g:7036:1: rule__PatternFilter__PatternsAssignment_7_1 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7040:1: ( ( rulePattern ) )
            // InternalBgDsl.g:7041:2: ( rulePattern )
            {
            // InternalBgDsl.g:7041:2: ( rulePattern )
            // InternalBgDsl.g:7042:3: rulePattern
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


    // $ANTLR start "rule__IterativeFilter__NameAssignment_1"
    // InternalBgDsl.g:7051:1: rule__IterativeFilter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IterativeFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7055:1: ( ( ruleEString ) )
            // InternalBgDsl.g:7056:2: ( ruleEString )
            {
            // InternalBgDsl.g:7056:2: ( ruleEString )
            // InternalBgDsl.g:7057:3: ruleEString
            {
             before(grammarAccess.getIterativeFilterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIterativeFilterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__NameAssignment_1"


    // $ANTLR start "rule__IterativeFilter__NextFilterAssignment_3_1"
    // InternalBgDsl.g:7066:1: rule__IterativeFilter__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__IterativeFilter__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7070:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:7071:2: ( ruleFilter )
            {
            // InternalBgDsl.g:7071:2: ( ruleFilter )
            // InternalBgDsl.g:7072:3: ruleFilter
            {
             before(grammarAccess.getIterativeFilterAccess().getNextFilterFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getIterativeFilterAccess().getNextFilterFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__NextFilterAssignment_3_1"


    // $ANTLR start "rule__IterativeFilter__DirectionVectorAssignment_5"
    // InternalBgDsl.g:7081:1: rule__IterativeFilter__DirectionVectorAssignment_5 : ( ruleRelativeCoordinate ) ;
    public final void rule__IterativeFilter__DirectionVectorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7085:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:7086:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:7086:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:7087:3: ruleRelativeCoordinate
            {
             before(grammarAccess.getIterativeFilterAccess().getDirectionVectorRelativeCoordinateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeCoordinate();

            state._fsp--;

             after(grammarAccess.getIterativeFilterAccess().getDirectionVectorRelativeCoordinateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__DirectionVectorAssignment_5"


    // $ANTLR start "rule__IterativeFilter__MatchRuleAssignment_7"
    // InternalBgDsl.g:7096:1: rule__IterativeFilter__MatchRuleAssignment_7 : ( rulePattern ) ;
    public final void rule__IterativeFilter__MatchRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7100:1: ( ( rulePattern ) )
            // InternalBgDsl.g:7101:2: ( rulePattern )
            {
            // InternalBgDsl.g:7101:2: ( rulePattern )
            // InternalBgDsl.g:7102:3: rulePattern
            {
             before(grammarAccess.getIterativeFilterAccess().getMatchRulePatternParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getIterativeFilterAccess().getMatchRulePatternParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__MatchRuleAssignment_7"


    // $ANTLR start "rule__IterativeFilter__EndRuleAssignment_9"
    // InternalBgDsl.g:7111:1: rule__IterativeFilter__EndRuleAssignment_9 : ( rulePattern ) ;
    public final void rule__IterativeFilter__EndRuleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7115:1: ( ( rulePattern ) )
            // InternalBgDsl.g:7116:2: ( rulePattern )
            {
            // InternalBgDsl.g:7116:2: ( rulePattern )
            // InternalBgDsl.g:7117:3: rulePattern
            {
             before(grammarAccess.getIterativeFilterAccess().getEndRulePatternParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getIterativeFilterAccess().getEndRulePatternParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IterativeFilter__EndRuleAssignment_9"


    // $ANTLR start "rule__StateEffectFilter__NameAssignment_1"
    // InternalBgDsl.g:7126:1: rule__StateEffectFilter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StateEffectFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7130:1: ( ( ruleEString ) )
            // InternalBgDsl.g:7131:2: ( ruleEString )
            {
            // InternalBgDsl.g:7131:2: ( ruleEString )
            // InternalBgDsl.g:7132:3: ruleEString
            {
             before(grammarAccess.getStateEffectFilterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateEffectFilterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__NameAssignment_1"


    // $ANTLR start "rule__StateEffectFilter__StateSelectionAssignment_4"
    // InternalBgDsl.g:7141:1: rule__StateEffectFilter__StateSelectionAssignment_4 : ( ruleStateSelection ) ;
    public final void rule__StateEffectFilter__StateSelectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7145:1: ( ( ruleStateSelection ) )
            // InternalBgDsl.g:7146:2: ( ruleStateSelection )
            {
            // InternalBgDsl.g:7146:2: ( ruleStateSelection )
            // InternalBgDsl.g:7147:3: ruleStateSelection
            {
             before(grammarAccess.getStateEffectFilterAccess().getStateSelectionStateSelectionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStateSelection();

            state._fsp--;

             after(grammarAccess.getStateEffectFilterAccess().getStateSelectionStateSelectionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__StateSelectionAssignment_4"


    // $ANTLR start "rule__StateEffectFilter__TargetStateAssignment_5_1"
    // InternalBgDsl.g:7156:1: rule__StateEffectFilter__TargetStateAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__StateEffectFilter__TargetStateAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7160:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:7161:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:7161:2: ( ( ruleEString ) )
            // InternalBgDsl.g:7162:3: ( ruleEString )
            {
             before(grammarAccess.getStateEffectFilterAccess().getTargetStateStateCrossReference_5_1_0()); 
            // InternalBgDsl.g:7163:3: ( ruleEString )
            // InternalBgDsl.g:7164:4: ruleEString
            {
             before(grammarAccess.getStateEffectFilterAccess().getTargetStateStateEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateEffectFilterAccess().getTargetStateStateEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStateEffectFilterAccess().getTargetStateStateCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__TargetStateAssignment_5_1"


    // $ANTLR start "rule__StateEffectFilter__NextFilterAssignment_6_1"
    // InternalBgDsl.g:7175:1: rule__StateEffectFilter__NextFilterAssignment_6_1 : ( ruleFilter ) ;
    public final void rule__StateEffectFilter__NextFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7179:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:7180:2: ( ruleFilter )
            {
            // InternalBgDsl.g:7180:2: ( ruleFilter )
            // InternalBgDsl.g:7181:3: ruleFilter
            {
             before(grammarAccess.getStateEffectFilterAccess().getNextFilterFilterParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getStateEffectFilterAccess().getNextFilterFilterParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateEffectFilter__NextFilterAssignment_6_1"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalBgDsl.g:7190:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7194:1: ( ( ruleEString ) )
            // InternalBgDsl.g:7195:2: ( ruleEString )
            {
            // InternalBgDsl.g:7195:2: ( ruleEString )
            // InternalBgDsl.g:7196:3: ruleEString
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
    // InternalBgDsl.g:7205:1: rule__Pattern__StateSelectionAssignment_3_1 : ( ruleStateSelection ) ;
    public final void rule__Pattern__StateSelectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7209:1: ( ( ruleStateSelection ) )
            // InternalBgDsl.g:7210:2: ( ruleStateSelection )
            {
            // InternalBgDsl.g:7210:2: ( ruleStateSelection )
            // InternalBgDsl.g:7211:3: ruleStateSelection
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
    // InternalBgDsl.g:7220:1: rule__Pattern__MatchStateAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Pattern__MatchStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7224:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:7225:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:7225:2: ( ( ruleEString ) )
            // InternalBgDsl.g:7226:3: ( ruleEString )
            {
             before(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0()); 
            // InternalBgDsl.g:7227:3: ( ruleEString )
            // InternalBgDsl.g:7228:4: ruleEString
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
    // InternalBgDsl.g:7239:1: rule__Pattern__RelativecoordinatesAssignment_7 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7243:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:7244:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:7244:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:7245:3: ruleRelativeCoordinate
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
    // InternalBgDsl.g:7254:1: rule__Pattern__RelativecoordinatesAssignment_8_1 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7258:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:7259:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:7259:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:7260:3: ruleRelativeCoordinate
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
    // InternalBgDsl.g:7269:1: rule__RelativeCoordinate__XAssignment_3 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7273:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:7274:2: ( ruleEInt )
            {
            // InternalBgDsl.g:7274:2: ( ruleEInt )
            // InternalBgDsl.g:7275:3: ruleEInt
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
    // InternalBgDsl.g:7284:1: rule__RelativeCoordinate__YAssignment_5 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:7288:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:7289:2: ( ruleEInt )
            {
            // InternalBgDsl.g:7289:2: ( ruleEInt )
            // InternalBgDsl.g:7290:3: ruleEInt
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4480000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0009000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}