import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length-5];
        Arrays.sort(num_list); // 오름차순 정렬
        
        for(int i=0; i<num_list.length-5; i++){
            answer[i] = num_list[i+5];
        }
        
        return answer;
    }
}