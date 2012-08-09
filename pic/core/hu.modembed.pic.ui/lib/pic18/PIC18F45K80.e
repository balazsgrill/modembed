/*
 * Library for PIC18F45K80
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F45K80;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * RXERRCNT
 * 
 */
reg uint8 RXERRCNT : 0xe41; 

/*
 * TXERRCNT
 * 
 */
reg uint8 TXERRCNT : 0xe42; 

/*
 * BRGCON1
 * 
 */
reg uint8 BRGCON1 : 0xe43; 

/*
 * BRGCON2
 * 
 */
reg uint8 BRGCON2 : 0xe44; 

/*
 * BRGCON3
 * 
 */
reg uint8 BRGCON3 : 0xe45; 

/*
 * RXFCON0
 * 
 */
reg uint8 RXFCON0 : 0xe46; 

/*
 * RXFCON1
 * 
 */
reg uint8 RXFCON1 : 0xe47; 

/*
 * RXF6SIDH
 * 
 */
reg uint8 RXF6SIDH : 0xe48; 

/*
 * RXF6SIDL
 * 
 */
reg uint8 RXF6SIDL : 0xe49; 

/*
 * RXF6EIDH
 * 
 */
reg uint8 RXF6EIDH : 0xe4a; 

/*
 * RXF6EIDL
 * 
 */
reg uint8 RXF6EIDL : 0xe4b; 

/*
 * RXF7SIDH
 * 
 */
reg uint8 RXF7SIDH : 0xe4c; 

/*
 * RXF7SIDL
 * 
 */
reg uint8 RXF7SIDL : 0xe4d; 

/*
 * RXF7EIDH
 * 
 */
reg uint8 RXF7EIDH : 0xe4e; 

/*
 * RXF7EIDL
 * 
 */
reg uint8 RXF7EIDL : 0xe4f; 

/*
 * RXF8SIDH
 * 
 */
reg uint8 RXF8SIDH : 0xe50; 

/*
 * RXF8SIDL
 * 
 */
reg uint8 RXF8SIDL : 0xe51; 

/*
 * RXF8EIDH
 * 
 */
reg uint8 RXF8EIDH : 0xe52; 

/*
 * RXF8EIDL
 * 
 */
reg uint8 RXF8EIDL : 0xe53; 

/*
 * RXF9SIDH
 * 
 */
reg uint8 RXF9SIDH : 0xe54; 

/*
 * RXF9SIDL
 * 
 */
reg uint8 RXF9SIDL : 0xe55; 

/*
 * RXF9EIDH
 * 
 */
reg uint8 RXF9EIDH : 0xe56; 

/*
 * RXF9EIDL
 * 
 */
reg uint8 RXF9EIDL : 0xe57; 

/*
 * RXF10SIDH
 * 
 */
reg uint8 RXF10SIDH : 0xe58; 

/*
 * RXF10SIDL
 * 
 */
reg uint8 RXF10SIDL : 0xe59; 

/*
 * RXF10EIDH
 * 
 */
reg uint8 RXF10EIDH : 0xe5a; 

/*
 * RXF10EIDL
 * 
 */
reg uint8 RXF10EIDL : 0xe5b; 

/*
 * RXF11SIDH
 * 
 */
reg uint8 RXF11SIDH : 0xe5c; 

/*
 * RXF11SIDL
 * 
 */
reg uint8 RXF11SIDL : 0xe5d; 

/*
 * RXF11EIDH
 * 
 */
reg uint8 RXF11EIDH : 0xe5e; 

/*
 * RXF11EIDL
 * 
 */
reg uint8 RXF11EIDL : 0xe5f; 

/*
 * RXF12SIDH
 * 
 */
reg uint8 RXF12SIDH : 0xe60; 

/*
 * RXF12SIDL
 * 
 */
reg uint8 RXF12SIDL : 0xe61; 

/*
 * RXF12EIDH
 * 
 */
reg uint8 RXF12EIDH : 0xe62; 

/*
 * RXF12EIDL
 * 
 */
reg uint8 RXF12EIDL : 0xe63; 

/*
 * RXF13SIDH
 * 
 */
reg uint8 RXF13SIDH : 0xe64; 

/*
 * RXF13SIDL
 * 
 */
reg uint8 RXF13SIDL : 0xe65; 

/*
 * RXF13EIDH
 * 
 */
reg uint8 RXF13EIDH : 0xe66; 

/*
 * RXF13EIDL
 * 
 */
reg uint8 RXF13EIDL : 0xe67; 

/*
 * RXF14SIDH
 * 
 */
reg uint8 RXF14SIDH : 0xe68; 

