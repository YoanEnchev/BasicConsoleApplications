import java.util.Scanner;

public class Problem02_TownStore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String city = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        double prize = 0;
        String lowLetterCity = city.toLowerCase();

        if (lowLetterCity.equals("sofia")) {
            if (product.equals("coffee")) {
                prize = 0.50;
            }
            if (product.equals("water")) {
                prize = 0.80;
            }
            if (product.equals("beer")) {
                prize = 1.20;
            }
            if (product.equals("sweets")) {
                prize = 1.45;
            }
            if (product.equals("peanuts")) {
                prize = 1.60;
            }
        }

        if (lowLetterCity.equals("plovdiv")) {
            if (product.equals("coffee")) {
                prize = 0.40;
            }
            if (product.equals("water")) {
                prize = 0.70;
            }
            if (product.equals("beer")) {
                prize = 1.15;
            }
            if (product.equals("sweets")) {
                prize = 1.30;
            }
            if (product.equals("peanuts")) {
                prize = 1.50;
            }
        }


        if (lowLetterCity.equals("varna")) {
            if (product.equals("coffee")) {
                prize = 0.45;
            }
            if (product.equals("water")) {
                prize = 0.70;
            }
            if (product.equals("beer")) {
                prize = 1.10;
            }
            if (product.equals("sweets")) {
                prize = 1.35;
            }
            if (product.equals("peanuts")) {
                prize = 1.55;
            }
        }
        System.out.println(quantity * prize);

    }

}
