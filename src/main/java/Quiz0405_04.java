public class Quiz0405_04 {
    public static void main(String[] args) {
        int i = 2, j = 1;
        while (j < 10) {
            if (i == 10) {
                j++;
                i = 2;
                System.out.println();
            } else {
                System.out.printf("%d * %d = %2d ", i, j, i * j);
                i++;
            }
        }
    }
}
