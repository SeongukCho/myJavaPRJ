import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String st = br.readLine();
            char[] ch = st.toCharArray();
            int cnt = 0;
            for (char a : ch) {
                if (cnt>=0) {
                    if (a == '(') {
                        cnt++;
                    } else if (a == ')') {
                        cnt--;
                    } else {
                        break;
                    }
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }
}
