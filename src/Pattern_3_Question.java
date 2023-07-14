import java.util.Scanner;
//  PRINT HALF PYRAMID
public class Pattern_3_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n = sc.nextInt();
// outer loop
        for (int i = 1;i<=n;i++){
            // inner loop0
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
*
* *
* * *
* * * *
 */
