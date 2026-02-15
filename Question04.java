//Question04
import java.util.Scanner;
public class Question04 {
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
                System.out.print(1);
                for (int sp = 1; sp <= (2 * N - 3); sp++) {
                    System.out.print(" ");
                }
                System.out.println(2 * N - 1);
            }

            else {
                System.out.print(1);
                for (int sp = 1; sp <= (2 * i - 3); sp++) {
                    System.out.print(" ");
                }
                System.out.println(2 * i - 1);
            }
        }

        
        for (int i = N - 1; i >= 1; i--) {

            for (int s = 1; s <= (N - i) * 2; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println(1);
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
