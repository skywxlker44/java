import java.util.Scanner;

public class RookMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String position = scanner.next();

        char col = position.charAt(0);
        char row = position.charAt(1);

        for (char c = 'a'; c <= 'h'; c++) {
            if (c != col) {
                System.out.print("" + c + row + " ");
            }
        }

        for (char r = '1'; r <= '8'; r++) {
            if (r != row) {
                System.out.print("" + col + r + " ");
            }
        }
        System.out.println();
    }
}