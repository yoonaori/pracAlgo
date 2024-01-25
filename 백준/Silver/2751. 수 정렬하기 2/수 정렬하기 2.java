import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 카운팅 정렬 (Counting Sort / 계수 정렬)
        // |n| <= 1,000,000이므로 -1,000,000 <= n <= 1,000,000이 성립
        // 따라서, 가능한 n의 갯수는 2,000,001개
        // -> arr[0] = -1,000,000 카운팅 / arr[1,000,000] = 0 카운팅
        // 수는 중복되지 않는다는 조건이 있으므로 boolean 배열로 생성
        boolean[] arr = new boolean[2000001];

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            // 입력된 수에 해당하는 칸을 true로 변경(카운팅)
            arr[num + 1000000] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(arr[i]){  // true이면(카운팅 된 칸이면) 출력
                sb.append(i - 1000000).append('\n');
            }
        }
        System.out.println(sb);
    }
}