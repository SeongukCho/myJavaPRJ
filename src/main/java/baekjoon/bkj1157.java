package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String stb = st.toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < stb.length(); i++) {
            if ('A' <= stb.charAt(i) && stb.charAt(i) <= 'Z') {
                arr[stb.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (max == arr[i]) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
