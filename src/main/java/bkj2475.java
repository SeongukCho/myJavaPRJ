import java.io.*;
import java.util.StringTokenizer;

public class bkj2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(str.nextToken());
            sum += a * a;
        }
        System.out.println(sum % 10);


        br.close();
    }
}
