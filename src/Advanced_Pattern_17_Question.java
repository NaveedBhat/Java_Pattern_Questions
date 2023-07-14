import java.util.Scanner;
// Print Pascal's Triangle
public class Advanced_Pattern_17_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num=1;

        for (int i = 0; i < n; i++) {
            for (int j=1;j< n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                if (j==0 || i== 0){
                    num =1;
                }else {
                    num = num*(i-j+1)/j;
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }
    }
}
