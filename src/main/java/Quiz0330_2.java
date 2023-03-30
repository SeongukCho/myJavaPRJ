public class Quiz0330_2 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; i < 11 && j < 10; i++) {
            if (i == 10) {
                i = 1;
                j++;
                System.out.println();
            } else
                System.out.print(i + "*" + j + "=" + i * j + " ");
        }
    }
}
