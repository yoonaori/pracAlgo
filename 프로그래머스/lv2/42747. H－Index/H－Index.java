import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;  //배열의 길이
        
        Arrays.sort(citations);  //오름차순 정렬
        
        for(int i=0; i<length; i++){  //배열의 길이만큼 반복
            
            //(ex) 배열의 길이가 5일때, h_index의 최댓값은 5임 
            // -> 5편의 논문이 5번 이상 인용되는 것이 최대
            // 따라서 최댓값을 감소시키며 비교할 수 있도록 초기 h를 최댓값(5)으로 설정
            int h = length - i;  
            
            //(ex) 오름차순 정렬된 배열의 첫번째 원소(3)가 h(5)보다 작으므로 다음 반복문
            //(ex) 두번째 원소(0)가 h(4)보다 작으므로 다음 반복문
            //(ex) 세번째 원소(6)가 h(3)보다 크므로 해당 h가 정답(h_index)이 된다.
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}