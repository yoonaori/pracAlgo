import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n*n은 int의 범위를 벗어나게 됨, 따라서 long으로 변환
        long n = Long.parseLong(br.readLine());

        // 시간 복잡도 : O(n^2)
        System.out.println(n * n);
        System.out.println(2);
    }
}