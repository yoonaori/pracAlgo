import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[9];

        for(int i=0; i<9; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<9; i++){
            if(numArr[i] > max){
                max = numArr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);
    }
}