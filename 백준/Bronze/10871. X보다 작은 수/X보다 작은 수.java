import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<String>();
        String[] spArr = str2.split(" ");

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