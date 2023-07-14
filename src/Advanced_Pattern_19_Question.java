import java.util.Scanner;

public class Advanced_Pattern_19_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num=1;

        for (int i = 1; i <= n; i++) {
            for (int j=i;j<=n;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}

