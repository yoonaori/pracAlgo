class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        // 다루기 쉽도록 my_string을 배열로 변환
        String[] my_arr = my_string.split("");

        for(int idx : indices){
            my_arr[idx] = "";
        }
        
        for(String str : my_arr){
            answer += str;
        }
        
        return answer;
    }
}