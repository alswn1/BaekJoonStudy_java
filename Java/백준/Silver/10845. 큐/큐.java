import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = -1;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String condition = st.nextToken();
            int answer = 0;
            
            if (condition.equals("push")) {
                last = Integer.parseInt(st.nextToken());
                queue.add(last);
            }else if (condition.equals("pop")) {
                answer = queue.isEmpty() ? -1 : queue.poll();
            }else if (condition.equals("size")) {
                answer = queue.size();
            }else if (condition.equals("empty")) {
                answer = queue.isEmpty() ? 1 : 0;
            }else if (condition.equals("front")) {
                answer = queue.isEmpty() ? -1 : queue.peek();
            }else if (condition.equals("back")) {
                answer = queue.isEmpty() ? -1 : last;
            }
    
            if (!condition.equals("push")) {
                sb.append(answer).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}