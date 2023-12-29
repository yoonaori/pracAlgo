import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int notation = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while(num > 0){
            if(num % notation < 10){
                sb.append((char)(num % notation + '0'));
            } else{
                sb.append((char)(num % notation - 10 + 'A'));
            }
            num /= notation;
        }
        System.out.println(sb.reverse());
    }
}