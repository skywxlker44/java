import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = Math.sin(x) + Math.sqrt(Math.abs(x)) + Math.pow(x, 2);

        System.out.printf("Значение функции f(%.3f) = %.4f\n", x, y);
    }
}
