class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenStr = "";
        String oddStr = "";
        
        for(int num : num_list){
            if(num%2 == 0){
                evenStr += num + "";
            } else{
                oddStr += num + "";
            }
        }
        int even = Integer.parseInt(evenStr);
        int odd = Integer.parseInt(oddStr);
        answer = even + odd;
        return answer;
    }
}