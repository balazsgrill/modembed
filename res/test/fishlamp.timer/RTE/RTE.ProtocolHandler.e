namespace RTE.ProtocolHandler;

import e.types;
import e.platform;
import ProtocolHandler;
import ProtocolHandler.messages;

TMessage rcvbuffer;
uint8 rcvevent;

init(){
	rcvevent = 0;
	ProtocolHandler.init();
}

messageReceived(TMessage msg){
	//rcvbuffer = msg;
	rcvevent = 1;
}

refresh(){
	//ProtocolHandler.refresh();
}
