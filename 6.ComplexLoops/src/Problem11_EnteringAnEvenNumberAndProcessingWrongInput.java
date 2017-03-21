import java.util.Scanner;

public class Problem11_EnteringAnEvenNumberAndProcessingWrongInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = 0;
        boolean isNumberEven = false;

        while (isNumberEven == false) {
            boolean wrongNumberWasHere = false;
            try {
                System.out.print("Enter even number: ");
                number = Integer.parseInt(console.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number!");
                wrongNumberWasHere = true;
            }
            if (number % 2 != 0 && wrongNumberWasHere == false) {
                System.out.println("The number is not even.");
            }
            if (number % 2 == 0 && number != 0) {
                isNumberEven = true;
            }
        }
        System.out.printf("Even number entered: %d", number);
    }
}
