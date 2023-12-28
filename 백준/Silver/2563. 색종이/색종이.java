import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paper = Integer.parseInt(br.readLine());
        int answer = 0;
        int[][] area = new int[100][100];
        for(int i=0; i<paper; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    if(area[j][k] == 0){
                        area[j][k] = 1;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}