import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        // terms(약관종류 + 유효기간)를 알아보기 쉽도록 Map으로 변환
        Map<String, Integer> termsMap = new HashMap<>();
        for(String term : terms){
            String[] current = term.split(" ");
            termsMap.put(current[0], Integer.parseInt(current[1]));
        }
        
        // today를 다루기 쉽도록 int로 변환
        int todayInt = Integer.parseInt(today.replace(".", ""));
        
        // 파기대상 찾기
        for(int i=0; i<privacies.length; i++){
            String privacy = privacies[i];
            int infoDate = Integer.parseInt(privacy.split(" ")[0].replace(".",""));
            String type = privacy.split(" ")[1];
            
            // date를 연, 월, 일 단위로 쪼개기
            int year = infoDate / 10000;
            int month = (infoDate % 10000) / 100;
            int day = infoDate % 100;
            
            month += termsMap.get(type); // 해당 약관종류의 유효기간 월수 더하기
            day -= 1; // 일수 하루 빼기
            // 개인정보 수집일자가 1일인 경우, 하루를 빼면 0이 되므로 그 이전달의 말일로 바꿔주기
            if(day == 0){
                month -= 1;
                day += 28;
            }
            // 월수를 더한 결과가 12월이 넘는 경우, 더해진 만큼의 다음해로 바꿔주기 
            if(month > 12){
                year += (month/12);
                month = month - 12*(month/12);
            }
            // 위 과정에서 month가 0이 되는 경우, 이전해 12월로 바꿔주기
            if(month == 0){
                month = 12;
                year -= 1;
            }
            
            int expireDate = year*10000 + month*100 + day; // 만료 날짜
            
            if(expireDate < todayInt){
                answerList.add(i);
            }
        }
        
        answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i) + 1;
        }
        
        return answer;
    }
}