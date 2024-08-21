import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String s1 = " ";
        String s2 = "*";
        for (int i=0; i<a; i++) {
            sb.append(s1.repeat(a-i-1)).append(s2.repeat(i+1)).append("\n");
        }
        System.out.println(sb);
    }
}