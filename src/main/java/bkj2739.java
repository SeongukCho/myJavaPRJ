import java.util.Scanner;

public class bkj2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i;

        num = s.nextInt();

        for (i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
