import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_bj23351 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 모든 화분에 물을 한 번씩 주는데 필요한 시간 : N / A
        if (N / A > K)
            // 물을 모두 한 번씩 주기 전에 화분이 죽음
            System.out.println(K);
        else {
            int time = 1;
            while (true) {
                // time의 시간에 물을 받지 못 한 화분의 물 양. 이 계산값이 0보다 크면 화분이 살아있음 
                // 기본 물의 양 K
                // N/A 시간 마다 B만큼 물을 주는 차례가 돌아오기 때문에 time이 그 만큼 지나지 않았다면 물을 줄 수 없음
                // => + (time / (N / A)) * B
                // 매 초 1씩 물이 감소 : - time
                if ((K + (time / (N / A)) * B - time) > 0)
                    time++;
                else
                    break;
            }

            System.out.println(time);
        }
    }
}