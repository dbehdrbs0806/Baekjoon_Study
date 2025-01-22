package Silver;

import java.io.*;

public class Main1789 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        long a = 1, result = 0, count = 0;
        while (true) {
            result += a;
            a++;
            count++;
            if (result > input) {
                break;
            }
        }
        System.out.println(count - 1);
    }
}
