import java.util.Scanner;

public class Problem04_TriangleOfDolars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int row = 1; row <= n; row++) {
            int column = 1;
            while (column <= row) {
                System.out.print("$ ");
                column++;
            }
            System.out.println();
        }
    }
}
