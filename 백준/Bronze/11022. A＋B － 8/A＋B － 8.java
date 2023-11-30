import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<t; i++){
            String ab = br.readLine();
            StringTokenizer st = new StringTokenizer(ab);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + Integer.toString(i+1) + ": " + Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(a+b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}