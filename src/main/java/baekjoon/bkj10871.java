package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class bkj10871 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
