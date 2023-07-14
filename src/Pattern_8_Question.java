import java.util.Scanner;
// PRINT FLOYD'S TRIANGLE
public class Pattern_8_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num=1;

        for (int i=1;i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
/*
1
2 3
4 5 6
7 8 9 10
 */