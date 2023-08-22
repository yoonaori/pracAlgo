class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(char c : control.toCharArray()){
            if(c == 'w'){
                n += 1;
            } else if(c == 's'){
                n -= 1;
            } else if(c == 'd'){
                n += 10;
            } else if(c == 'a'){
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}