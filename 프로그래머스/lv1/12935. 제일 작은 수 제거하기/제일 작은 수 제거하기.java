class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){  //배열의 길이가 1인 경우
            answer = new int[1];
            answer[0] = -1;
            
        } else {  //배열의 길이가 2 이상인 경우
            answer = new int[arr.length - 1];
            int min = arr[0];  //첫번째 원소를 최솟값으로 설정하여 각각 비교
            
            //배열의 최솟값 찾기
            for(int i=1; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            
            //배열의 원소들과 최솟값을 비교하여 최솟값을 제외한 나머지 원소들 answer에 담아주기
            //arr와 answer의 길이가 각각 다르므로 answer의 index값을 따로 선언해줌
            int index = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == min){
                    continue;
                }
                answer[index] = arr[i];
                index++;
            }     
        }
        
        return answer;
    }
}
