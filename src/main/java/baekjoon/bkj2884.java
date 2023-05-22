package baekjoon;

import java.util.Scanner;

public class bkj2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        a = s.nextInt();
        b = s.nextInt();

        if (b<45) {
            if (a > 0) {
                System.out.printf("%d %d", a - 1, b + 15);
            } else {
                System.out.printf("%d %d", a+23, b+15);
            }
        } else {
            System.out.printf("%d %d",a,(b-45));
        }
    }
}
