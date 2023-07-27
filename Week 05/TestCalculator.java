import java.util.Scanner;
public class TestCalculator
{
    private Calculator calc1, calc2;
    
    private Scanner in = new Scanner(System.in);
    
    public TestCalculator()
    {
        calc1 = new Calculator(4,5);
        calc2 = new Calculator(6,7);
        System.out.println(calc1.toString());
        System.out.println(calc2.toString());
        int num = readNumber("Please enter a number:");
        calc1.setNumberOne(num);
        num = readNumber("Please enter a number:");
        calc2.setNumberTwo(num);
        System.out.println(calc1.toString());
        System.out.println(calc2.toString());
    }
    
    public int readNumber(String question)
    {
        System.out.println(question);
        int answer = in.nextInt();
        return answer;
    }
}