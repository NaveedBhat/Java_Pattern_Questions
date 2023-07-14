import java.util.Scanner;
//  PRINT HALF PYRAMID with NUMBER
public class Pattern_6_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n = sc.nextInt();
// outer loop
        for (int i = 1;i<=n;i++){
            // inner loop
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
