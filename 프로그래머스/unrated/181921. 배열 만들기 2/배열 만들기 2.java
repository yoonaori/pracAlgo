import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> res = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(isOnly05(i)){  // 메서드 호출(i가 0과 5로만 이루어진 수이면 true가 반환되어 res에 추가)
                res.add(i);
            }
        }
        
        if(res.isEmpty()){
            answer = new int[]{-1};
        } else{
            answer = new int[res.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = res.get(i);
            }
        }
        return answer;
    }
    
    private boolean isOnly05(int num){
        while(num > 0){
            int remainder = num % 10;
            if(remainder!=0 && remainder!=5){
                return false;
            }
            // 0과 5로만 이루어진 수는 최종적으로 num이 0이 되어 while문 탈출, true 반환
            num = num / 10;
        }
        return true; 
    }
}