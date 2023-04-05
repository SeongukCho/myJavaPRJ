public class Quiz0405_03 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 2; b < 10; a++) {
            if (a < 10) {
                System.out.printf("%d * %d = %2d ", b, a, b * a);
            } else {
                System.out.print("\n");
                a = 0;
                b++;
            }
        }
    }
}
