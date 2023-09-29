import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(String str : strArr){
            int length = str.length();
            // map.getOrDefault
            // -> 찾는 키가 존재한다면 그 값을 반환하고, 없다면 기본값을 반환(여기서는 0)
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        // map의 값들을 하나씩 꺼내어 비교
        for(int count : map.values()){
            if(count > answer){
                answer = count;
            }
        }
        return answer;
    }
}