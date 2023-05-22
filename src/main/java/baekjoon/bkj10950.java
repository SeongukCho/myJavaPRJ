package baekjoon;

import java.util.Scanner;

public class bkj10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T;
        int i, a, b;

        T = s.nextInt();

        for (i = 0; i < T; i++) {
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a + b);
        }
    }
}

