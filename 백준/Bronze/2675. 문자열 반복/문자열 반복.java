import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for(int i=0; i<test; i++){
            String r_s = br.readLine();
            StringTokenizer st = new StringTokenizer(r_s, " ");
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            String[] arr = s.split("");
            StringBuilder sb = new StringBuilder();
            for(String str : arr){
                for(int j=0; j<r; j++){
                    sb.append(str);
                }
            }

            System.out.println(sb);
        }
    }
}