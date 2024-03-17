import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 승환이 앞에 서있는 학생 수
        int[] line = new int[n];  // 승환이 앞에 서있는 학생들의 순서를 저장할 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){  // 학생들의 순서(번호표) 저장
            line[i] = Integer.parseInt(st.nextToken());
        }

        String answer = isPossible(line);
        
        System.out.println(answer);
    }
    
    static String isPossible(int[] line){
        int now = 1;  // 번호표 1번

        Stack<Integer> wait = new Stack<>();  // 차례가 아닌 경우 임시로 저장할 stack

        for(int i=0; i<line.length; i++){
            if(line[i] != now){  // 차례가 아닌 경우
                // 임시 대기 공간이 비어있지 않으면서 가장 최근에 들어간 요소가 다음 차례인 경우
                if(!wait.isEmpty() && wait.peek() == now){
                    wait.pop();
                    i--;  // 임시 대기 공간에 있었던 것이므로 한번 더 반복해야함
                    now++;
                } else{  // 차례가 아닌 경우 임시 대기 공간에 저장
                    wait.push(line[i]);
                }
            } else{  // 차례가 맞는 경우
                now++;  // 다음 차례로 넘어감
            }
        }

        boolean res = true;

        for(int i=0; i<wait.size(); i++){
            int waitValue = wait.pop();  // 임시 대기 공간에 최근에 들어간 번호

            if(waitValue == now){
                now++;
            } else{
                res = false;
                break;
            }
        }

        return res ? "Nice" : "Sad";
    }
}

