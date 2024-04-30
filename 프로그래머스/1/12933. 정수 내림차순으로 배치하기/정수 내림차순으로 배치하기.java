import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str_n = Long.toString(n);
        int[] arr = new int[str_n.length()];
        
        for(int i=0; i<str_n.length(); i++){
            arr[i] = Character.getNumericValue(str_n.charAt(i));
        }
        
        String answer_str = "";
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            answer_str = answer_str.concat(Integer.toString(arr[i]));
        }

        answer = Long.parseLong(answer_str);
        
        return answer;
    }
}