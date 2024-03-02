import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int idx = 0;  // list에서 삭제할 요소를 참조할 인덱스 변수

        while(n > 1){
            idx = (idx + (k - 1)) % n;

            // idx위치에 있는 요소를 삭제함과 동시에 출력
            sb.append(list.remove(idx)).append(", ");
            n--;
        }

        // 마지막으로 남은 요소 삭제함과 동시에 출력
        sb.append(list.remove()).append('>');
        System.out.println(sb);
    }
}