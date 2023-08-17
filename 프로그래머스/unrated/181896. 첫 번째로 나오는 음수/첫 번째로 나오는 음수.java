class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int index = 0;
        
        for(int num : num_list){
            if(num >= 0){
                index++;        
            } else{
                answer = index;
                break;
            }
        }
        if(index == num_list.length){
            answer = -1;
        }
        return answer;
    }
}