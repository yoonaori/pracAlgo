import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        
        while(i<arr.length){
            if(stk.size() == 0){
                stk.add(arr[i]);
                i++;
            } else if(stk.size()!=0 && stk.get(stk.size()-1)==arr[i]){
                stk.remove(stk.size()-1);
                i++;
            } else if(stk.size()!=0 && stk.get(stk.size()-1)!=arr[i]){
                stk.add(arr[i]);
                i++;
            }
        }
        
        if(stk.size()==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else{
            answer = new int[stk.size()];
            for(int k=0; k<answer.length; k++){
                answer[k] = stk.get(k);
            }
            return answer;
        }
    }
}