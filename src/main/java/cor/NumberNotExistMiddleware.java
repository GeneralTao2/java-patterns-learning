package cor;

public class NumberNotExistMiddleware extends Middleware {
    private final Server server;

    public NumberNotExistMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String number, String password) {
        if(server.hasNumber(number)) {
            System.out.println("Number already exists");
            return false;
        }
        return checkNext(number, password);
    }
}
