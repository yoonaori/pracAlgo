class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int idx = 0;
        
        for(boolean bool : included){
            if(bool == true){
                answer += (a+ d*idx);   
            }
            idx++;
        }
        return answer;
    }
}