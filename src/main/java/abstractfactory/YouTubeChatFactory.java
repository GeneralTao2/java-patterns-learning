package abstractfactory;

public class YouTubeChatFactory extends ChatFactory {
    @Override
    public Subscriber createSubscriber(String name, String number, int age) {
        return new YouTubeSubscriber(name, age);
    }

    @Override
    public Message createMessage(String bufer) {
        return new TextWIthVideoMessage(bufer);
    }
}
