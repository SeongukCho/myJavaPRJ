import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class linked0503 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // LinkedList 클래스의 객체를 Int 타입으로 생성
        Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 클래스의 객체를 생성

        for (int i = 0; i < 5; i++) { // 반복문 5번 실행
            list.add(sc.nextInt()); // LinkedList 객체에 숫자를 집어넣음 (5번 반복)
        }

        list.sort(Collections.reverseOrder()); // sort 메소드를 이용하여 list 를 내림차순 정렬

        list.forEach(value -> System.out.print(value + " ")); // list 객체의 값을 순서대로 출력
    }
}
