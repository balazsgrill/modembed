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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_BINARY", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "';'", "'import'", "'.'", "'::'", "'class'", "'extends'", "','", "'{'", "'use'", "'}'", "'ref'", "'config'", "'library'", "'overrides'", "'type'", "'='", "'pointer'", "'of'", "'array'", "'['", "']'", "'bits'", "'struct'", "'const'", "'reg'", "':'", "'compilecontext'", "'label'", "'<'", "'>'", "'('", "')'", "'returns'", "'operator'", "'binary'", "'at'", "'link'", "'memwidth'", "'lib'", "'mem'", "'..'", "'data'", "'include'", "'sizeof'", "'->'", "'isliteral'", "'if'", "'else'", "'unsigned'", "'signed'", "'real'", "'default'", "'var'", "'SET'", "'ADD'", "'SUBTRACT'", "'AND'", "'OR'", "'XOR'", "'EQUALS'", "'BRANCH'", "'UC_GOTO'", "'NOT'", "'INDIRECTION'", "'CLEAR'", "'INCREMENT'", "'DECREMENT'", "'DIV'", "'MOD'", "'LT'", "'LTE'", "'GT'", "'GTE'", "'hexfile'", "'-'", "'!'", "'&'", "'@'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'"
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
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__13=13;
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
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=8;
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
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;

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
        	return "Package";	
       	}
       	
       	@Override
       	protected ESyntaxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:68:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:69:2: (iv_rulePackage= rulePackage EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:70:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:77:1: rulePackage returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleNameSpaceName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleCompilationUnit ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:80:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleNameSpaceName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleCompilationUnit ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleNameSpaceName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleCompilationUnit ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleNameSpaceName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleCompilationUnit ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleNameSpaceName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleCompilationUnit ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getNamespaceKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:85:1: ( (lv_name_1_0= ruleNameSpaceName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:86:1: (lv_name_1_0= ruleNameSpaceName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:86:1: (lv_name_1_0= ruleNameSpaceName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:87:3: lv_name_1_0= ruleNameSpaceName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getNameNameSpaceNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameSpaceName_in_rulePackage143);
            lv_name_1_0=ruleNameSpaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NameSpaceName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackage155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:107:1: (otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:107:3: otherlv_3= 'import' ( ( ruleNameSpaceName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePackage168); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:111:1: ( ( ruleNameSpaceName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:112:1: ( ruleNameSpaceName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:112:1: ( ruleNameSpaceName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:113:3: ruleNameSpaceName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getUsesPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNameSpaceName_in_rulePackage191);
            	    ruleNameSpaceName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePackage203); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:130:3: ( (lv_items_6_0= ruleCompilationUnit ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==26||LA2_0==48) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (lv_items_6_0= ruleCompilationUnit )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (lv_items_6_0= ruleCompilationUnit )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:132:3: lv_items_6_0= ruleCompilationUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getItemsCompilationUnitParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompilationUnit_in_rulePackage226);
            	    lv_items_6_0=ruleCompilationUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_6_0, 
            	              		"CompilationUnit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleCompilationUnit"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:156:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:157:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:158:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit263);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilationUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit273); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:165:1: ruleCompilationUnit returns [EObject current=null] : (this_Class_0= ruleClass | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Library_1 = null;

        EObject this_LinkedBinary_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:168:28: ( (this_Class_0= ruleClass | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:169:1: (this_Class_0= ruleClass | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:169:1: (this_Class_0= ruleClass | this_Library_1= ruleLibrary | this_LinkedBinary_2= ruleLinkedBinary )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 48:
                {
                alt3=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:170:5: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleCompilationUnit320);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Class_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:180:5: this_Library_1= ruleLibrary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLibraryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLibrary_in_ruleCompilationUnit347);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:190:5: this_LinkedBinary_2= ruleLinkedBinary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilationUnitAccess().getLinkedBinaryParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit374);
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


    // $ANTLR start "entryRuleNameSpaceName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:206:1: entryRuleNameSpaceName returns [String current=null] : iv_ruleNameSpaceName= ruleNameSpaceName EOF ;
    public final String entryRuleNameSpaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameSpaceName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:207:2: (iv_ruleNameSpaceName= ruleNameSpaceName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:208:2: iv_ruleNameSpaceName= ruleNameSpaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameSpaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleNameSpaceName_in_entryRuleNameSpaceName410);
            iv_ruleNameSpaceName=ruleNameSpaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameSpaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameSpaceName421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameSpaceName"


    // $ANTLR start "ruleNameSpaceName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:215:1: ruleNameSpaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameSpaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:218:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:219:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:219:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:219:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameSpaceName461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNameSpaceNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:226:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:227:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleNameSpaceName480); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNameSpaceNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameSpaceName495); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getNameSpaceNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleNameSpaceName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:247:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:248:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:249:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName543);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName554); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:256:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NameSpaceName_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:259:28: ( ( (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )? this_ID_2= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:260:1: ( (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )? this_ID_2= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:260:1: ( (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )? this_ID_2= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:260:2: (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )? this_ID_2= RULE_ID
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:260:2: (this_NameSpaceName_0= ruleNameSpaceName kw= '::' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=16 && LA5_1<=17)) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:261:5: this_NameSpaceName_0= ruleNameSpaceName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameSpaceNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameSpaceName_in_ruleQualifiedName602);
                    this_NameSpaceName_0=ruleNameSpaceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NameSpaceName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName637); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:292:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:293:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:294:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERALRule()); 
            }
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL683);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL694); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:301:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_HEXINT_1=null;
        Token this_BINARY_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:304:28: ( (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:305:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:305:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_HEXINT:
                {
                alt6=2;
                }
                break;
            case RULE_BINARY:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:305:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLITERAL734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:313:10: this_HEXINT_1= RULE_HEXINT
                    {
                    this_HEXINT_1=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLITERAL760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_1, grammarAccess.getLITERALAccess().getHEXINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:321:10: this_BINARY_2= RULE_BINARY
                    {
                    this_BINARY_2=(Token)match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleLITERAL786); if (state.failed) return current;
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


    // $ANTLR start "entryRuleClass"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:336:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:337:2: (iv_ruleClass= ruleClass EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:338:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass831);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:345:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleClassItem ) )* otherlv_11= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_items_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:348:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleClassItem ) )* otherlv_11= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:349:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleClassItem ) )* otherlv_11= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:349:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleClassItem ) )* otherlv_11= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:349:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleClassItem ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleClass878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:354:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:354:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:371:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:371:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleClass913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:375:1: ( ( ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:376:1: ( ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:376:1: ( ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:377:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsClassCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass936);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:390:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:390:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleClass949); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:394:1: ( ( ruleQualifiedName ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:395:1: ( ruleQualifiedName )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:395:1: ( ruleQualifiedName )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:396:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsClassCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass972);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleClass988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:413:1: (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:413:3: otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleClass1001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:417:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:418:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:418:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:419:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getClassRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1024);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleClass1036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:436:3: ( (lv_items_10_0= ruleClassItem ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=24 && LA10_0<=25)||LA10_0==30||LA10_0==32||(LA10_0>=36 && LA10_0<=37)||(LA10_0>=62 && LA10_0<=64)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:437:1: (lv_items_10_0= ruleClassItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:437:1: (lv_items_10_0= ruleClassItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:438:3: lv_items_10_0= ruleClassItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getItemsClassItemParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClassItem_in_ruleClass1059);
            	    lv_items_10_0=ruleClassItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_10_0, 
            	              		"ClassItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleClass1072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleClassItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:466:1: entryRuleClassItem returns [EObject current=null] : iv_ruleClassItem= ruleClassItem EOF ;
    public final EObject entryRuleClassItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:467:2: (iv_ruleClassItem= ruleClassItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:468:2: iv_ruleClassItem= ruleClassItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassItemRule()); 
            }
            pushFollow(FOLLOW_ruleClassItem_in_entryRuleClassItem1108);
            iv_ruleClassItem=ruleClassItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassItem1118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassItem"


    // $ANTLR start "ruleClassItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:475:1: ruleClassItem returns [EObject current=null] : ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation ) ;
    public final EObject ruleClassItem() throws RecognitionException {
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:478:28: ( ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:479:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:479:1: ( (this_Variable_0= ruleVariable otherlv_1= ';' ) | (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' ) | this_Operation_8= ruleOperation )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 30:
            case 32:
            case 36:
            case 62:
            case 63:
            case 64:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID||(LA11_2>=16 && LA11_2<=17)) ) {
                    alt11=1;
                }
                else if ( (LA11_2==44) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:479:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:479:2: (this_Variable_0= ruleVariable otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:480:5: this_Variable_0= ruleVariable otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassItemAccess().getVariableParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleClassItem1166);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleClassItem1177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassItemAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:493:6: (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:493:6: (this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:494:5: this_ConfigVariable_2= ruleConfigVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassItemAccess().getConfigVariableParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConfigVariable_in_ruleClassItem1207);
                    this_ConfigVariable_2=ruleConfigVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConfigVariable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClassItem1218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassItemAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:507:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:507:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:508:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassItemAccess().getConstantVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleClassItem1248);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClassItem1259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClassItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:521:6: (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:521:6: (this_InstanceReference_6= ruleInstanceReference otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:522:5: this_InstanceReference_6= ruleInstanceReference otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassItemAccess().getInstanceReferenceParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceReference_in_ruleClassItem1289);
                    this_InstanceReference_6=ruleInstanceReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceReference_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleClassItem1300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:536:5: this_Operation_8= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassItemAccess().getOperationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleClassItem1329);
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
    // $ANTLR end "ruleClassItem"


    // $ANTLR start "entryRuleInstanceReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:552:1: entryRuleInstanceReference returns [EObject current=null] : iv_ruleInstanceReference= ruleInstanceReference EOF ;
    public final EObject entryRuleInstanceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:553:2: (iv_ruleInstanceReference= ruleInstanceReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:554:2: iv_ruleInstanceReference= ruleInstanceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceReference_in_entryRuleInstanceReference1364);
            iv_ruleInstanceReference=ruleInstanceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceReference1374); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:561:1: ruleInstanceReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInstanceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:564:28: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:1: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:1: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:565:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleInstanceReference1411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstanceReferenceAccess().getRefKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:569:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:571:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceReferenceAccess().getTypeClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceReference1434);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:584:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:585:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:585:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:586:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstanceReference1451); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:610:1: entryRuleConfigVariable returns [EObject current=null] : iv_ruleConfigVariable= ruleConfigVariable EOF ;
    public final EObject entryRuleConfigVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:611:2: (iv_ruleConfigVariable= ruleConfigVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:612:2: iv_ruleConfigVariable= ruleConfigVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConfigVariable_in_entryRuleConfigVariable1492);
            iv_ruleConfigVariable=ruleConfigVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigVariable1502); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:619:1: ruleConfigVariable returns [EObject current=null] : ( () otherlv_1= 'config' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleConfigVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:622:28: ( ( () otherlv_1= 'config' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:623:1: ( () otherlv_1= 'config' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:623:1: ( () otherlv_1= 'config' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:623:2: () otherlv_1= 'config' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:623:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:624:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigVariableAccess().getConfigVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConfigVariable1548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigVariableAccess().getConfigKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:633:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:634:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:634:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:635:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConfigVariableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigVariableAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConfigVariable1571);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:648:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:649:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:649:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:650:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigVariable1588); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:674:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:675:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:676:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary1629);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary1639); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:683:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* otherlv_11= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_items_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:686:28: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* otherlv_11= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:687:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* otherlv_11= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:687:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* otherlv_11= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:687:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )* ( (lv_items_10_0= ruleLibraryItem ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLibrary1676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:691:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:692:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:692:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:693:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLibrary1693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLibraryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:709:2: (otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:709:4: otherlv_2= 'overrides' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLibrary1711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getOverridesKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:713:1: ( ( ruleQualifiedName ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:714:1: ( ruleQualifiedName )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:714:1: ( ruleQualifiedName )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:715:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLibraryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverrideLibraryCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1734);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:728:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:728:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleLibrary1747); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:732:1: ( ( ruleQualifiedName ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:733:1: ( ruleQualifiedName )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:733:1: ( ruleQualifiedName )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:734:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLibraryRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLibraryAccess().getOverridesLibraryCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1770);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleLibrary1786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:751:1: (otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:751:3: otherlv_7= 'use' ( ( ruleQualifiedName ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleLibrary1799); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getLibraryAccess().getUseKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:755:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:756:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:756:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:757:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLibraryRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getUseLibraryCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLibrary1822);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleLibrary1834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:3: ( (lv_items_10_0= ruleLibraryItem ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==28||LA15_0==30||LA15_0==32||(LA15_0>=36 && LA15_0<=38)||LA15_0==40||LA15_0==47||(LA15_0>=62 && LA15_0<=64)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_items_10_0= ruleLibraryItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_items_10_0= ruleLibraryItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:776:3: lv_items_10_0= ruleLibraryItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLibraryAccess().getItemsLibraryItemParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibraryItem_in_ruleLibrary1857);
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
            	    break loop15;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleLibrary1870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleLibraryItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:804:1: entryRuleLibraryItem returns [EObject current=null] : iv_ruleLibraryItem= ruleLibraryItem EOF ;
    public final EObject entryRuleLibraryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:805:2: (iv_ruleLibraryItem= ruleLibraryItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:806:2: iv_ruleLibraryItem= ruleLibraryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryItemRule()); 
            }
            pushFollow(FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem1906);
            iv_ruleLibraryItem=ruleLibraryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibraryItem1916); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:813:1: ruleLibraryItem returns [EObject current=null] : (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' ) | this_OperatorDefinition_10= ruleOperatorDefinition ) ;
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

        EObject this_CompileContextVariable_8 = null;

        EObject this_OperatorDefinition_10 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:816:28: ( (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' ) | this_OperatorDefinition_10= ruleOperatorDefinition ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:817:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' ) | this_OperatorDefinition_10= ruleOperatorDefinition )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:817:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' ) | (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' ) | (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' ) | this_OperatorDefinition_10= ruleOperatorDefinition )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||(LA16_2>=16 && LA16_2<=17)) ) {
                    alt16=3;
                }
                else if ( (LA16_2==44) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 32:
            case 36:
            case 62:
            case 63:
            case 64:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 38:
                {
                alt16=5;
                }
                break;
            case 40:
                {
                alt16=6;
                }
                break;
            case 47:
                {
                alt16=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:818:5: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleLibraryItem1963);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:828:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleLibraryItem1990);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:837:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:837:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:838:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleLibraryItem2018);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleLibraryItem2029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:851:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:851:6: (this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:852:5: this_ConstantVariable_4= ruleConstantVariable otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getConstantVariableParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleLibraryItem2059);
                    this_ConstantVariable_4=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleLibraryItem2070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:865:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:865:6: (this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:866:5: this_RegisterVariable_6= ruleRegisterVariable otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getRegisterVariableParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegisterVariable_in_ruleLibraryItem2100);
                    this_RegisterVariable_6=ruleRegisterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegisterVariable_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleLibraryItem2111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:879:6: (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:879:6: (this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:880:5: this_CompileContextVariable_8= ruleCompileContextVariable otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getCompileContextVariableParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompileContextVariable_in_ruleLibraryItem2141);
                    this_CompileContextVariable_8=ruleCompileContextVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompileContextVariable_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleLibraryItem2152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getLibraryItemAccess().getSemicolonKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:894:5: this_OperatorDefinition_10= ruleOperatorDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLibraryItemAccess().getOperatorDefinitionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem2181);
                    this_OperatorDefinition_10=ruleOperatorDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperatorDefinition_10; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:910:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:911:2: (iv_ruleType= ruleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:912:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2216);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2226); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:919:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_def_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:922:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:923:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:923:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:923:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleType2263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:927:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:928:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:928:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:929:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2280); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleType2297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:949:1: ( (lv_def_3_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:950:1: (lv_def_3_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:950:1: (lv_def_3_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:951:3: lv_def_3_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleType2318);
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


    // $ANTLR start "entryRuleVarType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:975:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:976:2: (iv_ruleVarType= ruleVarType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:977:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVarType_in_entryRuleVarType2354);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarType2364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:984:1: ruleVarType returns [EObject current=null] : this_VarSimpleType_0= ruleVarSimpleType ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        EObject this_VarSimpleType_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:987:28: (this_VarSimpleType_0= ruleVarSimpleType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:989:5: this_VarSimpleType_0= ruleVarSimpleType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVarTypeAccess().getVarSimpleTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVarSimpleType_in_ruleVarType2410);
            this_VarSimpleType_0=ruleVarSimpleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VarSimpleType_0; 
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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleVarSimpleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1005:1: entryRuleVarSimpleType returns [EObject current=null] : iv_ruleVarSimpleType= ruleVarSimpleType EOF ;
    public final EObject entryRuleVarSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarSimpleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1006:2: (iv_ruleVarSimpleType= ruleVarSimpleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1007:2: iv_ruleVarSimpleType= ruleVarSimpleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarSimpleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVarSimpleType_in_entryRuleVarSimpleType2444);
            iv_ruleVarSimpleType=ruleVarSimpleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarSimpleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarSimpleType2454); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarSimpleType"


    // $ANTLR start "ruleVarSimpleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1014:1: ruleVarSimpleType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeDef ) ) ;
    public final EObject ruleVarSimpleType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1017:28: ( ( (lv_type_0_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1018:1: ( (lv_type_0_0= ruleTypeDef ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1018:1: ( (lv_type_0_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1019:1: (lv_type_0_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1019:1: (lv_type_0_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1020:3: lv_type_0_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarSimpleTypeAccess().getTypeTypeDefParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleVarSimpleType2499);
            lv_type_0_0=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarSimpleTypeRule());
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
    // $ANTLR end "ruleVarSimpleType"


    // $ANTLR start "entryRuleTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1048:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1049:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1050:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef2538);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef2548); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1057:1: ruleTypeDef returns [EObject current=null] : (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDef_0 = null;

        EObject this_StructTypeDef_1 = null;

        EObject this_PointerTypeDef_2 = null;

        EObject this_ArrayTypeDef_3 = null;

        EObject this_RefTypeDef_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1060:28: ( (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1061:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1061:1: (this_DataTypeDef_0= ruleDataTypeDef | this_StructTypeDef_1= ruleStructTypeDef | this_PointerTypeDef_2= rulePointerTypeDef | this_ArrayTypeDef_3= ruleArrayTypeDef | this_RefTypeDef_4= ruleRefTypeDef )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
            case 64:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            case RULE_ID:
                {
                alt17=5;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1062:5: this_DataTypeDef_0= ruleDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDef_in_ruleTypeDef2595);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1072:5: this_StructTypeDef_1= ruleStructTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getStructTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructTypeDef_in_ruleTypeDef2622);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1082:5: this_PointerTypeDef_2= rulePointerTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getPointerTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePointerTypeDef_in_ruleTypeDef2649);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1092:5: this_ArrayTypeDef_3= ruleArrayTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getArrayTypeDefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2676);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1102:5: this_RefTypeDef_4= ruleRefTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getRefTypeDefParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRefTypeDef_in_ruleTypeDef2703);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1118:1: entryRulePointerTypeDef returns [EObject current=null] : iv_rulePointerTypeDef= rulePointerTypeDef EOF ;
    public final EObject entryRulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1119:2: (iv_rulePointerTypeDef= rulePointerTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1120:2: iv_rulePointerTypeDef= rulePointerTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeDefRule()); 
            }
            pushFollow(FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef2738);
            iv_rulePointerTypeDef=rulePointerTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerTypeDef2748); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1127:1: rulePointerTypeDef returns [EObject current=null] : (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) ;
    public final EObject rulePointerTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1130:28: ( (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1131:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1131:1: (otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1131:3: otherlv_0= 'pointer' otherlv_1= 'of' ( (lv_def_2_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePointerTypeDef2785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPointerTypeDefAccess().getPointerKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePointerTypeDef2797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointerTypeDefAccess().getOfKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1139:1: ( (lv_def_2_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1140:1: (lv_def_2_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1140:1: (lv_def_2_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1141:3: lv_def_2_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointerTypeDefAccess().getDefTypeDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_rulePointerTypeDef2818);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1165:1: entryRuleArrayTypeDef returns [EObject current=null] : iv_ruleArrayTypeDef= ruleArrayTypeDef EOF ;
    public final EObject entryRuleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1166:2: (iv_ruleArrayTypeDef= ruleArrayTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1167:2: iv_ruleArrayTypeDef= ruleArrayTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef2854);
            iv_ruleArrayTypeDef=ruleArrayTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDef2864); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1174:1: ruleArrayTypeDef returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1177:28: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1178:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1178:1: (otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1178:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_size_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_def_5_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleArrayTypeDef2901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleArrayTypeDef2913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayTypeDefAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1186:1: ( (lv_size_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1187:1: (lv_size_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1187:1: (lv_size_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1188:3: lv_size_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getSizeXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleArrayTypeDef2934);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleArrayTypeDef2946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayTypeDefAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleArrayTypeDef2958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefAccess().getOfKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1212:1: ( (lv_def_5_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1213:1: (lv_def_5_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1213:1: (lv_def_5_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1214:3: lv_def_5_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getDefTypeDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleArrayTypeDef2979);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1238:1: entryRuleRefTypeDef returns [EObject current=null] : iv_ruleRefTypeDef= ruleRefTypeDef EOF ;
    public final EObject entryRuleRefTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1239:2: (iv_ruleRefTypeDef= ruleRefTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1240:2: iv_ruleRefTypeDef= ruleRefTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef3015);
            iv_ruleRefTypeDef=ruleRefTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTypeDef3025); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:1: ruleRefTypeDef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRefTypeDef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1250:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1251:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1251:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1252:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1252:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1253:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRefTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRefTypeDefAccess().getTypeTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRefTypeDef3072);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1274:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1275:2: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1276:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef3107);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDef3117); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1283:1: ruleDataTypeDef returns [EObject current=null] : ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' ) ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1286:28: ( ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1287:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1287:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1287:2: ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1287:2: ( (lv_kind_0_0= rulePrimitiveKind ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1288:1: (lv_kind_0_0= rulePrimitiveKind )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1288:1: (lv_kind_0_0= rulePrimitiveKind )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1289:3: lv_kind_0_0= rulePrimitiveKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeDefAccess().getKindPrimitiveKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef3163);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1305:2: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1306:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1306:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1307:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataTypeDef3180); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDataTypeDef3197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefAccess().getBitsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataTypeDef3209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataTypeDefAccess().getSemicolonKeyword_3());
                  
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1339:1: entryRuleStructTypeDef returns [EObject current=null] : iv_ruleStructTypeDef= ruleStructTypeDef EOF ;
    public final EObject entryRuleStructTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1340:2: (iv_ruleStructTypeDef= ruleStructTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1341:2: iv_ruleStructTypeDef= ruleStructTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef3245);
            iv_ruleStructTypeDef=ruleStructTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDef3255); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1348:1: ruleStructTypeDef returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1351:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1352:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1352:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1352:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1352:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStructTypeDef3301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStructTypeDefAccess().getStructKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStructTypeDef3313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1366:1: ( (lv_members_3_0= ruleStructTypeDefMember ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1367:1: (lv_members_3_0= ruleStructTypeDefMember )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1367:1: (lv_members_3_0= ruleStructTypeDefMember )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1368:3: lv_members_3_0= ruleStructTypeDefMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef3334);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1384:2: (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1384:4: otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStructTypeDef3347); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStructTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1388:1: ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1390:3: lv_members_5_0= ruleStructTypeDefMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef3368);
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
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleStructTypeDef3382); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1418:1: entryRuleStructTypeDefMember returns [EObject current=null] : iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF ;
    public final EObject entryRuleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDefMember = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1419:2: (iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1420:2: iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember3418);
            iv_ruleStructTypeDefMember=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDefMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDefMember3428); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1427:1: ruleStructTypeDefMember returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1430:28: ( ( () ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1431:1: ( () ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1431:1: ( () ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1431:2: () ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1431:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1432:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefMemberAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1437:2: ( (lv_type_1_0= ruleVarType ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1438:1: (lv_type_1_0= ruleVarType )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1438:1: (lv_type_1_0= ruleVarType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1439:3: lv_type_1_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefMemberAccess().getTypeVarTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleStructTypeDefMember3483);
            lv_type_1_0=ruleVarType();

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
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1455:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1456:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1456:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1457:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructTypeDefMember3500); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1481:1: entryRuleConstantVariable returns [EObject current=null] : iv_ruleConstantVariable= ruleConstantVariable EOF ;
    public final EObject entryRuleConstantVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1482:2: (iv_ruleConstantVariable= ruleConstantVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1483:2: iv_ruleConstantVariable= ruleConstantVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable3541);
            iv_ruleConstantVariable=ruleConstantVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantVariable3551); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1490:1: ruleConstantVariable returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleConstantVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1493:28: ( ( () otherlv_1= 'const' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1494:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1494:1: ( () otherlv_1= 'const' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1494:2: () otherlv_1= 'const' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1494:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantVariableAccess().getConstantVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleConstantVariable3597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantVariableAccess().getConstKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1504:1: ( (lv_type_2_0= ruleVarType ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1505:1: (lv_type_2_0= ruleVarType )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1505:1: (lv_type_2_0= ruleVarType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1506:3: lv_type_2_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getTypeVarTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleConstantVariable3618);
            lv_type_2_0=ruleVarType();

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
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1522:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1523:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1523:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1524:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantVariable3635); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleConstantVariable3652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantVariableAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1544:1: ( (lv_value_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1545:1: (lv_value_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1545:1: (lv_value_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1546:3: lv_value_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleConstantVariable3673);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1570:1: entryRuleRegisterVariable returns [EObject current=null] : iv_ruleRegisterVariable= ruleRegisterVariable EOF ;
    public final EObject entryRuleRegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1571:2: (iv_ruleRegisterVariable= ruleRegisterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1572:2: iv_ruleRegisterVariable= ruleRegisterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable3709);
            iv_ruleRegisterVariable=ruleRegisterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterVariable3719); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1579:1: ruleRegisterVariable returns [EObject current=null] : ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleRegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_addr_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1582:28: ( ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1583:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1583:1: ( () otherlv_1= 'reg' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1583:2: () otherlv_1= 'reg' ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1583:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1584:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegisterVariableAccess().getRegisterVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleRegisterVariable3765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRegisterVariableAccess().getRegKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1593:1: ( (lv_type_2_0= ruleVarType ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1594:1: (lv_type_2_0= ruleVarType )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1594:1: (lv_type_2_0= ruleVarType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1595:3: lv_type_2_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getTypeVarTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleRegisterVariable3786);
            lv_type_2_0=ruleVarType();

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
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1611:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1612:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1612:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1613:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisterVariable3803); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleRegisterVariable3820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegisterVariableAccess().getColonKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1633:1: ( (lv_addr_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1634:1: (lv_addr_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1634:1: (lv_addr_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1635:3: lv_addr_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getAddrXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleRegisterVariable3841);
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


    // $ANTLR start "entryRuleCompileContextVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1659:1: entryRuleCompileContextVariable returns [EObject current=null] : iv_ruleCompileContextVariable= ruleCompileContextVariable EOF ;
    public final EObject entryRuleCompileContextVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompileContextVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1660:2: (iv_ruleCompileContextVariable= ruleCompileContextVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1661:2: iv_ruleCompileContextVariable= ruleCompileContextVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompileContextVariableRule()); 
            }
            pushFollow(FOLLOW_ruleCompileContextVariable_in_entryRuleCompileContextVariable3877);
            iv_ruleCompileContextVariable=ruleCompileContextVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompileContextVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompileContextVariable3887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompileContextVariable"


    // $ANTLR start "ruleCompileContextVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1668:1: ruleCompileContextVariable returns [EObject current=null] : ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleCompileContextVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1671:28: ( ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1672:1: ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1672:1: ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1672:2: () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1672:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompileContextVariableAccess().getCompileContextVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCompileContextVariable3933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompileContextVariableAccess().getCompilecontextKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1682:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1683:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1683:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1684:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompileContextVariable3950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getCompileContextVariableAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompileContextVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1700:2: (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1700:4: otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCompileContextVariable3968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompileContextVariableAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1704:1: ( (lv_value_4_0= ruleXExpression ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1705:1: (lv_value_4_0= ruleXExpression )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1705:1: (lv_value_4_0= ruleXExpression )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1706:3: lv_value_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompileContextVariableAccess().getValueXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleCompileContextVariable3989);
                    lv_value_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompileContextVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"XExpression");
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
    // $ANTLR end "ruleCompileContextVariable"


    // $ANTLR start "entryRuleOperationStep"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1730:1: entryRuleOperationStep returns [EObject current=null] : iv_ruleOperationStep= ruleOperationStep EOF ;
    public final EObject entryRuleOperationStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStep = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1731:2: (iv_ruleOperationStep= ruleOperationStep EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1732:2: iv_ruleOperationStep= ruleOperationStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationStepRule()); 
            }
            pushFollow(FOLLOW_ruleOperationStep_in_entryRuleOperationStep4027);
            iv_ruleOperationStep=ruleOperationStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationStep4037); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1739:1: ruleOperationStep returns [EObject current=null] : (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) ;
    public final EObject ruleOperationStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_InstructionWord_0 = null;

        EObject this_Label_1 = null;

        EObject this_Variable_2 = null;

        EObject this_XTopLevelExpression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1742:28: ( (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1743:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1743:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1744:5: this_InstructionWord_0= ruleInstructionWord
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getInstructionWordParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstructionWord_in_ruleOperationStep4084);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1754:5: this_Label_1= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getLabelParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleOperationStep4111);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1763:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1763:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1764:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperationStep4139);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleOperationStep4150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationStepAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1778:5: this_XTopLevelExpression_4= ruleXTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getXTopLevelExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep4179);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1794:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1795:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1796:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel4214);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel4224); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1803:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1806:28: ( ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1807:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1807:1: ( () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1807:2: () otherlv_1= 'label' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1807:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelAccess().getLabelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLabel4270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1817:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1818:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1818:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1819:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel4287); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleLabel4304); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1847:1: entryRuleInstructionWord returns [EObject current=null] : iv_ruleInstructionWord= ruleInstructionWord EOF ;
    public final EObject entryRuleInstructionWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWord = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1848:2: (iv_ruleInstructionWord= ruleInstructionWord EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1849:2: iv_ruleInstructionWord= ruleInstructionWord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionWordRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord4340);
            iv_ruleInstructionWord=ruleInstructionWord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionWord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionWord4350); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1856:1: ruleInstructionWord returns [EObject current=null] : (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) ;
    public final EObject ruleInstructionWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1859:28: ( (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1860:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1860:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1860:3: otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleInstructionWord4387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionWordAccess().getLessThanSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1864:1: ( (lv_sections_1_0= ruleWordSection ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_BINARY)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1865:1: (lv_sections_1_0= ruleWordSection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1865:1: (lv_sections_1_0= ruleWordSection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1866:3: lv_sections_1_0= ruleWordSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionWordAccess().getSectionsWordSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWordSection_in_ruleInstructionWord4408);
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
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleInstructionWord4421); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1894:1: entryRuleWordSection returns [EObject current=null] : iv_ruleWordSection= ruleWordSection EOF ;
    public final EObject entryRuleWordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordSection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1895:2: (iv_ruleWordSection= ruleWordSection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1896:2: iv_ruleWordSection= ruleWordSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWordSectionRule()); 
            }
            pushFollow(FOLLOW_ruleWordSection_in_entryRuleWordSection4457);
            iv_ruleWordSection=ruleWordSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWordSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordSection4467); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1903:1: ruleWordSection returns [EObject current=null] : ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1906:28: ( ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1907:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1907:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1907:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference ) otherlv_2= ':' ( (lv_size_3_0= RULE_INT ) ) (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1907:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_BINARY)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1908:5: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getLiteralValueParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleWordSection4515);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1918:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getVariableReferenceParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleWordSection4542);
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

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleWordSection4554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWordSectionAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1930:1: ( (lv_size_3_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1931:1: (lv_size_3_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1931:1: (lv_size_3_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1932:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection4571); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1948:2: (otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1948:4: otherlv_4= ':' ( (lv_shift_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleWordSection4589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getWordSectionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1952:1: ( (lv_shift_5_0= RULE_INT ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1953:1: (lv_shift_5_0= RULE_INT )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1953:1: (lv_shift_5_0= RULE_INT )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1954:3: lv_shift_5_0= RULE_INT
                    {
                    lv_shift_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection4606); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1978:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1979:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1980:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4649);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue4659); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1987:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1990:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1991:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1991:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1992:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1992:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1993:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralValueAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleLiteralValue4704);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2017:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2018:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2019:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4739);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4749); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2026:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2029:28: ( ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2030:1: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2030:1: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2030:2: ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2030:2: ( (lv_type_0_0= ruleVarType ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2031:1: (lv_type_0_0= ruleVarType )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2031:1: (lv_type_0_0= ruleVarType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2032:3: lv_type_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleVariable4795);
            lv_type_0_0=ruleVarType();

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
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2048:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2049:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2049:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2050:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4812); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2074:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2075:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2076:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4853);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4863); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2083:1: ruleVariableReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2086:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2087:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2087:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2088:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2088:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2089:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVarVariableCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariableReference4910);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2110:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2111:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2112:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCall_in_entryRuleOperationCall4945);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCall4955); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2119:1: ruleOperationCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2122:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2123:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2123:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2123:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2123:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2124:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2124:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2125:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperationCall5003);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleOperationCall5015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2142:1: ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_BINARY)||LA25_0==44||LA25_0==57||LA25_0==59||(LA25_0>=88 && LA25_0<=91)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2142:2: ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2142:2: ( (lv_params_2_0= ruleOperationCallParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2143:1: (lv_params_2_0= ruleOperationCallParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2143:1: (lv_params_2_0= ruleOperationCallParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2144:3: lv_params_2_0= ruleOperationCallParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5037);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2160:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2160:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOperationCall5050); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2164:1: ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2165:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2165:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2166:3: lv_params_4_0= ruleOperationCallParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5071);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleOperationCall5087); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2194:1: entryRuleOperationCallParameter returns [EObject current=null] : iv_ruleOperationCallParameter= ruleOperationCallParameter EOF ;
    public final EObject entryRuleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2195:2: (iv_ruleOperationCallParameter= ruleOperationCallParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2196:2: iv_ruleOperationCallParameter= ruleOperationCallParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter5123);
            iv_ruleOperationCallParameter=ruleOperationCallParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallParameter5133); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2203:1: ruleOperationCallParameter returns [EObject current=null] : this_XExpression_0= ruleXExpression ;
    public final EObject ruleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2206:28: (this_XExpression_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2208:5: this_XExpression_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationCallParameterAccess().getXExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleOperationCallParameter5179);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2224:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2225:2: (iv_ruleOperation= ruleOperation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2226:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation5213);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation5223); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2233:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2236:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2237:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2237:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2237:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_block_8_0= ruleOperationBlock ) ) otherlv_9= '}' (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2237:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2238:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2243:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2244:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2244:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2245:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation5274); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleOperation5291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2265:1: ( ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==30||LA27_0==32||(LA27_0>=36 && LA27_0<=37)||(LA27_0>=62 && LA27_0<=66)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2265:2: ( (lv_params_3_0= ruleParameterVariable ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2265:2: ( (lv_params_3_0= ruleParameterVariable ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2266:1: (lv_params_3_0= ruleParameterVariable )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2266:1: (lv_params_3_0= ruleParameterVariable )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2267:3: lv_params_3_0= ruleParameterVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation5313);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2283:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==20) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2283:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameterVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperation5326); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2287:1: ( (lv_params_5_0= ruleParameterVariable ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2288:1: (lv_params_5_0= ruleParameterVariable )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2288:1: (lv_params_5_0= ruleParameterVariable )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2289:3: lv_params_5_0= ruleParameterVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation5347);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleOperation5363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleOperation5375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2313:1: ( (lv_block_8_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2314:1: (lv_block_8_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2314:1: (lv_block_8_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2315:3: lv_block_8_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBlockOperationBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleOperation5396);
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

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleOperation5408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2335:1: (otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2335:3: otherlv_10= 'returns' ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleOperation5421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getReturnsKeyword_8_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2339:1: ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) )
                    int alt28=2;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2339:2: ( (lv_return_11_0= ruleXExpression ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2339:2: ( (lv_return_11_0= ruleXExpression ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2340:1: (lv_return_11_0= ruleXExpression )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2340:1: (lv_return_11_0= ruleXExpression )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2341:3: lv_return_11_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnXExpressionParserRuleCall_8_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleOperation5443);
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
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2358:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2358:6: ( (lv_returnvar_12_0= ruleVariable ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2359:1: (lv_returnvar_12_0= ruleVariable )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2359:1: (lv_returnvar_12_0= ruleVariable )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2360:3: lv_returnvar_12_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnvarVariableParserRuleCall_8_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleOperation5470);
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

                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleOperation5483); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2388:1: entryRuleOperationBlock returns [EObject current=null] : iv_ruleOperationBlock= ruleOperationBlock EOF ;
    public final EObject entryRuleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBlock = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2389:2: (iv_ruleOperationBlock= ruleOperationBlock EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2390:2: iv_ruleOperationBlock= ruleOperationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock5521);
            iv_ruleOperationBlock=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationBlock5531); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2397:1: ruleOperationBlock returns [EObject current=null] : ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) ;
    public final EObject ruleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2400:28: ( ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2401:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2401:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2401:2: () ( (lv_steps_1_0= ruleOperationStep ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2401:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2402:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationBlockAccess().getOperationBlockAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2407:2: ( (lv_steps_1_0= ruleOperationStep ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BINARY)||LA30_0==30||LA30_0==32||LA30_0==36||(LA30_0>=41 && LA30_0<=42)||LA30_0==44||LA30_0==57||(LA30_0>=59 && LA30_0<=60)||(LA30_0>=62 && LA30_0<=64)||(LA30_0>=88 && LA30_0<=91)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2408:1: (lv_steps_1_0= ruleOperationStep )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2408:1: (lv_steps_1_0= ruleOperationStep )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2409:3: lv_steps_1_0= ruleOperationStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationBlockAccess().getStepsOperationStepParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationStep_in_ruleOperationBlock5586);
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
            	    break loop30;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2433:1: entryRuleParameterVariable returns [EObject current=null] : iv_ruleParameterVariable= ruleParameterVariable EOF ;
    public final EObject entryRuleParameterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2434:2: (iv_ruleParameterVariable= ruleParameterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2435:2: iv_ruleParameterVariable= ruleParameterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5623);
            iv_ruleParameterVariable=ruleParameterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterVariable5633); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2442:1: ruleParameterVariable returns [EObject current=null] : ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleParameterVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_default_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2445:28: ( ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2446:1: ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2446:1: ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2446:2: ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_type_1_0= ruleVarType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2446:2: ( (lv_kind_0_0= ruleParameterKind ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37||(LA31_0>=65 && LA31_0<=66)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2447:1: (lv_kind_0_0= ruleParameterKind )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2447:1: (lv_kind_0_0= ruleParameterKind )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2448:3: lv_kind_0_0= ruleParameterKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getKindParameterKindEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterKind_in_ruleParameterVariable5679);
                    lv_kind_0_0=ruleParameterKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_0_0, 
                              		"ParameterKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2464:3: ( (lv_type_1_0= ruleVarType ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2465:1: (lv_type_1_0= ruleVarType )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2465:1: (lv_type_1_0= ruleVarType )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2466:3: lv_type_1_0= ruleVarType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterVariableAccess().getTypeVarTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarType_in_ruleParameterVariable5701);
            lv_type_1_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"VarType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2482:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2483:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2483:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2484:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterVariable5718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getParameterVariableAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2500:2: (otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2500:4: otherlv_3= '=' ( (lv_default_4_0= ruleLITERAL ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleParameterVariable5736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterVariableAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2504:1: ( (lv_default_4_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2505:1: (lv_default_4_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2505:1: (lv_default_4_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2506:3: lv_default_4_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getDefaultLITERALParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleParameterVariable5757);
                    lv_default_4_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_4_0, 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2530:1: entryRuleOperatorDefinition returns [EObject current=null] : iv_ruleOperatorDefinition= ruleOperatorDefinition EOF ;
    public final EObject entryRuleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2531:2: (iv_ruleOperatorDefinition= ruleOperatorDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2532:2: iv_ruleOperatorDefinition= ruleOperatorDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition5795);
            iv_ruleOperatorDefinition=ruleOperatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition5805); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2539:1: ruleOperatorDefinition returns [EObject current=null] : (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2542:28: ( (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2543:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2543:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2543:3: otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleOperatorDefinition5842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperatorDefinitionAccess().getOperatorKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2547:1: ( (lv_role_1_0= ruleOperationRole ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2548:1: (lv_role_1_0= ruleOperationRole )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2548:1: (lv_role_1_0= ruleOperationRole )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2549:3: lv_role_1_0= ruleOperationRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getRoleOperationRoleEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationRole_in_ruleOperatorDefinition5863);
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOperatorDefinition5875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperatorDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2569:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2570:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2570:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2571:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition5898);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2584:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2584:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperatorDefinition5911); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2588:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2589:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2589:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2590:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition5934);
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
            	    break loop33;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2603:4: (otherlv_6= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2603:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleOperatorDefinition5949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleOperatorDefinition5963); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2619:1: entryRuleLinkedBinary returns [EObject current=null] : iv_ruleLinkedBinary= ruleLinkedBinary EOF ;
    public final EObject entryRuleLinkedBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedBinary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2620:2: (iv_ruleLinkedBinary= ruleLinkedBinary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2621:2: iv_ruleLinkedBinary= ruleLinkedBinary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedBinaryRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5999);
            iv_ruleLinkedBinary=ruleLinkedBinary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedBinary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedBinary6009); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2628:1: ruleLinkedBinary returns [EObject current=null] : (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' ) ;
    public final EObject ruleLinkedBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_sections_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2631:28: ( (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2632:1: (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2632:1: (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2632:3: otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleLinkedBinary6046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkedBinaryAccess().getBinaryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2636:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2637:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2637:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2638:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedBinary6063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLinkedBinaryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkedBinaryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2654:2: ( (lv_type_2_0= ruleBinaryType ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==65||LA35_0==87) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2655:1: (lv_type_2_0= ruleBinaryType )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2655:1: (lv_type_2_0= ruleBinaryType )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2656:3: lv_type_2_0= ruleBinaryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getTypeBinaryTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBinaryType_in_ruleLinkedBinary6089);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleLinkedBinary6102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLinkedBinaryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2676:1: ( (lv_sections_4_0= ruleBinarySection ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==50||(LA36_0>=55 && LA36_0<=56)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2677:1: (lv_sections_4_0= ruleBinarySection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2677:1: (lv_sections_4_0= ruleBinarySection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2678:3: lv_sections_4_0= ruleBinarySection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getSectionsBinarySectionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinarySection_in_ruleLinkedBinary6123);
            	    lv_sections_4_0=ruleBinarySection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLinkedBinaryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sections",
            	              		lv_sections_4_0, 
            	              		"BinarySection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleLinkedBinary6136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLinkedBinaryAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleLinkedBinary"


    // $ANTLR start "entryRuleBinarySection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2706:1: entryRuleBinarySection returns [EObject current=null] : iv_ruleBinarySection= ruleBinarySection EOF ;
    public final EObject entryRuleBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2707:2: (iv_ruleBinarySection= ruleBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2708:2: iv_ruleBinarySection= ruleBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleBinarySection_in_entryRuleBinarySection6172);
            iv_ruleBinarySection=ruleBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinarySection6182); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2715:1: ruleBinarySection returns [EObject current=null] : ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2718:28: ( ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2719:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt37=1;
                }
                break;
            case 55:
                {
                alt37=2;
                }
                break;
            case 56:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2720:5: this_FunctionBinarySection_0= ruleFunctionBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getFunctionBinarySectionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection6230);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2730:5: this_ConstantBinarySection_1= ruleConstantBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getConstantBinarySectionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantBinarySection_in_ruleBinarySection6257);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2740:5: this_ReferenceBinarySection_2= ruleReferenceBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getReferenceBinarySectionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection6284);
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleBinarySection6296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBinarySectionAccess().getAtKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2752:1: ( (lv_start_4_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2753:1: (lv_start_4_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2753:1: (lv_start_4_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2754:3: lv_start_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinarySectionAccess().getStartXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleBinarySection6317);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBinarySection6329); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2782:1: entryRuleFunctionBinarySection returns [EObject current=null] : iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF ;
    public final EObject entryRuleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2783:2: (iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2784:2: iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection6365);
            iv_ruleFunctionBinarySection=ruleFunctionBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBinarySection6375); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2791:1: ruleFunctionBinarySection returns [EObject current=null] : (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )* otherlv_20= '}' ) ;
    public final EObject ruleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_memwidth_5_0 = null;

        EObject lv_mems_7_0 = null;

        EObject lv_lib_12_0 = null;

        EObject lv_instances_14_0 = null;

        EObject lv_links_16_0 = null;

        EObject lv_confs_17_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2794:28: ( (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )* otherlv_20= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2795:1: (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )* otherlv_20= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2795:1: (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )* otherlv_20= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2795:3: otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleFunctionBinarySection6412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionBinarySectionAccess().getLinkKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2799:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2800:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2800:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2801:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getOperationOperationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection6435);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleFunctionBinarySection6447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionBinarySectionAccess().getLeftParenthesisKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleFunctionBinarySection6459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionBinarySectionAccess().getMemwidthKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleFunctionBinarySection6471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2826:1: ( (lv_memwidth_5_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2827:1: (lv_memwidth_5_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2827:1: (lv_memwidth_5_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2828:3: lv_memwidth_5_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemwidthLITERALParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection6492);
            lv_memwidth_5_0=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
              	        }
                     		set(
                     			current, 
                     			"memwidth",
                      		lv_memwidth_5_0, 
                      		"LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection6504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2848:1: ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==53) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2848:2: ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2848:2: ( (lv_mems_7_0= ruleFunctionMemory ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2849:1: (lv_mems_7_0= ruleFunctionMemory )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2849:1: (lv_mems_7_0= ruleFunctionMemory )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2850:3: lv_mems_7_0= ruleFunctionMemory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemsFunctionMemoryParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection6526);
            	    lv_mems_7_0=ruleFunctionMemory();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mems",
            	              		lv_mems_7_0, 
            	              		"FunctionMemory");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection6538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_7_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleFunctionBinarySection6552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionBinarySectionAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleFunctionBinarySection6564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_9());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2878:1: ( (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' ) | ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' ) )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }
                else if ( (LA41_0==RULE_ID) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2878:2: (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2878:2: (otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';' )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2878:4: otherlv_11= 'lib' ( (lv_lib_12_0= ruleLibrary ) ) otherlv_13= ';'
            	    {
            	    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleFunctionBinarySection6578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getFunctionBinarySectionAccess().getLibKeyword_10_0_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2882:1: ( (lv_lib_12_0= ruleLibrary ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2883:1: (lv_lib_12_0= ruleLibrary )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2883:1: (lv_lib_12_0= ruleLibrary )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2884:3: lv_lib_12_0= ruleLibrary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getLibLibraryParserRuleCall_10_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLibrary_in_ruleFunctionBinarySection6599);
            	    lv_lib_12_0=ruleLibrary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lib",
            	              		lv_lib_12_0, 
            	              		"Library");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection6611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_10_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:6: ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:6: ( ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}' )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:7: ( (lv_instances_14_0= ruleLinkedInstance ) ) otherlv_15= '{' ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )* otherlv_19= '}'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:7: ( (lv_instances_14_0= ruleLinkedInstance ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2906:1: (lv_instances_14_0= ruleLinkedInstance )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2906:1: (lv_instances_14_0= ruleLinkedInstance )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2907:3: lv_instances_14_0= ruleLinkedInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getInstancesLinkedInstanceParserRuleCall_10_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLinkedInstance_in_ruleFunctionBinarySection6640);
            	    lv_instances_14_0=ruleLinkedInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instances",
            	              		lv_instances_14_0, 
            	              		"LinkedInstance");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleFunctionBinarySection6652); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_10_1_1());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:1: ( ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';' )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==RULE_ID) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:2: ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) ) otherlv_18= ';'
            	    	    {
            	    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:2: ( ( (lv_links_16_0= ruleReferenceLink ) ) | ( (lv_confs_17_0= ruleInstanceConfig ) ) )
            	    	    int alt39=2;
            	    	    int LA39_0 = input.LA(1);

            	    	    if ( (LA39_0==RULE_ID) ) {
            	    	        int LA39_1 = input.LA(2);

            	    	        if ( (LA39_1==39) ) {
            	    	            alt39=1;
            	    	        }
            	    	        else if ( (LA39_1==29) ) {
            	    	            alt39=2;
            	    	        }
            	    	        else {
            	    	            if (state.backtracking>0) {state.failed=true; return current;}
            	    	            NoViableAltException nvae =
            	    	                new NoViableAltException("", 39, 1, input);

            	    	            throw nvae;
            	    	        }
            	    	    }
            	    	    else {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 39, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt39) {
            	    	        case 1 :
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:3: ( (lv_links_16_0= ruleReferenceLink ) )
            	    	            {
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:3: ( (lv_links_16_0= ruleReferenceLink ) )
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2928:1: (lv_links_16_0= ruleReferenceLink )
            	    	            {
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2928:1: (lv_links_16_0= ruleReferenceLink )
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2929:3: lv_links_16_0= ruleReferenceLink
            	    	            {
            	    	            if ( state.backtracking==0 ) {
            	    	               
            	    	              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getLinksReferenceLinkParserRuleCall_10_1_2_0_0_0()); 
            	    	              	    
            	    	            }
            	    	            pushFollow(FOLLOW_ruleReferenceLink_in_ruleFunctionBinarySection6675);
            	    	            lv_links_16_0=ruleReferenceLink();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current, 
            	    	                     			"links",
            	    	                      		lv_links_16_0, 
            	    	                      		"ReferenceLink");
            	    	              	        afterParserOrEnumRuleCall();
            	    	              	    
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2946:6: ( (lv_confs_17_0= ruleInstanceConfig ) )
            	    	            {
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2946:6: ( (lv_confs_17_0= ruleInstanceConfig ) )
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2947:1: (lv_confs_17_0= ruleInstanceConfig )
            	    	            {
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2947:1: (lv_confs_17_0= ruleInstanceConfig )
            	    	            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2948:3: lv_confs_17_0= ruleInstanceConfig
            	    	            {
            	    	            if ( state.backtracking==0 ) {
            	    	               
            	    	              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getConfsInstanceConfigParserRuleCall_10_1_2_0_1_0()); 
            	    	              	    
            	    	            }
            	    	            pushFollow(FOLLOW_ruleInstanceConfig_in_ruleFunctionBinarySection6702);
            	    	            lv_confs_17_0=ruleInstanceConfig();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getFunctionBinarySectionRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current, 
            	    	                     			"confs",
            	    	                      		lv_confs_17_0, 
            	    	                      		"InstanceConfig");
            	    	              	        afterParserOrEnumRuleCall();
            	    	              	    
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection6715); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_18, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_10_1_2_1());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection6729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_10_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection6744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_11());
                  
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2984:1: entryRuleLinkedInstance returns [EObject current=null] : iv_ruleLinkedInstance= ruleLinkedInstance EOF ;
    public final EObject entryRuleLinkedInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedInstance = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2985:2: (iv_ruleLinkedInstance= ruleLinkedInstance EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2986:2: iv_ruleLinkedInstance= ruleLinkedInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedInstance_in_entryRuleLinkedInstance6780);
            iv_ruleLinkedInstance=ruleLinkedInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedInstance6790); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2993:1: ruleLinkedInstance returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLinkedInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2996:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2997:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2997:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2997:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2997:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2998:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2998:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2999:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkedInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkedInstanceAccess().getTypeClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLinkedInstance6838);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3012:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3013:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3013:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3014:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedInstance6855); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3038:1: entryRuleReferenceLink returns [EObject current=null] : iv_ruleReferenceLink= ruleReferenceLink EOF ;
    public final EObject entryRuleReferenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceLink = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3039:2: (iv_ruleReferenceLink= ruleReferenceLink EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3040:2: iv_ruleReferenceLink= ruleReferenceLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceLink_in_entryRuleReferenceLink6896);
            iv_ruleReferenceLink=ruleReferenceLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceLink6906); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3047:1: ruleReferenceLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReferenceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3050:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3051:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3051:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3051:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3051:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3052:1: (otherlv_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3052:1: (otherlv_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3053:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceLinkRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceLink6951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferenceLinkAccess().getRefInstanceReferenceCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleReferenceLink6963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceLinkAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:1: ( (otherlv_2= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3069:1: (otherlv_2= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3069:1: (otherlv_2= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3070:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceLinkRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceLink6983); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3089:1: entryRuleInstanceConfig returns [EObject current=null] : iv_ruleInstanceConfig= ruleInstanceConfig EOF ;
    public final EObject entryRuleInstanceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceConfig = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3090:2: (iv_ruleInstanceConfig= ruleInstanceConfig EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3091:2: iv_ruleInstanceConfig= ruleInstanceConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceConfigRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceConfig_in_entryRuleInstanceConfig7019);
            iv_ruleInstanceConfig=ruleInstanceConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceConfig7029); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3098:1: ruleInstanceConfig returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleInstanceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3101:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3102:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3102:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3102:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3102:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3103:1: (otherlv_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3103:1: (otherlv_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3104:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceConfigRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstanceConfig7074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInstanceConfigAccess().getConfConfigVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInstanceConfig7086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInstanceConfigAccess().getEqualsSignKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3119:1: ( (lv_value_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3120:1: (lv_value_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3120:1: (lv_value_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3121:3: lv_value_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceConfigAccess().getValueXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleInstanceConfig7107);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3145:1: entryRuleFunctionMemory returns [EObject current=null] : iv_ruleFunctionMemory= ruleFunctionMemory EOF ;
    public final EObject entryRuleFunctionMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionMemory = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3146:2: (iv_ruleFunctionMemory= ruleFunctionMemory EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3147:2: iv_ruleFunctionMemory= ruleFunctionMemory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionMemoryRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory7143);
            iv_ruleFunctionMemory=ruleFunctionMemory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionMemory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionMemory7153); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3154:1: ruleFunctionMemory returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) ;
    public final EObject ruleFunctionMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3157:28: ( (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3158:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3158:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3158:3: otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleFunctionMemory7190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionMemoryAccess().getMemKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3162:1: ( (lv_start_1_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3163:1: (lv_start_1_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3163:1: (lv_start_1_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3164:3: lv_start_1_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getStartLITERALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory7211);
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

            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleFunctionMemory7223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionMemoryAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3184:1: ( (lv_end_3_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3185:1: (lv_end_3_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3185:1: (lv_end_3_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3186:3: lv_end_3_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getEndLITERALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory7244);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3210:1: entryRuleConstantBinarySection returns [EObject current=null] : iv_ruleConstantBinarySection= ruleConstantBinarySection EOF ;
    public final EObject entryRuleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3211:2: (iv_ruleConstantBinarySection= ruleConstantBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3212:2: iv_ruleConstantBinarySection= ruleConstantBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection7280);
            iv_ruleConstantBinarySection=ruleConstantBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantBinarySection7290); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3219:1: ruleConstantBinarySection returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3222:28: ( (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3223:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3223:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3223:3: otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleConstantBinarySection7327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantBinarySectionAccess().getDataKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConstantBinarySection7339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantBinarySectionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3231:1: ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_BINARY)||LA42_0==44||LA42_0==57||LA42_0==59||(LA42_0>=88 && LA42_0<=91)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3231:2: ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3231:2: ( (lv_data_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3232:1: (lv_data_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3232:1: (lv_data_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3233:3: lv_data_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstantBinarySectionAccess().getDataXExpressionParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleConstantBinarySection7361);
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

            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConstantBinarySection7373); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getConstantBinarySectionAccess().getSemicolonKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleConstantBinarySection7387); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3265:1: entryRuleReferenceBinarySection returns [EObject current=null] : iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF ;
    public final EObject entryRuleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3266:2: (iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3267:2: iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection7423);
            iv_ruleReferenceBinarySection=ruleReferenceBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceBinarySection7433); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3274:1: ruleReferenceBinarySection returns [EObject current=null] : (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3277:28: ( (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3278:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3278:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3278:3: otherlv_0= 'include' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleReferenceBinarySection7470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceBinarySectionAccess().getIncludeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3282:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3283:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3283:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3284:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceBinarySectionAccess().getIncLinkedBinaryCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection7493);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3305:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3306:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3307:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression7529);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression7539); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3314:1: ruleXExpression returns [EObject current=null] : this_XExpression6_0= ruleXExpression6 ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3317:28: (this_XExpression6_0= ruleXExpression6 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3319:5: this_XExpression6_0= ruleXExpression6
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXExpression6ParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression6_in_ruleXExpression7585);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3335:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3336:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3337:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7619);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression7629); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3344:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3347:28: ( (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3348:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3348:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )
            int alt43=7;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:5: this_XExpressionLiteral_0= ruleXExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression7676);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3359:5: this_XParenthesizedExpression_1= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7703);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3369:5: this_XIsLiteralExpression_2= ruleXIsLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIsLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression7730);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3379:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression7757);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3389:5: this_OperationCall_4= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getOperationCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression7784);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3399:5: this_XStructExpression_5= ruleXStructExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXStructExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression7811);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3409:5: this_XSizeOfExpression_6= ruleXSizeOfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSizeOfExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression7838);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3425:1: entryRuleXSizeOfExpression returns [EObject current=null] : iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF ;
    public final EObject entryRuleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSizeOfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3426:2: (iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3427:2: iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSizeOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression7873);
            iv_ruleXSizeOfExpression=ruleXSizeOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSizeOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSizeOfExpression7883); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3434:1: ruleXSizeOfExpression returns [EObject current=null] : (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3437:28: ( (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3438:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3438:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3438:3: otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleXSizeOfExpression7920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXSizeOfExpressionAccess().getSizeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXSizeOfExpression7932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSizeOfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3446:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3447:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3447:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3448:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXSizeOfExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXSizeOfExpression7955);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXSizeOfExpression7967); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3473:1: entryRuleXStructExpression returns [EObject current=null] : iv_ruleXStructExpression= ruleXStructExpression EOF ;
    public final EObject entryRuleXStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStructExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3474:2: (iv_ruleXStructExpression= ruleXStructExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3475:2: iv_ruleXStructExpression= ruleXStructExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStructExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression8003);
            iv_ruleXStructExpression=ruleXStructExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStructExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStructExpression8013); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3482:1: ruleXStructExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3485:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3486:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3486:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3486:2: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3486:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3487:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3487:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3488:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXStructExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXStructExpression8061);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleXStructExpression8073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXStructExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3505:1: ( (lv_values_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3506:1: (lv_values_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3506:1: (lv_values_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3507:3: lv_values_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression8094);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3523:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==20) ) {
                    int LA44_1 = input.LA(2);

                    if ( ((LA44_1>=RULE_ID && LA44_1<=RULE_BINARY)||LA44_1==44||LA44_1==57||LA44_1==59||(LA44_1>=88 && LA44_1<=91)) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3523:4: otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXStructExpression8107); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXStructExpressionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3527:1: ( (lv_values_4_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3528:1: (lv_values_4_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3528:1: (lv_values_4_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3529:3: lv_values_4_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression8128);
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
            	    break loop44;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:4: (otherlv_5= ',' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXStructExpression8143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXStructExpression8157); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3561:1: entryRuleXExpression1 returns [EObject current=null] : iv_ruleXExpression1= ruleXExpression1 EOF ;
    public final EObject entryRuleXExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3562:2: (iv_ruleXExpression1= ruleXExpression1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3563:2: iv_ruleXExpression1= ruleXExpression1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression1_in_entryRuleXExpression18193);
            iv_ruleXExpression1=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression18203); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:1: ruleXExpression1 returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) ;
    public final EObject ruleXExpression1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3573:28: ( ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3574:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3574:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3574:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXExpression0 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3574:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=88 && LA46_0<=91)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3575:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:3: lv_operator_0_0= ruleUNARY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression1Access().getOperatorUNARY_OPERATOREnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression18249);
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
            	    break loop46;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3592:3: ( (lv_a_1_0= ruleXExpression0 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:1: (lv_a_1_0= ruleXExpression0 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3593:1: (lv_a_1_0= ruleXExpression0 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3594:3: lv_a_1_0= ruleXExpression0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression1Access().getAXExpression0ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression0_in_ruleXExpression18271);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3618:1: entryRuleXExpression0 returns [EObject current=null] : iv_ruleXExpression0= ruleXExpression0 EOF ;
    public final EObject entryRuleXExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression0 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:2: (iv_ruleXExpression0= ruleXExpression0 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3620:2: iv_ruleXExpression0= ruleXExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression0Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression0_in_entryRuleXExpression08307);
            iv_ruleXExpression0=ruleXExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression0; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression08317); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3627:1: ruleXExpression0 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )* ) ;
    public final EObject ruleXExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_member_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3630:28: ( ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:1: ( ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:2: ( (lv_a_0_0= ruleXExpressionM1 ) ) (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:2: ( (lv_a_0_0= ruleXExpressionM1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3632:1: (lv_a_0_0= ruleXExpressionM1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3632:1: (lv_a_0_0= ruleXExpressionM1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3633:3: lv_a_0_0= ruleXExpressionM1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression0Access().getAXExpressionM1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_ruleXExpression08363);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3649:2: (otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==58) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3649:4: otherlv_1= '->' ( (lv_member_2_0= ruleVariableReference ) )
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXExpression08376); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpression0Access().getHyphenMinusGreaterThanSignKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3653:1: ( (lv_member_2_0= ruleVariableReference ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:1: (lv_member_2_0= ruleVariableReference )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3654:1: (lv_member_2_0= ruleVariableReference )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:3: lv_member_2_0= ruleVariableReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression0Access().getMemberVariableReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableReference_in_ruleXExpression08397);
            	    lv_member_2_0=ruleVariableReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpression0Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"member",
            	              		lv_member_2_0, 
            	              		"VariableReference");
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
    // $ANTLR end "ruleXExpression0"


    // $ANTLR start "entryRuleXExpressionM1"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3679:1: entryRuleXExpressionM1 returns [EObject current=null] : iv_ruleXExpressionM1= ruleXExpressionM1 EOF ;
    public final EObject entryRuleXExpressionM1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionM1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3680:2: (iv_ruleXExpressionM1= ruleXExpressionM1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3681:2: iv_ruleXExpressionM1= ruleXExpressionM1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionM1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM18435);
            iv_ruleXExpressionM1=ruleXExpressionM1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionM1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionM18445); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3688:1: ruleXExpressionM1 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleXExpressionM1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_index_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3691:28: ( ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3692:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3692:1: ( ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3692:2: ( (lv_a_0_0= ruleXPrimaryExpression ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3692:2: ( (lv_a_0_0= ruleXPrimaryExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3693:1: (lv_a_0_0= ruleXPrimaryExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3693:1: (lv_a_0_0= ruleXPrimaryExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3694:3: lv_a_0_0= ruleXPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionM1Access().getAXPrimaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM18491);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3710:2: (otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3710:4: otherlv_1= '[' ( (lv_index_2_0= ruleXExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleXExpressionM18504); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getXExpressionM1Access().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3714:1: ( (lv_index_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3715:1: (lv_index_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3715:1: (lv_index_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3716:3: lv_index_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionM1Access().getIndexXExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionM18525);
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

            	    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleXExpressionM18537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXExpressionM1Access().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleXExpressionM1"


    // $ANTLR start "entryRuleXExpression2"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3744:1: entryRuleXExpression2 returns [EObject current=null] : iv_ruleXExpression2= ruleXExpression2 EOF ;
    public final EObject entryRuleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression2 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3745:2: (iv_ruleXExpression2= ruleXExpression2 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3746:2: iv_ruleXExpression2= ruleXExpression2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression2Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression2_in_entryRuleXExpression28575);
            iv_ruleXExpression2=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression28585); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3753:1: ruleXExpression2 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3756:28: ( ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3757:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3757:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3757:2: ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3757:2: ( (lv_a_0_0= ruleXExpression1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3758:1: (lv_a_0_0= ruleXExpression1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3758:1: (lv_a_0_0= ruleXExpression1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3759:3: lv_a_0_0= ruleXExpression1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression2Access().getAXExpression1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression1_in_ruleXExpression28631);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3775:2: ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case 92:
                    {
                    int LA49_2 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA49_3 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA49_4 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt49=1;
                    }


                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3775:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3775:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3775:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3780:1: (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3781:3: lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getOpMULTIPLICATIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression28663);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3797:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3798:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3798:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3799:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression28684);
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
    // $ANTLR end "ruleXExpression2"


    // $ANTLR start "entryRuleXExpression3"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3823:1: entryRuleXExpression3 returns [EObject current=null] : iv_ruleXExpression3= ruleXExpression3 EOF ;
    public final EObject entryRuleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression3 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3824:2: (iv_ruleXExpression3= ruleXExpression3 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3825:2: iv_ruleXExpression3= ruleXExpression3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression3Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression3_in_entryRuleXExpression38722);
            iv_ruleXExpression3=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression38732); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3832:1: ruleXExpression3 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3835:28: ( ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3836:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3836:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3836:2: ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3836:2: ( (lv_a_0_0= ruleXExpression2 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3837:1: (lv_a_0_0= ruleXExpression2 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3837:1: (lv_a_0_0= ruleXExpression2 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3838:3: lv_a_0_0= ruleXExpression2
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression3Access().getAXExpression2ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression38778);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3854:2: ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==95) && (synpred2_InternalESyntax())) {
                    alt50=1;
                }
                else if ( (LA50_0==88) && (synpred2_InternalESyntax())) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3854:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3854:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3854:4: ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3859:1: (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3860:3: lv_op_1_0= ruleADDITIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getOpADDITIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression38810);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3876:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3877:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3877:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3878:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression38831);
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
    // $ANTLR end "ruleXExpression3"


    // $ANTLR start "entryRuleXExpression4"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3902:1: entryRuleXExpression4 returns [EObject current=null] : iv_ruleXExpression4= ruleXExpression4 EOF ;
    public final EObject entryRuleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression4 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3903:2: (iv_ruleXExpression4= ruleXExpression4 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3904:2: iv_ruleXExpression4= ruleXExpression4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression4Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression4_in_entryRuleXExpression48869);
            iv_ruleXExpression4=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression48879); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3911:1: ruleXExpression4 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) ;
    public final EObject ruleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3914:28: ( ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:2: ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3915:2: ( (lv_a_0_0= ruleXExpression3 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3916:1: (lv_a_0_0= ruleXExpression3 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3916:1: (lv_a_0_0= ruleXExpression3 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3917:3: lv_a_0_0= ruleXExpression3
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression4Access().getAXExpression3ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression48925);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:2: ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==96) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }
                else if ( (LA51_0==97) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }
                else if ( (LA51_0==98) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }
                else if ( (LA51_0==99) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }
                else if ( (LA51_0==43) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }
                else if ( (LA51_0==42) && (synpred3_InternalESyntax())) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:4: ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3938:1: (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3939:3: lv_op_1_0= ruleEQUALITY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getOpEQUALITY_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression48957);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3955:2: ( (lv_b_2_0= ruleXExpression3 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3956:1: (lv_b_2_0= ruleXExpression3 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3956:1: (lv_b_2_0= ruleXExpression3 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3957:3: lv_b_2_0= ruleXExpression3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getBXExpression3ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression48978);
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
            	    break loop51;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3981:1: entryRuleXExpression5 returns [EObject current=null] : iv_ruleXExpression5= ruleXExpression5 EOF ;
    public final EObject entryRuleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression5 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3982:2: (iv_ruleXExpression5= ruleXExpression5 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3983:2: iv_ruleXExpression5= ruleXExpression5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression5Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression5_in_entryRuleXExpression59016);
            iv_ruleXExpression5=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression59026); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3990:1: ruleXExpression5 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) ;
    public final EObject ruleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3993:28: ( ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3994:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3994:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3994:2: ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3994:2: ( (lv_a_0_0= ruleXExpression4 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3995:1: (lv_a_0_0= ruleXExpression4 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3995:1: (lv_a_0_0= ruleXExpression4 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3996:3: lv_a_0_0= ruleXExpression4
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression5Access().getAXExpression4ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression59072);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:2: ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==100) && (synpred4_InternalESyntax())) {
                    alt52=1;
                }
                else if ( (LA52_0==101) && (synpred4_InternalESyntax())) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:4: ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4017:1: (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4018:3: lv_op_1_0= ruleBOOLEAN_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getOpBOOLEAN_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression59104);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4034:2: ( (lv_b_2_0= ruleXExpression4 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4035:1: (lv_b_2_0= ruleXExpression4 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4035:1: (lv_b_2_0= ruleXExpression4 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4036:3: lv_b_2_0= ruleXExpression4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getBXExpression4ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression59125);
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
            	    break loop52;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4060:1: entryRuleXExpression6 returns [EObject current=null] : iv_ruleXExpression6= ruleXExpression6 EOF ;
    public final EObject entryRuleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression6 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4061:2: (iv_ruleXExpression6= ruleXExpression6 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4062:2: iv_ruleXExpression6= ruleXExpression6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression6Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression6_in_entryRuleXExpression69163);
            iv_ruleXExpression6=ruleXExpression6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression6; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression69173); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4069:1: ruleXExpression6 returns [EObject current=null] : ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) ;
    public final EObject ruleXExpression6() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4072:28: ( ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:1: ( ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )* ( (lv_a_2_0= ruleXExpression5 ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:3: ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:4: ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4078:1: (lv_ref_0_0= ruleVariableReference )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4079:3: lv_ref_0_0= ruleVariableReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression6Access().getRefVariableReferenceParserRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableReference_in_ruleXExpression69230);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXExpression69246);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4103:3: ( (lv_a_2_0= ruleXExpression5 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4104:1: (lv_a_2_0= ruleXExpression5 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4104:1: (lv_a_2_0= ruleXExpression5 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4105:3: lv_a_2_0= ruleXExpression5
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression6Access().getAXExpression5ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression5_in_ruleXExpression69268);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4129:1: entryRuleXExpressionLiteral returns [EObject current=null] : iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF ;
    public final EObject entryRuleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionLiteral = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4130:2: (iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4131:2: iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral9304);
            iv_ruleXExpressionLiteral=ruleXExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionLiteral9314); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4138:1: ruleXExpressionLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4141:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4142:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4142:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4143:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4143:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4144:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral9359);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4168:1: entryRuleXTopLevelExpression returns [EObject current=null] : iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF ;
    public final EObject entryRuleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTopLevelExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4169:2: (iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4170:2: iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression9394);
            iv_ruleXTopLevelExpression=ruleXTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTopLevelExpression9404); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4177:1: ruleXTopLevelExpression returns [EObject current=null] : ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression ) ;
    public final EObject ruleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_XExpression_0 = null;

        EObject this_XIfExpression_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4180:28: ( ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4181:1: ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4181:1: ( (this_XExpression_0= ruleXExpression otherlv_1= ';' ) | this_XIfExpression_2= ruleXIfExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_BINARY)||LA54_0==44||LA54_0==57||LA54_0==59||(LA54_0>=88 && LA54_0<=91)) ) {
                alt54=1;
            }
            else if ( (LA54_0==60) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4181:2: (this_XExpression_0= ruleXExpression otherlv_1= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4181:2: (this_XExpression_0= ruleXExpression otherlv_1= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4182:5: this_XExpression_0= ruleXExpression otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTopLevelExpression9452);
                    this_XExpression_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleXTopLevelExpression9463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTopLevelExpressionAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4196:5: this_XIfExpression_2= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression9492);
                    this_XIfExpression_2=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_2; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4212:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4213:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4214:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign9528);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign9539); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4221:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4224:28: (kw= '=' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4226:2: kw= '='
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpSingleAssign9576); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4239:1: entryRuleXIsLiteralExpression returns [EObject current=null] : iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF ;
    public final EObject entryRuleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIsLiteralExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4240:2: (iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4241:2: iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIsLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression9615);
            iv_ruleXIsLiteralExpression=ruleXIsLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIsLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIsLiteralExpression9625); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4248:1: ruleXIsLiteralExpression returns [EObject current=null] : (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4251:28: ( (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4252:3: otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleXIsLiteralExpression9662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIsLiteralExpressionAccess().getIsliteralKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXIsLiteralExpression9674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIsLiteralExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4260:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4261:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4261:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4262:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression9695);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXIsLiteralExpression9707); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4290:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4291:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4292:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression9743);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression9753); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4299:1: ruleXIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4302:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4303:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4303:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4303:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression9790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIfExpressionAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression9802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4311:1: ( (lv_if_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4312:1: (lv_if_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4312:1: (lv_if_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4313:3: lv_if_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression9823);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression9835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression9847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4337:1: ( (lv_then_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4338:1: (lv_then_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4338:1: (lv_then_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4339:3: lv_then_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression9868);
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression9880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:1: ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==61) && (synpred6_InternalESyntax())) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:2: ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}'
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:2: ( ( 'else' )=>otherlv_7= 'else' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:3: ( 'else' )=>otherlv_7= 'else'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleXIfExpression9901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXIfExpressionAccess().getElseKeyword_7_0());
                          
                    }

                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression9914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4368:1: ( (lv_else_9_0= ruleOperationBlock ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4369:1: (lv_else_9_0= ruleOperationBlock )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4369:1: (lv_else_9_0= ruleOperationBlock )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4370:3: lv_else_9_0= ruleOperationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseOperationBlockParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression9935);
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

                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression9947); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4398:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4399:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4400:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9985);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression9995); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4407:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4410:28: ( (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4411:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4411:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4411:3: otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression10032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4415:1: ( (lv_a_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4416:1: (lv_a_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4416:1: (lv_a_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4417:3: lv_a_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression10053);
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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression10065); if (state.failed) return current;
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


    // $ANTLR start "rulePrimitiveKind"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4445:1: rulePrimitiveKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator rulePrimitiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4447:28: ( ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4448:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4448:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt56=1;
                }
                break;
            case 63:
                {
                alt56=2;
                }
                break;
            case 64:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4448:2: (enumLiteral_0= 'unsigned' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4448:2: (enumLiteral_0= 'unsigned' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4448:4: enumLiteral_0= 'unsigned'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_rulePrimitiveKind10115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4454:6: (enumLiteral_1= 'signed' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4454:6: (enumLiteral_1= 'signed' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4454:8: enumLiteral_1= 'signed'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_rulePrimitiveKind10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4460:6: (enumLiteral_2= 'real' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4460:6: (enumLiteral_2= 'real' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4460:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_rulePrimitiveKind10149); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4470:1: ruleParameterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) ;
    public final Enumerator ruleParameterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4472:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt57=1;
                }
                break;
            case 66:
                {
                alt57=2;
                }
                break;
            case 37:
                {
                alt57=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4473:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleParameterKind10194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:6: (enumLiteral_1= 'var' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:6: (enumLiteral_1= 'var' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4479:8: enumLiteral_1= 'var'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleParameterKind10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:6: (enumLiteral_2= 'const' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:6: (enumLiteral_2= 'const' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4485:8: enumLiteral_2= 'const'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_37_in_ruleParameterKind10228); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4495:1: ruleOperationRole returns [Enumerator current=null] : ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4497:28: ( ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            int alt58=20;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt58=1;
                }
                break;
            case 68:
                {
                alt58=2;
                }
                break;
            case 69:
                {
                alt58=3;
                }
                break;
            case 70:
                {
                alt58=4;
                }
                break;
            case 71:
                {
                alt58=5;
                }
                break;
            case 72:
                {
                alt58=6;
                }
                break;
            case 73:
                {
                alt58=7;
                }
                break;
            case 74:
                {
                alt58=8;
                }
                break;
            case 75:
                {
                alt58=9;
                }
                break;
            case 76:
                {
                alt58=10;
                }
                break;
            case 77:
                {
                alt58=11;
                }
                break;
            case 78:
                {
                alt58=12;
                }
                break;
            case 79:
                {
                alt58=13;
                }
                break;
            case 80:
                {
                alt58=14;
                }
                break;
            case 81:
                {
                alt58=15;
                }
                break;
            case 82:
                {
                alt58=16;
                }
                break;
            case 83:
                {
                alt58=17;
                }
                break;
            case 84:
                {
                alt58=18;
                }
                break;
            case 85:
                {
                alt58=19;
                }
                break;
            case 86:
                {
                alt58=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:2: (enumLiteral_0= 'SET' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:2: (enumLiteral_0= 'SET' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4498:4: enumLiteral_0= 'SET'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleOperationRole10273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:6: (enumLiteral_1= 'ADD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:6: (enumLiteral_1= 'ADD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4504:8: enumLiteral_1= 'ADD'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleOperationRole10290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:6: (enumLiteral_2= 'SUBTRACT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:6: (enumLiteral_2= 'SUBTRACT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4510:8: enumLiteral_2= 'SUBTRACT'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleOperationRole10307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4516:6: (enumLiteral_3= 'AND' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4516:6: (enumLiteral_3= 'AND' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4516:8: enumLiteral_3= 'AND'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleOperationRole10324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4522:6: (enumLiteral_4= 'OR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4522:6: (enumLiteral_4= 'OR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4522:8: enumLiteral_4= 'OR'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleOperationRole10341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4528:6: (enumLiteral_5= 'XOR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4528:6: (enumLiteral_5= 'XOR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4528:8: enumLiteral_5= 'XOR'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleOperationRole10358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4534:6: (enumLiteral_6= 'EQUALS' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4534:6: (enumLiteral_6= 'EQUALS' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4534:8: enumLiteral_6= 'EQUALS'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_ruleOperationRole10375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4540:6: (enumLiteral_7= 'BRANCH' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4540:6: (enumLiteral_7= 'BRANCH' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4540:8: enumLiteral_7= 'BRANCH'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_ruleOperationRole10392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4546:6: (enumLiteral_8= 'UC_GOTO' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4546:6: (enumLiteral_8= 'UC_GOTO' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4546:8: enumLiteral_8= 'UC_GOTO'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_75_in_ruleOperationRole10409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4552:6: (enumLiteral_9= 'NOT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4552:6: (enumLiteral_9= 'NOT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4552:8: enumLiteral_9= 'NOT'
                    {
                    enumLiteral_9=(Token)match(input,76,FOLLOW_76_in_ruleOperationRole10426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4558:6: (enumLiteral_10= 'INDIRECTION' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4558:6: (enumLiteral_10= 'INDIRECTION' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4558:8: enumLiteral_10= 'INDIRECTION'
                    {
                    enumLiteral_10=(Token)match(input,77,FOLLOW_77_in_ruleOperationRole10443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4564:6: (enumLiteral_11= 'CLEAR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4564:6: (enumLiteral_11= 'CLEAR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4564:8: enumLiteral_11= 'CLEAR'
                    {
                    enumLiteral_11=(Token)match(input,78,FOLLOW_78_in_ruleOperationRole10460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4570:6: (enumLiteral_12= 'INCREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4570:6: (enumLiteral_12= 'INCREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4570:8: enumLiteral_12= 'INCREMENT'
                    {
                    enumLiteral_12=(Token)match(input,79,FOLLOW_79_in_ruleOperationRole10477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4576:6: (enumLiteral_13= 'DECREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4576:6: (enumLiteral_13= 'DECREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4576:8: enumLiteral_13= 'DECREMENT'
                    {
                    enumLiteral_13=(Token)match(input,80,FOLLOW_80_in_ruleOperationRole10494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4582:6: (enumLiteral_14= 'DIV' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4582:6: (enumLiteral_14= 'DIV' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4582:8: enumLiteral_14= 'DIV'
                    {
                    enumLiteral_14=(Token)match(input,81,FOLLOW_81_in_ruleOperationRole10511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4588:6: (enumLiteral_15= 'MOD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4588:6: (enumLiteral_15= 'MOD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4588:8: enumLiteral_15= 'MOD'
                    {
                    enumLiteral_15=(Token)match(input,82,FOLLOW_82_in_ruleOperationRole10528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4594:6: (enumLiteral_16= 'LT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4594:6: (enumLiteral_16= 'LT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4594:8: enumLiteral_16= 'LT'
                    {
                    enumLiteral_16=(Token)match(input,83,FOLLOW_83_in_ruleOperationRole10545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4600:6: (enumLiteral_17= 'LTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4600:6: (enumLiteral_17= 'LTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4600:8: enumLiteral_17= 'LTE'
                    {
                    enumLiteral_17=(Token)match(input,84,FOLLOW_84_in_ruleOperationRole10562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4606:6: (enumLiteral_18= 'GT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4606:6: (enumLiteral_18= 'GT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4606:8: enumLiteral_18= 'GT'
                    {
                    enumLiteral_18=(Token)match(input,85,FOLLOW_85_in_ruleOperationRole10579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4612:6: (enumLiteral_19= 'GTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4612:6: (enumLiteral_19= 'GTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4612:8: enumLiteral_19= 'GTE'
                    {
                    enumLiteral_19=(Token)match(input,86,FOLLOW_86_in_ruleOperationRole10596); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4622:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4624:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==65) ) {
                alt59=1;
            }
            else if ( (LA59_0==87) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4625:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleBinaryType10641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:6: (enumLiteral_1= 'hexfile' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:6: (enumLiteral_1= 'hexfile' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4631:8: enumLiteral_1= 'hexfile'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleBinaryType10658); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4641:1: ruleUNARY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) ;
    public final Enumerator ruleUNARY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4643:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4644:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4644:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) | (enumLiteral_2= '&' ) | (enumLiteral_3= '@' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt60=1;
                }
                break;
            case 89:
                {
                alt60=2;
                }
                break;
            case 90:
                {
                alt60=3;
                }
                break;
            case 91:
                {
                alt60=4;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4644:2: (enumLiteral_0= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4644:2: (enumLiteral_0= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4644:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleUNARY_OPERATOR10703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:6: (enumLiteral_1= '!' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:6: (enumLiteral_1= '!' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4650:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleUNARY_OPERATOR10720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:6: (enumLiteral_2= '&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:6: (enumLiteral_2= '&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4656:8: enumLiteral_2= '&'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleUNARY_OPERATOR10737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUNARY_OPERATORAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4662:6: (enumLiteral_3= '@' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4662:6: (enumLiteral_3= '@' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4662:8: enumLiteral_3= '@'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleUNARY_OPERATOR10754); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4672:1: ruleMULTIPLICATIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4674:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt61=1;
                }
                break;
            case 93:
                {
                alt61=2;
                }
                break;
            case 94:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:2: (enumLiteral_0= '*' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:2: (enumLiteral_0= '*' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4675:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleMULTIPLICATIVE_OPERATOR10799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:6: (enumLiteral_1= '/' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:6: (enumLiteral_1= '/' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4681:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleMULTIPLICATIVE_OPERATOR10816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:6: (enumLiteral_2= '%' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:6: (enumLiteral_2= '%' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4687:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleMULTIPLICATIVE_OPERATOR10833); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4697:1: ruleADDITIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleADDITIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4699:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==95) ) {
                alt62=1;
            }
            else if ( (LA62_0==88) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:2: (enumLiteral_0= '+' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:2: (enumLiteral_0= '+' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4700:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleADDITIVE_OPERATOR10878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:6: (enumLiteral_1= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:6: (enumLiteral_1= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4706:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleADDITIVE_OPERATOR10895); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4716:1: ruleEQUALITY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4718:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4719:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4719:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt63=1;
                }
                break;
            case 97:
                {
                alt63=2;
                }
                break;
            case 98:
                {
                alt63=3;
                }
                break;
            case 99:
                {
                alt63=4;
                }
                break;
            case 43:
                {
                alt63=5;
                }
                break;
            case 42:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4719:2: (enumLiteral_0= '==' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4719:2: (enumLiteral_0= '==' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4719:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleEQUALITY_OPERATOR10940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:6: (enumLiteral_1= '!=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:6: (enumLiteral_1= '!=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4725:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleEQUALITY_OPERATOR10957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:6: (enumLiteral_2= '>=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:6: (enumLiteral_2= '>=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4731:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleEQUALITY_OPERATOR10974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4737:6: (enumLiteral_3= '<=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4737:6: (enumLiteral_3= '<=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4737:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_99_in_ruleEQUALITY_OPERATOR10991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4743:6: (enumLiteral_4= '>' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4743:6: (enumLiteral_4= '>' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4743:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_43_in_ruleEQUALITY_OPERATOR11008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4749:6: (enumLiteral_5= '<' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4749:6: (enumLiteral_5= '<' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4749:8: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_42_in_ruleEQUALITY_OPERATOR11025); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4759:1: ruleBOOLEAN_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBOOLEAN_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4761:28: ( ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==100) ) {
                alt64=1;
            }
            else if ( (LA64_0==101) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:2: (enumLiteral_0= '||' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:2: (enumLiteral_0= '||' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4762:4: enumLiteral_0= '||'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_100_in_ruleBOOLEAN_OPERATOR11070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:6: (enumLiteral_1= '&&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:6: (enumLiteral_1= '&&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4768:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_101_in_ruleBOOLEAN_OPERATOR11087); if (state.failed) return current;
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
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3775:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3776:1: ( ruleMULTIPLICATIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3776:1: ( ruleMULTIPLICATIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3777:1: ruleMULTIPLICATIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax8646);
        ruleMULTIPLICATIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalESyntax

    // $ANTLR start synpred2_InternalESyntax
    public final void synpred2_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3854:4: ( ( ruleADDITIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3855:1: ( ruleADDITIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3855:1: ( ruleADDITIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3856:1: ruleADDITIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax8793);
        ruleADDITIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalESyntax

    // $ANTLR start synpred3_InternalESyntax
    public final void synpred3_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3933:4: ( ( ruleEQUALITY_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:1: ( ruleEQUALITY_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3934:1: ( ruleEQUALITY_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3935:1: ruleEQUALITY_OPERATOR
        {
        pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax8940);
        ruleEQUALITY_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalESyntax

    // $ANTLR start synpred4_InternalESyntax
    public final void synpred4_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4012:4: ( ( ruleBOOLEAN_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4013:1: ( ruleBOOLEAN_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4013:1: ( ruleBOOLEAN_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4014:1: ruleBOOLEAN_OPERATOR
        {
        pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax9087);
        ruleBOOLEAN_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalESyntax

    // $ANTLR start synpred5_InternalESyntax
    public final void synpred5_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4073:4: ( ( ruleVariableReference ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4074:1: ( ruleVariableReference )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4074:1: ( ruleVariableReference )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4075:1: ruleVariableReference
        {
        pushFollow(FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax9213);
        ruleVariableReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalESyntax

    // $ANTLR start synpred6_InternalESyntax
    public final void synpred6_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:3: ( 'else' )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:4359:5: 'else'
        {
        match(input,61,FOLLOW_61_in_synpred6_InternalESyntax9893); if (state.failed) return ;

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


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\4\3\uffff\1\4\1\uffff\2\4\1\20\1\4";
    static final String DFA20_maxS =
        "\1\133\3\uffff\1\145\1\uffff\2\4\1\21\1\145";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\4\uffff";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\4\3\5\26\uffff\1\3\1\uffff\1\3\3\uffff\1\3\4\uffff\1\2\1"+
            "\1\1\uffff\1\5\14\uffff\1\5\1\uffff\2\5\1\uffff\3\3\27\uffff"+
            "\4\5",
            "",
            "",
            "",
            "\1\3\11\uffff\1\5\1\uffff\1\6\1\7\3\uffff\1\5\7\uffff\1\5"+
            "\3\uffff\1\5\10\uffff\3\5\15\uffff\1\5\35\uffff\1\5\3\uffff"+
            "\12\5",
            "",
            "\1\10",
            "\1\11",
            "\1\6\1\7",
            "\1\3\11\uffff\1\5\6\uffff\1\5\7\uffff\1\5\3\uffff\1\5\10\uffff"+
            "\3\5\15\uffff\1\5\35\uffff\1\5\3\uffff\12\5"
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
            return "1743:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | this_XTopLevelExpression_4= ruleXTopLevelExpression )";
        }
    }
    static final String DFA28_eotS =
        "\10\uffff";
    static final String DFA28_eofS =
        "\10\uffff";
    static final String DFA28_minS =
        "\2\4\2\uffff\2\4\1\20\1\4";
    static final String DFA28_maxS =
        "\1\133\1\145\2\uffff\2\4\1\21\1\145";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\2\4\uffff";
    static final String DFA28_specialS =
        "\10\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\3\2\26\uffff\1\3\1\uffff\1\3\3\uffff\1\3\7\uffff\1\2\14"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\3\3\27\uffff\4\2",
            "\1\3\11\uffff\1\2\1\uffff\1\4\1\5\3\uffff\1\2\7\uffff\1\2"+
            "\3\uffff\1\2\10\uffff\3\2\15\uffff\1\2\35\uffff\1\2\3\uffff"+
            "\12\2",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\4\1\5",
            "\1\3\11\uffff\1\2\6\uffff\1\2\7\uffff\1\2\3\uffff\1\2\10\uffff"+
            "\3\2\15\uffff\1\2\35\uffff\1\2\3\uffff\12\2"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "2339:1: ( ( (lv_return_11_0= ruleXExpression ) ) | ( (lv_returnvar_12_0= ruleVariable ) ) )";
        }
    }
    static final String DFA43_eotS =
        "\15\uffff";
    static final String DFA43_eofS =
        "\4\uffff\1\11\7\uffff\1\11";
    static final String DFA43_minS =
        "\1\4\3\uffff\1\16\2\uffff\2\4\2\uffff\1\20\1\16";
    static final String DFA43_maxS =
        "\1\73\3\uffff\1\145\2\uffff\2\4\2\uffff\1\21\1\145";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\5\2\uffff\1\4\1\6\2\uffff";
    static final String DFA43_specialS =
        "\15\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\4\3\1\44\uffff\1\2\14\uffff\1\5\1\uffff\1\3",
            "",
            "",
            "",
            "\1\11\1\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff\1\11\11\uffff"+
            "\2\11\7\uffff\2\11\1\6\1\11\14\uffff\1\11\35\uffff\1\11\3\uffff"+
            "\12\11",
            "",
            "",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\7\1\10",
            "\1\11\5\uffff\1\11\1\12\1\uffff\1\11\11\uffff\2\11\7\uffff"+
            "\2\11\1\6\1\11\14\uffff\1\11\35\uffff\1\11\3\uffff\12\11"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "3348:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XStructExpression_5= ruleXStructExpression | this_XSizeOfExpression_6= ruleXSizeOfExpression )";
        }
    }
    static final String DFA53_eotS =
        "\10\uffff";
    static final String DFA53_eofS =
        "\2\uffff\1\1\4\uffff\1\1";
    static final String DFA53_minS =
        "\1\4\1\uffff\1\16\1\uffff\2\4\1\20\1\16";
    static final String DFA53_maxS =
        "\1\133\1\uffff\1\145\1\uffff\2\4\1\21\1\145";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA53_specialS =
        "\2\uffff\1\0\4\uffff\1\1}>";
    static final String[] DFA53_transitionS = {
            "\1\2\3\1\44\uffff\1\1\14\uffff\1\1\1\uffff\1\1\34\uffff\4\1",
            "",
            "\1\1\1\uffff\1\4\1\5\2\uffff\2\1\1\uffff\1\1\5\uffff\1\3\3"+
            "\uffff\2\1\7\uffff\4\1\14\uffff\1\1\35\uffff\1\1\3\uffff\12"+
            "\1",
            "",
            "\1\6",
            "\1\7",
            "\1\4\1\5",
            "\1\1\5\uffff\2\1\1\uffff\1\1\5\uffff\1\3\3\uffff\2\1\7\uffff"+
            "\4\1\14\uffff\1\1\35\uffff\1\1\3\uffff\12\1"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 4073:2: ( ( ( ( ruleVariableReference ) )=> (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_2==29) && (synpred5_InternalESyntax())) {s = 3;}

                        else if ( (LA53_2==16) ) {s = 4;}

                        else if ( (LA53_2==17) ) {s = 5;}

                        else if ( (LA53_2==EOF||LA53_2==14||(LA53_2>=20 && LA53_2<=21)||LA53_2==23||(LA53_2>=33 && LA53_2<=34)||(LA53_2>=42 && LA53_2<=45)||LA53_2==58||LA53_2==88||(LA53_2>=92 && LA53_2<=101)) ) {s = 1;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_7==29) && (synpred5_InternalESyntax())) {s = 3;}

                        else if ( (LA53_7==EOF||LA53_7==14||(LA53_7>=20 && LA53_7<=21)||LA53_7==23||(LA53_7>=33 && LA53_7<=34)||(LA53_7>=42 && LA53_7<=45)||LA53_7==58||LA53_7==88||(LA53_7>=92 && LA53_7<=101)) ) {s = 1;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNameSpaceName_in_rulePackage143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage155 = new BitSet(new long[]{0x0001000004048002L});
    public static final BitSet FOLLOW_15_in_rulePackage168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNameSpaceName_in_rulePackage191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage203 = new BitSet(new long[]{0x0001000004048002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_rulePackage226 = new BitSet(new long[]{0x0001000004040002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleCompilationUnit320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleCompilationUnit347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_ruleCompilationUnit374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameSpaceName_in_entryRuleNameSpaceName410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameSpaceName421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameSpaceName461 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleNameSpaceName480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameSpaceName495 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameSpaceName_in_ruleQualifiedName602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLITERAL734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLITERAL760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleLITERAL786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleClass878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass895 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleClass913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass936 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClass949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass972 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleClass988 = new BitSet(new long[]{0xC000003143C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_22_in_ruleClass1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1024 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClass1036 = new BitSet(new long[]{0xC000003143C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleClassItem_in_ruleClass1059 = new BitSet(new long[]{0xC000003143800010L,0x0000000000000001L});
    public static final BitSet FOLLOW_23_in_ruleClass1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassItem_in_entryRuleClassItem1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassItem1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleClassItem1166 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassItem1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigVariable_in_ruleClassItem1207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassItem1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleClassItem1248 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassItem1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceReference_in_ruleClassItem1289 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassItem1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleClassItem1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceReference_in_entryRuleInstanceReference1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceReference1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInstanceReference1411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceReference1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceReference1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigVariable_in_entryRuleConfigVariable1492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigVariable1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConfigVariable1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConfigVariable1571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigVariable1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLibrary1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLibrary1693 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleLibrary1711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1734 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleLibrary1747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1770 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleLibrary1786 = new BitSet(new long[]{0xC000817153C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_22_in_ruleLibrary1799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLibrary1822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLibrary1834 = new BitSet(new long[]{0xC000817153C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_ruleLibrary1857 = new BitSet(new long[]{0xC000817153800010L,0x0000000000000001L});
    public static final BitSet FOLLOW_23_in_ruleLibrary1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibraryItem_in_entryRuleLibraryItem1906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibraryItem1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLibraryItem1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleLibraryItem1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLibraryItem2018 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLibraryItem2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleLibraryItem2059 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLibraryItem2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_ruleLibraryItem2100 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLibraryItem2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompileContextVariable_in_ruleLibraryItem2141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLibraryItem2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_ruleLibraryItem2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType2263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleType2297 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarType_in_entryRuleVarType2354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarType2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarSimpleType_in_ruleVarType2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarSimpleType_in_entryRuleVarSimpleType2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarSimpleType2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleVarSimpleType2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_ruleTypeDef2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_ruleTypeDef2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_ruleTypeDef2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_ruleTypeDef2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_ruleTypeDef2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerTypeDef_in_entryRulePointerTypeDef2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerTypeDef2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePointerTypeDef2785 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePointerTypeDef2797 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rulePointerTypeDef2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDef2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArrayTypeDef2901 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArrayTypeDef2913 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayTypeDef2934 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArrayTypeDef2946 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArrayTypeDef2958 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleArrayTypeDef2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTypeDef_in_entryRuleRefTypeDef3015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTypeDef3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRefTypeDef3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef3107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDef3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef3163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataTypeDef3180 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDataTypeDef3197 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataTypeDef3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef3245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDef3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStructTypeDef3301 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStructTypeDef3313 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef3334 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleStructTypeDef3347 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef3368 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleStructTypeDef3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDefMember3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleStructTypeDefMember3483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructTypeDefMember3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable3541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantVariable3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConstantVariable3597 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleConstantVariable3618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantVariable3635 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConstantVariable3652 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantVariable3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable3709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterVariable3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRegisterVariable3765 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleRegisterVariable3786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisterVariable3803 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRegisterVariable3820 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRegisterVariable3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompileContextVariable_in_entryRuleCompileContextVariable3877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompileContextVariable3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompileContextVariable3933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompileContextVariable3950 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCompileContextVariable3968 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleCompileContextVariable3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_entryRuleOperationStep4027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationStep4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_ruleOperationStep4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleOperationStep4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperationStep4139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperationStep4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLabel4270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel4287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLabel4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord4340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionWord4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInstructionWord4387 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleWordSection_in_ruleInstructionWord4408 = new BitSet(new long[]{0x00000800000000F0L});
    public static final BitSet FOLLOW_43_in_ruleInstructionWord4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordSection_in_entryRuleWordSection4457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordSection4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleWordSection4515 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleWordSection4542 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWordSection4554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection4571 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleWordSection4589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleLiteralValue4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleVariable4795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariableReference4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall4945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperationCall5003 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleOperationCall5015 = new BitSet(new long[]{0x0A003000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5037 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationCall5050 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall5071 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_ruleOperationCall5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter5123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallParameter5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperationCallParameter5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation5213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation5274 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleOperation5291 = new BitSet(new long[]{0xC000203140000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation5313 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation5326 = new BitSet(new long[]{0xC000003140000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation5347 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_ruleOperation5363 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOperation5375 = new BitSet(new long[]{0xDA001611408000F0L,0x000000000F000001L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleOperation5396 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperation5408 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleOperation5421 = new BitSet(new long[]{0xCA001011400000F0L,0x000000000F000001L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperation5443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperation5470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperation5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock5521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationBlock5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_ruleOperationBlock5586 = new BitSet(new long[]{0xDA001611400000F2L,0x000000000F000001L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable5623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterVariable5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterKind_in_ruleParameterVariable5679 = new BitSet(new long[]{0xC000001140000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleVarType_in_ruleParameterVariable5701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterVariable5718 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterVariable5736 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleParameterVariable5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition5795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperatorDefinition5842 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_ruleOperationRole_in_ruleOperatorDefinition5863 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOperatorDefinition5875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition5898 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleOperatorDefinition5911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition5934 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleOperatorDefinition5949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperatorDefinition5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBinary6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLinkedBinary6046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedBinary6063 = new BitSet(new long[]{0x0000000000200000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleBinaryType_in_ruleLinkedBinary6089 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLinkedBinary6102 = new BitSet(new long[]{0x0184000000800000L});
    public static final BitSet FOLLOW_ruleBinarySection_in_ruleLinkedBinary6123 = new BitSet(new long[]{0x0184000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkedBinary6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_entryRuleBinarySection6172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinarySection6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection6230 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_ruleBinarySection6257 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection6284 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleBinarySection6296 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinarySection6317 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBinarySection6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection6365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBinarySection6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFunctionBinarySection6412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection6435 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFunctionBinarySection6447 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionBinarySection6459 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionBinarySection6471 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection6492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection6504 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection6526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection6538 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFunctionBinarySection6552 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionBinarySection6564 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_52_in_ruleFunctionBinarySection6578 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleFunctionBinarySection6599 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection6611 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_ruleLinkedInstance_in_ruleFunctionBinarySection6640 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionBinarySection6652 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceLink_in_ruleFunctionBinarySection6675 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInstanceConfig_in_ruleFunctionBinarySection6702 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection6715 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection6729 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedInstance_in_entryRuleLinkedInstance6780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedInstance6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLinkedInstance6838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedInstance6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceLink_in_entryRuleReferenceLink6896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceLink6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceLink6951 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleReferenceLink6963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceLink6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceConfig_in_entryRuleInstanceConfig7019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceConfig7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceConfig7074 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInstanceConfig7086 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleInstanceConfig7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory7143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionMemory7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFunctionMemory7190 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory7211 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleFunctionMemory7223 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection7280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantBinarySection7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleConstantBinarySection7327 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstantBinarySection7339 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantBinarySection7361 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstantBinarySection7373 = new BitSet(new long[]{0x0A001000008000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_23_in_ruleConstantBinarySection7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection7423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceBinarySection7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReferenceBinarySection7470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression7529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression6_in_ruleXExpression7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression7873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSizeOfExpression7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSizeOfExpression7920 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSizeOfExpression7932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXSizeOfExpression7955 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSizeOfExpression7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression8003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStructExpression8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXStructExpression8061 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXStructExpression8073 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression8094 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleXStructExpression8107 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression8128 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleXStructExpression8143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXStructExpression8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_entryRuleXExpression18193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression18203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression18249 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression0_in_ruleXExpression18271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression0_in_entryRuleXExpression08307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression08317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_ruleXExpression08363 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXExpression08376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXExpression08397 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionM1_in_entryRuleXExpressionM18435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionM18445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXExpressionM18491 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXExpressionM18504 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionM18525 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXExpressionM18537 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_entryRuleXExpression28575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression28585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_ruleXExpression28631 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression28663 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression28684 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_entryRuleXExpression38722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression38732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression38778 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression38810 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression38831 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_entryRuleXExpression48869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression48879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression48925 = new BitSet(new long[]{0x00000C0000000002L,0x0000000F00000000L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression48957 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression48978 = new BitSet(new long[]{0x00000C0000000002L,0x0000000F00000000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_entryRuleXExpression59016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression59026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression59072 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression59104 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression59125 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_ruleXExpression6_in_entryRuleXExpression69163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression69173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXExpression69230 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXExpression69246 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_ruleXExpression69268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral9304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionLiteral9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression9394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTopLevelExpression9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTopLevelExpression9452 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXTopLevelExpression9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign9528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpSingleAssign9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression9615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIsLiteralExpression9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIsLiteralExpression9662 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIsLiteralExpression9674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression9695 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIsLiteralExpression9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression9743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression9790 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression9802 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression9823 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression9835 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression9847 = new BitSet(new long[]{0xDA001611408000F0L,0x000000000F000001L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression9868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression9880 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXIfExpression9901 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression9914 = new BitSet(new long[]{0xDA001611408000F0L,0x000000000F000001L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression9935 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression9985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression10032 = new BitSet(new long[]{0x0A001000000000F0L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression10053 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePrimitiveKind10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimitiveKind10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveKind10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleParameterKind10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleParameterKind10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleParameterKind10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperationRole10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperationRole10290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationRole10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationRole10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperationRole10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperationRole10358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperationRole10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperationRole10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperationRole10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperationRole10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperationRole10443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperationRole10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperationRole10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperationRole10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperationRole10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperationRole10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperationRole10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperationRole10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperationRole10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperationRole10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinaryType10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBinaryType10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUNARY_OPERATOR10703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUNARY_OPERATOR10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUNARY_OPERATOR10737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUNARY_OPERATOR10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleMULTIPLICATIVE_OPERATOR10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleMULTIPLICATIVE_OPERATOR10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleMULTIPLICATIVE_OPERATOR10833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleADDITIVE_OPERATOR10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleADDITIVE_OPERATOR10895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleEQUALITY_OPERATOR10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleEQUALITY_OPERATOR10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleEQUALITY_OPERATOR10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleEQUALITY_OPERATOR10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEQUALITY_OPERATOR11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEQUALITY_OPERATOR11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleBOOLEAN_OPERATOR11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBOOLEAN_OPERATOR11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred5_InternalESyntax9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred6_InternalESyntax9893 = new BitSet(new long[]{0x0000000000000002L});

}