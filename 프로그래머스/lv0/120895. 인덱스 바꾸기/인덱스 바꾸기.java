class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] arr = my_string.toCharArray(); //문자열을 배열로 변환하여 저장
        
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(arr); //배열을 문자열로 변환하여 저장
        
        return answer;
    }
}