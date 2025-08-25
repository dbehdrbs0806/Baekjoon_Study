package Silver;

import  java.io.*;
import  java.util.*;
import  java.lang.*;

/*
Baekjoon #1205 등수 구하기
- 알고리즘: 구현
- 문제
대회에서 랭킹 리스트는 위에서부터 몇 번째 있는 점수인지 결정한다. 같은 점수일때는 점수의 등수 중 가장 작은 등수가 된다.
랭킹 리스트에 올라갈 수 있는 점수의 개수 p개가 주어진다. 리스트에 있는 점수 N개가 비오름차순으로 주어지고, 새로운 점수가 주어질 때
새로운 점수가 리스트에서 몇 등하는지 구하는 프로그램을 작성하시오. 만약 리스트에 올라갈 수 없다면 -1을 출력한다.
만약 랭킹 리스트가 꽉 차있을 때, 새 점수가 이전 점수보다 더 좋을 때만 점수가 바뀐다.
- 입력
첫째 줄에 N, 새로운 점수, P가 주어진다. P는 10보다 크거나 같고, 50보다 작거나 같은 정수, N은 0보다 크거나 같고, P보다 작거나 같은 정수이다.
둘째 줄에는 랭킹 리스트에 있는 점수 N개가 비오름차순으로 주어진다. 새로운 점수는 0보다 크거나 같고, 2,000,000,000보다 작거나 같은 정수이다.
- 예제입력
3 90 10
100 90 80
- 예제출력
2
- etc


 */
public class Main1205 {
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int n = Integer.parseInt(st.nextToken());
    int newScore = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    // 랭킹리스트에 값이 없다면 - 뒤에 더 받는 값이 없기에 여기서 종료
        if(n==0){
        System.out.println(1);
        return;
    }

    st = new StringTokenizer(br.readLine(), " ");
    int[] scores = new int[n];
        for(int i=0;i<n;i++) {
        int score = Integer.parseInt(st.nextToken());
        scores[i] = score;
    }

    int result = solution(scores, n, newScore, p);
        System.out.println(result);

}

private static int solution(int[] scores, int n, int newScore, int p) {
        if(n==p && scores[n-1] >= newScore)
            return -1;

        // 랭킹리스트에서 자기 위치 찾기
        int rank = 1;
        int prev = -1;
        for(int i=0;i<n;i++) {
            if(scores[i] > newScore){
                // 같은 값이 여러개에 있을 경우, 맨 앞에 하나에 대해서만 rank 증가
                if(scores[i] == newScore && prev == newScore)
                    continue;
                rank++;
            }
            prev = scores[i];
        }
        return rank;
    }
}
