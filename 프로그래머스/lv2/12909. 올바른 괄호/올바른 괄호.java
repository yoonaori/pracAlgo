import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 시작은 무조건 '('로 열려야 함
        if(s.charAt(0) == ')')
            return false;
        
        Stack stack = new Stack();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');  // 스택 값 추가
            } else {
                if(!stack.isEmpty()){
                    stack.pop(); // 스택 값 제거
                }
               
            }
        }
        
        // s가 올바른 괄호문이라면 스택이 비어있어야 함 
        if(stack.isEmpty()){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}