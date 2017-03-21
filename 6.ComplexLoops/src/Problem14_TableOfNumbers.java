import java.util.Scanner;

public class Problem14_TableOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int row = 1;

        for (int i; row <= n; row++) {
            i = row;
            int CountPrintedNumbersOnRow = 0;

            while (i <= n) {
                System.out.printf("%d ", i);
                i++;
                CountPrintedNumbersOnRow++;
            }
            if (i > n) {
                i -= 2;
            }
            while (CountPrintedNumbersOnRow < n) {
                System.out.printf("%d ", i);
                i--;
                CountPrintedNumbersOnRow++;
            }
            System.out.println();
        }

    }
}
