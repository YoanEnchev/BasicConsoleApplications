import java.util.Scanner;

public class Problem08_AreaOfRectangleInCoordinateSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());


        double a = x1 - x2;
        double b = y2 - y1;


        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        System.out.printf("Area = %f\nPerimeter = %f", (a * b), (2 * a + 2 * b));
    }
}
