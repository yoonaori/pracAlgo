import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<Integer> plus = new ArrayList<>();
        String[] s_arr = s.split(" ");
        
        for(int i=0; i<s_arr.length; i++){
            if(!s_arr[i].equals("Z")){
                plus.add(Integer.parseInt(s_arr[i]));
            } else{
                plus.remove(plus.size()-1);
            }
        }
        
        for(int i=0; i<plus.size(); i++){
            answer += plus.get(i);
        }
        
        return answer;
    }
}