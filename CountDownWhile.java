package Countdown;

public class CountDownWhile 
{
    public static void main(String[] args)
    {
        int i = 10;
        System.out.println("Countdown to Launch!");
        while (i >= 0) 
        {
            System.out.println(i);
            i--;
        }
        System.out.println("Blast Off!");
    }
}
