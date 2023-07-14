import java.util.Scanner;

//PRINT 0-1 TRIANGLE
public class Pattern_9_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n=5

        // outer loop
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if (sum % 2 ==0 ){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
/*
OUTPUT:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */