import java.util.Scanner;

public class Problem09_SumOfVowels {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String word = console.nextLine();
        int wordLenght = word.length() - 1;
        int sum = 0;
        for (int i = 0; i <= wordLenght; i++) {
            switch (word.charAt(i)) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
