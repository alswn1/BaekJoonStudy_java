import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                arr.remove(arr.size()-1);
            }else {
                arr.add(num);
            }
        }
        
        int answer = 0;
        for (int i = 0; i < arr.size(); i++) {
           answer += arr.get(i); 
        }

        System.out.println(answer);
    }
}
