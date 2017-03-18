import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_11_EvenAndOddPositions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        double OddSum = 0;
        double OddMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenSum = 0;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(console.nextLine());
            if (i % 2 == 0) {
                EvenSum += number;
                if (EvenMin > number) {
                    EvenMin = number;
                }
                if (EvenMax < number) {
                    EvenMax = number;
                }

            }
            if (i % 2 != 0) {
                OddSum += number;
                if (OddMin > number) {
                    OddMin = number;
                }
                if (OddMax < number) {
                    OddMax = number;
                }

            }
        }

        if (n == 1) {
            System.out.printf("OddSum=%s%n", df.format(OddSum));
            System.out.printf("OddMin=%s%n", df.format(OddMin));
            System.out.printf("OddMax=%s%n", df.format(OddMax));
            System.out.println("EvenSum=No");
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%s%n", df.format(OddSum));
            System.out.printf("OddMin=%s%n", df.format(OddMin));
            System.out.printf("OddMax=%s%n", df.format(OddMax));
            System.out.printf("EvenSum=%s%n", df.format(EvenSum));
            System.out.printf("EvenMin=%s%n", df.format(EvenMin));
            System.out.printf("EvenMax=%s%n", df.format(EvenMax));
        }
    }
}
