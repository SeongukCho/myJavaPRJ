public class Quiz0405 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 2; i < 10; j++) {
            if (j == 10) {
                i++;
                j = 0;
                System.out.println();
            } else {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
        }
    }
}
