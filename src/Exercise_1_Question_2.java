import java.util.Scanner;
//Write a function to print the sum of all odd numbers from 1 to n.
public class Exercise_1_Question_2 {

    public static void sumOfOdd(int n){
        int sum =0;
        for (int i=1;i<=n;i++){
           if ((i%2) == 1){
//               if ((i%2) != 0){
                   sum += i;


           }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Numbers: ");
        int n = sc.nextInt();


        sumOfOdd(n);
    }
}
