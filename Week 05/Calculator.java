public class Calculator
{
    // attributes
    private int numberOne, numberTwo;
    
    public Calculator()
    {
        numberOne = 5;
        numberTwo = 7;
        System.out.println("Loading Calculator Program...");
    }
    
    public Calculator(int numberOne, int numberTwo)
    {
        setNumberOne(numberOne);
        setNumberTwo(numberTwo);
    }
    
    public void add()
    {
        System.out.println("Addition is " + (numberOne + numberTwo));
    }
    
    public void subtract()
    {
         System.out.println("Subtraction is " + (numberOne - numberTwo) );
    }
    
    public int getNumberOne()
    {
        return numberOne;
    }
    
    public int getNumberTwo()
    {
        return numberTwo;
    }
    
    public void setNumberOne(int numberOne)
    {
        this.numberOne = numberOne;
    }
    
    public void setNumberTwo(int numberTwo)
    {
        this.numberTwo = numberTwo;
    }
    
    public String toString()
    {
        return "numberOne is "+ numberOne +" and numberTwo is " + numberTwo;
    }
}