package cor;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>() {{
        put("1234", "1234abcd");
        put("5678", "1234");
    }};
    private Middleware registerMiddleware;
    private Middleware loginMiddleware;

    public void setRegisterMiddleware(Middleware registerMiddleware) {
        this.registerMiddleware = registerMiddleware;
    }

    public void setLoginMiddleware(Middleware loginMiddleware) {
        this.loginMiddleware = loginMiddleware;
    }

    public boolean register(String number, String password) {
        if (registerMiddleware.check(number, password)) {
            users.put(number, password);
            System.out.println("Register success!");
            return true;
        }
        return false;
    }

    public boolean login(String number, String password) {
        if (loginMiddleware.check(number, password)) {
            System.out.println("Login success!");
            return true;
        } else {
            System.out.println("Login failed!");
        }
        return false;
    }

    public boolean hasNumber(String number) {
        return users.containsKey(number);
    }

    public boolean isValidPassword(String number, String password) {
        return users.get(number).equals(password);
    }
}
