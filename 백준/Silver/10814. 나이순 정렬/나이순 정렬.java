import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        // 나이와 이름을 순서대로 배열에 저장
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                // 0일 경우 : o1과 o2의 나이가 같은 것임, 순서 변경 X
                // 음수일 경우 : o2의 나이가 더 많은 것임, 순서 변경 X
                // 양수일 경우 : o2의 나이가 더 적은 것임, 순서 변경 O
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}