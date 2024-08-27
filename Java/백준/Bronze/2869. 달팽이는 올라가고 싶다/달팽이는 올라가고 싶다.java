import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        long a = Integer.parseInt(st.nextToken());   // 낮에 올라가는 거리
        long b = Integer.parseInt(st.nextToken());   // 밤에 내려가는 거리
        long v = Integer.parseInt(st.nextToken());   // 나무 높이

        long day = (v-b) / (a-b);

        if ((v-b) % (a-b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}