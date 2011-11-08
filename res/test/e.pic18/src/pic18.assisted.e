namespace microchip.pic18.assisted;

import e.types;
import microchip.pic18;

compilecontext bank = 0;

compilecontext bank_a;
assistSelectBank(address f){
	bank_a = 0;
	if((f > 0x5f) && (f < 0xf60)){
		// bank selection needed
		bank_a = 1;
		if (bank != (f&&0xf00)){
			bank = (f&&0xf00);
			SELECTB(f);
		}
	}else{
		// no bank selection
	}
} returns bank_a;

aADDWF(address f, bool d=1){
	ADDWF(f,d,assistSelectBank(f));
}

aADDWFC(address f, bool d=1){
	ADDWFC(f,d,assistSelectBank(f));
}

aANDWF(address f, bool d=1){
	ANDWF(f,d,assistSelectBank(f));
}

aCLRF(address f){
	CLRF(f,assistSelectBank(f));
}

aCOMF(address f, bool d=1){
	COMF(f,d,assistSelectBank(f));
}

aCPFSEQ(address f){
	CPFSEQ(f,assistSelectBank(f));
}

aCPFSGT(address f){
	CPFSGT(f,assistSelectBank(f));
}

aCPFSLT(address f){
	CPFSLT(f,assistSelectBank(f));
}

aDECF(address f, bool d=1){
	DECF(f,d,assistSelectBank(f));
}

aDECFSZ(address f, bool d=1){
	DECFSZ(f,d,assistSelectBank(f));
}

aDCFSNZ(address f, bool d=1){
	DCFSNZ(f,d,assistSelectBank(f));
}

aINCF(address f, bool d=1){
	INCF(f,d,assistSelectBank(f));
}

aINCFSZ(address f, bool d=1){
	INCFSZ(f,d,assistSelectBank(f));
}

aINFSNZ(address f, bool d=1){
	INFSNZ(f,d,assistSelectBank(f));
}

aIORWF(address f, bool d=1){
	IORWF(f,d,assistSelectBank(f));
}

aMOVF(address f, bool d=1){
	MOVF(f,d,assistSelectBank(f));
}

aMOVWF(address f){
	MOVWF(f,assistSelectBank(f));
}

aMULWF(address f){
	MULWF(f,assistSelectBank(f));
}

aNEGF(address f){
	NEGF(f,assistSelectBank(f));
}

aRLCF(address f, bool d=1){
	RLCF(f,d,assistSelectBank(f));
}

aRLNCF(address f, bool d=1){
	RLNCF(f,d,assistSelectBank(f));
}

aRRCF(address f, bool d=1){
	RRCF(f,d,assistSelectBank(f));
}

aRRNCF(address f, bool d=1){
	RRNCF(f,d,assistSelectBank(f));
}

aSETF(address f){
	SETF(f,assistSelectBank(f));
}

aSUBFWB(address f, bool d=1){
	SUBFWB(f,d,assistSelectBank(f));
}

aSUBWF(address f, bool d=1){
	SUBWF(f,d,assistSelectBank(f));
}

aSUBWFB(address f, bool d=1){
	SUBWFB(f,d,assistSelectBank(f));
}

aSWAPF(address f, bool d=1){
	SWAPF(f,d,assistSelectBank(f));
}

aTSTFSZ(address f){
	TSTFSZ(f,assistSelectBank(f));
}

aXORWF(address f, bool d=1){
	XORWF(f,d,assistSelectBank(f));
}

aBCF(address f, bit b){
	BCF(f,b,assistSelectBank(f));
}

aBSF(address f, bit b){
	BSF(f,b,assistSelectBank(f));
}

aBTFSC(address f, bit b){
	BTFSC(f,b,assistSelectBank(f));
}

aBTFSS(address f, bit b){
	BTFSS(f,b,assistSelectBank(f));
}

aBTG(address f, bit b){
	BTG(f,b,assistSelectBank(f));
}