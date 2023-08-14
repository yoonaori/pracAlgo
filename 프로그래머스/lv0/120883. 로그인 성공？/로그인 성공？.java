class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        // 2차원 배열인 db의 원소(한명의 정보)를 하나씩 꺼내어 확인
        for(String[] check:db){
            // equals() 사용하여 문자열 값 비교
            // 입력한 아이디(id_pw[0])와 하나씩 꺼낸 회원의 아이디(check[0]) 비교
            if(id_pw[0].equals(check[0])){ 
                // 아이디가 일치하면, 동일한 방식으로 비밀번호 비교
                if(id_pw[1].equals(check[1])){
                    // 둘다 일치하면 login 리턴
                    answer = "login";
                    break;
                } else{ // 아이디만 일치하면 wrong pw 리턴
                    answer = "wrong pw";
                    break;
                }
            } else{ // 둘다 불일치하면 fail 리턴
                answer = "fail";
            }
        }
        
        return answer;
    }
}