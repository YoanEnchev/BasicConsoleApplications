import java.util.Scanner;

public class Problem05_BiggestNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNumber = -99999999;
        int numbers = -999999999;
        for (int i = 1; i <= n; i++) {
            numbers = Integer.parseInt(console.nextLine());
            if (maxNumber <= numbers) {
                maxNumber = numbers;
            }
        }
        System.out.println(maxNumber);
    }
}
