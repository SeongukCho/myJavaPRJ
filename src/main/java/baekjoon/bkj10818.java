package baekjoon;

import java.util.Scanner;

public class bkj10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int min = arr[0], max = arr[0];

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}
