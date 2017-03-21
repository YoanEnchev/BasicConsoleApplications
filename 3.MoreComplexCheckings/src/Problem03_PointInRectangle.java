import java.util.Scanner;

public class Problem03_PointInRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double pointByX = Double.parseDouble(console.nextLine());
        double pointByY = Double.parseDouble(console.nextLine());
        if (pointByX >= x1 && pointByX <= x2 && pointByY >= y1 && pointByY <= y2){
            System.out.println("Inside");
        }
        else{
            System.out.println("outside");
        }


    }
}
