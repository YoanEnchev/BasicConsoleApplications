import java.util.Scanner;

public class Problem08_OddAndEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (i % 2 != 0) {
                oddSum += number;
            }
            if (i % 2 == 0) {
                evenSum += number;
            }
        }
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d ", Math.abs(oddSum - evenSum));
        }
    }
}
