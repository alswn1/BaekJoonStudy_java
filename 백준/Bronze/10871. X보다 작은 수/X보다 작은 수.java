import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        String str = br.readLine();
        List<String> list = new ArrayList<String>();
        String[] spArr = str.split(" ");

        String answer = "";
        for (int i = 0; i < a; i++) {
            if (Integer.parseInt(spArr[i]) < b) {
                answer = answer + spArr[i] + " ";
            }
        }
        answer = answer.substring(0, answer.length()-1);

        System.out.println(answer);
    }
}