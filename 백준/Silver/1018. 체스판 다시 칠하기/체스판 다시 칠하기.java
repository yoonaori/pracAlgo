import java.io.*;
import java.util.StringTokenizer;

public class Main{
    // 클래스내에서 사용할 수 있도록 클래스 변수 선언
    static boolean[][] arr;
    static int min = 64;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];
        // 배열 입력
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;  // W이면 true
                } else{
                    arr[i][j] = false;  // B이면 false
                }
            }
        }

        // row와 col은 잘라낼 수 있는 경우의 수를 위한 변수
        // n과 m이 9인 경우, 경우의 수는 (9-7) * (9-7) = 4가 된다
        int row = n - 7;
        int col = m - 7;

        // 다시 칠해야 하는 정사각형 개수의 최솟값 찾기
        // n과 m이 9인 경우, 체스판 경우의 수는 4이므로 4번 반복
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                find(i, j);
            }
        }
        System.out.println(min);
    }
    
    static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;  // 다시 칠해야 하는 칸 갯수

        boolean TF = arr[x][y];  // 첫번째 칸의 색
        for(int i=x; i<end_x; i++){
            for(int j=y; j<end_y; j++){
                // 올바른 색이 아니면 cnt++
                if(arr[i][j] != TF){
                    cnt++;
                }

                // 다음 칸은 색이 바뀌므로 true는 false로,
                // false는 true로 값을 변경해줌
                TF = (!TF);
            }
            // 한줄 내려갈때도 색이 바뀌므로 위와 동일하게 값을 변경해줌
            TF = (!TF);
        }

        // 첫번째 칸이 하얀색일 때와 검은색일때 각각 다시 칠해야하는 칸 갯수가 다름
        // 따라서 cnt와 (64-cnt) 중 최솟값이 다시 칠해야하는 칸 갯수가 되는 것 !!
        cnt = Math.min(cnt, 64-cnt);

        // 다른 경우의 수의 최솟값보다 현재 cnt 값이 더 작을 경우 최솟값 갱신
        min = Math.min(min, cnt);
    }
}