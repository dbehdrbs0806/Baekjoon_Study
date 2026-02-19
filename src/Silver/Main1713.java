package Silver;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #1713 후보 추천하기
- 알고리즘: Sort, Greedy
- 문제
초등학교 학생회장 후보를 결정한다. 학생후보는 학생들의 추천으로 결정된다.
학교 홈페이지에 추천받은 학생의 사진을 게시할 수 있고 사진틀은 후보의 수만큼 만들었다.
1. 추천을 시작하기 전에 모든 사진틀은 비어있다.
2. 특정 학생이 추천되면, 추천받은 학생의 사진이 반드시 사진틀에 게시된다.
3. 비어있는 사진틀이 없으면 추천 횟수가 가장 적은 학생의 사진을 삭제한다. 그 자리에 새롭게
추천받은 학생의 사진을 게시한다. 이때 추천받은 횟수가 가장 적은 학생이 두명이상일 경우 더 오래된 사진을 삭제한다.
4. 다른 학생의 추천을 받으면 추천받은 횟수만 증가시킨다.
5. 사진이 삭제되면 해당 학생의 추천받은 횟수는 0이다.
후보의 수, 사진틀의 개수와 전체학생의 추천결과가 추천받은 수로 주어졌을때, 최종후보는?
- 입력
첫째 줄에 사진틀의 개수 N이 주어진다. (1 ≤ N ≤ 20)
둘째 줄에 전체 학생의 추천 횟수가 주어진다.
셋째 줄에는 추천받은 학생을 나타내는 번호가 빈 칸을 사이에 두고 추천받은 순서대로 주어진다.
총 추천횟수는 1000 이하이며 학생을 나타내는 번호는 1부터 100까지 자연수이다.
- 출력
사진틀에 최종적으로 게시된 학생의 번호를 증가하는 순서대로 출력한다
- 예제 입력 1
3
9
2 1 4 3 5 6 2 7 2
- 예제 출력 1
2 6 7

- etc
[2]
[2, 1]
[2, 1, 4] 가득 참 / 2: 1추천, 1: 1추천, 4: 1추천 /
모두 1표 => 2가 제일 오래됨 2 제거
[1, 4, 3]

 */
public class Main1713 {

    static class Candidate {
        int id;             // 학생 id
        int count;          // 추천 수
        int time;           // 게시된 시간
        Candidate(int id, int count, int time) {
            this.id = id;
            this.count = count;
            this.time = time;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());            // N 사진틀의 개수 N개
        int R = Integer.parseInt(br.readLine());            // 총 추천 횟수

        st = new StringTokenizer(br.readLine());            // 추천받은 학생 번호

        List<Candidate> frames = new ArrayList<>();    // 학생 후보 기반 frame 배열 생성

        for (int i=0; i<R; i++) {
            int student = Integer.parseInt(st.nextToken()); // 추천받은 학생
            // 1)
            boolean post = false;
            for (Candidate c : frames) {
                if (c.id == student) {          // 이미 게시된 학생인지 확인
                    c.count++;                  // 추천 +1
                    post = true;
                    break;
                }
            }
            if (post) {                         // 이미 게시된 학생이면 continue
                continue;
            }
            // 2)
            if (frames.size() < N) {            // 사진틀(3개) 보다 적을 경우
                frames.add(new Candidate(student, 1, i));   // 추천 학생 추가
                continue;
            }
            // 3)
            Candidate remove = frames.get(0);   // 학생이 사진틀이 다 찼을 때 제거 대상
            for (Candidate c : frames) {
                if (c.count < remove.count) {   // 추천 수 비교 후 작으면 remove에 지정
                    remove = c;
                } else if (c.count == remove.count && c.time < remove.time) {     //  추천 수가 같거나 time 기간이 더 오래 된 경우
                    remove = c;
                }
            }
            frames.remove(remove);          // 학생 제거
            frames.add(new Candidate(student, 1, i));   // 학생 추가
        }

        Collections.sort(frames, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate a, Candidate b) {
                return a.id - b.id;   // id 기준 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frames.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(frames.get(i).id);
        }
        System.out.println(sb);
    }
}
