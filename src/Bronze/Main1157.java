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
import java.util.Scanner;
import java.util.Stack;

public class Main1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        int[] arr = new int[26];

        for (int i=0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                arr[input.charAt(i) - 97]++;
            } else {
                arr[input.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
