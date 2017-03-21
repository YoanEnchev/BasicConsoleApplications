import java.util.Scanner;

public class Problem10_ElementEqualsToTheSumOfOthers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;
        int BiggestNumber = Integer.MIN_VALUE;
        int sum = 0;

        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(console.nextLine());
            sum += number;
            if (BiggestNumber < number) {
                BiggestNumber = number;
            }
        }
        if (sum == 2 * BiggestNumber) {
            System.out.printf("Yes %nSum = %d", sum / 2);
        } else {
            System.out.printf("No %nDiff = %d", Math.abs(2 * BiggestNumber - sum));
        }
    }
}
