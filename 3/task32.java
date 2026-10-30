import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        boolean inDecreasingSegment = false;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                if (!inDecreasingSegment) {
                    count++;
                    inDecreasingSegment = true;
                }
            } else {
                inDecreasingSegment = false;
            }
        }

        System.out.println(count);
    }
}