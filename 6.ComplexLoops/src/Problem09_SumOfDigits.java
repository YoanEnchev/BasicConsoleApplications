import java.util.Scanner;

public class Problem09_SumOfDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long n = Integer.parseInt(console.nextLine());
        long sumOfDigits = 0;

        for (long i = 10; i <= n * 10; i *= 10) {
            long digit = (n % i) / (i / 10);
            System.out.println(digit);
            sumOfDigits += digit;
        }
        System.out.println(sumOfDigits);
    }
}
