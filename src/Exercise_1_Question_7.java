import java.util.Scanner;
/*
Write a program to enter the numbers till the user wants and at the end it should
display the count of positive, negative and zeros entered.
 */
public class Exercise_1_Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Number,
                 Positive = 0,
                 Negative = 0,
                 Zero = 0;

        char choice;
        do {
            System.out.println("Enter the Number");
            Number = sc.nextInt();

            if (Number >0){
                Positive++;
            }else if (Number < 0){
                Negative++;
            }else {
                Zero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " +  Positive);
        System.out.println("Negative numbers: " +  Negative);
        System.out.println("Zero numbers: " +  Zero);
    }
}
