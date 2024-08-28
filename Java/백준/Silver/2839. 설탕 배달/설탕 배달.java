import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        for (int i = N/5; i >= 0; i--) {
            int kg = N;
            count = 0;
            kg -= 5*i;
            if (kg % 3 == 0) {
                count += (i + kg/3);
                break;
            }else {
                count = -1;
            }
        }
        System.out.println(count);
    }
}
