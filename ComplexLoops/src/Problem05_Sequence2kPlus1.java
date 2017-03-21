import java.util.Scanner;

public class Problem05_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int number = 1;

        for (; number <= n; ) {
            System.out.println(number);
            number *= 2;
            number += 1;
        }

    }
}
