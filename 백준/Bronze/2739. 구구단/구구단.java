import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<10; i++){
            String res = Integer.toString(n * i);
            bw.write(Integer.toString(n) + " * " + Integer.toString(i) + " = " + res + "\n");
        }
        bw.flush();
        bw.close();
    }
}