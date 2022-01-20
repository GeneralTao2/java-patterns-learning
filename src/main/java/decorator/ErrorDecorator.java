package decorator;

public class ErrorDecorator extends TextDecorator {
    public ErrorDecorator(Text wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String text) {
        super.print("Error! "+text);
    }
}
