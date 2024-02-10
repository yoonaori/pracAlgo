import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        // 큐에 1부터 n까지 값 넣어주기
        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        while(queue.size() != 1){
            queue.remove();  // queue의 앞에서 제거

            // queue의 맨앞에 있는 카드를 뒤로 옮김
            queue.add(queue.getFirst());
            queue.remove();
        }

        System.out.println(queue.peek());
    }
}