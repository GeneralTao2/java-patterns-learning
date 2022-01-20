package cor;

public class CheckLengthMiddleware extends Middleware {
    final int MIN_NUMBER_LENGTH = 4;
    final int MAX_NUMBER_LENGTH = 10;
    final int MIN_PASSWORD_LENGTH = 4;
    final int MAX_PASSWORD_LENGTH = 11;

    @Override
    public boolean check(String number, String password) {

        if(number.length() < MIN_NUMBER_LENGTH) {
            System.out.println("Number is too short. It should be at least " + MIN_NUMBER_LENGTH + " characters long.");
            return false;
        }

        if(number.length() > MAX_NUMBER_LENGTH) {
            System.out.println("Number is too long. It should be at most " + MAX_NUMBER_LENGTH + " characters long.");
            return false;
        }

        if(password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Password is too short. It should be at least " + MIN_PASSWORD_LENGTH + " characters long.");
            return false;
        }

        if(password.length() > MAX_PASSWORD_LENGTH) {
            System.out.println("Password is too long. It should be at most " + MAX_PASSWORD_LENGTH + " characters long.");
            return false;
        }

        return checkNext(number, password);
    }
}
