import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();

            if(state.equals("enter")){
                set.add(name);
            } else{
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}