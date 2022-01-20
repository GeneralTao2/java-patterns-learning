package abstractfactory;

public class TextWithLinkMessage implements Message {
    private final String buffer;

    public TextWithLinkMessage(String buffer) {
        this.buffer = buffer;
    }

    @Override
    public void print() {
        System.out.println("abstractfactory.TextWithLinkMessage: " + buffer);
    }
}
