package decorator;

public class App {
    public static void main(String[] args) {
        Text text = new LableText("Text1");
        text.print("Compiled!");
        text = new WarningDecorator(text);
        text.print("Unused variable!");
        text = new ErrorDecorator(text.getWrappee());
        text.print("Undefined behavior!");
        text = new WarningDecorator(text);
        text.print("Critical mistake in code!");
    }
}
