import java.util.Scanner;

public class Problem14_DivisionWithNoRemainer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n = Double.parseDouble(console.nextLine());

        double dividedByTwo = 0;
        double dividedByThree = 0;
        double dividedByFour = 0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(console.nextLine());
            if (number % 2 == 0) {
                dividedByTwo += 1;
            }
            if (number % 3 == 0) {
                dividedByThree += 1;
            }
            if (number % 4 == 0) {
                dividedByFour += 1;
            }
        }
        System.out.printf("%.2f", dividedByTwo / n * 100);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", dividedByThree / n * 100);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", dividedByFour / n * 100);
        System.out.print("%");
        System.out.println();
    }
}
