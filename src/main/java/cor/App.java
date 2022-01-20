package cor;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Server server = new Server();

        server.setRegisterMiddleware(new ThrottlingMiddleware(3) {{
            this
                    .linkWith(new CheckLengthMiddleware())
                    .linkWith(new CheckPermissibleCharsMiddleware())
                    .linkWith(new NumberNotExistMiddleware(server));
        }}
        );

        server.setLoginMiddleware(new ThrottlingMiddleware(4) {{
            this
                    .linkWith(new NumberExistsMiddleware(server));
        }}
        );

        server.register("12345", "12345");
        server.register("12345", "12345");
        server.register("123451a", "12345");
        server.register("123452", "12345");


        server.login("12345", "12345");
        server.login("123450", "12345");
        server.login("123450", "12345");
        server.login("123450", "12345");
        server.login("123450", "12345");


    }
}
