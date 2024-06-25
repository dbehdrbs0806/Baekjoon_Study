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

public class Main1110 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String token[] = input.split("");              // split을 사용해 token[] 에 하나씩 담김
        int start = Integer.parseInt(input);                 // 처음 입력한 정수
        int count = 0;                                           // 사이클 변수
        int a = start;                                       // 처음 입력한 정수 와 같이 사용할 변수
        while (true) {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count++;
            if(start == a){
                break;
            }
        }
        System.out.println(count);
    }
}

// StringTokenizer 객체는 문자열을 나눌때 무조건 구분자가 필요함 따라사 split 사용


// 26 => 6 / 2+6=8 => 68 => 8 / 6+8=14 => 84 => 4 / 8+4=12 => 42 => 2 / 4+2=6 => 26
// 사이클: 4