/*
 * RXF14SIDL
 * 
 */
reg uint8 RXF14SIDL : 0xe69; 

/*
 * RXF14EIDH
 * 
 */
reg uint8 RXF14EIDH : 0xe6a; 

/*
 * RXF14EIDL
 * 
 */
reg uint8 RXF14EIDL : 0xe6b; 

/*
 * RXF15SIDH
 * 
 */
reg uint8 RXF15SIDH : 0xe6c; 

/*
 * RXF15SIDL
 * 
 */
reg uint8 RXF15SIDL : 0xe6d; 

/*
 * RXF15EIDH
 * 
 */
reg uint8 RXF15EIDH : 0xe6e; 

/*
 * RXF15EIDL
 * 
 */
reg uint8 RXF15EIDL : 0xe6f; 

/*
 * SDFLC
 * 
 */
reg uint8 SDFLC : 0xe70; 

/*
 * RXFBCON0
 * 
 */
reg uint8 RXFBCON0 : 0xe71; 

/*
 * RXFBCON1
 * 
 */
reg uint8 RXFBCON1 : 0xe72; 

/*
 * RXFBCON2
 * 
 */
reg uint8 RXFBCON2 : 0xe73; 

/*
 * RXFBCON3
 * 
 */
reg uint8 RXFBCON3 : 0xe74; 

/*
 * RXFBCON4
 * 
 */
reg uint8 RXFBCON4 : 0xe75; 

/*
 * RXFBCON5
 * 
 */
reg uint8 RXFBCON5 : 0xe76; 

/*
 * RXFBCON6
 * 
 */
reg uint8 RXFBCON6 : 0xe77; 

/*
 * RXFBCON7
 * 
 */
reg uint8 RXFBCON7 : 0xe78; 

/*
 * MSEL0
 * 
 */
reg uint8 MSEL0 : 0xe79; 

/*
 * MSEL1
 * 
 */
reg uint8 MSEL1 : 0xe7a; 

/*
 * MSEL2
 * 
 */
reg uint8 MSEL2 : 0xe7b; 

/*
 * MSEL3
 * 
 */
reg uint8 MSEL3 : 0xe7c; 

/*
 * BSEL0
 * 
 */
reg uint8 BSEL0 : 0xe7d; 

/*
 * BIE0
 * 
 */
reg uint8 BIE0 : 0xe7e; 

/*
 * TXBIE
 * 
 */
reg uint8 TXBIE : 0xe7f; 

/*
 * B0CON
 * 
 */
reg uint8 B0CON : 0xe80; 

/*
 * B0SIDH
 * 
 */
reg uint8 B0SIDH : 0xe81; 

/*
 * B0SIDL
 * 
 */
reg uint8 B0SIDL : 0xe82; 

/*
 * B0EIDH
 * 
 */
reg uint8 B0EIDH : 0xe83; 

/*
 * B0EIDL
 * 
 */
reg uint8 B0EIDL : 0xe84; 

/*
 * B0DLC
 * 
 */
reg uint8 B0DLC : 0xe85; 

/*
 * B0D0
 * 
 */
reg uint8 B0D0 : 0xe86; 

/*
 * B0D1
 * 
 */
reg uint8 B0D1 : 0xe87; 

/*
 * B0D2
 * 
 */
reg uint8 B0D2 : 0xe88; 

/*
 * B0D3
 * 
 */
reg uint8 B0D3 : 0xe89; 

/*
 * B0D4
 * 
 */
reg uint8 B0D4 : 0xe8a; 

/*
 * B0D5
 * 
 */
reg uint8 B0D5 : 0xe8b; 

/*
 * B0D6
 * 
 */
reg uint8 B0D6 : 0xe8c; 

/*
 * B0D7
 * 
 */
reg uint8 B0D7 : 0xe8d; 

/*
 * CANSTAT_RO9
 * 
 */
reg uint8 CANSTAT_RO9 : 0xe8e; 

/*
 * CANCON_RO9
 * 
 */
reg uint8 CANCON_RO9 : 0xe8f; 

/*
 * B1CON
 * 
 */
reg uint8 B1CON : 0xe90; 

/*
 * B1SIDH
 * 
 */
reg uint8 B1SIDH : 0xe91; 

/*
 * B1SIDL
 * 
 */
reg uint8 B1SIDL : 0xe92; 

/*
 * B1EIDH
 * 
 */
reg uint8 B1EIDH : 0xe93; 

/*
 * B1EIDL
 * 
 */
reg uint8 B1EIDL : 0xe94; 

/*
 * B1DLC
 * 
 */
reg uint8 B1DLC : 0xe95; 

/*
 * B1D0
 * 
 */
