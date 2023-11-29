import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_bj5054 {
    static int T;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 테스트 케이스 수
        T = Integer.parseInt(st.nextToken());

        // 테스트 시작
        for (int i = 0; i < T; i++) {
            // 최대 최소 위치
            int min = 101, max = 0;

            // 상점 수 입력
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            // 상점 위치 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (min > num)
                    min = num;
                if (max < num)
                    max = num;
            }
            
            int minDistance = 2 * Math.abs(max - min); 

            sb.append(minDistance).append("\n");
        }
        
        br.close();
        System.out.println(sb);
    }
}
