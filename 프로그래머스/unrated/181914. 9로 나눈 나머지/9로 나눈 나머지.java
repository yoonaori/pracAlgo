class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] num = number.split("");
        
        for(String tmp : num){
            sum += Integer.parseInt(tmp);
        }
        answer = sum % 9;
        return answer;
    }
}