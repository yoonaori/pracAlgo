class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // String 타입인 bin1과 bin2를 10진수로 변환
        int binary1 = Integer.parseInt(bin1, 2);
        int binary2 = Integer.parseInt(bin2, 2);
        int sum = binary1 + binary2;
        
        // sum을 2진수로 변환
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}