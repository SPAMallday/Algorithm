import java.util.Scanner;

public class bj2948 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();
        int month = sc.nextInt();

        sc.close();

        // 월 차이에 따른 일수 변화
        int[] cal = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
        String[] day = new String[] { "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday" };

        // 1월 1일 기준으로 계산
        int ddiff = date - 1;
        int mdiff = month - 1;
        int diff = 0;

        for (int i = 0; i <= mdiff; i++) {
            // 월 차이만큼 각 월에 해당하는 차이 일수 더해줌
            diff += cal[i];
        }
        // 일 차이 합산
        diff += ddiff;
        // 전체 일수 차이를 7로 나눈 나머지 만큼 요일 이동
        int dayPick = diff % 7;
        // 출력
        System.out.println(day[dayPick]);
    }
}
