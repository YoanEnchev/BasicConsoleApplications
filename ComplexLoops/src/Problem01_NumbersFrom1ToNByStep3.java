import java.util.Scanner;

public class Problem01_NumbersFrom1ToNByStep3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        System.out.println("The numbers are: ");

        for(int i = 1; i<=n;i+=3){
            System.out.println(i);
        }
    }
}
