import java.util.Scanner;
// Print Hollow Butterfly
public class Advanced_Pattern_15_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // Upper Half
        for (int i =1;i<=n;i++){
            //First Part
            for (int j=1;j<=i;j++){
                if ( j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // 2nd PART
            for (int j=1;j<=i;j++){
                if ( j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Half
        for (int i=n;i>=1;i--){
            //First Part
            for (int j=1;j<=i;j++){
                if ( j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // 2nd PART
            for (int j=1;j<=i;j++){
                if ( j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
 *        *
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 *        *


 */