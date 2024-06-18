class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int widthMax = 0;
        int heightMax = 0;
        
        // s[0]과 s[1]중 더 큰값을 width, 작은값을 height로 지정
        for(int[] s : sizes){
            if(s[0] < s[1]){
                if(widthMax < s[1]){
                    widthMax = s[1];
                }
                if(heightMax < s[0]){
                    heightMax = s[0];
                }
            } else{
                if(widthMax < s[0]){
                    widthMax = s[0];
                }
                if(heightMax < s[1]){
                    heightMax = s[1];
                }
            }
        }
        
        answer = widthMax * heightMax;
        return answer;
    }
}