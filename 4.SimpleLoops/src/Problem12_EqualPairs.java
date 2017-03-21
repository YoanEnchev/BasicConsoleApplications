import java.util.Scanner;

public class Problem12_EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int First = 0;
        int Second = 0;
        int Sum;
        int Diffrence;
        int MaxDiffrence = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                First = Integer.parseInt(console.nextLine());
                Second = Integer.parseInt(console.nextLine());

            } else {
                Sum = First + Second;
                First = Integer.parseInt(console.nextLine());
                Second = Integer.parseInt(console.nextLine());
                Diffrence = Math.abs(Sum - (First + Second));
                if (MaxDiffrence < Diffrence) {
                    MaxDiffrence = Diffrence;
                }
            }
        }
        if (MaxDiffrence == 0) {
            System.out.printf("Yes, value = %d", First + Second);
        } else {
            System.out.printf("No, maxdiff = %d", MaxDiffrence);
        }

    }
}
