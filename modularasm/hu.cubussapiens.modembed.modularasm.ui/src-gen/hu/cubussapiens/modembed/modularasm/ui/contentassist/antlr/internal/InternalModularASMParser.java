package hu.cubussapiens.modembed.modularasm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.cubussapiens.modembed.modularasm.services.ModularASMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModularASMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'target'", "'{'", "'}'", "'('", "')'", "'.'", "';'", "'config'", "'at'", "'enum'", "'='", "'symbol'", "'var'", "'instance'", "'func'", "'label'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_HEXINT=6;
    public static final int RULE_ML_COMMENT=8;

        public InternalModularASMParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g"; }


     
     	private ModularASMGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ModularASMGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModule
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:61:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:65:1: ( ruleModule EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:66:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule66);
            ruleModule();
            _fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:76:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:81:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:82:1: ( ( rule__Module__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:82:1: ( ( rule__Module__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:83:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:84:1: ( rule__Module__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:84:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule103);
            rule__Module__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleModuleParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:97:1: entryRuleModuleParam : ruleModuleParam EOF ;
    public final void entryRuleModuleParam() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:98:1: ( ruleModuleParam EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:99:1: ruleModuleParam EOF
            {
             before(grammarAccess.getModuleParamRule()); 
            pushFollow(FOLLOW_ruleModuleParam_in_entryRuleModuleParam130);
            ruleModuleParam();
            _fsp--;

             after(grammarAccess.getModuleParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleParam137); 

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
    // $ANTLR end entryRuleModuleParam


    // $ANTLR start ruleModuleParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:106:1: ruleModuleParam : ( ( rule__ModuleParam__Group__0 ) ) ;
    public final void ruleModuleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:110:2: ( ( ( rule__ModuleParam__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:111:1: ( ( rule__ModuleParam__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:111:1: ( ( rule__ModuleParam__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:112:1: ( rule__ModuleParam__Group__0 )
            {
             before(grammarAccess.getModuleParamAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:113:1: ( rule__ModuleParam__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:113:2: rule__ModuleParam__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleParam__Group__0_in_ruleModuleParam163);
            rule__ModuleParam__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModuleParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModuleParam


    // $ANTLR start entryRuleQualifiedID
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:125:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:126:1: ( ruleQualifiedID EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:127:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID190);
            ruleQualifiedID();
            _fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID197); 

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
    // $ANTLR end entryRuleQualifiedID


    // $ANTLR start ruleQualifiedID
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:134:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:138:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:139:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:139:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:140:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:141:1: ( rule__QualifiedID__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:141:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID223);
            rule__QualifiedID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualifiedID


    // $ANTLR start entryRuleModuleItem
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:153:1: entryRuleModuleItem : ruleModuleItem EOF ;
    public final void entryRuleModuleItem() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:154:1: ( ruleModuleItem EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:155:1: ruleModuleItem EOF
            {
             before(grammarAccess.getModuleItemRule()); 
            pushFollow(FOLLOW_ruleModuleItem_in_entryRuleModuleItem250);
            ruleModuleItem();
            _fsp--;

             after(grammarAccess.getModuleItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleItem257); 

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
    // $ANTLR end entryRuleModuleItem


    // $ANTLR start ruleModuleItem
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:162:1: ruleModuleItem : ( ( rule__ModuleItem__Group__0 ) ) ;
    public final void ruleModuleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:166:2: ( ( ( rule__ModuleItem__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:167:1: ( ( rule__ModuleItem__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:167:1: ( ( rule__ModuleItem__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:168:1: ( rule__ModuleItem__Group__0 )
            {
             before(grammarAccess.getModuleItemAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:169:1: ( rule__ModuleItem__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:169:2: rule__ModuleItem__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleItem__Group__0_in_ruleModuleItem283);
            rule__ModuleItem__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModuleItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModuleItem


    // $ANTLR start entryRuleConfigurationWord
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:181:1: entryRuleConfigurationWord : ruleConfigurationWord EOF ;
    public final void entryRuleConfigurationWord() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:182:1: ( ruleConfigurationWord EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:183:1: ruleConfigurationWord EOF
            {
             before(grammarAccess.getConfigurationWordRule()); 
            pushFollow(FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord310);
            ruleConfigurationWord();
            _fsp--;

             after(grammarAccess.getConfigurationWordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationWord317); 

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
    // $ANTLR end entryRuleConfigurationWord


    // $ANTLR start ruleConfigurationWord
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:190:1: ruleConfigurationWord : ( ( rule__ConfigurationWord__Group__0 ) ) ;
    public final void ruleConfigurationWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:194:2: ( ( ( rule__ConfigurationWord__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:195:1: ( ( rule__ConfigurationWord__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:195:1: ( ( rule__ConfigurationWord__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:196:1: ( rule__ConfigurationWord__Group__0 )
            {
             before(grammarAccess.getConfigurationWordAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:197:1: ( rule__ConfigurationWord__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:197:2: rule__ConfigurationWord__Group__0
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__0_in_ruleConfigurationWord343);
            rule__ConfigurationWord__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConfigurationWordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConfigurationWord


    // $ANTLR start entryRuleConfigurationFieldPlace
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:209:1: entryRuleConfigurationFieldPlace : ruleConfigurationFieldPlace EOF ;
    public final void entryRuleConfigurationFieldPlace() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:210:1: ( ruleConfigurationFieldPlace EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:211:1: ruleConfigurationFieldPlace EOF
            {
             before(grammarAccess.getConfigurationFieldPlaceRule()); 
            pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace370);
            ruleConfigurationFieldPlace();
            _fsp--;

             after(grammarAccess.getConfigurationFieldPlaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationFieldPlace377); 

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
    // $ANTLR end entryRuleConfigurationFieldPlace


    // $ANTLR start ruleConfigurationFieldPlace
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:218:1: ruleConfigurationFieldPlace : ( ( rule__ConfigurationFieldPlace__Group__0 ) ) ;
    public final void ruleConfigurationFieldPlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:222:2: ( ( ( rule__ConfigurationFieldPlace__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:223:1: ( ( rule__ConfigurationFieldPlace__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:223:1: ( ( rule__ConfigurationFieldPlace__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:224:1: ( rule__ConfigurationFieldPlace__Group__0 )
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:225:1: ( rule__ConfigurationFieldPlace__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:225:2: rule__ConfigurationFieldPlace__Group__0
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__0_in_ruleConfigurationFieldPlace403);
            rule__ConfigurationFieldPlace__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConfigurationFieldPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConfigurationFieldPlace


    // $ANTLR start entryRuleConfigurationField
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:237:1: entryRuleConfigurationField : ruleConfigurationField EOF ;
    public final void entryRuleConfigurationField() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:238:1: ( ruleConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:239:1: ruleConfigurationField EOF
            {
             before(grammarAccess.getConfigurationFieldRule()); 
            pushFollow(FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField430);
            ruleConfigurationField();
            _fsp--;

             after(grammarAccess.getConfigurationFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationField437); 

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
    // $ANTLR end entryRuleConfigurationField


    // $ANTLR start ruleConfigurationField
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:246:1: ruleConfigurationField : ( ruleEnumConfigurationField ) ;
    public final void ruleConfigurationField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:250:2: ( ( ruleEnumConfigurationField ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:251:1: ( ruleEnumConfigurationField )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:251:1: ( ruleEnumConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:252:1: ruleEnumConfigurationField
            {
             before(grammarAccess.getConfigurationFieldAccess().getEnumConfigurationFieldParserRuleCall()); 
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField463);
            ruleEnumConfigurationField();
            _fsp--;

             after(grammarAccess.getConfigurationFieldAccess().getEnumConfigurationFieldParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConfigurationField


    // $ANTLR start entryRuleEnumConfigurationField
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:265:1: entryRuleEnumConfigurationField : ruleEnumConfigurationField EOF ;
    public final void entryRuleEnumConfigurationField() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:266:1: ( ruleEnumConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:267:1: ruleEnumConfigurationField EOF
            {
             before(grammarAccess.getEnumConfigurationFieldRule()); 
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField489);
            ruleEnumConfigurationField();
            _fsp--;

             after(grammarAccess.getEnumConfigurationFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationField496); 

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
    // $ANTLR end entryRuleEnumConfigurationField


    // $ANTLR start ruleEnumConfigurationField
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:274:1: ruleEnumConfigurationField : ( ( rule__EnumConfigurationField__Group__0 ) ) ;
    public final void ruleEnumConfigurationField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:278:2: ( ( ( rule__EnumConfigurationField__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:279:1: ( ( rule__EnumConfigurationField__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:279:1: ( ( rule__EnumConfigurationField__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:280:1: ( rule__EnumConfigurationField__Group__0 )
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:281:1: ( rule__EnumConfigurationField__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:281:2: rule__EnumConfigurationField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__0_in_ruleEnumConfigurationField522);
            rule__EnumConfigurationField__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumConfigurationField


    // $ANTLR start entryRuleEnumConfigurationFieldLiteral
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:293:1: entryRuleEnumConfigurationFieldLiteral : ruleEnumConfigurationFieldLiteral EOF ;
    public final void entryRuleEnumConfigurationFieldLiteral() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:294:1: ( ruleEnumConfigurationFieldLiteral EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:295:1: ruleEnumConfigurationFieldLiteral EOF
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral549);
            ruleEnumConfigurationFieldLiteral();
            _fsp--;

             after(grammarAccess.getEnumConfigurationFieldLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral556); 

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
    // $ANTLR end entryRuleEnumConfigurationFieldLiteral


    // $ANTLR start ruleEnumConfigurationFieldLiteral
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:302:1: ruleEnumConfigurationFieldLiteral : ( ( rule__EnumConfigurationFieldLiteral__Group__0 ) ) ;
    public final void ruleEnumConfigurationFieldLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:306:2: ( ( ( rule__EnumConfigurationFieldLiteral__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:307:1: ( ( rule__EnumConfigurationFieldLiteral__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:307:1: ( ( rule__EnumConfigurationFieldLiteral__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:308:1: ( rule__EnumConfigurationFieldLiteral__Group__0 )
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:309:1: ( rule__EnumConfigurationFieldLiteral__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:309:2: rule__EnumConfigurationFieldLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__0_in_ruleEnumConfigurationFieldLiteral582);
            rule__EnumConfigurationFieldLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumConfigurationFieldLiteral


    // $ANTLR start entryRuleSymbol
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:321:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:322:1: ( ruleSymbol EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:323:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol609);
            ruleSymbol();
            _fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol616); 

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
    // $ANTLR end entryRuleSymbol


    // $ANTLR start ruleSymbol
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:330:1: ruleSymbol : ( ( rule__Symbol__Group__0 ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:334:2: ( ( ( rule__Symbol__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:335:1: ( ( rule__Symbol__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:335:1: ( ( rule__Symbol__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:336:1: ( rule__Symbol__Group__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:337:1: ( rule__Symbol__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:337:2: rule__Symbol__Group__0
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0_in_ruleSymbol642);
            rule__Symbol__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSymbol


    // $ANTLR start entryRuleVariable
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:349:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:350:1: ( ruleVariable EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:351:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable669);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable676); 

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:358:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:362:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:363:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:363:1: ( ( rule__Variable__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:364:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:365:1: ( rule__Variable__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:365:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable702);
            rule__Variable__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleInstance
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:377:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:378:1: ( ruleInstance EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:379:1: ruleInstance EOF
            {
             before(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance729);
            ruleInstance();
            _fsp--;

             after(grammarAccess.getInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance736); 

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
    // $ANTLR end entryRuleInstance


    // $ANTLR start ruleInstance
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:386:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:390:2: ( ( ( rule__Instance__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:391:1: ( ( rule__Instance__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:391:1: ( ( rule__Instance__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:392:1: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:393:1: ( rule__Instance__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:393:2: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_rule__Instance__Group__0_in_ruleInstance762);
            rule__Instance__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInstance


    // $ANTLR start entryRuleFunction
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:405:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:406:1: ( ruleFunction EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:407:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction789);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction796); 

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
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:414:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:418:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:419:1: ( ( rule__Function__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:419:1: ( ( rule__Function__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:420:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:421:1: ( rule__Function__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:421:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction822);
            rule__Function__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleStep
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:433:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:434:1: ( ruleStep EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:435:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep849);
            ruleStep();
            _fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep856); 

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
    // $ANTLR end entryRuleStep


    // $ANTLR start ruleStep
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:442:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:446:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:447:1: ( ( rule__Step__Alternatives ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:447:1: ( ( rule__Step__Alternatives ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:448:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:449:1: ( rule__Step__Alternatives )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:449:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep882);
            rule__Step__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStep


    // $ANTLR start entryRuleLabel
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:461:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:462:1: ( ruleLabel EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:463:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel909);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel916); 

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
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:470:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:474:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:475:1: ( ( rule__Label__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:475:1: ( ( rule__Label__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:476:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:477:1: ( rule__Label__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:477:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel942);
            rule__Label__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRuleInstruction
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:489:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:490:1: ( ruleInstruction EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:491:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction969);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction976); 

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
    // $ANTLR end entryRuleInstruction


    // $ANTLR start ruleInstruction
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:498:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:502:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:503:1: ( ( rule__Instruction__Group__0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:503:1: ( ( rule__Instruction__Group__0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:504:1: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:505:1: ( rule__Instruction__Group__0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:505:2: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_rule__Instruction__Group__0_in_ruleInstruction1002);
            rule__Instruction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInstruction


    // $ANTLR start entryRuleParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:517:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:518:1: ( ruleParam EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:519:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1029);
            ruleParam();
            _fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1036); 

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
    // $ANTLR end entryRuleParam


    // $ANTLR start ruleParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:526:1: ruleParam : ( ( rule__Param__Alternatives ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:530:2: ( ( ( rule__Param__Alternatives ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:531:1: ( ( rule__Param__Alternatives ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:531:1: ( ( rule__Param__Alternatives ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:532:1: ( rule__Param__Alternatives )
            {
             before(grammarAccess.getParamAccess().getAlternatives()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:533:1: ( rule__Param__Alternatives )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:533:2: rule__Param__Alternatives
            {
            pushFollow(FOLLOW_rule__Param__Alternatives_in_ruleParam1062);
            rule__Param__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getParamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParam


    // $ANTLR start entryRuleLiteralParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:545:1: entryRuleLiteralParam : ruleLiteralParam EOF ;
    public final void entryRuleLiteralParam() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:546:1: ( ruleLiteralParam EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:547:1: ruleLiteralParam EOF
            {
             before(grammarAccess.getLiteralParamRule()); 
            pushFollow(FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam1089);
            ruleLiteralParam();
            _fsp--;

             after(grammarAccess.getLiteralParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralParam1096); 

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
    // $ANTLR end entryRuleLiteralParam


    // $ANTLR start ruleLiteralParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:554:1: ruleLiteralParam : ( ( rule__LiteralParam__Alternatives ) ) ;
    public final void ruleLiteralParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:558:2: ( ( ( rule__LiteralParam__Alternatives ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:559:1: ( ( rule__LiteralParam__Alternatives ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:559:1: ( ( rule__LiteralParam__Alternatives ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:560:1: ( rule__LiteralParam__Alternatives )
            {
             before(grammarAccess.getLiteralParamAccess().getAlternatives()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:561:1: ( rule__LiteralParam__Alternatives )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:561:2: rule__LiteralParam__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralParam__Alternatives_in_ruleLiteralParam1122);
            rule__LiteralParam__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLiteralParamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralParam


    // $ANTLR start entryRuleRefParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:573:1: entryRuleRefParam : ruleRefParam EOF ;
    public final void entryRuleRefParam() throws RecognitionException {
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:574:1: ( ruleRefParam EOF )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:575:1: ruleRefParam EOF
            {
             before(grammarAccess.getRefParamRule()); 
            pushFollow(FOLLOW_ruleRefParam_in_entryRuleRefParam1149);
            ruleRefParam();
            _fsp--;

             after(grammarAccess.getRefParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefParam1156); 

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
    // $ANTLR end entryRuleRefParam


    // $ANTLR start ruleRefParam
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:582:1: ruleRefParam : ( ( rule__RefParam__RefAssignment ) ) ;
    public final void ruleRefParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:586:2: ( ( ( rule__RefParam__RefAssignment ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:587:1: ( ( rule__RefParam__RefAssignment ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:587:1: ( ( rule__RefParam__RefAssignment ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:588:1: ( rule__RefParam__RefAssignment )
            {
             before(grammarAccess.getRefParamAccess().getRefAssignment()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:589:1: ( rule__RefParam__RefAssignment )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:589:2: rule__RefParam__RefAssignment
            {
            pushFollow(FOLLOW_rule__RefParam__RefAssignment_in_ruleRefParam1182);
            rule__RefParam__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getRefParamAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRefParam


    // $ANTLR start rule__ModuleItem__Alternatives_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:601:1: rule__ModuleItem__Alternatives_0 : ( ( ruleVariable ) | ( ruleInstance ) | ( ruleFunction ) | ( ruleSymbol ) | ( ruleConfigurationWord ) );
    public final void rule__ModuleItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:605:1: ( ( ruleVariable ) | ( ruleInstance ) | ( ruleFunction ) | ( ruleSymbol ) | ( ruleConfigurationWord ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("601:1: rule__ModuleItem__Alternatives_0 : ( ( ruleVariable ) | ( ruleInstance ) | ( ruleFunction ) | ( ruleSymbol ) | ( ruleConfigurationWord ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:606:1: ( ruleVariable )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:606:1: ( ruleVariable )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:607:1: ruleVariable
                    {
                     before(grammarAccess.getModuleItemAccess().getVariableParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__ModuleItem__Alternatives_01218);
                    ruleVariable();
                    _fsp--;

                     after(grammarAccess.getModuleItemAccess().getVariableParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:612:6: ( ruleInstance )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:612:6: ( ruleInstance )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:613:1: ruleInstance
                    {
                     before(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleInstance_in_rule__ModuleItem__Alternatives_01235);
                    ruleInstance();
                    _fsp--;

                     after(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:618:6: ( ruleFunction )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:618:6: ( ruleFunction )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:619:1: ruleFunction
                    {
                     before(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ModuleItem__Alternatives_01252);
                    ruleFunction();
                    _fsp--;

                     after(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:624:6: ( ruleSymbol )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:624:6: ( ruleSymbol )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:625:1: ruleSymbol
                    {
                     before(grammarAccess.getModuleItemAccess().getSymbolParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleSymbol_in_rule__ModuleItem__Alternatives_01269);
                    ruleSymbol();
                    _fsp--;

                     after(grammarAccess.getModuleItemAccess().getSymbolParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:630:6: ( ruleConfigurationWord )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:630:6: ( ruleConfigurationWord )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:631:1: ruleConfigurationWord
                    {
                     before(grammarAccess.getModuleItemAccess().getConfigurationWordParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleConfigurationWord_in_rule__ModuleItem__Alternatives_01286);
                    ruleConfigurationWord();
                    _fsp--;

                     after(grammarAccess.getModuleItemAccess().getConfigurationWordParserRuleCall_0_4()); 

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
    // $ANTLR end rule__ModuleItem__Alternatives_0


    // $ANTLR start rule__Symbol__Alternatives_2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:641:1: rule__Symbol__Alternatives_2 : ( ( ( rule__Symbol__ValueAssignment_2_0 ) ) | ( ( rule__Symbol__ValueAssignment_2_1 ) ) );
    public final void rule__Symbol__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:645:1: ( ( ( rule__Symbol__ValueAssignment_2_0 ) ) | ( ( rule__Symbol__ValueAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_HEXINT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("641:1: rule__Symbol__Alternatives_2 : ( ( ( rule__Symbol__ValueAssignment_2_0 ) ) | ( ( rule__Symbol__ValueAssignment_2_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:646:1: ( ( rule__Symbol__ValueAssignment_2_0 ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:646:1: ( ( rule__Symbol__ValueAssignment_2_0 ) )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:647:1: ( rule__Symbol__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getSymbolAccess().getValueAssignment_2_0()); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:648:1: ( rule__Symbol__ValueAssignment_2_0 )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:648:2: rule__Symbol__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Symbol__ValueAssignment_2_0_in_rule__Symbol__Alternatives_21318);
                    rule__Symbol__ValueAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:652:6: ( ( rule__Symbol__ValueAssignment_2_1 ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:652:6: ( ( rule__Symbol__ValueAssignment_2_1 ) )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:653:1: ( rule__Symbol__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getSymbolAccess().getValueAssignment_2_1()); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:654:1: ( rule__Symbol__ValueAssignment_2_1 )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:654:2: rule__Symbol__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Symbol__ValueAssignment_2_1_in_rule__Symbol__Alternatives_21336);
                    rule__Symbol__ValueAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end rule__Symbol__Alternatives_2


    // $ANTLR start rule__Step__Alternatives
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:663:1: rule__Step__Alternatives : ( ( ruleInstruction ) | ( ruleLabel ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:667:1: ( ( ruleInstruction ) | ( ruleLabel ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("663:1: rule__Step__Alternatives : ( ( ruleInstruction ) | ( ruleLabel ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:668:1: ( ruleInstruction )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:668:1: ( ruleInstruction )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:669:1: ruleInstruction
                    {
                     before(grammarAccess.getStepAccess().getInstructionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInstruction_in_rule__Step__Alternatives1369);
                    ruleInstruction();
                    _fsp--;

                     after(grammarAccess.getStepAccess().getInstructionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:674:6: ( ruleLabel )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:674:6: ( ruleLabel )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:675:1: ruleLabel
                    {
                     before(grammarAccess.getStepAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Step__Alternatives1386);
                    ruleLabel();
                    _fsp--;

                     after(grammarAccess.getStepAccess().getLabelParserRuleCall_1()); 

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
    // $ANTLR end rule__Step__Alternatives


    // $ANTLR start rule__Param__Alternatives
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:685:1: rule__Param__Alternatives : ( ( ruleLiteralParam ) | ( ruleRefParam ) );
    public final void rule__Param__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:689:1: ( ( ruleLiteralParam ) | ( ruleRefParam ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_HEXINT)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("685:1: rule__Param__Alternatives : ( ( ruleLiteralParam ) | ( ruleRefParam ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:690:1: ( ruleLiteralParam )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:690:1: ( ruleLiteralParam )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:691:1: ruleLiteralParam
                    {
                     before(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralParam_in_rule__Param__Alternatives1418);
                    ruleLiteralParam();
                    _fsp--;

                     after(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:696:6: ( ruleRefParam )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:696:6: ( ruleRefParam )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:697:1: ruleRefParam
                    {
                     before(grammarAccess.getParamAccess().getRefParamParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefParam_in_rule__Param__Alternatives1435);
                    ruleRefParam();
                    _fsp--;

                     after(grammarAccess.getParamAccess().getRefParamParserRuleCall_1()); 

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
    // $ANTLR end rule__Param__Alternatives


    // $ANTLR start rule__LiteralParam__Alternatives
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:707:1: rule__LiteralParam__Alternatives : ( ( ( rule__LiteralParam__ValueAssignment_0 ) ) | ( ( rule__LiteralParam__ValueAssignment_1 ) ) );
    public final void rule__LiteralParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:711:1: ( ( ( rule__LiteralParam__ValueAssignment_0 ) ) | ( ( rule__LiteralParam__ValueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_HEXINT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("707:1: rule__LiteralParam__Alternatives : ( ( ( rule__LiteralParam__ValueAssignment_0 ) ) | ( ( rule__LiteralParam__ValueAssignment_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:712:1: ( ( rule__LiteralParam__ValueAssignment_0 ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:712:1: ( ( rule__LiteralParam__ValueAssignment_0 ) )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:713:1: ( rule__LiteralParam__ValueAssignment_0 )
                    {
                     before(grammarAccess.getLiteralParamAccess().getValueAssignment_0()); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:714:1: ( rule__LiteralParam__ValueAssignment_0 )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:714:2: rule__LiteralParam__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LiteralParam__ValueAssignment_0_in_rule__LiteralParam__Alternatives1467);
                    rule__LiteralParam__ValueAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getLiteralParamAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:718:6: ( ( rule__LiteralParam__ValueAssignment_1 ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:718:6: ( ( rule__LiteralParam__ValueAssignment_1 ) )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:719:1: ( rule__LiteralParam__ValueAssignment_1 )
                    {
                     before(grammarAccess.getLiteralParamAccess().getValueAssignment_1()); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:720:1: ( rule__LiteralParam__ValueAssignment_1 )
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:720:2: rule__LiteralParam__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LiteralParam__ValueAssignment_1_in_rule__LiteralParam__Alternatives1485);
                    rule__LiteralParam__ValueAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getLiteralParamAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__LiteralParam__Alternatives


    // $ANTLR start rule__Module__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:731:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:735:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:736:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01516);
            rule__Module__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01519);
            rule__Module__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__0


    // $ANTLR start rule__Module__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:743:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:747:1: ( ( 'module' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:748:1: ( 'module' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:748:1: ( 'module' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:749:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Module__Group__0__Impl1547); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__0__Impl


    // $ANTLR start rule__Module__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:762:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:766:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:767:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11578);
            rule__Module__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11581);
            rule__Module__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__1


    // $ANTLR start rule__Module__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:774:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:778:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:779:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:779:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:780:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:781:1: ( rule__Module__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:781:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl1608);
            rule__Module__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__1__Impl


    // $ANTLR start rule__Module__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:791:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:795:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:796:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21638);
            rule__Module__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21641);
            rule__Module__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__2


    // $ANTLR start rule__Module__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:803:1: rule__Module__Group__2__Impl : ( 'target' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:807:1: ( ( 'target' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:808:1: ( 'target' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:808:1: ( 'target' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:809:1: 'target'
            {
             before(grammarAccess.getModuleAccess().getTargetKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group__2__Impl1669); 
             after(grammarAccess.getModuleAccess().getTargetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__2__Impl


    // $ANTLR start rule__Module__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:822:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:826:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:827:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31700);
            rule__Module__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31703);
            rule__Module__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__3


    // $ANTLR start rule__Module__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:834:1: rule__Module__Group__3__Impl : ( ( rule__Module__TargetAssignment_3 ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:838:1: ( ( ( rule__Module__TargetAssignment_3 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:839:1: ( ( rule__Module__TargetAssignment_3 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:839:1: ( ( rule__Module__TargetAssignment_3 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:840:1: ( rule__Module__TargetAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getTargetAssignment_3()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:841:1: ( rule__Module__TargetAssignment_3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:841:2: rule__Module__TargetAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__TargetAssignment_3_in_rule__Module__Group__3__Impl1730);
            rule__Module__TargetAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__3__Impl


    // $ANTLR start rule__Module__Group__4
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:851:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:855:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:856:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41760);
            rule__Module__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41763);
            rule__Module__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__4


    // $ANTLR start rule__Module__Group__4__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:863:1: rule__Module__Group__4__Impl : ( '{' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:867:1: ( ( '{' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:868:1: ( '{' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:868:1: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:869:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group__4__Impl1791); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__4__Impl


    // $ANTLR start rule__Module__Group__5
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:882:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:886:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:887:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51822);
            rule__Module__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51825);
            rule__Module__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__5


    // $ANTLR start rule__Module__Group__5__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:894:1: rule__Module__Group__5__Impl : ( ( rule__Module__ItemsAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:898:1: ( ( ( rule__Module__ItemsAssignment_5 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:899:1: ( ( rule__Module__ItemsAssignment_5 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:899:1: ( ( rule__Module__ItemsAssignment_5 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:900:1: ( rule__Module__ItemsAssignment_5 )*
            {
             before(grammarAccess.getModuleAccess().getItemsAssignment_5()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:901:1: ( rule__Module__ItemsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20||(LA6_0>=24 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:901:2: rule__Module__ItemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Module__ItemsAssignment_5_in_rule__Module__Group__5__Impl1852);
            	    rule__Module__ItemsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getItemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__5__Impl


    // $ANTLR start rule__Module__Group__6
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:911:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:915:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:916:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61883);
            rule__Module__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61886);
            rule__Module__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__6


    // $ANTLR start rule__Module__Group__6__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:923:1: rule__Module__Group__6__Impl : ( ( rule__Module__Group_6__0 )? ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:927:1: ( ( ( rule__Module__Group_6__0 )? ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:928:1: ( ( rule__Module__Group_6__0 )? )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:928:1: ( ( rule__Module__Group_6__0 )? )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:929:1: ( rule__Module__Group_6__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_6()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:930:1: ( rule__Module__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:930:2: rule__Module__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_6__0_in_rule__Module__Group__6__Impl1913);
                    rule__Module__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__6__Impl


    // $ANTLR start rule__Module__Group__7
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:940:1: rule__Module__Group__7 : rule__Module__Group__7__Impl ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:944:1: ( rule__Module__Group__7__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:945:2: rule__Module__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71944);
            rule__Module__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__7


    // $ANTLR start rule__Module__Group__7__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:951:1: rule__Module__Group__7__Impl : ( '}' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:955:1: ( ( '}' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:956:1: ( '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:956:1: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:957:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Module__Group__7__Impl1972); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group__7__Impl


    // $ANTLR start rule__Module__Group_6__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:986:1: rule__Module__Group_6__0 : rule__Module__Group_6__0__Impl rule__Module__Group_6__1 ;
    public final void rule__Module__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:990:1: ( rule__Module__Group_6__0__Impl rule__Module__Group_6__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:991:2: rule__Module__Group_6__0__Impl rule__Module__Group_6__1
            {
            pushFollow(FOLLOW_rule__Module__Group_6__0__Impl_in_rule__Module__Group_6__02019);
            rule__Module__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__1_in_rule__Module__Group_6__02022);
            rule__Module__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__0


    // $ANTLR start rule__Module__Group_6__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:998:1: rule__Module__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Module__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1002:1: ( ( '(' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1003:1: ( '(' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1003:1: ( '(' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1004:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_6__0__Impl2050); 
             after(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__0__Impl


    // $ANTLR start rule__Module__Group_6__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1017:1: rule__Module__Group_6__1 : rule__Module__Group_6__1__Impl rule__Module__Group_6__2 ;
    public final void rule__Module__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1021:1: ( rule__Module__Group_6__1__Impl rule__Module__Group_6__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1022:2: rule__Module__Group_6__1__Impl rule__Module__Group_6__2
            {
            pushFollow(FOLLOW_rule__Module__Group_6__1__Impl_in_rule__Module__Group_6__12081);
            rule__Module__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__2_in_rule__Module__Group_6__12084);
            rule__Module__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__1


    // $ANTLR start rule__Module__Group_6__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1029:1: rule__Module__Group_6__1__Impl : ( ( rule__Module__ParamsAssignment_6_1 )* ) ;
    public final void rule__Module__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1033:1: ( ( ( rule__Module__ParamsAssignment_6_1 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1034:1: ( ( rule__Module__ParamsAssignment_6_1 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1034:1: ( ( rule__Module__ParamsAssignment_6_1 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1035:1: ( rule__Module__ParamsAssignment_6_1 )*
            {
             before(grammarAccess.getModuleAccess().getParamsAssignment_6_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1036:1: ( rule__Module__ParamsAssignment_6_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1036:2: rule__Module__ParamsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__ParamsAssignment_6_1_in_rule__Module__Group_6__1__Impl2111);
            	    rule__Module__ParamsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getParamsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__1__Impl


    // $ANTLR start rule__Module__Group_6__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1046:1: rule__Module__Group_6__2 : rule__Module__Group_6__2__Impl ;
    public final void rule__Module__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1050:1: ( rule__Module__Group_6__2__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1051:2: rule__Module__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_6__2__Impl_in_rule__Module__Group_6__22142);
            rule__Module__Group_6__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__2


    // $ANTLR start rule__Module__Group_6__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1057:1: rule__Module__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Module__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1061:1: ( ( ')' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1062:1: ( ')' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1062:1: ( ')' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1063:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_6_2()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group_6__2__Impl2170); 
             after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__Group_6__2__Impl


    // $ANTLR start rule__ModuleParam__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1082:1: rule__ModuleParam__Group__0 : rule__ModuleParam__Group__0__Impl rule__ModuleParam__Group__1 ;
    public final void rule__ModuleParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1086:1: ( rule__ModuleParam__Group__0__Impl rule__ModuleParam__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1087:2: rule__ModuleParam__Group__0__Impl rule__ModuleParam__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleParam__Group__0__Impl_in_rule__ModuleParam__Group__02207);
            rule__ModuleParam__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModuleParam__Group__1_in_rule__ModuleParam__Group__02210);
            rule__ModuleParam__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__Group__0


    // $ANTLR start rule__ModuleParam__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1094:1: rule__ModuleParam__Group__0__Impl : ( ( rule__ModuleParam__TypeAssignment_0 ) ) ;
    public final void rule__ModuleParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1098:1: ( ( ( rule__ModuleParam__TypeAssignment_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1099:1: ( ( rule__ModuleParam__TypeAssignment_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1099:1: ( ( rule__ModuleParam__TypeAssignment_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1100:1: ( rule__ModuleParam__TypeAssignment_0 )
            {
             before(grammarAccess.getModuleParamAccess().getTypeAssignment_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1101:1: ( rule__ModuleParam__TypeAssignment_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1101:2: rule__ModuleParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ModuleParam__TypeAssignment_0_in_rule__ModuleParam__Group__0__Impl2237);
            rule__ModuleParam__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModuleParamAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__Group__0__Impl


    // $ANTLR start rule__ModuleParam__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1111:1: rule__ModuleParam__Group__1 : rule__ModuleParam__Group__1__Impl ;
    public final void rule__ModuleParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1115:1: ( rule__ModuleParam__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1116:2: rule__ModuleParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleParam__Group__1__Impl_in_rule__ModuleParam__Group__12267);
            rule__ModuleParam__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__Group__1


    // $ANTLR start rule__ModuleParam__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1122:1: rule__ModuleParam__Group__1__Impl : ( ( rule__ModuleParam__NameAssignment_1 ) ) ;
    public final void rule__ModuleParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1126:1: ( ( ( rule__ModuleParam__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1127:1: ( ( rule__ModuleParam__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1127:1: ( ( rule__ModuleParam__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1128:1: ( rule__ModuleParam__NameAssignment_1 )
            {
             before(grammarAccess.getModuleParamAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1129:1: ( rule__ModuleParam__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1129:2: rule__ModuleParam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModuleParam__NameAssignment_1_in_rule__ModuleParam__Group__1__Impl2294);
            rule__ModuleParam__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModuleParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__Group__1__Impl


    // $ANTLR start rule__QualifiedID__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1143:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1147:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1148:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02328);
            rule__QualifiedID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02331);
            rule__QualifiedID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group__0


    // $ANTLR start rule__QualifiedID__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1155:1: rule__QualifiedID__Group__0__Impl : ( ( rule__QualifiedID__SegmentsAssignment_0 ) ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1159:1: ( ( ( rule__QualifiedID__SegmentsAssignment_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1160:1: ( ( rule__QualifiedID__SegmentsAssignment_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1160:1: ( ( rule__QualifiedID__SegmentsAssignment_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1161:1: ( rule__QualifiedID__SegmentsAssignment_0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1162:1: ( rule__QualifiedID__SegmentsAssignment_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1162:2: rule__QualifiedID__SegmentsAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedID__SegmentsAssignment_0_in_rule__QualifiedID__Group__0__Impl2358);
            rule__QualifiedID__SegmentsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group__0__Impl


    // $ANTLR start rule__QualifiedID__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1172:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1176:1: ( rule__QualifiedID__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1177:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12388);
            rule__QualifiedID__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group__1


    // $ANTLR start rule__QualifiedID__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1183:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1187:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1188:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1188:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1189:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1190:1: ( rule__QualifiedID__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1190:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2415);
            	    rule__QualifiedID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group__1__Impl


    // $ANTLR start rule__QualifiedID__Group_1__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1204:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1208:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1209:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02450);
            rule__QualifiedID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02453);
            rule__QualifiedID__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group_1__0


    // $ANTLR start rule__QualifiedID__Group_1__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1216:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1220:1: ( ( '.' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1221:1: ( '.' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1221:1: ( '.' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1222:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedID__Group_1__0__Impl2481); 
             after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group_1__0__Impl


    // $ANTLR start rule__QualifiedID__Group_1__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1235:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1239:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1240:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12512);
            rule__QualifiedID__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group_1__1


    // $ANTLR start rule__QualifiedID__Group_1__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1246:1: rule__QualifiedID__Group_1__1__Impl : ( ( rule__QualifiedID__SegmentsAssignment_1_1 ) ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1250:1: ( ( ( rule__QualifiedID__SegmentsAssignment_1_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1251:1: ( ( rule__QualifiedID__SegmentsAssignment_1_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1251:1: ( ( rule__QualifiedID__SegmentsAssignment_1_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1252:1: ( rule__QualifiedID__SegmentsAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_1_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1253:1: ( rule__QualifiedID__SegmentsAssignment_1_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1253:2: rule__QualifiedID__SegmentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QualifiedID__SegmentsAssignment_1_1_in_rule__QualifiedID__Group_1__1__Impl2539);
            rule__QualifiedID__SegmentsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__Group_1__1__Impl


    // $ANTLR start rule__ModuleItem__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1267:1: rule__ModuleItem__Group__0 : rule__ModuleItem__Group__0__Impl rule__ModuleItem__Group__1 ;
    public final void rule__ModuleItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1271:1: ( rule__ModuleItem__Group__0__Impl rule__ModuleItem__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1272:2: rule__ModuleItem__Group__0__Impl rule__ModuleItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleItem__Group__0__Impl_in_rule__ModuleItem__Group__02573);
            rule__ModuleItem__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModuleItem__Group__1_in_rule__ModuleItem__Group__02576);
            rule__ModuleItem__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleItem__Group__0


    // $ANTLR start rule__ModuleItem__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1279:1: rule__ModuleItem__Group__0__Impl : ( ( rule__ModuleItem__Alternatives_0 ) ) ;
    public final void rule__ModuleItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1283:1: ( ( ( rule__ModuleItem__Alternatives_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1284:1: ( ( rule__ModuleItem__Alternatives_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1284:1: ( ( rule__ModuleItem__Alternatives_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1285:1: ( rule__ModuleItem__Alternatives_0 )
            {
             before(grammarAccess.getModuleItemAccess().getAlternatives_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1286:1: ( rule__ModuleItem__Alternatives_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1286:2: rule__ModuleItem__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ModuleItem__Alternatives_0_in_rule__ModuleItem__Group__0__Impl2603);
            rule__ModuleItem__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getModuleItemAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleItem__Group__0__Impl


    // $ANTLR start rule__ModuleItem__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1296:1: rule__ModuleItem__Group__1 : rule__ModuleItem__Group__1__Impl ;
    public final void rule__ModuleItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1300:1: ( rule__ModuleItem__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1301:2: rule__ModuleItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleItem__Group__1__Impl_in_rule__ModuleItem__Group__12633);
            rule__ModuleItem__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleItem__Group__1


    // $ANTLR start rule__ModuleItem__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1307:1: rule__ModuleItem__Group__1__Impl : ( ';' ) ;
    public final void rule__ModuleItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1311:1: ( ( ';' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1312:1: ( ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1312:1: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1313:1: ';'
            {
             before(grammarAccess.getModuleItemAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ModuleItem__Group__1__Impl2661); 
             after(grammarAccess.getModuleItemAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleItem__Group__1__Impl


    // $ANTLR start rule__ConfigurationWord__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1330:1: rule__ConfigurationWord__Group__0 : rule__ConfigurationWord__Group__0__Impl rule__ConfigurationWord__Group__1 ;
    public final void rule__ConfigurationWord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1334:1: ( rule__ConfigurationWord__Group__0__Impl rule__ConfigurationWord__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1335:2: rule__ConfigurationWord__Group__0__Impl rule__ConfigurationWord__Group__1
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__0__Impl_in_rule__ConfigurationWord__Group__02696);
            rule__ConfigurationWord__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group__1_in_rule__ConfigurationWord__Group__02699);
            rule__ConfigurationWord__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__0


    // $ANTLR start rule__ConfigurationWord__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1342:1: rule__ConfigurationWord__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigurationWord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1346:1: ( ( 'config' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1347:1: ( 'config' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1347:1: ( 'config' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1348:1: 'config'
            {
             before(grammarAccess.getConfigurationWordAccess().getConfigKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ConfigurationWord__Group__0__Impl2727); 
             after(grammarAccess.getConfigurationWordAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__0__Impl


    // $ANTLR start rule__ConfigurationWord__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1361:1: rule__ConfigurationWord__Group__1 : rule__ConfigurationWord__Group__1__Impl rule__ConfigurationWord__Group__2 ;
    public final void rule__ConfigurationWord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1365:1: ( rule__ConfigurationWord__Group__1__Impl rule__ConfigurationWord__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1366:2: rule__ConfigurationWord__Group__1__Impl rule__ConfigurationWord__Group__2
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__1__Impl_in_rule__ConfigurationWord__Group__12758);
            rule__ConfigurationWord__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group__2_in_rule__ConfigurationWord__Group__12761);
            rule__ConfigurationWord__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__1


    // $ANTLR start rule__ConfigurationWord__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1373:1: rule__ConfigurationWord__Group__1__Impl : ( ( rule__ConfigurationWord__NameAssignment_1 ) ) ;
    public final void rule__ConfigurationWord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1377:1: ( ( ( rule__ConfigurationWord__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1378:1: ( ( rule__ConfigurationWord__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1378:1: ( ( rule__ConfigurationWord__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1379:1: ( rule__ConfigurationWord__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationWordAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1380:1: ( rule__ConfigurationWord__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1380:2: rule__ConfigurationWord__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__NameAssignment_1_in_rule__ConfigurationWord__Group__1__Impl2788);
            rule__ConfigurationWord__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConfigurationWordAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__1__Impl


    // $ANTLR start rule__ConfigurationWord__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1390:1: rule__ConfigurationWord__Group__2 : rule__ConfigurationWord__Group__2__Impl rule__ConfigurationWord__Group__3 ;
    public final void rule__ConfigurationWord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1394:1: ( rule__ConfigurationWord__Group__2__Impl rule__ConfigurationWord__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1395:2: rule__ConfigurationWord__Group__2__Impl rule__ConfigurationWord__Group__3
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__2__Impl_in_rule__ConfigurationWord__Group__22818);
            rule__ConfigurationWord__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group__3_in_rule__ConfigurationWord__Group__22821);
            rule__ConfigurationWord__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__2


    // $ANTLR start rule__ConfigurationWord__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1402:1: rule__ConfigurationWord__Group__2__Impl : ( ( rule__ConfigurationWord__DefaultAssignment_2 )? ) ;
    public final void rule__ConfigurationWord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1406:1: ( ( ( rule__ConfigurationWord__DefaultAssignment_2 )? ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1407:1: ( ( rule__ConfigurationWord__DefaultAssignment_2 )? )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1407:1: ( ( rule__ConfigurationWord__DefaultAssignment_2 )? )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1408:1: ( rule__ConfigurationWord__DefaultAssignment_2 )?
            {
             before(grammarAccess.getConfigurationWordAccess().getDefaultAssignment_2()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1409:1: ( rule__ConfigurationWord__DefaultAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_HEXINT)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1409:2: rule__ConfigurationWord__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConfigurationWord__DefaultAssignment_2_in_rule__ConfigurationWord__Group__2__Impl2848);
                    rule__ConfigurationWord__DefaultAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationWordAccess().getDefaultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__2__Impl


    // $ANTLR start rule__ConfigurationWord__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1419:1: rule__ConfigurationWord__Group__3 : rule__ConfigurationWord__Group__3__Impl rule__ConfigurationWord__Group__4 ;
    public final void rule__ConfigurationWord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1423:1: ( rule__ConfigurationWord__Group__3__Impl rule__ConfigurationWord__Group__4 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1424:2: rule__ConfigurationWord__Group__3__Impl rule__ConfigurationWord__Group__4
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__3__Impl_in_rule__ConfigurationWord__Group__32879);
            rule__ConfigurationWord__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group__4_in_rule__ConfigurationWord__Group__32882);
            rule__ConfigurationWord__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__3


    // $ANTLR start rule__ConfigurationWord__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1431:1: rule__ConfigurationWord__Group__3__Impl : ( '{' ) ;
    public final void rule__ConfigurationWord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1435:1: ( ( '{' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1436:1: ( '{' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1436:1: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1437:1: '{'
            {
             before(grammarAccess.getConfigurationWordAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ConfigurationWord__Group__3__Impl2910); 
             after(grammarAccess.getConfigurationWordAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__3__Impl


    // $ANTLR start rule__ConfigurationWord__Group__4
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1450:1: rule__ConfigurationWord__Group__4 : rule__ConfigurationWord__Group__4__Impl rule__ConfigurationWord__Group__5 ;
    public final void rule__ConfigurationWord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1454:1: ( rule__ConfigurationWord__Group__4__Impl rule__ConfigurationWord__Group__5 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1455:2: rule__ConfigurationWord__Group__4__Impl rule__ConfigurationWord__Group__5
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__4__Impl_in_rule__ConfigurationWord__Group__42941);
            rule__ConfigurationWord__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group__5_in_rule__ConfigurationWord__Group__42944);
            rule__ConfigurationWord__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__4


    // $ANTLR start rule__ConfigurationWord__Group__4__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1462:1: rule__ConfigurationWord__Group__4__Impl : ( ( rule__ConfigurationWord__Group_4__0 )* ) ;
    public final void rule__ConfigurationWord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1466:1: ( ( ( rule__ConfigurationWord__Group_4__0 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1467:1: ( ( rule__ConfigurationWord__Group_4__0 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1467:1: ( ( rule__ConfigurationWord__Group_4__0 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1468:1: ( rule__ConfigurationWord__Group_4__0 )*
            {
             before(grammarAccess.getConfigurationWordAccess().getGroup_4()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1469:1: ( rule__ConfigurationWord__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_HEXINT)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1469:2: rule__ConfigurationWord__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ConfigurationWord__Group_4__0_in_rule__ConfigurationWord__Group__4__Impl2971);
            	    rule__ConfigurationWord__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConfigurationWordAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__4__Impl


    // $ANTLR start rule__ConfigurationWord__Group__5
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1479:1: rule__ConfigurationWord__Group__5 : rule__ConfigurationWord__Group__5__Impl ;
    public final void rule__ConfigurationWord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1483:1: ( rule__ConfigurationWord__Group__5__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1484:2: rule__ConfigurationWord__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group__5__Impl_in_rule__ConfigurationWord__Group__53002);
            rule__ConfigurationWord__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__5


    // $ANTLR start rule__ConfigurationWord__Group__5__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1490:1: rule__ConfigurationWord__Group__5__Impl : ( '}' ) ;
    public final void rule__ConfigurationWord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1494:1: ( ( '}' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1495:1: ( '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1495:1: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1496:1: '}'
            {
             before(grammarAccess.getConfigurationWordAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ConfigurationWord__Group__5__Impl3030); 
             after(grammarAccess.getConfigurationWordAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group__5__Impl


    // $ANTLR start rule__ConfigurationWord__Group_4__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1521:1: rule__ConfigurationWord__Group_4__0 : rule__ConfigurationWord__Group_4__0__Impl rule__ConfigurationWord__Group_4__1 ;
    public final void rule__ConfigurationWord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1525:1: ( rule__ConfigurationWord__Group_4__0__Impl rule__ConfigurationWord__Group_4__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1526:2: rule__ConfigurationWord__Group_4__0__Impl rule__ConfigurationWord__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group_4__0__Impl_in_rule__ConfigurationWord__Group_4__03073);
            rule__ConfigurationWord__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationWord__Group_4__1_in_rule__ConfigurationWord__Group_4__03076);
            rule__ConfigurationWord__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group_4__0


    // $ANTLR start rule__ConfigurationWord__Group_4__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1533:1: rule__ConfigurationWord__Group_4__0__Impl : ( ( rule__ConfigurationWord__FieldsAssignment_4_0 ) ) ;
    public final void rule__ConfigurationWord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1537:1: ( ( ( rule__ConfigurationWord__FieldsAssignment_4_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1538:1: ( ( rule__ConfigurationWord__FieldsAssignment_4_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1538:1: ( ( rule__ConfigurationWord__FieldsAssignment_4_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1539:1: ( rule__ConfigurationWord__FieldsAssignment_4_0 )
            {
             before(grammarAccess.getConfigurationWordAccess().getFieldsAssignment_4_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1540:1: ( rule__ConfigurationWord__FieldsAssignment_4_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1540:2: rule__ConfigurationWord__FieldsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__FieldsAssignment_4_0_in_rule__ConfigurationWord__Group_4__0__Impl3103);
            rule__ConfigurationWord__FieldsAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getConfigurationWordAccess().getFieldsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group_4__0__Impl


    // $ANTLR start rule__ConfigurationWord__Group_4__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1550:1: rule__ConfigurationWord__Group_4__1 : rule__ConfigurationWord__Group_4__1__Impl ;
    public final void rule__ConfigurationWord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1554:1: ( rule__ConfigurationWord__Group_4__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1555:2: rule__ConfigurationWord__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ConfigurationWord__Group_4__1__Impl_in_rule__ConfigurationWord__Group_4__13133);
            rule__ConfigurationWord__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group_4__1


    // $ANTLR start rule__ConfigurationWord__Group_4__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1561:1: rule__ConfigurationWord__Group_4__1__Impl : ( ';' ) ;
    public final void rule__ConfigurationWord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1565:1: ( ( ';' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1566:1: ( ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1566:1: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1567:1: ';'
            {
             before(grammarAccess.getConfigurationWordAccess().getSemicolonKeyword_4_1()); 
            match(input,19,FOLLOW_19_in_rule__ConfigurationWord__Group_4__1__Impl3161); 
             after(grammarAccess.getConfigurationWordAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__Group_4__1__Impl


    // $ANTLR start rule__ConfigurationFieldPlace__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1584:1: rule__ConfigurationFieldPlace__Group__0 : rule__ConfigurationFieldPlace__Group__0__Impl rule__ConfigurationFieldPlace__Group__1 ;
    public final void rule__ConfigurationFieldPlace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1588:1: ( rule__ConfigurationFieldPlace__Group__0__Impl rule__ConfigurationFieldPlace__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1589:2: rule__ConfigurationFieldPlace__Group__0__Impl rule__ConfigurationFieldPlace__Group__1
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__0__Impl_in_rule__ConfigurationFieldPlace__Group__03196);
            rule__ConfigurationFieldPlace__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__1_in_rule__ConfigurationFieldPlace__Group__03199);
            rule__ConfigurationFieldPlace__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__0


    // $ANTLR start rule__ConfigurationFieldPlace__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1596:1: rule__ConfigurationFieldPlace__Group__0__Impl : ( ( rule__ConfigurationFieldPlace__BitNumAssignment_0 ) ) ;
    public final void rule__ConfigurationFieldPlace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1600:1: ( ( ( rule__ConfigurationFieldPlace__BitNumAssignment_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1601:1: ( ( rule__ConfigurationFieldPlace__BitNumAssignment_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1601:1: ( ( rule__ConfigurationFieldPlace__BitNumAssignment_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1602:1: ( rule__ConfigurationFieldPlace__BitNumAssignment_0 )
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumAssignment_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1603:1: ( rule__ConfigurationFieldPlace__BitNumAssignment_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1603:2: rule__ConfigurationFieldPlace__BitNumAssignment_0
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__BitNumAssignment_0_in_rule__ConfigurationFieldPlace__Group__0__Impl3226);
            rule__ConfigurationFieldPlace__BitNumAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__0__Impl


    // $ANTLR start rule__ConfigurationFieldPlace__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1613:1: rule__ConfigurationFieldPlace__Group__1 : rule__ConfigurationFieldPlace__Group__1__Impl rule__ConfigurationFieldPlace__Group__2 ;
    public final void rule__ConfigurationFieldPlace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1617:1: ( rule__ConfigurationFieldPlace__Group__1__Impl rule__ConfigurationFieldPlace__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1618:2: rule__ConfigurationFieldPlace__Group__1__Impl rule__ConfigurationFieldPlace__Group__2
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__1__Impl_in_rule__ConfigurationFieldPlace__Group__13256);
            rule__ConfigurationFieldPlace__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__2_in_rule__ConfigurationFieldPlace__Group__13259);
            rule__ConfigurationFieldPlace__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__1


    // $ANTLR start rule__ConfigurationFieldPlace__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1625:1: rule__ConfigurationFieldPlace__Group__1__Impl : ( 'at' ) ;
    public final void rule__ConfigurationFieldPlace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1629:1: ( ( 'at' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1630:1: ( 'at' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1630:1: ( 'at' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1631:1: 'at'
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getAtKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ConfigurationFieldPlace__Group__1__Impl3287); 
             after(grammarAccess.getConfigurationFieldPlaceAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__1__Impl


    // $ANTLR start rule__ConfigurationFieldPlace__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1644:1: rule__ConfigurationFieldPlace__Group__2 : rule__ConfigurationFieldPlace__Group__2__Impl rule__ConfigurationFieldPlace__Group__3 ;
    public final void rule__ConfigurationFieldPlace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1648:1: ( rule__ConfigurationFieldPlace__Group__2__Impl rule__ConfigurationFieldPlace__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1649:2: rule__ConfigurationFieldPlace__Group__2__Impl rule__ConfigurationFieldPlace__Group__3
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__2__Impl_in_rule__ConfigurationFieldPlace__Group__23318);
            rule__ConfigurationFieldPlace__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__3_in_rule__ConfigurationFieldPlace__Group__23321);
            rule__ConfigurationFieldPlace__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__2


    // $ANTLR start rule__ConfigurationFieldPlace__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1656:1: rule__ConfigurationFieldPlace__Group__2__Impl : ( ( rule__ConfigurationFieldPlace__StartBitAssignment_2 ) ) ;
    public final void rule__ConfigurationFieldPlace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1660:1: ( ( ( rule__ConfigurationFieldPlace__StartBitAssignment_2 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1661:1: ( ( rule__ConfigurationFieldPlace__StartBitAssignment_2 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1661:1: ( ( rule__ConfigurationFieldPlace__StartBitAssignment_2 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1662:1: ( rule__ConfigurationFieldPlace__StartBitAssignment_2 )
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitAssignment_2()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1663:1: ( rule__ConfigurationFieldPlace__StartBitAssignment_2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1663:2: rule__ConfigurationFieldPlace__StartBitAssignment_2
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__StartBitAssignment_2_in_rule__ConfigurationFieldPlace__Group__2__Impl3348);
            rule__ConfigurationFieldPlace__StartBitAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__2__Impl


    // $ANTLR start rule__ConfigurationFieldPlace__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1673:1: rule__ConfigurationFieldPlace__Group__3 : rule__ConfigurationFieldPlace__Group__3__Impl ;
    public final void rule__ConfigurationFieldPlace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1677:1: ( rule__ConfigurationFieldPlace__Group__3__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1678:2: rule__ConfigurationFieldPlace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__Group__3__Impl_in_rule__ConfigurationFieldPlace__Group__33378);
            rule__ConfigurationFieldPlace__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__3


    // $ANTLR start rule__ConfigurationFieldPlace__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1684:1: rule__ConfigurationFieldPlace__Group__3__Impl : ( ( rule__ConfigurationFieldPlace__FieldAssignment_3 ) ) ;
    public final void rule__ConfigurationFieldPlace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1688:1: ( ( ( rule__ConfigurationFieldPlace__FieldAssignment_3 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1689:1: ( ( rule__ConfigurationFieldPlace__FieldAssignment_3 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1689:1: ( ( rule__ConfigurationFieldPlace__FieldAssignment_3 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1690:1: ( rule__ConfigurationFieldPlace__FieldAssignment_3 )
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getFieldAssignment_3()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1691:1: ( rule__ConfigurationFieldPlace__FieldAssignment_3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1691:2: rule__ConfigurationFieldPlace__FieldAssignment_3
            {
            pushFollow(FOLLOW_rule__ConfigurationFieldPlace__FieldAssignment_3_in_rule__ConfigurationFieldPlace__Group__3__Impl3405);
            rule__ConfigurationFieldPlace__FieldAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getConfigurationFieldPlaceAccess().getFieldAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__Group__3__Impl


    // $ANTLR start rule__EnumConfigurationField__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1709:1: rule__EnumConfigurationField__Group__0 : rule__EnumConfigurationField__Group__0__Impl rule__EnumConfigurationField__Group__1 ;
    public final void rule__EnumConfigurationField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1713:1: ( rule__EnumConfigurationField__Group__0__Impl rule__EnumConfigurationField__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1714:2: rule__EnumConfigurationField__Group__0__Impl rule__EnumConfigurationField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__0__Impl_in_rule__EnumConfigurationField__Group__03443);
            rule__EnumConfigurationField__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__1_in_rule__EnumConfigurationField__Group__03446);
            rule__EnumConfigurationField__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__0


    // $ANTLR start rule__EnumConfigurationField__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1721:1: rule__EnumConfigurationField__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumConfigurationField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1725:1: ( ( 'enum' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1726:1: ( 'enum' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1726:1: ( 'enum' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1727:1: 'enum'
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getEnumKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumConfigurationField__Group__0__Impl3474); 
             after(grammarAccess.getEnumConfigurationFieldAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__0__Impl


    // $ANTLR start rule__EnumConfigurationField__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1740:1: rule__EnumConfigurationField__Group__1 : rule__EnumConfigurationField__Group__1__Impl rule__EnumConfigurationField__Group__2 ;
    public final void rule__EnumConfigurationField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1744:1: ( rule__EnumConfigurationField__Group__1__Impl rule__EnumConfigurationField__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1745:2: rule__EnumConfigurationField__Group__1__Impl rule__EnumConfigurationField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__1__Impl_in_rule__EnumConfigurationField__Group__13505);
            rule__EnumConfigurationField__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__2_in_rule__EnumConfigurationField__Group__13508);
            rule__EnumConfigurationField__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__1


    // $ANTLR start rule__EnumConfigurationField__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1752:1: rule__EnumConfigurationField__Group__1__Impl : ( ( rule__EnumConfigurationField__NameAssignment_1 ) ) ;
    public final void rule__EnumConfigurationField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1756:1: ( ( ( rule__EnumConfigurationField__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1757:1: ( ( rule__EnumConfigurationField__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1757:1: ( ( rule__EnumConfigurationField__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1758:1: ( rule__EnumConfigurationField__NameAssignment_1 )
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1759:1: ( rule__EnumConfigurationField__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1759:2: rule__EnumConfigurationField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__NameAssignment_1_in_rule__EnumConfigurationField__Group__1__Impl3535);
            rule__EnumConfigurationField__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__1__Impl


    // $ANTLR start rule__EnumConfigurationField__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1769:1: rule__EnumConfigurationField__Group__2 : rule__EnumConfigurationField__Group__2__Impl rule__EnumConfigurationField__Group__3 ;
    public final void rule__EnumConfigurationField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1773:1: ( rule__EnumConfigurationField__Group__2__Impl rule__EnumConfigurationField__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1774:2: rule__EnumConfigurationField__Group__2__Impl rule__EnumConfigurationField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__2__Impl_in_rule__EnumConfigurationField__Group__23565);
            rule__EnumConfigurationField__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__3_in_rule__EnumConfigurationField__Group__23568);
            rule__EnumConfigurationField__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__2


    // $ANTLR start rule__EnumConfigurationField__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1781:1: rule__EnumConfigurationField__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumConfigurationField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1785:1: ( ( '{' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1786:1: ( '{' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1786:1: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1787:1: '{'
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__EnumConfigurationField__Group__2__Impl3596); 
             after(grammarAccess.getEnumConfigurationFieldAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__2__Impl


    // $ANTLR start rule__EnumConfigurationField__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1800:1: rule__EnumConfigurationField__Group__3 : rule__EnumConfigurationField__Group__3__Impl rule__EnumConfigurationField__Group__4 ;
    public final void rule__EnumConfigurationField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1804:1: ( rule__EnumConfigurationField__Group__3__Impl rule__EnumConfigurationField__Group__4 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1805:2: rule__EnumConfigurationField__Group__3__Impl rule__EnumConfigurationField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__3__Impl_in_rule__EnumConfigurationField__Group__33627);
            rule__EnumConfigurationField__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__4_in_rule__EnumConfigurationField__Group__33630);
            rule__EnumConfigurationField__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__3


    // $ANTLR start rule__EnumConfigurationField__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1812:1: rule__EnumConfigurationField__Group__3__Impl : ( ( rule__EnumConfigurationField__Group_3__0 )* ) ;
    public final void rule__EnumConfigurationField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1816:1: ( ( ( rule__EnumConfigurationField__Group_3__0 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1817:1: ( ( rule__EnumConfigurationField__Group_3__0 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1817:1: ( ( rule__EnumConfigurationField__Group_3__0 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1818:1: ( rule__EnumConfigurationField__Group_3__0 )*
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getGroup_3()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1819:1: ( rule__EnumConfigurationField__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1819:2: rule__EnumConfigurationField__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumConfigurationField__Group_3__0_in_rule__EnumConfigurationField__Group__3__Impl3657);
            	    rule__EnumConfigurationField__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEnumConfigurationFieldAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__3__Impl


    // $ANTLR start rule__EnumConfigurationField__Group__4
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1829:1: rule__EnumConfigurationField__Group__4 : rule__EnumConfigurationField__Group__4__Impl ;
    public final void rule__EnumConfigurationField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1833:1: ( rule__EnumConfigurationField__Group__4__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1834:2: rule__EnumConfigurationField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group__4__Impl_in_rule__EnumConfigurationField__Group__43688);
            rule__EnumConfigurationField__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__4


    // $ANTLR start rule__EnumConfigurationField__Group__4__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1840:1: rule__EnumConfigurationField__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumConfigurationField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1844:1: ( ( '}' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1845:1: ( '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1845:1: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1846:1: '}'
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__EnumConfigurationField__Group__4__Impl3716); 
             after(grammarAccess.getEnumConfigurationFieldAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group__4__Impl


    // $ANTLR start rule__EnumConfigurationField__Group_3__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1869:1: rule__EnumConfigurationField__Group_3__0 : rule__EnumConfigurationField__Group_3__0__Impl rule__EnumConfigurationField__Group_3__1 ;
    public final void rule__EnumConfigurationField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1873:1: ( rule__EnumConfigurationField__Group_3__0__Impl rule__EnumConfigurationField__Group_3__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1874:2: rule__EnumConfigurationField__Group_3__0__Impl rule__EnumConfigurationField__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group_3__0__Impl_in_rule__EnumConfigurationField__Group_3__03757);
            rule__EnumConfigurationField__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationField__Group_3__1_in_rule__EnumConfigurationField__Group_3__03760);
            rule__EnumConfigurationField__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group_3__0


    // $ANTLR start rule__EnumConfigurationField__Group_3__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1881:1: rule__EnumConfigurationField__Group_3__0__Impl : ( ( rule__EnumConfigurationField__LiteralsAssignment_3_0 ) ) ;
    public final void rule__EnumConfigurationField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1885:1: ( ( ( rule__EnumConfigurationField__LiteralsAssignment_3_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1886:1: ( ( rule__EnumConfigurationField__LiteralsAssignment_3_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1886:1: ( ( rule__EnumConfigurationField__LiteralsAssignment_3_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1887:1: ( rule__EnumConfigurationField__LiteralsAssignment_3_0 )
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsAssignment_3_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1888:1: ( rule__EnumConfigurationField__LiteralsAssignment_3_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1888:2: rule__EnumConfigurationField__LiteralsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__LiteralsAssignment_3_0_in_rule__EnumConfigurationField__Group_3__0__Impl3787);
            rule__EnumConfigurationField__LiteralsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group_3__0__Impl


    // $ANTLR start rule__EnumConfigurationField__Group_3__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1898:1: rule__EnumConfigurationField__Group_3__1 : rule__EnumConfigurationField__Group_3__1__Impl ;
    public final void rule__EnumConfigurationField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1902:1: ( rule__EnumConfigurationField__Group_3__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1903:2: rule__EnumConfigurationField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumConfigurationField__Group_3__1__Impl_in_rule__EnumConfigurationField__Group_3__13817);
            rule__EnumConfigurationField__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group_3__1


    // $ANTLR start rule__EnumConfigurationField__Group_3__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1909:1: rule__EnumConfigurationField__Group_3__1__Impl : ( ';' ) ;
    public final void rule__EnumConfigurationField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1913:1: ( ( ';' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1914:1: ( ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1914:1: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1915:1: ';'
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getSemicolonKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__EnumConfigurationField__Group_3__1__Impl3845); 
             after(grammarAccess.getEnumConfigurationFieldAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__Group_3__1__Impl


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1932:1: rule__EnumConfigurationFieldLiteral__Group__0 : rule__EnumConfigurationFieldLiteral__Group__0__Impl rule__EnumConfigurationFieldLiteral__Group__1 ;
    public final void rule__EnumConfigurationFieldLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1936:1: ( rule__EnumConfigurationFieldLiteral__Group__0__Impl rule__EnumConfigurationFieldLiteral__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1937:2: rule__EnumConfigurationFieldLiteral__Group__0__Impl rule__EnumConfigurationFieldLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__0__Impl_in_rule__EnumConfigurationFieldLiteral__Group__03880);
            rule__EnumConfigurationFieldLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__1_in_rule__EnumConfigurationFieldLiteral__Group__03883);
            rule__EnumConfigurationFieldLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__0


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1944:1: rule__EnumConfigurationFieldLiteral__Group__0__Impl : ( ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumConfigurationFieldLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1948:1: ( ( ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1949:1: ( ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1949:1: ( ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1950:1: ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getNameAssignment_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1951:1: ( rule__EnumConfigurationFieldLiteral__NameAssignment_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1951:2: rule__EnumConfigurationFieldLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__NameAssignment_0_in_rule__EnumConfigurationFieldLiteral__Group__0__Impl3910);
            rule__EnumConfigurationFieldLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__0__Impl


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1961:1: rule__EnumConfigurationFieldLiteral__Group__1 : rule__EnumConfigurationFieldLiteral__Group__1__Impl rule__EnumConfigurationFieldLiteral__Group__2 ;
    public final void rule__EnumConfigurationFieldLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1965:1: ( rule__EnumConfigurationFieldLiteral__Group__1__Impl rule__EnumConfigurationFieldLiteral__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1966:2: rule__EnumConfigurationFieldLiteral__Group__1__Impl rule__EnumConfigurationFieldLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__1__Impl_in_rule__EnumConfigurationFieldLiteral__Group__13940);
            rule__EnumConfigurationFieldLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__2_in_rule__EnumConfigurationFieldLiteral__Group__13943);
            rule__EnumConfigurationFieldLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__1


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1973:1: rule__EnumConfigurationFieldLiteral__Group__1__Impl : ( '=' ) ;
    public final void rule__EnumConfigurationFieldLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1977:1: ( ( '=' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1978:1: ( '=' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1978:1: ( '=' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1979:1: '='
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumConfigurationFieldLiteral__Group__1__Impl3971); 
             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__1__Impl


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1992:1: rule__EnumConfigurationFieldLiteral__Group__2 : rule__EnumConfigurationFieldLiteral__Group__2__Impl ;
    public final void rule__EnumConfigurationFieldLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1996:1: ( rule__EnumConfigurationFieldLiteral__Group__2__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1997:2: rule__EnumConfigurationFieldLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__Group__2__Impl_in_rule__EnumConfigurationFieldLiteral__Group__24002);
            rule__EnumConfigurationFieldLiteral__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__2


    // $ANTLR start rule__EnumConfigurationFieldLiteral__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2003:1: rule__EnumConfigurationFieldLiteral__Group__2__Impl : ( ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 ) ) ;
    public final void rule__EnumConfigurationFieldLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2007:1: ( ( ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2008:1: ( ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2008:1: ( ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2009:1: ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 )
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueAssignment_2()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2010:1: ( rule__EnumConfigurationFieldLiteral__ValueAssignment_2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2010:2: rule__EnumConfigurationFieldLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumConfigurationFieldLiteral__ValueAssignment_2_in_rule__EnumConfigurationFieldLiteral__Group__2__Impl4029);
            rule__EnumConfigurationFieldLiteral__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__Group__2__Impl


    // $ANTLR start rule__Symbol__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2026:1: rule__Symbol__Group__0 : rule__Symbol__Group__0__Impl rule__Symbol__Group__1 ;
    public final void rule__Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2030:1: ( rule__Symbol__Group__0__Impl rule__Symbol__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2031:2: rule__Symbol__Group__0__Impl rule__Symbol__Group__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__04065);
            rule__Symbol__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__04068);
            rule__Symbol__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__0


    // $ANTLR start rule__Symbol__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2038:1: rule__Symbol__Group__0__Impl : ( 'symbol' ) ;
    public final void rule__Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2042:1: ( ( 'symbol' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2043:1: ( 'symbol' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2043:1: ( 'symbol' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2044:1: 'symbol'
            {
             before(grammarAccess.getSymbolAccess().getSymbolKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Symbol__Group__0__Impl4096); 
             after(grammarAccess.getSymbolAccess().getSymbolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__0__Impl


    // $ANTLR start rule__Symbol__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2057:1: rule__Symbol__Group__1 : rule__Symbol__Group__1__Impl rule__Symbol__Group__2 ;
    public final void rule__Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2061:1: ( rule__Symbol__Group__1__Impl rule__Symbol__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2062:2: rule__Symbol__Group__1__Impl rule__Symbol__Group__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__14127);
            rule__Symbol__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__14130);
            rule__Symbol__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__1


    // $ANTLR start rule__Symbol__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2069:1: rule__Symbol__Group__1__Impl : ( ( rule__Symbol__NameAssignment_1 ) ) ;
    public final void rule__Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2073:1: ( ( ( rule__Symbol__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2074:1: ( ( rule__Symbol__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2074:1: ( ( rule__Symbol__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2075:1: ( rule__Symbol__NameAssignment_1 )
            {
             before(grammarAccess.getSymbolAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2076:1: ( rule__Symbol__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2076:2: rule__Symbol__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Symbol__NameAssignment_1_in_rule__Symbol__Group__1__Impl4157);
            rule__Symbol__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSymbolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__1__Impl


    // $ANTLR start rule__Symbol__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2086:1: rule__Symbol__Group__2 : rule__Symbol__Group__2__Impl ;
    public final void rule__Symbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2090:1: ( rule__Symbol__Group__2__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2091:2: rule__Symbol__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__24187);
            rule__Symbol__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__2


    // $ANTLR start rule__Symbol__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2097:1: rule__Symbol__Group__2__Impl : ( ( rule__Symbol__Alternatives_2 ) ) ;
    public final void rule__Symbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2101:1: ( ( ( rule__Symbol__Alternatives_2 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2102:1: ( ( rule__Symbol__Alternatives_2 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2102:1: ( ( rule__Symbol__Alternatives_2 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2103:1: ( rule__Symbol__Alternatives_2 )
            {
             before(grammarAccess.getSymbolAccess().getAlternatives_2()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2104:1: ( rule__Symbol__Alternatives_2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2104:2: rule__Symbol__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Symbol__Alternatives_2_in_rule__Symbol__Group__2__Impl4214);
            rule__Symbol__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getSymbolAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__Group__2__Impl


    // $ANTLR start rule__Variable__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2120:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2124:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2125:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__04250);
            rule__Variable__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04253);
            rule__Variable__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__0


    // $ANTLR start rule__Variable__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2132:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2136:1: ( ( 'var' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2137:1: ( 'var' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2137:1: ( 'var' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2138:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Variable__Group__0__Impl4281); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__0__Impl


    // $ANTLR start rule__Variable__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2151:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2155:1: ( rule__Variable__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2156:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__14312);
            rule__Variable__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__1


    // $ANTLR start rule__Variable__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2162:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2166:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2167:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2167:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2168:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2169:1: ( rule__Variable__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2169:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl4339);
            rule__Variable__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__1__Impl


    // $ANTLR start rule__Instance__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2183:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2187:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2188:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__04373);
            rule__Instance__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__04376);
            rule__Instance__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__0


    // $ANTLR start rule__Instance__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2195:1: rule__Instance__Group__0__Impl : ( 'instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2199:1: ( ( 'instance' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2200:1: ( 'instance' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2200:1: ( 'instance' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2201:1: 'instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Instance__Group__0__Impl4404); 
             after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__0__Impl


    // $ANTLR start rule__Instance__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2214:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2218:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2219:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__14435);
            rule__Instance__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__14438);
            rule__Instance__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__1


    // $ANTLR start rule__Instance__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2226:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__TypeAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2230:1: ( ( ( rule__Instance__TypeAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2231:1: ( ( rule__Instance__TypeAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2231:1: ( ( rule__Instance__TypeAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2232:1: ( rule__Instance__TypeAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getTypeAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2233:1: ( rule__Instance__TypeAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2233:2: rule__Instance__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Instance__TypeAssignment_1_in_rule__Instance__Group__1__Impl4465);
            rule__Instance__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__1__Impl


    // $ANTLR start rule__Instance__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2243:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2247:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2248:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__24495);
            rule__Instance__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__24498);
            rule__Instance__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__2


    // $ANTLR start rule__Instance__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2255:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__NameAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2259:1: ( ( ( rule__Instance__NameAssignment_2 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2260:1: ( ( rule__Instance__NameAssignment_2 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2260:1: ( ( rule__Instance__NameAssignment_2 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2261:1: ( rule__Instance__NameAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_2()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2262:1: ( rule__Instance__NameAssignment_2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2262:2: rule__Instance__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Instance__NameAssignment_2_in_rule__Instance__Group__2__Impl4525);
            rule__Instance__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__2__Impl


    // $ANTLR start rule__Instance__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2272:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2276:1: ( rule__Instance__Group__3__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2277:2: rule__Instance__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__34555);
            rule__Instance__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__3


    // $ANTLR start rule__Instance__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2283:1: rule__Instance__Group__3__Impl : ( ( rule__Instance__Group_3__0 )? ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2287:1: ( ( ( rule__Instance__Group_3__0 )? ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2288:1: ( ( rule__Instance__Group_3__0 )? )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2288:1: ( ( rule__Instance__Group_3__0 )? )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2289:1: ( rule__Instance__Group_3__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_3()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2290:1: ( rule__Instance__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2290:2: rule__Instance__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl4582);
                    rule__Instance__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group__3__Impl


    // $ANTLR start rule__Instance__Group_3__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2308:1: rule__Instance__Group_3__0 : rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 ;
    public final void rule__Instance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2312:1: ( rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2313:2: rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__04621);
            rule__Instance__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__04624);
            rule__Instance__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__0


    // $ANTLR start rule__Instance__Group_3__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2320:1: rule__Instance__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Instance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2324:1: ( ( '(' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2325:1: ( '(' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2325:1: ( '(' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2326:1: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Instance__Group_3__0__Impl4652); 
             after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__0__Impl


    // $ANTLR start rule__Instance__Group_3__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2339:1: rule__Instance__Group_3__1 : rule__Instance__Group_3__1__Impl rule__Instance__Group_3__2 ;
    public final void rule__Instance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2343:1: ( rule__Instance__Group_3__1__Impl rule__Instance__Group_3__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2344:2: rule__Instance__Group_3__1__Impl rule__Instance__Group_3__2
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__14683);
            rule__Instance__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_3__2_in_rule__Instance__Group_3__14686);
            rule__Instance__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__1


    // $ANTLR start rule__Instance__Group_3__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2351:1: rule__Instance__Group_3__1__Impl : ( ( rule__Instance__ParamsAssignment_3_1 )* ) ;
    public final void rule__Instance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2355:1: ( ( ( rule__Instance__ParamsAssignment_3_1 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2356:1: ( ( rule__Instance__ParamsAssignment_3_1 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2356:1: ( ( rule__Instance__ParamsAssignment_3_1 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2357:1: ( rule__Instance__ParamsAssignment_3_1 )*
            {
             before(grammarAccess.getInstanceAccess().getParamsAssignment_3_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2358:1: ( rule__Instance__ParamsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2358:2: rule__Instance__ParamsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Instance__ParamsAssignment_3_1_in_rule__Instance__Group_3__1__Impl4713);
            	    rule__Instance__ParamsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getParamsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__1__Impl


    // $ANTLR start rule__Instance__Group_3__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2368:1: rule__Instance__Group_3__2 : rule__Instance__Group_3__2__Impl ;
    public final void rule__Instance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2372:1: ( rule__Instance__Group_3__2__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2373:2: rule__Instance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__2__Impl_in_rule__Instance__Group_3__24744);
            rule__Instance__Group_3__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__2


    // $ANTLR start rule__Instance__Group_3__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2379:1: rule__Instance__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Instance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2383:1: ( ( ')' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2384:1: ( ')' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2384:1: ( ')' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2385:1: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__Instance__Group_3__2__Impl4772); 
             after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__Group_3__2__Impl


    // $ANTLR start rule__Function__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2404:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2408:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2409:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__04809);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__04812);
            rule__Function__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0


    // $ANTLR start rule__Function__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2416:1: rule__Function__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2420:1: ( ( 'func' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2421:1: ( 'func' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2421:1: ( 'func' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2422:1: 'func'
            {
             before(grammarAccess.getFunctionAccess().getFuncKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Function__Group__0__Impl4840); 
             after(grammarAccess.getFunctionAccess().getFuncKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0__Impl


    // $ANTLR start rule__Function__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2435:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2439:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2440:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__14871);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__14874);
            rule__Function__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1


    // $ANTLR start rule__Function__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2447:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2451:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2452:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2452:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2453:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2454:1: ( rule__Function__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2454:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl4901);
            rule__Function__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1__Impl


    // $ANTLR start rule__Function__Group__2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2464:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2468:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2469:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__24931);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__24934);
            rule__Function__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2


    // $ANTLR start rule__Function__Group__2__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2476:1: rule__Function__Group__2__Impl : ( '{' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2480:1: ( ( '{' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2481:1: ( '{' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2481:1: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2482:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Function__Group__2__Impl4962); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2__Impl


    // $ANTLR start rule__Function__Group__3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2495:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2499:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2500:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__34993);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__34996);
            rule__Function__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3


    // $ANTLR start rule__Function__Group__3__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2507:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2511:1: ( ( ( rule__Function__Group_3__0 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2512:1: ( ( rule__Function__Group_3__0 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2512:1: ( ( rule__Function__Group_3__0 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2513:1: ( rule__Function__Group_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2514:1: ( rule__Function__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2514:2: rule__Function__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5023);
            	    rule__Function__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3__Impl


    // $ANTLR start rule__Function__Group__4
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2524:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2528:1: ( rule__Function__Group__4__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2529:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45054);
            rule__Function__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4


    // $ANTLR start rule__Function__Group__4__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2535:1: rule__Function__Group__4__Impl : ( '}' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2539:1: ( ( '}' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2540:1: ( '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2540:1: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2541:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Function__Group__4__Impl5082); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4__Impl


    // $ANTLR start rule__Function__Group_3__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2564:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2568:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2569:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05123);
            rule__Function__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05126);
            rule__Function__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_3__0


    // $ANTLR start rule__Function__Group_3__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2576:1: rule__Function__Group_3__0__Impl : ( ( rule__Function__StepAssignment_3_0 ) ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2580:1: ( ( ( rule__Function__StepAssignment_3_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2581:1: ( ( rule__Function__StepAssignment_3_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2581:1: ( ( rule__Function__StepAssignment_3_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2582:1: ( rule__Function__StepAssignment_3_0 )
            {
             before(grammarAccess.getFunctionAccess().getStepAssignment_3_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2583:1: ( rule__Function__StepAssignment_3_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2583:2: rule__Function__StepAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Function__StepAssignment_3_0_in_rule__Function__Group_3__0__Impl5153);
            rule__Function__StepAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getStepAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_3__0__Impl


    // $ANTLR start rule__Function__Group_3__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2593:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2597:1: ( rule__Function__Group_3__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2598:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__15183);
            rule__Function__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_3__1


    // $ANTLR start rule__Function__Group_3__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2604:1: rule__Function__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2608:1: ( ( ';' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2609:1: ( ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2609:1: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2610:1: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__Function__Group_3__1__Impl5211); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_3__1__Impl


    // $ANTLR start rule__Label__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2627:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2631:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2632:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05246);
            rule__Label__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05249);
            rule__Label__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__0


    // $ANTLR start rule__Label__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2639:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2643:1: ( ( 'label' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2644:1: ( 'label' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2644:1: ( 'label' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2645:1: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Label__Group__0__Impl5277); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__0__Impl


    // $ANTLR start rule__Label__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2658:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2662:1: ( rule__Label__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2663:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15308);
            rule__Label__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__1


    // $ANTLR start rule__Label__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2669:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2673:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2674:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2674:1: ( ( rule__Label__NameAssignment_1 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2675:1: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2676:1: ( rule__Label__NameAssignment_1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2676:2: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl5335);
            rule__Label__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__1__Impl


    // $ANTLR start rule__Instruction__Group__0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2690:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2694:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2695:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__05369);
            rule__Instruction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__05372);
            rule__Instruction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group__0


    // $ANTLR start rule__Instruction__Group__0__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2702:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__InsAssignment_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2706:1: ( ( ( rule__Instruction__InsAssignment_0 ) ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2707:1: ( ( rule__Instruction__InsAssignment_0 ) )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2707:1: ( ( rule__Instruction__InsAssignment_0 ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2708:1: ( rule__Instruction__InsAssignment_0 )
            {
             before(grammarAccess.getInstructionAccess().getInsAssignment_0()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2709:1: ( rule__Instruction__InsAssignment_0 )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2709:2: rule__Instruction__InsAssignment_0
            {
            pushFollow(FOLLOW_rule__Instruction__InsAssignment_0_in_rule__Instruction__Group__0__Impl5399);
            rule__Instruction__InsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getInsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group__0__Impl


    // $ANTLR start rule__Instruction__Group__1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2719:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2723:1: ( rule__Instruction__Group__1__Impl )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2724:2: rule__Instruction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__15429);
            rule__Instruction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group__1


    // $ANTLR start rule__Instruction__Group__1__Impl
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2730:1: rule__Instruction__Group__1__Impl : ( ( rule__Instruction__ParamsAssignment_1 )* ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2734:1: ( ( ( rule__Instruction__ParamsAssignment_1 )* ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2735:1: ( ( rule__Instruction__ParamsAssignment_1 )* )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2735:1: ( ( rule__Instruction__ParamsAssignment_1 )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2736:1: ( rule__Instruction__ParamsAssignment_1 )*
            {
             before(grammarAccess.getInstructionAccess().getParamsAssignment_1()); 
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2737:1: ( rule__Instruction__ParamsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_HEXINT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2737:2: rule__Instruction__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__ParamsAssignment_1_in_rule__Instruction__Group__1__Impl5456);
            	    rule__Instruction__ParamsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInstructionAccess().getParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group__1__Impl


    // $ANTLR start rule__Module__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2752:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2756:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2757:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2757:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2758:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_15496); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__NameAssignment_1


    // $ANTLR start rule__Module__TargetAssignment_3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2767:1: rule__Module__TargetAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__Module__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2771:1: ( ( ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2772:1: ( ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2772:1: ( ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2773:1: ruleQualifiedID
            {
             before(grammarAccess.getModuleAccess().getTargetQualifiedIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__Module__TargetAssignment_35527);
            ruleQualifiedID();
            _fsp--;

             after(grammarAccess.getModuleAccess().getTargetQualifiedIDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__TargetAssignment_3


    // $ANTLR start rule__Module__ItemsAssignment_5
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2782:1: rule__Module__ItemsAssignment_5 : ( ruleModuleItem ) ;
    public final void rule__Module__ItemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2786:1: ( ( ruleModuleItem ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2787:1: ( ruleModuleItem )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2787:1: ( ruleModuleItem )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2788:1: ruleModuleItem
            {
             before(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModuleItem_in_rule__Module__ItemsAssignment_55558);
            ruleModuleItem();
            _fsp--;

             after(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__ItemsAssignment_5


    // $ANTLR start rule__Module__ParamsAssignment_6_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2797:1: rule__Module__ParamsAssignment_6_1 : ( ruleModuleParam ) ;
    public final void rule__Module__ParamsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2801:1: ( ( ruleModuleParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2802:1: ( ruleModuleParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2802:1: ( ruleModuleParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2803:1: ruleModuleParam
            {
             before(grammarAccess.getModuleAccess().getParamsModuleParamParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleModuleParam_in_rule__Module__ParamsAssignment_6_15589);
            ruleModuleParam();
            _fsp--;

             after(grammarAccess.getModuleAccess().getParamsModuleParamParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Module__ParamsAssignment_6_1


    // $ANTLR start rule__ModuleParam__TypeAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2812:1: rule__ModuleParam__TypeAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__ModuleParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2816:1: ( ( ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2817:1: ( ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2817:1: ( ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2818:1: ruleQualifiedID
            {
             before(grammarAccess.getModuleParamAccess().getTypeQualifiedIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__ModuleParam__TypeAssignment_05620);
            ruleQualifiedID();
            _fsp--;

             after(grammarAccess.getModuleParamAccess().getTypeQualifiedIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__TypeAssignment_0


    // $ANTLR start rule__ModuleParam__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2827:1: rule__ModuleParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModuleParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2831:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2832:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2832:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2833:1: RULE_ID
            {
             before(grammarAccess.getModuleParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModuleParam__NameAssignment_15651); 
             after(grammarAccess.getModuleParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModuleParam__NameAssignment_1


    // $ANTLR start rule__QualifiedID__SegmentsAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2842:1: rule__QualifiedID__SegmentsAssignment_0 : ( RULE_ID ) ;
    public final void rule__QualifiedID__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2846:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2847:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2847:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2848:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__SegmentsAssignment_05682); 
             after(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__SegmentsAssignment_0


    // $ANTLR start rule__QualifiedID__SegmentsAssignment_1_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2857:1: rule__QualifiedID__SegmentsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__QualifiedID__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2861:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2862:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2862:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2863:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__SegmentsAssignment_1_15713); 
             after(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedID__SegmentsAssignment_1_1


    // $ANTLR start rule__ConfigurationWord__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2872:1: rule__ConfigurationWord__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConfigurationWord__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2876:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2877:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2877:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2878:1: RULE_ID
            {
             before(grammarAccess.getConfigurationWordAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConfigurationWord__NameAssignment_15744); 
             after(grammarAccess.getConfigurationWordAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__NameAssignment_1


    // $ANTLR start rule__ConfigurationWord__DefaultAssignment_2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2887:1: rule__ConfigurationWord__DefaultAssignment_2 : ( ruleLiteralParam ) ;
    public final void rule__ConfigurationWord__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2891:1: ( ( ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2892:1: ( ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2892:1: ( ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2893:1: ruleLiteralParam
            {
             before(grammarAccess.getConfigurationWordAccess().getDefaultLiteralParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralParam_in_rule__ConfigurationWord__DefaultAssignment_25775);
            ruleLiteralParam();
            _fsp--;

             after(grammarAccess.getConfigurationWordAccess().getDefaultLiteralParamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__DefaultAssignment_2


    // $ANTLR start rule__ConfigurationWord__FieldsAssignment_4_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2902:1: rule__ConfigurationWord__FieldsAssignment_4_0 : ( ruleConfigurationFieldPlace ) ;
    public final void rule__ConfigurationWord__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2906:1: ( ( ruleConfigurationFieldPlace ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2907:1: ( ruleConfigurationFieldPlace )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2907:1: ( ruleConfigurationFieldPlace )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2908:1: ruleConfigurationFieldPlace
            {
             before(grammarAccess.getConfigurationWordAccess().getFieldsConfigurationFieldPlaceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_rule__ConfigurationWord__FieldsAssignment_4_05806);
            ruleConfigurationFieldPlace();
            _fsp--;

             after(grammarAccess.getConfigurationWordAccess().getFieldsConfigurationFieldPlaceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationWord__FieldsAssignment_4_0


    // $ANTLR start rule__ConfigurationFieldPlace__BitNumAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2917:1: rule__ConfigurationFieldPlace__BitNumAssignment_0 : ( ruleLiteralParam ) ;
    public final void rule__ConfigurationFieldPlace__BitNumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2921:1: ( ( ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2922:1: ( ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2922:1: ( ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2923:1: ruleLiteralParam
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumLiteralParamParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralParam_in_rule__ConfigurationFieldPlace__BitNumAssignment_05837);
            ruleLiteralParam();
            _fsp--;

             after(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumLiteralParamParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__BitNumAssignment_0


    // $ANTLR start rule__ConfigurationFieldPlace__StartBitAssignment_2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2932:1: rule__ConfigurationFieldPlace__StartBitAssignment_2 : ( ruleLiteralParam ) ;
    public final void rule__ConfigurationFieldPlace__StartBitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2936:1: ( ( ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2937:1: ( ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2937:1: ( ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2938:1: ruleLiteralParam
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitLiteralParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralParam_in_rule__ConfigurationFieldPlace__StartBitAssignment_25868);
            ruleLiteralParam();
            _fsp--;

             after(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitLiteralParamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__StartBitAssignment_2


    // $ANTLR start rule__ConfigurationFieldPlace__FieldAssignment_3
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2947:1: rule__ConfigurationFieldPlace__FieldAssignment_3 : ( ruleConfigurationField ) ;
    public final void rule__ConfigurationFieldPlace__FieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2951:1: ( ( ruleConfigurationField ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2952:1: ( ruleConfigurationField )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2952:1: ( ruleConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2953:1: ruleConfigurationField
            {
             before(grammarAccess.getConfigurationFieldPlaceAccess().getFieldConfigurationFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConfigurationField_in_rule__ConfigurationFieldPlace__FieldAssignment_35899);
            ruleConfigurationField();
            _fsp--;

             after(grammarAccess.getConfigurationFieldPlaceAccess().getFieldConfigurationFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConfigurationFieldPlace__FieldAssignment_3


    // $ANTLR start rule__EnumConfigurationField__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2962:1: rule__EnumConfigurationField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumConfigurationField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2966:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2967:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2967:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2968:1: RULE_ID
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumConfigurationField__NameAssignment_15930); 
             after(grammarAccess.getEnumConfigurationFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__NameAssignment_1


    // $ANTLR start rule__EnumConfigurationField__LiteralsAssignment_3_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2977:1: rule__EnumConfigurationField__LiteralsAssignment_3_0 : ( ruleEnumConfigurationFieldLiteral ) ;
    public final void rule__EnumConfigurationField__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2981:1: ( ( ruleEnumConfigurationFieldLiteral ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2982:1: ( ruleEnumConfigurationFieldLiteral )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2982:1: ( ruleEnumConfigurationFieldLiteral )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2983:1: ruleEnumConfigurationFieldLiteral
            {
             before(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsEnumConfigurationFieldLiteralParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_rule__EnumConfigurationField__LiteralsAssignment_3_05961);
            ruleEnumConfigurationFieldLiteral();
            _fsp--;

             after(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsEnumConfigurationFieldLiteralParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationField__LiteralsAssignment_3_0


    // $ANTLR start rule__EnumConfigurationFieldLiteral__NameAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2992:1: rule__EnumConfigurationFieldLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumConfigurationFieldLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2996:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2997:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2997:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2998:1: RULE_ID
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumConfigurationFieldLiteral__NameAssignment_05992); 
             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__NameAssignment_0


    // $ANTLR start rule__EnumConfigurationFieldLiteral__ValueAssignment_2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3007:1: rule__EnumConfigurationFieldLiteral__ValueAssignment_2 : ( ruleLiteralParam ) ;
    public final void rule__EnumConfigurationFieldLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3011:1: ( ( ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3012:1: ( ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3012:1: ( ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3013:1: ruleLiteralParam
            {
             before(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueLiteralParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralParam_in_rule__EnumConfigurationFieldLiteral__ValueAssignment_26023);
            ruleLiteralParam();
            _fsp--;

             after(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueLiteralParamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumConfigurationFieldLiteral__ValueAssignment_2


    // $ANTLR start rule__Symbol__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3022:1: rule__Symbol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Symbol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3026:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3027:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3027:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3028:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__NameAssignment_16054); 
             after(grammarAccess.getSymbolAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__NameAssignment_1


    // $ANTLR start rule__Symbol__ValueAssignment_2_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3037:1: rule__Symbol__ValueAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__Symbol__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3041:1: ( ( RULE_INT ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3042:1: ( RULE_INT )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3042:1: ( RULE_INT )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3043:1: RULE_INT
            {
             before(grammarAccess.getSymbolAccess().getValueINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Symbol__ValueAssignment_2_06085); 
             after(grammarAccess.getSymbolAccess().getValueINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__ValueAssignment_2_0


    // $ANTLR start rule__Symbol__ValueAssignment_2_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3052:1: rule__Symbol__ValueAssignment_2_1 : ( RULE_HEXINT ) ;
    public final void rule__Symbol__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3056:1: ( ( RULE_HEXINT ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3057:1: ( RULE_HEXINT )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3057:1: ( RULE_HEXINT )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3058:1: RULE_HEXINT
            {
             before(grammarAccess.getSymbolAccess().getValueHEXINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Symbol__ValueAssignment_2_16116); 
             after(grammarAccess.getSymbolAccess().getValueHEXINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Symbol__ValueAssignment_2_1


    // $ANTLR start rule__Variable__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3067:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3071:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3072:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3072:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3073:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_16147); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_1


    // $ANTLR start rule__Instance__TypeAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3082:1: rule__Instance__TypeAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__Instance__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3086:1: ( ( ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3087:1: ( ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3087:1: ( ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3088:1: ruleQualifiedID
            {
             before(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__Instance__TypeAssignment_16178);
            ruleQualifiedID();
            _fsp--;

             after(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__TypeAssignment_1


    // $ANTLR start rule__Instance__NameAssignment_2
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3097:1: rule__Instance__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3101:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3102:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3102:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3103:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_26209); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__NameAssignment_2


    // $ANTLR start rule__Instance__ParamsAssignment_3_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3112:1: rule__Instance__ParamsAssignment_3_1 : ( ruleModuleParam ) ;
    public final void rule__Instance__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3116:1: ( ( ruleModuleParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3117:1: ( ruleModuleParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3117:1: ( ruleModuleParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3118:1: ruleModuleParam
            {
             before(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleModuleParam_in_rule__Instance__ParamsAssignment_3_16240);
            ruleModuleParam();
            _fsp--;

             after(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instance__ParamsAssignment_3_1


    // $ANTLR start rule__Function__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3127:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3131:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3132:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3132:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3133:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16271); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__NameAssignment_1


    // $ANTLR start rule__Function__StepAssignment_3_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3142:1: rule__Function__StepAssignment_3_0 : ( ruleStep ) ;
    public final void rule__Function__StepAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3146:1: ( ( ruleStep ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3147:1: ( ruleStep )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3147:1: ( ruleStep )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3148:1: ruleStep
            {
             before(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Function__StepAssignment_3_06302);
            ruleStep();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__StepAssignment_3_0


    // $ANTLR start rule__Label__NameAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3157:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3161:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3162:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3162:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3163:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16333); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__NameAssignment_1


    // $ANTLR start rule__Instruction__InsAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3172:1: rule__Instruction__InsAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instruction__InsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3176:1: ( ( RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3177:1: ( RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3177:1: ( RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3178:1: RULE_ID
            {
             before(grammarAccess.getInstructionAccess().getInsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instruction__InsAssignment_06364); 
             after(grammarAccess.getInstructionAccess().getInsIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__InsAssignment_0


    // $ANTLR start rule__Instruction__ParamsAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3187:1: rule__Instruction__ParamsAssignment_1 : ( ruleParam ) ;
    public final void rule__Instruction__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3191:1: ( ( ruleParam ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3192:1: ( ruleParam )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3192:1: ( ruleParam )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3193:1: ruleParam
            {
             before(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Instruction__ParamsAssignment_16395);
            ruleParam();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__ParamsAssignment_1


    // $ANTLR start rule__LiteralParam__ValueAssignment_0
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3202:1: rule__LiteralParam__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__LiteralParam__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3206:1: ( ( RULE_INT ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3207:1: ( RULE_INT )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3207:1: ( RULE_INT )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3208:1: RULE_INT
            {
             before(grammarAccess.getLiteralParamAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LiteralParam__ValueAssignment_06426); 
             after(grammarAccess.getLiteralParamAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralParam__ValueAssignment_0


    // $ANTLR start rule__LiteralParam__ValueAssignment_1
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3217:1: rule__LiteralParam__ValueAssignment_1 : ( RULE_HEXINT ) ;
    public final void rule__LiteralParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3221:1: ( ( RULE_HEXINT ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3222:1: ( RULE_HEXINT )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3222:1: ( RULE_HEXINT )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3223:1: RULE_HEXINT
            {
             before(grammarAccess.getLiteralParamAccess().getValueHEXINTTerminalRuleCall_1_0()); 
            match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__LiteralParam__ValueAssignment_16457); 
             after(grammarAccess.getLiteralParamAccess().getValueHEXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralParam__ValueAssignment_1


    // $ANTLR start rule__RefParam__RefAssignment
    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3232:1: rule__RefParam__RefAssignment : ( ruleQualifiedID ) ;
    public final void rule__RefParam__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3236:1: ( ( ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3237:1: ( ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3237:1: ( ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3238:1: ruleQualifiedID
            {
             before(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__RefParam__RefAssignment6488);
            ruleQualifiedID();
            _fsp--;

             after(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RefParam__RefAssignment


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParam_in_entryRuleModuleParam130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleParam137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleParam__Group__0_in_ruleModuleParam163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleItem_in_entryRuleModuleItem250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleItem257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleItem__Group__0_in_ruleModuleItem283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationWord317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__0_in_ruleConfigurationWord343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationFieldPlace377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__0_in_ruleConfigurationFieldPlace403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationField437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationField496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__0_in_ruleEnumConfigurationField522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__0_in_ruleEnumConfigurationFieldLiteral582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0_in_ruleSymbol642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0_in_ruleInstance762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__0_in_ruleInstruction1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Alternatives_in_ruleParam1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralParam1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralParam__Alternatives_in_ruleLiteralParam1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_entryRuleRefParam1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefParam1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefParam__RefAssignment_in_ruleRefParam1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__ModuleItem__Alternatives_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_rule__ModuleItem__Alternatives_01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ModuleItem__Alternatives_01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_rule__ModuleItem__Alternatives_01269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationWord_in_rule__ModuleItem__Alternatives_01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__ValueAssignment_2_0_in_rule__Symbol__Alternatives_21318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__ValueAssignment_2_1_in_rule__Symbol__Alternatives_21336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Step__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Step__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_rule__Param__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_rule__Param__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralParam__ValueAssignment_0_in_rule__LiteralParam__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralParam__ValueAssignment_1_in_rule__LiteralParam__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Module__Group__0__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11578 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group__2__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31700 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TargetAssignment_3_in_rule__Module__Group__3__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41760 = new BitSet(new long[]{0x000000000F118000L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group__4__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51822 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ItemsAssignment_5_in_rule__Module__Group__5__Impl1852 = new BitSet(new long[]{0x000000000F100002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61883 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__0_in_rule__Module__Group__6__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group__7__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__0__Impl_in_rule__Module__Group_6__02019 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Module__Group_6__1_in_rule__Module__Group_6__02022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_6__0__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__1__Impl_in_rule__Module__Group_6__12081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Module__Group_6__2_in_rule__Module__Group_6__12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ParamsAssignment_6_1_in_rule__Module__Group_6__1__Impl2111 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Module__Group_6__2__Impl_in_rule__Module__Group_6__22142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group_6__2__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleParam__Group__0__Impl_in_rule__ModuleParam__Group__02207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModuleParam__Group__1_in_rule__ModuleParam__Group__02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleParam__TypeAssignment_0_in_rule__ModuleParam__Group__0__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleParam__Group__1__Impl_in_rule__ModuleParam__Group__12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleParam__NameAssignment_1_in_rule__ModuleParam__Group__1__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02328 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__SegmentsAssignment_0_in_rule__QualifiedID__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2415 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedID__Group_1__0__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__SegmentsAssignment_1_1_in_rule__QualifiedID__Group_1__1__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleItem__Group__0__Impl_in_rule__ModuleItem__Group__02573 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ModuleItem__Group__1_in_rule__ModuleItem__Group__02576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleItem__Alternatives_0_in_rule__ModuleItem__Group__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleItem__Group__1__Impl_in_rule__ModuleItem__Group__12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModuleItem__Group__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__0__Impl_in_rule__ConfigurationWord__Group__02696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__1_in_rule__ConfigurationWord__Group__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConfigurationWord__Group__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__1__Impl_in_rule__ConfigurationWord__Group__12758 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__2_in_rule__ConfigurationWord__Group__12761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__NameAssignment_1_in_rule__ConfigurationWord__Group__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__2__Impl_in_rule__ConfigurationWord__Group__22818 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__3_in_rule__ConfigurationWord__Group__22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__DefaultAssignment_2_in_rule__ConfigurationWord__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__3__Impl_in_rule__ConfigurationWord__Group__32879 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__4_in_rule__ConfigurationWord__Group__32882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConfigurationWord__Group__3__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__4__Impl_in_rule__ConfigurationWord__Group__42941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__5_in_rule__ConfigurationWord__Group__42944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group_4__0_in_rule__ConfigurationWord__Group__4__Impl2971 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group__5__Impl_in_rule__ConfigurationWord__Group__53002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConfigurationWord__Group__5__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group_4__0__Impl_in_rule__ConfigurationWord__Group_4__03073 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group_4__1_in_rule__ConfigurationWord__Group_4__03076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__FieldsAssignment_4_0_in_rule__ConfigurationWord__Group_4__0__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationWord__Group_4__1__Impl_in_rule__ConfigurationWord__Group_4__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConfigurationWord__Group_4__1__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__0__Impl_in_rule__ConfigurationFieldPlace__Group__03196 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__1_in_rule__ConfigurationFieldPlace__Group__03199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__BitNumAssignment_0_in_rule__ConfigurationFieldPlace__Group__0__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__1__Impl_in_rule__ConfigurationFieldPlace__Group__13256 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__2_in_rule__ConfigurationFieldPlace__Group__13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConfigurationFieldPlace__Group__1__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__2__Impl_in_rule__ConfigurationFieldPlace__Group__23318 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__3_in_rule__ConfigurationFieldPlace__Group__23321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__StartBitAssignment_2_in_rule__ConfigurationFieldPlace__Group__2__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__Group__3__Impl_in_rule__ConfigurationFieldPlace__Group__33378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationFieldPlace__FieldAssignment_3_in_rule__ConfigurationFieldPlace__Group__3__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__0__Impl_in_rule__EnumConfigurationField__Group__03443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__1_in_rule__EnumConfigurationField__Group__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumConfigurationField__Group__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__1__Impl_in_rule__EnumConfigurationField__Group__13505 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__2_in_rule__EnumConfigurationField__Group__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__NameAssignment_1_in_rule__EnumConfigurationField__Group__1__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__2__Impl_in_rule__EnumConfigurationField__Group__23565 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__3_in_rule__EnumConfigurationField__Group__23568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumConfigurationField__Group__2__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__3__Impl_in_rule__EnumConfigurationField__Group__33627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__4_in_rule__EnumConfigurationField__Group__33630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group_3__0_in_rule__EnumConfigurationField__Group__3__Impl3657 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group__4__Impl_in_rule__EnumConfigurationField__Group__43688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumConfigurationField__Group__4__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group_3__0__Impl_in_rule__EnumConfigurationField__Group_3__03757 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group_3__1_in_rule__EnumConfigurationField__Group_3__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__LiteralsAssignment_3_0_in_rule__EnumConfigurationField__Group_3__0__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationField__Group_3__1__Impl_in_rule__EnumConfigurationField__Group_3__13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumConfigurationField__Group_3__1__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__0__Impl_in_rule__EnumConfigurationFieldLiteral__Group__03880 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__1_in_rule__EnumConfigurationFieldLiteral__Group__03883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__NameAssignment_0_in_rule__EnumConfigurationFieldLiteral__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__1__Impl_in_rule__EnumConfigurationFieldLiteral__Group__13940 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__2_in_rule__EnumConfigurationFieldLiteral__Group__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumConfigurationFieldLiteral__Group__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__Group__2__Impl_in_rule__EnumConfigurationFieldLiteral__Group__24002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConfigurationFieldLiteral__ValueAssignment_2_in_rule__EnumConfigurationFieldLiteral__Group__2__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__04065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__04068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Symbol__Group__0__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__14127 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__14130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__NameAssignment_1_in_rule__Symbol__Group__1__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__24187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Alternatives_2_in_rule__Symbol__Group__2__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__04250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Variable__Group__0__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__04373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__04376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Instance__Group__0__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__14435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__14438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TypeAssignment_1_in_rule__Instance__Group__1__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__24495 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__24498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__NameAssignment_2_in_rule__Instance__Group__2__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__34555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__04621 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Instance__Group_3__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__14683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__2_in_rule__Instance__Group_3__14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__ParamsAssignment_3_1_in_rule__Instance__Group_3__1__Impl4713 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__2__Impl_in_rule__Instance__Group_3__24744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Instance__Group_3__2__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__04809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__04812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Function__Group__0__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__14871 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__24931 = new BitSet(new long[]{0x0000000010008010L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__24934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Function__Group__2__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__34993 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__34996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5023 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__4__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05123 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__StepAssignment_3_0_in_rule__Function__Group_3__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group_3__1__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Label__Group__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__05369 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__05372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__InsAssignment_0_in_rule__Instruction__Group__0__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__15429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__ParamsAssignment_1_in_rule__Instruction__Group__1__Impl5456 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__Module__TargetAssignment_35527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleItem_in_rule__Module__ItemsAssignment_55558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParam_in_rule__Module__ParamsAssignment_6_15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__ModuleParam__TypeAssignment_05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModuleParam__NameAssignment_15651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__SegmentsAssignment_05682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__SegmentsAssignment_1_15713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConfigurationWord__NameAssignment_15744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_rule__ConfigurationWord__DefaultAssignment_25775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_rule__ConfigurationWord__FieldsAssignment_4_05806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_rule__ConfigurationFieldPlace__BitNumAssignment_05837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_rule__ConfigurationFieldPlace__StartBitAssignment_25868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_rule__ConfigurationFieldPlace__FieldAssignment_35899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumConfigurationField__NameAssignment_15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_rule__EnumConfigurationField__LiteralsAssignment_3_05961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumConfigurationFieldLiteral__NameAssignment_05992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_rule__EnumConfigurationFieldLiteral__ValueAssignment_26023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__NameAssignment_16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Symbol__ValueAssignment_2_06085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Symbol__ValueAssignment_2_16116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_16147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__Instance__TypeAssignment_16178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_26209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParam_in_rule__Instance__ParamsAssignment_3_16240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Function__StepAssignment_3_06302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instruction__InsAssignment_06364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Instruction__ParamsAssignment_16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LiteralParam__ValueAssignment_06426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__LiteralParam__ValueAssignment_16457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__RefParam__RefAssignment6488 = new BitSet(new long[]{0x0000000000000002L});

}