import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            sb.append(isCorrect(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
    
    static String isCorrect(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // 여는 괄호일 경우 stack에 추가
            if(c == '('){
                stack.push(c);
            }

            // 아래부터는 모두 닫는 괄호일 경우

            // 닫는 괄호를 입력받았으나 제거할 원소가 없는 경우
            else if(stack.empty()){
                return "NO";
            }
            // 그 외의 경우 stack 원소 제거
            else{
                stack.pop();
            }
        }

        // 모든 검사를 마치고 stack에 잔여 요소가 있으면 여는 괄호가 많은 경우이므로 "NO" 리턴
        // stack이 비어있으면 온전한 수식이므로 "YES" 리턴
        if(stack.empty()){
            return "YES";
        } else{
            return "NO";
        }
    }
}