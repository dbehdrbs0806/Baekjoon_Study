package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Main1292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();                           // 입력값을 받는 부분
        StringTokenizer st = new StringTokenizer(input, " ");   // 띄어쓰기로 input을 쪼개 st로 저장
        int token1 = Integer.parseInt(st.nextToken());          // 입력받고 쪼갠 내용 st를 두 개의 변수로 받음
        int token2 = Integer.parseInt(st.nextToken());
        int[] nums = new int[1000];                             // 값들을 담을 배열
        int a = 0;                                              // 인덱스로 사용할 변수
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (a == 1000)
                    break;
                nums[a] = i;
                a++;
            }
        }
        for (int i = token1 - 1; i <= token2 - 1; i++) {
            result += nums[i];
        }
        System.out.println(result);
    }
}


// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ~~   =>  for (int i=0; i<1000; i++)
// 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6 => for (int j=0; j < i; j++)


