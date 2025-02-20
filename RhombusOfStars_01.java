import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printRhombus(n);

    }

    private static void printRhombus(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        }
        for (int i = 1; i < n; i++) {
            printRow(i, n);
        }

        for (int i = n; i >= 1; i--) {
            printRow(i, n);
        }
    }

    private static void printRow(int i, int n) {
        int whiteSpace = n - i;
        for (int j = 0; j < whiteSpace; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