reg uint8 B1D0 : 0xe96; 

/*
 * B1D1
 * 
 */
reg uint8 B1D1 : 0xe97; 

/*
 * B1D2
 * 
 */
reg uint8 B1D2 : 0xe98; 

/*
 * B1D3
 * 
 */
reg uint8 B1D3 : 0xe99; 

/*
 * B1D4
 * 
 */
reg uint8 B1D4 : 0xe9a; 

/*
 * B1D5
 * 
 */
reg uint8 B1D5 : 0xe9b; 

/*
 * B1D6
 * 
 */
reg uint8 B1D6 : 0xe9c; 

/*
 * B1D7
 * 
 */
reg uint8 B1D7 : 0xe9d; 

/*
 * CANSTAT_RO8
 * 
 */
reg uint8 CANSTAT_RO8 : 0xe9e; 

/*
 * CANCON_RO8
 * 
 */
reg uint8 CANCON_RO8 : 0xe9f; 

/*
 * B2CON
 * 
 */
reg uint8 B2CON : 0xea0; 

/*
 * B2SIDH
 * 
 */
reg uint8 B2SIDH : 0xea1; 

/*
 * B2SIDL
 * 
 */
reg uint8 B2SIDL : 0xea2; 

/*
 * B2EIDH
 * 
 */
reg uint8 B2EIDH : 0xea3; 

/*
 * B2EIDL
 * 
 */
reg uint8 B2EIDL : 0xea4; 

/*
 * B2DLC
 * 
 */
reg uint8 B2DLC : 0xea5; 

/*
 * B2D0
 * 
 */
reg uint8 B2D0 : 0xea6; 

/*
 * B2D1
 * 
 */
reg uint8 B2D1 : 0xea7; 

/*
 * B2D2
 * 
 */
reg uint8 B2D2 : 0xea8; 

/*
 * B2D3
 * 
 */
reg uint8 B2D3 : 0xea9; 

/*
 * B2D4
 * 
 */
reg uint8 B2D4 : 0xeaa; 

/*
 * B2D5
 * 
 */
reg uint8 B2D5 : 0xeab; 

/*
 * B2D6
 * 
 */
reg uint8 B2D6 : 0xeac; 

/*
 * B2D7
 * 
 */
reg uint8 B2D7 : 0xead; 

/*
 * CANSTAT_RO7
 * 
 */
reg uint8 CANSTAT_RO7 : 0xeae; 

/*
 * CANCON_RO7
 * 
 */
reg uint8 CANCON_RO7 : 0xeaf; 

/*
 * B3CON
 * 
 */
reg uint8 B3CON : 0xeb0; 

/*
 * B3SIDH
 * 
 */
reg uint8 B3SIDH : 0xeb1; 

/*
 * B3SIDL
 * 
 */
reg uint8 B3SIDL : 0xeb2; 

/*
 * B3EIDH
 * 
 */
reg uint8 B3EIDH : 0xeb3; 

/*
 * B3EIDL
 * 
 */
reg uint8 B3EIDL : 0xeb4; 

/*
 * B3DLC
 * 
 */
reg uint8 B3DLC : 0xeb5; 

/*
 * B3D0
 * 
 */
reg uint8 B3D0 : 0xeb6; 

/*
 * B3D1
 * 
 */
reg uint8 B3D1 : 0xeb7; 

/*
 * B3D2
 * 
 */
reg uint8 B3D2 : 0xeb8; 

/*
 * B3D3
 * 
 */
reg uint8 B3D3 : 0xeb9; 

/*
 * B3D4
 * 
 */
reg uint8 B3D4 : 0xeba; 

/*
 * B3D5
 * 
 */
reg uint8 B3D5 : 0xebb; 

/*
 * B3D6
 * 
 */
reg uint8 B3D6 : 0xebc; 

/*
 * B3D7
 * 
 */
reg uint8 B3D7 : 0xebd; 

/*
 * CANSTAT_RO6
 * 
 */
reg uint8 CANSTAT_RO6 : 0xebe; 

/*
 * CANCON_RO6
 * 
 */
reg uint8 CANCON_RO6 : 0xebf; 

/*
 * B4CON
 * 
 */
reg uint8 B4CON : 0xec0; 

/*
 * B4SIDH
 * 
 */
reg uint8 B4SIDH : 0xec1; 

/*
 * B4SIDL
 * 
 */
reg uint8 B4SIDL : 0xec2; 

/*
 * B4EIDH
 * 
 */
reg uint8 B4EIDH : 0xec3; 

/*
 * B4EIDL
 * 
 */
reg uint8 B4EIDL : 0xec4; 

