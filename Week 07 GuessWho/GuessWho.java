public class GuessWho
{      
    private Character[] characters = new Character[6];
    private String[] names = {"Joe", "Bernard", "Maria", "Anita", "George", "Anne"};
    private String[] hairColors = {"blonde", "brown", "brown", "blonde", "grey", "black"};
    private String[] genders = {"male", "male", "female", "female", "male", "female"};
    private boolean[] hasHats = {false, true, true, false, true, false};
    private boolean[] hasGlasses = {true, false, false, false, false, false};
    private Character pick;

    public GuessWho()
    {
        //setupCharacters();
        setupCharactersUsingArrays();
        //showAll();
        
        selectCharacter();
        System.out.println("Random character picked is " + pick.getName());
    }    

    // index = Math.random() * characters.length;
    // index = 0.0 * 6
    // index = 0.0 => 0
    
    // index = Math.random() * characters.length;
    // index = 0.99 * 6
    // index = 5.94 => 5
    public void selectCharacter()
    {
        double index = Math.random() * characters.length;
        //pick = characters[(int)index]; //or can just cast

        Double d = new Double(index);
        int result = d.intValue(); //convert a double to an int
        pick = characters[result];
    }

    public void search(String name)
    {
        for(int i = 0; i < characters.length; i++)
        {
            if(characters[i].getName().equalsIgnoreCase(name))
            {
                System.out.println(name  + " found at index " + i);
            }
        }
    }

    private void setupCharacters()
    {
        characters[0] = new Character("Joe", "blonde", "male",false, true);
        characters[1] = new Character("Bernard", "brown", "male",true, false);
        characters[2] = new Character("Maria", "brown", "female",true, false);
        characters[3] = new Character("Anita", "blonde", "female");
        characters[4] = new Character("George", "grey", "male", true, false);
        characters[5] = new Character("Anne", "black", "female");
    }

    private void setupCharactersUsingArrays()
    {
        for(int i = 0; i < characters.length; i++)
        {
            characters[i] = new Character(names[i], hairColors[i], genders[i], hasHats[i], 
                hasGlasses[i]);
        }
    }

    private void showAll()
    {
        for(int i = 0; i < characters.length; i++)
        {
            characters[i].show();
        }
    }
}