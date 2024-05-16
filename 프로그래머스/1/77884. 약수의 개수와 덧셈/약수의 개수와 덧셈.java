class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int num=left; num<=right; num++){
            int factor = 0;
            
            for(int i=1; i<=num; i++){
                if(num % i == 0){
                    factor++;
                }
            }

            answer = (factor % 2 == 0) ? (answer + num) : (answer - num);
        }
        
        return answer;
    }
}