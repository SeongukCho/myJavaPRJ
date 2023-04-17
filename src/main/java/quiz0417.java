import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class quiz0417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        TreeSet<Integer> treeSet=new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        System.out.print("저장된 값은 "+treeSet+" 입니다.");
    }
}
