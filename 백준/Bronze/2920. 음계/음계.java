import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        String str = "12345678";
        if (str.contentEquals(sb)) System.out.println("ascending");
        else if (str.contentEquals(sb.reverse())) System.out.println("descending");
        else System.out.println("mixed"); 
    }
}