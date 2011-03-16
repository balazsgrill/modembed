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
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=29;
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:10:5: ( 'module' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:10:7: 'module'
            {
            match("module"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:11:5: ( 'target' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:11:7: 'target'
            {
            match("target"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:12:5: ( '{' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:12:7: '{'
            {
            match('{'); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:13:5: ( '}' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:13:7: '}'
            {
            match('}'); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:14:5: ( '(' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:14:7: '('
            {
            match('('); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:15:5: ( ')' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:15:7: ')'
            {
            match(')'); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:16:5: ( '.' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:16:7: '.'
            {
            match('.'); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:17:5: ( ';' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:17:7: ';'
            {
            match(';'); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:18:5: ( 'config' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:18:7: 'config'
            {
            match("config"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:19:5: ( 'at' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:19:7: 'at'
            {
            match("at"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:20:5: ( 'enum' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:20:7: 'enum'
            {
            match("enum"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:21:5: ( '=' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:21:7: '='
            {
            match('='); 

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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:22:5: ( 'symbol' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:22:7: 'symbol'
            {
            match("symbol"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:23:5: ( 'var' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:23:7: 'var'
            {
            match("var"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:24:5: ( 'instance' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:24:7: 'instance'
            {
            match("instance"); 


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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:25:5: ( 'func' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:25:7: 'func'
            {
            match("func"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:26:5: ( 'label' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:26:7: 'label'
            {
            match("label"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_HEXINT
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3248:13: ( '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3248:15: '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            {
            match("0x"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3248:20: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3250:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3250:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3250:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3250:11: '^'
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

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3250:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3252:10: ( ( '0' .. '9' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3252:12: ( '0' .. '9' )+
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3252:12: ( '0' .. '9' )+
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
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3252:13: '0' .. '9'
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3254:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3254:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3256:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3256:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3256:24: ( options {greedy=false; } : . )*
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
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3256:52: .
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3258:41: '\\r'
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3260:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3260:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3260:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3262:16: ( . )
            // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:3262:18: .
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
        // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_HEXINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=25;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='m') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='o') ) {
                int LA13_27 = input.LA(3);

                if ( (LA13_27=='d') ) {
                    int LA13_51 = input.LA(4);

                    if ( (LA13_51=='u') ) {
                        int LA13_61 = input.LA(5);

                        if ( (LA13_61=='l') ) {
                            int LA13_70 = input.LA(6);

                            if ( (LA13_70=='e') ) {
                                int LA13_78 = input.LA(7);

                                if ( ((LA13_78>='0' && LA13_78<='9')||(LA13_78>='A' && LA13_78<='Z')||LA13_78=='_'||(LA13_78>='a' && LA13_78<='z')) ) {
                                    alt13=19;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='t') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='a') ) {
                int LA13_29 = input.LA(3);

                if ( (LA13_29=='r') ) {
                    int LA13_52 = input.LA(4);

                    if ( (LA13_52=='g') ) {
                        int LA13_62 = input.LA(5);

                        if ( (LA13_62=='e') ) {
                            int LA13_71 = input.LA(6);

                            if ( (LA13_71=='t') ) {
                                int LA13_79 = input.LA(7);

                                if ( ((LA13_79>='0' && LA13_79<='9')||(LA13_79>='A' && LA13_79<='Z')||LA13_79=='_'||(LA13_79>='a' && LA13_79<='z')) ) {
                                    alt13=19;
                                }
                                else {
                                    alt13=2;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='{') ) {
            alt13=3;
        }
        else if ( (LA13_0=='}') ) {
            alt13=4;
        }
        else if ( (LA13_0=='(') ) {
            alt13=5;
        }
        else if ( (LA13_0==')') ) {
            alt13=6;
        }
        else if ( (LA13_0=='.') ) {
            alt13=7;
        }
        else if ( (LA13_0==';') ) {
            alt13=8;
        }
        else if ( (LA13_0=='c') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='o') ) {
                int LA13_36 = input.LA(3);

                if ( (LA13_36=='n') ) {
                    int LA13_53 = input.LA(4);

                    if ( (LA13_53=='f') ) {
                        int LA13_63 = input.LA(5);

                        if ( (LA13_63=='i') ) {
                            int LA13_72 = input.LA(6);

                            if ( (LA13_72=='g') ) {
                                int LA13_80 = input.LA(7);

                                if ( ((LA13_80>='0' && LA13_80<='9')||(LA13_80>='A' && LA13_80<='Z')||LA13_80=='_'||(LA13_80>='a' && LA13_80<='z')) ) {
                                    alt13=19;
                                }
                                else {
                                    alt13=9;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='a') ) {
            int LA13_10 = input.LA(2);

            if ( (LA13_10=='t') ) {
                int LA13_37 = input.LA(3);

                if ( ((LA13_37>='0' && LA13_37<='9')||(LA13_37>='A' && LA13_37<='Z')||LA13_37=='_'||(LA13_37>='a' && LA13_37<='z')) ) {
                    alt13=19;
                }
                else {
                    alt13=10;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='e') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='n') ) {
                int LA13_38 = input.LA(3);

                if ( (LA13_38=='u') ) {
                    int LA13_55 = input.LA(4);

                    if ( (LA13_55=='m') ) {
                        int LA13_64 = input.LA(5);

                        if ( ((LA13_64>='0' && LA13_64<='9')||(LA13_64>='A' && LA13_64<='Z')||LA13_64=='_'||(LA13_64>='a' && LA13_64<='z')) ) {
                            alt13=19;
                        }
                        else {
                            alt13=11;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='=') ) {
            alt13=12;
        }
        else if ( (LA13_0=='s') ) {
            int LA13_13 = input.LA(2);

            if ( (LA13_13=='y') ) {
                int LA13_40 = input.LA(3);

                if ( (LA13_40=='m') ) {
                    int LA13_56 = input.LA(4);

                    if ( (LA13_56=='b') ) {
                        int LA13_65 = input.LA(5);

                        if ( (LA13_65=='o') ) {
                            int LA13_74 = input.LA(6);

                            if ( (LA13_74=='l') ) {
                                int LA13_81 = input.LA(7);

                                if ( ((LA13_81>='0' && LA13_81<='9')||(LA13_81>='A' && LA13_81<='Z')||LA13_81=='_'||(LA13_81>='a' && LA13_81<='z')) ) {
                                    alt13=19;
                                }
                                else {
                                    alt13=13;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='v') ) {
            int LA13_14 = input.LA(2);

            if ( (LA13_14=='a') ) {
                int LA13_41 = input.LA(3);

                if ( (LA13_41=='r') ) {
                    int LA13_57 = input.LA(4);

                    if ( ((LA13_57>='0' && LA13_57<='9')||(LA13_57>='A' && LA13_57<='Z')||LA13_57=='_'||(LA13_57>='a' && LA13_57<='z')) ) {
                        alt13=19;
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='i') ) {
            int LA13_15 = input.LA(2);

            if ( (LA13_15=='n') ) {
                int LA13_42 = input.LA(3);

                if ( (LA13_42=='s') ) {
                    int LA13_58 = input.LA(4);

                    if ( (LA13_58=='t') ) {
                        int LA13_67 = input.LA(5);

                        if ( (LA13_67=='a') ) {
                            int LA13_75 = input.LA(6);

                            if ( (LA13_75=='n') ) {
                                int LA13_82 = input.LA(7);

                                if ( (LA13_82=='c') ) {
                                    int LA13_88 = input.LA(8);

                                    if ( (LA13_88=='e') ) {
                                        int LA13_89 = input.LA(9);

                                        if ( ((LA13_89>='0' && LA13_89<='9')||(LA13_89>='A' && LA13_89<='Z')||LA13_89=='_'||(LA13_89>='a' && LA13_89<='z')) ) {
                                            alt13=19;
                                        }
                                        else {
                                            alt13=15;}
                                    }
                                    else {
                                        alt13=19;}
                                }
                                else {
                                    alt13=19;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='f') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='u') ) {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='n') ) {
                    int LA13_59 = input.LA(4);

                    if ( (LA13_59=='c') ) {
                        int LA13_68 = input.LA(5);

                        if ( ((LA13_68>='0' && LA13_68<='9')||(LA13_68>='A' && LA13_68<='Z')||LA13_68=='_'||(LA13_68>='a' && LA13_68<='z')) ) {
                            alt13=19;
                        }
                        else {
                            alt13=16;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='l') ) {
            int LA13_17 = input.LA(2);

            if ( (LA13_17=='a') ) {
                int LA13_44 = input.LA(3);

                if ( (LA13_44=='b') ) {
                    int LA13_60 = input.LA(4);

                    if ( (LA13_60=='e') ) {
                        int LA13_69 = input.LA(5);

                        if ( (LA13_69=='l') ) {
                            int LA13_77 = input.LA(6);

                            if ( ((LA13_77>='0' && LA13_77<='9')||(LA13_77>='A' && LA13_77<='Z')||LA13_77=='_'||(LA13_77>='a' && LA13_77<='z')) ) {
                                alt13=19;
                            }
                            else {
                                alt13=17;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='0') ) {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='x') ) {
                alt13=18;
            }
            else {
                alt13=20;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_19 = input.LA(2);

            if ( ((LA13_19>='A' && LA13_19<='Z')||LA13_19=='_'||(LA13_19>='a' && LA13_19<='z')) ) {
                alt13=19;
            }
            else {
                alt13=25;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='r')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=19;
        }
        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
            alt13=20;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_22 = input.LA(2);

            if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFE')) ) {
                alt13=21;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_23 = input.LA(2);

            if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFE')) ) {
                alt13=21;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=23;
                }
                break;
            case '*':
                {
                alt13=22;
                }
                break;
            default:
                alt13=25;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=24;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='-')||LA13_0==':'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_HEXINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

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
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:78: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 19 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:98: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:107: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:119: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:151: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g:1:159: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}