import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для расчета параметров прямоугольника ===");
        System.out.println("Программа вычисляет площадь и периметр прямоугольника по введенным сторонам.\n");

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.err.println("Ошибка валидации: стороны прямоугольника должны быть строго положительными числами!");
            return;
        }

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("\n--- Результаты расчетов ---");
        System.out.printf("Площадь прямоугольника: %.2f\n", area);
        System.out.printf("Периметр прямоугольника: %.2f\n", perimeter);
    }
}
