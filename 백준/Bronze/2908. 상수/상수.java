import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder reverse_a = new StringBuilder();
        StringBuilder reverse_b = new StringBuilder();

        for(int i=2; i>=0; i--){
            reverse_a.append(a.charAt(i));
            reverse_b.append(b.charAt(i));
        }

        if(Integer.parseInt(reverse_a.toString()) > Integer.parseInt(reverse_b.toString())){
            System.out.println(reverse_a);
        } else {
            System.out.println(reverse_b);
        }
    }
}