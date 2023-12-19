import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(int i=0; i<num; i++){
            String word = br.readLine();

            // isGroupWord() 함수의 반환값이 true이면 word는 그룹 단어이므로 answer++
            if(isGroupWord(word)){
                answer++;
            }
        }
        System.out.println(answer);
    }
    
    static boolean isGroupWord(String word){
        boolean[] group = new boolean[26];
        for(int i=0; i<word.length(); i++){
            int now = word.charAt(i);
            int prev = (i>0) ? word.charAt(i-1) : 0;

            // 처음 나온 문자이면 배열 값을 true로 변경
            if(group[now - 'a'] == false){
                group[now - 'a'] = true;
            }
            // 처음 나온 문자가 아니면 직전 문자와 비교하여 같다면 다음 반복문으로,
            // 다르면 그룹 단어가 아니므로 false 반환
            else if(now != prev){
                return false;
            }
        }
        return true;
    }
}