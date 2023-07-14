import java.util.Scanner;
//Enter 3 numbers from the user & make a function to print their average
public class Exercise_1_Question_1 {

    public static void Average(double a, double b, double c){
        double avg = (a +b+c)/3;
        System.out.println("The Average of Number is : "+avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Three Numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Average(a,b,c);
    }
}
