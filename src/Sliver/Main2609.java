package Sliver;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main2609 {
    public static void main(String[] args) throws Exception {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());            // 첫째 줄 입력 자연수

        int a = Integer.parseInt(st.nextToken());           // 첫 입력 자연수 a
        int b = Integer.parseInt(st.nextToken());           // 두번째 입력 자연수 b

        int temp1 = 1;                                         // 임시 최대 공약수
        int dv = temp1;                                        // 최대 공약수 dv
        while (temp1 <= a && temp1 <= b) {
            if ((a % temp1) == 0 && (b % temp1) == 0) {        //  공약수 확인 조건문
                if (dv <= temp1) {
                    dv = temp1;
                }
            }
            temp1+=1;
        }
        int mul = -1;
        int temp2 = 0;
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        while (true) {
            temp2+=1;
            array1.add(a * temp2);
            array2.add(b * temp2);
            for (int i : array1) {
                if (array2.contains(i)) {
                    mul = i;
                    break;
                }
            }
            if (mul != -1) {
                break;
            }
        }

        System.out.println(dv);
        System.out.println(mul);*/

        // GCD 방식 시간 초과로 인한

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int dv = gcd(a, b);
        int mul = (a * b / dv);

        System.out.println(dv);
        System.out.println(mul);

    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
