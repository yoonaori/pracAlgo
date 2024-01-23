import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st.nextToken());
        int award = Integer.parseInt(st.nextToken());

        // 각 학생의 점수를 배열로 저장
        int[] arr = new int[total];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<total; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // 점수가 담긴 배열을 오름차순으로 정렬한 뒤, 커트라인 점수 출력
        Arrays.sort(arr);
        System.out.println(arr[total - award]);
    }
}