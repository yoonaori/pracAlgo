import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k];
        List<Integer> answerList = new ArrayList<>();
        
        for(int num : arr){
            if(answerList.size() == k){
                break;
            }
            if(!answerList.contains(num)){
                answerList.add(num);
            }   
        }
        
        while(answerList.size() < k){
            answerList.add(-1);
        }
        
        // answerList를 stream으로 변환한 후, map을 이용해서 intStream을 가져오고, 그 후에 toArray()를 통해 배열에 넣는 형식 
        answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}