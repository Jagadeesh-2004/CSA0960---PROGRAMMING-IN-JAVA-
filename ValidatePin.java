package Pack61;
import java.util.Scanner;
public class ValidatePin
{
    public static void main(String[] args)
    {
        int validPIN = 1234;  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();
        while (enteredPIN != validPIN)
        {
            System.out.println("Invalid PIN. Try again.");
            System.out.print("Enter your PIN: ");
            enteredPIN = scanner.nextInt();
        }
        System.out.println("Correct PIN entered. You now have access to your account.");
        scanner.close();
    }
}