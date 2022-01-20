package abstractfactory;

public class SinairChatFactory extends ChatFactory {
    @Override
    public Subscriber createSubscriber(String name, String number, int age) {
        return new SinAirSubscriber(name);
    }

    @Override
    public Message createMessage(String buffer) {
        return new TextWithLinkMessage(buffer);
    }
}
