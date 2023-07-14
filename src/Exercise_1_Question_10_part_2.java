import java.util.Scanner;
// Write a program to print Fibonacci series of n terms where n is input by user.
public class Exercise_1_Question_10_part_2 {

    public static void  Fibonacci(int n) {

        int n1=0;
        int n2=1;
        System.out.println(n1+ " " +n2);
        for (int i = 1; i <= n; i++) {

            int nextTerm = n1 + n2;
            System.out.println(nextTerm);
            n1 = n2;
            n2 = nextTerm;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int n = sc.nextInt();

        Fibonacci(n);
    }
}
