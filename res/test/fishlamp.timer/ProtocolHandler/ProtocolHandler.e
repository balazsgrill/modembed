namespace ProtocolHandler;

import e.types;
import e.platform;
import ProtocolHandler.messages;
import pic18f14k50.eusart;

uint8 rcvmsg_started;
uint8 rcvcount;
TMessage rcvmessage;

init(){
	RS232_init();
	rcvmsg_started = 0;
}

refresh(){
	uint8 rcv;
	uint8 rcvcounter;
	
	rcvcounter = 0;
	RS232_rcv(rcv, rcvcounter);
	if (rcvcounter){
		// data is received
		
		if (rcvmsg_started){
			if (rcvcount > 0){
				//data byte
				message_addData(rcvmessage, rcv);
				rcvcount = rcvcount - 1;
			}else{
				//checksum
				rcvmessage.checksum = rcv;
				//last byte of message
				rcvmsg_started = 0;
			}
		}else{
			//first byte
			rcvmessage.msgID = rcv / 16;
			rcvcount = rcv % 16;
			rcvmsg_started = 1;  
		}
		
	}
}
