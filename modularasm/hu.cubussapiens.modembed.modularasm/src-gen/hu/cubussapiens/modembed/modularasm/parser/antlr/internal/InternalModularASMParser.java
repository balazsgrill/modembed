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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'target'", "'{'", "'('", "')'", "'}'", "'.'", "';'", "'config'", "'at'", "'enum'", "'='", "'symbol'", "'var'", "'instance'", "'func'", "'method'", "'label'"
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

                if ( (LA1_0==20||(LA1_0>=24 && LA1_0<=28)) ) {
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:385:1: ruleModuleItem returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod ) ';' ) ;
    public final EObject ruleModuleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Instance_1 = null;

        EObject this_Function_2 = null;

        EObject this_Symbol_3 = null;

        EObject this_ConfigurationWord_4 = null;

        EObject this_Method_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:390:6: ( ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod ) ';' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod ) ';' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:1: ( (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod ) ';' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod ) ';'
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod )
            int alt5=6;
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
            case 28:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("391:2: (this_Variable_0= ruleVariable | this_Instance_1= ruleInstance | this_Function_2= ruleFunction | this_Symbol_3= ruleSymbol | this_ConfigurationWord_4= ruleConfigurationWord | this_Method_5= ruleMethod )", 5, 0, input);

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
                case 6 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:442:5: this_Method_5= ruleMethod
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleItemAccess().getMethodParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleModuleItem745);
                    this_Method_5=ruleMethod();
                    _fsp--;

                     
                            current = this_Method_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleModuleItem755); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:462:1: entryRuleConfigurationWord returns [EObject current=null] : iv_ruleConfigurationWord= ruleConfigurationWord EOF ;
    public final EObject entryRuleConfigurationWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationWord = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:463:2: (iv_ruleConfigurationWord= ruleConfigurationWord EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:464:2: iv_ruleConfigurationWord= ruleConfigurationWord EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationWordRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord791);
            iv_ruleConfigurationWord=ruleConfigurationWord();
            _fsp--;

             current =iv_ruleConfigurationWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationWord801); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:471:1: ruleConfigurationWord returns [EObject current=null] : ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' ) ;
    public final EObject ruleConfigurationWord() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_default_2_0 = null;

        EObject lv_fields_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:476:6: ( ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:477:1: ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:477:1: ( 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:477:3: 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_default_2_0= ruleLiteralParam ) )? '{' ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleConfigurationWord836); 

                    createLeafNode(grammarAccess.getConfigurationWordAccess().getConfigKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:481:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:482:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:482:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:483:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationWord853); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:505:2: ( (lv_default_2_0= ruleLiteralParam ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_HEXINT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:506:1: (lv_default_2_0= ruleLiteralParam )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:506:1: (lv_default_2_0= ruleLiteralParam )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:507:3: lv_default_2_0= ruleLiteralParam
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConfigurationWordAccess().getDefaultLiteralParamParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationWord879);
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

            match(input,14,FOLLOW_14_in_ruleConfigurationWord890); 

                    createLeafNode(grammarAccess.getConfigurationWordAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:533:1: ( ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_HEXINT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:533:2: ( (lv_fields_4_0= ruleConfigurationFieldPlace ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:533:2: ( (lv_fields_4_0= ruleConfigurationFieldPlace ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:534:1: (lv_fields_4_0= ruleConfigurationFieldPlace )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:534:1: (lv_fields_4_0= ruleConfigurationFieldPlace )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:535:3: lv_fields_4_0= ruleConfigurationFieldPlace
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConfigurationWordAccess().getFieldsConfigurationFieldPlaceParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_ruleConfigurationWord912);
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

            	    match(input,19,FOLLOW_19_in_ruleConfigurationWord922); 

            	            createLeafNode(grammarAccess.getConfigurationWordAccess().getSemicolonKeyword_4_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleConfigurationWord934); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:573:1: entryRuleConfigurationFieldPlace returns [EObject current=null] : iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF ;
    public final EObject entryRuleConfigurationFieldPlace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationFieldPlace = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:574:2: (iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:575:2: iv_ruleConfigurationFieldPlace= ruleConfigurationFieldPlace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationFieldPlaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace970);
            iv_ruleConfigurationFieldPlace=ruleConfigurationFieldPlace();
            _fsp--;

             current =iv_ruleConfigurationFieldPlace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationFieldPlace980); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:582:1: ruleConfigurationFieldPlace returns [EObject current=null] : ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) ) ;
    public final EObject ruleConfigurationFieldPlace() throws RecognitionException {
        EObject current = null;

        EObject lv_bitNum_0_0 = null;

        EObject lv_startBit_2_0 = null;

        EObject lv_field_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:587:6: ( ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:588:1: ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:588:1: ( ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:588:2: ( (lv_bitNum_0_0= ruleLiteralParam ) ) 'at' ( (lv_startBit_2_0= ruleLiteralParam ) ) ( (lv_field_3_0= ruleConfigurationField ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:588:2: ( (lv_bitNum_0_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:589:1: (lv_bitNum_0_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:589:1: (lv_bitNum_0_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:590:3: lv_bitNum_0_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getBitNumLiteralParamParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1026);
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

            match(input,21,FOLLOW_21_in_ruleConfigurationFieldPlace1036); 

                    createLeafNode(grammarAccess.getConfigurationFieldPlaceAccess().getAtKeyword_1(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:616:1: ( (lv_startBit_2_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:617:1: (lv_startBit_2_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:617:1: (lv_startBit_2_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:618:3: lv_startBit_2_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getStartBitLiteralParamParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1057);
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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:640:2: ( (lv_field_3_0= ruleConfigurationField ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:641:1: (lv_field_3_0= ruleConfigurationField )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:641:1: (lv_field_3_0= ruleConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:642:3: lv_field_3_0= ruleConfigurationField
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConfigurationFieldPlaceAccess().getFieldConfigurationFieldParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConfigurationField_in_ruleConfigurationFieldPlace1078);
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:672:1: entryRuleConfigurationField returns [EObject current=null] : iv_ruleConfigurationField= ruleConfigurationField EOF ;
    public final EObject entryRuleConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationField = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:673:2: (iv_ruleConfigurationField= ruleConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:674:2: iv_ruleConfigurationField= ruleConfigurationField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField1114);
            iv_ruleConfigurationField=ruleConfigurationField();
            _fsp--;

             current =iv_ruleConfigurationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationField1124); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:681:1: ruleConfigurationField returns [EObject current=null] : this_EnumConfigurationField_0= ruleEnumConfigurationField ;
    public final EObject ruleConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject this_EnumConfigurationField_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:686:6: (this_EnumConfigurationField_0= ruleEnumConfigurationField )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:688:5: this_EnumConfigurationField_0= ruleEnumConfigurationField
            {
             
                    currentNode=createCompositeNode(grammarAccess.getConfigurationFieldAccess().getEnumConfigurationFieldParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField1170);
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:704:1: entryRuleEnumConfigurationField returns [EObject current=null] : iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF ;
    public final EObject entryRuleEnumConfigurationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumConfigurationField = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:705:2: (iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:706:2: iv_ruleEnumConfigurationField= ruleEnumConfigurationField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumConfigurationFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField1204);
            iv_ruleEnumConfigurationField=ruleEnumConfigurationField();
            _fsp--;

             current =iv_ruleEnumConfigurationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationField1214); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:713:1: ruleEnumConfigurationField returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' ) ;
    public final EObject ruleEnumConfigurationField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:718:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:719:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:719:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:719:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleEnumConfigurationField1249); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getEnumKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:723:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:724:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:724:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:725:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumConfigurationField1266); 

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

            match(input,14,FOLLOW_14_in_ruleEnumConfigurationField1281); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:751:1: ( ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:751:2: ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:751:2: ( (lv_literals_3_0= ruleEnumConfigurationFieldLiteral ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:752:1: (lv_literals_3_0= ruleEnumConfigurationFieldLiteral )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:752:1: (lv_literals_3_0= ruleEnumConfigurationFieldLiteral )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:753:3: lv_literals_3_0= ruleEnumConfigurationFieldLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumConfigurationFieldAccess().getLiteralsEnumConfigurationFieldLiteralParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_ruleEnumConfigurationField1303);
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

            	    match(input,19,FOLLOW_19_in_ruleEnumConfigurationField1313); 

            	            createLeafNode(grammarAccess.getEnumConfigurationFieldAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleEnumConfigurationField1325); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:791:1: entryRuleEnumConfigurationFieldLiteral returns [EObject current=null] : iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF ;
    public final EObject entryRuleEnumConfigurationFieldLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumConfigurationFieldLiteral = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:792:2: (iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:793:2: iv_ruleEnumConfigurationFieldLiteral= ruleEnumConfigurationFieldLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumConfigurationFieldLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral1361);
            iv_ruleEnumConfigurationFieldLiteral=ruleEnumConfigurationFieldLiteral();
            _fsp--;

             current =iv_ruleEnumConfigurationFieldLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral1371); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:800:1: ruleEnumConfigurationFieldLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) ) ;
    public final EObject ruleEnumConfigurationFieldLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:805:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:806:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:806:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:806:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleLiteralParam ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:806:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:807:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:807:1: (lv_name_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:808:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumConfigurationFieldLiteral1413); 

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

            match(input,23,FOLLOW_23_in_ruleEnumConfigurationFieldLiteral1428); 

                    createLeafNode(grammarAccess.getEnumConfigurationFieldLiteralAccess().getEqualsSignKeyword_1(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:834:1: ( (lv_value_2_0= ruleLiteralParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:835:1: (lv_value_2_0= ruleLiteralParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:835:1: (lv_value_2_0= ruleLiteralParam )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:836:3: lv_value_2_0= ruleLiteralParam
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumConfigurationFieldLiteralAccess().getValueLiteralParamParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteralParam_in_ruleEnumConfigurationFieldLiteral1449);
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:866:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:867:2: (iv_ruleSymbol= ruleSymbol EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:868:2: iv_ruleSymbol= ruleSymbol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol1485);
            iv_ruleSymbol=ruleSymbol();
            _fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol1495); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:875:1: ruleSymbol returns [EObject current=null] : ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:880:6: ( ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:881:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:881:1: ( 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:881:3: 'symbol' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
            {
            match(input,24,FOLLOW_24_in_ruleSymbol1530); 

                    createLeafNode(grammarAccess.getSymbolAccess().getSymbolKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:885:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:886:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:886:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:887:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol1547); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:909:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )
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
                    new NoViableAltException("909:2: ( ( (lv_value_2_0= RULE_INT ) ) | ( (lv_value_3_0= RULE_HEXINT ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:909:3: ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:909:3: ( (lv_value_2_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:910:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:910:1: (lv_value_2_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:911:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSymbol1570); 

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
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:934:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:934:6: ( (lv_value_3_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:935:1: (lv_value_3_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:935:1: (lv_value_3_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:936:3: lv_value_3_0= RULE_HEXINT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleSymbol1598); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:966:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:967:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:968:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1640);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1650); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:975:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:980:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:981:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:981:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:981:3: 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleVariable1685); 

                    createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:985:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:986:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:986:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:987:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1702); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1017:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1018:2: (iv_ruleInstance= ruleInstance EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1019:2: iv_ruleInstance= ruleInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance1743);
            iv_ruleInstance=ruleInstance();
            _fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance1753); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1026:1: ruleInstance returns [EObject current=null] : ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1031:6: ( ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )? ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1032:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )? )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1032:1: ( 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )? )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1032:3: 'instance' ( (lv_type_1_0= ruleQualifiedID ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )?
            {
            match(input,26,FOLLOW_26_in_ruleInstance1788); 

                    createLeafNode(grammarAccess.getInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1036:1: ( (lv_type_1_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1037:1: (lv_type_1_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1037:1: (lv_type_1_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1038:3: lv_type_1_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleInstance1809);
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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1060:2: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1061:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1061:1: (lv_name_2_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1062:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1826); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1084:2: ( '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1084:4: '(' ( (lv_params_4_0= ruleQualifiedID ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleInstance1842); 

                            createLeafNode(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1088:1: ( (lv_params_4_0= ruleQualifiedID ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1089:1: (lv_params_4_0= ruleQualifiedID )
                    	    {
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1089:1: (lv_params_4_0= ruleQualifiedID )
                    	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1090:3: lv_params_4_0= ruleQualifiedID
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInstanceAccess().getParamsQualifiedIDParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedID_in_ruleInstance1863);
                    	    lv_params_4_0=ruleQualifiedID();
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
                    	    	        		"QualifiedID", 
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

                    match(input,16,FOLLOW_16_in_ruleInstance1874); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1124:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1125:2: (iv_ruleFunction= ruleFunction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1126:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1912);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1922); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1133:1: ruleFunction returns [EObject current=null] : ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_step_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1138:6: ( ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1139:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1139:1: ( 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1139:3: 'func' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_step_3_0= ruleStep ) ) ';' )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleFunction1957); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFuncKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1143:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1144:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1144:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1145:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1974); 

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

            match(input,14,FOLLOW_14_in_ruleFunction1989); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1171:1: ( ( (lv_step_3_0= ruleStep ) ) ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1171:2: ( (lv_step_3_0= ruleStep ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1171:2: ( (lv_step_3_0= ruleStep ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1172:1: (lv_step_3_0= ruleStep )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1172:1: (lv_step_3_0= ruleStep )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1173:3: lv_step_3_0= ruleStep
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleFunction2011);
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

            	    match(input,19,FOLLOW_19_in_ruleFunction2021); 

            	            createLeafNode(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleFunction2033); 

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


    // $ANTLR start entryRuleMethod
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1211:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1212:2: (iv_ruleMethod= ruleMethod EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1213:2: iv_ruleMethod= ruleMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2069);
            iv_ruleMethod=ruleMethod();
            _fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethod


    // $ANTLR start ruleMethod
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1220:1: ruleMethod returns [EObject current=null] : ( 'method' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_params_3_0= ruleMethodParam ) )* ')' '{' ( ( (lv_step_6_0= ruleStep ) ) ';' )* '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_params_3_0 = null;

        EObject lv_step_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1225:6: ( ( 'method' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_params_3_0= ruleMethodParam ) )* ')' '{' ( ( (lv_step_6_0= ruleStep ) ) ';' )* '}' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1226:1: ( 'method' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_params_3_0= ruleMethodParam ) )* ')' '{' ( ( (lv_step_6_0= ruleStep ) ) ';' )* '}' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1226:1: ( 'method' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_params_3_0= ruleMethodParam ) )* ')' '{' ( ( (lv_step_6_0= ruleStep ) ) ';' )* '}' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1226:3: 'method' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_params_3_0= ruleMethodParam ) )* ')' '{' ( ( (lv_step_6_0= ruleStep ) ) ';' )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleMethod2114); 

                    createLeafNode(grammarAccess.getMethodAccess().getMethodKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1230:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1231:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1231:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2131); 

            			createLeafNode(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
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

            match(input,15,FOLLOW_15_in_ruleMethod2146); 

                    createLeafNode(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1258:1: ( (lv_params_3_0= ruleMethodParam ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1259:1: (lv_params_3_0= ruleMethodParam )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1259:1: (lv_params_3_0= ruleMethodParam )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1260:3: lv_params_3_0= ruleMethodParam
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getParamsMethodParamParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodParam_in_ruleMethod2167);
            	    lv_params_3_0=ruleMethodParam();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"params",
            	    	        		lv_params_3_0, 
            	    	        		"MethodParam", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleMethod2178); 

                    createLeafNode(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleMethod2188); 

                    createLeafNode(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1290:1: ( ( (lv_step_6_0= ruleStep ) ) ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1290:2: ( (lv_step_6_0= ruleStep ) ) ';'
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1290:2: ( (lv_step_6_0= ruleStep ) )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1291:1: (lv_step_6_0= ruleStep )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1291:1: (lv_step_6_0= ruleStep )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1292:3: lv_step_6_0= ruleStep
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getStepStepParserRuleCall_6_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleMethod2210);
            	    lv_step_6_0=ruleStep();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"step",
            	    	        		lv_step_6_0, 
            	    	        		"Step", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,19,FOLLOW_19_in_ruleMethod2220); 

            	            createLeafNode(grammarAccess.getMethodAccess().getSemicolonKeyword_6_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleMethod2232); 

                    createLeafNode(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleMethod


    // $ANTLR start entryRuleMethodParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1330:1: entryRuleMethodParam returns [EObject current=null] : iv_ruleMethodParam= ruleMethodParam EOF ;
    public final EObject entryRuleMethodParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1331:2: (iv_ruleMethodParam= ruleMethodParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1332:2: iv_ruleMethodParam= ruleMethodParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodParam_in_entryRuleMethodParam2268);
            iv_ruleMethodParam=ruleMethodParam();
            _fsp--;

             current =iv_ruleMethodParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParam2278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethodParam


    // $ANTLR start ruleMethodParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1339:1: ruleMethodParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMethodParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1344:6: ( ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1345:1: ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1345:1: ( ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1345:2: ( (lv_type_0_0= ruleQualifiedID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1345:2: ( (lv_type_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1346:1: (lv_type_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1346:1: (lv_type_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1347:3: lv_type_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodParamAccess().getTypeQualifiedIDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMethodParam2324);
            lv_type_0_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodParamRule().getType().getClassifier());
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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1369:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1370:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1370:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParam2341); 

            			createLeafNode(grammarAccess.getMethodParamAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodParamRule().getType().getClassifier());
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
    // $ANTLR end ruleMethodParam


    // $ANTLR start entryRuleStep
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1401:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1402:2: (iv_ruleStep= ruleStep EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1403:2: iv_ruleStep= ruleStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2382);
            iv_ruleStep=ruleStep();
            _fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2392); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1410:1: ruleStep returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Label_1 = null;

        EObject this_MethodCall_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1415:6: ( (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1416:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1416:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_ID && LA15_1<=RULE_HEXINT)||LA15_1==19) ) {
                    alt15=1;
                }
                else if ( (LA15_1==15||LA15_1==18) ) {
                    alt15=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1416:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall )", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1416:1: (this_Instruction_0= ruleInstruction | this_Label_1= ruleLabel | this_MethodCall_2= ruleMethodCall )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1417:5: this_Instruction_0= ruleInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getInstructionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstruction_in_ruleStep2439);
                    this_Instruction_0=ruleInstruction();
                    _fsp--;

                     
                            current = this_Instruction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1427:5: this_Label_1= ruleLabel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getLabelParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleStep2466);
                    this_Label_1=ruleLabel();
                    _fsp--;

                     
                            current = this_Label_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1437:5: this_MethodCall_2= ruleMethodCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStepAccess().getMethodCallParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMethodCall_in_ruleStep2493);
                    this_MethodCall_2=ruleMethodCall();
                    _fsp--;

                     
                            current = this_MethodCall_2; 
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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1453:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1454:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1455:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2528);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2538); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1462:1: ruleLabel returns [EObject current=null] : ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1467:6: ( ( 'label' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1468:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1468:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1468:3: 'label' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,29,FOLLOW_29_in_ruleLabel2573); 

                    createLeafNode(grammarAccess.getLabelAccess().getLabelKeyword_0(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1472:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1473:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1473:1: (lv_name_1_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1474:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2590); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1504:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1505:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1506:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction2631);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction2641); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1513:1: ruleInstruction returns [EObject current=null] : ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInsParam ) )* ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_ins_0_0=null;
        EObject lv_params_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1518:6: ( ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInsParam ) )* ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1519:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInsParam ) )* )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1519:1: ( ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInsParam ) )* )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1519:2: ( (lv_ins_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleInsParam ) )*
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1519:2: ( (lv_ins_0_0= RULE_ID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1520:1: (lv_ins_0_0= RULE_ID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1520:1: (lv_ins_0_0= RULE_ID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1521:3: lv_ins_0_0= RULE_ID
            {
            lv_ins_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction2683); 

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

            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1543:2: ( (lv_params_1_0= ruleInsParam ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_HEXINT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1544:1: (lv_params_1_0= ruleInsParam )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1544:1: (lv_params_1_0= ruleInsParam )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1545:3: lv_params_1_0= ruleInsParam
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getParamsInsParamParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInsParam_in_ruleInstruction2709);
            	    lv_params_1_0=ruleInsParam();
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
            	    	        		"InsParam", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start entryRuleMethodCall
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1575:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1576:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1577:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall2746);
            iv_ruleMethodCall=ruleMethodCall();
            _fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall2756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethodCall


    // $ANTLR start ruleMethodCall
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1584:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_method_0_0= ruleQualifiedID ) ) '(' ( (lv_params_2_0= ruleMethodCallParam ) )* ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;

        EObject lv_params_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1589:6: ( ( ( (lv_method_0_0= ruleQualifiedID ) ) '(' ( (lv_params_2_0= ruleMethodCallParam ) )* ')' ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1590:1: ( ( (lv_method_0_0= ruleQualifiedID ) ) '(' ( (lv_params_2_0= ruleMethodCallParam ) )* ')' )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1590:1: ( ( (lv_method_0_0= ruleQualifiedID ) ) '(' ( (lv_params_2_0= ruleMethodCallParam ) )* ')' )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1590:2: ( (lv_method_0_0= ruleQualifiedID ) ) '(' ( (lv_params_2_0= ruleMethodCallParam ) )* ')'
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1590:2: ( (lv_method_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1591:1: (lv_method_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1591:1: (lv_method_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1592:3: lv_method_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodCallAccess().getMethodQualifiedIDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMethodCall2802);
            lv_method_0_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"method",
            	        		lv_method_0_0, 
            	        		"QualifiedID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleMethodCall2812); 

                    createLeafNode(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1618:1: ( (lv_params_2_0= ruleMethodCallParam ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1619:1: (lv_params_2_0= ruleMethodCallParam )
            	    {
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1619:1: (lv_params_2_0= ruleMethodCallParam )
            	    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1620:3: lv_params_2_0= ruleMethodCallParam
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMethodCallAccess().getParamsMethodCallParamParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodCallParam_in_ruleMethodCall2833);
            	    lv_params_2_0=ruleMethodCallParam();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMethodCallRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"params",
            	    	        		lv_params_2_0, 
            	    	        		"MethodCallParam", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleMethodCall2844); 

                    createLeafNode(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // $ANTLR end ruleMethodCall


    // $ANTLR start entryRuleMethodCallParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1654:1: entryRuleMethodCallParam returns [EObject current=null] : iv_ruleMethodCallParam= ruleMethodCallParam EOF ;
    public final EObject entryRuleMethodCallParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1655:2: (iv_ruleMethodCallParam= ruleMethodCallParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1656:2: iv_ruleMethodCallParam= ruleMethodCallParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodCallParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodCallParam_in_entryRuleMethodCallParam2880);
            iv_ruleMethodCallParam=ruleMethodCallParam();
            _fsp--;

             current =iv_ruleMethodCallParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCallParam2890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethodCallParam


    // $ANTLR start ruleMethodCallParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1663:1: ruleMethodCallParam returns [EObject current=null] : ( (lv_ref_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleMethodCallParam() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1668:6: ( ( (lv_ref_0_0= ruleQualifiedID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1669:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1669:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1670:1: (lv_ref_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1670:1: (lv_ref_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1671:3: lv_ref_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodCallParamAccess().getRefQualifiedIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMethodCallParam2935);
            lv_ref_0_0=ruleQualifiedID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodCallParamRule().getType().getClassifier());
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
    // $ANTLR end ruleMethodCallParam


    // $ANTLR start entryRuleInsParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1701:1: entryRuleInsParam returns [EObject current=null] : iv_ruleInsParam= ruleInsParam EOF ;
    public final EObject entryRuleInsParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1702:2: (iv_ruleInsParam= ruleInsParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1703:2: iv_ruleInsParam= ruleInsParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInsParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleInsParam_in_entryRuleInsParam2970);
            iv_ruleInsParam=ruleInsParam();
            _fsp--;

             current =iv_ruleInsParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsParam2980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInsParam


    // $ANTLR start ruleInsParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1710:1: ruleInsParam returns [EObject current=null] : (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) ;
    public final EObject ruleInsParam() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralParam_0 = null;

        EObject this_RefParam_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1715:6: ( (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1716:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1716:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_HEXINT)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1716:1: (this_LiteralParam_0= ruleLiteralParam | this_RefParam_1= ruleRefParam )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1717:5: this_LiteralParam_0= ruleLiteralParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInsParamAccess().getLiteralParamParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteralParam_in_ruleInsParam3027);
                    this_LiteralParam_0=ruleLiteralParam();
                    _fsp--;

                     
                            current = this_LiteralParam_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1727:5: this_RefParam_1= ruleRefParam
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInsParamAccess().getRefParamParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRefParam_in_ruleInsParam3054);
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
    // $ANTLR end ruleInsParam


    // $ANTLR start entryRuleLiteralParam
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1743:1: entryRuleLiteralParam returns [EObject current=null] : iv_ruleLiteralParam= ruleLiteralParam EOF ;
    public final EObject entryRuleLiteralParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1744:2: (iv_ruleLiteralParam= ruleLiteralParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1745:2: iv_ruleLiteralParam= ruleLiteralParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam3089);
            iv_ruleLiteralParam=ruleLiteralParam();
            _fsp--;

             current =iv_ruleLiteralParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralParam3099); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1752:1: ruleLiteralParam returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) ;
    public final EObject ruleLiteralParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1757:6: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1758:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1758:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_HEXINT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1758:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_value_1_0= RULE_HEXINT ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1758:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1758:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1759:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1759:1: (lv_value_0_0= RULE_INT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1760:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralParam3141); 

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
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1783:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1783:6: ( (lv_value_1_0= RULE_HEXINT ) )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1784:1: (lv_value_1_0= RULE_HEXINT )
                    {
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1784:1: (lv_value_1_0= RULE_HEXINT )
                    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1785:3: lv_value_1_0= RULE_HEXINT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleLiteralParam3169); 

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1815:1: entryRuleRefParam returns [EObject current=null] : iv_ruleRefParam= ruleRefParam EOF ;
    public final EObject entryRuleRefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefParam = null;


        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1816:2: (iv_ruleRefParam= ruleRefParam EOF )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1817:2: iv_ruleRefParam= ruleRefParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleRefParam_in_entryRuleRefParam3210);
            iv_ruleRefParam=ruleRefParam();
            _fsp--;

             current =iv_ruleRefParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefParam3220); 

            }

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
    // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1824:1: ruleRefParam returns [EObject current=null] : ( (lv_ref_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleRefParam() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1829:6: ( ( (lv_ref_0_0= ruleQualifiedID ) ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1830:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1830:1: ( (lv_ref_0_0= ruleQualifiedID ) )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1831:1: (lv_ref_0_0= ruleQualifiedID )
            {
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1831:1: (lv_ref_0_0= ruleQualifiedID )
            // ../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g:1832:3: lv_ref_0_0= ruleQualifiedID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleRefParam3265);
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
    public static final BitSet FOLLOW_14_in_ruleModule193 = new BitSet(new long[]{0x000000001F128000L});
    public static final BitSet FOLLOW_ruleModuleItem_in_ruleModule214 = new BitSet(new long[]{0x000000001F128000L});
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
    public static final BitSet FOLLOW_ruleMethod_in_ruleModuleItem745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModuleItem755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationWord_in_entryRuleConfigurationWord791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationWord801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConfigurationWord836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationWord853 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationWord879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigurationWord890 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_ruleConfigurationWord912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConfigurationWord922 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_17_in_ruleConfigurationWord934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationFieldPlace_in_entryRuleConfigurationFieldPlace970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationFieldPlace980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1026 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConfigurationFieldPlace1036 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleConfigurationFieldPlace1057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_ruleConfigurationFieldPlace1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationField_in_entryRuleConfigurationField1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationField1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_ruleConfigurationField1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationField_in_entryRuleEnumConfigurationField1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationField1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumConfigurationField1249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumConfigurationField1266 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumConfigurationField1281 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_ruleEnumConfigurationField1303 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumConfigurationField1313 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEnumConfigurationField1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConfigurationFieldLiteral_in_entryRuleEnumConfigurationFieldLiteral1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConfigurationFieldLiteral1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumConfigurationFieldLiteral1413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumConfigurationFieldLiteral1428 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleEnumConfigurationFieldLiteral1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSymbol1530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol1547 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSymbol1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleSymbol1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVariable1685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInstance1788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleInstance1809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1826 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleInstance1842 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleInstance1863 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleInstance1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunction1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1974 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunction1989 = new BitSet(new long[]{0x0000000020020010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleFunction2011 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction2021 = new BitSet(new long[]{0x0000000020020010L});
    public static final BitSet FOLLOW_17_in_ruleFunction2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMethod2114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod2146 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMethodParam_in_ruleMethod2167 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleMethod2178 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod2188 = new BitSet(new long[]{0x0000000020020010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleMethod2210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethod2220 = new BitSet(new long[]{0x0000000020020010L});
    public static final BitSet FOLLOW_17_in_ruleMethod2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParam_in_entryRuleMethodParam2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParam2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMethodParam2324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParam2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleStep2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleStep2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleStep2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLabel2573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction2631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction2683 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleInsParam_in_ruleInstruction2709 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMethodCall2802 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethodCall2812 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMethodCallParam_in_ruleMethodCall2833 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleMethodCall2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCallParam_in_entryRuleMethodCallParam2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCallParam2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMethodCallParam2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsParam_in_entryRuleInsParam2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsParam2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_ruleInsParam3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_ruleInsParam3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralParam_in_entryRuleLiteralParam3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralParam3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralParam3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleLiteralParam3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefParam_in_entryRuleRefParam3210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefParam3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleRefParam3265 = new BitSet(new long[]{0x0000000000000002L});

}