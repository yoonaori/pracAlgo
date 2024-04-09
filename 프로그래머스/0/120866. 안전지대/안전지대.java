class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board.length;
        int[][] safe = new int[n][n];

        // 안전지대 확인
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(board[row][col] == 1){
                    bomb(row, col, n, safe);
                }
            }
        }

        // 안전지대 카운팅
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(safe[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    static void bomb(int row, int col, int n, int[][] safe) {
        for(int r=row-1; r<=row+1; r++){
            if(r<0 || r>=n){
                continue;
            } else{
                for(int c=col-1; c<=col+1; c++){
                    if(c<0 || c>=n){
                        continue;
                    } else{
                        safe[r][c] = 1;
                    }
                }
            }
        }
    }
}