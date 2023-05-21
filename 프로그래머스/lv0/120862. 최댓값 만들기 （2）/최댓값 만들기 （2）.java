import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); //오름차순으로 배열 정렬
        
        int max1 = numbers[0] * numbers[1];
        int max2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(max1 > max2){
            answer = max1;
        } else{
            answer = max2;
        }
        return answer;
    }
}