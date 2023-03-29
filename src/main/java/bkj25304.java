import java.util.Scanner;

public class bkj25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X, N;
        int a, b, sum;

        sum = 0;
        X = s.nextInt();
        s.nextLine();
        N = s.nextInt();

        for (int i = 0; i < N; i++) {
            a = s.nextInt();
            b = s.nextInt();
            sum = sum + (a * b);
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
