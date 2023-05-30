import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        // 중복은 자동으로 제거하고 추가함
        for(int i : nums){
            set.add(i);
            answer++;
        }
        
        if(answer/2 < set.size()){
            return answer/2;
        } else {
            return set.size();
        }
    }
}