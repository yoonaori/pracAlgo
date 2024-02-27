import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            long num = Long.parseLong(br.readLine());

            if (isPrime(num)) {  // 입력받은 num이 소수인지 판별
                // num이 소수라면 그대로 출력
                sb.append(num);
            } else {
                // num이 소수가 아니라면 다음으로 큰 소수를 탐색
                long prime = nextPrime(num);
                sb.append(prime);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
    
    static boolean isPrime(long num){
        if(num==0 || num==1){  // 소수는 2부터 존재하므로, num이 0이나 1이라면 false 리턴
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            // 소수는 약수가 1과 자기 자신뿐이므로, 나눠지는 값이 있다면 소수가 아님
            // 따라서, 나눠지는 i가 존재하면 소수가 아니므로 false 리턴
            if(num % i == 0){
                return false;
            }
        }
        // 위의 반복문을 통과하면 나눠지는 i가 없다는 것을 의미하므로 소수임, true 리턴
        return true;
    }
    
    static long nextPrime(long num){
        // num은 소수가 아니므로 다음으로 큰 소수를 찾기위해 num++;
        num++;

        while(!isPrime(num)){
            // 위에서 작성한 isPrime() 메서드를 통해, 다음 소수를 찾을때까지 반복
            // isPrime(num)이 true이면 반복문 종료
            // false이면 num을 1 증가시켜 탐색
            num++;
        }
        return num;
    }
}