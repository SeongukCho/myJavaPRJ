import java.io.*;

public class bkj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i;
        int n = Integer.parseInt(br.readLine());
        int fac = 1;

        for (i = n; i != 0; i--) {
            fac *= i;
        }

        bw.write(Integer.toString(fac));

        br.close();
        bw.flush();
        bw.close();
    }
}
