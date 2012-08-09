/*
 * Library for PIC18F8585
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F8585;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * RXF6SIDH
 * 
 */
reg uint8 RXF6SIDH : 0xd60; 

/*
 * RXF6SIDL
 * 
 */
reg uint8 RXF6SIDL : 0xd61; 

/*
 * RXF6EIDH
 * 
 */
reg uint8 RXF6EIDH : 0xd62; 

/*
 * RXF6EIDL
 * 
 */
reg uint8 RXF6EIDL : 0xd63; 

/*
 * RXF7SIDH
 * 
 */
reg uint8 RXF7SIDH : 0xd64; 

/*
 * RXF7SIDL
 * 
 */
reg uint8 RXF7SIDL : 0xd65; 

/*
 * RXF7EIDH
 * 
 */
reg uint8 RXF7EIDH : 0xd66; 

/*
 * RXF7EIDL
 * 
 */
reg uint8 RXF7EIDL : 0xd67; 

/*
 * RXF8SIDH
 * 
 */
reg uint8 RXF8SIDH : 0xd68; 

/*
 * RXF8SIDL
 * 
 */
reg uint8 RXF8SIDL : 0xd69; 

/*
 * RXF8EIDH
 * 
 */
reg uint8 RXF8EIDH : 0xd6a; 

/*
 * RXF8EIDL
 * 
 */
reg uint8 RXF8EIDL : 0xd6b; 

/*
 * RXF9SIDH
 * 
 */
reg uint8 RXF9SIDH : 0xd70; 

/*
 * RXF9SIDL
 * 
 */
reg uint8 RXF9SIDL : 0xd71; 

/*
 * RXF9EIDH
 * 
 */
reg uint8 RXF9EIDH : 0xd72; 

/*
 * RXF9EIDL
 * 
 */
reg uint8 RXF9EIDL : 0xd73; 

/*
 * RXF10SIDH
 * 
 */
reg uint8 RXF10SIDH : 0xd74; 

/*
 * RXF10SIDL
 * 
 */
reg uint8 RXF10SIDL : 0xd75; 

/*
 * RXF10EIDH
 * 
 */
reg uint8 RXF10EIDH : 0xd76; 

/*
 * RXF10EIDL
 * 
 */
reg uint8 RXF10EIDL : 0xd77; 

/*
 * RXF11SIDH
 * 
 */
reg uint8 RXF11SIDH : 0xd78; 

/*
 * RXF11SIDL
 * 
 */
reg uint8 RXF11SIDL : 0xd79; 

/*
 * RXF11EIDH
 * 
 */
reg uint8 RXF11EIDH : 0xd7a; 

/*
 * RXF11EIDL
 * 
 */
reg uint8 RXF11EIDL : 0xd7b; 

/*
 * RXF12SIDH
 * 
 */
reg uint8 RXF12SIDH : 0xd80; 

/*
 * RXF12SIDL
 * 
 */
reg uint8 RXF12SIDL : 0xd81; 

/*
 * RXF12EIDH
 * 
 */
reg uint8 RXF12EIDH : 0xd82; 

/*
 * RXF12EIDL
 * 
 */
reg uint8 RXF12EIDL : 0xd83; 

/*
 * RXF13SIDH
 * 
 */
reg uint8 RXF13SIDH : 0xd84; 

/*
 * RXF13SIDL
 * 
 */
reg uint8 RXF13SIDL : 0xd85; 

/*
 * RXF13EIDH
 * 
 */
reg uint8 RXF13EIDH : 0xd86; 

/*
 * RXF13EIDL
 * 
 */
reg uint8 RXF13EIDL : 0xd87; 

/*
 * RXF14SIDH
 * 
 */
reg uint8 RXF14SIDH : 0xd88; 

/*
 * RXF14SIDL
 * 
 */
reg uint8 RXF14SIDL : 0xd89; 

/*
 * RXF14EIDH
 * 
 */
reg uint8 RXF14EIDH : 0xd8a; 

/*
 * RXF14EIDL
 * 
 */
reg uint8 RXF14EIDL : 0xd8b; 

/*
 * RXF15SIDH
 * 
 */
reg uint8 RXF15SIDH : 0xd90; 

