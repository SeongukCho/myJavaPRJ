import java.util.Scanner;

public class Quiz0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
        System.out.println("평균 값 : " + sum / (float) arr.length);
    }
}
