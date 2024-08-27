import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 숫자 개수
        int[] count = new int[10001];   // 0 ~ 10000

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        
        System.out.println(sb.toString().trim());
    }
}