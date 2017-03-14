import java.util.Scanner;

public class Problem06_PointOnBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double X = Double.parseDouble(console.nextLine());
        double Y = Double.parseDouble(console.nextLine());
        if(X>=x1 && X<=x2 &&(Y==y1 || Y==y2)){
            System.out.println("Border");
        }
        else if(Y>=y1 && Y<=y2&&(X==x1 || X==x2)){
            System.out.println("Border");
        }
        else{
            System.out.println("Inside / Outside");
        }

    }
}


