import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 0;

        for(int i=0; i<n; i++){
            int num = i;
            int sum = 0;  // 각 자리수의 합을 저장할 변수

            while(num != 0){
                sum += num % 10;  // 각 자리수 더하기
                num /= 10;
            }

            // i 값과 각 자리수의 누적합이 n과 같을 경우 (생성자를 찾은 경우)
            if(sum + i == n){
                res = i;
                break;
            }
        }
        // 생성자가 없는 경우 초기화 값 0이 출력
        System.out.println(res);
    }
}