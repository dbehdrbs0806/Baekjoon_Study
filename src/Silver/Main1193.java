package Silver;

import java.io.*;        // BufferReader, InputStreamReader 등

public class Main1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt((br.readLine()));

        // ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        int a = 1, b = 0;
        while(true) {
            if (input <= b + a) {
                if (a % 2 == 1) {
                    System.out.println((a - (input - b - 1)) + "/" + (input - b));
                    break;
                }
                else {
                    System.out.println((input - b) + "/" + (a - (input - b - 1)));
                    break;
                }
            } else {
                b += a;
                a++;
            }
        }


    }
}
