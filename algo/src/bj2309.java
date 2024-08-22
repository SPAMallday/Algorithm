import java.util.Arrays;
import java.util.Scanner;

public class bj2309 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 키 < 100, 모두 다른 수
        int[] height = new int[9];
        int[] res = new int[7];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();

            sum += height[i];
        }

        sc.close();

        loop: for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    int idx = 0;

                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j)
                            continue;

                        res[idx++] = height[k];
                    }

                    break loop;
                }
            }
        }

        Arrays.sort(res, 0, 7);

        for (int i = 0; i < 7; i++) {
            System.out.println(res[i]);
        }
    }
}
