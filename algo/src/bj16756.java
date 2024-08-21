import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 아무리 봐도 문제 이해가 안된다 패스
public class bj16756 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 최대 최소값 갱신
            if (now < min) {
                min = now;
                max = now;
            } else {
                max = now > max ? now : max;
            }
        }

        System.out.println(max - min);
    }
}
