import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        // 입력받은 단어를 순서대로 배열에 저장
        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        // Arrays.sort()에 Comparator를 써서 compare 메소드를 구현(오버라이딩)
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같은 경우
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);  // 사전순으로 정렬
                } else {  // 단어 길이가 같지 않은 경우
                    // 음수일 경우 : o2의 길이가 더 긴 것이므로 순서 변경 X
                    // 양수일 경우 : o2의 길이가 더 짧은 것이므로 순서 변경 O
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for(int i=1; i<n; i++){
            // 중복되지 않는 단어만 StringBuilder에 추가
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}