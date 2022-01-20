package decorator;

public class LableText implements Text {
    String text;

    public LableText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print(String text) {
        System.out.println("["+text+"] "+this.text);
    }

    @Override
    public Text getWrappee() {
        return this;
    }
}
