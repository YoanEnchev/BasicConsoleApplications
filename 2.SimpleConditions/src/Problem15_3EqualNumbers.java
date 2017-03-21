import java.util.Scanner;

public class Problem15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int third = Integer.parseInt(console.nextLine());

        if (first == second && second == third && third == first) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
