import java.util.Scanner;
/* Write a function that takes in age as input and returns if that person is eligible
to vote or not. A person of age > 18 is eligible to vote.*/
public class Exercise_1_Question_5 {
    public static void eligibleOrNot(int age){
        if (age>= 18){
            System.out.println("Person is Eligible for Vote ");
        }else {
            System.out.println("Person is Not Eligible for Vote ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Age: ");
        int age = sc.nextInt();

        eligibleOrNot(age);
    }
}
