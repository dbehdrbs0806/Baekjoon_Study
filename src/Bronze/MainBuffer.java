package Bronze;

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

public class MainBuffer {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        /* 문자열끼리 더하기 가능한 객체
        sb.append("~")   // 문자열을 추가하는 메소드
        sb.insert(index, "~")   // 해당 인덱스(offset)에 문자열 추가
        sb.replace(index1, index2, "~")    // 첫 인덱스를 두번째 인덱스로 대체
        등 String 에 함수들 사용가능
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();       BufferedReader 로 문자열 입력값 받을 때
        // int i = Integer.parseInt(br.readLine());   BufferedReader 로 입력값 정수로 바꿀 때

        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringTokenizer st = new StringTokenizer(br.readLine(), "~(이걸로 분리)")
        // st.countToken()  분리하고 남은 단어(Token) 개수 반환
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /* 입력받은 내용 출력 객체
        bw.write();     // 출력함수
        bw.flush();
        bw.close();     // 닫아줘야함
        */

    }
}
