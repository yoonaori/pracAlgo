class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w=0, h=0;
        int x = dots[0][0];
        int y = dots[0][1];
        
        for(int i=0; i<dots.length; i++){
            if(x != dots[i][0]){ // x가 같지않을 때 x축의 길이(w)를 구할 수 있음
                w = Math.abs(x - dots[i][0]);
            }
            if(y != dots[i][1]){ // y가 같지않을 때 y축의 길이(h)를 구할 수 있음
                h = Math.abs(y - dots[i][1]);
            }
        }
        answer = w * h;
        return answer;
    }
}