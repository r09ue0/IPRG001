class Roulette
{
    String playerName, colourA, colourB;
    int maxScore;
    
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
        double randomSpin = Math.random() * maxScore;
        System.out.println("Congratulations! You have spun a " + randomSpin);
    }
    
}