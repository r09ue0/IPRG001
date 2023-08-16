import java.util.Scanner;

public class PlayzStore
{    
    private final String STORE_NAME = "Gamers";
    private double[] discounts = new double[7];

    private Customer[] customers = new Customer[3];
    private Game[] games = new Game[5];

    public PlayzStore()
    {        
        setupDiscounts();
        setupCustomers();
        setupGames();

        openStore();
    }

    private void openStore()
    {
        System.out.println(STORE_NAME + " is open for business");
        for(int i = 0; i < games.length; i++)
        {
            System.out.println(games[i].getTitle());
        }
        
        int gameIndex = getGameNumber();
        if (gameIndex >= 0 && gameIndex < games.length)
        {
            System.out.println("Game selected is valid");
            customers[0].purchase(games[gameIndex]);
        }
        else
        {
            System.out.println("Error - invalid game number [0 to 4 is valid]");
        }
    }

    public int getGameNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number you wish to purchase: ");
        return in.nextInt();
    }

    // 10, 20, 30 etc.
    private void setupDiscounts()
    {
        for(int i = 0; i < discounts.length; i++)
        {
            discounts[i] = (i * 10) + 10;
        }
    }

    private void setupCustomers()
    {
        customers[0] = new Customer("John", "123456", 800.0);
        customers[1] = new Customer("Jack", "456123", 500.0);
        customers[2] = new Customer("Gill", "451623", 1000.0);
    }

    private void setupGames()
    {
        games[0] = new Game("Angry Birds 1", 500, true);
        games[1] = new Game("Angry Birds 2", 500, false);
        games[2] = new Game("Angry Birds 3", 900, true);
        games[3] = new Game("NFS 7", 500, false);
        games[4] = new Game("NFS 8", 700, true);
    }
}