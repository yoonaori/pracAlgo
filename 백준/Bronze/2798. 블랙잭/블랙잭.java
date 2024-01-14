import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m.nextToken());
        int m = Integer.parseInt(n_m.nextToken());

        StringTokenizer num = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(num.nextToken());
        }

        int res = search(arr, n, m);
        System.out.println(res);
    }
    
    static int search(int[] arr, int n, int m){
        int res = 0;

        // 카드 3장을 고르기 때문에 첫번째는 n-2까지만 순회
        for(int i=0; i<n-2; i++){
            // 두번째는 첫번째 카드 다음부터 n-1까지만 순회
            for(int j=i+1; j<n-1; j++){
                // 세번째는 두번째 카드 다음부터 n까지 순회
                for(int k=j+1; k<n; k++){
                    int tmp = arr[i] + arr[j] + arr[k];

                    // 고른 세 카드의 합과 m이 같으면, 그 값이 m과 제일 가까운 합
                    if(tmp == m){
                        return tmp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 m보다 작으면 res 갱신
                    if(res<tmp && tmp<m){
                        res = tmp;
                    }
                }
            }
        }

        // 모든 순회를 마치면 res 리턴
        return res;
    }
}