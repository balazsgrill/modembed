package hu.cubussapiens.modembed.modularasm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModularASMLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=28;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int RULE_HEXINT=6;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_INT=5;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalModularASMLexer() {;} 
    public InternalModularASMLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:10:5: ( 'public' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:10:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:11:5: ( 'literal' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:11:7: 'literal'
            {
            match("literal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:12:5: ( 'callback' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:12:7: 'callback'
            {
            match("callback"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:13:5: ( 'address' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:13:7: 'address'
            {
            match("address"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:14:5: ( 'module' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:14:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:15:5: ( 'target' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:15:7: 'target'
            {
            match("target"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:16:5: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:16:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:17:5: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:17:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:18:5: ( '(' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:18:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:19:5: ( ')' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:19:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:20:5: ( '.' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:20:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:21:5: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:21:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:22:5: ( 'var' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:22:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:23:5: ( 'instance' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:23:7: 'instance'
            {
            match("instance"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:24:5: ( 'func' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:24:7: 'func'
            {
            match("func"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:25:5: ( 'label' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:25:7: 'label'
            {
            match("label"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start RULE_HEXINT
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2264:13: ( '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2264:15: '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            {
            match("0x"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2264:20: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HEXINT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2266:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2266:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2266:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2266:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2266:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2268:10: ( ( '0' .. '9' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2268:12: ( '0' .. '9' )+
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2268:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2268:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2270:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2270:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2272:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2272:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2272:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2272:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2274:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2276:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2278:16: ( . )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:2278:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_HEXINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=24;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='p') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='u') ) {
                int LA13_25 = input.LA(3);

                if ( (LA13_25=='b') ) {
                    int LA13_48 = input.LA(4);

                    if ( (LA13_48=='l') ) {
                        int LA13_58 = input.LA(5);

                        if ( (LA13_58=='i') ) {
                            int LA13_68 = input.LA(6);

                            if ( (LA13_68=='c') ) {
                                int LA13_77 = input.LA(7);

                                if ( ((LA13_77>='0' && LA13_77<='9')||(LA13_77>='A' && LA13_77<='Z')||LA13_77=='_'||(LA13_77>='a' && LA13_77<='z')) ) {
                                    alt13=18;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA13_27 = input.LA(3);

                if ( (LA13_27=='t') ) {
                    int LA13_49 = input.LA(4);

                    if ( (LA13_49=='e') ) {
                        int LA13_59 = input.LA(5);

                        if ( (LA13_59=='r') ) {
                            int LA13_69 = input.LA(6);

                            if ( (LA13_69=='a') ) {
                                int LA13_78 = input.LA(7);

                                if ( (LA13_78=='l') ) {
                                    int LA13_86 = input.LA(8);

                                    if ( ((LA13_86>='0' && LA13_86<='9')||(LA13_86>='A' && LA13_86<='Z')||LA13_86=='_'||(LA13_86>='a' && LA13_86<='z')) ) {
                                        alt13=18;
                                    }
                                    else {
                                        alt13=2;}
                                }
                                else {
                                    alt13=18;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
                }
                break;
            case 'a':
                {
                int LA13_28 = input.LA(3);

                if ( (LA13_28=='b') ) {
                    int LA13_50 = input.LA(4);

                    if ( (LA13_50=='e') ) {
                        int LA13_60 = input.LA(5);

                        if ( (LA13_60=='l') ) {
                            int LA13_70 = input.LA(6);

                            if ( ((LA13_70>='0' && LA13_70<='9')||(LA13_70>='A' && LA13_70<='Z')||LA13_70=='_'||(LA13_70>='a' && LA13_70<='z')) ) {
                                alt13=18;
                            }
                            else {
                                alt13=16;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
                }
                break;
            default:
                alt13=18;}

        }
        else if ( (LA13_0=='c') ) {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='a') ) {
                int LA13_29 = input.LA(3);

                if ( (LA13_29=='l') ) {
                    int LA13_51 = input.LA(4);

                    if ( (LA13_51=='l') ) {
                        int LA13_61 = input.LA(5);

                        if ( (LA13_61=='b') ) {
                            int LA13_71 = input.LA(6);

                            if ( (LA13_71=='a') ) {
                                int LA13_80 = input.LA(7);

                                if ( (LA13_80=='c') ) {
                                    int LA13_87 = input.LA(8);

                                    if ( (LA13_87=='k') ) {
                                        int LA13_93 = input.LA(9);

                                        if ( ((LA13_93>='0' && LA13_93<='9')||(LA13_93>='A' && LA13_93<='Z')||LA13_93=='_'||(LA13_93>='a' && LA13_93<='z')) ) {
                                            alt13=18;
                                        }
                                        else {
                                            alt13=3;}
                                    }
                                    else {
                                        alt13=18;}
                                }
                                else {
                                    alt13=18;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='a') ) {
            int LA13_4 = input.LA(2);

            if ( (LA13_4=='d') ) {
                int LA13_30 = input.LA(3);

                if ( (LA13_30=='d') ) {
                    int LA13_52 = input.LA(4);

                    if ( (LA13_52=='r') ) {
                        int LA13_62 = input.LA(5);

                        if ( (LA13_62=='e') ) {
                            int LA13_72 = input.LA(6);

                            if ( (LA13_72=='s') ) {
                                int LA13_81 = input.LA(7);

                                if ( (LA13_81=='s') ) {
                                    int LA13_88 = input.LA(8);

                                    if ( ((LA13_88>='0' && LA13_88<='9')||(LA13_88>='A' && LA13_88<='Z')||LA13_88=='_'||(LA13_88>='a' && LA13_88<='z')) ) {
                                        alt13=18;
                                    }
                                    else {
                                        alt13=4;}
                                }
                                else {
                                    alt13=18;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='m') ) {
            int LA13_5 = input.LA(2);

            if ( (LA13_5=='o') ) {
                int LA13_31 = input.LA(3);

                if ( (LA13_31=='d') ) {
                    int LA13_53 = input.LA(4);

                    if ( (LA13_53=='u') ) {
                        int LA13_63 = input.LA(5);

                        if ( (LA13_63=='l') ) {
                            int LA13_73 = input.LA(6);

                            if ( (LA13_73=='e') ) {
                                int LA13_82 = input.LA(7);

                                if ( ((LA13_82>='0' && LA13_82<='9')||(LA13_82>='A' && LA13_82<='Z')||LA13_82=='_'||(LA13_82>='a' && LA13_82<='z')) ) {
                                    alt13=18;
                                }
                                else {
                                    alt13=5;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='t') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='a') ) {
                int LA13_32 = input.LA(3);

                if ( (LA13_32=='r') ) {
                    int LA13_54 = input.LA(4);

                    if ( (LA13_54=='g') ) {
                        int LA13_64 = input.LA(5);

                        if ( (LA13_64=='e') ) {
                            int LA13_74 = input.LA(6);

                            if ( (LA13_74=='t') ) {
                                int LA13_83 = input.LA(7);

                                if ( ((LA13_83>='0' && LA13_83<='9')||(LA13_83>='A' && LA13_83<='Z')||LA13_83=='_'||(LA13_83>='a' && LA13_83<='z')) ) {
                                    alt13=18;
                                }
                                else {
                                    alt13=6;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='{') ) {
            alt13=7;
        }
        else if ( (LA13_0=='}') ) {
            alt13=8;
        }
        else if ( (LA13_0=='(') ) {
            alt13=9;
        }
        else if ( (LA13_0==')') ) {
            alt13=10;
        }
        else if ( (LA13_0=='.') ) {
            alt13=11;
        }
        else if ( (LA13_0==';') ) {
            alt13=12;
        }
        else if ( (LA13_0=='v') ) {
            int LA13_13 = input.LA(2);

            if ( (LA13_13=='a') ) {
                int LA13_39 = input.LA(3);

                if ( (LA13_39=='r') ) {
                    int LA13_55 = input.LA(4);

                    if ( ((LA13_55>='0' && LA13_55<='9')||(LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {
                        alt13=18;
                    }
                    else {
                        alt13=13;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='i') ) {
            int LA13_14 = input.LA(2);

            if ( (LA13_14=='n') ) {
                int LA13_40 = input.LA(3);

                if ( (LA13_40=='s') ) {
                    int LA13_56 = input.LA(4);

                    if ( (LA13_56=='t') ) {
                        int LA13_66 = input.LA(5);

                        if ( (LA13_66=='a') ) {
                            int LA13_75 = input.LA(6);

                            if ( (LA13_75=='n') ) {
                                int LA13_84 = input.LA(7);

                                if ( (LA13_84=='c') ) {
                                    int LA13_91 = input.LA(8);

                                    if ( (LA13_91=='e') ) {
                                        int LA13_95 = input.LA(9);

                                        if ( ((LA13_95>='0' && LA13_95<='9')||(LA13_95>='A' && LA13_95<='Z')||LA13_95=='_'||(LA13_95>='a' && LA13_95<='z')) ) {
                                            alt13=18;
                                        }
                                        else {
                                            alt13=14;}
                                    }
                                    else {
                                        alt13=18;}
                                }
                                else {
                                    alt13=18;}
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='f') ) {
            int LA13_15 = input.LA(2);

            if ( (LA13_15=='u') ) {
                int LA13_41 = input.LA(3);

                if ( (LA13_41=='n') ) {
                    int LA13_57 = input.LA(4);

                    if ( (LA13_57=='c') ) {
                        int LA13_67 = input.LA(5);

                        if ( ((LA13_67>='0' && LA13_67<='9')||(LA13_67>='A' && LA13_67<='Z')||LA13_67=='_'||(LA13_67>='a' && LA13_67<='z')) ) {
                            alt13=18;
                        }
                        else {
                            alt13=15;}
                    }
                    else {
                        alt13=18;}
                }
                else {
                    alt13=18;}
            }
            else {
                alt13=18;}
        }
        else if ( (LA13_0=='0') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='x') ) {
                alt13=17;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_17 = input.LA(2);

            if ( ((LA13_17>='A' && LA13_17<='Z')||LA13_17=='_'||(LA13_17>='a' && LA13_17<='z')) ) {
                alt13=18;
            }
            else {
                alt13=24;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='d' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='s')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=18;
        }
        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
            alt13=19;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_20 = input.LA(2);

            if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFE')) ) {
                alt13=20;
            }
            else {
                alt13=24;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_21 = input.LA(2);

            if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFE')) ) {
                alt13=20;
            }
            else {
                alt13=24;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt13=21;
                }
                break;
            case '/':
                {
                alt13=22;
                }
                break;
            default:
                alt13=24;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=23;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='-')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=24;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_HEXINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:74: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 18 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:86: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:94: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:103: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:147: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:155: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}