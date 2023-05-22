package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine()); // C가 주어진다
        StringTokenizer st;
        int arr[]; // 배열 생성
        int n;

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 학생의 수를 입력받고
            arr = new int[n]; // 학생 수 만큼의 크기를 가진 배열 생성

            double sum = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken()); // 배열에 순서대로 점수를 넣음
                sum += arr[j]; // 점수의 총합
            }

            double avg = sum / (double) n; // 평균값
            int cnt = 0; // 평균을 넘는 학생수

            for (int k = 0; k < n; k++) {
                if (arr[k] > avg) { // 점수 > 평균
                    cnt++; // 평균을 넘는 학생수 증가
                }
            }

            System.out.printf("%2.3f%%\n", (cnt / (double) n)*100);
        }
    }
}
