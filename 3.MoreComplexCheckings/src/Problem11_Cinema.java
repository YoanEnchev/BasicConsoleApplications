import java.util.Scanner;

public class Problem11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String  offer = console.nextLine();
        String offerLowLetters = offer.toLowerCase();
        int row = Integer.parseInt(console.nextLine());
        int column = Integer.parseInt(console.nextLine());

        double prizeOfProjection =0;
        if(offerLowLetters.equals("premiere")){
            prizeOfProjection =12;
        }
        if(offerLowLetters.equals("normal")){
            prizeOfProjection =7.50;
        }
        if(offerLowLetters.equals("discount")){
            prizeOfProjection =5;
        }

        double total = row*column*prizeOfProjection ;
        System.out.printf("%.2f" + " leva",total);

    }
}
