import java.util.Scanner;

public class Problem08_TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine();
        double sells = Double.parseDouble(console.nextLine());
        String cityLow = city.toLowerCase();
        double result = 0;

        if (cityLow.equals("sofia")) {
            if (sells >= 0 && sells <= 500) {
                result = sells * 5 / 100;
            } else if (sells > 500 && sells <= 1000) {
                result = sells * 7 / 100;
            } else if (sells > 1000 && sells <= 10000) {
                result = sells * 8 / 100;
            } else if (sells > 10000) {
                result = sells * 12 / 100;
            } else {
                System.out.println("error");
            }

        } else if (cityLow.equals("varna")) {
            if (sells >= 0 && sells <= 500) {
                result = sells * 4.5 / 100;
            } else if (sells > 500 && sells <= 1000) {
                result = sells * 7.5 / 100;
            } else if (sells > 1000 && sells <= 10000) {
                result = sells * 10 / 100;
            } else if (sells > 10000) {
                result = sells * 13 / 100;
            } else {
                System.out.println("error");
            }

        } else if (cityLow.equals("plovdiv")) {
            if (sells >= 0 && sells <= 500) {
                result = sells * 5.5 / 100;
            } else if (sells > 500 && sells <= 1000) {
                result = sells * 8 / 100;
            } else if (sells > 1000 && sells <= 10000) {
                result = sells * 12 / 100;
            } else if (sells > 10000) {
                result = sells * 14.5 / 100;
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

        System.out.printf("%.2f", result);
    }
}
