class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int[] query : queries){
            for(int i=query[0]; i<query[1]+1; i++){
                arr[i]++;
            }
        }
        answer = arr;
        return answer;
    }
}