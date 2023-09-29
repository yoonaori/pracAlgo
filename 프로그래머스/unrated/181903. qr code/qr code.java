import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        List<Integer> idx = new ArrayList<>();
        
        for(int i=0; i<code.length(); i++){
            if(i%q == r){
                idx.add(i);
            }
        }
        
        for(int i=0; i<idx.size(); i++){
            char c = code.charAt(idx.get(i));
            answer += Character.toString(c);
        }
        return answer;
    }
}