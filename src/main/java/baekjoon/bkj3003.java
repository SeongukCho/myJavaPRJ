package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k, q, l, b, n, p;

        k = 1 - Integer.parseInt(st.nextToken());
        q = 1 - Integer.parseInt(st.nextToken());
        l = 2 - Integer.parseInt(st.nextToken());
        b = 2 - Integer.parseInt(st.nextToken());
        n = 2 - Integer.parseInt(st.nextToken());
        p = 8 - Integer.parseInt(st.nextToken());

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);
    }
}
