import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 1;
        int range = 2; // 범위 (최솟값 기준)

        if(num == 1){
            System.out.println(1);
        } else{
            while(range <= num){ // 범위가 num보다 커지기 직전까지 반복
                // 다음 범위의 최솟값으로 초기화 -> 8 20 38 62 ...
                range = range + (6 * answer);
                answer++;
            }
            System.out.println(answer);
        }
    }
}