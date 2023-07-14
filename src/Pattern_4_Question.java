import java.util.Scanner;
//  PRINT HALF PYRAMID invert
public class Pattern_4_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n = sc.nextInt();
// outer loop
        for (int i = n;i>=1;i--){
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
* * * * *
* * * *
* * *
* *
*

 */
