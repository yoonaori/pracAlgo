class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double sum = 0;
        int length = arr.length;
        
        for(int i : arr){
            sum += i;    
        }
        
        answer = sum / length;
        return answer;
    }
}