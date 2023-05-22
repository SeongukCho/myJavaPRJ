package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        int n;
        for (int i = 0; i < 28; i++) {
            n = Integer.parseInt(br.readLine());
            arr[n-1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);

            }
        }
    }
}
