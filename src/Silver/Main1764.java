package Silver;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #1764 듣보잡
- 알고리즘: 정렬, 집합
- 문제
듣도 못한 사람과 보도 못한 사람이 있다.
듣도 못한 사람의 명단을 구하는 프로그램을 작성하시오
- 입력
첫째 줄에 듣도 못한 사람의 수 N과 보도 못한 사람의 수 M이 주어진다.
이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이
순서대로 주어진다. 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
- 출력
듣보잡의 수와 그 명단을 사전순으로 출력한다.
- 예제 입력 1
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton
- 예제 출력 1
2
baesangwook
ohhenrie
- etc
듣지 못한사람이 N 보지 못한사람이 M
N에 해당되는 영어 이름과 M에 해당되는 영어이름 겹치는 이름의 수 와 이름들을 출력하는 문제
=> HashMap 사용해야함
HashMap의 getOrDefault()를 사용해야함
*/
public class Main1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arraylist = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                arraylist.add(name);
            }
        }

        Collections.sort(arraylist);
        StringBuilder sb = new StringBuilder();
        sb.append(arraylist.size()).append("\n");
        for (String s : arraylist) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
