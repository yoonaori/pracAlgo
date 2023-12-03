import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] submit = new int[30];

        for(int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            submit[num-1]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int j=0; j<30; j++){
            if(submit[j] == 0){
                bw.write(Integer.toString(j+1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}