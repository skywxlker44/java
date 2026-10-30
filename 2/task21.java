import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.sqrt(i);
        }

        System.out.printf("Сумма ряда y = %.6f\n", sum);
    }
}