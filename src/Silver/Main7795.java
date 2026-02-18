package Silver;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #7795 먹을 것인가 먹힐 것인가
- 알고리즘: Sort, Binary Search
- 문제
생명체 A와 B가 있다. A는 B를 먹는다. A는 자기보다 크기가 작은 먹이만 먹을 수 있다.
예를들어 A의 크기가 {8, 1, 7, 3, 1}이고, B의 크기가 {3, 6, 1}인 경우 A가 B를 먹을 수 있는 쌍의 개수는
7가지가 존재한다. 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1
두 생명체 A와 B의 크기가 주어질 때, A의 크기가 B보다 큰 쌍이 몇개나 있는지 구하시오
- 입력
첫째 줄에 테스트의 개수 T가 주어진다. (1 ≤ T ≤ 20,000) 각 테스트 케이스의 첫째 줄에는 A의 수 N
과 B의 수 M이 주어진다. 둘째 줄에는 A의 크기가 모두 주어지고, 셋째 줄에는 B의 크기가 모두 주어진다.
크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000)
- 출력
각 테스트 케이스마다 A의 크기가 B보다 큰 쌍의 개수를 출력한다.
예제 입력 1
2           테스트 케이스가 2개 T=2
5 3         N, M
8 1 7 3 1   A
3 6 1       B
3 4         N, M
2 13 7      A
103 11 290 215 B
예제 출력 1
7
1
- etc
이분, 이진 탐색
정렬되어 있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방법
변수 3개(start, end, mid)를 사용하여 탐색
 */

public class Main7795 {

    static int lowerBound(int[] arr, int target) {          // B 배열, 비교하는 a 원소
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target) r = mid;                // lowerBound는 mid거나 mid보다 왼쪽
            else l = mid + 1;                               // lowerBound는 mid보다 오른쪽
        }
        // while 반복 종료 => 1 == r
        return l;                                           // target보다 작은 원소 개수
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();         // 출력을 위한  StringBuilder()
        int T = Integer.parseInt(br.readLine());        // T: 테스트 케이스 입력

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());                 // N: A의 크기 입력
            int M = Integer.parseInt(st.nextToken());                 // M: B의 크기 입력

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) A[j] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) B[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(B);
            int count = 0;
            for (int a: A) {
                count += lowerBound(B, a); // B에서 a보다 작은 개수
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
