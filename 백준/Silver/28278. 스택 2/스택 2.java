import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            // 정수를 스택에 추가
            if(order.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            }

            // 스택에 정수가 있다면 맨위의 정수를 빼고 출력, 없다면 -1 출력
            // -> 정수가 있다면 그 정수를 스택에서 제거한 후 해당 값 출력
            else if(order.equals("2")){
                if(stack.empty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(stack.lastElement()).append('\n');
                    stack.pop();
                }
            }

            // 스택에 들어있는 정수의 개수 출력
            else if(order.equals("3")){
                sb.append(stack.size()).append('\n');
            }

            // 스택이 비어있으면 1, 아니면 0 출력
            else if(order.equals("4")){
                if(stack.empty()){
                    sb.append(1).append('\n');
                } else{
                    sb.append(0).append('\n');
                }
            }

            // 스택에 정수가 있다면 맨위의 정수 출력, 없다면 -1 출력
            // -> 명령 2와 다름, 스택에서 제거하는 것이 아닌 단순 출력만
            else{
                if(stack.empty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(stack.peek()).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}