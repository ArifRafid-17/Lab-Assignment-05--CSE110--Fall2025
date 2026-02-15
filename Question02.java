
//Question02
import java.util.Scanner;
public class Question02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for (int i = 1; i <= N; i++) {


            for (int s = 1; s <= (N - i) * 2; s++) {
                System.out.print(" ");
            }


            if (i == 1) {
                System.out.println(N);
            }

            else if (i == N) {
                for (int j = 1; j <= N; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

            else {
                System.out.print(N - i + 1);
                for (int sp = 1; sp <= (i - 2) * 2 + 1; sp++) {
                    System.out.print(" ");
                }
                System.out.println(N);
            }
            
        }
    }
}
