package Bronze;

import java.io.*;
import java.util.StringTokenizer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main1357 {
    public static int Rev(int input) {
        int result = 0;
        while (input > 0) {
            result = result * 10 + input % 10;
            input /= 10;
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int token1 = Integer.parseInt(st.nextToken());
        int token2 = Integer.parseInt(st.nextToken());
        int result = Rev(Rev(token1) + Rev(token2));
        System.out.println(result);
    }
}
