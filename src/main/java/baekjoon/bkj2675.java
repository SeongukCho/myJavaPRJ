package baekjoon;

import java.util.Scanner;

public class bkj2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String str = sc.next();

            int length = str.length();

            String[] strarr = str.split("",length);
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(strarr[j]);
                }
            }
            System.out.println();
        }
    }
}
