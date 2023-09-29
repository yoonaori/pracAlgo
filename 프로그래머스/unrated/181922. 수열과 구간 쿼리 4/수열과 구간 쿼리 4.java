class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        
        for(int[] query : queries){
            for(int i=query[0]; i<=query[1]; i++){
                if(i%query[2] == 0){  // i가 k의 배수이면 나눈 나머지 값이 0
                    arr[i]++;
                }
            }
        }
        answer = arr;
        return answer;
    }
}