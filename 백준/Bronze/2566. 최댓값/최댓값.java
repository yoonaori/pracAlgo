import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[9][9];

        for(int i=0; i<9; i++){
            String row = br.readLine();
            StringTokenizer st = new StringTokenizer(row);
            for(int j=0; j<9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}