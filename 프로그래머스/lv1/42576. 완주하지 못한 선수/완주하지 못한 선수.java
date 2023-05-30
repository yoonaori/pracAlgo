import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String name : participant){
            // getOrDefault: 아래를 예시로, name이 있으면 name의 값을 반환하고
            // name이 없으면 지정한 기본값인 0을 반환
            // name 이름을 가진 동명이인이 이미 map에 있으면 name의 값에 +1 해줌
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion){
            // 완주자 목록을 하나씩 읽으며 저장된 map의 name값을 1씩 감소시킴
            map.put(name, map.get(name) - 1);
        }
        
        // keySet() 메소드를 활용하여 map의 객체를 반환
        for(String key : map.keySet()){
            // 완주자 목록에 있는 name의 값을 1씩 감소시켰으므로 
            // 완주한 이름은 모두 값이 0이여야 함
            // 따라서 값이 0이 아닌 키가 완주하지 못한 선수의 이름 !!
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}