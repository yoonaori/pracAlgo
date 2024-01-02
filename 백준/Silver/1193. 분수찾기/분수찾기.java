import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int crossCount = 1;  // 순회하는 대각선에 있는 칸의 갯수
        int prevCountSum = 0;  // 직전 대각선 칸을 누적해서 합한 변수

        while(true){
            // 현재 해당 대각선 칸 갯수 + 직전 대각선 칸 누적합 보다 x가 작다는 것은
            // 현재 해당하는 대각선에 x번째 분수가 있다는 것임
            if(x <= crossCount + prevCountSum){
                if(crossCount % 2 == 1){  // 현재 대각선 칸의 갯수가 홀수일 때
                    // 칸의 갯수가 홀수일때는 위쪽(↗︎)으로 순회 -> 분자 감소, 분모 증가
                    // 분자 : 대각선 칸의 갯수 - (x - 직전 대각선 칸 누적합 - 1)
                    // 분모 : x - 직전 대각선 칸 누적합
                    System.out.println((crossCount - (x-prevCountSum-1)) + "/" + (x - prevCountSum));
                    break;
                } else{  // 현재 대각선의 칸의 갯수가 짝수일 때
                    // 칸의 갯수가 짝수일때는 아래쪽(↙︎︎)으로 순회 -> 분자 증가, 분모 감소
                    // 홀수일때와 반대
                    System.out.println((x - prevCountSum) + "/" + (crossCount - (x-prevCountSum-1)));
                    break;
                }
            } else{  // 아직 x번째 분수가 해당 대각선에 포함되지 않는 경우
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}