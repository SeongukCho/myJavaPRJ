package javaEx;

public class Ex06_07 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 1; i <= 10; i++) {
//          hap = hap + 1;
            hap += 1;
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
