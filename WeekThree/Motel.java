import java.util.Scanner;

class Motel
{
    Room room;
    Scanner scanner = new Scanner(System.in);
    
    Motel()
    {
        
        System.out.println("Enter id:");        
        int id = scanner.nextInt();
        
        System.out.println("Enter capacity:");
        int capacity = scanner.nextInt();
        
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        
        room = new Room(id, capacity, price);
        room.book();
        room.pay();
    }
}