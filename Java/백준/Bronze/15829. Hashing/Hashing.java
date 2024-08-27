import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long answer = 0;
        int a = 1234567891;
        long pow = 1;

        for (int i = 0; i < num; i++) {
            char n = str.charAt(i);
            answer = (answer + ((n-'a'+1) * pow) % a) % a;
            pow = (pow * 31) % a;
        }

        System.out.println(answer);
    }
}