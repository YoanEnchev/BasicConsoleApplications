import java.util.Scanner;

public class Problem10_Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftStar = 0;
        int rightStar = 0;

        if (n % 2 != 0) {
            for (int row = 1; row <= (n / 2) + 1; row++) {
                int col = 1;

                if (row == 1) {
                    leftStar = (n / 2) + 1;
                    rightStar = leftStar;
                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("*");
                    col = 0;
                    while (col < n / 2) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.println();
                } else {
                    leftStar -= 1;
                    rightStar += 1;


                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("*");
                    col++;
                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("*");
                    while (col < n) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.println();
                }
            }

            for (int row = 1; row < (n / 2) + 1; row++) { // reversed
                int col = 1;
                leftStar += 1;
                rightStar -= 1;

                while (col != leftStar && col != rightStar) {
                    System.out.print("-");
                    col++;
                }
                System.out.print("*");
                col++;
                while (col != leftStar && col != rightStar && col < n) {
                    System.out.print("-");
                    col++;

                }
                if (row != (n / 2)) {
                    System.out.print("*");
                }
                while (col < n) {
                    System.out.print("-");
                    col++;
                }
                if (row == (n / 2))
                    System.out.print("-");
                System.out.println();
            }
        }
        if (n % 2 == 0) {
            for (int row = 1; row < (n / 2) + 1; row++) {
                int col = 1;

                if (row == 1) {
                    leftStar = (n / 2);
                    rightStar = (n / 2) + 1;
                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("**");
                    col = 1;
                    while (col < n / 2) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.println();
                } else {
                    leftStar -= 1;
                    rightStar += 1;


                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("*");
                    col++;
                    while (col != leftStar && col != rightStar) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.print("*");
                    while (col < n) {
                        System.out.print("-");
                        col++;
                    }
                    System.out.println();
                }
            }

            for (int row = 1; row < (n / 2); row++) { // reversed
                int col = 1;
                leftStar += 1;
                rightStar -= 1;

                while (col != leftStar && col != rightStar) {
                    System.out.print("-");
                    col++;
                }
                System.out.print("*");
                col++;
                while (col != leftStar && col != rightStar && col < n) {
                    System.out.print("-");
                    col++;

                }
                if (row != (n / 2)) {
                    System.out.print("*");
                }
                while (col < n) {
                    System.out.print("-");
                    col++;
                }
                if (row == (n / 2))
                    System.out.print("-");
                System.out.println();
            }
        }
    }
}
