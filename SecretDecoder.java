package Msg;
import java.util.Scanner;
public class SecretDecoder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers to decode the secret message:");
        String decodedMessage = "";
        for (int i = 0; i < 10; i++)
        {
            int code;
            do
            {
                System.out.print("Enter number " + (i + 1) + ": ");
                code = scanner.nextInt();
            } while (code < 1 || code > 7);
            decodedMessage += (code == 1 ? "D" : code == 2 ? "W" : code == 3 ? "E" : code == 4 ? "L" : code == 5 ? "H" : code == 6 ? "O" : "R") + " ";
        }
        System.out.println("Decoded message: " + decodedMessage.trim());
    }
}