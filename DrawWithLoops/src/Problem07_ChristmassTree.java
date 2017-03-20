import java.util.Scanner;

public class Problem07_ChristmassTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int row = 1; row <= n + 1; row++) {
            int printSpaces = 1;
            while (printSpaces <= n - row + 1) {
                System.out.print(" ");
                printSpaces++;
            }
            int printStars = 1;
            while (printStars <= row - 1) {
                System.out.print("*");
                printStars++;
            }
            System.out.print(" | ");

            int printStarsAgain = 1;

            while (printStarsAgain <= row - 1) {
                System.out.print("*");
                printStarsAgain++;
            }
            System.out.println();
        }
    }
}
