import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int sum = a + b - c;
        String str = (a + "") + (b + "");
        int sum2 = Integer.parseInt(str) - c;

        System.out.println(sum);
        System.out.println(sum2);
    }
}