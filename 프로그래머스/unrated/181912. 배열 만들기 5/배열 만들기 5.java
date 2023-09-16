import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> answer_list = new ArrayList<>();
        
        for(String str : intStrs){
            String sub = str.substring(s, s+l);
            int intStr = Integer.parseInt(sub);
            if(intStr > k){
                answer_list.add(intStr);
            }
        }
        
        answer = new int[answer_list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}