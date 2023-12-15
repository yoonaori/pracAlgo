import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(String check : croatia){
            if(str.contains(check)){
                str = str.replace(check, "!");
            }
        }
        System.out.println(str.length());
    }
}