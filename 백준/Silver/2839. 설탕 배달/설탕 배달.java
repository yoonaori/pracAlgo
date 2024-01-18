import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while(n > 0){
            if(n % 5 == 0){ // 5로 나누어 떨어지면 5kg 봉지로 배달 가능
                answer += n / 5;
                break;
            }
            if(n < 3){ // 3kg, 5kg로 배달 불가능한 경우
                System.out.println(-1);
                return;
            }
            // n이 18인 경우 5로 나누어 떨어지지 않으므로,
            // 배달할 3kg 한봉지 뺀 후 다시 5로 나누어 떨어지는지 검사
            n -= 3;
            answer++;
        }
        System.out.println(answer);
    }
}