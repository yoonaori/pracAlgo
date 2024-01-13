import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // n이 7이라면 i는 1부터 5까지, j는 i+1부터 6까지, k는 j+1부터 7까지 반복
        // 수행횟수는 i를 기준으로 15, 10, 6, 3, 1으로 감소
        // -5, -4, -3, -2로 감소
        // 1부터 n까지의 숫자중 3가지(i, j, k에서 하나씩)를 뽑는 경우의 수가 수행횟수
        // 조합 : n개의 수에서 r개를 뽑는 경우의 수
        // 조합 공식 : n(n-1)(n-2) / 6
        // 시간 복잡도 : O((n^3 - 3n^2 + 2n) / 6) -> 최고차항의 차수는 3
        System.out.println(n * (n-1) * (n-2) / 6);
        System.out.println(3);
    }
}