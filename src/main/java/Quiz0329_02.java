public class Quiz0329_02 {
    public static void main(String[] args) {
        int i, k;

        for (k = 1; k < 10; k++) {
            for (i = 2; i < 10; i++) {
                System.out.printf("%d * %d = %d ", i, k, i * k);
            }
            System.out.println();
        }
    }
}
