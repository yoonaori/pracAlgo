class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long total = 0;
        long now_price = price;
        for(int i=0; i<count; i++){
            total += now_price;
            now_price += price;
        }
        
        if(total > money){
            answer = total - money;
        } else{
            answer = 0;
        }

        return answer;
    }
}