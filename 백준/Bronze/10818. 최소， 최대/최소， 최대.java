import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for (int i=1; i<num1; i++) {
            int num2 = Integer.parseInt(str[i]);
            if (max < num2) max=num2;
            if (min > num2) min=num2;
        }
        System.out.println((min + " ") + (max + ""));
    }
}