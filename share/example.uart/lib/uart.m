module uart;

void uart_init();
boolean uart_canSend();
void uart_send(uint8 data);
boolean uart_canReceive();
uint8 uart_receive();
