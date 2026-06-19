import java.util.Scanner;

public class BugTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 10 / 0;   // Division by zero

        String password = "admin123"; // Hardcoded credential

        System.out.println(password);
        System.out.println(x);

        // Scanner never closed
    }
}