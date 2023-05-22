package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int i;

        for (i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int b = 0;

        for (i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                b = i+1;
            }
        }
        System.out.println(max);
        System.out.println(b);
    }
}
