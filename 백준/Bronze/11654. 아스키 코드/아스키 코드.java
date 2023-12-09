import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String으로 입력받은 변수를 int형으로 저장하면 아스키코드 값으로 변환되어 저장됨
        int ch = br.readLine().charAt(0);
        System.out.println(ch);
    }
}