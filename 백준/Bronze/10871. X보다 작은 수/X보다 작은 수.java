import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n_x = br.readLine();
        StringTokenizer st = new StringTokenizer(n_x);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] a_arr = new int[n];
        String a = br.readLine();
        StringTokenizer st2 = new StringTokenizer(a);
        for(int i=0; i<n; i++){
            a_arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int num : a_arr){
            if(num < x){
                sb.append(num + " ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}