import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);
        int delete = (int)Math.round(n * 0.15);
        int delSum = 0;

        for (int i = 0; i < delete; i++) {
            delSum += arr[i] + arr[n-i-1];
        }
        int average = (int)Math.round((sum - delSum) / (double)(n-(2*delete)));

        System.out.println(average);
    }
}