/*
 * B4DLC
 * 
 */
reg uint8 B4DLC : 0xec5; 

/*
 * B4D0
 * 
 */
reg uint8 B4D0 : 0xec6; 

/*
 * B4D1
 * 
 */
reg uint8 B4D1 : 0xec7; 

/*
 * B4D2
 * 
 */
reg uint8 B4D2 : 0xec8; 

/*
 * B4D3
 * 
 */
reg uint8 B4D3 : 0xec9; 

/*
 * B4D4
 * 
 */
reg uint8 B4D4 : 0xeca; 

/*
 * B4D5
 * 
 */
reg uint8 B4D5 : 0xecb; 

/*
 * B4D6
 * 
 */
reg uint8 B4D6 : 0xecc; 

/*
 * B4D7
 * 
 */
reg uint8 B4D7 : 0xecd; 

/*
 * CANSTAT_RO5
 * 
 */
reg uint8 CANSTAT_RO5 : 0xece; 

/*
 * CANCON_RO5
 * 
 */
reg uint8 CANCON_RO5 : 0xecf; 

/*
 * B5CON
 * 
 */
reg uint8 B5CON : 0xed0; 

/*
 * B5SIDH
 * 
 */
reg uint8 B5SIDH : 0xed1; 

/*
 * B5SIDL
 * 
 */
reg uint8 B5SIDL : 0xed2; 

/*
 * B5EIDH
 * 
 */
reg uint8 B5EIDH : 0xed3; 

/*
 * B5EIDL
 * 
 */
reg uint8 B5EIDL : 0xed4; 

/*
 * B5DLC
 * 
 */
reg uint8 B5DLC : 0xed5; 

/*
 * B5D0
 * 
 */
reg uint8 B5D0 : 0xed6; 

/*
 * B5D1
 * 
 */
reg uint8 B5D1 : 0xed7; 

/*
 * B5D2
 * 
 */
reg uint8 B5D2 : 0xed8; 

/*
 * B5D3
 * 
 */
reg uint8 B5D3 : 0xed9; 

/*
 * B5D4
 * 
 */
reg uint8 B5D4 : 0xeda; 

/*
 * B5D5
 * 
 */
reg uint8 B5D5 : 0xedb; 

/*
 * B5D6
 * 
 */
reg uint8 B5D6 : 0xedc; 

/*
 * B5D7
 * 
 */
reg uint8 B5D7 : 0xedd; 

/*
 * CANSTAT_RO4
 * 
 */
reg uint8 CANSTAT_RO4 : 0xede; 

/*
 * CANCON_RO4
 * 
 */
reg uint8 CANCON_RO4 : 0xedf; 

/*
 * RXF0SIDH
 * 
 */
reg uint8 RXF0SIDH : 0xee0; 

/*
 * RXF0SIDL
 * 
 */
reg uint8 RXF0SIDL : 0xee1; 

/*
 * RXF0EIDH
 * 
 */
reg uint8 RXF0EIDH : 0xee2; 

/*
 * RXF0EIDL
 * 
 */
reg uint8 RXF0EIDL : 0xee3; 

/*
 * RXF1SIDH
 * 
 */
reg uint8 RXF1SIDH : 0xee4; 

/*
 * RXF1SIDL
 * 
 */
reg uint8 RXF1SIDL : 0xee5; 

/*
 * RXF1EIDH
 * 
 */
reg uint8 RXF1EIDH : 0xee6; 

/*
 * RXF1EIDL
 * 
 */
reg uint8 RXF1EIDL : 0xee7; 

/*
 * RXF2SIDH
 * 
 */
reg uint8 RXF2SIDH : 0xee8; 

/*
 * RXF2SIDL
 * 
 */
reg uint8 RXF2SIDL : 0xee9; 

/*
 * RXF2EIDH
 * 
 */
reg uint8 RXF2EIDH : 0xeea; 

/*
 * RXF2EIDL
 * 
 */
reg uint8 RXF2EIDL : 0xeeb; 

/*
 * RXF3SIDH
 * 
 */
reg uint8 RXF3SIDH : 0xeec; 

/*
 * RXF3SIDL
 * 
 */
reg uint8 RXF3SIDL : 0xeed; 

/*
 * RXF3EIDH
 * 
 */
reg uint8 RXF3EIDH : 0xeee; 

/*
 * RXF3EIDL
 * 
 */
reg uint8 RXF3EIDL : 0xeef; 

/*
 * RXF4SIDH
 * 
 */
reg uint8 RXF4SIDH : 0xef0; 

/*
 * RXF4SIDL
 * 
 */
reg uint8 RXF4SIDL : 0xef1; 

