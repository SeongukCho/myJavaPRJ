import java.util.Scanner;

public class bkj2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 2 * n - 1; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j += 2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
