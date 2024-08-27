import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long answer = 0;

        for (int i = 0; i < num; i++) {
            char n = str.charAt(i);
            answer += ((int)n-96) * Math.pow(31, i);
        }

        System.out.println(answer);
    }
}