import java.util.Scanner;

public class bkj25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i;

        num = s.nextInt();

        for (i = 0; i < num; i += 4) {
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}
