package abstractfactory;

public abstract class ChatFactory {
    public abstract Message createMessage(String bufer);
    public abstract Subscriber createSubscriber(String name, String number, int age);
    public void sendMessage(String message) {
        Message message1 = createMessage(message);
        message1.print();
    }
}
