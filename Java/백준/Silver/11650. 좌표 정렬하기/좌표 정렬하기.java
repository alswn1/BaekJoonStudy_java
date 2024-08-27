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

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < 2; y++) {
                sb.append(arr[x][y]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}