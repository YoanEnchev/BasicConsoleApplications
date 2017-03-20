import java.util.Scanner;

public class Problem11_DrawingACastle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int countForSpaces = 0;

        int printTheSymbol = 1;
        System.out.print("/");
        while (printTheSymbol <= n / 2) {
            System.out.print("^");
            printTheSymbol++;

        }
        System.out.print("\\");

        int underScore = 0;
        if (n % 2 != 0) {
            while (underScore < n - 3) {
                System.out.print("_");
                underScore++;
                countForSpaces++;
            }
        }
        if (n % 2 == 0) {
            while (underScore < n - 4) {
                System.out.print("_");
                underScore++;
                countForSpaces++;
            }
        }
        System.out.print("/");
        printTheSymbol = 1;
        while (printTheSymbol <= n / 2) {
            System.out.print("^");
            printTheSymbol++;
        }
        System.out.print("\\");
        System.out.println();

        for (int row = 2; row <= n; row++) {
            if (row != n && row != n - 1) {
                System.out.print("|");
                int printSpaces = 1;
                while (printSpaces <= (n * 2) - 2) {
                    System.out.print(" ");
                    printSpaces++;
                }
                System.out.print("|");
                System.out.println();
            }

            if (row == n - 1) {
                System.out.print("|");
                int printSpaces = 1;
                while (printSpaces <= (n / 2) + 1) {
                    System.out.print(" ");
                    printSpaces++;
                }

                underScore = 0;
                if (n % 2 != 0) {
                    while (underScore < n - 3) {
                        System.out.print("_");
                        underScore++;
                    }
                }
                if (n % 2 == 0) {
                    while (underScore < n - 4) {
                        System.out.print("_");
                        underScore++;
                    }
                }
                printSpaces = 1;
                while (printSpaces <= (n / 2) + 1) {
                    System.out.print(" ");
                    printSpaces++;
                }
                System.out.println("|");
            }

            if (row == n) {
                System.out.print("\\");
                for (int i = 1; i < printTheSymbol; i++) {
                    System.out.print("_");
                }
                System.out.print("/");
                if (n % 2 != 0) {
                    while (underScore < n - 3) {
                        System.out.print("_");
                        underScore++;
                    }
                }
                if (n % 2 == 0) {
                    while (underScore < n - 4) {
                        System.out.print("_");
                        underScore++;
                    }
                }
                for (int u = 1; u <= countForSpaces; u++) {
                    System.out.print(" ");
                }

                System.out.print("\\");
                for (int i = 1; i < printTheSymbol; i++) {
                    System.out.print("_");
                }
                System.out.print("/");
            }
        }


    }
}
