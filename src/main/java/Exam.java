import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exam {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,6,1,2,4));

        Collections.sort(list);

        list.forEach(num -> System.out.print(num + " "));
    }
}
