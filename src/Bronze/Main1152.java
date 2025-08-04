package Bronze;

import java.io.*;
import java.util.*;
import java.lang.*;

/*
Baekjoon #1152 단어의 개수
- 알고리즘: 문자열 처리
- 문제
영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
이 문자열에는 몇 개의 단어가 있는지 세는 프로그램을 작성하시오.
- 입력
첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
문자열의 길이는 1,000,000을 넘지 않는다.
- 출력
문자열에 포함되어 있는 단어의 개수를 출력한다.
- 예제 입력 1
The Curious Case of Benjamin Button
- 예제 출력 1
6
- etc
StringTokenizer를 사용하여 공백을 기준으로 문자열을 나누고 countTokens() 메서드를 사용하여 단어 개수를 셀 수 있음
 */

public class Main1152 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.countTokens());
    }
}
