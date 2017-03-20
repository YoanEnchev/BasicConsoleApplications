import java.util.Scanner;

public class Problem09_Glasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int dashes = 0;
        int printedDashes = 0;
        int stars = 0;
        int printedStars = 0;
        int restrictDashes = 0;

        if (n % 2 == 0) {

            for (int row = 1; row <= n / 2; row++) {
                dashes = 0;
                stars = 0;
                while (dashes < (n - 2) / 2 - printedDashes) {
                    System.out.print("-");
                    dashes++;
                }
                while (stars < printedStars + 2) {
                    System.out.print("*");
                    stars++;
                }

                dashes = 0;
                while (dashes < (n - 2) / 2 - printedDashes) {
                    System.out.print("-");
                    dashes++;
                }
                printedDashes++;
                printedStars += 2;
                System.out.println();
            }

            for (int row = 1; row <= n / 2; row++) {
                int col = 1;
                if (col == 1) {
                    System.out.print("|");
                    col++;
                }
                while (col < n) {
                    System.out.print("*");
                    col++;
                }
                System.out.println("|");
            }
        }
        if (n % 2 != 0) {
            for (int row = 1; row <= (n / 2) + 1; row++) {
                dashes = 0;
                stars = 0;
                while (dashes < (n / 2) - printedDashes) {
                    System.out.print("-");
                    dashes++;
                }
                while (stars < printedStars + 1) {
                    System.out.print("*");
                    stars++;
                }

                dashes = 0;
                while (dashes < (n / 2) - printedDashes) {
                    System.out.print("-");
                    dashes++;
                }
                printedDashes++;
                printedStars += 2;
                System.out.println();
            }

            for (int row = 1; row <= n / 2; row++) {
                int col = 1;
                if (col == 1) {
                    System.out.print("|");
                    col++;
                }
                while (col < n) {
                    System.out.print("*");
                    col++;
                }
                System.out.println("|");
            }
        }
    }
}
