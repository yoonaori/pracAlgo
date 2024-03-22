import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 에라토스테네스의 체
        // 소수(인덱스)는 false, 나머지는 true를 가지는 배열 생성
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;  // 0과 1은 소수가 아니므로 true로 지정

        // 2부터 시작해서 특정 수의 배수에 해당하는 수는 모두 true로 지정 (자기자신은 제외)
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {  // 이미 true로 지정된 수는 건너뛰기 위해 판별
                // false인 경우에만 반복문 진입
                // 자기자신은 제외하고 true로 바꿔줘야함
                // 예를 들어, i=2이면 prime[i * j]는 prime[4], prime[6]... 이렇게 될 것
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = true;
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 2; j <= num / 2; j++) {
                if(!prime[j] && !prime[num - j]){
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}