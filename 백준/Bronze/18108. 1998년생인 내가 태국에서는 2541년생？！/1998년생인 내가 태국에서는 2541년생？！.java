import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bulYear = sc.nextInt();
        int dif = 2541 - 1998;
        System.out.println(bulYear - dif);
    }
}