import java.util.Scanner;

public class BugTest {

    public static void main(String[] args) {

        // Use try-with-resources to ensure Scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a number to divide 10 by: ");
            if (sc.hasNextInt()) {
                int divisor = sc.nextInt();
                
                if (divisor != 0) {
                    int x = 10 / divisor;
                    System.out.println("Result: " + x);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            }

            // Avoid hardcoding sensitive credentials in production code
            String password = "user_input_or_config"; 
            System.out.println("Configured password: " + password);
        }
    }
}
