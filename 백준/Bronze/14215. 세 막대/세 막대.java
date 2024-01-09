import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        // 정렬하면 arr[2]가 가장 긴 변의 길이가 된다
        Arrays.sort(arr);

        // 삼각형의 조건 : 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작아야 함
        if(arr[0] + arr[1] > arr[2]){
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else{
            // 삼각형의 조건에 만족하려면 arr[2]가 arr[0]+arr[1]보다 작아야함
            // 따라서 arr[2]를 arr[0]+arr[1]-1로 줄여줌
            System.out.println(arr[0] + arr[1] + (arr[0] + arr[1] - 1));
        }
    }
}