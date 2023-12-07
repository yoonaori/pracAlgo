import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n];
        for(int i=0; i<n; i++){
            baskets[i] = i+1;
        }

        for(int i=0; i<m; i++){
            String reverse = br.readLine();
            StringTokenizer st2 = new StringTokenizer(reverse);
            int start = Integer.parseInt(st2.nextToken()) - 1;
            int end = Integer.parseInt(st2.nextToken()) - 1;

            while(start < end){
                int tmp = baskets[start];
                baskets[start++] = baskets[end];
                baskets[end--] = tmp;
            }
        }

        for(int num : baskets){
            System.out.print(num + " ");
        }
    }
}