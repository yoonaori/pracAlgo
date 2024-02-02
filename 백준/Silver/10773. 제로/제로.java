import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        // int형 스택 선언
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++){
            int n = Integer.parseInt(br.readLine());

            if(!(n == 0)){
                stack.push(n);
            } else{
                stack.pop();
            }
        }

        int sum = 0;
        for(int i=0; i<stack.size(); i++){
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}