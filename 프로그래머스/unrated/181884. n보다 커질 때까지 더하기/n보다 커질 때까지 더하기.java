class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        
        for(int num:numbers){
            sum += num;
            if(sum > n){
                answer = sum;
                break;
            }
        }
        return answer;
    }
}