import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 집합 A
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            set1.add(Integer.parseInt(st.nextToken()));
        }

        // 집합 B
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            set2.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        for(int num : set1){
            if(!set2.contains(num)){
                answer++;
            }
        }

        for(int num : set2){
            if(!set1.contains(num)){
                answer++;
            }
        }

        System.out.println(answer);
    }
}