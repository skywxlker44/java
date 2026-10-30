public class SecondTask {

    public static int signal(int n, int first, int difference) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return first;
        }
        return signal(n - 1, first, difference) + difference;
    }
}