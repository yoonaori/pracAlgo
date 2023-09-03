import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] split = myString.split("x");
        List<String> answer_list = new ArrayList<>();
        
        // x가 연속으로 있을 때 배열의 빈 원소가 생기는 문제 해결
        for(int i=0; i<split.length; i++){
            if(!split[i].isEmpty()){ // 빈 원소 아닌 경우에만 add 실행
                answer_list.add(split[i]);
            }   
        }
        
        // list를 배열로 변환(크기 지정하여 생성한 배열 매개변수로 넘겨줌)해주고 정렬 진행
        answer = answer_list.toArray(new String[answer_list.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}