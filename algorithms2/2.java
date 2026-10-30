import java.util.Scanner;

public class DepositGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = scanner.nextInt();
        int deposit = scanner.nextInt();
        int months = scanner.nextInt();

        System.out.println("0: " + balance);
        for (int m = 1; m <= months; m++) {
            balance += deposit;
            System.out.println(m + ": " + balance);
        }
    }
}