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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_BINARY", "RULE_SCRIPT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'module'", "'extends'", "','", "';'", "'use'", "'ref'", "'config'", "'library'", "'overrides'", "'type'", "'='", "'pointer'", "'of'", "'array'", "'['", "']'", "'bits'", "'struct'", "'{'", "'}'", "'const'", "'reg'", "':'", "'label'", "'<'", "'>'", "'('", "')'", "'returns'", "'operator'", "'binary'", "'at'", "'program'", "'startAddr'", "'memwidth'", "'pointersize'", "'lib'", "'link'", "'mem'", "'..'", "'data'", "'include'", "'sizeof'", "'->'", "'isliteral'", "'if'", "'else'", "'while'", "'unsigned'", "'signed'", "'real'", "'default'", "'var'", "'SET'", "'ADD'", "'SUBTRACT'", "'AND'", "'OR'", "'XOR'", "'EQUALS'", "'BRANCH'", "'UC_GOTO'", "'NOT'", "'INDIRECTION'", "'CLEAR'", "'INCREMENT'", "'DECREMENT'", "'DIV'", "'MOD'", "'LT'", "'LTE'", "'GT'", "'GTE'", "'hexfile'", "'-'", "'!'", "'&'", "'@'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'"
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
    public static final int RULE_SCRIPT=8;
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
    public static final int T__59=59;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:77:1: ruleCompilationUnit returns [EObject current=null] : (this_Module_0= ruleModule | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_Library_1 = null;

        EObject this_LinkedBinary_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:80:28: ( (this_Module_0= ruleModule | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Module_0= ruleModule | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (this_Module_0= ruleModule | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 45:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:82:5: this_Module_0= ruleModule
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getModuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModule_in_ruleCompilationUnit132);
                    this_Module_0=ruleModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Module_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:92:5: this_Library_1= ruleLibrary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLibraryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLibrary_in_ruleCompilationUnit159);
                    this_Library_1=ruleLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Library_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:102:5: this_LinkedBinary_2= ruleLinkedBinary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLinkedBinaryParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit186);
                    this_LinkedBinary_2=ruleLinkedBinary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LinkedBinary_2; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:118:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:119:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:120:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName222);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName233); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:127:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
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
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName307); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReferenceID"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:159:1: entryRuleReferenceID returns [String current=null] : iv_ruleReferenceID= ruleReferenceID EOF ;
    public final String entryRuleReferenceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceID = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:160:2: (iv_ruleReferenceID= ruleReferenceID EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:161:2: iv_ruleReferenceID= ruleReferenceID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceIDRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceID_in_entryRuleReferenceID355);
            iv_ruleReferenceID=ruleReferenceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceID366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceID"


    // $ANTLR start "ruleReferenceID"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:168:1: ruleReferenceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleReferenceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:171:28: ( ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:1: ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:1: ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:2: (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:2: (this_ID_0= RULE_ID kw= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:172:7: this_ID_0= RULE_ID kw= '.'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceID407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getReferenceIDAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleReferenceID425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReferenceIDAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceID442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getReferenceIDAccess().getIDTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleReferenceID"


    // $ANTLR start "entryRuleLITERAL"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:200:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:201:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:202:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERALRule()); 
            }
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL488);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL499); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:209:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_HEXINT_1=null;
        Token this_BINARY_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:212:28: ( (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            int alt4=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLITERAL539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:221:10: this_HEXINT_1= RULE_HEXINT
                    {
                    this_HEXINT_1=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLITERAL565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_1, grammarAccess.getLITERALAccess().getHEXINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:229:10: this_BINARY_2= RULE_BINARY
                    {
                    this_BINARY_2=(Token)match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleLITERAL591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BINARY_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BINARY_2, grammarAccess.getLITERALAccess().getBINARYTerminalRuleCall_2()); 
                          
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


    // $ANTLR start "entryRuleModule"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:244:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:245:2: (iv_ruleModule= ruleModule EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:246:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule636);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule646); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:253:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleModuleItem ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:256:28: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleModuleItem ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:1: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleModuleItem ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:1: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleModuleItem ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:257:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleModuleItem ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModule683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:261:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:262:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:262:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:263:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule704);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModuleRule());
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:279:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:279:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleModule717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:283:1: ( ( ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:284:1: ( ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:284:1: ( ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:285:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getModuleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModuleAccess().getExtendsModuleCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule740);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:298:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:298:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleModule753); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:302:1: ( ( ruleQualifiedName ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:303:1: ( ruleQualifiedName )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:303:1: ( ruleQualifiedName )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:304:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getModuleRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModuleAccess().getExtendsModuleCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule776);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleModule792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:321:1: (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:321:3: otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleModule805); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:325:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:326:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:326:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:327:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModuleRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule828);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleModule840); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:344:3: ( (lv_items_10_0= ruleModuleItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=20 && LA8_0<=21)||LA8_0==26||LA8_0==28||LA8_0==32||LA8_0==35||(LA8_0>=63 && LA8_0<=65)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:345:1: (lv_items_10_0= ruleModuleItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:345:1: (lv_items_10_0= ruleModuleItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:346:3: lv_items_10_0= ruleModuleItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModuleItem_in_ruleModule863);
            	    lv_items_10_0=ruleModuleItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_10_0, 
            	              		"ModuleItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:370:1: entryRuleModuleItem returns [EObject current=null] : iv_ruleModuleItem= ruleModuleItem EOF ;
    public final EObject entryRuleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:371:2: (iv_ruleModuleItem= ruleModuleItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:372:2: iv_ruleModuleItem= ruleModuleItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleItemRule()); 
            }
            pushFollow(FOLLOW_ruleModuleItem_in_entryRuleModuleItem900);
            iv_ruleModuleItem=ruleModuleItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleItem910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleItem"


    // $ANTLR start "ruleModuleItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:379:1: ruleModuleItem returns [EObject current=null] : ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation ) ;
    public final EObject ruleModuleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Variable_0 = null;

        EObject this_ConfigVariable_2 = null;

        EObject this_ConstantVariable_4 = null;

        EObject this_InstanceReference_6 = null;

        EObject this_Operation_8 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:382:28: ( ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 26:
            case 28:
            case 32:
            case 63:
            case 64:
            case 65:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==RULE_ID||LA9_2==14) ) {
                    alt9=1;
                }
                else if ( (LA9_2==41) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:383:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:384:5: this_Variable_0= ruleVariable otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleItemAccess().getVariableParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleModuleItem958);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleModuleItem969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getModuleItemAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:397:6: (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:397:6: (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:398:5: this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleItemAccess().getConfigVariableParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConfigVariable_in_ruleModuleItem999);
                    this_ConfigVariable_2=ruleConfigVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConfigVariable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleModuleItem1010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModuleItemAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:411:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:411:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:412:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleItemAccess().getConstantVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleModuleItem1040);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleModuleItem1051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getModuleItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:425:6: (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:425:6: (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:426:5: this_InstanceReference_6= ruleInstanceReference otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleItemAccess().getInstanceReferenceParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceReference_in_ruleModuleItem1081);
                    this_InstanceReference_6=ruleInstanceReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceReference_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleModuleItem1092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getModuleItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:440:5: this_Operation_8= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleItemAccess().getOperationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleModuleItem1121);
                    this_Operation_8=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_8; 
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
    // $ANTLR end "ruleModuleItem"


    // $ANTLR start "entryRuleInstanceReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:456:1: entryRuleInstanceReference returns [EObject current=null] : iv_ruleInstanceReference= ruleInstanceReference EOF ;
    public final EObject entryRuleInstanceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:457:2: (iv_ruleInstanceReference= ruleInstanceReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:458:2: iv_ruleInstanceReference= ruleInstanceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceReference_in_entryRuleInstanceReference1156);
            iv_ruleInstanceReference=ruleInstanceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceReference1166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceReference"


    // $ANTLR start "ruleInstanceReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:465:1: ruleInstanceReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleReferenceID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInstanceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:468:28: ( (otherlv_0= 'ref' ( ( ruleReferenceID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:469:1: (otherlv_0= 'ref' ( ( ruleReferenceID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:469:1: (otherlv_0= 'ref' ( ( ruleReferenceID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:469:3: otherlv_0= 'ref' ( ( ruleReferenceID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleInstanceReference1203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstanceReferenceAccess().getRefKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:473:1: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:474:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:474:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:475:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceReferenceAccess().getTypeModuleCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleInstanceReference1226);
            ruleReferenceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:488:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:489:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:489:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:490:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstanceReference1243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInstanceReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceReferenceRule());
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
    // $ANTLR end "ruleInstanceReference"


    // $ANTLR start "entryRuleConfigVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:514:1: entryRuleConfigVariable returns [EObject current=null] : iv_ruleConfigVariable= ruleConfigVariable EOF ;
    public final EObject entryRuleConfigVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:515:2: (iv_ruleConfigVariable= ruleConfigVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:516:2: iv_ruleConfigVariable= ruleConfigVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConfigVariable_in_entryRuleConfigVariable1284);
            iv_ruleConfigVariable=ruleConfigVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigVariable1294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigVariable"


    // $ANTLR start "ruleConfigVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:523:1: ruleConfigVariable returns [EObject current=null] : ( () otherlv_1= 'config' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleConfigVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:526:28: ( ( () otherlv_1= 'config' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: ( () otherlv_1= 'config' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:1: ( () otherlv_1= 'config' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:2: () otherlv_1= 'config' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:527:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:528:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigVariableAccess().getConfigVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConfigVariable1340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigVariableAccess().getConfigKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:537:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:538:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:538:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:539:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleConfigVariable1361);
            lv_type_2_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConfigVariableRule());
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:555:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:556:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:556:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:557:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigVariable1378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getConfigVariableAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConfigVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
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
    // $ANTLR end "ruleConfigVariable"


    // $ANTLR start "entryRuleLibrary"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:581:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:582:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:583:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary1419);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary1429); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:590:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:593:28: ( (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:594:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:594:1: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:594:3: otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLibrary1466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:598:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:599:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:599:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:600:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1487);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:2: (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:4: otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLibrary1500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getOverridesKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:620:1: ( ( ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:621:1: ( ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:621:1: ( ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:622:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLibraryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverridesLibraryCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1523);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:635:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:635:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleLibrary1536); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:639:1: ( ( ruleQualifiedName ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:640:1: ( ruleQualifiedName )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:640:1: ( ruleQualifiedName )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:641:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLibraryRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverridesLibraryCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1559);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleLibrary1575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLibraryAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:658:1: (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:658:3: otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleLibrary1588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getLibraryAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:662:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:663:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:663:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:664:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLibraryRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1611);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleLibrary1623); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:681:3: ( (lv_items_10_0= ruleLibraryItem ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==24||LA13_0==26||LA13_0==28||LA13_0==32||(LA13_0>=35 && LA13_0<=36)||LA13_0==44||(LA13_0>=63 && LA13_0<=65)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:682:1: (lv_items_10_0= ruleLibraryItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:682:1: (lv_items_10_0= ruleLibraryItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:683:3: lv_items_10_0= ruleLibraryItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getItemsLibraryItemParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibraryItem_in_ruleLibrary1646);
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
            	    break loop13;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:707:1: entryRuleLibraryItem returns [EObject current=null] : iv_ruleLibraryItem= ruleLibraryItem EOF ;
    public final EObject entryRuleLibraryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:708:2: (iv_ruleLibraryItem= ruleLibraryItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:709:2: iv_ruleLibraryItem= ruleLibraryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryItemRule()); 
            }
            pushFollow(FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem1683);
            iv_ruleLibraryItem=ruleLibraryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibraryItem1693); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:716:1: ruleLibraryItem returns [EObject current=null] : (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition ) ;
    public final EObject ruleLibraryItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Type_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Variable_2 = null;

        EObject this_ConstantVariable_4 = null;

        EObject this_RegisterVariable_6 = null;

        EObject this_OperatorDefinition_8 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:719:28: ( (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:720:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:720:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | this_OperatorDefinition_8= ruleOperatorDefinition )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==RULE_ID||LA14_2==14) ) {
                    alt14=3;
                }
                else if ( (LA14_2==41) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 28:
            case 32:
            case 63:
            case 64:
            case 65:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:721:5: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleLibraryItem1740);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:731:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleLibraryItem1767);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:740:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:740:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:741:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleLibraryItem1795);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLibraryItem1806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:754:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:754:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:755:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getConstantVariableParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleLibraryItem1836);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleLibraryItem1847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:768:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:768:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:769:5: this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getRegisterVariableParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegisterVariable_in_ruleLibraryItem1877);
                    this_RegisterVariable_6=ruleRegisterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegisterVariable_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleLibraryItem1888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:783:5: this_OperatorDefinition_8= ruleOperatorDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperatorDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem1917);
                    this_OperatorDefinition_8=ruleOperatorDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperatorDefinition_8; 
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
    // $ANTLR end "ruleLibraryItem"


    // $ANTLR start "entryRuleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:799:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:800:2: (iv_ruleType= ruleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:801:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1952);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1962); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:808:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_def_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:811:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:812:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:812:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:812:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleType1999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:816:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:817:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:817:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:818:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2016); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleType2033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:838:1: ( (lv_def_3_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:839:1: (lv_def_3_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:839:1: (lv_def_3_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:840:3: lv_def_3_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleType2054);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleType2066); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:868:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:869:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:870:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef2102);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef2112); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:877:1: ruleTypeDef returns [EObject current=null] : (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDef_0 = null;

        EObject this_StructTypeDef_1 = null;

        EObject this_PointerTypeDef_2 = null;

        EObject this_ArrayTypeDef_3 = null;

        EObject this_RefTypeDef_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:880:28: ( (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:881:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:881:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 63:
            case 64:
            case 65:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case RULE_ID:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:882:5: this_DataTypeDef_0= ruleDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDef_in_ruleTypeDef2159);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:892:5: this_StructTypeDef_1= ruleStructTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getStructTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructTypeDef_in_ruleTypeDef2186);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:902:5: this_PointerTypeDef_2= rulePointerTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getPointerTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePointerTypeDef_in_ruleTypeDef2213);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:912:5: this_ArrayTypeDef_3= ruleArrayTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getArrayTypeDefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2240);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:922:5: this_RefTypeDef_4= ruleRefTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getRefTypeDefParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRefTypeDef_in_ruleTypeDef2267);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:938:1: entryRulePointerTypeDef returns [EObject current=null] : iv_rulePointerTypeDef= rulePointerTypeDef EOF ;
    public final EObject entryRulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:939:2: (iv_rulePointerTypeDef= rulePointerTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:940:2: iv_rulePointerTypeDef= rulePointerTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeDefRule()); 
            }
            pushFollow(FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef2302);
            iv_rulePointerTypeDef=rulePointerTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerTypeDef2312); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:947:1: rulePointerTypeDef returns [EObject current=null] : (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) ;
    public final EObject rulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:950:28: ( (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:951:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:951:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:951:3: otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePointerTypeDef2349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPointerTypeDefAccess().getPointerKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulePointerTypeDef2361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointerTypeDefAccess().getOfKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:959:1: ( (lv_def_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:960:1: (lv_def_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:960:1: (lv_def_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:961:3: lv_def_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointerTypeDefAccess().getDefTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_rulePointerTypeDef2382);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:985:1: entryRuleArrayTypeDef returns [EObject current=null] : iv_ruleArrayTypeDef= ruleArrayTypeDef EOF ;
    public final EObject entryRuleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:986:2: (iv_ruleArrayTypeDef= ruleArrayTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:987:2: iv_ruleArrayTypeDef= ruleArrayTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef2418);
            iv_ruleArrayTypeDef=ruleArrayTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDef2428); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:994:1: ruleArrayTypeDef returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:997:28: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:998:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:998:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:998:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleArrayTypeDef2465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleArrayTypeDef2477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayTypeDefAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1006:1: ( (lv_size_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1007:1: (lv_size_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1007:1: (lv_size_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1008:3: lv_size_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getSizeXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleArrayTypeDef2498);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleArrayTypeDef2510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayTypeDefAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleArrayTypeDef2522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefAccess().getOfKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1032:1: ( (lv_def_5_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1033:1: (lv_def_5_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1033:1: (lv_def_5_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1034:3: lv_def_5_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getDefTypeDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleArrayTypeDef2543);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1058:1: entryRuleRefTypeDef returns [EObject current=null] : iv_ruleRefTypeDef= ruleRefTypeDef EOF ;
    public final EObject entryRuleRefTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1059:2: (iv_ruleRefTypeDef= ruleRefTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1060:2: iv_ruleRefTypeDef= ruleRefTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef2579);
            iv_ruleRefTypeDef=ruleRefTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTypeDef2589); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1067:1: ruleRefTypeDef returns [EObject current=null] : ( ( ruleReferenceID ) ) ;
    public final EObject ruleRefTypeDef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1070:28: ( ( ( ruleReferenceID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1071:1: ( ( ruleReferenceID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1071:1: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1072:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1072:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1073:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRefTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRefTypeDefAccess().getTypeTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleRefTypeDef2636);
            ruleReferenceID();

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1094:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1095:2: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1096:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef2671);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDef2681); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1103:1: ruleDataTypeDef returns [EObject current=null] : ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1106:28: ( ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1107:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1107:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1107:2: ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1107:2: ( (lv_kind_0_0= rulePrimitiveKind ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1108:1: (lv_kind_0_0= rulePrimitiveKind )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1108:1: (lv_kind_0_0= rulePrimitiveKind )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1109:3: lv_kind_0_0= rulePrimitiveKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeDefAccess().getKindPrimitiveKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef2727);
            lv_kind_0_0=rulePrimitiveKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"PrimitiveKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1125:2: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1126:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1126:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1127:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataTypeDef2744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bits_1_0, grammarAccess.getDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bits",
                      		lv_bits_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeDef2761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefAccess().getBitsKeyword_2());
                  
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
    // $ANTLR end "ruleDataTypeDef"


    // $ANTLR start "entryRuleStructTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1155:1: entryRuleStructTypeDef returns [EObject current=null] : iv_ruleStructTypeDef= ruleStructTypeDef EOF ;
    public final EObject entryRuleStructTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1156:2: (iv_ruleStructTypeDef= ruleStructTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1157:2: iv_ruleStructTypeDef= ruleStructTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef2797);
            iv_ruleStructTypeDef=ruleStructTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDef2807); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1164:1: ruleStructTypeDef returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1167:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1168:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1168:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1168:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1168:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStructTypeDef2853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStructTypeDefAccess().getStructKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleStructTypeDef2865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1182:1: ( (lv_members_3_0= ruleStructTypeDefMember ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1183:1: (lv_members_3_0= ruleStructTypeDefMember )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1183:1: (lv_members_3_0= ruleStructTypeDefMember )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1184:3: lv_members_3_0= ruleStructTypeDefMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2886);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1200:2: (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1200:4: otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleStructTypeDef2899); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStructTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1204:1: ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1205:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1205:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1206:3: lv_members_5_0= ruleStructTypeDefMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2920);
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
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleStructTypeDef2934); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1234:1: entryRuleStructTypeDefMember returns [EObject current=null] : iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF ;
    public final EObject entryRuleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDefMember = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1235:2: (iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1236:2: iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember2970);
            iv_ruleStructTypeDefMember=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDefMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDefMember2980); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1243:1: ruleStructTypeDefMember returns [EObject current=null] : ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1246:28: ( ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:1: ( () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:2: () ( (lv_type_1_0= ruleTypeDef ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefMemberAccess().getStructTypeDefMemberAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1253:2: ( (lv_type_1_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1254:1: (lv_type_1_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1254:1: (lv_type_1_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1255:3: lv_type_1_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeDefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember3035);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1271:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1272:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1272:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1273:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructTypeDefMember3052); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1297:1: entryRuleConstantVariable returns [EObject current=null] : iv_ruleConstantVariable= ruleConstantVariable EOF ;
    public final EObject entryRuleConstantVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1298:2: (iv_ruleConstantVariable= ruleConstantVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1299:2: iv_ruleConstantVariable= ruleConstantVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable3093);
            iv_ruleConstantVariable=ruleConstantVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantVariable3103); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1306:1: ruleConstantVariable returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleConstantVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1309:28: ( ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1310:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1310:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1310:2: () otherlv_1= 'const' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1310:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantVariableAccess().getConstantVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleConstantVariable3149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantVariableAccess().getConstKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1320:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1321:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1321:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1322:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleConstantVariable3170);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1338:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1339:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1339:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1340:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantVariable3187); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstantVariable3204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantVariableAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1360:1: ( (lv_value_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1361:1: (lv_value_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1361:1: (lv_value_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1362:3: lv_value_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleConstantVariable3225);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1386:1: entryRuleRegisterVariable returns [EObject current=null] : iv_ruleRegisterVariable= ruleRegisterVariable EOF ;
    public final EObject entryRuleRegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1387:2: (iv_ruleRegisterVariable= ruleRegisterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1388:2: iv_ruleRegisterVariable= ruleRegisterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable3261);
            iv_ruleRegisterVariable=ruleRegisterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterVariable3271); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1395:1: ruleRegisterVariable returns [EObject current=null] : ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleRegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_addr_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1398:28: ( ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1399:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1399:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1399:2: () otherlv_1= 'reg' ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1399:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegisterVariableAccess().getRegisterVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleRegisterVariable3317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRegisterVariableAccess().getRegKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1409:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1410:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1410:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1411:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleRegisterVariable3338);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1427:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1428:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1428:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1429:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisterVariable3355); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleRegisterVariable3372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegisterVariableAccess().getColonKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1449:1: ( (lv_addr_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1450:1: (lv_addr_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1450:1: (lv_addr_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1451:3: lv_addr_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getAddrXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleRegisterVariable3393);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1475:1: entryRuleOperationStep returns [EObject current=null] : iv_ruleOperationStep= ruleOperationStep EOF ;
    public final EObject entryRuleOperationStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStep = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1476:2: (iv_ruleOperationStep= ruleOperationStep EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1477:2: iv_ruleOperationStep= ruleOperationStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationStepRule()); 
            }
            pushFollow(FOLLOW_ruleOperationStep_in_entryRuleOperationStep3429);
            iv_ruleOperationStep=ruleOperationStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationStep3439); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1484:1: ruleOperationStep returns [EObject current=null] : (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) ;
    public final EObject ruleOperationStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_InstructionWord_0 = null;

        EObject this_Label_1 = null;

        EObject this_Variable_2 = null;

        EObject this_XTopLevelExpression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1487:28: ( (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1488:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1488:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 26:
            case 28:
            case 32:
            case 63:
            case 64:
            case 65:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 18:
                case 25:
                case 29:
                case 33:
                case 39:
                case 40:
                case 41:
                case 58:
                case 89:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                    {
                    alt17=4;
                    }
                    break;
                case 14:
                    {
                    int LA17_6 = input.LA(3);

                    if ( (LA17_6==RULE_ID) ) {
                        int LA17_7 = input.LA(4);

                        if ( (LA17_7==18||LA17_7==25||LA17_7==29||LA17_7==33||(LA17_7>=39 && LA17_7<=41)||LA17_7==58||LA17_7==89||(LA17_7>=93 && LA17_7<=102)) ) {
                            alt17=4;
                        }
                        else if ( (LA17_7==RULE_ID) ) {
                            alt17=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    alt17=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case RULE_HEXINT:
            case RULE_BINARY:
            case RULE_SCRIPT:
            case 41:
            case 57:
            case 59:
            case 60:
            case 62:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1489:5: this_InstructionWord_0= ruleInstructionWord
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getInstructionWordParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstructionWord_in_ruleOperationStep3486);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1499:5: this_Label_1= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getLabelParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleOperationStep3513);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1508:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1508:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1509:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperationStep3541);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOperationStep3552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationStepAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1523:5: this_XTopLevelExpression_4= ruleXTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getXTopLevelExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep3581);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1539:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1540:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1541:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel3616);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel3626); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1548:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1551:28: ( ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:2: () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1552:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1553:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelAccess().getLabelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLabel3672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1562:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1563:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1563:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1564:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel3689); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLabel3706); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1592:1: entryRuleInstructionWord returns [EObject current=null] : iv_ruleInstructionWord= ruleInstructionWord EOF ;
    public final EObject entryRuleInstructionWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWord = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1593:2: (iv_ruleInstructionWord= ruleInstructionWord EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1594:2: iv_ruleInstructionWord= ruleInstructionWord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionWordRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord3742);
            iv_ruleInstructionWord=ruleInstructionWord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionWord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionWord3752); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1601:1: ruleInstructionWord returns [EObject current=null] : (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) ;
    public final EObject ruleInstructionWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1604:28: ( (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1605:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1605:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1605:3: otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleInstructionWord3789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionWordAccess().getLessThanSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1609:1: ( (lv_sections_1_0= ruleWordSection ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_BINARY)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1610:1: (lv_sections_1_0= ruleWordSection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1610:1: (lv_sections_1_0= ruleWordSection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1611:3: lv_sections_1_0= ruleWordSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionWordAccess().getSectionsWordSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWordSection_in_ruleInstructionWord3810);
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleInstructionWord3823); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1639:1: entryRuleWordSection returns [EObject current=null] : iv_ruleWordSection= ruleWordSection EOF ;
    public final EObject entryRuleWordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordSection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1640:2: (iv_ruleWordSection= ruleWordSection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1641:2: iv_ruleWordSection= ruleWordSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWordSectionRule()); 
            }
            pushFollow(FOLLOW_ruleWordSection_in_entryRuleWordSection3859);
            iv_ruleWordSection=ruleWordSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWordSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordSection3869); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1648:1: ruleWordSection returns [EObject current=null] : ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1651:28: ( ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1652:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1652:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1652:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1652:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_BINARY)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1653:5: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getLiteralValueParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleWordSection3917);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1663:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getVariableReferenceParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleWordSection3944);
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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleWordSection3956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWordSectionAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1675:1: ( (lv_size_3_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1676:1: (lv_size_3_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1676:1: (lv_size_3_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1677:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection3973); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1693:2: (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1693:4: otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleWordSection3991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getWordSectionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1697:1: ( (lv_shift_5_0= RULE_INT ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1698:1: (lv_shift_5_0= RULE_INT )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1698:1: (lv_shift_5_0= RULE_INT )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1699:3: lv_shift_5_0= RULE_INT
                    {
                    lv_shift_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection4008); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1723:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1724:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1725:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4051);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue4061); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1732:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1735:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1736:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1736:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1737:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1737:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1738:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralValueAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleLiteralValue4106);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1762:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1763:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1764:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4141);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4151); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1771:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1774:28: ( ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1775:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1775:1: ( ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1775:2: ( (lv_type_0_0= ruleTypeDef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1775:2: ( (lv_type_0_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1776:1: (lv_type_0_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1776:1: (lv_type_0_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1777:3: lv_type_0_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeDefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleVariable4197);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1793:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1794:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1794:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1795:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4214); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1819:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1820:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1821:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4255);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4265); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1828:1: ruleVariableReference returns [EObject current=null] : ( ( ruleReferenceID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1831:28: ( ( ( ruleReferenceID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:1: ( ( ruleReferenceID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1832:1: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1833:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1833:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1834:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVarVariableCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleVariableReference4312);
            ruleReferenceID();

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1855:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1856:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1857:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCall_in_entryRuleOperationCall4347);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCall4357); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1864:1: ruleOperationCall returns [EObject current=null] : ( ( ( ruleReferenceID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1867:28: ( ( ( ( ruleReferenceID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1868:1: ( ( ( ruleReferenceID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1868:1: ( ( ( ruleReferenceID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1868:2: ( ( ruleReferenceID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1868:2: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1869:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1869:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1870:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleOperationCall4405);
            ruleReferenceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleOperationCall4417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1887:1: ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_BINARY)||LA22_0==41||LA22_0==57||LA22_0==59||(LA22_0>=89 && LA22_0<=92)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1887:2: ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1887:2: ( (lv_params_2_0= ruleOperationCallParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1888:1: (lv_params_2_0= ruleOperationCallParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1888:1: (lv_params_2_0= ruleOperationCallParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1889:3: lv_params_2_0= ruleOperationCallParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4439);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1905:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1905:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOperationCall4452); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1909:1: ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1910:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1910:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1911:3: lv_params_4_0= ruleOperationCallParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4473);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleOperationCall4489); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1939:1: entryRuleOperationCallParameter returns [EObject current=null] : iv_ruleOperationCallParameter= ruleOperationCallParameter EOF ;
    public final EObject entryRuleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1940:2: (iv_ruleOperationCallParameter= ruleOperationCallParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1941:2: iv_ruleOperationCallParameter= ruleOperationCallParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter4525);
            iv_ruleOperationCallParameter=ruleOperationCallParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallParameter4535); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1948:1: ruleOperationCallParameter returns [EObject current=null] : this_XExpression_0= ruleXExpression ;
    public final EObject ruleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1951:28: (this_XExpression_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1953:5: this_XExpression_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationCallParameterAccess().getXExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleOperationCallParameter4581);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1969:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1970:2: (iv_ruleOperation= ruleOperation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1971:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation4615);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation4625); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1978:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1981:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1982:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1982:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1982:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1982:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1983:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1988:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1989:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1989:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1990:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation4676); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleOperation4693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:1: ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==26||LA24_0==28||LA24_0==32||LA24_0==35||(LA24_0>=63 && LA24_0<=67)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:2: ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2010:2: ( (lv_params_3_0= ruleParameterVariable ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2011:1: (lv_params_3_0= ruleParameterVariable )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2011:1: (lv_params_3_0= ruleParameterVariable )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2012:3: lv_params_3_0= ruleParameterVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4715);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2028:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2028:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleOperation4728); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2032:1: ( (lv_params_5_0= ruleParameterVariable ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2033:1: (lv_params_5_0= ruleParameterVariable )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2033:1: (lv_params_5_0= ruleParameterVariable )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2034:3: lv_params_5_0= ruleParameterVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4749);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleOperation4765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleOperation4777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2058:1: ( (lv_block_8_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2059:1: (lv_block_8_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2059:1: (lv_block_8_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2060:3: lv_block_8_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBlockOperationBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleOperation4798);
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

            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleOperation4810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2080:1: (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2080:3: otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_43_in_ruleOperation4823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getReturnsKeyword_8_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2084:1: ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) )
                    int alt25=2;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case RULE_ID:
                            {
                            alt25=2;
                            }
                            break;
                        case 14:
                            {
                            int LA25_4 = input.LA(3);

                            if ( (LA25_4==RULE_ID) ) {
                                int LA25_5 = input.LA(4);

                                if ( (LA25_5==RULE_ID) ) {
                                    alt25=2;
                                }
                                else if ( (LA25_5==18||LA25_5==25||LA25_5==29||LA25_5==33||(LA25_5>=39 && LA25_5<=41)||LA25_5==58||LA25_5==89||(LA25_5>=93 && LA25_5<=102)) ) {
                                    alt25=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 18:
                        case 25:
                        case 29:
                        case 33:
                        case 39:
                        case 40:
                        case 41:
                        case 58:
                        case 89:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                            {
                            alt25=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 1, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RULE_INT:
                    case RULE_HEXINT:
                    case RULE_BINARY:
                    case 41:
                    case 57:
                    case 59:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                        {
                        alt25=1;
                        }
                        break;
                    case 26:
                    case 28:
                    case 32:
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt25=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2084:2: ( (lv_return_11_0= ruleXExpression ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2084:2: ( (lv_return_11_0= ruleXExpression ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2085:1: (lv_return_11_0= ruleXExpression )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2085:1: (lv_return_11_0= ruleXExpression )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2086:3: lv_return_11_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnXExpressionParserRuleCall_8_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleOperation4845);
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
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2103:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2103:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2104:1: (lv_returnvar_12_0= ruleVariable )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2104:1: (lv_returnvar_12_0= ruleVariable )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2105:3: lv_returnvar_12_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnvarVariableParserRuleCall_8_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleOperation4872);
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

                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleOperation4885); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2133:1: entryRuleOperationBlock returns [EObject current=null] : iv_ruleOperationBlock= ruleOperationBlock EOF ;
    public final EObject entryRuleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBlock = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2134:2: (iv_ruleOperationBlock= ruleOperationBlock EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2135:2: iv_ruleOperationBlock= ruleOperationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4923);
            iv_ruleOperationBlock=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationBlock4933); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2142:1: ruleOperationBlock returns [EObject current=null] : ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) ;
    public final EObject ruleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2145:28: ( ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2146:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2146:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2146:2: () ( (lv_steps_1_0= ruleOperationStep ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2146:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationBlockAccess().getOperationBlockAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2152:2: ( (lv_steps_1_0= ruleOperationStep ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_SCRIPT)||LA27_0==26||LA27_0==28||LA27_0==32||(LA27_0>=38 && LA27_0<=39)||LA27_0==41||LA27_0==57||(LA27_0>=59 && LA27_0<=60)||(LA27_0>=62 && LA27_0<=65)||(LA27_0>=89 && LA27_0<=92)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2153:1: (lv_steps_1_0= ruleOperationStep )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2153:1: (lv_steps_1_0= ruleOperationStep )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2154:3: lv_steps_1_0= ruleOperationStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationBlockAccess().getStepsOperationStepParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationStep_in_ruleOperationBlock4988);
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
            	    break loop27;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2178:1: entryRuleParameterVariable returns [EObject current=null] : iv_ruleParameterVariable= ruleParameterVariable EOF ;
    public final EObject entryRuleParameterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2179:2: (iv_ruleParameterVariable= ruleParameterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2180:2: iv_ruleParameterVariable= ruleParameterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5025);
            iv_ruleParameterVariable=ruleParameterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterVariable5035); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2187:1: ruleParameterVariable returns [EObject current=null] : ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleParameterVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2190:28: ( ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2191:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2191:1: ( () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2191:2: () ( (lv_kind_1_0= ruleParameterKind ) )? ( (lv_type_2_0= ruleTypeDef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2191:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterVariableAccess().getParameterVariableAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2197:2: ( (lv_kind_1_0= ruleParameterKind ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35||(LA28_0>=66 && LA28_0<=67)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2198:1: (lv_kind_1_0= ruleParameterKind )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2198:1: (lv_kind_1_0= ruleParameterKind )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2199:3: lv_kind_1_0= ruleParameterKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getKindParameterKindEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterKind_in_ruleParameterVariable5090);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2215:3: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2216:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2216:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2217:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterVariableAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleParameterVariable5112);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2233:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2234:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2234:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2235:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterVariable5129); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2251:2: (otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2251:4: otherlv_4= '=' ( (lv_default_5_0= ruleLITERAL ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleParameterVariable5147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterVariableAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2255:1: ( (lv_default_5_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2256:1: (lv_default_5_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2256:1: (lv_default_5_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2257:3: lv_default_5_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getDefaultLITERALParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleParameterVariable5168);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2281:1: entryRuleOperatorDefinition returns [EObject current=null] : iv_ruleOperatorDefinition= ruleOperatorDefinition EOF ;
    public final EObject entryRuleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2282:2: (iv_ruleOperatorDefinition= ruleOperatorDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2283:2: iv_ruleOperatorDefinition= ruleOperatorDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition5206);
            iv_ruleOperatorDefinition=ruleOperatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition5216); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2290:1: ruleOperatorDefinition returns [EObject current=null] : (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleReferenceID ) ) (otherlv_4= ',' ( ( ruleReferenceID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2293:28: ( (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleReferenceID ) ) (otherlv_4= ',' ( ( ruleReferenceID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2294:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleReferenceID ) ) (otherlv_4= ',' ( ( ruleReferenceID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2294:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleReferenceID ) ) (otherlv_4= ',' ( ( ruleReferenceID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2294:3: otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleReferenceID ) ) (otherlv_4= ',' ( ( ruleReferenceID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleOperatorDefinition5253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperatorDefinitionAccess().getOperatorKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2298:1: ( (lv_role_1_0= ruleOperationRole ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2299:1: (lv_role_1_0= ruleOperationRole )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2299:1: (lv_role_1_0= ruleOperationRole )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2300:3: lv_role_1_0= ruleOperationRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getRoleOperationRoleEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationRole_in_ruleOperatorDefinition5274);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleOperatorDefinition5286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperatorDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2320:1: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2321:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2321:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2322:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleOperatorDefinition5309);
            ruleReferenceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2335:2: (otherlv_4= ',' ( ( ruleReferenceID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2335:4: otherlv_4= ',' ( ( ruleReferenceID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleOperatorDefinition5322); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2339:1: ( ( ruleReferenceID ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2340:1: ( ruleReferenceID )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2340:1: ( ruleReferenceID )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2341:3: ruleReferenceID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReferenceID_in_ruleOperatorDefinition5345);
            	    ruleReferenceID();

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
            	    break loop30;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:4: (otherlv_6= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2354:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleOperatorDefinition5360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOperatorDefinition5374); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2370:1: entryRuleLinkedBinary returns [EObject current=null] : iv_ruleLinkedBinary= ruleLinkedBinary EOF ;
    public final EObject entryRuleLinkedBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedBinary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2371:2: (iv_ruleLinkedBinary= ruleLinkedBinary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2372:2: iv_ruleLinkedBinary= ruleLinkedBinary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedBinaryRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5410);
            iv_ruleLinkedBinary=ruleLinkedBinary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedBinary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedBinary5420); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2379:1: ruleLinkedBinary returns [EObject current=null] : (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2382:28: ( (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2383:1: (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2383:1: (otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2383:3: otherlv_0= 'binary' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= ';' (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )* ( (lv_sections_7_0= ruleBinarySection ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLinkedBinary5457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkedBinaryAccess().getBinaryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2387:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2388:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2388:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2389:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5478);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2405:2: ( (lv_type_2_0= ruleBinaryType ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66||LA32_0==88) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2406:1: (lv_type_2_0= ruleBinaryType )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2406:1: (lv_type_2_0= ruleBinaryType )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2407:3: lv_type_2_0= ruleBinaryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getTypeBinaryTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBinaryType_in_ruleLinkedBinary5499);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLinkedBinary5512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLinkedBinaryAccess().getSemicolonKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2427:1: (otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2427:3: otherlv_4= 'use' ( ( ruleQualifiedName ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleLinkedBinary5525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLinkedBinaryAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2431:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2432:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2432:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2433:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLinkedBinaryRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5548);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleLinkedBinary5560); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getLinkedBinaryAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2450:3: ( (lv_sections_7_0= ruleBinarySection ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47||(LA34_0>=55 && LA34_0<=56)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2451:1: (lv_sections_7_0= ruleBinarySection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2451:1: (lv_sections_7_0= ruleBinarySection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2452:3: lv_sections_7_0= ruleBinarySection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getSectionsBinarySectionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinarySection_in_ruleLinkedBinary5583);
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
            	    break loop34;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2476:1: entryRuleBinarySection returns [EObject current=null] : iv_ruleBinarySection= ruleBinarySection EOF ;
    public final EObject entryRuleBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2477:2: (iv_ruleBinarySection= ruleBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2478:2: iv_ruleBinarySection= ruleBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleBinarySection_in_entryRuleBinarySection5620);
            iv_ruleBinarySection=ruleBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinarySection5630); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2485:1: ruleBinarySection returns [EObject current=null] : ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2488:28: ( ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2489:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2489:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2489:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2489:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 55:
                {
                alt35=2;
                }
                break;
            case 56:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2490:5: this_FunctionBinarySection_0= ruleFunctionBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getFunctionBinarySectionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection5678);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2500:5: this_ConstantBinarySection_1= ruleConstantBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getConstantBinarySectionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantBinarySection_in_ruleBinarySection5705);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2510:5: this_ReferenceBinarySection_2= ruleReferenceBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getReferenceBinarySectionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5732);
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

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleBinarySection5744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBinarySectionAccess().getAtKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2522:1: ( (lv_start_4_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2523:1: (lv_start_4_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2523:1: (lv_start_4_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2524:3: lv_start_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinarySectionAccess().getStartXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleBinarySection5765);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBinarySection5777); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2552:1: entryRuleFunctionBinarySection returns [EObject current=null] : iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF ;
    public final EObject entryRuleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2553:2: (iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2554:2: iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5813);
            iv_ruleFunctionBinarySection=ruleFunctionBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBinarySection5823); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2561:1: ruleFunctionBinarySection returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointersize' otherlv_12= '=' ( (lv_pointersize_13_0= ruleLITERAL ) ) otherlv_14= ';' ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+ otherlv_17= ')' otherlv_18= '{' ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )* otherlv_23= 'link' otherlv_24= '{' ( (lv_do_25_0= ruleOperationBlock ) ) otherlv_26= '}' otherlv_27= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_startAddr_5_0 = null;

        AntlrDatatypeRuleToken lv_memwidth_9_0 = null;

        AntlrDatatypeRuleToken lv_pointersize_13_0 = null;

        EObject lv_mems_15_0 = null;

        EObject lv_instances_22_0 = null;

        EObject lv_do_25_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2564:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointersize' otherlv_12= '=' ( (lv_pointersize_13_0= ruleLITERAL ) ) otherlv_14= ';' ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+ otherlv_17= ')' otherlv_18= '{' ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )* otherlv_23= 'link' otherlv_24= '{' ( (lv_do_25_0= ruleOperationBlock ) ) otherlv_26= '}' otherlv_27= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2565:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointersize' otherlv_12= '=' ( (lv_pointersize_13_0= ruleLITERAL ) ) otherlv_14= ';' ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+ otherlv_17= ')' otherlv_18= '{' ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )* otherlv_23= 'link' otherlv_24= '{' ( (lv_do_25_0= ruleOperationBlock ) ) otherlv_26= '}' otherlv_27= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2565:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointersize' otherlv_12= '=' ( (lv_pointersize_13_0= ruleLITERAL ) ) otherlv_14= ';' ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+ otherlv_17= ')' otherlv_18= '{' ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )* otherlv_23= 'link' otherlv_24= '{' ( (lv_do_25_0= ruleOperationBlock ) ) otherlv_26= '}' otherlv_27= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2565:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'startAddr' otherlv_4= '=' ( (lv_startAddr_5_0= ruleLITERAL ) ) otherlv_6= ';' otherlv_7= 'memwidth' otherlv_8= '=' ( (lv_memwidth_9_0= ruleLITERAL ) ) otherlv_10= ';' otherlv_11= 'pointersize' otherlv_12= '=' ( (lv_pointersize_13_0= ruleLITERAL ) ) otherlv_14= ';' ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+ otherlv_17= ')' otherlv_18= '{' ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )* otherlv_23= 'link' otherlv_24= '{' ( (lv_do_25_0= ruleOperationBlock ) ) otherlv_26= '}' otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleFunctionBinarySection5860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionBinarySectionAccess().getProgramKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2569:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2570:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2570:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2571:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionBinarySection5877); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleFunctionBinarySection5894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionBinarySectionAccess().getLeftParenthesisKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleFunctionBinarySection5906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionBinarySectionAccess().getStartAddrKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleFunctionBinarySection5918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2599:1: ( (lv_startAddr_5_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2600:1: (lv_startAddr_5_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2600:1: (lv_startAddr_5_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2601:3: lv_startAddr_5_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getStartAddrLITERALParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5939);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection5951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleFunctionBinarySection5963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionBinarySectionAccess().getMemwidthKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleFunctionBinarySection5975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_8());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2629:1: ( (lv_memwidth_9_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2630:1: (lv_memwidth_9_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2630:1: (lv_memwidth_9_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2631:3: lv_memwidth_9_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemwidthLITERALParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5996);
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

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection6008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleFunctionBinarySection6020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getFunctionBinarySectionAccess().getPointersizeKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleFunctionBinarySection6032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_12());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2659:1: ( (lv_pointersize_13_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2660:1: (lv_pointersize_13_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2660:1: (lv_pointersize_13_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2661:3: lv_pointersize_13_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getPointersizeLITERALParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection6053);
            lv_pointersize_13_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"pointersize",
                      		lv_pointersize_13_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection6065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_14());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2681:1: ( ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==53) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2681:2: ( (lv_mems_15_0= ruleFunctionMemory ) ) otherlv_16= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2681:2: ( (lv_mems_15_0= ruleFunctionMemory ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2682:1: (lv_mems_15_0= ruleFunctionMemory )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2682:1: (lv_mems_15_0= ruleFunctionMemory )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2683:3: lv_mems_15_0= ruleFunctionMemory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemsFunctionMemoryParserRuleCall_15_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection6087);
            	    lv_mems_15_0=ruleFunctionMemory();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mems",
            	              		lv_mems_15_0, 
            	              		"FunctionMemory");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection6099); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_15_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_17=(Token)match(input,42,FOLLOW_42_in_ruleFunctionBinarySection6113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getFunctionBinarySectionAccess().getRightParenthesisKeyword_16());
                  
            }
            otherlv_18=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBinarySection6125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_17());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:1: ( (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) | ( (lv_instances_22_0= ruleLinkedInstance ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==51) ) {
                    alt37=1;
                }
                else if ( (LA37_0==RULE_ID) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:2: (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:2: (otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';' )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2711:4: otherlv_19= 'lib' ( ( ruleQualifiedName ) ) otherlv_21= ';'
            	    {
            	    otherlv_19=(Token)match(input,51,FOLLOW_51_in_ruleFunctionBinarySection6139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getFunctionBinarySectionAccess().getLibKeyword_18_0_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2715:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2716:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2716:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2717:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getLibLibraryCrossReference_18_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection6162);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection6174); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_18_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2735:6: ( (lv_instances_22_0= ruleLinkedInstance ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2735:6: ( (lv_instances_22_0= ruleLinkedInstance ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2736:1: (lv_instances_22_0= ruleLinkedInstance )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2736:1: (lv_instances_22_0= ruleLinkedInstance )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2737:3: lv_instances_22_0= ruleLinkedInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getInstancesLinkedInstanceParserRuleCall_18_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLinkedInstance_in_ruleFunctionBinarySection6202);
            	    lv_instances_22_0=ruleLinkedInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instances",
            	              		lv_instances_22_0, 
            	              		"LinkedInstance");
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

            otherlv_23=(Token)match(input,52,FOLLOW_52_in_ruleFunctionBinarySection6216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getFunctionBinarySectionAccess().getLinkKeyword_19());
                  
            }
            otherlv_24=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBinarySection6228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_24, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_20());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2761:1: ( (lv_do_25_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2762:1: (lv_do_25_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2762:1: (lv_do_25_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2763:3: lv_do_25_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getDoOperationBlockParserRuleCall_21_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleFunctionBinarySection6249);
            lv_do_25_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"do",
                      		lv_do_25_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_26=(Token)match(input,34,FOLLOW_34_in_ruleFunctionBinarySection6261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_22());
                  
            }
            otherlv_27=(Token)match(input,34,FOLLOW_34_in_ruleFunctionBinarySection6273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_27, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_23());
                  
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


    // $ANTLR start "entryRuleLinkedInstance"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2795:1: entryRuleLinkedInstance returns [EObject current=null] : iv_ruleLinkedInstance= ruleLinkedInstance EOF ;
    public final EObject entryRuleLinkedInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedInstance = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2796:2: (iv_ruleLinkedInstance= ruleLinkedInstance EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2797:2: iv_ruleLinkedInstance= ruleLinkedInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedInstance_in_entryRuleLinkedInstance6309);
            iv_ruleLinkedInstance=ruleLinkedInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedInstance6319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkedInstance"


    // $ANTLR start "ruleLinkedInstance"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2804:1: ruleLinkedInstance returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleLinkedInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_links_3_0 = null;

        EObject lv_confs_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2809:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2809:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2810:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkedInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkedInstanceAccess().getTypeModuleCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedInstance6367);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2823:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2824:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2824:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedInstance6384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLinkedInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkedInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleLinkedInstance6401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLinkedInstanceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2845:1: ( ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2845:2: ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) ) otherlv_5= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2845:2: ( ( (lv_links_3_0= ruleReferenceLink ) ) | ( (lv_confs_4_0= ruleInstanceConfig ) ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_ID) ) {
            	        int LA38_1 = input.LA(2);

            	        if ( (LA38_1==37) ) {
            	            alt38=1;
            	        }
            	        else if ( (LA38_1==25) ) {
            	            alt38=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 38, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2845:3: ( (lv_links_3_0= ruleReferenceLink ) )
            	            {
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2845:3: ( (lv_links_3_0= ruleReferenceLink ) )
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2846:1: (lv_links_3_0= ruleReferenceLink )
            	            {
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2846:1: (lv_links_3_0= ruleReferenceLink )
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2847:3: lv_links_3_0= ruleReferenceLink
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getLinkedInstanceAccess().getLinksReferenceLinkParserRuleCall_3_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleReferenceLink_in_ruleLinkedInstance6424);
            	            lv_links_3_0=ruleReferenceLink();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getLinkedInstanceRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"links",
            	                      		lv_links_3_0, 
            	                      		"ReferenceLink");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2864:6: ( (lv_confs_4_0= ruleInstanceConfig ) )
            	            {
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2864:6: ( (lv_confs_4_0= ruleInstanceConfig ) )
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2865:1: (lv_confs_4_0= ruleInstanceConfig )
            	            {
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2865:1: (lv_confs_4_0= ruleInstanceConfig )
            	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2866:3: lv_confs_4_0= ruleInstanceConfig
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getLinkedInstanceAccess().getConfsInstanceConfigParserRuleCall_3_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInstanceConfig_in_ruleLinkedInstance6451);
            	            lv_confs_4_0=ruleInstanceConfig();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getLinkedInstanceRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"confs",
            	                      		lv_confs_4_0, 
            	                      		"InstanceConfig");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleLinkedInstance6464); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getLinkedInstanceAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleLinkedInstance6478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLinkedInstanceAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleLinkedInstance"


    // $ANTLR start "entryRuleReferenceLink"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2898:1: entryRuleReferenceLink returns [EObject current=null] : iv_ruleReferenceLink= ruleReferenceLink EOF ;
    public final EObject entryRuleReferenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceLink = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2899:2: (iv_ruleReferenceLink= ruleReferenceLink EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2900:2: iv_ruleReferenceLink= ruleReferenceLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceLink_in_entryRuleReferenceLink6514);
            iv_ruleReferenceLink=ruleReferenceLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceLink6524); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceLink"


    // $ANTLR start "ruleReferenceLink"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2907:1: ruleReferenceLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReferenceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2910:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2911:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2911:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2911:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2911:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2912:1: (otherlv_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2912:1: (otherlv_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2913:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceLinkRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceLink6569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferenceLinkAccess().getRefInstanceReferenceCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleReferenceLink6581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceLinkAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2928:1: ( (otherlv_2= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2929:1: (otherlv_2= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2929:1: (otherlv_2= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2930:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceLinkRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceLink6601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getReferenceLinkAccess().getInstLinkedInstanceCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleReferenceLink"


    // $ANTLR start "entryRuleInstanceConfig"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2949:1: entryRuleInstanceConfig returns [EObject current=null] : iv_ruleInstanceConfig= ruleInstanceConfig EOF ;
    public final EObject entryRuleInstanceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceConfig = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2950:2: (iv_ruleInstanceConfig= ruleInstanceConfig EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2951:2: iv_ruleInstanceConfig= ruleInstanceConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceConfigRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceConfig_in_entryRuleInstanceConfig6637);
            iv_ruleInstanceConfig=ruleInstanceConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceConfig6647); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceConfig"


    // $ANTLR start "ruleInstanceConfig"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2958:1: ruleInstanceConfig returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleInstanceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2961:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2962:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2962:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2962:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2962:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2963:1: (otherlv_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2963:1: (otherlv_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2964:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceConfigRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstanceConfig6692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInstanceConfigAccess().getConfConfigVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleInstanceConfig6704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInstanceConfigAccess().getEqualsSignKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2979:1: ( (lv_value_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2980:1: (lv_value_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2980:1: (lv_value_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2981:3: lv_value_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceConfigAccess().getValueXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleInstanceConfig6725);
            lv_value_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceConfigRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
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
    // $ANTLR end "ruleInstanceConfig"


    // $ANTLR start "entryRuleFunctionMemory"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3005:1: entryRuleFunctionMemory returns [EObject current=null] : iv_ruleFunctionMemory= ruleFunctionMemory EOF ;
    public final EObject entryRuleFunctionMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionMemory = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3006:2: (iv_ruleFunctionMemory= ruleFunctionMemory EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3007:2: iv_ruleFunctionMemory= ruleFunctionMemory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionMemoryRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory6761);
            iv_ruleFunctionMemory=ruleFunctionMemory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionMemory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionMemory6771); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3014:1: ruleFunctionMemory returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) ;
    public final EObject ruleFunctionMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3017:28: ( (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3018:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3018:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3018:3: otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleFunctionMemory6808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionMemoryAccess().getMemKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3022:1: ( (lv_start_1_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3023:1: (lv_start_1_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3023:1: (lv_start_1_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3024:3: lv_start_1_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getStartLITERALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory6829);
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

            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleFunctionMemory6841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionMemoryAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3044:1: ( (lv_end_3_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3045:1: (lv_end_3_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3045:1: (lv_end_3_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3046:3: lv_end_3_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getEndLITERALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory6862);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3070:1: entryRuleConstantBinarySection returns [EObject current=null] : iv_ruleConstantBinarySection= ruleConstantBinarySection EOF ;
    public final EObject entryRuleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3071:2: (iv_ruleConstantBinarySection= ruleConstantBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3072:2: iv_ruleConstantBinarySection= ruleConstantBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection6898);
            iv_ruleConstantBinarySection=ruleConstantBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantBinarySection6908); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3079:1: ruleConstantBinarySection returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3082:28: ( (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3083:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3083:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3083:3: otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleConstantBinarySection6945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantBinarySectionAccess().getDataKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleConstantBinarySection6957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantBinarySectionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3091:1: ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_BINARY)||LA40_0==41||LA40_0==57||LA40_0==59||(LA40_0>=89 && LA40_0<=92)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3091:2: ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3091:2: ( (lv_data_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3092:1: (lv_data_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3092:1: (lv_data_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3093:3: lv_data_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstantBinarySectionAccess().getDataXExpressionParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleConstantBinarySection6979);
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

            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleConstantBinarySection6991); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getConstantBinarySectionAccess().getSemicolonKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleConstantBinarySection7005); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3125:1: entryRuleReferenceBinarySection returns [EObject current=null] : iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF ;
    public final EObject entryRuleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3126:2: (iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3127:2: iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection7041);
            iv_ruleReferenceBinarySection=ruleReferenceBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceBinarySection7051); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3134:1: ruleReferenceBinarySection returns [EObject current=null] : (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3137:28: ( (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3138:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3138:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3138:3: otherlv_0= 'include' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleReferenceBinarySection7088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceBinarySectionAccess().getIncludeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3142:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3143:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3143:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3144:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceBinarySectionAccess().getIncLinkedBinaryCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection7111);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3165:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3166:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3167:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression7147);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression7157); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3174:1: ruleXExpression returns [EObject current=null] : this_XExpression6_0= ruleXExpression6 ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3177:28: (this_XExpression6_0= ruleXExpression6 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3179:5: this_XExpression6_0= ruleXExpression6
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXExpression6ParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression6_in_ruleXExpression7203);
            this_XExpression6_0=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression6_0; 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3195:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3196:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3197:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7237);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression7247); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3204:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3207:28: ( (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3208:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3208:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3209:5: this_XExpressionLiteral_0= ruleXExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression7294);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3219:5: this_XParenthesizedExpression_1= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7321);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3229:5: this_XIsLiteralExpression_2= ruleXIsLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIsLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression7348);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3239:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression7375);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3249:5: this_OperationCall_4= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getOperationCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression7402);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3259:5: this_XStructExpression_5= ruleXStructExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXStructExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression7429);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3269:5: this_XSizeOfExpression_6= ruleXSizeOfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSizeOfExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression7456);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3285:1: entryRuleXSizeOfExpression returns [EObject current=null] : iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF ;
    public final EObject entryRuleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSizeOfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3286:2: (iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3287:2: iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSizeOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression7491);
            iv_ruleXSizeOfExpression=ruleXSizeOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSizeOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSizeOfExpression7501); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3294:1: ruleXSizeOfExpression returns [EObject current=null] : (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) ;
    public final EObject ruleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3297:28: ( (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:3: otherlv_0= 'sizeof' otherlv_1= '(' ( (lv_type_2_0= ruleTypeDef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleXSizeOfExpression7538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXSizeOfExpressionAccess().getSizeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXSizeOfExpression7550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSizeOfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3306:1: ( (lv_type_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3307:1: (lv_type_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3307:1: (lv_type_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3308:3: lv_type_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression7571);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXSizeOfExpression7583); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3336:1: entryRuleXStructExpression returns [EObject current=null] : iv_ruleXStructExpression= ruleXStructExpression EOF ;
    public final EObject entryRuleXStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStructExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3337:2: (iv_ruleXStructExpression= ruleXStructExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:2: iv_ruleXStructExpression= ruleXStructExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStructExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression7619);
            iv_ruleXStructExpression=ruleXStructExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStructExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStructExpression7629); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3345:1: ruleXStructExpression returns [EObject current=null] : ( ( ( ruleReferenceID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3348:28: ( ( ( ( ruleReferenceID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:1: ( ( ( ruleReferenceID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:1: ( ( ( ruleReferenceID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:2: ( ( ruleReferenceID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:2: ( ( ruleReferenceID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3350:1: ( ruleReferenceID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3350:1: ( ruleReferenceID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3351:3: ruleReferenceID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXStructExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceID_in_ruleXStructExpression7677);
            ruleReferenceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleXStructExpression7689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXStructExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3368:1: ( (lv_values_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:1: (lv_values_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:1: (lv_values_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3370:3: lv_values_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression7710);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3386:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    int LA42_1 = input.LA(2);

                    if ( ((LA42_1>=RULE_ID && LA42_1<=RULE_BINARY)||LA42_1==41||LA42_1==57||LA42_1==59||(LA42_1>=89 && LA42_1<=92)) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3386:4: otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXStructExpression7723); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXStructExpressionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3390:1: ( (lv_values_4_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3391:1: (lv_values_4_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3391:1: (lv_values_4_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3392:3: lv_values_4_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression7744);
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
            	    break loop42;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3408:4: (otherlv_5= ',' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3408:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXStructExpression7759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXStructExpression7773); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3424:1: entryRuleXExpression1 returns [EObject current=null] : iv_ruleXExpression1= ruleXExpression1 EOF ;
    public final EObject entryRuleXExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3425:2: (iv_ruleXExpression1= ruleXExpression1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3426:2: iv_ruleXExpression1= ruleXExpression1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression1_in_entryRuleXExpression17809);
            iv_ruleXExpression1=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression17819); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3433:1: ruleXExpression1 returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) ;
    public final EObject ruleXExpression1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3436:28: ( ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=89 && LA44_0<=92)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3438:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3438:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3439:3: lv_operator_0_0= ruleUNARY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression1Access().getOperatorUNARY_OPERATOREnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression17865);
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
            	    break loop44;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3455:3: ( (lv_a_1_0= ruleXExpression0 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:1: (lv_a_1_0= ruleXExpression0 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:1: (lv_a_1_0= ruleXExpression0 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3457:3: lv_a_1_0= ruleXExpression0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression1Access().getAXExpression0ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression0_in_ruleXExpression17887);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3481:1: entryRuleXExpression0 returns [EObject current=null] : iv_ruleXExpression0= ruleXExpression0 EOF ;
    public final EObject entryRuleXExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression0 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3482:2: (iv_ruleXExpression0= ruleXExpression0 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3483:2: iv_ruleXExpression0= ruleXExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression0Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression0_in_entryRuleXExpression07923);
            iv_ruleXExpression0=ruleXExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression0; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression07933); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3490:1: ruleXExpression0 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleXExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_member_2_0=null;
        EObject lv_a_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3493:28: ( ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3494:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3494:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3494:2: ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3494:2: ( (lv_a_0_0= ruleXExpressionM1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3495:1: (lv_a_0_0= ruleXExpressionM1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3495:1: (lv_a_0_0= ruleXExpressionM1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:3: lv_a_0_0= ruleXExpressionM1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression0Access().getAXExpressionM1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_ruleXExpression07979);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3512:2: (otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==58) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3512:4: otherlv_1= '->' ( (lv_member_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXExpression07992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpression0Access().getHyphenMinusGreaterThanSignKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3516:1: ( (lv_member_2_0= RULE_ID ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3517:1: (lv_member_2_0= RULE_ID )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3517:1: (lv_member_2_0= RULE_ID )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3518:3: lv_member_2_0= RULE_ID
            	    {
            	    lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXExpression08009); if (state.failed) return current;
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
    // $ANTLR end "ruleXExpression0"


    // $ANTLR start "entryRuleXExpressionM1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3542:1: entryRuleXExpressionM1 returns [EObject current=null] : iv_ruleXExpressionM1= ruleXExpressionM1 EOF ;
    public final EObject entryRuleXExpressionM1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionM1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3543:2: (iv_ruleXExpressionM1= ruleXExpressionM1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3544:2: iv_ruleXExpressionM1= ruleXExpressionM1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionM1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM18052);
            iv_ruleXExpressionM1=ruleXExpressionM1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionM1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionM18062); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3551:1: ruleXExpressionM1 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleXExpressionM1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_index_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3554:28: ( ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3555:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3555:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3555:2: ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3555:2: ( (lv_a_0_0= ruleXPrimaryExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3556:1: (lv_a_0_0= ruleXPrimaryExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3556:1: (lv_a_0_0= ruleXPrimaryExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3557:3: lv_a_0_0= ruleXPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionM1Access().getAXPrimaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM18108);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3573:2: (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3573:4: otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleXExpressionM18121); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpressionM1Access().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3577:1: ( (lv_index_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3578:1: (lv_index_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3578:1: (lv_index_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3579:3: lv_index_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionM1Access().getIndexXExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionM18142);
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

            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXExpressionM18154); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXExpressionM1Access().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3607:1: entryRuleXExpression2 returns [EObject current=null] : iv_ruleXExpression2= ruleXExpression2 EOF ;
    public final EObject entryRuleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression2 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3608:2: (iv_ruleXExpression2= ruleXExpression2 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3609:2: iv_ruleXExpression2= ruleXExpression2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression2Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression2_in_entryRuleXExpression28192);
            iv_ruleXExpression2=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression28202); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3616:1: ruleXExpression2 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:28: ( ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3620:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3620:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3620:2: ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3620:2: ( (lv_a_0_0= ruleXExpression1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3621:1: (lv_a_0_0= ruleXExpression1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3621:1: (lv_a_0_0= ruleXExpression1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3622:3: lv_a_0_0= ruleXExpression1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression2Access().getAXExpression1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression1_in_ruleXExpression28248);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:2: ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 93:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt47=1;
                    }


                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3643:1: (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3644:3: lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getOpMULTIPLICATIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression28280);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3660:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3661:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3661:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3662:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression28301);
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
            	    break loop47;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3686:1: entryRuleXExpression3 returns [EObject current=null] : iv_ruleXExpression3= ruleXExpression3 EOF ;
    public final EObject entryRuleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression3 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3687:2: (iv_ruleXExpression3= ruleXExpression3 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3688:2: iv_ruleXExpression3= ruleXExpression3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression3Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression3_in_entryRuleXExpression38339);
            iv_ruleXExpression3=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression38349); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3695:1: ruleXExpression3 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3698:28: ( ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3699:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3699:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3699:2: ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3699:2: ( (lv_a_0_0= ruleXExpression2 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3700:1: (lv_a_0_0= ruleXExpression2 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3700:1: (lv_a_0_0= ruleXExpression2 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3701:3: lv_a_0_0= ruleXExpression2
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression3Access().getAXExpression2ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression38395);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3717:2: ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==96) && (synpred2_InternalESyntax())) {
                    alt48=1;
                }
                else if ( (LA48_0==89) && (synpred2_InternalESyntax())) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3717:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3717:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3717:4: ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:1: (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3723:3: lv_op_1_0= ruleADDITIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getOpADDITIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression38427);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3739:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3740:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3740:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression38448);
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
            	    break loop48;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3765:1: entryRuleXExpression4 returns [EObject current=null] : iv_ruleXExpression4= ruleXExpression4 EOF ;
    public final EObject entryRuleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression4 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3766:2: (iv_ruleXExpression4= ruleXExpression4 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3767:2: iv_ruleXExpression4= ruleXExpression4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression4Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression4_in_entryRuleXExpression48486);
            iv_ruleXExpression4=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression48496); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3774:1: ruleXExpression4 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) ;
    public final EObject ruleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3777:28: ( ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3778:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3778:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3778:2: ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3778:2: ( (lv_a_0_0= ruleXExpression3 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3779:1: (lv_a_0_0= ruleXExpression3 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3779:1: (lv_a_0_0= ruleXExpression3 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3780:3: lv_a_0_0= ruleXExpression3
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression4Access().getAXExpression3ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression48542);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:2: ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==97) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }
                else if ( (LA49_0==98) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }
                else if ( (LA49_0==99) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }
                else if ( (LA49_0==100) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }
                else if ( (LA49_0==40) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }
                else if ( (LA49_0==39) && (synpred3_InternalESyntax())) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:4: ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3801:1: (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3802:3: lv_op_1_0= ruleEQUALITY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getOpEQUALITY_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression48574);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3818:2: ( (lv_b_2_0= ruleXExpression3 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3819:1: (lv_b_2_0= ruleXExpression3 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3819:1: (lv_b_2_0= ruleXExpression3 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3820:3: lv_b_2_0= ruleXExpression3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getBXExpression3ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression48595);
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
            	    break loop49;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3844:1: entryRuleXExpression5 returns [EObject current=null] : iv_ruleXExpression5= ruleXExpression5 EOF ;
    public final EObject entryRuleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression5 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3845:2: (iv_ruleXExpression5= ruleXExpression5 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3846:2: iv_ruleXExpression5= ruleXExpression5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression5Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression5_in_entryRuleXExpression58633);
            iv_ruleXExpression5=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression58643); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:1: ruleXExpression5 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) ;
    public final EObject ruleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3856:28: ( ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:2: ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3857:2: ( (lv_a_0_0= ruleXExpression4 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3858:1: (lv_a_0_0= ruleXExpression4 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3858:1: (lv_a_0_0= ruleXExpression4 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3859:3: lv_a_0_0= ruleXExpression4
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression5Access().getAXExpression4ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression58689);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:2: ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==101) && (synpred4_InternalESyntax())) {
                    alt50=1;
                }
                else if ( (LA50_0==102) && (synpred4_InternalESyntax())) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:4: ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3880:1: (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3881:3: lv_op_1_0= ruleBOOLEAN_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getOpBOOLEAN_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression58721);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3897:2: ( (lv_b_2_0= ruleXExpression4 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3898:1: (lv_b_2_0= ruleXExpression4 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3898:1: (lv_b_2_0= ruleXExpression4 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3899:3: lv_b_2_0= ruleXExpression4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getBXExpression4ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression58742);
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
            	    break loop50;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3923:1: entryRuleXExpression6 returns [EObject current=null] : iv_ruleXExpression6= ruleXExpression6 EOF ;
    public final EObject entryRuleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression6 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3924:2: (iv_ruleXExpression6= ruleXExpression6 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3925:2: iv_ruleXExpression6= ruleXExpression6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression6Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression6_in_entryRuleXExpression68780);
            iv_ruleXExpression6=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression6; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression68790); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3932:1: ruleXExpression6 returns [EObject current=null] : ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) ;
    public final EObject ruleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3935:28: ( ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==14) ) {
                        int LA51_3 = input.LA(3);

                        if ( (LA51_3==RULE_ID) ) {
                            int LA51_5 = input.LA(4);

                            if ( (LA51_5==25) && (synpred5_InternalESyntax())) {
                                alt51=1;
                            }


                        }


                    }
                    else if ( (LA51_2==25) && (synpred5_InternalESyntax())) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:4: ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3941:1: (lv_ref_0_0= ruleVariableReference )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3942:3: lv_ref_0_0= ruleVariableReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression6Access().getRefVariableReferenceParserRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableReference_in_ruleXExpression68847);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXExpression68863);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3966:3: ( (lv_a_2_0= ruleXExpression5 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3967:1: (lv_a_2_0= ruleXExpression5 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3967:1: (lv_a_2_0= ruleXExpression5 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3968:3: lv_a_2_0= ruleXExpression5
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression6Access().getAXExpression5ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression5_in_ruleXExpression68885);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3992:1: entryRuleXExpressionLiteral returns [EObject current=null] : iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF ;
    public final EObject entryRuleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionLiteral = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3993:2: (iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3994:2: iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral8921);
            iv_ruleXExpressionLiteral=ruleXExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionLiteral8931); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4001:1: ruleXExpressionLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4004:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4005:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4005:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4006:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4006:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4007:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral8976);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4031:1: entryRuleXTopLevelExpression returns [EObject current=null] : iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF ;
    public final EObject entryRuleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTopLevelExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4032:2: (iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4033:2: iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression9011);
            iv_ruleXTopLevelExpression=ruleXTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTopLevelExpression9021); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4040:1: ruleXTopLevelExpression returns [EObject current=null] : ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression | this_XWhileExpression_3= ruleXWhileExpression | this_XScriptedExpression_4= ruleXScriptedExpression ) ;
    public final EObject ruleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_XExpression_0 = null;

        EObject this_XIfExpression_2 = null;

        EObject this_XWhileExpression_3 = null;

        EObject this_XScriptedExpression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4043:28: ( ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression | this_XWhileExpression_3= ruleXWhileExpression | this_XScriptedExpression_4= ruleXScriptedExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4044:1: ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression | this_XWhileExpression_3= ruleXWhileExpression | this_XScriptedExpression_4= ruleXScriptedExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4044:1: ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression | this_XWhileExpression_3= ruleXWhileExpression | this_XScriptedExpression_4= ruleXScriptedExpression )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_HEXINT:
            case RULE_BINARY:
            case 41:
            case 57:
            case 59:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt52=1;
                }
                break;
            case 60:
                {
                alt52=2;
                }
                break;
            case 62:
                {
                alt52=3;
                }
                break;
            case RULE_SCRIPT:
                {
                alt52=4;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4044:2: (this_XExpression_0= ruleXExpression otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4044:2: (this_XExpression_0= ruleXExpression otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4045:5: this_XExpression_0= ruleXExpression otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTopLevelExpression9069);
                    this_XExpression_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXTopLevelExpression9080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4059:5: this_XIfExpression_2= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression9109);
                    this_XIfExpression_2=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4069:5: this_XWhileExpression_3= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXWhileExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXTopLevelExpression9136);
                    this_XWhileExpression_3=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4079:5: this_XScriptedExpression_4= ruleXScriptedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXScriptedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXScriptedExpression_in_ruleXTopLevelExpression9163);
                    this_XScriptedExpression_4=ruleXScriptedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XScriptedExpression_4; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4095:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4096:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4097:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign9199);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign9210); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4104:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4107:28: (kw= '=' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4109:2: kw= '='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpSingleAssign9247); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4122:1: entryRuleXIsLiteralExpression returns [EObject current=null] : iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF ;
    public final EObject entryRuleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIsLiteralExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4123:2: (iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4124:2: iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIsLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression9286);
            iv_ruleXIsLiteralExpression=ruleXIsLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIsLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIsLiteralExpression9296); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4131:1: ruleXIsLiteralExpression returns [EObject current=null] : (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4134:28: ( (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4135:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4135:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4135:3: otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleXIsLiteralExpression9333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIsLiteralExpressionAccess().getIsliteralKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXIsLiteralExpression9345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIsLiteralExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4143:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4144:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4144:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4145:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression9366);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXIsLiteralExpression9378); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4173:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4174:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4175:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression9414);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression9424); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4182:1: ruleXIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4185:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4186:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression9461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIfExpressionAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression9473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4194:1: ( (lv_if_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4195:1: (lv_if_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4195:1: (lv_if_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4196:3: lv_if_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression9494);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression9506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleXIfExpression9518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4220:1: ( (lv_then_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4221:1: (lv_then_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4221:1: (lv_then_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4222:3: lv_then_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression9539);
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

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXIfExpression9551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:1: ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) && (synpred6_InternalESyntax())) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:2: ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}'
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:2: ( ( 'else' )=>otherlv_7= 'else' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:3: ( 'else' )=>otherlv_7= 'else'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleXIfExpression9572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXIfExpressionAccess().getElseKeyword_7_0());
                          
                    }

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleXIfExpression9585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4251:1: ( (lv_else_9_0= ruleOperationBlock ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:1: (lv_else_9_0= ruleOperationBlock )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:1: (lv_else_9_0= ruleOperationBlock )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4253:3: lv_else_9_0= ruleOperationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseOperationBlockParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression9606);
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

                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleXIfExpression9618); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4281:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4282:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4283:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9656);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression9666); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4290:1: ruleXWhileExpression returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4293:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4294:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4294:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4294:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleOperationBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression9703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression9715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4302:1: ( (lv_cond_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4303:1: (lv_cond_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4303:1: (lv_cond_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4304:3: lv_cond_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getCondXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9736);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression9748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleXWhileExpression9760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4328:1: ( (lv_do_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4329:1: (lv_do_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4329:1: (lv_do_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4330:3: lv_do_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getDoOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXWhileExpression9781);
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

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXWhileExpression9793); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4358:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4360:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9829);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression9839); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4367:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4370:28: ( (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4371:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4371:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4371:3: otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression9876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4375:1: ( (lv_a_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4376:1: (lv_a_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4376:1: (lv_a_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4377:3: lv_a_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression9897);
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

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression9909); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXScriptedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4405:1: entryRuleXScriptedExpression returns [EObject current=null] : iv_ruleXScriptedExpression= ruleXScriptedExpression EOF ;
    public final EObject entryRuleXScriptedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXScriptedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4406:2: (iv_ruleXScriptedExpression= ruleXScriptedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4407:2: iv_ruleXScriptedExpression= ruleXScriptedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXScriptedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXScriptedExpression_in_entryRuleXScriptedExpression9945);
            iv_ruleXScriptedExpression=ruleXScriptedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXScriptedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXScriptedExpression9955); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXScriptedExpression"


    // $ANTLR start "ruleXScriptedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4414:1: ruleXScriptedExpression returns [EObject current=null] : ( ( (lv_script_0_0= RULE_SCRIPT ) ) (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )? ) ;
    public final EObject ruleXScriptedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_script_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4417:28: ( ( ( (lv_script_0_0= RULE_SCRIPT ) ) (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4418:1: ( ( (lv_script_0_0= RULE_SCRIPT ) ) (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4418:1: ( ( (lv_script_0_0= RULE_SCRIPT ) ) (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4418:2: ( (lv_script_0_0= RULE_SCRIPT ) ) (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4418:2: ( (lv_script_0_0= RULE_SCRIPT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4419:1: (lv_script_0_0= RULE_SCRIPT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4419:1: (lv_script_0_0= RULE_SCRIPT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4420:3: lv_script_0_0= RULE_SCRIPT
            {
            lv_script_0_0=(Token)match(input,RULE_SCRIPT,FOLLOW_RULE_SCRIPT_in_ruleXScriptedExpression9997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_script_0_0, grammarAccess.getXScriptedExpressionAccess().getScriptSCRIPTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXScriptedExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"script",
                      		lv_script_0_0, 
                      		"SCRIPT");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4436:2: (otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4436:4: otherlv_1= '{' ( (lv_conditional_2_0= ruleOperationBlock ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleXScriptedExpression10015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXScriptedExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4440:1: ( (lv_conditional_2_0= ruleOperationBlock ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4441:1: (lv_conditional_2_0= ruleOperationBlock )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4441:1: (lv_conditional_2_0= ruleOperationBlock )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4442:3: lv_conditional_2_0= ruleOperationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXScriptedExpressionAccess().getConditionalOperationBlockParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationBlock_in_ruleXScriptedExpression10036);
                    lv_conditional_2_0=ruleOperationBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXScriptedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"conditional",
                              		lv_conditional_2_0, 
                              		"OperationBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleXScriptedExpression10048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXScriptedExpressionAccess().getRightCurlyBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleXScriptedExpression"


    // $ANTLR start "rulePrimitiveKind"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4470:1: rulePrimitiveKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator rulePrimitiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4472:28: ( ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt55=1;
                }
                break;
            case 64:
                {
                alt55=2;
                }
                break;
            case 65:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:2: (enumLiteral_0= 'unsigned' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:2: (enumLiteral_0= 'unsigned' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:4: enumLiteral_0= 'unsigned'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_rulePrimitiveKind10100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:6: (enumLiteral_1= 'signed' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:6: (enumLiteral_1= 'signed' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:8: enumLiteral_1= 'signed'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_rulePrimitiveKind10117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:6: (enumLiteral_2= 'real' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:6: (enumLiteral_2= 'real' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_rulePrimitiveKind10134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveKindAccess().getREALEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "rulePrimitiveKind"


    // $ANTLR start "ruleParameterKind"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4495:1: ruleParameterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) ;
    public final Enumerator ruleParameterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4497:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt56=1;
                }
                break;
            case 67:
                {
                alt56=2;
                }
                break;
            case 35:
                {
                alt56=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleParameterKind10179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:6: (enumLiteral_1= 'var' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:6: (enumLiteral_1= 'var' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:8: enumLiteral_1= 'var'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_67_in_ruleParameterKind10196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:6: (enumLiteral_2= 'const' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:6: (enumLiteral_2= 'const' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:8: enumLiteral_2= 'const'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleParameterKind10213); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4520:1: ruleOperationRole returns [Enumerator current=null] : ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4522:28: ( ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4523:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4523:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            int alt57=20;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt57=1;
                }
                break;
            case 69:
                {
                alt57=2;
                }
                break;
            case 70:
                {
                alt57=3;
                }
                break;
            case 71:
                {
                alt57=4;
                }
                break;
            case 72:
                {
                alt57=5;
                }
                break;
            case 73:
                {
                alt57=6;
                }
                break;
            case 74:
                {
                alt57=7;
                }
                break;
            case 75:
                {
                alt57=8;
                }
                break;
            case 76:
                {
                alt57=9;
                }
                break;
            case 77:
                {
                alt57=10;
                }
                break;
            case 78:
                {
                alt57=11;
                }
                break;
            case 79:
                {
                alt57=12;
                }
                break;
            case 80:
                {
                alt57=13;
                }
                break;
            case 81:
                {
                alt57=14;
                }
                break;
            case 82:
                {
                alt57=15;
                }
                break;
            case 83:
                {
                alt57=16;
                }
                break;
            case 84:
                {
                alt57=17;
                }
                break;
            case 85:
                {
                alt57=18;
                }
                break;
            case 86:
                {
                alt57=19;
                }
                break;
            case 87:
                {
                alt57=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4523:2: (enumLiteral_0= 'SET' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4523:2: (enumLiteral_0= 'SET' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4523:4: enumLiteral_0= 'SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleOperationRole10258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4529:6: (enumLiteral_1= 'ADD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4529:6: (enumLiteral_1= 'ADD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4529:8: enumLiteral_1= 'ADD'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleOperationRole10275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4535:6: (enumLiteral_2= 'SUBTRACT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4535:6: (enumLiteral_2= 'SUBTRACT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4535:8: enumLiteral_2= 'SUBTRACT'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleOperationRole10292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4541:6: (enumLiteral_3= 'AND' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4541:6: (enumLiteral_3= 'AND' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4541:8: enumLiteral_3= 'AND'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleOperationRole10309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4547:6: (enumLiteral_4= 'OR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4547:6: (enumLiteral_4= 'OR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4547:8: enumLiteral_4= 'OR'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_72_in_ruleOperationRole10326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4553:6: (enumLiteral_5= 'XOR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4553:6: (enumLiteral_5= 'XOR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4553:8: enumLiteral_5= 'XOR'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_73_in_ruleOperationRole10343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4559:6: (enumLiteral_6= 'EQUALS' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4559:6: (enumLiteral_6= 'EQUALS' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4559:8: enumLiteral_6= 'EQUALS'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_74_in_ruleOperationRole10360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4565:6: (enumLiteral_7= 'BRANCH' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4565:6: (enumLiteral_7= 'BRANCH' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4565:8: enumLiteral_7= 'BRANCH'
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_75_in_ruleOperationRole10377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4571:6: (enumLiteral_8= 'UC_GOTO' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4571:6: (enumLiteral_8= 'UC_GOTO' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4571:8: enumLiteral_8= 'UC_GOTO'
                    {
                    enumLiteral_8=(Token)match(input,76,FOLLOW_76_in_ruleOperationRole10394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4577:6: (enumLiteral_9= 'NOT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4577:6: (enumLiteral_9= 'NOT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4577:8: enumLiteral_9= 'NOT'
                    {
                    enumLiteral_9=(Token)match(input,77,FOLLOW_77_in_ruleOperationRole10411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4583:6: (enumLiteral_10= 'INDIRECTION' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4583:6: (enumLiteral_10= 'INDIRECTION' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4583:8: enumLiteral_10= 'INDIRECTION'
                    {
                    enumLiteral_10=(Token)match(input,78,FOLLOW_78_in_ruleOperationRole10428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4589:6: (enumLiteral_11= 'CLEAR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4589:6: (enumLiteral_11= 'CLEAR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4589:8: enumLiteral_11= 'CLEAR'
                    {
                    enumLiteral_11=(Token)match(input,79,FOLLOW_79_in_ruleOperationRole10445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4595:6: (enumLiteral_12= 'INCREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4595:6: (enumLiteral_12= 'INCREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4595:8: enumLiteral_12= 'INCREMENT'
                    {
                    enumLiteral_12=(Token)match(input,80,FOLLOW_80_in_ruleOperationRole10462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4601:6: (enumLiteral_13= 'DECREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4601:6: (enumLiteral_13= 'DECREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4601:8: enumLiteral_13= 'DECREMENT'
                    {
                    enumLiteral_13=(Token)match(input,81,FOLLOW_81_in_ruleOperationRole10479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4607:6: (enumLiteral_14= 'DIV' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4607:6: (enumLiteral_14= 'DIV' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4607:8: enumLiteral_14= 'DIV'
                    {
                    enumLiteral_14=(Token)match(input,82,FOLLOW_82_in_ruleOperationRole10496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4613:6: (enumLiteral_15= 'MOD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4613:6: (enumLiteral_15= 'MOD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4613:8: enumLiteral_15= 'MOD'
                    {
                    enumLiteral_15=(Token)match(input,83,FOLLOW_83_in_ruleOperationRole10513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4619:6: (enumLiteral_16= 'LT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4619:6: (enumLiteral_16= 'LT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4619:8: enumLiteral_16= 'LT'
                    {
                    enumLiteral_16=(Token)match(input,84,FOLLOW_84_in_ruleOperationRole10530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:6: (enumLiteral_17= 'LTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:6: (enumLiteral_17= 'LTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:8: enumLiteral_17= 'LTE'
                    {
                    enumLiteral_17=(Token)match(input,85,FOLLOW_85_in_ruleOperationRole10547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:6: (enumLiteral_18= 'GT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:6: (enumLiteral_18= 'GT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:8: enumLiteral_18= 'GT'
                    {
                    enumLiteral_18=(Token)match(input,86,FOLLOW_86_in_ruleOperationRole10564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4637:6: (enumLiteral_19= 'GTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4637:6: (enumLiteral_19= 'GTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4637:8: enumLiteral_19= 'GTE'
                    {
                    enumLiteral_19=(Token)match(input,87,FOLLOW_87_in_ruleOperationRole10581); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4647:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4649:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==66) ) {
                alt58=1;
            }
            else if ( (LA58_0==88) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleBinaryType10626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:6: (enumLiteral_1= 'hexfile' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:6: (enumLiteral_1= 'hexfile' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:8: enumLiteral_1= 'hexfile'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleBinaryType10643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getHEXFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryTypeAccess().getHEXFILEEnumLiteralDeclaration_1()); 
                          
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4666:1: ruleUNARY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) ;
    public final Enumerator ruleUNARY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4668:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4669:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4669:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt59=1;
                }
                break;
            case 90:
                {
                alt59=2;
                }
                break;
            case 91:
                {
                alt59=3;
                }
                break;
            case 92:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4669:2: (enumLiteral_0= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4669:2: (enumLiteral_0= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4669:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleUNARY_OPERATOR10688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:6: (enumLiteral_1= '!' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:6: (enumLiteral_1= '!' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleUNARY_OPERATOR10705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:6: (enumLiteral_2= '&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:6: (enumLiteral_2= '&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:8: enumLiteral_2= '&'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUNARY_OPERATOR10722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:6: (enumLiteral_3= '@' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:6: (enumLiteral_3= '@' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:8: enumLiteral_3= '@'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_92_in_ruleUNARY_OPERATOR10739); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4697:1: ruleMULTIPLICATIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4699:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt60=1;
                }
                break;
            case 94:
                {
                alt60=2;
                }
                break;
            case 95:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:2: (enumLiteral_0= '*' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:2: (enumLiteral_0= '*' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleMULTIPLICATIVE_OPERATOR10784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:6: (enumLiteral_1= '/' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:6: (enumLiteral_1= '/' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleMULTIPLICATIVE_OPERATOR10801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4712:6: (enumLiteral_2= '%' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4712:6: (enumLiteral_2= '%' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4712:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_95_in_ruleMULTIPLICATIVE_OPERATOR10818); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4722:1: ruleADDITIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleADDITIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4724:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==96) ) {
                alt61=1;
            }
            else if ( (LA61_0==89) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:2: (enumLiteral_0= '+' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:2: (enumLiteral_0= '+' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleADDITIVE_OPERATOR10863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:6: (enumLiteral_1= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:6: (enumLiteral_1= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleADDITIVE_OPERATOR10880); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4741:1: ruleEQUALITY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4743:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4744:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4744:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt62=1;
                }
                break;
            case 98:
                {
                alt62=2;
                }
                break;
            case 99:
                {
                alt62=3;
                }
                break;
            case 100:
                {
                alt62=4;
                }
                break;
            case 40:
                {
                alt62=5;
                }
                break;
            case 39:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4744:2: (enumLiteral_0= '==' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4744:2: (enumLiteral_0= '==' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4744:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_97_in_ruleEQUALITY_OPERATOR10925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4750:6: (enumLiteral_1= '!=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4750:6: (enumLiteral_1= '!=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4750:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_98_in_ruleEQUALITY_OPERATOR10942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4756:6: (enumLiteral_2= '>=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4756:6: (enumLiteral_2= '>=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4756:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_99_in_ruleEQUALITY_OPERATOR10959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:6: (enumLiteral_3= '<=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:6: (enumLiteral_3= '<=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_100_in_ruleEQUALITY_OPERATOR10976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:6: (enumLiteral_4= '>' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:6: (enumLiteral_4= '>' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_ruleEQUALITY_OPERATOR10993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4774:6: (enumLiteral_5= '<' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4774:6: (enumLiteral_5= '<' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4774:8: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_39_in_ruleEQUALITY_OPERATOR11010); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4784:1: ruleBOOLEAN_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBOOLEAN_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4786:28: ( ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4787:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4787:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==101) ) {
                alt63=1;
            }
            else if ( (LA63_0==102) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4787:2: (enumLiteral_0= '||' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4787:2: (enumLiteral_0= '||' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4787:4: enumLiteral_0= '||'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleBOOLEAN_OPERATOR11055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4793:6: (enumLiteral_1= '&&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4793:6: (enumLiteral_1= '&&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4793:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleBOOLEAN_OPERATOR11072); if (state.failed) return current;
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
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3638:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3639:1: ( ruleMULTIPLICATIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3639:1: ( ruleMULTIPLICATIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3640:1: ruleMULTIPLICATIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax8263);
        ruleMULTIPLICATIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalESyntax

    // $ANTLR start synpred2_InternalESyntax
    public final void synpred2_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3717:4: ( ( ruleADDITIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3718:1: ( ruleADDITIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3718:1: ( ruleADDITIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3719:1: ruleADDITIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax8410);
        ruleADDITIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalESyntax

    // $ANTLR start synpred3_InternalESyntax
    public final void synpred3_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3796:4: ( ( ruleEQUALITY_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:1: ( ruleEQUALITY_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:1: ( ruleEQUALITY_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3798:1: ruleEQUALITY_OPERATOR
        {
        pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax8557);
        ruleEQUALITY_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalESyntax

    // $ANTLR start synpred4_InternalESyntax
    public final void synpred4_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3875:4: ( ( ruleBOOLEAN_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3876:1: ( ruleBOOLEAN_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3876:1: ( ruleBOOLEAN_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3877:1: ruleBOOLEAN_OPERATOR
        {
        pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax8704);
        ruleBOOLEAN_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalESyntax

    // $ANTLR start synpred5_InternalESyntax
    public final void synpred5_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3936:4: ( ( ruleVariableReference ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3937:1: ( ruleVariableReference )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3937:1: ( ruleVariableReference )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3938:1: ruleVariableReference
        {
        pushFollow(FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax8830);
        ruleVariableReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalESyntax

    // $ANTLR start synpred6_InternalESyntax
    public final void synpred6_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:3: ( 'else' )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4242:5: 'else'
        {
        match(input,61,FOLLOW_61_in_synpred6_InternalESyntax9564); if (state.failed) return ;

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


    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA41_eotS =
        "\13\uffff";
    static final String DFA41_eofS =
        "\4\uffff\1\11\5\uffff\1\11";
    static final String DFA41_minS =
        "\1\4\3\uffff\1\16\1\uffff\1\4\3\uffff\1\21";
    static final String DFA41_maxS =
        "\1\73\3\uffff\1\146\1\uffff\1\4\3\uffff\1\146";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\uffff\1\6\1\5\1\4\1\uffff";
    static final String DFA41_specialS =
        "\13\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\4\3\1\41\uffff\1\2\17\uffff\1\5\1\uffff\1\3",
            "",
            "",
            "",
            "\1\6\2\uffff\2\11\12\uffff\2\11\2\uffff\1\7\1\11\4\uffff\2"+
            "\11\1\10\1\11\17\uffff\1\11\36\uffff\1\11\3\uffff\12\11",
            "",
            "\1\12",
            "",
            "",
            "",
            "\2\11\12\uffff\2\11\2\uffff\1\7\1\11\4\uffff\2\11\1\10\1\11"+
            "\17\uffff\1\11\36\uffff\1\11\3\uffff\12\11"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "3208:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleCompilationUnit132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleCompilationUnit159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName273 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName307 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleReferenceID_in_entryRuleReferenceID355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceID366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceID407 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleReferenceID425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceID442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLITERAL539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLITERAL565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleLITERAL591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModule683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule704 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleModule717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule740 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleModule753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule776 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleModule792 = new BitSet(new long[]{0x8000000914380012L,0x0000000000000003L});
    public static final BitSet FOLLOW_19_in_ruleModule805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule828 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModule840 = new BitSet(new long[]{0x8000000914380012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleModuleItem_in_ruleModule863 = new BitSet(new long[]{0x8000000914300012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleModuleItem_in_entryRuleModuleItem900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleItem910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleModuleItem958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModuleItem969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigVariable_in_ruleModuleItem999 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModuleItem1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleModuleItem1040 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModuleItem1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceReference_in_ruleModuleItem1081 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModuleItem1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleModuleItem1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceReference_in_entryRuleInstanceReference1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceReference1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInstanceReference1203 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleInstanceReference1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceReference1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigVariable_in_entryRuleConfigVariable1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigVariable1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConfigVariable1340 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleConfigVariable1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigVariable1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary1419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLibrary1466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1487 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleLibrary1500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1523 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleLibrary1536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1559 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleLibrary1575 = new BitSet(new long[]{0x8000101915380012L,0x0000000000000003L});
    public static final BitSet FOLLOW_19_in_ruleLibrary1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1611 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLibrary1623 = new BitSet(new long[]{0x8000101915380012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_ruleLibrary1646 = new BitSet(new long[]{0x8000101915300012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibraryItem1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLibraryItem1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleLibraryItem1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLibraryItem1795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLibraryItem1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleLibraryItem1836 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLibraryItem1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_ruleLibraryItem1877 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLibraryItem1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2016 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleType2033 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType2054 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleType2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_ruleTypeDef2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_ruleTypeDef2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_ruleTypeDef2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_ruleTypeDef2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerTypeDef2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePointerTypeDef2349 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePointerTypeDef2361 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rulePointerTypeDef2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDef2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleArrayTypeDef2465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArrayTypeDef2477 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayTypeDef2498 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleArrayTypeDef2510 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayTypeDef2522 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleArrayTypeDef2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTypeDef2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleRefTypeDef2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDef2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef2727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataTypeDef2744 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeDef2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef2797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDef2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStructTypeDef2853 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStructTypeDef2865 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2886 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleStructTypeDef2899 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef2920 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_34_in_ruleStructTypeDef2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDefMember2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleStructTypeDefMember3035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructTypeDefMember3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable3093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantVariable3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleConstantVariable3149 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleConstantVariable3170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantVariable3187 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstantVariable3204 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantVariable3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable3261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterVariable3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRegisterVariable3317 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleRegisterVariable3338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisterVariable3355 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRegisterVariable3372 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRegisterVariable3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_entryRuleOperationStep3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationStep3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_ruleOperationStep3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleOperationStep3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperationStep3541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOperationStep3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel3616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabel3672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel3689 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLabel3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionWord3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInstructionWord3789 = new BitSet(new long[]{0x80000001140000F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleWordSection_in_ruleInstructionWord3810 = new BitSet(new long[]{0x80000101140000F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_40_in_ruleInstructionWord3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordSection_in_entryRuleWordSection3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordSection3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleWordSection3917 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleWordSection3944 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWordSection3956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection3973 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleWordSection3991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleLiteralValue4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleVariable4197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleVariableReference4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall4347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleOperationCall4405 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOperationCall4417 = new BitSet(new long[]{0x8A000601140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4439 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperationCall4452 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall4473 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleOperationCall4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter4525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallParameter4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperationCallParameter4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4676 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOperation4693 = new BitSet(new long[]{0x8000040914000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4715 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation4728 = new BitSet(new long[]{0x8000000914000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4749 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleOperation4765 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation4777 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleOperation4798 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation4810 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperation4823 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperation4845 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperation4872 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOperation4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationBlock4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_ruleOperationBlock4988 = new BitSet(new long[]{0xDA0002C1140001F2L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterVariable5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterKind_in_ruleParameterVariable5090 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleParameterVariable5112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterVariable5129 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameterVariable5147 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleParameterVariable5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition5206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperatorDefinition5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FFFFF0L});
    public static final BitSet FOLLOW_ruleOperationRole_in_ruleOperatorDefinition5274 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperatorDefinition5286 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleOperatorDefinition5309 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleOperatorDefinition5322 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleOperatorDefinition5345 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleOperatorDefinition5360 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperatorDefinition5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBinary5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLinkedBinary5457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5478 = new BitSet(new long[]{0x0000000000040000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleBinaryType_in_ruleLinkedBinary5499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLinkedBinary5512 = new BitSet(new long[]{0x0180800000080002L});
    public static final BitSet FOLLOW_19_in_ruleLinkedBinary5525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedBinary5548 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLinkedBinary5560 = new BitSet(new long[]{0x0180800000080002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_ruleLinkedBinary5583 = new BitSet(new long[]{0x0180800000000002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_entryRuleBinarySection5620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinarySection5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection5678 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_ruleBinarySection5705 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5732 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBinarySection5744 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinarySection5765 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBinarySection5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBinarySection5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFunctionBinarySection5860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionBinarySection5877 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionBinarySection5894 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleFunctionBinarySection5906 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionBinarySection5918 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5939 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection5951 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleFunctionBinarySection5963 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionBinarySection5975 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5996 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection6008 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFunctionBinarySection6020 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionBinarySection6032 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection6053 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection6065 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection6087 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection6099 = new BitSet(new long[]{0x0020040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFunctionBinarySection6113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBinarySection6125 = new BitSet(new long[]{0x0018000000000010L});
    public static final BitSet FOLLOW_51_in_ruleFunctionBinarySection6139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection6162 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection6174 = new BitSet(new long[]{0x0018000000000010L});
    public static final BitSet FOLLOW_ruleLinkedInstance_in_ruleFunctionBinarySection6202 = new BitSet(new long[]{0x0018000000000010L});
    public static final BitSet FOLLOW_52_in_ruleFunctionBinarySection6216 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBinarySection6228 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleFunctionBinarySection6249 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFunctionBinarySection6261 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFunctionBinarySection6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedInstance_in_entryRuleLinkedInstance6309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedInstance6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedInstance6367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedInstance6384 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLinkedInstance6401 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleReferenceLink_in_ruleLinkedInstance6424 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInstanceConfig_in_ruleLinkedInstance6451 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLinkedInstance6464 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleLinkedInstance6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceLink_in_entryRuleReferenceLink6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceLink6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceLink6569 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleReferenceLink6581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceLink6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceConfig_in_entryRuleInstanceConfig6637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceConfig6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceConfig6692 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInstanceConfig6704 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleInstanceConfig6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory6761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionMemory6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFunctionMemory6808 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory6829 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleFunctionMemory6841 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantBinarySection6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleConstantBinarySection6945 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConstantBinarySection6957 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantBinarySection6979 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantBinarySection6991 = new BitSet(new long[]{0x8A000205140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_34_in_ruleConstantBinarySection7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection7041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceBinarySection7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReferenceBinarySection7088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression7147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression6_in_ruleXExpression7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression7491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSizeOfExpression7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSizeOfExpression7538 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXSizeOfExpression7550 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleXSizeOfExpression7571 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXSizeOfExpression7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression7619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStructExpression7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceID_in_ruleXStructExpression7677 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXStructExpression7689 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression7710 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleXStructExpression7723 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression7744 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleXStructExpression7759 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXStructExpression7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_entryRuleXExpression17809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression17819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression17865 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression0_in_ruleXExpression17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression0_in_entryRuleXExpression07923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_ruleXExpression07979 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXExpression07992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXExpression08009 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM18052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionM18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM18108 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXExpressionM18121 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionM18142 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXExpressionM18154 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_entryRuleXExpression28192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression28202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_ruleXExpression28248 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression28280 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression28301 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_entryRuleXExpression38339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression38349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression38395 = new BitSet(new long[]{0x0000000000000002L,0x0000000102000000L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression38427 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression38448 = new BitSet(new long[]{0x0000000000000002L,0x0000000102000000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_entryRuleXExpression48486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression48496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression48542 = new BitSet(new long[]{0x0000018000000002L,0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression48574 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression48595 = new BitSet(new long[]{0x0000018000000002L,0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_entryRuleXExpression58633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression58643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression58689 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression58721 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression58742 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleXExpression6_in_entryRuleXExpression68780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression68790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXExpression68847 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXExpression68863 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression5_in_ruleXExpression68885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral8921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionLiteral8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression9011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTopLevelExpression9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTopLevelExpression9069 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXTopLevelExpression9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXTopLevelExpression9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXScriptedExpression_in_ruleXTopLevelExpression9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign9199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpSingleAssign9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression9286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIsLiteralExpression9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIsLiteralExpression9333 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIsLiteralExpression9345 = new BitSet(new long[]{0x8000000114000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression9366 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIsLiteralExpression9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression9461 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression9473 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression9494 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression9506 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXIfExpression9518 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression9539 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIfExpression9551 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXIfExpression9572 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXIfExpression9585 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression9606 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIfExpression9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression9703 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression9715 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9736 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression9748 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXWhileExpression9760 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXWhileExpression9781 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXWhileExpression9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression9876 = new BitSet(new long[]{0x8A000201140000F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression9897 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXScriptedExpression_in_entryRuleXScriptedExpression9945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScriptedExpression9955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_in_ruleXScriptedExpression9997 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXScriptedExpression10015 = new BitSet(new long[]{0xDA0002C5140001F0L,0x000000001E000003L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXScriptedExpression10036 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXScriptedExpression10048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimitiveKind10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveKind10117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimitiveKind10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleParameterKind10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleParameterKind10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleParameterKind10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperationRole10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationRole10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationRole10292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperationRole10309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperationRole10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperationRole10343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperationRole10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperationRole10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperationRole10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperationRole10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperationRole10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperationRole10445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperationRole10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperationRole10479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperationRole10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperationRole10513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperationRole10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperationRole10547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperationRole10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperationRole10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBinaryType10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBinaryType10643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUNARY_OPERATOR10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUNARY_OPERATOR10705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUNARY_OPERATOR10722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleUNARY_OPERATOR10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleMULTIPLICATIVE_OPERATOR10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleMULTIPLICATIVE_OPERATOR10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleMULTIPLICATIVE_OPERATOR10818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleADDITIVE_OPERATOR10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleADDITIVE_OPERATOR10880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleEQUALITY_OPERATOR10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleEQUALITY_OPERATOR10942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleEQUALITY_OPERATOR10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleEQUALITY_OPERATOR10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEQUALITY_OPERATOR10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEQUALITY_OPERATOR11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBOOLEAN_OPERATOR11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleBOOLEAN_OPERATOR11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred6_InternalESyntax9564 = new BitSet(new long[]{0x0000000000000002L});

}