// $ANTLR 3.4

	package hu.modembed.model.textnotations.device.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DeviceLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
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
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int BINARY=4;
    public static final int INT=5;
    public static final int ML_COMMENT=6;
    public static final int QUALIFIEDID=7;
    public static final int SL_COMMENT=8;
    public static final int WHITESPACE=9;

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

    public DeviceLexer() {} 
    public DeviceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DeviceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Device.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:15:7: ( '(' )
            // Device.g:15:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:16:7: ( ')' )
            // Device.g:16:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:17:7: ( '+' )
            // Device.g:17:9: '+'
            {
            match('+'); 

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
            // Device.g:18:7: ( ',' )
            // Device.g:18:9: ','
            {
            match(','); 

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
            // Device.g:19:7: ( '->' )
            // Device.g:19:9: '->'
            {
            match("->"); 



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
            // Device.g:20:7: ( ':' )
            // Device.g:20:9: ':'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:21:7: ( ';' )
            // Device.g:21:9: ';'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:22:7: ( '=' )
            // Device.g:22:9: '='
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:23:7: ( '@' )
            // Device.g:23:9: '@'
            {
            match('@'); 

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
            // Device.g:24:7: ( '[' )
            // Device.g:24:9: '['
            {
            match('['); 

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
            // Device.g:25:7: ( ']' )
            // Device.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:26:7: ( 'data' )
            // Device.g:26:9: 'data'
            {
            match("data"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:27:7: ( 'device' )
            // Device.g:27:9: 'device'
            {
            match("device"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:28:7: ( 'extends' )
            // Device.g:28:9: 'extends'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:29:7: ( 'instructionset' )
            // Device.g:29:9: 'instructionset'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:30:7: ( 'minstance' )
            // Device.g:30:9: 'minstance'
            {
            match("minstance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:31:7: ( 'mtype' )
            // Device.g:31:9: 'mtype'
            {
            match("mtype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:32:7: ( 'operation' )
            // Device.g:32:9: 'operation'
            {
            match("operation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:33:7: ( 'program' )
            // Device.g:33:9: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:34:7: ( 'type' )
            // Device.g:34:9: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:35:7: ( 'unsigned' )
            // Device.g:35:9: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:36:7: ( 'volatile' )
            // Device.g:36:9: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:37:7: ( '{' )
            // Device.g:37:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:38:7: ( '|' )
            // Device.g:38:9: '|'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:39:7: ( '}' )
            // Device.g:39:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2831:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Device.g:2832:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Device.g:2832:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Device.g:2832:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Device.g:2832:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Device.g:
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
            // Device.g:2835:11: ( ( '/*' ( . )* '*/' ) )
            // Device.g:2836:2: ( '/*' ( . )* '*/' )
            {
            // Device.g:2836:2: ( '/*' ( . )* '*/' )
            // Device.g:2836:3: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Device.g:2836:7: ( . )*
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
            	    // Device.g:2836:7: .
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

    // $ANTLR start "QUALIFIEDID"
    public final void mQUALIFIEDID() throws RecognitionException {
        try {
            int _type = QUALIFIEDID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2839:12: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* ) )
            // Device.g:2840:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            {
            // Device.g:2840:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            // Device.g:2840:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Device.g:2840:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Device.g:
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


            // Device.g:2840:55: ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Device.g:2840:56: '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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


            	    // Device.g:2840:79: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // Device.g:
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


            	    }
            	    break;

            	default :
            	    break loop5;
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
            // Device.g:2842:4: ( ( ( ( '0' .. '9' ) )+ ) )
            // Device.g:2843:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Device.g:2843:2: ( ( ( '0' .. '9' ) )+ )
            // Device.g:2843:3: ( ( '0' .. '9' ) )+
            {
            // Device.g:2843:3: ( ( '0' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Device.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // Device.g:2845:7: ( ( '0b' ( '0' | '1' )* ) )
            // Device.g:2846:2: ( '0b' ( '0' | '1' )* )
            {
            // Device.g:2846:2: ( '0b' ( '0' | '1' )* )
            // Device.g:2846:3: '0b' ( '0' | '1' )*
            {
            match("0b"); 



            // Device.g:2846:7: ( '0' | '1' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '1')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Device.g:
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
            	    break loop7;
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
    // $ANTLR end "BINARY"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2849:11: ( ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ ) )
            // Device.g:2850:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            {
            // Device.g:2850:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // Device.g:2850:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // Device.g:2850:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Device.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
        // Device.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | QUALIFIEDID | INT | BINARY | WHITESPACE )
        int alt9=31;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Device.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // Device.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // Device.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // Device.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // Device.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // Device.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // Device.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // Device.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // Device.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // Device.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // Device.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // Device.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // Device.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // Device.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // Device.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // Device.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // Device.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // Device.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // Device.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // Device.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // Device.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // Device.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // Device.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // Device.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // Device.g:1:154: T__34
                {
                mT__34(); 


                }
                break;
            case 26 :
                // Device.g:1:160: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 27 :
                // Device.g:1:171: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 28 :
                // Device.g:1:182: QUALIFIEDID
                {
                mQUALIFIEDID(); 


                }
                break;
            case 29 :
                // Device.g:1:194: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // Device.g:1:198: BINARY
                {
                mBINARY(); 


                }
                break;
            case 31 :
                // Device.g:1:205: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\14\uffff\11\31\5\uffff\1\33\2\uffff\13\31\3\uffff\13\31\1\101\7"+
        "\31\1\111\2\31\1\uffff\4\31\1\120\2\31\1\uffff\2\31\1\125\3\31\1"+
        "\uffff\4\31\1\uffff\1\135\3\31\1\141\2\31\1\uffff\3\31\1\uffff\1"+
        "\147\1\150\1\31\1\152\1\153\2\uffff\1\31\2\uffff\3\31\1\160\1\uffff";
    static final String DFA9_eofS =
        "\161\uffff";
    static final String DFA9_minS =
        "\1\11\13\uffff\1\141\1\170\1\156\1\151\1\160\1\162\1\171\1\156\1"+
        "\157\3\uffff\1\52\1\uffff\1\142\2\uffff\1\164\1\166\1\164\1\163"+
        "\1\156\1\171\1\145\1\157\1\160\1\163\1\154\3\uffff\1\141\1\151\1"+
        "\145\1\164\1\163\1\160\1\162\1\147\1\145\1\151\1\141\1\56\1\143"+
        "\1\156\1\162\1\164\1\145\1\141\1\162\1\56\1\147\1\164\1\uffff\1"+
        "\145\1\144\1\165\1\141\1\56\1\164\1\141\1\uffff\1\156\1\151\1\56"+
        "\1\163\1\143\1\156\1\uffff\1\151\1\155\1\145\1\154\1\uffff\1\56"+
        "\1\164\1\143\1\157\1\56\1\144\1\145\1\uffff\1\151\1\145\1\156\1"+
        "\uffff\2\56\1\157\2\56\2\uffff\1\156\2\uffff\1\163\1\145\1\164\1"+
        "\56\1\uffff";
    static final String DFA9_maxS =
        "\1\175\13\uffff\1\145\1\170\1\156\1\164\1\160\1\162\1\171\1\156"+
        "\1\157\3\uffff\1\57\1\uffff\1\142\2\uffff\1\164\1\166\1\164\1\163"+
        "\1\156\1\171\1\145\1\157\1\160\1\163\1\154\3\uffff\1\141\1\151\1"+
        "\145\1\164\1\163\1\160\1\162\1\147\1\145\1\151\1\141\1\172\1\143"+
        "\1\156\1\162\1\164\1\145\1\141\1\162\1\172\1\147\1\164\1\uffff\1"+
        "\145\1\144\1\165\1\141\1\172\1\164\1\141\1\uffff\1\156\1\151\1\172"+
        "\1\163\1\143\1\156\1\uffff\1\151\1\155\1\145\1\154\1\uffff\1\172"+
        "\1\164\1\143\1\157\1\172\1\144\1\145\1\uffff\1\151\1\145\1\156\1"+
        "\uffff\2\172\1\157\2\172\2\uffff\1\156\2\uffff\1\163\1\145\1\164"+
        "\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\11\uffff"+
        "\1\27\1\30\1\31\1\uffff\1\34\1\uffff\1\35\1\37\13\uffff\1\32\1\33"+
        "\1\36\26\uffff\1\14\7\uffff\1\24\6\uffff\1\21\4\uffff\1\15\7\uffff"+
        "\1\16\3\uffff\1\23\5\uffff\1\25\1\26\1\uffff\1\20\1\22\4\uffff\1"+
        "\17";
    static final String DFA9_specialS =
        "\161\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\34\1\uffff\2\34\22\uffff\1\34\7\uffff\1\1\1\2\1\uffff\1\3"+
            "\1\4\1\5\1\uffff\1\30\1\32\11\33\1\6\1\7\1\uffff\1\10\2\uffff"+
            "\1\11\32\31\1\12\1\uffff\1\13\3\uffff\3\31\1\14\1\15\3\31\1"+
            "\16\3\31\1\17\1\31\1\20\1\21\3\31\1\22\1\23\1\24\4\31\1\25\1"+
            "\26\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\3\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41\12\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\51\4\uffff\1\50",
            "",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\151",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            "",
            "",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\31\1\uffff\12\31\7\uffff\32\31\6\uffff\32\31",
            ""
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | QUALIFIEDID | INT | BINARY | WHITESPACE );";
        }
    }
 

}