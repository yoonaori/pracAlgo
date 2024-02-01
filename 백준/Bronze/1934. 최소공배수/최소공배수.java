import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int answer = gcd(a, b);

            sb.append(a * b / answer).append('\n');
        }
        System.out.println(sb);
    }
    
    static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;  // 나머지 구하기

            // gcd(a,b) = gcd(b,r) 이므로 변환
            a = b;
            b = r;
        }
        return a;
    }
}