package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3003 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] white = buffer.readLine().split(" ");
        int[] black = {1, 1, 2, 2, 2, 8};

        System.out.println((black[0]-Integer.parseInt(white[0])) + " " +
                (black[1]-Integer.parseInt(white[1])) + " " + (black[2]-Integer.parseInt(white[2]))
        + " " + (black[3]-Integer.parseInt(white[3])) + " " + (black[4]-Integer.parseInt(white[4]))
        + " " + (black[5]-Integer.parseInt(white[5])));
    }
}
/*입력값을 받을 때 무조건 BufferedReader 를 사용하기

BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 로 객체 사용함
throws Exception 을 해줘야함
문자열 입력받기
String[] input = buffer.readLine();
정수 입력받기
int n = Integer.parseInt(buffer.readLine());
공백으로 구분된 정수 입력받기
String[] input = buffer.readLine().split(" ");
int n1 = Integer.parseInt(input[0]);

String 객체는 변경이 불가함으로
StringBuilder st = new StringBuilder(); 를 사용하는 것이 좋다
 */