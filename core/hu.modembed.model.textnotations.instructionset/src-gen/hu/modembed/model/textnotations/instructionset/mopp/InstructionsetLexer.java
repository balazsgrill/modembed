// $ANTLR 3.4

	package hu.modembed.model.textnotations.instructionset.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InstructionsetLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int BINARY=4;
    public static final int CHAR=5;
    public static final int IDENTIFIER=6;
    public static final int INT=7;
    public static final int LINEBREAK=8;
    public static final int QUALIFIEDID=9;
    public static final int TEXT=10;
    public static final int WHITESPACE=11;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:15:7: ( ':' )
            // Instructionset.g:15:9: ':'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:16:7: ( ';' )
            // Instructionset.g:16:9: ';'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:17:7: ( '<' )
            // Instructionset.g:17:9: '<'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:18:7: ( '>' )
            // Instructionset.g:18:9: '>'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:19:7: ( 'extends' )
            // Instructionset.g:19:9: 'extends'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:20:7: ( 'instructionset' )
            // Instructionset.g:20:9: 'instructionset'
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
    // $ANTLR end "T__17"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1328:5: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ) )
            // Instructionset.g:1329:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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
    // $ANTLR end "CHAR"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1332:11: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ) )
            // Instructionset.g:1333:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            {
            // Instructionset.g:1333:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // Instructionset.g:1333:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instructionset.g:1333:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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
            // Instructionset.g:1335:12: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* ) )
            // Instructionset.g:1336:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            {
            // Instructionset.g:1336:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            // Instructionset.g:1336:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instructionset.g:1336:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
                }
            } while (true);


            // Instructionset.g:1336:55: ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Instructionset.g:1336:56: '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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


            	    // Instructionset.g:1336:79: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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
            	    break;

            	default :
            	    break loop4;
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
            // Instructionset.g:1338:4: ( ( ( ( '0' .. '9' ) )+ ) )
            // Instructionset.g:1339:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Instructionset.g:1339:2: ( ( ( '0' .. '9' ) )+ )
            // Instructionset.g:1339:3: ( ( '0' .. '9' ) )+
            {
            // Instructionset.g:1339:3: ( ( '0' .. '9' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // Instructionset.g:1341:7: ( ( '0b' ( '0' | '1' )* ) )
            // Instructionset.g:1342:2: ( '0b' ( '0' | '1' )* )
            {
            // Instructionset.g:1342:2: ( '0b' ( '0' | '1' )* )
            // Instructionset.g:1342:3: '0b' ( '0' | '1' )*
            {
            match("0b"); 



            // Instructionset.g:1342:7: ( '0' | '1' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '1')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
    // $ANTLR end "BINARY"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1344:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Instructionset.g:1345:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Instructionset.g:1345:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Instructionset.g:1345:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Instructionset.g:1345:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Instructionset.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1347:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Instructionset.g:1348:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instructionset.g:1351:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Instructionset.g:1352:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Instructionset.g:1352:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Instructionset.g:1352:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Instructionset.g:1352:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='\n') ) {
                    alt8=1;
                }
                else {
                    alt8=2;
                }
            }
            else if ( (LA8_0=='\n') ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Instructionset.g:1352:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Instructionset.g:1352:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Instructionset.g:1352:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


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
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Instructionset.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | CHAR | IDENTIFIER | QUALIFIEDID | INT | BINARY | TEXT | WHITESPACE | LINEBREAK )
        int alt9=14;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Instructionset.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // Instructionset.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // Instructionset.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // Instructionset.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // Instructionset.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // Instructionset.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // Instructionset.g:1:46: CHAR
                {
                mCHAR(); 


                }
                break;
            case 8 :
                // Instructionset.g:1:51: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 9 :
                // Instructionset.g:1:62: QUALIFIEDID
                {
                mQUALIFIEDID(); 


                }
                break;
            case 10 :
                // Instructionset.g:1:74: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // Instructionset.g:1:78: BINARY
                {
                mBINARY(); 


                }
                break;
            case 12 :
                // Instructionset.g:1:85: TEXT
                {
                mTEXT(); 


                }
                break;
            case 13 :
                // Instructionset.g:1:90: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 14 :
                // Instructionset.g:1:101: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\5\uffff\3\16\2\23\3\uffff\1\25\1\uffff\1\25\1\uffff\1\25\1\30\1"+
        "\uffff\1\25\1\uffff\1\25\1\30\1\uffff\6\25\1\41\1\25\1\uffff\6\25"+
        "\1\51\1\uffff";
    static final String DFA9_eofS =
        "\52\uffff";
    static final String DFA9_minS =
        "\1\11\4\uffff\5\55\3\uffff\1\55\1\uffff\1\55\1\uffff\2\55\1\uffff"+
        "\1\55\1\uffff\2\55\1\uffff\10\55\1\uffff\7\55\1\uffff";
    static final String DFA9_maxS =
        "\1\172\4\uffff\5\172\3\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1"+
        "\uffff\1\172\1\uffff\2\172\1\uffff\10\172\1\uffff\7\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\5\uffff\1\14\1\15\1\16\1\uffff\1\7\1\uffff"+
        "\1\11\2\uffff\1\12\1\uffff\1\10\2\uffff\1\13\10\uffff\1\5\7\uffff"+
        "\1\6";
    static final String DFA9_specialS =
        "\52\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\13\1\14\1\uffff\1\13\1\14\22\uffff\1\13\14\uffff\1\12\2\uffff"+
            "\1\10\11\11\1\1\1\2\1\3\1\uffff\1\4\2\uffff\32\7\4\uffff\1\12"+
            "\1\uffff\4\7\1\5\3\7\1\6\21\7",
            "",
            "",
            "",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\27\17\1\15\2\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\15\17\1\21\14\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\32\17",
            "\1\12\2\uffff\12\11\7\uffff\32\12\4\uffff\1\12\1\uffff\1\12"+
            "\1\22\30\12",
            "\1\12\2\uffff\12\11\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\23\17\1\24\6\17",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\32\17",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\22\17\1\26\7\17",
            "\1\12\2\uffff\2\27\10\12\7\uffff\32\12\4\uffff\1\12\1\uffff"+
            "\32\12",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\4\17\1\31\25\17",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\23\17\1\32\6\17",
            "\1\12\2\uffff\2\27\10\12\7\uffff\32\12\4\uffff\1\12\1\uffff"+
            "\32\12",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\15\17\1\33\14\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\21\17\1\34\10\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\3\17\1\35\26\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\24\17\1\36\5\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\22\17\1\37\7\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\2\17\1\40\27\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\32\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\23\17\1\42\6\17",
            "",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\10\17\1\43\21\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\16\17\1\44\13\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\15\17\1\45\14\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\22\17\1\46\7\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\4\17\1\47\25\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\23\17\1\50\6\17",
            "\1\12\1\20\1\uffff\12\17\7\uffff\32\17\4\uffff\1\12\1\uffff"+
            "\32\17",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | CHAR | IDENTIFIER | QUALIFIEDID | INT | BINARY | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}