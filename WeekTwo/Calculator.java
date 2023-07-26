class Calculator
{
    int numberOne, numberTwo;
    double result;
    
    Calculator(int NumberOne, int NumberTwo)
    {
        int answer = 0;
        double rate = 3.3355;
        this.numberOne = NumberOne;
        this.numberTwo = NumberTwo;
    }
    
    //name: displayNumbers, returnType: void, parameters: none
    void displayNumbers()
    {
        System.out.println(numberOne + " " + numberTwo);
    }
    
    //name: addten, returnType: void, parameters: none
    void addTen()
    {
        int number = 5;
        number += 5;
        System.out.println(number);
    }
    
    void squareNumber(int num)
    {
        int square = num * num;
        System.out.println("Square Value of "+ num +" is "+ square);
    }
    
    void print(String message)
    {
        System.out.println(message);
    }
    
}