class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            // 최솟값 비교를 위해 가장 큰 최댓값으로 초기화
            int min = Integer.MAX_VALUE;
            for(int j=s; j<=e; j++){
                if(arr[j]<min && arr[j]>k){
                    min = arr[j];
                }
            }
            // min이 MAX_VALUE라는 것은 특정 쿼리의 답이 존재하지 않다는 것을 의미
            if(min == Integer.MAX_VALUE){
                answer[i] = -1;
            } else{
                answer[i] = min;
            }
        }
        return answer;
    }
}