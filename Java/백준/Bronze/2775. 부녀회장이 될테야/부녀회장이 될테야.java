import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());    // 테스트케이스 수

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());    // 층
            int n = Integer.parseInt(br.readLine());    // 호
            
            int[][] apt = new int[k+1][n+1];

            for (int j = 1; j <=n; j++) {
                apt[0][j] = j;
            }

            for (int x = 1; x <= k; x++) {
                for (int y = 1; y <= n; y++) {
                    apt[x][y] = apt[x-1][y] + apt[x][y-1];
                }
            }

            System.out.println(apt[k][n]);
        }
    }
}