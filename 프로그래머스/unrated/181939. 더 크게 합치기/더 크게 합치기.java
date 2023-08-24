class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String res1 = Integer.toString(a) + Integer.toString(b);
        String res2 = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(res1) < Integer.parseInt(res2)){
            answer = Integer.parseInt(res2);
        } else if(Integer.parseInt(res1) >= Integer.parseInt(res2)){
            answer = Integer.parseInt(res1);
        } 
        
        return answer;
    }
}