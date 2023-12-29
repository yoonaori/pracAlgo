import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int notation = Integer.parseInt(st.nextToken());

        // 2진법인 경우 2^0 2^1 2^2 ... 곱하는 것처럼 진행
        int tmp = 1;
        int answer = 0;

        // 문자열(num) 하나하나가 각 수를 의미하므로 문자열을 문자로 변환
        // 일의 자리부터 계산하기위해 역순으로 추출
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);

            // 아스키 코드값으로 비교 및 계산
            if('0'<=ch && ch<='9'){
                answer += (ch-'0') * tmp;
            } else{
                // 10부터 A이므로 10을 더해줌
                answer += (ch - 'A' + 10) * tmp;
            }
            // 한칸씩 왼쪽으로 갈때마다 왼쪽으로 notation 곱해주어야함
            tmp *= notation;
        }
        System.out.println(answer);
    }
}