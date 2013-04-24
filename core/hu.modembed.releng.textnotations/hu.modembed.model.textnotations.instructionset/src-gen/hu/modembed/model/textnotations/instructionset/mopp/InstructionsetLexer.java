// $ANTLR 3.4

	package hu.modembed.model.textnotations.instructionset.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InstructionsetLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int BINARY=4;
    public static final int IDENTIFIER=5;
    public static final int INT=6;
    public static final int ML_COMMENT=7;
    public static final int QUALIFIEDID=8;
    public static final int SL_COMMENT=9;
    public static final int WHITESPACE=10;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionPositions = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public InstructionsetLexer() {} 
    public InstructionsetLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InstructionsetLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Instructionset.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:15:7: ( '(' )
            // Instructionset.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:16:7: ( ')' )
            // Instructionset.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:17:7: ( ':' )
            // Instructionset.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:18:7: ( ';' )
            // Instructionset.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:19:7: ( '<' )
            // Instructionset.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:20:7: ( '=' )
            // Instructionset.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:21:7: ( '>' )
            // Instructionset.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:22:7: ( 'extends' )
            // Instructionset.g:22:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:23:7: ( 'instructionset' )
            // Instructionset.g:23:9: 'instructionset'
            {
            match("instructionset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:24:7: ( '|' )
            // Instructionset.g:24:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1357:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Instructionset.g:1358:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Instructionset.g:1358:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Instructionset.g:1358:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Instructionset.g:1358:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1361:11: ( ( '/*' ( . )* '*/' ) )
            // Instructionset.g:1362:2: ( '/*' ( . )* '*/' )
            {
            // Instructionset.g:1362:2: ( '/*' ( . )* '*/' )
            // Instructionset.g:1362:3: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Instructionset.g:1362:7: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instructionset.g:1362:7: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1365:11: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ) )
            // Instructionset.g:1366:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            {
            // Instructionset.g:1366:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // Instructionset.g:1366:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instructionset.g:1366:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "QUALIFIEDID"
    public final void mQUALIFIEDID() throws RecognitionException {
        try {
            int _type = QUALIFIEDID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1368:12: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* ) )
            // Instructionset.g:1369:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            {
            // Instructionset.g:1369:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            // Instructionset.g:1369:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instructionset.g:1369:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // Instructionset.g:1369:55: ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='.') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Instructionset.g:1369:56: '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            	    {
            	    match('.'); 

            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // Instructionset.g:1369:79: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // Instructionset.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUALIFIEDID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1371:4: ( ( ( ( '0' .. '9' ) )+ ) )
            // Instructionset.g:1372:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Instructionset.g:1372:2: ( ( ( '0' .. '9' ) )+ )
            // Instructionset.g:1372:3: ( ( '0' .. '9' ) )+
            {
            // Instructionset.g:1372:3: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1374:7: ( ( '0b' ( '0' | '1' )* ) )
            // Instructionset.g:1375:2: ( '0b' ( '0' | '1' )* )
            {
            // Instructionset.g:1375:2: ( '0b' ( '0' | '1' )* )
            // Instructionset.g:1375:3: '0b' ( '0' | '1' )*
            {
            match("0b"); 



            // Instructionset.g:1375:7: ( '0' | '1' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '1')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1377:11: ( ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ ) )
            // Instructionset.g:1378:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            {
            // Instructionset.g:1378:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // Instructionset.g:1378:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // Instructionset.g:1378:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // Instructionset.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | SL_COMMENT | ML_COMMENT | IDENTIFIER | QUALIFIEDID | INT | BINARY | WHITESPACE )
        int alt10=17;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Instructionset.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Instructionset.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Instructionset.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Instructionset.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Instructionset.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Instructionset.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Instructionset.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Instructionset.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Instructionset.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Instructionset.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // Instructionset.g:1:70: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 12 :
                // Instructionset.g:1:81: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 13 :
                // Instructionset.g:1:92: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 14 :
                // Instructionset.g:1:103: QUALIFIEDID
                {
                mQUALIFIEDID(); 


                }
                break;
            case 15 :
                // Instructionset.g:1:115: INT
                {
                mINT(); 


                }
                break;
            case 16 :
                // Instructionset.g:1:119: BINARY
                {
                mBINARY(); 


                }
                break;
            case 17 :
                // Instructionset.g:1:126: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\2\22\2\uffff\1\22\1\16\2\uffff\2\22\2\uffff\1\22\3\uffff"+
        "\10\22\1\42\1\22\1\uffff\6\22\1\52\1\uffff";
    static final String DFA10_eofS =
        "\53\uffff";
    static final String DFA10_minS =
        "\1\11\7\uffff\2\56\1\uffff\1\52\1\56\1\142\2\uffff\2\56\2\uffff"+
        "\1\56\3\uffff\12\56\1\uffff\7\56\1\uffff";
    static final String DFA10_maxS =
        "\1\174\7\uffff\2\172\1\uffff\1\57\1\172\1\142\2\uffff\2\172\2\uffff"+
        "\1\172\3\uffff\12\172\1\uffff\7\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\3\uffff\1\17\1"+
        "\21\2\uffff\1\15\1\16\1\uffff\1\13\1\14\1\20\12\uffff\1\10\7\uffff"+
        "\1\11";
    static final String DFA10_specialS =
        "\53\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\17\1\uffff\2\17\22\uffff\1\17\7\uffff\1\1\1\2\5\uffff\1\13"+
            "\1\15\11\16\1\3\1\4\1\5\1\6\1\7\2\uffff\32\14\6\uffff\4\14\1"+
            "\10\3\14\1\11\21\14\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\27\21\1\20\2\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\15\21\1\24\14\21",
            "",
            "\1\26\4\uffff\1\25",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\27",
            "",
            "",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\23\21\1\30\6\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
            "",
            "",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\22\21\1\31\7\21",
            "",
            "",
            "",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\4\21\1\32\25\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\23\21\1\33\6\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\15\21\1\34\14\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\21\21\1\35\10\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\3\21\1\36\26\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\24\21\1\37\5\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\22\21\1\40\7\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\2\21\1\41\27\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\23\21\1\43\6\21",
            "",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\10\21\1\44\21\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\16\21\1\45\13\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\15\21\1\46\14\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\22\21\1\47\7\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\4\21\1\50\25\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\23\21\1\51\6\21",
            "\1\23\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | SL_COMMENT | ML_COMMENT | IDENTIFIER | QUALIFIEDID | INT | BINARY | WHITESPACE );";
        }
    }
 

}