import java.util.Scanner;

class Roulette
{
    String playerName, colourA, colourB;
    int maxScore;
    Scanner in = new Scanner(System.in);
    
    Roulette(String playerName, int maxScore , String colourA, String colourB)
    {
        this.playerName = playerName;
        this.maxScore = maxScore;
        this.colourA = colourA;
        this.colourB = colourB;
    }
    
    void displayColours()
    {
        System.out.println("ColourA is: "+ colourA + " and colourB is: " + colourB);
    }
    
    void spin()
    {
        long result = Math.round(Math.random() * maxScore + 0.5);
        String colour;
        if(result % 2 == 1)
        {
            colour = colourA;
        }
        else
        {
            colour = colourB;
        }
        System.out.println("Congratulations! You have spun a "+ colour +" "+ result +"!");
    }
    
    void playSpinner()
    {
        System.out.println("Spinners are loaded and ready to play.\n"
            + playerName + ", please enter the number of spins:");
        int numberOfSpins = in.nextInt();
        
        if(numberOfSpins == 1 || numberOfSpins == 2 || numberOfSpins == 3)
        {
            System.out.println("Success! You can have "+ numberOfSpins +" spins");
            if(numberOfSpins == 1)
            {
                spin();
            }
            else if(numberOfSpins == 2)
            {
                spin();
                spin();
            }
            else if(numberOfSpins == 3)
            {
                spin();
                spin();
                spin();
            }
        }
        else
        {
            System.out.println("Enter 1 or 2 or 3!");
        }
    }
    
}