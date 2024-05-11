class Solution {
    public int solution(int num) {
        int answer = 0;
        
        // num은 8,000,000미만의 정수이지만,
        // 작업 중 3을 곱하는 과정에서 int의 범위를 벗어날 가능성이 있음
        // 따라서 num의 타입을 long으로 변환
        long l_num = num;
        
        if(l_num == 1){
            return 0;
        }

        while(l_num != 1){
            if(answer > 500){
                answer = -1;
                break;
            }

            if(l_num % 2 == 0){
                l_num /= 2;
            } else{
                l_num = l_num * 3 + 1;
            }
            answer++;
        }
        
        return answer;
    }
}