class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 기울기 공식 : y2-y1 / x2-x1

        // case 1 : 0,1 / 2,3
        double slope01 = (double) Math.abs(dots[0][1] - dots[1][1]) / Math.abs(dots[0][0] - dots[1][0]);
        double slope23 = (double) Math.abs(dots[2][1] - dots[3][1]) / Math.abs(dots[2][0] - dots[3][0]);
        if(slope01 == slope23){
            answer = 1;
            return answer;
        }

        // case 2 : 0,2 / 1,3
        double slope02 = (double) Math.abs(dots[0][1] - dots[2][1]) / Math.abs(dots[0][0] - dots[2][0]);
        double slope13 = (double) Math.abs(dots[1][1] - dots[3][1]) / Math.abs(dots[1][0] - dots[3][0]);
        if(slope02 == slope13){
            answer = 1;
            return answer;
        }

        // case 3 : 0,3 / 1,2
        double slope03 = (double) Math.abs(dots[0][1] - dots[3][1]) / Math.abs(dots[0][0] - dots[3][0]);
        double slope12 = (double) Math.abs(dots[1][1] - dots[2][1]) / Math.abs(dots[1][0] - dots[2][0]);
        if(slope03 == slope12){
            answer = 1;
            return answer;
        }
        
        return answer;
    }
}