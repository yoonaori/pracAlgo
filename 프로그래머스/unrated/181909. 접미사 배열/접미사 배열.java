import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int idx = my_string.length();
        answer = new String[idx];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = my_string.substring(idx-1);
            idx--;
        }
        Arrays.sort(answer);
        return answer;
    }
}