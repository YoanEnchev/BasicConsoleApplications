import java.util.Scanner;

public class Problem12_FibonachiNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int fibonachi = 2;

        if (number < 2) {
            System.out.println("1");
        } else {
            int x = 1;
            int y = 1;
            int advance;
            for (int i = 2; i <= number; i++) {
                if (i == 2) {

                    y = 1;
                    x = 1;
                }
                fibonachi = x + y;
                y = fibonachi;
                x = y - x;

            }
            System.out.println(fibonachi);
        }

    }
}
