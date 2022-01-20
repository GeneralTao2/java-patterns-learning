package decorator;

public interface Text {
    void print(String text);
    Text getWrappee();
}
