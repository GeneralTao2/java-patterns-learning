package decorator;

public class TextDecorator implements Text {
    protected Text wrappee;

    public TextDecorator(Text wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public Text getWrappee() {
        return wrappee;
    }

    @Override
    public void print(String text) {
        wrappee.print(text);
    }
}
