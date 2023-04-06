import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        boolean arrbl[] = new boolean[42];
        for (int i = 0; i < 10; i++) {
            arrbl[arr[i] % 42] = true;
        }

        int cnt = 0;
        for (int i = 0; i < 42; i++) {
            if (arrbl[i] == true) {
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}
