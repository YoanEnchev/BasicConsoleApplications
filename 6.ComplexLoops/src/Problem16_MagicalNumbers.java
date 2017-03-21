import java.util.Scanner;

public class Problem16_MagicalNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int First = 1;
        int Second = 1;
        int Third = 1;
        int Fourth = 1;
        int Fifth = 1;
        int Sixth = 1;

        while (First <= 9) {
            while (Second <= 9) {
                while (Third <= 9) {
                    while (Fourth <= 9) {
                        while (Fifth <= 9) {
                            while (Sixth <= 9) {
                                if (First * Second * Third * Fourth * Fifth * Sixth == n) {
                                    System.out.print(First + "" + Second + "" + Third + "" + Fourth + "" + Fifth + "" + Sixth + " ");
                                }
                                Sixth++;
                            }
                            Sixth = 1;
                            Fifth++;
                        }
                        Fifth = 1;
                        Fourth++;
                    }
                    Fourth = 1;
                    Third++;
                }
                Third = 1;
                Second++;
            }
            First++;
            Second = 1;
        }
    }
}
