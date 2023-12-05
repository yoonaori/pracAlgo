import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];

        for(int t=0; t<m; t++){
            String ijk = br.readLine();
            StringTokenizer st2 = new StringTokenizer(ijk);
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());

            for(int idx=i-1; idx<j; idx++){
                basket[idx] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int ball : basket){
            sb.append(Integer.toString(ball)).append(" ");
        }

        System.out.println(sb);
    }
}