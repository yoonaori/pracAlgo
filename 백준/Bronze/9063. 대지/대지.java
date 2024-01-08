import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int spot = Integer.parseInt(br.readLine());

        int min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE, max_y = Integer.MIN_VALUE;
        for(int i=0; i<spot; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            min_x = (x < min_x) ? x : min_x;
            max_x = (x > max_x) ? x : max_x;
            min_y = (y < min_y) ? y : min_y;
            max_y = (y > max_y) ? y : max_y;
        }

        int area = Math.abs(max_x - min_x) * Math.abs(max_y - min_y);
        System.out.println(area);
    }
}