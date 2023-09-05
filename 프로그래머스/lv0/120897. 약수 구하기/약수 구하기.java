import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}