import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());

        int arr[] = new int[m];
        int arrsc[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int a = 0; a < n; a++) {
            str = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(str.nextToken()) - 1;
            int j = Integer.parseInt(str.nextToken()) - 1;
            int k = Integer.parseInt(str.nextToken()) - 1;

            int i1 = i;
            for (int b = 0; b < j - i + 1; b++) {
                if (k + b <= j) {
                    arrsc[b + i] = arr[k + b];
                } else {
                    arrsc[b + i] = arr[i1];
                    i1++;
                }
            }
            for (int c = 0; c < m; c++) {
                if (arrsc[c] != 0) {
                    arr[c] = arrsc[c];
                }
            }
        }

        for (int c = 0; c < m; c++) {
            System.out.print(arr[c] + " ");
        }

    }
}
