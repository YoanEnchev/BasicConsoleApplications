import java.util.Scanner;

public class Problem06_BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double score = Double.parseDouble(console.nextLine());
        double bonus = 0;
        double checkIfLastDigitIsFive = score / 2;
        if (score <= 100) {
            bonus += 5;
        }
        if (score > 100 && score < 1000) {
            bonus += score * (20.0 / 100.0);
        }
        if (score > 1000) {
            bonus += score * (1.0 / 10.0);
        }
        if (score % 2 == 0) {
            bonus += 1;
        } else if (score % 5 == 0 && checkIfLastDigitIsFive % 2 != 0) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + score);
    }
}
