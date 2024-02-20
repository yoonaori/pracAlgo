import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong((st.nextToken()));
        long b = Long.parseLong((st.nextToken()));

        long gcd = gcd2(a, b);

        // 최소공배수 : a * b / gcd
        System.out.println(a * b / gcd);
    }
    
    static long gcd2(long a, long b){
        // 최대공약수 구하는 함수
        while(b != 0){
            long r = a % b;  // 나머지

            a = b;
            b = r;
        }
        return a;
    }
}