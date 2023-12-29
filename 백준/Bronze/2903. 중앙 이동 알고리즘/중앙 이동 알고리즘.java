import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = (int)((Math.pow(2, num) + 1) * (Math.pow(2, num) + 1));
        System.out.println(answer);
    }
}