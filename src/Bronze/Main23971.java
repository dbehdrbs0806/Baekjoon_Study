package Bronze;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #23971 수열의 길이
- 알고리즘: 수학, 정수론
- 문제
한 명씩 앉을 수 있는 테이블이 행마다 W개씩 H행에 걸쳐 있을 때, 모든 참가자는 세로로 N칸 또는 가로로 M칸 이상 비우고 앉아야 한다.
즉, 다른 모든 참가자와 세로줄 번호의 차가 N보다 크거나 가로줄 번호의 차가 M보다 큰 곳에만 앉을 수 있다.
논문과 과제에 시달리는 성우를 위해 강의실이 거리두기 수칙을 지키면서 최대 몇 명을 수용할 수 있는지 구해보자.

- 입력
첫째 줄에 H, W, N, M이 주어진다. (0 < H, W, N, M ≤ 50,000)
- 출력
강의실에 수용할 수 있는 최대 인원수를 출력한다.
- 예제 입력 1
5 4 1 1
- 예제 출력 1
6
- etc

 */

public class Main23971 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int rows = (H + N) / (N + 1);
        int cols = (W + M) / (M + 1);

        System.out.println(rows * cols);
    }
}
