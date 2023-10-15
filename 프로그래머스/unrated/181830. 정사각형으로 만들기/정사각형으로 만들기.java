import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int row = arr.length; // 행의 갯수
        int col = arr[0].length; // 열의 갯수
        
        if(row > col){
            answer = new int[row][row];
            for(int i=0; i<row; i++){
                answer[i] = Arrays.copyOf(arr[i], row);
            }
        } else if(row < col){
            answer = new int[col][col];
            for(int i=0; i<row; i++){
                answer[i] = Arrays.copyOf(arr[i], col);
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}