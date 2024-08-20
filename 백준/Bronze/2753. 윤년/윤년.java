import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str);

        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("1");
        } else if (a % 400 == 0) {
            System.out.println("1");
        } else System.out.println("0");
    }
}