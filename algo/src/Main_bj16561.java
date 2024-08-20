import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// bj 16561
public class Main_bj16561 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());

        int total = tc / 3;

        if (total < 3) {
            sb.append(0);
        } else {
            int sum = 0;

            for (int i = 1; i <= total - 2; i++) {
                sum += i;
            }

            sb.append(sum);
        }

        System.out.println(sb);
    }
}
