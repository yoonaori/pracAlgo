import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // (0,0)으로부터의 x값을 초기값으로 초기화
        int min = x;

        min = (y < min) ? y : min;
        min = (w-x < min) ? w-x : min;
        min = (h-y < min) ? h-y : min;

        System.out.println(min);
    }
}