import java.io.*;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int sequence = Integer.parseInt(st.nextToken());

        List<Integer> factor = new ArrayList<>();
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                factor.add(i);
            }
        }

        if(factor.size() < sequence){
            System.out.println(0);
        } else{
            System.out.println(factor.get(sequence-1));
        }
    }
}