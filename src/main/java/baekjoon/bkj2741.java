package baekjoon;

import java.io.*;

public class bkj2741 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int i;

        for (i = (n - 1); i >= 0; i--) {
            System.out.println(n - i);
        }

        br.close();
    }
}
