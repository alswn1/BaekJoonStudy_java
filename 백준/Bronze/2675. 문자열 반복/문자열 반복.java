import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int line = Integer.parseInt(br.readLine());

        String newStr = "";
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                newStr += String.valueOf(str.charAt(j)).repeat(repeat);
            }
            newStr = newStr + "\n";
        }
        System.out.println(newStr.trim());
    }
}