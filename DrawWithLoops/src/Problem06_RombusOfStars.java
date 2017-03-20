import java.util.Scanner;

public class Problem06_RombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int nImitator = 1;
        for (int row = 1; row <= n; row++) {
            int col = 1;

            while (col <= n - row) {
                System.out.print(" ");
                col++;
            }

            int printingStars = 1;

            while (printingStars <= row) { // print stars till = row
                System.out.print("* ");
                printingStars++;
            }
            System.out.println();

        }

        for (int row = 1; row < n; row++) {
            if (row == 1) {
                nImitator = n;
            }

            int printEmptySpaces = 1;
            while (printEmptySpaces <= row) {
                System.out.print(" ");
                printEmptySpaces++;
            }

            int printingStars = 1;

            while (printingStars < nImitator) {
                System.out.print("* ");
                printingStars++;
            }
            nImitator--;
            System.out.println();
        }
    }
}
