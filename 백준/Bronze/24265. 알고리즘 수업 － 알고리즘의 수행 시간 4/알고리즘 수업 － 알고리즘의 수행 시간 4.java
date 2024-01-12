import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 수행횟수는 1부터 6까지 더한 값
        // 1부터 n까지의 합 공식 : n(n+1)/2
        // 1부터 n-1까지의 합을 구해야하므로 수행횟수는 n(n-1)/2가 된다
        // 시간 복잡도 : O((n^2 - n) / 2) -> 최고차항의 차수는 2
        System.out.println(n*(n-1) / 2);
        System.out.println(2);
    }
}