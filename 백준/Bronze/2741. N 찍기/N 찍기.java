import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int str = Integer.parseInt(br.readLine());

        for(int i = 0; i < str; i++) {
            System.out.println(i+1);
        }
    }
}