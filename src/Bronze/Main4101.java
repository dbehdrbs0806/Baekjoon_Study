package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = buffer.readLine().split(" ");
            String a1 = input[0];
            String a2 = input[1];
            if (Integer.parseInt(a1) == 0 && Integer.parseInt(a2) == 0) {
                break;
            }
            else if (Integer.parseInt(a1) > Integer.parseInt(a2)) {
                System.out.println("Yes");
            }
            else if (Integer.parseInt(a1) <= Integer.parseInt(a2)) {
                System.out.println("No");
            }
        }
    }
}
