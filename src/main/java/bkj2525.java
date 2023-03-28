import java.util.Scanner;

public class bkj2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        int T, mok, nameozi;

        a = s.nextInt();
        b = s.nextInt();
        s.nextLine();
        c = s.nextInt();

        T = a*60 + b +c;
        mok = T/60;
        nameozi = T%60;

        if (T >= 1440) {
            System.out.printf("%d %d", mok - 24, nameozi);
        } else {
            System.out.printf("%d %d", mok, nameozi);
        }
    }
}
