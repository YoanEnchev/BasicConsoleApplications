import java.util.Scanner;

public class Problem06_TrapezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("b1 = ");
        double b1 = Double.parseDouble(console.nextLine());
        System.out.print("b2 = ");
        double b2 = Double.parseDouble(console.nextLine());
        System.out.print("h = ");
        double h = Double.parseDouble(console.nextLine());
        double area = (b1 + b2) * h / 2;
        System.out.println("Area = " + area);
    }
}
