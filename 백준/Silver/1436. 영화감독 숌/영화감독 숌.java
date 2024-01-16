import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n이 1일 때 num은 666 (최솟값)
        int num = 666;
        int count = 1;
        // count가 n과 같아질 때까지 반복
        while(count != n){
            // n이 1이라면 while문 실행안됨
            // while문 진입했다는 것은 n이 1이 아니라는 뜻이니까
            // 진입하자마자 num++ 해줌
            num++;

            // num이 666을 포함하는지 검사
            // 666을 포함한다면, 그 다음으로 작은 종말의 수이므로 count++
            if(Integer.toString(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}