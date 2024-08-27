import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                if (arr[x][0] < arr[y][0]) {
                    if (arr[x][1] < arr[y][1]) {
                        cnt += 1;
                    }
                }
            }
            sb.append(cnt).append(" ");
            cnt = 1;
        }
        System.out.println(sb.toString().trim());
    }
}