import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        for (int i=0; i<a; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}