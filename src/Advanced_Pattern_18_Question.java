import java.util.Scanner;
//Print Half Pyramid
public class Advanced_Pattern_18_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
output:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */