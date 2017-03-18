import java.util.Scanner;

public class Problem06_LeastNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int minNumber = 99999999;
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(console.nextLine());
            if (minNumber >= numbers) {
                minNumber = numbers;
            }
        }
        System.out.println(minNumber);
    }
}
