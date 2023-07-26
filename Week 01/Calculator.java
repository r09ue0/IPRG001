class Calculator
{
    // attributes
    int numberOne, numberTwo;
    
    Calculator()
    {
        numberOne = 5;
        numberTwo = 7;
        System.out.println("Loading Calculator Program...");
    }
    
    void add()
    {
        System.out.println("Addition is " + (numberOne + numberTwo));
    }
    
    void subtract()
    {
         System.out.println("Subtraction is " + (numberOne - numberTwo) );
    }
}