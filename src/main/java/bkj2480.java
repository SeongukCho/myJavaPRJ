import java.util.Scanner;

public class bkj2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        int tmp;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                tmp = a;
                System.out.println(tmp * 100);
            } else if (a < b && b > c) {
                tmp = b;
                System.out.println(tmp * 100);
            } else if (a < c && b < c) {
                tmp = c;
                System.out.println(tmp * 100);
            }
        } else if (a != b && b == c) {
            tmp = b;
            System.out.println(1000 + tmp * 100);
        } else if (a == b && a != c) {
            tmp = a;
            System.out.println(1000 + tmp * 100);
        } else if (a == c && a != b) {
            tmp = a;
            System.out.println(1000 + tmp * 100);
        } else if (a == b && b == c) {
            tmp = a;
            System.out.println(10000 + tmp * 1000);
        }
    }
}
