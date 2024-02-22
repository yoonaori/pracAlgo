import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a_child = Integer.parseInt(st.nextToken());
        int a_parent = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b_child = Integer.parseInt(st.nextToken());
        int b_parent = Integer.parseInt(st.nextToken());

        // 분수 합의 분모
        int parent = a_parent * b_parent;

        // 분수 합의 분자
        int child = (a_child * b_parent) + (b_child * a_parent);

        // (ex) 분수 합이 28/35 이라면, 두 수의 최대공약수인 7로 약분이 가능함
        // 따라서, 분모와 분자의 최대공약수를 구하여 약분
        // 만약 31/35 처럼 이미 기약분수인 경우, 최대공약수는 1이 되어 약분 X
        int gcd = gcd(child, parent);

        System.out.println(child/gcd + " " + parent/gcd);
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