/*
 * RXF15SIDL
 * 
 */
reg uint8 RXF15SIDL : 0xd91; 

/*
 * RXF15EIDH
 * 
 */
reg uint8 RXF15EIDH : 0xd92; 

/*
 * RXF15EIDL
 * 
 */
reg uint8 RXF15EIDL : 0xd93; 

/*
 * RXFCON0
 * 
 */
reg uint8 RXFCON0 : 0xdd4; 

/*
 * RXFCON1
 * 
 */
reg uint8 RXFCON1 : 0xdd5; 

/*
 * SDFLC
 * 
 */
reg uint8 SDFLC : 0xdd8; 

/*
 * RXFBCON0
 * 
 */
reg uint8 RXFBCON0 : 0xde0; 

/*
 * RXFBCON1
 * 
 */
reg uint8 RXFBCON1 : 0xde1; 

/*
 * RXFBCON2
 * 
 */
reg uint8 RXFBCON2 : 0xde2; 

/*
 * RXFBCON3
 * 
 */
reg uint8 RXFBCON3 : 0xde3; 

/*
 * RXFBCON4
 * 
 */
reg uint8 RXFBCON4 : 0xde4; 

/*
 * RXFBCON5
 * 
 */
reg uint8 RXFBCON5 : 0xde5; 

/*
 * RXFBCON6
 * 
 */
reg uint8 RXFBCON6 : 0xde6; 

/*
 * RXFBCON7
 * 
 */
reg uint8 RXFBCON7 : 0xde7; 

/*
 * MSEL0
 * 
 */
reg uint8 MSEL0 : 0xdf0; 

/*
 * MSEL1
 * 
 */
reg uint8 MSEL1 : 0xdf1; 

/*
 * MSEL2
 * 
 */
reg uint8 MSEL2 : 0xdf2; 

/*
 * MSEL3
 * 
 */
reg uint8 MSEL3 : 0xdf3; 

/*
 * BSEL0
 * 
 */
reg uint8 BSEL0 : 0xdf8; 

/*
 * BIE0
 * 
 */
reg uint8 BIE0 : 0xdfa; 

/*
 * TXBIE
 * 
 */
reg uint8 TXBIE : 0xdfc; 

/*
 * B0CON
 * 
 */
reg uint8 B0CON : 0xe20; 

/*
 * B0SIDH
 * 
 */
reg uint8 B0SIDH : 0xe21; 

/*
 * B0SIDL
 * 
 */
reg uint8 B0SIDL : 0xe22; 

/*
 * B0EIDH
 * 
 */
reg uint8 B0EIDH : 0xe23; 

/*
 * B0EIDL
 * 
 */
reg uint8 B0EIDL : 0xe24; 

/*
 * B0DLC
 * 
 */
reg uint8 B0DLC : 0xe25; 

/*
 * B0D0
 * 
 */
reg uint8 B0D0 : 0xe26; 

/*
 * B0D1
 * 
 */
reg uint8 B0D1 : 0xe27; 

/*
 * B0D2
 * 
 */
reg uint8 B0D2 : 0xe28; 

/*
 * B0D3
 * 
 */
reg uint8 B0D3 : 0xe29; 

/*
 * B0D4
 * 
 */
reg uint8 B0D4 : 0xe2a; 

/*
 * B0D5
 * 
 */
reg uint8 B0D5 : 0xe2b; 

/*
 * B0D6
 * 
 */
reg uint8 B0D6 : 0xe2c; 

/*
 * B0D7
 * 
 */
reg uint8 B0D7 : 0xe2d; 

/*
 * CANSTAT_RO9
 * 
 */
reg uint8 CANSTAT_RO9 : 0xe2e; 

/*
 * CANCON_RO9
 * 
 */
reg uint8 CANCON_RO9 : 0xe2f; 

/*
 * B1CON
 * 
 */
reg uint8 B1CON : 0xe30; 

/*
 * B1SIDH
 * 
 */
reg uint8 B1SIDH : 0xe31; 

/*
 * B1SIDL
 * 
 */
reg uint8 B1SIDL : 0xe32; 

/*
 * B1EIDH
 * 
 */
reg uint8 B1EIDH : 0xe33; 

