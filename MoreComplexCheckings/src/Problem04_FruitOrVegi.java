import java.util.Scanner;

public class Problem04_FruitOrVegi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String food = console.nextLine();
        if (food.equals("banana") || food.equals("apple") || food.equals("kiwi")|| food.equals("cherry")|| food.equals("lemon")|| food.equals("grapes")) {
            System.out.println("fruit");
        }
        else if(food.equals("tomato")|| food.equals("cucumber")|| food.equals("pepper")|| food.equals("carrot")){
            System.out.println("vegetable");
        }
        else{
            System.out.println("unknown");
        }
    }
}
