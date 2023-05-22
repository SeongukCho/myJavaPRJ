package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String st = br.readLine();
        char ch;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            ch = st.charAt(i);
            sum += ch - 48;
        }

        System.out.print(sum);
    }
}
