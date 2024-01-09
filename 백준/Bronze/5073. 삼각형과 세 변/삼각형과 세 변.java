import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];

        while(true){
            String str = br.readLine();
            if(str.equals("0 0 0")){
                break;
            } else{
                StringTokenizer st = new StringTokenizer(str);
                arr[0] = Integer.parseInt(st.nextToken());
                arr[1] = Integer.parseInt(st.nextToken());
                arr[2] = Integer.parseInt(st.nextToken());

                Arrays.sort(arr);
                String answer = isTriangle(arr);
                System.out.println(answer);
            }
        }
    }
    
    static String isTriangle(int[] arr){
        if(arr[2] >= arr[0] + arr[1]){
            return "Invalid";
        } else if(arr[0]==arr[1] && arr[1]==arr[2]){
            return "Equilateral";
        } else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0]){
            return "Isosceles";
        } else{
            return "Scalene";
        }
    }
}