import java.util.Scanner;

public class Problem17_TransportPrices {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double kilometers = Double.parseDouble(console.nextLine());
        String time = console.nextLine();
        double price = 0;
        if (kilometers < 20) { //taxi
            if (time.equals("day")) {
                price = 0.70 + kilometers * 0.79;
            }
            if (time.equals("night")) {
                price = 0.70 + kilometers * 0.90;
            }
            System.out.println(price);
        } else {
            if (kilometers >= 20 && kilometers < 100) {
                price = kilometers * 0.09;
            }
            if (kilometers >= 100) {
                price = kilometers * 0.06;
            }
            System.out.println(price);
        }
    }
}

