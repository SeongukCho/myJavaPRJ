package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bkj1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] strr = st.split("");
        Arrays.sort(strr, Comparator.reverseOrder());
        for (String s : strr) {
            System.out.print(s);
        }
    }
}
