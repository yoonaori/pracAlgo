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
        for(int i=0; i<n; i++){
            basket[i] = i + 1;
        }

        for(int t=0; t<m; t++){
            String ij = br.readLine();
            StringTokenizer st2 = new StringTokenizer(ij);
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            int tmp1 = basket[i-1];
            int tmp2 = basket[j-1];
            basket[i-1] = tmp2;
            basket[j-1] = tmp1;
        }

        StringBuilder sb = new StringBuilder();
        for(int ball : basket){
            sb.append(Integer.toString(ball)).append(" ");
        }
        System.out.println(sb);
    }
}