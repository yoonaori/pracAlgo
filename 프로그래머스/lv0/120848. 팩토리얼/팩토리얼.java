class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int idx = 1;
        
        while(true){
            num *= idx;
            if(num > n){
                answer = idx-1;
                break;
            }
            idx++;
        }
        
        return answer;
    }
}