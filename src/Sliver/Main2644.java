package Sliver;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Main2644 {
    public static int BFS(ArrayList<ArrayList<Integer>> graph, int A, int B, int n) {
        boolean[] visited = new boolean[n + 1];                   // 노드들이 방문 했는지 여부 판단 배열 / n + 1: 사람은 1, 2, ~의 숫자 입력이기 때문
        Queue<Integer> queue = new LinkedList<>();                // BFS 계산을 위한 queue 선언
        //int distance = 0;                                             // 촌수 변수
        int[] distance = new int[n+1];                            // 촌수 저장배열

        queue.add(A);                                             // 시작 노드 personA queue에 대입
        visited[A] = true;                                        // 방문 여부 true

        while (!queue.isEmpty()) {                                // queue 빌때까지 반복
            int temp = queue.poll();                              // queue에서 값 반환
            for (int neighbor : graph.get(temp)) {                // queue에서 반환한 temp와 이웃한 노드들
                if (!visited[neighbor]) {                         // 방문하지 않은 노드들
                    visited[neighbor] = true;                     // 방문 여부 true로 변경
                    // distance += 1;
                    distance[neighbor] = distance[temp] + 1;  // 현재 노드의 촌수 + 1
                    queue.add(neighbor);                           // 인접 노드를 queue에 대입
                    if (neighbor == B) {
                        return distance[neighbor];
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                   // 입력을 위한 BufferReader
        StringTokenizer st;                                                                         // 입력을 Tokenizer 나눔 / st 선언

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());                    // 가족 총 인원 n명

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());                           // 각 인덱스에 빈 ArrayList를 추가
        }

        st = new StringTokenizer(br.readLine());                    // 촌수 계산 인원 번호 A, B
        int personA = Integer.parseInt(st.nextToken());
        int personB = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());                    // 부모 자식 관계의 개수 m개

        for (int i = 0; i < m; i++) {                               // 그래프에 부모 자식 관계 대입
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph.get(parent).add(child);                           // 부모와 자식 양방향
            graph.get(child).add(parent);                           // ex) 1(parent), 2(child)
            // 어차피 관계 상에서 부모 자식이고 촌수 계산 시에는 부모와 자식이 상관 없음
        }

        int result = BFS(graph,  personA, personB, n);

        System.out.println(result);
    }
}


