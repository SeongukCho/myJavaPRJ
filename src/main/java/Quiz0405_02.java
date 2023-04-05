public class Quiz0405_02 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; i < 10; j++) {
            if (j == 10) {
                j = 0;
                i++;
                System.out.println();
            } else {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
        }
    }
}
