class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();
        String[] codeArr = code.split("");
        boolean mode = true;
        
        for(int i=0; i<codeArr.length; i++){
            // 숫자 1을 만나면 mode 전환 (mode 0이 true, mode 1이 false라고 가정)
            if(codeArr[i].equals("1")){
                mode = !mode;
            } 
            
            if(mode == true){
                if(!codeArr[i].equals("1") && i%2==0){
                    ret.append(codeArr[i]);
                }
            } else if(mode == false){
                if(!codeArr[i].equals("1") && i%2!=0){
                    ret.append(codeArr[i]);
                }
            }
        }
        
        if(ret.length() == 0){
            answer = "EMPTY";
        } else{
            answer = ret.toString();
        }
        return answer;
    }
}