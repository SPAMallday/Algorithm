import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj10551 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] f1 = new char[] { '`', '1', 'Q', 'A', 'Z' };
        char[] f2 = new char[] { '2', 'W', 'S', 'X' };
        char[] f3 = new char[] { '3', 'E', 'D', 'C' };
        char[] f4 = new char[] { '4', '5', 'R', 'T', 'F', 'G', 'V', 'B' };
        char[] f5 = new char[] { '6', '7', 'Y', 'U', 'H', 'J', 'N', 'M' };
        char[] f6 = new char[] { '8', 'I', 'K', ',' };
        char[] f7 = new char[] { '9', 'O', 'L', '.' };
        char[] f8 = new char[] { '0', '-', '=', 'P', '[', ']', ';', '\'', '/' };

        char[][] finger = new char[][] { f1, f2, f3, f4, f5, f6, f7, f8 };
        int[] count = new int[8];

        String input = br.readLine();

        for (String s : input.split("")) {

            // 키보드 탐색
            for (int i = 0; i < finger.length; i++) {
                for (int j = 0; j < finger[i].length; j++) {

                    // 찾으면
                    if (s.equals(String.valueOf(finger[i][j]))) {

                        // 카운트 증가
                        count[i]++;
                        break;
                    }
                }
            }
        }

        for (int i : count) {
            System.out.println(i);
        }
    }
}
