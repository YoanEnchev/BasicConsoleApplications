
public class Problem01_Rectangle10x10WithStars {
    public static void main(String[] args) {
        for (int r = 1; r <= 10; r++) {
            int c = 1;
            while (c <= 10) {
                System.out.print("*");
                c++;
            }
            System.out.println();
        }
    }
}
