package Silver;

import java.io.*;
import java.util.*;
import java.lang.*;
/*
Baekjoon #2579 계단 오르기
- 알고리즘: 다이나믹 프로그래밍
- 문제
계단 오르기 게임이 있다. 이 게임은 계단이 N개 있고,
계단을 오르는 데는 각각 점수가 있다.
1. 계단은 한 번에 한 계단 또는 두 계단씩 오를 수 있다.
2. 연속된 세 개의 계단을 밟을 수 없다.
3. 마지막 도착 계단은 반드시 밟아야 한다.
계단의 개수 N이 주어졌을 때, 얻을 수 있는 최대 점수를 구하는 프로그램을 작성하시오.
- 입력
첫째 줄에 계단의 개수 N이 주어진다.
둘째 줄부터 N개의 줄에 계단을 오를 때 얻는 점수가 주어진다.

- 출력
첫째 줄에 계단을 오를 때 얻을 수 있는 최대 점수를 출력한다
- 예제 입력 1
6
10
20
15
25
10
20
- 예제 출력 1
75
- etc


 */
public class Main2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(stairs[1]);
            return;
        } else if (N == 2) {
            System.out.println(stairs[1] + stairs[2]);
            return;
        }

        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        System.out.println(dp[N]);
    }
}
