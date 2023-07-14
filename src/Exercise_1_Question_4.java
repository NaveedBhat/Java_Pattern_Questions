import java.util.Scanner;
/*
Write a function that takes in the radius as input and returns the
circumference of a circle.
 */
public class Exercise_1_Question_4 {

    public static void circ(int r){
       double c =  2*3.14*r;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Radius: ");
        int r = sc.nextInt();

        circ(r);
    }
}
