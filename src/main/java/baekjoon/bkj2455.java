package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int people = 0;
        int max = 0;

        int arr[] = new int[4];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = people - Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken()));
            people = arr[i];
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
