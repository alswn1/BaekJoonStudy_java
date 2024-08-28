import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (hash.containsKey(arr[i])) {
                int value = hash.get(arr[i]);
                hash.put(arr[i], value+1);
            }else {
                hash.put(arr[i], 1);
            }
        }

        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            if (hash.containsKey(arr2[j])) {
                sb.append(hash.get(arr2[j])).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
