import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String ab = br.readLine();
            if(ab.equals("0 0")){
                break;
            }
            StringTokenizer st = new StringTokenizer(ab);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}