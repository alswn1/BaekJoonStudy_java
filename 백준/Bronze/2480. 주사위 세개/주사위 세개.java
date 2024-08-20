import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        int high;

        // 모든 변수가 다 다른 경우
        if (a != b && b != c && a != c) {
            high = a > b ? (a > c ? a : c ) : (b > c ? b : c);
            sum = high * 100;
             
            // 모든 변수가 다 같은 경우
        }else if (a == b && a == c) {
            sum = 10000 + a*1000;

            // a랑 b 혹은 a랑 c가 같은 경우
        }else if (a == b || a == c) {
            sum = 1000 + a*100;

            // b랑 c가 같은 경우
        }else {
            sum = 1000 + b*100;
        }

        System.out.println(sum);
    }
}