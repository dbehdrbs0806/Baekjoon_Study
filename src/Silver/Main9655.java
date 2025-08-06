package Silver;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #9655 돌 게임
- 알고리즘: 다이나믹 프로그래밍, 수학
- 문제
돌 게임은 두 명이서 돌을 가져가는 게임이다.
처음에 돌이 N개 있다. 두 사람은 번갈아 가면서 돌을 1개 또는 3개 가져갈 수 있다.
마지막 돌을 가져가는 사람이 게임을 이긴다.
a 와 b가 돌 게임을 할 때 a가 이기면 SK, b가 이기면 CY를 출력하는 프로그램을 작성하시오.
a가 먼저 게임을 시작한다.
- 입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 1000)
- 출력
첫째 줄에 a가 이기는 경우 SK, b가 이기는 경우 CY를 출력
- 예제 입력 1
5
- 예제 출력 1
SK
- etc


 */
public class Main9655 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] dp = new String[N + 1];
        dp[0] = "CY";
        if (N >= 1) dp[1] = "SK";
        if (N >= 2) dp[2] = "CY";
        if (N >= 3) dp[3] = "SK";
        for (int i = 4; i <= N; i++) {


            if (dp[i - 1].equals("CY") || dp[i - 3].equals("CY")) {
                dp[i] = "SK";
            } else {
                dp[i] = "CY";
            }
        }

        System.out.println(dp[N]);
    }
}
