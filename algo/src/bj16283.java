import java.util.Scanner;

public class bj16283 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sheepFood = sc.nextInt(); // 1~1000
        int goatFood = sc.nextInt(); // 1~1000
        int total = sc.nextInt(); // 2~1000
        int food = sc.nextInt(); // 2~1,000,000
        sc.close();

        boolean flag = false;
        int sheep = 0;
        int goat = 0;

        // 양 기준
        for (int i = 1; i < total; i++) {
            if (food == ((total - i) * goatFood) + (i * sheepFood)) {
                if (flag) {
                    // 이미 해를 구했으나 또 발견된 경우 false 처리후 반복 중지
                    flag = false;
                    break;
                }

                flag = true;
                sheep = i;
                goat = total - i;
            }
        }

        if (flag) {
            System.out.println(sheep + " " + goat);
        } else {
            System.out.println(-1);
        }

    }
}