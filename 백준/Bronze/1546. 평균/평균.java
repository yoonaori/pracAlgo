import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exam = Integer.parseInt(br.readLine());
        double[] scores = new double[exam];

        String score = br.readLine();
        StringTokenizer st = new StringTokenizer(score);
        for(int i=0; i<exam; i++){
            scores[i] = Long.parseLong(st.nextToken());
        }

        double max = 0;
        for(double s : scores){
            if(s > max){
                max = s;
            }
        }

        for(int i=0; i<exam; i++){
            scores[i] = scores[i] / max * 100;
        }

        double sum = 0;
        for(double s : scores){
            sum += s;
        }

        System.out.println(sum / exam);
    }
}