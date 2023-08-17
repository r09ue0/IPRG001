import java.util.*;
public class Menu
{
    Scanner in = new Scanner(System.in);
    public Menu()
    {
        menu();
    }

    private void menu()
    {
        char action = readChar(); 
        while (action != 'X' && action != 'x')   
        {
            if(action == 'Y' || action == 'y') 
            {
                yes();
            }
            else if(action == 'N' || action == 'n')
            {
                no();
            }
            else if(action == '?')
            {
                help();
            }
            action = readChar();
        }
    }

    private char readChar()
    {
        System.out.println("Please enter your choice (Y, N, X, ?): ");
        return in.next().charAt(0);
        //get the first letter the user typed
    }

    private void yes()
    {
        System.out.println("YES, Yes, y e s");
    }

    private void no()
    {
        System.out.println("NO, No, n o");
    }

    private void help()
    {
        System.out.println("Enter Y(Yes), N(No) or X(Exit)");
    }
}