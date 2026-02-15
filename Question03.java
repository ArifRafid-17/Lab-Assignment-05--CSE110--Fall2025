//Question03
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int s = 1; s <= (N - i) * 2; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println(1);
            }
            else if (i == N) {
                for (int j = 1; j <= 2 * N - 1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            else {
                System.out.print(1);
                for (int sp = 1; sp <= (2 * i - 3); sp++) {
                    System.out.print(" ");
                }
                System.out.println(2 * i - 1);
            }
        }
    }
}
