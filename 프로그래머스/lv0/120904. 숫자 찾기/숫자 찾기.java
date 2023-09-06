class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int idx = 0;
        String num_str = Integer.toString(num);
        
        for(int i=0; i<num_str.length(); i++){
            if(num_str.charAt(i) == Character.forDigit(k, 10)){
                idx = i+1;
                break;
            } else{
                idx = -1;
            }
        }
        answer = idx;
        return answer;
    }
}