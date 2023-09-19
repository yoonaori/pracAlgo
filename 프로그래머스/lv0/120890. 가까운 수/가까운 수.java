class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minus = 1000; // 최대한 큰 수로 정의
        
        for(int num : array){
            int tmp = num - n;
            tmp = (tmp<0) ? -tmp : tmp;
            if(tmp < minus){
                minus = tmp;
                answer = num;
            } else if(tmp==minus && num<answer){
                answer = num;
            }
        }
        return answer;
    }
}