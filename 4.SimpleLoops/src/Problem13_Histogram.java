import java.util.Scanner;

public class Problem13_Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double n = Integer.parseInt(console.nextLine());
        double FirstRange = 0;
        double SecondRange = 0;
        double ThirdRange = 0;
        double FourthRange = 0;
        double FifthRange = 0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number < 200) {
                FirstRange += 1;
            }
            if (number >= 200 && number < 400) {
                SecondRange += 1;
            }
            if (number >= 400 && number < 600) {
                ThirdRange += 1;
            }
            if (number >= 600 && number < 800) {
                FourthRange += 1;
            }
            if (number >= 800) {
                FifthRange += 1;
            }
        }


        double ResultFirstRange = FirstRange / n * 100;
        double ResultSecondRange = SecondRange / n * 100;
        double ResultThirdRange = ThirdRange / n * 100;
        double ResultFourthRange = FourthRange / n * 100;
        double ResultFifthRange = FifthRange / n * 100;


        System.out.printf("%.2f", ResultFirstRange);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", ResultSecondRange);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", ResultThirdRange);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", ResultFourthRange);
        System.out.print("%");
        System.out.println();

        System.out.printf("%.2f", ResultFifthRange);
        System.out.print("%");
        System.out.println();
    }
}
