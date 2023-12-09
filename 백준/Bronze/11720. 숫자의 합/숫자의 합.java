import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String numArr = br.readLine();

        int sum = 0;
        for(int i=0; i<num; i++){
            sum += Integer.parseInt(Character.toString(numArr.charAt(i)));
        }
        
        System.out.println(sum);
    }
}