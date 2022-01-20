package bridge;

public class MessageTransmitter {
    protected Encoding encoding;

    public MessageTransmitter() {
    }

    public MessageTransmitter(Encoding encoding) {
        this.encoding = encoding;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public void transmitEncodedMessage(Message message) {
        System.out.println(
                "Author" + message.getAuthor() + "\n" +
                encoding.encodeImage(message.getImage()) + "\n" +
                encoding.encodeText(message.getText()) + "\n" +
                encoding.encodeVideo(message.getVideo()) + "\n"
        );
    }
}
