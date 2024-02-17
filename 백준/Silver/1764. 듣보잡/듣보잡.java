import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람 명단
        Set<String> set1 = new HashSet<>();
        for(int i=0; i<n; i++){
            String name = br.readLine();
            set1.add(name);
        }

        // 보도 못한 사람 명단
        Set<String> set2 = new HashSet<>();
        for(int i=0; i<m; i++){
            String name = br.readLine();
            set2.add(name);
        }

        // 듣보잡의 수(answer)와 명단(list) 확인
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(String name : set1){
            if(set2.contains(name)){
                list.add(name);
                answer++;
            }
        }


        StringBuilder sb = new StringBuilder();
        sb.append(answer).append('\n');

        // 듣보잡 명단을 사전순으로 출력하기위해 정렬
        Collections.sort(list);

        for(String name : list){
            sb.append(name).append('\n');
        }

        System.out.println(sb);
    }
}