import java.util.Scanner;

public class Problem14_TimePlus15Mins {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.parseInt(console.nextLine());
        int sec = Integer.parseInt(console.nextLine());
        if (sec + 15 >= 60) {
            min += 1;
            sec = sec + 15 - 60;
            if (min == 24) {
                min = 0;
            }
            if (sec < 10) {
                System.out.printf("%d:0%d", min, sec);
            } else {
                System.out.printf("%d:%d", min, sec);
            }

        } else {
            if (min == 24) {
                min = 0;
            }
            System.out.printf("%d:%d", min, sec + 15);
        }
    }
}
