import java.util.Scanner;

public class Problem08_SunGlasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int chain;
        if (n % 2 != 0) {
            chain = n / 2 + 1;
        } else {
            chain = (n / 2);
        }

        for (int row = 1; row <= n; row++) {
            int col = 1;
            if (row == 1) {
                while (col <= 2 * n) {
                    System.out.print("*");
                    col++;
                }

                for (int l = 1; l <= n; l++) {
                    System.out.print(" ");
                }
                col = 1; //repeat
                while (col <= 2 * n) {
                    System.out.print("*");
                    col++;
                }


                System.out.println();
            }
            if (row != 1 && row != n) {
                col = 1;
                while (col <= 2 * n) {
                    if (col == 1) {
                        System.out.print("*");
                        col++;
                    }
                    if (col != 1 && col != n) {
                        while (col <= 2 * n - 1) {
                            System.out.print("/");
                            col++;
                        }
                    }
                    if (col == 2 * n) {
                        System.out.print("*");
                        col++;
                    }

                    if (row == chain) {
                        for (int m = 1; m <= n; m++) {
                            System.out.print("|");
                        }
                    } else {
                        for (int m = 1; m <= n; m++) {
                            System.out.print(" ");
                        }
                    }
                    col = 1; //repeat again
                    while (col <= 2 * n) {
                        if (col == 1) {
                            System.out.print("*");
                            col++;
                        }
                        if (col != 1 && col != n) {
                            while (col <= 2 * n - 1) {
                                System.out.print("/");
                                col++;
                            }
                        }
                        if (col == 2 * n) {
                            System.out.print("*");
                            col++;
                        }

                    }
                    System.out.println();

                }
            }
            if (row == n) {
                while (col <= 2 * n) {
                    System.out.print("*");
                    col++;
                }
                col = 1;

                for (int m = 1; m <= n; m++) {
                    System.out.print(" ");
                }

                while (col <= 2 * n) {
                    System.out.print("*");
                    col++;
                }
            }

        }
    }
}
