import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());

        for(int i=0; i<test; i++){
            String word = br.readLine();
            bw.write(Character.toString(word.charAt(0)) + Character.toString(word.charAt(word.length()-1)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}