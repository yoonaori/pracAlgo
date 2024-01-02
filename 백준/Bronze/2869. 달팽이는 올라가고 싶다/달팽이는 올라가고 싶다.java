import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        // up-down은 이미 올라갔다가 내려간 것을 반영한 것임
        // 따라서 가장 마지막에 내려가야한다는 점을 막기 위해 height에 down을 빼서 미리 내려가는 것을 제외
        int day = (height - down) / (up - down);

        if((height - down) % (up - down) != 0)
            day++;

        System.out.println(day);
    }
}