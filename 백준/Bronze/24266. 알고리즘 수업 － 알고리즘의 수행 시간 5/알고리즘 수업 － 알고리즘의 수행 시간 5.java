import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        // 시간 복잡도 : O(n^3) -> 최고차항의 차수는 3
        System.out.println(n * n * n);
        System.out.println(3);
    }
}