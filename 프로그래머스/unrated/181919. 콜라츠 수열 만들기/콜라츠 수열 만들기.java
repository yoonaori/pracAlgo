import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> col = new ArrayList<>();
        col.add(n);
        
        while(n>1){
            if(n%2 == 0){
                n = n / 2;
                col.add(n);
            } else{
                n = 3 * n + 1;
                col.add(n);
            }
        }
        // Integer타입의 list는 int타입의 배열로 변환(.toArray())이 불가함
        // 따라서 값을 따로 추출하여 직접 넣어줘야 함
        answer =new int[col.size()];
        for(int i=0; i<answer.length; i++){
            // .intValue()는 Integer 객체에서 int형 값을 뽑아내는 메소드
            answer[i] = col.get(i).intValue();
        }
        return answer;
    }
}