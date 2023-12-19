import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> inha = new HashMap<>();
        inha.put("A+", 4.5);
        inha.put("A0", 4.0);
        inha.put("B+", 3.5);
        inha.put("B0", 3.0);
        inha.put("C+", 2.5);
        inha.put("C0", 2.0);
        inha.put("D+", 1.5);
        inha.put("D0", 1.0);
        inha.put("F", 0.0);

        double sum = 0;
        double multi = 0;
        for(int i=0; i<20; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")){
                sum += score;
                multi += (score * inha.get(grade));
            }
        }
        System.out.println(multi / sum);
    }
}