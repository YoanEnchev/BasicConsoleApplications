import java.util.Scanner;
public class Problem03_SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int row = Integer.parseInt(console.nextLine());
        int column = row;

        for (int i =1; i<=row;i++){
            int j =1;
            while(j<=column){
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}
