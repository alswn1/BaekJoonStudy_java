import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i*i <= N; i++) {
            if(prime[i]) {
                for (int j = i*i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = M; i < N+1; i++) {
            if (prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}