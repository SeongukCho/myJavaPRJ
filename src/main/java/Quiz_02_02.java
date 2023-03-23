import java.util.Scanner;

public class Quiz_02_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a % 3 == 0 & a % 5 == 0) {
            System.out.print("3과 5의 배수입니다.");
        } else {
            if (a % 3 == 0) {
                System.out.print("3의 배수 입니다.");
            }
            if (a % 5 == 0) {
                System.out.print("5의 배수 입니다.");
            } else {
                System.out.print("3의 배수도 5의 배수도 아닙니다.");
            }
        }
    }
}
