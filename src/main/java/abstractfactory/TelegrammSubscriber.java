package abstractfactory;

public class TelegrammSubscriber implements Subscriber{
    private String name;
    private String number;

    public TelegrammSubscriber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void info() {
        System.out.println("abstractfactory.TelegrammSubscriber: " + name + " " + number);
    }
}
