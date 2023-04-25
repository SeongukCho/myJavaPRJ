import java.util.Scanner;

public class quiz0425_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        boolean[] crr = new boolean[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tmp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    crr[i] = true;
                }
            }
        }
        System.out.print("저장된 값은 ");

        for (int i = 0; i < arr.length; i++) {
            if (crr[i] == false) {
                System.out.print(arr[i]);
            }
        }

        System.out.print("입니다");
    }
}
