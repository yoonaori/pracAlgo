class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2 == 0){ // 홀수번째 원소
                oddSum += num_list[i];
            } else{ // 짝수번째 원소
                evenSum += num_list[i];
            }
        }
        if(oddSum < evenSum){
            answer = evenSum;
        } else{
            answer = oddSum;
        }
        
        return answer;
    }
}