import java.util.Scanner;
//  PRINT HALF PYRAMID ROTATED 180
public class Pattern_5_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n = sc.nextInt();
// outer loop
        for (int i = 1;i<=n;i++){
            // Space
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
    *
   **
  ***
*****
 */
