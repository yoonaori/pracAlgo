class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=1000; i++){
            if(i*i == n){
                answer = 1;
                break; //반복문 빠져나감
            } else{
                answer = 2;
            }
        }
        
        return answer;
    }
}