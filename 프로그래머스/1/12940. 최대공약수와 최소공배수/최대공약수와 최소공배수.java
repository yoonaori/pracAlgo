class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        
        answer[0] = (n < m) ? gcd(n, m) : gcd(m, n);
        
        // 최소공배수 = 두수의 곱 / 최대공약수
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    // 최대공약수 구하는 함수
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;  // 나머지 구하기

            // gcd(a,b) = gcd(b,r) 이므로 변환
            a = b;
            b = r;
        }
        return a;
    }
}