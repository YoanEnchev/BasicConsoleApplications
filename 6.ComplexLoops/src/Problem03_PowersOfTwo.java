import java.util.Scanner;

public class Problem03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
        }
    }
}
