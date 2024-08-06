package Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.lang.reflect.Array;


public class Main1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        int input = Integer.parseInt(br.readLine());
        String token;
        String temp;
        for(int i = 0; i < input; i++) {
            token = br.readLine();
            array.add(token);
        }
        for (int i = input; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if ((array.get(j - 1)).length() > (array.get(j)).length()) {
                    temp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                }
                else if ((array.get(j - 1)).length() == (array.get(j).length())) {
                    if (array.get(j - 1).compareTo(array.get(j)) > 0) {
                        temp = array.get(j - 1);
                        array.set(j - 1, array.get(j));
                        array.set(j, temp);
                    }
                }
            }
        }
        Set<String> result = new LinkedHashSet<>(array);

        for (String k : result) {
            System.out.println(k);
        }
    }
}
// but, no, wont, i, hesitate
// 버블정렬을 통한 문자열 정렬을 진행 ArrayList 동적배열은 []의 접근이 아닌 get(), set() 함수로 접근함
// HashSet은 중복되는 값이 존재하지 않는 집합배열임