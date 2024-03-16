import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 규칙 : 1, 4, 9, 25...를 기준으로 최종 열린 창문의 개수가 하나씩 증가함
        // 위의 수는 제곱수, 약수의 개수가 홀수임

        int cnt = 0;  // 최종 열려있는 창문의 개수를 저장할 변수

        for(int i=1; i*i<=n; i++){  // n 이하의 제곱수만 카운트
            cnt++;  // n이 10이라면, 1 4 9에서 카운트되어 cnt는 3이 된다
        }

        System.out.println(cnt);
    }
}