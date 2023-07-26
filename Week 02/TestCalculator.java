class TestCalculator
{
    Calculator calc1, calc2;
    
    TestCalculator()
    {
        calc1 = new Calculator(9, 4);
        calc1.print("Hello");
        calc1.displayNumbers();
        calc1.squareNumber(4);
        
        calc2 = new Calculator(9, 4);
        calc2.print("Goodbye");
    }
}