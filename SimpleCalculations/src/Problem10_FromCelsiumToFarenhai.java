import java.util.Scanner;

public class Problem10_FromCelsiumToFarenhai {
    public static void main(String[] args) {
        Scanner forCelsium = new Scanner(System.in);
        double celsium = Double.parseDouble(forCelsium.nextLine());
        double fahrenheit = celsium * 1.8 + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
