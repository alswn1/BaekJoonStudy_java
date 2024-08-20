import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int take = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(str);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int hour = (m + take) / 60;

        h = m + take >= 60 ? (h + hour > 23 ? h + hour - 24 : h + hour) : h;
        m = m + take >= 60 ? (m + take) % 60 : m + take;

        System.out.println(h + " " + m);
    }
}