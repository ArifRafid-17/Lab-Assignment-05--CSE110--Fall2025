//Question07
import java.util.Scanner;
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

    
        for (int i = N; i >= 1; i -= 2) {

            for (int s = 1; s <= (N - i); s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    
        for (int i = 3; i <= N; i += 2) {

            for (int s = 1; s <= (N - i); s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
