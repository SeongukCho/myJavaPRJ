import java.util.*;

public class baekjoon10430 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A,B,C;

        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
