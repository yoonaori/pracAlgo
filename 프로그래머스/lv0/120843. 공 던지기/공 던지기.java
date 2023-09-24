class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        
        while(k > 0){
            answer = numbers[count % numbers.length];
            count += 2;
            k--;
        }
        
        return answer;
    }
}