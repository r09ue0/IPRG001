import java.util.Scanner;

public class Motel
{
    private Room rooms[];

    public Motel()
    {
        rooms = new Room[10];
        menu();
    }
    
    private void menu()
    {
        char action = readChar("Please Enter your choise (S, B, P, U, X):");
        while(action != 'X')
        {
            switch(action)
            {
                case 'S':
                    setArray();
                    break;
                case 'B':
                    bookRoom(readInt("Enter a Room ID to Search:"));
                    break;
                case 'P':
                    displayAllRooms();
                    break;
                case 'U':
                    updatePrice();
                    break;
                default:
                    System.out.println("Invaild Action!");
            }
            action = readChar("Please Enter your choise (S, B, P, U, X):");
        }
        System.out.println("Good Bye!");
    }

    private void bookRoom(int request)
    {
        Room requestedRoom = findRoom(request);
        if(requestedRoom != null)
        {
            if(!requestedRoom.isBooked())
            {
                requestedRoom.book();
                requestedRoom.pay();
                System.out.println("Success! You booked room "+ request + ". You owe $"
                    + requestedRoom.getPrice());
            }
            else
            {
                System.out.println("Sorry! room "+ request +" not available.");
            }
        }
        else
        {
            System.out.println("You Entered Invalid Room ID!");
        }
    }

    private Room findRoom(int request)
    {
        for(int i=0; i<rooms.length; i++)
        {
            if(request == rooms[i].getId())
            {
                return rooms[i];
            }
        }
        return null;
    }
    
    private void updatePrice()
    {
        for(int i=0; i<rooms.length; i++)
        {
            if(rooms[i] != null)
                rooms[i].setPrice(readDouble("Enter the new price for room "+(i+1) +":"));
        }
    }

    private int readInt(String question)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        return in.nextInt();
    }
    
    private char readChar(String question)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        return in.next().toUpperCase().charAt(0);
    }
    
    private double readDouble(String question)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        return in.nextDouble();
    }

    private void setArray()
    {
        for(int i=0; i<rooms.length; i++)
        {
            //assume room id is odd
            int capacity = 1;
            double price = 100;
            //if room id is even
            if((i+1) % 2 == 0)
            {
                capacity = 3; 
                price = 300;
            }    
            rooms[i] = new Room((i+1), capacity, price);
        }
    }
    
    private void displayAllRooms()
    {
        for(int i=0; i<rooms.length; i++)
        {
            if(rooms[i] != null)
                System.out.println(rooms[i].toString());
        }
    }
}