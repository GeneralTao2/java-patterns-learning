package abstractfactory;

public class SinAirSubscriber implements Subscriber {
    private final String name;

    public SinAirSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println(name + ": " + "I'm the sinair subscriber");
    }
}
