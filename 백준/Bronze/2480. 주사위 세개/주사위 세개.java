import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dices = br.readLine();

        // StringTokenizer를 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출
        // 값이 많은 경우, String.split(" ") 함수를 통해 배열로 저장해도 됨
        StringTokenizer st = new StringTokenizer(dices);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a==b && b==c){
            int sum = 10000 + (a * 1000);
            bw.write(Integer.toString(sum));
            bw.flush();
            bw.close();
        } else if(a!=b && b!=c && a!=c){
            int max = Math.max(Math.max(a, b), c);
            int sum = max * 100;
            bw.write(Integer.toString(sum));
            bw.flush();
            bw.close();
        } else if(a==b && b!=c){
            int sum = 1000 + (a * 100);
            bw.write(Integer.toString(sum));
            bw.flush();
            bw.close();
        } else if(a==c && c!=b){
            int sum = 1000 + (a * 100);
            bw.write(Integer.toString(sum));
            bw.flush();
            bw.close();
        } else if(b==c && c!=a){
            int sum = 1000 + (b * 100);
            bw.write(Integer.toString(sum));
            bw.flush();
            bw.close();
        }
    }
}
