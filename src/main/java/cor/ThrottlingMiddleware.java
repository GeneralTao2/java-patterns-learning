package cor;

public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int requestQuantity;
    private long lastRequestTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.requestQuantity = 0;
        this.lastRequestTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String number, String password) {
        if (System.currentTimeMillis() - lastRequestTime > 60_000) {
            requestQuantity = 0;
            lastRequestTime = System.currentTimeMillis();
        }

        requestQuantity++;
        if (requestQuantity > requestPerMinute) {
            System.out.println("ThrottlingMiddleware: Too many requests");
            return false;
        }
        return checkNext(number, password);
    }
}