/*
 * B1EIDL
 * 
 */
reg uint8 B1EIDL : 0xe34; 

/*
 * B1DLC
 * 
 */
reg uint8 B1DLC : 0xe35; 

/*
 * B1D0
 * 
 */
reg uint8 B1D0 : 0xe36; 

/*
 * B1D1
 * 
 */
reg uint8 B1D1 : 0xe37; 

/*
 * B1D2
 * 
 */
reg uint8 B1D2 : 0xe38; 

/*
 * B1D3
 * 
 */
reg uint8 B1D3 : 0xe39; 

/*
 * B1D4
 * 
 */
reg uint8 B1D4 : 0xe3a; 

/*
 * B1D5
 * 
 */
reg uint8 B1D5 : 0xe3b; 

/*
 * B1D6
 * 
 */
reg uint8 B1D6 : 0xe3c; 

/*
 * B1D7
 * 
 */
reg uint8 B1D7 : 0xe3d; 

/*
 * CANSTAT_RO8
 * 
 */
reg uint8 CANSTAT_RO8 : 0xe3e; 

/*
 * CANCON_RO8
 * 
 */
reg uint8 CANCON_RO8 : 0xe3f; 

/*
 * B2CON
 * 
 */
reg uint8 B2CON : 0xe40; 

/*
 * B2SIDH
 * 
 */
reg uint8 B2SIDH : 0xe41; 

/*
 * B2SIDL
 * 
 */
reg uint8 B2SIDL : 0xe42; 

/*
 * B2EIDH
 * 
 */
reg uint8 B2EIDH : 0xe43; 

/*
 * B2EIDL
 * 
 */
reg uint8 B2EIDL : 0xe44; 

/*
 * B2DLC
 * 
 */
reg uint8 B2DLC : 0xe45; 

/*
 * B2D0
 * 
 */
reg uint8 B2D0 : 0xe46; 

/*
 * B2D1
 * 
 */
reg uint8 B2D1 : 0xe47; 

/*
 * B2D2
 * 
 */
reg uint8 B2D2 : 0xe48; 

/*
 * B2D3
 * 
 */
reg uint8 B2D3 : 0xe49; 

/*
 * B2D4
 * 
 */
reg uint8 B2D4 : 0xe4a; 

/*
 * B2D5
 * 
 */
reg uint8 B2D5 : 0xe4b; 

/*
 * B2D6
 * 
 */
reg uint8 B2D6 : 0xe4c; 

/*
 * B2D7
 * 
 */
reg uint8 B2D7 : 0xe4d; 

/*
 * CANSTAT_RO7
 * 
 */
reg uint8 CANSTAT_RO7 : 0xe4e; 

/*
 * CANCON_RO7
 * 
 */
reg uint8 CANCON_RO7 : 0xe4f; 

/*
 * B3CON
 * 
 */
reg uint8 B3CON : 0xe50; 

/*
 * B3SIDH
 * 
 */
reg uint8 B3SIDH : 0xe51; 

/*
 * B3SIDL
 * 
 */
reg uint8 B3SIDL : 0xe52; 

/*
 * B3EIDH
 * 
 */
reg uint8 B3EIDH : 0xe53; 

/*
 * B3EIDL
 * 
 */
reg uint8 B3EIDL : 0xe54; 

/*
 * B3DLC
 * 
 */
reg uint8 B3DLC : 0xe55; 

/*
 * B3D0
 * 
 */
reg uint8 B3D0 : 0xe56; 

/*
 * B3D1
 * 
 */
reg uint8 B3D1 : 0xe57; 

/*
 * B3D2
 * 
 */
reg uint8 B3D2 : 0xe58; 

/*
 * B3D3
 * 
 */
reg uint8 B3D3 : 0xe59; 

/*
 * B3D4
 * 
 */
reg uint8 B3D4 : 0xe5a; 

/*
 * B3D5
 * 
 */
reg uint8 B3D5 : 0xe5b; 

/*
 * B3D6
 * 
 */
reg uint8 B3D6 : 0xe5c; 

/*
 * B3D7
 * 
 */
reg uint8 B3D7 : 0xe5d; 

/*
 * CANSTAT_RO6
 * 
 */
