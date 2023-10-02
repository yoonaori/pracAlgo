import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        // String에 해당하는 수가 너무 큰 경우 parseInt 사용 불가함
        // BigInteger 클래스를 사용하여 해결
        // BigInteger는 정수의 크기에 제한이 없음, 그러나 연산자 처리 불가하여 각각의 메서드 사용해야함
        BigInteger a_int = new BigInteger(a);
        BigInteger b_int = new BigInteger(b);
        BigInteger sum = a_int.add(b_int);
        
        answer = sum.toString();
        return answer;
    }
}