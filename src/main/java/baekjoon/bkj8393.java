package baekjoon;

import java.util.Scanner;

public class bkj8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i, sum;

        num = s.nextInt();
        sum = 0;

        for (i = 1; i < num + 1; i++) {
            sum = (sum + i);
        }
        System.out.println(sum);
    }
}
