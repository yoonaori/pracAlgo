class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        // myString.length() 을 통해, split하여 넣을 배열의 크기를 지정
        // 여기서는 크기를 크게 지정하여 빈 방이 생길 것임 !
        String[] str = myString.split("x", myString.length());
        
        answer = new int[str.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}