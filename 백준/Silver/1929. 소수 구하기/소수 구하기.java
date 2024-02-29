import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> prime = findPrime(n, m);

        for(int p : prime){
            sb.append(p).append('\n');
        }

        System.out.println(sb);
    }
    
    static List<Integer> findPrime(int n, int m){
        List<Integer> prime = new ArrayList<>();

        for(int i=n; i<=m; i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }

        return prime;
    }
    
    static boolean isPrime(int num){
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
}