import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String str = my_string.replaceAll("[a-z]","");
        answer = new int[str.length()];
        
        for(int i=0; i<str.length(); i++){
            answer[i] = str.charAt(i) - '0';
        }
        Arrays.sort(answer);
        
        return answer;
    }
}