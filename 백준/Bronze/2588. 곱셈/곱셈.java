import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1 * (num2 % 10);
        System.out.println(a);
        num2 /= 10;
        int b = num1 * (num2 % 10);
        System.out.println(b);
        num2 /= 10;
        int c = num1 * num2;
        System.out.println(c);

        int res = a + (b * 10) + (c * 100);
        System.out.println(res);
    }
}