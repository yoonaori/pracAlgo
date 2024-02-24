import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];

        // 이미 심어져 있는 가로수 위치 저장
        for(int i=0; i<n; i++){
            tree[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;  // 가로수 간격의 최대공약수를 저장할 변수

        for(int i=0; i<n-1; i++){
            int distance = tree[i+1] - tree[i];
            gcd = gcd(distance, gcd);  // 모든 가로수 간격을 순회하여 최대공약수 찾기
        }

        // (tree[n-1] - tree[0]) / gcd 는 간격의 수이므로
        // 총 가로수의 수는 '간격의 수 + 1'임
        // 따라서 추가로 심을 가로수의 수는 '총 가로수의 수 - 이미 심어져있는 가로수의 수'임
        System.out.println(((tree[n-1] - tree[0]) / gcd) + 1 - n);
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