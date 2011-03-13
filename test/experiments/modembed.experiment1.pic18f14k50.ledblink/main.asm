        LIST    P=18F14K50, R=HEX

        ORG     0

		MOVLB 0xF
		CLRF 0x94
		SETF 0x82
start
		GOTO start

        END