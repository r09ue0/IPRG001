import java.util.Scanner;

class TestRoulette
{
    Roulette playerOne, playerTwo;
    Scanner in = new Scanner(System.in);
    
    TestRoulette()
    {
        String playerOneName = readStringAnswer("Please enter player 1 name:");
        String playerTwoName = readStringAnswer("Please enter player 2 name:");
        
        String colourA = readStringAnswer("Please enter colour A:");
        String colourB = readStringAnswer("Please enter colour B:");
        
        int maxScore = readIntAnswer("Please enter the maximum score:");
        
        playerOne = new Roulette(playerOneName, maxScore, colourA, colourB);
        playerTwo = new Roulette(playerTwoName, maxScore, colourA, colourB);
        
        playerOne.playSpinner();
        playerTwo.playSpinner();
    }
    
    String readStringAnswer(String question)
    {
        System.out.println(question);
        String answer = in.nextLine();
        return answer;
    }
    
    int readIntAnswer(String question)
    {
        System.out.println(question);
        int answer = in.nextInt();
        return answer;
    }
    
}