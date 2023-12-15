import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        int[] alpha = new int[26];

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            alpha[ch - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        char answer = '?';
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] > max){
                max = alpha[i];
                answer = (char) (i + 'A');
            } else if(alpha[i] == max){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}