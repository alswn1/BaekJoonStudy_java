import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String mul = a*b*c + "";

        System.out.println(countNum(mul, '0'));
        System.out.println(countNum(mul, '1'));
        System.out.println(countNum(mul, '2'));
        System.out.println(countNum(mul, '3'));
        System.out.println(countNum(mul, '4'));
        System.out.println(countNum(mul, '5'));
        System.out.println(countNum(mul, '6'));
        System.out.println(countNum(mul, '7'));
        System.out.println(countNum(mul, '8'));
        System.out.println(countNum(mul, '9'));
    }

    public static int countNum(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}