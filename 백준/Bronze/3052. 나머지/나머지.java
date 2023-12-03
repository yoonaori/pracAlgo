import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remains = new int[42];

        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            remains[num % 42]++;
        }

        int answer = 0;
        for(int remain : remains){
            if(remain != 0){
                answer++;
            }
        }

        System.out.println(answer);
    }
}