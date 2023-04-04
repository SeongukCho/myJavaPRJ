public class Quiz0405 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 2; j < 10; i++) {
            if (i == 10) {
                i = 1;
                j++;
                System.out.println();
            } else {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
        }
    }
}
