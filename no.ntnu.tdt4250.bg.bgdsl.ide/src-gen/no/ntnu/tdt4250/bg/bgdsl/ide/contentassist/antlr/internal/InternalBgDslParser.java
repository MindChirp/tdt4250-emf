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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CurrentPlayer'", "'OtherPlayer'", "'StateBased'", "'TurnBased'", "'Simultaneous'", "'Game'", "'{'", "'board'", "'turnPolicy'", "'}'", "'initialPlayer'", "'players'", "','", "'Board'", "'width'", "'height'", "'tiles'", "'tileplacement'", "'legalMovesPipeline'", "'effectPipeline'", "'Player'", "'hexColor'", "'associatedState'", "'-'", "'Tile'", "'name'", "'states'", "'initialState'", "'transitions'", "'LegalMovesPipeline'", "'filter'", "'EffectPipeline'", "'TilePlacement'", "'row'", "'column'", "'tile'", "'State'", "'outbound'", "'('", "')'", "'inbound'", "'Transition'", "'source'", "'target'", "'PatternFilter'", "'patterns'", "'nextFilter'", "'Pattern'", "'relativecoordinates'", "'stateSelection'", "'matchState'", "'RelativeCoordinate'", "'x'", "'y'", "'checkered'"
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


    // $ANTLR start "entryRulePattern"
    // InternalBgDsl.g:378:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalBgDsl.g:379:1: ( rulePattern EOF )
            // InternalBgDsl.g:380:1: rulePattern EOF
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
    // InternalBgDsl.g:387:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:391:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalBgDsl.g:392:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalBgDsl.g:392:2: ( ( rule__Pattern__Group__0 ) )
            // InternalBgDsl.g:393:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalBgDsl.g:394:3: ( rule__Pattern__Group__0 )
            // InternalBgDsl.g:394:4: rule__Pattern__Group__0
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
    // InternalBgDsl.g:403:1: entryRuleRelativeCoordinate : ruleRelativeCoordinate EOF ;
    public final void entryRuleRelativeCoordinate() throws RecognitionException {
        try {
            // InternalBgDsl.g:404:1: ( ruleRelativeCoordinate EOF )
            // InternalBgDsl.g:405:1: ruleRelativeCoordinate EOF
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
    // InternalBgDsl.g:412:1: ruleRelativeCoordinate : ( ( rule__RelativeCoordinate__Group__0 ) ) ;
    public final void ruleRelativeCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:416:2: ( ( ( rule__RelativeCoordinate__Group__0 ) ) )
            // InternalBgDsl.g:417:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            {
            // InternalBgDsl.g:417:2: ( ( rule__RelativeCoordinate__Group__0 ) )
            // InternalBgDsl.g:418:3: ( rule__RelativeCoordinate__Group__0 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getGroup()); 
            // InternalBgDsl.g:419:3: ( rule__RelativeCoordinate__Group__0 )
            // InternalBgDsl.g:419:4: rule__RelativeCoordinate__Group__0
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
    // InternalBgDsl.g:428:1: ruleStateSelection : ( ( rule__StateSelection__Alternatives ) ) ;
    public final void ruleStateSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:432:1: ( ( ( rule__StateSelection__Alternatives ) ) )
            // InternalBgDsl.g:433:2: ( ( rule__StateSelection__Alternatives ) )
            {
            // InternalBgDsl.g:433:2: ( ( rule__StateSelection__Alternatives ) )
            // InternalBgDsl.g:434:3: ( rule__StateSelection__Alternatives )
            {
             before(grammarAccess.getStateSelectionAccess().getAlternatives()); 
            // InternalBgDsl.g:435:3: ( rule__StateSelection__Alternatives )
            // InternalBgDsl.g:435:4: rule__StateSelection__Alternatives
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
    // InternalBgDsl.g:444:1: ruleTurnType : ( ( rule__TurnType__Alternatives ) ) ;
    public final void ruleTurnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:448:1: ( ( ( rule__TurnType__Alternatives ) ) )
            // InternalBgDsl.g:449:2: ( ( rule__TurnType__Alternatives ) )
            {
            // InternalBgDsl.g:449:2: ( ( rule__TurnType__Alternatives ) )
            // InternalBgDsl.g:450:3: ( rule__TurnType__Alternatives )
            {
             before(grammarAccess.getTurnTypeAccess().getAlternatives()); 
            // InternalBgDsl.g:451:3: ( rule__TurnType__Alternatives )
            // InternalBgDsl.g:451:4: rule__TurnType__Alternatives
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
    // InternalBgDsl.g:459:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:463:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBgDsl.g:464:2: ( RULE_STRING )
                    {
                    // InternalBgDsl.g:464:2: ( RULE_STRING )
                    // InternalBgDsl.g:465:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:470:2: ( RULE_ID )
                    {
                    // InternalBgDsl.g:470:2: ( RULE_ID )
                    // InternalBgDsl.g:471:3: RULE_ID
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
    // InternalBgDsl.g:480:1: rule__StateSelection__Alternatives : ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) );
    public final void rule__StateSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:484:1: ( ( ( 'CurrentPlayer' ) ) | ( ( 'OtherPlayer' ) ) | ( ( 'StateBased' ) ) )
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
                    // InternalBgDsl.g:485:2: ( ( 'CurrentPlayer' ) )
                    {
                    // InternalBgDsl.g:485:2: ( ( 'CurrentPlayer' ) )
                    // InternalBgDsl.g:486:3: ( 'CurrentPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:487:3: ( 'CurrentPlayer' )
                    // InternalBgDsl.g:487:4: 'CurrentPlayer'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getCurrentPlayerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:491:2: ( ( 'OtherPlayer' ) )
                    {
                    // InternalBgDsl.g:491:2: ( ( 'OtherPlayer' ) )
                    // InternalBgDsl.g:492:3: ( 'OtherPlayer' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:493:3: ( 'OtherPlayer' )
                    // InternalBgDsl.g:493:4: 'OtherPlayer'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateSelectionAccess().getOtherPlayerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBgDsl.g:497:2: ( ( 'StateBased' ) )
                    {
                    // InternalBgDsl.g:497:2: ( ( 'StateBased' ) )
                    // InternalBgDsl.g:498:3: ( 'StateBased' )
                    {
                     before(grammarAccess.getStateSelectionAccess().getStateBasedEnumLiteralDeclaration_2()); 
                    // InternalBgDsl.g:499:3: ( 'StateBased' )
                    // InternalBgDsl.g:499:4: 'StateBased'
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
    // InternalBgDsl.g:507:1: rule__TurnType__Alternatives : ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) );
    public final void rule__TurnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:511:1: ( ( ( 'TurnBased' ) ) | ( ( 'Simultaneous' ) ) )
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
                    // InternalBgDsl.g:512:2: ( ( 'TurnBased' ) )
                    {
                    // InternalBgDsl.g:512:2: ( ( 'TurnBased' ) )
                    // InternalBgDsl.g:513:3: ( 'TurnBased' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 
                    // InternalBgDsl.g:514:3: ( 'TurnBased' )
                    // InternalBgDsl.g:514:4: 'TurnBased'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnTypeAccess().getTurnBasedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBgDsl.g:518:2: ( ( 'Simultaneous' ) )
                    {
                    // InternalBgDsl.g:518:2: ( ( 'Simultaneous' ) )
                    // InternalBgDsl.g:519:3: ( 'Simultaneous' )
                    {
                     before(grammarAccess.getTurnTypeAccess().getSimultaneousEnumLiteralDeclaration_1()); 
                    // InternalBgDsl.g:520:3: ( 'Simultaneous' )
                    // InternalBgDsl.g:520:4: 'Simultaneous'
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
    // InternalBgDsl.g:528:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:532:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalBgDsl.g:533:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalBgDsl.g:540:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:544:1: ( ( 'Game' ) )
            // InternalBgDsl.g:545:1: ( 'Game' )
            {
            // InternalBgDsl.g:545:1: ( 'Game' )
            // InternalBgDsl.g:546:2: 'Game'
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
    // InternalBgDsl.g:555:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:559:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalBgDsl.g:560:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalBgDsl.g:567:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:571:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalBgDsl.g:572:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:572:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalBgDsl.g:573:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:574:2: ( rule__Game__NameAssignment_1 )
            // InternalBgDsl.g:574:3: rule__Game__NameAssignment_1
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
    // InternalBgDsl.g:582:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:586:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalBgDsl.g:587:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalBgDsl.g:594:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:598:1: ( ( '{' ) )
            // InternalBgDsl.g:599:1: ( '{' )
            {
            // InternalBgDsl.g:599:1: ( '{' )
            // InternalBgDsl.g:600:2: '{'
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
    // InternalBgDsl.g:609:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:613:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalBgDsl.g:614:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalBgDsl.g:621:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:625:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalBgDsl.g:626:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalBgDsl.g:626:1: ( ( rule__Game__Group_3__0 )? )
            // InternalBgDsl.g:627:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalBgDsl.g:628:2: ( rule__Game__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBgDsl.g:628:3: rule__Game__Group_3__0
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
    // InternalBgDsl.g:636:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:640:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalBgDsl.g:641:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalBgDsl.g:648:1: rule__Game__Group__4__Impl : ( 'board' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:652:1: ( ( 'board' ) )
            // InternalBgDsl.g:653:1: ( 'board' )
            {
            // InternalBgDsl.g:653:1: ( 'board' )
            // InternalBgDsl.g:654:2: 'board'
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
    // InternalBgDsl.g:663:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:667:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalBgDsl.g:668:2: rule__Game__Group__5__Impl rule__Game__Group__6
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
    // InternalBgDsl.g:675:1: rule__Game__Group__5__Impl : ( ( rule__Game__BoardAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:679:1: ( ( ( rule__Game__BoardAssignment_5 ) ) )
            // InternalBgDsl.g:680:1: ( ( rule__Game__BoardAssignment_5 ) )
            {
            // InternalBgDsl.g:680:1: ( ( rule__Game__BoardAssignment_5 ) )
            // InternalBgDsl.g:681:2: ( rule__Game__BoardAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getBoardAssignment_5()); 
            // InternalBgDsl.g:682:2: ( rule__Game__BoardAssignment_5 )
            // InternalBgDsl.g:682:3: rule__Game__BoardAssignment_5
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
    // InternalBgDsl.g:690:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:694:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalBgDsl.g:695:2: rule__Game__Group__6__Impl rule__Game__Group__7
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
    // InternalBgDsl.g:702:1: rule__Game__Group__6__Impl : ( ( rule__Game__Group_6__0 )? ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:706:1: ( ( ( rule__Game__Group_6__0 )? ) )
            // InternalBgDsl.g:707:1: ( ( rule__Game__Group_6__0 )? )
            {
            // InternalBgDsl.g:707:1: ( ( rule__Game__Group_6__0 )? )
            // InternalBgDsl.g:708:2: ( rule__Game__Group_6__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_6()); 
            // InternalBgDsl.g:709:2: ( rule__Game__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBgDsl.g:709:3: rule__Game__Group_6__0
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
    // InternalBgDsl.g:717:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:721:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalBgDsl.g:722:2: rule__Game__Group__7__Impl rule__Game__Group__8
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
    // InternalBgDsl.g:729:1: rule__Game__Group__7__Impl : ( 'turnPolicy' ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:733:1: ( ( 'turnPolicy' ) )
            // InternalBgDsl.g:734:1: ( 'turnPolicy' )
            {
            // InternalBgDsl.g:734:1: ( 'turnPolicy' )
            // InternalBgDsl.g:735:2: 'turnPolicy'
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
    // InternalBgDsl.g:744:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:748:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalBgDsl.g:749:2: rule__Game__Group__8__Impl rule__Game__Group__9
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
    // InternalBgDsl.g:756:1: rule__Game__Group__8__Impl : ( ( rule__Game__TurnPolicyAssignment_8 ) ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:760:1: ( ( ( rule__Game__TurnPolicyAssignment_8 ) ) )
            // InternalBgDsl.g:761:1: ( ( rule__Game__TurnPolicyAssignment_8 ) )
            {
            // InternalBgDsl.g:761:1: ( ( rule__Game__TurnPolicyAssignment_8 ) )
            // InternalBgDsl.g:762:2: ( rule__Game__TurnPolicyAssignment_8 )
            {
             before(grammarAccess.getGameAccess().getTurnPolicyAssignment_8()); 
            // InternalBgDsl.g:763:2: ( rule__Game__TurnPolicyAssignment_8 )
            // InternalBgDsl.g:763:3: rule__Game__TurnPolicyAssignment_8
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
    // InternalBgDsl.g:771:1: rule__Game__Group__9 : rule__Game__Group__9__Impl ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:775:1: ( rule__Game__Group__9__Impl )
            // InternalBgDsl.g:776:2: rule__Game__Group__9__Impl
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
    // InternalBgDsl.g:782:1: rule__Game__Group__9__Impl : ( '}' ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:786:1: ( ( '}' ) )
            // InternalBgDsl.g:787:1: ( '}' )
            {
            // InternalBgDsl.g:787:1: ( '}' )
            // InternalBgDsl.g:788:2: '}'
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
    // InternalBgDsl.g:798:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:802:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalBgDsl.g:803:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
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
    // InternalBgDsl.g:810:1: rule__Game__Group_3__0__Impl : ( 'initialPlayer' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:814:1: ( ( 'initialPlayer' ) )
            // InternalBgDsl.g:815:1: ( 'initialPlayer' )
            {
            // InternalBgDsl.g:815:1: ( 'initialPlayer' )
            // InternalBgDsl.g:816:2: 'initialPlayer'
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
    // InternalBgDsl.g:825:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:829:1: ( rule__Game__Group_3__1__Impl )
            // InternalBgDsl.g:830:2: rule__Game__Group_3__1__Impl
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
    // InternalBgDsl.g:836:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:840:1: ( ( ( rule__Game__InitialPlayerAssignment_3_1 ) ) )
            // InternalBgDsl.g:841:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            {
            // InternalBgDsl.g:841:1: ( ( rule__Game__InitialPlayerAssignment_3_1 ) )
            // InternalBgDsl.g:842:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerAssignment_3_1()); 
            // InternalBgDsl.g:843:2: ( rule__Game__InitialPlayerAssignment_3_1 )
            // InternalBgDsl.g:843:3: rule__Game__InitialPlayerAssignment_3_1
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
    // InternalBgDsl.g:852:1: rule__Game__Group_6__0 : rule__Game__Group_6__0__Impl rule__Game__Group_6__1 ;
    public final void rule__Game__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:856:1: ( rule__Game__Group_6__0__Impl rule__Game__Group_6__1 )
            // InternalBgDsl.g:857:2: rule__Game__Group_6__0__Impl rule__Game__Group_6__1
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
    // InternalBgDsl.g:864:1: rule__Game__Group_6__0__Impl : ( 'players' ) ;
    public final void rule__Game__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:868:1: ( ( 'players' ) )
            // InternalBgDsl.g:869:1: ( 'players' )
            {
            // InternalBgDsl.g:869:1: ( 'players' )
            // InternalBgDsl.g:870:2: 'players'
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
    // InternalBgDsl.g:879:1: rule__Game__Group_6__1 : rule__Game__Group_6__1__Impl rule__Game__Group_6__2 ;
    public final void rule__Game__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:883:1: ( rule__Game__Group_6__1__Impl rule__Game__Group_6__2 )
            // InternalBgDsl.g:884:2: rule__Game__Group_6__1__Impl rule__Game__Group_6__2
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
    // InternalBgDsl.g:891:1: rule__Game__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:895:1: ( ( '{' ) )
            // InternalBgDsl.g:896:1: ( '{' )
            {
            // InternalBgDsl.g:896:1: ( '{' )
            // InternalBgDsl.g:897:2: '{'
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
    // InternalBgDsl.g:906:1: rule__Game__Group_6__2 : rule__Game__Group_6__2__Impl rule__Game__Group_6__3 ;
    public final void rule__Game__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:910:1: ( rule__Game__Group_6__2__Impl rule__Game__Group_6__3 )
            // InternalBgDsl.g:911:2: rule__Game__Group_6__2__Impl rule__Game__Group_6__3
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
    // InternalBgDsl.g:918:1: rule__Game__Group_6__2__Impl : ( ( rule__Game__PlayersAssignment_6_2 ) ) ;
    public final void rule__Game__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:922:1: ( ( ( rule__Game__PlayersAssignment_6_2 ) ) )
            // InternalBgDsl.g:923:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            {
            // InternalBgDsl.g:923:1: ( ( rule__Game__PlayersAssignment_6_2 ) )
            // InternalBgDsl.g:924:2: ( rule__Game__PlayersAssignment_6_2 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_2()); 
            // InternalBgDsl.g:925:2: ( rule__Game__PlayersAssignment_6_2 )
            // InternalBgDsl.g:925:3: rule__Game__PlayersAssignment_6_2
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
    // InternalBgDsl.g:933:1: rule__Game__Group_6__3 : rule__Game__Group_6__3__Impl rule__Game__Group_6__4 ;
    public final void rule__Game__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:937:1: ( rule__Game__Group_6__3__Impl rule__Game__Group_6__4 )
            // InternalBgDsl.g:938:2: rule__Game__Group_6__3__Impl rule__Game__Group_6__4
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
    // InternalBgDsl.g:945:1: rule__Game__Group_6__3__Impl : ( ( rule__Game__Group_6_3__0 )* ) ;
    public final void rule__Game__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:949:1: ( ( ( rule__Game__Group_6_3__0 )* ) )
            // InternalBgDsl.g:950:1: ( ( rule__Game__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:950:1: ( ( rule__Game__Group_6_3__0 )* )
            // InternalBgDsl.g:951:2: ( rule__Game__Group_6_3__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_6_3()); 
            // InternalBgDsl.g:952:2: ( rule__Game__Group_6_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBgDsl.g:952:3: rule__Game__Group_6_3__0
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
    // InternalBgDsl.g:960:1: rule__Game__Group_6__4 : rule__Game__Group_6__4__Impl ;
    public final void rule__Game__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:964:1: ( rule__Game__Group_6__4__Impl )
            // InternalBgDsl.g:965:2: rule__Game__Group_6__4__Impl
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
    // InternalBgDsl.g:971:1: rule__Game__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:975:1: ( ( '}' ) )
            // InternalBgDsl.g:976:1: ( '}' )
            {
            // InternalBgDsl.g:976:1: ( '}' )
            // InternalBgDsl.g:977:2: '}'
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
    // InternalBgDsl.g:987:1: rule__Game__Group_6_3__0 : rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 ;
    public final void rule__Game__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:991:1: ( rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1 )
            // InternalBgDsl.g:992:2: rule__Game__Group_6_3__0__Impl rule__Game__Group_6_3__1
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
    // InternalBgDsl.g:999:1: rule__Game__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1003:1: ( ( ',' ) )
            // InternalBgDsl.g:1004:1: ( ',' )
            {
            // InternalBgDsl.g:1004:1: ( ',' )
            // InternalBgDsl.g:1005:2: ','
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
    // InternalBgDsl.g:1014:1: rule__Game__Group_6_3__1 : rule__Game__Group_6_3__1__Impl ;
    public final void rule__Game__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1018:1: ( rule__Game__Group_6_3__1__Impl )
            // InternalBgDsl.g:1019:2: rule__Game__Group_6_3__1__Impl
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
    // InternalBgDsl.g:1025:1: rule__Game__Group_6_3__1__Impl : ( ( rule__Game__PlayersAssignment_6_3_1 ) ) ;
    public final void rule__Game__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1029:1: ( ( ( rule__Game__PlayersAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:1030:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:1030:1: ( ( rule__Game__PlayersAssignment_6_3_1 ) )
            // InternalBgDsl.g:1031:2: ( rule__Game__PlayersAssignment_6_3_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_6_3_1()); 
            // InternalBgDsl.g:1032:2: ( rule__Game__PlayersAssignment_6_3_1 )
            // InternalBgDsl.g:1032:3: rule__Game__PlayersAssignment_6_3_1
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
    // InternalBgDsl.g:1041:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1045:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBgDsl.g:1046:2: rule__Board__Group__0__Impl rule__Board__Group__1
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
    // InternalBgDsl.g:1053:1: rule__Board__Group__0__Impl : ( ( rule__Board__CheckeredAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1057:1: ( ( ( rule__Board__CheckeredAssignment_0 ) ) )
            // InternalBgDsl.g:1058:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            {
            // InternalBgDsl.g:1058:1: ( ( rule__Board__CheckeredAssignment_0 ) )
            // InternalBgDsl.g:1059:2: ( rule__Board__CheckeredAssignment_0 )
            {
             before(grammarAccess.getBoardAccess().getCheckeredAssignment_0()); 
            // InternalBgDsl.g:1060:2: ( rule__Board__CheckeredAssignment_0 )
            // InternalBgDsl.g:1060:3: rule__Board__CheckeredAssignment_0
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
    // InternalBgDsl.g:1068:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1072:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBgDsl.g:1073:2: rule__Board__Group__1__Impl rule__Board__Group__2
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
    // InternalBgDsl.g:1080:1: rule__Board__Group__1__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1084:1: ( ( 'Board' ) )
            // InternalBgDsl.g:1085:1: ( 'Board' )
            {
            // InternalBgDsl.g:1085:1: ( 'Board' )
            // InternalBgDsl.g:1086:2: 'Board'
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
    // InternalBgDsl.g:1095:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1099:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBgDsl.g:1100:2: rule__Board__Group__2__Impl rule__Board__Group__3
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
    // InternalBgDsl.g:1107:1: rule__Board__Group__2__Impl : ( '{' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1111:1: ( ( '{' ) )
            // InternalBgDsl.g:1112:1: ( '{' )
            {
            // InternalBgDsl.g:1112:1: ( '{' )
            // InternalBgDsl.g:1113:2: '{'
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
    // InternalBgDsl.g:1122:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1126:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBgDsl.g:1127:2: rule__Board__Group__3__Impl rule__Board__Group__4
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
    // InternalBgDsl.g:1134:1: rule__Board__Group__3__Impl : ( 'width' ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1138:1: ( ( 'width' ) )
            // InternalBgDsl.g:1139:1: ( 'width' )
            {
            // InternalBgDsl.g:1139:1: ( 'width' )
            // InternalBgDsl.g:1140:2: 'width'
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
    // InternalBgDsl.g:1149:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1153:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBgDsl.g:1154:2: rule__Board__Group__4__Impl rule__Board__Group__5
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
    // InternalBgDsl.g:1161:1: rule__Board__Group__4__Impl : ( ( rule__Board__WidthAssignment_4 ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1165:1: ( ( ( rule__Board__WidthAssignment_4 ) ) )
            // InternalBgDsl.g:1166:1: ( ( rule__Board__WidthAssignment_4 ) )
            {
            // InternalBgDsl.g:1166:1: ( ( rule__Board__WidthAssignment_4 ) )
            // InternalBgDsl.g:1167:2: ( rule__Board__WidthAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_4()); 
            // InternalBgDsl.g:1168:2: ( rule__Board__WidthAssignment_4 )
            // InternalBgDsl.g:1168:3: rule__Board__WidthAssignment_4
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
    // InternalBgDsl.g:1176:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1180:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBgDsl.g:1181:2: rule__Board__Group__5__Impl rule__Board__Group__6
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
    // InternalBgDsl.g:1188:1: rule__Board__Group__5__Impl : ( 'height' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1192:1: ( ( 'height' ) )
            // InternalBgDsl.g:1193:1: ( 'height' )
            {
            // InternalBgDsl.g:1193:1: ( 'height' )
            // InternalBgDsl.g:1194:2: 'height'
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
    // InternalBgDsl.g:1203:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1207:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBgDsl.g:1208:2: rule__Board__Group__6__Impl rule__Board__Group__7
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
    // InternalBgDsl.g:1215:1: rule__Board__Group__6__Impl : ( ( rule__Board__HeightAssignment_6 ) ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1219:1: ( ( ( rule__Board__HeightAssignment_6 ) ) )
            // InternalBgDsl.g:1220:1: ( ( rule__Board__HeightAssignment_6 ) )
            {
            // InternalBgDsl.g:1220:1: ( ( rule__Board__HeightAssignment_6 ) )
            // InternalBgDsl.g:1221:2: ( rule__Board__HeightAssignment_6 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_6()); 
            // InternalBgDsl.g:1222:2: ( rule__Board__HeightAssignment_6 )
            // InternalBgDsl.g:1222:3: rule__Board__HeightAssignment_6
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
    // InternalBgDsl.g:1230:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1234:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBgDsl.g:1235:2: rule__Board__Group__7__Impl rule__Board__Group__8
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
    // InternalBgDsl.g:1242:1: rule__Board__Group__7__Impl : ( 'tiles' ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1246:1: ( ( 'tiles' ) )
            // InternalBgDsl.g:1247:1: ( 'tiles' )
            {
            // InternalBgDsl.g:1247:1: ( 'tiles' )
            // InternalBgDsl.g:1248:2: 'tiles'
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
    // InternalBgDsl.g:1257:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1261:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBgDsl.g:1262:2: rule__Board__Group__8__Impl rule__Board__Group__9
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
    // InternalBgDsl.g:1269:1: rule__Board__Group__8__Impl : ( '{' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1273:1: ( ( '{' ) )
            // InternalBgDsl.g:1274:1: ( '{' )
            {
            // InternalBgDsl.g:1274:1: ( '{' )
            // InternalBgDsl.g:1275:2: '{'
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
    // InternalBgDsl.g:1284:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1288:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBgDsl.g:1289:2: rule__Board__Group__9__Impl rule__Board__Group__10
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
    // InternalBgDsl.g:1296:1: rule__Board__Group__9__Impl : ( ( rule__Board__TilesAssignment_9 ) ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1300:1: ( ( ( rule__Board__TilesAssignment_9 ) ) )
            // InternalBgDsl.g:1301:1: ( ( rule__Board__TilesAssignment_9 ) )
            {
            // InternalBgDsl.g:1301:1: ( ( rule__Board__TilesAssignment_9 ) )
            // InternalBgDsl.g:1302:2: ( rule__Board__TilesAssignment_9 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_9()); 
            // InternalBgDsl.g:1303:2: ( rule__Board__TilesAssignment_9 )
            // InternalBgDsl.g:1303:3: rule__Board__TilesAssignment_9
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
    // InternalBgDsl.g:1311:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1315:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBgDsl.g:1316:2: rule__Board__Group__10__Impl rule__Board__Group__11
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
    // InternalBgDsl.g:1323:1: rule__Board__Group__10__Impl : ( ( rule__Board__Group_10__0 )* ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1327:1: ( ( ( rule__Board__Group_10__0 )* ) )
            // InternalBgDsl.g:1328:1: ( ( rule__Board__Group_10__0 )* )
            {
            // InternalBgDsl.g:1328:1: ( ( rule__Board__Group_10__0 )* )
            // InternalBgDsl.g:1329:2: ( rule__Board__Group_10__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_10()); 
            // InternalBgDsl.g:1330:2: ( rule__Board__Group_10__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBgDsl.g:1330:3: rule__Board__Group_10__0
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
    // InternalBgDsl.g:1338:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1342:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBgDsl.g:1343:2: rule__Board__Group__11__Impl rule__Board__Group__12
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
    // InternalBgDsl.g:1350:1: rule__Board__Group__11__Impl : ( '}' ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1354:1: ( ( '}' ) )
            // InternalBgDsl.g:1355:1: ( '}' )
            {
            // InternalBgDsl.g:1355:1: ( '}' )
            // InternalBgDsl.g:1356:2: '}'
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
    // InternalBgDsl.g:1365:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1369:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBgDsl.g:1370:2: rule__Board__Group__12__Impl rule__Board__Group__13
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
    // InternalBgDsl.g:1377:1: rule__Board__Group__12__Impl : ( ( rule__Board__Group_12__0 )? ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1381:1: ( ( ( rule__Board__Group_12__0 )? ) )
            // InternalBgDsl.g:1382:1: ( ( rule__Board__Group_12__0 )? )
            {
            // InternalBgDsl.g:1382:1: ( ( rule__Board__Group_12__0 )? )
            // InternalBgDsl.g:1383:2: ( rule__Board__Group_12__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_12()); 
            // InternalBgDsl.g:1384:2: ( rule__Board__Group_12__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBgDsl.g:1384:3: rule__Board__Group_12__0
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
    // InternalBgDsl.g:1392:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1396:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBgDsl.g:1397:2: rule__Board__Group__13__Impl rule__Board__Group__14
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
    // InternalBgDsl.g:1404:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1408:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBgDsl.g:1409:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBgDsl.g:1409:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBgDsl.g:1410:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBgDsl.g:1411:2: ( rule__Board__Group_13__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBgDsl.g:1411:3: rule__Board__Group_13__0
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
    // InternalBgDsl.g:1419:1: rule__Board__Group__14 : rule__Board__Group__14__Impl rule__Board__Group__15 ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1423:1: ( rule__Board__Group__14__Impl rule__Board__Group__15 )
            // InternalBgDsl.g:1424:2: rule__Board__Group__14__Impl rule__Board__Group__15
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
    // InternalBgDsl.g:1431:1: rule__Board__Group__14__Impl : ( 'tileplacement' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1435:1: ( ( 'tileplacement' ) )
            // InternalBgDsl.g:1436:1: ( 'tileplacement' )
            {
            // InternalBgDsl.g:1436:1: ( 'tileplacement' )
            // InternalBgDsl.g:1437:2: 'tileplacement'
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
    // InternalBgDsl.g:1446:1: rule__Board__Group__15 : rule__Board__Group__15__Impl rule__Board__Group__16 ;
    public final void rule__Board__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1450:1: ( rule__Board__Group__15__Impl rule__Board__Group__16 )
            // InternalBgDsl.g:1451:2: rule__Board__Group__15__Impl rule__Board__Group__16
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
    // InternalBgDsl.g:1458:1: rule__Board__Group__15__Impl : ( '{' ) ;
    public final void rule__Board__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1462:1: ( ( '{' ) )
            // InternalBgDsl.g:1463:1: ( '{' )
            {
            // InternalBgDsl.g:1463:1: ( '{' )
            // InternalBgDsl.g:1464:2: '{'
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
    // InternalBgDsl.g:1473:1: rule__Board__Group__16 : rule__Board__Group__16__Impl rule__Board__Group__17 ;
    public final void rule__Board__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1477:1: ( rule__Board__Group__16__Impl rule__Board__Group__17 )
            // InternalBgDsl.g:1478:2: rule__Board__Group__16__Impl rule__Board__Group__17
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
    // InternalBgDsl.g:1485:1: rule__Board__Group__16__Impl : ( ( rule__Board__TileplacementAssignment_16 ) ) ;
    public final void rule__Board__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1489:1: ( ( ( rule__Board__TileplacementAssignment_16 ) ) )
            // InternalBgDsl.g:1490:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            {
            // InternalBgDsl.g:1490:1: ( ( rule__Board__TileplacementAssignment_16 ) )
            // InternalBgDsl.g:1491:2: ( rule__Board__TileplacementAssignment_16 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_16()); 
            // InternalBgDsl.g:1492:2: ( rule__Board__TileplacementAssignment_16 )
            // InternalBgDsl.g:1492:3: rule__Board__TileplacementAssignment_16
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
    // InternalBgDsl.g:1500:1: rule__Board__Group__17 : rule__Board__Group__17__Impl rule__Board__Group__18 ;
    public final void rule__Board__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1504:1: ( rule__Board__Group__17__Impl rule__Board__Group__18 )
            // InternalBgDsl.g:1505:2: rule__Board__Group__17__Impl rule__Board__Group__18
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
    // InternalBgDsl.g:1512:1: rule__Board__Group__17__Impl : ( ( rule__Board__Group_17__0 )* ) ;
    public final void rule__Board__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1516:1: ( ( ( rule__Board__Group_17__0 )* ) )
            // InternalBgDsl.g:1517:1: ( ( rule__Board__Group_17__0 )* )
            {
            // InternalBgDsl.g:1517:1: ( ( rule__Board__Group_17__0 )* )
            // InternalBgDsl.g:1518:2: ( rule__Board__Group_17__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_17()); 
            // InternalBgDsl.g:1519:2: ( rule__Board__Group_17__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBgDsl.g:1519:3: rule__Board__Group_17__0
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
    // InternalBgDsl.g:1527:1: rule__Board__Group__18 : rule__Board__Group__18__Impl rule__Board__Group__19 ;
    public final void rule__Board__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1531:1: ( rule__Board__Group__18__Impl rule__Board__Group__19 )
            // InternalBgDsl.g:1532:2: rule__Board__Group__18__Impl rule__Board__Group__19
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
    // InternalBgDsl.g:1539:1: rule__Board__Group__18__Impl : ( '}' ) ;
    public final void rule__Board__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1543:1: ( ( '}' ) )
            // InternalBgDsl.g:1544:1: ( '}' )
            {
            // InternalBgDsl.g:1544:1: ( '}' )
            // InternalBgDsl.g:1545:2: '}'
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
    // InternalBgDsl.g:1554:1: rule__Board__Group__19 : rule__Board__Group__19__Impl ;
    public final void rule__Board__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1558:1: ( rule__Board__Group__19__Impl )
            // InternalBgDsl.g:1559:2: rule__Board__Group__19__Impl
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
    // InternalBgDsl.g:1565:1: rule__Board__Group__19__Impl : ( '}' ) ;
    public final void rule__Board__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1569:1: ( ( '}' ) )
            // InternalBgDsl.g:1570:1: ( '}' )
            {
            // InternalBgDsl.g:1570:1: ( '}' )
            // InternalBgDsl.g:1571:2: '}'
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
    // InternalBgDsl.g:1581:1: rule__Board__Group_10__0 : rule__Board__Group_10__0__Impl rule__Board__Group_10__1 ;
    public final void rule__Board__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1585:1: ( rule__Board__Group_10__0__Impl rule__Board__Group_10__1 )
            // InternalBgDsl.g:1586:2: rule__Board__Group_10__0__Impl rule__Board__Group_10__1
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
    // InternalBgDsl.g:1593:1: rule__Board__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1597:1: ( ( ',' ) )
            // InternalBgDsl.g:1598:1: ( ',' )
            {
            // InternalBgDsl.g:1598:1: ( ',' )
            // InternalBgDsl.g:1599:2: ','
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
    // InternalBgDsl.g:1608:1: rule__Board__Group_10__1 : rule__Board__Group_10__1__Impl ;
    public final void rule__Board__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1612:1: ( rule__Board__Group_10__1__Impl )
            // InternalBgDsl.g:1613:2: rule__Board__Group_10__1__Impl
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
    // InternalBgDsl.g:1619:1: rule__Board__Group_10__1__Impl : ( ( rule__Board__TilesAssignment_10_1 ) ) ;
    public final void rule__Board__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1623:1: ( ( ( rule__Board__TilesAssignment_10_1 ) ) )
            // InternalBgDsl.g:1624:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:1624:1: ( ( rule__Board__TilesAssignment_10_1 ) )
            // InternalBgDsl.g:1625:2: ( rule__Board__TilesAssignment_10_1 )
            {
             before(grammarAccess.getBoardAccess().getTilesAssignment_10_1()); 
            // InternalBgDsl.g:1626:2: ( rule__Board__TilesAssignment_10_1 )
            // InternalBgDsl.g:1626:3: rule__Board__TilesAssignment_10_1
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
    // InternalBgDsl.g:1635:1: rule__Board__Group_12__0 : rule__Board__Group_12__0__Impl rule__Board__Group_12__1 ;
    public final void rule__Board__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1639:1: ( rule__Board__Group_12__0__Impl rule__Board__Group_12__1 )
            // InternalBgDsl.g:1640:2: rule__Board__Group_12__0__Impl rule__Board__Group_12__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBgDsl.g:1647:1: rule__Board__Group_12__0__Impl : ( 'legalMovesPipeline' ) ;
    public final void rule__Board__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1651:1: ( ( 'legalMovesPipeline' ) )
            // InternalBgDsl.g:1652:1: ( 'legalMovesPipeline' )
            {
            // InternalBgDsl.g:1652:1: ( 'legalMovesPipeline' )
            // InternalBgDsl.g:1653:2: 'legalMovesPipeline'
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
    // InternalBgDsl.g:1662:1: rule__Board__Group_12__1 : rule__Board__Group_12__1__Impl ;
    public final void rule__Board__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1666:1: ( rule__Board__Group_12__1__Impl )
            // InternalBgDsl.g:1667:2: rule__Board__Group_12__1__Impl
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
    // InternalBgDsl.g:1673:1: rule__Board__Group_12__1__Impl : ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) ) ;
    public final void rule__Board__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1677:1: ( ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) ) )
            // InternalBgDsl.g:1678:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) )
            {
            // InternalBgDsl.g:1678:1: ( ( rule__Board__LegalMovesPipelineAssignment_12_1 ) )
            // InternalBgDsl.g:1679:2: ( rule__Board__LegalMovesPipelineAssignment_12_1 )
            {
             before(grammarAccess.getBoardAccess().getLegalMovesPipelineAssignment_12_1()); 
            // InternalBgDsl.g:1680:2: ( rule__Board__LegalMovesPipelineAssignment_12_1 )
            // InternalBgDsl.g:1680:3: rule__Board__LegalMovesPipelineAssignment_12_1
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
    // InternalBgDsl.g:1689:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1693:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBgDsl.g:1694:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBgDsl.g:1701:1: rule__Board__Group_13__0__Impl : ( 'effectPipeline' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1705:1: ( ( 'effectPipeline' ) )
            // InternalBgDsl.g:1706:1: ( 'effectPipeline' )
            {
            // InternalBgDsl.g:1706:1: ( 'effectPipeline' )
            // InternalBgDsl.g:1707:2: 'effectPipeline'
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
    // InternalBgDsl.g:1716:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1720:1: ( rule__Board__Group_13__1__Impl )
            // InternalBgDsl.g:1721:2: rule__Board__Group_13__1__Impl
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
    // InternalBgDsl.g:1727:1: rule__Board__Group_13__1__Impl : ( ( rule__Board__EffectPipelineAssignment_13_1 ) ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1731:1: ( ( ( rule__Board__EffectPipelineAssignment_13_1 ) ) )
            // InternalBgDsl.g:1732:1: ( ( rule__Board__EffectPipelineAssignment_13_1 ) )
            {
            // InternalBgDsl.g:1732:1: ( ( rule__Board__EffectPipelineAssignment_13_1 ) )
            // InternalBgDsl.g:1733:2: ( rule__Board__EffectPipelineAssignment_13_1 )
            {
             before(grammarAccess.getBoardAccess().getEffectPipelineAssignment_13_1()); 
            // InternalBgDsl.g:1734:2: ( rule__Board__EffectPipelineAssignment_13_1 )
            // InternalBgDsl.g:1734:3: rule__Board__EffectPipelineAssignment_13_1
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
    // InternalBgDsl.g:1743:1: rule__Board__Group_17__0 : rule__Board__Group_17__0__Impl rule__Board__Group_17__1 ;
    public final void rule__Board__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1747:1: ( rule__Board__Group_17__0__Impl rule__Board__Group_17__1 )
            // InternalBgDsl.g:1748:2: rule__Board__Group_17__0__Impl rule__Board__Group_17__1
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
    // InternalBgDsl.g:1755:1: rule__Board__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1759:1: ( ( ',' ) )
            // InternalBgDsl.g:1760:1: ( ',' )
            {
            // InternalBgDsl.g:1760:1: ( ',' )
            // InternalBgDsl.g:1761:2: ','
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
    // InternalBgDsl.g:1770:1: rule__Board__Group_17__1 : rule__Board__Group_17__1__Impl ;
    public final void rule__Board__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1774:1: ( rule__Board__Group_17__1__Impl )
            // InternalBgDsl.g:1775:2: rule__Board__Group_17__1__Impl
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
    // InternalBgDsl.g:1781:1: rule__Board__Group_17__1__Impl : ( ( rule__Board__TileplacementAssignment_17_1 ) ) ;
    public final void rule__Board__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1785:1: ( ( ( rule__Board__TileplacementAssignment_17_1 ) ) )
            // InternalBgDsl.g:1786:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            {
            // InternalBgDsl.g:1786:1: ( ( rule__Board__TileplacementAssignment_17_1 ) )
            // InternalBgDsl.g:1787:2: ( rule__Board__TileplacementAssignment_17_1 )
            {
             before(grammarAccess.getBoardAccess().getTileplacementAssignment_17_1()); 
            // InternalBgDsl.g:1788:2: ( rule__Board__TileplacementAssignment_17_1 )
            // InternalBgDsl.g:1788:3: rule__Board__TileplacementAssignment_17_1
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
    // InternalBgDsl.g:1797:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1801:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalBgDsl.g:1802:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalBgDsl.g:1809:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1813:1: ( ( 'Player' ) )
            // InternalBgDsl.g:1814:1: ( 'Player' )
            {
            // InternalBgDsl.g:1814:1: ( 'Player' )
            // InternalBgDsl.g:1815:2: 'Player'
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
    // InternalBgDsl.g:1824:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1828:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalBgDsl.g:1829:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalBgDsl.g:1836:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1840:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalBgDsl.g:1841:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:1841:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalBgDsl.g:1842:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:1843:2: ( rule__Player__NameAssignment_1 )
            // InternalBgDsl.g:1843:3: rule__Player__NameAssignment_1
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
    // InternalBgDsl.g:1851:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1855:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalBgDsl.g:1856:2: rule__Player__Group__2__Impl rule__Player__Group__3
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
    // InternalBgDsl.g:1863:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1867:1: ( ( '{' ) )
            // InternalBgDsl.g:1868:1: ( '{' )
            {
            // InternalBgDsl.g:1868:1: ( '{' )
            // InternalBgDsl.g:1869:2: '{'
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
    // InternalBgDsl.g:1878:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1882:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalBgDsl.g:1883:2: rule__Player__Group__3__Impl rule__Player__Group__4
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
    // InternalBgDsl.g:1890:1: rule__Player__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1894:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:1895:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:1895:1: ( 'hexColor' )
            // InternalBgDsl.g:1896:2: 'hexColor'
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
    // InternalBgDsl.g:1905:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1909:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalBgDsl.g:1910:2: rule__Player__Group__4__Impl rule__Player__Group__5
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
    // InternalBgDsl.g:1917:1: rule__Player__Group__4__Impl : ( ( rule__Player__HexColorAssignment_4 ) ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1921:1: ( ( ( rule__Player__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:1922:1: ( ( rule__Player__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:1922:1: ( ( rule__Player__HexColorAssignment_4 ) )
            // InternalBgDsl.g:1923:2: ( rule__Player__HexColorAssignment_4 )
            {
             before(grammarAccess.getPlayerAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:1924:2: ( rule__Player__HexColorAssignment_4 )
            // InternalBgDsl.g:1924:3: rule__Player__HexColorAssignment_4
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
    // InternalBgDsl.g:1932:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1936:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalBgDsl.g:1937:2: rule__Player__Group__5__Impl rule__Player__Group__6
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
    // InternalBgDsl.g:1944:1: rule__Player__Group__5__Impl : ( 'associatedState' ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1948:1: ( ( 'associatedState' ) )
            // InternalBgDsl.g:1949:1: ( 'associatedState' )
            {
            // InternalBgDsl.g:1949:1: ( 'associatedState' )
            // InternalBgDsl.g:1950:2: 'associatedState'
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
    // InternalBgDsl.g:1959:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1963:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalBgDsl.g:1964:2: rule__Player__Group__6__Impl rule__Player__Group__7
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
    // InternalBgDsl.g:1971:1: rule__Player__Group__6__Impl : ( ( rule__Player__AssociatedStateAssignment_6 ) ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1975:1: ( ( ( rule__Player__AssociatedStateAssignment_6 ) ) )
            // InternalBgDsl.g:1976:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            {
            // InternalBgDsl.g:1976:1: ( ( rule__Player__AssociatedStateAssignment_6 ) )
            // InternalBgDsl.g:1977:2: ( rule__Player__AssociatedStateAssignment_6 )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateAssignment_6()); 
            // InternalBgDsl.g:1978:2: ( rule__Player__AssociatedStateAssignment_6 )
            // InternalBgDsl.g:1978:3: rule__Player__AssociatedStateAssignment_6
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
    // InternalBgDsl.g:1986:1: rule__Player__Group__7 : rule__Player__Group__7__Impl ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:1990:1: ( rule__Player__Group__7__Impl )
            // InternalBgDsl.g:1991:2: rule__Player__Group__7__Impl
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
    // InternalBgDsl.g:1997:1: rule__Player__Group__7__Impl : ( '}' ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2001:1: ( ( '}' ) )
            // InternalBgDsl.g:2002:1: ( '}' )
            {
            // InternalBgDsl.g:2002:1: ( '}' )
            // InternalBgDsl.g:2003:2: '}'
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBgDsl.g:2013:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2017:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBgDsl.g:2018:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBgDsl.g:2025:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2029:1: ( ( ( '-' )? ) )
            // InternalBgDsl.g:2030:1: ( ( '-' )? )
            {
            // InternalBgDsl.g:2030:1: ( ( '-' )? )
            // InternalBgDsl.g:2031:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBgDsl.g:2032:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBgDsl.g:2032:3: '-'
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
    // InternalBgDsl.g:2040:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2044:1: ( rule__EInt__Group__1__Impl )
            // InternalBgDsl.g:2045:2: rule__EInt__Group__1__Impl
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
    // InternalBgDsl.g:2051:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2055:1: ( ( RULE_INT ) )
            // InternalBgDsl.g:2056:1: ( RULE_INT )
            {
            // InternalBgDsl.g:2056:1: ( RULE_INT )
            // InternalBgDsl.g:2057:2: RULE_INT
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
    // InternalBgDsl.g:2067:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2071:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalBgDsl.g:2072:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
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
    // InternalBgDsl.g:2079:1: rule__Tile__Group__0__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2083:1: ( ( 'Tile' ) )
            // InternalBgDsl.g:2084:1: ( 'Tile' )
            {
            // InternalBgDsl.g:2084:1: ( 'Tile' )
            // InternalBgDsl.g:2085:2: 'Tile'
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
    // InternalBgDsl.g:2094:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2098:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalBgDsl.g:2099:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
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
    // InternalBgDsl.g:2106:1: rule__Tile__Group__1__Impl : ( ( rule__Tile__TypeAssignment_1 ) ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2110:1: ( ( ( rule__Tile__TypeAssignment_1 ) ) )
            // InternalBgDsl.g:2111:1: ( ( rule__Tile__TypeAssignment_1 ) )
            {
            // InternalBgDsl.g:2111:1: ( ( rule__Tile__TypeAssignment_1 ) )
            // InternalBgDsl.g:2112:2: ( rule__Tile__TypeAssignment_1 )
            {
             before(grammarAccess.getTileAccess().getTypeAssignment_1()); 
            // InternalBgDsl.g:2113:2: ( rule__Tile__TypeAssignment_1 )
            // InternalBgDsl.g:2113:3: rule__Tile__TypeAssignment_1
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
    // InternalBgDsl.g:2121:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2125:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalBgDsl.g:2126:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
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
    // InternalBgDsl.g:2133:1: rule__Tile__Group__2__Impl : ( '{' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2137:1: ( ( '{' ) )
            // InternalBgDsl.g:2138:1: ( '{' )
            {
            // InternalBgDsl.g:2138:1: ( '{' )
            // InternalBgDsl.g:2139:2: '{'
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
    // InternalBgDsl.g:2148:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2152:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalBgDsl.g:2153:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
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
    // InternalBgDsl.g:2160:1: rule__Tile__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2164:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:2165:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:2165:1: ( 'hexColor' )
            // InternalBgDsl.g:2166:2: 'hexColor'
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
    // InternalBgDsl.g:2175:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2179:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalBgDsl.g:2180:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalBgDsl.g:2187:1: rule__Tile__Group__4__Impl : ( ( rule__Tile__HexColorAssignment_4 ) ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2191:1: ( ( ( rule__Tile__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:2192:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:2192:1: ( ( rule__Tile__HexColorAssignment_4 ) )
            // InternalBgDsl.g:2193:2: ( rule__Tile__HexColorAssignment_4 )
            {
             before(grammarAccess.getTileAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:2194:2: ( rule__Tile__HexColorAssignment_4 )
            // InternalBgDsl.g:2194:3: rule__Tile__HexColorAssignment_4
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
    // InternalBgDsl.g:2202:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2206:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalBgDsl.g:2207:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
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
    // InternalBgDsl.g:2214:1: rule__Tile__Group__5__Impl : ( 'name' ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2218:1: ( ( 'name' ) )
            // InternalBgDsl.g:2219:1: ( 'name' )
            {
            // InternalBgDsl.g:2219:1: ( 'name' )
            // InternalBgDsl.g:2220:2: 'name'
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
    // InternalBgDsl.g:2229:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2233:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalBgDsl.g:2234:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalBgDsl.g:2241:1: rule__Tile__Group__6__Impl : ( ( rule__Tile__NameAssignment_6 ) ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2245:1: ( ( ( rule__Tile__NameAssignment_6 ) ) )
            // InternalBgDsl.g:2246:1: ( ( rule__Tile__NameAssignment_6 ) )
            {
            // InternalBgDsl.g:2246:1: ( ( rule__Tile__NameAssignment_6 ) )
            // InternalBgDsl.g:2247:2: ( rule__Tile__NameAssignment_6 )
            {
             before(grammarAccess.getTileAccess().getNameAssignment_6()); 
            // InternalBgDsl.g:2248:2: ( rule__Tile__NameAssignment_6 )
            // InternalBgDsl.g:2248:3: rule__Tile__NameAssignment_6
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
    // InternalBgDsl.g:2256:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2260:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalBgDsl.g:2261:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
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
    // InternalBgDsl.g:2268:1: rule__Tile__Group__7__Impl : ( 'states' ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2272:1: ( ( 'states' ) )
            // InternalBgDsl.g:2273:1: ( 'states' )
            {
            // InternalBgDsl.g:2273:1: ( 'states' )
            // InternalBgDsl.g:2274:2: 'states'
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
    // InternalBgDsl.g:2283:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2287:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalBgDsl.g:2288:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalBgDsl.g:2295:1: rule__Tile__Group__8__Impl : ( '{' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2299:1: ( ( '{' ) )
            // InternalBgDsl.g:2300:1: ( '{' )
            {
            // InternalBgDsl.g:2300:1: ( '{' )
            // InternalBgDsl.g:2301:2: '{'
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
    // InternalBgDsl.g:2310:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2314:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalBgDsl.g:2315:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
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
    // InternalBgDsl.g:2322:1: rule__Tile__Group__9__Impl : ( ( rule__Tile__StatesAssignment_9 ) ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2326:1: ( ( ( rule__Tile__StatesAssignment_9 ) ) )
            // InternalBgDsl.g:2327:1: ( ( rule__Tile__StatesAssignment_9 ) )
            {
            // InternalBgDsl.g:2327:1: ( ( rule__Tile__StatesAssignment_9 ) )
            // InternalBgDsl.g:2328:2: ( rule__Tile__StatesAssignment_9 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_9()); 
            // InternalBgDsl.g:2329:2: ( rule__Tile__StatesAssignment_9 )
            // InternalBgDsl.g:2329:3: rule__Tile__StatesAssignment_9
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
    // InternalBgDsl.g:2337:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2341:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalBgDsl.g:2342:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
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
    // InternalBgDsl.g:2349:1: rule__Tile__Group__10__Impl : ( ( rule__Tile__Group_10__0 )* ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2353:1: ( ( ( rule__Tile__Group_10__0 )* ) )
            // InternalBgDsl.g:2354:1: ( ( rule__Tile__Group_10__0 )* )
            {
            // InternalBgDsl.g:2354:1: ( ( rule__Tile__Group_10__0 )* )
            // InternalBgDsl.g:2355:2: ( rule__Tile__Group_10__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_10()); 
            // InternalBgDsl.g:2356:2: ( rule__Tile__Group_10__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBgDsl.g:2356:3: rule__Tile__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tile__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBgDsl.g:2364:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2368:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalBgDsl.g:2369:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2376:1: rule__Tile__Group__11__Impl : ( '}' ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2380:1: ( ( '}' ) )
            // InternalBgDsl.g:2381:1: ( '}' )
            {
            // InternalBgDsl.g:2381:1: ( '}' )
            // InternalBgDsl.g:2382:2: '}'
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
    // InternalBgDsl.g:2391:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl rule__Tile__Group__13 ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2395:1: ( rule__Tile__Group__12__Impl rule__Tile__Group__13 )
            // InternalBgDsl.g:2396:2: rule__Tile__Group__12__Impl rule__Tile__Group__13
            {
            pushFollow(FOLLOW_28);
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
    // InternalBgDsl.g:2403:1: rule__Tile__Group__12__Impl : ( ( rule__Tile__Group_12__0 )? ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2407:1: ( ( ( rule__Tile__Group_12__0 )? ) )
            // InternalBgDsl.g:2408:1: ( ( rule__Tile__Group_12__0 )? )
            {
            // InternalBgDsl.g:2408:1: ( ( rule__Tile__Group_12__0 )? )
            // InternalBgDsl.g:2409:2: ( rule__Tile__Group_12__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_12()); 
            // InternalBgDsl.g:2410:2: ( rule__Tile__Group_12__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBgDsl.g:2410:3: rule__Tile__Group_12__0
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
    // InternalBgDsl.g:2418:1: rule__Tile__Group__13 : rule__Tile__Group__13__Impl rule__Tile__Group__14 ;
    public final void rule__Tile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2422:1: ( rule__Tile__Group__13__Impl rule__Tile__Group__14 )
            // InternalBgDsl.g:2423:2: rule__Tile__Group__13__Impl rule__Tile__Group__14
            {
            pushFollow(FOLLOW_27);
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
    // InternalBgDsl.g:2430:1: rule__Tile__Group__13__Impl : ( 'initialState' ) ;
    public final void rule__Tile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2434:1: ( ( 'initialState' ) )
            // InternalBgDsl.g:2435:1: ( 'initialState' )
            {
            // InternalBgDsl.g:2435:1: ( 'initialState' )
            // InternalBgDsl.g:2436:2: 'initialState'
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
    // InternalBgDsl.g:2445:1: rule__Tile__Group__14 : rule__Tile__Group__14__Impl rule__Tile__Group__15 ;
    public final void rule__Tile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2449:1: ( rule__Tile__Group__14__Impl rule__Tile__Group__15 )
            // InternalBgDsl.g:2450:2: rule__Tile__Group__14__Impl rule__Tile__Group__15
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
    // InternalBgDsl.g:2457:1: rule__Tile__Group__14__Impl : ( ( rule__Tile__InitialStateAssignment_14 ) ) ;
    public final void rule__Tile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2461:1: ( ( ( rule__Tile__InitialStateAssignment_14 ) ) )
            // InternalBgDsl.g:2462:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            {
            // InternalBgDsl.g:2462:1: ( ( rule__Tile__InitialStateAssignment_14 ) )
            // InternalBgDsl.g:2463:2: ( rule__Tile__InitialStateAssignment_14 )
            {
             before(grammarAccess.getTileAccess().getInitialStateAssignment_14()); 
            // InternalBgDsl.g:2464:2: ( rule__Tile__InitialStateAssignment_14 )
            // InternalBgDsl.g:2464:3: rule__Tile__InitialStateAssignment_14
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
    // InternalBgDsl.g:2472:1: rule__Tile__Group__15 : rule__Tile__Group__15__Impl ;
    public final void rule__Tile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2476:1: ( rule__Tile__Group__15__Impl )
            // InternalBgDsl.g:2477:2: rule__Tile__Group__15__Impl
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
    // InternalBgDsl.g:2483:1: rule__Tile__Group__15__Impl : ( '}' ) ;
    public final void rule__Tile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2487:1: ( ( '}' ) )
            // InternalBgDsl.g:2488:1: ( '}' )
            {
            // InternalBgDsl.g:2488:1: ( '}' )
            // InternalBgDsl.g:2489:2: '}'
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
    // InternalBgDsl.g:2499:1: rule__Tile__Group_10__0 : rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 ;
    public final void rule__Tile__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2503:1: ( rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1 )
            // InternalBgDsl.g:2504:2: rule__Tile__Group_10__0__Impl rule__Tile__Group_10__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalBgDsl.g:2511:1: rule__Tile__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2515:1: ( ( ',' ) )
            // InternalBgDsl.g:2516:1: ( ',' )
            {
            // InternalBgDsl.g:2516:1: ( ',' )
            // InternalBgDsl.g:2517:2: ','
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
    // InternalBgDsl.g:2526:1: rule__Tile__Group_10__1 : rule__Tile__Group_10__1__Impl ;
    public final void rule__Tile__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2530:1: ( rule__Tile__Group_10__1__Impl )
            // InternalBgDsl.g:2531:2: rule__Tile__Group_10__1__Impl
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
    // InternalBgDsl.g:2537:1: rule__Tile__Group_10__1__Impl : ( ( rule__Tile__StatesAssignment_10_1 ) ) ;
    public final void rule__Tile__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2541:1: ( ( ( rule__Tile__StatesAssignment_10_1 ) ) )
            // InternalBgDsl.g:2542:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            {
            // InternalBgDsl.g:2542:1: ( ( rule__Tile__StatesAssignment_10_1 ) )
            // InternalBgDsl.g:2543:2: ( rule__Tile__StatesAssignment_10_1 )
            {
             before(grammarAccess.getTileAccess().getStatesAssignment_10_1()); 
            // InternalBgDsl.g:2544:2: ( rule__Tile__StatesAssignment_10_1 )
            // InternalBgDsl.g:2544:3: rule__Tile__StatesAssignment_10_1
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
    // InternalBgDsl.g:2553:1: rule__Tile__Group_12__0 : rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 ;
    public final void rule__Tile__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2557:1: ( rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1 )
            // InternalBgDsl.g:2558:2: rule__Tile__Group_12__0__Impl rule__Tile__Group_12__1
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
    // InternalBgDsl.g:2565:1: rule__Tile__Group_12__0__Impl : ( 'transitions' ) ;
    public final void rule__Tile__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2569:1: ( ( 'transitions' ) )
            // InternalBgDsl.g:2570:1: ( 'transitions' )
            {
            // InternalBgDsl.g:2570:1: ( 'transitions' )
            // InternalBgDsl.g:2571:2: 'transitions'
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
    // InternalBgDsl.g:2580:1: rule__Tile__Group_12__1 : rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 ;
    public final void rule__Tile__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2584:1: ( rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2 )
            // InternalBgDsl.g:2585:2: rule__Tile__Group_12__1__Impl rule__Tile__Group_12__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:2592:1: rule__Tile__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Tile__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2596:1: ( ( '{' ) )
            // InternalBgDsl.g:2597:1: ( '{' )
            {
            // InternalBgDsl.g:2597:1: ( '{' )
            // InternalBgDsl.g:2598:2: '{'
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
    // InternalBgDsl.g:2607:1: rule__Tile__Group_12__2 : rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 ;
    public final void rule__Tile__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2611:1: ( rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3 )
            // InternalBgDsl.g:2612:2: rule__Tile__Group_12__2__Impl rule__Tile__Group_12__3
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
    // InternalBgDsl.g:2619:1: rule__Tile__Group_12__2__Impl : ( ( rule__Tile__TransitionsAssignment_12_2 ) ) ;
    public final void rule__Tile__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2623:1: ( ( ( rule__Tile__TransitionsAssignment_12_2 ) ) )
            // InternalBgDsl.g:2624:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            {
            // InternalBgDsl.g:2624:1: ( ( rule__Tile__TransitionsAssignment_12_2 ) )
            // InternalBgDsl.g:2625:2: ( rule__Tile__TransitionsAssignment_12_2 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_2()); 
            // InternalBgDsl.g:2626:2: ( rule__Tile__TransitionsAssignment_12_2 )
            // InternalBgDsl.g:2626:3: rule__Tile__TransitionsAssignment_12_2
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
    // InternalBgDsl.g:2634:1: rule__Tile__Group_12__3 : rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 ;
    public final void rule__Tile__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2638:1: ( rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4 )
            // InternalBgDsl.g:2639:2: rule__Tile__Group_12__3__Impl rule__Tile__Group_12__4
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
    // InternalBgDsl.g:2646:1: rule__Tile__Group_12__3__Impl : ( ( rule__Tile__Group_12_3__0 )* ) ;
    public final void rule__Tile__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2650:1: ( ( ( rule__Tile__Group_12_3__0 )* ) )
            // InternalBgDsl.g:2651:1: ( ( rule__Tile__Group_12_3__0 )* )
            {
            // InternalBgDsl.g:2651:1: ( ( rule__Tile__Group_12_3__0 )* )
            // InternalBgDsl.g:2652:2: ( rule__Tile__Group_12_3__0 )*
            {
             before(grammarAccess.getTileAccess().getGroup_12_3()); 
            // InternalBgDsl.g:2653:2: ( rule__Tile__Group_12_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBgDsl.g:2653:3: rule__Tile__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tile__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBgDsl.g:2661:1: rule__Tile__Group_12__4 : rule__Tile__Group_12__4__Impl ;
    public final void rule__Tile__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2665:1: ( rule__Tile__Group_12__4__Impl )
            // InternalBgDsl.g:2666:2: rule__Tile__Group_12__4__Impl
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
    // InternalBgDsl.g:2672:1: rule__Tile__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Tile__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2676:1: ( ( '}' ) )
            // InternalBgDsl.g:2677:1: ( '}' )
            {
            // InternalBgDsl.g:2677:1: ( '}' )
            // InternalBgDsl.g:2678:2: '}'
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
    // InternalBgDsl.g:2688:1: rule__Tile__Group_12_3__0 : rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 ;
    public final void rule__Tile__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2692:1: ( rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1 )
            // InternalBgDsl.g:2693:2: rule__Tile__Group_12_3__0__Impl rule__Tile__Group_12_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBgDsl.g:2700:1: rule__Tile__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Tile__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2704:1: ( ( ',' ) )
            // InternalBgDsl.g:2705:1: ( ',' )
            {
            // InternalBgDsl.g:2705:1: ( ',' )
            // InternalBgDsl.g:2706:2: ','
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
    // InternalBgDsl.g:2715:1: rule__Tile__Group_12_3__1 : rule__Tile__Group_12_3__1__Impl ;
    public final void rule__Tile__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2719:1: ( rule__Tile__Group_12_3__1__Impl )
            // InternalBgDsl.g:2720:2: rule__Tile__Group_12_3__1__Impl
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
    // InternalBgDsl.g:2726:1: rule__Tile__Group_12_3__1__Impl : ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) ;
    public final void rule__Tile__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2730:1: ( ( ( rule__Tile__TransitionsAssignment_12_3_1 ) ) )
            // InternalBgDsl.g:2731:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            {
            // InternalBgDsl.g:2731:1: ( ( rule__Tile__TransitionsAssignment_12_3_1 ) )
            // InternalBgDsl.g:2732:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            {
             before(grammarAccess.getTileAccess().getTransitionsAssignment_12_3_1()); 
            // InternalBgDsl.g:2733:2: ( rule__Tile__TransitionsAssignment_12_3_1 )
            // InternalBgDsl.g:2733:3: rule__Tile__TransitionsAssignment_12_3_1
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
    // InternalBgDsl.g:2742:1: rule__LegalMovesPipeline__Group__0 : rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 ;
    public final void rule__LegalMovesPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2746:1: ( rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1 )
            // InternalBgDsl.g:2747:2: rule__LegalMovesPipeline__Group__0__Impl rule__LegalMovesPipeline__Group__1
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
    // InternalBgDsl.g:2754:1: rule__LegalMovesPipeline__Group__0__Impl : ( () ) ;
    public final void rule__LegalMovesPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2758:1: ( ( () ) )
            // InternalBgDsl.g:2759:1: ( () )
            {
            // InternalBgDsl.g:2759:1: ( () )
            // InternalBgDsl.g:2760:2: ()
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getLegalMovesPipelineAction_0()); 
            // InternalBgDsl.g:2761:2: ()
            // InternalBgDsl.g:2761:3: 
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
    // InternalBgDsl.g:2769:1: rule__LegalMovesPipeline__Group__1 : rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 ;
    public final void rule__LegalMovesPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2773:1: ( rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2 )
            // InternalBgDsl.g:2774:2: rule__LegalMovesPipeline__Group__1__Impl rule__LegalMovesPipeline__Group__2
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
    // InternalBgDsl.g:2781:1: rule__LegalMovesPipeline__Group__1__Impl : ( 'LegalMovesPipeline' ) ;
    public final void rule__LegalMovesPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2785:1: ( ( 'LegalMovesPipeline' ) )
            // InternalBgDsl.g:2786:1: ( 'LegalMovesPipeline' )
            {
            // InternalBgDsl.g:2786:1: ( 'LegalMovesPipeline' )
            // InternalBgDsl.g:2787:2: 'LegalMovesPipeline'
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
    // InternalBgDsl.g:2796:1: rule__LegalMovesPipeline__Group__2 : rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 ;
    public final void rule__LegalMovesPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2800:1: ( rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3 )
            // InternalBgDsl.g:2801:2: rule__LegalMovesPipeline__Group__2__Impl rule__LegalMovesPipeline__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:2808:1: rule__LegalMovesPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__LegalMovesPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2812:1: ( ( '{' ) )
            // InternalBgDsl.g:2813:1: ( '{' )
            {
            // InternalBgDsl.g:2813:1: ( '{' )
            // InternalBgDsl.g:2814:2: '{'
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
    // InternalBgDsl.g:2823:1: rule__LegalMovesPipeline__Group__3 : rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 ;
    public final void rule__LegalMovesPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2827:1: ( rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4 )
            // InternalBgDsl.g:2828:2: rule__LegalMovesPipeline__Group__3__Impl rule__LegalMovesPipeline__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:2835:1: rule__LegalMovesPipeline__Group__3__Impl : ( ( rule__LegalMovesPipeline__Group_3__0 )? ) ;
    public final void rule__LegalMovesPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2839:1: ( ( ( rule__LegalMovesPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:2840:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:2840:1: ( ( rule__LegalMovesPipeline__Group_3__0 )? )
            // InternalBgDsl.g:2841:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:2842:2: ( rule__LegalMovesPipeline__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBgDsl.g:2842:3: rule__LegalMovesPipeline__Group_3__0
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
    // InternalBgDsl.g:2850:1: rule__LegalMovesPipeline__Group__4 : rule__LegalMovesPipeline__Group__4__Impl ;
    public final void rule__LegalMovesPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2854:1: ( rule__LegalMovesPipeline__Group__4__Impl )
            // InternalBgDsl.g:2855:2: rule__LegalMovesPipeline__Group__4__Impl
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
    // InternalBgDsl.g:2861:1: rule__LegalMovesPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__LegalMovesPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2865:1: ( ( '}' ) )
            // InternalBgDsl.g:2866:1: ( '}' )
            {
            // InternalBgDsl.g:2866:1: ( '}' )
            // InternalBgDsl.g:2867:2: '}'
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
    // InternalBgDsl.g:2877:1: rule__LegalMovesPipeline__Group_3__0 : rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 ;
    public final void rule__LegalMovesPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2881:1: ( rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1 )
            // InternalBgDsl.g:2882:2: rule__LegalMovesPipeline__Group_3__0__Impl rule__LegalMovesPipeline__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:2889:1: rule__LegalMovesPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__LegalMovesPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2893:1: ( ( 'filter' ) )
            // InternalBgDsl.g:2894:1: ( 'filter' )
            {
            // InternalBgDsl.g:2894:1: ( 'filter' )
            // InternalBgDsl.g:2895:2: 'filter'
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBgDsl.g:2904:1: rule__LegalMovesPipeline__Group_3__1 : rule__LegalMovesPipeline__Group_3__1__Impl ;
    public final void rule__LegalMovesPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2908:1: ( rule__LegalMovesPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:2909:2: rule__LegalMovesPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:2915:1: rule__LegalMovesPipeline__Group_3__1__Impl : ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__LegalMovesPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2919:1: ( ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:2920:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:2920:1: ( ( rule__LegalMovesPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:2921:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getLegalMovesPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:2922:2: ( rule__LegalMovesPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:2922:3: rule__LegalMovesPipeline__FilterAssignment_3_1
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
    // InternalBgDsl.g:2931:1: rule__EffectPipeline__Group__0 : rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 ;
    public final void rule__EffectPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2935:1: ( rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1 )
            // InternalBgDsl.g:2936:2: rule__EffectPipeline__Group__0__Impl rule__EffectPipeline__Group__1
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
    // InternalBgDsl.g:2943:1: rule__EffectPipeline__Group__0__Impl : ( () ) ;
    public final void rule__EffectPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2947:1: ( ( () ) )
            // InternalBgDsl.g:2948:1: ( () )
            {
            // InternalBgDsl.g:2948:1: ( () )
            // InternalBgDsl.g:2949:2: ()
            {
             before(grammarAccess.getEffectPipelineAccess().getEffectPipelineAction_0()); 
            // InternalBgDsl.g:2950:2: ()
            // InternalBgDsl.g:2950:3: 
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
    // InternalBgDsl.g:2958:1: rule__EffectPipeline__Group__1 : rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 ;
    public final void rule__EffectPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2962:1: ( rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2 )
            // InternalBgDsl.g:2963:2: rule__EffectPipeline__Group__1__Impl rule__EffectPipeline__Group__2
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
    // InternalBgDsl.g:2970:1: rule__EffectPipeline__Group__1__Impl : ( 'EffectPipeline' ) ;
    public final void rule__EffectPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2974:1: ( ( 'EffectPipeline' ) )
            // InternalBgDsl.g:2975:1: ( 'EffectPipeline' )
            {
            // InternalBgDsl.g:2975:1: ( 'EffectPipeline' )
            // InternalBgDsl.g:2976:2: 'EffectPipeline'
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
    // InternalBgDsl.g:2985:1: rule__EffectPipeline__Group__2 : rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 ;
    public final void rule__EffectPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:2989:1: ( rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3 )
            // InternalBgDsl.g:2990:2: rule__EffectPipeline__Group__2__Impl rule__EffectPipeline__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:2997:1: rule__EffectPipeline__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3001:1: ( ( '{' ) )
            // InternalBgDsl.g:3002:1: ( '{' )
            {
            // InternalBgDsl.g:3002:1: ( '{' )
            // InternalBgDsl.g:3003:2: '{'
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
    // InternalBgDsl.g:3012:1: rule__EffectPipeline__Group__3 : rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 ;
    public final void rule__EffectPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3016:1: ( rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4 )
            // InternalBgDsl.g:3017:2: rule__EffectPipeline__Group__3__Impl rule__EffectPipeline__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBgDsl.g:3024:1: rule__EffectPipeline__Group__3__Impl : ( ( rule__EffectPipeline__Group_3__0 )? ) ;
    public final void rule__EffectPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3028:1: ( ( ( rule__EffectPipeline__Group_3__0 )? ) )
            // InternalBgDsl.g:3029:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            {
            // InternalBgDsl.g:3029:1: ( ( rule__EffectPipeline__Group_3__0 )? )
            // InternalBgDsl.g:3030:2: ( rule__EffectPipeline__Group_3__0 )?
            {
             before(grammarAccess.getEffectPipelineAccess().getGroup_3()); 
            // InternalBgDsl.g:3031:2: ( rule__EffectPipeline__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBgDsl.g:3031:3: rule__EffectPipeline__Group_3__0
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
    // InternalBgDsl.g:3039:1: rule__EffectPipeline__Group__4 : rule__EffectPipeline__Group__4__Impl ;
    public final void rule__EffectPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3043:1: ( rule__EffectPipeline__Group__4__Impl )
            // InternalBgDsl.g:3044:2: rule__EffectPipeline__Group__4__Impl
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
    // InternalBgDsl.g:3050:1: rule__EffectPipeline__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3054:1: ( ( '}' ) )
            // InternalBgDsl.g:3055:1: ( '}' )
            {
            // InternalBgDsl.g:3055:1: ( '}' )
            // InternalBgDsl.g:3056:2: '}'
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
    // InternalBgDsl.g:3066:1: rule__EffectPipeline__Group_3__0 : rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 ;
    public final void rule__EffectPipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3070:1: ( rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1 )
            // InternalBgDsl.g:3071:2: rule__EffectPipeline__Group_3__0__Impl rule__EffectPipeline__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:3078:1: rule__EffectPipeline__Group_3__0__Impl : ( 'filter' ) ;
    public final void rule__EffectPipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3082:1: ( ( 'filter' ) )
            // InternalBgDsl.g:3083:1: ( 'filter' )
            {
            // InternalBgDsl.g:3083:1: ( 'filter' )
            // InternalBgDsl.g:3084:2: 'filter'
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBgDsl.g:3093:1: rule__EffectPipeline__Group_3__1 : rule__EffectPipeline__Group_3__1__Impl ;
    public final void rule__EffectPipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3097:1: ( rule__EffectPipeline__Group_3__1__Impl )
            // InternalBgDsl.g:3098:2: rule__EffectPipeline__Group_3__1__Impl
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
    // InternalBgDsl.g:3104:1: rule__EffectPipeline__Group_3__1__Impl : ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) ;
    public final void rule__EffectPipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3108:1: ( ( ( rule__EffectPipeline__FilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:3109:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:3109:1: ( ( rule__EffectPipeline__FilterAssignment_3_1 ) )
            // InternalBgDsl.g:3110:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            {
             before(grammarAccess.getEffectPipelineAccess().getFilterAssignment_3_1()); 
            // InternalBgDsl.g:3111:2: ( rule__EffectPipeline__FilterAssignment_3_1 )
            // InternalBgDsl.g:3111:3: rule__EffectPipeline__FilterAssignment_3_1
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
    // InternalBgDsl.g:3120:1: rule__TilePlacement__Group__0 : rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 ;
    public final void rule__TilePlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3124:1: ( rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1 )
            // InternalBgDsl.g:3125:2: rule__TilePlacement__Group__0__Impl rule__TilePlacement__Group__1
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
    // InternalBgDsl.g:3132:1: rule__TilePlacement__Group__0__Impl : ( 'TilePlacement' ) ;
    public final void rule__TilePlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3136:1: ( ( 'TilePlacement' ) )
            // InternalBgDsl.g:3137:1: ( 'TilePlacement' )
            {
            // InternalBgDsl.g:3137:1: ( 'TilePlacement' )
            // InternalBgDsl.g:3138:2: 'TilePlacement'
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
    // InternalBgDsl.g:3147:1: rule__TilePlacement__Group__1 : rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 ;
    public final void rule__TilePlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3151:1: ( rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2 )
            // InternalBgDsl.g:3152:2: rule__TilePlacement__Group__1__Impl rule__TilePlacement__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBgDsl.g:3159:1: rule__TilePlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__TilePlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3163:1: ( ( '{' ) )
            // InternalBgDsl.g:3164:1: ( '{' )
            {
            // InternalBgDsl.g:3164:1: ( '{' )
            // InternalBgDsl.g:3165:2: '{'
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
    // InternalBgDsl.g:3174:1: rule__TilePlacement__Group__2 : rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 ;
    public final void rule__TilePlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3178:1: ( rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3 )
            // InternalBgDsl.g:3179:2: rule__TilePlacement__Group__2__Impl rule__TilePlacement__Group__3
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
    // InternalBgDsl.g:3186:1: rule__TilePlacement__Group__2__Impl : ( 'row' ) ;
    public final void rule__TilePlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3190:1: ( ( 'row' ) )
            // InternalBgDsl.g:3191:1: ( 'row' )
            {
            // InternalBgDsl.g:3191:1: ( 'row' )
            // InternalBgDsl.g:3192:2: 'row'
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
    // InternalBgDsl.g:3201:1: rule__TilePlacement__Group__3 : rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 ;
    public final void rule__TilePlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3205:1: ( rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4 )
            // InternalBgDsl.g:3206:2: rule__TilePlacement__Group__3__Impl rule__TilePlacement__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalBgDsl.g:3213:1: rule__TilePlacement__Group__3__Impl : ( ( rule__TilePlacement__RowAssignment_3 ) ) ;
    public final void rule__TilePlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3217:1: ( ( ( rule__TilePlacement__RowAssignment_3 ) ) )
            // InternalBgDsl.g:3218:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            {
            // InternalBgDsl.g:3218:1: ( ( rule__TilePlacement__RowAssignment_3 ) )
            // InternalBgDsl.g:3219:2: ( rule__TilePlacement__RowAssignment_3 )
            {
             before(grammarAccess.getTilePlacementAccess().getRowAssignment_3()); 
            // InternalBgDsl.g:3220:2: ( rule__TilePlacement__RowAssignment_3 )
            // InternalBgDsl.g:3220:3: rule__TilePlacement__RowAssignment_3
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
    // InternalBgDsl.g:3228:1: rule__TilePlacement__Group__4 : rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 ;
    public final void rule__TilePlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3232:1: ( rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5 )
            // InternalBgDsl.g:3233:2: rule__TilePlacement__Group__4__Impl rule__TilePlacement__Group__5
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
    // InternalBgDsl.g:3240:1: rule__TilePlacement__Group__4__Impl : ( 'column' ) ;
    public final void rule__TilePlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3244:1: ( ( 'column' ) )
            // InternalBgDsl.g:3245:1: ( 'column' )
            {
            // InternalBgDsl.g:3245:1: ( 'column' )
            // InternalBgDsl.g:3246:2: 'column'
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
    // InternalBgDsl.g:3255:1: rule__TilePlacement__Group__5 : rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 ;
    public final void rule__TilePlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3259:1: ( rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6 )
            // InternalBgDsl.g:3260:2: rule__TilePlacement__Group__5__Impl rule__TilePlacement__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalBgDsl.g:3267:1: rule__TilePlacement__Group__5__Impl : ( ( rule__TilePlacement__ColumnAssignment_5 ) ) ;
    public final void rule__TilePlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3271:1: ( ( ( rule__TilePlacement__ColumnAssignment_5 ) ) )
            // InternalBgDsl.g:3272:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            {
            // InternalBgDsl.g:3272:1: ( ( rule__TilePlacement__ColumnAssignment_5 ) )
            // InternalBgDsl.g:3273:2: ( rule__TilePlacement__ColumnAssignment_5 )
            {
             before(grammarAccess.getTilePlacementAccess().getColumnAssignment_5()); 
            // InternalBgDsl.g:3274:2: ( rule__TilePlacement__ColumnAssignment_5 )
            // InternalBgDsl.g:3274:3: rule__TilePlacement__ColumnAssignment_5
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
    // InternalBgDsl.g:3282:1: rule__TilePlacement__Group__6 : rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 ;
    public final void rule__TilePlacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3286:1: ( rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7 )
            // InternalBgDsl.g:3287:2: rule__TilePlacement__Group__6__Impl rule__TilePlacement__Group__7
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
    // InternalBgDsl.g:3294:1: rule__TilePlacement__Group__6__Impl : ( 'tile' ) ;
    public final void rule__TilePlacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3298:1: ( ( 'tile' ) )
            // InternalBgDsl.g:3299:1: ( 'tile' )
            {
            // InternalBgDsl.g:3299:1: ( 'tile' )
            // InternalBgDsl.g:3300:2: 'tile'
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
    // InternalBgDsl.g:3309:1: rule__TilePlacement__Group__7 : rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 ;
    public final void rule__TilePlacement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3313:1: ( rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8 )
            // InternalBgDsl.g:3314:2: rule__TilePlacement__Group__7__Impl rule__TilePlacement__Group__8
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
    // InternalBgDsl.g:3321:1: rule__TilePlacement__Group__7__Impl : ( ( rule__TilePlacement__TileAssignment_7 ) ) ;
    public final void rule__TilePlacement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3325:1: ( ( ( rule__TilePlacement__TileAssignment_7 ) ) )
            // InternalBgDsl.g:3326:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            {
            // InternalBgDsl.g:3326:1: ( ( rule__TilePlacement__TileAssignment_7 ) )
            // InternalBgDsl.g:3327:2: ( rule__TilePlacement__TileAssignment_7 )
            {
             before(grammarAccess.getTilePlacementAccess().getTileAssignment_7()); 
            // InternalBgDsl.g:3328:2: ( rule__TilePlacement__TileAssignment_7 )
            // InternalBgDsl.g:3328:3: rule__TilePlacement__TileAssignment_7
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
    // InternalBgDsl.g:3336:1: rule__TilePlacement__Group__8 : rule__TilePlacement__Group__8__Impl ;
    public final void rule__TilePlacement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3340:1: ( rule__TilePlacement__Group__8__Impl )
            // InternalBgDsl.g:3341:2: rule__TilePlacement__Group__8__Impl
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
    // InternalBgDsl.g:3347:1: rule__TilePlacement__Group__8__Impl : ( '}' ) ;
    public final void rule__TilePlacement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3351:1: ( ( '}' ) )
            // InternalBgDsl.g:3352:1: ( '}' )
            {
            // InternalBgDsl.g:3352:1: ( '}' )
            // InternalBgDsl.g:3353:2: '}'
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
    // InternalBgDsl.g:3363:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3367:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBgDsl.g:3368:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalBgDsl.g:3375:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3379:1: ( ( 'State' ) )
            // InternalBgDsl.g:3380:1: ( 'State' )
            {
            // InternalBgDsl.g:3380:1: ( 'State' )
            // InternalBgDsl.g:3381:2: 'State'
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
    // InternalBgDsl.g:3390:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3394:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBgDsl.g:3395:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalBgDsl.g:3402:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3406:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalBgDsl.g:3407:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:3407:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalBgDsl.g:3408:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:3409:2: ( rule__State__NameAssignment_1 )
            // InternalBgDsl.g:3409:3: rule__State__NameAssignment_1
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
    // InternalBgDsl.g:3417:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3421:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBgDsl.g:3422:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalBgDsl.g:3429:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3433:1: ( ( '{' ) )
            // InternalBgDsl.g:3434:1: ( '{' )
            {
            // InternalBgDsl.g:3434:1: ( '{' )
            // InternalBgDsl.g:3435:2: '{'
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
    // InternalBgDsl.g:3444:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3448:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBgDsl.g:3449:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalBgDsl.g:3456:1: rule__State__Group__3__Impl : ( 'hexColor' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3460:1: ( ( 'hexColor' ) )
            // InternalBgDsl.g:3461:1: ( 'hexColor' )
            {
            // InternalBgDsl.g:3461:1: ( 'hexColor' )
            // InternalBgDsl.g:3462:2: 'hexColor'
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
    // InternalBgDsl.g:3471:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3475:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBgDsl.g:3476:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalBgDsl.g:3483:1: rule__State__Group__4__Impl : ( ( rule__State__HexColorAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3487:1: ( ( ( rule__State__HexColorAssignment_4 ) ) )
            // InternalBgDsl.g:3488:1: ( ( rule__State__HexColorAssignment_4 ) )
            {
            // InternalBgDsl.g:3488:1: ( ( rule__State__HexColorAssignment_4 ) )
            // InternalBgDsl.g:3489:2: ( rule__State__HexColorAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getHexColorAssignment_4()); 
            // InternalBgDsl.g:3490:2: ( rule__State__HexColorAssignment_4 )
            // InternalBgDsl.g:3490:3: rule__State__HexColorAssignment_4
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
    // InternalBgDsl.g:3498:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3502:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalBgDsl.g:3503:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalBgDsl.g:3510:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3514:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalBgDsl.g:3515:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalBgDsl.g:3515:1: ( ( rule__State__Group_5__0 )? )
            // InternalBgDsl.g:3516:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalBgDsl.g:3517:2: ( rule__State__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBgDsl.g:3517:3: rule__State__Group_5__0
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
    // InternalBgDsl.g:3525:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3529:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalBgDsl.g:3530:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalBgDsl.g:3537:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3541:1: ( ( ( rule__State__Group_6__0 )? ) )
            // InternalBgDsl.g:3542:1: ( ( rule__State__Group_6__0 )? )
            {
            // InternalBgDsl.g:3542:1: ( ( rule__State__Group_6__0 )? )
            // InternalBgDsl.g:3543:2: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // InternalBgDsl.g:3544:2: ( rule__State__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBgDsl.g:3544:3: rule__State__Group_6__0
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
    // InternalBgDsl.g:3552:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3556:1: ( rule__State__Group__7__Impl )
            // InternalBgDsl.g:3557:2: rule__State__Group__7__Impl
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
    // InternalBgDsl.g:3563:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3567:1: ( ( '}' ) )
            // InternalBgDsl.g:3568:1: ( '}' )
            {
            // InternalBgDsl.g:3568:1: ( '}' )
            // InternalBgDsl.g:3569:2: '}'
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
    // InternalBgDsl.g:3579:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3583:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalBgDsl.g:3584:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBgDsl.g:3591:1: rule__State__Group_5__0__Impl : ( 'outbound' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3595:1: ( ( 'outbound' ) )
            // InternalBgDsl.g:3596:1: ( 'outbound' )
            {
            // InternalBgDsl.g:3596:1: ( 'outbound' )
            // InternalBgDsl.g:3597:2: 'outbound'
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
    // InternalBgDsl.g:3606:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3610:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalBgDsl.g:3611:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalBgDsl.g:3618:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3622:1: ( ( '(' ) )
            // InternalBgDsl.g:3623:1: ( '(' )
            {
            // InternalBgDsl.g:3623:1: ( '(' )
            // InternalBgDsl.g:3624:2: '('
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
    // InternalBgDsl.g:3633:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3637:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalBgDsl.g:3638:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3645:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutboundAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3649:1: ( ( ( rule__State__OutboundAssignment_5_2 ) ) )
            // InternalBgDsl.g:3650:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            {
            // InternalBgDsl.g:3650:1: ( ( rule__State__OutboundAssignment_5_2 ) )
            // InternalBgDsl.g:3651:2: ( rule__State__OutboundAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_2()); 
            // InternalBgDsl.g:3652:2: ( rule__State__OutboundAssignment_5_2 )
            // InternalBgDsl.g:3652:3: rule__State__OutboundAssignment_5_2
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
    // InternalBgDsl.g:3660:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3664:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalBgDsl.g:3665:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3672:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3676:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalBgDsl.g:3677:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalBgDsl.g:3677:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalBgDsl.g:3678:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalBgDsl.g:3679:2: ( rule__State__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBgDsl.g:3679:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBgDsl.g:3687:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3691:1: ( rule__State__Group_5__4__Impl )
            // InternalBgDsl.g:3692:2: rule__State__Group_5__4__Impl
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
    // InternalBgDsl.g:3698:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3702:1: ( ( ')' ) )
            // InternalBgDsl.g:3703:1: ( ')' )
            {
            // InternalBgDsl.g:3703:1: ( ')' )
            // InternalBgDsl.g:3704:2: ')'
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
    // InternalBgDsl.g:3714:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3718:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalBgDsl.g:3719:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
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
    // InternalBgDsl.g:3726:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3730:1: ( ( ',' ) )
            // InternalBgDsl.g:3731:1: ( ',' )
            {
            // InternalBgDsl.g:3731:1: ( ',' )
            // InternalBgDsl.g:3732:2: ','
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
    // InternalBgDsl.g:3741:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3745:1: ( rule__State__Group_5_3__1__Impl )
            // InternalBgDsl.g:3746:2: rule__State__Group_5_3__1__Impl
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
    // InternalBgDsl.g:3752:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutboundAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3756:1: ( ( ( rule__State__OutboundAssignment_5_3_1 ) ) )
            // InternalBgDsl.g:3757:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            {
            // InternalBgDsl.g:3757:1: ( ( rule__State__OutboundAssignment_5_3_1 ) )
            // InternalBgDsl.g:3758:2: ( rule__State__OutboundAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutboundAssignment_5_3_1()); 
            // InternalBgDsl.g:3759:2: ( rule__State__OutboundAssignment_5_3_1 )
            // InternalBgDsl.g:3759:3: rule__State__OutboundAssignment_5_3_1
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
    // InternalBgDsl.g:3768:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3772:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // InternalBgDsl.g:3773:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBgDsl.g:3780:1: rule__State__Group_6__0__Impl : ( 'inbound' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3784:1: ( ( 'inbound' ) )
            // InternalBgDsl.g:3785:1: ( 'inbound' )
            {
            // InternalBgDsl.g:3785:1: ( 'inbound' )
            // InternalBgDsl.g:3786:2: 'inbound'
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
    // InternalBgDsl.g:3795:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl rule__State__Group_6__2 ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3799:1: ( rule__State__Group_6__1__Impl rule__State__Group_6__2 )
            // InternalBgDsl.g:3800:2: rule__State__Group_6__1__Impl rule__State__Group_6__2
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
    // InternalBgDsl.g:3807:1: rule__State__Group_6__1__Impl : ( '(' ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3811:1: ( ( '(' ) )
            // InternalBgDsl.g:3812:1: ( '(' )
            {
            // InternalBgDsl.g:3812:1: ( '(' )
            // InternalBgDsl.g:3813:2: '('
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
    // InternalBgDsl.g:3822:1: rule__State__Group_6__2 : rule__State__Group_6__2__Impl rule__State__Group_6__3 ;
    public final void rule__State__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3826:1: ( rule__State__Group_6__2__Impl rule__State__Group_6__3 )
            // InternalBgDsl.g:3827:2: rule__State__Group_6__2__Impl rule__State__Group_6__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3834:1: rule__State__Group_6__2__Impl : ( ( rule__State__InboundAssignment_6_2 ) ) ;
    public final void rule__State__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3838:1: ( ( ( rule__State__InboundAssignment_6_2 ) ) )
            // InternalBgDsl.g:3839:1: ( ( rule__State__InboundAssignment_6_2 ) )
            {
            // InternalBgDsl.g:3839:1: ( ( rule__State__InboundAssignment_6_2 ) )
            // InternalBgDsl.g:3840:2: ( rule__State__InboundAssignment_6_2 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_2()); 
            // InternalBgDsl.g:3841:2: ( rule__State__InboundAssignment_6_2 )
            // InternalBgDsl.g:3841:3: rule__State__InboundAssignment_6_2
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
    // InternalBgDsl.g:3849:1: rule__State__Group_6__3 : rule__State__Group_6__3__Impl rule__State__Group_6__4 ;
    public final void rule__State__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3853:1: ( rule__State__Group_6__3__Impl rule__State__Group_6__4 )
            // InternalBgDsl.g:3854:2: rule__State__Group_6__3__Impl rule__State__Group_6__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:3861:1: rule__State__Group_6__3__Impl : ( ( rule__State__Group_6_3__0 )* ) ;
    public final void rule__State__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3865:1: ( ( ( rule__State__Group_6_3__0 )* ) )
            // InternalBgDsl.g:3866:1: ( ( rule__State__Group_6_3__0 )* )
            {
            // InternalBgDsl.g:3866:1: ( ( rule__State__Group_6_3__0 )* )
            // InternalBgDsl.g:3867:2: ( rule__State__Group_6_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_6_3()); 
            // InternalBgDsl.g:3868:2: ( rule__State__Group_6_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBgDsl.g:3868:3: rule__State__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__State__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBgDsl.g:3876:1: rule__State__Group_6__4 : rule__State__Group_6__4__Impl ;
    public final void rule__State__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3880:1: ( rule__State__Group_6__4__Impl )
            // InternalBgDsl.g:3881:2: rule__State__Group_6__4__Impl
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
    // InternalBgDsl.g:3887:1: rule__State__Group_6__4__Impl : ( ')' ) ;
    public final void rule__State__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3891:1: ( ( ')' ) )
            // InternalBgDsl.g:3892:1: ( ')' )
            {
            // InternalBgDsl.g:3892:1: ( ')' )
            // InternalBgDsl.g:3893:2: ')'
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
    // InternalBgDsl.g:3903:1: rule__State__Group_6_3__0 : rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 ;
    public final void rule__State__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3907:1: ( rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 )
            // InternalBgDsl.g:3908:2: rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1
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
    // InternalBgDsl.g:3915:1: rule__State__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3919:1: ( ( ',' ) )
            // InternalBgDsl.g:3920:1: ( ',' )
            {
            // InternalBgDsl.g:3920:1: ( ',' )
            // InternalBgDsl.g:3921:2: ','
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
    // InternalBgDsl.g:3930:1: rule__State__Group_6_3__1 : rule__State__Group_6_3__1__Impl ;
    public final void rule__State__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3934:1: ( rule__State__Group_6_3__1__Impl )
            // InternalBgDsl.g:3935:2: rule__State__Group_6_3__1__Impl
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
    // InternalBgDsl.g:3941:1: rule__State__Group_6_3__1__Impl : ( ( rule__State__InboundAssignment_6_3_1 ) ) ;
    public final void rule__State__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3945:1: ( ( ( rule__State__InboundAssignment_6_3_1 ) ) )
            // InternalBgDsl.g:3946:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            {
            // InternalBgDsl.g:3946:1: ( ( rule__State__InboundAssignment_6_3_1 ) )
            // InternalBgDsl.g:3947:2: ( rule__State__InboundAssignment_6_3_1 )
            {
             before(grammarAccess.getStateAccess().getInboundAssignment_6_3_1()); 
            // InternalBgDsl.g:3948:2: ( rule__State__InboundAssignment_6_3_1 )
            // InternalBgDsl.g:3948:3: rule__State__InboundAssignment_6_3_1
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
    // InternalBgDsl.g:3957:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3961:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBgDsl.g:3962:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalBgDsl.g:3969:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3973:1: ( ( 'Transition' ) )
            // InternalBgDsl.g:3974:1: ( 'Transition' )
            {
            // InternalBgDsl.g:3974:1: ( 'Transition' )
            // InternalBgDsl.g:3975:2: 'Transition'
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
    // InternalBgDsl.g:3984:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:3988:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBgDsl.g:3989:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalBgDsl.g:3996:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4000:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4001:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4001:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalBgDsl.g:4002:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4003:2: ( rule__Transition__NameAssignment_1 )
            // InternalBgDsl.g:4003:3: rule__Transition__NameAssignment_1
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
    // InternalBgDsl.g:4011:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4015:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBgDsl.g:4016:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBgDsl.g:4023:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4027:1: ( ( '{' ) )
            // InternalBgDsl.g:4028:1: ( '{' )
            {
            // InternalBgDsl.g:4028:1: ( '{' )
            // InternalBgDsl.g:4029:2: '{'
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
    // InternalBgDsl.g:4038:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4042:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBgDsl.g:4043:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalBgDsl.g:4050:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4054:1: ( ( 'source' ) )
            // InternalBgDsl.g:4055:1: ( 'source' )
            {
            // InternalBgDsl.g:4055:1: ( 'source' )
            // InternalBgDsl.g:4056:2: 'source'
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
    // InternalBgDsl.g:4065:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4069:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalBgDsl.g:4070:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalBgDsl.g:4077:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4081:1: ( ( '(' ) )
            // InternalBgDsl.g:4082:1: ( '(' )
            {
            // InternalBgDsl.g:4082:1: ( '(' )
            // InternalBgDsl.g:4083:2: '('
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
    // InternalBgDsl.g:4092:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4096:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalBgDsl.g:4097:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:4104:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4108:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalBgDsl.g:4109:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalBgDsl.g:4109:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalBgDsl.g:4110:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalBgDsl.g:4111:2: ( rule__Transition__SourceAssignment_5 )
            // InternalBgDsl.g:4111:3: rule__Transition__SourceAssignment_5
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
    // InternalBgDsl.g:4119:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4123:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalBgDsl.g:4124:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalBgDsl.g:4131:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )* ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4135:1: ( ( ( rule__Transition__Group_6__0 )* ) )
            // InternalBgDsl.g:4136:1: ( ( rule__Transition__Group_6__0 )* )
            {
            // InternalBgDsl.g:4136:1: ( ( rule__Transition__Group_6__0 )* )
            // InternalBgDsl.g:4137:2: ( rule__Transition__Group_6__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalBgDsl.g:4138:2: ( rule__Transition__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBgDsl.g:4138:3: rule__Transition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBgDsl.g:4146:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4150:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalBgDsl.g:4151:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBgDsl.g:4158:1: rule__Transition__Group__7__Impl : ( ')' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4162:1: ( ( ')' ) )
            // InternalBgDsl.g:4163:1: ( ')' )
            {
            // InternalBgDsl.g:4163:1: ( ')' )
            // InternalBgDsl.g:4164:2: ')'
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
    // InternalBgDsl.g:4173:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4177:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalBgDsl.g:4178:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
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
    // InternalBgDsl.g:4185:1: rule__Transition__Group__8__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4189:1: ( ( 'target' ) )
            // InternalBgDsl.g:4190:1: ( 'target' )
            {
            // InternalBgDsl.g:4190:1: ( 'target' )
            // InternalBgDsl.g:4191:2: 'target'
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
    // InternalBgDsl.g:4200:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4204:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalBgDsl.g:4205:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
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
    // InternalBgDsl.g:4212:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__TargetAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4216:1: ( ( ( rule__Transition__TargetAssignment_9 ) ) )
            // InternalBgDsl.g:4217:1: ( ( rule__Transition__TargetAssignment_9 ) )
            {
            // InternalBgDsl.g:4217:1: ( ( rule__Transition__TargetAssignment_9 ) )
            // InternalBgDsl.g:4218:2: ( rule__Transition__TargetAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_9()); 
            // InternalBgDsl.g:4219:2: ( rule__Transition__TargetAssignment_9 )
            // InternalBgDsl.g:4219:3: rule__Transition__TargetAssignment_9
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
    // InternalBgDsl.g:4227:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4231:1: ( rule__Transition__Group__10__Impl )
            // InternalBgDsl.g:4232:2: rule__Transition__Group__10__Impl
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
    // InternalBgDsl.g:4238:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4242:1: ( ( '}' ) )
            // InternalBgDsl.g:4243:1: ( '}' )
            {
            // InternalBgDsl.g:4243:1: ( '}' )
            // InternalBgDsl.g:4244:2: '}'
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
    // InternalBgDsl.g:4254:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4258:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalBgDsl.g:4259:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
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
    // InternalBgDsl.g:4266:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4270:1: ( ( ',' ) )
            // InternalBgDsl.g:4271:1: ( ',' )
            {
            // InternalBgDsl.g:4271:1: ( ',' )
            // InternalBgDsl.g:4272:2: ','
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
    // InternalBgDsl.g:4281:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4285:1: ( rule__Transition__Group_6__1__Impl )
            // InternalBgDsl.g:4286:2: rule__Transition__Group_6__1__Impl
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
    // InternalBgDsl.g:4292:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4296:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // InternalBgDsl.g:4297:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // InternalBgDsl.g:4297:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // InternalBgDsl.g:4298:2: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // InternalBgDsl.g:4299:2: ( rule__Transition__SourceAssignment_6_1 )
            // InternalBgDsl.g:4299:3: rule__Transition__SourceAssignment_6_1
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
    // InternalBgDsl.g:4308:1: rule__PatternFilter__Group__0 : rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 ;
    public final void rule__PatternFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4312:1: ( rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1 )
            // InternalBgDsl.g:4313:2: rule__PatternFilter__Group__0__Impl rule__PatternFilter__Group__1
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
    // InternalBgDsl.g:4320:1: rule__PatternFilter__Group__0__Impl : ( 'PatternFilter' ) ;
    public final void rule__PatternFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4324:1: ( ( 'PatternFilter' ) )
            // InternalBgDsl.g:4325:1: ( 'PatternFilter' )
            {
            // InternalBgDsl.g:4325:1: ( 'PatternFilter' )
            // InternalBgDsl.g:4326:2: 'PatternFilter'
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
    // InternalBgDsl.g:4335:1: rule__PatternFilter__Group__1 : rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 ;
    public final void rule__PatternFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4339:1: ( rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2 )
            // InternalBgDsl.g:4340:2: rule__PatternFilter__Group__1__Impl rule__PatternFilter__Group__2
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
    // InternalBgDsl.g:4347:1: rule__PatternFilter__Group__1__Impl : ( ( rule__PatternFilter__NameAssignment_1 ) ) ;
    public final void rule__PatternFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4351:1: ( ( ( rule__PatternFilter__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4352:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4352:1: ( ( rule__PatternFilter__NameAssignment_1 ) )
            // InternalBgDsl.g:4353:2: ( rule__PatternFilter__NameAssignment_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4354:2: ( rule__PatternFilter__NameAssignment_1 )
            // InternalBgDsl.g:4354:3: rule__PatternFilter__NameAssignment_1
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
    // InternalBgDsl.g:4362:1: rule__PatternFilter__Group__2 : rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 ;
    public final void rule__PatternFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4366:1: ( rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3 )
            // InternalBgDsl.g:4367:2: rule__PatternFilter__Group__2__Impl rule__PatternFilter__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBgDsl.g:4374:1: rule__PatternFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4378:1: ( ( '{' ) )
            // InternalBgDsl.g:4379:1: ( '{' )
            {
            // InternalBgDsl.g:4379:1: ( '{' )
            // InternalBgDsl.g:4380:2: '{'
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
    // InternalBgDsl.g:4389:1: rule__PatternFilter__Group__3 : rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 ;
    public final void rule__PatternFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4393:1: ( rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4 )
            // InternalBgDsl.g:4394:2: rule__PatternFilter__Group__3__Impl rule__PatternFilter__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalBgDsl.g:4401:1: rule__PatternFilter__Group__3__Impl : ( ( rule__PatternFilter__Group_3__0 )? ) ;
    public final void rule__PatternFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4405:1: ( ( ( rule__PatternFilter__Group_3__0 )? ) )
            // InternalBgDsl.g:4406:1: ( ( rule__PatternFilter__Group_3__0 )? )
            {
            // InternalBgDsl.g:4406:1: ( ( rule__PatternFilter__Group_3__0 )? )
            // InternalBgDsl.g:4407:2: ( rule__PatternFilter__Group_3__0 )?
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_3()); 
            // InternalBgDsl.g:4408:2: ( rule__PatternFilter__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBgDsl.g:4408:3: rule__PatternFilter__Group_3__0
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
    // InternalBgDsl.g:4416:1: rule__PatternFilter__Group__4 : rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 ;
    public final void rule__PatternFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4420:1: ( rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5 )
            // InternalBgDsl.g:4421:2: rule__PatternFilter__Group__4__Impl rule__PatternFilter__Group__5
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
    // InternalBgDsl.g:4428:1: rule__PatternFilter__Group__4__Impl : ( 'patterns' ) ;
    public final void rule__PatternFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4432:1: ( ( 'patterns' ) )
            // InternalBgDsl.g:4433:1: ( 'patterns' )
            {
            // InternalBgDsl.g:4433:1: ( 'patterns' )
            // InternalBgDsl.g:4434:2: 'patterns'
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
    // InternalBgDsl.g:4443:1: rule__PatternFilter__Group__5 : rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 ;
    public final void rule__PatternFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4447:1: ( rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6 )
            // InternalBgDsl.g:4448:2: rule__PatternFilter__Group__5__Impl rule__PatternFilter__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalBgDsl.g:4455:1: rule__PatternFilter__Group__5__Impl : ( '{' ) ;
    public final void rule__PatternFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4459:1: ( ( '{' ) )
            // InternalBgDsl.g:4460:1: ( '{' )
            {
            // InternalBgDsl.g:4460:1: ( '{' )
            // InternalBgDsl.g:4461:2: '{'
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
    // InternalBgDsl.g:4470:1: rule__PatternFilter__Group__6 : rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 ;
    public final void rule__PatternFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4474:1: ( rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7 )
            // InternalBgDsl.g:4475:2: rule__PatternFilter__Group__6__Impl rule__PatternFilter__Group__7
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
    // InternalBgDsl.g:4482:1: rule__PatternFilter__Group__6__Impl : ( ( rule__PatternFilter__PatternsAssignment_6 ) ) ;
    public final void rule__PatternFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4486:1: ( ( ( rule__PatternFilter__PatternsAssignment_6 ) ) )
            // InternalBgDsl.g:4487:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            {
            // InternalBgDsl.g:4487:1: ( ( rule__PatternFilter__PatternsAssignment_6 ) )
            // InternalBgDsl.g:4488:2: ( rule__PatternFilter__PatternsAssignment_6 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_6()); 
            // InternalBgDsl.g:4489:2: ( rule__PatternFilter__PatternsAssignment_6 )
            // InternalBgDsl.g:4489:3: rule__PatternFilter__PatternsAssignment_6
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
    // InternalBgDsl.g:4497:1: rule__PatternFilter__Group__7 : rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 ;
    public final void rule__PatternFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4501:1: ( rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8 )
            // InternalBgDsl.g:4502:2: rule__PatternFilter__Group__7__Impl rule__PatternFilter__Group__8
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
    // InternalBgDsl.g:4509:1: rule__PatternFilter__Group__7__Impl : ( ( rule__PatternFilter__Group_7__0 )* ) ;
    public final void rule__PatternFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4513:1: ( ( ( rule__PatternFilter__Group_7__0 )* ) )
            // InternalBgDsl.g:4514:1: ( ( rule__PatternFilter__Group_7__0 )* )
            {
            // InternalBgDsl.g:4514:1: ( ( rule__PatternFilter__Group_7__0 )* )
            // InternalBgDsl.g:4515:2: ( rule__PatternFilter__Group_7__0 )*
            {
             before(grammarAccess.getPatternFilterAccess().getGroup_7()); 
            // InternalBgDsl.g:4516:2: ( rule__PatternFilter__Group_7__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBgDsl.g:4516:3: rule__PatternFilter__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternFilter__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBgDsl.g:4524:1: rule__PatternFilter__Group__8 : rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 ;
    public final void rule__PatternFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4528:1: ( rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9 )
            // InternalBgDsl.g:4529:2: rule__PatternFilter__Group__8__Impl rule__PatternFilter__Group__9
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
    // InternalBgDsl.g:4536:1: rule__PatternFilter__Group__8__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4540:1: ( ( '}' ) )
            // InternalBgDsl.g:4541:1: ( '}' )
            {
            // InternalBgDsl.g:4541:1: ( '}' )
            // InternalBgDsl.g:4542:2: '}'
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
    // InternalBgDsl.g:4551:1: rule__PatternFilter__Group__9 : rule__PatternFilter__Group__9__Impl ;
    public final void rule__PatternFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4555:1: ( rule__PatternFilter__Group__9__Impl )
            // InternalBgDsl.g:4556:2: rule__PatternFilter__Group__9__Impl
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
    // InternalBgDsl.g:4562:1: rule__PatternFilter__Group__9__Impl : ( '}' ) ;
    public final void rule__PatternFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4566:1: ( ( '}' ) )
            // InternalBgDsl.g:4567:1: ( '}' )
            {
            // InternalBgDsl.g:4567:1: ( '}' )
            // InternalBgDsl.g:4568:2: '}'
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
    // InternalBgDsl.g:4578:1: rule__PatternFilter__Group_3__0 : rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 ;
    public final void rule__PatternFilter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4582:1: ( rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1 )
            // InternalBgDsl.g:4583:2: rule__PatternFilter__Group_3__0__Impl rule__PatternFilter__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBgDsl.g:4590:1: rule__PatternFilter__Group_3__0__Impl : ( 'nextFilter' ) ;
    public final void rule__PatternFilter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4594:1: ( ( 'nextFilter' ) )
            // InternalBgDsl.g:4595:1: ( 'nextFilter' )
            {
            // InternalBgDsl.g:4595:1: ( 'nextFilter' )
            // InternalBgDsl.g:4596:2: 'nextFilter'
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
    // InternalBgDsl.g:4605:1: rule__PatternFilter__Group_3__1 : rule__PatternFilter__Group_3__1__Impl ;
    public final void rule__PatternFilter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4609:1: ( rule__PatternFilter__Group_3__1__Impl )
            // InternalBgDsl.g:4610:2: rule__PatternFilter__Group_3__1__Impl
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
    // InternalBgDsl.g:4616:1: rule__PatternFilter__Group_3__1__Impl : ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) ;
    public final void rule__PatternFilter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4620:1: ( ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) ) )
            // InternalBgDsl.g:4621:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            {
            // InternalBgDsl.g:4621:1: ( ( rule__PatternFilter__NextFilterAssignment_3_1 ) )
            // InternalBgDsl.g:4622:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getNextFilterAssignment_3_1()); 
            // InternalBgDsl.g:4623:2: ( rule__PatternFilter__NextFilterAssignment_3_1 )
            // InternalBgDsl.g:4623:3: rule__PatternFilter__NextFilterAssignment_3_1
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
    // InternalBgDsl.g:4632:1: rule__PatternFilter__Group_7__0 : rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 ;
    public final void rule__PatternFilter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4636:1: ( rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1 )
            // InternalBgDsl.g:4637:2: rule__PatternFilter__Group_7__0__Impl rule__PatternFilter__Group_7__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalBgDsl.g:4644:1: rule__PatternFilter__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PatternFilter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4648:1: ( ( ',' ) )
            // InternalBgDsl.g:4649:1: ( ',' )
            {
            // InternalBgDsl.g:4649:1: ( ',' )
            // InternalBgDsl.g:4650:2: ','
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
    // InternalBgDsl.g:4659:1: rule__PatternFilter__Group_7__1 : rule__PatternFilter__Group_7__1__Impl ;
    public final void rule__PatternFilter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4663:1: ( rule__PatternFilter__Group_7__1__Impl )
            // InternalBgDsl.g:4664:2: rule__PatternFilter__Group_7__1__Impl
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
    // InternalBgDsl.g:4670:1: rule__PatternFilter__Group_7__1__Impl : ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) ;
    public final void rule__PatternFilter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4674:1: ( ( ( rule__PatternFilter__PatternsAssignment_7_1 ) ) )
            // InternalBgDsl.g:4675:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            {
            // InternalBgDsl.g:4675:1: ( ( rule__PatternFilter__PatternsAssignment_7_1 ) )
            // InternalBgDsl.g:4676:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            {
             before(grammarAccess.getPatternFilterAccess().getPatternsAssignment_7_1()); 
            // InternalBgDsl.g:4677:2: ( rule__PatternFilter__PatternsAssignment_7_1 )
            // InternalBgDsl.g:4677:3: rule__PatternFilter__PatternsAssignment_7_1
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
    // InternalBgDsl.g:4686:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4690:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalBgDsl.g:4691:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalBgDsl.g:4698:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4702:1: ( ( 'Pattern' ) )
            // InternalBgDsl.g:4703:1: ( 'Pattern' )
            {
            // InternalBgDsl.g:4703:1: ( 'Pattern' )
            // InternalBgDsl.g:4704:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBgDsl.g:4713:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4717:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalBgDsl.g:4718:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalBgDsl.g:4725:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4729:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalBgDsl.g:4730:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalBgDsl.g:4730:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalBgDsl.g:4731:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalBgDsl.g:4732:2: ( rule__Pattern__NameAssignment_1 )
            // InternalBgDsl.g:4732:3: rule__Pattern__NameAssignment_1
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
    // InternalBgDsl.g:4740:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4744:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalBgDsl.g:4745:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBgDsl.g:4752:1: rule__Pattern__Group__2__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4756:1: ( ( '{' ) )
            // InternalBgDsl.g:4757:1: ( '{' )
            {
            // InternalBgDsl.g:4757:1: ( '{' )
            // InternalBgDsl.g:4758:2: '{'
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
    // InternalBgDsl.g:4767:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4771:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalBgDsl.g:4772:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalBgDsl.g:4779:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__Group_3__0 )? ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4783:1: ( ( ( rule__Pattern__Group_3__0 )? ) )
            // InternalBgDsl.g:4784:1: ( ( rule__Pattern__Group_3__0 )? )
            {
            // InternalBgDsl.g:4784:1: ( ( rule__Pattern__Group_3__0 )? )
            // InternalBgDsl.g:4785:2: ( rule__Pattern__Group_3__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_3()); 
            // InternalBgDsl.g:4786:2: ( rule__Pattern__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBgDsl.g:4786:3: rule__Pattern__Group_3__0
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
    // InternalBgDsl.g:4794:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4798:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalBgDsl.g:4799:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalBgDsl.g:4806:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4810:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalBgDsl.g:4811:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalBgDsl.g:4811:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalBgDsl.g:4812:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalBgDsl.g:4813:2: ( rule__Pattern__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBgDsl.g:4813:3: rule__Pattern__Group_4__0
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
    // InternalBgDsl.g:4821:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4825:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalBgDsl.g:4826:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalBgDsl.g:4833:1: rule__Pattern__Group__5__Impl : ( 'relativecoordinates' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4837:1: ( ( 'relativecoordinates' ) )
            // InternalBgDsl.g:4838:1: ( 'relativecoordinates' )
            {
            // InternalBgDsl.g:4838:1: ( 'relativecoordinates' )
            // InternalBgDsl.g:4839:2: 'relativecoordinates'
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesKeyword_5()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBgDsl.g:4848:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4852:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalBgDsl.g:4853:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_43);
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
    // InternalBgDsl.g:4860:1: rule__Pattern__Group__6__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4864:1: ( ( '{' ) )
            // InternalBgDsl.g:4865:1: ( '{' )
            {
            // InternalBgDsl.g:4865:1: ( '{' )
            // InternalBgDsl.g:4866:2: '{'
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
    // InternalBgDsl.g:4875:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4879:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalBgDsl.g:4880:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
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
    // InternalBgDsl.g:4887:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4891:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) ) )
            // InternalBgDsl.g:4892:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            {
            // InternalBgDsl.g:4892:1: ( ( rule__Pattern__RelativecoordinatesAssignment_7 ) )
            // InternalBgDsl.g:4893:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_7()); 
            // InternalBgDsl.g:4894:2: ( rule__Pattern__RelativecoordinatesAssignment_7 )
            // InternalBgDsl.g:4894:3: rule__Pattern__RelativecoordinatesAssignment_7
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
    // InternalBgDsl.g:4902:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl rule__Pattern__Group__9 ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4906:1: ( rule__Pattern__Group__8__Impl rule__Pattern__Group__9 )
            // InternalBgDsl.g:4907:2: rule__Pattern__Group__8__Impl rule__Pattern__Group__9
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
    // InternalBgDsl.g:4914:1: rule__Pattern__Group__8__Impl : ( ( rule__Pattern__Group_8__0 )* ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4918:1: ( ( ( rule__Pattern__Group_8__0 )* ) )
            // InternalBgDsl.g:4919:1: ( ( rule__Pattern__Group_8__0 )* )
            {
            // InternalBgDsl.g:4919:1: ( ( rule__Pattern__Group_8__0 )* )
            // InternalBgDsl.g:4920:2: ( rule__Pattern__Group_8__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_8()); 
            // InternalBgDsl.g:4921:2: ( rule__Pattern__Group_8__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBgDsl.g:4921:3: rule__Pattern__Group_8__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBgDsl.g:4929:1: rule__Pattern__Group__9 : rule__Pattern__Group__9__Impl rule__Pattern__Group__10 ;
    public final void rule__Pattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4933:1: ( rule__Pattern__Group__9__Impl rule__Pattern__Group__10 )
            // InternalBgDsl.g:4934:2: rule__Pattern__Group__9__Impl rule__Pattern__Group__10
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
    // InternalBgDsl.g:4941:1: rule__Pattern__Group__9__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4945:1: ( ( '}' ) )
            // InternalBgDsl.g:4946:1: ( '}' )
            {
            // InternalBgDsl.g:4946:1: ( '}' )
            // InternalBgDsl.g:4947:2: '}'
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
    // InternalBgDsl.g:4956:1: rule__Pattern__Group__10 : rule__Pattern__Group__10__Impl ;
    public final void rule__Pattern__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4960:1: ( rule__Pattern__Group__10__Impl )
            // InternalBgDsl.g:4961:2: rule__Pattern__Group__10__Impl
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
    // InternalBgDsl.g:4967:1: rule__Pattern__Group__10__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4971:1: ( ( '}' ) )
            // InternalBgDsl.g:4972:1: ( '}' )
            {
            // InternalBgDsl.g:4972:1: ( '}' )
            // InternalBgDsl.g:4973:2: '}'
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
    // InternalBgDsl.g:4983:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4987:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalBgDsl.g:4988:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBgDsl.g:4995:1: rule__Pattern__Group_3__0__Impl : ( 'stateSelection' ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:4999:1: ( ( 'stateSelection' ) )
            // InternalBgDsl.g:5000:1: ( 'stateSelection' )
            {
            // InternalBgDsl.g:5000:1: ( 'stateSelection' )
            // InternalBgDsl.g:5001:2: 'stateSelection'
            {
             before(grammarAccess.getPatternAccess().getStateSelectionKeyword_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBgDsl.g:5010:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5014:1: ( rule__Pattern__Group_3__1__Impl )
            // InternalBgDsl.g:5015:2: rule__Pattern__Group_3__1__Impl
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
    // InternalBgDsl.g:5021:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5025:1: ( ( ( rule__Pattern__StateSelectionAssignment_3_1 ) ) )
            // InternalBgDsl.g:5026:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            {
            // InternalBgDsl.g:5026:1: ( ( rule__Pattern__StateSelectionAssignment_3_1 ) )
            // InternalBgDsl.g:5027:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            {
             before(grammarAccess.getPatternAccess().getStateSelectionAssignment_3_1()); 
            // InternalBgDsl.g:5028:2: ( rule__Pattern__StateSelectionAssignment_3_1 )
            // InternalBgDsl.g:5028:3: rule__Pattern__StateSelectionAssignment_3_1
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
    // InternalBgDsl.g:5037:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5041:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalBgDsl.g:5042:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
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
    // InternalBgDsl.g:5049:1: rule__Pattern__Group_4__0__Impl : ( 'matchState' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5053:1: ( ( 'matchState' ) )
            // InternalBgDsl.g:5054:1: ( 'matchState' )
            {
            // InternalBgDsl.g:5054:1: ( 'matchState' )
            // InternalBgDsl.g:5055:2: 'matchState'
            {
             before(grammarAccess.getPatternAccess().getMatchStateKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBgDsl.g:5064:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5068:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalBgDsl.g:5069:2: rule__Pattern__Group_4__1__Impl
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
    // InternalBgDsl.g:5075:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5079:1: ( ( ( rule__Pattern__MatchStateAssignment_4_1 ) ) )
            // InternalBgDsl.g:5080:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            {
            // InternalBgDsl.g:5080:1: ( ( rule__Pattern__MatchStateAssignment_4_1 ) )
            // InternalBgDsl.g:5081:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getMatchStateAssignment_4_1()); 
            // InternalBgDsl.g:5082:2: ( rule__Pattern__MatchStateAssignment_4_1 )
            // InternalBgDsl.g:5082:3: rule__Pattern__MatchStateAssignment_4_1
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
    // InternalBgDsl.g:5091:1: rule__Pattern__Group_8__0 : rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 ;
    public final void rule__Pattern__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5095:1: ( rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 )
            // InternalBgDsl.g:5096:2: rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalBgDsl.g:5103:1: rule__Pattern__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5107:1: ( ( ',' ) )
            // InternalBgDsl.g:5108:1: ( ',' )
            {
            // InternalBgDsl.g:5108:1: ( ',' )
            // InternalBgDsl.g:5109:2: ','
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
    // InternalBgDsl.g:5118:1: rule__Pattern__Group_8__1 : rule__Pattern__Group_8__1__Impl ;
    public final void rule__Pattern__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5122:1: ( rule__Pattern__Group_8__1__Impl )
            // InternalBgDsl.g:5123:2: rule__Pattern__Group_8__1__Impl
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
    // InternalBgDsl.g:5129:1: rule__Pattern__Group_8__1__Impl : ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) ;
    public final void rule__Pattern__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5133:1: ( ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) ) )
            // InternalBgDsl.g:5134:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            {
            // InternalBgDsl.g:5134:1: ( ( rule__Pattern__RelativecoordinatesAssignment_8_1 ) )
            // InternalBgDsl.g:5135:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            {
             before(grammarAccess.getPatternAccess().getRelativecoordinatesAssignment_8_1()); 
            // InternalBgDsl.g:5136:2: ( rule__Pattern__RelativecoordinatesAssignment_8_1 )
            // InternalBgDsl.g:5136:3: rule__Pattern__RelativecoordinatesAssignment_8_1
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
    // InternalBgDsl.g:5145:1: rule__RelativeCoordinate__Group__0 : rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 ;
    public final void rule__RelativeCoordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5149:1: ( rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1 )
            // InternalBgDsl.g:5150:2: rule__RelativeCoordinate__Group__0__Impl rule__RelativeCoordinate__Group__1
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
    // InternalBgDsl.g:5157:1: rule__RelativeCoordinate__Group__0__Impl : ( 'RelativeCoordinate' ) ;
    public final void rule__RelativeCoordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5161:1: ( ( 'RelativeCoordinate' ) )
            // InternalBgDsl.g:5162:1: ( 'RelativeCoordinate' )
            {
            // InternalBgDsl.g:5162:1: ( 'RelativeCoordinate' )
            // InternalBgDsl.g:5163:2: 'RelativeCoordinate'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getRelativeCoordinateKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBgDsl.g:5172:1: rule__RelativeCoordinate__Group__1 : rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 ;
    public final void rule__RelativeCoordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5176:1: ( rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2 )
            // InternalBgDsl.g:5177:2: rule__RelativeCoordinate__Group__1__Impl rule__RelativeCoordinate__Group__2
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
    // InternalBgDsl.g:5184:1: rule__RelativeCoordinate__Group__1__Impl : ( '{' ) ;
    public final void rule__RelativeCoordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5188:1: ( ( '{' ) )
            // InternalBgDsl.g:5189:1: ( '{' )
            {
            // InternalBgDsl.g:5189:1: ( '{' )
            // InternalBgDsl.g:5190:2: '{'
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
    // InternalBgDsl.g:5199:1: rule__RelativeCoordinate__Group__2 : rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 ;
    public final void rule__RelativeCoordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5203:1: ( rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3 )
            // InternalBgDsl.g:5204:2: rule__RelativeCoordinate__Group__2__Impl rule__RelativeCoordinate__Group__3
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
    // InternalBgDsl.g:5211:1: rule__RelativeCoordinate__Group__2__Impl : ( 'x' ) ;
    public final void rule__RelativeCoordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5215:1: ( ( 'x' ) )
            // InternalBgDsl.g:5216:1: ( 'x' )
            {
            // InternalBgDsl.g:5216:1: ( 'x' )
            // InternalBgDsl.g:5217:2: 'x'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXKeyword_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBgDsl.g:5226:1: rule__RelativeCoordinate__Group__3 : rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 ;
    public final void rule__RelativeCoordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5230:1: ( rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4 )
            // InternalBgDsl.g:5231:2: rule__RelativeCoordinate__Group__3__Impl rule__RelativeCoordinate__Group__4
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
    // InternalBgDsl.g:5238:1: rule__RelativeCoordinate__Group__3__Impl : ( ( rule__RelativeCoordinate__XAssignment_3 ) ) ;
    public final void rule__RelativeCoordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5242:1: ( ( ( rule__RelativeCoordinate__XAssignment_3 ) ) )
            // InternalBgDsl.g:5243:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            {
            // InternalBgDsl.g:5243:1: ( ( rule__RelativeCoordinate__XAssignment_3 ) )
            // InternalBgDsl.g:5244:2: ( rule__RelativeCoordinate__XAssignment_3 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getXAssignment_3()); 
            // InternalBgDsl.g:5245:2: ( rule__RelativeCoordinate__XAssignment_3 )
            // InternalBgDsl.g:5245:3: rule__RelativeCoordinate__XAssignment_3
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
    // InternalBgDsl.g:5253:1: rule__RelativeCoordinate__Group__4 : rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 ;
    public final void rule__RelativeCoordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5257:1: ( rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5 )
            // InternalBgDsl.g:5258:2: rule__RelativeCoordinate__Group__4__Impl rule__RelativeCoordinate__Group__5
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
    // InternalBgDsl.g:5265:1: rule__RelativeCoordinate__Group__4__Impl : ( 'y' ) ;
    public final void rule__RelativeCoordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5269:1: ( ( 'y' ) )
            // InternalBgDsl.g:5270:1: ( 'y' )
            {
            // InternalBgDsl.g:5270:1: ( 'y' )
            // InternalBgDsl.g:5271:2: 'y'
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYKeyword_4()); 
            match(input,64,FOLLOW_2); 
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
    // InternalBgDsl.g:5280:1: rule__RelativeCoordinate__Group__5 : rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 ;
    public final void rule__RelativeCoordinate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5284:1: ( rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6 )
            // InternalBgDsl.g:5285:2: rule__RelativeCoordinate__Group__5__Impl rule__RelativeCoordinate__Group__6
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
    // InternalBgDsl.g:5292:1: rule__RelativeCoordinate__Group__5__Impl : ( ( rule__RelativeCoordinate__YAssignment_5 ) ) ;
    public final void rule__RelativeCoordinate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5296:1: ( ( ( rule__RelativeCoordinate__YAssignment_5 ) ) )
            // InternalBgDsl.g:5297:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            {
            // InternalBgDsl.g:5297:1: ( ( rule__RelativeCoordinate__YAssignment_5 ) )
            // InternalBgDsl.g:5298:2: ( rule__RelativeCoordinate__YAssignment_5 )
            {
             before(grammarAccess.getRelativeCoordinateAccess().getYAssignment_5()); 
            // InternalBgDsl.g:5299:2: ( rule__RelativeCoordinate__YAssignment_5 )
            // InternalBgDsl.g:5299:3: rule__RelativeCoordinate__YAssignment_5
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
    // InternalBgDsl.g:5307:1: rule__RelativeCoordinate__Group__6 : rule__RelativeCoordinate__Group__6__Impl ;
    public final void rule__RelativeCoordinate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5311:1: ( rule__RelativeCoordinate__Group__6__Impl )
            // InternalBgDsl.g:5312:2: rule__RelativeCoordinate__Group__6__Impl
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
    // InternalBgDsl.g:5318:1: rule__RelativeCoordinate__Group__6__Impl : ( '}' ) ;
    public final void rule__RelativeCoordinate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5322:1: ( ( '}' ) )
            // InternalBgDsl.g:5323:1: ( '}' )
            {
            // InternalBgDsl.g:5323:1: ( '}' )
            // InternalBgDsl.g:5324:2: '}'
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
    // InternalBgDsl.g:5334:1: rule__Game__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5338:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5339:2: ( ruleEString )
            {
            // InternalBgDsl.g:5339:2: ( ruleEString )
            // InternalBgDsl.g:5340:3: ruleEString
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
    // InternalBgDsl.g:5349:1: rule__Game__InitialPlayerAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Game__InitialPlayerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5353:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5354:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5354:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5355:3: ( ruleEString )
            {
             before(grammarAccess.getGameAccess().getInitialPlayerPlayerCrossReference_3_1_0()); 
            // InternalBgDsl.g:5356:3: ( ruleEString )
            // InternalBgDsl.g:5357:4: ruleEString
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
    // InternalBgDsl.g:5368:1: rule__Game__BoardAssignment_5 : ( ruleBoard ) ;
    public final void rule__Game__BoardAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5372:1: ( ( ruleBoard ) )
            // InternalBgDsl.g:5373:2: ( ruleBoard )
            {
            // InternalBgDsl.g:5373:2: ( ruleBoard )
            // InternalBgDsl.g:5374:3: ruleBoard
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
    // InternalBgDsl.g:5383:1: rule__Game__PlayersAssignment_6_2 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5387:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5388:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5388:2: ( rulePlayer )
            // InternalBgDsl.g:5389:3: rulePlayer
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
    // InternalBgDsl.g:5398:1: rule__Game__PlayersAssignment_6_3_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5402:1: ( ( rulePlayer ) )
            // InternalBgDsl.g:5403:2: ( rulePlayer )
            {
            // InternalBgDsl.g:5403:2: ( rulePlayer )
            // InternalBgDsl.g:5404:3: rulePlayer
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
    // InternalBgDsl.g:5413:1: rule__Game__TurnPolicyAssignment_8 : ( ruleTurnType ) ;
    public final void rule__Game__TurnPolicyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5417:1: ( ( ruleTurnType ) )
            // InternalBgDsl.g:5418:2: ( ruleTurnType )
            {
            // InternalBgDsl.g:5418:2: ( ruleTurnType )
            // InternalBgDsl.g:5419:3: ruleTurnType
            {
             before(grammarAccess.getGameAccess().getTurnPolicyTurnTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnType();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTurnPolicyTurnTypeEnumRuleCall_8_0()); 

            }


            }

        }
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
    // InternalBgDsl.g:5428:1: rule__Board__CheckeredAssignment_0 : ( ( 'checkered' ) ) ;
    public final void rule__Board__CheckeredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5432:1: ( ( ( 'checkered' ) ) )
            // InternalBgDsl.g:5433:2: ( ( 'checkered' ) )
            {
            // InternalBgDsl.g:5433:2: ( ( 'checkered' ) )
            // InternalBgDsl.g:5434:3: ( 'checkered' )
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            // InternalBgDsl.g:5435:3: ( 'checkered' )
            // InternalBgDsl.g:5436:4: 'checkered'
            {
             before(grammarAccess.getBoardAccess().getCheckeredCheckeredKeyword_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalBgDsl.g:5447:1: rule__Board__WidthAssignment_4 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5451:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5452:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5452:2: ( ruleEInt )
            // InternalBgDsl.g:5453:3: ruleEInt
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
    // InternalBgDsl.g:5462:1: rule__Board__HeightAssignment_6 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5466:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5467:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5467:2: ( ruleEInt )
            // InternalBgDsl.g:5468:3: ruleEInt
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
    // InternalBgDsl.g:5477:1: rule__Board__TilesAssignment_9 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5481:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5482:2: ( ruleTile )
            {
            // InternalBgDsl.g:5482:2: ( ruleTile )
            // InternalBgDsl.g:5483:3: ruleTile
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
    // InternalBgDsl.g:5492:1: rule__Board__TilesAssignment_10_1 : ( ruleTile ) ;
    public final void rule__Board__TilesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5496:1: ( ( ruleTile ) )
            // InternalBgDsl.g:5497:2: ( ruleTile )
            {
            // InternalBgDsl.g:5497:2: ( ruleTile )
            // InternalBgDsl.g:5498:3: ruleTile
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
    // InternalBgDsl.g:5507:1: rule__Board__LegalMovesPipelineAssignment_12_1 : ( ruleLegalMovesPipeline ) ;
    public final void rule__Board__LegalMovesPipelineAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5511:1: ( ( ruleLegalMovesPipeline ) )
            // InternalBgDsl.g:5512:2: ( ruleLegalMovesPipeline )
            {
            // InternalBgDsl.g:5512:2: ( ruleLegalMovesPipeline )
            // InternalBgDsl.g:5513:3: ruleLegalMovesPipeline
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
    // InternalBgDsl.g:5522:1: rule__Board__EffectPipelineAssignment_13_1 : ( ruleEffectPipeline ) ;
    public final void rule__Board__EffectPipelineAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5526:1: ( ( ruleEffectPipeline ) )
            // InternalBgDsl.g:5527:2: ( ruleEffectPipeline )
            {
            // InternalBgDsl.g:5527:2: ( ruleEffectPipeline )
            // InternalBgDsl.g:5528:3: ruleEffectPipeline
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
    // InternalBgDsl.g:5537:1: rule__Board__TileplacementAssignment_16 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5541:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:5542:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:5542:2: ( ruleTilePlacement )
            // InternalBgDsl.g:5543:3: ruleTilePlacement
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
    // InternalBgDsl.g:5552:1: rule__Board__TileplacementAssignment_17_1 : ( ruleTilePlacement ) ;
    public final void rule__Board__TileplacementAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5556:1: ( ( ruleTilePlacement ) )
            // InternalBgDsl.g:5557:2: ( ruleTilePlacement )
            {
            // InternalBgDsl.g:5557:2: ( ruleTilePlacement )
            // InternalBgDsl.g:5558:3: ruleTilePlacement
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
    // InternalBgDsl.g:5567:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5571:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5572:2: ( ruleEString )
            {
            // InternalBgDsl.g:5572:2: ( ruleEString )
            // InternalBgDsl.g:5573:3: ruleEString
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
    // InternalBgDsl.g:5582:1: rule__Player__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Player__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5586:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5587:2: ( ruleEString )
            {
            // InternalBgDsl.g:5587:2: ( ruleEString )
            // InternalBgDsl.g:5588:3: ruleEString
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
    // InternalBgDsl.g:5597:1: rule__Player__AssociatedStateAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Player__AssociatedStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5601:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5602:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5602:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5603:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getAssociatedStateStateCrossReference_6_0()); 
            // InternalBgDsl.g:5604:3: ( ruleEString )
            // InternalBgDsl.g:5605:4: ruleEString
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


    // $ANTLR start "rule__Tile__TypeAssignment_1"
    // InternalBgDsl.g:5616:1: rule__Tile__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Tile__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5620:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5621:2: ( ruleEString )
            {
            // InternalBgDsl.g:5621:2: ( ruleEString )
            // InternalBgDsl.g:5622:3: ruleEString
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
    // InternalBgDsl.g:5631:1: rule__Tile__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__Tile__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5635:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5636:2: ( ruleEString )
            {
            // InternalBgDsl.g:5636:2: ( ruleEString )
            // InternalBgDsl.g:5637:3: ruleEString
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
    // InternalBgDsl.g:5646:1: rule__Tile__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Tile__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5650:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5651:2: ( ruleEString )
            {
            // InternalBgDsl.g:5651:2: ( ruleEString )
            // InternalBgDsl.g:5652:3: ruleEString
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
    // InternalBgDsl.g:5661:1: rule__Tile__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5665:1: ( ( ruleState ) )
            // InternalBgDsl.g:5666:2: ( ruleState )
            {
            // InternalBgDsl.g:5666:2: ( ruleState )
            // InternalBgDsl.g:5667:3: ruleState
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
    // InternalBgDsl.g:5676:1: rule__Tile__StatesAssignment_10_1 : ( ruleState ) ;
    public final void rule__Tile__StatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5680:1: ( ( ruleState ) )
            // InternalBgDsl.g:5681:2: ( ruleState )
            {
            // InternalBgDsl.g:5681:2: ( ruleState )
            // InternalBgDsl.g:5682:3: ruleState
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
    // InternalBgDsl.g:5691:1: rule__Tile__TransitionsAssignment_12_2 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5695:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:5696:2: ( ruleTransition )
            {
            // InternalBgDsl.g:5696:2: ( ruleTransition )
            // InternalBgDsl.g:5697:3: ruleTransition
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
    // InternalBgDsl.g:5706:1: rule__Tile__TransitionsAssignment_12_3_1 : ( ruleTransition ) ;
    public final void rule__Tile__TransitionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5710:1: ( ( ruleTransition ) )
            // InternalBgDsl.g:5711:2: ( ruleTransition )
            {
            // InternalBgDsl.g:5711:2: ( ruleTransition )
            // InternalBgDsl.g:5712:3: ruleTransition
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
    // InternalBgDsl.g:5721:1: rule__Tile__InitialStateAssignment_14 : ( ruleState ) ;
    public final void rule__Tile__InitialStateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5725:1: ( ( ruleState ) )
            // InternalBgDsl.g:5726:2: ( ruleState )
            {
            // InternalBgDsl.g:5726:2: ( ruleState )
            // InternalBgDsl.g:5727:3: ruleState
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
    // InternalBgDsl.g:5736:1: rule__LegalMovesPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__LegalMovesPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5740:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:5741:2: ( ruleFilter )
            {
            // InternalBgDsl.g:5741:2: ( ruleFilter )
            // InternalBgDsl.g:5742:3: ruleFilter
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
    // InternalBgDsl.g:5751:1: rule__EffectPipeline__FilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__EffectPipeline__FilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5755:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:5756:2: ( ruleFilter )
            {
            // InternalBgDsl.g:5756:2: ( ruleFilter )
            // InternalBgDsl.g:5757:3: ruleFilter
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
    // InternalBgDsl.g:5766:1: rule__TilePlacement__RowAssignment_3 : ( ruleEInt ) ;
    public final void rule__TilePlacement__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5770:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5771:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5771:2: ( ruleEInt )
            // InternalBgDsl.g:5772:3: ruleEInt
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
    // InternalBgDsl.g:5781:1: rule__TilePlacement__ColumnAssignment_5 : ( ruleEInt ) ;
    public final void rule__TilePlacement__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5785:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:5786:2: ( ruleEInt )
            {
            // InternalBgDsl.g:5786:2: ( ruleEInt )
            // InternalBgDsl.g:5787:3: ruleEInt
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
    // InternalBgDsl.g:5796:1: rule__TilePlacement__TileAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TilePlacement__TileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5800:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5801:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5801:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5802:3: ( ruleEString )
            {
             before(grammarAccess.getTilePlacementAccess().getTileTileCrossReference_7_0()); 
            // InternalBgDsl.g:5803:3: ( ruleEString )
            // InternalBgDsl.g:5804:4: ruleEString
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
    // InternalBgDsl.g:5815:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5819:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5820:2: ( ruleEString )
            {
            // InternalBgDsl.g:5820:2: ( ruleEString )
            // InternalBgDsl.g:5821:3: ruleEString
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
    // InternalBgDsl.g:5830:1: rule__State__HexColorAssignment_4 : ( ruleEString ) ;
    public final void rule__State__HexColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5834:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5835:2: ( ruleEString )
            {
            // InternalBgDsl.g:5835:2: ( ruleEString )
            // InternalBgDsl.g:5836:3: ruleEString
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
    // InternalBgDsl.g:5845:1: rule__State__OutboundAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5849:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5850:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5850:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5851:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_2_0()); 
            // InternalBgDsl.g:5852:3: ( ruleEString )
            // InternalBgDsl.g:5853:4: ruleEString
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
    // InternalBgDsl.g:5864:1: rule__State__OutboundAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutboundAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5868:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5869:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5869:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5870:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutboundTransitionCrossReference_5_3_1_0()); 
            // InternalBgDsl.g:5871:3: ( ruleEString )
            // InternalBgDsl.g:5872:4: ruleEString
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
    // InternalBgDsl.g:5883:1: rule__State__InboundAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5887:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5888:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5888:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5889:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_2_0()); 
            // InternalBgDsl.g:5890:3: ( ruleEString )
            // InternalBgDsl.g:5891:4: ruleEString
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
    // InternalBgDsl.g:5902:1: rule__State__InboundAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__InboundAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5906:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5907:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5907:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5908:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getInboundTransitionCrossReference_6_3_1_0()); 
            // InternalBgDsl.g:5909:3: ( ruleEString )
            // InternalBgDsl.g:5910:4: ruleEString
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
    // InternalBgDsl.g:5921:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5925:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5926:2: ( ruleEString )
            {
            // InternalBgDsl.g:5926:2: ( ruleEString )
            // InternalBgDsl.g:5927:3: ruleEString
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
    // InternalBgDsl.g:5936:1: rule__Transition__SourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5940:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5941:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5941:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5942:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            // InternalBgDsl.g:5943:3: ( ruleEString )
            // InternalBgDsl.g:5944:4: ruleEString
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
    // InternalBgDsl.g:5955:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5959:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5960:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5960:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5961:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_6_1_0()); 
            // InternalBgDsl.g:5962:3: ( ruleEString )
            // InternalBgDsl.g:5963:4: ruleEString
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
    // InternalBgDsl.g:5974:1: rule__Transition__TargetAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5978:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:5979:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:5979:2: ( ( ruleEString ) )
            // InternalBgDsl.g:5980:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_9_0()); 
            // InternalBgDsl.g:5981:3: ( ruleEString )
            // InternalBgDsl.g:5982:4: ruleEString
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
    // InternalBgDsl.g:5993:1: rule__PatternFilter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PatternFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:5997:1: ( ( ruleEString ) )
            // InternalBgDsl.g:5998:2: ( ruleEString )
            {
            // InternalBgDsl.g:5998:2: ( ruleEString )
            // InternalBgDsl.g:5999:3: ruleEString
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
    // InternalBgDsl.g:6008:1: rule__PatternFilter__NextFilterAssignment_3_1 : ( ruleFilter ) ;
    public final void rule__PatternFilter__NextFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6012:1: ( ( ruleFilter ) )
            // InternalBgDsl.g:6013:2: ( ruleFilter )
            {
            // InternalBgDsl.g:6013:2: ( ruleFilter )
            // InternalBgDsl.g:6014:3: ruleFilter
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
    // InternalBgDsl.g:6023:1: rule__PatternFilter__PatternsAssignment_6 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6027:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6028:2: ( rulePattern )
            {
            // InternalBgDsl.g:6028:2: ( rulePattern )
            // InternalBgDsl.g:6029:3: rulePattern
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
    // InternalBgDsl.g:6038:1: rule__PatternFilter__PatternsAssignment_7_1 : ( rulePattern ) ;
    public final void rule__PatternFilter__PatternsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6042:1: ( ( rulePattern ) )
            // InternalBgDsl.g:6043:2: ( rulePattern )
            {
            // InternalBgDsl.g:6043:2: ( rulePattern )
            // InternalBgDsl.g:6044:3: rulePattern
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
    // InternalBgDsl.g:6053:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6057:1: ( ( ruleEString ) )
            // InternalBgDsl.g:6058:2: ( ruleEString )
            {
            // InternalBgDsl.g:6058:2: ( ruleEString )
            // InternalBgDsl.g:6059:3: ruleEString
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
    // InternalBgDsl.g:6068:1: rule__Pattern__StateSelectionAssignment_3_1 : ( ruleStateSelection ) ;
    public final void rule__Pattern__StateSelectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6072:1: ( ( ruleStateSelection ) )
            // InternalBgDsl.g:6073:2: ( ruleStateSelection )
            {
            // InternalBgDsl.g:6073:2: ( ruleStateSelection )
            // InternalBgDsl.g:6074:3: ruleStateSelection
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
    // InternalBgDsl.g:6083:1: rule__Pattern__MatchStateAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Pattern__MatchStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6087:1: ( ( ( ruleEString ) ) )
            // InternalBgDsl.g:6088:2: ( ( ruleEString ) )
            {
            // InternalBgDsl.g:6088:2: ( ( ruleEString ) )
            // InternalBgDsl.g:6089:3: ( ruleEString )
            {
             before(grammarAccess.getPatternAccess().getMatchStateStateCrossReference_4_1_0()); 
            // InternalBgDsl.g:6090:3: ( ruleEString )
            // InternalBgDsl.g:6091:4: ruleEString
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
    // InternalBgDsl.g:6102:1: rule__Pattern__RelativecoordinatesAssignment_7 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6106:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6107:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6107:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6108:3: ruleRelativeCoordinate
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
    // InternalBgDsl.g:6117:1: rule__Pattern__RelativecoordinatesAssignment_8_1 : ( ruleRelativeCoordinate ) ;
    public final void rule__Pattern__RelativecoordinatesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6121:1: ( ( ruleRelativeCoordinate ) )
            // InternalBgDsl.g:6122:2: ( ruleRelativeCoordinate )
            {
            // InternalBgDsl.g:6122:2: ( ruleRelativeCoordinate )
            // InternalBgDsl.g:6123:3: ruleRelativeCoordinate
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
    // InternalBgDsl.g:6132:1: rule__RelativeCoordinate__XAssignment_3 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6136:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6137:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6137:2: ( ruleEInt )
            // InternalBgDsl.g:6138:3: ruleEInt
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
    // InternalBgDsl.g:6147:1: rule__RelativeCoordinate__YAssignment_5 : ( ruleEInt ) ;
    public final void rule__RelativeCoordinate__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBgDsl.g:6151:1: ( ( ruleEInt ) )
            // InternalBgDsl.g:6152:2: ( ruleEInt )
            {
            // InternalBgDsl.g:6152:2: ( ruleEInt )
            // InternalBgDsl.g:6153:3: ruleEInt
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0009000000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}