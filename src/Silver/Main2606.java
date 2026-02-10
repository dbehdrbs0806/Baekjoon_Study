package Silver;

import java.io.*;
import java.lang.*;
import java.util.*;

/*
Baekjoon #2606 바이러스
- 알고리즘: DP, Greedy
- 문제
선이 연결되어 있는 컴퓨터는 감염되는 웜 바이러스가 존재한다. 서로 연결되어 있는 컴퓨터는
웜 바이러스가 감염되지만 연결되어있지 않은 컴퓨터는 감염되지 않는다.
1번 컴퓨터가 웜 바이러스에 걸릴 때 웜 바이러스에 걸리는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.

- 입력
첫째 줄에 N이 주어진다. 컴퓨터의 수 100 이하인 양의 정수이고 각 컴퓨터에는 1번 부대부터 차례대로
번호가 매겨진다. 둘째 줄에는 네트워크 상에서 연결되어 있는 컴퓨터의 번호 쌍이 주어짐

- 출력
1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리는 컴퓨터의 수를 출력한다.

예제 입력 1
7
6
1 2
2 3
1 5
5 2
5 6
4 7
예제 출력 1
4
예제 입력 2
4
- etc

*/
public class Main2606 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;                                  // 감염된 컴퓨터 수


    static void dfs(int n) {
        visited[n] = true;          // 1번 컴퓨터 visited 처리

        for (int t: graph[n]) {
            if (!visited[t]) {
                count++;
                dfs(t);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int node = Integer.parseInt(br.readLine());     // 컴퓨터, 노드 개수
        int conn = Integer.parseInt(br.readLine());        // 연결 되어있는 노드 개수

        // int[] conn_node = new int[conn + 1];                // 연결된 노드와 컴퓨터 출력
        // 그래프(무방향) 배열이 필요함 ArrayList

        graph = new ArrayList[node + 1];  // 동적 노드 배열
        visited = new boolean[node + 1];           // 방문 체크

        for (int i = 1; i<=node; i++) {                      // ArrayList 초기화
             graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < conn; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        dfs(1);
        System.out.println(count);
    }
}
