import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int res = (a1 * n0) + a0;
        int def = c * n0;
        
        // (a1 * n0) + a0 <= c * n0
        // -> a0 <= (c - a1) * n0
        // a0가 음수일 경우, n0는 항상 양수이므로 (c - a1)이 양수이어야함
        if(res <= def && c >= a1){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}