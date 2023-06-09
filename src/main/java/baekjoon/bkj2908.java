package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = (a % 10) * 100 + ((a / 10) % 10) * 10 + a / 100;
        int d = (b % 10) * 100 + ((b / 10) % 10) * 10 + b / 100;

        if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
