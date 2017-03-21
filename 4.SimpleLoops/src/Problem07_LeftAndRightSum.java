import java.util.Scanner;

public class Problem07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int sum = 0;
        int anotherSum = 0;

        for (int i = 1; n >= i; i++) {
            int number = Integer.parseInt(console.nextLine());
            sum += number;
        }

        for (int i = 1; n >= i; i++) {
            int anotherNumber = Integer.parseInt(console.nextLine());
            anotherSum += anotherNumber;
        }

        if (sum == anotherSum) {
            System.out.printf("Yes, sum = %d", sum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum - anotherSum));
        }
    }
}

