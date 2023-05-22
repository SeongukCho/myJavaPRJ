package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int a, b, c;
        for (int i = 0; i < m; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());
            for (int j = 0; a < b; a++, b--) {
                c = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = c;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
