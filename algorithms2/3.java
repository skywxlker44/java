import java.util.Scanner;

public class SignCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int val : array) {
            if (val > 0) {
                positive++;
            } else if (val < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive + ", " + negative + ", " + zero);
    }
}