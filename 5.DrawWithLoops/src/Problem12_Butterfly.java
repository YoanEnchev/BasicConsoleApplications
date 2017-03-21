import java.util.Scanner;

public class Problem12_Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 1; row <= n - 2; row++) {
            int printStars = 1;
            int printDashes = 1;

            if (row % 2 != 0) {
                while (printStars <= n - 2) {
                    System.out.print("*");
                    printStars++;
                }
                System.out.print("\\ /");

                printStars = 1;

                while (printStars <= n - 2) {
                    System.out.print("*");
                    printStars++;
                }
            }

            if (row % 2 == 0) {
                while (printDashes <= n - 2) {
                    System.out.print("-");
                    printDashes++;
                }
                System.out.print("\\ /");

                printDashes = 1;

                while (printDashes <= n - 2) {
                    System.out.print("-");
                    printDashes++;
                }
            }
            System.out.println();
        }

        int printEmptySpaces = 1;
        while (printEmptySpaces <= n - 1) {
            System.out.print(" ");
            printEmptySpaces++;
        }

        System.out.print("@");
        System.out.println();

        for (int row = 1; row <= n - 2; row++) {
            int printStars = 1;
            int printDashes = 1;

            if (row % 2 != 0) {
                while (printStars <= n - 2) {
                    System.out.print("*");
                    printStars++;
                }
                System.out.print("/");
                System.out.print(" \\");

                printStars = 1;

                while (printStars <= n - 2) {
                    System.out.print("*");
                    printStars++;
                }
            }

            if (row % 2 == 0) {
                while (printDashes <= n - 2) {
                    System.out.print("-");
                    printDashes++;
                }
                System.out.print("/");
                System.out.print(" \\");
                printDashes = 1;

                while (printDashes <= n - 2) {
                    System.out.print("-");
                    printDashes++;
                }
            }
            System.out.println();
        }
    }
}
