import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] toy = new char[5][15];
        int max = 0;
        for(int i=0; i<5; i++){
            String word = br.readLine();
            if(max < word.length()){
                max = word.length();
            }

            for(int j=0; j<word.length(); j++){
                toy[i][j] = word.charAt(j);
            }
        }

        StringBuilder answer = new StringBuilder();
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                // 빈 배열을 만나면 다음 반복문으로
                if(toy[j][i] == '\0') continue;
                answer.append(toy[j][i]);
            }
        }
        System.out.println(answer);
    }
}