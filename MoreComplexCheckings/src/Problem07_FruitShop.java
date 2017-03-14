import java.util.Scanner;

public class Problem07_FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String day = console.nextLine();
        String dayLower = day.toLowerCase();
        double fruitPrize=0;
        double quantity = Double.parseDouble(console.nextLine());


        if (dayLower.equals("monday") || dayLower.equals("tuesday") || dayLower.equals("wednesday") || dayLower.equals("thursday") || dayLower.equals("friday")) {
            double banana = 2.50;
            double apple = 1.20;
            double orange = 0.85;
            double grapefruit = 1.45;
            double kiwi = 2.70;
            double pineapple = 5.50;
            double grapes = 3.85;

            switch (fruit) {
                case "banana":
                    fruitPrize = banana;
                    break;
                case "apple":
                    fruitPrize = apple;
                    break;
                case "orange":
                    fruitPrize = orange;
                    break;
                case "grapefruit":
                    fruitPrize = grapefruit;
                    break;
                case "kiwi":
                    fruitPrize = kiwi;
                    break;
                case "pineapple":
                    fruitPrize = pineapple;
                    break;
                case "grapes":
                    fruitPrize = grapes;
                    break;
                default:
                    System.out.println("error");
            }
            System.out.println(quantity*fruitPrize);


        }
       else if(dayLower.equals("saturday") || dayLower.equals("sunday")){
            double banana = 2.70;
            double apple = 1.25;
            double orange = 0.90;
            double grapefruit = 1.60;
            double kiwi = 3.00;
            double pineapple = 5.60;
            double grapes = 4.20;

            switch (fruit) {
                case "banana":
                    fruitPrize = banana;
                    break;
                case "apple":
                    fruitPrize = apple;
                    break;
                case "orange":
                    fruitPrize = orange;
                    break;
                case "grapefruit":
                    fruitPrize = grapefruit;
                    break;
                case "kiwi":
                    fruitPrize = kiwi;
                    break;
                case "pineapple":
                    fruitPrize = pineapple;
                    break;
                case "grapes":
                    fruitPrize = grapes;
                    break;
                default:
                    System.out.println("error");
            }
            System.out.println(quantity*fruitPrize);

        }
        else{
            System.out.println("error");
        }


    }
}

