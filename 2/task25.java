import java.util.Scanner;

public class Task5 {

    public static void printMenu() {
        System.out.println("\n========== ГЛАВНОЕ МЕНЮ ==========");
        System.out.println("1. Выполнить расчет параметров прямоугольника");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("0. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    public static double readPositiveDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val > 0) {
                    return val;
                } else {
                    System.out.println("Ошибка: значение должно быть строго больше 0! Повторите ввод.");
                }
            } else {
                System.out.println("Ошибка: введено не число! Повторите ввод.");
                scanner.next();
            }
        }
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static double calculatePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static void executeCalculation(Scanner scanner) {
        System.out.println("\n--- Расчет площади и периметра ---");
        double width = readPositiveDouble(scanner, "Введите ширину прямоугольника: ");
        double height = readPositiveDouble(scanner, "Введите высоту прямоугольника: ");

        double area = calculateArea(width, height);
        double perimeter = calculatePerimeter(width, height);

        System.out.printf("Площадь: %.2f\n", area);
        System.out.printf("Периметр: %.2f\n", perimeter);
    }

    public static void showAppInfo() {
        System.out.println("\n--- Информация о программе ---");
        System.out.println("Программа предназначена для расчета геометрических параметров плоских фигур.");
        System.out.println("Версия: 2.0 (с поддержкой циклического меню и статических методов).");
    }

    public static void showDeveloperInfo() {
        System.out.println("\n--- Информация о разработчике ---");
        System.out.println("Разработчик: Студент группы");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    executeCalculation(scanner);
                    break;
                case "2":
                    showAppInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "0":
                    System.out.println("Завершение работы программы. До свидания!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный пункт меню! Введите число от 0 до 3.");
                    break;
            }
        }
    }
}