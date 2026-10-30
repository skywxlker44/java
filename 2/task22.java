import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вещественное число A: ");
        double a = scanner.nextDouble();

        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return;
        }

        double currentPower = 1.0;
        for (int i = 1; i <= n; i++) {
            currentPower *= a;
            System.out.printf("A^%d = %.4f\n", i, currentPower);
        }
    }
}