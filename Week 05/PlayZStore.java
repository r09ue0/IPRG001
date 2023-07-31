public class PlayZStore
{
    private Customer customerOne;
    private Game gameOne, gameTwo;
    
    private final String STORE_NAME= "Game Store";
    
    public PlayZStore()
    {
         customerOne = new Customer("Lalit", 1000, true);
         
         gameOne = new Game("Jedi Fallen Order", 500, true);
         gameTwo = new Game("NFS: Most Wanted", 200, false);
         
         System.out.println("Welcome to "+ STORE_NAME);
         customerOne.purchase(gameOne);
         customerOne.purchase(gameTwo);
    }
    
}