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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_BINARY", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "';'", "'import'", "'.'", "'type'", "'='", "'bits'", "'['", "']'", "'struct'", "'{'", "','", "'}'", "'const'", "'reg'", "':'", "'compilecontext'", "'label'", "'<'", "'>'", "'@'", "'('", "')'", "'returns'", "'operator'", "'binary'", "'at'", "'link'", "'memwidth'", "'mem'", "'..'", "'data'", "'include'", "'sizeof'", "'addr'", "'isliteral'", "'if'", "'else'", "'unsigned'", "'signed'", "'real'", "'default'", "'var'", "'SET'", "'ADD'", "'SUBTRACT'", "'AND'", "'OR'", "'XOR'", "'EQUALS'", "'BRANCH'", "'UC_GOTO'", "'NOT'", "'INDIRECTION'", "'CLEAR'", "'INCREMENT'", "'DECREMENT'", "'DIV'", "'MOD'", "'LT'", "'LTE'", "'GT'", "'GTE'", "'hexfile'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'"
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
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__84=84;
    public static final int RULE_HEXINT=6;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
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
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:77:1: rulePackage returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleTopLevelItem ) )* ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:80:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleTopLevelItem ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleTopLevelItem ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleTopLevelItem ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:81:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_items_6_0= ruleTopLevelItem ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getNamespaceKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:87:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage143);
            lv_name_1_0=ruleQualifiedName();

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
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackage155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:107:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:107:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePackage168); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:111:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:112:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:112:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:113:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getUsesPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage191);
            	    ruleQualifiedName();

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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:130:3: ( (lv_items_6_0= ruleTopLevelItem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17||(LA2_0>=26 && LA2_0<=27)||LA2_0==29||(LA2_0>=37 && LA2_0<=38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (lv_items_6_0= ruleTopLevelItem )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:131:1: (lv_items_6_0= ruleTopLevelItem )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:132:3: lv_items_6_0= ruleTopLevelItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getItemsTopLevelItemParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTopLevelItem_in_rulePackage226);
            	    lv_items_6_0=ruleTopLevelItem();

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
            	              		"TopLevelItem");
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


    // $ANTLR start "entryRuleTopLevelItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:156:1: entryRuleTopLevelItem returns [EObject current=null] : iv_ruleTopLevelItem= ruleTopLevelItem EOF ;
    public final EObject entryRuleTopLevelItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelItem = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:157:2: (iv_ruleTopLevelItem= ruleTopLevelItem EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:158:2: iv_ruleTopLevelItem= ruleTopLevelItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelItemRule()); 
            }
            pushFollow(FOLLOW_ruleTopLevelItem_in_entryRuleTopLevelItem263);
            iv_ruleTopLevelItem=ruleTopLevelItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelItem273); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelItem"


    // $ANTLR start "ruleTopLevelItem"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:165:1: ruleTopLevelItem returns [EObject current=null] : (this_Type_0= ruleType | this_Operation_1= ruleOperation | this_LinkedBinary_2= ruleLinkedBinary | (this_Variable_3= ruleVariable otherlv_4= ';' ) | (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' ) | (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' ) | (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' ) | this_OperatorDefinition_11= ruleOperatorDefinition ) ;
    public final EObject ruleTopLevelItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_Type_0 = null;

        EObject this_Operation_1 = null;

        EObject this_LinkedBinary_2 = null;

        EObject this_Variable_3 = null;

        EObject this_ConstantVariable_5 = null;

        EObject this_RegisterVariable_7 = null;

        EObject this_CompileContextVariable_9 = null;

        EObject this_OperatorDefinition_11 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:168:28: ( (this_Type_0= ruleType | this_Operation_1= ruleOperation | this_LinkedBinary_2= ruleLinkedBinary | (this_Variable_3= ruleVariable otherlv_4= ';' ) | (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' ) | (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' ) | (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' ) | this_OperatorDefinition_11= ruleOperatorDefinition ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:169:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | this_LinkedBinary_2= ruleLinkedBinary | (this_Variable_3= ruleVariable otherlv_4= ';' ) | (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' ) | (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' ) | (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' ) | this_OperatorDefinition_11= ruleOperatorDefinition )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:169:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | this_LinkedBinary_2= ruleLinkedBinary | (this_Variable_3= ruleVariable otherlv_4= ';' ) | (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' ) | (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' ) | (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' ) | this_OperatorDefinition_11= ruleOperatorDefinition )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:170:5: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTopLevelItem320);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:180:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleTopLevelItem347);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:190:5: this_LinkedBinary_2= ruleLinkedBinary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getLinkedBinaryParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLinkedBinary_in_ruleTopLevelItem374);
                    this_LinkedBinary_2=ruleLinkedBinary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LinkedBinary_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:199:6: (this_Variable_3= ruleVariable otherlv_4= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:199:6: (this_Variable_3= ruleVariable otherlv_4= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:200:5: this_Variable_3= ruleVariable otherlv_4= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getVariableParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTopLevelItem402);
                    this_Variable_3=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTopLevelItem413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTopLevelItemAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:6: (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:213:6: (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:214:5: this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getConstantVariableParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantVariable_in_ruleTopLevelItem443);
                    this_ConstantVariable_5=ruleConstantVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantVariable_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTopLevelItem454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTopLevelItemAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:227:6: (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:227:6: (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:228:5: this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getRegisterVariableParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegisterVariable_in_ruleTopLevelItem484);
                    this_RegisterVariable_7=ruleRegisterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegisterVariable_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTopLevelItem495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTopLevelItemAccess().getSemicolonKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:241:6: (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:241:6: (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:242:5: this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getCompileContextVariableParserRuleCall_6_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompileContextVariable_in_ruleTopLevelItem525);
                    this_CompileContextVariable_9=ruleCompileContextVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompileContextVariable_9; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleTopLevelItem536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTopLevelItemAccess().getSemicolonKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:256:5: this_OperatorDefinition_11= ruleOperatorDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelItemAccess().getOperatorDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorDefinition_in_ruleTopLevelItem565);
                    this_OperatorDefinition_11=ruleOperatorDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperatorDefinition_11; 
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
    // $ANTLR end "ruleTopLevelItem"


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:272:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:273:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:274:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName612); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:281:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:284:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:285:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:285:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:285:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:292:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:293:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName671); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLITERAL"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:313:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:314:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:315:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERALRule()); 
            }
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL734);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL745); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:322:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_HEXINT_1=null;
        Token this_BINARY_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:325:28: ( (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:326:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:326:1: (this_INT_0= RULE_INT | this_HEXINT_1= RULE_HEXINT | this_BINARY_2= RULE_BINARY )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_HEXINT:
                {
                alt5=2;
                }
                break;
            case RULE_BINARY:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:326:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLITERAL785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:334:10: this_HEXINT_1= RULE_HEXINT
                    {
                    this_HEXINT_1=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLITERAL811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_1, grammarAccess.getLITERALAccess().getHEXINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:342:10: this_BINARY_2= RULE_BINARY
                    {
                    this_BINARY_2=(Token)match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleLITERAL837); if (state.failed) return current;
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


    // $ANTLR start "entryRuleType"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:357:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:358:2: (iv_ruleType= ruleType EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:359:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType882);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType892); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:366:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_def_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:369:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:370:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:370:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:370:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_def_3_0= ruleTypeDef ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleType929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:374:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:375:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:375:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:376:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType946); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleType963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:396:1: ( (lv_def_3_0= ruleTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:397:1: (lv_def_3_0= ruleTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:397:1: (lv_def_3_0= ruleTypeDef )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:398:3: lv_def_3_0= ruleTypeDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeDef_in_ruleType984);
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


    // $ANTLR start "entryRuleTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:422:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:423:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:424:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef1020);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef1030); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:431:1: ruleTypeDef returns [EObject current=null] : (this_DataTypeDef_0= ruleDataTypeDef | this_ArrayTypeDef_1= ruleArrayTypeDef | this_StructTypeDef_2= ruleStructTypeDef ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDef_0 = null;

        EObject this_ArrayTypeDef_1 = null;

        EObject this_StructTypeDef_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:434:28: ( (this_DataTypeDef_0= ruleDataTypeDef | this_ArrayTypeDef_1= ruleArrayTypeDef | this_StructTypeDef_2= ruleStructTypeDef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:435:1: (this_DataTypeDef_0= ruleDataTypeDef | this_ArrayTypeDef_1= ruleArrayTypeDef | this_StructTypeDef_2= ruleStructTypeDef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:435:1: (this_DataTypeDef_0= ruleDataTypeDef | this_ArrayTypeDef_1= ruleArrayTypeDef | this_StructTypeDef_2= ruleStructTypeDef )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 53:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 22:
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:436:5: this_DataTypeDef_0= ruleDataTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getDataTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDef_in_ruleTypeDef1077);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:446:5: this_ArrayTypeDef_1= ruleArrayTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getArrayTypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDef_in_ruleTypeDef1104);
                    this_ArrayTypeDef_1=ruleArrayTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayTypeDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:456:5: this_StructTypeDef_2= ruleStructTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getStructTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructTypeDef_in_ruleTypeDef1131);
                    this_StructTypeDef_2=ruleStructTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructTypeDef_2; 
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


    // $ANTLR start "entryRuleDataTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:472:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:473:2: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:474:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef1166);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDef1176); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:481:1: ruleDataTypeDef returns [EObject current=null] : ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' ) ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_bits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:484:28: ( ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:1: ( ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:2: ( (lv_kind_0_0= rulePrimitiveKind ) ) ( (lv_bits_1_0= RULE_INT ) ) otherlv_2= 'bits' otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:485:2: ( (lv_kind_0_0= rulePrimitiveKind ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:486:1: (lv_kind_0_0= rulePrimitiveKind )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:486:1: (lv_kind_0_0= rulePrimitiveKind )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:487:3: lv_kind_0_0= rulePrimitiveKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeDefAccess().getKindPrimitiveKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef1222);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:503:2: ( (lv_bits_1_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:504:1: (lv_bits_1_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:504:1: (lv_bits_1_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:505:3: lv_bits_1_0= RULE_INT
            {
            lv_bits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataTypeDef1239); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDataTypeDef1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefAccess().getBitsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataTypeDef1268); if (state.failed) return current;
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


    // $ANTLR start "entryRuleArrayTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:537:1: entryRuleArrayTypeDef returns [EObject current=null] : iv_ruleArrayTypeDef= ruleArrayTypeDef EOF ;
    public final EObject entryRuleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:538:2: (iv_ruleArrayTypeDef= ruleArrayTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:539:2: iv_ruleArrayTypeDef= ruleArrayTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef1304);
            iv_ruleArrayTypeDef=ruleArrayTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDef1314); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:546:1: ruleArrayTypeDef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '[' ( (lv_length_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= ';' ) ;
    public final EObject ruleArrayTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:549:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '[' ( (lv_length_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:550:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '[' ( (lv_length_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:550:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '[' ( (lv_length_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:550:2: ( ( ruleQualifiedName ) ) otherlv_1= '[' ( (lv_length_2_0= ruleXExpression ) ) otherlv_3= ']' otherlv_4= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:550:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:551:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:551:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:552:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getArrayTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArrayTypeDef1362);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleArrayTypeDef1374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayTypeDefAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:569:1: ( (lv_length_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: (lv_length_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:570:1: (lv_length_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:571:3: lv_length_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefAccess().getLengthXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleArrayTypeDef1395);
            lv_length_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"length",
                      		lv_length_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleArrayTypeDef1407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayTypeDefAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleArrayTypeDef1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefAccess().getSemicolonKeyword_4());
                  
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


    // $ANTLR start "entryRuleStructTypeDef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:603:1: entryRuleStructTypeDef returns [EObject current=null] : iv_ruleStructTypeDef= ruleStructTypeDef EOF ;
    public final EObject entryRuleStructTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:604:2: (iv_ruleStructTypeDef= ruleStructTypeDef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:605:2: iv_ruleStructTypeDef= ruleStructTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef1455);
            iv_ruleStructTypeDef=ruleStructTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDef1465); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:612:1: ruleStructTypeDef returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:615:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_members_3_0= ruleStructTypeDefMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )* otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:616:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:617:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructTypeDefAccess().getStructTypeDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStructTypeDef1511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStructTypeDefAccess().getStructKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleStructTypeDef1523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:630:1: ( (lv_members_3_0= ruleStructTypeDefMember ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:631:1: (lv_members_3_0= ruleStructTypeDefMember )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:631:1: (lv_members_3_0= ruleStructTypeDefMember )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:632:3: lv_members_3_0= ruleStructTypeDefMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef1544);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:648:2: (otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:648:4: otherlv_4= ',' ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleStructTypeDef1557); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStructTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:652:1: ( (lv_members_5_0= ruleStructTypeDefMember ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:653:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:653:1: (lv_members_5_0= ruleStructTypeDefMember )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:654:3: lv_members_5_0= ruleStructTypeDefMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructTypeDefAccess().getMembersStructTypeDefMemberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef1578);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleStructTypeDef1592); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:682:1: entryRuleStructTypeDefMember returns [EObject current=null] : iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF ;
    public final EObject entryRuleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructTypeDefMember = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:683:2: (iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:684:2: iv_ruleStructTypeDefMember= ruleStructTypeDefMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeDefMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember1628);
            iv_ruleStructTypeDefMember=ruleStructTypeDefMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructTypeDefMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructTypeDefMember1638); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:691:1: ruleStructTypeDefMember returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructTypeDefMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:694:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:695:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:695:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:695:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:695:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:696:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:696:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:697:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStructTypeDefMemberRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStructTypeDefMember1686);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:710:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:711:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:711:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:712:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructTypeDefMember1703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStructTypeDefMemberAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStructTypeDefMemberRule());
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
    // $ANTLR end "ruleStructTypeDefMember"


    // $ANTLR start "entryRuleConstantVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:736:1: entryRuleConstantVariable returns [EObject current=null] : iv_ruleConstantVariable= ruleConstantVariable EOF ;
    public final EObject entryRuleConstantVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:737:2: (iv_ruleConstantVariable= ruleConstantVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:738:2: iv_ruleConstantVariable= ruleConstantVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantVariableRule()); 
            }
            pushFollow(FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable1744);
            iv_ruleConstantVariable=ruleConstantVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantVariable1754); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:745:1: ruleConstantVariable returns [EObject current=null] : ( () otherlv_1= 'const' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleConstantVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:748:28: ( ( () otherlv_1= 'const' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:749:1: ( () otherlv_1= 'const' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:749:1: ( () otherlv_1= 'const' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:749:2: () otherlv_1= 'const' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleXExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:749:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:750:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantVariableAccess().getConstantVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleConstantVariable1800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantVariableAccess().getConstKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:759:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:760:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:760:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:761:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantVariableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConstantVariable1823);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:774:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:775:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:776:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantVariable1840); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleConstantVariable1857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantVariableAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:796:1: ( (lv_value_5_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:797:1: (lv_value_5_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:797:1: (lv_value_5_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:798:3: lv_value_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleConstantVariable1878);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:822:1: entryRuleRegisterVariable returns [EObject current=null] : iv_ruleRegisterVariable= ruleRegisterVariable EOF ;
    public final EObject entryRuleRegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:823:2: (iv_ruleRegisterVariable= ruleRegisterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:824:2: iv_ruleRegisterVariable= ruleRegisterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable1914);
            iv_ruleRegisterVariable=ruleRegisterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterVariable1924); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:831:1: ruleRegisterVariable returns [EObject current=null] : ( () otherlv_1= 'reg' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleLITERAL ) ) ) ;
    public final EObject ruleRegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_addr_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:834:28: ( ( () otherlv_1= 'reg' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleLITERAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:1: ( () otherlv_1= 'reg' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleLITERAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:1: ( () otherlv_1= 'reg' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:2: () otherlv_1= 'reg' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_addr_5_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:835:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:836:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegisterVariableAccess().getRegisterVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleRegisterVariable1970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRegisterVariableAccess().getRegKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:845:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:846:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:846:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:847:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisterVariableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRegisterVariable1993);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:860:2: ( (lv_name_3_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:861:1: (lv_name_3_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:861:1: (lv_name_3_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:862:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisterVariable2010); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleRegisterVariable2027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegisterVariableAccess().getColonKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:882:1: ( (lv_addr_5_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:883:1: (lv_addr_5_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:883:1: (lv_addr_5_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:884:3: lv_addr_5_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegisterVariableAccess().getAddrLITERALParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleRegisterVariable2048);
            lv_addr_5_0=ruleLITERAL();

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
    // $ANTLR end "ruleRegisterVariable"


    // $ANTLR start "entryRuleCompileContextVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:908:1: entryRuleCompileContextVariable returns [EObject current=null] : iv_ruleCompileContextVariable= ruleCompileContextVariable EOF ;
    public final EObject entryRuleCompileContextVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompileContextVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:909:2: (iv_ruleCompileContextVariable= ruleCompileContextVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:910:2: iv_ruleCompileContextVariable= ruleCompileContextVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompileContextVariableRule()); 
            }
            pushFollow(FOLLOW_ruleCompileContextVariable_in_entryRuleCompileContextVariable2084);
            iv_ruleCompileContextVariable=ruleCompileContextVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompileContextVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompileContextVariable2094); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:917:1: ruleCompileContextVariable returns [EObject current=null] : ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleCompileContextVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:920:28: ( ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:921:1: ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:921:1: ( () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:921:2: () otherlv_1= 'compilecontext' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:921:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompileContextVariableAccess().getCompileContextVariableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCompileContextVariable2140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompileContextVariableAccess().getCompilecontextKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:931:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:932:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:932:1: (lv_name_2_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:933:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompileContextVariable2157); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:949:2: (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:949:4: otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCompileContextVariable2175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompileContextVariableAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:953:1: ( (lv_value_4_0= ruleXExpression ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:954:1: (lv_value_4_0= ruleXExpression )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:954:1: (lv_value_4_0= ruleXExpression )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:955:3: lv_value_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompileContextVariableAccess().getValueXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleCompileContextVariable2196);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:979:1: entryRuleOperationStep returns [EObject current=null] : iv_ruleOperationStep= ruleOperationStep EOF ;
    public final EObject entryRuleOperationStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStep = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:980:2: (iv_ruleOperationStep= ruleOperationStep EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:981:2: iv_ruleOperationStep= ruleOperationStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationStepRule()); 
            }
            pushFollow(FOLLOW_ruleOperationStep_in_entryRuleOperationStep2234);
            iv_ruleOperationStep=ruleOperationStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationStep2244); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:988:1: ruleOperationStep returns [EObject current=null] : (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_OperationCall_4= ruleOperationCall otherlv_5= ';' ) | this_XTopLevelExpression_6= ruleXTopLevelExpression ) ;
    public final EObject ruleOperationStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_InstructionWord_0 = null;

        EObject this_Label_1 = null;

        EObject this_Variable_2 = null;

        EObject this_OperationCall_4 = null;

        EObject this_XTopLevelExpression_6 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:991:28: ( (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_OperationCall_4= ruleOperationCall otherlv_5= ';' ) | this_XTopLevelExpression_6= ruleXTopLevelExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:992:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_OperationCall_4= ruleOperationCall otherlv_5= ';' ) | this_XTopLevelExpression_6= ruleXTopLevelExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:992:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_OperationCall_4= ruleOperationCall otherlv_5= ';' ) | this_XTopLevelExpression_6= ruleXTopLevelExpression )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:993:5: this_InstructionWord_0= ruleInstructionWord
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getInstructionWordParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstructionWord_in_ruleOperationStep2291);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1003:5: this_Label_1= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getLabelParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleOperationStep2318);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1012:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1012:6: (this_Variable_2= ruleVariable otherlv_3= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1013:5: this_Variable_2= ruleVariable otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getVariableParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperationStep2346);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleOperationStep2357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationStepAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1026:6: (this_OperationCall_4= ruleOperationCall otherlv_5= ';' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1026:6: (this_OperationCall_4= ruleOperationCall otherlv_5= ';' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1027:5: this_OperationCall_4= ruleOperationCall otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getOperationCallParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleOperationStep2387);
                    this_OperationCall_4=ruleOperationCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleOperationStep2398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOperationStepAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1041:5: this_XTopLevelExpression_6= ruleXTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationStepAccess().getXTopLevelExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep2427);
                    this_XTopLevelExpression_6=ruleXTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTopLevelExpression_6; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1057:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1058:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1059:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2462);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2472); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1066:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1069:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1070:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1070:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1070:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleLabel2509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1074:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1075:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1076:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleLabel2543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getSemicolonKeyword_2());
                  
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1104:1: entryRuleInstructionWord returns [EObject current=null] : iv_ruleInstructionWord= ruleInstructionWord EOF ;
    public final EObject entryRuleInstructionWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWord = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1105:2: (iv_ruleInstructionWord= ruleInstructionWord EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1106:2: iv_ruleInstructionWord= ruleInstructionWord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionWordRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord2579);
            iv_ruleInstructionWord=ruleInstructionWord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionWord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionWord2589); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1113:1: ruleInstructionWord returns [EObject current=null] : (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) ;
    public final EObject ruleInstructionWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1116:28: ( (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1117:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1117:1: (otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1117:3: otherlv_0= '<' ( (lv_sections_1_0= ruleWordSection ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInstructionWord2626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionWordAccess().getLessThanSignKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1121:1: ( (lv_sections_1_0= ruleWordSection ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_BINARY)||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1122:1: (lv_sections_1_0= ruleWordSection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1122:1: (lv_sections_1_0= ruleWordSection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1123:3: lv_sections_1_0= ruleWordSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionWordAccess().getSectionsWordSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleWordSection_in_ruleInstructionWord2647);
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
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleInstructionWord2660); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1151:1: entryRuleWordSection returns [EObject current=null] : iv_ruleWordSection= ruleWordSection EOF ;
    public final EObject entryRuleWordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordSection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1152:2: (iv_ruleWordSection= ruleWordSection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1153:2: iv_ruleWordSection= ruleWordSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWordSectionRule()); 
            }
            pushFollow(FOLLOW_ruleWordSection_in_entryRuleWordSection2696);
            iv_ruleWordSection=ruleWordSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWordSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordSection2706); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1160:1: ruleWordSection returns [EObject current=null] : ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference ) otherlv_3= ':' ( (lv_size_4_0= RULE_INT ) ) (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleWordSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_size_4_0=null;
        Token otherlv_5=null;
        Token lv_shift_6_0=null;
        EObject this_LiteralValue_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_LabelReference_2 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1163:28: ( ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference ) otherlv_3= ':' ( (lv_size_4_0= RULE_INT ) ) (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1164:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference ) otherlv_3= ':' ( (lv_size_4_0= RULE_INT ) ) (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1164:1: ( (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference ) otherlv_3= ':' ( (lv_size_4_0= RULE_INT ) ) (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1164:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference ) otherlv_3= ':' ( (lv_size_4_0= RULE_INT ) ) (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1164:2: (this_LiteralValue_0= ruleLiteralValue | this_VariableReference_1= ruleVariableReference | this_LabelReference_2= ruleLabelReference )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEXINT:
            case RULE_BINARY:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1165:5: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getLiteralValueParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleWordSection2754);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1175:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getVariableReferenceParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleWordSection2781);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1185:5: this_LabelReference_2= ruleLabelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWordSectionAccess().getLabelReferenceParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelReference_in_ruleWordSection2808);
                    this_LabelReference_2=ruleLabelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelReference_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleWordSection2820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWordSectionAccess().getColonKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1197:1: ( (lv_size_4_0= RULE_INT ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1198:1: (lv_size_4_0= RULE_INT )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1198:1: (lv_size_4_0= RULE_INT )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1199:3: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection2837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_size_4_0, grammarAccess.getWordSectionAccess().getSizeINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWordSectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"size",
                      		lv_size_4_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1215:2: (otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1215:4: otherlv_5= ':' ( (lv_shift_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleWordSection2855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getWordSectionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1219:1: ( (lv_shift_6_0= RULE_INT ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1220:1: (lv_shift_6_0= RULE_INT )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1220:1: (lv_shift_6_0= RULE_INT )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1221:3: lv_shift_6_0= RULE_INT
                    {
                    lv_shift_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWordSection2872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_shift_6_0, grammarAccess.getWordSectionAccess().getShiftINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWordSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"shift",
                              		lv_shift_6_0, 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1245:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1246:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1247:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue2915);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue2925); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1254:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1257:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1258:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1258:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1259:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1259:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1260:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralValueAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleLiteralValue2970);
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


    // $ANTLR start "entryRuleLabelReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1284:1: entryRuleLabelReference returns [EObject current=null] : iv_ruleLabelReference= ruleLabelReference EOF ;
    public final EObject entryRuleLabelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1285:2: (iv_ruleLabelReference= ruleLabelReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1286:2: iv_ruleLabelReference= ruleLabelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleLabelReference_in_entryRuleLabelReference3005);
            iv_ruleLabelReference=ruleLabelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelReference3015); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelReference"


    // $ANTLR start "ruleLabelReference"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1293:1: ruleLabelReference returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleLabelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1296:28: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1297:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1297:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1297:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLabelReference3052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelReferenceAccess().getCommercialAtKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1301:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1302:1: (otherlv_1= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1302:1: (otherlv_1= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1303:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelReference3072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getLabelReferenceAccess().getLabelLabelCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleLabelReference"


    // $ANTLR start "entryRuleVariable"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1322:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1323:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1324:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3108);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3118); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1331:1: ruleVariable returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1334:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1335:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1335:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1335:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1335:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1336:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1336:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1337:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariable3166);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1350:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1351:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1351:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3183); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1376:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1377:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1378:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference3224);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference3234); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1385:1: ruleVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_ref_1_0= ruleVariableRefSection ) )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1388:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_ref_1_0= ruleVariableRefSection ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_ref_1_0= ruleVariableRefSection ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_ref_1_0= ruleVariableRefSection ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:2: ( (otherlv_0= RULE_ID ) ) ( (lv_ref_1_0= ruleVariableRefSection ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1389:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1390:1: (otherlv_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1390:1: (otherlv_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1391:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference3279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVarVariableCrossReference_0_0()); 
              	
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1402:2: ( (lv_ref_1_0= ruleVariableRefSection ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16||LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1403:1: (lv_ref_1_0= ruleVariableRefSection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1403:1: (lv_ref_1_0= ruleVariableRefSection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1404:3: lv_ref_1_0= ruleVariableRefSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getRefVariableRefSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableRefSection_in_ruleVariableReference3300);
            	    lv_ref_1_0=ruleVariableRefSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ref",
            	              		lv_ref_1_0, 
            	              		"VariableRefSection");
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleVariableRefSection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1428:1: entryRuleVariableRefSection returns [EObject current=null] : iv_ruleVariableRefSection= ruleVariableRefSection EOF ;
    public final EObject entryRuleVariableRefSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRefSection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1429:2: (iv_ruleVariableRefSection= ruleVariableRefSection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1430:2: iv_ruleVariableRefSection= ruleVariableRefSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRefSectionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableRefSection_in_entryRuleVariableRefSection3337);
            iv_ruleVariableRefSection=ruleVariableRefSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableRefSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableRefSection3347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableRefSection"


    // $ANTLR start "ruleVariableRefSection"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1437:1: ruleVariableRefSection returns [EObject current=null] : (this_ArrayRef_0= ruleArrayRef | this_StructRef_1= ruleStructRef ) ;
    public final EObject ruleVariableRefSection() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayRef_0 = null;

        EObject this_StructRef_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1440:28: ( (this_ArrayRef_0= ruleArrayRef | this_StructRef_1= ruleStructRef ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1441:1: (this_ArrayRef_0= ruleArrayRef | this_StructRef_1= ruleStructRef )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1441:1: (this_ArrayRef_0= ruleArrayRef | this_StructRef_1= ruleStructRef )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1442:5: this_ArrayRef_0= ruleArrayRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableRefSectionAccess().getArrayRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayRef_in_ruleVariableRefSection3394);
                    this_ArrayRef_0=ruleArrayRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1452:5: this_StructRef_1= ruleStructRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableRefSectionAccess().getStructRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructRef_in_ruleVariableRefSection3421);
                    this_StructRef_1=ruleStructRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructRef_1; 
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
    // $ANTLR end "ruleVariableRefSection"


    // $ANTLR start "entryRuleArrayRef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1468:1: entryRuleArrayRef returns [EObject current=null] : iv_ruleArrayRef= ruleArrayRef EOF ;
    public final EObject entryRuleArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1469:2: (iv_ruleArrayRef= ruleArrayRef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1470:2: iv_ruleArrayRef= ruleArrayRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayRef_in_entryRuleArrayRef3456);
            iv_ruleArrayRef=ruleArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayRef3466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayRef"


    // $ANTLR start "ruleArrayRef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1477:1: ruleArrayRef returns [EObject current=null] : (otherlv_0= '[' ( (lv_v_1_0= ruleXExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_v_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1480:28: ( (otherlv_0= '[' ( (lv_v_1_0= ruleXExpression ) ) otherlv_2= ']' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1481:1: (otherlv_0= '[' ( (lv_v_1_0= ruleXExpression ) ) otherlv_2= ']' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1481:1: (otherlv_0= '[' ( (lv_v_1_0= ruleXExpression ) ) otherlv_2= ']' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1481:3: otherlv_0= '[' ( (lv_v_1_0= ruleXExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleArrayRef3503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayRefAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1485:1: ( (lv_v_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1486:1: (lv_v_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1486:1: (lv_v_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1487:3: lv_v_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRefAccess().getVXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleArrayRef3524);
            lv_v_1_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRefRule());
              	        }
                     		set(
                     			current, 
                     			"v",
                      		lv_v_1_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleArrayRef3536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getArrayRefAccess().getRightSquareBracketKeyword_2());
                  
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
    // $ANTLR end "ruleArrayRef"


    // $ANTLR start "entryRuleStructRef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1515:1: entryRuleStructRef returns [EObject current=null] : iv_ruleStructRef= ruleStructRef EOF ;
    public final EObject entryRuleStructRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructRef = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1516:2: (iv_ruleStructRef= ruleStructRef EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1517:2: iv_ruleStructRef= ruleStructRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructRefRule()); 
            }
            pushFollow(FOLLOW_ruleStructRef_in_entryRuleStructRef3572);
            iv_ruleStructRef=ruleStructRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructRef3582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructRef"


    // $ANTLR start "ruleStructRef"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1524:1: ruleStructRef returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleStructRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1527:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1528:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1528:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1528:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStructRef3619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStructRefAccess().getFullStopKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1532:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1533:1: (otherlv_1= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1533:1: (otherlv_1= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1534:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStructRefRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructRef3639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getStructRefAccess().getRefStructTypeDefMemberCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleStructRef"


    // $ANTLR start "entryRuleOperationCall"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1553:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1554:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1555:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCall_in_entryRuleOperationCall3675);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCall3685); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1562:1: ruleOperationCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1565:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1566:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1566:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1566:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )? otherlv_5= ')'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1566:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1567:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1567:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1568:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperationCall3733);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleOperationCall3745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1585:1: ( ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_BINARY)||(LA16_0>=33 && LA16_0<=34)||(LA16_0>=46 && LA16_0<=48)||(LA16_0>=77 && LA16_0<=78)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1585:2: ( (lv_params_2_0= ruleOperationCallParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1585:2: ( (lv_params_2_0= ruleOperationCallParameter ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1586:1: (lv_params_2_0= ruleOperationCallParameter )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1586:1: (lv_params_2_0= ruleOperationCallParameter )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1587:3: lv_params_2_0= ruleOperationCallParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall3767);
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

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:2: (otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1603:4: otherlv_3= ',' ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleOperationCall3780); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1607:1: ( (lv_params_4_0= ruleOperationCallParameter ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1608:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1608:1: (lv_params_4_0= ruleOperationCallParameter )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1609:3: lv_params_4_0= ruleOperationCallParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParamsOperationCallParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationCallParameter_in_ruleOperationCall3801);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleOperationCall3817); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1637:1: entryRuleOperationCallParameter returns [EObject current=null] : iv_ruleOperationCallParameter= ruleOperationCallParameter EOF ;
    public final EObject entryRuleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallParameter = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1638:2: (iv_ruleOperationCallParameter= ruleOperationCallParameter EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1639:2: iv_ruleOperationCallParameter= ruleOperationCallParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter3853);
            iv_ruleOperationCallParameter=ruleOperationCallParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallParameter3863); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1646:1: ruleOperationCallParameter returns [EObject current=null] : (this_XExpression_0= ruleXExpression | this_LabelReference_1= ruleLabelReference ) ;
    public final EObject ruleOperationCallParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression_0 = null;

        EObject this_LabelReference_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1649:28: ( (this_XExpression_0= ruleXExpression | this_LabelReference_1= ruleLabelReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1650:1: (this_XExpression_0= ruleXExpression | this_LabelReference_1= ruleLabelReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1650:1: (this_XExpression_0= ruleXExpression | this_LabelReference_1= ruleLabelReference )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_BINARY)||LA17_0==34||(LA17_0>=46 && LA17_0<=48)||(LA17_0>=77 && LA17_0<=78)) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1651:5: this_XExpression_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationCallParameterAccess().getXExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleOperationCallParameter3910);
                    this_XExpression_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1661:5: this_LabelReference_1= ruleLabelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationCallParameterAccess().getLabelReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelReference_in_ruleOperationCallParameter3937);
                    this_LabelReference_1=ruleLabelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelReference_1; 
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
    // $ANTLR end "ruleOperationCallParameter"


    // $ANTLR start "entryRuleOperation"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1677:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1678:2: (iv_ruleOperation= ruleOperation EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1679:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation3972);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation3982); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1686:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_block_7_0= ruleOperationBlock ) ) otherlv_8= '}' (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_block_7_0 = null;

        EObject lv_return_10_0 = null;

        EObject lv_returnvar_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1689:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_block_7_0= ruleOperationBlock ) ) otherlv_8= '}' (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_block_7_0= ruleOperationBlock ) ) otherlv_8= '}' (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_block_7_0= ruleOperationBlock ) ) otherlv_8= '}' (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_block_7_0= ruleOperationBlock ) ) otherlv_8= '}' (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1690:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1691:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1691:1: (lv_name_0_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1692:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation4024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleOperation4041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1712:1: ( ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==26||(LA19_0>=54 && LA19_0<=55)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1712:2: ( (lv_params_2_0= ruleParameterVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )*
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1712:2: ( (lv_params_2_0= ruleParameterVariable ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1713:1: (lv_params_2_0= ruleParameterVariable )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1713:1: (lv_params_2_0= ruleParameterVariable )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1714:3: lv_params_2_0= ruleParameterVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4063);
                    lv_params_2_0=ruleParameterVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"ParameterVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1730:2: (otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1730:4: otherlv_3= ',' ( (lv_params_4_0= ruleParameterVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleOperation4076); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1734:1: ( (lv_params_4_0= ruleParameterVariable ) )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1735:1: (lv_params_4_0= ruleParameterVariable )
                    	    {
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1735:1: (lv_params_4_0= ruleParameterVariable )
                    	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1736:3: lv_params_4_0= ruleParameterVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterVariableParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterVariable_in_ruleOperation4097);
                    	    lv_params_4_0=ruleParameterVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
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

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleOperation4113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleOperation4125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1760:1: ( (lv_block_7_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1761:1: (lv_block_7_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1761:1: (lv_block_7_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1762:3: lv_block_7_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBlockOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleOperation4146);
            lv_block_7_0=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_7_0, 
                      		"OperationBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleOperation4158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1782:1: (otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1782:3: otherlv_9= 'returns' ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) ) otherlv_12= ';'
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleOperation4171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getReturnsKeyword_7_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1786:1: ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) )
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1786:2: ( (lv_return_10_0= ruleXExpression ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1786:2: ( (lv_return_10_0= ruleXExpression ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1787:1: (lv_return_10_0= ruleXExpression )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1787:1: (lv_return_10_0= ruleXExpression )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1788:3: lv_return_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnXExpressionParserRuleCall_7_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleOperation4193);
                            lv_return_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"return",
                                      		lv_return_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1805:6: ( (lv_returnvar_11_0= ruleVariable ) )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1805:6: ( (lv_returnvar_11_0= ruleVariable ) )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1806:1: (lv_returnvar_11_0= ruleVariable )
                            {
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1806:1: (lv_returnvar_11_0= ruleVariable )
                            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1807:3: lv_returnvar_11_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnvarVariableParserRuleCall_7_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleOperation4220);
                            lv_returnvar_11_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"returnvar",
                                      		lv_returnvar_11_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleOperation4233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getSemicolonKeyword_7_2());
                          
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1835:1: entryRuleOperationBlock returns [EObject current=null] : iv_ruleOperationBlock= ruleOperationBlock EOF ;
    public final EObject entryRuleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBlock = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1836:2: (iv_ruleOperationBlock= ruleOperationBlock EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1837:2: iv_ruleOperationBlock= ruleOperationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4271);
            iv_ruleOperationBlock=ruleOperationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationBlock4281); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1844:1: ruleOperationBlock returns [EObject current=null] : ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) ;
    public final EObject ruleOperationBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1847:28: ( ( () ( (lv_steps_1_0= ruleOperationStep ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1848:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1848:1: ( () ( (lv_steps_1_0= ruleOperationStep ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1848:2: () ( (lv_steps_1_0= ruleOperationStep ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1848:2: ()
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationBlockAccess().getOperationBlockAction_0(),
                          current);
                  
            }

            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1854:2: ( (lv_steps_1_0= ruleOperationStep ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=30 && LA22_0<=31)||LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1855:1: (lv_steps_1_0= ruleOperationStep )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1855:1: (lv_steps_1_0= ruleOperationStep )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1856:3: lv_steps_1_0= ruleOperationStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationBlockAccess().getStepsOperationStepParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationStep_in_ruleOperationBlock4336);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1880:1: entryRuleParameterVariable returns [EObject current=null] : iv_ruleParameterVariable= ruleParameterVariable EOF ;
    public final EObject entryRuleParameterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVariable = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1881:2: (iv_ruleParameterVariable= ruleParameterVariable EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1882:2: iv_ruleParameterVariable= ruleParameterVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVariableRule()); 
            }
            pushFollow(FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable4373);
            iv_ruleParameterVariable=ruleParameterVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterVariable4383); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1889:1: ruleParameterVariable returns [EObject current=null] : ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_var_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )? ) ;
    public final EObject ruleParameterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_var_1_0 = null;

        AntlrDatatypeRuleToken lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1892:28: ( ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_var_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1893:1: ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_var_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1893:1: ( ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_var_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1893:2: ( (lv_kind_0_0= ruleParameterKind ) )? ( (lv_var_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )?
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1893:2: ( (lv_kind_0_0= ruleParameterKind ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26||(LA23_0>=54 && LA23_0<=55)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1894:1: (lv_kind_0_0= ruleParameterKind )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1894:1: (lv_kind_0_0= ruleParameterKind )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1895:3: lv_kind_0_0= ruleParameterKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getKindParameterKindEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterKind_in_ruleParameterVariable4429);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1911:3: ( (lv_var_1_0= ruleVariable ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1912:1: (lv_var_1_0= ruleVariable )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1912:1: (lv_var_1_0= ruleVariable )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1913:3: lv_var_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterVariableAccess().getVarVariableParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleParameterVariable4451);
            lv_var_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1929:2: (otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1929:4: otherlv_2= '=' ( (lv_default_3_0= ruleLITERAL ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleParameterVariable4464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getParameterVariableAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1933:1: ( (lv_default_3_0= ruleLITERAL ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1934:1: (lv_default_3_0= ruleLITERAL )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1934:1: (lv_default_3_0= ruleLITERAL )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1935:3: lv_default_3_0= ruleLITERAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterVariableAccess().getDefaultLITERALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleParameterVariable4485);
                    lv_default_3_0=ruleLITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterVariableRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_3_0, 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1959:1: entryRuleOperatorDefinition returns [EObject current=null] : iv_ruleOperatorDefinition= ruleOperatorDefinition EOF ;
    public final EObject entryRuleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDefinition = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1960:2: (iv_ruleOperatorDefinition= ruleOperatorDefinition EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1961:2: iv_ruleOperatorDefinition= ruleOperatorDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition4523);
            iv_ruleOperatorDefinition=ruleOperatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition4533); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1968:1: ruleOperatorDefinition returns [EObject current=null] : (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1971:28: ( (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:1: (otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1972:3: otherlv_0= 'operator' ( (lv_role_1_0= ruleOperationRole ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleOperatorDefinition4570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperatorDefinitionAccess().getOperatorKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1976:1: ( (lv_role_1_0= ruleOperationRole ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1977:1: (lv_role_1_0= ruleOperationRole )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1977:1: (lv_role_1_0= ruleOperationRole )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1978:3: lv_role_1_0= ruleOperationRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getRoleOperationRoleEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationRole_in_ruleOperatorDefinition4591);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleOperatorDefinition4603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperatorDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1998:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1999:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:1999:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2000:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4626);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2013:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2013:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleOperatorDefinition4639); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2017:1: ( ( ruleQualifiedName ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2018:1: ( ruleQualifiedName )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2018:1: ( ruleQualifiedName )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2019:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOperatorDefinitionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getCandidateOperationCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4662);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2032:4: (otherlv_6= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2032:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperatorDefinition4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleOperatorDefinition4691); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2048:1: entryRuleLinkedBinary returns [EObject current=null] : iv_ruleLinkedBinary= ruleLinkedBinary EOF ;
    public final EObject entryRuleLinkedBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedBinary = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2049:2: (iv_ruleLinkedBinary= ruleLinkedBinary EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2050:2: iv_ruleLinkedBinary= ruleLinkedBinary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkedBinaryRule()); 
            }
            pushFollow(FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary4727);
            iv_ruleLinkedBinary=ruleLinkedBinary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkedBinary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedBinary4737); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2057:1: ruleLinkedBinary returns [EObject current=null] : (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2060:28: ( (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2061:1: (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2061:1: (otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2061:3: otherlv_0= 'binary' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleBinaryType ) )? otherlv_3= '{' ( (lv_sections_4_0= ruleBinarySection ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleLinkedBinary4774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkedBinaryAccess().getBinaryKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2065:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2066:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2066:1: (lv_name_1_0= RULE_ID )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2067:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedBinary4791); if (state.failed) return current;
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2083:2: ( (lv_type_2_0= ruleBinaryType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54||LA27_0==76) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2084:1: (lv_type_2_0= ruleBinaryType )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2084:1: (lv_type_2_0= ruleBinaryType )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2085:3: lv_type_2_0= ruleBinaryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getTypeBinaryTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBinaryType_in_ruleLinkedBinary4817);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleLinkedBinary4830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLinkedBinaryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2105:1: ( (lv_sections_4_0= ruleBinarySection ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40||(LA28_0>=44 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2106:1: (lv_sections_4_0= ruleBinarySection )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2106:1: (lv_sections_4_0= ruleBinarySection )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2107:3: lv_sections_4_0= ruleBinarySection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLinkedBinaryAccess().getSectionsBinarySectionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinarySection_in_ruleLinkedBinary4851);
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
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleLinkedBinary4864); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2135:1: entryRuleBinarySection returns [EObject current=null] : iv_ruleBinarySection= ruleBinarySection EOF ;
    public final EObject entryRuleBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2136:2: (iv_ruleBinarySection= ruleBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2137:2: iv_ruleBinarySection= ruleBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleBinarySection_in_entryRuleBinarySection4900);
            iv_ruleBinarySection=ruleBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinarySection4910); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2144:1: ruleBinarySection returns [EObject current=null] : ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2147:28: ( ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2148:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2148:1: ( (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2148:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection ) otherlv_3= 'at' ( (lv_start_4_0= ruleXExpression ) ) otherlv_5= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2148:2: (this_FunctionBinarySection_0= ruleFunctionBinarySection | this_ConstantBinarySection_1= ruleConstantBinarySection | this_ReferenceBinarySection_2= ruleReferenceBinarySection )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case 45:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2149:5: this_FunctionBinarySection_0= ruleFunctionBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getFunctionBinarySectionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection4958);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2159:5: this_ConstantBinarySection_1= ruleConstantBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getConstantBinarySectionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantBinarySection_in_ruleBinarySection4985);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2169:5: this_ReferenceBinarySection_2= ruleReferenceBinarySection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinarySectionAccess().getReferenceBinarySectionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5012);
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

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleBinarySection5024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBinarySectionAccess().getAtKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2181:1: ( (lv_start_4_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2182:1: (lv_start_4_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2182:1: (lv_start_4_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2183:3: lv_start_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinarySectionAccess().getStartXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleBinarySection5045);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBinarySection5057); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2211:1: entryRuleFunctionBinarySection returns [EObject current=null] : iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF ;
    public final EObject entryRuleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2212:2: (iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2213:2: iv_ruleFunctionBinarySection= ruleFunctionBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5093);
            iv_ruleFunctionBinarySection=ruleFunctionBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBinarySection5103); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2220:1: ruleFunctionBinarySection returns [EObject current=null] : (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= '}' ) ;
    public final EObject ruleFunctionBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_memwidth_5_0 = null;

        EObject lv_mems_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2223:28: ( (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2224:1: (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2224:1: (otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2224:3: otherlv_0= 'link' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'memwidth' otherlv_4= '=' ( (lv_memwidth_5_0= ruleLITERAL ) ) otherlv_6= ';' ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFunctionBinarySection5140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionBinarySectionAccess().getLinkKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2228:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2229:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2229:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2230:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getOperationOperationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection5163);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleFunctionBinarySection5175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionBinarySectionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleFunctionBinarySection5187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionBinarySectionAccess().getMemwidthKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBinarySection5199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionBinarySectionAccess().getEqualsSignKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2255:1: ( (lv_memwidth_5_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2256:1: (lv_memwidth_5_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2256:1: (lv_memwidth_5_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2257:3: lv_memwidth_5_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemwidthLITERALParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5220);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection5232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2277:1: ( ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2277:2: ( (lv_mems_7_0= ruleFunctionMemory ) ) otherlv_8= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2277:2: ( (lv_mems_7_0= ruleFunctionMemory ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2278:1: (lv_mems_7_0= ruleFunctionMemory )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2278:1: (lv_mems_7_0= ruleFunctionMemory )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2279:3: lv_mems_7_0= ruleFunctionMemory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionBinarySectionAccess().getMemsFunctionMemoryParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection5254);
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

            	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleFunctionBinarySection5266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getFunctionBinarySectionAccess().getSemicolonKeyword_7_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleFunctionBinarySection5280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionBinarySectionAccess().getRightCurlyBracketKeyword_8());
                  
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


    // $ANTLR start "entryRuleFunctionMemory"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2311:1: entryRuleFunctionMemory returns [EObject current=null] : iv_ruleFunctionMemory= ruleFunctionMemory EOF ;
    public final EObject entryRuleFunctionMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionMemory = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2312:2: (iv_ruleFunctionMemory= ruleFunctionMemory EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2313:2: iv_ruleFunctionMemory= ruleFunctionMemory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionMemoryRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory5316);
            iv_ruleFunctionMemory=ruleFunctionMemory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionMemory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionMemory5326); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2320:1: ruleFunctionMemory returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) ;
    public final EObject ruleFunctionMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2323:28: ( (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2324:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2324:1: (otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2324:3: otherlv_0= 'mem' ( (lv_start_1_0= ruleLITERAL ) ) otherlv_2= '..' ( (lv_end_3_0= ruleLITERAL ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFunctionMemory5363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionMemoryAccess().getMemKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2328:1: ( (lv_start_1_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2329:1: (lv_start_1_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2329:1: (lv_start_1_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2330:3: lv_start_1_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getStartLITERALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory5384);
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

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleFunctionMemory5396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionMemoryAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2350:1: ( (lv_end_3_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2351:1: (lv_end_3_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2351:1: (lv_end_3_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2352:3: lv_end_3_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemoryAccess().getEndLITERALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleFunctionMemory5417);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2376:1: entryRuleConstantBinarySection returns [EObject current=null] : iv_ruleConstantBinarySection= ruleConstantBinarySection EOF ;
    public final EObject entryRuleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2377:2: (iv_ruleConstantBinarySection= ruleConstantBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2378:2: iv_ruleConstantBinarySection= ruleConstantBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection5453);
            iv_ruleConstantBinarySection=ruleConstantBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantBinarySection5463); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2385:1: ruleConstantBinarySection returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleConstantBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2388:28: ( (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2389:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2389:1: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2389:3: otherlv_0= 'data' otherlv_1= '{' ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleConstantBinarySection5500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantBinarySectionAccess().getDataKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleConstantBinarySection5512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantBinarySectionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2397:1: ( ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_BINARY)||LA31_0==34||(LA31_0>=46 && LA31_0<=48)||(LA31_0>=77 && LA31_0<=78)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2397:2: ( (lv_data_2_0= ruleXExpression ) ) otherlv_3= ';'
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2397:2: ( (lv_data_2_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2398:1: (lv_data_2_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2398:1: (lv_data_2_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2399:3: lv_data_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstantBinarySectionAccess().getDataXExpressionParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleConstantBinarySection5534);
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

            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConstantBinarySection5546); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getConstantBinarySectionAccess().getSemicolonKeyword_2_1());
            	          
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstantBinarySection5560); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2431:1: entryRuleReferenceBinarySection returns [EObject current=null] : iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF ;
    public final EObject entryRuleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceBinarySection = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2432:2: (iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2433:2: iv_ruleReferenceBinarySection= ruleReferenceBinarySection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceBinarySectionRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection5596);
            iv_ruleReferenceBinarySection=ruleReferenceBinarySection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceBinarySection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceBinarySection5606); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2440:1: ruleReferenceBinarySection returns [EObject current=null] : (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReferenceBinarySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2443:28: ( (otherlv_0= 'include' ( ( ruleQualifiedName ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2444:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2444:1: (otherlv_0= 'include' ( ( ruleQualifiedName ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2444:3: otherlv_0= 'include' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleReferenceBinarySection5643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceBinarySectionAccess().getIncludeKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2448:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2449:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2449:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2450:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceBinarySectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceBinarySectionAccess().getIncLinkedBinaryCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection5666);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2471:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2472:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2473:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression5702);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression5712); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2480:1: ruleXExpression returns [EObject current=null] : this_XExpression5_0= ruleXExpression5 ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpression5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2483:28: (this_XExpression5_0= ruleXExpression5 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2485:5: this_XExpression5_0= ruleXExpression5
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXExpression5ParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression5_in_ruleXExpression5758);
            this_XExpression5_0=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression5_0; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2501:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2502:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2503:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5792);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5802); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2510:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XAddressOfVar_5= ruleXAddressOfVar | this_XStructExpression_6= ruleXStructExpression | this_XSizeOfExpression_7= ruleXSizeOfExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XExpressionLiteral_0 = null;

        EObject this_XParenthesizedExpression_1 = null;

        EObject this_XIsLiteralExpression_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_OperationCall_4 = null;

        EObject this_XAddressOfVar_5 = null;

        EObject this_XStructExpression_6 = null;

        EObject this_XSizeOfExpression_7 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2513:28: ( (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XAddressOfVar_5= ruleXAddressOfVar | this_XStructExpression_6= ruleXStructExpression | this_XSizeOfExpression_7= ruleXSizeOfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2514:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XAddressOfVar_5= ruleXAddressOfVar | this_XStructExpression_6= ruleXStructExpression | this_XSizeOfExpression_7= ruleXSizeOfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2514:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XAddressOfVar_5= ruleXAddressOfVar | this_XStructExpression_6= ruleXStructExpression | this_XSizeOfExpression_7= ruleXSizeOfExpression )
            int alt32=8;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2515:5: this_XExpressionLiteral_0= ruleXExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXExpressionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression5849);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2525:5: this_XParenthesizedExpression_1= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5876);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2535:5: this_XIsLiteralExpression_2= ruleXIsLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIsLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression5903);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2545:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression5930);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2555:5: this_OperationCall_4= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getOperationCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression5957);
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2565:5: this_XAddressOfVar_5= ruleXAddressOfVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXAddressOfVarParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAddressOfVar_in_ruleXPrimaryExpression5984);
                    this_XAddressOfVar_5=ruleXAddressOfVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAddressOfVar_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2575:5: this_XStructExpression_6= ruleXStructExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXStructExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6011);
                    this_XStructExpression_6=ruleXStructExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStructExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2585:5: this_XSizeOfExpression_7= ruleXSizeOfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSizeOfExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6038);
                    this_XSizeOfExpression_7=ruleXSizeOfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSizeOfExpression_7; 
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2601:1: entryRuleXSizeOfExpression returns [EObject current=null] : iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF ;
    public final EObject entryRuleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSizeOfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2602:2: (iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2603:2: iv_ruleXSizeOfExpression= ruleXSizeOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSizeOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6073);
            iv_ruleXSizeOfExpression=ruleXSizeOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSizeOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSizeOfExpression6083); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2610:1: ruleXSizeOfExpression returns [EObject current=null] : (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleXSizeOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2613:28: ( (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2614:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2614:1: (otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2614:3: otherlv_0= 'sizeof' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXSizeOfExpression6120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXSizeOfExpressionAccess().getSizeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXSizeOfExpression6132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSizeOfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2622:1: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2623:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2623:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2624:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXSizeOfExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXSizeOfExpression6155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleXSizeOfExpression6167); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2649:1: entryRuleXStructExpression returns [EObject current=null] : iv_ruleXStructExpression= ruleXStructExpression EOF ;
    public final EObject entryRuleXStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStructExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2650:2: (iv_ruleXStructExpression= ruleXStructExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2651:2: iv_ruleXStructExpression= ruleXStructExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStructExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6203);
            iv_ruleXStructExpression=ruleXStructExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStructExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStructExpression6213); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2658:1: ruleXStructExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2661:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2662:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2662:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2662:2: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_values_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )* (otherlv_5= ',' )? otherlv_6= '}'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2662:2: ( ( ruleQualifiedName ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2663:1: ( ruleQualifiedName )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2663:1: ( ruleQualifiedName )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2664:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXStructExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXStructExpression6261);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleXStructExpression6273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXStructExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2681:1: ( (lv_values_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2682:1: (lv_values_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2682:1: (lv_values_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2683:3: lv_values_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression6294);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2699:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24) ) {
                    int LA33_1 = input.LA(2);

                    if ( ((LA33_1>=RULE_ID && LA33_1<=RULE_BINARY)||LA33_1==34||(LA33_1>=46 && LA33_1<=48)||(LA33_1>=77 && LA33_1<=78)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2699:4: otherlv_3= ',' ( (lv_values_4_0= ruleXExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXStructExpression6307); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXStructExpressionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2703:1: ( (lv_values_4_0= ruleXExpression ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2704:1: (lv_values_4_0= ruleXExpression )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2704:1: (lv_values_4_0= ruleXExpression )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2705:3: lv_values_4_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXStructExpressionAccess().getValuesXExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXStructExpression6328);
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
            	    break loop33;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2721:4: (otherlv_5= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2721:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXStructExpression6343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXStructExpression6357); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2737:1: entryRuleXExpression1 returns [EObject current=null] : iv_ruleXExpression1= ruleXExpression1 EOF ;
    public final EObject entryRuleXExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression1 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2738:2: (iv_ruleXExpression1= ruleXExpression1 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2739:2: iv_ruleXExpression1= ruleXExpression1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression1Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression1_in_entryRuleXExpression16393);
            iv_ruleXExpression1=ruleXExpression1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression16403); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2746:1: ruleXExpression1 returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXPrimaryExpression ) ) ) ;
    public final EObject ruleXExpression1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2749:28: ( ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXPrimaryExpression ) ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2750:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXPrimaryExpression ) ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2750:1: ( ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXPrimaryExpression ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2750:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )* ( (lv_a_1_0= ruleXPrimaryExpression ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2750:2: ( (lv_operator_0_0= ruleUNARY_OPERATOR ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=77 && LA35_0<=78)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2751:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2751:1: (lv_operator_0_0= ruleUNARY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2752:3: lv_operator_0_0= ruleUNARY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression1Access().getOperatorUNARY_OPERATOREnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression16449);
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
            	    break loop35;
                }
            } while (true);

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2768:3: ( (lv_a_1_0= ruleXPrimaryExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2769:1: (lv_a_1_0= ruleXPrimaryExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2769:1: (lv_a_1_0= ruleXPrimaryExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2770:3: lv_a_1_0= ruleXPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression1Access().getAXPrimaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXExpression16471);
            lv_a_1_0=ruleXPrimaryExpression();

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
                      		"XPrimaryExpression");
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


    // $ANTLR start "entryRuleXExpression2"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2794:1: entryRuleXExpression2 returns [EObject current=null] : iv_ruleXExpression2= ruleXExpression2 EOF ;
    public final EObject entryRuleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression2 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2795:2: (iv_ruleXExpression2= ruleXExpression2 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2796:2: iv_ruleXExpression2= ruleXExpression2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression2Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression2_in_entryRuleXExpression26507);
            iv_ruleXExpression2=ruleXExpression2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression26517); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2803:1: ruleXExpression2 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression2() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2806:28: ( ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:1: ( ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:2: ( (lv_a_0_0= ruleXExpression1 ) ) ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2807:2: ( (lv_a_0_0= ruleXExpression1 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:1: (lv_a_0_0= ruleXExpression1 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2808:1: (lv_a_0_0= ruleXExpression1 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2809:3: lv_a_0_0= ruleXExpression1
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression2Access().getAXExpression1ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression1_in_ruleXExpression26563);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:2: ( ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 79:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred1_InternalESyntax()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:3: ( ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )=> (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2830:1: (lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2831:3: lv_op_1_0= ruleMULTIPLICATIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getOpMULTIPLICATIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression26595);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2847:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2848:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2848:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2849:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression2Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression26616);
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
            	    break loop36;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2873:1: entryRuleXExpression3 returns [EObject current=null] : iv_ruleXExpression3= ruleXExpression3 EOF ;
    public final EObject entryRuleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression3 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2874:2: (iv_ruleXExpression3= ruleXExpression3 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2875:2: iv_ruleXExpression3= ruleXExpression3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression3Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression3_in_entryRuleXExpression36654);
            iv_ruleXExpression3=ruleXExpression3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression36664); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2882:1: ruleXExpression3 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) ;
    public final EObject ruleXExpression3() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2885:28: ( ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:1: ( ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:2: ( (lv_a_0_0= ruleXExpression2 ) ) ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2886:2: ( (lv_a_0_0= ruleXExpression2 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2887:1: (lv_a_0_0= ruleXExpression2 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2887:1: (lv_a_0_0= ruleXExpression2 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2888:3: lv_a_0_0= ruleXExpression2
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression3Access().getAXExpression2ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression36710);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2904:2: ( ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==82) && (synpred2_InternalESyntax())) {
                    alt37=1;
                }
                else if ( (LA37_0==77) && (synpred2_InternalESyntax())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2904:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression2 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2904:3: ( ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2904:4: ( ( ruleADDITIVE_OPERATOR ) )=> (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2909:1: (lv_op_1_0= ruleADDITIVE_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2910:3: lv_op_1_0= ruleADDITIVE_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getOpADDITIVE_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression36742);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2926:2: ( (lv_b_2_0= ruleXExpression2 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:1: (lv_b_2_0= ruleXExpression2 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2927:1: (lv_b_2_0= ruleXExpression2 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2928:3: lv_b_2_0= ruleXExpression2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression3Access().getBXExpression2ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression2_in_ruleXExpression36763);
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
            	    break loop37;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2952:1: entryRuleXExpression4 returns [EObject current=null] : iv_ruleXExpression4= ruleXExpression4 EOF ;
    public final EObject entryRuleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression4 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2953:2: (iv_ruleXExpression4= ruleXExpression4 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2954:2: iv_ruleXExpression4= ruleXExpression4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression4Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression4_in_entryRuleXExpression46801);
            iv_ruleXExpression4=ruleXExpression4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression46811); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2961:1: ruleXExpression4 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) ;
    public final EObject ruleXExpression4() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2964:28: ( ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2965:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2965:1: ( ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2965:2: ( (lv_a_0_0= ruleXExpression3 ) ) ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2965:2: ( (lv_a_0_0= ruleXExpression3 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2966:1: (lv_a_0_0= ruleXExpression3 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2966:1: (lv_a_0_0= ruleXExpression3 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2967:3: lv_a_0_0= ruleXExpression3
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression4Access().getAXExpression3ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression46857);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2983:2: ( ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==83) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }
                else if ( (LA38_0==84) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }
                else if ( (LA38_0==85) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }
                else if ( (LA38_0==86) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }
                else if ( (LA38_0==32) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }
                else if ( (LA38_0==31) && (synpred3_InternalESyntax())) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2983:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression3 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2983:3: ( ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2983:4: ( ( ruleEQUALITY_OPERATOR ) )=> (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2988:1: (lv_op_1_0= ruleEQUALITY_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2989:3: lv_op_1_0= ruleEQUALITY_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getOpEQUALITY_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression46889);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3005:2: ( (lv_b_2_0= ruleXExpression3 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3006:1: (lv_b_2_0= ruleXExpression3 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3006:1: (lv_b_2_0= ruleXExpression3 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3007:3: lv_b_2_0= ruleXExpression3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression4Access().getBXExpression3ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression3_in_ruleXExpression46910);
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
            	    break loop38;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3031:1: entryRuleXExpression5 returns [EObject current=null] : iv_ruleXExpression5= ruleXExpression5 EOF ;
    public final EObject entryRuleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression5 = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3032:2: (iv_ruleXExpression5= ruleXExpression5 EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3033:2: iv_ruleXExpression5= ruleXExpression5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression5Rule()); 
            }
            pushFollow(FOLLOW_ruleXExpression5_in_entryRuleXExpression56948);
            iv_ruleXExpression5=ruleXExpression5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression56958); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3040:1: ruleXExpression5 returns [EObject current=null] : ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) ;
    public final EObject ruleXExpression5() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3043:28: ( ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3044:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3044:1: ( ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )* )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3044:2: ( (lv_a_0_0= ruleXExpression4 ) ) ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3044:2: ( (lv_a_0_0= ruleXExpression4 ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3045:1: (lv_a_0_0= ruleXExpression4 )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3045:1: (lv_a_0_0= ruleXExpression4 )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3046:3: lv_a_0_0= ruleXExpression4
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpression5Access().getAXExpression4ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression57004);
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

            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3062:2: ( ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==87) && (synpred4_InternalESyntax())) {
                    alt39=1;
                }
                else if ( (LA39_0==88) && (synpred4_InternalESyntax())) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3062:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) ) ( (lv_b_2_0= ruleXExpression4 ) )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3062:3: ( ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3062:4: ( ( ruleBOOLEAN_OPERATOR ) )=> (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3067:1: (lv_op_1_0= ruleBOOLEAN_OPERATOR )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3068:3: lv_op_1_0= ruleBOOLEAN_OPERATOR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getOpBOOLEAN_OPERATOREnumRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression57036);
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

            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3084:2: ( (lv_b_2_0= ruleXExpression4 ) )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3085:1: (lv_b_2_0= ruleXExpression4 )
            	    {
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3085:1: (lv_b_2_0= ruleXExpression4 )
            	    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3086:3: lv_b_2_0= ruleXExpression4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpression5Access().getBXExpression4ParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression4_in_ruleXExpression57057);
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
    // $ANTLR end "ruleXExpression5"


    // $ANTLR start "entryRuleXExpressionLiteral"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3110:1: entryRuleXExpressionLiteral returns [EObject current=null] : iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF ;
    public final EObject entryRuleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionLiteral = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3111:2: (iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3112:2: iv_ruleXExpressionLiteral= ruleXExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral7095);
            iv_ruleXExpressionLiteral=ruleXExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionLiteral7105); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3119:1: ruleXExpressionLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL ) ) ;
    public final EObject ruleXExpressionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3122:28: ( ( (lv_value_0_0= ruleLITERAL ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3123:1: ( (lv_value_0_0= ruleLITERAL ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3123:1: ( (lv_value_0_0= ruleLITERAL ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3124:1: (lv_value_0_0= ruleLITERAL )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3124:1: (lv_value_0_0= ruleLITERAL )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3125:3: lv_value_0_0= ruleLITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral7150);
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3149:1: entryRuleXTopLevelExpression returns [EObject current=null] : iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF ;
    public final EObject entryRuleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTopLevelExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3150:2: (iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3151:2: iv_ruleXTopLevelExpression= ruleXTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression7185);
            iv_ruleXTopLevelExpression=ruleXTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTopLevelExpression7195); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3158:1: ruleXTopLevelExpression returns [EObject current=null] : (this_XAssignment_0= ruleXAssignment | this_XIfExpression_1= ruleXIfExpression ) ;
    public final EObject ruleXTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;

        EObject this_XIfExpression_1 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3161:28: ( (this_XAssignment_0= ruleXAssignment | this_XIfExpression_1= ruleXIfExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3162:1: (this_XAssignment_0= ruleXAssignment | this_XIfExpression_1= ruleXIfExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3162:1: (this_XAssignment_0= ruleXAssignment | this_XIfExpression_1= ruleXIfExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==49) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3163:5: this_XAssignment_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXTopLevelExpression7242);
                    this_XAssignment_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAssignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3173:5: this_XIfExpression_1= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXTopLevelExpressionAccess().getXIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression7269);
                    this_XIfExpression_1=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_1; 
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


    // $ANTLR start "entryRuleXAssignment"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3189:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3190:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3191:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment7304);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment7314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3198:1: ruleXAssignment returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign ( (lv_value_2_0= ruleXExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_ref_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3201:28: ( ( ( (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign ( (lv_value_2_0= ruleXExpression ) ) otherlv_3= ';' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3202:1: ( ( (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign ( (lv_value_2_0= ruleXExpression ) ) otherlv_3= ';' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3202:1: ( ( (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign ( (lv_value_2_0= ruleXExpression ) ) otherlv_3= ';' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3202:2: ( (lv_ref_0_0= ruleVariableReference ) ) ruleOpSingleAssign ( (lv_value_2_0= ruleXExpression ) ) otherlv_3= ';'
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3202:2: ( (lv_ref_0_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3203:1: (lv_ref_0_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3203:1: (lv_ref_0_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3204:3: lv_ref_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRefVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXAssignment7360);
            lv_ref_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
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

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment7376);
            ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3228:1: ( (lv_value_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3229:1: (lv_value_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3229:1: (lv_value_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3230:3: lv_value_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXAssignment7396);
            lv_value_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleXAssignment7408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXAssignmentAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3258:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3259:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3260:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign7445);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign7456); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3267:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3270:28: (kw= '=' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3272:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign7493); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXAddressOfVar"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3285:1: entryRuleXAddressOfVar returns [EObject current=null] : iv_ruleXAddressOfVar= ruleXAddressOfVar EOF ;
    public final EObject entryRuleXAddressOfVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAddressOfVar = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3286:2: (iv_ruleXAddressOfVar= ruleXAddressOfVar EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3287:2: iv_ruleXAddressOfVar= ruleXAddressOfVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAddressOfVarRule()); 
            }
            pushFollow(FOLLOW_ruleXAddressOfVar_in_entryRuleXAddressOfVar7532);
            iv_ruleXAddressOfVar=ruleXAddressOfVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAddressOfVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAddressOfVar7542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAddressOfVar"


    // $ANTLR start "ruleXAddressOfVar"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3294:1: ruleXAddressOfVar returns [EObject current=null] : (otherlv_0= 'addr' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXAddressOfVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3297:28: ( (otherlv_0= 'addr' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:1: (otherlv_0= 'addr' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:1: (otherlv_0= 'addr' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3298:3: otherlv_0= 'addr' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleXAddressOfVar7579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXAddressOfVarAccess().getAddrKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXAddressOfVar7591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAddressOfVarAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3306:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3307:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3307:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3308:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAddressOfVarAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXAddressOfVar7612);
            lv_ref_2_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAddressOfVarRule());
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleXAddressOfVar7624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXAddressOfVarAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleXAddressOfVar"


    // $ANTLR start "entryRuleXIsLiteralExpression"
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3336:1: entryRuleXIsLiteralExpression returns [EObject current=null] : iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF ;
    public final EObject entryRuleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIsLiteralExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3337:2: (iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3338:2: iv_ruleXIsLiteralExpression= ruleXIsLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIsLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression7660);
            iv_ruleXIsLiteralExpression=ruleXIsLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIsLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIsLiteralExpression7670); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3345:1: ruleXIsLiteralExpression returns [EObject current=null] : (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleXIsLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3348:28: ( (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:1: (otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3349:3: otherlv_0= 'isliteral' otherlv_1= '(' ( (lv_ref_2_0= ruleVariableReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXIsLiteralExpression7707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIsLiteralExpressionAccess().getIsliteralKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXIsLiteralExpression7719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIsLiteralExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3357:1: ( (lv_ref_2_0= ruleVariableReference ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3358:1: (lv_ref_2_0= ruleVariableReference )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3358:1: (lv_ref_2_0= ruleVariableReference )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3359:3: lv_ref_2_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression7740);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleXIsLiteralExpression7752); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3387:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3388:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3389:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7788);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7798); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3396:1: ruleXIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3399:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3400:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3400:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )? )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3400:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleXExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleOperationBlock ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression7835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXIfExpressionAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXIfExpression7847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3408:1: ( (lv_if_2_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3409:1: (lv_if_2_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3409:1: (lv_if_2_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3410:3: lv_if_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7868);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleXIfExpression7880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression7892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3434:1: ( (lv_then_5_0= ruleOperationBlock ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:1: (lv_then_5_0= ruleOperationBlock )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3435:1: (lv_then_5_0= ruleOperationBlock )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3436:3: lv_then_5_0= ruleOperationBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenOperationBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression7913);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression7925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:1: ( ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) && (synpred5_InternalESyntax())) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:2: ( ( 'else' )=>otherlv_7= 'else' ) otherlv_8= '{' ( (lv_else_9_0= ruleOperationBlock ) ) otherlv_10= '}'
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:2: ( ( 'else' )=>otherlv_7= 'else' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:3: ( 'else' )=>otherlv_7= 'else'
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression7946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXIfExpressionAccess().getElseKeyword_7_0());
                          
                    }

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression7959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXIfExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3465:1: ( (lv_else_9_0= ruleOperationBlock ) )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3466:1: (lv_else_9_0= ruleOperationBlock )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3466:1: (lv_else_9_0= ruleOperationBlock )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3467:3: lv_else_9_0= ruleOperationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseOperationBlockParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationBlock_in_ruleXIfExpression7980);
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

                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression7992); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3495:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3496:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3497:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8030);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression8040); if (state.failed) return current;

            }

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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3504:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_a_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3507:28: ( (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3508:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3508:1: (otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')' )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3508:3: otherlv_0= '(' ( (lv_a_1_0= ruleXExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleXParenthesizedExpression8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3512:1: ( (lv_a_1_0= ruleXExpression ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3513:1: (lv_a_1_0= ruleXExpression )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3513:1: (lv_a_1_0= ruleXExpression )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3514:3: lv_a_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8098);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXParenthesizedExpression8110); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3542:1: rulePrimitiveKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator rulePrimitiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3544:28: ( ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:1: ( (enumLiteral_0= 'unsigned' ) | (enumLiteral_1= 'signed' ) | (enumLiteral_2= 'real' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt42=1;
                }
                break;
            case 52:
                {
                alt42=2;
                }
                break;
            case 53:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:2: (enumLiteral_0= 'unsigned' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:2: (enumLiteral_0= 'unsigned' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3545:4: enumLiteral_0= 'unsigned'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_rulePrimitiveKind8160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveKindAccess().getUNSIGNEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3551:6: (enumLiteral_1= 'signed' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3551:6: (enumLiteral_1= 'signed' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3551:8: enumLiteral_1= 'signed'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_rulePrimitiveKind8177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveKindAccess().getSIGNEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3557:6: (enumLiteral_2= 'real' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3557:6: (enumLiteral_2= 'real' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3557:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_rulePrimitiveKind8194); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3567:1: ruleParameterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) ;
    public final Enumerator ruleParameterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3569:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'var' ) | (enumLiteral_2= 'const' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt43=1;
                }
                break;
            case 55:
                {
                alt43=2;
                }
                break;
            case 26:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3570:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleParameterKind8239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterKindAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:6: (enumLiteral_1= 'var' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:6: (enumLiteral_1= 'var' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3576:8: enumLiteral_1= 'var'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleParameterKind8256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterKindAccess().getVAREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3582:6: (enumLiteral_2= 'const' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3582:6: (enumLiteral_2= 'const' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3582:8: enumLiteral_2= 'const'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleParameterKind8273); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3592:1: ruleOperationRole returns [Enumerator current=null] : ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3594:28: ( ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:1: ( (enumLiteral_0= 'SET' ) | (enumLiteral_1= 'ADD' ) | (enumLiteral_2= 'SUBTRACT' ) | (enumLiteral_3= 'AND' ) | (enumLiteral_4= 'OR' ) | (enumLiteral_5= 'XOR' ) | (enumLiteral_6= 'EQUALS' ) | (enumLiteral_7= 'BRANCH' ) | (enumLiteral_8= 'UC_GOTO' ) | (enumLiteral_9= 'NOT' ) | (enumLiteral_10= 'INDIRECTION' ) | (enumLiteral_11= 'CLEAR' ) | (enumLiteral_12= 'INCREMENT' ) | (enumLiteral_13= 'DECREMENT' ) | (enumLiteral_14= 'DIV' ) | (enumLiteral_15= 'MOD' ) | (enumLiteral_16= 'LT' ) | (enumLiteral_17= 'LTE' ) | (enumLiteral_18= 'GT' ) | (enumLiteral_19= 'GTE' ) )
            int alt44=20;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt44=1;
                }
                break;
            case 57:
                {
                alt44=2;
                }
                break;
            case 58:
                {
                alt44=3;
                }
                break;
            case 59:
                {
                alt44=4;
                }
                break;
            case 60:
                {
                alt44=5;
                }
                break;
            case 61:
                {
                alt44=6;
                }
                break;
            case 62:
                {
                alt44=7;
                }
                break;
            case 63:
                {
                alt44=8;
                }
                break;
            case 64:
                {
                alt44=9;
                }
                break;
            case 65:
                {
                alt44=10;
                }
                break;
            case 66:
                {
                alt44=11;
                }
                break;
            case 67:
                {
                alt44=12;
                }
                break;
            case 68:
                {
                alt44=13;
                }
                break;
            case 69:
                {
                alt44=14;
                }
                break;
            case 70:
                {
                alt44=15;
                }
                break;
            case 71:
                {
                alt44=16;
                }
                break;
            case 72:
                {
                alt44=17;
                }
                break;
            case 73:
                {
                alt44=18;
                }
                break;
            case 74:
                {
                alt44=19;
                }
                break;
            case 75:
                {
                alt44=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:2: (enumLiteral_0= 'SET' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:2: (enumLiteral_0= 'SET' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3595:4: enumLiteral_0= 'SET'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleOperationRole8318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperationRoleAccess().getSETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3601:6: (enumLiteral_1= 'ADD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3601:6: (enumLiteral_1= 'ADD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3601:8: enumLiteral_1= 'ADD'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleOperationRole8335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperationRoleAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3607:6: (enumLiteral_2= 'SUBTRACT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3607:6: (enumLiteral_2= 'SUBTRACT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3607:8: enumLiteral_2= 'SUBTRACT'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleOperationRole8352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperationRoleAccess().getSUBTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3613:6: (enumLiteral_3= 'AND' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3613:6: (enumLiteral_3= 'AND' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3613:8: enumLiteral_3= 'AND'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleOperationRole8369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperationRoleAccess().getANDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:6: (enumLiteral_4= 'OR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:6: (enumLiteral_4= 'OR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3619:8: enumLiteral_4= 'OR'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleOperationRole8386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperationRoleAccess().getOREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3625:6: (enumLiteral_5= 'XOR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3625:6: (enumLiteral_5= 'XOR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3625:8: enumLiteral_5= 'XOR'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_61_in_ruleOperationRole8403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperationRoleAccess().getXOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:6: (enumLiteral_6= 'EQUALS' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:6: (enumLiteral_6= 'EQUALS' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3631:8: enumLiteral_6= 'EQUALS'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_62_in_ruleOperationRole8420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getOperationRoleAccess().getEQUALSEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3637:6: (enumLiteral_7= 'BRANCH' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3637:6: (enumLiteral_7= 'BRANCH' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3637:8: enumLiteral_7= 'BRANCH'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_63_in_ruleOperationRole8437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getOperationRoleAccess().getBRANCHEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3643:6: (enumLiteral_8= 'UC_GOTO' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3643:6: (enumLiteral_8= 'UC_GOTO' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3643:8: enumLiteral_8= 'UC_GOTO'
                    {
                    enumLiteral_8=(Token)match(input,64,FOLLOW_64_in_ruleOperationRole8454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getOperationRoleAccess().getUC_GOTOEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3649:6: (enumLiteral_9= 'NOT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3649:6: (enumLiteral_9= 'NOT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3649:8: enumLiteral_9= 'NOT'
                    {
                    enumLiteral_9=(Token)match(input,65,FOLLOW_65_in_ruleOperationRole8471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getOperationRoleAccess().getNOTEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:6: (enumLiteral_10= 'INDIRECTION' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:6: (enumLiteral_10= 'INDIRECTION' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3655:8: enumLiteral_10= 'INDIRECTION'
                    {
                    enumLiteral_10=(Token)match(input,66,FOLLOW_66_in_ruleOperationRole8488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getOperationRoleAccess().getINDIRECTIONEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3661:6: (enumLiteral_11= 'CLEAR' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3661:6: (enumLiteral_11= 'CLEAR' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3661:8: enumLiteral_11= 'CLEAR'
                    {
                    enumLiteral_11=(Token)match(input,67,FOLLOW_67_in_ruleOperationRole8505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getOperationRoleAccess().getCLEAREnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3667:6: (enumLiteral_12= 'INCREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3667:6: (enumLiteral_12= 'INCREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3667:8: enumLiteral_12= 'INCREMENT'
                    {
                    enumLiteral_12=(Token)match(input,68,FOLLOW_68_in_ruleOperationRole8522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getOperationRoleAccess().getINCREMENTEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3673:6: (enumLiteral_13= 'DECREMENT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3673:6: (enumLiteral_13= 'DECREMENT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3673:8: enumLiteral_13= 'DECREMENT'
                    {
                    enumLiteral_13=(Token)match(input,69,FOLLOW_69_in_ruleOperationRole8539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getOperationRoleAccess().getDECREMENTEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3679:6: (enumLiteral_14= 'DIV' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3679:6: (enumLiteral_14= 'DIV' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3679:8: enumLiteral_14= 'DIV'
                    {
                    enumLiteral_14=(Token)match(input,70,FOLLOW_70_in_ruleOperationRole8556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getOperationRoleAccess().getDIVEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:6: (enumLiteral_15= 'MOD' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:6: (enumLiteral_15= 'MOD' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3685:8: enumLiteral_15= 'MOD'
                    {
                    enumLiteral_15=(Token)match(input,71,FOLLOW_71_in_ruleOperationRole8573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getOperationRoleAccess().getMODEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3691:6: (enumLiteral_16= 'LT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3691:6: (enumLiteral_16= 'LT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3691:8: enumLiteral_16= 'LT'
                    {
                    enumLiteral_16=(Token)match(input,72,FOLLOW_72_in_ruleOperationRole8590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getOperationRoleAccess().getLTEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3697:6: (enumLiteral_17= 'LTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3697:6: (enumLiteral_17= 'LTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3697:8: enumLiteral_17= 'LTE'
                    {
                    enumLiteral_17=(Token)match(input,73,FOLLOW_73_in_ruleOperationRole8607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getOperationRoleAccess().getLTEEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3703:6: (enumLiteral_18= 'GT' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3703:6: (enumLiteral_18= 'GT' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3703:8: enumLiteral_18= 'GT'
                    {
                    enumLiteral_18=(Token)match(input,74,FOLLOW_74_in_ruleOperationRole8624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getOperationRoleAccess().getGTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3709:6: (enumLiteral_19= 'GTE' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3709:6: (enumLiteral_19= 'GTE' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3709:8: enumLiteral_19= 'GTE'
                    {
                    enumLiteral_19=(Token)match(input,75,FOLLOW_75_in_ruleOperationRole8641); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3719:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3721:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'hexfile' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            else if ( (LA45_0==76) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:2: (enumLiteral_0= 'default' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:2: (enumLiteral_0= 'default' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3722:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleBinaryType8686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3728:6: (enumLiteral_1= 'hexfile' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3728:6: (enumLiteral_1= 'hexfile' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3728:8: enumLiteral_1= 'hexfile'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleBinaryType8703); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3738:1: ruleUNARY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleUNARY_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3740:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==77) ) {
                alt46=1;
            }
            else if ( (LA46_0==78) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:2: (enumLiteral_0= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:2: (enumLiteral_0= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3741:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleUNARY_OPERATOR8748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUNARY_OPERATORAccess().getMINUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3747:6: (enumLiteral_1= '!' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3747:6: (enumLiteral_1= '!' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3747:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleUNARY_OPERATOR8765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUNARY_OPERATORAccess().getNOTEnumLiteralDeclaration_1()); 
                          
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3757:1: ruleMULTIPLICATIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3759:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3760:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3760:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt47=1;
                }
                break;
            case 80:
                {
                alt47=2;
                }
                break;
            case 81:
                {
                alt47=3;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3760:2: (enumLiteral_0= '*' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3760:2: (enumLiteral_0= '*' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3760:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleMULTIPLICATIVE_OPERATOR8810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getMULEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3766:6: (enumLiteral_1= '/' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3766:6: (enumLiteral_1= '/' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3766:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleMULTIPLICATIVE_OPERATOR8827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3772:6: (enumLiteral_2= '%' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3772:6: (enumLiteral_2= '%' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3772:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleMULTIPLICATIVE_OPERATOR8844); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3782:1: ruleADDITIVE_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleADDITIVE_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3784:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==82) ) {
                alt48=1;
            }
            else if ( (LA48_0==77) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:2: (enumLiteral_0= '+' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:2: (enumLiteral_0= '+' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3785:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleADDITIVE_OPERATOR8889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getADDITIVE_OPERATORAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3791:6: (enumLiteral_1= '-' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3791:6: (enumLiteral_1= '-' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3791:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleADDITIVE_OPERATOR8906); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3801:1: ruleEQUALITY_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) ;
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
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3803:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3804:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3804:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<' ) )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt49=1;
                }
                break;
            case 84:
                {
                alt49=2;
                }
                break;
            case 85:
                {
                alt49=3;
                }
                break;
            case 86:
                {
                alt49=4;
                }
                break;
            case 32:
                {
                alt49=5;
                }
                break;
            case 31:
                {
                alt49=6;
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
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3804:2: (enumLiteral_0= '==' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3804:2: (enumLiteral_0= '==' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3804:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleEQUALITY_OPERATOR8951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPERATORAccess().getEQUALSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3810:6: (enumLiteral_1= '!=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3810:6: (enumLiteral_1= '!=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3810:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleEQUALITY_OPERATOR8968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPERATORAccess().getNOTEQUALSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3816:6: (enumLiteral_2= '>=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3816:6: (enumLiteral_2= '>=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3816:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleEQUALITY_OPERATOR8985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEQUALITY_OPERATORAccess().getGTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3822:6: (enumLiteral_3= '<=' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3822:6: (enumLiteral_3= '<=' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3822:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_86_in_ruleEQUALITY_OPERATOR9002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEQUALITY_OPERATORAccess().getLTEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3828:6: (enumLiteral_4= '>' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3828:6: (enumLiteral_4= '>' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3828:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleEQUALITY_OPERATOR9019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEQUALITY_OPERATORAccess().getGTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:6: (enumLiteral_5= '<' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:6: (enumLiteral_5= '<' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3834:8: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_31_in_ruleEQUALITY_OPERATOR9036); if (state.failed) return current;
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
    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3844:1: ruleBOOLEAN_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBOOLEAN_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3846:28: ( ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) ) )
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3847:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            {
            // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3847:1: ( (enumLiteral_0= '||' ) | (enumLiteral_1= '&&' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==87) ) {
                alt50=1;
            }
            else if ( (LA50_0==88) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3847:2: (enumLiteral_0= '||' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3847:2: (enumLiteral_0= '||' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3847:4: enumLiteral_0= '||'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleBOOLEAN_OPERATOR9081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBOOLEAN_OPERATORAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:6: (enumLiteral_1= '&&' )
                    {
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:6: (enumLiteral_1= '&&' )
                    // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3853:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleBOOLEAN_OPERATOR9098); if (state.failed) return current;
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
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2825:4: ( ( ruleMULTIPLICATIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2826:1: ( ruleMULTIPLICATIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2826:1: ( ruleMULTIPLICATIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2827:1: ruleMULTIPLICATIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax6578);
        ruleMULTIPLICATIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalESyntax

    // $ANTLR start synpred2_InternalESyntax
    public final void synpred2_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2904:4: ( ( ruleADDITIVE_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:1: ( ruleADDITIVE_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2905:1: ( ruleADDITIVE_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2906:1: ruleADDITIVE_OPERATOR
        {
        pushFollow(FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax6725);
        ruleADDITIVE_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalESyntax

    // $ANTLR start synpred3_InternalESyntax
    public final void synpred3_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2983:4: ( ( ruleEQUALITY_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2984:1: ( ruleEQUALITY_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2984:1: ( ruleEQUALITY_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:2985:1: ruleEQUALITY_OPERATOR
        {
        pushFollow(FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax6872);
        ruleEQUALITY_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalESyntax

    // $ANTLR start synpred4_InternalESyntax
    public final void synpred4_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3062:4: ( ( ruleBOOLEAN_OPERATOR ) )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3063:1: ( ruleBOOLEAN_OPERATOR )
        {
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3063:1: ( ruleBOOLEAN_OPERATOR )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3064:1: ruleBOOLEAN_OPERATOR
        {
        pushFollow(FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax7019);
        ruleBOOLEAN_OPERATOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalESyntax

    // $ANTLR start synpred5_InternalESyntax
    public final void synpred5_InternalESyntax_fragment() throws RecognitionException {   
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:3: ( 'else' )
        // ../hu.e.parser/src-gen/hu/e/parser/parser/antlr/internal/InternalESyntax.g:3456:5: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred5_InternalESyntax7938); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalESyntax

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\7\uffff";
    static final String DFA3_maxS =
        "\1\46\1\uffff\1\42\7\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\1\10\1\2\1\4";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\14\uffff\1\1\10\uffff\1\4\1\5\1\uffff\1\6\7\uffff\1\7"+
            "\1\3",
            "",
            "\1\11\13\uffff\1\11\21\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "169:1: (this_Type_0= ruleType | this_Operation_1= ruleOperation | this_LinkedBinary_2= ruleLinkedBinary | (this_Variable_3= ruleVariable otherlv_4= ';' ) | (this_ConstantVariable_5= ruleConstantVariable otherlv_6= ';' ) | (this_RegisterVariable_7= ruleRegisterVariable otherlv_8= ';' ) | (this_CompileContextVariable_9= ruleCompileContextVariable otherlv_10= ';' ) | this_OperatorDefinition_11= ruleOperatorDefinition )";
        }
    }
    static final String DFA9_eotS =
        "\11\uffff";
    static final String DFA9_eofS =
        "\11\uffff";
    static final String DFA9_minS =
        "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4";
    static final String DFA9_maxS =
        "\1\61\2\uffff\1\42\1\uffff\1\4\2\uffff\1\42";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff";
    static final String DFA9_specialS =
        "\11\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\31\uffff\1\2\1\1\21\uffff\1\4",
            "",
            "",
            "\1\6\13\uffff\1\5\1\uffff\1\4\1\uffff\1\4\15\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\6\13\uffff\1\5\1\uffff\1\4\1\uffff\1\4\15\uffff\1\7"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "992:1: (this_InstructionWord_0= ruleInstructionWord | this_Label_1= ruleLabel | (this_Variable_2= ruleVariable otherlv_3= ';' ) | (this_OperationCall_4= ruleOperationCall otherlv_5= ';' ) | this_XTopLevelExpression_6= ruleXTopLevelExpression )";
        }
    }
    static final String DFA20_eotS =
        "\6\uffff";
    static final String DFA20_eofS =
        "\6\uffff";
    static final String DFA20_minS =
        "\1\4\1\uffff\2\4\1\uffff\1\4";
    static final String DFA20_maxS =
        "\1\116\1\uffff\1\130\1\4\1\uffff\1\130";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA20_specialS =
        "\6\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\3\1\32\uffff\1\1\13\uffff\3\1\34\uffff\2\1",
            "",
            "\1\4\11\uffff\1\1\1\uffff\1\3\3\uffff\1\1\2\uffff\1\1\7\uffff"+
            "\2\1\1\uffff\1\1\52\uffff\1\1\1\uffff\12\1",
            "\1\5",
            "",
            "\1\4\11\uffff\1\1\1\uffff\1\3\3\uffff\1\1\2\uffff\1\1\7\uffff"+
            "\2\1\1\uffff\1\1\52\uffff\1\1\1\uffff\12\1"
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
            return "1786:1: ( ( (lv_return_10_0= ruleXExpression ) ) | ( (lv_returnvar_11_0= ruleVariable ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\14\uffff";
    static final String DFA32_eofS =
        "\4\uffff\1\12\6\uffff\1\12";
    static final String DFA32_minS =
        "\1\4\3\uffff\1\16\2\uffff\1\4\3\uffff\1\16";
    static final String DFA32_maxS =
        "\1\60\3\uffff\1\130\2\uffff\1\4\3\uffff\1\130";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\10\1\uffff\1\7\1\5\1\4\1\uffff";
    static final String DFA32_specialS =
        "\14\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\4\3\1\32\uffff\1\2\13\uffff\1\6\1\5\1\3",
            "",
            "",
            "",
            "\1\12\1\uffff\1\7\3\uffff\2\12\1\uffff\1\10\2\12\5\uffff\2"+
            "\12\1\uffff\1\11\1\12\51\uffff\1\12\1\uffff\12\12",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\12\1\uffff\1\7\3\uffff\2\12\1\uffff\1\10\2\12\5\uffff\2"+
            "\12\1\uffff\1\11\1\12\51\uffff\1\12\1\uffff\12\12"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2514:1: (this_XExpressionLiteral_0= ruleXExpressionLiteral | this_XParenthesizedExpression_1= ruleXParenthesizedExpression | this_XIsLiteralExpression_2= ruleXIsLiteralExpression | this_VariableReference_3= ruleVariableReference | this_OperationCall_4= ruleOperationCall | this_XAddressOfVar_5= ruleXAddressOfVar | this_XStructExpression_6= ruleXStructExpression | this_XSizeOfExpression_7= ruleXSizeOfExpression )";
        }
    }
 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage155 = new BitSet(new long[]{0x000000602C028012L});
    public static final BitSet FOLLOW_15_in_rulePackage168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage203 = new BitSet(new long[]{0x000000602C028012L});
    public static final BitSet FOLLOW_ruleTopLevelItem_in_rulePackage226 = new BitSet(new long[]{0x000000602C020012L});
    public static final BitSet FOLLOW_ruleTopLevelItem_in_entryRuleTopLevelItem263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelItem273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTopLevelItem320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleTopLevelItem347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_ruleTopLevelItem374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTopLevelItem402 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTopLevelItem413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_ruleTopLevelItem443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTopLevelItem454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_ruleTopLevelItem484 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTopLevelItem495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompileContextVariable_in_ruleTopLevelItem525 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTopLevelItem536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_ruleTopLevelItem565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName652 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName686 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLITERAL785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLITERAL811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleLITERAL837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType946 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleType963 = new BitSet(new long[]{0x0038000000400010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_ruleTypeDef1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_ruleTypeDef1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_ruleTypeDef1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDef_in_entryRuleDataTypeDef1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDef1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveKind_in_ruleDataTypeDef1222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataTypeDef1239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataTypeDef1256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataTypeDef1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDef_in_entryRuleArrayTypeDef1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDef1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArrayTypeDef1362 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayTypeDef1374 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayTypeDef1395 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArrayTypeDef1407 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayTypeDef1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDef_in_entryRuleStructTypeDef1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDef1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStructTypeDef1511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStructTypeDef1523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef1544 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleStructTypeDef1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_ruleStructTypeDef1578 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleStructTypeDef1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructTypeDefMember_in_entryRuleStructTypeDefMember1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructTypeDefMember1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStructTypeDefMember1686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructTypeDefMember1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantVariable_in_entryRuleConstantVariable1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantVariable1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstantVariable1800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConstantVariable1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantVariable1840 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantVariable1857 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantVariable1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterVariable_in_entryRuleRegisterVariable1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterVariable1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRegisterVariable1970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRegisterVariable1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisterVariable2010 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRegisterVariable2027 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleRegisterVariable2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompileContextVariable_in_entryRuleCompileContextVariable2084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompileContextVariable2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompileContextVariable2140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompileContextVariable2157 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleCompileContextVariable2175 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleCompileContextVariable2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_entryRuleOperationStep2234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationStep2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_ruleOperationStep2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleOperationStep2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperationStep2346 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperationStep2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperationStep2387 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperationStep2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_ruleOperationStep2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLabel2509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLabel2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionWord_in_entryRuleInstructionWord2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionWord2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInstructionWord2626 = new BitSet(new long[]{0x00000002000000F0L});
    public static final BitSet FOLLOW_ruleWordSection_in_ruleInstructionWord2647 = new BitSet(new long[]{0x00000003000000F0L});
    public static final BitSet FOLLOW_32_in_ruleInstructionWord2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordSection_in_entryRuleWordSection2696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordSection2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleWordSection2754 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleWordSection2781 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLabelReference_in_ruleWordSection2808 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleWordSection2820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection2837 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleWordSection2855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWordSection2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleLiteralValue2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelReference_in_entryRuleLabelReference3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelReference3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLabelReference3052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelReference3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariable3166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference3224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference3279 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_ruleVariableRefSection_in_ruleVariableReference3300 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_ruleVariableRefSection_in_entryRuleVariableRefSection3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableRefSection3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayRef_in_ruleVariableRefSection3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructRef_in_ruleVariableRefSection3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayRef_in_entryRuleArrayRef3456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayRef3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArrayRef3503 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleArrayRef3524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArrayRef3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructRef_in_entryRuleStructRef3572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructRef3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructRef3619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructRef3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperationCall3733 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperationCall3745 = new BitSet(new long[]{0x0001C00E000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall3767 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationCall3780 = new BitSet(new long[]{0x0001C006000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_ruleOperationCall3801 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleOperationCall3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallParameter_in_entryRuleOperationCallParameter3853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallParameter3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperationCallParameter3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelReference_in_ruleOperationCallParameter3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation3972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4024 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation4041 = new BitSet(new long[]{0x00C0000804000010L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4063 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleOperation4076 = new BitSet(new long[]{0x00C0000004000010L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_ruleOperation4097 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleOperation4113 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperation4125 = new BitSet(new long[]{0x00020000C2000010L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleOperation4146 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOperation4158 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperation4171 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOperation4193 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperation4220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperation4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_entryRuleOperationBlock4271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationBlock4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationStep_in_ruleOperationBlock4336 = new BitSet(new long[]{0x00020000C0000012L});
    public static final BitSet FOLLOW_ruleParameterVariable_in_entryRuleParameterVariable4373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterVariable4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterKind_in_ruleParameterVariable4429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleParameterVariable4451 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParameterVariable4464 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleParameterVariable4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition4523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperatorDefinition4570 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleOperationRole_in_ruleOperatorDefinition4591 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperatorDefinition4603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4626 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleOperatorDefinition4639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperatorDefinition4662 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleOperatorDefinition4677 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOperatorDefinition4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedBinary_in_entryRuleLinkedBinary4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBinary4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLinkedBinary4774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedBinary4791 = new BitSet(new long[]{0x0040000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleBinaryType_in_ruleLinkedBinary4817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkedBinary4830 = new BitSet(new long[]{0x0000310002000000L});
    public static final BitSet FOLLOW_ruleBinarySection_in_ruleLinkedBinary4851 = new BitSet(new long[]{0x0000310002000000L});
    public static final BitSet FOLLOW_25_in_ruleLinkedBinary4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinarySection_in_entryRuleBinarySection4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinarySection4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_ruleBinarySection4958 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_ruleBinarySection4985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_ruleBinarySection5012 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBinarySection5024 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinarySection5045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBinarySection5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBinarySection_in_entryRuleFunctionBinarySection5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBinarySection5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFunctionBinarySection5140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionBinarySection5163 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionBinarySection5175 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionBinarySection5187 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBinarySection5199 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionBinarySection5220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection5232 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_ruleFunctionBinarySection5254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionBinarySection5266 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionBinarySection5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemory_in_entryRuleFunctionMemory5316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionMemory5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFunctionMemory5363 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory5384 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleFunctionMemory5396 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleFunctionMemory5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantBinarySection_in_entryRuleConstantBinarySection5453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantBinarySection5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleConstantBinarySection5500 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstantBinarySection5512 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleConstantBinarySection5534 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstantBinarySection5546 = new BitSet(new long[]{0x0001C004020000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_25_in_ruleConstantBinarySection5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceBinarySection_in_entryRuleReferenceBinarySection5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceBinarySection5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReferenceBinarySection5643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferenceBinarySection5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression5702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression5_in_ruleXExpression5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_ruleXPrimaryExpression5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_ruleXPrimaryExpression5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXPrimaryExpression5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCall_in_ruleXPrimaryExpression5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAddressOfVar_in_ruleXPrimaryExpression5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_ruleXPrimaryExpression6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_ruleXPrimaryExpression6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSizeOfExpression_in_entryRuleXSizeOfExpression6073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSizeOfExpression6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXSizeOfExpression6120 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXSizeOfExpression6132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXSizeOfExpression6155 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXSizeOfExpression6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStructExpression_in_entryRuleXStructExpression6203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStructExpression6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXStructExpression6261 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXStructExpression6273 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression6294 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXStructExpression6307 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXStructExpression6328 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXStructExpression6343 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXStructExpression6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_entryRuleXExpression16393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression16403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPERATOR_in_ruleXExpression16449 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXExpression16471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_entryRuleXExpression26507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression26517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression1_in_ruleXExpression26563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_ruleXExpression26595 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression26616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_entryRuleXExpression36654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression36664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression36710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000042000L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_ruleXExpression36742 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression2_in_ruleXExpression36763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000042000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_entryRuleXExpression46801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression46811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression46857 = new BitSet(new long[]{0x0000000180000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_ruleXExpression46889 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression3_in_ruleXExpression46910 = new BitSet(new long[]{0x0000000180000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleXExpression5_in_entryRuleXExpression56948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression56958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression57004 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_ruleXExpression57036 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression4_in_ruleXExpression57057 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleXExpressionLiteral_in_entryRuleXExpressionLiteral7095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionLiteral7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleXExpressionLiteral7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTopLevelExpression_in_entryRuleXTopLevelExpression7185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTopLevelExpression7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXTopLevelExpression7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXTopLevelExpression7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment7304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXAssignment7360 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment7376 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXAssignment7396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXAssignment7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign7445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAddressOfVar_in_entryRuleXAddressOfVar7532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAddressOfVar7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXAddressOfVar7579 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXAddressOfVar7591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXAddressOfVar7612 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXAddressOfVar7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIsLiteralExpression_in_entryRuleXIsLiteralExpression7660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIsLiteralExpression7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIsLiteralExpression7707 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIsLiteralExpression7719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleXIsLiteralExpression7740 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXIsLiteralExpression7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression7835 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXIfExpression7847 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7868 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXIfExpression7880 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression7892 = new BitSet(new long[]{0x00020000C2000010L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression7913 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression7925 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression7946 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression7959 = new BitSet(new long[]{0x00020000C2000010L});
    public static final BitSet FOLLOW_ruleOperationBlock_in_ruleXIfExpression7980 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleXParenthesizedExpression8077 = new BitSet(new long[]{0x0001C004000000F0L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8098 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXParenthesizedExpression8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimitiveKind8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimitiveKind8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimitiveKind8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleParameterKind8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleParameterKind8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleParameterKind8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOperationRole8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOperationRole8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOperationRole8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOperationRole8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOperationRole8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOperationRole8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOperationRole8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOperationRole8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperationRole8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperationRole8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperationRole8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperationRole8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperationRole8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationRole8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationRole8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperationRole8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperationRole8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperationRole8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperationRole8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperationRole8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinaryType8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBinaryType8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUNARY_OPERATOR8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleUNARY_OPERATOR8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMULTIPLICATIVE_OPERATOR8810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleMULTIPLICATIVE_OPERATOR8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMULTIPLICATIVE_OPERATOR8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleADDITIVE_OPERATOR8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleADDITIVE_OPERATOR8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleEQUALITY_OPERATOR8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleEQUALITY_OPERATOR8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleEQUALITY_OPERATOR8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEQUALITY_OPERATOR9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEQUALITY_OPERATOR9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEQUALITY_OPERATOR9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBOOLEAN_OPERATOR9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBOOLEAN_OPERATOR9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICATIVE_OPERATOR_in_synpred1_InternalESyntax6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDITIVE_OPERATOR_in_synpred2_InternalESyntax6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALITY_OPERATOR_in_synpred3_InternalESyntax6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_OPERATOR_in_synpred4_InternalESyntax7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred5_InternalESyntax7938 = new BitSet(new long[]{0x0000000000000002L});

}