class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int finalB = b / gcd(a,b);
        
        // 유한소수 판별 : 분모의 소인수가 2와 5만 존재해야함
        while(finalB != 1){
            if(finalB%2 == 0){
                finalB /= 2;
            } else if(finalB%5 == 0){
                finalB /= 5;
            } else{ // 2와 5가 아닌 경우 answer=2 리턴
                answer = 2;
                return answer;
            }
        }
        // while문이 정상적으로 종료되었을때 answer=1 리턴
        answer = 1;
        return answer;
    }
        
    // 유클리드 호제법 : 두 수의 최대공약수 구하기
    // 1. 큰수를 작은수로 나눈다
    // 2. 나누는 수(작은수)를 나머지로 계속 나눈다
    // 3. 나머지가 0이 나오면, 그때의 나누는 수가 최대공약수 !
    public int gcd(int a, int b){
        if(b==0){ // 나머지(b)가 0이 되면 나누는 수가 최대공약수! 따라서 a 반환 
            return a;
        } else{ // 나머지가 0이 될때까지 재귀 반복
            return gcd(b, a%b);
        }
    }
}