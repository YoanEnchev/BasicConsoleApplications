import java.util.Scanner;

public class Problem08_Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int Factorial = 1;

        for(int i = 1; i<=n;i++){
            Factorial *=i;
        }
        System.out.println(Factorial);
    }
}
