import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        h = m - 45 < 0 ? (h - 1 < 0 ? h + 23 : h - 1) : h;
        m = m - 45 < 0 ? m + 15 : m - 45;
        
        System.out.println(h + " " + m);
    }
}