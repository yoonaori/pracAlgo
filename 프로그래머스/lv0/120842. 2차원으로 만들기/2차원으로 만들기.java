class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        answer = new int[num_list.length/n][n];
        int idx = 0;
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}