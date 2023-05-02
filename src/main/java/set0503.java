import java.util.HashSet;
import java.util.Scanner;

public class set0503 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            hs.add(sc.nextInt());
        }

        System.out.print("저장된 값은 ");
        hs.forEach(value -> System.out.print(value + " "));
        System.out.print("입니다.");
    }
}
