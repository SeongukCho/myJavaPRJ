package baekjoon;

import java.util.Scanner;

public class bkj5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int leng = str.length();
        int[] arr = new int[leng];
        int sum = 0;
        for (int i = 0; i < leng; i++) {
            if (Integer.valueOf(str.charAt(i)) < 68) {
                sum += 3;
            } else if (Integer.valueOf(str.charAt(i)) < 71) {
                sum += 4;
            } else if (Integer.valueOf(str.charAt(i)) < 74) {
                sum += 5;
            } else if (Integer.valueOf(str.charAt(i)) < 77) {
                sum += 6;
            } else if (Integer.valueOf(str.charAt(i)) < 80) {
                sum += 7;
            } else if (Integer.valueOf(str.charAt(i)) < 84) {
                sum += 8;
            } else if (Integer.valueOf(str.charAt(i)) < 87) {
                sum += 9;
            } else if (Integer.valueOf(str.charAt(i)) < 91) {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