/*
 * RXF4EIDH
 * 
 */
reg uint8 RXF4EIDH : 0xef2; 

/*
 * RXF4EIDL
 * 
 */
reg uint8 RXF4EIDL : 0xef3; 

/*
 * RXF5SIDH
 * 
 */
reg uint8 RXF5SIDH : 0xef4; 

/*
 * RXF5SIDL
 * 
 */
reg uint8 RXF5SIDL : 0xef5; 

/*
 * RXF5EIDH
 * 
 */
reg uint8 RXF5EIDH : 0xef6; 

/*
 * RXF5EIDL
 * 
 */
reg uint8 RXF5EIDL : 0xef7; 

/*
 * RXM0SIDH
 * 
 */
reg uint8 RXM0SIDH : 0xef8; 

/*
 * RXM0SIDL
 * 
 */
reg uint8 RXM0SIDL : 0xef9; 

/*
 * RXM0EIDH
 * 
 */
reg uint8 RXM0EIDH : 0xefa; 

/*
 * RXM0EIDL
 * 
 */
reg uint8 RXM0EIDL : 0xefb; 

/*
 * RXM1SIDH
 * 
 */
reg uint8 RXM1SIDH : 0xefc; 

/*
 * RXM1SIDL
 * 
 */
reg uint8 RXM1SIDL : 0xefd; 

/*
 * RXM1EIDH
 * 
 */
reg uint8 RXM1EIDH : 0xefe; 

/*
 * RXM1EIDL
 * 
 */
reg uint8 RXM1EIDL : 0xeff; 

/*
 * TXB2CON
 * 
 */
reg uint8 TXB2CON : 0xf00; 

/*
 * TXB2SIDH
 * 
 */
reg uint8 TXB2SIDH : 0xf01; 

/*
 * TXB2SIDL
 * 
 */
reg uint8 TXB2SIDL : 0xf02; 

/*
 * TXB2EIDH
 * 
 */
reg uint8 TXB2EIDH : 0xf03; 

/*
 * TXB2EIDL
 * 
 */
reg uint8 TXB2EIDL : 0xf04; 

/*
 * TXB2DLC
 * 
 */
reg uint8 TXB2DLC : 0xf05; 

/*
 * TXB2D0
 * 
 */
reg uint8 TXB2D0 : 0xf06; 

/*
 * TXB2D1
 * 
 */
reg uint8 TXB2D1 : 0xf07; 

/*
 * TXB2D2
 * 
 */
reg uint8 TXB2D2 : 0xf08; 

/*
 * TXB2D3
 * 
 */
reg uint8 TXB2D3 : 0xf09; 

/*
 * TXB2D4
 * 
 */
reg uint8 TXB2D4 : 0xf0a; 

/*
 * TXB2D5
 * 
 */
reg uint8 TXB2D5 : 0xf0b; 

/*
 * TXB2D6
 * 
 */
reg uint8 TXB2D6 : 0xf0c; 

/*
 * TXB2D7
 * 
 */
reg uint8 TXB2D7 : 0xf0d; 

/*
 * CANSTAT_RO3
 * 
 */
reg uint8 CANSTAT_RO3 : 0xf0e; 

/*
 * CANCON_RO3
 * 
 */
reg uint8 CANCON_RO3 : 0xf0f; 

/*
 * TXB1CON
 * 
 */
reg uint8 TXB1CON : 0xf10; 

/*
 * TXB1SIDH
 * 
 */
reg uint8 TXB1SIDH : 0xf11; 

/*
 * TXB1SIDL
 * 
 */
reg uint8 TXB1SIDL : 0xf12; 

/*
 * TXB1EIDH
 * 
 */
reg uint8 TXB1EIDH : 0xf13; 

/*
 * TXB1EIDL
 * 
 */
reg uint8 TXB1EIDL : 0xf14; 

/*
 * TXB1DLC
 * 
 */
reg uint8 TXB1DLC : 0xf15; 

/*
 * TXB1D0
 * 
 */
reg uint8 TXB1D0 : 0xf16; 

/*
 * TXB1D1
 * 
 */
reg uint8 TXB1D1 : 0xf17; 

/*
 * TXB1D2
 * 
 */
reg uint8 TXB1D2 : 0xf18; 

/*
 * TXB1D3
 * 
 */
reg uint8 TXB1D3 : 0xf19; 

/*
 * TXB1D4
 * 
 */
reg uint8 TXB1D4 : 0xf1a; 

/*
 * TXB1D5
 * 
 */
reg uint8 TXB1D5 : 0xf1b; 

/*
 * TXB1D6
 * 
 */
