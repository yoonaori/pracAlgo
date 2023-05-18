import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(i==0){
                stack.push(arr[i]);
    
            } else if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        // stack의 사이즈와 동일하게 배열 생성
        int s = stack.size();
        answer = new int[s];
        
        // stack은 LIFO이므로 역순으로 담아줌
        for(int i=s-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}