import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 길이가 26(a~z)인 배열을 생성하고 전체 값을 -1로 채움
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            // (ex) ch가 'd'인 경우, 'd'-'a'는 3이 되어 alpha 배열의 3번방에 i가 저장됨
            // 단어에 같은 알파벳이 존재하는 경우 뒤에 나온 알파벳의 인덱스가 덮어써지면 안되므로 조건문 추가
            if(alpha[ch - 'a'] == -1){
                alpha[ch - 'a'] = i;
            }
        }

        for(int res : alpha){
            System.out.print(res + " ");
        }
    }
}