package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97) {
                ch[i] = (char) (ch[i] - 32);
            } else {
                ch[i] = (char) (ch[i] + 32);
            }
        }

        System.out.print(ch);
    }
}
