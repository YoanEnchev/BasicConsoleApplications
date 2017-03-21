import java.util.Scanner;

public class Problem07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double First = Integer.parseInt(console.nextLine());
        double Second = Integer.parseInt(console.nextLine());
        double BiggerNumber ;

        int GCMofFirst = 0;
        int GCMofSecond = 0;
        int GCM = 0;

        if(First>=Second){
            BiggerNumber = First;
        }
        else{
            BiggerNumber = Second;
        }


        for(int divider = 1;divider<=BiggerNumber;divider++){
            double x = First/ divider;
            double y = Second/divider;


            if(x == (int)x && divider<=First){
                GCMofFirst = divider;
            }
            if(y == (int)y && divider<=Second){
                GCMofSecond = divider;
            }

            if(GCMofFirst ==GCMofSecond ){
               GCM = GCMofFirst;
            }
        }
        System.out.println(GCM);
    }
}
