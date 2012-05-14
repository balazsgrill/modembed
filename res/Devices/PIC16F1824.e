/*
 * Library for PIC16F1824.
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16F1824{
use e.platform;

        
          
          
            
              
            
          
        
register uint8 INDF0;

        
          
          
            
              
            
          
        
register uint8 INDF1;

        
          
          
            
              
            
          
          
        
register uint8 PCL;

        
          
          
            
              
              
              
              
              
              
              
            
          
        
register uint8 STATUS;

        
          
          
            
            
              
                
              
            
            
          
register uint8 FSR0L;

          
            
            
              
                
              
            
          
register uint8 FSR0H;

        
        
          
          
            
            
              
                
              
            
            
          
register uint8 FSR1L;

          
            
            
              
                
              
            
          
register uint8 FSR1H;

        
        
          
          
            
              
              
              
              
              
            
            
              
            
          
        
register uint8 BSR;

        
          
          
            
              
            
            
              
            
          
          
        
register uint8 WREG;

        
          
          
            
              
            
          
        
register uint8 PCLATH;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
              
            
          
          
        
register uint8 INTCON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
          
        
register uint8 PORTA;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
          
        
register uint8 PORTC;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 PIR1;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
        
register uint8 PIR2;

        
          
          
            
              
              
              
              
              
              
            
          
        
register uint8 PIR3;

        
        
          
          
            
              
            
          
          
        
register uint8 TMR0;

        
          
            
              
            
          
          
          
            
            
              
                
              
            
          
register uint8 TMR1L;

          
            
            
              
                
              
            
          
register uint8 TMR1H;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 T1CON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 T1GCON;

        
          
          
            
              
            
          
          
        
register uint8 TMR2;

        
          
          
            
              
            
          
        
register uint8 PR2;

        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 T2CON;

        
        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 CPSCON0;

        
          
          
            
              
              
              
              
            
            
              
              
            
          
        
register uint8 CPSCON1;

      
        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 TRISA;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 TRISC;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 PIE1;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 PIE2;

        
          
          
            
              
              
              
              
              
              
            
          
        
register uint8 PIE3;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
              
            
          
          
        
register uint8 OPTION_REG;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 PCON;

        
          
          
            
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 WDTCON;

        
          
          
            
              
              
              
              
              
              
            
            
              
            
          
          
        
register uint8 OSCTUNE;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
          
        
register uint8 OSCCON;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 OSCSTAT;

        
          
          
            
            
              
                
              
            
            
          
register uint8 ADRESL;

          
            
            
              
                
              
            
            
          
register uint8 ADRESH;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
            
              
              
            
          
          
        
register uint8 ADCON0;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
          
        
register uint8 ADCON1;

      
        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 LATA;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 LATC;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 CM1CON0;

        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
              
            
          
          
        
register uint8 CM1CON1;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 CM2CON0;

        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
              
            
          
          
        
register uint8 CM2CON1;

        
          
          
            
              
              
            
          
        
register uint8 CMOUT;

        
          
          
            
              
              
              
            
          
        
register uint8 BORCON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 FVRCON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 DACCON0;

        
          
          
            
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 DACCON1;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 SRCON0;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
        
register uint8 SRCON1;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 APFCON0;

        
          
          
            
              
              
              
              
            
          
        
register uint8 APFCON1;

      
        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 ANSELA;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 ANSELC;

        
        
          
          
            
            
              
                
              
            
            
          
register uint8 EEADRL;

          
            
            
              
                
              
            
            
          
register uint8 EEADRH;

        
        
          
          
            
            
              
                
              
            
            
          
register uint8 EEDATL;

          
            
            
              
                
              
            
            
          
register uint8 EEDATH;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 EECON1;

        
          
          
            
              
            
          
        
register uint8 EECON2;

        
        
          
          
            
              
            
          
          
        
register uint8 RCREG;

        
          
          
            
              
            
          
          
        
register uint8 TXREG;

        
          
            
          
          
            
              
            
          
          
        
register uint8 SPBRGL;

        
          
          
            
              
            
          
          
        
register uint8 SPBRGH;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 RCSTA;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 TXSTA;

        
          
          
            
              
              
              
              
              
              
              
              
            
          
        
register uint8 BAUDCON;

      
        
        
          
          
            
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 WPUA;

        
        
          
          
            
              
              
              
              
              
              
            
          
        
register uint8 WPUC;

        
        
          
            
          
          
            
              
            
          
          
        
register uint8 SSP1BUF;

        
          
            
          
          
            
              
            
          
          
        
register uint8 SSP1ADD;

        
          
            
          
          
            
              
            
          
          
        
register uint8 SSP1MSK;

        
          
            
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 SSP1STAT;

        
          
            
            
            
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
          
        
register uint8 SSP1CON;

        
          
            
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 SSP1CON2;

        
          
            
          
          
            
              
              
              
              
              
              
              
              
            
          
          
        
register uint8 SSP1CON3;

      
        
        
        
          
          
            
              
            
          
          
        
register uint8 CCPR1L;

        
          
          
            
              
            
          
          
        
register uint8 CCPR1H;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
          
        
register uint8 CCP1CON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 PWM1CON;

        
          
            
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 CCP1AS;

        
          
          
            
              
              
              
              
              
            
          
        
register uint8 PSTR1CON;

        
        
          
          
            
              
            
          
        
register uint8 CCPR2L;

        
          
          
            
              
            
          
        
register uint8 CCPR2H;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 CCP2CON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 PWM2CON;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 CCP2AS;

        
          
          
            
              
              
              
              
              
            
          
        
register uint8 PSTR2CON;

        
          
            
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
              
              
            
          
        
register uint8 CCPTMRS0;

      
        
        
        
          
          
            
              
            
          
        
register uint8 CCPR3L;

        
          
          
            
              
            
          
        
register uint8 CCPR3H;

        
          
          
            
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 CCP3CON;

        
        
          
          
            
              
            
          
        
register uint8 CCPR4L;

        
          
          
            
              
            
          
        
register uint8 CCPR4H;

        
          
          
            
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 CCP4CON;

      
        
        
          
          
            
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 INLVLA;

        
        
          
          
            
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 INLVLC;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 IOCAP;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 IOCAN;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
          
        
register uint8 IOCAF;

        
        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
              
            
          
        
register uint8 CLKRCON;

        
        
          
          
            
              
              
              
              
              
              
              
            
          
        
register uint8 MDCON;

        
          
          
            
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 MDSRC;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 MDCARL;

        
          
          
            
              
              
              
              
              
              
              
              
            
            
              
            
          
        
register uint8 MDCARH;

      
        
        
        
          
          
            
              
            
          
        
register uint8 TMR4;

        
          
          
            
              
            
          
        
register uint8 PR4;

        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 T4CON;

        
        
          
          
            
              
            
          
        
register uint8 TMR6;

        
          
          
            
              
            
          
        
register uint8 PR6;

        
          
          
            
              
              
              
              
              
              
              
            
            
              
              
              
            
          
        
register uint8 T6CON;

      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
        
        
        
          
          
            
              
              
              
            
          
        
register uint8 STATUS_SHAD;

        
          
          
            
              
            
          
        
register uint8 WREG_SHAD;

        
          
          
            
              
            
          
        
register uint8 BSR_SHAD;

        
          
          
            
              
            
          
        
register uint8 PCLATH_SHAD;

        
          
          
            
              
            
          
        
register uint8 FSR0L_SHAD;

        
          
          
            
              
            
          
        
register uint8 FSR0H_SHAD;

        
          
          
            
              
            
          
        
register uint8 FSR1L_SHAD;

        
          
          
            
              
            
          
        
register uint8 FSR1H_SHAD;

        
        
          
          
            
              
            
          
        
register uint8 STKPTR;

        
          
          
            
              
            
          
        
register uint8 TOSL;

        
          
          
            
              
            
          
        
register uint8 TOSH;

      
}
	