import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> arr_list = new ArrayList<>();
        
        for(int i=intervals[0][0]; i<intervals[0][1]+1; i++){
            arr_list.add(arr[i]);
        }
        for(int i=intervals[1][0]; i<intervals[1][1]+1; i++){
            arr_list.add(arr[i]);
        }
        
        answer = new int[arr_list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr_list.get(i).intValue();
        }
        return answer;
    }
}