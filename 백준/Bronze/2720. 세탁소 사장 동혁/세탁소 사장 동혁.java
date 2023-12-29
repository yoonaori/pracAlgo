import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for(int i=0; i<test; i++){
            int cent = Integer.parseInt(br.readLine());

            int quarter = cent / 25;
            cent %= 25;

            int dime = cent / 10;
            cent %= 10;

            int nickel = cent / 5;
            cent %= 5;

            int penny = cent;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}