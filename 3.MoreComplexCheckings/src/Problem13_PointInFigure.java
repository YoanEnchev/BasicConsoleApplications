import java.util.Scanner;

public class Problem13_PointInFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double h = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        if (x >= 0 && x <= 3 * h && (y == 0 || y == h)) {
            System.out.println("border");
        } else if (y >= h && y <= 4 * h && (x == h || x == 2 * h)) {
            System.out.println("border");
        } else if (y > 0 && y < h && x > 0 && x < 3 * h) {
            System.out.println("inside");
        } else if (y > h && y < 4 * h && x > h && x < 2 * h) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }

    }
}
