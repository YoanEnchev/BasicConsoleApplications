import java.util.Scanner;

public class Problem10_PrimeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = Integer.parseInt(console.nextLine());
        int SquareRootOfNumber = (int) Math.sqrt(number);

        boolean isNumberPrime = true;

        double primeChecker;
        if (number < 2) {
            System.out.print("Not Prime");
        } else {
            for (double divider = 2; divider <= SquareRootOfNumber; divider++) {
                primeChecker = number / divider;
                if (primeChecker == (int) primeChecker) {
                    isNumberPrime = false;
                }
            }
            if (isNumberPrime == true) {
                System.out.println("Prime");

            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
