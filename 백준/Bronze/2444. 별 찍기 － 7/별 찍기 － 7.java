import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // 삼각형 모양
        for(int i=1; i<=input; i++){
            // 공백 찍기
            for(int j=1; j<=input-i; j++){
                System.out.print(" ");
            }

            // 별 찍기
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            // 개행
            System.out.println();
        }

        // 역삼각형 모양
        for(int i=input-1; i>=1; i--){
            // 공백 찍기
            for(int j=1; j<=input-i; j++){
                System.out.print(" ");
            }

            // 별 찍기
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            // 개행
            System.out.println();
        }
    }
}