reg uint8 TXB1D6 : 0xf1c; 

/*
 * TXB1D7
 * 
 */
reg uint8 TXB1D7 : 0xf1d; 

/*
 * CANSTAT_RO2
 * 
 */
reg uint8 CANSTAT_RO2 : 0xf1e; 

/*
 * CANCON_RO2
 * 
 */
reg uint8 CANCON_RO2 : 0xf1f; 

/*
 * TXB0CON
 * 
 */
reg uint8 TXB0CON : 0xf20; 

/*
 * TXB0SIDH
 * 
 */
reg uint8 TXB0SIDH : 0xf21; 

/*
 * TXB0SIDL
 * 
 */
reg uint8 TXB0SIDL : 0xf22; 

/*
 * TXB0EIDH
 * 
 */
reg uint8 TXB0EIDH : 0xf23; 

/*
 * TXB0EIDL
 * 
 */
reg uint8 TXB0EIDL : 0xf24; 

/*
 * TXB0DLC
 * 
 */
reg uint8 TXB0DLC : 0xf25; 

/*
 * TXB0D0
 * 
 */
reg uint8 TXB0D0 : 0xf26; 

/*
 * TXB0D1
 * 
 */
reg uint8 TXB0D1 : 0xf27; 

/*
 * TXB0D2
 * 
 */
reg uint8 TXB0D2 : 0xf28; 

/*
 * TXB0D3
 * 
 */
reg uint8 TXB0D3 : 0xf29; 

/*
 * TXB0D4
 * 
 */
reg uint8 TXB0D4 : 0xf2a; 

/*
 * TXB0D5
 * 
 */
reg uint8 TXB0D5 : 0xf2b; 

/*
 * TXB0D6
 * 
 */
reg uint8 TXB0D6 : 0xf2c; 

/*
 * TXB0D7
 * 
 */
reg uint8 TXB0D7 : 0xf2d; 

/*
 * CANSTAT_RO1
 * 
 */
reg uint8 CANSTAT_RO1 : 0xf2e; 

/*
 * CANCON_RO1
 * 
 */
reg uint8 CANCON_RO1 : 0xf2f; 

/*
 * RXB1CON
 * 
 */
reg uint8 RXB1CON : 0xf30; 

/*
 * RXB1SIDH
 * 
 */
reg uint8 RXB1SIDH : 0xf31; 

/*
 * RXB1SIDL
 * 
 */
reg uint8 RXB1SIDL : 0xf32; 

/*
 * RXB1EIDH
 * 
 */
reg uint8 RXB1EIDH : 0xf33; 

/*
 * RXB1EIDL
 * 
 */
reg uint8 RXB1EIDL : 0xf34; 

/*
 * RXB1DLC
 * 
 */
reg uint8 RXB1DLC : 0xf35; 

/*
 * RXB1D0
 * 
 */
reg uint8 RXB1D0 : 0xf36; 

/*
 * RXB1D1
 * 
 */
reg uint8 RXB1D1 : 0xf37; 

/*
 * RXB1D2
 * 
 */
reg uint8 RXB1D2 : 0xf38; 

/*
 * RXB1D3
 * 
 */
reg uint8 RXB1D3 : 0xf39; 

/*
 * RXB1D4
 * 
 */
reg uint8 RXB1D4 : 0xf3a; 

/*
 * RXB1D5
 * 
 */
reg uint8 RXB1D5 : 0xf3b; 

/*
 * RXB1D6
 * 
 */
reg uint8 RXB1D6 : 0xf3c; 

/*
 * RXB1D7
 * 
 */
reg uint8 RXB1D7 : 0xf3d; 

/*
 * CANSTAT_RO0
 * 
 */
reg uint8 CANSTAT_RO0 : 0xf3e; 

/*
 * CANCON_RO0
 * 
 */
reg uint8 CANCON_RO0 : 0xf3f; 

/*
 * PSPCON
 * 
 */
reg uint8 PSPCON : 0xf46; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf47; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf48; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf4a; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf4b; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0xf4d; 

/*
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0xf4e; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xf50; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xf51; 

/*
 * CTMUICON
 * 
 */
reg uint8 CTMUICON : 0xf53; 

/*
 * CTMUCONL
 * 
 */
reg uint8 CTMUCONL : 0xf54; 

/*
 * CTMUCONH
 * 
 */
reg uint8 CTMUCONH : 0xf55; 

/*
 * PADCFG1
 * 
 */
reg uint8 PADCFG1 : 0xf56; 

/*
 * PMD2
 * 
 */
reg uint8 PMD2 : 0xf57; 

/*
 * PMD1
 * 
 */
