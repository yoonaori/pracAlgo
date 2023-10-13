import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // sides 배열을 정렬하여 짧은 값, 긴 값 찾아냄
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        
        int low_range = max - min;
        int high_range = max + min;
        
        answer = high_range - low_range - 1;
        return answer;
    }
}