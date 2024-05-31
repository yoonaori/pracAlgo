import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
  
        if(n < 3) return n;    
        
        int quotient = n;
        List<Integer> list = new ArrayList<>();

        while(true){
            list.add(quotient % 3);
            quotient /= 3;

            if(quotient < 3){
                list.add(quotient);
                break;
            }
        }

        int exponent = 0;
        for(int i=list.size()-1; i>=0; i--){
            answer += list.get(i) * Math.pow(3, exponent);
            exponent++;
        }
        
        return answer;
    }
}