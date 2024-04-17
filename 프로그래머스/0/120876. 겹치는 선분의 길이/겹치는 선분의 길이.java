class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] count = new int[200];

        for(int[] line : lines){
            // 배열에서 음수의 인덱스값을 표현할 수 없으므로
            // 0~200 범위의 배열을 만들어주고 입력받은 좌표에 100을 더해줌
            int start = line[0] + 100;
            int end = line[1] + 100;

            for(int j=start; j<end; j++){
                count[j] += 1;
            }
        }

        for(int c : count){
            if(c > 1){  // 겹치는 부분은 2이상임
                answer++;
            }
        }
        
        return answer;
    }
}