package Silver;

import java.io.BufferedReader;            // BufferReader 입력받기 라이브러리
import java.io.InputStreamReader;         // BufferReader 사용 시 필요한 InputStreamReader 라이브러리
import java.io.BufferedWriter;            // BufferedWriter 출력하기 라이브러리
import java.io.OutputStreamWriter;        // BufferedWriter 사용 시 필요한 OutputStreamWriter 라이브러리
import java.util.StringTokenizer;         // StringTokenizer BufferReader 로 읽은 문자열 구분(split) 라이브러리
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.Math.min;

/*
Baekjoon #2839 설탕 배달
- 알고리즘: DP, Greedy
- 문제
설탕 봉지 3kg과 5kg 봉지가 있다. 최대한 적은 봉지를 가져가야 하기에 18kg의 설탕을 배달할 경우 5kg 3개, 3kg 1개를
배달하면 총 4개의 봉지로 배달이 가능하다. 봉지의 개수를 구해라

- 입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

- 출력
봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

예제 입력 1
18
예제 출력 1
4
예제 입력 2
4
예제 출력 2
-1
- etc
DP(Dynamic Programming) 동적 계획법
최적화 알고리즘 문제로 부분 문제로 나누고 부분합을 기억해 사용하는 것
메모제이션: 동일한 계산 반복 시 이전 계산값을 저장하고 다시 사용
Knapsack문제
배열이 필요함
static int[] dp = new int[8];
dp[0] = 0;


 */

public class Main2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       // BufferReader br
        int n = Integer.parseInt(br.readLine());                                        // 입력값 정수 변환
        int[] dp = new int[n + 1];                                                          // 입력값 정수 크기의 배열 생성
        dp[0] = 0;          // 기저값
        int INF = 9999;

        Arrays.fill(dp, INF);

        // n은 3부터 시작
        if (n >= 3) dp[3] = 1;
        if (n >= 5) dp[5] = 1;

        for (int i=6; i<=n; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }
        if (dp[n] >= 9999) {
            System.out.println(-1);
        }
        else {
            System.out.println(dp[n]);
        }
    }
    // 그리디 문제
    static int greedy(int n) {
        int res = 0;                  // 봉지 개수

        while (n > 0) {
            if (n % 5 == 0) {
                res += n / 5;           // 5kg 봉지 개수
                return res;
            }
            n -= 3;
            res++;
        }
        return -1;                      // 안나눠떨어짐
    }
}
