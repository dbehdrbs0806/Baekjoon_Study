package Silver;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
/*
Baekjoon #20291 파일 정리
- 알고리즘: Hash, Sort
- 문제
파일을 정리하는 프로그램을 작성하시오. 파일은 확장자별로 정리해서 몇 개씩 있는지 말하고
확장자들은 사전 순으로 정렬하시오.
- 입력
첫째 줄에 바탕화면에 있는 파일의 수 N이 주어진다. (1 ≤ N ≤ 50,000)
둘째 줄부터 N개 줄에 바탕화면에 있는 파일의 이름이 주어진다. 파일의 이름은 알파벳 소문자와 점(.) 으로 구성되어 있다.
점은 한번 등장하고, 파일의 이름의 첫 글자 또는 마지막 글자로 오지 않는다.
각 파일의 이름의 길이는 최소 3, 최대 100이다.
- 출력
확장자의 이름과 그 확장자 파일의 개수를 한 줄에 하나씩 출력한다.
확장자가 여러 개 있는 경우 확장자 이름의 사전순으로 출력한다.
예제 입력 1
8
sbrus.txt
spc.spc
acm.icpc
korea.icpc
sample.txt
hello.world
sogang.spc
example.txt
예제 출력 1
icpc 2
spc 2
txt 3
world 1
-etc
TreeMap: key(확장자) 자동 사전순 정렬
Map<String, Integer> fileName = new TreeMap<>();
 */

public class Main20291 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());                // N 파일 개수 입력받음
        // 파일 명과 확장자 명을 위해 Key-value 형태의 HashMap을 사용
        Map<String, Integer> fileName = new HashMap<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), ".");       // . 점을 기준으로 파일이름을 나눔
            st.nextToken();                             // 파일 이름
            String extension = st.nextToken();          // 확장자 이름

            if (fileName.containsKey(extension)) {      // 확장자명이 containsKey() 즉 안에 key(확장자명) 이 있는 지 확인
                fileName.put(extension, fileName.get(extension) + 1);       // 있으면 (해당 확장자명, X + 1)
            } else {
                fileName.put(extension, 1);                                 // 없으면 (해당 확장자명, 1)
            }
        }
        String result = fileName.entrySet().stream()       // fileName map을 entrySet()로 모두 set 형태로 꺼냄(전체 출력)
                .sorted(Map.Entry.comparingByKey())         // sorted(compsringByKey(): key 기준으로 비교해 오름차순 정렬)
                .map(e -> e.getKey() + " " + e.getValue())      // 출력을 위해 map을 "확장자명 개수"로 변환
                .collect(Collectors.joining("\n")); // stream()에 문자열들을 collect()의 \n으로 joining()해서 하나의 문자열로 합침

        System.out.println(result);
    }
}
