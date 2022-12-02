import java.util.Scanner;


public class PasswordGenerator
{
    private String Numbers;
    private String Letters;
    private String Symbols;



    public PasswordGenerator()
    {
        Numbers = "0123456789";
        Letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Symbols = "`~!@#$%^&*()-_+=[{]};:,<.>/?";
    }

    
    public void generatePassword()
    {
    
            String NewPassword = "";
            int num;
            Scanner Check = new Scanner(System.in);
            System.out.print("Enter the number of characters for password ");
            num = Check.nextInt();

            int indexRnd = 0;

            


            for(int i = 0; i < num;i++)
            {
                int charRnd = (int)  (Math.random() * 3) + 1;

                if(charRnd == 1)
                {
                    indexRnd = (int)  (Math.random() * (Numbers.length() - 1));
                    NewPassword += Numbers.charAt(indexRnd);
                }
                else if(charRnd == 2)
                {
                    indexRnd = (int)  (Math.random() * (Letters.length() - 1));
                    NewPassword += Letters.charAt(indexRnd);

                }
                else
                {
                    indexRnd = (int)  (Math.random() * (Symbols.length() - 1));
                    NewPassword += Symbols.charAt(indexRnd);

                }



            }


            System.out.println("New Password: " + NewPassword);

    }




}