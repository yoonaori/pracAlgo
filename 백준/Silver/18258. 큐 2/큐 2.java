import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            } else if(order.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(queue.peek()).append('\n');
                    queue.remove();
                }
            } else if(order.equals("size")){
                sb.append(queue.size()).append('\n');
            } else if(order.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append('\n');
                } else{
                    sb.append(0).append('\n');
                }
            } else if(order.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(queue.peek()).append('\n');
                }
            } else{
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(queue.peekLast()).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}