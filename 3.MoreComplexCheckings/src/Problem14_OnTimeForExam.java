import java.util.Scanner;

public class Problem14_OnTimeForExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hourOfExam = Integer.parseInt(console.nextLine());
        int minOfExam = Integer.parseInt(console.nextLine());
        int hourOfArrival = Integer.parseInt(console.nextLine());
        int minOfArrival = Integer.parseInt(console.nextLine());

        int examTime = 60 * hourOfExam + minOfExam;
        int arrivalTime = 60 * hourOfArrival + minOfArrival;

        int hour = (examTime - arrivalTime) / 60;
        int minutes = (examTime - arrivalTime) - hour * 60;


        if (arrivalTime > examTime) { //Late
            System.out.println("Late");
            if (arrivalTime - examTime <= 59) { //59 min or less
                System.out.println(-minutes + " minutes after the start");

            } else if (arrivalTime - examTime > 59) { // more than 59 min
                if (Math.abs(minutes) > 9) {
                    System.out.println(-hour + ":" + -minutes + " hours after the start");
                }
                if (Math.abs(minutes) < 9) {
                    System.out.println(-hour + ":" + "0" + -minutes + " hours after the start");
                }
            }
        } else if (examTime > arrivalTime && examTime - arrivalTime > 30) {
            System.out.println("Early");
            if (examTime - arrivalTime <= 59) { //59 min or less
                System.out.println(minutes + " minutes before the start");
            }
            if (examTime - arrivalTime > 59) { //more than 59
                if (Math.abs(minutes) > 9) {
                    System.out.println(hour + ":" + minutes + " hours before the start");
                }
                if (Math.abs(minutes) < 9) {
                    System.out.println(hour + ":" + "0" + minutes + " hours before the start");
                }

            }
        } else { //on time
            System.out.println("On time");
            if (minOfArrival != minOfExam) {
                System.out.println(minutes + " minutes before the start");
            } else {
                System.out.print("");
            }
        }
    }
}
