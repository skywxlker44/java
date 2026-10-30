import java.util.Scanner;

public class Task4 {

    public static double calculatePerimeter(double x1, double y1, double x2, double y2) {
        double width = Math.abs(x2 - x1);
        double height = Math.abs(y1 - y2);
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты левой верхней вершины (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты правой нижней вершины (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double perimeter = calculatePerimeter(x1, y1, x2, y2);
        System.out.printf("Периметр прямоугольника: %.4f\n", perimeter);
    }
}