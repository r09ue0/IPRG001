import java.util.Scanner;

class TestFriend
{
    Friend friendOne,friendTwo;
    String name, location, brandOfPhone;
    Scanner scanner = new Scanner(System.in);
    
    TestFriend()
    {
        // Friend One
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your location: ");
        location = scanner.nextLine();
        System.out.print("Enter your brand of phone: ");
        brandOfPhone = scanner.nextLine();
        
        friendOne = new Friend(name, location, brandOfPhone);
        friendOne.sayHello();
        
        // Friend Two
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your location: ");
        location = scanner.nextLine();
        System.out.print("Enter your brand of phone: ");
        brandOfPhone = scanner.nextLine();
        
        friendTwo = new Friend(name, location, brandOfPhone);
        friendTwo.sayHello();
    }
   
}