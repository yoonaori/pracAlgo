class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int[] query : queries){
            int x = arr[query[0]];
            int y = arr[query[1]];
            arr[query[0]] = y;
            arr[query[1]] = x;
        }
        answer = arr;
        return answer;
    }
}