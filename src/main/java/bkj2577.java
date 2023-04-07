import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bkj2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int arr[] = new int[10];

        int value = a * b * c;
        String st = Integer.toString(value);

        for (int i = 0; i < st.length(); i++) {
            arr[st.charAt(i) - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }


    }
}
