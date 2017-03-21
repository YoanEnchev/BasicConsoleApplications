import java.util.Scanner;

public class Problem03_InchesToCentimeters {
    public static void main(String[] args) {
        System.out.print("inches = ");
        Scanner console = new Scanner(System.in);
        double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters);
    }
}
