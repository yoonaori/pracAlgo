class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            // i가 바뀔때마다 count가 리셋되야하므로 첫번째 반복문 안에서 count 초기화
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){ // 약수이면 count 1 증가
                    count++;
                }
            }
            if(count>=3){ // 합성수이면 answer 1 증가
                answer++;
            }
        }
        return answer;
    }
}