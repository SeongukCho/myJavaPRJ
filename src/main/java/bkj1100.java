import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            str = br.readLine();
            String[] strr = str.split("");
            if (i % 2 == 0) {
                for (int j = 0; j < strr.length; j+=2) {
                    if (strr[j].equals("F")) {
                        cnt++;
                    }
                }
            } else {
                for (int j = 1; j < strr.length; j+=2) {
                    if (strr[j].equals("F")) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
