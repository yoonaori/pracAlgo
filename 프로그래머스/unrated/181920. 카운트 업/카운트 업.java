class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        answer = new int[end-start+1];
        int num = start;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num;
            num++;
        }
        return answer;
    }
}