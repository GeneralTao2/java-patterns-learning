package cor;

import java.util.regex.Pattern;

public class CheckPermissibleCharsMiddleware extends Middleware {
    Pattern numberPattern = Pattern.compile("[0-9]*");
    Pattern passwordPattern = Pattern.compile("[a-zA-Z0-9_]*");

    @Override
    public boolean check(String number, String password) {
        if (!numberPattern.matcher(number).matches()) {
            System.out.println("Number contains illegal characters. Use only digits.");
            return false;
        }

        if (!passwordPattern.matcher(password).matches()) {
            System.out.println("Password contains illegal characters. Use only digits, letters and underscore.");
            return false;
        }
        return checkNext(number, password);
    }
}
