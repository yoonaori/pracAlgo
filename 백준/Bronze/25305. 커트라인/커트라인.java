import java.io.*;
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

        // 점수가 담긴 배열을 내림차순으로 정렬
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(arr[i] < arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        System.out.println(arr[award - 1]);
    }
}