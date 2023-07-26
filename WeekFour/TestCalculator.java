class TestCalculator
{
    Calculator calcOne, calcTwo;
    
    TestCalculator()
    {
        double result;
        
        calcOne = new Calculator(10.3, 6.4);
        calcOne.displayResults();
        result = calcOne.power(2);
        System.out.println(result);
        
        calcTwo = new Calculator(5.5, 0);
        calcTwo.displayResults();
        result = calcTwo.power(2);
        System.out.println(result);
    }
}