import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        for(int i=0; i<numArr.length; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int tmp : numArr){
            if(tmp == target){
                answer++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}