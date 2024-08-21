import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for (int i=1; i<num1; i++) {
            if (max < Integer.parseInt(str[i])) max=Integer.parseInt(str[i]);
            if (min > Integer.parseInt(str[i])) min=Integer.parseInt(str[i]);
        }
        System.out.println((min + " ") + (max + ""));
    }
}