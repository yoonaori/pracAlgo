import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> index = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                index.add(i);
            }
        }
        
        // index의 size가 0이라는 것은 arr에 2가 없다는 의미
        if(index.size() == 0){
            return answer = new int[]{-1};
        }
        
        int start_idx = index.get(0);
        int end_idx = index.get(index.size()-1);
        answer = Arrays.copyOfRange(arr, start_idx, end_idx+1);
        return answer;
    }
}