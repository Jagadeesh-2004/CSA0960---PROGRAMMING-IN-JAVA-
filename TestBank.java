package Abstract;
public class TestBank
{
public static void main(String[] args)
{
Account a1 = new Account("Sanjay Gupta",11556,300);
Account a2 = new Account("He Xai",22338,500);
Account a3 = new Account("Ilya Mustafana",44559,1000);
// Print accounts
a1.print();
a2.print();
a3.print();
}
}