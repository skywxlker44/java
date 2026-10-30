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

    public static boolean validate(double value) {
        return value > 0;
    }

    public static double readValidInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (validate(val)) {
                    return val;
                } else {
                    System.out.println("Ошибка: число должно быть больше 0! Повторите ввод.");
                }
            } else {
                System.out.println("Ошибка: введено не число! Повторите ввод.");
                scanner.next();
            }
        }
    }

    public static double[] inputParams(Scanner scanner) {
        double[] params = new double[2];
        params[0] = readValidInput(scanner, "Введите ширину прямоугольника: ");
        params[1] = readValidInput(scanner, "Введите высоту прямоугольника: ");
        return params;
    }

    public static double[] calculate(double[] params) {
        double width = params[0];
        double height = params[1];
        double area = width * height;
        double perimeter = 2 * (width + height);
        return new double[]{area, perimeter};
    }

    public static void printResults(double[] results) {
        System.out.println("\n--- Результаты расчетов ---");
        System.out.printf("Площадь: %.2f\n", results[0]);
        System.out.printf("Периметр: %.2f\n", results[1]);
    }

    public static void showAppInfo() {
        System.out.println("\n--- Информация о программе ---");
        System.out.println("Программа производит вычисление площади и периметра фигуры.");
        System.out.println("Версия: 3.0 (с передачей параметров через массивы).");
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
                    double[] params = inputParams(scanner);
                    double[] results = calculate(params);
                    printResults(results);
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