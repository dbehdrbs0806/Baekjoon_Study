package Sliver;

import java.io.*;
import java.util.*;
public class Main2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            int a = Integer.parseInt(br.readLine());
            array.add(a);
        }
        /*quickSort(array, 0, array.size() - 1);
        *//* args:
           array // 정렬할 배열
           0     // 배열의 처음 인덱스 값
           array.size() // 배열의 마지막 인덱스 값
         *//*
        Set<Integer> result = new TreeSet<>(array);*/
        Collections.sort(array);
        for(int value : array) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
   /* public static void quickSort(ArrayList<Integer> array,  int low, int high) {
        if (low >= high)
            return;
        int pivot = low + (high - low) / 2;
        int pivotvalue = array.get(pivot);
        int left = low;
        int right = high;
        while (left <= right) {
            while (array.get(left) < pivotvalue) {
                left++;
            }
            while(array.get(right) > pivotvalue) {
                right--;
            }
            if (left <= right) {
                int temp = array.get(right);
                array.set(right, array.get(left));
                array.set(left, temp);
                left++;
                right--;
            }
        }
        quickSort(array, low, right);
        quickSort(array, left, high);
    }*/
}

/* input // 첫번째 입력값은 정렬할 값의 개수
   ArrayList<Double> array = new ArrayList<>(); // 정렬할 값이 동적임으로 동적배열 ArrayList 사용
   위의 퀵정렬로 문제 해결 시 평균 nlogn  / 최악 n^2 임으로 시간초과 발생
   => collection.sort() 를 사용



* */
