/* The following code was generated by JFlex 1.4.3 on 10/16/13 1:31 PM */

package org.jruby.lexer;

import org.jruby.parser.JavaSignatureParser;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/16/13 1:31 PM from the specification file
 * <tt>core/src/main/java/org/jruby/lexer/JavaSignatureLexer.flex</tt>
 */
public class JavaSignatureLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 4;
  public static final int YYINITIAL = 0;
  public static final int CHARACTER = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\3\1\2\1\0\1\3\1\1\16\5\4\0\1\3\1\0"+
    "\1\53\1\0\1\4\1\0\1\33\1\54\1\42\1\43\2\0\1\35"+
    "\1\0\1\34\1\0\12\5\2\0\1\47\1\37\1\50\1\46\1\32"+
    "\32\4\1\44\1\55\1\45\1\0\1\4\1\0\1\12\1\6\1\23"+
    "\1\25\1\11\1\24\1\22\1\17\1\21\2\4\1\10\1\4\1\13"+
    "\1\7\1\30\1\4\1\20\1\16\1\15\1\26\1\27\1\51\1\52"+
    "\1\14\1\31\1\40\1\0\1\41\1\0\41\5\2\0\4\4\4\0"+
    "\1\4\2\0\1\5\7\0\1\4\4\0\1\4\5\0\27\4\1\0"+
    "\37\4\1\0\u013f\4\31\0\162\4\4\0\14\4\16\0\5\4\11\0"+
    "\1\4\21\0\130\5\5\0\23\5\12\0\1\4\13\0\1\4\1\0"+
    "\3\4\1\0\1\4\1\0\24\4\1\0\54\4\1\0\46\4\1\0"+
    "\5\4\4\0\202\4\1\0\4\5\3\0\105\4\1\0\46\4\2\0"+
    "\2\4\6\0\20\4\41\0\46\4\2\0\1\4\7\0\47\4\11\0"+
    "\21\5\1\0\27\5\1\0\3\5\1\0\1\5\1\0\2\5\1\0"+
    "\1\5\13\0\33\4\5\0\3\4\15\0\4\5\14\0\6\5\13\0"+
    "\32\4\5\0\13\4\16\5\7\0\12\5\4\0\2\4\1\5\143\4"+
    "\1\0\1\4\10\5\1\0\6\5\2\4\2\5\1\0\4\5\2\4"+
    "\12\5\3\4\2\0\1\4\17\0\1\5\1\4\1\5\36\4\33\5"+
    "\2\0\3\4\60\0\46\4\13\5\1\4\u014f\0\3\5\66\4\2\0"+
    "\1\5\1\4\20\5\2\0\1\4\4\5\3\0\12\4\2\5\2\0"+
    "\12\5\21\0\3\5\1\0\10\4\2\0\2\4\2\0\26\4\1\0"+
    "\7\4\1\0\1\4\3\0\4\4\2\0\1\5\1\4\7\5\2\0"+
    "\2\5\2\0\3\5\11\0\1\5\4\0\2\4\1\0\3\4\2\5"+
    "\2\0\12\5\4\4\15\0\3\5\1\0\6\4\4\0\2\4\2\0"+
    "\26\4\1\0\7\4\1\0\2\4\1\0\2\4\1\0\2\4\2\0"+
    "\1\5\1\0\5\5\4\0\2\5\2\0\3\5\13\0\4\4\1\0"+
    "\1\4\7\0\14\5\3\4\14\0\3\5\1\0\11\4\1\0\3\4"+
    "\1\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4\2\0\1\5"+
    "\1\4\10\5\1\0\3\5\1\0\3\5\2\0\1\4\17\0\2\4"+
    "\2\5\2\0\12\5\1\0\1\4\17\0\3\5\1\0\10\4\2\0"+
    "\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4\2\0"+
    "\1\5\1\4\6\5\3\0\2\5\2\0\3\5\10\0\2\5\4\0"+
    "\2\4\1\0\3\4\4\0\12\5\1\0\1\4\20\0\1\5\1\4"+
    "\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4"+
    "\1\0\2\4\3\0\2\4\3\0\3\4\3\0\10\4\1\0\3\4"+
    "\4\0\5\5\3\0\3\5\1\0\4\5\11\0\1\5\17\0\11\5"+
    "\11\0\1\4\7\0\3\5\1\0\10\4\1\0\3\4\1\0\27\4"+
    "\1\0\12\4\1\0\5\4\4\0\7\5\1\0\3\5\1\0\4\5"+
    "\7\0\2\5\11\0\2\4\4\0\12\5\22\0\2\5\1\0\10\4"+
    "\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4\2\0\1\5"+
    "\1\4\7\5\1\0\3\5\1\0\4\5\7\0\2\5\7\0\1\4"+
    "\1\0\2\4\4\0\12\5\22\0\2\5\1\0\10\4\1\0\3\4"+
    "\1\0\27\4\1\0\20\4\4\0\6\5\2\0\3\5\1\0\4\5"+
    "\11\0\1\5\10\0\2\4\4\0\12\5\22\0\2\5\1\0\22\4"+
    "\3\0\30\4\1\0\11\4\1\0\1\4\2\0\7\4\3\0\1\5"+
    "\4\0\6\5\1\0\1\5\1\0\10\5\22\0\2\5\15\0\60\4"+
    "\1\5\2\4\7\5\4\0\10\4\10\5\1\0\12\5\47\0\2\4"+
    "\1\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6\0\4\4"+
    "\1\0\7\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4"+
    "\1\0\4\4\1\5\2\4\6\5\1\0\2\5\1\4\2\0\5\4"+
    "\1\0\1\4\1\0\6\5\2\0\12\5\2\0\2\4\42\0\1\4"+
    "\27\0\2\5\6\0\12\5\13\0\1\5\1\0\1\5\1\0\1\5"+
    "\4\0\2\5\10\4\1\0\42\4\6\0\24\5\1\0\2\5\4\4"+
    "\4\0\10\5\1\0\44\5\11\0\1\5\71\0\42\4\1\0\5\4"+
    "\1\0\2\4\1\0\7\5\3\0\4\5\6\0\12\5\6\0\6\4"+
    "\4\5\106\0\46\4\12\0\51\4\7\0\132\4\5\0\104\4\5\0"+
    "\122\4\6\0\7\4\1\0\77\4\1\0\1\4\1\0\4\4\2\0"+
    "\7\4\1\0\1\4\1\0\4\4\2\0\47\4\1\0\1\4\1\0"+
    "\4\4\2\0\37\4\1\0\1\4\1\0\4\4\2\0\7\4\1\0"+
    "\1\4\1\0\4\4\2\0\7\4\1\0\7\4\1\0\27\4\1\0"+
    "\37\4\1\0\1\4\1\0\4\4\2\0\7\4\1\0\47\4\1\0"+
    "\23\4\16\0\11\5\56\0\125\4\14\0\u026c\4\2\0\10\4\12\0"+
    "\32\4\5\0\113\4\3\0\3\4\17\0\15\4\1\0\4\4\3\5"+
    "\13\0\22\4\3\5\13\0\22\4\2\5\14\0\15\4\1\0\3\4"+
    "\1\0\2\5\14\0\64\4\40\5\3\0\1\4\3\0\2\4\1\5"+
    "\2\0\12\5\41\0\3\5\2\0\12\5\6\0\130\4\10\0\51\4"+
    "\1\5\126\0\35\4\3\0\14\5\4\0\14\5\12\0\12\5\36\4"+
    "\2\0\5\4\u038b\0\154\4\224\0\234\4\4\0\132\4\6\0\26\4"+
    "\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0\7\4"+
    "\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0\6\4"+
    "\4\0\15\4\5\0\3\4\1\0\7\4\17\0\4\5\26\0\1\36"+
    "\3\0\5\5\20\0\2\4\23\0\1\4\13\0\4\5\6\0\6\5"+
    "\1\0\1\4\15\0\1\4\40\0\22\4\36\0\15\5\4\0\1\5"+
    "\3\0\6\5\27\0\1\4\4\0\1\4\2\0\12\4\1\0\1\4"+
    "\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4"+
    "\1\0\3\4\1\0\7\4\3\0\3\4\5\0\5\4\26\0\44\4"+
    "\u0e81\0\3\4\31\0\11\4\6\5\1\0\5\4\2\0\5\4\4\0"+
    "\126\4\2\0\2\5\2\0\3\4\1\0\137\4\5\0\50\4\4\0"+
    "\136\4\21\0\30\4\70\0\20\4\u0200\0\u19b6\4\112\0\u51a6\4\132\0"+
    "\u048d\4\u0773\0\u2ba4\4\u215c\0\u012e\4\2\0\73\4\225\0\7\4\14\0"+
    "\5\4\5\0\1\4\1\5\12\4\1\0\15\4\1\0\5\4\1\0"+
    "\1\4\1\0\2\4\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0"+
    "\100\4\2\0\66\4\50\0\15\4\3\0\20\5\20\0\4\5\17\0"+
    "\2\4\30\0\3\4\31\0\1\4\6\0\5\4\1\0\207\4\2\0"+
    "\1\5\4\0\1\4\13\0\12\5\7\0\32\4\4\0\1\4\1\0"+
    "\32\4\12\0\132\4\3\0\6\4\2\0\6\4\2\0\6\4\2\0"+
    "\3\4\3\0\2\4\3\0\2\4\22\0\3\5\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\16\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\24\3\1\0\1\32\1\33\1\34\1\35"+
    "\1\36\15\3\1\37\11\3\1\40\1\3\1\41\1\42"+
    "\12\3\1\43\4\3\1\44\14\3\1\45\1\46\1\47"+
    "\1\50\10\3\1\51\1\52\2\3\1\53\1\3\1\54"+
    "\3\3\1\55\1\56\1\57\6\3\1\60\1\61\2\3"+
    "\1\62\1\63\1\3\1\64\1\3\1\65\2\3\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\212\0\346\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\212\0\212\0\u036a\0\212"+
    "\0\212\0\212\0\212\0\212\0\212\0\212\0\212\0\212"+
    "\0\212\0\212\0\u0398\0\212\0\212\0\212\0\212\0\u03c6"+
    "\0\212\0\u03f4\0\u0422\0\u0450\0\u047e\0\u04ac\0\u04da\0\u0508"+
    "\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678"+
    "\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8"+
    "\0\212\0\212\0\212\0\212\0\u0816\0\u0844\0\u0872\0\u08a0"+
    "\0\u08ce\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10"+
    "\0\u0a3e\0\346\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52"+
    "\0\u0b80\0\u0bae\0\u0bdc\0\212\0\u0c0a\0\346\0\346\0\u0c38"+
    "\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8"+
    "\0\u0dd6\0\346\0\u0e04\0\u0e32\0\u0e60\0\u0e8e\0\346\0\u0ebc"+
    "\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe\0\u102c"+
    "\0\u105a\0\u1088\0\u10b6\0\346\0\346\0\346\0\346\0\u10e4"+
    "\0\u1112\0\u1140\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226\0\346"+
    "\0\346\0\u1254\0\u1282\0\346\0\u12b0\0\346\0\u12de\0\u130c"+
    "\0\u133a\0\346\0\346\0\346\0\u1368\0\u1396\0\u13c4\0\u13f2"+
    "\0\u1420\0\u144e\0\346\0\346\0\u147c\0\u14aa\0\346\0\346"+
    "\0\u14d8\0\346\0\u1506\0\346\0\u1534\0\u1562\0\346";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\4\1\10\1\7\1\11"+
    "\1\12\1\13\1\14\1\7\1\15\1\16\2\7\1\17"+
    "\1\7\1\20\1\21\1\22\1\7\1\23\1\24\1\7"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\2\7"+
    "\1\44\1\45\1\4\2\46\1\4\51\46\1\47\1\46"+
    "\1\50\2\4\50\50\1\51\1\50\1\52\60\0\1\6"+
    "\57\0\26\7\17\0\2\7\7\0\3\7\1\53\4\7"+
    "\1\54\15\7\17\0\2\7\7\0\3\7\1\55\22\7"+
    "\17\0\2\7\7\0\26\7\17\0\1\7\1\56\7\0"+
    "\2\7\1\57\23\7\17\0\2\7\7\0\6\7\1\60"+
    "\17\7\17\0\2\7\7\0\13\7\1\61\1\62\11\7"+
    "\17\0\2\7\7\0\10\7\1\63\1\64\1\7\1\65"+
    "\6\7\1\66\3\7\17\0\2\7\7\0\7\7\1\67"+
    "\16\7\17\0\2\7\7\0\13\7\1\70\12\7\17\0"+
    "\2\7\7\0\4\7\1\71\10\7\1\72\10\7\17\0"+
    "\2\7\7\0\3\7\1\73\22\7\17\0\2\7\7\0"+
    "\3\7\1\74\22\7\17\0\2\7\7\0\14\7\1\75"+
    "\5\7\1\76\3\7\17\0\2\7\37\0\1\77\71\0"+
    "\1\100\5\0\1\50\2\0\50\50\1\0\1\50\14\0"+
    "\1\101\1\0\1\102\2\0\1\103\32\0\1\104\6\0"+
    "\3\7\1\105\22\7\17\0\2\7\7\0\11\7\1\106"+
    "\14\7\17\0\2\7\7\0\7\7\1\107\16\7\17\0"+
    "\2\7\7\0\11\7\1\110\14\7\17\0\2\7\7\0"+
    "\12\7\1\111\13\7\17\0\2\7\7\0\11\7\1\112"+
    "\14\7\17\0\2\7\7\0\14\7\1\113\11\7\17\0"+
    "\2\7\7\0\6\7\1\114\17\7\17\0\2\7\7\0"+
    "\7\7\1\115\16\7\17\0\2\7\7\0\6\7\1\116"+
    "\5\7\1\117\11\7\17\0\2\7\7\0\3\7\1\120"+
    "\22\7\17\0\2\7\7\0\24\7\1\121\1\7\17\0"+
    "\2\7\7\0\11\7\1\122\14\7\17\0\2\7\7\0"+
    "\6\7\1\123\17\7\17\0\2\7\7\0\3\7\1\124"+
    "\22\7\17\0\2\7\7\0\7\7\1\125\16\7\17\0"+
    "\2\7\7\0\22\7\1\126\3\7\17\0\2\7\7\0"+
    "\4\7\1\127\10\7\1\130\10\7\17\0\2\7\7\0"+
    "\3\7\1\131\11\7\1\132\10\7\17\0\2\7\7\0"+
    "\2\7\1\133\23\7\17\0\2\7\37\0\1\31\71\0"+
    "\1\134\11\0\4\7\1\135\21\7\17\0\2\7\7\0"+
    "\5\7\1\136\20\7\17\0\2\7\7\0\16\7\1\137"+
    "\7\7\17\0\2\7\7\0\5\7\1\140\20\7\17\0"+
    "\2\7\7\0\11\7\1\141\14\7\17\0\2\7\7\0"+
    "\15\7\1\142\10\7\17\0\2\7\7\0\3\7\1\143"+
    "\22\7\17\0\2\7\7\0\7\7\1\144\16\7\17\0"+
    "\2\7\7\0\17\7\1\145\6\7\17\0\2\7\7\0"+
    "\11\7\1\146\14\7\17\0\2\7\7\0\15\7\1\147"+
    "\10\7\17\0\2\7\7\0\14\7\1\150\11\7\17\0"+
    "\2\7\7\0\5\7\1\151\20\7\17\0\2\7\7\0"+
    "\14\7\1\152\11\7\17\0\2\7\7\0\6\7\1\153"+
    "\17\7\17\0\2\7\7\0\6\7\1\154\17\7\17\0"+
    "\2\7\7\0\2\7\1\155\23\7\17\0\2\7\7\0"+
    "\6\7\1\156\17\7\17\0\2\7\7\0\21\7\1\157"+
    "\4\7\17\0\2\7\7\0\11\7\1\160\14\7\17\0"+
    "\2\7\7\0\23\7\1\161\2\7\17\0\2\7\7\0"+
    "\4\7\1\162\21\7\17\0\2\7\7\0\5\7\1\163"+
    "\20\7\17\0\2\7\7\0\7\7\1\164\16\7\17\0"+
    "\2\7\7\0\14\7\1\165\11\7\17\0\2\7\7\0"+
    "\23\7\1\166\2\7\17\0\2\7\7\0\26\7\17\0"+
    "\1\167\1\7\7\0\12\7\1\170\13\7\17\0\2\7"+
    "\7\0\13\7\1\171\12\7\17\0\2\7\7\0\15\7"+
    "\1\172\10\7\17\0\2\7\7\0\17\7\1\173\6\7"+
    "\17\0\2\7\7\0\11\7\1\174\14\7\17\0\2\7"+
    "\7\0\14\7\1\175\11\7\17\0\2\7\7\0\11\7"+
    "\1\176\14\7\17\0\2\7\7\0\4\7\1\177\21\7"+
    "\17\0\2\7\7\0\4\7\1\200\21\7\17\0\2\7"+
    "\7\0\11\7\1\201\14\7\17\0\2\7\7\0\5\7"+
    "\1\202\20\7\17\0\2\7\7\0\6\7\1\203\17\7"+
    "\17\0\2\7\7\0\15\7\1\204\10\7\17\0\2\7"+
    "\7\0\6\7\1\205\17\7\17\0\2\7\7\0\21\7"+
    "\1\206\4\7\17\0\2\7\7\0\6\7\1\207\17\7"+
    "\17\0\2\7\7\0\5\7\1\210\20\7\17\0\2\7"+
    "\7\0\12\7\1\211\13\7\17\0\2\7\7\0\15\7"+
    "\1\212\10\7\17\0\2\7\7\0\14\7\1\213\11\7"+
    "\17\0\2\7\7\0\17\7\1\214\6\7\17\0\2\7"+
    "\7\0\11\7\1\215\14\7\17\0\2\7\7\0\5\7"+
    "\1\216\20\7\17\0\2\7\7\0\15\7\1\217\10\7"+
    "\17\0\2\7\7\0\17\7\1\220\6\7\17\0\2\7"+
    "\7\0\11\7\1\221\14\7\17\0\2\7\7\0\17\7"+
    "\1\222\6\7\17\0\2\7\7\0\7\7\1\223\16\7"+
    "\17\0\2\7\7\0\12\7\1\224\13\7\17\0\2\7"+
    "\7\0\17\7\1\225\6\7\17\0\2\7\7\0\5\7"+
    "\1\226\20\7\17\0\2\7\7\0\3\7\1\227\22\7"+
    "\17\0\2\7\7\0\20\7\1\230\5\7\17\0\2\7"+
    "\7\0\4\7\1\231\21\7\17\0\2\7\7\0\11\7"+
    "\1\232\14\7\17\0\2\7\7\0\5\7\1\233\20\7"+
    "\17\0\2\7\7\0\11\7\1\234\14\7\17\0\2\7"+
    "\7\0\7\7\1\235\16\7\17\0\2\7\7\0\7\7"+
    "\1\236\16\7\17\0\2\7\7\0\24\7\1\237\1\7"+
    "\17\0\2\7\7\0\5\7\1\240\20\7\17\0\2\7"+
    "\7\0\5\7\1\241\20\7\17\0\2\7\7\0\11\7"+
    "\1\242\14\7\17\0\2\7\7\0\15\7\1\243\10\7"+
    "\17\0\2\7\7\0\21\7\1\244\4\7\17\0\2\7"+
    "\7\0\25\7\1\245\17\0\2\7\7\0\5\7\1\246"+
    "\20\7\17\0\2\7\7\0\21\7\1\247\4\7\17\0"+
    "\2\7\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5520];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\16\1\2\11\1\1\13\11"+
    "\1\1\4\11\1\1\1\11\25\1\1\0\1\1\4\11"+
    "\27\1\1\11\113\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  boolean stringResult = false;
  boolean characterResult = false;
  StringBuilder stringBuf = new StringBuilder();

  public Object value() {
    if (stringResult) {
        stringResult = false;
        String value = stringBuf.toString();
        stringBuf.setLength(0);
        return value;
    } else if (characterResult) {
        characterResult = false;
        String value = stringBuf.toString();
        if (stringBuf.length() != 1) throw new Error("Character not on char ("+ value +")");
        stringBuf.setLength(0);
        return value;
    }
    return yytext();
  }

  public static JavaSignatureLexer create(java.io.InputStream stream) {
    return new JavaSignatureLexer(stream);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JavaSignatureLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JavaSignatureLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1756) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 47: 
          { return JavaSignatureParser.EXTENDS;
          }
        case 55: break;
        case 35: 
          { return JavaSignatureParser.CHAR;
          }
        case 56: break;
        case 52: 
          { return JavaSignatureParser.TRANSIENT;
          }
        case 57: break;
        case 37: 
          { return JavaSignatureParser.SHORT;
          }
        case 58: break;
        case 27: 
          { stringBuf.append('\n');
          }
        case 59: break;
        case 38: 
          { return JavaSignatureParser.SUPER;
          }
        case 60: break;
        case 49: 
          { return JavaSignatureParser.ABSTRACT;
          }
        case 61: break;
        case 16: 
          { return JavaSignatureParser.QUESTION;
          }
        case 62: break;
        case 26: 
          { return JavaSignatureParser.RSHIFT;
          }
        case 63: break;
        case 53: 
          { return JavaSignatureParser.PROTECTED;
          }
        case 64: break;
        case 3: 
          { return JavaSignatureParser.IDENTIFIER;
          }
        case 65: break;
        case 39: 
          { return JavaSignatureParser.FLOAT;
          }
        case 66: break;
        case 18: 
          { return JavaSignatureParser.GT;
          }
        case 67: break;
        case 40: 
          { return JavaSignatureParser.FINAL;
          }
        case 68: break;
        case 20: 
          { yybegin(CHARACTER);
          }
        case 69: break;
        case 45: 
          { return JavaSignatureParser.PUBLIC;
          }
        case 70: break;
        case 12: 
          { return JavaSignatureParser.LPAREN;
          }
        case 71: break;
        case 13: 
          { return JavaSignatureParser.RPAREN;
          }
        case 72: break;
        case 43: 
          { return JavaSignatureParser.STATIC;
          }
        case 73: break;
        case 32: 
          { return JavaSignatureParser.URSHIFT;
          }
        case 74: break;
        case 33: 
          { return JavaSignatureParser.BYTE;
          }
        case 75: break;
        case 50: 
          { return JavaSignatureParser.STRICTFP;
          }
        case 76: break;
        case 36: 
          { return JavaSignatureParser.VOID;
          }
        case 77: break;
        case 21: 
          { stringBuf.append(yytext());
          }
        case 78: break;
        case 22: 
          { characterResult = true;
         yybegin(YYINITIAL);
         return JavaSignatureParser.CHARACTER_LITERAL;
          }
        case 79: break;
        case 9: 
          { return JavaSignatureParser.EQUAL;
          }
        case 80: break;
        case 1: 
          { throw new Error("Invalid character ("+yytext()+")");
          }
        case 81: break;
        case 8: 
          { return JavaSignatureParser.ELLIPSIS;
          }
        case 82: break;
        case 28: 
          { stringBuf.append('\t');
          }
        case 83: break;
        case 34: 
          { return JavaSignatureParser.LONG;
          }
        case 84: break;
        case 46: 
          { return JavaSignatureParser.BOOLEAN;
          }
        case 85: break;
        case 42: 
          { return JavaSignatureParser.THROWS;
          }
        case 86: break;
        case 41: 
          { return JavaSignatureParser.NATIVE;
          }
        case 87: break;
        case 24: 
          { stringResult = true;
                     yybegin(YYINITIAL); 
                     return JavaSignatureParser.STRING_LITERAL;
          }
        case 88: break;
        case 14: 
          { return JavaSignatureParser.LBRACK;
          }
        case 89: break;
        case 15: 
          { return JavaSignatureParser.RBRACK;
          }
        case 90: break;
        case 19: 
          { yybegin(STRING);
          }
        case 91: break;
        case 17: 
          { return JavaSignatureParser.LT;
          }
        case 92: break;
        case 25: 
          { stringBuf.append('\\');
          }
        case 93: break;
        case 54: 
          { return JavaSignatureParser.SYNCHRONIZED;
          }
        case 94: break;
        case 10: 
          { return JavaSignatureParser.LCURLY;
          }
        case 95: break;
        case 29: 
          { stringBuf.append('\r');
          }
        case 96: break;
        case 11: 
          { return JavaSignatureParser.RCURLY;
          }
        case 97: break;
        case 23: 
          { stringBuf.append( yytext() );
          }
        case 98: break;
        case 6: 
          { return JavaSignatureParser.DOT;
          }
        case 99: break;
        case 51: 
          { return JavaSignatureParser.VOLATILE;
          }
        case 100: break;
        case 44: 
          { return JavaSignatureParser.DOUBLE;
          }
        case 101: break;
        case 7: 
          { return JavaSignatureParser.COMMA;
          }
        case 102: break;
        case 30: 
          { stringBuf.append('\"');
          }
        case 103: break;
        case 5: 
          { return JavaSignatureParser.AND;
          }
        case 104: break;
        case 48: 
          { return JavaSignatureParser.PRIVATE;
          }
        case 105: break;
        case 4: 
          { return JavaSignatureParser.AT;
          }
        case 106: break;
        case 31: 
          { return JavaSignatureParser.INT;
          }
        case 107: break;
        case 2: 
          { 
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java JavaSignatureLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        JavaSignatureLexer scanner = null;
        try {
          scanner = new JavaSignatureLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}


