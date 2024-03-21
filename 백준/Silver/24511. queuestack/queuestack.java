import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());  // 자료구조 개수
        int[] type = new int[n];  // 어떤 자료구조인지 저장할 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 각 자료구조가 큐인지 스택인지 입력받아 type 배열에 저장
        for(int i=0; i<n; i++){
            type[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine(), " ");
        // 각 자료구조의 초기값 입력받기
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            // 스택은 삽입후 바로 pop되므로 큐만 저장
            if(type[i] == 0){
                deque.addLast(num);
            }
        }

        int m = Integer.parseInt(br.readLine());  // 삽입할 수열의 길이
        st = new StringTokenizer(br.readLine(), " ");

        // 수열 삽입
        for(int i=0; i<m; i++){
            int move = Integer.parseInt(st.nextToken());

            // 만약 move가 2이고, deque에는 1 4 (큐)가 들어있다고 가정하면
            // 2가 삽입되고 1이 pop, 1이 삽입되고 4가 pop -> deque는 2 1 이 된다
            // 따라서, move를 앞에 삽입하고 마지막 원소를 pop하여 리턴(출력)
            deque.addFirst(move);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}