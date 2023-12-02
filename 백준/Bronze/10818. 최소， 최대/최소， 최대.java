import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        for(int i=0; i<n; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬 (오름차순)
        Arrays.sort(numArr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(numArr[0]) + " " + Integer.toString(numArr[n-1]));
        bw.flush();
        bw.close();
    }
}