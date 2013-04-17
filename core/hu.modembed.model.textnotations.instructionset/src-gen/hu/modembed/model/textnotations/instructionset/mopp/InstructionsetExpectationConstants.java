/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * This class contains some constants that are used during code completion.
 */
public class InstructionsetExpectationConstants {
	
	public final static int EXPECTATIONS[][] = new int[64][];
	
	public static void initialize0() {
		EXPECTATIONS[0] = new int[2];
		EXPECTATIONS[0][0] = 0;
		EXPECTATIONS[0][1] = 0;
		EXPECTATIONS[1] = new int[2];
		EXPECTATIONS[1][0] = 1;
		EXPECTATIONS[1][1] = 1;
		EXPECTATIONS[2] = new int[2];
		EXPECTATIONS[2][0] = 2;
		EXPECTATIONS[2][1] = 2;
		EXPECTATIONS[3] = new int[2];
		EXPECTATIONS[3][0] = 3;
		EXPECTATIONS[3][1] = 3;
		EXPECTATIONS[4] = new int[3];
		EXPECTATIONS[4][0] = 4;
		EXPECTATIONS[4][1] = 3;
		EXPECTATIONS[4][2] = 0;
		EXPECTATIONS[5] = new int[2];
		EXPECTATIONS[5][0] = 5;
		EXPECTATIONS[5][1] = 4;
		EXPECTATIONS[6] = new int[3];
		EXPECTATIONS[6][0] = 4;
		EXPECTATIONS[6][1] = 5;
		EXPECTATIONS[6][2] = 1;
		EXPECTATIONS[7] = new int[3];
		EXPECTATIONS[7][0] = 4;
		EXPECTATIONS[7][1] = 6;
		EXPECTATIONS[7][2] = 2;
		EXPECTATIONS[8] = new int[3];
		EXPECTATIONS[8][0] = 4;
		EXPECTATIONS[8][1] = 7;
		EXPECTATIONS[8][2] = 3;
		EXPECTATIONS[9] = new int[3];
		EXPECTATIONS[9][0] = 4;
		EXPECTATIONS[9][1] = 8;
		EXPECTATIONS[9][2] = 4;
		EXPECTATIONS[10] = new int[2];
		EXPECTATIONS[10][0] = 6;
		EXPECTATIONS[10][1] = 9;
		EXPECTATIONS[11] = new int[3];
		EXPECTATIONS[11][0] = 7;
		EXPECTATIONS[11][1] = 10;
		EXPECTATIONS[11][2] = 5;
		EXPECTATIONS[12] = new int[2];
		EXPECTATIONS[12][0] = 8;
		EXPECTATIONS[12][1] = 10;
		EXPECTATIONS[13] = new int[3];
		EXPECTATIONS[13][0] = 7;
		EXPECTATIONS[13][1] = 11;
		EXPECTATIONS[13][2] = 6;
		EXPECTATIONS[14] = new int[2];
		EXPECTATIONS[14][0] = 8;
		EXPECTATIONS[14][1] = 11;
		EXPECTATIONS[15] = new int[3];
		EXPECTATIONS[15][0] = 7;
		EXPECTATIONS[15][1] = 12;
		EXPECTATIONS[15][2] = 7;
		EXPECTATIONS[16] = new int[2];
		EXPECTATIONS[16][0] = 8;
		EXPECTATIONS[16][1] = 12;
		EXPECTATIONS[17] = new int[3];
		EXPECTATIONS[17][0] = 9;
		EXPECTATIONS[17][1] = 13;
		EXPECTATIONS[17][2] = 8;
		EXPECTATIONS[18] = new int[2];
		EXPECTATIONS[18][0] = 10;
		EXPECTATIONS[18][1] = 13;
		EXPECTATIONS[19] = new int[3];
		EXPECTATIONS[19][0] = 9;
		EXPECTATIONS[19][1] = 14;
		EXPECTATIONS[19][2] = 9;
		EXPECTATIONS[20] = new int[2];
		EXPECTATIONS[20][0] = 10;
		EXPECTATIONS[20][1] = 14;
		EXPECTATIONS[21] = new int[3];
		EXPECTATIONS[21][0] = 9;
		EXPECTATIONS[21][1] = 15;
		EXPECTATIONS[21][2] = 10;
		EXPECTATIONS[22] = new int[2];
		EXPECTATIONS[22][0] = 10;
		EXPECTATIONS[22][1] = 15;
		EXPECTATIONS[23] = new int[3];
		EXPECTATIONS[23][0] = 4;
		EXPECTATIONS[23][1] = 16;
		EXPECTATIONS[23][2] = 11;
		EXPECTATIONS[24] = new int[2];
		EXPECTATIONS[24][0] = 11;
		EXPECTATIONS[24][1] = 17;
		EXPECTATIONS[25] = new int[3];
		EXPECTATIONS[25][0] = 7;
		EXPECTATIONS[25][1] = 17;
		EXPECTATIONS[25][2] = 12;
		EXPECTATIONS[26] = new int[2];
		EXPECTATIONS[26][0] = 8;
		EXPECTATIONS[26][1] = 17;
		EXPECTATIONS[27] = new int[2];
		EXPECTATIONS[27][0] = 12;
		EXPECTATIONS[27][1] = 18;
		EXPECTATIONS[28] = new int[3];
		EXPECTATIONS[28][0] = 7;
		EXPECTATIONS[28][1] = 19;
		EXPECTATIONS[28][2] = 13;
		EXPECTATIONS[29] = new int[2];
		EXPECTATIONS[29][0] = 8;
		EXPECTATIONS[29][1] = 19;
		EXPECTATIONS[30] = new int[3];
		EXPECTATIONS[30][0] = 7;
		EXPECTATIONS[30][1] = 20;
		EXPECTATIONS[30][2] = 14;
		EXPECTATIONS[31] = new int[2];
		EXPECTATIONS[31][0] = 8;
		EXPECTATIONS[31][1] = 20;
		EXPECTATIONS[32] = new int[3];
		EXPECTATIONS[32][0] = 13;
		EXPECTATIONS[32][1] = 21;
		EXPECTATIONS[32][2] = 15;
		EXPECTATIONS[33] = new int[3];
		EXPECTATIONS[33][0] = 14;
		EXPECTATIONS[33][1] = 21;
		EXPECTATIONS[33][2] = 16;
		EXPECTATIONS[34] = new int[2];
		EXPECTATIONS[34][0] = 15;
		EXPECTATIONS[34][1] = 22;
		EXPECTATIONS[35] = new int[2];
		EXPECTATIONS[35][0] = 16;
		EXPECTATIONS[35][1] = 22;
		EXPECTATIONS[36] = new int[3];
		EXPECTATIONS[36][0] = 13;
		EXPECTATIONS[36][1] = 23;
		EXPECTATIONS[36][2] = 17;
		EXPECTATIONS[37] = new int[3];
		EXPECTATIONS[37][0] = 14;
		EXPECTATIONS[37][1] = 23;
		EXPECTATIONS[37][2] = 18;
		EXPECTATIONS[38] = new int[2];
		EXPECTATIONS[38][0] = 15;
		EXPECTATIONS[38][1] = 24;
		EXPECTATIONS[39] = new int[2];
		EXPECTATIONS[39][0] = 16;
		EXPECTATIONS[39][1] = 24;
		EXPECTATIONS[40] = new int[2];
		EXPECTATIONS[40][0] = 15;
		EXPECTATIONS[40][1] = 25;
		EXPECTATIONS[41] = new int[2];
		EXPECTATIONS[41][0] = 16;
		EXPECTATIONS[41][1] = 25;
		EXPECTATIONS[42] = new int[3];
		EXPECTATIONS[42][0] = 9;
		EXPECTATIONS[42][1] = 26;
		EXPECTATIONS[42][2] = 19;
		EXPECTATIONS[43] = new int[2];
		EXPECTATIONS[43][0] = 10;
		EXPECTATIONS[43][1] = 26;
		EXPECTATIONS[44] = new int[2];
		EXPECTATIONS[44][0] = 17;
		EXPECTATIONS[44][1] = 27;
		EXPECTATIONS[45] = new int[2];
		EXPECTATIONS[45][0] = 18;
		EXPECTATIONS[45][1] = 28;
		EXPECTATIONS[46] = new int[2];
		EXPECTATIONS[46][0] = 19;
		EXPECTATIONS[46][1] = 29;
		EXPECTATIONS[47] = new int[2];
		EXPECTATIONS[47][0] = 15;
		EXPECTATIONS[47][1] = 29;
		EXPECTATIONS[48] = new int[2];
		EXPECTATIONS[48][0] = 16;
		EXPECTATIONS[48][1] = 29;
		EXPECTATIONS[49] = new int[2];
		EXPECTATIONS[49][0] = 20;
		EXPECTATIONS[49][1] = 30;
		EXPECTATIONS[50] = new int[2];
		EXPECTATIONS[50][0] = 15;
		EXPECTATIONS[50][1] = 31;
		EXPECTATIONS[51] = new int[2];
		EXPECTATIONS[51][0] = 16;
		EXPECTATIONS[51][1] = 31;
		EXPECTATIONS[52] = new int[2];
		EXPECTATIONS[52][0] = 15;
		EXPECTATIONS[52][1] = 32;
		EXPECTATIONS[53] = new int[2];
		EXPECTATIONS[53][0] = 16;
		EXPECTATIONS[53][1] = 32;
		EXPECTATIONS[54] = new int[2];
		EXPECTATIONS[54][0] = 21;
		EXPECTATIONS[54][1] = 33;
		EXPECTATIONS[55] = new int[2];
		EXPECTATIONS[55][0] = 22;
		EXPECTATIONS[55][1] = 34;
		EXPECTATIONS[56] = new int[2];
		EXPECTATIONS[56][0] = 23;
		EXPECTATIONS[56][1] = 35;
		EXPECTATIONS[57] = new int[2];
		EXPECTATIONS[57][0] = 15;
		EXPECTATIONS[57][1] = 35;
		EXPECTATIONS[58] = new int[2];
		EXPECTATIONS[58][0] = 16;
		EXPECTATIONS[58][1] = 35;
		EXPECTATIONS[59] = new int[2];
		EXPECTATIONS[59][0] = 24;
		EXPECTATIONS[59][1] = 36;
		EXPECTATIONS[60] = new int[2];
		EXPECTATIONS[60][0] = 15;
		EXPECTATIONS[60][1] = 37;
		EXPECTATIONS[61] = new int[2];
		EXPECTATIONS[61][0] = 16;
		EXPECTATIONS[61][1] = 37;
		EXPECTATIONS[62] = new int[2];
		EXPECTATIONS[62][0] = 15;
		EXPECTATIONS[62][1] = 38;
		EXPECTATIONS[63] = new int[2];
		EXPECTATIONS[63][0] = 16;
		EXPECTATIONS[63][1] = 38;
	}
	
	public static void initialize() {
		initialize0();
	}
	
	static {
		initialize();
	}
	
}
