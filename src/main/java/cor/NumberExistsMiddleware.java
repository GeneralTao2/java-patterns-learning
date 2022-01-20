package cor;

public class NumberExistsMiddleware extends Middleware {
    private Server server;

    public NumberExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String number, String password) {
        if(!server.hasNumber(number)) {
            System.out.println("Number does not exist");
            return false;
        }
        if(!server.isValidPassword(number, password)) {
            System.out.println("Invalid password");
        }
        return checkNext(number, password);
    }
}
