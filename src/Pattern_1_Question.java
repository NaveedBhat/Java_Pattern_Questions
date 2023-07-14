import java.util.Scanner;
//  PRINT SOLID RECTANGLE
public class Pattern_1_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
*****
*****
*****
*****
 */
