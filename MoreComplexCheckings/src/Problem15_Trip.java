import java.util.Scanner;

public class Problem15_Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        double moneyToPay;
        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("winter")) {
                moneyToPay =  budget*70 / 100;
                System.out.printf("Hotel - %.2f", moneyToPay);
            }
            if (season.equals("summer")) {
                moneyToPay =  budget*30 / 100;
                System.out.printf("Camp - %.2f", moneyToPay);
            }
        }
        if (budget > 100 && budget<=1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("winter")) {
                moneyToPay =  budget*80 / 100;
                System.out.printf("Hotel - %.2f", moneyToPay);
            }
            if (season.equals("summer")) {
                moneyToPay =  budget*40 / 100;
                System.out.printf("Camp - %.2f", moneyToPay);
            }
        }
        if(budget>1000){
            System.out.println("Somewhere in Europe");
            moneyToPay =  budget*90 / 100;
            System.out.printf("Hotel - %.2f ",moneyToPay);

        }
    }
}
