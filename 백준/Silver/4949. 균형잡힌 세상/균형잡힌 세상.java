import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();

            if(str.equals(".")){  // 입력의 종료조건
                break;
            }

            sb.append(isCorrect(str)).append('\n');
        }

        System.out.println(sb);
    }
    
    static String isCorrect(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            // 여는 괄호일 경우 stack에 추가
            if(c == '(' || c == '['){
                stack.push(c);
            }

            // 닫는 소괄호일 경우
            else if(c == ')'){
                // 닫는 소괄호를 입력받았으나 제거할 원소가 없거나
                // 제거할 원소가 ')'와 매칭이 안되는 경우 균형잡힌 문자열이 아님
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                } else{
                    stack.pop();
                }
            }

            // 닫는 대괄호일 경우
            else if(c == ']'){
                // 닫는 대괄호를 입력받았으나 제거할 원소가 없거나
                // 제거할 원소가 ']'와 매칭이 안되는 경우 균형잡힌 문자열이 아님
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                } else{
                    stack.pop();
                }
            }

            // 괄호가 아닌 그 외의 경우에는 불필요한 문자들이므로 건너뜀
        }

        // 모든 검사를 마치고 stack에 잔여 요소가 있으면 균형잡힌 문자열이 아니므로 "no" 리턴
        // stack이 비어있으면 온전한 수식이므로 "yes" 리턴
        if(stack.empty()){
            return "yes";
        } else{
            return "no";
        }
    }
}