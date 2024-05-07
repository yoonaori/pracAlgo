class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n의 제곱근인 sqrt를 1로 나눈 값이 0이라면, n은 양의 정수(sqrt)의 제곱임
        double sqrt = Math.sqrt(n);
        if(sqrt % 1 == 0){
            answer = (long) Math.pow(sqrt+1, 2);
        } else{
            answer = -1;
        }
        
        return answer;
    }
}