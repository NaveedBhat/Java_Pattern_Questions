import java.util.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/*
Two numbers are entered by the user, x and n. Write a function to find the value of
one number raised to the power of another i.e. 𝑥 power n .
 */
public class Exercise_1_Question_8 {

    public static void raisedPower(int x, int n){
        double pow= Math.pow(x, n);
        System.out.println(x +" to the power " +n + " is: "+pow);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base(x): ");
        int x = sc.nextInt();

        System.out.print("Enter the Exponent(n): ");
        int n = sc.nextInt();


        raisedPower(x,n);
    }
}