reg uint8 PMD1 : 0xf58; 

/*
 * PMD0
 * 
 */
reg uint8 PMD0 : 0xf59; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0xf5a; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0xf5b; 

/*
 * ANCON1
 * 
 */
reg uint8 ANCON1 : 0xf5c; 

/*
 * ANCON0
 * 
 */
reg uint8 ANCON0 : 0xf5d; 

/*
 * CM2CON
 * 
 */
reg uint8 CM2CON : 0xf5e; 

/*
 * CM1CON
 * 
 */
reg uint8 CM1CON : 0xf5f; 

/*
 * RXB0CON
 * 
 */
reg uint8 RXB0CON : 0xf60; 

/*
 * RXB0SIDH
 * 
 */
reg uint8 RXB0SIDH : 0xf61; 

/*
 * RXB0SIDL
 * 
 */
reg uint8 RXB0SIDL : 0xf62; 

/*
 * RXB0EIDH
 * 
 */
reg uint8 RXB0EIDH : 0xf63; 

/*
 * RXB0EIDL
 * 
 */
reg uint8 RXB0EIDL : 0xf64; 

/*
 * RXB0DLC
 * 
 */
reg uint8 RXB0DLC : 0xf65; 

/*
 * RXB0D0
 * 
 */
reg uint8 RXB0D0 : 0xf66; 

/*
 * RXB0D1
 * 
 */
reg uint8 RXB0D1 : 0xf67; 

/*
 * RXB0D2
 * 
 */
reg uint8 RXB0D2 : 0xf68; 

/*
 * RXB0D3
 * 
 */
reg uint8 RXB0D3 : 0xf69; 

/*
 * RXB0D4
 * 
 */
reg uint8 RXB0D4 : 0xf6a; 

/*
 * RXB0D5
 * 
 */
reg uint8 RXB0D5 : 0xf6b; 

/*
 * RXB0D6
 * 
 */
reg uint8 RXB0D6 : 0xf6c; 

/*
 * RXB0D7
 * 
 */
reg uint8 RXB0D7 : 0xf6d; 

/*
 * CANSTAT
 * 
 */
reg uint8 CANSTAT : 0xf6e; 

/*
 * CANCON
 * 
 */
reg uint8 CANCON : 0xf6f; 

/*
 * CIOCON
 * 
 */
reg uint8 CIOCON : 0xf70; 

/*
 * COMSTAT
 * 
 */
reg uint8 COMSTAT : 0xf71; 

/*
 * ECANCON
 * 
 */
reg uint8 ECANCON : 0xf72; 

/*
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0xf73; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0xf74; 

/*
 * EEADRH
 * 
 */
reg uint8 EEADRH : 0xf75; 

/*
 * PIE5
 * 
 */
reg uint8 PIE5 : 0xf76; 

/*
 * PIR5
 * 
 */
reg uint8 PIR5 : 0xf77; 

/*
 * IPR5
 * 
 */
reg uint8 IPR5 : 0xf78; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xf79; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xf7a; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xf7b; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf7c; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xf7d; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xf7e; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xf7f; 

/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0xf80; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xf81; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0xf82; 

/*
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf83; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0xf84; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf87; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf88; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0xf89; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0xf8a; 

/*
 * LATC
 * 
 */
reg uint8 LATC : 0xf8b; 

/*
 * LATD
 * 
 */
reg uint8 LATD : 0xf8c; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0xf8d; 

/*
 * SLRCON
 * 
 */
reg uint8 SLRCON : 0xf90; 

/*
 * ODCON
 * 
 */
reg uint8 ODCON : 0xf91; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0xf92; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0xf93; 

/*
 * TRISC
 * 
 */
reg uint8 TRISC : 0xf94; 

/*
 * TRISD
 * 
 */
reg uint8 TRISD : 0xf95; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf96; 

/*
 * CCPTMRS
 * 
 */
reg uint8 CCPTMRS : 0xf99; 

/*
 * REFOCON
 * 
 */
reg uint8 REFOCON : 0xf9a; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf9b; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xf9c; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xf9d; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xf9e; 

/*
 * IPR1
 * 
 */
reg uint8 IPR1 : 0xf9f; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0xfa0; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xfa1; 

/*
 * IPR2
 * 
 */
reg uint8 IPR2 : 0xfa2; 

/*
 * PIE3
 * 
 */
reg uint8 PIE3 : 0xfa3; 

/*
 * PIR3
 * 
 */
reg uint8 PIR3 : 0xfa4; 

/*
 * IPR3
 * 
 */
reg uint8 IPR3 : 0xfa5; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xfa6; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xfa7; 

