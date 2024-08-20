import java.util.Scanner;

// 흰색 전체 말 개수 (킹1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8), 배열 순서대로
public class Main_bj3003 {
    public static void main(String[] args) throws Exception {
        // 출력
        StringBuilder sb = new StringBuilder();
        // 입력
        Scanner sc = new Scanner(System.in);

        // 기본 변수 선언
        int[] chess = new int[] { 1, 1, 2, 2, 2, 8 };

        // 입력 값 비교
        for (int i = 0; i < chess.length; i++) {
            int value = sc.nextInt();

            // 필요량 출력에 바로 추가
            sb.append(chess[i] - value).append(" ");
        }

        sc.close();

        System.out.println(sb);
    }
}
