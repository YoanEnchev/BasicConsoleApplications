import java.util.Scanner;

public class Problem01_PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();
        if(gender.equals("m")){
            if(age<16){
                System.out.println("Master");
            }
            if(age>=16){
                System.out.println("Mr.");
            }
        }
        if(gender.equals("f")){
            if(age<16){
                System.out.println("Miss");
            }
            if(age>=16){
                System.out.println("Ms.");
            }
        }
    }
}
