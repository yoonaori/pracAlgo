class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // num은 자릿수의 합을 구하기 위한 변수
        int num = x;
        int sum = 0;
        
        while(num > 0){ // 모든 자릿수의 합 구하기
            sum += (num % 10);
            num /= 10;
        }
        if((x % sum) != 0){
            answer = false;
        }
        return answer;
    }
}