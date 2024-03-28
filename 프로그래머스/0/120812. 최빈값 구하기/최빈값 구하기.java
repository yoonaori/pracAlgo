import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : array){
            // key가 num인 값을 가져와 1을 더한 값을 count에 저장
            // 해당 key가 없는 경우 0이 리턴되어 count에는 1이 저장됨
            int count = map.getOrDefault(num, 0) + 1;

            // 현재 값의 빈도수가 최대빈도수보다 크면, 최대빈도수와 최빈값 갱신
            if(count > maxCount){
                maxCount = count;  // 최대빈도수
                answer = num;  // 최빈값(key)
            }

            else if(count == maxCount){
                // 현재 값의 빈도수가 최대빈도수와 같으면 -1로 갱신
                answer = -1;
            }

            // 현재 값(key)을 빈도수(value)와 함께 저장
            map.put(num, count);
        }
        
        return answer;
    }
}