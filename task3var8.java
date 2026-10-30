import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите три числа (через пробел): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double middle;

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            middle = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("Среднее число: " + middle);
    }
}
