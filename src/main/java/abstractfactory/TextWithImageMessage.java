package abstractfactory;

public class TextWithImageMessage implements Message {
    private final String buffer;

    public TextWithImageMessage(String buffer) {
        this.buffer = buffer;
    }

    @Override
    public void print() {
        System.out.println("abstractfactory.TextWithImageMessage: " + buffer);
    }
}
