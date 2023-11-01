class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = n-1;
        int num = 1; // 2차원 배열에 채워넣을 값
        
        while(num <= n*n){
            // 왼 -> 오
            for(int i=colStart; i<=colEnd; i++){
                answer[rowStart][i] = num;
                num++;
            }
            rowStart++;  // 시작 행 증가
            
            // 위 -> 아래
            for(int i=rowStart; i<=rowEnd; i++){
                answer[i][colEnd] = num;
                num++;
            }
            colEnd--;  // 끝 열 감소
            
            // 오 -> 왼
            for(int i=colEnd; i>=colStart; i--){
                answer[rowEnd][i] = num;
                num++;
            }
            rowEnd--;  // 끝 행 감소
            
            // 아래 -> 위
            for(int i=rowEnd; i>=rowStart; i--){
                answer[i][colStart] = num;
                num++;
            }
            colStart++;  // 시작 열 증가
        }
        return answer;
    }
}