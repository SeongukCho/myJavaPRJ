public class Quiz0331 {
    public static void main(String[] args) {
        for (int i = 1, j = 0; i < 6; ) {
            if (i > j) {
                j++;
                System.out.print("*");
            } else {
                j = 0;
                i++;
                System.out.println();
            }
        }
    }
}
