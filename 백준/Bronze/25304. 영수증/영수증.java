import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int amount = Integer.parseInt(br.readLine());
        int sum =0;

        for(int i=0; i<amount; i++){
            String ab = br.readLine();
            StringTokenizer st = new StringTokenizer(ab);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += (a * b);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(total == sum){
            bw.write("Yes");
        } else{
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}