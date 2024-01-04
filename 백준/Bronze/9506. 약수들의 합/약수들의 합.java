import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int number = Integer.parseInt(br.readLine());

            // -1이 입력으로 들어오면 반복문 종료
            if(number == -1){
                break;
            } else{
                int sum = 0;
                List<Integer> factor = new ArrayList<>();

                // number를 제외한 모든 약수를 factor에 저장하고 그 모든 합을 sum에 저장
                for(int i=1; i<number; i++){
                    if(number % i == 0) {
                        factor.add(i);
                        sum += i;
                    }
                }

                // 완전수 판별하여 그에 맞는 출력문 출력
                if(sum == number){
                    System.out.print(number + " = ");
                    for(int i=0; i<factor.size()-1; i++){
                        System.out.print(factor.get(i) + " + ");
                    }
                    System.out.println(factor.get(factor.size()-1));
                } else{
                    System.out.println(number + " is NOT perfect.");
                }
            }
        }
    }
}