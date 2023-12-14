import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] piece = input.split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(1 - Integer.parseInt(piece[0])) + " ");
        bw.write(Integer.toString(1 - Integer.parseInt(piece[1])) + " ");
        bw.write(Integer.toString(2 - Integer.parseInt(piece[2])) + " ");
        bw.write(Integer.toString(2 - Integer.parseInt(piece[3])) + " ");
        bw.write(Integer.toString(2 - Integer.parseInt(piece[4])) + " ");
        bw.write(Integer.toString(8 - Integer.parseInt(piece[5])));

        bw.flush();
        bw.close();
    }
}