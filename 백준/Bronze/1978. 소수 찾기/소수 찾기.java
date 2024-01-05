import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)){
                answer++;
            };
        }
        System.out.println(answer);
    }
    
    static boolean isPrime(int num){
        // 1은 소수가 아님, 소수는 2이상의 숫자 중 1과 자신만을 약수로 가짐
        if(num == 1){
            return false;
        }

        // num의 제곱근까지만 판별하는 이유는, 예시로 12라는 수를 보면
        // 12의 약수는 1,2,3,4,6,12 / 12의 제곱근은 약 3.46
        // 1,2,3까지 나누어 떨어지는 수가 각각 12,6,4에 대응
        // 4,6,12는 이전에 판별한 수(1,2,3)와 동일하므로 다시 판별할 필요없음
        // 나누어 떨어지는 수가 있다면 소수가 아니므로 false 리턴
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        // 위의 두 조건을 만족하지 않으면 소수
        return true;
    }
}