class Solution {
    public String solution(String polynomial) {
        String answer = "";
        // split 함수 사용 시, 특수문자를 사용하려면 앞에 \\ 처리해줘야함
        String[] poly_arr = polynomial.split(" \\+ ");
        int plus = 0;
        int constant = 0;
        
        for(String poly : poly_arr){
            if(poly.contains("x")){
                if(poly.equals("x")){
                    plus += 1;
                } else{
                    String sub = poly.replaceAll("x", "");
                    plus += Integer.parseInt(sub);
                }
            } else{
                constant += Integer.parseInt(poly);
            }
        }
        
        if(plus==1 && constant==0) answer = "x";
        if(plus==1 && constant!=0) answer = "x + " + Integer.toString(constant);
        if(plus==0) answer = Integer.toString(constant);
        if(plus>1 && constant==0) answer = Integer.toString(plus) + "x";
        if(plus>1 && constant!=0) answer = Integer.toString(plus) + "x + " + Integer.toString(constant);
        
        return answer;
    }
}