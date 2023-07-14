import java.util.Scanner;
// Print BUTTERFLY PATTERN
public class Advanced_Pattern_10_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // Upper Half
        for (int i =1;i<=n;i++){
            //First Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // PRINT SPACES
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // 2nd PART
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Part
        for (int i=n;i>=1;i--){
            //First Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // PRINT SPACES
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // 2nd PART
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

 *      *
 **    **
 ***  ***
 ********
 ********
 ***  ***
 **    **
 *      *


 */