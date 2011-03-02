package hu.cubussapiens.modembed.modularasm.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import hu.cubussapiens.modembed.modularasm.services.ModularASMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModularASMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'target'", "'{'", "'('", "')'", "'}'", "'literal'", "'callback'", "'address'", "'.'", "';'", "'public'", "'symbol'", "'var'", "'instance'", "'func'", "'label'"
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
    public String getGrammarFileName() { return "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g"; }



     	private ModularASMGrammarAccess grammarAccess;
     	
        public InternalModularASMParser(TokenStream input, IAstFactory factory, ModularASMGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected ModularASMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModule
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:77:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:81:2: (iv_ruleModule= ruleModule EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:82:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule81);
            iv_ruleModule=ruleModule();
            _fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:92:1: ruleModule returns [EObject current=null] : ( 'module' ( (lv_name_1_0= RULE_ID ) ) 'target' ( (lv_target_3_0= ruleQualifiedID ) ) '{' ( (lv_items_5_0= ruleModuleItem ) )* ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )? '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_target_3_0 = null;

        EObject lv_items_5_0 = null;

        EObject lv_params_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:98:6: ( ( 'module' ( (lv_name_1_0= RULE_ID ) ) 'target' ( (lv_target_3_0= ruleQualifiedID ) ) '{' ( (lv_items_5_0= ruleModuleItem ) )* ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )? '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:99:1: ( 'module' ( (lv_name_1_0= RULE_ID ) ) 'target' ( (lv_target_3_0= ruleQualifiedID ) ) '{' ( (lv_items_5_0= ruleModuleItem ) )* ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )? '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:99:1: ( 'module' ( (lv_name_1_0= RULE_ID ) ) 'target' ( (lv_target_3_0= ruleQualifiedID ) ) '{' ( (lv_items_5_0= ruleModuleItem ) )* ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )? '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:99:3: 'module' ( (lv_name_1_0= RULE_ID ) ) 'target' ( (lv_target_3_0= ruleQualifiedID ) ) '{' ( (lv_items_5_0= ruleModuleItem ) )* ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )? '}'
            {
            match(input,12,FOLLOW_12_in_ruleModule130); 

                    createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:103:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:104:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:104:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:105:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule147); 

            			createLeafNode(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleModule162); 

                    createLeafNode(grammarAccess.getModuleAccess().getTargetKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:131:1: ( (lv_target_3_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:132:1: (lv_target_3_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:132:1: (lv_target_3_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:133:3: lv_target_3_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getTargetQualifiedIDParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleModule183);
            lv_target_3_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"target",
            	        		lv_target_3_0, 
            	        		"QualifiedID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleModule193); 

                    createLeafNode(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:159:1: ( (lv_items_5_0= ruleModuleItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=24 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:160:1: (lv_items_5_0= ruleModuleItem )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:160:1: (lv_items_5_0= ruleModuleItem )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:161:3: lv_items_5_0= ruleModuleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModuleItem_in_ruleModule214);
            	    lv_items_5_0=ruleModuleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_5_0, 
            	    	        		"ModuleItem", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:183:3: ( '(' ( (lv_params_7_0= ruleModuleParam ) )* ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:183:5: '(' ( (lv_params_7_0= ruleModuleParam ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleModule226); 

                            createLeafNode(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_6_0(), null); 
                        
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:187:1: ( (lv_params_7_0= ruleModuleParam ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:188:1: (lv_params_7_0= ruleModuleParam )
                    	    {
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:188:1: (lv_params_7_0= ruleModuleParam )
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:189:3: lv_params_7_0= ruleModuleParam
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getParamsModuleParamParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleParam_in_ruleModule247);
                    	    lv_params_7_0=ruleModuleParam();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"params",
                    	    	        		lv_params_7_0, 
                    	    	        		"ModuleParam", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleModule258); 

                            createLeafNode(grammarAccess.getModuleAccess().getRightParenthesisKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleModule270); 

                    createLeafNode(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleModuleParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:230:1: entryRuleModuleParam returns [EObject current=null] : iv_ruleModuleParam= ruleModuleParam EOF ;
    public final EObject entryRuleModuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:231:2: (iv_ruleModuleParam= ruleModuleParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:232:2: iv_ruleModuleParam= ruleModuleParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleParam_in_entryRuleModuleParam310);
            iv_ruleModuleParam=ruleModuleParam();
            _fsp--;

             current =iv_ruleModuleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleParam320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleParam


    // $ANTLR start ruleModuleParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:239:1: ruleModuleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleModuleParamType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModuleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:244:6: ( ( ( (lv_type_0_0= ruleModuleParamType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:1: ( ( (lv_type_0_0= ruleModuleParamType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:1: ( ( (lv_type_0_0= ruleModuleParamType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:2: ( (lv_type_0_0= ruleModuleParamType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:2: ( (lv_type_0_0= ruleModuleParamType ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:246:1: (lv_type_0_0= ruleModuleParamType )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:246:1: (lv_type_0_0= ruleModuleParamType )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:247:3: lv_type_0_0= ruleModuleParamType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleParamAccess().getTypeModuleParamTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModuleParamType_in_ruleModuleParam366);
            lv_type_0_0=ruleModuleParamType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleParamRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"ModuleParamType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:269:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:270:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModuleParam383); 

            			createLeafNode(grammarAccess.getModuleParamAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleParamRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleParam


    // $ANTLR start entryRuleModuleParamType
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:301:1: entryRuleModuleParamType returns [String current=null] : iv_ruleModuleParamType= ruleModuleParamType EOF ;
    public final String entryRuleModuleParamType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleParamType = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:302:2: (iv_ruleModuleParamType= ruleModuleParamType EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:303:2: iv_ruleModuleParamType= ruleModuleParamType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleParamTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleParamType_in_entryRuleModuleParamType425);
            iv_ruleModuleParamType=ruleModuleParamType();
            _fsp--;

             current =iv_ruleModuleParamType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleParamType436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleParamType


    // $ANTLR start ruleModuleParamType
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:310:1: ruleModuleParamType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'literal' | kw= 'callback' | kw= 'address' ) ;
    public final AntlrDatatypeRuleToken ruleModuleParamType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:315:6: ( (kw= 'literal' | kw= 'callback' | kw= 'address' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:1: (kw= 'literal' | kw= 'callback' | kw= 'address' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:1: (kw= 'literal' | kw= 'callback' | kw= 'address' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("316:1: (kw= 'literal' | kw= 'callback' | kw= 'address' )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:317:2: kw= 'literal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleModuleParamType474); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getModuleParamTypeAccess().getLiteralKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:324:2: kw= 'callback'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleModuleParamType493); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getModuleParamTypeAccess().getCallbackKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:331:2: kw= 'address'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleModuleParamType512); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getModuleParamTypeAccess().getAddressKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleParamType


    // $ANTLR start entryRuleQualifiedID
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:344:1: entryRuleQualifiedID returns [EObject current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final EObject entryRuleQualifiedID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedID = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:345:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:346:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID552);
            iv_ruleQualifiedID=ruleQualifiedID();
            _fsp--;

             current =iv_ruleQualifiedID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedID


    // $ANTLR start ruleQualifiedID
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:353:1: ruleQualifiedID returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedID() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token lv_segments_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:358:6: ( ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:359:1: ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:359:1: ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:359:2: ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:359:2: ( (lv_segments_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:360:1: (lv_segments_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:360:1: (lv_segments_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:361:3: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID604); 

            			createLeafNode(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_0_0(), "segments"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQualifiedIDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"segments",
            	        		lv_segments_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:383:2: ( '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:383:4: '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleQualifiedID620); 

            	            createLeafNode(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:387:1: ( (lv_segments_2_0= RULE_ID ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:388:1: (lv_segments_2_0= RULE_ID )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:388:1: (lv_segments_2_0= RULE_ID )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:389:3: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID637); 

            	    			createLeafNode(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_1_1_0(), "segments"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQualifiedIDRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"segments",
            	    	        		lv_segments_2_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
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


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedID


    // $ANTLR start entryRuleModuleItem
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:419:1: entryRuleModuleItem returns [EObject current=null] : iv_ruleModuleItem= ruleModuleItem EOF ;
    public final EObject entryRuleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleItem = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:420:2: (iv_ruleModuleItem= ruleModuleItem EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:421:2: iv_ruleModuleItem= ruleModuleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleItem_in_entryRuleModuleItem680);
            iv_ruleModuleItem=ruleModuleItem();
            _fsp--;

             current =iv_ruleModuleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleItem690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleItem


    // $ANTLR start ruleModuleItem
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:428:1: ruleModuleItem returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol ) ';' ) ;
    public final EObject ruleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Instance_1 = null;

        EObject this_Function_2 = null;

        EObject this_Symbol_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:433:6: ( ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol ) ';' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:434:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol ) ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:434:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol ) ';' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:434:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol ) ';'
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:434:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("434:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:435:5: this_Variable_0= ruleVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getVariableParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleModuleItem738);
                    this_Variable_0=ruleVariable();
                    _fsp--;

                     
                            current = this_Variable_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:445:5: this_Instance_1= ruleInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstance_in_ruleModuleItem765);
                    this_Instance_1=ruleInstance();
                    _fsp--;

                     
                            current = this_Instance_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:455:5: this_Function_2= ruleFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleModuleItem792);
                    this_Function_2=ruleFunction();
                    _fsp--;

                     
                            current = this_Function_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:465:5: this_Symbol_3= ruleSymbol
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getSymbolParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSymbol_in_ruleModuleItem819);
                    this_Symbol_3=ruleSymbol();
                    _fsp--;

                     
                            current = this_Symbol_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleModuleItem829); 

                    createLeafNode(grammarAccess.getModuleItemAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleItem


    // $ANTLR start entryRuleModifier
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:485:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:486:2: (iv_ruleModifier= ruleModifier EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:487:2: iv_ruleModifier= ruleModifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier866);
            iv_ruleModifier=ruleModifier();
            _fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModifier


    // $ANTLR start ruleModifier
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:494:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'public' ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:499:6: (kw= 'public' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:501:2: kw= 'public'
            {
            kw=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleModifier914); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getModifierAccess().getPublicKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModifier


    // $ANTLR start entryRuleSymbol
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:516:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:517:2: (iv_ruleSymbol= ruleSymbol EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:518:2: iv_ruleSymbol= ruleSymbol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol955);
            iv_ruleSymbol=ruleSymbol();
            _fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSymbol


    // $ANTLR start ruleSymbol
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:525:1: ruleSymbol returns [EObject current=null] : ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:530:6: ( ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:531:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:531:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:531:3: 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
            {
            match(input,24,FOLLOW_24_in_ruleSymbol1000); 

                    createLeafNode(grammarAccess.getSymbolAccess().getSymbolKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:535:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:536:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:536:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:537:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol1017); 

            			createLeafNode(grammarAccess.getSymbolAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSymbolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:559:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_HEXINT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("559:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:559:3: ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:559:3: ( (lv_value_2_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:560:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:560:1: (lv_value_2_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:561:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSymbol1040); 

                    			createLeafNode(grammarAccess.getSymbolAccess().getValueINTTerminalRuleCall_2_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSymbolRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:584:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:584:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:585:1: (lv_value_3_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:585:1: (lv_value_3_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:586:3: lv_value_3_0= RULE_HEXINT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleSymbol1068); 

                    			createLeafNode(grammarAccess.getSymbolAccess().getValueHEXINTTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSymbolRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"HEXINT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSymbol


    // $ANTLR start entryRuleVariable
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:616:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:617:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:618:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1110);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:625:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:630:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:631:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:631:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:631:3: 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleVariable1155); 

                    createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:636:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:636:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1172); 

            			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleInstance
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:667:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:668:2: (iv_ruleInstance= ruleInstance EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:669:2: iv_ruleInstance= ruleInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance1213);
            iv_ruleInstance=ruleInstance();
            _fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance1223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstance


    // $ANTLR start ruleInstance
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:676:1: ruleInstance returns [EObject current=null] : ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:681:6: ( ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:682:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:682:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:682:3: 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )?
            {
            match(input,26,FOLLOW_26_in_ruleInstance1258); 

                    createLeafNode(grammarAccess.getInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:686:1: ( (lv_type_1_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:687:1: (lv_type_1_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:687:1: (lv_type_1_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:688:3: lv_type_1_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleInstance1279);
            lv_type_1_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"QualifiedID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:710:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:711:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:711:1: (lv_name_2_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:712:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1296); 

            			createLeafNode(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:734:2: ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:734:4: '(' ( (lv_params_4_0= ruleModuleParam ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleInstance1312); 

                            createLeafNode(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:738:1: ( (lv_params_4_0= ruleModuleParam ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=18 && LA8_0<=20)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:739:1: (lv_params_4_0= ruleModuleParam )
                    	    {
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:739:1: (lv_params_4_0= ruleModuleParam )
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:740:3: lv_params_4_0= ruleModuleParam
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleParam_in_ruleInstance1333);
                    	    lv_params_4_0=ruleModuleParam();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInstanceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"params",
                    	    	        		lv_params_4_0, 
                    	    	        		"ModuleParam", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleInstance1344); 

                            createLeafNode(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstance


    // $ANTLR start entryRuleFunction
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:774:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:775:2: (iv_ruleFunction= ruleFunction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:776:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1382);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:783:1: ruleFunction returns [EObject current=null] : ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_step_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:788:6: ( ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:789:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:789:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:789:3: 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleFunction1427); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFuncKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:793:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:794:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:794:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:795:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1444); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleFunction1459); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:821:1: ( ( (lv_step_3_0= ruleStep ) ) ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:821:2: ( (lv_step_3_0= ruleStep ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:821:2: ( (lv_step_3_0= ruleStep ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:822:1: (lv_step_3_0= ruleStep )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:822:1: (lv_step_3_0= ruleStep )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:823:3: lv_step_3_0= ruleStep
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleFunction1481);
            	    lv_step_3_0=ruleStep();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"step",
            	    	        		lv_step_3_0, 
            	    	        		"Step", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,22,FOLLOW_22_in_ruleFunction1491); 

            	            createLeafNode(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleFunction1503); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleStep
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:861:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:862:2: (iv_ruleStep= ruleStep EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:863:2: iv_ruleStep= ruleStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1539);
            iv_ruleStep=ruleStep();
            _fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStep


    // $ANTLR start ruleStep
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:870:1: ruleStep returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Label_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:875:6: ( (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:876:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:876:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("876:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:877:5: this_Instruction_0= ruleInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getInstructionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleStep1596);
                    this_Instruction_0=ruleInstruction();
                    _fsp--;

                     
                            current = this_Instruction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:887:5: this_Label_1= ruleLabel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getLabelParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleStep1623);
                    this_Label_1=ruleLabel();
                    _fsp--;

                     
                            current = this_Label_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStep


    // $ANTLR start entryRuleLabel
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:903:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:904:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:905:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1658);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:912:1: ruleLabel returns [EObject current=null] : ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:917:6: ( ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:918:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:918:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:918:3: 'label' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleLabel1703); 

                    createLeafNode(grammarAccess.getLabelAccess().getLabelKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:922:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:923:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:923:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:924:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel1720); 

            			createLeafNode(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRuleInstruction
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:954:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:955:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:956:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1761);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstruction


    // $ANTLR start ruleInstruction
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:963:1: ruleInstruction returns [EObject current=null] : ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_ins_0_0=null;
        EObject lv_params_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:968:6: ( ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:969:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:969:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:969:2: ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )*
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:969:2: ( (lv_ins_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:970:1: (lv_ins_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:970:1: (lv_ins_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:971:3: lv_ins_0_0= RULE_ID
            {
            lv_ins_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction1813); 

            			createLeafNode(grammarAccess.getInstructionAccess().getInsIDTerminalRuleCall_0_0(), "ins"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ins",
            	        		lv_ins_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:993:2: ( (lv_params_1_0= ruleParam ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_HEXINT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:994:1: (lv_params_1_0= ruleParam )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:994:1: (lv_params_1_0= ruleParam )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:995:3: lv_params_1_0= ruleParam
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleInstruction1839);
            	    lv_params_1_0=ruleParam();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"params",
            	    	        		lv_params_1_0, 
            	    	        		"Param", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstruction


    // $ANTLR start entryRuleParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1025:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1026:2: (iv_ruleParam= ruleParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1027:2: iv_ruleParam= ruleParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1876);
            iv_ruleParam=ruleParam();
            _fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1886); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParam


    // $ANTLR start ruleParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1034:1: ruleParam returns [EObject current=null] : (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralParam_0 = null;

        EObject this_RefParam_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1039:6: ( (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1040:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1040:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_HEXINT)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1040:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1041:5: this_LiteralParam_0= ruleLiteralParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteralParam_in_ruleParam1933);
                    this_LiteralParam_0=ruleLiteralParam();
                    _fsp--;

                     
                            current = this_LiteralParam_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1051:5: this_RefParam_1= ruleRefParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParamAccess().getRefParamParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRefParam_in_ruleParam1960);
                    this_RefParam_1=ruleRefParam();
                    _fsp--;

                     
                            current = this_RefParam_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParam


    // $ANTLR start entryRuleLiteralParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1067:1: entryRuleLiteralParam returns [EObject current=null] : iv_ruleLiteralParam= ruleLiteralParam EOF ;
    public final EObject entryRuleLiteralParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1068:2: (iv_ruleLiteralParam= ruleLiteralParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1069:2: iv_ruleLiteralParam= ruleLiteralParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam1995);
            iv_ruleLiteralParam=ruleLiteralParam();
            _fsp--;

             current =iv_ruleLiteralParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralParam2005); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralParam


    // $ANTLR start ruleLiteralParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1076:1: ruleLiteralParam returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) ;
    public final EObject ruleLiteralParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1081:6: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1082:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1082:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_HEXINT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1082:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1082:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1082:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1083:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1083:1: (lv_value_0_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1084:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralParam2047); 

                    			createLeafNode(grammarAccess.getLiteralParamAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1107:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1107:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1108:1: (lv_value_1_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1108:1: (lv_value_1_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1109:3: lv_value_1_0= RULE_HEXINT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLiteralParam2075); 

                    			createLeafNode(grammarAccess.getLiteralParamAccess().getValueHEXINTTerminalRuleCall_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_1_0, 
                    	        		"HEXINT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralParam


    // $ANTLR start entryRuleRefParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1139:1: entryRuleRefParam returns [EObject current=null] : iv_ruleRefParam= ruleRefParam EOF ;
    public final EObject entryRuleRefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1140:2: (iv_ruleRefParam= ruleRefParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1141:2: iv_ruleRefParam= ruleRefParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleRefParam_in_entryRuleRefParam2116);
            iv_ruleRefParam=ruleRefParam();
            _fsp--;

             current =iv_ruleRefParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefParam2126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRefParam


    // $ANTLR start ruleRefParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1148:1: ruleRefParam returns [EObject current=null] : ( (lv_ref_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleRefParam() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1153:6: ( ( (lv_ref_0_0= ruleQualifiedID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1154:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1154:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1155:1: (lv_ref_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1155:1: (lv_ref_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1156:3: lv_ref_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleRefParam2171);
            lv_ref_0_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRefParamRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_0_0, 
            	        		"QualifiedID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRefParam


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModule130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule147 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleModule183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModule193 = new BitSet(new long[]{0x000000000F028000L});
    public static final BitSet FOLLOW_ruleModuleItem_in_ruleModule214 = new BitSet(new long[]{0x000000000F028000L});
    public static final BitSet FOLLOW_15_in_ruleModule226 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_ruleModuleParam_in_ruleModule247 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_16_in_ruleModule258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModule270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParam_in_entryRuleModuleParam310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleParam320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParamType_in_ruleModuleParam366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleParam383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParamType_in_entryRuleModuleParamType425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleParamType436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModuleParamType474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModuleParamType493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModuleParamType512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID604 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedID620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID637 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleModuleItem_in_entryRuleModuleItem680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleItem690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleModuleItem738 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleModuleItem765 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleModuleItem792 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSymbol_in_ruleModuleItem819 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModuleItem829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModifier914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSymbol1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol1017 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSymbol1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleSymbol1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVariable1155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInstance1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleInstance1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1296 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleInstance1312 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_ruleModuleParam_in_ruleInstance1333 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_16_in_ruleInstance1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunction1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1444 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunction1459 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleFunction1481 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunction1491 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_17_in_ruleFunction1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleStep1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleStep1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLabel1703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction1813 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleParam_in_ruleInstruction1839 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleParam1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_ruleParam1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralParam2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralParam2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLiteralParam2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_entryRuleRefParam2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefParam2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleRefParam2171 = new BitSet(new long[]{0x0000000000000002L});

}