package Bronze;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #2750 수 정렬하기
- 알고리즘: 정렬
- 문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
- 입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다.
각 숫자는 절댓값이 1,000보다 작거나 같은 정수이다.
- 출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
- 예제 입력 1
5
5
2
3
4
1
- 예제 출력 1
1
2
3
4
5
- etc
정렬
삽입정렬
선택정렬
버블정렬
퀵정렬 등등 여러개 존재
 */

public class Main2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());                            // 처음 입력받는 수 N
        ArrayList<Integer> arraylist = new ArrayList<>();                   // 입력받은 수 담을 arraylist 동적배열

        for(int i = 0; i < N; i++) {
            arraylist.add(Integer.parseInt(br.readLine()));                 // 입력받은 수들 arraylist에 담음
        }

        for(int i = 0; i < N - 1; i++) {                                    // 선택정렬
            for (int j = i + 1; j < N; j++) {
                if (arraylist.get(i) > arraylist.get(j)) {
                    int temp = arraylist.get(j);
                    arraylist.set(j, arraylist.get(i));
                    arraylist.set(i, temp);
                }
            }
        }
        for (int t : arraylist) {
            System.out.println(t);
        }

    }
}
