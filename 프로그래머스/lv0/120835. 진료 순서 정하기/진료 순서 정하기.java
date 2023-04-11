class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){  // 응급도 숫자를 각각 비교하여
            for(int j=0; j<emergency.length; j++){  // 숫자가 작으면 진료 순서가 높아지도록(후순위)
                if(emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
            // 따로 초기화를 하지않아 디폴트가 0이므로 1 증가시켜줌 (제일 빠른 진료순서가 0이 아닌 1이도록)
            answer[i]++;
        }
        
        
        return answer;
    }
}
