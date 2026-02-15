//Question01
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();


       for(int rcount = 1; rcount<=row; rcount++){
           for(int space = 1; space<=row-rcount; space++)
               System.out.print(" ");
           for(int N = 1; N<=(2*rcount)-1; N++)
           {
               System.out.print(N);
           }
           System.out.println();
       }


       for(int rcount=row-1; rcount>0; rcount--)
       {
           for(int space = 1 ; space<=row-rcount; space++)
           {
               System.out.print(" ");
           }
           for(int N = 1; N<=(2*rcount)-1; N++)
           {
               System.out.print(N);
           }


           System.out.println();
       }
    }
}
