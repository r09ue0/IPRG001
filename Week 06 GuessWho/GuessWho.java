public class GuessWho
{
    Character charOne, charTwo, charThree, charFour, charFive, charSix;
    
    public GuessWho()
    {
        charOne = new Character("Joe", "male", "yellow", true, false, false);
        charTwo = new Character("Bernard", "male", "brown", false, false, true);
        charThree = new Character("Maria", "female", "brown", false, true, true);
        charFour = new Character("Anita", "female", "yellow");
        charFive = new Character("George", "male", "grey", false, false, true);
        charSix = new Character("Anne", "female", "black", false, true, false);
        
        charOne.show();
        charTwo.show();
        charThree.show();
        charFour.show();
        charFive.show();
        charSix.show();
    }
}