/*
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xfa8; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xfa9; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xfaa; 

/*
 * RCSTA1
 * 
 */
reg uint8 RCSTA1 : 0xfab; 

/*
 * TXSTA1
 * 
 */
reg uint8 TXSTA1 : 0xfac; 

/*
 * TXREG1
 * 
 */
reg uint8 TXREG1 : 0xfad; 

/*
 * RCREG1
 * 
 */
reg uint8 RCREG1 : 0xfae; 

/*
 * SPBRG1
 * 
 */
reg uint8 SPBRG1 : 0xfaf; 

/*
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xfb0; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xfb1; 

/*
 * TMR3
 * 
 */
reg uint16 TMR3 : 0xfb2; 

/*
 * CMSTAT
 * 
 */
reg uint8 CMSTAT : 0xfb4; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xfb5; 

/*
 * PIE4
 * 
 */
reg uint8 PIE4 : 0xfb6; 

/*
 * PIR4
 * 
 */
reg uint8 PIR4 : 0xfb7; 

/*
 * IPR4
 * 
 */
reg uint8 IPR4 : 0xfb8; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xfb9; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xfba; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfbb; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfbc; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfbe; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbf; 

/*
 * ADCON2
 * 
 */
reg uint8 ADCON2 : 0xfc0; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0xfc1; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0xfc2; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfc3; 

/*
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0xfc5; 

/*
 * SSPCON1
 * 
 */
reg uint8 SSPCON1 : 0xfc6; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0xfc7; 

/*
 * SSPADD
 * 
 */
reg uint8 SSPADD : 0xfc8; 

/*
 * SSPBUF
 * 
 */
reg uint8 SSPBUF : 0xfc9; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfca; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0xfcb; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xfcc; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0xfcd; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xfce; 

/*
 * RCON
 * 
 */
reg uint8 RCON : 0xfd0; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfd1; 

/*
 * OSCCON2
 * 
 */
reg uint8 OSCCON2 : 0xfd2; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfd3; 

/*
 * T0CON
 * 
 */
reg uint8 T0CON : 0xfd5; 

/*
 * TMR0
 * 
 */
reg uint16 TMR0 : 0xfd6; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfd8; 

/*
 * FSR2
 * 
 */
reg uint16 FSR2 : 0xfd9; 

/*
 * PLUSW2
 * 
 */
reg uint8 PLUSW2 : 0xfdb; 

/*
 * PREINC2
 * 
 */
reg uint8 PREINC2 : 0xfdc; 

/*
 * POSTDEC2
 * 
 */
reg uint8 POSTDEC2 : 0xfdd; 

/*
 * POSTINC2
 * 
 */
reg uint8 POSTINC2 : 0xfde; 

/*
 * INDF2
 * 
 */
reg uint8 INDF2 : 0xfdf; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0xfe0; 

/*
 * FSR1
 * 
 */
reg uint16 FSR1 : 0xfe1; 

/*
 * PLUSW1
 * 
 */
reg uint8 PLUSW1 : 0xfe3; 

/*
 * PREINC1
 * 
 */
reg uint8 PREINC1 : 0xfe4; 

/*
 * POSTDEC1
 * 
 */
reg uint8 POSTDEC1 : 0xfe5; 

/*
 * POSTINC1
 * 
 */
reg uint8 POSTINC1 : 0xfe6; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0xfe7; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0xfe8; 

/*
 * FSR0
 * 
 */
reg uint16 FSR0 : 0xfe9; 

/*
 * PLUSW0
 * 
 */
reg uint8 PLUSW0 : 0xfeb; 

/*
 * PREINC0
 * 
 */
reg uint8 PREINC0 : 0xfec; 

/*
 * POSTDEC0
 * 
 */
reg uint8 POSTDEC0 : 0xfed; 

/*
 * POSTINC0
 * 
 */
reg uint8 POSTINC0 : 0xfee; 

/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0xfef; 

/*
 * INTCON3
 * 
 */
reg uint8 INTCON3 : 0xff0; 

/*
 * INTCON2
 * 
 */
reg uint8 INTCON2 : 0xff1; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xff2; 

/*
 * PROD
 * 
 */
reg uint16 PROD : 0xff3; 

/*
 * TABLAT
 * 
 */
reg uint8 TABLAT : 0xff5; 

/*
 * TBLPTR
 * 
 */
reg uint8 TBLPTR : 0xff6; 

/*
 * PCLAT
 * 
 */
reg uint8 PCLAT : 0xff9; 

/*
 * STKPTR
 * 
 */
reg uint8 STKPTR : 0xffc; 

/*
 * TOS
 * 
 */
reg uint8 TOS : 0xffd; 

