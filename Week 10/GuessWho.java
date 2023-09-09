import java.util.*;

public class GuessWho
{
    private Character [] characters = new Character[6];
    private Character pick;
    private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        new GuessWho();
    }

    public GuessWho()
    {
        characters[0] = new Character("Anita", "blonde", "female");
        characters[1] = new Character("Anne", "black", "female");
        characters[2] = new Character("Bernard", "brown", "male", true, false);
        characters[3] = new Character("George", "grey", "male", true, false);
        characters[4] = new Character("Joe", "blonde", "male", false, true);
        characters[5] = new Character("Maria", "brown", "female");       
        play();
    }

    public void popArray()
    {
        for (int i = 0; i < characters.length; i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Name");
            String name = in.next();
            System.out.print("Gender:");
            String gender = in.next();
            System.out.print("HairColour:");
            String colour = in.next();
            System.out.print("Has hat?");
            boolean hasHat = in.nextBoolean();
            System.out.print("Has glasses?");
            boolean hasGlasses = in.nextBoolean();
            characters[i] = new Character(name, gender, colour, hasHat, hasGlasses);
        }
    }

    public void popArrayUsingArrays()
    {
        String [] names = {"Anita", "Anne", "Bernard", "George", "Joe", "Maria"};
        String [] genders = { "female", "female", "male", "male", "male","female"};
        String [] hairColours = {"blonde", "black", "brown", "grey", "blonde", "brown"};
        boolean [] hats = {false, false, true, true, false, false};
        boolean [] glasses = {false, false, false, false, true, false};
        for (int i = 0; i < characters.length; i++)
        {
            characters[i] = new Character(names[i], genders[i], hairColours[i], hats[i], glasses[i]);
        }
    }

    public Character search(String name)
    {
        for (int i = 0; i < characters.length; i++)
        {
            if(characters[i].getName().equals(name))
            {
                //System.out.println(name  + " found at index " + i);
                return characters[i];
            }
        }
        return null;
    }

    public void selectCharacter()
    {
        double index = Math.random() * characters.length;
        //Double d = new Double(index);
        //int result = d.intValue(); //convert a double to an int
        pick = characters[(int)index]; //or can just cast
    }
    
    public void play()
    {
        selectCharacter();   
        //System.out.println("Random pick for testing => " + pick.toString()); // only for testing        
        
        String genderInput = readGender();
        if (genderInput != null && pick.getGender().equals(genderInput))
        {
            System.out.println("Yes !!!");
        }
        else
        {
            System.out.println("No !!!");
        }
        
        String hairColourInput = readHairColour();
        if (hairColourInput != null && pick.getHairColour().equals(hairColourInput))
        {
            System.out.println("Yes !!!");
        }
        else
        {
            System.out.println("No !!!");
        }
        
        System.out.println("Ok, time to guess...");
        String nameInput = readName();
        if (nameInput != null && pick.getName().equals(nameInput))
        {
            System.out.println("Yes !!! You WIN");
        }
        else
        {
            System.out.println("No !!! It is " + pick.getName() 
                + ". Better luck next time");
        }
    }
    

    public String readGender()
    {
        System.out.println("What gender do you think the character is? M/F");
        char input = scanner.next().toUpperCase().charAt(0);
        return getGender(input);
    }
    
    private String getGender(char value)
    {
        switch(value)
        {
            case 'M':
                return "male";
            case 'F':
                return "female";
            default:
                return null;
        }
    }

    public String readHairColour()
    {
        int input = readInt("What colour hair do you think the character has?" + 
                " 1-blonde, 2-black, 3-brown, 4-grey");  
        return getHairColour(input);
    }

    private String getHairColour(int input)
    {
        String colour = null;
        switch(input)
        {
            case 1:
                colour = "blonde";
                break;
            case 2:
                colour = "black";
                break;
            case 3:
                colour = "brown";
                break;
            case 4:
                colour = "grey";
                break;
            default:
                colour = null;
        }
        return colour;
    }

    public String readName()
    {
        int input = readInt("Who is it? 1-Anita, 2-Anne, 3-Bernard, 4-George, 5-Joe, 6-Maria");
        return getName(input);
    }  
    
    private String getName(int input)
    {
        String name = null;
        switch(input)
        {
            case 1:
                name = "Anita";
                break;
            case 2:
                name = "Anne";
                break;
            case 3:
                name = "Bernard";
                break;
            case 4:
                name = "George";
                break;
            case 5:
                name = "Joe";
                break;
            case 6:
                name = "Maria";
                break;
            default:
                name = null;
        }
        return name;
    }

    private int readInt(String question)
    {
        System.out.println(question);
        return scanner.nextInt();
    }
}
