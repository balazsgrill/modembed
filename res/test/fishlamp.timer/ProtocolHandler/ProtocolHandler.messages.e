namespace ProtocolHandler.messages;

import e.types;

type TMessageLoad = uint8[16];
type TMessage = struct{
	uint8 msgID,
	uint8 count,
	uint8 checksum,
	TMessageLoad load
}

message_create(var TMessage msg, uint8 id){
	msg.msgID = id;
	msg.count = 0;
	msg.checksum = 0;
}

message_addData(var TMessage msg, uint8 v){
	msg.load[msg.count] = v;
	msg.count = msg.count+1; 
}
