import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String di = st.nextToken().toString();
            int answer = 0;

            if (di.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }else if (di.equals("pop")) {
                answer = stack.isEmpty() ? -1 : stack.pop();
            }else if (di.equals("size")) {
                answer = stack.size();
            }else if (di.equals("empty")) {
                answer = stack.isEmpty() ? 1 : 0;
            }else if (di.equals("top")) {
                answer = stack.isEmpty() ? -1 : stack.peek();
            }

            if (!di.equals("push")) {
                sb.append(answer).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
