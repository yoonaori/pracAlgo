import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String matrix = br.readLine();
        StringTokenizer st = new StringTokenizer(matrix);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str);
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        int[][] b = new int[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str);
            for(int j=0; j<m; j++){
                b[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] += b[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}