reg uint8 CANSTAT_RO6 : 0xe5e; 

/*
 * CANCON_RO6
 * 
 */
reg uint8 CANCON_RO6 : 0xe5f; 

/*
 * B4CON
 * 
 */
reg uint8 B4CON : 0xe60; 

/*
 * B4SIDH
 * 
 */
reg uint8 B4SIDH : 0xe61; 

/*
 * B4SIDL
 * 
 */
reg uint8 B4SIDL : 0xe62; 

/*
 * B4EIDH
 * 
 */
reg uint8 B4EIDH : 0xe63; 

/*
 * B4EIDL
 * 
 */
reg uint8 B4EIDL : 0xe64; 

/*
 * B4DLC
 * 
 */
reg uint8 B4DLC : 0xe65; 

/*
 * B4D0
 * 
 */
reg uint8 B4D0 : 0xe66; 

/*
 * B4D1
 * 
 */
reg uint8 B4D1 : 0xe67; 

/*
 * B4D2
 * 
 */
reg uint8 B4D2 : 0xe68; 

/*
 * B4D3
 * 
 */
reg uint8 B4D3 : 0xe69; 

/*
 * B4D4
 * 
 */
reg uint8 B4D4 : 0xe6a; 

/*
 * B4D5
 * 
 */
reg uint8 B4D5 : 0xe6b; 

/*
 * B4D6
 * 
 */
reg uint8 B4D6 : 0xe6c; 

/*
 * B4D7
 * 
 */
reg uint8 B4D7 : 0xe6d; 

/*
 * CANSTAT_RO5
 * 
 */
reg uint8 CANSTAT_RO5 : 0xe6e; 

/*
 * CANCON_RO5
 * 
 */
reg uint8 CANCON_RO5 : 0xe6f; 

/*
 * B5CON
 * 
 */
reg uint8 B5CON : 0xe70; 

/*
 * B5SIDH
 * 
 */
reg uint8 B5SIDH : 0xe71; 

/*
 * B5SIDL
 * 
 */
reg uint8 B5SIDL : 0xe72; 

/*
 * B5EIDH
 * 
 */
reg uint8 B5EIDH : 0xe73; 

/*
 * B5EIDL
 * 
 */
reg uint8 B5EIDL : 0xe74; 

/*
 * B5DLC
 * 
 */
reg uint8 B5DLC : 0xe75; 

/*
 * B5D0
 * 
 */
reg uint8 B5D0 : 0xe76; 

/*
 * B5D1
 * 
 */
reg uint8 B5D1 : 0xe77; 

/*
 * B5D2
 * 
 */
reg uint8 B5D2 : 0xe78; 

/*
 * B5D3
 * 
 */
reg uint8 B5D3 : 0xe79; 

/*
 * B5D4
 * 
 */
reg uint8 B5D4 : 0xe7a; 

/*
 * B5D5
 * 
 */
reg uint8 B5D5 : 0xe7b; 

/*
 * B5D6
 * 
 */
reg uint8 B5D6 : 0xe7c; 

/*
 * B5D7
 * 
 */
reg uint8 B5D7 : 0xe7d; 

/*
 * CANSTAT_RO4
 * 
 */
reg uint8 CANSTAT_RO4 : 0xe7e; 

/*
 * CANCON_RO4
 * 
 */
reg uint8 CANCON_RO4 : 0xe7f; 

/*
 * RXF0SIDH
 * 
 */
reg uint8 RXF0SIDH : 0xf00; 

/*
 * RXF0SIDL
 * 
 */
reg uint8 RXF0SIDL : 0xf01; 

/*
 * RXF0EIDH
 * 
 */
reg uint8 RXF0EIDH : 0xf02; 

/*
 * RXF0EIDL
 * 
 */
reg uint8 RXF0EIDL : 0xf03; 

/*
 * RXF1SIDH
 * 
 */
reg uint8 RXF1SIDH : 0xf04; 

/*
 * RXF1SIDL
 * 
 */
reg uint8 RXF1SIDL : 0xf05; 

/*
 * RXF1EIDH
 * 
 */
reg uint8 RXF1EIDH : 0xf06; 

/*
 * RXF1EIDL
 * 
 */
