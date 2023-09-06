class Solution {
    public int solution(int order) {
        int answer = 0;
        String order_str = Integer.toString(order);
        
        for(int i=0; i<order_str.length(); i++){
            char ch = order_str.charAt(i);
            if(ch=='3' || ch=='6' || ch=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}