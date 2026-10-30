public class FirstTask {

    public static int sumOfDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}