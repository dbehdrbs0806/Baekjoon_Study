package Sliver;

import java.io.*;
import java.util.*;
public class Main2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(br.readLine());
        ArrayList<Double> array = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            double a = Double.parseDouble(br.readLine());
            array.add(a);
        }
        quickSort(array, 0, array.size());
        for (var e: array) {
            System.out.println(e);
        }
    }
    public static void quickSort(ArrayList<Double> array,  double low, double high) {

    }


}
