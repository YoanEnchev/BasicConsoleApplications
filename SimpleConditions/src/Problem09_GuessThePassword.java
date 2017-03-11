import java.util.Scanner;

public class Problem09_GuessThePassword {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        if (text.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
