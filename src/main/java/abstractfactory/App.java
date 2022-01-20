package abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class App {
    static ChatFactory chatFactory;
    static String ImageOrLink;
    static List<Subscriber> subscriberList;

    static void init(String[] args) throws Exception {
        if(args.length == 0) {
            throw new Exception("No arguments");
        } else {
            ImageOrLink = args[0];
        }
        switch (args[0]) {
            case "image":
                chatFactory = new TelegrammChatFactory();
                break;
            case "link":
                chatFactory = new SinairChatFactory();
                break;
            case "video":
                chatFactory = new YouTubeChatFactory();
                break;
            default:
                throw new Exception("Unknown argument");
        }

        subscriberList = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        init(args);

        chatFactory.sendMessage("Hello, world!");
        subscriberList.addAll(List.of(
                chatFactory.createSubscriber("Alan", "1234", 26),
                chatFactory.createSubscriber("Qwer", "4332", 98),
                chatFactory.createSubscriber("Asdf", "7654", 54)
        ));

        subscriberList.forEach(Subscriber::info);

    }
}
