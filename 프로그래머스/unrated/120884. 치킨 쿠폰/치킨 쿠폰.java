class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        
        while(true){
            service = chicken / 10;
            chicken = chicken % 10 + service;
            answer += service;
            
            // chicken(쿠폰)이 10장 안되면 못 시키니까 break 처리
            if(chicken < 10){
                break;
            }
        }
        
        return answer;
    }
}