reg uint8 RXF1EIDL : 0xf07; 

/*
 * RXF2SIDH
 * 
 */
reg uint8 RXF2SIDH : 0xf08; 

/*
 * RXF2SIDL
 * 
 */
reg uint8 RXF2SIDL : 0xf09; 

/*
 * RXF2EIDH
 * 
 */
reg uint8 RXF2EIDH : 0xf0a; 

/*
 * RXF2EIDL
 * 
 */
reg uint8 RXF2EIDL : 0xf0b; 

/*
 * RXF3SIDH
 * 
 */
reg uint8 RXF3SIDH : 0xf0c; 

/*
 * RXF3SIDL
 * 
 */
reg uint8 RXF3SIDL : 0xf0d; 

/*
 * RXF3EIDH
 * 
 */
reg uint8 RXF3EIDH : 0xf0e; 

/*
 * RXF3EIDL
 * 
 */
reg uint8 RXF3EIDL : 0xf0f; 

/*
 * RXF4SIDH
 * 
 */
reg uint8 RXF4SIDH : 0xf10; 

/*
 * RXF4SIDL
 * 
 */
reg uint8 RXF4SIDL : 0xf11; 

/*
 * RXF4EIDH
 * 
 */
reg uint8 RXF4EIDH : 0xf12; 

/*
 * RXF4EIDL
 * 
 */
reg uint8 RXF4EIDL : 0xf13; 

/*
 * RXF5SIDH
 * 
 */
reg uint8 RXF5SIDH : 0xf14; 

/*
 * RXF5SIDL
 * 
 */
reg uint8 RXF5SIDL : 0xf15; 

/*
 * RXF5EIDH
 * 
 */
reg uint8 RXF5EIDH : 0xf16; 

/*
 * RXF5EIDL
 * 
 */
reg uint8 RXF5EIDL : 0xf17; 

/*
 * RXM0SIDH
 * 
 */
reg uint8 RXM0SIDH : 0xf18; 

/*
 * RXM0SIDL
 * 
 */
reg uint8 RXM0SIDL : 0xf19; 

/*
 * RXM0EIDH
 * 
 */
reg uint8 RXM0EIDH : 0xf1a; 

/*
 * RXM0EIDL
 * 
 */
reg uint8 RXM0EIDL : 0xf1b; 

/*
 * RXM1SIDH
 * 
 */
reg uint8 RXM1SIDH : 0xf1c; 

/*
 * RXM1SIDL
 * 
 */
reg uint8 RXM1SIDL : 0xf1d; 

/*
 * RXM1EIDH
 * 
 */
reg uint8 RXM1EIDH : 0xf1e; 

/*
 * RXM1EIDL
 * 
 */
reg uint8 RXM1EIDL : 0xf1f; 

/*
 * TXB2CON
 * 
 */
reg uint8 TXB2CON : 0xf20; 

/*
 * TXB2SIDH
 * 
 */
reg uint8 TXB2SIDH : 0xf21; 

/*
 * TXB2SIDL
 * 
 */
reg uint8 TXB2SIDL : 0xf22; 

/*
 * TXB2EIDH
 * 
 */
reg uint8 TXB2EIDH : 0xf23; 

/*
 * TXB2EIDL
 * 
 */
reg uint8 TXB2EIDL : 0xf24; 

/*
 * TXB2DLC
 * 
 */
reg uint8 TXB2DLC : 0xf25; 

/*
 * TXB2D0
 * 
 */
reg uint8 TXB2D0 : 0xf26; 

/*
 * TXB2D1
 * 
 */
reg uint8 TXB2D1 : 0xf27; 

/*
 * TXB2D2
 * 
 */
reg uint8 TXB2D2 : 0xf28; 

/*
 * TXB2D3
 * 
 */
reg uint8 TXB2D3 : 0xf29; 

/*
 * TXB2D4
 * 
 */
reg uint8 TXB2D4 : 0xf2a; 

/*
 * TXB2D5
 * 
 */
reg uint8 TXB2D5 : 0xf2b; 

/*
 * TXB2D6
 * 
 */
reg uint8 TXB2D6 : 0xf2c; 

/*
 * TXB2D7
 * 
 */
reg uint8 TXB2D7 : 0xf2d; 

