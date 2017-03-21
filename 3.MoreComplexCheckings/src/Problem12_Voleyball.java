import java.util.Scanner;

public class Problem12_Voleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String year =console.nextLine();
        double p = Integer.parseInt(console.nextLine());
        double h = Integer.parseInt(console.nextLine());

        double voleyballWhenInSofia= (48 - h)*3/4;
        double voleybalWhenInSmallTown = h;
        double voleyballDuringCelebration =p*2/3;

        double all = voleyballWhenInSofia+ voleybalWhenInSmallTown+voleyballDuringCelebration;
        if(year.equals("leap")){
            double bonus = all +all*15/100;
            int result = (int)Math.floor(bonus);
            System.out.println(result);
        }
        if(year.equals("normal")){
           int result =(int) Math.floor(all);
            System.out.println(result);
        }
    }
}
