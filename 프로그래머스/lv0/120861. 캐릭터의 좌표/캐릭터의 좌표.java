class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = board[0] / 2;
        int height = board[1] / 2;
        
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "up":
                    answer[1]++;  // y축 증가
                    if(answer[1] > height){ answer[1]--; }
                    break;
                case "down":
                    answer[1]--;  // y축 감소
                    if(answer[1] < -height){ answer[1]++; }
                    break;
                case "left":
                    answer[0]--;  // x축 감소
                    if(answer[0] < -width){ answer[0]++; }
                    break;
                case "right":
                    answer[0]++;  // x축 증가
                    if(answer[0] > width){ answer[0]--; }
                    break;
            }
        }
        
        return answer;
    }
}