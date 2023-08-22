class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int plus = 0;
        
        for(int num : num_list){
            mul *= num;
            plus += num;
        }
        if(mul < plus*plus){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}