import java.util.Scanner;

public class Advanced_Pattern_14_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Upper HALF
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //Lower HALF
        for (int i=n;i>=1;i--){
            //Spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
/*
OUTPUT:

   *
  ***
 *****
*******
*******
 *****
  ***
   *

 */