import java.util.Scanner;

public class bj4435 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        String win = "Good triumphs over Evil";
        String lose = "Evil eradicates all trace of Good";
        String draw = "No victor on this battle field";

        int[] human = new int[] { 1, 2, 3, 3, 4, 10 };
        int[] orc = new int[] { 1, 2, 2, 2, 3, 5, 10 };

        // 배틀 수
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sb.append("Battle ").append(i).append(": ");
            int hSum = 0, oSum = 0;

            // 인간 점수
            for (int j = 0; j < human.length; j++) {
                hSum += human[j] * sc.nextInt();
            }

            // 오크 점수
            for (int j = 0; j < orc.length; j++) {
                oSum += orc[j] * sc.nextInt();
            }

            // 결과 메세지 추가
            if (hSum > oSum) {
                sb.append(win);
            } else if (hSum < oSum) {
                sb.append(lose);
            } else {
                sb.append(draw);
            }

            if (i != num)
                sb.append("\n");
        }

        sc.close();
        // 출력
        System.out.println(sb);
    }
}
