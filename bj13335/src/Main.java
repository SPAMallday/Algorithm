import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Car {
    int weight;
    int distance;

    Car(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    void move() {
        this.distance++;
    }
}

public class Main {
    public static int TIME = 0;   // 현재 시간
    public static int weight = 0; // 현재 무게
    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 문제 조건
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());	// 길이
        int L = Integer.parseInt(st.nextToken());	// 하중
        
        // 관리 큐 생성 및 초기화
        Queue<Car> inputQueue = new LinkedList<>();
        Queue<Car> outQueue = new LinkedList<>();
        
        // 대기 차량 큐 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Car temp = new Car(Integer.parseInt(st.nextToken()), 0);
            inputQueue.offer(temp);
        }
        
        while (!inputQueue.isEmpty() || !outQueue.isEmpty()) {
            // 시간 1초 증가
            TIME++;
            
            // 다리 위 차량 거리 증가
            if (!outQueue.isEmpty()) {
            	outQueue.forEach(car -> {
                	car.move();
                });
            	
            	// 선두 차량 거리가 다리 길이보다 길면 제거
            	if (outQueue.peek().distance > W) {
            	weight -= outQueue.peek().weight;	// 현재 무게 감소
                outQueue.remove();
            	}
            }
            
            // 무게 확인
            if (!inputQueue.isEmpty() && inputQueue.peek().weight <= L-weight) {
            	// 무게 여유가 있다면 대기 큐에서 다리로 진입
            	Car now = inputQueue.poll();
            	weight += now.weight;	// 현재 무게 증가
            	// 다리 진입
            	now.move();		
            	outQueue.offer(now);
            }
        }

        System.out.println(TIME);
    }
}