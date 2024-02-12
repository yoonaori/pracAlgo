import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            // 가지고 있는 숫자 카드를 set에 저장
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            if(set.contains(Integer.parseInt(st2.nextToken()))){
                sb.append(1).append(' ');
            } else{
                sb.append(0).append(' ');
            }
        }

        System.out.println(sb);
    }
}