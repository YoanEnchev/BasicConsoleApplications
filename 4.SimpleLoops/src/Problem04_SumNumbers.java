import java.util.Scanner;

public class Problem04_SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numbers = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(console.nextLine());
            sum = num + sum;
        }
        System.out.println(sum);
    }
}
