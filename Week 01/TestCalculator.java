class TestCalculator
{
    Calculator calc1, calc2, calc3;
    TestCalculator()
    {
        System.out.println("Init Calc1");
        calc1 = new Calculator();
        System.out.println("Init Calc2");
        calc2 = new Calculator();
        System.out.println("Init Calc3");
        calc3 = new Calculator();
        
        System.out.println("Calc1");
        calc1.add();
        calc1.subtract();
        System.out.println("Calc2");
        calc2.add();
        calc1.subtract();
        System.out.println("Calc3");
        calc3.add();
        calc3.subtract();
    }
}