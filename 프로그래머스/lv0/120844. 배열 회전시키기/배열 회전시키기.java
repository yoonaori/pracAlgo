class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for(int i=0; i<answer.length-1; i++){
                answer[i+1] = numbers[i];
            }
        } else {
            answer[answer.length-1] = numbers[0];
            for(int i=0; i<answer.length-1; i++){
                answer[i] = numbers[i+1];
            }
        }
        
        return answer;
    }
}