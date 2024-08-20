import java.util.Scanner;

public class bj14568 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        sc.close();

        // 1~5개의 사탕은 분배가 불가능해서 패스
        if (N < 6) {
            System.out.println(0);
            System.exit(0);
        }

        // 택희는 최소 2개를 가지며 최소의 분배가 가능한 6개의 사탕일 때
        // 택희, 영훈, 남규 각각 2, 1, 3개로 분배 가능
        for (int i = 2; i <= N - 4; i++) {
            // 택희가 홀수개인 경우 계산하지 않음
            if (i % 2 != 0) {
                continue;
            }

            // 남규 먼저 계산, 최대값은 택희의 개수를 고려
            int max = N - i;
            for (int k = 3; k < max; k++) {
                // 영훈 계산
                int Y = max - k; // 영훈 개수

                // 남규의 개수가 영훈의 개수에 2개를 더한 것보다 크다면 가능한 경우로 판단
                if (Y + 2 <= k)
                    count++;
            }
        }

        System.out.println(count);
    }
}
