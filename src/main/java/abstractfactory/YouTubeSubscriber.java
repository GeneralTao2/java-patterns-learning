package abstractfactory;

public class YouTubeSubscriber implements Subscriber {
    private final String name;
    private final int age;

    public YouTubeSubscriber(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void info() {
        System.out.println("YouTube subscriber info: " + name + ' ' + Integer.toString(age));
    }
}
