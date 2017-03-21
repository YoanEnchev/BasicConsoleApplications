import java.util.Scanner;

public class Problem16_NumbersFrom0To100WithLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        if (number >= 0 && number <= 100) {
            if (number < 20) {
                switch (number) {

                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("thirteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 16:
                        System.out.println("sixteen");
                        break;
                    case 17:
                        System.out.println("seventeen");
                        break;
                    case 18:
                        System.out.println("eighteen");
                        break;
                    case 19:
                        System.out.println("nineteen");
                        break;
                }
            }
            if (number >= 20 && number < 100) {
                int firstDigit = number / 10;
                int secondDigit = number % 10;
                String firstDigitinWords = "";
                String secondDigitinWords = "";
                switch (firstDigit) {
                    case 2:
                        firstDigitinWords = "twenty";
                        break;
                    case 3:
                        firstDigitinWords = "thirty";
                        break;
                    case 4:
                        firstDigitinWords = "forty";
                        break;
                    case 5:
                        firstDigitinWords = "fifty";
                        break;
                    case 6:
                        firstDigitinWords = "sixty";
                        break;
                    case 7:
                        firstDigitinWords = "seventy";
                        break;
                    case 8:
                        firstDigitinWords = "eighty";
                        break;
                    case 9:
                        firstDigitinWords = "ninety";
                        break;
                }
                switch (secondDigit) {
                    case 0:
                        secondDigitinWords = "";
                        break;
                    case 1:
                        secondDigitinWords = "one";
                        break;
                    case 2:
                        secondDigitinWords = "two";
                        break;
                    case 3:
                        secondDigitinWords = "three";
                        break;
                    case 4:
                        secondDigitinWords = "four";
                        break;
                    case 5:
                        secondDigitinWords = "five";
                        break;
                    case 6:
                        secondDigitinWords = "six";
                        break;
                    case 7:
                        secondDigitinWords = "seven";
                        break;
                    case 8:
                        secondDigitinWords = "eight";
                        break;
                    case 9:
                        secondDigitinWords = "nine";
                        break;
                }
                System.out.println(firstDigitinWords + " " + secondDigitinWords);

            }
            if (number == 100) {
                System.out.println("one hundred");
            }
        } else {
            System.out.println("invalid number");
        }
    }
}

