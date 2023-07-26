class Calculator
{
    double numberOne, numberTwo;

    Calculator(double numberOne, double numberTwo)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    double add()
    {
       return numberOne + numberTwo; 
    }

    double subtract()
    {
        return numberOne - numberTwo;
    }

    double multiply()
    {
        return numberOne * numberTwo;
    }

    double divide()
    {
        return numberOne / numberTwo;
    }

    void displayResults()
    {
        System.out.println("Results for numbers "+ numberOne +" and "+ numberTwo +" are:");
        System.out.println("Add results in " + add());
        System.out.println("Subtract results in " + subtract());
        System.out.println("Multiply results in " + multiply());
        if(numberTwo == 0)
        {
            System.out.println("You can't divide a number by zero");
        }
        else
        {
            System.out.println("Divide results in " + divide());
        }
        System.out.println("Maximum is " + maximum());
        System.out.println("Minimum is " + minimum() + "\n");
    }

    double maximum()
    {
        if(numberOne > numberTwo)
            return numberOne;
        return numberTwo;
    }

    double minimum()
    {
        if(numberOne < numberTwo)
            return numberOne;
        return numberTwo;
    }

    double power(int num)
    {
        return Math.pow(numberOne, num);
    }
}