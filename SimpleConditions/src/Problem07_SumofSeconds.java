import java.util.Scanner;

public class Problem07_SumofSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int third = Integer.parseInt(console.nextLine());
        int whichMinute = (first + second + third) / 60;
        int seconds = first + second + third - 60 * whichMinute;
        if (seconds < 10) {
            System.out.printf("%d:0%d", whichMinute, seconds);
        } else {
            System.out.printf("%d:%d", whichMinute, seconds);
        }
    }
}
