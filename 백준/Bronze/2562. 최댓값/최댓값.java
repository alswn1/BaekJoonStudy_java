import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2;
        int cnt = 1;
        for (int i=0; i<8; i++) {
            num2 = Integer.parseInt(br.readLine());
            if (num1 < num2) {
                num1 = num2;
                cnt = i+2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append("\n").append(cnt);

        System.out.println(sb);
    }
}