/*
 * CANSTAT_RO3
 * 
 */
reg uint8 CANSTAT_RO3 : 0xf2e; 

/*
 * CANCON_RO3
 * 
 */
reg uint8 CANCON_RO3 : 0xf2f; 

/*
 * TXB1CON
 * 
 */
reg uint8 TXB1CON : 0xf30; 

/*
 * TXB1SIDH
 * 
 */
reg uint8 TXB1SIDH : 0xf31; 

/*
 * TXB1SIDL
 * 
 */
reg uint8 TXB1SIDL : 0xf32; 

/*
 * TXB1EIDH
 * 
 */
reg uint8 TXB1EIDH : 0xf33; 

/*
 * TXB1EIDL
 * 
 */
reg uint8 TXB1EIDL : 0xf34; 

/*
 * TXB1DLC
 * 
 */
reg uint8 TXB1DLC : 0xf35; 

/*
 * TXB1D0
 * 
 */
reg uint8 TXB1D0 : 0xf36; 

/*
 * TXB1D1
 * 
 */
reg uint8 TXB1D1 : 0xf37; 

/*
 * TXB1D2
 * 
 */
reg uint8 TXB1D2 : 0xf38; 

/*
 * TXB1D3
 * 
 */
reg uint8 TXB1D3 : 0xf39; 

/*
 * TXB1D4
 * 
 */
reg uint8 TXB1D4 : 0xf3a; 

/*
 * TXB1D5
 * 
 */
reg uint8 TXB1D5 : 0xf3b; 

/*
 * TXB1D6
 * 
 */
reg uint8 TXB1D6 : 0xf3c; 

/*
 * TXB1D7
 * 
 */
reg uint8 TXB1D7 : 0xf3d; 

/*
 * CANSTAT_RO2
 * 
 */
reg uint8 CANSTAT_RO2 : 0xf3e; 

/*
 * CANCON_RO2
 * 
 */
reg uint8 CANCON_RO2 : 0xf3f; 

/*
 * TXB0CON
 * 
 */
reg uint8 TXB0CON : 0xf40; 

/*
 * TXB0SIDH
 * 
 */
reg uint8 TXB0SIDH : 0xf41; 

/*
 * TXB0SIDL
 * 
 */
reg uint8 TXB0SIDL : 0xf42; 

/*
 * TXB0EIDH
 * 
 */
reg uint8 TXB0EIDH : 0xf43; 

/*
 * TXB0EIDL
 * 
 */
reg uint8 TXB0EIDL : 0xf44; 

/*
 * TXB0DLC
 * 
 */
reg uint8 TXB0DLC : 0xf45; 

/*
 * TXB0D0
 * 
 */
reg uint8 TXB0D0 : 0xf46; 

/*
 * TXB0D1
 * 
 */
reg uint8 TXB0D1 : 0xf47; 

/*
 * TXB0D2
 * 
 */
reg uint8 TXB0D2 : 0xf48; 

/*
 * TXB0D3
 * 
 */
reg uint8 TXB0D3 : 0xf49; 

/*
 * TXB0D4
 * 
 */
reg uint8 TXB0D4 : 0xf4a; 

/*
 * TXB0D5
 * 
 */
reg uint8 TXB0D5 : 0xf4b; 

/*
 * TXB0D6
 * 
 */
reg uint8 TXB0D6 : 0xf4c; 

/*
 * TXB0D7
 * 
 */
reg uint8 TXB0D7 : 0xf4d; 

/*
 * CANSTAT_RO1
 * 
 */
reg uint8 CANSTAT_RO1 : 0xf4e; 

/*
 * CANCON_RO1
 * 
 */
reg uint8 CANCON_RO1 : 0xf4f; 

/*
 * RXB1CON
 * 
 */
reg uint8 RXB1CON : 0xf50; 

/*
 * RXB1SIDH
 * 
 */
reg uint8 RXB1SIDH : 0xf51; 

/*
 * RXB1SIDL
 * 
 */
reg uint8 RXB1SIDL : 0xf52; 

/*
 * RXB1EIDH
 * 
 */
reg uint8 RXB1EIDH : 0xf53; 

/*
 * RXB1EIDL
 * 
 */
