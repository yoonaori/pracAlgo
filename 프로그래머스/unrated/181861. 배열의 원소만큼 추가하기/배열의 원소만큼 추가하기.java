import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> arr_list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                // arr[i] 만큼 반복하며 arr[i] 를 list에 저장
                arr_list.add(arr[i]); 
            }
        }
        
        answer = new int[arr_list.size()];
        // list에 담긴 원소들 하나씩 꺼내 배열에 담기
        for(int i=0; i<answer.length; i++){
            answer[i] = arr_list.get(i);
        }
        return answer;
    }
}