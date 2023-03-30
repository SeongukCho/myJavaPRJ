public class Quiz0330 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; i < 10 && j <11 ; j++) {
            if (j == 10) {
                i++;
                j = 0;
                System.out.println();
            } else
                System.out.print(i + "*" + j + "=" + i * j +" ");
        }
    }
}

