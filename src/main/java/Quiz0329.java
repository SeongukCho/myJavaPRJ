import java.util.*;

public class Quiz0329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if (num % 6 == 0) {
            System.out.println("2의 배수와 3의 배수를 만족합니다.");
        } else if (num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("2의 배수도 3의 배수도 아닙니다.");
        }
    }
}
