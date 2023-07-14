import java.util.Scanner;
// Write a function that calculates the Greatest Common Divisor of 2 numbers.
public class Exercise_1_Question_9 {

    public static void GCD(int x, int y) {
        int gcd = 1;
        for (int i=1;i<=x && i<= y ; i++){
            if (x%i ==0 && y%i==0){
                gcd =i;

            }
          }
        System.out.println("GCD of "+ x + " and "+ y +" is: " + gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        GCD(x,y);
    }
}
