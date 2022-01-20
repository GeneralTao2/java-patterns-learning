package bridge;

public class ReliableMessageTransmitter extends MessageTransmitter {
    public ReliableMessageTransmitter(Encoding encoding) {
        super(encoding);
    }

    private void checkIfTransmitted(String author) {
        System.out.println("Message from " + author + " - Transmitted!");
    }

    @Override
    public void transmitEncodedMessage(Message message) {
        super.transmitEncodedMessage(message);
        checkIfTransmitted(message.getAuthor());
    }
}
