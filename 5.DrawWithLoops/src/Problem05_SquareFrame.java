import java.util.Scanner;

public class Problem05_SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 1; row <= n; row++) {
            int column = 1;
            while (column <= n) {
                if (row == 1) {
                    if (column == 1) {
                        System.out.print("+ ");
                        column++;
                    }
                    while (column < n) {
                        System.out.print("- ");
                        column++;
                    }
                    if (column == n) {
                        System.out.println("+ ");
                        column++;
                    }
                }
                if (row != 1 && row != n) {
                    if (column == 1) {
                        System.out.print("| ");
                        column++;
                    }
                    while (column < n) {
                        System.out.print("- ");
                        column++;
                    }
                    if (column == n) {
                        System.out.println("| ");
                        column++;
                    }
                }

                if (row == n) {
                    if (column == 1) {
                        System.out.print("+ ");
                        column++;
                    }
                    while (column < n) {
                        System.out.print("- ");
                        column++;
                    }
                    if (column == n) {
                        System.out.print("+ ");
                        column++;
                    }
                }

            }
        }
    }
}



