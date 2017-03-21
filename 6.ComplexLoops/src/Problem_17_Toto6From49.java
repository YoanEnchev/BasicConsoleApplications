
public class Problem_17_Toto6From49 {
    public static void main(String[] args) {
        int First = 1;
        int Second = 1;
        int Third = 1;
        int Fourth = 1;
        int Fifth = 1;
        int Sixth = 1;

        int counter = 0;

        while (First <= 49) {
            while (Second <= 49) {
                while (Third <= 49) {
                    while (Fourth <= 49) {
                        while (Fifth <= 49) {
                            while (Sixth <= 49) {
                                Sixth++;
                                if (First != Second && First != Third && First != Fourth && First != Fifth
                                        && First != Sixth && Second != Third && Second != Fourth &&
                                        Second != Fifth && Second != Sixth && Third != Fourth &&
                                        Third != Fifth && Third != Sixth && Fourth != Fifth &&
                                        Fourth != Sixth && Fifth != Sixth) {
                                    counter++;
                                    System.out.println(First + " " + Second + " " + Third + " " + Fourth + " " + Fifth + " " + Sixth);
                                }
                            }
                            Sixth = 1;
                            Fifth++;
                        }
                        Fifth = 1;
                        Fourth++;
                    }
                    Fourth = 1;
                    Third++;
                }
                Third = 1;
                Second++;
            }
            Second = 1;
            First++;
        }
        System.out.println();
        System.out.printf("There are %d combinations in TOTO 6/49.", counter);
    }
}
