import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int k = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                k++;
            }
        }
        System.out.println();
        System.out.println(k);
    }
}