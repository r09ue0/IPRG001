class TestRoulette
{
    Roulette playerOne, playerTwo;
    
    TestRoulette()
    {
        playerOne = new Roulette("Sibishan", 8, "Black", "White");
        playerOne.displayColours();
        playerOne.spin();
        
        playerTwo = new Roulette("Lalit", 8, "Blue", "Red");
        playerTwo.displayColours();
        playerTwo.spin();
    }
    
}