package hu.e.parser.parser.antlr.internal; 

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
import hu.e.parser.services.ESyntaxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalESyntaxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_BINARY", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'::'", "'annotation'", "'#'", "'workflow'", "';'", "'{'", "'}'", "'='", "'instructionset'", "'extends'", "'<'", "'>'", "'$'", "':'", "'library'", "'use'", "'type'", "'void'", "'pointer'", "'array'", "'['", "']'", "'label'", "'fixed'", "'bits'", "'scale'", "'struct'", "','", "'const'", "'reg'", "'('", "')'", "'function'", "'overrides'", "'lazy'", "'return'", "'sizeof'", "'->'", "'isliteral'", "'unsigned'", "'signed'", "'default'", "'var'", "'-'", "'!'", "'&'", "'@'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'", "'error'", "'warning'", "'info'", "'+='", "'-='"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int RULE_REAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HEXINT=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BINARY=7;
    public static final int RULE_WS=12;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalESyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalESyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalESyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g"; }



     	private ESyntaxGrammarAccess grammarAccess;
     	
        public InternalESyntaxParser(TokenStream input, ESyntaxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CompilationUnit";	
       	}
       	
       	@Override
       	protected ESyntaxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCompilationUnit"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:68:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:69:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:70:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit75);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilationUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:77:1: ruleCompilationUnit returns [EObject current=null] : (this_Library_0= ruleLibrary | this_InstructionSetNotation_1= ruleInstructionSetNotation | this_WorkflowNotation_2= ruleWorkflowNotation ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Library_0 = null;

        EObject this_InstructionSetNotation_1 = null;

        EObject this_WorkflowNotation_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:80:28: ( (this_Library_0= ruleLibrary | this_InstructionSetNotation_1= ruleInstructionSetNotation | this_WorkflowNotation_2= ruleWorkflowNotation ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Library_0= ruleLibrary | this_InstructionSetNotation_1= ruleInstructionSetNotation | this_WorkflowNotation_2= ruleWorkflowNotation )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Library_0= ruleLibrary | this_InstructionSetNotation_1= ruleInstructionSetNotation | this_WorkflowNotation_2= ruleWorkflowNotation )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:82:5: this_Library_0= ruleLibrary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLibraryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLibrary_in_ruleCompilationUnit132);
                    this_Library_0=ruleLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Library_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:92:5: this_InstructionSetNotation_1= ruleInstructionSetNotation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getInstructionSetNotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstructionSetNotation_in_ruleCompilationUnit159);
                    this_InstructionSetNotation_1=ruleInstructionSetNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstructionSetNotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:102:5: this_WorkflowNotation_2= ruleWorkflowNotation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getWorkflowNotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWorkflowNotation_in_ruleCompilationUnit186);
                    this_WorkflowNotation_2=ruleWorkflowNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WorkflowNotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleLibraryName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:118:1: entryRuleLibraryName returns [String current=null] : iv_ruleLibraryName= ruleLibraryName EOF ;
    public final String entryRuleLibraryName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLibraryName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:119:2: (iv_ruleLibraryName= ruleLibraryName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:120:2: iv_ruleLibraryName= ruleLibraryName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryNameRule()); 
            }
            pushFollow(FOLLOW_ruleLibraryName_in_entryRuleLibraryName222);
            iv_ruleLibraryName=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibraryName233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLibraryName"


    // $ANTLR start "ruleLibraryName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:127:1: ruleLibraryName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleLibraryName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:130:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLibraryName273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getLibraryNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:138:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:139:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleLibraryName292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getLibraryNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLibraryName307); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getLibraryNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLibraryName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:159:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:160:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:161:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName355);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_LibraryName_0= ruleLibraryName kw= '::' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_LibraryName_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:171:28: ( ( (this_LibraryName_0= ruleLibraryName kw= '::' )? this_ID_2= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:1: ( (this_LibraryName_0= ruleLibraryName kw= '::' )? this_ID_2= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:1: ( (this_LibraryName_0= ruleLibraryName kw= '::' )? this_ID_2= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:2: (this_LibraryName_0= ruleLibraryName kw= '::' )? this_ID_2= RULE_ID
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:2: (this_LibraryName_0= ruleLibraryName kw= '::' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=14 && LA3_1<=15)) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:173:5: this_LibraryName_0= ruleLibraryName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualifiedNameAccess().getLibraryNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLibraryName_in_ruleQualifiedName414);
                    this_LibraryName_0=ruleLibraryName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LibraryName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLITERAL"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:204:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:205:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:206:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERALRule()); 
            }
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL495);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL506); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLITERAL"


    // $ANTLR start "ruleLITERAL"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_HEXINT_1=null;
        Token this_BINARY_2=null;
        Token this_REAL_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:216:28: ( (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:217:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:217:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_HEXINT:
                {
                alt4=2;
                }
                break;
            case RULE_BINARY:
                {
                alt4=3;
                }
                break;
            case RULE_REAL:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:217:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLITERAL546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:225:10: this_HEXINT_1= RULE_HEXINT
                    {
                    this_HEXINT_1=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLITERAL572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_1, grammarAccess.getLITERALAccess().getHEXINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:233:10: this_BINARY_2= RULE_BINARY
                    {
                    this_BINARY_2=(Token)match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleLITERAL598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BINARY_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BINARY_2, grammarAccess.getLITERALAccess().getBINARYTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:241:10: this_REAL_3= RULE_REAL
                    {
                    this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLITERAL624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REAL_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REAL_3, grammarAccess.getLITERALAccess().getREALTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLITERAL"


    // $ANTLR start "entryRuleAnnotationDefinition"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:256:1: entryRuleAnnotationDefinition returns [EObject current=null] : iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF ;
    public final EObject entryRuleAnnotationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:2: (iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:258:2: iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationDefinition_in_entryRuleAnnotationDefinition669);
            iv_ruleAnnotationDefinition=ruleAnnotationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationDefinition679); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationDefinition"


    // $ANTLR start "ruleAnnotationDefinition"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:265:1: ruleAnnotationDefinition returns [EObject current=null] : (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:268:28: ( (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:269:1: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:269:1: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:269:3: otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAnnotationDefinition716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationDefinitionAccess().getAnnotationKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:273:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:274:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:274:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationDefinition733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAnnotationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationDefinition"


    // $ANTLR start "entryRuleAnnotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:299:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:300:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:301:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation774);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation784); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:308:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '#' ( (lv_definition_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:311:28: ( (otherlv_0= '#' ( (lv_definition_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:312:1: (otherlv_0= '#' ( (lv_definition_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:312:1: (otherlv_0= '#' ( (lv_definition_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:312:3: otherlv_0= '#' ( (lv_definition_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAnnotation821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getNumberSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:316:1: ( (lv_definition_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:317:1: (lv_definition_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:317:1: (lv_definition_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:318:3: lv_definition_1_0= RULE_ID
            {
            lv_definition_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_definition_1_0, grammarAccess.getAnnotationAccess().getDefinitionIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"definition",
                      		lv_definition_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleWorkflowNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:342:1: entryRuleWorkflowNotation returns [EObject current=null] : iv_ruleWorkflowNotation= ruleWorkflowNotation EOF ;
    public final EObject entryRuleWorkflowNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:343:2: (iv_ruleWorkflowNotation= ruleWorkflowNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:344:2: iv_ruleWorkflowNotation= ruleWorkflowNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowNotationRule()); 
            }
            pushFollow(FOLLOW_ruleWorkflowNotation_in_entryRuleWorkflowNotation879);
            iv_ruleWorkflowNotation=ruleWorkflowNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowNotation889); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorkflowNotation"


    // $ANTLR start "ruleWorkflowNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:351:1: ruleWorkflowNotation returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' ( (lv_steps_3_0= ruleWorkflowStepNotation ) )* ) ;
    public final EObject ruleWorkflowNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:354:28: ( (otherlv_0= 'workflow' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' ( (lv_steps_3_0= ruleWorkflowStepNotation ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:355:1: (otherlv_0= 'workflow' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' ( (lv_steps_3_0= ruleWorkflowStepNotation ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:355:1: (otherlv_0= 'workflow' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' ( (lv_steps_3_0= ruleWorkflowStepNotation ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:355:3: otherlv_0= 'workflow' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' ( (lv_steps_3_0= ruleWorkflowStepNotation ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWorkflowNotation926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWorkflowNotationAccess().getWorkflowKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:359:1: ( (lv_name_1_0= ruleLibraryName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:360:1: (lv_name_1_0= ruleLibraryName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:360:1: (lv_name_1_0= ruleLibraryName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:361:3: lv_name_1_0= ruleLibraryName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWorkflowNotationAccess().getNameLibraryNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLibraryName_in_ruleWorkflowNotation947);
            lv_name_1_0=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWorkflowNotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LibraryName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleWorkflowNotation959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWorkflowNotationAccess().getSemicolonKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:381:1: ( (lv_steps_3_0= ruleWorkflowStepNotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:382:1: (lv_steps_3_0= ruleWorkflowStepNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:382:1: (lv_steps_3_0= ruleWorkflowStepNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:3: lv_steps_3_0= ruleWorkflowStepNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWorkflowNotationAccess().getStepsWorkflowStepNotationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWorkflowStepNotation_in_ruleWorkflowNotation980);
            	    lv_steps_3_0=ruleWorkflowStepNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWorkflowNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"steps",
            	              		lv_steps_3_0, 
            	              		"WorkflowStepNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWorkflowNotation"


    // $ANTLR start "entryRuleWorkflowStepNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:407:1: entryRuleWorkflowStepNotation returns [EObject current=null] : iv_ruleWorkflowStepNotation= ruleWorkflowStepNotation EOF ;
    public final EObject entryRuleWorkflowStepNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowStepNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:408:2: (iv_ruleWorkflowStepNotation= ruleWorkflowStepNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:409:2: iv_ruleWorkflowStepNotation= ruleWorkflowStepNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowStepNotationRule()); 
            }
            pushFollow(FOLLOW_ruleWorkflowStepNotation_in_entryRuleWorkflowStepNotation1017);
            iv_ruleWorkflowStepNotation=ruleWorkflowStepNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowStepNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowStepNotation1027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorkflowStepNotation"


    // $ANTLR start "ruleWorkflowStepNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:416:1: ruleWorkflowStepNotation returns [EObject current=null] : ( ( (lv_type_0_0= ruleLibraryName ) ) otherlv_1= '{' ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )* otherlv_3= '}' ) ;
    public final EObject ruleWorkflowStepNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:419:28: ( ( ( (lv_type_0_0= ruleLibraryName ) ) otherlv_1= '{' ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )* otherlv_3= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:420:1: ( ( (lv_type_0_0= ruleLibraryName ) ) otherlv_1= '{' ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )* otherlv_3= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:420:1: ( ( (lv_type_0_0= ruleLibraryName ) ) otherlv_1= '{' ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )* otherlv_3= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:420:2: ( (lv_type_0_0= ruleLibraryName ) ) otherlv_1= '{' ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )* otherlv_3= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:420:2: ( (lv_type_0_0= ruleLibraryName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:421:1: (lv_type_0_0= ruleLibraryName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:421:1: (lv_type_0_0= ruleLibraryName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:422:3: lv_type_0_0= ruleLibraryName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWorkflowStepNotationAccess().getTypeLibraryNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLibraryName_in_ruleWorkflowStepNotation1073);
            lv_type_0_0=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWorkflowStepNotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"LibraryName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleWorkflowStepNotation1085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWorkflowStepNotationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:442:1: ( (lv_params_2_0= ruleWorkflowStepParameterNotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:443:1: (lv_params_2_0= ruleWorkflowStepParameterNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:443:1: (lv_params_2_0= ruleWorkflowStepParameterNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:444:3: lv_params_2_0= ruleWorkflowStepParameterNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWorkflowStepNotationAccess().getParamsWorkflowStepParameterNotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWorkflowStepParameterNotation_in_ruleWorkflowStepNotation1106);
            	    lv_params_2_0=ruleWorkflowStepParameterNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWorkflowStepNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_2_0, 
            	              		"WorkflowStepParameterNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleWorkflowStepNotation1119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWorkflowStepNotationAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWorkflowStepNotation"


    // $ANTLR start "entryRuleWorkflowStepParameterNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:472:1: entryRuleWorkflowStepParameterNotation returns [EObject current=null] : iv_ruleWorkflowStepParameterNotation= ruleWorkflowStepParameterNotation EOF ;
    public final EObject entryRuleWorkflowStepParameterNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowStepParameterNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:473:2: (iv_ruleWorkflowStepParameterNotation= ruleWorkflowStepParameterNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:474:2: iv_ruleWorkflowStepParameterNotation= ruleWorkflowStepParameterNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowStepParameterNotationRule()); 
            }
            pushFollow(FOLLOW_ruleWorkflowStepParameterNotation_in_entryRuleWorkflowStepParameterNotation1155);
            iv_ruleWorkflowStepParameterNotation=ruleWorkflowStepParameterNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowStepParameterNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowStepParameterNotation1165); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorkflowStepParameterNotation"


    // $ANTLR start "ruleWorkflowStepParameterNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:481:1: ruleWorkflowStepParameterNotation returns [EObject current=null] : ( ( (lv_parameter_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) ) ) ;
    public final EObject ruleWorkflowStepParameterNotation() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:484:28: ( ( ( (lv_parameter_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:1: ( ( (lv_parameter_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:1: ( ( (lv_parameter_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:2: ( (lv_parameter_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:2: ( (lv_parameter_0_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:486:1: (lv_parameter_0_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:486:1: (lv_parameter_0_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:487:3: lv_parameter_0_0= RULE_ID
            {
            lv_parameter_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkflowStepParameterNotation1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_parameter_0_0, grammarAccess.getWorkflowStepParameterNotationAccess().getParameterIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWorkflowStepParameterNotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"parameter",
                      		lv_parameter_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleWorkflowStepParameterNotation1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWorkflowStepParameterNotationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:507:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= ruleLibraryName ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:507:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:507:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:508:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:508:1: (lv_value_2_0= RULE_STRING )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:509:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowStepParameterNotation1242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getWorkflowStepParameterNotationAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWorkflowStepParameterNotationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:526:6: ( (lv_value_3_0= ruleLibraryName ) )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:526:6: ( (lv_value_3_0= ruleLibraryName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: (lv_value_3_0= ruleLibraryName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: (lv_value_3_0= ruleLibraryName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:528:3: lv_value_3_0= ruleLibraryName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWorkflowStepParameterNotationAccess().getValueLibraryNameParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLibraryName_in_ruleWorkflowStepParameterNotation1274);
                    lv_value_3_0=ruleLibraryName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWorkflowStepParameterNotationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"LibraryName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWorkflowStepParameterNotation"


    // $ANTLR start "entryRuleInstructionSetNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:552:1: entryRuleInstructionSetNotation returns [EObject current=null] : iv_ruleInstructionSetNotation= ruleInstructionSetNotation EOF ;
    public final EObject entryRuleInstructionSetNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionSetNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:553:2: (iv_ruleInstructionSetNotation= ruleInstructionSetNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:554:2: iv_ruleInstructionSetNotation= ruleInstructionSetNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionSetNotationRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionSetNotation_in_entryRuleInstructionSetNotation1311);
            iv_ruleInstructionSetNotation=ruleInstructionSetNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionSetNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionSetNotation1321); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionSetNotation"


    // $ANTLR start "ruleInstructionSetNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:561:1: ruleInstructionSetNotation returns [EObject current=null] : (otherlv_0= 'instructionset' ( (lv_name_1_0= ruleLibraryName ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )? otherlv_4= ';' ( (lv_instructions_5_0= ruleInstructionNotation ) )* ) ;
    public final EObject ruleInstructionSetNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_extends_3_0 = null;

        EObject lv_instructions_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:564:28: ( (otherlv_0= 'instructionset' ( (lv_name_1_0= ruleLibraryName ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )? otherlv_4= ';' ( (lv_instructions_5_0= ruleInstructionNotation ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:1: (otherlv_0= 'instructionset' ( (lv_name_1_0= ruleLibraryName ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )? otherlv_4= ';' ( (lv_instructions_5_0= ruleInstructionNotation ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:1: (otherlv_0= 'instructionset' ( (lv_name_1_0= ruleLibraryName ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )? otherlv_4= ';' ( (lv_instructions_5_0= ruleInstructionNotation ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:3: otherlv_0= 'instructionset' ( (lv_name_1_0= ruleLibraryName ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )? otherlv_4= ';' ( (lv_instructions_5_0= ruleInstructionNotation ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleInstructionSetNotation1358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionSetNotationAccess().getInstructionsetKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:569:1: ( (lv_name_1_0= ruleLibraryName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: (lv_name_1_0= ruleLibraryName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: (lv_name_1_0= ruleLibraryName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:571:3: lv_name_1_0= ruleLibraryName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstructionSetNotationAccess().getNameLibraryNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLibraryName_in_ruleInstructionSetNotation1379);
            lv_name_1_0=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstructionSetNotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LibraryName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:587:2: (otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:587:4: otherlv_2= 'extends' ( (lv_extends_3_0= ruleLibraryName ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInstructionSetNotation1392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInstructionSetNotationAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:591:1: ( (lv_extends_3_0= ruleLibraryName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:592:1: (lv_extends_3_0= ruleLibraryName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:592:1: (lv_extends_3_0= ruleLibraryName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:593:3: lv_extends_3_0= ruleLibraryName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionSetNotationAccess().getExtendsLibraryNameParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLibraryName_in_ruleInstructionSetNotation1413);
                    lv_extends_3_0=ruleLibraryName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionSetNotationRule());
                      	        }
                             		set(
                             			current, 
                             			"extends",
                              		lv_extends_3_0, 
                              		"LibraryName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInstructionSetNotation1427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInstructionSetNotationAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:613:1: ( (lv_instructions_5_0= ruleInstructionNotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:614:1: (lv_instructions_5_0= ruleInstructionNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:614:1: (lv_instructions_5_0= ruleInstructionNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:615:3: lv_instructions_5_0= ruleInstructionNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionSetNotationAccess().getInstructionsInstructionNotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionNotation_in_ruleInstructionSetNotation1448);
            	    lv_instructions_5_0=ruleInstructionNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionSetNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instructions",
            	              		lv_instructions_5_0, 
            	              		"InstructionNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstructionSetNotation"


    // $ANTLR start "entryRuleInstructionNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:639:1: entryRuleInstructionNotation returns [EObject current=null] : iv_ruleInstructionNotation= ruleInstructionNotation EOF ;
    public final EObject entryRuleInstructionNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:640:2: (iv_ruleInstructionNotation= ruleInstructionNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:641:2: iv_ruleInstructionNotation= ruleInstructionNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionNotationRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionNotation_in_entryRuleInstructionNotation1485);
            iv_ruleInstructionNotation=ruleInstructionNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionNotation1495); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionNotation"


    // $ANTLR start "ruleInstructionNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:648:1: ruleInstructionNotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInstructionParameterNotation ) )* ( (lv_words_2_0= ruleInstructionWordNotation ) )+ ) ;
    public final EObject ruleInstructionNotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_1_0 = null;

        EObject lv_words_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:651:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInstructionParameterNotation ) )* ( (lv_words_2_0= ruleInstructionWordNotation ) )+ ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:652:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInstructionParameterNotation ) )* ( (lv_words_2_0= ruleInstructionWordNotation ) )+ )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:652:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInstructionParameterNotation ) )* ( (lv_words_2_0= ruleInstructionWordNotation ) )+ )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:652:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInstructionParameterNotation ) )* ( (lv_words_2_0= ruleInstructionWordNotation ) )+
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:652:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:653:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:653:1: (lv_name_0_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:654:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstructionNotation1537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInstructionNotationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInstructionNotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:670:2: ( (lv_params_1_0= ruleInstructionParameterNotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:671:1: (lv_params_1_0= ruleInstructionParameterNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:671:1: (lv_params_1_0= ruleInstructionParameterNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:672:3: lv_params_1_0= ruleInstructionParameterNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionNotationAccess().getParamsInstructionParameterNotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionParameterNotation_in_ruleInstructionNotation1563);
            	    lv_params_1_0=ruleInstructionParameterNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_1_0, 
            	              		"InstructionParameterNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:688:3: ( (lv_words_2_0= ruleInstructionWordNotation ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:689:1: (lv_words_2_0= ruleInstructionWordNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:689:1: (lv_words_2_0= ruleInstructionWordNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:690:3: lv_words_2_0= ruleInstructionWordNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionNotationAccess().getWordsInstructionWordNotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionWordNotation_in_ruleInstructionNotation1585);
            	    lv_words_2_0=ruleInstructionWordNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"words",
            	              		lv_words_2_0, 
            	              		"InstructionWordNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstructionNotation"


    // $ANTLR start "entryRuleInstructionWordNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:714:1: entryRuleInstructionWordNotation returns [EObject current=null] : iv_ruleInstructionWordNotation= ruleInstructionWordNotation EOF ;
    public final EObject entryRuleInstructionWordNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWordNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:715:2: (iv_ruleInstructionWordNotation= ruleInstructionWordNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:716:2: iv_ruleInstructionWordNotation= ruleInstructionWordNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionWordNotationRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionWordNotation_in_entryRuleInstructionWordNotation1622);
            iv_ruleInstructionWordNotation=ruleInstructionWordNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionWordNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionWordNotation1632); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionWordNotation"


    // $ANTLR start "ruleInstructionWordNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:723:1: ruleInstructionWordNotation returns [EObject current=null] : (otherlv_0= '<' ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+ otherlv_2= '>' ) ;
    public final EObject ruleInstructionWordNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:726:28: ( (otherlv_0= '<' ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+ otherlv_2= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:727:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+ otherlv_2= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:727:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+ otherlv_2= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:727:3: otherlv_0= '<' ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleInstructionWordNotation1669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionWordNotationAccess().getLessThanSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:731:1: ( (lv_sections_1_0= ruleInsctructionSectionNotation ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_REAL)||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:732:1: (lv_sections_1_0= ruleInsctructionSectionNotation )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:732:1: (lv_sections_1_0= ruleInsctructionSectionNotation )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:733:3: lv_sections_1_0= ruleInsctructionSectionNotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionWordNotationAccess().getSectionsInsctructionSectionNotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInsctructionSectionNotation_in_ruleInstructionWordNotation1690);
            	    lv_sections_1_0=ruleInsctructionSectionNotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionWordNotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sections",
            	              		lv_sections_1_0, 
            	              		"InsctructionSectionNotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleInstructionWordNotation1703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstructionWordNotationAccess().getGreaterThanSignKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstructionWordNotation"


    // $ANTLR start "entryRuleInstructionParameterNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:761:1: entryRuleInstructionParameterNotation returns [EObject current=null] : iv_ruleInstructionParameterNotation= ruleInstructionParameterNotation EOF ;
    public final EObject entryRuleInstructionParameterNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionParameterNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:762:2: (iv_ruleInstructionParameterNotation= ruleInstructionParameterNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:763:2: iv_ruleInstructionParameterNotation= ruleInstructionParameterNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionParameterNotationRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionParameterNotation_in_entryRuleInstructionParameterNotation1739);
            iv_ruleInstructionParameterNotation=ruleInstructionParameterNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionParameterNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionParameterNotation1749); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionParameterNotation"


    // $ANTLR start "ruleInstructionParameterNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:770:1: ruleInstructionParameterNotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleInstructionParameterNotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_default_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:773:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_name_0_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:776:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstructionParameterNotation1791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInstructionParameterNotationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInstructionParameterNotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:792:2: (otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:792:4: otherlv_1= '=' ( (lv_default_2_0= ruleLITERAL ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInstructionParameterNotation1809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInstructionParameterNotationAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:796:1: ( (lv_default_2_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:797:1: (lv_default_2_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:797:1: (lv_default_2_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:798:3: lv_default_2_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionParameterNotationAccess().getDefaultLITERALParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleInstructionParameterNotation1830);
                    lv_default_2_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionParameterNotationRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_2_0, 
                              		"LITERAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstructionParameterNotation"


    // $ANTLR start "entryRuleInsctructionSectionNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:822:1: entryRuleInsctructionSectionNotation returns [EObject current=null] : iv_ruleInsctructionSectionNotation= ruleInsctructionSectionNotation EOF ;
    public final EObject entryRuleInsctructionSectionNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsctructionSectionNotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:823:2: (iv_ruleInsctructionSectionNotation= ruleInsctructionSectionNotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:824:2: iv_ruleInsctructionSectionNotation= ruleInsctructionSectionNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsctructionSectionNotationRule()); 
            }
            pushFollow(FOLLOW_ruleInsctructionSectionNotation_in_entryRuleInsctructionSectionNotation1868);
            iv_ruleInsctructionSectionNotation=ruleInsctructionSectionNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsctructionSectionNotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsctructionSectionNotation1878); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInsctructionSectionNotation"


    // $ANTLR start "ruleInsctructionSectionNotation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:831:1: ruleInsctructionSectionNotation returns [EObject current=null] : ( ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) ) otherlv_3= ':' ( (lv_size_4_0= ruleLITERAL ) ) (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleInsctructionSectionNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_size_4_0 = null;

        AntlrDatatypeRuleToken lv_shift_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:834:28: ( ( ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) ) otherlv_3= ':' ( (lv_size_4_0= ruleLITERAL ) ) (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:1: ( ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) ) otherlv_3= ':' ( (lv_size_4_0= ruleLITERAL ) ) (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:1: ( ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) ) otherlv_3= ':' ( (lv_size_4_0= ruleLITERAL ) ) (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:2: ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) ) otherlv_3= ':' ( (lv_size_4_0= ruleLITERAL ) ) (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:2: ( (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ruleLITERAL ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_REAL)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:3: (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:3: (otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:5: otherlv_0= '$' ( (lv_param_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleInsctructionSectionNotation1917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsctructionSectionNotationAccess().getDollarSignKeyword_0_0_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:839:1: ( (lv_param_1_0= RULE_ID ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:840:1: (lv_param_1_0= RULE_ID )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:840:1: (lv_param_1_0= RULE_ID )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:841:3: lv_param_1_0= RULE_ID
                    {
                    lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsctructionSectionNotation1934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_param_1_0, grammarAccess.getInsctructionSectionNotationAccess().getParamIDTerminalRuleCall_0_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsctructionSectionNotationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"param",
                              		lv_param_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:858:6: ( (lv_value_2_0= ruleLITERAL ) )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:858:6: ( (lv_value_2_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:859:1: (lv_value_2_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:859:1: (lv_value_2_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:860:3: lv_value_2_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInsctructionSectionNotationAccess().getValueLITERALParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation1967);
                    lv_value_2_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInsctructionSectionNotationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"LITERAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleInsctructionSectionNotation1980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsctructionSectionNotationAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:880:1: ( (lv_size_4_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:881:1: (lv_size_4_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:881:1: (lv_size_4_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:882:3: lv_size_4_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsctructionSectionNotationAccess().getSizeLITERALParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation2001);
            lv_size_4_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInsctructionSectionNotationRule());
              	        }
                     		set(
                     			current, 
                     			"size",
                      		lv_size_4_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:898:2: (otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:898:4: otherlv_5= ':' ( (lv_shift_6_0= ruleLITERAL ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleInsctructionSectionNotation2014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInsctructionSectionNotationAccess().getColonKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:902:1: ( (lv_shift_6_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:903:1: (lv_shift_6_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:903:1: (lv_shift_6_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:904:3: lv_shift_6_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInsctructionSectionNotationAccess().getShiftLITERALParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation2035);
                    lv_shift_6_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInsctructionSectionNotationRule());
                      	        }
                             		set(
                             			current, 
                             			"shift",
                              		lv_shift_6_0, 
                              		"LITERAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInsctructionSectionNotation"


    // $ANTLR start "entryRuleLibrary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:928:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:929:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:930:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary2073);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary2083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:937:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleLibraryItem ) )* ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_use_4_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:940:28: ( (otherlv_0= 'library' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleLibraryItem ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:941:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleLibraryItem ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:941:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleLibraryItem ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:941:3: otherlv_0= 'library' ( (lv_name_1_0= ruleLibraryName ) ) otherlv_2= ';' (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleLibraryItem ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleLibrary2120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:945:1: ( (lv_name_1_0= ruleLibraryName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:946:1: (lv_name_1_0= ruleLibraryName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:946:1: (lv_name_1_0= ruleLibraryName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:947:3: lv_name_1_0= ruleLibraryName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLibraryAccess().getNameLibraryNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLibraryName_in_ruleLibrary2141);
            lv_name_1_0=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLibraryRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LibraryName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLibrary2153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getSemicolonKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:967:1: (otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:967:3: otherlv_3= 'use' ( (lv_use_4_0= ruleLibraryName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleLibrary2166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getUseKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:971:1: ( (lv_use_4_0= ruleLibraryName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:972:1: (lv_use_4_0= ruleLibraryName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:972:1: (lv_use_4_0= ruleLibraryName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:973:3: lv_use_4_0= ruleLibraryName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getUseLibraryNameParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibraryName_in_ruleLibrary2187);
            	    lv_use_4_0=ruleLibraryName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"use",
            	              		lv_use_4_0, 
            	              		"LibraryName");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLibrary2199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getLibraryAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:993:3: ( (lv_items_6_0= ruleLibraryItem ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==16||(LA17_0>=31 && LA17_0<=34)||(LA17_0>=37 && LA17_0<=38)||LA17_0==41||(LA17_0>=43 && LA17_0<=44)||LA17_0==47||(LA17_0>=54 && LA17_0<=55)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:994:1: (lv_items_6_0= ruleLibraryItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:994:1: (lv_items_6_0= ruleLibraryItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:995:3: lv_items_6_0= ruleLibraryItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getItemsLibraryItemParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibraryItem_in_ruleLibrary2222);
            	    lv_items_6_0=ruleLibraryItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_6_0, 
            	              		"LibraryItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleLibraryItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1019:1: entryRuleLibraryItem returns [EObject current=null] : iv_ruleLibraryItem= ruleLibraryItem EOF ;
    public final EObject entryRuleLibraryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1020:2: (iv_ruleLibraryItem= ruleLibraryItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1021:2: iv_ruleLibraryItem= ruleLibraryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryItemRule()); 
            }
            pushFollow(FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem2259);
            iv_ruleLibraryItem=ruleLibraryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibraryItem2269); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLibraryItem"


    // $ANTLR start "ruleLibraryItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1028:1: ruleLibraryItem returns [EObject current=null] : (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' ) ) ;
    public final EObject ruleLibraryItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Type_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Variable_2 = null;

        EObject this_ConstantVariable_4 = null;

        EObject this_RegisterVariable_6 = null;

        EObject this_AnnotationDefinition_8 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1031:28: ( (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1032:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1032:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 47:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
            case 32:
            case 33:
            case 34:
            case 37:
            case 38:
            case 41:
            case 54:
            case 55:
                {
                alt18=3;
                }
                break;
            case 43:
                {
                alt18=4;
                }
                break;
            case 44:
                {
                alt18=5;
                }
                break;
            case 16:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1033:5: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleLibraryItem2316);
                    this_Type_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1043:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleLibraryItem2343);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1052:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1052:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1053:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleLibraryItem2371);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleLibraryItem2382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1066:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1066:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1067:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getConstantVariableParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleLibraryItem2412);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLibraryItem2423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1080:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1080:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1081:5: this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getRegisterVariableParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegisterVariable_in_ruleLibraryItem2453);
                    this_RegisterVariable_6=ruleRegisterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegisterVariable_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleLibraryItem2464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1094:6: (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1094:6: (this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1095:5: this_AnnotationDefinition_8= ruleAnnotationDefinition otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getAnnotationDefinitionParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotationDefinition_in_ruleLibraryItem2494);
                    this_AnnotationDefinition_8=ruleAnnotationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnnotationDefinition_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleLibraryItem2505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_5_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLibraryItem"


    // $ANTLR start "entryRuleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1115:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1116:2: (iv_ruleType= ruleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1117:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2542);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2552); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1124:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_def_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1127:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1128:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1128:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1128:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleType2589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1132:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1133:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1133:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1134:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleType2623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1154:1: ( (lv_def_3_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1155:1: (lv_def_3_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1155:1: (lv_def_3_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1156:3: lv_def_3_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleType2644);
            lv_def_3_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_3_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleType2656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1184:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1185:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1186:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef2692);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef2702); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1193:1: ruleTypeDef returns [EObject current=null] : (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef | this_UnspecifiedTypeDef_5= ruleUnspecifiedTypeDef ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDef_0 = null;

        EObject this_StructTypeDef_1 = null;

        EObject this_PointerTypeDef_2 = null;

        EObject this_ArrayTypeDef_3 = null;

        EObject this_RefTypeDef_4 = null;

        EObject this_UnspecifiedTypeDef_5 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1196:28: ( (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef | this_UnspecifiedTypeDef_5= ruleUnspecifiedTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1197:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef | this_UnspecifiedTypeDef_5= ruleUnspecifiedTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1197:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef | this_UnspecifiedTypeDef_5= ruleUnspecifiedTypeDef )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 54:
            case 55:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                alt19=5;
                }
                break;
            case 32:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1198:5: this_DataTypeDef_0= ruleDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDef_in_ruleTypeDef2749);
                    this_DataTypeDef_0=ruleDataTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataTypeDef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1208:5: this_StructTypeDef_1= ruleStructTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getStructTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructTypeDef_in_ruleTypeDef2776);
                    this_StructTypeDef_1=ruleStructTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructTypeDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1218:5: this_PointerTypeDef_2= rulePointerTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getPointerTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePointerTypeDef_in_ruleTypeDef2803);
                    this_PointerTypeDef_2=rulePointerTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PointerTypeDef_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1228:5: this_ArrayTypeDef_3= ruleArrayTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getArrayTypeDefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2830);
                    this_ArrayTypeDef_3=ruleArrayTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayTypeDef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1238:5: this_RefTypeDef_4= ruleRefTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getRefTypeDefParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRefTypeDef_in_ruleTypeDef2857);
                    this_RefTypeDef_4=ruleRefTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RefTypeDef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1248:5: this_UnspecifiedTypeDef_5= ruleUnspecifiedTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getUnspecifiedTypeDefParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnspecifiedTypeDef_in_ruleTypeDef2884);
                    this_UnspecifiedTypeDef_5=ruleUnspecifiedTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnspecifiedTypeDef_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleUnspecifiedTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1264:1: entryRuleUnspecifiedTypeDef returns [EObject current=null] : iv_ruleUnspecifiedTypeDef= ruleUnspecifiedTypeDef EOF ;
    public final EObject entryRuleUnspecifiedTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnspecifiedTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1265:2: (iv_ruleUnspecifiedTypeDef= ruleUnspecifiedTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1266:2: iv_ruleUnspecifiedTypeDef= ruleUnspecifiedTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnspecifiedTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleUnspecifiedTypeDef_in_entryRuleUnspecifiedTypeDef2919);
            iv_ruleUnspecifiedTypeDef=ruleUnspecifiedTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnspecifiedTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnspecifiedTypeDef2929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnspecifiedTypeDef"


    // $ANTLR start "ruleUnspecifiedTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1273:1: ruleUnspecifiedTypeDef returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleUnspecifiedTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1276:28: ( ( () otherlv_1= 'void' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1277:1: ( () otherlv_1= 'void' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1277:1: ( () otherlv_1= 'void' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1277:2: () otherlv_1= 'void'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1277:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1278:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnspecifiedTypeDefAccess().getUnspecifiedTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleUnspecifiedTypeDef2975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnspecifiedTypeDefAccess().getVoidKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnspecifiedTypeDef"


    // $ANTLR start "entryRulePointerTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1295:1: entryRulePointerTypeDef returns [EObject current=null] : iv_rulePointerTypeDef= rulePointerTypeDef EOF ;
    public final EObject entryRulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1296:2: (iv_rulePointerTypeDef= rulePointerTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1297:2: iv_rulePointerTypeDef= rulePointerTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeDefRule()); 
            }
            pushFollow(FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef3011);
            iv_rulePointerTypeDef=rulePointerTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerTypeDef3021); if (state.failed) return current;

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
    // $ANTLR end "entryRulePointerTypeDef"


    // $ANTLR start "rulePointerTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1304:1: rulePointerTypeDef returns [EObject current=null] : (otherlv_0= 'pointer' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' ) ;
    public final EObject rulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1307:28: ( (otherlv_0= 'pointer' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1308:1: (otherlv_0= 'pointer' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1308:1: (otherlv_0= 'pointer' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1308:3: otherlv_0= 'pointer' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_rulePointerTypeDef3058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPointerTypeDefAccess().getPointerKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulePointerTypeDef3070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointerTypeDefAccess().getLessThanSignKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1316:1: ( (lv_def_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1317:1: (lv_def_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1317:1: (lv_def_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1318:3: lv_def_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointerTypeDefAccess().getDefTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_rulePointerTypeDef3091);
            lv_def_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPointerTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulePointerTypeDef3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPointerTypeDefAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePointerTypeDef"


    // $ANTLR start "entryRuleArrayTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1346:1: entryRuleArrayTypeDef returns [EObject current=null] : iv_ruleArrayTypeDef= ruleArrayTypeDef EOF ;
    public final EObject entryRuleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1347:2: (iv_ruleArrayTypeDef= ruleArrayTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1348:2: iv_ruleArrayTypeDef= ruleArrayTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef3139);
            iv_ruleArrayTypeDef=ruleArrayTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDef3149); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayTypeDef"


    // $ANTLR start "ruleArrayTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1355:1: ruleArrayTypeDef returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_def_2_0 = null;

        EObject lv_size_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1358:28: ( (otherlv_0= 'array' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1359:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1359:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1359:3: otherlv_0= 'array' otherlv_1= '<' ( (lv_def_2_0= ruleTypeDef ) ) otherlv_3= '>' (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleArrayTypeDef3186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleArrayTypeDef3198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayTypeDefAccess().getLessThanSignKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1367:1: ( (lv_def_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1368:1: (lv_def_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1368:1: (lv_def_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1369:3: lv_def_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getDefTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleArrayTypeDef3219);
            lv_def_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleArrayTypeDef3231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayTypeDefAccess().getGreaterThanSignKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:1: (otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:3: otherlv_4= '[' ( (lv_size_5_0= ruleXExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleArrayTypeDef3244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefAccess().getLeftSquareBracketKeyword_4_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1393:1: ( (lv_size_5_0= ruleXExpression ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1394:1: (lv_size_5_0= ruleXExpression )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1394:1: (lv_size_5_0= ruleXExpression )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1395:3: lv_size_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getSizeXExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleArrayTypeDef3265);
                    lv_size_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayTypeDefRule());
                      	        }
                             		set(
                             			current, 
                             			"size",
                              		lv_size_5_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleArrayTypeDef3277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getArrayTypeDefAccess().getRightSquareBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayTypeDef"


    // $ANTLR start "entryRuleRefTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1423:1: entryRuleRefTypeDef returns [EObject current=null] : iv_ruleRefTypeDef= ruleRefTypeDef EOF ;
    public final EObject entryRuleRefTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1424:2: (iv_ruleRefTypeDef= ruleRefTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1425:2: iv_ruleRefTypeDef= ruleRefTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef3315);
            iv_ruleRefTypeDef=ruleRefTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTypeDef3325); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefTypeDef"


    // $ANTLR start "ruleRefTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1432:1: ruleRefTypeDef returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleRefTypeDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1435:28: ( ( (lv_type_0_0= ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1436:1: ( (lv_type_0_0= ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1436:1: ( (lv_type_0_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1437:1: (lv_type_0_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1437:1: (lv_type_0_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1438:3: lv_type_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRefTypeDefAccess().getTypeQualifiedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRefTypeDef3370);
            lv_type_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRefTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRefTypeDef"


    // $ANTLR start "entryRuleDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1462:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1463:2: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1464:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef3405);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDef3415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeDef"


    // $ANTLR start "ruleDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1471:1: ruleDataTypeDef returns [EObject current=null] : (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef | this_LabelDataTypeDef_2= ruleLabelDataTypeDef ) ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDataTypeDef_0 = null;

        EObject this_FixedDataTypeDef_1 = null;

        EObject this_LabelDataTypeDef_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1474:28: ( (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef | this_LabelDataTypeDef_2= ruleLabelDataTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1475:1: (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef | this_LabelDataTypeDef_2= ruleLabelDataTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1475:1: (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef | this_LabelDataTypeDef_2= ruleLabelDataTypeDef )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1476:5: this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefAccess().getIntegerDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerDataTypeDef_in_ruleDataTypeDef3462);
                    this_IntegerDataTypeDef_0=ruleIntegerDataTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerDataTypeDef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1486:5: this_FixedDataTypeDef_1= ruleFixedDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefAccess().getFixedDataTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFixedDataTypeDef_in_ruleDataTypeDef3489);
                    this_FixedDataTypeDef_1=ruleFixedDataTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FixedDataTypeDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1496:5: this_LabelDataTypeDef_2= ruleLabelDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefAccess().getLabelDataTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelDataTypeDef_in_ruleDataTypeDef3516);
                    this_LabelDataTypeDef_2=ruleLabelDataTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelDataTypeDef_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeDef"


    // $ANTLR start "entryRuleLabelDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1512:1: entryRuleLabelDataTypeDef returns [EObject current=null] : iv_ruleLabelDataTypeDef= ruleLabelDataTypeDef EOF ;
    public final EObject entryRuleLabelDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1513:2: (iv_ruleLabelDataTypeDef= ruleLabelDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1514:2: iv_ruleLabelDataTypeDef= ruleLabelDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleLabelDataTypeDef_in_entryRuleLabelDataTypeDef3551);
            iv_ruleLabelDataTypeDef=ruleLabelDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDataTypeDef3561); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabelDataTypeDef"


    // $ANTLR start "ruleLabelDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1521:1: ruleLabelDataTypeDef returns [EObject current=null] : ( () otherlv_1= 'label' ) ;
    public final EObject ruleLabelDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1524:28: ( ( () otherlv_1= 'label' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1525:1: ( () otherlv_1= 'label' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1525:1: ( () otherlv_1= 'label' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1525:2: () otherlv_1= 'label'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1525:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelDataTypeDefAccess().getLabelDataTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleLabelDataTypeDef3607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelDataTypeDefAccess().getLabelKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLabelDataTypeDef"


    // $ANTLR start "entryRuleFixedDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1543:1: entryRuleFixedDataTypeDef returns [EObject current=null] : iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF ;
    public final EObject entryRuleFixedDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1544:2: (iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1545:2: iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixedDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleFixedDataTypeDef_in_entryRuleFixedDataTypeDef3643);
            iv_ruleFixedDataTypeDef=ruleFixedDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixedDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedDataTypeDef3653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFixedDataTypeDef"


    // $ANTLR start "ruleFixedDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:1: ruleFixedDataTypeDef returns [EObject current=null] : (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) ) ;
    public final EObject ruleFixedDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_scale_5_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1555:28: ( (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1556:1: (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1556:1: (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1556:3: otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleFixedDataTypeDef3690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixedDataTypeDefAccess().getFixedKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1560:1: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1561:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1561:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1562:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedDataTypeDef3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bits_1_0, grammarAccess.getFixedDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFixedDataTypeDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bits",
                      		lv_bits_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFixedDataTypeDef3724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFixedDataTypeDefAccess().getBitsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleFixedDataTypeDef3736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFixedDataTypeDefAccess().getScaleKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleFixedDataTypeDef3748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFixedDataTypeDefAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1590:1: ( (lv_scale_5_0= RULE_REAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1591:1: (lv_scale_5_0= RULE_REAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1591:1: (lv_scale_5_0= RULE_REAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1592:3: lv_scale_5_0= RULE_REAL
            {
            lv_scale_5_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleFixedDataTypeDef3765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_scale_5_0, grammarAccess.getFixedDataTypeDefAccess().getScaleREALTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFixedDataTypeDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"scale",
                      		lv_scale_5_0, 
                      		"REAL");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFixedDataTypeDef"


    // $ANTLR start "entryRuleIntegerDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1616:1: entryRuleIntegerDataTypeDef returns [EObject current=null] : iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF ;
    public final EObject entryRuleIntegerDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1617:2: (iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1618:2: iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerDataTypeDef_in_entryRuleIntegerDataTypeDef3806);
            iv_ruleIntegerDataTypeDef=ruleIntegerDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDataTypeDef3816); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerDataTypeDef"


    // $ANTLR start "ruleIntegerDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1625:1: ruleIntegerDataTypeDef returns [EObject current=null] : ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) ;
    public final EObject ruleIntegerDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1628:28: ( ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1629:1: ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1629:1: ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1629:2: ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1629:2: ( (lv_kind_0_0= ruleIntegerKind ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1630:1: (lv_kind_0_0= ruleIntegerKind )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1630:1: (lv_kind_0_0= ruleIntegerKind )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1631:3: lv_kind_0_0= ruleIntegerKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerDataTypeDefAccess().getKindIntegerKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntegerKind_in_ruleIntegerDataTypeDef3862);
            lv_kind_0_0=ruleIntegerKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerDataTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"IntegerKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1647:2: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1648:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1648:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1649:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerDataTypeDef3879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bits_1_0, grammarAccess.getIntegerDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerDataTypeDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bits",
                      		lv_bits_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleIntegerDataTypeDef3896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIntegerDataTypeDefAccess().getBitsKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerDataTypeDef"


    // $ANTLR start "entryRuleStructTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1677:1: entryRuleStructTypeDef returns [EObject current=null] : iv_ruleStructTypeDef= ruleStructTypeDef EOF ;
    public final EObject entryRuleStructTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1678:2: (iv_ruleStructTypeDef= ruleStructTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1679:2: iv_ruleStructTypeDef= ruleStructTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef3932);
            iv_ruleStructTypeDef=ruleStructTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDef3942); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructTypeDef"


    // $ANTLR start "ruleStructTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1686:1: ruleStructTypeDef returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleStructTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1689:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1691:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleStructTypeDef3988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStructTypeDefAccess().getStructKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStructTypeDef4000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1704:1: ( (lv_members_3_0= ruleStructTypeDefMember ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1705:1: (lv_members_3_0= ruleStructTypeDefMember )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1705:1: (lv_members_3_0= ruleStructTypeDefMember )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1706:3: lv_members_3_0= ruleStructTypeDefMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef4021);
            lv_members_3_0=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructTypeDefRule());
              	        }
                     		add(
                     			current, 
                     			"members",
                      		lv_members_3_0, 
                      		"StructTypeDefMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1722:2: (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1722:4: otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleStructTypeDef4034); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStructTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1726:1: ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1727:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1727:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1728:3: lv_members_5_0= ruleStructTypeDefMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef4055);
            	    lv_members_5_0=ruleStructTypeDefMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStructTypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_5_0, 
            	              		"StructTypeDefMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleStructTypeDef4069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStructTypeDefAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStructTypeDef"


    // $ANTLR start "entryRuleStructTypeDefMember"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1756:1: entryRuleStructTypeDefMember returns [EObject current=null] : iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF ;
    public final EObject entryRuleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDefMember = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1757:2: (iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1758:2: iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember4105);
            iv_ruleStructTypeDefMember=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDefMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDefMember4115); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructTypeDefMember"


    // $ANTLR start "ruleStructTypeDefMember"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1765:1: ruleStructTypeDefMember returns [EObject current=null] : ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1768:28: ( ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1769:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1769:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1769:2: () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1769:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1770:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefMemberAccess().getStructTypeDefMemberAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1775:2: ( (lv_type_1_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1776:1: (lv_type_1_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1776:1: (lv_type_1_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1777:3: lv_type_1_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeDefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember4170);
            lv_type_1_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructTypeDefMemberRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1793:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1794:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1794:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1795:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructTypeDefMember4187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getStructTypeDefMemberAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStructTypeDefMemberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStructTypeDefMember"


    // $ANTLR start "entryRuleConstantVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1819:1: entryRuleConstantVariable returns [EObject current=null] : iv_ruleConstantVariable= ruleConstantVariable EOF ;
    public final EObject entryRuleConstantVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1820:2: (iv_ruleConstantVariable= ruleConstantVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1821:2: iv_ruleConstantVariable= ruleConstantVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable4228);
            iv_ruleConstantVariable=ruleConstantVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantVariable4238); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantVariable"


    // $ANTLR start "ruleConstantVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1828:1: ruleConstantVariable returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleConstantVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1831:28: ( ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:2: () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1833:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantVariableAccess().getConstantVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleConstantVariable4284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantVariableAccess().getConstKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1842:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1843:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1843:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1844:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleConstantVariable4305);
            lv_type_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1860:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1861:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1861:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1862:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantVariable4322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getConstantVariableAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleConstantVariable4339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantVariableAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1882:1: ( (lv_value_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1883:1: (lv_value_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1883:1: (lv_value_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1884:3: lv_value_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleConstantVariable4360);
            lv_value_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantVariableRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantVariable"


    // $ANTLR start "entryRuleRegisterVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1908:1: entryRuleRegisterVariable returns [EObject current=null] : iv_ruleRegisterVariable= ruleRegisterVariable EOF ;
    public final EObject entryRuleRegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1909:2: (iv_ruleRegisterVariable= ruleRegisterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1910:2: iv_ruleRegisterVariable= ruleRegisterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable4396);
            iv_ruleRegisterVariable=ruleRegisterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterVariable4406); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegisterVariable"


    // $ANTLR start "ruleRegisterVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1917:1: ruleRegisterVariable returns [EObject current=null] : ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleRegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_addr_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1920:28: ( ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1921:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1921:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1921:2: () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1921:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegisterVariableAccess().getRegisterVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleRegisterVariable4452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRegisterVariableAccess().getRegKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1931:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1932:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1932:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1933:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleRegisterVariable4473);
            lv_type_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegisterVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1949:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1950:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1950:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1951:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisterVariable4490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getRegisterVariableAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisterVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleRegisterVariable4507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegisterVariableAccess().getColonKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1971:1: ( (lv_addr_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:1: (lv_addr_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:1: (lv_addr_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1973:3: lv_addr_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getAddrXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleRegisterVariable4528);
            lv_addr_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegisterVariableRule());
              	        }
                     		set(
                     			current, 
                     			"addr",
                      		lv_addr_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRegisterVariable"


    // $ANTLR start "entryRuleOperationStep"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1997:1: entryRuleOperationStep returns [EObject current=null] : iv_ruleOperationStep= ruleOperationStep EOF ;
    public final EObject entryRuleOperationStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStep = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1998:2: (iv_ruleOperationStep= ruleOperationStep EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1999:2: iv_ruleOperationStep= ruleOperationStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationStepRule()); 
            }
            pushFollow(FOLLOW_ruleOperationStep_in_entryRuleOperationStep4564);
            iv_ruleOperationStep=ruleOperationStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationStep4574); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationStep"


    // $ANTLR start "ruleOperationStep"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2006:1: ruleOperationStep returns [EObject current=null] : ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | this_XTopLevelExpression_2= ruleXTopLevelExpression ) ;
    public final EObject ruleOperationStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Variable_0 = null;

        EObject this_XTopLevelExpression_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2009:28: ( ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | this_XTopLevelExpression_2= ruleXTopLevelExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | this_XTopLevelExpression_2= ruleXTopLevelExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | this_XTopLevelExpression_2= ruleXTopLevelExpression )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2011:5: this_Variable_0= ruleVariable otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getVariableParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperationStep4622);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOperationStep4633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOperationStepAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2025:5: this_XTopLevelExpression_2= ruleXTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getXTopLevelExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep4662);
                    this_XTopLevelExpression_2=ruleXTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTopLevelExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationStep"


    // $ANTLR start "entryRuleVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2041:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2042:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2043:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4697);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2050:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2053:28: ( ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2054:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2054:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2054:2: ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2054:2: ( (lv_type_0_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2055:1: (lv_type_0_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2055:1: (lv_type_0_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2056:3: lv_type_0_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeDefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleVariable4753);
            lv_type_0_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2072:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2073:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2073:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2074:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2098:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2099:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2100:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4811);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4821); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2107:1: ruleVariableReference returns [EObject current=null] : ( (lv_var_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2110:28: ( ( (lv_var_0_0= ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2111:1: ( (lv_var_0_0= ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2111:1: ( (lv_var_0_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2112:1: (lv_var_0_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2112:1: (lv_var_0_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2113:3: lv_var_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVarQualifiedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariableReference4866);
            lv_var_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleOperationCall"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2137:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2138:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2139:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCall_in_entryRuleOperationCall4901);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCall4911); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2146:1: ruleOperationCall returns [EObject current=null] : ( ( (lv_operation_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_operation_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2149:28: ( ( ( (lv_operation_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2150:1: ( ( (lv_operation_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2150:1: ( ( (lv_operation_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2150:2: ( (lv_operation_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2150:2: ( (lv_operation_0_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2151:1: (lv_operation_0_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2151:1: (lv_operation_0_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2152:3: lv_operation_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationQualifiedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperationCall4957);
            lv_operation_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
              	        }
                     		set(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOperationCall4969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2172:1: ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_REAL)||LA25_0==20||LA25_0==35||LA25_0==45||LA25_0==51||LA25_0==53||(LA25_0>=58 && LA25_0<=61)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2172:2: ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2172:2: ( (lv_params_2_0= ruleOperationCallParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2173:1: (lv_params_2_0= ruleOperationCallParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2173:1: (lv_params_2_0= ruleOperationCallParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2174:3: lv_params_2_0= ruleOperationCallParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4991);
                    lv_params_2_0=ruleOperationCallParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"OperationCallParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2190:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==42) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2190:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleOperationCall5004); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2194:1: ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2195:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2195:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2196:3: lv_params_4_0= ruleOperationCallParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5025);
                    	    lv_params_4_0=ruleOperationCallParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"OperationCallParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleOperationCall5041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleOperationCallParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2224:1: entryRuleOperationCallParameter returns [EObject current=null] : iv_ruleOperationCallParameter= ruleOperationCallParameter EOF ;
    public final EObject entryRuleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2225:2: (iv_ruleOperationCallParameter= ruleOperationCallParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2226:2: iv_ruleOperationCallParameter= ruleOperationCallParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter5077);
            iv_ruleOperationCallParameter=ruleOperationCallParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallParameter5087); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationCallParameter"


    // $ANTLR start "ruleOperationCallParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2233:1: ruleOperationCallParameter returns [EObject current=null] : this_XExpression_0= ruleXExpression ;
    public final EObject ruleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2236:28: (this_XExpression_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2238:5: this_XExpression_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationCallParameterAccess().getXExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleOperationCallParameter5133);
            this_XExpression_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationCallParameter"


    // $ANTLR start "entryRuleOperationTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2254:1: entryRuleOperationTypeDef returns [EObject current=null] : iv_ruleOperationTypeDef= ruleOperationTypeDef EOF ;
    public final EObject entryRuleOperationTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2255:2: (iv_ruleOperationTypeDef= ruleOperationTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2256:2: iv_ruleOperationTypeDef= ruleOperationTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleOperationTypeDef_in_entryRuleOperationTypeDef5167);
            iv_ruleOperationTypeDef=ruleOperationTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationTypeDef5177); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationTypeDef"


    // $ANTLR start "ruleOperationTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2263:1: ruleOperationTypeDef returns [EObject current=null] : ( ( (lv_resultType_0_0= ruleTypeDef ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_resultType_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2266:28: ( ( ( (lv_resultType_0_0= ruleTypeDef ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2267:1: ( ( (lv_resultType_0_0= ruleTypeDef ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2267:1: ( ( (lv_resultType_0_0= ruleTypeDef ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2267:2: ( (lv_resultType_0_0= ruleTypeDef ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2267:2: ( (lv_resultType_0_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2268:1: (lv_resultType_0_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2268:1: (lv_resultType_0_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2269:3: lv_resultType_0_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationTypeDefAccess().getResultTypeTypeDefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleOperationTypeDef5223);
            lv_resultType_0_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"resultType",
                      		lv_resultType_0_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOperationTypeDef5235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationTypeDefAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2289:1: ( ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=32 && LA27_0<=34)||(LA27_0>=37 && LA27_0<=38)||LA27_0==41||LA27_0==43||LA27_0==49||(LA27_0>=54 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2289:2: ( (lv_params_2_0= ruleOperationParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2289:2: ( (lv_params_2_0= ruleOperationParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2290:1: (lv_params_2_0= ruleOperationParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2290:1: (lv_params_2_0= ruleOperationParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2291:3: lv_params_2_0= ruleOperationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationTypeDefAccess().getParamsOperationParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationParameter_in_ruleOperationTypeDef5257);
                    lv_params_2_0=ruleOperationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"OperationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2307:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==42) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2307:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleOperationTypeDef5270); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationTypeDefAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2311:1: ( (lv_params_4_0= ruleOperationParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2312:1: (lv_params_4_0= ruleOperationParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2312:1: (lv_params_4_0= ruleOperationParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2313:3: lv_params_4_0= ruleOperationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationTypeDefAccess().getParamsOperationParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationParameter_in_ruleOperationTypeDef5291);
                    	    lv_params_4_0=ruleOperationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"OperationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleOperationTypeDef5307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOperationTypeDefAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationTypeDef"


    // $ANTLR start "entryRuleOperation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2341:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2342:2: (iv_ruleOperation= ruleOperation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2343:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation5343);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation5353); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2350:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )? ( (lv_content_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_overrides_4_0 = null;

        EObject lv_content_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2353:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )? ( (lv_content_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )? ( (lv_content_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )? ( (lv_content_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )? ( (lv_content_5_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleOperation5390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getFunctionKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2358:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2359:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2359:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2360:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation5407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2376:2: ( (lv_type_2_0= ruleOperationTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2377:1: (lv_type_2_0= ruleOperationTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2377:1: (lv_type_2_0= ruleOperationTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2378:3: lv_type_2_0= ruleOperationTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getTypeOperationTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationTypeDef_in_ruleOperation5433);
            lv_type_2_0=ruleOperationTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"OperationTypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2394:2: (otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2394:4: otherlv_3= 'overrides' ( (lv_overrides_4_0= ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleOperation5446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getOverridesKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2398:1: ( (lv_overrides_4_0= ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2399:1: (lv_overrides_4_0= ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2399:1: (lv_overrides_4_0= ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2400:3: lv_overrides_4_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getOverridesQualifiedNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperation5467);
                    lv_overrides_4_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"overrides",
                              		lv_overrides_4_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2416:4: ( (lv_content_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2417:1: (lv_content_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2417:1: (lv_content_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2418:3: lv_content_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getContentXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleOperation5490);
            lv_content_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"content",
                      		lv_content_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2442:1: entryRuleOperationParameter returns [EObject current=null] : iv_ruleOperationParameter= ruleOperationParameter EOF ;
    public final EObject entryRuleOperationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2443:2: (iv_ruleOperationParameter= ruleOperationParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2444:2: iv_ruleOperationParameter= ruleOperationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationParameter_in_entryRuleOperationParameter5526);
            iv_ruleOperationParameter=ruleOperationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationParameter5536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationParameter"


    // $ANTLR start "ruleOperationParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2451:1: ruleOperationParameter returns [EObject current=null] : (this_ParameterVariable_0= ruleParameterVariable | this_LazyParameter_1= ruleLazyParameter ) ;
    public final EObject ruleOperationParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterVariable_0 = null;

        EObject this_LazyParameter_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2454:28: ( (this_ParameterVariable_0= ruleParameterVariable | this_LazyParameter_1= ruleLazyParameter ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2455:1: (this_ParameterVariable_0= ruleParameterVariable | this_LazyParameter_1= ruleLazyParameter )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2455:1: (this_ParameterVariable_0= ruleParameterVariable | this_LazyParameter_1= ruleLazyParameter )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=32 && LA29_0<=34)||(LA29_0>=37 && LA29_0<=38)||LA29_0==41||LA29_0==43||(LA29_0>=54 && LA29_0<=57)) ) {
                alt29=1;
            }
            else if ( (LA29_0==49) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2456:5: this_ParameterVariable_0= ruleParameterVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationParameterAccess().getParameterVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperationParameter5583);
                    this_ParameterVariable_0=ruleParameterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterVariable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2466:5: this_LazyParameter_1= ruleLazyParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationParameterAccess().getLazyParameterParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLazyParameter_in_ruleOperationParameter5610);
                    this_LazyParameter_1=ruleLazyParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LazyParameter_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationParameter"


    // $ANTLR start "entryRuleLazyParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2482:1: entryRuleLazyParameter returns [EObject current=null] : iv_ruleLazyParameter= ruleLazyParameter EOF ;
    public final EObject entryRuleLazyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLazyParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2483:2: (iv_ruleLazyParameter= ruleLazyParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2484:2: iv_ruleLazyParameter= ruleLazyParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLazyParameterRule()); 
            }
            pushFollow(FOLLOW_ruleLazyParameter_in_entryRuleLazyParameter5645);
            iv_ruleLazyParameter=ruleLazyParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLazyParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLazyParameter5655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLazyParameter"


    // $ANTLR start "ruleLazyParameter"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2491:1: ruleLazyParameter returns [EObject current=null] : (otherlv_0= 'lazy' ( (lv_paramname_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) ) ;
    public final EObject ruleLazyParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_paramname_1_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2494:28: ( (otherlv_0= 'lazy' ( (lv_paramname_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2495:1: (otherlv_0= 'lazy' ( (lv_paramname_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2495:1: (otherlv_0= 'lazy' ( (lv_paramname_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2495:3: otherlv_0= 'lazy' ( (lv_paramname_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleOperationTypeDef ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleLazyParameter5692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLazyParameterAccess().getLazyKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2499:1: ( (lv_paramname_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2500:1: (lv_paramname_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2500:1: (lv_paramname_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2501:3: lv_paramname_1_0= RULE_ID
            {
            lv_paramname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLazyParameter5709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_paramname_1_0, grammarAccess.getLazyParameterAccess().getParamnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLazyParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"paramname",
                      		lv_paramname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2517:2: ( (lv_type_2_0= ruleOperationTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2518:1: (lv_type_2_0= ruleOperationTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2518:1: (lv_type_2_0= ruleOperationTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2519:3: lv_type_2_0= ruleOperationTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLazyParameterAccess().getTypeOperationTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationTypeDef_in_ruleLazyParameter5735);
            lv_type_2_0=ruleOperationTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLazyParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"OperationTypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLazyParameter"


    // $ANTLR start "entryRuleParameterVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2543:1: entryRuleParameterVariable returns [EObject current=null] : iv_ruleParameterVariable= ruleParameterVariable EOF ;
    public final EObject entryRuleParameterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2544:2: (iv_ruleParameterVariable= ruleParameterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2545:2: iv_ruleParameterVariable= ruleParameterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5771);
            iv_ruleParameterVariable=ruleParameterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterVariable5781); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterVariable"


    // $ANTLR start "ruleParameterVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2552:1: ruleParameterVariable returns [EObject current=null] : ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleParameterVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2555:28: ( ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2556:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2556:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2556:2: () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2556:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterVariableAccess().getParameterVariableAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2562:2: ( (lv_kind_1_0= ruleParameterKind ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43||(LA30_0>=56 && LA30_0<=57)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2563:1: (lv_kind_1_0= ruleParameterKind )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2563:1: (lv_kind_1_0= ruleParameterKind )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2564:3: lv_kind_1_0= ruleParameterKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getKindParameterKindEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterKind_in_ruleParameterVariable5836);
                    lv_kind_1_0=ruleParameterKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"ParameterKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2580:3: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2581:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2581:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2582:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleParameterVariable5858);
            lv_type_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2598:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2599:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2599:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2600:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterVariable5875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getParameterVariableAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2616:2: (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2616:4: otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleParameterVariable5893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterVariableAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2620:1: ( (lv_default_5_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2621:1: (lv_default_5_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2621:1: (lv_default_5_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2622:3: lv_default_5_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getDefaultLITERALParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleParameterVariable5914);
                    lv_default_5_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_5_0, 
                              		"LITERAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterVariable"


    // $ANTLR start "entryRuleXExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2646:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2647:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2648:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression5952);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression5962); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2655:1: ruleXExpression returns [EObject current=null] : (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? ) ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_XExpression6_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2658:28: ( (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2659:1: (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2659:1: (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2660:5: this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXExpression6ParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression6_in_ruleXExpression6009);
            this_XExpression6_0=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression6_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2668:1: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2668:3: otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleXExpression6021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXExpressionAccess().getColonKeyword_1_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2672:1: ( (lv_type_2_0= ruleTypeDef ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2673:1: (lv_type_2_0= ruleTypeDef )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2673:1: (lv_type_2_0= ruleTypeDef )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2674:3: lv_type_2_0= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXExpressionAccess().getTypeTypeDefParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleXExpression6042);
                    lv_type_2_0=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"TypeDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXExpressionBlock"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2698:1: entryRuleXExpressionBlock returns [EObject current=null] : iv_ruleXExpressionBlock= ruleXExpressionBlock EOF ;
    public final EObject entryRuleXExpressionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionBlock = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2699:2: (iv_ruleXExpressionBlock= ruleXExpressionBlock EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2700:2: iv_ruleXExpressionBlock= ruleXExpressionBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionBlock_in_entryRuleXExpressionBlock6080);
            iv_ruleXExpressionBlock=ruleXExpressionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionBlock6090); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionBlock"


    // $ANTLR start "ruleXExpressionBlock"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2707:1: ruleXExpressionBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_steps_2_0= ruleOperationStep ) )* (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleXExpressionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_steps_2_0 = null;

        EObject lv_result_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2710:28: ( (otherlv_0= '{' () ( (lv_steps_2_0= ruleOperationStep ) )* (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )? otherlv_5= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:1: (otherlv_0= '{' () ( (lv_steps_2_0= ruleOperationStep ) )* (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )? otherlv_5= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:1: (otherlv_0= '{' () ( (lv_steps_2_0= ruleOperationStep ) )* (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )? otherlv_5= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:3: otherlv_0= '{' () ( (lv_steps_2_0= ruleOperationStep ) )* (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleXExpressionBlock6127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXExpressionBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2715:1: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2716:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionBlockAccess().getOperationBlockAction_1(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2721:2: ( (lv_steps_2_0= ruleOperationStep ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_REAL)||LA33_0==17||LA33_0==20||(LA33_0>=32 && LA33_0<=35)||(LA33_0>=37 && LA33_0<=38)||LA33_0==41||LA33_0==45||LA33_0==51||(LA33_0>=53 && LA33_0<=55)||(LA33_0>=58 && LA33_0<=61)||(LA33_0>=72 && LA33_0<=74)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2722:1: (lv_steps_2_0= ruleOperationStep )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2722:1: (lv_steps_2_0= ruleOperationStep )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2723:3: lv_steps_2_0= ruleOperationStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionBlockAccess().getStepsOperationStepParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationStep_in_ruleXExpressionBlock6157);
            	    lv_steps_2_0=ruleOperationStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"steps",
            	              		lv_steps_2_0, 
            	              		"OperationStep");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2739:3: (otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2739:5: otherlv_3= 'return' ( (lv_result_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXExpressionBlock6171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXExpressionBlockAccess().getReturnKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2743:1: ( (lv_result_4_0= ruleXExpression ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2744:1: (lv_result_4_0= ruleXExpression )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2744:1: (lv_result_4_0= ruleXExpression )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2745:3: lv_result_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXExpressionBlockAccess().getResultXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionBlock6192);
                    lv_result_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXExpressionBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"result",
                              		lv_result_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleXExpressionBlock6206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXExpressionBlockAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionBlock"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2773:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2774:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2775:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6242);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6252); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2782:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression | this_XExpressionBlock_7= ruleXExpressionBlock ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpressionLiteral_0 = null;

        EObject this_XParenthesizedExpression_1 = null;

        EObject this_XIsLiteralExpression_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_OperationCall_4 = null;

        EObject this_XStructExpression_5 = null;

        EObject this_XSizeOfExpression_6 = null;

        EObject this_XExpressionBlock_7 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2785:28: ( (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression | this_XExpressionBlock_7= ruleXExpressionBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2786:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression | this_XExpressionBlock_7= ruleXExpressionBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2786:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression | this_XExpressionBlock_7= ruleXExpressionBlock )
            int alt35=8;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2787:5: this_XExpressionLiteral_0= ruleXExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression6299);
                    this_XExpressionLiteral_0=ruleXExpressionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpressionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2797:5: this_XParenthesizedExpression_1= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6326);
                    this_XParenthesizedExpression_1=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:5: this_XIsLiteralExpression_2= ruleXIsLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIsLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression6353);
                    this_XIsLiteralExpression_2=ruleXIsLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIsLiteralExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2817:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression6380);
                    this_VariableReference_3=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2827:5: this_OperationCall_4= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getOperationCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression6407);
                    this_OperationCall_4=ruleOperationCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2837:5: this_XStructExpression_5= ruleXStructExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXStructExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6434);
                    this_XStructExpression_5=ruleXStructExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStructExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2847:5: this_XSizeOfExpression_6= ruleXSizeOfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSizeOfExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6461);
                    this_XSizeOfExpression_6=ruleXSizeOfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSizeOfExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2857:5: this_XExpressionBlock_7= ruleXExpressionBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionBlockParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionBlock_in_ruleXPrimaryExpression6488);
                    this_XExpressionBlock_7=ruleXExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpressionBlock_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXSizeOfExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2873:1: entryRuleXSizeOfExpression returns [EObject current=null] : iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF ;
    public final EObject entryRuleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSizeOfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2874:2: (iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2875:2: iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSizeOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6523);
            iv_ruleXSizeOfExpression=ruleXSizeOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSizeOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSizeOfExpression6533); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSizeOfExpression"


    // $ANTLR start "ruleXSizeOfExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2882:1: ruleXSizeOfExpression returns [EObject current=null] : (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) ;
    public final EObject ruleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2885:28: ( (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:3: otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleXSizeOfExpression6570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXSizeOfExpressionAccess().getSizeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXSizeOfExpression6582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSizeOfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2894:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2895:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2895:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2896:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression6603);
            lv_type_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSizeOfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXSizeOfExpression6615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXSizeOfExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSizeOfExpression"


    // $ANTLR start "entryRuleXStructExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2924:1: entryRuleXStructExpression returns [EObject current=null] : iv_ruleXStructExpression= ruleXStructExpression EOF ;
    public final EObject entryRuleXStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStructExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2925:2: (iv_ruleXStructExpression= ruleXStructExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2926:2: iv_ruleXStructExpression= ruleXStructExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStructExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6651);
            iv_ruleXStructExpression=ruleXStructExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStructExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStructExpression6661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStructExpression"


    // $ANTLR start "ruleXStructExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2933:1: ruleXStructExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleXExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
    public final EObject ruleXStructExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2936:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleXExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2937:1: (otherlv_0= '[' ( (lv_values_1_0= ruleXExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2937:1: (otherlv_0= '[' ( (lv_values_1_0= ruleXExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2937:3: otherlv_0= '[' ( (lv_values_1_0= ruleXExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleXStructExpression6698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXStructExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2941:1: ( (lv_values_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2942:1: (lv_values_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2942:1: (lv_values_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2943:3: lv_values_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression6719);
            lv_values_1_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXStructExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2959:2: (otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==42) ) {
                    int LA36_1 = input.LA(2);

                    if ( ((LA36_1>=RULE_ID && LA36_1<=RULE_REAL)||LA36_1==20||LA36_1==35||LA36_1==45||LA36_1==51||LA36_1==53||(LA36_1>=58 && LA36_1<=61)) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2959:4: otherlv_2= ',' ( (lv_values_3_0= ruleXExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXStructExpression6732); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXStructExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2963:1: ( (lv_values_3_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2964:1: (lv_values_3_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2964:1: (lv_values_3_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2965:3: lv_values_3_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression6753);
            	    lv_values_3_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXStructExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2981:4: (otherlv_4= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2981:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXStructExpression6768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXStructExpressionAccess().getCommaKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXStructExpression6782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXStructExpressionAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStructExpression"


    // $ANTLR start "entryRuleXExpression1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2997:1: entryRuleXExpression1 returns [EObject current=null] : iv_ruleXExpression1= ruleXExpression1 EOF ;
    public final EObject entryRuleXExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2998:2: (iv_ruleXExpression1= ruleXExpression1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2999:2: iv_ruleXExpression1= ruleXExpression1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression1_in_entryRuleXExpression16818);
            iv_ruleXExpression1=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression16828); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression1"


    // $ANTLR start "ruleXExpression1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3006:1: ruleXExpression1 returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) ;
    public final EObject ruleXExpression1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3009:28: ( ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3010:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3010:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3010:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3010:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=58 && LA38_0<=61)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3011:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3011:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3012:3: lv_operator_0_0= ruleUNARY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression1Access().getOperatorUNARY_OPERATOREnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression16874);
            	    lv_operator_0_0=ruleUNARY_OPERATOR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression1Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operator",
            	              		lv_operator_0_0, 
            	              		"UNARY_OPERATOR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3028:3: ( (lv_a_1_0= ruleXExpression0 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3029:1: (lv_a_1_0= ruleXExpression0 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3029:1: (lv_a_1_0= ruleXExpression0 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3030:3: lv_a_1_0= ruleXExpression0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression1Access().getAXExpression0ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression0_in_ruleXExpression16896);
            lv_a_1_0=ruleXExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression1Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_1_0, 
                      		"XExpression0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression1"


    // $ANTLR start "entryRuleXExpression0"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3054:1: entryRuleXExpression0 returns [EObject current=null] : iv_ruleXExpression0= ruleXExpression0 EOF ;
    public final EObject entryRuleXExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression0 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3055:2: (iv_ruleXExpression0= ruleXExpression0 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3056:2: iv_ruleXExpression0= ruleXExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression0Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression0_in_entryRuleXExpression06932);
            iv_ruleXExpression0=ruleXExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression0; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression06942); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression0"


    // $ANTLR start "ruleXExpression0"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3063:1: ruleXExpression0 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleXExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_member_2_0=null;
        EObject lv_a_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3066:28: ( ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:2: ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:2: ( (lv_a_0_0= ruleXExpressionM1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:1: (lv_a_0_0= ruleXExpressionM1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:1: (lv_a_0_0= ruleXExpressionM1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3069:3: lv_a_0_0= ruleXExpressionM1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression0Access().getAXExpressionM1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_ruleXExpression06988);
            lv_a_0_0=ruleXExpressionM1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression0Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XExpressionM1");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3085:2: (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3085:4: otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXExpression07001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpression0Access().getHyphenMinusGreaterThanSignKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3089:1: ( (lv_member_2_0= RULE_ID ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3090:1: (lv_member_2_0= RULE_ID )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3090:1: (lv_member_2_0= RULE_ID )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3091:3: lv_member_2_0= RULE_ID
            	    {
            	    lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXExpression07018); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_member_2_0, grammarAccess.getXExpression0Access().getMemberIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXExpression0Rule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"member",
            	              		lv_member_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression0"


    // $ANTLR start "entryRuleXExpressionM1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3115:1: entryRuleXExpressionM1 returns [EObject current=null] : iv_ruleXExpressionM1= ruleXExpressionM1 EOF ;
    public final EObject entryRuleXExpressionM1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionM1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3116:2: (iv_ruleXExpressionM1= ruleXExpressionM1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3117:2: iv_ruleXExpressionM1= ruleXExpressionM1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionM1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM17061);
            iv_ruleXExpressionM1=ruleXExpressionM1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionM1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionM17071); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionM1"


    // $ANTLR start "ruleXExpressionM1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3124:1: ruleXExpressionM1 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleXExpressionM1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_index_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3127:28: ( ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3128:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3128:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3128:2: ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3128:2: ( (lv_a_0_0= ruleXPrimaryExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3129:1: (lv_a_0_0= ruleXPrimaryExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3129:1: (lv_a_0_0= ruleXPrimaryExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3130:3: lv_a_0_0= ruleXPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionM1Access().getAXPrimaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM17117);
            lv_a_0_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpressionM1Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XPrimaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3146:2: (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==35) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3146:4: otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleXExpressionM17130); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpressionM1Access().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3150:1: ( (lv_index_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3151:1: (lv_index_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3151:1: (lv_index_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3152:3: lv_index_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionM1Access().getIndexXExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionM17151);
            	    lv_index_2_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionM1Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"index",
            	              		lv_index_2_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXExpressionM17163); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXExpressionM1Access().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionM1"


    // $ANTLR start "entryRuleXExpression2"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3180:1: entryRuleXExpression2 returns [EObject current=null] : iv_ruleXExpression2= ruleXExpression2 EOF ;
    public final EObject entryRuleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression2 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3181:2: (iv_ruleXExpression2= ruleXExpression2 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3182:2: iv_ruleXExpression2= ruleXExpression2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression2Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression2_in_entryRuleXExpression27201);
            iv_ruleXExpression2=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression27211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression2"


    // $ANTLR start "ruleXExpression2"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3189:1: ruleXExpression2 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3192:28: ( ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3193:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3193:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3193:2: ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3193:2: ( (lv_a_0_0= ruleXExpression1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3194:1: (lv_a_0_0= ruleXExpression1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3194:1: (lv_a_0_0= ruleXExpression1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3195:3: lv_a_0_0= ruleXExpression1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression2Access().getAXExpression1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression1_in_ruleXExpression27257);
            lv_a_0_0=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression2Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XExpression1");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:2: ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt41=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt41=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA41_4 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt41=1;
                    }


                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3216:1: (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3217:3: lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getOpMULTIPLICATIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression27289);
            	    lv_op_1_0=ruleMULTIPLICATIVE_OPERATOR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"op",
            	              		lv_op_1_0, 
            	              		"MULTIPLICATIVE_OPERATOR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3233:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3234:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3234:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3235:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression27310);
            	    lv_b_2_0=ruleXExpression2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"XExpression2");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression2"


    // $ANTLR start "entryRuleXExpression3"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3259:1: entryRuleXExpression3 returns [EObject current=null] : iv_ruleXExpression3= ruleXExpression3 EOF ;
    public final EObject entryRuleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression3 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3260:2: (iv_ruleXExpression3= ruleXExpression3 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3261:2: iv_ruleXExpression3= ruleXExpression3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression3Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression3_in_entryRuleXExpression37348);
            iv_ruleXExpression3=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression37358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression3"


    // $ANTLR start "ruleXExpression3"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3268:1: ruleXExpression3 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3271:28: ( ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:2: ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:2: ( (lv_a_0_0= ruleXExpression2 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:1: (lv_a_0_0= ruleXExpression2 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:1: (lv_a_0_0= ruleXExpression2 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3274:3: lv_a_0_0= ruleXExpression2
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression3Access().getAXExpression2ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression37404);
            lv_a_0_0=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression3Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XExpression2");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3290:2: ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==65) && (synpred2_InternalESyntax())) {
                    alt42=1;
                }
                else if ( (LA42_0==58) && (synpred2_InternalESyntax())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3290:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3290:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3290:4: ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3295:1: (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3296:3: lv_op_1_0= ruleADDITIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getOpADDITIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression37436);
            	    lv_op_1_0=ruleADDITIVE_OPERATOR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression3Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"op",
            	              		lv_op_1_0, 
            	              		"ADDITIVE_OPERATOR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3312:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3313:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3313:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3314:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression37457);
            	    lv_b_2_0=ruleXExpression2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression3Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"XExpression2");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression3"


    // $ANTLR start "entryRuleXExpression4"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:1: entryRuleXExpression4 returns [EObject current=null] : iv_ruleXExpression4= ruleXExpression4 EOF ;
    public final EObject entryRuleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression4 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3339:2: (iv_ruleXExpression4= ruleXExpression4 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3340:2: iv_ruleXExpression4= ruleXExpression4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression4Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression4_in_entryRuleXExpression47495);
            iv_ruleXExpression4=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression47505); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression4"


    // $ANTLR start "ruleXExpression4"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3347:1: ruleXExpression4 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) ;
    public final EObject ruleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3350:28: ( ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3351:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3351:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3351:2: ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3351:2: ( (lv_a_0_0= ruleXExpression3 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3352:1: (lv_a_0_0= ruleXExpression3 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3352:1: (lv_a_0_0= ruleXExpression3 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3353:3: lv_a_0_0= ruleXExpression3
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression4Access().getAXExpression3ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression47551);
            lv_a_0_0=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression4Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XExpression3");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:2: ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==66) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==67) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==68) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==69) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==26) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==25) && (synpred3_InternalESyntax())) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:4: ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3374:1: (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3375:3: lv_op_1_0= ruleEQUALITY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getOpEQUALITY_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression47583);
            	    lv_op_1_0=ruleEQUALITY_OPERATOR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression4Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"op",
            	              		lv_op_1_0, 
            	              		"EQUALITY_OPERATOR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3391:2: ( (lv_b_2_0= ruleXExpression3 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3392:1: (lv_b_2_0= ruleXExpression3 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3392:1: (lv_b_2_0= ruleXExpression3 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3393:3: lv_b_2_0= ruleXExpression3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getBXExpression3ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression47604);
            	    lv_b_2_0=ruleXExpression3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression4Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"XExpression3");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression4"


    // $ANTLR start "entryRuleXExpression5"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3417:1: entryRuleXExpression5 returns [EObject current=null] : iv_ruleXExpression5= ruleXExpression5 EOF ;
    public final EObject entryRuleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression5 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3418:2: (iv_ruleXExpression5= ruleXExpression5 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3419:2: iv_ruleXExpression5= ruleXExpression5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression5Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression5_in_entryRuleXExpression57642);
            iv_ruleXExpression5=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression57652); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression5"


    // $ANTLR start "ruleXExpression5"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3426:1: ruleXExpression5 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) ;
    public final EObject ruleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3429:28: ( ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3430:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3430:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3430:2: ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3430:2: ( (lv_a_0_0= ruleXExpression4 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3431:1: (lv_a_0_0= ruleXExpression4 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3431:1: (lv_a_0_0= ruleXExpression4 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3432:3: lv_a_0_0= ruleXExpression4
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression5Access().getAXExpression4ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression57698);
            lv_a_0_0=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression5Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"XExpression4");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:2: ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==70) && (synpred4_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==71) && (synpred4_InternalESyntax())) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:4: ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3453:1: (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3454:3: lv_op_1_0= ruleBOOLEAN_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getOpBOOLEAN_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression57730);
            	    lv_op_1_0=ruleBOOLEAN_OPERATOR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression5Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"op",
            	              		lv_op_1_0, 
            	              		"BOOLEAN_OPERATOR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3470:2: ( (lv_b_2_0= ruleXExpression4 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3471:1: (lv_b_2_0= ruleXExpression4 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3471:1: (lv_b_2_0= ruleXExpression4 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3472:3: lv_b_2_0= ruleXExpression4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getBXExpression4ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression57751);
            	    lv_b_2_0=ruleXExpression4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression5Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"XExpression4");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression5"


    // $ANTLR start "entryRuleXExpression6"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:1: entryRuleXExpression6 returns [EObject current=null] : iv_ruleXExpression6= ruleXExpression6 EOF ;
    public final EObject entryRuleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression6 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3497:2: (iv_ruleXExpression6= ruleXExpression6 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3498:2: iv_ruleXExpression6= ruleXExpression6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression6Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression6_in_entryRuleXExpression67789);
            iv_ruleXExpression6=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression6; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression67799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression6"


    // $ANTLR start "ruleXExpression6"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3505:1: ruleXExpression6 returns [EObject current=null] : ( ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )? ( (lv_a_2_0= ruleXExpression5 ) ) ) ;
    public final EObject ruleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3508:28: ( ( ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )? ( (lv_a_2_0= ruleXExpression5 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:1: ( ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )? ( (lv_a_2_0= ruleXExpression5 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:1: ( ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )? ( (lv_a_2_0= ruleXExpression5 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:2: ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )? ( (lv_a_2_0= ruleXExpression5 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:2: ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:3: ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3509:3: ( (lv_ref_0_0= ruleVariableReference ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3510:1: (lv_ref_0_0= ruleVariableReference )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3510:1: (lv_ref_0_0= ruleVariableReference )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3511:3: lv_ref_0_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXExpression6Access().getRefVariableReferenceParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXExpression67846);
                    lv_ref_0_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXExpression6Rule());
                      	        }
                             		set(
                             			current, 
                             			"ref",
                              		lv_ref_0_0, 
                              		"VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3527:2: ( (lv_op_1_0= ruleOpSingleAssign ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3528:1: (lv_op_1_0= ruleOpSingleAssign )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3528:1: (lv_op_1_0= ruleOpSingleAssign )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3529:3: lv_op_1_0= ruleOpSingleAssign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXExpression6Access().getOpOpSingleAssignEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXExpression67867);
                    lv_op_1_0=ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXExpression6Rule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"OpSingleAssign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:4: ( (lv_a_2_0= ruleXExpression5 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3546:1: (lv_a_2_0= ruleXExpression5 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3546:1: (lv_a_2_0= ruleXExpression5 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3547:3: lv_a_2_0= ruleXExpression5
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression6Access().getAXExpression5ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression5_in_ruleXExpression67890);
            lv_a_2_0=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpression6Rule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_2_0, 
                      		"XExpression5");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression6"


    // $ANTLR start "entryRuleXExpressionLiteral"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3571:1: entryRuleXExpressionLiteral returns [EObject current=null] : iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF ;
    public final EObject entryRuleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionLiteral = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3572:2: (iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3573:2: iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral7926);
            iv_ruleXExpressionLiteral=ruleXExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionLiteral7936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionLiteral"


    // $ANTLR start "ruleXExpressionLiteral"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3580:1: ruleXExpressionLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3583:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3584:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3584:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3585:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3585:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3586:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral7981);
            lv_value_0_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXExpressionLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionLiteral"


    // $ANTLR start "entryRuleXTopLevelExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3610:1: entryRuleXTopLevelExpression returns [EObject current=null] : iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF ;
    public final EObject entryRuleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTopLevelExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3611:2: (iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3612:2: iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression8016);
            iv_ruleXTopLevelExpression=ruleXTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTopLevelExpression8026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTopLevelExpression"


    // $ANTLR start "ruleXTopLevelExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:1: ruleXTopLevelExpression returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' ) ) ;
    public final EObject ruleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Annotation_0 = null;

        EObject this_XExpression_2 = null;

        EObject this_XErrorExpression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3622:28: ( ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3623:1: ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3623:1: ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_HEXINT:
            case RULE_BINARY:
            case RULE_REAL:
            case 20:
            case 35:
            case 45:
            case 51:
            case 53:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt46=2;
                }
                break;
            case 72:
            case 73:
            case 74:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3623:2: (this_Annotation_0= ruleAnnotation otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3623:2: (this_Annotation_0= ruleAnnotation otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3624:5: this_Annotation_0= ruleAnnotation otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getAnnotationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleXTopLevelExpression8074);
                    this_Annotation_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXTopLevelExpression8085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3637:6: (this_XExpression_2= ruleXExpression otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3637:6: (this_XExpression_2= ruleXExpression otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:5: this_XExpression_2= ruleXExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTopLevelExpression8115);
                    this_XExpression_2=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXTopLevelExpression8126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3651:6: (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3651:6: (this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3652:5: this_XErrorExpression_4= ruleXErrorExpression otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXErrorExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXErrorExpression_in_ruleXTopLevelExpression8156);
                    this_XErrorExpression_4=ruleXErrorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XErrorExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXTopLevelExpression8167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTopLevelExpression"


    // $ANTLR start "entryRuleXErrorExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3672:1: entryRuleXErrorExpression returns [EObject current=null] : iv_ruleXErrorExpression= ruleXErrorExpression EOF ;
    public final EObject entryRuleXErrorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXErrorExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3673:2: (iv_ruleXErrorExpression= ruleXErrorExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3674:2: iv_ruleXErrorExpression= ruleXErrorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXErrorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXErrorExpression_in_entryRuleXErrorExpression8204);
            iv_ruleXErrorExpression=ruleXErrorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXErrorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXErrorExpression8214); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXErrorExpression"


    // $ANTLR start "ruleXErrorExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3681:1: ruleXErrorExpression returns [EObject current=null] : ( ( (lv_level_0_0= ruleErrorLevels ) ) ( (lv_msg_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleXErrorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_msg_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_level_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3684:28: ( ( ( (lv_level_0_0= ruleErrorLevels ) ) ( (lv_msg_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:1: ( ( (lv_level_0_0= ruleErrorLevels ) ) ( (lv_msg_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:1: ( ( (lv_level_0_0= ruleErrorLevels ) ) ( (lv_msg_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:2: ( (lv_level_0_0= ruleErrorLevels ) ) ( (lv_msg_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:2: ( (lv_level_0_0= ruleErrorLevels ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3686:1: (lv_level_0_0= ruleErrorLevels )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3686:1: (lv_level_0_0= ruleErrorLevels )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3687:3: lv_level_0_0= ruleErrorLevels
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXErrorExpressionAccess().getLevelErrorLevelsEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleErrorLevels_in_ruleXErrorExpression8260);
            lv_level_0_0=ruleErrorLevels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXErrorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"level",
                      		lv_level_0_0, 
                      		"ErrorLevels");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3703:2: ( (lv_msg_1_0= RULE_STRING ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3704:1: (lv_msg_1_0= RULE_STRING )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3704:1: (lv_msg_1_0= RULE_STRING )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3705:3: lv_msg_1_0= RULE_STRING
            {
            lv_msg_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXErrorExpression8277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_msg_1_0, grammarAccess.getXErrorExpressionAccess().getMsgSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXErrorExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"msg",
                      		lv_msg_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXErrorExpression8294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXErrorExpressionAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXErrorExpression"


    // $ANTLR start "entryRuleXIsLiteralExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3733:1: entryRuleXIsLiteralExpression returns [EObject current=null] : iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF ;
    public final EObject entryRuleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIsLiteralExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3734:2: (iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3735:2: iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIsLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression8330);
            iv_ruleXIsLiteralExpression=ruleXIsLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIsLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIsLiteralExpression8340); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIsLiteralExpression"


    // $ANTLR start "ruleXIsLiteralExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3742:1: ruleXIsLiteralExpression returns [EObject current=null] : (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3745:28: ( (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3746:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3746:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3746:3: otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleXIsLiteralExpression8377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIsLiteralExpressionAccess().getIsliteralKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIsLiteralExpression8389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIsLiteralExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3754:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3755:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3755:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3756:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression8410);
            lv_ref_2_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIsLiteralExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"ref",
                      		lv_ref_2_0, 
                      		"VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXIsLiteralExpression8422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXIsLiteralExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIsLiteralExpression"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3784:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3786:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8458);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression8468); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3793:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:28: ( (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:3: otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression8505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3801:1: ( (lv_a_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3802:1: (lv_a_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3802:1: (lv_a_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3803:3: lv_a_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8526);
            lv_a_1_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXParenthesizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_1_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression8538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "ruleIntegerKind"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3831:1: ruleIntegerKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) ) ;
    public final Enumerator ruleIntegerKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3833:28: ( ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            else if ( (LA47_0==55) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:2: (enumLiteral_0= 'unsigned' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:2: (enumLiteral_0= 'unsigned' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:4: enumLiteral_0= 'unsigned'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleIntegerKind8588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIntegerKindAccess().getUNSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIntegerKindAccess().getUNSIGNEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3840:6: (enumLiteral_1= 'signed' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3840:6: (enumLiteral_1= 'signed' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3840:8: enumLiteral_1= 'signed'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleIntegerKind8605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIntegerKindAccess().getSIGNEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIntegerKindAccess().getSIGNEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerKind"


    // $ANTLR start "ruleParameterKind"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3850:1: ruleParameterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) ;
    public final Enumerator ruleParameterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3852:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt48=1;
                }
                break;
            case 57:
                {
                alt48=2;
                }
                break;
            case 43:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleParameterKind8650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3859:6: (enumLiteral_1= 'var' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3859:6: (enumLiteral_1= 'var' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3859:8: enumLiteral_1= 'var'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleParameterKind8667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3865:6: (enumLiteral_2= 'const' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3865:6: (enumLiteral_2= 'const' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3865:8: enumLiteral_2= 'const'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleParameterKind8684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getCONSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getParameterKindAccess().getCONSTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterKind"


    // $ANTLR start "ruleUNARY_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:1: ruleUNARY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) ;
    public final Enumerator ruleUNARY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3877:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case 60:
                {
                alt49=3;
                }
                break;
            case 61:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:2: (enumLiteral_0= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:2: (enumLiteral_0= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleUNARY_OPERATOR8729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3884:6: (enumLiteral_1= '!' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3884:6: (enumLiteral_1= '!' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3884:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleUNARY_OPERATOR8746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3890:6: (enumLiteral_2= '&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3890:6: (enumLiteral_2= '&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3890:8: enumLiteral_2= '&'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleUNARY_OPERATOR8763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3896:6: (enumLiteral_3= '@' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3896:6: (enumLiteral_3= '@' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3896:8: enumLiteral_3= '@'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleUNARY_OPERATOR8780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getDEREFERENCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getUNARY_OPERATORAccess().getDEREFERENCEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUNARY_OPERATOR"


    // $ANTLR start "ruleMULTIPLICATIVE_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3906:1: ruleMULTIPLICATIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3908:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3909:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3909:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt50=1;
                }
                break;
            case 63:
                {
                alt50=2;
                }
                break;
            case 64:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3909:2: (enumLiteral_0= '*' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3909:2: (enumLiteral_0= '*' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3909:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleMULTIPLICATIVE_OPERATOR8825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:6: (enumLiteral_1= '/' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:6: (enumLiteral_1= '/' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleMULTIPLICATIVE_OPERATOR8842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3921:6: (enumLiteral_2= '%' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3921:6: (enumLiteral_2= '%' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3921:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleMULTIPLICATIVE_OPERATOR8859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMODEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMULTIPLICATIVE_OPERATOR"


    // $ANTLR start "ruleADDITIVE_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3931:1: ruleADDITIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleADDITIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            else if ( (LA51_0==58) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:2: (enumLiteral_0= '+' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:2: (enumLiteral_0= '+' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleADDITIVE_OPERATOR8904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3940:6: (enumLiteral_1= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3940:6: (enumLiteral_1= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3940:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleADDITIVE_OPERATOR8921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getADDITIVE_OPERATORAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleADDITIVE_OPERATOR"


    // $ANTLR start "ruleEQUALITY_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3950:1: ruleEQUALITY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleEQUALITY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3952:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3953:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3953:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt52=1;
                }
                break;
            case 67:
                {
                alt52=2;
                }
                break;
            case 68:
                {
                alt52=3;
                }
                break;
            case 69:
                {
                alt52=4;
                }
                break;
            case 26:
                {
                alt52=5;
                }
                break;
            case 25:
                {
                alt52=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3953:2: (enumLiteral_0= '==' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3953:2: (enumLiteral_0= '==' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3953:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleEQUALITY_OPERATOR8966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3959:6: (enumLiteral_1= '!=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3959:6: (enumLiteral_1= '!=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3959:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_67_in_ruleEQUALITY_OPERATOR8983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3965:6: (enumLiteral_2= '>=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3965:6: (enumLiteral_2= '>=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3965:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_68_in_ruleEQUALITY_OPERATOR9000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3971:6: (enumLiteral_3= '<=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3971:6: (enumLiteral_3= '<=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3971:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_69_in_ruleEQUALITY_OPERATOR9017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3977:6: (enumLiteral_4= '>' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3977:6: (enumLiteral_4= '>' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3977:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_26_in_ruleEQUALITY_OPERATOR9034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3983:6: (enumLiteral_5= '<' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3983:6: (enumLiteral_5= '<' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3983:8: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,25,FOLLOW_25_in_ruleEQUALITY_OPERATOR9051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getEQUALITY_OPERATORAccess().getLTEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEQUALITY_OPERATOR"


    // $ANTLR start "ruleBOOLEAN_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3993:1: ruleBOOLEAN_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBOOLEAN_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3995:28: ( ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            else if ( (LA53_0==71) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:2: (enumLiteral_0= '||' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:2: (enumLiteral_0= '||' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:4: enumLiteral_0= '||'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleBOOLEAN_OPERATOR9096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4002:6: (enumLiteral_1= '&&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4002:6: (enumLiteral_1= '&&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4002:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleBOOLEAN_OPERATOR9113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBOOLEAN_OPERATORAccess().getANDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBOOLEAN_OPERATOR"


    // $ANTLR start "ruleErrorLevels"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:1: ruleErrorLevels returns [Enumerator current=null] : ( (enumLiteral_0= 'error' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'info' ) ) ;
    public final Enumerator ruleErrorLevels() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4014:28: ( ( (enumLiteral_0= 'error' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'info' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:1: ( (enumLiteral_0= 'error' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'info' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:1: ( (enumLiteral_0= 'error' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'info' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt54=1;
                }
                break;
            case 73:
                {
                alt54=2;
                }
                break;
            case 74:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:2: (enumLiteral_0= 'error' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:2: (enumLiteral_0= 'error' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:4: enumLiteral_0= 'error'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleErrorLevels9158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getErrorLevelsAccess().getERROREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getErrorLevelsAccess().getERROREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4021:6: (enumLiteral_1= 'warning' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4021:6: (enumLiteral_1= 'warning' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4021:8: enumLiteral_1= 'warning'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleErrorLevels9175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getErrorLevelsAccess().getWARNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getErrorLevelsAccess().getWARNINGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4027:6: (enumLiteral_2= 'info' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4027:6: (enumLiteral_2= 'info' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4027:8: enumLiteral_2= 'info'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleErrorLevels9192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getErrorLevelsAccess().getINFOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getErrorLevelsAccess().getINFOEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleErrorLevels"


    // $ANTLR start "ruleOpSingleAssign"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4037:1: ruleOpSingleAssign returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) ;
    public final Enumerator ruleOpSingleAssign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4039:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt55=1;
                }
                break;
            case 75:
                {
                alt55=2;
                }
                break;
            case 76:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:2: (enumLiteral_0= '=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:2: (enumLiteral_0= '=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign9237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOpSingleAssignAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOpSingleAssignAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4046:6: (enumLiteral_1= '+=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4046:6: (enumLiteral_1= '+=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4046:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleOpSingleAssign9254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOpSingleAssignAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOpSingleAssignAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4052:6: (enumLiteral_2= '-=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4052:6: (enumLiteral_2= '-=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4052:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleOpSingleAssign9271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOpSingleAssignAccess().getASSIGNSUBTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOpSingleAssignAccess().getASSIGNSUBTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"

    // $ANTLR start synpred1_InternalESyntax
    public final void synpred1_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:1: ( ruleMULTIPLICATIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:1: ( ruleMULTIPLICATIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3213:1: ruleMULTIPLICATIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax7272);
        ruleMULTIPLICATIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalESyntax

    // $ANTLR start synpred2_InternalESyntax
    public final void synpred2_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3290:4: ( ( ruleADDITIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3291:1: ( ruleADDITIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3291:1: ( ruleADDITIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3292:1: ruleADDITIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax7419);
        ruleADDITIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalESyntax

    // $ANTLR start synpred3_InternalESyntax
    public final void synpred3_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:4: ( ( ruleEQUALITY_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3370:1: ( ruleEQUALITY_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3370:1: ( ruleEQUALITY_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3371:1: ruleEQUALITY_OPERATOR
        {
        pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax7566);
        ruleEQUALITY_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalESyntax

    // $ANTLR start synpred4_InternalESyntax
    public final void synpred4_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:4: ( ( ruleBOOLEAN_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3449:1: ( ruleBOOLEAN_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3449:1: ( ruleBOOLEAN_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3450:1: ruleBOOLEAN_OPERATOR
        {
        pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax7713);
        ruleBOOLEAN_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalESyntax

    // Delegated rules

    public final boolean synpred1_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalESyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalESyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalESyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalESyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA23_eotS =
        "\10\uffff";
    static final String DFA23_eofS =
        "\10\uffff";
    static final String DFA23_minS =
        "\1\4\1\uffff\1\4\1\uffff\2\4\1\16\1\4";
    static final String DFA23_maxS =
        "\1\112\1\uffff\1\114\1\uffff\2\4\1\17\1\114";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA23_specialS =
        "\10\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\4\3\10\uffff\1\3\2\uffff\1\3\13\uffff\3\1\1\3\1\uffff"+
            "\2\1\2\uffff\1\1\3\uffff\1\3\5\uffff\1\3\1\uffff\1\3\2\1\2\uffff"+
            "\4\3\12\uffff\3\3",
            "",
            "\1\1\11\uffff\1\4\1\5\3\uffff\1\3\2\uffff\1\3\2\uffff\2\3"+
            "\1\uffff\1\3\6\uffff\1\3\11\uffff\1\3\6\uffff\1\3\5\uffff\1"+
            "\3\3\uffff\12\3\3\uffff\2\3",
            "",
            "\1\6",
            "\1\7",
            "\1\4\1\5",
            "\1\1\16\uffff\1\3\2\uffff\1\3\2\uffff\2\3\1\uffff\1\3\6\uffff"+
            "\1\3\11\uffff\1\3\6\uffff\1\3\5\uffff\1\3\3\uffff\12\3\3\uffff"+
            "\2\3"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "2010:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | this_XTopLevelExpression_2= ruleXTopLevelExpression )";
        }
    }
    static final String DFA35_eotS =
        "\16\uffff";
    static final String DFA35_eofS =
        "\4\uffff\1\12\10\uffff\1\12";
    static final String DFA35_minS =
        "\1\4\3\uffff\1\4\3\uffff\2\4\2\uffff\1\16\1\4";
    static final String DFA35_maxS =
        "\1\65\3\uffff\1\107\3\uffff\2\4\2\uffff\1\17\1\107";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\2\uffff\1\4\1\5\2\uffff";
    static final String DFA35_specialS =
        "\16\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\4\4\1\13\uffff\1\7\16\uffff\1\5\11\uffff\1\2\5\uffff\1\6"+
            "\1\uffff\1\3",
            "",
            "",
            "",
            "\1\12\11\uffff\1\10\1\11\1\12\2\uffff\1\12\1\uffff\1\12\3"+
            "\uffff\2\12\1\uffff\1\12\2\uffff\10\12\2\uffff\4\12\1\13\2\12"+
            "\4\uffff\1\12\1\uffff\2\12\2\uffff\1\12\3\uffff\12\12",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "",
            "",
            "\1\10\1\11",
            "\1\12\13\uffff\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12"+
            "\1\uffff\1\12\2\uffff\10\12\2\uffff\4\12\1\13\2\12\4\uffff\1"+
            "\12\1\uffff\2\12\2\uffff\1\12\3\uffff\12\12"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2786:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression | this_XExpressionBlock_7= ruleXExpressionBlock )";
        }
    }
    static final String DFA45_eotS =
        "\10\uffff";
    static final String DFA45_eofS =
        "\1\uffff\1\2\5\uffff\1\2";
    static final String DFA45_minS =
        "\2\4\1\uffff\2\4\1\uffff\1\16\1\4";
    static final String DFA45_maxS =
        "\1\75\1\114\1\uffff\2\4\1\uffff\1\17\1\114";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA45_specialS =
        "\10\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\4\2\13\uffff\1\2\16\uffff\1\2\11\uffff\1\2\5\uffff\1\2"+
            "\1\uffff\1\2\4\uffff\4\2",
            "\1\2\11\uffff\1\3\1\4\1\2\2\uffff\1\2\1\uffff\1\2\1\5\2\uffff"+
            "\2\2\1\uffff\1\2\2\uffff\10\2\2\uffff\7\2\4\uffff\1\2\1\uffff"+
            "\2\2\2\uffff\1\2\3\uffff\12\2\3\uffff\2\5",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\3\1\4",
            "\1\2\13\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\5\2\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\10\2\2\uffff\7\2\4\uffff\1\2\1\uffff\2"+
            "\2\2\uffff\1\2\3\uffff\12\2\3\uffff\2\5"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "3509:2: ( ( (lv_ref_0_0= ruleVariableReference ) ) ( (lv_op_1_0= ruleOpSingleAssign ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleCompilationUnit132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionSetNotation_in_ruleCompilationUnit159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowNotation_in_ruleCompilationUnit186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibraryName_in_entryRuleLibraryName222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibraryName233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLibraryName273 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleLibraryName292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLibraryName307 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleQualifiedName414 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLITERAL546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLITERAL572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleLITERAL598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLITERAL624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDefinition_in_entryRuleAnnotationDefinition669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationDefinition679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotationDefinition716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationDefinition733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAnnotation821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowNotation_in_entryRuleWorkflowNotation879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowNotation889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkflowNotation926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleWorkflowNotation947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowNotation959 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleWorkflowStepNotation_in_ruleWorkflowNotation980 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleWorkflowStepNotation_in_entryRuleWorkflowStepNotation1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowStepNotation1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleWorkflowStepNotation1073 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowStepNotation1085 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleWorkflowStepParameterNotation_in_ruleWorkflowStepNotation1106 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleWorkflowStepNotation1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowStepParameterNotation_in_entryRuleWorkflowStepParameterNotation1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowStepParameterNotation1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkflowStepParameterNotation1207 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWorkflowStepParameterNotation1224 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowStepParameterNotation1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleWorkflowStepParameterNotation1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionSetNotation_in_entryRuleInstructionSetNotation1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionSetNotation1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInstructionSetNotation1358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleInstructionSetNotation1379 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_ruleInstructionSetNotation1392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleInstructionSetNotation1413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInstructionSetNotation1427 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstructionNotation_in_ruleInstructionSetNotation1448 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstructionNotation_in_entryRuleInstructionNotation1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionNotation1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstructionNotation1537 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleInstructionParameterNotation_in_ruleInstructionNotation1563 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleInstructionWordNotation_in_ruleInstructionNotation1585 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_ruleInstructionWordNotation_in_entryRuleInstructionWordNotation1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionWordNotation1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInstructionWordNotation1669 = new BitSet(new long[]{0x00000000080001E0L});
    public static final BitSet FOLLOW_ruleInsctructionSectionNotation_in_ruleInstructionWordNotation1690 = new BitSet(new long[]{0x000000000C0001E0L});
    public static final BitSet FOLLOW_26_in_ruleInstructionWordNotation1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionParameterNotation_in_entryRuleInstructionParameterNotation1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionParameterNotation1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstructionParameterNotation1791 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInstructionParameterNotation1809 = new BitSet(new long[]{0x00000000080001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleInstructionParameterNotation1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsctructionSectionNotation_in_entryRuleInsctructionSectionNotation1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsctructionSectionNotation1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInsctructionSectionNotation1917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsctructionSectionNotation1934 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation1967 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInsctructionSectionNotation1980 = new BitSet(new long[]{0x00000000080001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation2001 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleInsctructionSectionNotation2014 = new BitSet(new long[]{0x00000000080001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleInsctructionSectionNotation2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary2073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLibrary2120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleLibrary2141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibrary2153 = new BitSet(new long[]{0x00C09A67C0010012L});
    public static final BitSet FOLLOW_30_in_ruleLibrary2166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLibraryName_in_ruleLibrary2187 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibrary2199 = new BitSet(new long[]{0x00C09A67C0010012L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_ruleLibrary2222 = new BitSet(new long[]{0x00C09A6780010012L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibraryItem2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLibraryItem2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleLibraryItem2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLibraryItem2371 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibraryItem2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleLibraryItem2412 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibraryItem2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_ruleLibraryItem2453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibraryItem2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDefinition_in_ruleLibraryItem2494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibraryItem2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType2589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2606 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleType2623 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType2644 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleType2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_ruleTypeDef2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_ruleTypeDef2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_ruleTypeDef2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_ruleTypeDef2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnspecifiedTypeDef_in_ruleTypeDef2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnspecifiedTypeDef_in_entryRuleUnspecifiedTypeDef2919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnspecifiedTypeDef2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUnspecifiedTypeDef2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerTypeDef3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePointerTypeDef3058 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePointerTypeDef3070 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rulePointerTypeDef3091 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePointerTypeDef3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef3139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDef3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArrayTypeDef3186 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArrayTypeDef3198 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleArrayTypeDef3219 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleArrayTypeDef3231 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleArrayTypeDef3244 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayTypeDef3265 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleArrayTypeDef3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTypeDef3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRefTypeDef3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef3405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDef3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataTypeDef_in_ruleDataTypeDef3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedDataTypeDef_in_ruleDataTypeDef3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDataTypeDef_in_ruleDataTypeDef3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDataTypeDef_in_entryRuleLabelDataTypeDef3551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDataTypeDef3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLabelDataTypeDef3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedDataTypeDef_in_entryRuleFixedDataTypeDef3643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedDataTypeDef3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFixedDataTypeDef3690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedDataTypeDef3707 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFixedDataTypeDef3724 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFixedDataTypeDef3736 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFixedDataTypeDef3748 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleFixedDataTypeDef3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataTypeDef_in_entryRuleIntegerDataTypeDef3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDataTypeDef3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerKind_in_ruleIntegerDataTypeDef3862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerDataTypeDef3879 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleIntegerDataTypeDef3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDef3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleStructTypeDef3988 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStructTypeDef4000 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef4021 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_42_in_ruleStructTypeDef4034 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef4055 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_21_in_ruleStructTypeDef4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember4105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDefMember4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember4170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructTypeDefMember4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable4228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantVariable4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleConstantVariable4284 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleConstantVariable4305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantVariable4322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstantVariable4339 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantVariable4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterVariable4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRegisterVariable4452 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleRegisterVariable4473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisterVariable4490 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRegisterVariable4507 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRegisterVariable4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_entryRuleOperationStep4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationStep4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperationStep4622 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationStep4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleVariable4753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariableReference4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall4901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperationCall4957 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleOperationCall4969 = new BitSet(new long[]{0x3C286008081001F0L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4991 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleOperationCall5004 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5025 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleOperationCall5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter5077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallParameter5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperationCallParameter5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeDef_in_entryRuleOperationTypeDef5167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationTypeDef5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleOperationTypeDef5223 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleOperationTypeDef5235 = new BitSet(new long[]{0x03C24A6700000010L});
    public static final BitSet FOLLOW_ruleOperationParameter_in_ruleOperationTypeDef5257 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleOperationTypeDef5270 = new BitSet(new long[]{0x03C20A6700000010L});
    public static final BitSet FOLLOW_ruleOperationParameter_in_ruleOperationTypeDef5291 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleOperationTypeDef5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation5343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperation5390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation5407 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleOperationTypeDef_in_ruleOperation5433 = new BitSet(new long[]{0x3C292008081001F0L});
    public static final BitSet FOLLOW_48_in_ruleOperation5446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperation5467 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperation5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationParameter_in_entryRuleOperationParameter5526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationParameter5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperationParameter5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLazyParameter_in_ruleOperationParameter5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLazyParameter_in_entryRuleLazyParameter5645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLazyParameter5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLazyParameter5692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLazyParameter5709 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleOperationTypeDef_in_ruleLazyParameter5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterVariable5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterKind_in_ruleParameterVariable5836 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleParameterVariable5858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterVariable5875 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameterVariable5893 = new BitSet(new long[]{0x00000000080001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleParameterVariable5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression5952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression6_in_ruleXExpression6009 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleXExpression6021 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleXExpression6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionBlock_in_entryRuleXExpressionBlock6080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionBlock6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXExpressionBlock6127 = new BitSet(new long[]{0x3CEC226F083201F0L,0x0000000000000700L});
    public static final BitSet FOLLOW_ruleOperationStep_in_ruleXExpressionBlock6157 = new BitSet(new long[]{0x3CEC226F083201F0L,0x0000000000000700L});
    public static final BitSet FOLLOW_50_in_ruleXExpressionBlock6171 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionBlock6192 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXExpressionBlock6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionBlock_in_ruleXPrimaryExpression6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSizeOfExpression6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSizeOfExpression6570 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSizeOfExpression6582 = new BitSet(new long[]{0x00C0026700000010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression6603 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSizeOfExpression6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStructExpression6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleXStructExpression6698 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression6719 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_42_in_ruleXStructExpression6732 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression6753 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_42_in_ruleXStructExpression6768 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXStructExpression6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_entryRuleXExpression16818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression16828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression16874 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression0_in_ruleXExpression16896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression0_in_entryRuleXExpression06932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression06942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_ruleXExpression06988 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXExpression07001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXExpression07018 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM17061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionM17071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM17117 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleXExpressionM17130 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionM17151 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXExpressionM17163 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_entryRuleXExpression27201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression27211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_ruleXExpression27257 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression27289 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression27310 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXExpression3_in_entryRuleXExpression37348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression37358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression37404 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression37436 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression37457 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_entryRuleXExpression47495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression47505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression47551 = new BitSet(new long[]{0x0000000006000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression47583 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression47604 = new BitSet(new long[]{0x0000000006000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleXExpression5_in_entryRuleXExpression57642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression57652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression57698 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression57730 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression57751 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleXExpression6_in_entryRuleXExpression67789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression67799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXExpression67846 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXExpression67867 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression5_in_ruleXExpression67890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral7926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionLiteral7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression8016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTopLevelExpression8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleXTopLevelExpression8074 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTopLevelExpression8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTopLevelExpression8115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTopLevelExpression8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXErrorExpression_in_ruleXTopLevelExpression8156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTopLevelExpression8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXErrorExpression_in_entryRuleXErrorExpression8204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXErrorExpression8214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorLevels_in_ruleXErrorExpression8260 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXErrorExpression8277 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXErrorExpression8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression8330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIsLiteralExpression8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIsLiteralExpression8377 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIsLiteralExpression8389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression8410 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIsLiteralExpression8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression8505 = new BitSet(new long[]{0x3C282008081001F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8526 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIntegerKind8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIntegerKind8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleParameterKind8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleParameterKind8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParameterKind8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUNARY_OPERATOR8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUNARY_OPERATOR8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUNARY_OPERATOR8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUNARY_OPERATOR8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleMULTIPLICATIVE_OPERATOR8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMULTIPLICATIVE_OPERATOR8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMULTIPLICATIVE_OPERATOR8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleADDITIVE_OPERATOR8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleADDITIVE_OPERATOR8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleEQUALITY_OPERATOR8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleEQUALITY_OPERATOR8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleEQUALITY_OPERATOR9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleEQUALITY_OPERATOR9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEQUALITY_OPERATOR9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEQUALITY_OPERATOR9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBOOLEAN_OPERATOR9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBOOLEAN_OPERATOR9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleErrorLevels9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleErrorLevels9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleErrorLevels9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign9237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOpSingleAssign9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOpSingleAssign9271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax7713 = new BitSet(new long[]{0x0000000000000002L});

}