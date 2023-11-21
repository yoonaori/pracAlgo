import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.nextLine();  // 개행이 c에 담기지 않도록 개행만 입력
        int c = sc.nextInt();

        a += c / 60;  // 요리시간이 60분 이상이면, 몫을 시(h)에 더해줌
        b += c % 60;  // 나머지를 분(m)에 더해줌

        if(b >= 60){
            a++;
            b -= 60;
        }

        if(a >= 24){
            a -= 24;
        }

        System.out.println(a + " " + b);
    }
}