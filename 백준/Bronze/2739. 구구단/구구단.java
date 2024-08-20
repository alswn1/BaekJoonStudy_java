import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int str = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < 10; i++) {
            System.out.println(str + " * " + i + " = " + (str*i));
        }
    }
}