import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return;
        }

        boolean hasOddDigit = false;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                hasOddDigit = true;
                break;
            }
            temp /= 10;
        }

        System.out.println(hasOddDigit ? "True" : "False");
    }
}