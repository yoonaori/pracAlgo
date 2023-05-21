class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int[] tmp = new int[numlist.length];
        int count = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                tmp[count] = numlist[i];
                count++;
            }
        }
        
        answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i] = tmp[i];
        }
        
        return answer;
    }
}