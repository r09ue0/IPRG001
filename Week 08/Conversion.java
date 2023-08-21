import java.util.Scanner;
import java.text.DecimalFormat;
public class Conversion
{
    private final double F_RATIO = (double)9/5;
    private final double K_RATIO = (double)8/5;

    public Conversion()
    {
        menu();
    }

    private double toFahrenheit(double celsius)
    {
        return F_RATIO * celsius + 32;
    }

    private double toKilometres(double miles)
    {
        return K_RATIO * miles;
    }

    private void menu()
    {
        char action = readChar(); 
        double answer;
        while (action != 'X')   
        {
            if(action == 'F') 
            {
                answer = readDouble("Enter the degrees in celsius:");
                System.out.println(answer +" degrees is "+ format(toFahrenheit(answer)) +"F");
            }
            else if(action == 'K')
            {
                answer = readDouble("Enter the distances in miles:");
                System.out.println(answer +" miles is "+ format(toKilometres(answer)) +"km");
            }
            else if(action == 'M')
            {
                mileConversion();
            }
            else if(action == 'A')
            {
                averageTemp();
            }
            else if(action == '?')
            {
                help();
            }
            action = readChar();
        }
    }

    private char readChar()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your choice (F, K, M, A, X, ?): ");
        return in.next().toUpperCase().charAt(0);
    }
    
    private double readDouble(String question)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        return in.nextDouble();
    }

    private void help()
    {
        System.out.println("Enter F(convert celsius to fahrenheit),\n"+
        "K(convert miles to kilometres),\n"+
        "M(mile range conversion),\n"+
        "A(calculate average temperature) or X(Exit)");
    }
    
    private void mileConversion()
    {
        double lower = readDouble("Enter the lower limit");
        double upper = readDouble("Enter the upper limit");
        
        while(lower <= upper)
        {
            System.out.println(lower +" miles is "+ format(toKilometres(lower)) +"km");
            lower++;
        }
    }
    
    private void averageTemp()
    {
       double total = 0;
       int counter = 1;
       int numberOfTimes = 6;
       do
       {
           total+= readDouble(counter +": Enter temperature");
           counter++;
       }
       while(counter <= numberOfTimes);
       
       double average = total / numberOfTimes;
       System.out.println("Average temperature is"+ format(toFahrenheit(average)) +"F");
    }
    
    private String format(double value)
    {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(value);
    }
}