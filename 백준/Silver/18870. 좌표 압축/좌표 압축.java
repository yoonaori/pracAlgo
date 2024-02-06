import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        // Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다
        // -> 자신보다 값이 작은 좌표의 갯수가 압축 결과임
        // 배열의 각 원소값에 대한 '순위'를 매기는 것 !!
        // 값이 작을수록 순위가 높음, 중복되는 원소는 같은 순위를 가짐

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];  // 원본 배열
        int[] sorted = new int[n];  // 정렬할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<>();  // 순위를 매길 HashMap

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            // 정렬할 배열과 원본 배열에 모두 값을 넣어줌
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬할 배열에 대한 정렬 수행
        Arrays.sort(sorted);

        // 정렬된 배열을 순회하며 Map에 넣어줌 (중복 불가)
        int rank = 0;
        for(int s : sorted){
            // 중복은 불가하므로 원소가 중복되지 않을때만 넣어줌
            if(!rankingMap.containsKey(s)){
                rankingMap.put(s, rank);
                rank++;  // Map에 넣고나면 다음 순위를 가리킬 수 있도록 rank++
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            // 원본 배열 원소(key)에 대한 value(순위) 가져오기
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}