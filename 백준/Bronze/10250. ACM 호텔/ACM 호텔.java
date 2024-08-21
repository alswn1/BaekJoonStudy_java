import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        for (int i=0; i<num1; i++) {
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            int n = Integer.parseInt(str[2]);

            String s1 = n%h == 0 ? h + "" : n%h + "";
            int num2 = n%h == 0 ? n/h : n/h + 1;
            String s2 = num2 < 10 ? "0" + num2 : num2 + "";
            System.out.println(s1 + s2);
        }
    }
}