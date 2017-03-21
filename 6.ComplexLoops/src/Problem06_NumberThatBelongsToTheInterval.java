import java.util.Scanner;

public class Problem06_NumberThatBelongsToTheInterval {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Еnter a number in the range [1...100]: ");
        int number = Integer.parseInt(console.nextLine());

        while (number <= 0 || number >= 100) {
            System.out.println("Invalid number !");
            System.out.print("Еnter a number in the range [1...100]: ");
            number = Integer.parseInt(console.nextLine());
        }
        System.out.printf("The number is: %d", number);
    }
}
