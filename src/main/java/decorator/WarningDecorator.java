package decorator;

public class WarningDecorator extends TextDecorator {
    public WarningDecorator(Text wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String text) {
        super.print("Warinng! "+text);
    }
}
