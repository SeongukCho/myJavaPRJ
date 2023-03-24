import java.util.*;

public class baekjoon2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        int c,d,e;

        a = s.nextInt();
        b = s.nextInt();

        c = a*(b%10);
        d = a*((b%100)/10);
        e = a*(b/100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);

    }
}
