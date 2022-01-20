package bridge;

public class App {
    public static void main(String[] args) {
        EasyEncoding easyEncoding = new EasyEncoding();
        MessageTransmitter messageTransmitter = new MessageTransmitter(easyEncoding);
        Message message = new Message("Author1", "image1", "text1", "video1");
        messageTransmitter.transmitEncodedMessage(message);

        StrongEncoding strongEncoding = new StrongEncoding();
        messageTransmitter.setEncoding(strongEncoding);
        messageTransmitter.transmitEncodedMessage(message);

        ReliableMessageTransmitter reliableMessageTransmitter = new ReliableMessageTransmitter(easyEncoding);
        reliableMessageTransmitter.transmitEncodedMessage(message);

    }
}
