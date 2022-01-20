package abstractfactory;

public class TelegrammChatFactory extends ChatFactory {
    @Override
    public Subscriber createSubscriber(String name, String number, int age) {
        return new TelegrammSubscriber(name, number);
    }

    @Override
    public Message createMessage(String bufer) {
        return new TextWithImageMessage(bufer);
    }
}
