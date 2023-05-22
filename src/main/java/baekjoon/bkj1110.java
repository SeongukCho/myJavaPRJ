package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 10 * (n % 10) + (n / 10 + n % 10) % 10;
        int cnt = 1;

        while (n != m) {
            m = 10 * (m % 10) + (m / 10 + m % 10) % 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
