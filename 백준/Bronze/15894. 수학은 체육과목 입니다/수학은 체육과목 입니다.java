import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어지는 num의 범위가 int의 범위를 초과하므로 long으로 변환
        long num = Long.parseLong(br.readLine());

        System.out.println(num * 4);
    }
}