reg uint8 RXB1EIDL : 0xf54; 

/*
 * RXB1DLC
 * 
 */
reg uint8 RXB1DLC : 0xf55; 

/*
 * RXB1D0
 * 
 */
reg uint8 RXB1D0 : 0xf56; 

/*
 * RXB1D1
 * 
 */
reg uint8 RXB1D1 : 0xf57; 

/*
 * RXB1D2
 * 
 */
reg uint8 RXB1D2 : 0xf58; 

/*
 * RXB1D3
 * 
 */
reg uint8 RXB1D3 : 0xf59; 

/*
 * RXB1D4
 * 
 */
reg uint8 RXB1D4 : 0xf5a; 

/*
 * RXB1D5
 * 
 */
reg uint8 RXB1D5 : 0xf5b; 

/*
 * RXB1D6
 * 
 */
reg uint8 RXB1D6 : 0xf5c; 

/*
 * RXB1D7
 * 
 */
reg uint8 RXB1D7 : 0xf5d; 

/*
 * CANSTAT_RO0
 * 
 */
reg uint8 CANSTAT_RO0 : 0xf5e; 

/*
 * CANCON_RO0
 * 
 */
reg uint8 CANCON_RO0 : 0xf5f; 

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
 * BRGCON1
 * 
 */
reg uint8 BRGCON1 : 0xf70; 

/*
 * BRGCON2
 * 
 */
reg uint8 BRGCON2 : 0xf71; 

/*
 * BRGCON3
 * 
 */
reg uint8 BRGCON3 : 0xf72; 

/*
 * CIOCON
 * 
 */
reg uint8 CIOCON : 0xf73; 

/*
 * COMSTAT
 * 
 */
reg uint8 COMSTAT : 0xf74; 

/*
 * RXERRCNT
 * 
 */
reg uint8 RXERRCNT : 0xf75; 

/*
 * TXERRCNT
 * 
 */
reg uint8 TXERRCNT : 0xf76; 

/*
 * ECANCON
 * 
 */
reg uint8 ECANCON : 0xf77; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xf79; 

/*
 * BAUDCON
 * 
 */
reg uint8 BAUDCON : 0xf7e; 

/*
 * SPBRGH
 * 
 */
reg uint8 SPBRGH : 0xf7f; 

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
 * PORTF
 * 
 */
reg uint8 PORTF : 0xf85; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0xf86; 

/*
 * PORTH
 * 
 */
reg uint8 PORTH : 0xf87; 

/*
 * PORTJ
 * 
 */
reg uint8 PORTJ : 0xf88; 

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
 * LATF
 * 
 */
reg uint8 LATF : 0xf8e; 

/*
 * LATG
 * 
 */
reg uint8 LATG : 0xf8f; 

/*
 * LATH
 * 
 */
reg uint8 LATH : 0xf90; 

/*
 * LATJ
 * 
 */
reg uint8 LATJ : 0xf91; 

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
 * TRISF
 * 
 */
reg uint8 TRISF : 0xf97; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0xf98; 

/*
 * TRISH
 * 
 */
reg uint8 TRISH : 0xf99; 

/*
 * TRISJ
 * 
 */
reg uint8 TRISJ : 0xf9a; 

/*
 * MEMCON
 * 
 */
reg uint8 MEMCON : 0xf9c; 

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
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xfa6; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xfa7; 

/*
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0xfa8; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0xfa9; 

/*
 * EEADRH
 * 
 */
reg uint8 EEADRH : 0xfaa; 

/*
 * RCSTA
 * 
 */
reg uint8 RCSTA : 0xfab; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0xfac; 

/*
 * TXREG
 * 
 */
reg uint8 TXREG : 0xfad; 

/*
 * RCREG
 * 
 */
reg uint8 RCREG : 0xfae; 

/*
 * SPBRG
 * 
 */
reg uint8 SPBRG : 0xfaf; 

/*
 * PSPCON
 * 
 */
reg uint8 PSPCON : 0xfb0; 

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
 * CMCON
 * 
 */
reg uint8 CMCON : 0xfb4; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xfb5; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfb6; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xfba; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xfbb; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfbd; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfbe; 

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
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0xfd2; 

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

