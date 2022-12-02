//personal project
//password generator
import java.util.Scanner;

public class PasswordGeneratorTester
{
    public static void main(String[] args) 
    {
       
       PasswordGenerator Generate = new PasswordGenerator();
       
        
        
        
       System.out.println("Hello Welcome to the Password Generator");

        char choice = '\0';
        do
        {
            System.out.print("Select A for Yes or B for No: ");
            Scanner Check = new Scanner(System.in);
            choice = Check.next().charAt(0);
            switch(choice)
            {
                case 'A':
                    Generate.generatePassword();
                    break;
                case 'B':
                    System.out.println("Thank you for generating a password");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
            

        }
        while(choice != 'B');

    }
}
