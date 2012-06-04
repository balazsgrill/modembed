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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_BINARY", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'annotation'", "'#'", "'library'", "'overrides'", "','", "';'", "'use'", "'type'", "'='", "'pointer'", "'of'", "'array'", "'['", "']'", "'fixed'", "'bits'", "'scale'", "'struct'", "'{'", "'}'", "'const'", "'reg'", "':'", "'label'", "'<'", "'>'", "'('", "')'", "'returns'", "'operator'", "'binary'", "'at'", "'program'", "'startAddr'", "'memwidth'", "'pointerType'", "'addressType'", "'lib'", "'link'", "'optimize'", "'mem'", "'..'", "'data'", "'include'", "'sizeof'", "'->'", "'isliteral'", "'if'", "'else'", "'while'", "'unsigned'", "'signed'", "'default'", "'var'", "'SET'", "'ADD'", "'SUBTRACT'", "'AND'", "'OR'", "'XOR'", "'EQUALS'", "'BRANCH'", "'UC_GOTO'", "'NOT'", "'INDIRECTION'", "'CLEAR'", "'INCREMENT'", "'DECREMENT'", "'DIV'", "'MOD'", "'LT'", "'LTE'", "'GT'", "'GTE'", "'intelHexfile'", "'SRECHexfile'", "'-'", "'!'", "'&'", "'@'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_REAL=8;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int RULE_INT=5;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HEXINT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BINARY=7;
    public static final int RULE_WS=12;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:77:1: ruleCompilationUnit returns [EObject current=null] : (this_Library_0= ruleLibrary | this_LinkedBinary_1= ruleLinkedBinary ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Library_0 = null;

        EObject this_LinkedBinary_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:80:28: ( (this_Library_0= ruleLibrary | this_LinkedBinary_1= ruleLinkedBinary ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Library_0= ruleLibrary | this_LinkedBinary_1= ruleLinkedBinary )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Library_0= ruleLibrary | this_LinkedBinary_1= ruleLinkedBinary )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:92:5: this_LinkedBinary_1= ruleLinkedBinary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLinkedBinaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit159);
                    this_LinkedBinary_1=ruleLinkedBinary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LinkedBinary_1; 
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:108:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:109:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:110:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName195);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName206); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:117:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:120:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:121:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:121:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:121:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:128:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:129:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName265); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName280); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLITERAL"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:149:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:150:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:151:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERALRule()); 
            }
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL328);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL339); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:158:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_HEXINT_1=null;
        Token this_BINARY_2=null;
        Token this_REAL_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:161:28: ( (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:162:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:162:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY | this_REAL_3= RULE_REAL )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_HEXINT:
                {
                alt3=2;
                }
                break;
            case RULE_BINARY:
                {
                alt3=3;
                }
                break;
            case RULE_REAL:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:162:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLITERAL379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:170:10: this_HEXINT_1= RULE_HEXINT
                    {
                    this_HEXINT_1=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLITERAL405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_1, grammarAccess.getLITERALAccess().getHEXINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:178:10: this_BINARY_2= RULE_BINARY
                    {
                    this_BINARY_2=(Token)match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleLITERAL431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BINARY_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BINARY_2, grammarAccess.getLITERALAccess().getBINARYTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:186:10: this_REAL_3= RULE_REAL
                    {
                    this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLITERAL457); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:201:1: entryRuleAnnotationDefinition returns [EObject current=null] : iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF ;
    public final EObject entryRuleAnnotationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:202:2: (iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:203:2: iv_ruleAnnotationDefinition= ruleAnnotationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationDefinition_in_entryRuleAnnotationDefinition502);
            iv_ruleAnnotationDefinition=ruleAnnotationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationDefinition512); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:210:1: ruleAnnotationDefinition returns [EObject current=null] : (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:28: ( (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:214:1: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:214:1: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:214:3: otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAnnotationDefinition549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationDefinitionAccess().getAnnotationKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:218:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:219:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:219:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:220:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationDefinition566); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:244:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:245:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:246:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation607);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation617); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:253:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:256:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getNumberSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:261:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:262:1: (otherlv_1= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:262:1: (otherlv_1= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:263:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getDefinitionAnnotationDefinitionCrossReference_1_0()); 
              	
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


    // $ANTLR start "entryRuleLibrary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:282:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:283:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:284:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary710);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary720); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:291:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:294:28: ( (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:295:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:295:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:295:3: otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleLibrary757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:299:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:300:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:300:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:301:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary778);
            lv_name_1_0=ruleQualifiedName();

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
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:317:2: (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:317:4: otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleLibrary791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getOverridesKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:321:1: ( ( ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:322:1: ( ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:322:1: ( ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:323:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLibraryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverridesLibraryCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary814);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:336:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:336:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleLibrary827); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:340:1: ( ( ruleQualifiedName ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:341:1: ( ruleQualifiedName )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:341:1: ( ruleQualifiedName )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:342:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLibraryRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverridesLibraryCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary850);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleLibrary866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLibraryAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:359:1: (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:359:3: otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleLibrary879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getLibraryAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:363:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:364:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:364:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:365:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLibraryRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary902);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleLibrary914); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:382:3: ( (lv_items_10_0= ruleLibraryItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==15||LA7_0==22||LA7_0==24||LA7_0==26||LA7_0==29||LA7_0==32||(LA7_0>=35 && LA7_0<=36)||LA7_0==44||(LA7_0>=65 && LA7_0<=66)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:1: (lv_items_10_0= ruleLibraryItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:1: (lv_items_10_0= ruleLibraryItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:384:3: lv_items_10_0= ruleLibraryItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getItemsLibraryItemParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibraryItem_in_ruleLibrary937);
            	    lv_items_10_0=ruleLibraryItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_10_0, 
            	              		"LibraryItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:408:1: entryRuleLibraryItem returns [EObject current=null] : iv_ruleLibraryItem= ruleLibraryItem EOF ;
    public final EObject entryRuleLibraryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:409:2: (iv_ruleLibraryItem= ruleLibraryItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:410:2: iv_ruleLibraryItem= ruleLibraryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryItemRule()); 
            }
            pushFollow(FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem974);
            iv_ruleLibraryItem=ruleLibraryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibraryItem984); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:417:1: ruleLibraryItem returns [EObject current=null] : (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition | (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' ) ) ;
    public final EObject ruleLibraryItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_Type_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Variable_2 = null;

        EObject this_ConstantVariable_4 = null;

        EObject this_RegisterVariable_6 = null;

        EObject this_OperatorDefinition_8 = null;

        EObject this_AnnotationDefinition_9 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:420:28: ( (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition | (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:421:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition | (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:421:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition | (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID||LA8_2==14) ) {
                    alt8=3;
                }
                else if ( (LA8_2==41) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 26:
            case 29:
            case 32:
            case 65:
            case 66:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 15:
                {
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:422:5: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleLibraryItem1031);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:432:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleLibraryItem1058);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:441:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:441:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:442:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleLibraryItem1086);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLibraryItem1097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:455:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:455:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:456:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getConstantVariableParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleLibraryItem1127);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleLibraryItem1138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:469:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:469:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:470:5: this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getRegisterVariableParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegisterVariable_in_ruleLibraryItem1168);
                    this_RegisterVariable_6=ruleRegisterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegisterVariable_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleLibraryItem1179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:484:5: this_OperatorDefinition_8= ruleOperatorDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperatorDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem1208);
                    this_OperatorDefinition_8=ruleOperatorDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperatorDefinition_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:493:6: (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:493:6: (this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:494:5: this_AnnotationDefinition_9= ruleAnnotationDefinition otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getAnnotationDefinitionParserRuleCall_6_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotationDefinition_in_ruleLibraryItem1236);
                    this_AnnotationDefinition_9=ruleAnnotationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnnotationDefinition_9; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleLibraryItem1247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_6_1());
                          
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:514:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:515:2: (iv_ruleType= ruleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:516:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1284);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1294); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:523:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_def_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:526:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleType1331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:532:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:532:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1348); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleType1365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:553:1: ( (lv_def_3_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:554:1: (lv_def_3_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:554:1: (lv_def_3_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:555:3: lv_def_3_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleType1386);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleType1398); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:583:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:584:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:585:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef1434);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef1444); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:592:1: ruleTypeDef returns [EObject current=null] : (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDef_0 = null;

        EObject this_StructTypeDef_1 = null;

        EObject this_PointerTypeDef_2 = null;

        EObject this_ArrayTypeDef_3 = null;

        EObject this_RefTypeDef_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:595:28: ( (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:596:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:596:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
            case 65:
            case 66:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:597:5: this_DataTypeDef_0= ruleDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDef_in_ruleTypeDef1491);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:607:5: this_StructTypeDef_1= ruleStructTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getStructTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructTypeDef_in_ruleTypeDef1518);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:617:5: this_PointerTypeDef_2= rulePointerTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getPointerTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePointerTypeDef_in_ruleTypeDef1545);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:627:5: this_ArrayTypeDef_3= ruleArrayTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getArrayTypeDefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDef_in_ruleTypeDef1572);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:637:5: this_RefTypeDef_4= ruleRefTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getRefTypeDefParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRefTypeDef_in_ruleTypeDef1599);
                    this_RefTypeDef_4=ruleRefTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RefTypeDef_4; 
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


    // $ANTLR start "entryRulePointerTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:653:1: entryRulePointerTypeDef returns [EObject current=null] : iv_rulePointerTypeDef= rulePointerTypeDef EOF ;
    public final EObject entryRulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:654:2: (iv_rulePointerTypeDef= rulePointerTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:655:2: iv_rulePointerTypeDef= rulePointerTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeDefRule()); 
            }
            pushFollow(FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef1634);
            iv_rulePointerTypeDef=rulePointerTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerTypeDef1644); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:662:1: rulePointerTypeDef returns [EObject current=null] : (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) ;
    public final EObject rulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:665:28: ( (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:666:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:666:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:666:3: otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePointerTypeDef1681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPointerTypeDefAccess().getPointerKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulePointerTypeDef1693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointerTypeDefAccess().getOfKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:674:1: ( (lv_def_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:675:1: (lv_def_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:675:1: (lv_def_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:676:3: lv_def_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointerTypeDefAccess().getDefTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_rulePointerTypeDef1714);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:700:1: entryRuleArrayTypeDef returns [EObject current=null] : iv_ruleArrayTypeDef= ruleArrayTypeDef EOF ;
    public final EObject entryRuleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:701:2: (iv_ruleArrayTypeDef= ruleArrayTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:702:2: iv_ruleArrayTypeDef= ruleArrayTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef1750);
            iv_ruleArrayTypeDef=ruleArrayTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDef1760); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:709:1: ruleArrayTypeDef returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) ;
    public final EObject ruleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_size_2_0 = null;

        EObject lv_def_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:712:28: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:713:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:713:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:713:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleArrayTypeDef1797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleArrayTypeDef1809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayTypeDefAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:721:1: ( (lv_size_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:722:1: (lv_size_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:722:1: (lv_size_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:723:3: lv_size_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getSizeXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleArrayTypeDef1830);
            lv_size_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"size",
                      		lv_size_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleArrayTypeDef1842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayTypeDefAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleArrayTypeDef1854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefAccess().getOfKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:747:1: ( (lv_def_5_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:748:1: (lv_def_5_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:748:1: (lv_def_5_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:749:3: lv_def_5_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getDefTypeDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleArrayTypeDef1875);
            lv_def_5_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_5_0, 
                      		"TypeDef");
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
    // $ANTLR end "ruleArrayTypeDef"


    // $ANTLR start "entryRuleRefTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:773:1: entryRuleRefTypeDef returns [EObject current=null] : iv_ruleRefTypeDef= ruleRefTypeDef EOF ;
    public final EObject entryRuleRefTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:2: (iv_ruleRefTypeDef= ruleRefTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:2: iv_ruleRefTypeDef= ruleRefTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef1911);
            iv_ruleRefTypeDef=ruleRefTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTypeDef1921); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:782:1: ruleRefTypeDef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRefTypeDef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:785:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:786:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:786:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:787:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:787:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:788:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRefTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRefTypeDefAccess().getTypeTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRefTypeDef1968);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:809:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:810:2: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:811:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef2003);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDef2013); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:818:1: ruleDataTypeDef returns [EObject current=null] : (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef ) ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDataTypeDef_0 = null;

        EObject this_FixedDataTypeDef_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:821:28: ( (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:822:1: (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:822:1: (this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef | this_FixedDataTypeDef_1= ruleFixedDataTypeDef )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=65 && LA10_0<=66)) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:823:5: this_IntegerDataTypeDef_0= ruleIntegerDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefAccess().getIntegerDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerDataTypeDef_in_ruleDataTypeDef2060);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:833:5: this_FixedDataTypeDef_1= ruleFixedDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefAccess().getFixedDataTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFixedDataTypeDef_in_ruleDataTypeDef2087);
                    this_FixedDataTypeDef_1=ruleFixedDataTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FixedDataTypeDef_1; 
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


    // $ANTLR start "entryRuleFixedDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:849:1: entryRuleFixedDataTypeDef returns [EObject current=null] : iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF ;
    public final EObject entryRuleFixedDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:850:2: (iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:851:2: iv_ruleFixedDataTypeDef= ruleFixedDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixedDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleFixedDataTypeDef_in_entryRuleFixedDataTypeDef2122);
            iv_ruleFixedDataTypeDef=ruleFixedDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixedDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedDataTypeDef2132); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:858:1: ruleFixedDataTypeDef returns [EObject current=null] : (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:861:28: ( (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:862:1: (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:862:1: (otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:862:3: otherlv_0= 'fixed' ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= 'scale' otherlv_4= '=' ( (lv_scale_5_0= RULE_REAL ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFixedDataTypeDef2169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixedDataTypeDefAccess().getFixedKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:866:1: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:867:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:867:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:868:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedDataTypeDef2186); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleFixedDataTypeDef2203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFixedDataTypeDefAccess().getBitsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFixedDataTypeDef2215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFixedDataTypeDefAccess().getScaleKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleFixedDataTypeDef2227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFixedDataTypeDefAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:896:1: ( (lv_scale_5_0= RULE_REAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:897:1: (lv_scale_5_0= RULE_REAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:897:1: (lv_scale_5_0= RULE_REAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:898:3: lv_scale_5_0= RULE_REAL
            {
            lv_scale_5_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleFixedDataTypeDef2244); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:922:1: entryRuleIntegerDataTypeDef returns [EObject current=null] : iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF ;
    public final EObject entryRuleIntegerDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:923:2: (iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:924:2: iv_ruleIntegerDataTypeDef= ruleIntegerDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerDataTypeDef_in_entryRuleIntegerDataTypeDef2285);
            iv_ruleIntegerDataTypeDef=ruleIntegerDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDataTypeDef2295); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:931:1: ruleIntegerDataTypeDef returns [EObject current=null] : ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) ;
    public final EObject ruleIntegerDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:934:28: ( ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:935:1: ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:935:1: ( ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:935:2: ( (lv_kind_0_0= ruleIntegerKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:935:2: ( (lv_kind_0_0= ruleIntegerKind ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:936:1: (lv_kind_0_0= ruleIntegerKind )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:936:1: (lv_kind_0_0= ruleIntegerKind )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:937:3: lv_kind_0_0= ruleIntegerKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerDataTypeDefAccess().getKindIntegerKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntegerKind_in_ruleIntegerDataTypeDef2341);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:953:2: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:954:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:954:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:955:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerDataTypeDef2358); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleIntegerDataTypeDef2375); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:983:1: entryRuleStructTypeDef returns [EObject current=null] : iv_ruleStructTypeDef= ruleStructTypeDef EOF ;
    public final EObject entryRuleStructTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:984:2: (iv_ruleStructTypeDef= ruleStructTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:985:2: iv_ruleStructTypeDef= ruleStructTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef2411);
            iv_ruleStructTypeDef=ruleStructTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDef2421); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:992:1: ruleStructTypeDef returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:995:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:996:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:996:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:996:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:996:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:997:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStructTypeDef2467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStructTypeDefAccess().getStructKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleStructTypeDef2479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1010:1: ( (lv_members_3_0= ruleStructTypeDefMember ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1011:1: (lv_members_3_0= ruleStructTypeDefMember )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1011:1: (lv_members_3_0= ruleStructTypeDefMember )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1012:3: lv_members_3_0= ruleStructTypeDefMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2500);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1028:2: (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1028:4: otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStructTypeDef2513); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStructTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1032:1: ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1033:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1033:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1034:3: lv_members_5_0= ruleStructTypeDefMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2534);
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleStructTypeDef2548); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1062:1: entryRuleStructTypeDefMember returns [EObject current=null] : iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF ;
    public final EObject entryRuleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDefMember = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1063:2: (iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1064:2: iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember2584);
            iv_ruleStructTypeDefMember=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDefMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDefMember2594); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1071:1: ruleStructTypeDefMember returns [EObject current=null] : ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1074:28: ( ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:2: () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefMemberAccess().getStructTypeDefMemberAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1081:2: ( (lv_type_1_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1082:1: (lv_type_1_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1082:1: (lv_type_1_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1083:3: lv_type_1_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeDefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember2649);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1099:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1100:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1100:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1101:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructTypeDefMember2666); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1125:1: entryRuleConstantVariable returns [EObject current=null] : iv_ruleConstantVariable= ruleConstantVariable EOF ;
    public final EObject entryRuleConstantVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1126:2: (iv_ruleConstantVariable= ruleConstantVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1127:2: iv_ruleConstantVariable= ruleConstantVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable2707);
            iv_ruleConstantVariable=ruleConstantVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantVariable2717); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1134:1: ruleConstantVariable returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleConstantVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1137:28: ( ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1138:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1138:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1138:2: () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1138:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantVariableAccess().getConstantVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleConstantVariable2763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantVariableAccess().getConstKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1148:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1149:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1149:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1150:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleConstantVariable2784);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1166:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1167:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1167:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1168:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantVariable2801); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleConstantVariable2818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantVariableAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1188:1: ( (lv_value_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1189:1: (lv_value_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1189:1: (lv_value_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1190:3: lv_value_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleConstantVariable2839);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1214:1: entryRuleRegisterVariable returns [EObject current=null] : iv_ruleRegisterVariable= ruleRegisterVariable EOF ;
    public final EObject entryRuleRegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1215:2: (iv_ruleRegisterVariable= ruleRegisterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1216:2: iv_ruleRegisterVariable= ruleRegisterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable2875);
            iv_ruleRegisterVariable=ruleRegisterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterVariable2885); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1223:1: ruleRegisterVariable returns [EObject current=null] : ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleRegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_addr_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1226:28: ( ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1227:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1227:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1227:2: () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1227:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegisterVariableAccess().getRegisterVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleRegisterVariable2931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRegisterVariableAccess().getRegKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1237:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1238:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1238:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1239:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleRegisterVariable2952);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1255:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1256:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1256:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1257:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisterVariable2969); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleRegisterVariable2986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegisterVariableAccess().getColonKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1277:1: ( (lv_addr_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1278:1: (lv_addr_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1278:1: (lv_addr_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1279:3: lv_addr_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getAddrXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleRegisterVariable3007);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1303:1: entryRuleOperationStep returns [EObject current=null] : iv_ruleOperationStep= ruleOperationStep EOF ;
    public final EObject entryRuleOperationStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStep = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1304:2: (iv_ruleOperationStep= ruleOperationStep EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1305:2: iv_ruleOperationStep= ruleOperationStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationStepRule()); 
            }
            pushFollow(FOLLOW_ruleOperationStep_in_entryRuleOperationStep3043);
            iv_ruleOperationStep=ruleOperationStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationStep3053); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1312:1: ruleOperationStep returns [EObject current=null] : (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) ;
    public final EObject ruleOperationStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_InstructionWord_0 = null;

        EObject this_Label_1 = null;

        EObject this_Variable_2 = null;

        EObject this_XTopLevelExpression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1315:28: ( (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1316:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1316:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1317:5: this_InstructionWord_0= ruleInstructionWord
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getInstructionWordParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstructionWord_in_ruleOperationStep3100);
                    this_InstructionWord_0=ruleInstructionWord();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstructionWord_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1327:5: this_Label_1= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getLabelParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleOperationStep3127);
                    this_Label_1=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Label_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1336:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1336:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1337:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperationStep3155);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOperationStep3166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationStepAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1351:5: this_XTopLevelExpression_4= ruleXTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getXTopLevelExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep3195);
                    this_XTopLevelExpression_4=ruleXTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTopLevelExpression_4; 
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


    // $ANTLR start "entryRuleLabel"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1367:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1368:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1369:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel3230);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel3240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1376:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1379:28: ( ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1380:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1380:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1380:2: () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1380:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelAccess().getLabelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLabel3286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1390:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1391:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1391:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1392:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel3303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLabel3320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInstructionWord"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1420:1: entryRuleInstructionWord returns [EObject current=null] : iv_ruleInstructionWord= ruleInstructionWord EOF ;
    public final EObject entryRuleInstructionWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWord = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1421:2: (iv_ruleInstructionWord= ruleInstructionWord EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1422:2: iv_ruleInstructionWord= ruleInstructionWord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionWordRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord3356);
            iv_ruleInstructionWord=ruleInstructionWord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionWord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionWord3366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionWord"


    // $ANTLR start "ruleInstructionWord"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1429:1: ruleInstructionWord returns [EObject current=null] : (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) ;
    public final EObject ruleInstructionWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1432:28: ( (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1433:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1433:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1433:3: otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleInstructionWord3403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionWordAccess().getLessThanSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1437:1: ( (lv_sections_1_0= ruleWordSection ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_REAL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1438:1: (lv_sections_1_0= ruleWordSection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1438:1: (lv_sections_1_0= ruleWordSection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1439:3: lv_sections_1_0= ruleWordSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionWordAccess().getSectionsWordSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWordSection_in_ruleInstructionWord3424);
            	    lv_sections_1_0=ruleWordSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionWordRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sections",
            	              		lv_sections_1_0, 
            	              		"WordSection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleInstructionWord3437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstructionWordAccess().getGreaterThanSignKeyword_2());
                  
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
    // $ANTLR end "ruleInstructionWord"


    // $ANTLR start "entryRuleWordSection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1467:1: entryRuleWordSection returns [EObject current=null] : iv_ruleWordSection= ruleWordSection EOF ;
    public final EObject entryRuleWordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordSection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1468:2: (iv_ruleWordSection= ruleWordSection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1469:2: iv_ruleWordSection= ruleWordSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWordSectionRule()); 
            }
            pushFollow(FOLLOW_ruleWordSection_in_entryRuleWordSection3473);
            iv_ruleWordSection=ruleWordSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWordSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordSection3483); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWordSection"


    // $ANTLR start "ruleWordSection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1476:1: ruleWordSection returns [EObject current=null] : ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleWordSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token lv_shift_5_0=null;
        EObject this_LiteralValue_0 = null;

        EObject this_VariableReference_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1479:28: ( ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1480:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1480:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1480:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1480:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_REAL)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1481:5: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getLiteralValueParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleWordSection3531);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1491:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getVariableReferenceParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleWordSection3558);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleWordSection3570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWordSectionAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1503:1: ( (lv_size_3_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1504:1: (lv_size_3_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1504:1: (lv_size_3_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1505:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection3587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_size_3_0, grammarAccess.getWordSectionAccess().getSizeINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWordSectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"size",
                      		lv_size_3_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1521:2: (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1521:4: otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleWordSection3605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getWordSectionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1525:1: ( (lv_shift_5_0= RULE_INT ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1526:1: (lv_shift_5_0= RULE_INT )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1526:1: (lv_shift_5_0= RULE_INT )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1527:3: lv_shift_5_0= RULE_INT
                    {
                    lv_shift_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection3622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_shift_5_0, grammarAccess.getWordSectionAccess().getShiftINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWordSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"shift",
                              		lv_shift_5_0, 
                              		"INT");
                      	    
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
    // $ANTLR end "ruleWordSection"


    // $ANTLR start "entryRuleLiteralValue"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1551:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1553:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3665);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue3675); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1560:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1563:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1564:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1564:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1565:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1565:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1566:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralValueAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleLiteralValue3720);
            lv_value_0_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralValueRule());
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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1590:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1591:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1592:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3755);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3765); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1599:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1602:28: ( ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:2: ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:2: ( (lv_type_0_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1604:1: (lv_type_0_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1604:1: (lv_type_0_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1605:3: lv_type_0_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeDefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleVariable3811);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1621:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1622:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1622:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1623:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3828); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1647:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1648:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1649:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference3869);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference3879); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1656:1: ruleVariableReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1659:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1660:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1660:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1661:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1661:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1662:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVarVariableCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariableReference3926);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1683:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1684:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1685:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCall_in_entryRuleOperationCall3961);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCall3971); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1692:1: ruleOperationCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1695:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1696:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1696:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1696:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1696:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1697:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1697:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1698:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperationCall4019);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleOperationCall4031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1715:1: ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_REAL)||LA17_0==41||LA17_0==59||LA17_0==61||(LA17_0>=91 && LA17_0<=94)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1715:2: ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1715:2: ( (lv_params_2_0= ruleOperationCallParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1716:1: (lv_params_2_0= ruleOperationCallParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1716:1: (lv_params_2_0= ruleOperationCallParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1717:3: lv_params_2_0= ruleOperationCallParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4053);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1733:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1733:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleOperationCall4066); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1737:1: ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1738:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1738:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1739:3: lv_params_4_0= ruleOperationCallParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4087);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleOperationCall4103); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1767:1: entryRuleOperationCallParameter returns [EObject current=null] : iv_ruleOperationCallParameter= ruleOperationCallParameter EOF ;
    public final EObject entryRuleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1768:2: (iv_ruleOperationCallParameter= ruleOperationCallParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1769:2: iv_ruleOperationCallParameter= ruleOperationCallParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter4139);
            iv_ruleOperationCallParameter=ruleOperationCallParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallParameter4149); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1776:1: ruleOperationCallParameter returns [EObject current=null] : this_XExpression_0= ruleXExpression ;
    public final EObject ruleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1779:28: (this_XExpression_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1781:5: this_XExpression_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationCallParameterAccess().getXExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleOperationCallParameter4195);
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


    // $ANTLR start "entryRuleOperation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1799:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1800:2: (iv_ruleOperation= ruleOperation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1801:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation4231);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation4241); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1808:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_block_8_0 = null;

        EObject lv_return_11_0 = null;

        EObject lv_returnvar_12_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1811:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1812:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1812:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1812:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1812:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1813:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1818:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1819:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1819:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation4292); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleOperation4309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1840:1: ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==24||LA19_0==26||LA19_0==29||LA19_0==32||LA19_0==35||(LA19_0>=65 && LA19_0<=68)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1840:2: ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1840:2: ( (lv_params_3_0= ruleParameterVariable ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1841:1: (lv_params_3_0= ruleParameterVariable )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1841:1: (lv_params_3_0= ruleParameterVariable )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1842:3: lv_params_3_0= ruleParameterVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4331);
                    lv_params_3_0=ruleParameterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"ParameterVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1858:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1858:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleOperation4344); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1862:1: ( (lv_params_5_0= ruleParameterVariable ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1863:1: (lv_params_5_0= ruleParameterVariable )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1863:1: (lv_params_5_0= ruleParameterVariable )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1864:3: lv_params_5_0= ruleParameterVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4365);
                    	    lv_params_5_0=ruleParameterVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"ParameterVariable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleOperation4381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleOperation4393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1888:1: ( (lv_block_8_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1889:1: (lv_block_8_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1889:1: (lv_block_8_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1890:3: lv_block_8_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBlockOperationBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleOperation4414);
            lv_block_8_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_8_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleOperation4426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1910:1: (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1910:3: otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_43_in_ruleOperation4439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getReturnsKeyword_8_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1914:1: ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) )
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1914:2: ( (lv_return_11_0= ruleXExpression ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1914:2: ( (lv_return_11_0= ruleXExpression ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1915:1: (lv_return_11_0= ruleXExpression )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1915:1: (lv_return_11_0= ruleXExpression )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1916:3: lv_return_11_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnXExpressionParserRuleCall_8_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleOperation4461);
                            lv_return_11_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"return",
                                      		lv_return_11_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1933:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1933:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1934:1: (lv_returnvar_12_0= ruleVariable )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1934:1: (lv_returnvar_12_0= ruleVariable )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1935:3: lv_returnvar_12_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnvarVariableParserRuleCall_8_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleOperation4488);
                            lv_returnvar_12_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"returnvar",
                                      		lv_returnvar_12_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleOperation4501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getSemicolonKeyword_8_2());
                          
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationBlock"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1963:1: entryRuleOperationBlock returns [EObject current=null] : iv_ruleOperationBlock= ruleOperationBlock EOF ;
    public final EObject entryRuleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBlock = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1964:2: (iv_ruleOperationBlock= ruleOperationBlock EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1965:2: iv_ruleOperationBlock= ruleOperationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4539);
            iv_ruleOperationBlock=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationBlock4549); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationBlock"


    // $ANTLR start "ruleOperationBlock"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:1: ruleOperationBlock returns [EObject current=null] : ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) ;
    public final EObject ruleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1975:28: ( ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1976:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1976:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1976:2: () ( (lv_steps_1_0= ruleOperationStep ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1976:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationBlockAccess().getOperationBlockAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1982:2: ( (lv_steps_1_0= ruleOperationStep ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_REAL)||LA22_0==16||LA22_0==24||LA22_0==26||LA22_0==29||LA22_0==32||(LA22_0>=38 && LA22_0<=39)||LA22_0==41||LA22_0==59||(LA22_0>=61 && LA22_0<=62)||(LA22_0>=64 && LA22_0<=66)||(LA22_0>=91 && LA22_0<=94)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1983:1: (lv_steps_1_0= ruleOperationStep )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1983:1: (lv_steps_1_0= ruleOperationStep )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1984:3: lv_steps_1_0= ruleOperationStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationBlockAccess().getStepsOperationStepParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationStep_in_ruleOperationBlock4604);
            	    lv_steps_1_0=ruleOperationStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"steps",
            	              		lv_steps_1_0, 
            	              		"OperationStep");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleOperationBlock"


    // $ANTLR start "entryRuleParameterVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2008:1: entryRuleParameterVariable returns [EObject current=null] : iv_ruleParameterVariable= ruleParameterVariable EOF ;
    public final EObject entryRuleParameterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2009:2: (iv_ruleParameterVariable= ruleParameterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:2: iv_ruleParameterVariable= ruleParameterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable4641);
            iv_ruleParameterVariable=ruleParameterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterVariable4651); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2017:1: ruleParameterVariable returns [EObject current=null] : ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleParameterVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2020:28: ( ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2021:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2021:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2021:2: () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2021:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2022:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterVariableAccess().getParameterVariableAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2027:2: ( (lv_kind_1_0= ruleParameterKind ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35||(LA23_0>=67 && LA23_0<=68)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2028:1: (lv_kind_1_0= ruleParameterKind )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2028:1: (lv_kind_1_0= ruleParameterKind )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2029:3: lv_kind_1_0= ruleParameterKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getKindParameterKindEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterKind_in_ruleParameterVariable4706);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2045:3: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2046:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2046:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2047:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleParameterVariable4728);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2063:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2064:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2064:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2065:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterVariable4745); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2081:2: (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2081:4: otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleParameterVariable4763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterVariableAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2085:1: ( (lv_default_5_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2086:1: (lv_default_5_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2086:1: (lv_default_5_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2087:3: lv_default_5_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getDefaultLITERALParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleParameterVariable4784);
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


    // $ANTLR start "entryRuleOperatorDefinition"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2111:1: entryRuleOperatorDefinition returns [EObject current=null] : iv_ruleOperatorDefinition= ruleOperatorDefinition EOF ;
    public final EObject entryRuleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2112:2: (iv_ruleOperatorDefinition= ruleOperatorDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2113:2: iv_ruleOperatorDefinition= ruleOperatorDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition4822);
            iv_ruleOperatorDefinition=ruleOperatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition4832); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperatorDefinition"


    // $ANTLR start "ruleOperatorDefinition"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2120:1: ruleOperatorDefinition returns [EObject current=null] : (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
    public final EObject ruleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_role_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2123:28: ( (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2124:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2124:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2124:3: otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleOperatorDefinition4869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperatorDefinitionAccess().getOperatorKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2128:1: ( (lv_role_1_0= ruleOperationRole ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2129:1: (lv_role_1_0= ruleOperationRole )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2129:1: (lv_role_1_0= ruleOperationRole )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2130:3: lv_role_1_0= ruleOperationRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getRoleOperationRoleEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationRole_in_ruleOperatorDefinition4890);
            lv_role_1_0=ruleOperationRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"role",
                      		lv_role_1_0, 
                      		"OperationRole");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleOperatorDefinition4902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperatorDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2150:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2151:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2151:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2152:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4925);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2165:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2165:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleOperatorDefinition4938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2169:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2170:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2170:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2171:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4961);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2184:4: (otherlv_6= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2184:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleOperatorDefinition4976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOperatorDefinition4990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperatorDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleOperatorDefinition"


    // $ANTLR start "entryRuleLinkedBinary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2200:1: entryRuleLinkedBinary returns [EObject current=null] : iv_ruleLinkedBinary= ruleLinkedBinary EOF ;
    public final EObject entryRuleLinkedBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedBinary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2201:2: (iv_ruleLinkedBinary= ruleLinkedBinary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2202:2: iv_ruleLinkedBinary= ruleLinkedBinary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedBinaryRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5026);
            iv_ruleLinkedBinary=ruleLinkedBinary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedBinary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedBinary5036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLinkedBinary"


    // $ANTLR start "ruleLinkedBinary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2209:1: ruleLinkedBinary returns [EObject current=null] : (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* ) ;
    public final EObject ruleLinkedBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_sections_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2212:28: ( (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2213:1: (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2213:1: (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2213:3: otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLinkedBinary5073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkedBinaryAccess().getBinaryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2217:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2218:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2218:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2219:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5094);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLinkedBinaryRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2235:2: ( (lv_type_2_0= ruleBinaryType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==67||(LA27_0>=89 && LA27_0<=90)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2236:1: (lv_type_2_0= ruleBinaryType )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2236:1: (lv_type_2_0= ruleBinaryType )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2237:3: lv_type_2_0= ruleBinaryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getTypeBinaryTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBinaryType_in_ruleLinkedBinary5115);
                    lv_type_2_0=ruleBinaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLinkedBinaryRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"BinaryType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLinkedBinary5128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLinkedBinaryAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2257:1: (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2257:3: otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleLinkedBinary5141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLinkedBinaryAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2261:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2262:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2262:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2263:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLinkedBinaryRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5164);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleLinkedBinary5176); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getLinkedBinaryAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2280:3: ( (lv_sections_7_0= ruleBinarySection ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==47||(LA29_0>=57 && LA29_0<=58)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2281:1: (lv_sections_7_0= ruleBinarySection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2281:1: (lv_sections_7_0= ruleBinarySection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2282:3: lv_sections_7_0= ruleBinarySection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getSectionsBinarySectionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinarySection_in_ruleLinkedBinary5199);
            	    lv_sections_7_0=ruleBinarySection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLinkedBinaryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sections",
            	              		lv_sections_7_0, 
            	              		"BinarySection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleLinkedBinary"


    // $ANTLR start "entryRuleBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2306:1: entryRuleBinarySection returns [EObject current=null] : iv_ruleBinarySection= ruleBinarySection EOF ;
    public final EObject entryRuleBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2307:2: (iv_ruleBinarySection= ruleBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2308:2: iv_ruleBinarySection= ruleBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleBinarySection_in_entryRuleBinarySection5236);
            iv_ruleBinarySection=ruleBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinarySection5246); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinarySection"


    // $ANTLR start "ruleBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2315:1: ruleBinarySection returns [EObject current=null] : ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_FunctionBinarySection_0 = null;

        EObject this_ConstantBinarySection_1 = null;

        EObject this_ReferenceBinarySection_2 = null;

        EObject lv_start_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2318:28: ( ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2319:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2319:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2319:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2319:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2320:5: this_FunctionBinarySection_0= ruleFunctionBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getFunctionBinarySectionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection5294);
                    this_FunctionBinarySection_0=ruleFunctionBinarySection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionBinarySection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2330:5: this_ConstantBinarySection_1= ruleConstantBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getConstantBinarySectionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantBinarySection_in_ruleBinarySection5321);
                    this_ConstantBinarySection_1=ruleConstantBinarySection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantBinarySection_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2340:5: this_ReferenceBinarySection_2= ruleReferenceBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getReferenceBinarySectionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5348);
                    this_ReferenceBinarySection_2=ruleReferenceBinarySection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceBinarySection_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleBinarySection5360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBinarySectionAccess().getAtKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2352:1: ( (lv_start_4_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2353:1: (lv_start_4_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2353:1: (lv_start_4_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:3: lv_start_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinarySectionAccess().getStartXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleBinarySection5381);
            lv_start_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"start",
                      		lv_start_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBinarySection5393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBinarySectionAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleBinarySection"


    // $ANTLR start "entryRuleFunctionBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2382:1: entryRuleFunctionBinarySection returns [EObject current=null] : iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF ;
    public final EObject entryRuleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2383:2: (iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2384:2: iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5429);
            iv_ruleFunctionBinarySection=ruleFunctionBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBinarySection5439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionBinarySection"


    // $ANTLR start "ruleFunctionBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2391:1: ruleFunctionBinarySection returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointerType' otherlv_12= '=' ( (lv_pointerType_13_0= ruleTypeDef ) ) otherlv_14= ';' otherlv_15= 'addressType' otherlv_16= '=' ( (lv_addressType_17_0= ruleTypeDef ) ) otherlv_18= ';' ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+ ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )* otherlv_23= ')' otherlv_24= '{' (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )* otherlv_28= 'link' otherlv_29= '{' ( (lv_do_30_0= ruleOperationBlock ) ) otherlv_31= '}' otherlv_32= '}' ) ;
    public final EObject ruleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_startAddr_5_0 = null;

        AntlrDatatypeRuleToken lv_memwidth_9_0 = null;

        EObject lv_pointerType_13_0 = null;

        EObject lv_addressType_17_0 = null;

        EObject lv_mems_19_0 = null;

        EObject lv_optimizercalls_21_0 = null;

        EObject lv_do_30_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2394:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointerType' otherlv_12= '=' ( (lv_pointerType_13_0= ruleTypeDef ) ) otherlv_14= ';' otherlv_15= 'addressType' otherlv_16= '=' ( (lv_addressType_17_0= ruleTypeDef ) ) otherlv_18= ';' ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+ ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )* otherlv_23= ')' otherlv_24= '{' (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )* otherlv_28= 'link' otherlv_29= '{' ( (lv_do_30_0= ruleOperationBlock ) ) otherlv_31= '}' otherlv_32= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2395:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointerType' otherlv_12= '=' ( (lv_pointerType_13_0= ruleTypeDef ) ) otherlv_14= ';' otherlv_15= 'addressType' otherlv_16= '=' ( (lv_addressType_17_0= ruleTypeDef ) ) otherlv_18= ';' ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+ ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )* otherlv_23= ')' otherlv_24= '{' (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )* otherlv_28= 'link' otherlv_29= '{' ( (lv_do_30_0= ruleOperationBlock ) ) otherlv_31= '}' otherlv_32= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2395:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointerType' otherlv_12= '=' ( (lv_pointerType_13_0= ruleTypeDef ) ) otherlv_14= ';' otherlv_15= 'addressType' otherlv_16= '=' ( (lv_addressType_17_0= ruleTypeDef ) ) otherlv_18= ';' ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+ ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )* otherlv_23= ')' otherlv_24= '{' (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )* otherlv_28= 'link' otherlv_29= '{' ( (lv_do_30_0= ruleOperationBlock ) ) otherlv_31= '}' otherlv_32= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2395:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointerType' otherlv_12= '=' ( (lv_pointerType_13_0= ruleTypeDef ) ) otherlv_14= ';' otherlv_15= 'addressType' otherlv_16= '=' ( (lv_addressType_17_0= ruleTypeDef ) ) otherlv_18= ';' ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+ ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )* otherlv_23= ')' otherlv_24= '{' (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )* otherlv_28= 'link' otherlv_29= '{' ( (lv_do_30_0= ruleOperationBlock ) ) otherlv_31= '}' otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleFunctionBinarySection5476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionBinarySectionAccess().getProgramKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2400:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2400:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionBinarySection5493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionBinarySectionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleFunctionBinarySection5510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionBinarySectionAccess().getLeftParenthesisKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleFunctionBinarySection5522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionBinarySectionAccess().getStartAddrKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection5534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2429:1: ( (lv_startAddr_5_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2430:1: (lv_startAddr_5_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2430:1: (lv_startAddr_5_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2431:3: lv_startAddr_5_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getStartAddrLITERALParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5555);
            lv_startAddr_5_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"startAddr",
                      		lv_startAddr_5_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleFunctionBinarySection5579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionBinarySectionAccess().getMemwidthKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection5591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_8());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2459:1: ( (lv_memwidth_9_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2460:1: (lv_memwidth_9_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2460:1: (lv_memwidth_9_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2461:3: lv_memwidth_9_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemwidthLITERALParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5612);
            lv_memwidth_9_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"memwidth",
                      		lv_memwidth_9_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleFunctionBinarySection5636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getFunctionBinarySectionAccess().getPointerTypeKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection5648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_12());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2489:1: ( (lv_pointerType_13_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2490:1: (lv_pointerType_13_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2490:1: (lv_pointerType_13_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2491:3: lv_pointerType_13_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getPointerTypeTypeDefParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleFunctionBinarySection5669);
            lv_pointerType_13_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"pointerType",
                      		lv_pointerType_13_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_14());
                  
            }
            otherlv_15=(Token)match(input,51,FOLLOW_51_in_ruleFunctionBinarySection5693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getFunctionBinarySectionAccess().getAddressTypeKeyword_15());
                  
            }
            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection5705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_16());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2519:1: ( (lv_addressType_17_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2520:1: (lv_addressType_17_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2520:1: (lv_addressType_17_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2521:3: lv_addressType_17_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getAddressTypeTypeDefParserRuleCall_17_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleFunctionBinarySection5726);
            lv_addressType_17_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"addressType",
                      		lv_addressType_17_0, 
                      		"TypeDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_18());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2541:1: ( ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==55) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2541:2: ( (lv_mems_19_0= ruleFunctionMemory ) ) otherlv_20= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2541:2: ( (lv_mems_19_0= ruleFunctionMemory ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2542:1: (lv_mems_19_0= ruleFunctionMemory )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2542:1: (lv_mems_19_0= ruleFunctionMemory )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2543:3: lv_mems_19_0= ruleFunctionMemory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemsFunctionMemoryParserRuleCall_19_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection5760);
            	    lv_mems_19_0=ruleFunctionMemory();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mems",
            	              		lv_mems_19_0, 
            	              		"FunctionMemory");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5772); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_19_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2563:3: ( ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==54) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2563:4: ( (lv_optimizercalls_21_0= ruleOptimizerCall ) ) otherlv_22= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2563:4: ( (lv_optimizercalls_21_0= ruleOptimizerCall ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2564:1: (lv_optimizercalls_21_0= ruleOptimizerCall )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2564:1: (lv_optimizercalls_21_0= ruleOptimizerCall )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2565:3: lv_optimizercalls_21_0= ruleOptimizerCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getOptimizercallsOptimizerCallParserRuleCall_20_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOptimizerCall_in_ruleFunctionBinarySection5796);
            	    lv_optimizercalls_21_0=ruleOptimizerCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"optimizercalls",
            	              		lv_optimizercalls_21_0, 
            	              		"OptimizerCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_20_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_23=(Token)match(input,42,FOLLOW_42_in_ruleFunctionBinarySection5822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getFunctionBinarySectionAccess().getRightParenthesisKeyword_21());
                  
            }
            otherlv_24=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBinarySection5834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_24, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_22());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2593:1: (otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==52) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2593:3: otherlv_25= 'lib' ( ( ruleQualifiedName ) ) otherlv_27= ';'
            	    {
            	    otherlv_25=(Token)match(input,52,FOLLOW_52_in_ruleFunctionBinarySection5847); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getFunctionBinarySectionAccess().getLibKeyword_23_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2597:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2598:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2598:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2599:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getLibLibraryCrossReference_23_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection5870);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleFunctionBinarySection5882); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_23_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_28=(Token)match(input,53,FOLLOW_53_in_ruleFunctionBinarySection5896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_28, grammarAccess.getFunctionBinarySectionAccess().getLinkKeyword_24());
                  
            }
            otherlv_29=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBinarySection5908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_29, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_25());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2624:1: ( (lv_do_30_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2625:1: (lv_do_30_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2625:1: (lv_do_30_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2626:3: lv_do_30_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getDoOperationBlockParserRuleCall_26_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleFunctionBinarySection5929);
            lv_do_30_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"do",
                      		lv_do_30_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_31=(Token)match(input,34,FOLLOW_34_in_ruleFunctionBinarySection5941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_31, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_27());
                  
            }
            otherlv_32=(Token)match(input,34,FOLLOW_34_in_ruleFunctionBinarySection5953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_32, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_28());
                  
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
    // $ANTLR end "ruleFunctionBinarySection"


    // $ANTLR start "entryRuleOptimizerCall"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2658:1: entryRuleOptimizerCall returns [EObject current=null] : iv_ruleOptimizerCall= ruleOptimizerCall EOF ;
    public final EObject entryRuleOptimizerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimizerCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2659:2: (iv_ruleOptimizerCall= ruleOptimizerCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2660:2: iv_ruleOptimizerCall= ruleOptimizerCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptimizerCallRule()); 
            }
            pushFollow(FOLLOW_ruleOptimizerCall_in_entryRuleOptimizerCall5989);
            iv_ruleOptimizerCall=ruleOptimizerCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptimizerCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptimizerCall5999); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOptimizerCall"


    // $ANTLR start "ruleOptimizerCall"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2667:1: ruleOptimizerCall returns [EObject current=null] : (otherlv_0= 'optimize' ( (lv_optimizer_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleOptimizerCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optimizer_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2670:28: ( (otherlv_0= 'optimize' ( (lv_optimizer_1_0= RULE_STRING ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2671:1: (otherlv_0= 'optimize' ( (lv_optimizer_1_0= RULE_STRING ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2671:1: (otherlv_0= 'optimize' ( (lv_optimizer_1_0= RULE_STRING ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2671:3: otherlv_0= 'optimize' ( (lv_optimizer_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleOptimizerCall6036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOptimizerCallAccess().getOptimizeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2675:1: ( (lv_optimizer_1_0= RULE_STRING ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2676:1: (lv_optimizer_1_0= RULE_STRING )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2676:1: (lv_optimizer_1_0= RULE_STRING )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2677:3: lv_optimizer_1_0= RULE_STRING
            {
            lv_optimizer_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOptimizerCall6053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_optimizer_1_0, grammarAccess.getOptimizerCallAccess().getOptimizerSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOptimizerCallRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"optimizer",
                      		lv_optimizer_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleOptimizerCall"


    // $ANTLR start "entryRuleFunctionMemory"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2701:1: entryRuleFunctionMemory returns [EObject current=null] : iv_ruleFunctionMemory= ruleFunctionMemory EOF ;
    public final EObject entryRuleFunctionMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionMemory = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2702:2: (iv_ruleFunctionMemory= ruleFunctionMemory EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2703:2: iv_ruleFunctionMemory= ruleFunctionMemory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionMemoryRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory6094);
            iv_ruleFunctionMemory=ruleFunctionMemory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionMemory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionMemory6104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionMemory"


    // $ANTLR start "ruleFunctionMemory"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2710:1: ruleFunctionMemory returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) ;
    public final EObject ruleFunctionMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2713:28: ( (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2714:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2714:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2714:3: otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleFunctionMemory6141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionMemoryAccess().getMemKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2718:1: ( (lv_start_1_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:1: (lv_start_1_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:1: (lv_start_1_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2720:3: lv_start_1_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getStartLITERALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory6162);
            lv_start_1_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionMemoryRule());
              	        }
                     		set(
                     			current, 
                     			"start",
                      		lv_start_1_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleFunctionMemory6174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionMemoryAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2740:1: ( (lv_end_3_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2741:1: (lv_end_3_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2741:1: (lv_end_3_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2742:3: lv_end_3_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getEndLITERALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory6195);
            lv_end_3_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionMemoryRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_3_0, 
                      		"LITERAL");
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
    // $ANTLR end "ruleFunctionMemory"


    // $ANTLR start "entryRuleConstantBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2766:1: entryRuleConstantBinarySection returns [EObject current=null] : iv_ruleConstantBinarySection= ruleConstantBinarySection EOF ;
    public final EObject entryRuleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2767:2: (iv_ruleConstantBinarySection= ruleConstantBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2768:2: iv_ruleConstantBinarySection= ruleConstantBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection6231);
            iv_ruleConstantBinarySection=ruleConstantBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantBinarySection6241); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantBinarySection"


    // $ANTLR start "ruleConstantBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2775:1: ruleConstantBinarySection returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2778:28: ( (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2779:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2779:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2779:3: otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleConstantBinarySection6278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantBinarySectionAccess().getDataKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleConstantBinarySection6290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantBinarySectionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2787:1: ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_REAL)||LA34_0==41||LA34_0==59||LA34_0==61||(LA34_0>=91 && LA34_0<=94)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2787:2: ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2787:2: ( (lv_data_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2788:1: (lv_data_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2788:1: (lv_data_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2789:3: lv_data_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstantBinarySectionAccess().getDataXExpressionParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleConstantBinarySection6312);
            	    lv_data_2_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstantBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"data",
            	              		lv_data_2_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConstantBinarySection6324); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getConstantBinarySectionAccess().getSemicolonKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleConstantBinarySection6338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantBinarySectionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleConstantBinarySection"


    // $ANTLR start "entryRuleReferenceBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2821:1: entryRuleReferenceBinarySection returns [EObject current=null] : iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF ;
    public final EObject entryRuleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2822:2: (iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2823:2: iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection6374);
            iv_ruleReferenceBinarySection=ruleReferenceBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceBinarySection6384); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceBinarySection"


    // $ANTLR start "ruleReferenceBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2830:1: ruleReferenceBinarySection returns [EObject current=null] : (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2833:28: ( (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2834:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2834:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2834:3: otherlv_0= 'include' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleReferenceBinarySection6421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceBinarySectionAccess().getIncludeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2838:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2839:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2839:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2840:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceBinarySectionAccess().getIncLinkedBinaryCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection6444);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleReferenceBinarySection"


    // $ANTLR start "entryRuleXExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2861:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2862:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2863:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression6480);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression6490); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2870:1: ruleXExpression returns [EObject current=null] : (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? ) ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_XExpression6_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2873:28: ( (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2874:1: (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2874:1: (this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2875:5: this_XExpression6_0= ruleXExpression6 (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXExpression6ParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression6_in_ruleXExpression6537);
            this_XExpression6_0=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression6_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2883:1: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2883:3: otherlv_1= ':' ( (lv_type_2_0= ruleTypeDef ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleXExpression6549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXExpressionAccess().getColonKeyword_1_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2887:1: ( (lv_type_2_0= ruleTypeDef ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2888:1: (lv_type_2_0= ruleTypeDef )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2888:1: (lv_type_2_0= ruleTypeDef )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2889:3: lv_type_2_0= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXExpressionAccess().getTypeTypeDefParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleXExpression6570);
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


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2913:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2914:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2915:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6608);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6618); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2922:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpressionLiteral_0 = null;

        EObject this_XParenthesizedExpression_1 = null;

        EObject this_XIsLiteralExpression_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_OperationCall_4 = null;

        EObject this_XStructExpression_5 = null;

        EObject this_XSizeOfExpression_6 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2925:28: ( (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2926:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2926:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            int alt36=7;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:5: this_XExpressionLiteral_0= ruleXExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression6665);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2937:5: this_XParenthesizedExpression_1= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6692);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2947:5: this_XIsLiteralExpression_2= ruleXIsLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIsLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression6719);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2957:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression6746);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2967:5: this_OperationCall_4= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getOperationCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression6773);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2977:5: this_XStructExpression_5= ruleXStructExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXStructExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6800);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2987:5: this_XSizeOfExpression_6= ruleXSizeOfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSizeOfExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6827);
                    this_XSizeOfExpression_6=ruleXSizeOfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSizeOfExpression_6; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3003:1: entryRuleXSizeOfExpression returns [EObject current=null] : iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF ;
    public final EObject entryRuleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSizeOfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3004:2: (iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3005:2: iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSizeOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6862);
            iv_ruleXSizeOfExpression=ruleXSizeOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSizeOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSizeOfExpression6872); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3012:1: ruleXSizeOfExpression returns [EObject current=null] : (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) ;
    public final EObject ruleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3015:28: ( (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3016:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3016:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3016:3: otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleXSizeOfExpression6909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXSizeOfExpressionAccess().getSizeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXSizeOfExpression6921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSizeOfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3024:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3025:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3025:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3026:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression6942);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXSizeOfExpression6954); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3054:1: entryRuleXStructExpression returns [EObject current=null] : iv_ruleXStructExpression= ruleXStructExpression EOF ;
    public final EObject entryRuleXStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStructExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3055:2: (iv_ruleXStructExpression= ruleXStructExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3056:2: iv_ruleXStructExpression= ruleXStructExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStructExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6990);
            iv_ruleXStructExpression=ruleXStructExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStructExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStructExpression7000); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3063:1: ruleXStructExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) ;
    public final EObject ruleXStructExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3066:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:2: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3069:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXStructExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXStructExpression7048);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleXStructExpression7060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXStructExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3086:1: ( (lv_values_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3087:1: (lv_values_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3087:1: (lv_values_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3088:3: lv_values_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression7081);
            lv_values_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXStructExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3104:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    int LA37_1 = input.LA(2);

                    if ( ((LA37_1>=RULE_ID && LA37_1<=RULE_REAL)||LA37_1==41||LA37_1==59||LA37_1==61||(LA37_1>=91 && LA37_1<=94)) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3104:4: otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXStructExpression7094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXStructExpressionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3108:1: ( (lv_values_4_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3109:1: (lv_values_4_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3109:1: (lv_values_4_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3110:3: lv_values_4_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression7115);
            	    lv_values_4_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXStructExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3126:4: (otherlv_5= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3126:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXStructExpression7130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXStructExpression7144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXStructExpressionAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3142:1: entryRuleXExpression1 returns [EObject current=null] : iv_ruleXExpression1= ruleXExpression1 EOF ;
    public final EObject entryRuleXExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3143:2: (iv_ruleXExpression1= ruleXExpression1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3144:2: iv_ruleXExpression1= ruleXExpression1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression1_in_entryRuleXExpression17180);
            iv_ruleXExpression1=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression17190); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3151:1: ruleXExpression1 returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) ;
    public final EObject ruleXExpression1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3154:28: ( ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3155:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3155:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3155:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3155:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=91 && LA39_0<=94)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3156:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3156:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3157:3: lv_operator_0_0= ruleUNARY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression1Access().getOperatorUNARY_OPERATOREnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression17236);
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
            	    break loop39;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3173:3: ( (lv_a_1_0= ruleXExpression0 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3174:1: (lv_a_1_0= ruleXExpression0 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3174:1: (lv_a_1_0= ruleXExpression0 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3175:3: lv_a_1_0= ruleXExpression0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression1Access().getAXExpression0ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression0_in_ruleXExpression17258);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3199:1: entryRuleXExpression0 returns [EObject current=null] : iv_ruleXExpression0= ruleXExpression0 EOF ;
    public final EObject entryRuleXExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression0 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3200:2: (iv_ruleXExpression0= ruleXExpression0 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3201:2: iv_ruleXExpression0= ruleXExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression0Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression0_in_entryRuleXExpression07294);
            iv_ruleXExpression0=ruleXExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression0; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression07304); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3208:1: ruleXExpression0 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleXExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_member_2_0=null;
        EObject lv_a_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:28: ( ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:2: ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:2: ( (lv_a_0_0= ruleXExpressionM1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3213:1: (lv_a_0_0= ruleXExpressionM1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3213:1: (lv_a_0_0= ruleXExpressionM1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3214:3: lv_a_0_0= ruleXExpressionM1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression0Access().getAXExpressionM1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_ruleXExpression07350);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3230:2: (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==60) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3230:4: otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXExpression07363); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpression0Access().getHyphenMinusGreaterThanSignKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3234:1: ( (lv_member_2_0= RULE_ID ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3235:1: (lv_member_2_0= RULE_ID )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3235:1: (lv_member_2_0= RULE_ID )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3236:3: lv_member_2_0= RULE_ID
            	    {
            	    lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXExpression07380); if (state.failed) return current;
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
    // $ANTLR end "ruleXExpression0"


    // $ANTLR start "entryRuleXExpressionM1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3260:1: entryRuleXExpressionM1 returns [EObject current=null] : iv_ruleXExpressionM1= ruleXExpressionM1 EOF ;
    public final EObject entryRuleXExpressionM1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionM1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3261:2: (iv_ruleXExpressionM1= ruleXExpressionM1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3262:2: iv_ruleXExpressionM1= ruleXExpressionM1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionM1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM17423);
            iv_ruleXExpressionM1=ruleXExpressionM1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionM1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionM17433); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3269:1: ruleXExpressionM1 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleXExpressionM1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_index_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:28: ( ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:2: ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3273:2: ( (lv_a_0_0= ruleXPrimaryExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3274:1: (lv_a_0_0= ruleXPrimaryExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3274:1: (lv_a_0_0= ruleXPrimaryExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3275:3: lv_a_0_0= ruleXPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionM1Access().getAXPrimaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM17479);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3291:2: (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3291:4: otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleXExpressionM17492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpressionM1Access().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3295:1: ( (lv_index_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3296:1: (lv_index_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3296:1: (lv_index_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3297:3: lv_index_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionM1Access().getIndexXExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionM17513);
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

            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXExpressionM17525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXExpressionM1Access().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleXExpressionM1"


    // $ANTLR start "entryRuleXExpression2"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3325:1: entryRuleXExpression2 returns [EObject current=null] : iv_ruleXExpression2= ruleXExpression2 EOF ;
    public final EObject entryRuleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression2 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3326:2: (iv_ruleXExpression2= ruleXExpression2 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3327:2: iv_ruleXExpression2= ruleXExpression2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression2Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression2_in_entryRuleXExpression27563);
            iv_ruleXExpression2=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression27573); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3334:1: ruleXExpression2 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3337:28: ( ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:2: ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:2: ( (lv_a_0_0= ruleXExpression1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3339:1: (lv_a_0_0= ruleXExpression1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3339:1: (lv_a_0_0= ruleXExpression1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3340:3: lv_a_0_0= ruleXExpression1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression2Access().getAXExpression1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression1_in_ruleXExpression27619);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3356:2: ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 95:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 97:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt42=1;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3356:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3356:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3356:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3361:1: (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3362:3: lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getOpMULTIPLICATIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression27651);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3378:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3379:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3379:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3380:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression27672);
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
    // $ANTLR end "ruleXExpression2"


    // $ANTLR start "entryRuleXExpression3"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3404:1: entryRuleXExpression3 returns [EObject current=null] : iv_ruleXExpression3= ruleXExpression3 EOF ;
    public final EObject entryRuleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression3 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3405:2: (iv_ruleXExpression3= ruleXExpression3 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3406:2: iv_ruleXExpression3= ruleXExpression3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression3Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression3_in_entryRuleXExpression37710);
            iv_ruleXExpression3=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression37720); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3413:1: ruleXExpression3 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3416:28: ( ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3417:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3417:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3417:2: ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3417:2: ( (lv_a_0_0= ruleXExpression2 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3418:1: (lv_a_0_0= ruleXExpression2 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3418:1: (lv_a_0_0= ruleXExpression2 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3419:3: lv_a_0_0= ruleXExpression2
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression3Access().getAXExpression2ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression37766);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:2: ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==98) && (synpred2_InternalESyntax())) {
                    alt43=1;
                }
                else if ( (LA43_0==91) && (synpred2_InternalESyntax())) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:4: ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3440:1: (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3441:3: lv_op_1_0= ruleADDITIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getOpADDITIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression37798);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3457:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3458:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3458:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3459:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression37819);
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
    // $ANTLR end "ruleXExpression3"


    // $ANTLR start "entryRuleXExpression4"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3483:1: entryRuleXExpression4 returns [EObject current=null] : iv_ruleXExpression4= ruleXExpression4 EOF ;
    public final EObject entryRuleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression4 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3484:2: (iv_ruleXExpression4= ruleXExpression4 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3485:2: iv_ruleXExpression4= ruleXExpression4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression4Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression4_in_entryRuleXExpression47857);
            iv_ruleXExpression4=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression47867); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3492:1: ruleXExpression4 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) ;
    public final EObject ruleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3495:28: ( ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:2: ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:2: ( (lv_a_0_0= ruleXExpression3 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3497:1: (lv_a_0_0= ruleXExpression3 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3497:1: (lv_a_0_0= ruleXExpression3 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3498:3: lv_a_0_0= ruleXExpression3
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression4Access().getAXExpression3ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression47913);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:2: ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==99) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==100) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==101) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==102) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==40) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }
                else if ( (LA44_0==39) && (synpred3_InternalESyntax())) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:4: ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3519:1: (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3520:3: lv_op_1_0= ruleEQUALITY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getOpEQUALITY_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression47945);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3536:2: ( (lv_b_2_0= ruleXExpression3 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3537:1: (lv_b_2_0= ruleXExpression3 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3537:1: (lv_b_2_0= ruleXExpression3 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3538:3: lv_b_2_0= ruleXExpression3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getBXExpression3ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression47966);
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
    // $ANTLR end "ruleXExpression4"


    // $ANTLR start "entryRuleXExpression5"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3562:1: entryRuleXExpression5 returns [EObject current=null] : iv_ruleXExpression5= ruleXExpression5 EOF ;
    public final EObject entryRuleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression5 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3563:2: (iv_ruleXExpression5= ruleXExpression5 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3564:2: iv_ruleXExpression5= ruleXExpression5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression5Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression5_in_entryRuleXExpression58004);
            iv_ruleXExpression5=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression58014); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3571:1: ruleXExpression5 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) ;
    public final EObject ruleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3574:28: ( ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:2: ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:2: ( (lv_a_0_0= ruleXExpression4 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:1: (lv_a_0_0= ruleXExpression4 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:1: (lv_a_0_0= ruleXExpression4 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3577:3: lv_a_0_0= ruleXExpression4
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression5Access().getAXExpression4ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression58060);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:2: ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==103) && (synpred4_InternalESyntax())) {
                    alt45=1;
                }
                else if ( (LA45_0==104) && (synpred4_InternalESyntax())) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:4: ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3598:1: (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3599:3: lv_op_1_0= ruleBOOLEAN_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getOpBOOLEAN_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression58092);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3615:2: ( (lv_b_2_0= ruleXExpression4 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3616:1: (lv_b_2_0= ruleXExpression4 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3616:1: (lv_b_2_0= ruleXExpression4 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3617:3: lv_b_2_0= ruleXExpression4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getBXExpression4ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression58113);
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
            	    break loop45;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3641:1: entryRuleXExpression6 returns [EObject current=null] : iv_ruleXExpression6= ruleXExpression6 EOF ;
    public final EObject entryRuleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression6 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3642:2: (iv_ruleXExpression6= ruleXExpression6 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3643:2: iv_ruleXExpression6= ruleXExpression6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression6Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression6_in_entryRuleXExpression68151);
            iv_ruleXExpression6=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression6; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression68161); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3650:1: ruleXExpression6 returns [EObject current=null] : ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) ;
    public final EObject ruleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3653:28: ( ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:4: ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3659:1: (lv_ref_0_0= ruleVariableReference )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3660:3: lv_ref_0_0= ruleVariableReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression6Access().getRefVariableReferenceParserRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableReference_in_ruleXExpression68218);
            	    lv_ref_0_0=ruleVariableReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression6Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ref",
            	              		lv_ref_0_0, 
            	              		"VariableReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXExpression6Access().getOpSingleAssignParserRuleCall_0_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXExpression68234);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3684:3: ( (lv_a_2_0= ruleXExpression5 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:1: (lv_a_2_0= ruleXExpression5 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:1: (lv_a_2_0= ruleXExpression5 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3686:3: lv_a_2_0= ruleXExpression5
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression6Access().getAXExpression5ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression5_in_ruleXExpression68256);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3710:1: entryRuleXExpressionLiteral returns [EObject current=null] : iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF ;
    public final EObject entryRuleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionLiteral = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3711:2: (iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3712:2: iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral8292);
            iv_ruleXExpressionLiteral=ruleXExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionLiteral8302); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3719:1: ruleXExpressionLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3723:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3723:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3724:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3724:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3725:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral8347);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3749:1: entryRuleXTopLevelExpression returns [EObject current=null] : iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF ;
    public final EObject entryRuleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTopLevelExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3750:2: (iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3751:2: iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression8382);
            iv_ruleXTopLevelExpression=ruleXTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTopLevelExpression8392); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3758:1: ruleXTopLevelExpression returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | this_XIfExpression_4= ruleXIfExpression | this_XWhileExpression_5= ruleXWhileExpression ) ;
    public final EObject ruleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Annotation_0 = null;

        EObject this_XExpression_2 = null;

        EObject this_XIfExpression_4 = null;

        EObject this_XWhileExpression_5 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3761:28: ( ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | this_XIfExpression_4= ruleXIfExpression | this_XWhileExpression_5= ruleXWhileExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3762:1: ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | this_XIfExpression_4= ruleXIfExpression | this_XWhileExpression_5= ruleXWhileExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3762:1: ( (this_Annotation_0= ruleAnnotation otherlv_1= ';' ) | (this_XExpression_2= ruleXExpression otherlv_3= ';' ) | this_XIfExpression_4= ruleXIfExpression | this_XWhileExpression_5= ruleXWhileExpression )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_HEXINT:
            case RULE_BINARY:
            case RULE_REAL:
            case 41:
            case 59:
            case 61:
            case 91:
            case 92:
            case 93:
            case 94:
                {
                alt47=2;
                }
                break;
            case 62:
                {
                alt47=3;
                }
                break;
            case 64:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3762:2: (this_Annotation_0= ruleAnnotation otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3762:2: (this_Annotation_0= ruleAnnotation otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3763:5: this_Annotation_0= ruleAnnotation otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getAnnotationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleXTopLevelExpression8440);
                    this_Annotation_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXTopLevelExpression8451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3776:6: (this_XExpression_2= ruleXExpression otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3776:6: (this_XExpression_2= ruleXExpression otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3777:5: this_XExpression_2= ruleXExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTopLevelExpression8481);
                    this_XExpression_2=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXTopLevelExpression8492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3791:5: this_XIfExpression_4= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXIfExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression8521);
                    this_XIfExpression_4=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3801:5: this_XWhileExpression_5= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXWhileExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXTopLevelExpression8548);
                    this_XWhileExpression_5=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_5; 
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
    // $ANTLR end "ruleXTopLevelExpression"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3817:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3818:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3819:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign8584);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign8595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3826:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3829:28: (kw= '=' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3831:2: kw= '='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpSingleAssign8632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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


    // $ANTLR start "entryRuleXIsLiteralExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3844:1: entryRuleXIsLiteralExpression returns [EObject current=null] : iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF ;
    public final EObject entryRuleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIsLiteralExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3845:2: (iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3846:2: iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIsLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression8671);
            iv_ruleXIsLiteralExpression=ruleXIsLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIsLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIsLiteralExpression8681); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:1: ruleXIsLiteralExpression returns [EObject current=null] : (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3856:28: ( (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:3: otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleXIsLiteralExpression8718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIsLiteralExpressionAccess().getIsliteralKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXIsLiteralExpression8730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIsLiteralExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3865:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3866:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3866:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3867:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression8751);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXIsLiteralExpression8763); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXIfExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3895:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3896:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3897:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8799);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression8809); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3904:1: ruleXIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_9_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3907:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3908:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3908:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3908:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleXIfExpression8846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIfExpressionAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression8858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3916:1: ( (lv_if_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3917:1: (lv_if_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3917:1: (lv_if_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3918:3: lv_if_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8879);
            lv_if_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression8891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleXIfExpression8903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3942:1: ( (lv_then_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3943:1: (lv_then_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3943:1: (lv_then_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3944:3: lv_then_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression8924);
            lv_then_5_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXIfExpression8936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:1: ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==63) && (synpred6_InternalESyntax())) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:2: ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}'
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:2: ( ( 'else' )=>otherlv_7= 'else' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:3: ( 'else' )=>otherlv_7= 'else'
                    {
                    otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleXIfExpression8957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXIfExpressionAccess().getElseKeyword_7_0());
                          
                    }

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleXIfExpression8970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3973:1: ( (lv_else_9_0= ruleOperationBlock ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3974:1: (lv_else_9_0= ruleOperationBlock )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3974:1: (lv_else_9_0= ruleOperationBlock )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3975:3: lv_else_9_0= ruleOperationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseOperationBlockParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression8991);
                    lv_else_9_0=ruleOperationBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_9_0, 
                              		"OperationBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleXIfExpression9003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getXIfExpressionAccess().getRightCurlyBracketKeyword_7_3());
                          
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4003:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4004:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4005:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9041);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression9051); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:1: ruleXWhileExpression returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_2_0 = null;

        EObject lv_do_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4015:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4016:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4016:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4016:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleXWhileExpression9088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression9100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4024:1: ( (lv_cond_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4025:1: (lv_cond_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4025:1: (lv_cond_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4026:3: lv_cond_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getCondXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9121);
            lv_cond_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression9133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleXWhileExpression9145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4050:1: ( (lv_do_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4051:1: (lv_do_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4051:1: (lv_do_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4052:3: lv_do_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getDoOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXWhileExpression9166);
            lv_do_5_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"do",
                      		lv_do_5_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXWhileExpression9178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXWhileExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4080:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4081:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4082:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9214);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression9224); if (state.failed) return current;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4089:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4092:28: ( (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4093:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4093:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4093:3: otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression9261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4097:1: ( (lv_a_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4098:1: (lv_a_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4098:1: (lv_a_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4099:3: lv_a_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression9282);
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

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression9294); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4127:1: ruleIntegerKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) ) ;
    public final Enumerator ruleIntegerKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4129:28: ( ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            else if ( (LA49_0==66) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:2: (enumLiteral_0= 'unsigned' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:2: (enumLiteral_0= 'unsigned' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:4: enumLiteral_0= 'unsigned'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleIntegerKind9344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIntegerKindAccess().getUNSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIntegerKindAccess().getUNSIGNEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4136:6: (enumLiteral_1= 'signed' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4136:6: (enumLiteral_1= 'signed' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4136:8: enumLiteral_1= 'signed'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleIntegerKind9361); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4146:1: ruleParameterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) ;
    public final Enumerator ruleParameterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4148:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4149:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4149:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt50=1;
                }
                break;
            case 68:
                {
                alt50=2;
                }
                break;
            case 35:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4149:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4149:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4149:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleParameterKind9406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4155:6: (enumLiteral_1= 'var' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4155:6: (enumLiteral_1= 'var' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4155:8: enumLiteral_1= 'var'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleParameterKind9423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4161:6: (enumLiteral_2= 'const' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4161:6: (enumLiteral_2= 'const' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4161:8: enumLiteral_2= 'const'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleParameterKind9440); if (state.failed) return current;
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


    // $ANTLR start "ruleOperationRole"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4171:1: ruleOperationRole returns [Enumerator current=null] : ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) ;
    public final Enumerator ruleOperationRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4173:28: ( ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            int alt51=20;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt51=1;
                }
                break;
            case 70:
                {
                alt51=2;
                }
                break;
            case 71:
                {
                alt51=3;
                }
                break;
            case 72:
                {
                alt51=4;
                }
                break;
            case 73:
                {
                alt51=5;
                }
                break;
            case 74:
                {
                alt51=6;
                }
                break;
            case 75:
                {
                alt51=7;
                }
                break;
            case 76:
                {
                alt51=8;
                }
                break;
            case 77:
                {
                alt51=9;
                }
                break;
            case 78:
                {
                alt51=10;
                }
                break;
            case 79:
                {
                alt51=11;
                }
                break;
            case 80:
                {
                alt51=12;
                }
                break;
            case 81:
                {
                alt51=13;
                }
                break;
            case 82:
                {
                alt51=14;
                }
                break;
            case 83:
                {
                alt51=15;
                }
                break;
            case 84:
                {
                alt51=16;
                }
                break;
            case 85:
                {
                alt51=17;
                }
                break;
            case 86:
                {
                alt51=18;
                }
                break;
            case 87:
                {
                alt51=19;
                }
                break;
            case 88:
                {
                alt51=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:2: (enumLiteral_0= 'SET' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:2: (enumLiteral_0= 'SET' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:4: enumLiteral_0= 'SET'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleOperationRole9485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4180:6: (enumLiteral_1= 'ADD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4180:6: (enumLiteral_1= 'ADD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4180:8: enumLiteral_1= 'ADD'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleOperationRole9502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:6: (enumLiteral_2= 'SUBTRACT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:6: (enumLiteral_2= 'SUBTRACT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:8: enumLiteral_2= 'SUBTRACT'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleOperationRole9519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4192:6: (enumLiteral_3= 'AND' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4192:6: (enumLiteral_3= 'AND' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4192:8: enumLiteral_3= 'AND'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleOperationRole9536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4198:6: (enumLiteral_4= 'OR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4198:6: (enumLiteral_4= 'OR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4198:8: enumLiteral_4= 'OR'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleOperationRole9553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4204:6: (enumLiteral_5= 'XOR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4204:6: (enumLiteral_5= 'XOR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4204:8: enumLiteral_5= 'XOR'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_74_in_ruleOperationRole9570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4210:6: (enumLiteral_6= 'EQUALS' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4210:6: (enumLiteral_6= 'EQUALS' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4210:8: enumLiteral_6= 'EQUALS'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_75_in_ruleOperationRole9587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4216:6: (enumLiteral_7= 'BRANCH' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4216:6: (enumLiteral_7= 'BRANCH' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4216:8: enumLiteral_7= 'BRANCH'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_76_in_ruleOperationRole9604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4222:6: (enumLiteral_8= 'UC_GOTO' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4222:6: (enumLiteral_8= 'UC_GOTO' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4222:8: enumLiteral_8= 'UC_GOTO'
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_77_in_ruleOperationRole9621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4228:6: (enumLiteral_9= 'NOT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4228:6: (enumLiteral_9= 'NOT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4228:8: enumLiteral_9= 'NOT'
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_78_in_ruleOperationRole9638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4234:6: (enumLiteral_10= 'INDIRECTION' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4234:6: (enumLiteral_10= 'INDIRECTION' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4234:8: enumLiteral_10= 'INDIRECTION'
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_79_in_ruleOperationRole9655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4240:6: (enumLiteral_11= 'CLEAR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4240:6: (enumLiteral_11= 'CLEAR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4240:8: enumLiteral_11= 'CLEAR'
                    {
                    enumLiteral_11=(Token)match(input,80,FOLLOW_80_in_ruleOperationRole9672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4246:6: (enumLiteral_12= 'INCREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4246:6: (enumLiteral_12= 'INCREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4246:8: enumLiteral_12= 'INCREMENT'
                    {
                    enumLiteral_12=(Token)match(input,81,FOLLOW_81_in_ruleOperationRole9689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:6: (enumLiteral_13= 'DECREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:6: (enumLiteral_13= 'DECREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:8: enumLiteral_13= 'DECREMENT'
                    {
                    enumLiteral_13=(Token)match(input,82,FOLLOW_82_in_ruleOperationRole9706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4258:6: (enumLiteral_14= 'DIV' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4258:6: (enumLiteral_14= 'DIV' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4258:8: enumLiteral_14= 'DIV'
                    {
                    enumLiteral_14=(Token)match(input,83,FOLLOW_83_in_ruleOperationRole9723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4264:6: (enumLiteral_15= 'MOD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4264:6: (enumLiteral_15= 'MOD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4264:8: enumLiteral_15= 'MOD'
                    {
                    enumLiteral_15=(Token)match(input,84,FOLLOW_84_in_ruleOperationRole9740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4270:6: (enumLiteral_16= 'LT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4270:6: (enumLiteral_16= 'LT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4270:8: enumLiteral_16= 'LT'
                    {
                    enumLiteral_16=(Token)match(input,85,FOLLOW_85_in_ruleOperationRole9757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4276:6: (enumLiteral_17= 'LTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4276:6: (enumLiteral_17= 'LTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4276:8: enumLiteral_17= 'LTE'
                    {
                    enumLiteral_17=(Token)match(input,86,FOLLOW_86_in_ruleOperationRole9774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4282:6: (enumLiteral_18= 'GT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4282:6: (enumLiteral_18= 'GT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4282:8: enumLiteral_18= 'GT'
                    {
                    enumLiteral_18=(Token)match(input,87,FOLLOW_87_in_ruleOperationRole9791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4288:6: (enumLiteral_19= 'GTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4288:6: (enumLiteral_19= 'GTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4288:8: enumLiteral_19= 'GTE'
                    {
                    enumLiteral_19=(Token)match(input,88,FOLLOW_88_in_ruleOperationRole9808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getGTEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getOperationRoleAccess().getGTEEnumLiteralDeclaration_19()); 
                          
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
    // $ANTLR end "ruleOperationRole"


    // $ANTLR start "ruleBinaryType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4298:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'intelHexfile' ) | (enumLiteral_2= 'SRECHexfile' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4300:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'intelHexfile' ) | (enumLiteral_2= 'SRECHexfile' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4301:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'intelHexfile' ) | (enumLiteral_2= 'SRECHexfile' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4301:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'intelHexfile' ) | (enumLiteral_2= 'SRECHexfile' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt52=1;
                }
                break;
            case 89:
                {
                alt52=2;
                }
                break;
            case 90:
                {
                alt52=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4301:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4301:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4301:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleBinaryType9853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4307:6: (enumLiteral_1= 'intelHexfile' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4307:6: (enumLiteral_1= 'intelHexfile' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4307:8: enumLiteral_1= 'intelHexfile'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleBinaryType9870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getINTELHEXFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryTypeAccess().getINTELHEXFILEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4313:6: (enumLiteral_2= 'SRECHexfile' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4313:6: (enumLiteral_2= 'SRECHexfile' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4313:8: enumLiteral_2= 'SRECHexfile'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleBinaryType9887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getSRECHEXFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryTypeAccess().getSRECHEXFILEEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleBinaryType"


    // $ANTLR start "ruleUNARY_OPERATOR"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4323:1: ruleUNARY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) ;
    public final Enumerator ruleUNARY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4325:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4326:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4326:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt53=1;
                }
                break;
            case 92:
                {
                alt53=2;
                }
                break;
            case 93:
                {
                alt53=3;
                }
                break;
            case 94:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4326:2: (enumLiteral_0= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4326:2: (enumLiteral_0= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4326:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleUNARY_OPERATOR9932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4332:6: (enumLiteral_1= '!' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4332:6: (enumLiteral_1= '!' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4332:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_92_in_ruleUNARY_OPERATOR9949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4338:6: (enumLiteral_2= '&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4338:6: (enumLiteral_2= '&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4338:8: enumLiteral_2= '&'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_93_in_ruleUNARY_OPERATOR9966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4344:6: (enumLiteral_3= '@' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4344:6: (enumLiteral_3= '@' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4344:8: enumLiteral_3= '@'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_94_in_ruleUNARY_OPERATOR9983); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4354:1: ruleMULTIPLICATIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4356:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4357:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4357:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt54=1;
                }
                break;
            case 96:
                {
                alt54=2;
                }
                break;
            case 97:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4357:2: (enumLiteral_0= '*' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4357:2: (enumLiteral_0= '*' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4357:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleMULTIPLICATIVE_OPERATOR10028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4363:6: (enumLiteral_1= '/' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4363:6: (enumLiteral_1= '/' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4363:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleMULTIPLICATIVE_OPERATOR10045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4369:6: (enumLiteral_2= '%' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4369:6: (enumLiteral_2= '%' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4369:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_97_in_ruleMULTIPLICATIVE_OPERATOR10062); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4379:1: ruleADDITIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleADDITIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4381:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4382:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4382:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==98) ) {
                alt55=1;
            }
            else if ( (LA55_0==91) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4382:2: (enumLiteral_0= '+' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4382:2: (enumLiteral_0= '+' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4382:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleADDITIVE_OPERATOR10107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4388:6: (enumLiteral_1= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4388:6: (enumLiteral_1= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4388:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleADDITIVE_OPERATOR10124); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4398:1: ruleEQUALITY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4400:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4401:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4401:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt56=1;
                }
                break;
            case 100:
                {
                alt56=2;
                }
                break;
            case 101:
                {
                alt56=3;
                }
                break;
            case 102:
                {
                alt56=4;
                }
                break;
            case 40:
                {
                alt56=5;
                }
                break;
            case 39:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4401:2: (enumLiteral_0= '==' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4401:2: (enumLiteral_0= '==' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4401:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleEQUALITY_OPERATOR10169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4407:6: (enumLiteral_1= '!=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4407:6: (enumLiteral_1= '!=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4407:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleEQUALITY_OPERATOR10186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4413:6: (enumLiteral_2= '>=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4413:6: (enumLiteral_2= '>=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4413:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_101_in_ruleEQUALITY_OPERATOR10203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4419:6: (enumLiteral_3= '<=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4419:6: (enumLiteral_3= '<=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4419:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_102_in_ruleEQUALITY_OPERATOR10220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4425:6: (enumLiteral_4= '>' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4425:6: (enumLiteral_4= '>' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4425:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_ruleEQUALITY_OPERATOR10237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4431:6: (enumLiteral_5= '<' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4431:6: (enumLiteral_5= '<' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4431:8: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_39_in_ruleEQUALITY_OPERATOR10254); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4441:1: ruleBOOLEAN_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBOOLEAN_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4443:28: ( ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4444:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4444:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==103) ) {
                alt57=1;
            }
            else if ( (LA57_0==104) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4444:2: (enumLiteral_0= '||' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4444:2: (enumLiteral_0= '||' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4444:4: enumLiteral_0= '||'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_103_in_ruleBOOLEAN_OPERATOR10299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4450:6: (enumLiteral_1= '&&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4450:6: (enumLiteral_1= '&&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4450:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_104_in_ruleBOOLEAN_OPERATOR10316); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalESyntax
    public final void synpred1_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3356:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3357:1: ( ruleMULTIPLICATIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3357:1: ( ruleMULTIPLICATIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3358:1: ruleMULTIPLICATIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax7634);
        ruleMULTIPLICATIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalESyntax

    // $ANTLR start synpred2_InternalESyntax
    public final void synpred2_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:4: ( ( ruleADDITIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3436:1: ( ruleADDITIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3436:1: ( ruleADDITIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:1: ruleADDITIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax7781);
        ruleADDITIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalESyntax

    // $ANTLR start synpred3_InternalESyntax
    public final void synpred3_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:4: ( ( ruleEQUALITY_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3515:1: ( ruleEQUALITY_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3515:1: ( ruleEQUALITY_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3516:1: ruleEQUALITY_OPERATOR
        {
        pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax7928);
        ruleEQUALITY_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalESyntax

    // $ANTLR start synpred4_InternalESyntax
    public final void synpred4_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:4: ( ( ruleBOOLEAN_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3594:1: ( ruleBOOLEAN_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3594:1: ( ruleBOOLEAN_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:1: ruleBOOLEAN_OPERATOR
        {
        pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax8075);
        ruleBOOLEAN_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalESyntax

    // $ANTLR start synpred5_InternalESyntax
    public final void synpred5_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:4: ( ( ruleVariableReference ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:1: ( ruleVariableReference )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:1: ( ruleVariableReference )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3656:1: ruleVariableReference
        {
        pushFollow(FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax8201);
        ruleVariableReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalESyntax

    // $ANTLR start synpred6_InternalESyntax
    public final void synpred6_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:3: ( 'else' )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3964:5: 'else'
        {
        match(input,63,FOLLOW_63_in_synpred6_InternalESyntax8949); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalESyntax

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
    public final boolean synpred6_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalESyntax_fragment(); // can never throw exception
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
    public final boolean synpred5_InternalESyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalESyntax_fragment(); // can never throw exception
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA12_eotS =
        "\10\uffff";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\4\3\uffff\1\4\1\uffff\2\4";
    static final String DFA12_maxS =
        "\1\136\3\uffff\1\150\1\uffff\1\4\1\150";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\2\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\4\4\5\7\uffff\1\5\7\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2"+
            "\uffff\1\3\5\uffff\1\2\1\1\1\uffff\1\5\21\uffff\1\5\1\uffff"+
            "\2\5\1\uffff\1\5\2\3\30\uffff\4\5",
            "",
            "",
            "",
            "\1\3\11\uffff\1\6\5\uffff\1\5\2\uffff\1\5\3\uffff\1\5\5\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\3\5\22\uffff\1\5\36\uffff\1\5\3\uffff"+
            "\12\5",
            "",
            "\1\7",
            "\1\3\11\uffff\1\6\5\uffff\1\5\2\uffff\1\5\3\uffff\1\5\5\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\3\5\22\uffff\1\5\36\uffff\1\5\3\uffff"+
            "\12\5"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1316:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )";
        }
    }
    static final String DFA20_eotS =
        "\6\uffff";
    static final String DFA20_eofS =
        "\6\uffff";
    static final String DFA20_minS =
        "\2\4\2\uffff\2\4";
    static final String DFA20_maxS =
        "\1\136\1\150\2\uffff\1\4\1\150";
    static final String DFA20_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA20_specialS =
        "\6\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\4\2\17\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\10"+
            "\uffff\1\2\21\uffff\1\2\1\uffff\1\2\3\uffff\2\3\30\uffff\4\2",
            "\1\3\11\uffff\1\4\5\uffff\1\2\2\uffff\1\2\3\uffff\1\2\5\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\3\2\22\uffff\1\2\36\uffff\1\2\3\uffff"+
            "\12\2",
            "",
            "",
            "\1\5",
            "\1\3\11\uffff\1\4\5\uffff\1\2\2\uffff\1\2\3\uffff\1\2\5\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\3\2\22\uffff\1\2\36\uffff\1\2\3\uffff"+
            "\12\2"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1914:1: ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) )";
        }
    }
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\4\uffff\1\7\5\uffff\1\7";
    static final String DFA36_minS =
        "\1\4\3\uffff\1\16\1\uffff\1\4\3\uffff\1\16";
    static final String DFA36_maxS =
        "\1\75\3\uffff\1\150\1\uffff\1\4\3\uffff\1\150";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\uffff";
    static final String DFA36_specialS =
        "\13\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\4\4\1\40\uffff\1\2\21\uffff\1\5\1\uffff\1\3",
            "",
            "",
            "",
            "\1\6\4\uffff\2\7\6\uffff\2\7\4\uffff\1\11\1\7\2\uffff\1\7"+
            "\1\uffff\2\7\1\10\1\7\21\uffff\1\7\36\uffff\1\7\3\uffff\12\7",
            "",
            "\1\12",
            "",
            "",
            "",
            "\1\6\4\uffff\2\7\6\uffff\2\7\4\uffff\1\11\1\7\2\uffff\1\7"+
            "\1\uffff\2\7\1\10\1\7\21\uffff\1\7\36\uffff\1\7\3\uffff\12\7"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2926:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )";
        }
    }
    static final String DFA46_eotS =
        "\6\uffff";
    static final String DFA46_eofS =
        "\2\uffff\1\1\2\uffff\1\1";
    static final String DFA46_minS =
        "\1\4\1\uffff\1\16\1\4\1\uffff\1\16";
    static final String DFA46_maxS =
        "\1\136\1\uffff\1\150\1\4\1\uffff\1\150";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA46_specialS =
        "\2\uffff\1\0\2\uffff\1\1}>";
    static final String[] DFA46_transitionS = {
            "\1\2\4\1\40\uffff\1\1\21\uffff\1\1\1\uffff\1\1\35\uffff\4\1",
            "",
            "\1\3\4\uffff\2\1\2\uffff\1\4\3\uffff\2\1\4\uffff\2\1\2\uffff"+
            "\1\1\1\uffff\4\1\21\uffff\1\1\36\uffff\1\1\3\uffff\12\1",
            "\1\5",
            "",
            "\1\3\4\uffff\2\1\2\uffff\1\4\3\uffff\2\1\4\uffff\2\1\2\uffff"+
            "\1\1\1\uffff\4\1\21\uffff\1\1\36\uffff\1\1\3\uffff\12\1"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()* loopback of 3654:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA46_2==14) ) {s = 3;}

                        else if ( (LA46_2==23) && (synpred5_InternalESyntax())) {s = 4;}

                        else if ( (LA46_2==EOF||(LA46_2>=19 && LA46_2<=20)||(LA46_2>=27 && LA46_2<=28)||(LA46_2>=33 && LA46_2<=34)||LA46_2==37||(LA46_2>=39 && LA46_2<=42)||LA46_2==60||LA46_2==91||(LA46_2>=95 && LA46_2<=104)) ) {s = 1;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA46_5==EOF||(LA46_5>=19 && LA46_5<=20)||(LA46_5>=27 && LA46_5<=28)||(LA46_5>=33 && LA46_5<=34)||LA46_5==37||(LA46_5>=39 && LA46_5<=42)||LA46_5==60||LA46_5==91||(LA46_5>=95 && LA46_5<=104)) ) {s = 1;}

                        else if ( (LA46_5==14) ) {s = 3;}

                        else if ( (LA46_5==23) && (synpred5_InternalESyntax())) {s = 4;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleCompilationUnit132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName246 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName280 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLITERAL379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLITERAL405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleLITERAL431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLITERAL457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDefinition_in_entryRuleAnnotationDefinition502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationDefinition512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotationDefinition549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationDefinition566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLibrary757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary778 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleLibrary791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary814 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleLibrary827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary850 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleLibrary866 = new BitSet(new long[]{0x0000101925608012L,0x0000000000000006L});
    public static final BitSet FOLLOW_21_in_ruleLibrary879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLibrary914 = new BitSet(new long[]{0x0000101925608012L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_ruleLibrary937 = new BitSet(new long[]{0x0000101925408012L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibraryItem984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLibraryItem1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleLibraryItem1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLibraryItem1086 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLibraryItem1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleLibraryItem1127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLibraryItem1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_ruleLibraryItem1168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLibraryItem1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDefinition_in_ruleLibraryItem1236 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLibraryItem1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1348 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleType1365 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType1386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleType1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_ruleTypeDef1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_ruleTypeDef1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_ruleTypeDef1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_ruleTypeDef1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_ruleTypeDef1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerTypeDef1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePointerTypeDef1681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePointerTypeDef1693 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rulePointerTypeDef1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDef1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArrayTypeDef1797 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayTypeDef1809 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayTypeDef1830 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayTypeDef1842 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArrayTypeDef1854 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleArrayTypeDef1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTypeDef1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRefTypeDef1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDef2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataTypeDef_in_ruleDataTypeDef2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedDataTypeDef_in_ruleDataTypeDef2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedDataTypeDef_in_entryRuleFixedDataTypeDef2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedDataTypeDef2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFixedDataTypeDef2169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedDataTypeDef2186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFixedDataTypeDef2203 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFixedDataTypeDef2215 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFixedDataTypeDef2227 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleFixedDataTypeDef2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataTypeDef_in_entryRuleIntegerDataTypeDef2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDataTypeDef2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerKind_in_ruleIntegerDataTypeDef2341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerDataTypeDef2358 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIntegerDataTypeDef2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDef2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStructTypeDef2467 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStructTypeDef2479 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2500 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleStructTypeDef2513 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2534 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_ruleStructTypeDef2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDefMember2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember2649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructTypeDefMember2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantVariable2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleConstantVariable2763 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleConstantVariable2784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantVariable2801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstantVariable2818 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantVariable2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable2875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterVariable2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRegisterVariable2931 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleRegisterVariable2952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisterVariable2969 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRegisterVariable2986 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRegisterVariable3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_entryRuleOperationStep3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationStep3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_ruleOperationStep3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleOperationStep3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperationStep3155 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationStep3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabel3286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel3303 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLabel3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord3356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionWord3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInstructionWord3403 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleWordSection_in_ruleInstructionWord3424 = new BitSet(new long[]{0x00000100000001F0L});
    public static final BitSet FOLLOW_40_in_ruleInstructionWord3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordSection_in_entryRuleWordSection3473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordSection3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleWordSection3531 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleWordSection3558 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWordSection3570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection3587 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleWordSection3605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleLiteralValue3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleVariable3811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariableReference3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperationCall4019 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOperationCall4031 = new BitSet(new long[]{0x28000600000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4053 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationCall4066 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4087 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_42_in_ruleOperationCall4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter4139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallParameter4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperationCallParameter4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4292 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOperation4309 = new BitSet(new long[]{0x0000040925000010L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4331 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperation4344 = new BitSet(new long[]{0x0000000925000010L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4365 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_42_in_ruleOperation4381 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation4393 = new BitSet(new long[]{0x680002C5250101F0L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleOperation4414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation4426 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperation4439 = new BitSet(new long[]{0x28000201250001F0L,0x0000000078000006L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperation4461 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperation4488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationBlock4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_ruleOperationBlock4604 = new BitSet(new long[]{0x680002C1250101F2L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable4641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterVariable4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterKind_in_ruleParameterVariable4706 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleParameterVariable4728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterVariable4745 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleParameterVariable4763 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleParameterVariable4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition4822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperatorDefinition4869 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FFFFE0L});
    public static final BitSet FOLLOW_ruleOperationRole_in_ruleOperatorDefinition4890 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperatorDefinition4902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4925 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleOperatorDefinition4938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4961 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleOperatorDefinition4976 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperatorDefinition4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBinary5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLinkedBinary5073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5094 = new BitSet(new long[]{0x0000000000100000L,0x0000000006000008L});
    public static final BitSet FOLLOW_ruleBinaryType_in_ruleLinkedBinary5115 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLinkedBinary5128 = new BitSet(new long[]{0x0600800000200002L});
    public static final BitSet FOLLOW_21_in_ruleLinkedBinary5141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5164 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLinkedBinary5176 = new BitSet(new long[]{0x0600800000200002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_ruleLinkedBinary5199 = new BitSet(new long[]{0x0600800000000002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_entryRuleBinarySection5236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinarySection5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection5294 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_ruleBinarySection5321 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5348 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBinarySection5360 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinarySection5381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBinarySection5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBinarySection5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFunctionBinarySection5476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionBinarySection5493 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionBinarySection5510 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleFunctionBinarySection5522 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection5534 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5555 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5567 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleFunctionBinarySection5579 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection5591 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5612 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5624 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFunctionBinarySection5636 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection5648 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleFunctionBinarySection5669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5681 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionBinarySection5693 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection5705 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleFunctionBinarySection5726 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5738 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection5760 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5772 = new BitSet(new long[]{0x00C0040000000000L});
    public static final BitSet FOLLOW_ruleOptimizerCall_in_ruleFunctionBinarySection5796 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5808 = new BitSet(new long[]{0x0040040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFunctionBinarySection5822 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBinarySection5834 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFunctionBinarySection5847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection5870 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionBinarySection5882 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_ruleFunctionBinarySection5896 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBinarySection5908 = new BitSet(new long[]{0x680002C5250101F0L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleFunctionBinarySection5929 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFunctionBinarySection5941 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFunctionBinarySection5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptimizerCall_in_entryRuleOptimizerCall5989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptimizerCall5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOptimizerCall6036 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOptimizerCall6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory6094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionMemory6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFunctionMemory6141 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory6162 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFunctionMemory6174 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection6231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantBinarySection6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleConstantBinarySection6278 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConstantBinarySection6290 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantBinarySection6312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstantBinarySection6324 = new BitSet(new long[]{0x28000204000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_34_in_ruleConstantBinarySection6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection6374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceBinarySection6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReferenceBinarySection6421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression6480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression6_in_ruleXExpression6537 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXExpression6549 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleXExpression6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSizeOfExpression6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXSizeOfExpression6909 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXSizeOfExpression6921 = new BitSet(new long[]{0x0000000125000010L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression6942 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXSizeOfExpression6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStructExpression7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXStructExpression7048 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXStructExpression7060 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression7081 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleXStructExpression7094 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression7115 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleXStructExpression7130 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXStructExpression7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_entryRuleXExpression17180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression17190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression17236 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression0_in_ruleXExpression17258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression0_in_entryRuleXExpression07294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression07304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_ruleXExpression07350 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXExpression07363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXExpression07380 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM17423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionM17433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM17479 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXExpressionM17492 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionM17513 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXExpressionM17525 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_entryRuleXExpression27563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression27573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_ruleXExpression27619 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression27651 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression27672 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_entryRuleXExpression37710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression37720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression37766 = new BitSet(new long[]{0x0000000000000002L,0x0000000408000000L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression37798 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression37819 = new BitSet(new long[]{0x0000000000000002L,0x0000000408000000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_entryRuleXExpression47857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression47867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression47913 = new BitSet(new long[]{0x0000018000000002L,0x0000007800000000L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression47945 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression47966 = new BitSet(new long[]{0x0000018000000002L,0x0000007800000000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_entryRuleXExpression58004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression58014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression58060 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression58092 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression58113 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_ruleXExpression6_in_entryRuleXExpression68151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression68161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXExpression68218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXExpression68234 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_ruleXExpression68256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral8292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionLiteral8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression8382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTopLevelExpression8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleXTopLevelExpression8440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXTopLevelExpression8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTopLevelExpression8481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXTopLevelExpression8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXTopLevelExpression8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign8584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpSingleAssign8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression8671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIsLiteralExpression8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXIsLiteralExpression8718 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIsLiteralExpression8730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression8751 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIsLiteralExpression8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXIfExpression8846 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression8858 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8879 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression8891 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXIfExpression8903 = new BitSet(new long[]{0x680002C5250101F0L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression8924 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIfExpression8936 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXIfExpression8957 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXIfExpression8970 = new BitSet(new long[]{0x680002C5250101F0L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression8991 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIfExpression9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXWhileExpression9088 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression9100 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9121 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression9133 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXWhileExpression9145 = new BitSet(new long[]{0x680002C5250101F0L,0x0000000078000007L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXWhileExpression9166 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXWhileExpression9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression9261 = new BitSet(new long[]{0x28000200000001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression9282 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIntegerKind9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIntegerKind9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleParameterKind9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleParameterKind9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleParameterKind9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationRole9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationRole9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperationRole9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperationRole9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperationRole9553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperationRole9570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperationRole9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperationRole9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperationRole9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperationRole9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperationRole9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperationRole9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperationRole9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperationRole9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperationRole9723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperationRole9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperationRole9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperationRole9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperationRole9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperationRole9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinaryType9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleBinaryType9870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBinaryType9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUNARY_OPERATOR9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleUNARY_OPERATOR9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleUNARY_OPERATOR9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleUNARY_OPERATOR9983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleMULTIPLICATIVE_OPERATOR10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleMULTIPLICATIVE_OPERATOR10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleMULTIPLICATIVE_OPERATOR10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleADDITIVE_OPERATOR10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleADDITIVE_OPERATOR10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleEQUALITY_OPERATOR10169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleEQUALITY_OPERATOR10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleEQUALITY_OPERATOR10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleEQUALITY_OPERATOR10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEQUALITY_OPERATOR10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEQUALITY_OPERATOR10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleBOOLEAN_OPERATOR10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleBOOLEAN_OPERATOR10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred6_InternalESyntax8949 = new BitSet(new long[]{0x0000000000000002L});

}