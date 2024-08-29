import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        outer : for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String ns = br.readLine();
            for (int j = 0; j < ns.length(); j++) {
                if (ns.charAt(j) == '(') stack.push("(");
                try {
                    if (ns.charAt(j) == ')') {
                        stack.pop();
                    }
                } catch (Exception e) {
                    sb.append("NO").append("\n");
                    continue outer;
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}