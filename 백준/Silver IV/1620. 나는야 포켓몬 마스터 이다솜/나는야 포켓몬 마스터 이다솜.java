import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int pokemon = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        // HashMap은 기본적으로 key에 해당하는 value값을 뽑아내는 것에 특화되어있음
        // value에 맞는 key값을 뽑아내는 것이 불가능한 것은 아니지만 시간초과가 나올 수 있음
        // 따라서 <번호,이름> / <이름,번호> 로 총 두개의 HashMap을 생성하여 조건에 따라 사용
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(int i=1; i<=pokemon; i++){
            // 포켓몬을 도감에 저장
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<question; i++){
            String str = br.readLine();

            if(isStringNumber(str)){  // str이 숫자인 경우
                int idx = Integer.parseInt(str);
                sb.append(map1.get(idx)).append('\n');
            }
            else{  // str이 문자인 경우
                sb.append(map2.get(str)).append('\n');
            }
        }

        System.out.println(sb);
    }
    
    public static boolean isStringNumber(String str){
        try {
            Integer.parseInt(str);
            // parseInt()에서 예외가 발생하지않으면 str은 숫자이므로 true 반환
            return true;
        }
        catch (NumberFormatException e) {
            // parseInt()에서 예외가 발생하면 str은 문자이므로 false 반환
            return false;
        }
    }
}