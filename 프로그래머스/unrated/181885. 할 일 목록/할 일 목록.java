import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> todo = new ArrayList<>();
        
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false){
                todo.add(todo_list[i]);
            }
        }
        // 변환할 배열의 타입(여기서는 String[] answer) 과 같은 타입의 객체를 생성하여 파라미터로 넣어줘야 함
        answer = todo.toArray(new String[todo.size()]);
        return answer;
    }
}