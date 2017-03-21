import java.util.Scanner;

public class Problem07_PerimeterAndAreaOfACircle {
    public static void main(String[] args) {
        System.out.print("r = ");
        Scanner console = new Scanner(System.in);
        double radius = Double.parseDouble(console.nextLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Perimeter = %f\n Area = %f", perimeter, area);
    }
}
