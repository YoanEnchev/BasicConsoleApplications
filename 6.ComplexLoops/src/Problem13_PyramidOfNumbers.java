import java.util.Scanner;

public class Problem13_PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int row = 1;
        int HowManyNumbersOnRow = 1;

        for (int i = 1; i <= n; i++) {

            if (row >= HowManyNumbersOnRow) {
                System.out.printf("%d ", i);
                HowManyNumbersOnRow++;
            } else {
                System.out.println();
                System.out.printf("%d ", i);
                row++;
                HowManyNumbersOnRow = 2;
            }
        }
    }
}
