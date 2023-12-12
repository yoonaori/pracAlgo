import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        // BOJ처럼 입력 자체가 파일로 들어오면 '!= null'만으로도 EOF 처리가 가능하지만, IntelliJ같은 IDE에서는 입력의 끝을 알 수 없음
        // 마지막에 Enter를 한번 더 입력하는 것을 EOF로 처리하기위해 '.isEmpty()' 추가 작성
        while((input = br.readLine()) != null && !input.isEmpty()){
            bw.write(input + "\n");
        }
        bw.flush();
        bw.close();
    }
}