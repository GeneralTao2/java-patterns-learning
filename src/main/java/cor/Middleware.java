package cor;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String number, String password);

    protected boolean checkNext(String number, String password) {
        if (next == null) {
            return true;
        }
        return next.check(number, password);
    }
}
