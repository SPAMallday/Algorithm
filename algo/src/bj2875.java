import java.util.Scanner;

public class bj2875 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int girl = sc.nextInt();
        int boy = sc.nextInt();
        int cap = sc.nextInt();

        int max = 0;

        // 2여 1남 세트
        // 여+남 인원수 - 인턴쉽한 인원 만큼 여자, 남자 비율 맞춰서 조합
        for (int i = 0; i <= cap; i++) {
            int gGroup = (girl - i) / 2; // 여자 가능 그룹 수
            int bGroup = boy - (cap - i); // 남자 가능 그룹 수

            // 둘 중 작은 값을 현재 가정한 여자 수 기준에서 팀 구성이 가능한 경우로 고려
            int num = Math.min(gGroup, bGroup);

            max = max < num ? num : max;
        }

        System.out.println(max);
    }
}
