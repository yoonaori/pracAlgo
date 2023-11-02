import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        HashMap<Integer, Integer> dice = new HashMap<>();
        // getOrDefault() : 찾는 키가 존재하면 그 값을 반환하고, 없다면 기본 값을 반환
        // 만약 a,b,c,d가 2로 모두 같다면 dice:{2=4}로 원소가 한개임
        dice.put(a, dice.getOrDefault(a,0) + 1);
        dice.put(b, dice.getOrDefault(b,0) + 1);
        dice.put(c, dice.getOrDefault(c,0) + 1);
        dice.put(d, dice.getOrDefault(d,0) + 1);
        
        // dice의 key만 추출하여 list로 저장
        List<Integer> keys = new ArrayList<>(dice.keySet());
        
        switch(dice.size()){
            case 1:  // a b c d 모두 같은 경우
                answer = 1111 * a;
                break;
                
            case 2:  // a b c d 가 두가지 수로 이루어진 경우
                // 1:3 인 경우
                if(dice.get(keys.get(0))==1 || dice.get(keys.get(1))==1){
                    int p = (dice.get(keys.get(0)) == 3) ? keys.get(0) : keys.get(1);
                    int q = (dice.get(keys.get(0)) == 1) ? keys.get(0) : keys.get(1);
                    answer = (int)Math.pow((10*p+q), 2);
                    break;
                } else{  // 2:2 인 경우
                    int p = keys.get(0);
                    int q = keys.get(1);
                    answer = (p+q) * Math.abs(p-q);
                    break;
                }
                
            case 3:  // a b c d 가 세가지 수로 이루어진 경우(주사위 두개는 같고 나머지는 다름)
                int q = 0;
                for(Integer k : keys){
                    if(dice.get(k) != 2){ // 수가 같은 두개의 주사위가 아닌 나머지 주사위인 경우
                        if(q == 0){
                            q = k;
                        } else{
                            answer = q * k;
                        }
                    }
                }
                break;
            
            case 4:  // a b c d 모두 다른 경우
                //Collections.sort(keys);  // Collections.sort() 이용
                keys.sort(Comparator.naturalOrder());  // List.sort() 이용
                answer = keys.get(0);
                break;
        }
        
        return answer;
    }
}