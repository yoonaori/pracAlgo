import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            int key = Integer.parseInt(st.nextToken());

            // getOrDefault(key, defaultValue)
            // -> key에 대해 map에 저장된 value값 반환
            // -> 만약 value가 없을 경우 defaultValue값 반환
            // key에 대해 map에 저장된 값이 2라면, 1을 더한 값인 3이 저장됨
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());

            // key에 대해 저장된 값이 없으면 0이 StringBuilder에 저장
            sb.append(map.getOrDefault(key, 0)).append('\n');
        }

        System.out.println(sb);
    }
}