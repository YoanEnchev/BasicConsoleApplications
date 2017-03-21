import java.util.Scanner;

public class Problem13_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());

        int First = 1;
        int Second = 1;
        int Fifth;
        int third = 97;
        int fourth = 97;

        while (First <= n - 1) {
            while (Second <= n - 1) {
                while (third < l + 97) {
                    while (fourth < l + 97) {
                        if (First > Second) {
                            Fifth = First + 1;
                        } else {
                            Fifth = Second + 1;
                        }
                        while (Fifth <= n) {
                            System.out.print(First + "" + Second + "" + (char) third + "" + (char) fourth + "" + Fifth + " ");
                            Fifth++;
                        }
                        fourth++;
                    }
                    third++;
                    fourth = 97;
                }
                Second++;
                third = 97;
            }
            First++;
            Second = 1;
        }
    }
}
