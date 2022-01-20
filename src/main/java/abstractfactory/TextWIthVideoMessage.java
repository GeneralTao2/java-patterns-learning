package abstractfactory;

public class TextWIthVideoMessage implements Message {
    private final String buffer;

    public TextWIthVideoMessage(String buffer) {
        this.buffer = buffer;
    }

    @Override
    public void print() {
        System.out.println("abstractfactory.TextWIthVideoMessage: " + buffer);
    }
}
