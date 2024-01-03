import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals("0 0")){
                break;
            } else{
                StringTokenizer st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(a % b == 0){
                    System.out.println("multiple");
                } else if(b % a == 0){
                    System.out.println("factor");
                } else{
                    System.out.println("neither");
                }
            }
        }
    }
}