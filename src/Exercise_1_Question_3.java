import java.util.Scanner;
//Write a function which takes in 2 numbers and returns the greater of those two

public class Exercise_1_Question_3 {

    public static void greaterNumber(int a, int b){
        if (a>b){
            System.out.println("A is Greater");
        }else {
            System.out.println("B is Greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        greaterNumber(a,b);
    }
}
