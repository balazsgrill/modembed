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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'target'", "'{'", "'('", "')'", "'}'", "'.'", "';'", "'config'", "'at'", "'enum'", "'='", "'symbol'", "'var'", "'instance'", "'func'", "'label'"
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

                if ( (LA1_0==20||(LA1_0>=24 && LA1_0<=27)) ) {
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

                        if ( (LA2_0==RULE_ID) ) {
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:239:1: ruleModuleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModuleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:244:6: ( ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:1: ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:1: ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:2: ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:245:2: ( (lv_type_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:246:1: (lv_type_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:246:1: (lv_type_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:247:3: lv_type_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleParamAccess().getTypeQualifiedIDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleModuleParam366);
            lv_type_0_0=ruleQualifiedID();
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
            	        		"QualifiedID", 
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


    // $ANTLR start entryRuleQualifiedID
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:301:1: entryRuleQualifiedID returns [EObject current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final EObject entryRuleQualifiedID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedID = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:302:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:303:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID424);
            iv_ruleQualifiedID=ruleQualifiedID();
            _fsp--;

             current =iv_ruleQualifiedID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID434); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:310:1: ruleQualifiedID returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedID() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token lv_segments_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:315:6: ( ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:1: ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:1: ( ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:2: ( (lv_segments_0_0= RULE_ID ) ) ( '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:316:2: ( (lv_segments_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:317:1: (lv_segments_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:317:1: (lv_segments_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:318:3: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID476); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:340:2: ( '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:340:4: '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    match(input,18,FOLLOW_18_in_ruleQualifiedID492); 

            	            createLeafNode(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:344:1: ( (lv_segments_2_0= RULE_ID ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:345:1: (lv_segments_2_0= RULE_ID )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:345:1: (lv_segments_2_0= RULE_ID )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:346:3: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID509); 

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
            	    break loop4;
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:376:1: entryRuleModuleItem returns [EObject current=null] : iv_ruleModuleItem= ruleModuleItem EOF ;
    public final EObject entryRuleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleItem = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:377:2: (iv_ruleModuleItem= ruleModuleItem EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:378:2: iv_ruleModuleItem= ruleModuleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleItem_in_entryRuleModuleItem552);
            iv_ruleModuleItem=ruleModuleItem();
            _fsp--;

             current =iv_ruleModuleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleItem562); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:385:1: ruleModuleItem returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord ) ';' ) ;
    public final EObject ruleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Instance_1 = null;

        EObject this_Function_2 = null;

        EObject this_Symbol_3 = null;

        EObject this_ConfigurationWord_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:390:6: ( ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord ) ';' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord ) ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord ) ';' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord ) ';'
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:392:5: this_Variable_0= ruleVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getVariableParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleModuleItem610);
                    this_Variable_0=ruleVariable();
                    _fsp--;

                     
                            current = this_Variable_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:402:5: this_Instance_1= ruleInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstance_in_ruleModuleItem637);
                    this_Instance_1=ruleInstance();
                    _fsp--;

                     
                            current = this_Instance_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:412:5: this_Function_2= ruleFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleModuleItem664);
                    this_Function_2=ruleFunction();
                    _fsp--;

                     
                            current = this_Function_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:422:5: this_Symbol_3= ruleSymbol
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getSymbolParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSymbol_in_ruleModuleItem691);
                    this_Symbol_3=ruleSymbol();
                    _fsp--;

                     
                            current = this_Symbol_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:432:5: this_ConfigurationWord_4= ruleConfigurationWord
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getConfigurationWordParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConfigurationWord_in_ruleModuleItem718);
                    this_ConfigurationWord_4=ruleConfigurationWord();
                    _fsp--;

                     
                            current = this_ConfigurationWord_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleModuleItem728); 

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


    // $ANTLR start entryRuleConfigurationWord
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:452:1: entryRuleConfigurationWord returns [EObject current=null] : iv_ruleConfigurationWord= ruleConfigurationWord EOF ;
    public final EObject entryRuleConfigurationWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationWord = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:453:2: (iv_ruleConfigurationWord= ruleConfigurationWord EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:454:2: iv_ruleConfigurationWord= ruleConfigurationWord EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationWordRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord764);
            iv_ruleConfigurationWord=ruleConfigurationWord();
            _fsp--;

             current =iv_ruleConfigurationWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationWord774); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConfigurationWord


    // $ANTLR start ruleConfigurationWord
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:461:1: ruleConfigurationWord returns [EObject current=null] : ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' ) ;
    public final EObject ruleConfigurationWord() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_default_2_0 = null;

        EObject lv_fields_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:466:6: ( ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:467:1: ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:467:1: ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:467:3: 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleConfigurationWord809); 

                    createLeafNode(grammarAccess.getConfigurationWordAccess().getConfigKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:471:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:472:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:472:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:473:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationWord826); 

            			createLeafNode(grammarAccess.getConfigurationWordAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConfigurationWordRule().getType().getClassifier());
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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:495:2: ( (lv_default_2_0= ruleLiteralParam ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_HEXINT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:496:1: (lv_default_2_0= ruleLiteralParam )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:496:1: (lv_default_2_0= ruleLiteralParam )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:497:3: lv_default_2_0= ruleLiteralParam
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConfigurationWordAccess().getDefaultLiteralParamParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationWord852);
                    lv_default_2_0=ruleLiteralParam();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationWordRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"default",
                    	        		lv_default_2_0, 
                    	        		"LiteralParam", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleConfigurationWord863); 

                    createLeafNode(grammarAccess.getConfigurationWordAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:523:1: ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_HEXINT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:523:2: ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:523:2: ( (lv_fields_4_0= ruleConfigurationFieldPlace ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:524:1: (lv_fields_4_0= ruleConfigurationFieldPlace )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:524:1: (lv_fields_4_0= ruleConfigurationFieldPlace )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:525:3: lv_fields_4_0= ruleConfigurationFieldPlace
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConfigurationWordAccess().getFieldsConfigurationFieldPlaceParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_ruleConfigurationWord885);
            	    lv_fields_4_0=ruleConfigurationFieldPlace();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConfigurationWordRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_4_0, 
            	    	        		"ConfigurationFieldPlace", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,19,FOLLOW_19_in_ruleConfigurationWord895); 

            	            createLeafNode(grammarAccess.getConfigurationWordAccess().getSemicolonKeyword_4_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleConfigurationWord907); 

                    createLeafNode(grammarAccess.getConfigurationWordAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleConfigurationWord


    // $ANTLR start entryRuleConfigurationFieldPlace
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:563:1: entryRuleConfigurationFieldPlace returns [EObject current=null] : iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF ;
    public final EObject entryRuleConfigurationFieldPlace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationFieldPlace = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:564:2: (iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:565:2: iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationFieldPlaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace943);
            iv_ruleConfigurationFieldPlace=ruleConfigurationFieldPlace();
            _fsp--;

             current =iv_ruleConfigurationFieldPlace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationFieldPlace953); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConfigurationFieldPlace


    // $ANTLR start ruleConfigurationFieldPlace
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:572:1: ruleConfigurationFieldPlace returns [EObject current=null] : ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) ) ;
    public final EObject ruleConfigurationFieldPlace() throws RecognitionException {
        EObject current = null;

        EObject lv_bitNum_0_0 = null;

        EObject lv_startBit_2_0 = null;

        EObject lv_field_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:577:6: ( ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:578:1: ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:578:1: ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:578:2: ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:578:2: ( (lv_bitNum_0_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:579:1: (lv_bitNum_0_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:579:1: (lv_bitNum_0_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:580:3: lv_bitNum_0_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumLiteralParamParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace999);
            lv_bitNum_0_0=ruleLiteralParam();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConfigurationFieldPlaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"bitNum",
            	        		lv_bitNum_0_0, 
            	        		"LiteralParam", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleConfigurationFieldPlace1009); 

                    createLeafNode(grammarAccess.getConfigurationFieldPlaceAccess().getAtKeyword_1(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:606:1: ( (lv_startBit_2_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:607:1: (lv_startBit_2_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:607:1: (lv_startBit_2_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:608:3: lv_startBit_2_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitLiteralParamParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1030);
            lv_startBit_2_0=ruleLiteralParam();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConfigurationFieldPlaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"startBit",
            	        		lv_startBit_2_0, 
            	        		"LiteralParam", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:630:2: ( (lv_field_3_0= ruleConfigurationField ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:631:1: (lv_field_3_0= ruleConfigurationField )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:631:1: (lv_field_3_0= ruleConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:632:3: lv_field_3_0= ruleConfigurationField
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getFieldConfigurationFieldParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConfigurationField_in_ruleConfigurationFieldPlace1051);
            lv_field_3_0=ruleConfigurationField();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConfigurationFieldPlaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"field",
            	        		lv_field_3_0, 
            	        		"ConfigurationField", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleConfigurationFieldPlace


    // $ANTLR start entryRuleConfigurationField
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:662:1: entryRuleConfigurationField returns [EObject current=null] : iv_ruleConfigurationField= ruleConfigurationField EOF ;
    public final EObject entryRuleConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationField = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:663:2: (iv_ruleConfigurationField= ruleConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:664:2: iv_ruleConfigurationField= ruleConfigurationField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField1087);
            iv_ruleConfigurationField=ruleConfigurationField();
            _fsp--;

             current =iv_ruleConfigurationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationField1097); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConfigurationField


    // $ANTLR start ruleConfigurationField
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:671:1: ruleConfigurationField returns [EObject current=null] : this_EnumConfigurationField_0= ruleEnumConfigurationField ;
    public final EObject ruleConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject this_EnumConfigurationField_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:676:6: (this_EnumConfigurationField_0= ruleEnumConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:678:5: this_EnumConfigurationField_0= ruleEnumConfigurationField
            {
             
                    currentNode=createCompositeNode(grammarAccess.getConfigurationFieldAccess().getEnumConfigurationFieldParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField1143);
            this_EnumConfigurationField_0=ruleEnumConfigurationField();
            _fsp--;

             
                    current = this_EnumConfigurationField_0; 
                    currentNode = currentNode.getParent();
                

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
    // $ANTLR end ruleConfigurationField


    // $ANTLR start entryRuleEnumConfigurationField
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:694:1: entryRuleEnumConfigurationField returns [EObject current=null] : iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF ;
    public final EObject entryRuleEnumConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumConfigurationField = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:695:2: (iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:696:2: iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumConfigurationFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField1177);
            iv_ruleEnumConfigurationField=ruleEnumConfigurationField();
            _fsp--;

             current =iv_ruleEnumConfigurationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationField1187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumConfigurationField


    // $ANTLR start ruleEnumConfigurationField
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:703:1: ruleEnumConfigurationField returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' ) ;
    public final EObject ruleEnumConfigurationField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:708:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:709:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:709:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:709:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleEnumConfigurationField1222); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getEnumKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:713:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:714:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:714:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:715:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumConfigurationField1239); 

            			createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumConfigurationFieldRule().getType().getClassifier());
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

            match(input,14,FOLLOW_14_in_ruleEnumConfigurationField1254); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:741:1: ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:741:2: ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:741:2: ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:742:1: (lv_literals_3_0= ruleEnumConfigurationFieldLiteral )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:742:1: (lv_literals_3_0= ruleEnumConfigurationFieldLiteral )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:743:3: lv_literals_3_0= ruleEnumConfigurationFieldLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsEnumConfigurationFieldLiteralParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_ruleEnumConfigurationField1276);
            	    lv_literals_3_0=ruleEnumConfigurationFieldLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumConfigurationFieldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"literals",
            	    	        		lv_literals_3_0, 
            	    	        		"EnumConfigurationFieldLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,19,FOLLOW_19_in_ruleEnumConfigurationField1286); 

            	            createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleEnumConfigurationField1298); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleEnumConfigurationField


    // $ANTLR start entryRuleEnumConfigurationFieldLiteral
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:781:1: entryRuleEnumConfigurationFieldLiteral returns [EObject current=null] : iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF ;
    public final EObject entryRuleEnumConfigurationFieldLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumConfigurationFieldLiteral = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:782:2: (iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:783:2: iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumConfigurationFieldLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral1334);
            iv_ruleEnumConfigurationFieldLiteral=ruleEnumConfigurationFieldLiteral();
            _fsp--;

             current =iv_ruleEnumConfigurationFieldLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral1344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumConfigurationFieldLiteral


    // $ANTLR start ruleEnumConfigurationFieldLiteral
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:790:1: ruleEnumConfigurationFieldLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) ) ;
    public final EObject ruleEnumConfigurationFieldLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:795:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:796:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:796:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:796:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:796:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:797:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:797:1: (lv_name_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:798:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumConfigurationFieldLiteral1386); 

            			createLeafNode(grammarAccess.getEnumConfigurationFieldLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumConfigurationFieldLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleEnumConfigurationFieldLiteral1401); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldLiteralAccess().getEqualsSignKeyword_1(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:824:1: ( (lv_value_2_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:825:1: (lv_value_2_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:825:1: (lv_value_2_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:826:3: lv_value_2_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueLiteralParamParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleEnumConfigurationFieldLiteral1422);
            lv_value_2_0=ruleLiteralParam();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumConfigurationFieldLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"LiteralParam", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleEnumConfigurationFieldLiteral


    // $ANTLR start entryRuleSymbol
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:856:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:857:2: (iv_ruleSymbol= ruleSymbol EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:858:2: iv_ruleSymbol= ruleSymbol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol1458);
            iv_ruleSymbol=ruleSymbol();
            _fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol1468); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:865:1: ruleSymbol returns [EObject current=null] : ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:870:6: ( ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:871:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:871:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:871:3: 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
            {
            match(input,24,FOLLOW_24_in_ruleSymbol1503); 

                    createLeafNode(grammarAccess.getSymbolAccess().getSymbolKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:875:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:876:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:876:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:877:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol1520); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:899:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_HEXINT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("899:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:899:3: ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:899:3: ( (lv_value_2_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:900:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:900:1: (lv_value_2_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:901:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSymbol1543); 

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
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:924:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:924:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:925:1: (lv_value_3_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:925:1: (lv_value_3_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:926:3: lv_value_3_0= RULE_HEXINT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleSymbol1571); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:956:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:957:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:958:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1613);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1623); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:965:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:970:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:971:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:971:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:971:3: 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleVariable1658); 

                    createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:975:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:976:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:976:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:977:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1675); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1007:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1008:2: (iv_ruleInstance= ruleInstance EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1009:2: iv_ruleInstance= ruleInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance1716);
            iv_ruleInstance=ruleInstance();
            _fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance1726); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1016:1: ruleInstance returns [EObject current=null] : ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1021:6: ( ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1022:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1022:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )? )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1022:3: 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )?
            {
            match(input,26,FOLLOW_26_in_ruleInstance1761); 

                    createLeafNode(grammarAccess.getInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1026:1: ( (lv_type_1_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1027:1: (lv_type_1_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1027:1: (lv_type_1_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1028:3: lv_type_1_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleInstance1782);
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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1050:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1051:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1051:1: (lv_name_2_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1052:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1799); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1074:2: ( '(' ( (lv_params_4_0= ruleModuleParam ) )* ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1074:4: '(' ( (lv_params_4_0= ruleModuleParam ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleInstance1815); 

                            createLeafNode(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1078:1: ( (lv_params_4_0= ruleModuleParam ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1079:1: (lv_params_4_0= ruleModuleParam )
                    	    {
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1079:1: (lv_params_4_0= ruleModuleParam )
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1080:3: lv_params_4_0= ruleModuleParam
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleParam_in_ruleInstance1836);
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
                    	    break loop10;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleInstance1847); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1114:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1115:2: (iv_ruleFunction= ruleFunction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1116:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1885);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1895); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1123:1: ruleFunction returns [EObject current=null] : ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_step_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1128:6: ( ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1129:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1129:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1129:3: 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleFunction1930); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFuncKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1133:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1134:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1134:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1135:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1947); 

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

            match(input,14,FOLLOW_14_in_ruleFunction1962); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1161:1: ( ( (lv_step_3_0= ruleStep ) ) ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1161:2: ( (lv_step_3_0= ruleStep ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1161:2: ( (lv_step_3_0= ruleStep ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1162:1: (lv_step_3_0= ruleStep )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1162:1: (lv_step_3_0= ruleStep )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1163:3: lv_step_3_0= ruleStep
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleFunction1984);
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

            	    match(input,19,FOLLOW_19_in_ruleFunction1994); 

            	            createLeafNode(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleFunction2006); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1201:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1202:2: (iv_ruleStep= ruleStep EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1203:2: iv_ruleStep= ruleStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2042);
            iv_ruleStep=ruleStep();
            _fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2052); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1210:1: ruleStep returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Label_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1215:6: ( (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1216:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1216:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1216:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1217:5: this_Instruction_0= ruleInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getInstructionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleStep2099);
                    this_Instruction_0=ruleInstruction();
                    _fsp--;

                     
                            current = this_Instruction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1227:5: this_Label_1= ruleLabel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getLabelParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleStep2126);
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1243:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1244:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1245:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2161);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2171); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1252:1: ruleLabel returns [EObject current=null] : ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1257:6: ( ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1258:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1258:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1258:3: 'label' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleLabel2206); 

                    createLeafNode(grammarAccess.getLabelAccess().getLabelKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1262:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1263:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1263:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1264:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2223); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1294:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1295:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1296:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction2264);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction2274); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1303:1: ruleInstruction returns [EObject current=null] : ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_ins_0_0=null;
        EObject lv_params_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1308:6: ( ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1309:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1309:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )* )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1309:2: ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParam ) )*
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1309:2: ( (lv_ins_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1310:1: (lv_ins_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1310:1: (lv_ins_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1311:3: lv_ins_0_0= RULE_ID
            {
            lv_ins_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction2316); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1333:2: ( (lv_params_1_0= ruleParam ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_HEXINT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1334:1: (lv_params_1_0= ruleParam )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1334:1: (lv_params_1_0= ruleParam )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1335:3: lv_params_1_0= ruleParam
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleInstruction2342);
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
            	    break loop14;
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1365:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1366:2: (iv_ruleParam= ruleParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1367:2: iv_ruleParam= ruleParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2379);
            iv_ruleParam=ruleParam();
            _fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2389); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1374:1: ruleParam returns [EObject current=null] : (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralParam_0 = null;

        EObject this_RefParam_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1379:6: ( (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1380:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1380:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_HEXINT)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1380:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1381:5: this_LiteralParam_0= ruleLiteralParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteralParam_in_ruleParam2436);
                    this_LiteralParam_0=ruleLiteralParam();
                    _fsp--;

                     
                            current = this_LiteralParam_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1391:5: this_RefParam_1= ruleRefParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParamAccess().getRefParamParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRefParam_in_ruleParam2463);
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1407:1: entryRuleLiteralParam returns [EObject current=null] : iv_ruleLiteralParam= ruleLiteralParam EOF ;
    public final EObject entryRuleLiteralParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1408:2: (iv_ruleLiteralParam= ruleLiteralParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1409:2: iv_ruleLiteralParam= ruleLiteralParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam2498);
            iv_ruleLiteralParam=ruleLiteralParam();
            _fsp--;

             current =iv_ruleLiteralParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralParam2508); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1416:1: ruleLiteralParam returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) ;
    public final EObject ruleLiteralParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1421:6: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1422:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1422:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_HEXINT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1422:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1422:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1422:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1423:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1423:1: (lv_value_0_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1424:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralParam2550); 

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
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1447:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1447:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1448:1: (lv_value_1_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1448:1: (lv_value_1_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1449:3: lv_value_1_0= RULE_HEXINT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLiteralParam2578); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1479:1: entryRuleRefParam returns [EObject current=null] : iv_ruleRefParam= ruleRefParam EOF ;
    public final EObject entryRuleRefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1480:2: (iv_ruleRefParam= ruleRefParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1481:2: iv_ruleRefParam= ruleRefParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleRefParam_in_entryRuleRefParam2619);
            iv_ruleRefParam=ruleRefParam();
            _fsp--;

             current =iv_ruleRefParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefParam2629); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1488:1: ruleRefParam returns [EObject current=null] : ( (lv_ref_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleRefParam() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1493:6: ( ( (lv_ref_0_0= ruleQualifiedID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1494:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1494:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1495:1: (lv_ref_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1495:1: (lv_ref_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1496:3: lv_ref_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleRefParam2674);
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
    public static final BitSet FOLLOW_14_in_ruleModule193 = new BitSet(new long[]{0x000000000F128000L});
    public static final BitSet FOLLOW_ruleModuleItem_in_ruleModule214 = new BitSet(new long[]{0x000000000F128000L});
    public static final BitSet FOLLOW_15_in_ruleModule226 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleModuleParam_in_ruleModule247 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModule258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModule270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParam_in_entryRuleModuleParam310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleParam320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleModuleParam366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleParam383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID476 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedID492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID509 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleModuleItem_in_entryRuleModuleItem552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleItem562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleModuleItem610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleModuleItem637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleModuleItem664 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSymbol_in_ruleModuleItem691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleConfigurationWord_in_ruleModuleItem718 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModuleItem728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationWord774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConfigurationWord809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationWord826 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationWord852 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigurationWord863 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_ruleConfigurationWord885 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConfigurationWord895 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_17_in_ruleConfigurationWord907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationFieldPlace953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace999 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConfigurationFieldPlace1009 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_ruleConfigurationFieldPlace1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationField1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationField1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumConfigurationField1222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumConfigurationField1239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumConfigurationField1254 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_ruleEnumConfigurationField1276 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumConfigurationField1286 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEnumConfigurationField1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumConfigurationFieldLiteral1386 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumConfigurationFieldLiteral1401 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleEnumConfigurationFieldLiteral1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSymbol1503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol1520 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSymbol1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleSymbol1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVariable1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInstance1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleInstance1782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1799 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleInstance1815 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleModuleParam_in_ruleInstance1836 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleInstance1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunction1930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1947 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunction1962 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleFunction1984 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction1994 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_17_in_ruleFunction2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleStep2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleStep2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLabel2206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction2264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction2316 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleParam_in_ruleInstruction2342 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleParam2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_ruleParam2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralParam2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralParam2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLiteralParam2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_entryRuleRefParam2619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefParam2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleRefParam2674 = new BitSet(new long[]{0x0000000000000002L});

}