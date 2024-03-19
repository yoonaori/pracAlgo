import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Balloon> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());  // 풍선의 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] balloonPaper = new int[n];  // 풍선 속 종이에 적힌 수를 저장할 배열
        for(int i=0; i<n; i++){
            balloonPaper[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");  // 처음에는 무조건 1번 풍선을 터뜨림
        int moveValue = balloonPaper[0];  // 다음으로 움직여야할 이동값

        // 풍선번호(인덱스)와 풍선이 가지고있는 이동값을 같이 넣어줌
        // 1번 풍선은 맨처음에 터뜨리기 때문에 2번 풍선부터 시작
        for(int i=1; i<n; i++){
            deque.add(new Balloon(i+1, balloonPaper[i]));
        }

        // 풍선이 모두 터질때까지 반복 (deque가 비워지면 중단)
        while(!deque.isEmpty()){
            // 이동값이 양수인 경우
            if(moveValue > 0){
                for(int i=1; i<moveValue; i++){
                    // 앞에 있는 요소를 뒤로 보냄 (이동)
                    deque.add(deque.poll());
                }

                // 모두 뒤로 보낸 뒤, 풍선 터뜨리기 (삭제)
                Balloon next = deque.poll();
                moveValue = next.numValue;  // 이동값 갱신
                sb.append(next.index + " ");  // 터뜨린 풍선의 인덱스 출력
            }

            // 이동값이 음수인 경우
            else{
                for(int i=1; i<-moveValue; i++){
                    // 뒤에 있는 요소를 앞으로 보냄 (이동)
                    deque.addFirst(deque.pollLast());
                }

                // 모두 앞으로 보낸 뒤, 풍선 터뜨리기 (삭제)
                Balloon next = deque.pollLast();
                moveValue = next.numValue;  // 이동값 갱신
                sb.append(next.index + " ");  // 터뜨린 풍선의 인덱스 출력
            }
        }

        System.out.println(sb);
    }
    
    // 풍선의 인덱스와 숫자값을 저장할 Balloon 클래스
    static class Balloon {
        int index;
        int numValue;

        // 생성자
        public Balloon(int index, int numValue) {
            this.index = index;
            this.numValue = numValue;
        }
    }
}