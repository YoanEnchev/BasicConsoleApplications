import java.util.Scanner;

public class Problem08_MetricConvertor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double distance = Double.parseDouble(console.nextLine());
        String from = console.nextLine();
        String to = console.nextLine();

        double m = 1;
        double mm = 1;
        double cm = 1;
        double mi = 1;
        double in = 1;
        double km = 1;
        double ft = 1;
        double yd = 1;

        if (from.equals("m")) {
            m = distance;
        }
        if (from.equals("mm")) {
            mm = distance;
            m = mm / 1000;
        }
        if (from.equals("cm")) {
            cm = distance;
            m = cm / 100;
        }
        if (from.equals("mi")) {
            mi = distance;
            m = mi / 0.000621371192;
        }
        if (from.equals("in")) {
            in = distance;
            m = in / 39.3700787;
        }
        if (from.equals("km")) {
            km = distance;
            m = km / 0.001;
        }
        if (from.equals("ft")) {
            ft = distance;
            m = ft / 3.2808399;
        }
        if (from.equals("yd")) {
            yd = distance;
            m = yd / 1.0936133;
        }


        if (to.equals("m")) {
            System.out.println(m + " m");
        }
        if (to.equals("mm")) {
            System.out.println(m * 1000 + " mm");
        }
        if (to.equals("cm")) {
            System.out.println(m * 100 + " cm");
        }
        if (to.equals("mi")) {
            System.out.println(m * 0.000621371192 + " mi");
        }
        if (to.equals("in")) {
            System.out.println(m * 39.3700787 + " in");
        }
        if (to.equals("km")) {
            System.out.println(m * 0.001 + " km");
        }
        if (to.equals("ft")) {
            System.out.println(m * 3.2808399 + " ft");
        }
        if (to.equals("yd")) {
            System.out.println(m * 1.0936133 + " yd");
        }
    }
}