import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 입력받는 수는 10의 12제곱까지 가능하므로 int의 범위를 벗어남. 따라서 long으로 선언
        long sum = 0;
        Scanner sc = new Scanner(System.in);

        // next() : 공백 또는 개행 기준으로 입력받음 (입력어에 공백이 포함되어있을 시, 공백 전까지만 변수에 담김)
        // nextLine() : 개행 기준으로 입력받음
        String str = sc.nextLine();

        // 공백을 기준으로 쪼개서 배열에 담기
        String[] strArr = str.split(" ");

        for(String tmp : strArr){
            sum += Long.parseLong(tmp);
        }

        System.out.println(sum);
    }
}
