package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] sp = str.split("X");
            int[] arr = new int[sp.length];
            int sum = 0;
            for (int j = 0; j < sp.length; j++) {
                arr[j] = (sp[j].length()) * (sp[j].length() + 1) / 2;
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}
