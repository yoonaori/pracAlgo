import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 코드1은 n의 값만큼 실행, 수행시간은 n에 비례
        // ex) n이 7이라면 코드1은 7회 실행되고, 수행시간은 7에 비례
        System.out.println(n);
        System.out.println(1);
    }
}