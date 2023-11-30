import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++){
            // 공백 찍기
            for(int j=n-i; j>1; j--){
                bw.write(" ");
            }
            // 별 찍기
            for(int j=0; j<=i; j++){
                bw.write("*");
            }
            // 개행
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}