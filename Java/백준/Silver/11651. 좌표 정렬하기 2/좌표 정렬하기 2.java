import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }else {
                return Integer.compare(a[1], b[1]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int[] is : arr) {
            sb.append(is[0]).append(" ").append(is[1]).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}